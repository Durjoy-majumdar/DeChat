package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pj */
public class C50836pj extends C101820nt3 {

    /* renamed from: d */
    public String f139777d;

    /* renamed from: e */
    public String f139778e;

    /* renamed from: f */
    public String f139779f;

    /* renamed from: g */
    public int f139780g;

    /* renamed from: h */
    public C89349b f139781h;

    /* renamed from: i */
    public String f139782i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50836pj)) {
            return false;
        }
        C50836pj pjVar = (C50836pj) aVar;
        return C46238a.m51546a(this.BaseRequest, pjVar.BaseRequest) && C46238a.m51546a(this.f139777d, pjVar.f139777d) && C46238a.m51546a(this.f139778e, pjVar.f139778e) && C46238a.m51546a(this.f139779f, pjVar.f139779f) && C46238a.m51546a(Integer.valueOf(this.f139780g), Integer.valueOf(pjVar.f139780g)) && C46238a.m51546a(this.f139781h, pjVar.f139781h) && C46238a.m51546a(this.f139782i, pjVar.f139782i);
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
            String str = this.f139777d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139778e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139779f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f139780g);
            C89349b bVar = this.f139781h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str4 = this.f139782i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f139777d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f139778e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f139779f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int e = i2 + C52418a.m58678e(5, this.f139780g);
            C89349b bVar2 = this.f139781h;
            if (bVar2 != null) {
                e += C52418a.m58675b(6, bVar2);
            }
            String str8 = this.f139782i;
            return str8 != null ? e + C52418a.m58683j(7, str8) : e;
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
            C50836pj pjVar = objArr[1];
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
                        pjVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pjVar.f139777d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pjVar.f139778e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pjVar.f139779f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pjVar.f139780g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pjVar.f139781h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    pjVar.f139782i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
