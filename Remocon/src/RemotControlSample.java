
public class RemotControlSample {

	public static void main(String[] args) { 
//		RemoteControl tv = new Television();
			RemoteControl tv = new RemoteControl() { //�͸����Լ�(Ŭ����)
			private int volume; 
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
			}
			public void setVolume(int v) {
			    if(v > RemoteControl.MAX_VOLUME) {
			       this.volume = RemoteControl.MAX_VOLUME;
			    } else if (v < RemoteControl.MIN_VOLUME) {
			       this.volume = RemoteControl.MIN_VOLUME;
			    } else {
			       this.volume = v;
			    }
			    System.out.println("���� TV����: "+this.volume);
			 }
			@Override
			public void setMute(boolean v) {
				System.out.println("boolean "+v);
			}
		};
			 
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBettery();
		RemoteControl audio = new RemoteControl() { //�ڵ�����ȯ�� �ǳ� ���ǵɼ� �ִ�.
//		Audio audio1 = new RemoteControl(); = X!
//		�ڽ��� �θ� ���󰥼������� �θ� �ڽĵ��󰣴ٴ� �� 
		private int volume; 
		
		public void turnOn() {
			System.out.println("������� �մϴ�.");
		}
		public void turnOff() {
			System.out.println("������� ���ϴ�.");
		}

		public void setVolume(int v) { 
		if(v > RemoteControl.MAX_VOLUME) {
	      this.volume = RemoteControl.MAX_VOLUME;
	    } else if(v < RemoteControl.MIN_VOLUME) {
	      this.volume = RemoteControl.MIN_VOLUME;
	    } else {
	      this.volume = v;
	    }
	    System.out.println("���� ���������: "+this.volume);
		}
	};
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}

}
