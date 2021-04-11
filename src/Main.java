import Observer.Chart;
import Observer.DataSource;
import Observer.SpreadSheet;
import Visitor.AnchorNode;
import Visitor.HeadingNode;
import Visitor.HtmlDocument;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();

        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();
    }
}
