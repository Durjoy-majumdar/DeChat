package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fd4 extends C101820nt3 {

    /* renamed from: d */
    public String f133438d;

    /* renamed from: e */
    public String f133439e;

    /* renamed from: f */
    public String f133440f;

    /* renamed from: g */
    public String f133441g;

    /* renamed from: h */
    public String f133442h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fd4)) {
            return false;
        }
        fd4 fd4 = (fd4) aVar;
        return C46238a.m51546a(this.BaseRequest, fd4.BaseRequest) && C46238a.m51546a(this.f133438d, fd4.f133438d) && C46238a.m51546a(this.f133439e, fd4.f133439e) && C46238a.m51546a(this.f133440f, fd4.f133440f) && C46238a.m51546a(this.f133441g, fd4.f133441g) && C46238a.m51546a(this.f133442h, fd4.f133442h);
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
            String str = this.f133438d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133439e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f133440f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f133441g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f133442h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f133438d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f133439e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f133440f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f133441g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f133442h;
            return str10 != null ? i2 + C52418a.m58683j(6, str10) : i2;
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
            fd4 fd4 = objArr[1];
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
                        fd4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fd4.f133438d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fd4.f133439e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fd4.f133440f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fd4.f133441g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fd4.f133442h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
