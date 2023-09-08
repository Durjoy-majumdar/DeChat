package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h50 */
public class C49659h50 extends C47465a {

    /* renamed from: d */
    public int f134445d;

    /* renamed from: e */
    public C49800i50 f134446e;

    /* renamed from: f */
    public int f134447f;

    /* renamed from: g */
    public C49800i50 f134448g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49659h50)) {
            return false;
        }
        C49659h50 h502 = (C49659h50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134445d), Integer.valueOf(h502.f134445d)) && C46238a.m51546a(this.f134446e, h502.f134446e) && C46238a.m51546a(Integer.valueOf(this.f134447f), Integer.valueOf(h502.f134447f)) && C46238a.m51546a(this.f134448g, h502.f134448g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134446e == null) {
                throw new C52419b("Not all required fields were included: NightTime");
            } else if (this.f134448g != null) {
                aVar.mo74318e(1, this.f134445d);
                C49800i50 i502 = this.f134446e;
                if (i502 != null) {
                    aVar.mo74322i(2, i502.computeSize());
                    this.f134446e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f134447f);
                C49800i50 i503 = this.f134448g;
                if (i503 != null) {
                    aVar.mo74322i(4, i503.computeSize());
                    this.f134448g.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AllDayTime");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134445d) + 0;
            C49800i50 i504 = this.f134446e;
            if (i504 != null) {
                e += C52418a.m58682i(2, i504.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f134447f);
            C49800i50 i505 = this.f134448g;
            return i505 != null ? e2 + C52418a.m58682i(4, i505.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134446e == null) {
                throw new C52419b("Not all required fields were included: NightTime");
            } else if (this.f134448g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AllDayTime");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49659h50 h502 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h502.f134445d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49800i50 i506 = new C49800i50();
                    if (bArr != null && bArr.length > 0) {
                        i506.parseFrom(bArr);
                    }
                    h502.f134446e = i506;
                }
                return 0;
            } else if (intValue == 3) {
                h502.f134447f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49800i50 i507 = new C49800i50();
                    if (bArr2 != null && bArr2.length > 0) {
                        i507.parseFrom(bArr2);
                    }
                    h502.f134448g = i507;
                }
                return 0;
            }
        }
    }
}
