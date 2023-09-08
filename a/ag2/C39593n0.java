package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C51018qv3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.n0 */
public class C39593n0 extends C101820nt3 {

    /* renamed from: d */
    public String f106271d;

    /* renamed from: e */
    public int f106272e;

    /* renamed from: f */
    public int f106273f;

    /* renamed from: g */
    public int f106274g;

    /* renamed from: h */
    public C51018qv3 f106275h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39593n0)) {
            return false;
        }
        C39593n0 n0Var = (C39593n0) aVar;
        return C46238a.m51546a(this.BaseRequest, n0Var.BaseRequest) && C46238a.m51546a(this.f106271d, n0Var.f106271d) && C46238a.m51546a(Integer.valueOf(this.f106272e), Integer.valueOf(n0Var.f106272e)) && C46238a.m51546a(Integer.valueOf(this.f106273f), Integer.valueOf(n0Var.f106273f)) && C46238a.m51546a(Integer.valueOf(this.f106274g), Integer.valueOf(n0Var.f106274g)) && C46238a.m51546a(this.f106275h, n0Var.f106275h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f106275h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f106271d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f106272e);
                aVar.mo74318e(4, this.f106273f);
                aVar.mo74318e(5, this.f106274g);
                C51018qv3 qv32 = this.f106275h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f106275h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f106271d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f106272e) + C52418a.m58678e(4, this.f106273f) + C52418a.m58678e(5, this.f106274g);
            C51018qv3 qv33 = this.f106275h;
            return qv33 != null ? e + C52418a.m58682i(6, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f106275h != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C39593n0 n0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        n0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n0Var.f106271d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    n0Var.f106272e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n0Var.f106273f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n0Var.f106274g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        n0Var.f106275h = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
