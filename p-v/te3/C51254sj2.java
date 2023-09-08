package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sj2 */
public class C51254sj2 extends C101820nt3 {

    /* renamed from: d */
    public int f141558d;

    /* renamed from: e */
    public String f141559e;

    /* renamed from: f */
    public String f141560f;

    /* renamed from: g */
    public String f141561g;

    /* renamed from: h */
    public int f141562h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51254sj2)) {
            return false;
        }
        C51254sj2 sj22 = (C51254sj2) aVar;
        return C46238a.m51546a(this.BaseRequest, sj22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141558d), Integer.valueOf(sj22.f141558d)) && C46238a.m51546a(this.f141559e, sj22.f141559e) && C46238a.m51546a(this.f141560f, sj22.f141560f) && C46238a.m51546a(this.f141561g, sj22.f141561g) && C46238a.m51546a(Integer.valueOf(this.f141562h), Integer.valueOf(sj22.f141562h));
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
            aVar.mo74318e(2, this.f141558d);
            String str = this.f141559e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f141560f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f141561g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f141562h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141558d);
            String str4 = this.f141559e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f141560f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f141561g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f141562h);
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
            C51254sj2 sj22 = objArr[1];
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
                        sj22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    sj22.f141558d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sj22.f141559e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sj22.f141560f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sj22.f141561g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sj22.f141562h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
