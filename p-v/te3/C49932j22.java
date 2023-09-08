package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j22 */
public class C49932j22 extends C101820nt3 {

    /* renamed from: d */
    public String f135825d;

    /* renamed from: e */
    public String f135826e;

    /* renamed from: f */
    public C77905b4 f135827f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49932j22)) {
            return false;
        }
        C49932j22 j222 = (C49932j22) aVar;
        return C46238a.m51546a(this.BaseRequest, j222.BaseRequest) && C46238a.m51546a(this.f135825d, j222.f135825d) && C46238a.m51546a(this.f135826e, j222.f135826e) && C46238a.m51546a(this.f135827f, j222.f135827f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135827f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f135825d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f135826e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                C77905b4 b4Var = this.f135827f;
                if (b4Var != null) {
                    aVar.mo74322i(4, b4Var.computeSize());
                    this.f135827f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Address");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f135825d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f135826e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C77905b4 b4Var2 = this.f135827f;
            return b4Var2 != null ? i2 + C52418a.m58682i(4, b4Var2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135827f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Address");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49932j22 j222 = objArr[1];
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
                    j222.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                j222.f135825d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                j222.f135826e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77905b4 b4Var3 = new C77905b4();
                    if (bArr2 != null && bArr2.length > 0) {
                        b4Var3.parseFrom(bArr2);
                    }
                    j222.f135827f = b4Var3;
                }
                return 0;
            }
        }
    }
}
