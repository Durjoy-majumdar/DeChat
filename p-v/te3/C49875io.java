package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.io */
public class C49875io extends C101820nt3 {

    /* renamed from: d */
    public int f135525d;

    /* renamed from: e */
    public C51018qv3 f135526e;

    /* renamed from: f */
    public C51996xm2 f135527f;

    /* renamed from: g */
    public int f135528g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49875io)) {
            return false;
        }
        C49875io ioVar = (C49875io) aVar;
        return C46238a.m51546a(this.BaseRequest, ioVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135525d), Integer.valueOf(ioVar.f135525d)) && C46238a.m51546a(this.f135526e, ioVar.f135526e) && C46238a.m51546a(this.f135527f, ioVar.f135527f) && C46238a.m51546a(Integer.valueOf(this.f135528g), Integer.valueOf(ioVar.f135528g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135526e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f135525d);
                C51018qv3 qv32 = this.f135526e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f135526e.writeFields(aVar);
                }
                C51996xm2 xm22 = this.f135527f;
                if (xm22 != null) {
                    aVar.mo74322i(4, xm22.computeSize());
                    this.f135527f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f135528g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyBuf");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135525d);
            C51018qv3 qv33 = this.f135526e;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            C51996xm2 xm23 = this.f135527f;
            if (xm23 != null) {
                e += C52418a.m58682i(4, xm23.computeSize());
            }
            return e + C52418a.m58678e(5, this.f135528g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135526e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyBuf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49875io ioVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    ioVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ioVar.f135525d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    ioVar.f135526e = qv34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51996xm2 xm24 = new C51996xm2();
                    if (bArr3 != null && bArr3.length > 0) {
                        xm24.parseFrom(bArr3);
                    }
                    ioVar.f135527f = xm24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ioVar.f135528g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
