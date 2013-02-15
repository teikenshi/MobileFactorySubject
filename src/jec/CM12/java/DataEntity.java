package jec.CM12.java;

public class DataEntity {
	/**
	 * キーボード入力用
	 */
	private String inTime;
	private String inStart;
	private String inEnd;
	/**
	 * 計算用
	 */
	private int time;
	private int start;
	private int end;

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getInStart() {
		return inStart;
	}

	public void setInStart(String inStart) {
		this.inStart = inStart;
	}

	public String getInEnd() {
		return inEnd;
	}

	public void setInEnd(String inEnd) {
		this.inEnd = inEnd;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) throws Exception {
		if (time < 0 | time > 23) {
			throw new Exception();
		} else {
			this.time = time;
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) throws Exception {
		if (start < 0 | start > 23) {
			throw new Exception();
		} else {
			this.start = start;
		}
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) throws Exception {
		if (end < 0 | end > 23) {
			throw new Exception();
		} else {
			this.end = end;
		}
	}

	@Override
	public String toString() {
		super.toString();

		return "入力情報は以下になります\r\n調べる時刻：" + this.getTime() + "\r\n"
				+ "時間帯（開始時刻）:" + this.getStart() + "\r\n" + "時間帯(終了時刻）:"
				+ this.getEnd();
	}
}
