package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x94 extends C101820nt3 {

    /* renamed from: d */
    public String f144549d;

    /* renamed from: e */
    public String f144550e;

    /* renamed from: f */
    public String f144551f;

    /* renamed from: g */
    public String f144552g;

    /* renamed from: h */
    public int f144553h;

    /* renamed from: i */
    public int f144554i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x94)) {
            return false;
        }
        x94 x94 = (x94) aVar;
        return C46238a.m51546a(this.BaseRequest, x94.BaseRequest) && C46238a.m51546a(this.f144549d, x94.f144549d) && C46238a.m51546a(this.f144550e, x94.f144550e) && C46238a.m51546a(this.f144551f, x94.f144551f) && C46238a.m51546a(this.f144552g, x94.f144552g) && C46238a.m51546a(Integer.valueOf(this.f144553h), Integer.valueOf(x94.f144553h)) && C46238a.m51546a(Integer.valueOf(this.f144554i), Integer.valueOf(x94.f144554i));
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
            String str = this.f144549d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144550e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144551f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144552g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f144553h);
            aVar.mo74318e(7, this.f144554i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f144549d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f144550e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f144551f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f144552g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f144553h) + C52418a.m58678e(7, this.f144554i);
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
            x94 x94 = objArr[1];
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
                        x94.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    x94.f144549d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x94.f144550e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x94.f144551f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x94.f144552g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x94.f144553h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    x94.f144554i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
