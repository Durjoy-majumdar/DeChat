package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gq */
public class C49594gq extends C101820nt3 {

    /* renamed from: d */
    public String f134191d;

    /* renamed from: e */
    public String f134192e;

    /* renamed from: f */
    public String f134193f;

    /* renamed from: g */
    public int f134194g;

    /* renamed from: h */
    public String f134195h;

    /* renamed from: i */
    public String f134196i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49594gq)) {
            return false;
        }
        C49594gq gqVar = (C49594gq) aVar;
        return C46238a.m51546a(this.BaseRequest, gqVar.BaseRequest) && C46238a.m51546a(this.f134191d, gqVar.f134191d) && C46238a.m51546a(this.f134192e, gqVar.f134192e) && C46238a.m51546a(this.f134193f, gqVar.f134193f) && C46238a.m51546a(Integer.valueOf(this.f134194g), Integer.valueOf(gqVar.f134194g)) && C46238a.m51546a(this.f134195h, gqVar.f134195h) && C46238a.m51546a(this.f134196i, gqVar.f134196i);
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
            String str = this.f134191d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f134192e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f134193f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f134194g);
            String str4 = this.f134195h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f134196i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f134191d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f134192e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f134193f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int e = i2 + C52418a.m58678e(5, this.f134194g);
            String str9 = this.f134195h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f134196i;
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
            C49594gq gqVar = objArr[1];
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
                        gqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gqVar.f134191d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gqVar.f134192e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gqVar.f134193f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gqVar.f134194g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gqVar.f134195h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gqVar.f134196i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
