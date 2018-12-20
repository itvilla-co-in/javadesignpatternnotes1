package abstractfactory;

import abstractfactory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {


	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}

	@Override
	public Instance createInstance(Capacity capacity) {
		// TODO Auto-generated method stub
		return new GoogleComputeEngineInstance(capacity);
	}
	

}