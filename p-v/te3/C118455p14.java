package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p14 */
public class C118455p14 extends C47465a {

    /* renamed from: d */
    public String f354214d;

    /* renamed from: e */
    public String f354215e;

    /* renamed from: f */
    public String f354216f;

    /* renamed from: g */
    public LinkedList<C118448o14> f354217g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118455p14)) {
            return false;
        }
        C118455p14 p142 = (C118455p14) aVar;
        return C46238a.m51546a(this.f354214d, p142.f354214d) && C46238a.m51546a(this.f354215e, p142.f354215e) && C46238a.m51546a(this.f354216f, p142.f354216f) && C46238a.m51546a(this.f354217g, p142.f354217g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354214d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354215e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354216f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 8, this.f354217g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f354214d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f354215e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f354216f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 8, this.f354217g);
        } else if (i == 2) {
            this.f354217g.clear();
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
            C118455p14 p142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p142.f354214d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p142.f354215e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                p142.f354216f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118448o14 o142 = new C118448o14();
                    if (bArr != null && bArr.length > 0) {
                        o142.parseFrom(bArr);
                    }
                    p142.f354217g.add(o142);
                }
                return 0;
            }
        }
    }
}
