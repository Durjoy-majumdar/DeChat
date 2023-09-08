package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q81 */
public class C50926q81 extends C47465a {

    /* renamed from: d */
    public int f140177d;

    /* renamed from: e */
    public String f140178e;

    /* renamed from: f */
    public C50019jp1 f140179f;

    /* renamed from: g */
    public String f140180g;

    /* renamed from: h */
    public C49178dp1 f140181h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50926q81)) {
            return false;
        }
        C50926q81 q812 = (C50926q81) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140177d), Integer.valueOf(q812.f140177d)) && C46238a.m51546a(this.f140178e, q812.f140178e) && C46238a.m51546a(this.f140179f, q812.f140179f) && C46238a.m51546a(this.f140180g, q812.f140180g) && C46238a.m51546a(this.f140181h, q812.f140181h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140177d);
            String str = this.f140178e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C50019jp1 jp12 = this.f140179f;
            if (jp12 != null) {
                aVar.mo74322i(3, jp12.computeSize());
                this.f140179f.writeFields(aVar);
            }
            String str2 = this.f140180g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C49178dp1 dp12 = this.f140181h;
            if (dp12 != null) {
                aVar.mo74322i(5, dp12.computeSize());
                this.f140181h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140177d) + 0;
            String str3 = this.f140178e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            C50019jp1 jp13 = this.f140179f;
            if (jp13 != null) {
                e += C52418a.m58682i(3, jp13.computeSize());
            }
            String str4 = this.f140180g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C49178dp1 dp13 = this.f140181h;
            return dp13 != null ? e + C52418a.m58682i(5, dp13.computeSize()) : e;
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
            C50926q81 q812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q812.f140177d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                q812.f140178e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50019jp1 jp14 = new C50019jp1();
                    if (bArr != null && bArr.length > 0) {
                        jp14.parseFrom(bArr);
                    }
                    q812.f140179f = jp14;
                }
                return 0;
            } else if (intValue == 4) {
                q812.f140180g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49178dp1 dp14 = new C49178dp1();
                    if (bArr2 != null && bArr2.length > 0) {
                        dp14.parseFrom(bArr2);
                    }
                    q812.f140181h = dp14;
                }
                return 0;
            }
        }
    }
}
