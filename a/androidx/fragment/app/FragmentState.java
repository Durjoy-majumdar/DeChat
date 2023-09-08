package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C112907a();

    /* renamed from: d */
    public final String f337987d;

    /* renamed from: e */
    public final String f337988e;

    /* renamed from: f */
    public final boolean f337989f;

    /* renamed from: g */
    public final int f337990g;

    /* renamed from: h */
    public final int f337991h;

    /* renamed from: i */
    public final String f337992i;

    /* renamed from: j */
    public final boolean f337993j;

    /* renamed from: n */
    public final boolean f337994n;

    /* renamed from: o */
    public final boolean f337995o;

    /* renamed from: p */
    public final Bundle f337996p;

    /* renamed from: q */
    public final boolean f337997q;

    /* renamed from: r */
    public final int f337998r;

    /* renamed from: s */
    public Bundle f337999s;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C112907a implements Parcelable.Creator<FragmentState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public Object[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f337987d = fragment.getClass().getName();
        this.f337988e = fragment.mWho;
        this.f337989f = fragment.mFromLayout;
        this.f337990g = fragment.mFragmentId;
        this.f337991h = fragment.mContainerId;
        this.f337992i = fragment.mTag;
        this.f337993j = fragment.mRetainInstance;
        this.f337994n = fragment.mRemoving;
        this.f337995o = fragment.mDetached;
        this.f337996p = fragment.mArguments;
        this.f337997q = fragment.mHidden;
        this.f337998r = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f337987d);
        sb.append(" (");
        sb.append(this.f337988e);
        sb.append(")}:");
        if (this.f337989f) {
            sb.append(" fromLayout");
        }
        if (this.f337991h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f337991h));
        }
        String str = this.f337992i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f337992i);
        }
        if (this.f337993j) {
            sb.append(" retainInstance");
        }
        if (this.f337994n) {
            sb.append(" removing");
        }
        if (this.f337995o) {
            sb.append(" detached");
        }
        if (this.f337997q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f337987d);
        parcel.writeString(this.f337988e);
        parcel.writeInt(this.f337989f ? 1 : 0);
        parcel.writeInt(this.f337990g);
        parcel.writeInt(this.f337991h);
        parcel.writeString(this.f337992i);
        parcel.writeInt(this.f337993j ? 1 : 0);
        parcel.writeInt(this.f337994n ? 1 : 0);
        parcel.writeInt(this.f337995o ? 1 : 0);
        parcel.writeBundle(this.f337996p);
        parcel.writeInt(this.f337997q ? 1 : 0);
        parcel.writeBundle(this.f337999s);
        parcel.writeInt(this.f337998r);
    }

    public FragmentState(Parcel parcel) {
        this.f337987d = parcel.readString();
        this.f337988e = parcel.readString();
        boolean z = true;
        this.f337989f = parcel.readInt() != 0;
        this.f337990g = parcel.readInt();
        this.f337991h = parcel.readInt();
        this.f337992i = parcel.readString();
        this.f337993j = parcel.readInt() != 0;
        this.f337994n = parcel.readInt() != 0;
        this.f337995o = parcel.readInt() != 0;
        this.f337996p = parcel.readBundle();
        this.f337997q = parcel.readInt() == 0 ? false : z;
        this.f337999s = parcel.readBundle();
        this.f337998r = parcel.readInt();
    }
}
