package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h02 */
public class C49635h02 extends C101820nt3 {

    /* renamed from: d */
    public int f134385d;

    /* renamed from: e */
    public String f134386e;

    /* renamed from: f */
    public String f134387f;

    /* renamed from: g */
    public int f134388g;

    /* renamed from: h */
    public C89349b f134389h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49635h02)) {
            return false;
        }
        C49635h02 h022 = (C49635h02) aVar;
        return C46238a.m51546a(this.BaseRequest, h022.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f134385d), Integer.valueOf(h022.f134385d)) && C46238a.m51546a(this.f134386e, h022.f134386e) && C46238a.m51546a(this.f134387f, h022.f134387f) && C46238a.m51546a(Integer.valueOf(this.f134388g), Integer.valueOf(h022.f134388g)) && C46238a.m51546a(this.f134389h, h022.f134389h);
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
            aVar.mo74318e(2, this.f134385d);
            String str = this.f134386e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134387f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f134388g);
            C89349b bVar = this.f134389h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134385d);
            String str3 = this.f134386e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134387f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            int e2 = e + C52418a.m58678e(5, this.f134388g);
            C89349b bVar2 = this.f134389h;
            return bVar2 != null ? e2 + C52418a.m58675b(6, bVar2) : e2;
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
            C49635h02 h022 = objArr[1];
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
                        h022.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    h022.f134385d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    h022.f134386e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    h022.f134387f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    h022.f134388g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    h022.f134389h = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
