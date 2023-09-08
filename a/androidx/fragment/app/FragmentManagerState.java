package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C112906a();

    /* renamed from: d */
    public ArrayList<FragmentState> f337979d;

    /* renamed from: e */
    public ArrayList<String> f337980e;

    /* renamed from: f */
    public BackStackState[] f337981f;

    /* renamed from: g */
    public int f337982g;

    /* renamed from: h */
    public String f337983h = null;

    /* renamed from: i */
    public ArrayList<String> f337984i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<Bundle> f337985j = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f337986n;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C112906a implements Parcelable.Creator<FragmentManagerState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f337979d);
        parcel.writeStringList(this.f337980e);
        parcel.writeTypedArray(this.f337981f, i);
        parcel.writeInt(this.f337982g);
        parcel.writeString(this.f337983h);
        parcel.writeStringList(this.f337984i);
        parcel.writeTypedList(this.f337985j);
        parcel.writeTypedList(this.f337986n);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f337979d = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f337980e = parcel.createStringArrayList();
        this.f337981f = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f337982g = parcel.readInt();
        this.f337983h = parcel.readString();
        this.f337984i = parcel.createStringArrayList();
        this.f337985j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f337986n = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
