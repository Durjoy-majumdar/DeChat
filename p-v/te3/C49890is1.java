package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.is1 */
public class C49890is1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49747hs1> f135633d = new LinkedList<>();

    /* renamed from: e */
    public int f135634e;

    /* renamed from: f */
    public String f135635f;

    /* renamed from: g */
    public String f135636g;

    /* renamed from: h */
    public String f135637h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49890is1)) {
            return false;
        }
        C49890is1 is12 = (C49890is1) aVar;
        return C46238a.m51546a(this.f135633d, is12.f135633d) && C46238a.m51546a(Integer.valueOf(this.f135634e), Integer.valueOf(is12.f135634e)) && C46238a.m51546a(this.f135635f, is12.f135635f) && C46238a.m51546a(this.f135636g, is12.f135636g) && C46238a.m51546a(this.f135637h, is12.f135637h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135633d);
            aVar.mo74318e(2, this.f135634e);
            String str = this.f135635f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135636g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f135637h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f135633d) + 0 + C52418a.m58678e(2, this.f135634e);
            String str4 = this.f135635f;
            if (str4 != null) {
                g += C52418a.m58683j(3, str4);
            }
            String str5 = this.f135636g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f135637h;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f135633d.clear();
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
            C49890is1 is12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49747hs1 hs12 = new C49747hs1();
                    if (bArr != null && bArr.length > 0) {
                        hs12.parseFrom(bArr);
                    }
                    is12.f135633d.add(hs12);
                }
                return 0;
            } else if (intValue == 2) {
                is12.f135634e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                is12.f135635f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                is12.f135636g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                is12.f135637h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
