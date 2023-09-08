package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i83 */
public class C49814i83 extends C101820nt3 {

    /* renamed from: d */
    public int f135169d;

    /* renamed from: e */
    public String f135170e;

    /* renamed from: f */
    public String f135171f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49814i83)) {
            return false;
        }
        C49814i83 i832 = (C49814i83) aVar;
        return C46238a.m51546a(this.BaseRequest, i832.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135169d), Integer.valueOf(i832.f135169d)) && C46238a.m51546a(this.f135170e, i832.f135170e) && C46238a.m51546a(this.f135171f, i832.f135171f);
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
            aVar.mo74318e(2, this.f135169d);
            String str = this.f135170e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135171f;
            if (str2 != null) {
                aVar.mo74323j(100, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135169d);
            String str3 = this.f135170e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f135171f;
            return str4 != null ? e + C52418a.m58683j(100, str4) : e;
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
            C49814i83 i832 = objArr[1];
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
                    i832.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                i832.f135169d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                i832.f135170e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                i832.f135171f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
