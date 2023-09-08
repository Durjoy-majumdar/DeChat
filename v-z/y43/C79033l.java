package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.l */
public class C79033l extends C47465a {

    /* renamed from: d */
    public double f232068d;

    /* renamed from: e */
    public double f232069e;

    /* renamed from: f */
    public double f232070f;

    /* renamed from: g */
    public String f232071g;

    /* renamed from: h */
    public LinkedList<C79030d0> f232072h = new LinkedList<>();

    /* renamed from: i */
    public C66501m f232073i;

    /* renamed from: j */
    public int f232074j;

    /* renamed from: n */
    public String f232075n;

    /* renamed from: o */
    public String f232076o;

    /* renamed from: p */
    public double f232077p;

    /* renamed from: q */
    public double f232078q;

    /* renamed from: r */
    public int f232079r;

    /* renamed from: s */
    public String f232080s;

    /* renamed from: t */
    public String f232081t;

    /* renamed from: u */
    public C66497a f232082u;

    /* renamed from: v */
    public LinkedList<C66500k> f232083v = new LinkedList<>();

    /* renamed from: w */
    public C79028b f232084w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C79033l)) {
            return false;
        }
        C79033l lVar = (C79033l) aVar;
        return C46238a.m51546a(Double.valueOf(this.f232068d), Double.valueOf(lVar.f232068d)) && C46238a.m51546a(Double.valueOf(this.f232069e), Double.valueOf(lVar.f232069e)) && C46238a.m51546a(Double.valueOf(this.f232070f), Double.valueOf(lVar.f232070f)) && C46238a.m51546a(this.f232071g, lVar.f232071g) && C46238a.m51546a(this.f232072h, lVar.f232072h) && C46238a.m51546a(this.f232073i, lVar.f232073i) && C46238a.m51546a(Integer.valueOf(this.f232074j), Integer.valueOf(lVar.f232074j)) && C46238a.m51546a(this.f232075n, lVar.f232075n) && C46238a.m51546a(this.f232076o, lVar.f232076o) && C46238a.m51546a(Double.valueOf(this.f232077p), Double.valueOf(lVar.f232077p)) && C46238a.m51546a(Double.valueOf(this.f232078q), Double.valueOf(lVar.f232078q)) && C46238a.m51546a(Integer.valueOf(this.f232079r), Integer.valueOf(lVar.f232079r)) && C46238a.m51546a(this.f232080s, lVar.f232080s) && C46238a.m51546a(this.f232081t, lVar.f232081t) && C46238a.m51546a(this.f232082u, lVar.f232082u) && C46238a.m51546a(this.f232083v, lVar.f232083v) && C46238a.m51546a(this.f232084w, lVar.f232084w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f232068d);
            aVar.mo74316c(2, this.f232069e);
            aVar.mo74316c(3, this.f232070f);
            String str = this.f232071g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74320g(5, 8, this.f232072h);
            C66501m mVar = this.f232073i;
            if (mVar != null) {
                aVar.mo74322i(6, mVar.computeSize());
                this.f232073i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f232074j);
            String str2 = this.f232075n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f232076o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74316c(10, this.f232077p);
            aVar.mo74316c(11, this.f232078q);
            aVar.mo74318e(12, this.f232079r);
            String str4 = this.f232080s;
            if (str4 != null) {
                aVar.mo74323j(13, str4);
            }
            String str5 = this.f232081t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            C66497a aVar2 = this.f232082u;
            if (aVar2 != null) {
                aVar.mo74322i(15, aVar2.computeSize());
                this.f232082u.writeFields(aVar);
            }
            aVar.mo74320g(16, 8, this.f232083v);
            C79028b bVar = this.f232084w;
            if (bVar != null) {
                aVar.mo74322i(17, bVar.computeSize());
                this.f232084w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int c = C52418a.m58676c(1, this.f232068d) + 0 + C52418a.m58676c(2, this.f232069e) + C52418a.m58676c(3, this.f232070f);
            String str6 = this.f232071g;
            if (str6 != null) {
                c += C52418a.m58683j(4, str6);
            }
            int g = c + C52418a.m58680g(5, 8, this.f232072h);
            C66501m mVar2 = this.f232073i;
            if (mVar2 != null) {
                g += C52418a.m58682i(6, mVar2.computeSize());
            }
            int e = g + C52418a.m58678e(7, this.f232074j);
            String str7 = this.f232075n;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f232076o;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            int c2 = e + C52418a.m58676c(10, this.f232077p) + C52418a.m58676c(11, this.f232078q) + C52418a.m58678e(12, this.f232079r);
            String str9 = this.f232080s;
            if (str9 != null) {
                c2 += C52418a.m58683j(13, str9);
            }
            String str10 = this.f232081t;
            if (str10 != null) {
                c2 += C52418a.m58683j(14, str10);
            }
            C66497a aVar3 = this.f232082u;
            if (aVar3 != null) {
                c2 += C52418a.m58682i(15, aVar3.computeSize());
            }
            int g2 = c2 + C52418a.m58680g(16, 8, this.f232083v);
            C79028b bVar2 = this.f232084w;
            return bVar2 != null ? g2 + C52418a.m58682i(17, bVar2.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f232072h.clear();
            this.f232083v.clear();
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C79033l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lVar.f232068d = aVar5.mo141627e(intValue);
                    return 0;
                case 2:
                    lVar.f232069e = aVar5.mo141627e(intValue);
                    return 0;
                case 3:
                    lVar.f232070f = aVar5.mo141627e(intValue);
                    return 0;
                case 4:
                    lVar.f232071g = aVar5.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C79030d0 d0Var = new C79030d0();
                        if (bArr != null && bArr.length > 0) {
                            d0Var.parseFrom(bArr);
                        }
                        lVar.f232072h.add(d0Var);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C66501m mVar3 = new C66501m();
                        if (bArr2 != null && bArr2.length > 0) {
                            mVar3.parseFrom(bArr2);
                        }
                        lVar.f232073i = mVar3;
                    }
                    return 0;
                case 7:
                    lVar.f232074j = aVar5.mo141629g(intValue);
                    return 0;
                case 8:
                    lVar.f232075n = aVar5.mo141633k(intValue);
                    return 0;
                case 9:
                    lVar.f232076o = aVar5.mo141633k(intValue);
                    return 0;
                case 10:
                    lVar.f232077p = aVar5.mo141627e(intValue);
                    return 0;
                case 11:
                    lVar.f232078q = aVar5.mo141627e(intValue);
                    return 0;
                case 12:
                    lVar.f232079r = aVar5.mo141629g(intValue);
                    return 0;
                case 13:
                    lVar.f232080s = aVar5.mo141633k(intValue);
                    return 0;
                case 14:
                    lVar.f232081t = aVar5.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C66497a aVar6 = new C66497a();
                        if (bArr3 != null && bArr3.length > 0) {
                            aVar6.parseFrom(bArr3);
                        }
                        lVar.f232082u = aVar6;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar5.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C66500k kVar = new C66500k();
                        if (bArr4 != null && bArr4.length > 0) {
                            kVar.parseFrom(bArr4);
                        }
                        lVar.f232083v.add(kVar);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j5 = aVar5.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C79028b bVar3 = new C79028b();
                        if (bArr5 != null && bArr5.length > 0) {
                            bVar3.parseFrom(bArr5);
                        }
                        lVar.f232084w = bVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
