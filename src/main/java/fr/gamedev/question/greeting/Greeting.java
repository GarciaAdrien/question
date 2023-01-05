package fr.gamedev.question.greeting;

/**
* @author djer1
*
*/
public class Greeting {
    /**
     * Greeting id.
     */
    private final long id;
    /**
     * Greeting content.
     */
    private final String content;
    /**
     * @param newId the id to set
     * @param newContent the content to set
     * */
    public Greeting(final long newId, final String newContent) {
        this.id = newId;
        this.content = newContent;
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }
}
