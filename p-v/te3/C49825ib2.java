package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ib2 */
public class C49825ib2 extends C101820nt3 {

    /* renamed from: d */
    public boolean f135198d;

    /* renamed from: e */
    public String f135199e;

    /* renamed from: f */
    public String f135200f;

    /* renamed from: g */
    public String f135201g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49825ib2)) {
            return false;
        }
        C49825ib2 ib22 = (C49825ib2) aVar;
        return C46238a.m51546a(this.BaseRequest, ib22.BaseRequest) && C46238a.m51546a(Boolean.valueOf(this.f135198d), Boolean.valueOf(ib22.f135198d)) && C46238a.m51546a(this.f135199e, ib22.f135199e) && C46238a.m51546a(this.f135200f, ib22.f135200f) && C46238a.m51546a(this.f135201g, ib22.f135201g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135200f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74314a(2, this.f135198d);
                String str = this.f135199e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f135200f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f135201g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: appusername");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f135198d);
            String str4 = this.f135199e;
            if (str4 != null) {
                a += C52418a.m58683j(3, str4);
            }
            String str5 = this.f135200f;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f135201g;
            return str6 != null ? a + C52418a.m58683j(5, str6) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135200f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: appusername");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49825ib2 ib22 = objArr[1];
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
                    ib22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ib22.f135198d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                ib22.f135199e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ib22.f135200f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ib22.f135201g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
