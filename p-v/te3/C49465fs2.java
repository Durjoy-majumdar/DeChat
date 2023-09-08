package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fs2 */
public class C49465fs2 extends C101820nt3 {

    /* renamed from: d */
    public int f133668d;

    /* renamed from: e */
    public int f133669e;

    /* renamed from: f */
    public String f133670f;

    /* renamed from: g */
    public String f133671g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49465fs2)) {
            return false;
        }
        C49465fs2 fs22 = (C49465fs2) aVar;
        return C46238a.m51546a(this.BaseRequest, fs22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133668d), Integer.valueOf(fs22.f133668d)) && C46238a.m51546a(Integer.valueOf(this.f133669e), Integer.valueOf(fs22.f133669e)) && C46238a.m51546a(this.f133670f, fs22.f133670f) && C46238a.m51546a(this.f133671g, fs22.f133671g);
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
            aVar.mo74318e(2, this.f133668d);
            aVar.mo74318e(3, this.f133669e);
            String str = this.f133670f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f133671g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133668d) + C52418a.m58678e(3, this.f133669e);
            String str3 = this.f133670f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f133671g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C49465fs2 fs22 = objArr[1];
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
                    fs22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fs22.f133668d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                fs22.f133669e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                fs22.f133670f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fs22.f133671g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
