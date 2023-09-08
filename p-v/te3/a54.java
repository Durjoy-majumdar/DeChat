package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class a54 extends C47465a {

    /* renamed from: d */
    public String f182030d;

    /* renamed from: e */
    public String f182031e;

    /* renamed from: f */
    public pp4 f182032f;

    /* renamed from: g */
    public String f182033g;

    /* renamed from: h */
    public String f182034h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a54)) {
            return false;
        }
        a54 a54 = (a54) aVar;
        return C46238a.m51546a(this.f182030d, a54.f182030d) && C46238a.m51546a(this.f182031e, a54.f182031e) && C46238a.m51546a(this.f182032f, a54.f182032f) && C46238a.m51546a(this.f182033g, a54.f182033g) && C46238a.m51546a(this.f182034h, a54.f182034h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182030d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182031e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            pp4 pp4 = this.f182032f;
            if (pp4 != null) {
                aVar.mo74322i(3, pp4.computeSize());
                this.f182032f.writeFields(aVar);
            }
            String str3 = this.f182033g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f182034h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182030d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f182031e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            pp4 pp42 = this.f182032f;
            if (pp42 != null) {
                i2 += C52418a.m58682i(3, pp42.computeSize());
            }
            String str7 = this.f182033g;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f182034h;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            a54 a54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a54.f182030d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                a54.f182031e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    pp4 pp43 = new pp4();
                    if (bArr != null && bArr.length > 0) {
                        pp43.parseFrom(bArr);
                    }
                    a54.f182032f = pp43;
                }
                return 0;
            } else if (intValue == 4) {
                a54.f182033g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                a54.f182034h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
