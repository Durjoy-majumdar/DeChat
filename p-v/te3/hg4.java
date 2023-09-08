package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hg4 extends C101820nt3 {

    /* renamed from: d */
    public long f183479d;

    /* renamed from: e */
    public int f183480e;

    /* renamed from: f */
    public String f183481f;

    /* renamed from: g */
    public String f183482g;

    /* renamed from: h */
    public String f183483h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hg4)) {
            return false;
        }
        hg4 hg4 = (hg4) aVar;
        return C46238a.m51546a(this.BaseRequest, hg4.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f183479d), Long.valueOf(hg4.f183479d)) && C46238a.m51546a(Integer.valueOf(this.f183480e), Integer.valueOf(hg4.f183480e)) && C46238a.m51546a(this.f183481f, hg4.f183481f) && C46238a.m51546a(this.f183482g, hg4.f183482g) && C46238a.m51546a(this.f183483h, hg4.f183483h);
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
            aVar.mo74321h(2, this.f183479d);
            aVar.mo74318e(3, this.f183480e);
            String str = this.f183481f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f183482g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f183483h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f183479d) + C52418a.m58678e(3, this.f183480e);
            String str4 = this.f183481f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f183482g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f183483h;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
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
            hg4 hg4 = objArr[1];
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
                        hg4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    hg4.f183479d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    hg4.f183480e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    hg4.f183481f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hg4.f183482g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hg4.f183483h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
