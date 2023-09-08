package qu3;

import java.io.ByteArrayOutputStream;
import java.io.UTFDataFormatException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pu3.C25466a;
import pu3.C25467b;
import pu3.C25468c;
import pu3.C25469d;
import pu3.C25470e;
import pu3.C25473f;
import pu3.C25474g;
import pu3.C25477h;
import pu3.C25488j;
import pu3.C25490l;
import pu3.C25492n;
import pu3.C25493o;
import pu3.C25494p;
import pu3.C25495q;
import pu3.C25496r;
import pu3.C25497s;
import pu3.C25498t;
import pu3.C25502v;
import ru3.C26116a;
import ru3.C26117b;

/* renamed from: qu3.a */
public class C25903a implements C26116a, C26117b {

    /* renamed from: c */
    public static final short[] f72242c = new short[0];

    /* renamed from: d */
    public static final C25474g.C25476b[] f72243d = new C25474g.C25476b[0];

    /* renamed from: e */
    public static final C25474g.C25475a[] f72244e = new C25474g.C25475a[0];

    /* renamed from: a */
    public ByteBuffer f72245a;

    /* renamed from: b */
    public int f72246b;

    /* renamed from: qu3.a$a */
    public class C25904a implements C26117b {

        /* renamed from: a */
        public final /* synthetic */ ByteArrayOutputStream f72247a;

        public C25904a(C25903a aVar, ByteArrayOutputStream byteArrayOutputStream) {
            this.f72247a = byteArrayOutputStream;
        }

        /* renamed from: o */
        public void mo52789o(int i) {
            this.f72247a.write(i);
        }
    }

    public C25903a(ByteBuffer byteBuffer) {
        this.f72245a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.f72246b = byteBuffer.limit();
    }

    /* renamed from: a */
    public final void mo52786a(int i) {
        this.f72245a.position();
        this.f72245a.limit();
    }

    /* renamed from: b */
    public C25466a mo52726b() {
        int position = this.f72245a.position();
        byte readByte = readByte();
        int position2 = this.f72245a.position();
        new C25492n((C26116a) this, 29).mo52755f();
        byte[] bArr = new byte[(this.f72245a.position() - position2)];
        this.f72245a.position(position2);
        this.f72245a.get(bArr);
        return new C25466a(position, readByte, new C25490l(position2, bArr));
    }

    /* renamed from: c */
    public C25467b mo52727c() {
        int position = this.f72245a.position();
        int l = mo52787l();
        int[] iArr = new int[l];
        for (int i = 0; i < l; i++) {
            iArr[i] = mo52787l();
        }
        return new C25467b(position, iArr);
    }

    /* renamed from: d */
    public C25468c mo52728d() {
        int position = this.f72245a.position();
        int l = mo52787l();
        int[] iArr = new int[l];
        for (int i = 0; i < l; i++) {
            iArr[i] = mo52787l();
        }
        return new C25468c(position, iArr);
    }

    /* renamed from: e */
    public C25469d mo52729e() {
        int position = this.f72245a.position();
        int l = mo52787l();
        int l2 = mo52787l();
        int l3 = mo52787l();
        int l4 = mo52787l();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = l2;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        for (int i = 0; i < l2; i++) {
            iArr2[i][0] = mo52787l();
            iArr2[i][1] = mo52787l();
        }
        int[] iArr3 = new int[2];
        iArr3[1] = 2;
        iArr3[0] = l3;
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
        for (int i2 = 0; i2 < l3; i2++) {
            iArr4[i2][0] = mo52787l();
            iArr4[i2][1] = mo52787l();
        }
        int[] iArr5 = new int[2];
        iArr5[1] = 2;
        iArr5[0] = l4;
        int[][] iArr6 = (int[][]) Array.newInstance(Integer.TYPE, iArr5);
        for (int i3 = 0; i3 < l4; i3++) {
            iArr6[i3][0] = mo52787l();
            iArr6[i3][1] = mo52787l();
        }
        return new C25469d(position, l, iArr2, iArr4, iArr6);
    }

    /* renamed from: f */
    public C25470e mo52730f() {
        int position = this.f72245a.position();
        int b = C25494p.m32917b(this);
        int b2 = C25494p.m32917b(this);
        int b3 = C25494p.m32917b(this);
        int b4 = C25494p.m32917b(this);
        C25470e.C25471a[] aVarArr = new C25470e.C25471a[b];
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += C25494p.m32917b(this);
            aVarArr[i2] = new C25470e.C25471a(i, C25494p.m32917b(this));
        }
        C25470e.C25471a[] aVarArr2 = new C25470e.C25471a[b2];
        int i3 = 0;
        for (int i4 = 0; i4 < b2; i4++) {
            i3 += C25494p.m32917b(this);
            aVarArr2[i4] = new C25470e.C25471a(i3, C25494p.m32917b(this));
        }
        return new C25470e(position, aVarArr, aVarArr2, mo52788n(b3), mo52788n(b4));
    }

    /* renamed from: g */
    public C25473f mo52731g() {
        return new C25473f(this.f72245a.position(), mo52787l(), mo52787l(), mo52787l(), mo52787l(), mo52787l(), mo52787l(), mo52787l(), mo52787l());
    }

    /* renamed from: h */
    public C25474g mo52732h() {
        short[] sArr;
        int i;
        short[] sArr2;
        C25474g.C25475a[] aVarArr;
        C25474g.C25476b[] bVarArr;
        int position = this.f72245a.position();
        int s = mo52790s();
        int s2 = mo52790s();
        int s3 = mo52790s();
        int s4 = mo52790s();
        int l = mo52787l();
        int l2 = mo52787l();
        if (l2 == 0) {
            sArr = f72242c;
        } else {
            sArr = new short[l2];
            for (int i2 = 0; i2 < l2; i2++) {
                sArr[i2] = this.f72245a.getShort();
            }
        }
        if (s4 > 0) {
            if ((sArr.length & 1) == 1) {
                mo52791t(2);
            }
            int position2 = this.f72245a.position();
            mo52791t(s4 * 8);
            int position3 = this.f72245a.position();
            int b = C25494p.m32917b(this);
            C25474g.C25475a[] aVarArr2 = new C25474g.C25475a[b];
            int i3 = 0;
            while (i3 < b) {
                int position4 = this.f72245a.position() - position3;
                int a = C25494p.m32916a(this);
                int abs = Math.abs(a);
                int i4 = position3;
                int[] iArr = new int[abs];
                short[] sArr3 = sArr;
                int[] iArr2 = new int[abs];
                int i5 = l;
                for (int i6 = 0; i6 < abs; i6++) {
                    iArr[i6] = C25494p.m32917b(this);
                    iArr2[i6] = C25494p.m32917b(this);
                }
                aVarArr2[i3] = new C25474g.C25475a(iArr, iArr2, a <= 0 ? C25494p.m32917b(this) : -1, position4);
                i3++;
                position3 = i4;
                sArr = sArr3;
                l = i5;
            }
            i = l;
            sArr2 = sArr;
            int position5 = this.f72245a.position();
            this.f72245a.position(position2);
            C25474g.C25476b[] bVarArr2 = new C25474g.C25476b[s4];
            int i7 = 0;
            while (i7 < s4) {
                int l3 = mo52787l();
                int s5 = mo52790s();
                int s6 = mo52790s();
                int i8 = 0;
                while (i8 < b) {
                    if (aVarArr2[i8].f72117g == s6) {
                        bVarArr2[i7] = new C25474g.C25476b(l3, s5, i8);
                        i7++;
                    } else {
                        i8++;
                    }
                }
                throw new IllegalArgumentException();
            }
            this.f72245a.position(position5);
            bVarArr = bVarArr2;
            aVarArr = aVarArr2;
        } else {
            i = l;
            sArr2 = sArr;
            bVarArr = f72243d;
            aVarArr = f72244e;
        }
        return new C25474g(position, s, s2, s3, i, sArr2, bVarArr, aVarArr);
    }

    /* renamed from: i */
    public C25477h mo52733i() {
        int position = this.f72245a.position();
        int b = C25494p.m32917b(this);
        int b2 = C25494p.m32917b(this);
        int[] iArr = new int[b2];
        for (int i = 0; i < b2; i++) {
            iArr[i] = C25494p.m32917b(this) - 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(64);
            try {
                C25904a aVar = new C25904a(this, byteArrayOutputStream2);
                while (true) {
                    byte readByte = readByte();
                    byteArrayOutputStream2.write(readByte);
                    if (readByte != 9) {
                        switch (readByte) {
                            case 0:
                                C25477h hVar = new C25477h(position, b, iArr, byteArrayOutputStream2.toByteArray());
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                return hVar;
                            case 1:
                                C25494p.m32919d(aVar, C25494p.m32917b(this));
                                break;
                            case 2:
                                C25494p.m32918c(aVar, C25494p.m32916a(this));
                                break;
                            case 3:
                            case 4:
                                C25494p.m32919d(aVar, C25494p.m32917b(this));
                                C25494p.m32919d(aVar, (C25494p.m32917b(this) - 1) + 1);
                                C25494p.m32919d(aVar, (C25494p.m32917b(this) - 1) + 1);
                                if (readByte != 4) {
                                    break;
                                } else {
                                    C25494p.m32919d(aVar, (C25494p.m32917b(this) - 1) + 1);
                                    break;
                                }
                            case 5:
                            case 6:
                                C25494p.m32919d(aVar, C25494p.m32917b(this));
                                break;
                        }
                    } else {
                        C25494p.m32919d(aVar, (C25494p.m32917b(this) - 1) + 1);
                    }
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
            }
        } catch (Throwable th4) {
            th = th4;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: j */
    public C25490l mo52734j() {
        int position = this.f72245a.position();
        new C25492n((C26116a) this, 28).mo52755f();
        byte[] bArr = new byte[(this.f72245a.position() - position)];
        this.f72245a.position(position);
        this.f72245a.get(bArr);
        return new C25490l(position, bArr);
    }

    /* renamed from: k */
    public C25493o mo52735k() {
        return new C25493o(this.f72245a.position(), mo52790s(), mo52790s(), mo52787l());
    }

    /* renamed from: l */
    public int mo52787l() {
        return this.f72245a.getInt();
    }

    /* renamed from: m */
    public C25495q mo52736m() {
        return new C25495q(this.f72245a.position(), mo52790s(), mo52790s(), mo52787l());
    }

    /* renamed from: n */
    public final C25470e.C25472b[] mo52788n(int i) {
        C25470e.C25472b[] bVarArr = new C25470e.C25472b[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C25494p.m32917b(this);
            bVarArr[i3] = new C25470e.C25472b(i2, C25494p.m32917b(this), C25494p.m32917b(this));
        }
        return bVarArr;
    }

    /* renamed from: o */
    public void mo52789o(int i) {
        mo52786a(1);
        this.f72245a.put((byte) i);
        if (this.f72245a.position() > this.f72246b) {
            this.f72246b = this.f72245a.position();
        }
    }

    /* renamed from: p */
    public C25497s mo52737p() {
        return new C25497s(this.f72245a.position(), mo52787l(), mo52787l(), mo52787l());
    }

    /* renamed from: q */
    public C25498t mo52738q() {
        int position = this.f72245a.position();
        try {
            int b = C25494p.m32917b(this);
            String a = C25496r.m32921a(this, new char[b]);
            if (a.length() == b) {
                return new C25498t(position, a);
            }
            throw new C25488j("Declared length " + b + " doesn't match decoded length of " + a.length());
        } catch (UTFDataFormatException e) {
            throw new C25488j((Throwable) e);
        }
    }

    /* renamed from: r */
    public C25502v mo52739r() {
        short[] sArr;
        int position = this.f72245a.position();
        int l = mo52787l();
        if (l == 0) {
            sArr = f72242c;
        } else {
            short[] sArr2 = new short[l];
            for (int i = 0; i < l; i++) {
                sArr2[i] = this.f72245a.getShort();
            }
            sArr = sArr2;
        }
        return new C25502v(position, sArr);
    }

    public byte readByte() {
        return this.f72245a.get();
    }

    /* renamed from: s */
    public int mo52790s() {
        return this.f72245a.getShort() & 65535;
    }

    /* renamed from: t */
    public void mo52791t(int i) {
        if (i >= 0) {
            ByteBuffer byteBuffer = this.f72245a;
            byteBuffer.position(byteBuffer.position() + i);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    public void mo52792u(byte[] bArr) {
        mo52786a(bArr.length * 1);
        this.f72245a.put(bArr);
        if (this.f72245a.position() > this.f72246b) {
            this.f72246b = this.f72245a.position();
        }
    }

    /* renamed from: v */
    public void mo52793v(int i) {
        mo52786a(4);
        this.f72245a.putInt(i);
        if (this.f72245a.position() > this.f72246b) {
            this.f72246b = this.f72245a.position();
        }
    }

    /* renamed from: w */
    public final void mo52794w(C25470e.C25472b[] bVarArr) {
        int i = 0;
        for (C25470e.C25472b bVar : bVarArr) {
            C25494p.m32919d(this, bVar.f72096d - i);
            i = bVar.f72096d;
            C25494p.m32919d(this, bVar.f72097e);
            C25494p.m32919d(this, bVar.f72098f);
        }
    }

    /* renamed from: x */
    public void mo52795x(short s) {
        mo52786a(2);
        this.f72245a.putShort(s);
        if (this.f72245a.position() > this.f72246b) {
            this.f72246b = this.f72245a.position();
        }
    }

    /* renamed from: y */
    public void mo52796y(int i) {
        short s = (short) i;
        if (i == (65535 & s)) {
            mo52795x(s);
            return;
        }
        throw new IllegalArgumentException("Expected an unsigned short: " + i);
    }
}
