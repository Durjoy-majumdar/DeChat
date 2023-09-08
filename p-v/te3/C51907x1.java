package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x1 */
public class C51907x1 extends C47465a {

    /* renamed from: d */
    public String f144385d;

    /* renamed from: e */
    public String f144386e;

    /* renamed from: f */
    public String f144387f;

    /* renamed from: g */
    public String f144388g;

    /* renamed from: h */
    public String f144389h;

    /* renamed from: i */
    public String f144390i;

    /* renamed from: j */
    public String f144391j;

    /* renamed from: n */
    public String f144392n;

    /* renamed from: o */
    public String f144393o;

    /* renamed from: p */
    public k85 f144394p;

    /* renamed from: q */
    public String f144395q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51907x1)) {
            return false;
        }
        C51907x1 x1Var = (C51907x1) aVar;
        return C46238a.m51546a(this.f144385d, x1Var.f144385d) && C46238a.m51546a(this.f144386e, x1Var.f144386e) && C46238a.m51546a(this.f144387f, x1Var.f144387f) && C46238a.m51546a(this.f144388g, x1Var.f144388g) && C46238a.m51546a(this.f144389h, x1Var.f144389h) && C46238a.m51546a(this.f144390i, x1Var.f144390i) && C46238a.m51546a(this.f144391j, x1Var.f144391j) && C46238a.m51546a(this.f144392n, x1Var.f144392n) && C46238a.m51546a(this.f144393o, x1Var.f144393o) && C46238a.m51546a(this.f144394p, x1Var.f144394p) && C46238a.m51546a(this.f144395q, x1Var.f144395q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144385d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144386e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f144387f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f144388g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f144389h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f144390i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f144391j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f144392n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f144393o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            k85 k85 = this.f144394p;
            if (k85 != null) {
                aVar.mo74322i(10, k85.computeSize());
                this.f144394p.writeFields(aVar);
            }
            String str10 = this.f144395q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            return 0;
        } else if (i == 1) {
            String str11 = this.f144385d;
            if (str11 != null) {
                i2 = 0 + C52418a.m58683j(1, str11);
            }
            String str12 = this.f144386e;
            if (str12 != null) {
                i2 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f144387f;
            if (str13 != null) {
                i2 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f144388g;
            if (str14 != null) {
                i2 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f144389h;
            if (str15 != null) {
                i2 += C52418a.m58683j(5, str15);
            }
            String str16 = this.f144390i;
            if (str16 != null) {
                i2 += C52418a.m58683j(6, str16);
            }
            String str17 = this.f144391j;
            if (str17 != null) {
                i2 += C52418a.m58683j(7, str17);
            }
            String str18 = this.f144392n;
            if (str18 != null) {
                i2 += C52418a.m58683j(8, str18);
            }
            String str19 = this.f144393o;
            if (str19 != null) {
                i2 += C52418a.m58683j(9, str19);
            }
            k85 k852 = this.f144394p;
            if (k852 != null) {
                i2 += C52418a.m58682i(10, k852.computeSize());
            }
            String str20 = this.f144395q;
            return str20 != null ? i2 + C52418a.m58683j(11, str20) : i2;
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
            C51907x1 x1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x1Var.f144385d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    x1Var.f144386e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x1Var.f144387f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x1Var.f144388g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x1Var.f144389h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x1Var.f144390i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x1Var.f144391j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    x1Var.f144392n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    x1Var.f144393o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        k85 k853 = new k85();
                        if (bArr != null && bArr.length > 0) {
                            k853.parseFrom(bArr);
                        }
                        x1Var.f144394p = k853;
                    }
                    return 0;
                case 11:
                    x1Var.f144395q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
