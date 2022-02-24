// Feel free to add here any import statements that you need


/** TOTAL = 11.5 points
   This class models information about a book.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class Book{ // done for now

   /* TASK #1 - 1 point (0.2 point per attribute)
      Declare the following attributes as private:
         title                   of data type   String
         author                  of data type   String         
         maxNumberOfChapters     of data type   int
         currentNumberOfChapters of data type   int
         chapters                of data type   array of BookChapter
   */

   private String title;
   private String author;
   private int maxNumberOfChapters;
   private int currentNumberOfChapters;
   private BookChapter[] chapters;



   
   /* TASK #2 - 2 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately all attributes (0.2 point per attribute).
      The currentNumberOfChapters is always 0 since
      we have not yet added BookChapters.
      If the numberOfChapters passed as parameter is negative or zero,
      set it to 1 instead (1 point).
   */
   public Book(String title, String author, int numberOfChapters){  // done for now

      this.title = title;
      this.author = author;
      this.currentNumberOfChapters = numberOfChapters;

   }// end 3-args constructor
  
  
   /* TASK #3 - 1 point
      Write the code for the following no-args constructor.
      The default value must be as follows;
         string "Untitled Book" for the title
         string "anonymous" for the author
         integer 1 for the number of chapters
      To get full credit, make sure to not write code that would be
      redundant with respect to the constructor from task #2
   */
   public Book(){ // done for now

      title = "Untitled Book";
      author = "anonymous";
      int numberOfChapters = 1;
      
   }// end no-args constructor
   
   
   
   /* TASK #4 - 3 points
      Write a method that allows you to add an already created BookChapter
      object to this book (1 point).
      Do not do anything if the parameter is null (0.5 point).
      If you reached already the maximum number of chapters, resize the array
      as we learned to do so in the lectures. The new array should have twice
      the capacity of the current array (1.5 points).
   */
   public void addChapter(BookChapter b){

      chapters[currentNumberOfChapters] = b;
      currentNumberOfChapters++;

   }// end addChapter method



   /* TASK #5 - 1 point
      Write a method that returns the total number of pages
      in this book by adding together the number of pages
      in each of the chapters.
   */
   public int getTotalPages(){

      return 0;
   }// end getTotalPages method
   
   
   
   /* TASK #6 - 3 points
      Write a method that displays the book's table of content.
      To do this, you will display the title (0.5 point), 
      the author (0.5 point), the total number of pages in the book
      (0.5 point), use the getNumberOfPages method to do so in order
      to receive full credit, and then the list of all chapters
      in order with their name (0.5 point) preceded by the page number
      at which they start (1 point).
      You will have to follow to the letter the format used in the example below.
      
      Example; 
         Let us say that our book's title is "Short Book", its
         author is Hinn Kognito, and it features 3 chapters; 
             "Beginnings", 20 pages long
             "The Plot Thickens", 5 pages long
             "Never Saw It Coming" 3 pages long

         Then, the table of content will be displayed as follows;
         
            Short Book by Hinn Kognito (28 pages)
            1 ... Beginnings 
            21 ... The Plot Thickens
            26 ... Never Saw It Coming
   */
   public void displayTableOfContents(){
      System.out.println("");
   }// end displayTableOfContents method
   
   
}// end class