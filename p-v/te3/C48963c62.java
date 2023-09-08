package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c62 */
public class C48963c62 extends C47465a {

    /* renamed from: d */
    public int f131545d;

    /* renamed from: e */
    public C51018qv3 f131546e;

    /* renamed from: f */
    public int f131547f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48963c62)) {
            return false;
        }
        C48963c62 c622 = (C48963c62) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131545d), Integer.valueOf(c622.f131545d)) && C46238a.m51546a(this.f131546e, c622.f131546e) && C46238a.m51546a(Integer.valueOf(this.f131547f), Integer.valueOf(c622.f131547f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131546e != null) {
                aVar.mo74318e(1, this.f131545d);
                C51018qv3 qv32 = this.f131546e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f131546e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f131547f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqBuf");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131545d) + 0;
            C51018qv3 qv33 = this.f131546e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f131547f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131546e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqBuf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48963c62 c622 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c622.f131545d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    c622.f131546e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c622.f131547f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
