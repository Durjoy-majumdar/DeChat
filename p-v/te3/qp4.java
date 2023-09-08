package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qp4 extends C101820nt3 {

    /* renamed from: d */
    public int f140449d;

    /* renamed from: e */
    public int f140450e;

    /* renamed from: f */
    public C77987qh2 f140451f;

    /* renamed from: g */
    public C77991rh2 f140452g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qp4)) {
            return false;
        }
        qp4 qp4 = (qp4) aVar;
        return C46238a.m51546a(this.BaseRequest, qp4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140449d), Integer.valueOf(qp4.f140449d)) && C46238a.m51546a(Integer.valueOf(this.f140450e), Integer.valueOf(qp4.f140450e)) && C46238a.m51546a(this.f140451f, qp4.f140451f) && C46238a.m51546a(this.f140452g, qp4.f140452g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f140449d);
            aVar.mo74318e(3, this.f140450e);
            C77987qh2 qh22 = this.f140451f;
            if (qh22 != null) {
                aVar.mo74322i(4, qh22.computeSize());
                this.f140451f.writeFields(aVar);
            }
            C77991rh2 rh22 = this.f140452g;
            if (rh22 != null) {
                aVar.mo74322i(5, rh22.computeSize());
                this.f140452g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140449d) + C52418a.m58678e(3, this.f140450e);
            C77987qh2 qh23 = this.f140451f;
            if (qh23 != null) {
                e += C52418a.m58682i(4, qh23.computeSize());
            }
            C77991rh2 rh23 = this.f140452g;
            return rh23 != null ? e + C52418a.m58682i(5, rh23.computeSize()) : e;
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
            qp4 qp4 = objArr[1];
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
                    qp4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qp4.f140449d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qp4.f140450e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77987qh2 qh24 = new C77987qh2();
                    if (bArr2 != null && bArr2.length > 0) {
                        qh24.parseFrom(bArr2);
                    }
                    qp4.f140451f = qh24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C77991rh2 rh24 = new C77991rh2();
                    if (bArr3 != null && bArr3.length > 0) {
                        rh24.parseFrom(bArr3);
                    }
                    qp4.f140452g = rh24;
                }
                return 0;
            }
        }
    }
}
