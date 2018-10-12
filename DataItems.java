
public class DataItems {
private int key;
private String value;
public DataItems(int key, String value) {
	super();
	this.key = key;
	this.value = value;
}
public int getKey() {
	return key;
}
public void setKey(int key) {
	this.key = key;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
@Override
public String toString()
{
	return "DataItems [key=" + key + ", value=" + value + "]";
}
}
