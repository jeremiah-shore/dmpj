import java.time.*;

interface TimeClientProtocol {

	void setDate(int year, int month, int day);
	void setTime(int hour, int minute, int second);
	LocalDateTime getLocalDateTime();

	default void setDateAndTime(
		int year, int month, int day,
		int hour, int minute, int second) {
			setDate(year, month, day);
			setTime(hour, minute, second);
	}

	/*
		I've chosen to omit the setDateAndTime() abstract method as suggested in the answers to this exercise. 
		I've done this because supplying 6 parameters is a code smell that I don't agree with. Providing an 
		abstract method that sets both date and time at once, a task that each of the other methods is 
		supposed to perform individually, encourages this method to break the single responsiblity 
		principle. Methods should only do one thing.

		My instinct in thinking how this will be implemented would be that both the setTime and setDate 
		methods would be invoked together to create a compound effect. For an interface, this says a 
		little too much about the presumed implementation. Either that or the same behavior in these two methods
		will be recreated entirely in the single method. In other words, The implementation will either be
		sloppy by encouraging duplicated code, or it forces tying the two other methods together in
		way that is somewhat difficult to read.

		Simply having setTime() and setDate() as abstract methods on this interface should be enough. Because 
		they are required, and because it would be intuitive to tie them together in the implementation, it can 
		be left to the user to do so. However, I've left setDateAndTime() as a default method so that it is optional
		and can be overridden if desired.
	*/
}