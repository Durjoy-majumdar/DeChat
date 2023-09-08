package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C112919c0;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C112866a();

    /* renamed from: d */
    public final int[] f337889d;

    /* renamed from: e */
    public final ArrayList<String> f337890e;

    /* renamed from: f */
    public final int[] f337891f;

    /* renamed from: g */
    public final int[] f337892g;

    /* renamed from: h */
    public final int f337893h;

    /* renamed from: i */
    public final String f337894i;

    /* renamed from: j */
    public final int f337895j;

    /* renamed from: n */
    public final int f337896n;

    /* renamed from: o */
    public final CharSequence f337897o;

    /* renamed from: p */
    public final int f337898p;

    /* renamed from: q */
    public final CharSequence f337899q;

    /* renamed from: r */
    public final ArrayList<String> f337900r;

    /* renamed from: s */
    public final ArrayList<String> f337901s;

    /* renamed from: t */
    public final boolean f337902t;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    public class C112866a implements Parcelable.Creator<BackStackState> {
        public Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public Object[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C112910a aVar) {
        int size = aVar.f338026a.size();
        this.f337889d = new int[(size * 5)];
        if (aVar.f338032g) {
            this.f337890e = new ArrayList<>(size);
            this.f337891f = new int[size];
            this.f337892g = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C112919c0.C112920a aVar2 = aVar.f338026a.get(i);
                int i3 = i2 + 1;
                this.f337889d[i2] = aVar2.f338042a;
                ArrayList<String> arrayList = this.f337890e;
                Fragment fragment = aVar2.f338043b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f337889d;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f338044c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f338045d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f338046e;
                iArr[i6] = aVar2.f338047f;
                this.f337891f[i] = aVar2.f338048g.ordinal();
                this.f337892g[i] = aVar2.f338049h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f337893h = aVar.f338031f;
            this.f337894i = aVar.f338034i;
            this.f337895j = aVar.f338006s;
            this.f337896n = aVar.f338035j;
            this.f337897o = aVar.f338036k;
            this.f337898p = aVar.f338037l;
            this.f337899q = aVar.f338038m;
            this.f337900r = aVar.f338039n;
            this.f337901s = aVar.f338040o;
            this.f337902t = aVar.f338041p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f337889d);
        parcel.writeStringList(this.f337890e);
        parcel.writeIntArray(this.f337891f);
        parcel.writeIntArray(this.f337892g);
        parcel.writeInt(this.f337893h);
        parcel.writeString(this.f337894i);
        parcel.writeInt(this.f337895j);
        parcel.writeInt(this.f337896n);
        TextUtils.writeToParcel(this.f337897o, parcel, 0);
        parcel.writeInt(this.f337898p);
        TextUtils.writeToParcel(this.f337899q, parcel, 0);
        parcel.writeStringList(this.f337900r);
        parcel.writeStringList(this.f337901s);
        parcel.writeInt(this.f337902t ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f337889d = parcel.createIntArray();
        this.f337890e = parcel.createStringArrayList();
        this.f337891f = parcel.createIntArray();
        this.f337892g = parcel.createIntArray();
        this.f337893h = parcel.readInt();
        this.f337894i = parcel.readString();
        this.f337895j = parcel.readInt();
        this.f337896n = parcel.readInt();
        this.f337897o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f337898p = parcel.readInt();
        this.f337899q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f337900r = parcel.createStringArrayList();
        this.f337901s = parcel.createStringArrayList();
        this.f337902t = parcel.readInt() != 0;
    }
}
