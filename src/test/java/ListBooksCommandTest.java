import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

/**
 * Created by ptang on 8/5/15.
 */
public class ListBooksCommandTest {
    private ListBooksCommand listBooksCommand;

    @Test
    public void shouldListBooksWhenCommandExecutes() {
        Library library = mock(Library.class);
        listBooksCommand = new ListBooksCommand(library);
        when(library.listAllBooks()).thenReturn("Books listed");
        assertThat(listBooksCommand.execute(), is("Books listed"));
    }

    @Test
    public void shouldGiveCommandNameWhenRequested() throws Exception {
        listBooksCommand = new ListBooksCommand(mock(Library.class));
        assertThat(listBooksCommand.description(), is("List Books"));

    }
}
