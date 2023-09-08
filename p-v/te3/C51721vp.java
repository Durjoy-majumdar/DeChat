package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vp */
public class C51721vp extends C101820nt3 {

    /* renamed from: d */
    public String f143607d;

    /* renamed from: e */
    public String f143608e;

    /* renamed from: f */
    public String f143609f;

    /* renamed from: g */
    public boolean f143610g;

    /* renamed from: h */
    public String f143611h;

    /* renamed from: i */
    public int f143612i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51721vp)) {
            return false;
        }
        C51721vp vpVar = (C51721vp) aVar;
        return C46238a.m51546a(this.BaseRequest, vpVar.BaseRequest) && C46238a.m51546a(this.f143607d, vpVar.f143607d) && C46238a.m51546a(this.f143608e, vpVar.f143608e) && C46238a.m51546a(this.f143609f, vpVar.f143609f) && C46238a.m51546a(Boolean.valueOf(this.f143610g), Boolean.valueOf(vpVar.f143610g)) && C46238a.m51546a(this.f143611h, vpVar.f143611h) && C46238a.m51546a(Integer.valueOf(this.f143612i), Integer.valueOf(vpVar.f143612i));
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
            String str = this.f143607d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143608e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143609f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74314a(5, this.f143610g);
            String str4 = this.f143611h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f143612i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f143607d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143608e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f143609f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int a = i2 + C52418a.m58674a(5, this.f143610g);
            String str8 = this.f143611h;
            if (str8 != null) {
                a += C52418a.m58683j(6, str8);
            }
            return a + C52418a.m58678e(7, this.f143612i);
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
            C51721vp vpVar = objArr[1];
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
                        vpVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vpVar.f143607d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vpVar.f143608e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vpVar.f143609f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vpVar.f143610g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    vpVar.f143611h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vpVar.f143612i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
