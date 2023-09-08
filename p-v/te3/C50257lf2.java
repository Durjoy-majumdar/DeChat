package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lf2 */
public class C50257lf2 extends C47465a {

    /* renamed from: d */
    public long f137387d;

    /* renamed from: e */
    public int f137388e;

    /* renamed from: f */
    public C51018qv3 f137389f;

    /* renamed from: g */
    public int f137390g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50257lf2)) {
            return false;
        }
        C50257lf2 lf22 = (C50257lf2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137387d), Long.valueOf(lf22.f137387d)) && C46238a.m51546a(Integer.valueOf(this.f137388e), Integer.valueOf(lf22.f137388e)) && C46238a.m51546a(this.f137389f, lf22.f137389f) && C46238a.m51546a(Integer.valueOf(this.f137390g), Integer.valueOf(lf22.f137390g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137389f != null) {
                aVar.mo74321h(1, this.f137387d);
                aVar.mo74318e(2, this.f137388e);
                C51018qv3 qv32 = this.f137389f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f137389f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f137390g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137387d) + 0 + C52418a.m58678e(2, this.f137388e);
            C51018qv3 qv33 = this.f137389f;
            if (qv33 != null) {
                h += C52418a.m58682i(3, qv33.computeSize());
            }
            return h + C52418a.m58678e(4, this.f137390g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137389f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50257lf2 lf22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lf22.f137387d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                lf22.f137388e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    lf22.f137389f = qv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lf22.f137390g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
