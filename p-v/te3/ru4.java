package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ru4 extends C47465a {

    /* renamed from: d */
    public int f141157d;

    /* renamed from: e */
    public C51018qv3 f141158e;

    /* renamed from: f */
    public String f141159f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ru4)) {
            return false;
        }
        ru4 ru4 = (ru4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141157d), Integer.valueOf(ru4.f141157d)) && C46238a.m51546a(this.f141158e, ru4.f141158e) && C46238a.m51546a(this.f141159f, ru4.f141159f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141158e != null) {
                aVar.mo74318e(1, this.f141157d);
                C51018qv3 qv32 = this.f141158e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f141158e.writeFields(aVar);
                }
                String str = this.f141159f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: CmdBuf");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141157d) + 0;
            C51018qv3 qv33 = this.f141158e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            String str2 = this.f141159f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141158e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: CmdBuf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ru4 ru4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ru4.f141157d = aVar3.mo141629g(intValue);
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
                    ru4.f141158e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ru4.f141159f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
