package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.th */
public class C118469th extends C101820nt3 {

    /* renamed from: d */
    public String f354449d;

    /* renamed from: e */
    public String f354450e;

    /* renamed from: f */
    public String f354451f;

    /* renamed from: g */
    public String f354452g;

    /* renamed from: h */
    public String f354453h;

    /* renamed from: i */
    public int f354454i;

    /* renamed from: j */
    public String f354455j;

    /* renamed from: n */
    public String f354456n;

    /* renamed from: o */
    public String f354457o;

    /* renamed from: p */
    public int f354458p;

    /* renamed from: q */
    public String f354459q;

    /* renamed from: r */
    public int f354460r;

    /* renamed from: s */
    public int f354461s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118469th)) {
            return false;
        }
        C118469th thVar = (C118469th) aVar;
        return C46238a.m51546a(this.BaseRequest, thVar.BaseRequest) && C46238a.m51546a(this.f354449d, thVar.f354449d) && C46238a.m51546a(this.f354450e, thVar.f354450e) && C46238a.m51546a(this.f354451f, thVar.f354451f) && C46238a.m51546a(this.f354452g, thVar.f354452g) && C46238a.m51546a(this.f354453h, thVar.f354453h) && C46238a.m51546a(Integer.valueOf(this.f354454i), Integer.valueOf(thVar.f354454i)) && C46238a.m51546a(this.f354455j, thVar.f354455j) && C46238a.m51546a(this.f354456n, thVar.f354456n) && C46238a.m51546a(this.f354457o, thVar.f354457o) && C46238a.m51546a(Integer.valueOf(this.f354458p), Integer.valueOf(thVar.f354458p)) && C46238a.m51546a(this.f354459q, thVar.f354459q) && C46238a.m51546a(Integer.valueOf(this.f354460r), Integer.valueOf(thVar.f354460r)) && C46238a.m51546a(Integer.valueOf(this.f354461s), Integer.valueOf(thVar.f354461s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f354449d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f354450e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f354451f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f354452g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f354453h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f354454i);
            String str6 = this.f354455j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f354456n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f354457o;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            aVar.mo74318e(11, this.f354458p);
            String str9 = this.f354459q;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            aVar.mo74318e(13, this.f354460r);
            aVar.mo74318e(14, this.f354461s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str10 = this.f354449d;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f354450e;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f354451f;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f354452g;
            if (str13 != null) {
                i3 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f354453h;
            if (str14 != null) {
                i3 += C52418a.m58683j(6, str14);
            }
            int e = i3 + C52418a.m58678e(7, this.f354454i);
            String str15 = this.f354455j;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f354456n;
            if (str16 != null) {
                e += C52418a.m58683j(9, str16);
            }
            String str17 = this.f354457o;
            if (str17 != null) {
                e += C52418a.m58683j(10, str17);
            }
            int e2 = e + C52418a.m58678e(11, this.f354458p);
            String str18 = this.f354459q;
            if (str18 != null) {
                e2 += C52418a.m58683j(12, str18);
            }
            return e2 + C52418a.m58678e(13, this.f354460r) + C52418a.m58678e(14, this.f354461s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118469th thVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        thVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    thVar.f354449d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    thVar.f354450e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    thVar.f354451f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    thVar.f354452g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    thVar.f354453h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    thVar.f354454i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    thVar.f354455j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    thVar.f354456n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    thVar.f354457o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    thVar.f354458p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    thVar.f354459q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    thVar.f354460r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    thVar.f354461s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
