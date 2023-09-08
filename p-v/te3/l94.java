package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class l94 extends C101820nt3 {

    /* renamed from: d */
    public String f137271d;

    /* renamed from: e */
    public String f137272e;

    /* renamed from: f */
    public String f137273f;

    /* renamed from: g */
    public String f137274g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof l94)) {
            return false;
        }
        l94 l94 = (l94) aVar;
        return C46238a.m51546a(this.BaseRequest, l94.BaseRequest) && C46238a.m51546a(this.f137271d, l94.f137271d) && C46238a.m51546a(this.f137272e, l94.f137272e) && C46238a.m51546a(this.f137273f, l94.f137273f) && C46238a.m51546a(this.f137274g, l94.f137274g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137271d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f137271d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f137272e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f137273f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f137274g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f137271d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f137272e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f137273f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f137274g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137271d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            l94 l94 = objArr[1];
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
                    l94.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l94.f137271d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                l94.f137272e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                l94.f137273f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                l94.f137274g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
