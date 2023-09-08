package com.tencent.p014mm.plugin.emojicapture.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter */
public class EmojiCaptureReporter implements Parcelable {
    public static final Parcelable.Creator<EmojiCaptureReporter> CREATOR = new C93277a();

    /* renamed from: A */
    public String f269121A;

    /* renamed from: B */
    public int f269122B;

    /* renamed from: C */
    public int f269123C;

    /* renamed from: D */
    public String f269124D;

    /* renamed from: E */
    public int f269125E = 2;

    /* renamed from: F */
    public int f269126F = 9;

    /* renamed from: G */
    public int f269127G;

    /* renamed from: d */
    public long f269128d;

    /* renamed from: e */
    public long f269129e;

    /* renamed from: f */
    public long f269130f;

    /* renamed from: g */
    public long f269131g;

    /* renamed from: h */
    public long f269132h;

    /* renamed from: i */
    public long f269133i;

    /* renamed from: j */
    public long f269134j;

    /* renamed from: n */
    public long f269135n;

    /* renamed from: o */
    public long f269136o;

    /* renamed from: p */
    public long f269137p;

    /* renamed from: q */
    public String f269138q;

    /* renamed from: r */
    public int f269139r;

    /* renamed from: s */
    public boolean f269140s;

    /* renamed from: t */
    public boolean f269141t;

    /* renamed from: u */
    public int f269142u;

    /* renamed from: v */
    public boolean f269143v;

    /* renamed from: w */
    public int f269144w;

    /* renamed from: x */
    public String f269145x;

    /* renamed from: y */
    public boolean f269146y;

    /* renamed from: z */
    public String f269147z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter$a */
    public class C93277a implements Parcelable.Creator<EmojiCaptureReporter> {
        public Object createFromParcel(Parcel parcel) {
            return new EmojiCaptureReporter(parcel);
        }

        public Object[] newArray(int i) {
            return new EmojiCaptureReporter[0];
        }
    }

    public EmojiCaptureReporter() {
    }

    /* renamed from: b */
    public static void m117776b(int i, long j, long j2, long j3, long j4, long j5, long j6, int i2, int i3, int i4) {
        C115669n.INSTANCE.mo160131h(15982, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* renamed from: c */
    public static void m117777c(int i, int i2) {
        C115669n.INSTANCE.mo175913w(852, (long) i, (long) i2);
    }

    /* renamed from: d */
    public static void m117778d(long j, int i, int i2) {
        int i3 = i;
        m117776b(21, j, 0, 0, 0, 0, 0, i, 0, i2);
        int i4 = i;
        if (i4 == 1) {
            m117777c(5, 1);
        } else if (i4 == 3) {
            m117777c(21, 1);
        } else if (i4 == 4) {
            m117777c(29, 1);
        } else if (i4 == 5) {
            m117777c(30, 1);
        }
    }

    /* renamed from: f */
    public static void m117779f(long j, int i, int i2) {
        m117776b(22, j, 0, 0, 0, 0, 0, 0, i, i2);
        switch (i) {
            case 1:
                m117777c(7, 1);
                return;
            case 2:
                m117777c(6, 1);
                return;
            case 3:
                m117777c(8, 1);
                return;
            case 4:
                m117777c(28, 1);
                return;
            case 5:
                m117777c(22, 1);
                return;
            case 6:
                m117777c(24, 1);
                return;
            case 7:
                m117777c(25, 1);
                return;
            case 8:
                m117777c(26, 1);
                return;
            case 9:
                m117777c(27, 1);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo127933a(String str, String str2) {
        C115669n.INSTANCE.mo160131h(15982, 27, Long.valueOf(this.f269128d), 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(this.f269127G), str, 0, 0, 0, str2, Integer.valueOf(this.f269125E));
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo127935e(int i) {
        C115669n.INSTANCE.mo160131h(15982, Integer.valueOf(i), Long.valueOf(this.f269128d), 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(this.f269127G), this.f269121A, Integer.valueOf(this.f269122B), 0, Integer.valueOf(this.f269123C), this.f269124D, Integer.valueOf(this.f269125E), Integer.valueOf(this.f269126F));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f269128d);
        parcel.writeLong(this.f269129e);
        parcel.writeLong(this.f269130f);
        parcel.writeLong(this.f269131g);
        parcel.writeLong(this.f269132h);
        parcel.writeLong(this.f269133i);
        parcel.writeLong(this.f269134j);
        parcel.writeLong(this.f269135n);
        parcel.writeLong(this.f269136o);
        parcel.writeLong(this.f269137p);
        parcel.writeInt(this.f269139r);
        parcel.writeByte(this.f269140s ? (byte) 1 : 0);
        parcel.writeByte(this.f269141t ? (byte) 1 : 0);
        parcel.writeInt(this.f269142u);
        parcel.writeByte(this.f269143v ? (byte) 1 : 0);
        parcel.writeInt(this.f269144w);
        parcel.writeString(this.f269138q);
        parcel.writeString(this.f269145x);
    }

    public EmojiCaptureReporter(Parcel parcel) {
        this.f269128d = parcel.readLong();
        this.f269129e = parcel.readLong();
        this.f269130f = parcel.readLong();
        this.f269131g = parcel.readLong();
        this.f269132h = parcel.readLong();
        this.f269133i = parcel.readLong();
        this.f269134j = parcel.readLong();
        this.f269135n = parcel.readLong();
        this.f269136o = parcel.readLong();
        this.f269137p = parcel.readLong();
        this.f269139r = parcel.readInt();
        boolean z = true;
        this.f269140s = parcel.readByte() != 0;
        this.f269141t = parcel.readByte() != 0;
        this.f269142u = parcel.readInt();
        this.f269143v = parcel.readByte() == 0 ? false : z;
        this.f269144w = parcel.readInt();
        this.f269138q = parcel.readString();
        this.f269145x = parcel.readString();
    }
}
