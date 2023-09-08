package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pl2 */
public class C50846pl2 extends C101820nt3 {

    /* renamed from: d */
    public int f139822d;

    /* renamed from: e */
    public C51018qv3 f139823e;

    /* renamed from: f */
    public C51018qv3 f139824f;

    /* renamed from: g */
    public C51018qv3 f139825g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50846pl2)) {
            return false;
        }
        C50846pl2 pl22 = (C50846pl2) aVar;
        return C46238a.m51546a(this.BaseRequest, pl22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139822d), Integer.valueOf(pl22.f139822d)) && C46238a.m51546a(this.f139823e, pl22.f139823e) && C46238a.m51546a(this.f139824f, pl22.f139824f) && C46238a.m51546a(this.f139825g, pl22.f139825g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f139823e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139822d);
                C51018qv3 qv32 = this.f139823e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f139823e.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f139824f;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f139824f.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f139825g;
                if (qv34 != null) {
                    aVar.mo74322i(5, qv34.computeSize());
                    this.f139825g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: KVBuffer");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139822d);
            C51018qv3 qv35 = this.f139823e;
            if (qv35 != null) {
                e += C52418a.m58682i(3, qv35.computeSize());
            }
            C51018qv3 qv36 = this.f139824f;
            if (qv36 != null) {
                e += C52418a.m58682i(4, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f139825g;
            return qv37 != null ? e + C52418a.m58682i(5, qv37.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139823e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KVBuffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50846pl2 pl22 = objArr[1];
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
                    pl22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pl22.f139822d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv38 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv38.mo73348f(bArr2);
                    }
                    pl22.f139823e = qv38;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv39 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv39.mo73348f(bArr3);
                    }
                    pl22.f139824f = qv39;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C51018qv3 qv310 = new C51018qv3();
                    if (bArr4 != null && bArr4.length > 0) {
                        qv310.mo73348f(bArr4);
                    }
                    pl22.f139825g = qv310;
                }
                return 0;
            }
        }
    }
}
