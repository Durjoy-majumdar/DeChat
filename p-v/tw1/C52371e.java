package tw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.e */
public class C52371e extends C101820nt3 {

    /* renamed from: d */
    public String f146367d;

    /* renamed from: e */
    public String f146368e;

    /* renamed from: f */
    public String f146369f;

    /* renamed from: g */
    public String f146370g;

    /* renamed from: h */
    public String f146371h;

    /* renamed from: i */
    public String f146372i;

    /* renamed from: j */
    public String f146373j;

    /* renamed from: n */
    public String f146374n;

    /* renamed from: o */
    public String f146375o;

    /* renamed from: p */
    public int f146376p;

    /* renamed from: q */
    public int f146377q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52371e)) {
            return false;
        }
        C52371e eVar = (C52371e) aVar;
        return C46238a.m51546a(this.BaseRequest, eVar.BaseRequest) && C46238a.m51546a(this.f146367d, eVar.f146367d) && C46238a.m51546a(this.f146368e, eVar.f146368e) && C46238a.m51546a(this.f146369f, eVar.f146369f) && C46238a.m51546a(this.f146370g, eVar.f146370g) && C46238a.m51546a(this.f146371h, eVar.f146371h) && C46238a.m51546a(this.f146372i, eVar.f146372i) && C46238a.m51546a(this.f146373j, eVar.f146373j) && C46238a.m51546a(this.f146374n, eVar.f146374n) && C46238a.m51546a(this.f146375o, eVar.f146375o) && C46238a.m51546a(Integer.valueOf(this.f146376p), Integer.valueOf(eVar.f146376p)) && C46238a.m51546a(Integer.valueOf(this.f146377q), Integer.valueOf(eVar.f146377q));
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
            String str = this.f146367d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146368e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f146369f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f146370g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f146371h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f146372i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f146373j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f146374n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f146375o;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            aVar.mo74318e(11, this.f146376p);
            aVar.mo74318e(12, this.f146377q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str10 = this.f146367d;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f146368e;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f146369f;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f146370g;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f146371h;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f146372i;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f146373j;
            if (str16 != null) {
                i2 += C52418a.m58683j(8, str16);
            }
            String str17 = this.f146374n;
            if (str17 != null) {
                i2 += C52418a.m58683j(9, str17);
            }
            String str18 = this.f146375o;
            if (str18 != null) {
                i2 += C52418a.m58683j(10, str18);
            }
            return i2 + C52418a.m58678e(11, this.f146376p) + C52418a.m58678e(12, this.f146377q);
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
            C52371e eVar = objArr[1];
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
                        eVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    eVar.f146367d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eVar.f146368e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eVar.f146369f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eVar.f146370g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eVar.f146371h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eVar.f146372i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    eVar.f146373j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    eVar.f146374n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    eVar.f146375o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    eVar.f146376p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    eVar.f146377q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
