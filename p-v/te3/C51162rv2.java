package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rv2 */
public class C51162rv2 extends C47465a {

    /* renamed from: d */
    public int f141165d;

    /* renamed from: e */
    public String f141166e;

    /* renamed from: f */
    public int f141167f;

    /* renamed from: g */
    public LinkedList<C51746vv2> f141168g = new LinkedList<>();

    /* renamed from: h */
    public String f141169h;

    /* renamed from: i */
    public String f141170i;

    /* renamed from: j */
    public String f141171j;

    /* renamed from: n */
    public String f141172n;

    /* renamed from: o */
    public LinkedList<String> f141173o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C48772aw2> f141174p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51162rv2)) {
            return false;
        }
        C51162rv2 rv22 = (C51162rv2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141165d), Integer.valueOf(rv22.f141165d)) && C46238a.m51546a(this.f141166e, rv22.f141166e) && C46238a.m51546a(Integer.valueOf(this.f141167f), Integer.valueOf(rv22.f141167f)) && C46238a.m51546a(this.f141168g, rv22.f141168g) && C46238a.m51546a(this.f141169h, rv22.f141169h) && C46238a.m51546a(this.f141170i, rv22.f141170i) && C46238a.m51546a(this.f141171j, rv22.f141171j) && C46238a.m51546a(this.f141172n, rv22.f141172n) && C46238a.m51546a(this.f141173o, rv22.f141173o) && C46238a.m51546a(this.f141174p, rv22.f141174p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141165d);
            String str = this.f141166e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f141167f);
            aVar.mo74320g(4, 8, this.f141168g);
            String str2 = this.f141169h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f141170i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f141171j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f141172n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74320g(9, 1, this.f141173o);
            aVar.mo74320g(10, 8, this.f141174p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141165d) + 0;
            String str6 = this.f141166e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            int e2 = e + C52418a.m58678e(3, this.f141167f) + C52418a.m58680g(4, 8, this.f141168g);
            String str7 = this.f141169h;
            if (str7 != null) {
                e2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f141170i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f141171j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f141172n;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            return e2 + C52418a.m58680g(9, 1, this.f141173o) + C52418a.m58680g(10, 8, this.f141174p);
        } else if (i == 2) {
            this.f141168g.clear();
            this.f141173o.clear();
            this.f141174p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51162rv2 rv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rv22.f141165d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    rv22.f141166e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rv22.f141167f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51746vv2 vv22 = new C51746vv2();
                        if (bArr != null && bArr.length > 0) {
                            vv22.parseFrom(bArr);
                        }
                        rv22.f141168g.add(vv22);
                    }
                    return 0;
                case 5:
                    rv22.f141169h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rv22.f141170i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rv22.f141171j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rv22.f141172n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    rv22.f141173o.add(aVar3.mo141633k(intValue));
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C48772aw2 aw22 = new C48772aw2();
                        if (bArr2 != null && bArr2.length > 0) {
                            aw22.parseFrom(bArr2);
                        }
                        rv22.f141174p.add(aw22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
