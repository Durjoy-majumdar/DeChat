package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q43 */
public class C50914q43 extends C101820nt3 {

    /* renamed from: d */
    public String f140131d;

    /* renamed from: e */
    public String f140132e;

    /* renamed from: f */
    public int f140133f;

    /* renamed from: g */
    public int f140134g;

    /* renamed from: h */
    public int f140135h;

    /* renamed from: i */
    public String f140136i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50914q43)) {
            return false;
        }
        C50914q43 q432 = (C50914q43) aVar;
        return C46238a.m51546a(this.BaseRequest, q432.BaseRequest) && C46238a.m51546a(this.f140131d, q432.f140131d) && C46238a.m51546a(this.f140132e, q432.f140132e) && C46238a.m51546a(Integer.valueOf(this.f140133f), Integer.valueOf(q432.f140133f)) && C46238a.m51546a(Integer.valueOf(this.f140134g), Integer.valueOf(q432.f140134g)) && C46238a.m51546a(Integer.valueOf(this.f140135h), Integer.valueOf(q432.f140135h)) && C46238a.m51546a(this.f140136i, q432.f140136i);
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
            String str = this.f140131d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140132e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f140133f);
            aVar.mo74318e(5, this.f140134g);
            aVar.mo74318e(6, this.f140135h);
            String str3 = this.f140136i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f140131d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f140132e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f140133f) + C52418a.m58678e(5, this.f140134g) + C52418a.m58678e(6, this.f140135h);
            String str6 = this.f140136i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
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
            C50914q43 q432 = objArr[1];
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
                        q432.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    q432.f140131d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q432.f140132e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q432.f140133f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    q432.f140134g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    q432.f140135h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    q432.f140136i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
