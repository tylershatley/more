/*
 * Tyler Shatley
 * csce 146
 */
public class ProcessScheduler {
		
		LinkedListQueue<Process>process;
		Process currentProcess;
		
		public ProcessScheduler()
		{
			process = new LinkedListQueue<Process>();
			currentProcess = null;
		}

		public Process getCurrentProcess()
		{
			return currentProcess;
		}
		
		public void addProcess(Process p)
		{
			if(currentProcess != null)
			{
				process.enqueue(p);
			}
			else if(currentProcess == null)
			{
				setCurrentProcess(p);
			}
		}
		
		public void runNextProcess() 
		{
			if(process != null)
			{
				currentProcess = process.dequeue();
			}
			else
			{
				// do nothing
			}
		}

		
		public void setCurrentProcess(Process currentProcess) 
		{
			this.currentProcess = currentProcess;
			
		}
		
		public void cancelCurrentProcess() 
		{

			currentProcess = process.dequeue();		
		}
		
		public void printProcessQueue() 
		{
			if(process != null)
			{
				process.print();
			}
			else
			{
				//do nothing
			}
		}
}
