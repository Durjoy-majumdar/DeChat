package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dd3 */
public class C49130dd3 extends C101820nt3 {

    /* renamed from: d */
    public int f132255d;

    /* renamed from: e */
    public int f132256e;

    /* renamed from: f */
    public C51018qv3 f132257f;

    /* renamed from: g */
    public C51018qv3 f132258g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49130dd3)) {
            return false;
        }
        C49130dd3 dd32 = (C49130dd3) aVar;
        return C46238a.m51546a(this.BaseRequest, dd32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132255d), Integer.valueOf(dd32.f132255d)) && C46238a.m51546a(Integer.valueOf(this.f132256e), Integer.valueOf(dd32.f132256e)) && C46238a.m51546a(this.f132257f, dd32.f132257f) && C46238a.m51546a(this.f132258g, dd32.f132258g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132257f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f132255d);
                aVar.mo74318e(3, this.f132256e);
                C51018qv3 qv32 = this.f132257f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f132257f.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f132258g;
                if (qv33 != null) {
                    aVar.mo74322i(5, qv33.computeSize());
                    this.f132258g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132255d) + C52418a.m58678e(3, this.f132256e);
            C51018qv3 qv34 = this.f132257f;
            if (qv34 != null) {
                e += C52418a.m58682i(4, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f132258g;
            return qv35 != null ? e + C52418a.m58682i(5, qv35.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132257f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49130dd3 dd32 = objArr[1];
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
                    dd32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dd32.f132255d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                dd32.f132256e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv36.mo73348f(bArr2);
                    }
                    dd32.f132257f = qv36;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv37.mo73348f(bArr3);
                    }
                    dd32.f132258g = qv37;
                }
                return 0;
            }
        }
    }
}
