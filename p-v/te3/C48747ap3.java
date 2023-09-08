package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ap3 */
public class C48747ap3 extends C47465a {

    /* renamed from: d */
    public String f130707d;

    /* renamed from: e */
    public String f130708e;

    /* renamed from: f */
    public String f130709f;

    /* renamed from: g */
    public String f130710g;

    /* renamed from: h */
    public long f130711h;

    /* renamed from: i */
    public String f130712i;

    /* renamed from: j */
    public double f130713j;

    /* renamed from: n */
    public LinkedList<C50707oo> f130714n = new LinkedList<>();

    /* renamed from: o */
    public String f130715o;

    /* renamed from: p */
    public LinkedList<C51744vu3> f130716p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48747ap3)) {
            return false;
        }
        C48747ap3 ap32 = (C48747ap3) aVar;
        return C46238a.m51546a(this.f130707d, ap32.f130707d) && C46238a.m51546a(this.f130708e, ap32.f130708e) && C46238a.m51546a(this.f130709f, ap32.f130709f) && C46238a.m51546a(this.f130710g, ap32.f130710g) && C46238a.m51546a(Long.valueOf(this.f130711h), Long.valueOf(ap32.f130711h)) && C46238a.m51546a(this.f130712i, ap32.f130712i) && C46238a.m51546a(Double.valueOf(this.f130713j), Double.valueOf(ap32.f130713j)) && C46238a.m51546a(this.f130714n, ap32.f130714n) && C46238a.m51546a(this.f130715o, ap32.f130715o) && C46238a.m51546a(this.f130716p, ap32.f130716p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130707d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130708e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130709f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f130710g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f130711h);
            String str5 = this.f130712i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74316c(7, this.f130713j);
            aVar.mo74320g(16, 8, this.f130714n);
            String str6 = this.f130715o;
            if (str6 != null) {
                aVar.mo74323j(17, str6);
            }
            aVar.mo74320g(19, 8, this.f130716p);
            return 0;
        } else if (i == 1) {
            String str7 = this.f130707d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f130708e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f130709f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f130710g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int h = i2 + C52418a.m58681h(5, this.f130711h);
            String str11 = this.f130712i;
            if (str11 != null) {
                h += C52418a.m58683j(6, str11);
            }
            int c = h + C52418a.m58676c(7, this.f130713j) + C52418a.m58680g(16, 8, this.f130714n);
            String str12 = this.f130715o;
            if (str12 != null) {
                c += C52418a.m58683j(17, str12);
            }
            return c + C52418a.m58680g(19, 8, this.f130716p);
        } else if (i == 2) {
            this.f130714n.clear();
            this.f130716p.clear();
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
            C48747ap3 ap32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 16) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50707oo ooVar = new C50707oo();
                    if (bArr != null && bArr.length > 0) {
                        ooVar.parseFrom(bArr);
                    }
                    ap32.f130714n.add(ooVar);
                }
                return 0;
            } else if (intValue == 17) {
                ap32.f130715o = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 19) {
                switch (intValue) {
                    case 1:
                        ap32.f130707d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        ap32.f130708e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        ap32.f130709f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        ap32.f130710g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        ap32.f130711h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        ap32.f130712i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        ap32.f130713j = aVar3.mo141627e(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51744vu3 vu32 = new C51744vu3();
                    if (bArr2 != null && bArr2.length > 0) {
                        vu32.parseFrom(bArr2);
                    }
                    ap32.f130716p.add(vu32);
                }
                return 0;
            }
        }
    }
}
