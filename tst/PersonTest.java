import Assignment_12.CacheManager;
import Assignment_12.DiskManager;
import Assignment_12.Person;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class PersonTest {

    //attributes
    private CacheManager cacheMock = mock(CacheManager.class);
    private DiskManager diskMock = mock(DiskManager.class);

    private final int CACHE_PHONE = 1234;
    private final String CACHE_FNAME = "Homer";
    private final String CACHE_LNAME = "Simpson";

    private final int DISK_PHONE = 9876;
    private final String DISK_FNAME = "Jay";
    private final String DISK_LNAME = "Jackson";

    private final int DNE_PHONE = 0000;

    private Person personInCache, personInDisk, personNonExsited;

    //sets up the persons
    @Before
    public void setUp() {
        personInCache = new Person(cacheMock, diskMock);
        personInDisk = new Person(cacheMock, diskMock);
        personNonExsited = new Person(cacheMock, diskMock);

        personInCache.setPerson(CACHE_PHONE, CACHE_FNAME, CACHE_LNAME);
        personInDisk.setPerson(DISK_PHONE, DISK_FNAME, DISK_LNAME);
        personNonExsited.setPerson(DNE_PHONE, "", "");

    }

    //tests DNE person
    @Test
    public void testPersonDNE(){
        when(cacheMock.getPerson(DNE_PHONE)).thenReturn(null);
        when(diskMock.getPerson(DNE_PHONE)).thenReturn(null);

        assertEquals("Person Should not exist", null, cacheMock.getPerson(DNE_PHONE));
        assertEquals("Person Should not exist", null, diskMock.getPerson(DNE_PHONE));

        verify(cacheMock).getPerson(DNE_PHONE);
        verify(diskMock).getPerson(DNE_PHONE);
        verifyNoMoreInteractions(cacheMock);
        verifyNoMoreInteractions(diskMock);

    }

    //tests person in cache
    @Test
    public void testPersonInCache(){

        when(cacheMock.getPerson(CACHE_PHONE)).thenReturn(personInCache);

        assertEquals("Homer Simpson", personInCache.getFullName());

        verify(cacheMock).getPerson(CACHE_PHONE);

        verifyNoMoreInteractions(cacheMock);

//        InOrder inOrder = inOrder(cacheMock, diskMock);
//        inOrder.verify(cacheMock).getPerson(CACHE_PHONE);
//        inOrder.verify(diskMock).getPerson(CACHE_PHONE);

    }

    //tests person in disk
    @Test
    public void testPersonInDisk(){

        when(diskMock.getPerson(DISK_PHONE)).thenReturn(personInDisk);

        assertEquals("Jay Jackson", personInDisk.getFullName());

//        verify(diskMock).getPerson(DISK_PHONE);

        verifyNoMoreInteractions(diskMock);

        InOrder inOrder = inOrder(cacheMock, diskMock);
        inOrder.verify(cacheMock).getPerson(DISK_PHONE);
        inOrder.verify(diskMock).getPerson(DISK_PHONE);

    }

    public interface Game {
        public int getUsedGameCost(int originalPrice);
    }


}

