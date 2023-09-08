package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zi4 extends C101820nt3 {

    /* renamed from: d */
    public int f145984d;

    /* renamed from: e */
    public String f145985e;

    /* renamed from: f */
    public String f145986f;

    /* renamed from: g */
    public String f145987g;

    /* renamed from: h */
    public String f145988h;

    /* renamed from: i */
    public String f145989i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zi4)) {
            return false;
        }
        zi4 zi4 = (zi4) aVar;
        return C46238a.m51546a(this.BaseRequest, zi4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145984d), Integer.valueOf(zi4.f145984d)) && C46238a.m51546a(this.f145985e, zi4.f145985e) && C46238a.m51546a(this.f145986f, zi4.f145986f) && C46238a.m51546a(this.f145987g, zi4.f145987g) && C46238a.m51546a(this.f145988h, zi4.f145988h) && C46238a.m51546a(this.f145989i, zi4.f145989i);
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
            aVar.mo74318e(2, this.f145984d);
            String str = this.f145985e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f145986f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f145987g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f145988h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f145989i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145984d);
            String str6 = this.f145985e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f145986f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f145987g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f145988h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f145989i;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            zi4 zi4 = objArr[1];
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
                        zi4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zi4.f145984d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zi4.f145985e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zi4.f145986f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zi4.f145987g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zi4.f145988h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zi4.f145989i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
