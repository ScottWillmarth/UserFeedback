package feedbackPkg;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController 
{

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Feedback feedback(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
		return new Feedback(String id, String comments, int rating, String user);
	}
}