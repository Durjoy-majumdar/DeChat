package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lp */
public class C50293lp extends C101820nt3 {

    /* renamed from: d */
    public int f137555d;

    /* renamed from: e */
    public C89349b f137556e;

    /* renamed from: f */
    public C89349b f137557f;

    /* renamed from: g */
    public String f137558g;

    /* renamed from: h */
    public int f137559h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50293lp)) {
            return false;
        }
        C50293lp lpVar = (C50293lp) aVar;
        return C46238a.m51546a(this.BaseRequest, lpVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f137555d), Integer.valueOf(lpVar.f137555d)) && C46238a.m51546a(this.f137556e, lpVar.f137556e) && C46238a.m51546a(this.f137557f, lpVar.f137557f) && C46238a.m51546a(this.f137558g, lpVar.f137558g) && C46238a.m51546a(Integer.valueOf(this.f137559h), Integer.valueOf(lpVar.f137559h));
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
            aVar.mo74318e(2, this.f137555d);
            C89349b bVar = this.f137556e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C89349b bVar2 = this.f137557f;
            if (bVar2 != null) {
                aVar.mo74315b(4, bVar2);
            }
            String str = this.f137558g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f137559h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137555d);
            C89349b bVar3 = this.f137556e;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            C89349b bVar4 = this.f137557f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            String str2 = this.f137558g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58678e(6, this.f137559h);
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
            C50293lp lpVar = objArr[1];
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
                        lpVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    lpVar.f137555d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lpVar.f137556e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    lpVar.f137557f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    lpVar.f137558g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lpVar.f137559h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
