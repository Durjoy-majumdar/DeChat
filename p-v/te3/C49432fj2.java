package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fj2 */
public class C49432fj2 extends C101820nt3 {

    /* renamed from: d */
    public String f133537d;

    /* renamed from: e */
    public String f133538e;

    /* renamed from: f */
    public String f133539f;

    /* renamed from: g */
    public String f133540g;

    /* renamed from: h */
    public String f133541h;

    /* renamed from: i */
    public String f133542i;

    /* renamed from: j */
    public String f133543j;

    /* renamed from: n */
    public C89349b f133544n;

    /* renamed from: o */
    public int f133545o;

    /* renamed from: p */
    public String f133546p;

    /* renamed from: q */
    public String f133547q;

    /* renamed from: r */
    public int f133548r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49432fj2)) {
            return false;
        }
        C49432fj2 fj22 = (C49432fj2) aVar;
        return C46238a.m51546a(this.BaseRequest, fj22.BaseRequest) && C46238a.m51546a(this.f133537d, fj22.f133537d) && C46238a.m51546a(this.f133538e, fj22.f133538e) && C46238a.m51546a(this.f133539f, fj22.f133539f) && C46238a.m51546a(this.f133540g, fj22.f133540g) && C46238a.m51546a(this.f133541h, fj22.f133541h) && C46238a.m51546a(this.f133542i, fj22.f133542i) && C46238a.m51546a(this.f133543j, fj22.f133543j) && C46238a.m51546a(this.f133544n, fj22.f133544n) && C46238a.m51546a(Integer.valueOf(this.f133545o), Integer.valueOf(fj22.f133545o)) && C46238a.m51546a(this.f133546p, fj22.f133546p) && C46238a.m51546a(this.f133547q, fj22.f133547q) && C46238a.m51546a(Integer.valueOf(this.f133548r), Integer.valueOf(fj22.f133548r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f133537d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133538e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f133539f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f133540g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f133541h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f133542i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f133543j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            C89349b bVar = this.f133544n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            aVar.mo74318e(10, this.f133545o);
            String str8 = this.f133546p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f133547q;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            aVar.mo74318e(13, this.f133548r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str10 = this.f133537d;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f133538e;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f133539f;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f133540g;
            if (str13 != null) {
                i3 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f133541h;
            if (str14 != null) {
                i3 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f133542i;
            if (str15 != null) {
                i3 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f133543j;
            if (str16 != null) {
                i3 += C52418a.m58683j(8, str16);
            }
            C89349b bVar2 = this.f133544n;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(9, bVar2);
            }
            int e = i3 + C52418a.m58678e(10, this.f133545o);
            String str17 = this.f133546p;
            if (str17 != null) {
                e += C52418a.m58683j(11, str17);
            }
            String str18 = this.f133547q;
            if (str18 != null) {
                e += C52418a.m58683j(12, str18);
            }
            return e + C52418a.m58678e(13, this.f133548r);
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
            C49432fj2 fj22 = objArr[1];
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
                        fj22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fj22.f133537d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fj22.f133538e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fj22.f133539f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fj22.f133540g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fj22.f133541h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fj22.f133542i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fj22.f133543j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    fj22.f133544n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    fj22.f133545o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    fj22.f133546p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    fj22.f133547q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    fj22.f133548r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
