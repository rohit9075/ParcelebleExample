package rohit.com.parcelableecample;

import android.os.Parcel;
import android.os.Parcelable;

public class DataModel implements Parcelable {

    private int id;
    private String name;
    private String city;
    private String state;

    public DataModel(int id, String name, String city, String state) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

// Parcelable methods for passing the complex object to one to another activity
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.city);
        dest.writeString(this.state);
    }

    protected DataModel(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.city = in.readString();
        this.state = in.readString();
    }

    public static final Parcelable.Creator<DataModel> CREATOR = new Parcelable.Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel source) {
            return new DataModel(source);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };
}
