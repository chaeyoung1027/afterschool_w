package Test.this3;

public class TV {
	
	String producer, color;
	int size;
	public String getProducer() {
		return producer;
	}
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}
	
	public TV(int size) {
		this.size = size;
		System.out.printf("TV( %d ) ȣ���. \n", size);
	}
	
	public TV(int size, String color) {
		this(size); //this.size = size; �� ���� ��� ��� ����
		this.color = color;
		System.out.printf("TV( %d, %s ) ȣ���. \n", size, color);
	}
	
	public TV(int size, String color, String producer) {
		this(size, color);
		this.producer = producer;
		System.out.printf("TV( %d, %s, %s ) ȣ���. \n", size, color, producer);
	}

}
