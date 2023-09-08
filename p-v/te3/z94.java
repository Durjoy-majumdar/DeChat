package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z94 extends C101820nt3 {

    /* renamed from: d */
    public String f145776d;

    /* renamed from: e */
    public String f145777e;

    /* renamed from: f */
    public String f145778f;

    /* renamed from: g */
    public String f145779g;

    /* renamed from: h */
    public int f145780h;

    /* renamed from: i */
    public int f145781i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z94)) {
            return false;
        }
        z94 z94 = (z94) aVar;
        return C46238a.m51546a(this.BaseRequest, z94.BaseRequest) && C46238a.m51546a(this.f145776d, z94.f145776d) && C46238a.m51546a(this.f145777e, z94.f145777e) && C46238a.m51546a(this.f145778f, z94.f145778f) && C46238a.m51546a(this.f145779g, z94.f145779g) && C46238a.m51546a(Integer.valueOf(this.f145780h), Integer.valueOf(z94.f145780h)) && C46238a.m51546a(Integer.valueOf(this.f145781i), Integer.valueOf(z94.f145781i));
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
            String str = this.f145776d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145777e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f145778f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f145779g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f145780h);
            aVar.mo74318e(7, this.f145781i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f145776d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f145777e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f145778f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f145779g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f145780h) + C52418a.m58678e(7, this.f145781i);
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
            z94 z94 = objArr[1];
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
                        z94.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    z94.f145776d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    z94.f145777e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    z94.f145778f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    z94.f145779g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    z94.f145780h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    z94.f145781i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
