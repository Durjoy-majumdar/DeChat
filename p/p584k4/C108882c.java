package p584k4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p1042u.C111055b;

/* renamed from: k4.c */
public class C108882c extends C108881b {

    /* renamed from: d */
    public final SparseIntArray f326042d;

    /* renamed from: e */
    public final Parcel f326043e;

    /* renamed from: f */
    public final int f326044f;

    /* renamed from: g */
    public final int f326045g;

    /* renamed from: h */
    public final String f326046h;

    /* renamed from: i */
    public int f326047i;

    /* renamed from: j */
    public int f326048j;

    /* renamed from: k */
    public int f326049k;

    public C108882c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C111055b(), new C111055b(), new C111055b());
    }

    /* renamed from: a */
    public void mo159995a() {
        int i = this.f326047i;
        if (i >= 0) {
            int i2 = this.f326042d.get(i);
            int dataPosition = this.f326043e.dataPosition();
            this.f326043e.setDataPosition(i2);
            this.f326043e.writeInt(dataPosition - i2);
            this.f326043e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: b */
    public C108881b mo159996b() {
        Parcel parcel = this.f326043e;
        int dataPosition = parcel.dataPosition();
        int i = this.f326048j;
        if (i == this.f326044f) {
            i = this.f326045g;
        }
        int i2 = i;
        return new C108882c(parcel, dataPosition, i2, this.f326046h + "  ", this.f326039a, this.f326040b, this.f326041c);
    }

    /* renamed from: f */
    public boolean mo160000f() {
        return this.f326043e.readInt() != 0;
    }

    /* renamed from: g */
    public byte[] mo160001g() {
        int readInt = this.f326043e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f326043e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: h */
    public CharSequence mo160002h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f326043e);
    }

    /* renamed from: i */
    public boolean mo160003i(int i) {
        while (this.f326048j < this.f326045g) {
            int i2 = this.f326049k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f326043e.setDataPosition(this.f326048j);
            int readInt = this.f326043e.readInt();
            this.f326049k = this.f326043e.readInt();
            this.f326048j += readInt;
        }
        return this.f326049k == i;
    }

    /* renamed from: j */
    public int mo160004j() {
        return this.f326043e.readInt();
    }

    /* renamed from: l */
    public <T extends Parcelable> T mo160006l() {
        return this.f326043e.readParcelable(C108882c.class.getClassLoader());
    }

    /* renamed from: n */
    public String mo160008n() {
        return this.f326043e.readString();
    }

    /* renamed from: p */
    public void mo160010p(int i) {
        mo159995a();
        this.f326047i = i;
        this.f326042d.put(i, this.f326043e.dataPosition());
        mo160014t(0);
        mo160014t(i);
    }

    /* renamed from: q */
    public void mo160011q(boolean z) {
        this.f326043e.writeInt(z ? 1 : 0);
    }

    /* renamed from: r */
    public void mo160012r(byte[] bArr) {
        if (bArr != null) {
            this.f326043e.writeInt(bArr.length);
            this.f326043e.writeByteArray(bArr);
            return;
        }
        this.f326043e.writeInt(-1);
    }

    /* renamed from: s */
    public void mo160013s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f326043e, 0);
    }

    /* renamed from: t */
    public void mo160014t(int i) {
        this.f326043e.writeInt(i);
    }

    /* renamed from: v */
    public void mo160016v(Parcelable parcelable) {
        this.f326043e.writeParcelable(parcelable, 0);
    }

    /* renamed from: w */
    public void mo160017w(String str) {
        this.f326043e.writeString(str);
    }

    public C108882c(Parcel parcel, int i, int i2, String str, C111055b<String, Method> bVar, C111055b<String, Method> bVar2, C111055b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f326042d = new SparseIntArray();
        this.f326047i = -1;
        this.f326049k = -1;
        this.f326043e = parcel;
        this.f326044f = i;
        this.f326045g = i2;
        this.f326048j = i;
        this.f326046h = str;
    }
}
