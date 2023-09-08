package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s3 */
public class C51195s3 extends C47465a {

    /* renamed from: d */
    public String f141285d;

    /* renamed from: e */
    public String f141286e;

    /* renamed from: f */
    public String f141287f;

    /* renamed from: g */
    public C49810i73 f141288g;

    /* renamed from: h */
    public String f141289h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51195s3)) {
            return false;
        }
        C51195s3 s3Var = (C51195s3) aVar;
        return C46238a.m51546a(this.f141285d, s3Var.f141285d) && C46238a.m51546a(this.f141286e, s3Var.f141286e) && C46238a.m51546a(this.f141287f, s3Var.f141287f) && C46238a.m51546a(this.f141288g, s3Var.f141288g) && C46238a.m51546a(this.f141289h, s3Var.f141289h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141285d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141286e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141287f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C49810i73 i732 = this.f141288g;
            if (i732 != null) {
                aVar.mo74322i(4, i732.computeSize());
                this.f141288g.writeFields(aVar);
            }
            String str4 = this.f141289h;
            if (str4 != null) {
                aVar.mo74323j(100, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f141285d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f141286e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f141287f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            C49810i73 i733 = this.f141288g;
            if (i733 != null) {
                i2 += C52418a.m58682i(4, i733.computeSize());
            }
            String str8 = this.f141289h;
            return str8 != null ? i2 + C52418a.m58683j(100, str8) : i2;
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
            C51195s3 s3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s3Var.f141285d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                s3Var.f141286e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                s3Var.f141287f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49810i73 i734 = new C49810i73();
                    if (bArr != null && bArr.length > 0) {
                        i734.parseFrom(bArr);
                    }
                    s3Var.f141288g = i734;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                s3Var.f141289h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
