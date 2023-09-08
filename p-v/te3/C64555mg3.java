package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mg3 */
public class C64555mg3 extends C101820nt3 {

    /* renamed from: d */
    public String f184317d;

    /* renamed from: e */
    public String f184318e;

    /* renamed from: f */
    public int f184319f;

    /* renamed from: g */
    public String f184320g;

    /* renamed from: h */
    public int f184321h;

    /* renamed from: i */
    public boolean f184322i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64555mg3)) {
            return false;
        }
        C64555mg3 mg32 = (C64555mg3) aVar;
        return C46238a.m51546a(this.BaseRequest, mg32.BaseRequest) && C46238a.m51546a(this.f184317d, mg32.f184317d) && C46238a.m51546a(this.f184318e, mg32.f184318e) && C46238a.m51546a(Integer.valueOf(this.f184319f), Integer.valueOf(mg32.f184319f)) && C46238a.m51546a(this.f184320g, mg32.f184320g) && C46238a.m51546a(Integer.valueOf(this.f184321h), Integer.valueOf(mg32.f184321h)) && C46238a.m51546a(Boolean.valueOf(this.f184322i), Boolean.valueOf(mg32.f184322i));
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
            String str = this.f184317d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184318e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f184319f);
            String str3 = this.f184320g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f184321h);
            aVar.mo74314a(7, this.f184322i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f184317d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f184318e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f184319f);
            String str6 = this.f184320g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f184321h) + C52418a.m58674a(7, this.f184322i);
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
            C64555mg3 mg32 = objArr[1];
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
                        mg32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mg32.f184317d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mg32.f184318e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mg32.f184319f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mg32.f184320g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mg32.f184321h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mg32.f184322i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
