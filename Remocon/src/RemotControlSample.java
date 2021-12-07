
public class RemotControlSample {

	public static void main(String[] args) { 
//		RemoteControl tv = new Television();
			RemoteControl tv = new RemoteControl() { //익명구현함수(클래스)
			private int volume; 
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
			public void setVolume(int v) {
			    if(v > RemoteControl.MAX_VOLUME) {
			       this.volume = RemoteControl.MAX_VOLUME;
			    } else if (v < RemoteControl.MIN_VOLUME) {
			       this.volume = RemoteControl.MIN_VOLUME;
			    } else {
			       this.volume = v;
			    }
			    System.out.println("현재 TV볼륨: "+this.volume);
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
		RemoteControl audio = new RemoteControl() { //자동형변환은 되나 유실될수 있다.
//		Audio audio1 = new RemoteControl(); = X!
//		자식은 부모를 따라갈수있으나 부모가 자식따라간다는 꼴 
		private int volume; 
		
		public void turnOn() {
			System.out.println("오디오를 켭니다.");
		}
		public void turnOff() {
			System.out.println("오디오를 끕니다.");
		}

		public void setVolume(int v) { 
		if(v > RemoteControl.MAX_VOLUME) {
	      this.volume = RemoteControl.MAX_VOLUME;
	    } else if(v < RemoteControl.MIN_VOLUME) {
	      this.volume = RemoteControl.MIN_VOLUME;
	    } else {
	      this.volume = v;
	    }
	    System.out.println("현재 오디오볼륨: "+this.volume);
		}
	};
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}

}
