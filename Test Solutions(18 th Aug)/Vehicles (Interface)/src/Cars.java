class Cars implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car starts Engine....!!!! ");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerates the Car....!!!! ");
		
	}

	@Override
	public void brake() {
		System.out.println("Stop the Car....!!!! ");
	}

}
