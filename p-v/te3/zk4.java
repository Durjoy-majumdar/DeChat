package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zk4 extends C101820nt3 {

    /* renamed from: d */
    public String f146055d;

    /* renamed from: e */
    public String f146056e;

    /* renamed from: f */
    public String f146057f;

    /* renamed from: g */
    public int f146058g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zk4)) {
            return false;
        }
        zk4 zk4 = (zk4) aVar;
        return C46238a.m51546a(this.BaseRequest, zk4.BaseRequest) && C46238a.m51546a(this.f146055d, zk4.f146055d) && C46238a.m51546a(this.f146056e, zk4.f146056e) && C46238a.m51546a(this.f146057f, zk4.f146057f) && C46238a.m51546a(Integer.valueOf(this.f146058g), Integer.valueOf(zk4.f146058g));
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
            String str = this.f146055d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146056e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f146057f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f146058g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f146055d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f146056e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f146057f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            return i2 + C52418a.m58678e(5, this.f146058g);
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
            zk4 zk4 = objArr[1];
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
                    zk4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zk4.f146055d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zk4.f146056e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                zk4.f146057f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zk4.f146058g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
