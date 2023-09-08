package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.w4 */
public class C47697w4 extends C47465a {

    /* renamed from: d */
    public String f128118d;

    /* renamed from: e */
    public String f128119e;

    /* renamed from: f */
    public String f128120f;

    /* renamed from: g */
    public String f128121g;

    /* renamed from: h */
    public String f128122h;

    /* renamed from: i */
    public C47621l3 f128123i;

    /* renamed from: j */
    public String f128124j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47697w4)) {
            return false;
        }
        C47697w4 w4Var = (C47697w4) aVar;
        return C46238a.m51546a(this.f128118d, w4Var.f128118d) && C46238a.m51546a(this.f128119e, w4Var.f128119e) && C46238a.m51546a(this.f128120f, w4Var.f128120f) && C46238a.m51546a(this.f128121g, w4Var.f128121g) && C46238a.m51546a(this.f128122h, w4Var.f128122h) && C46238a.m51546a(this.f128123i, w4Var.f128123i) && C46238a.m51546a(this.f128124j, w4Var.f128124j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128118d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128119e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f128120f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f128121g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f128122h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            C47621l3 l3Var = this.f128123i;
            if (l3Var != null) {
                aVar.mo74322i(6, l3Var.computeSize());
                this.f128123i.writeFields(aVar);
            }
            String str6 = this.f128124j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f128118d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f128119e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f128120f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f128121g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f128122h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            C47621l3 l3Var2 = this.f128123i;
            if (l3Var2 != null) {
                i2 += C52418a.m58682i(6, l3Var2.computeSize());
            }
            String str12 = this.f128124j;
            return str12 != null ? i2 + C52418a.m58683j(7, str12) : i2;
        } else if (i == 2) {
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
            C47697w4 w4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w4Var.f128118d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w4Var.f128119e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w4Var.f128120f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w4Var.f128121g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w4Var.f128122h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47621l3 l3Var3 = new C47621l3();
                        if (bArr != null && bArr.length > 0) {
                            l3Var3.parseFrom(bArr);
                        }
                        w4Var.f128123i = l3Var3;
                    }
                    return 0;
                case 7:
                    w4Var.f128124j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
