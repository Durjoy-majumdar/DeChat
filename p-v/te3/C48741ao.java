package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ao */
public class C48741ao extends C47465a {

    /* renamed from: d */
    public C51975xh2 f130648d;

    /* renamed from: e */
    public zf4 f130649e;

    /* renamed from: f */
    public LinkedList<zf4> f130650f = new LinkedList<>();

    /* renamed from: g */
    public String f130651g;

    /* renamed from: h */
    public String f130652h;

    /* renamed from: i */
    public C50456mv3 f130653i;

    /* renamed from: j */
    public int f130654j;

    /* renamed from: n */
    public int f130655n;

    /* renamed from: o */
    public int f130656o;

    /* renamed from: p */
    public String f130657p;

    /* renamed from: q */
    public zf4 f130658q;

    /* renamed from: r */
    public String f130659r;

    /* renamed from: s */
    public LinkedList<C52196z03> f130660s = new LinkedList<>();

    /* renamed from: t */
    public zf4 f130661t;

    /* renamed from: u */
    public zf4 f130662u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48741ao)) {
            return false;
        }
        C48741ao aoVar = (C48741ao) aVar;
        return C46238a.m51546a(this.f130648d, aoVar.f130648d) && C46238a.m51546a(this.f130649e, aoVar.f130649e) && C46238a.m51546a(this.f130650f, aoVar.f130650f) && C46238a.m51546a(this.f130651g, aoVar.f130651g) && C46238a.m51546a(this.f130652h, aoVar.f130652h) && C46238a.m51546a(this.f130653i, aoVar.f130653i) && C46238a.m51546a(Integer.valueOf(this.f130654j), Integer.valueOf(aoVar.f130654j)) && C46238a.m51546a(Integer.valueOf(this.f130655n), Integer.valueOf(aoVar.f130655n)) && C46238a.m51546a(Integer.valueOf(this.f130656o), Integer.valueOf(aoVar.f130656o)) && C46238a.m51546a(this.f130657p, aoVar.f130657p) && C46238a.m51546a(this.f130658q, aoVar.f130658q) && C46238a.m51546a(this.f130659r, aoVar.f130659r) && C46238a.m51546a(this.f130660s, aoVar.f130660s) && C46238a.m51546a(this.f130661t, aoVar.f130661t) && C46238a.m51546a(this.f130662u, aoVar.f130662u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51975xh2 xh22 = this.f130648d;
            if (xh22 != null) {
                aVar.mo74322i(1, xh22.computeSize());
                this.f130648d.writeFields(aVar);
            }
            zf4 zf4 = this.f130649e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f130649e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f130650f);
            String str = this.f130651g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f130652h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C50456mv3 mv32 = this.f130653i;
            if (mv32 != null) {
                aVar.mo74322i(6, mv32.computeSize());
                this.f130653i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f130654j);
            aVar.mo74318e(8, this.f130655n);
            aVar.mo74318e(9, this.f130656o);
            String str3 = this.f130657p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            zf4 zf42 = this.f130658q;
            if (zf42 != null) {
                aVar.mo74322i(11, zf42.computeSize());
                this.f130658q.writeFields(aVar);
            }
            String str4 = this.f130659r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74320g(13, 8, this.f130660s);
            zf4 zf43 = this.f130661t;
            if (zf43 != null) {
                aVar.mo74322i(14, zf43.computeSize());
                this.f130661t.writeFields(aVar);
            }
            zf4 zf44 = this.f130662u;
            if (zf44 != null) {
                aVar.mo74322i(15, zf44.computeSize());
                this.f130662u.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C51975xh2 xh23 = this.f130648d;
            if (xh23 != null) {
                i3 = C52418a.m58682i(1, xh23.computeSize()) + 0;
            }
            zf4 zf45 = this.f130649e;
            if (zf45 != null) {
                i3 += C52418a.m58682i(2, zf45.computeSize());
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f130650f);
            String str5 = this.f130651g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f130652h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            C50456mv3 mv33 = this.f130653i;
            if (mv33 != null) {
                g += C52418a.m58682i(6, mv33.computeSize());
            }
            int e = g + C52418a.m58678e(7, this.f130654j) + C52418a.m58678e(8, this.f130655n) + C52418a.m58678e(9, this.f130656o);
            String str7 = this.f130657p;
            if (str7 != null) {
                e += C52418a.m58683j(10, str7);
            }
            zf4 zf46 = this.f130658q;
            if (zf46 != null) {
                e += C52418a.m58682i(11, zf46.computeSize());
            }
            String str8 = this.f130659r;
            if (str8 != null) {
                e += C52418a.m58683j(12, str8);
            }
            int g2 = e + C52418a.m58680g(13, 8, this.f130660s);
            zf4 zf47 = this.f130661t;
            if (zf47 != null) {
                g2 += C52418a.m58682i(14, zf47.computeSize());
            }
            zf4 zf48 = this.f130662u;
            return zf48 != null ? g2 + C52418a.m58682i(15, zf48.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f130650f.clear();
            this.f130660s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48741ao aoVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr != null && bArr.length > 0) {
                            xh24.parseFrom(bArr);
                        }
                        aoVar.f130648d = xh24;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        zf4 zf49 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf49.parseFrom(bArr2);
                        }
                        aoVar.f130649e = zf49;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        zf4 zf410 = new zf4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zf410.parseFrom(bArr3);
                        }
                        aoVar.f130650f.add(zf410);
                    }
                    return 0;
                case 4:
                    aoVar.f130651g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    aoVar.f130652h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            mv34.parseFrom(bArr4);
                        }
                        aoVar.f130653i = mv34;
                    }
                    return 0;
                case 7:
                    aoVar.f130654j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    aoVar.f130655n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    aoVar.f130656o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    aoVar.f130657p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        zf4 zf411 = new zf4();
                        if (bArr5 != null && bArr5.length > 0) {
                            zf411.parseFrom(bArr5);
                        }
                        aoVar.f130658q = zf411;
                    }
                    return 0;
                case 12:
                    aoVar.f130659r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C52196z03 z032 = new C52196z03();
                        if (bArr6 != null && bArr6.length > 0) {
                            z032.parseFrom(bArr6);
                        }
                        aoVar.f130660s.add(z032);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        zf4 zf412 = new zf4();
                        if (bArr7 != null && bArr7.length > 0) {
                            zf412.parseFrom(bArr7);
                        }
                        aoVar.f130661t = zf412;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        zf4 zf413 = new zf4();
                        if (bArr8 != null && bArr8.length > 0) {
                            zf413.parseFrom(bArr8);
                        }
                        aoVar.f130662u = zf413;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
