package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o34 */
public class C50632o34 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f138938d;

    /* renamed from: e */
    public int f138939e;

    /* renamed from: f */
    public C51018qv3 f138940f;

    /* renamed from: g */
    public C51018qv3 f138941g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50632o34)) {
            return false;
        }
        C50632o34 o342 = (C50632o34) aVar;
        return C46238a.m51546a(this.BaseRequest, o342.BaseRequest) && C46238a.m51546a(this.f138938d, o342.f138938d) && C46238a.m51546a(Integer.valueOf(this.f138939e), Integer.valueOf(o342.f138939e)) && C46238a.m51546a(this.f138940f, o342.f138940f) && C46238a.m51546a(this.f138941g, o342.f138941g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138938d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f138938d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f138938d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f138939e);
                C51018qv3 qv33 = this.f138940f;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f138940f.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f138941g;
                if (qv34 != null) {
                    aVar.mo74322i(5, qv34.computeSize());
                    this.f138941g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv35 = this.f138938d;
            if (qv35 != null) {
                i2 += C52418a.m58682i(2, qv35.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f138939e);
            C51018qv3 qv36 = this.f138940f;
            if (qv36 != null) {
                e += C52418a.m58682i(4, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f138941g;
            return qv37 != null ? e + C52418a.m58682i(5, qv37.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138938d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50632o34 o342 = objArr[1];
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
                    o342.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv38 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv38.mo73348f(bArr2);
                    }
                    o342.f138938d = qv38;
                }
                return 0;
            } else if (intValue == 3) {
                o342.f138939e = aVar3.mo141629g(intValue);
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
                    o342.f138940f = qv39;
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
                    o342.f138941g = qv310;
                }
                return 0;
            }
        }
    }
}
