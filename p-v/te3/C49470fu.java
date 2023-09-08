package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fu */
public class C49470fu extends C101820nt3 {

    /* renamed from: d */
    public String f133681d;

    /* renamed from: e */
    public String f133682e;

    /* renamed from: f */
    public String f133683f;

    /* renamed from: g */
    public int f133684g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49470fu)) {
            return false;
        }
        C49470fu fuVar = (C49470fu) aVar;
        return C46238a.m51546a(this.BaseRequest, fuVar.BaseRequest) && C46238a.m51546a(this.f133681d, fuVar.f133681d) && C46238a.m51546a(this.f133682e, fuVar.f133682e) && C46238a.m51546a(this.f133683f, fuVar.f133683f) && C46238a.m51546a(Integer.valueOf(this.f133684g), Integer.valueOf(fuVar.f133684g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133681d == null) {
                throw new C52419b("Not all required fields were included: fileid");
            } else if (this.f133682e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f133681d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133682e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f133683f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f133684g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: md5");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f133681d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f133682e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f133683f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            return i2 + C52418a.m58678e(5, this.f133684g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133681d == null) {
                throw new C52419b("Not all required fields were included: fileid");
            } else if (this.f133682e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: md5");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49470fu fuVar = objArr[1];
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
                    fuVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fuVar.f133681d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fuVar.f133682e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                fuVar.f133683f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fuVar.f133684g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
