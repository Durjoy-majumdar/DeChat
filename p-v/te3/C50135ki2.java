package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ki2 */
public class C50135ki2 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f136807d;

    /* renamed from: e */
    public String f136808e;

    /* renamed from: f */
    public String f136809f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50135ki2)) {
            return false;
        }
        C50135ki2 ki22 = (C50135ki2) aVar;
        return C46238a.m51546a(this.f136807d, ki22.f136807d) && C46238a.m51546a(this.f136808e, ki22.f136808e) && C46238a.m51546a(this.f136809f, ki22.f136809f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f136807d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f136807d.writeFields(aVar);
            }
            String str = this.f136808e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136809f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f136807d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            String str3 = this.f136808e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f136809f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C50135ki2 ki22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    ki22.f136807d = hx04;
                }
                return 0;
            } else if (intValue == 2) {
                ki22.f136808e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ki22.f136809f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
