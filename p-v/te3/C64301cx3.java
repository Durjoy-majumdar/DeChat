package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cx3 */
public class C64301cx3 extends C101820nt3 {

    /* renamed from: d */
    public String f182603d;

    /* renamed from: e */
    public String f182604e;

    /* renamed from: f */
    public String f182605f;

    /* renamed from: g */
    public String f182606g;

    /* renamed from: h */
    public String f182607h;

    /* renamed from: i */
    public String f182608i;

    /* renamed from: j */
    public String f182609j;

    /* renamed from: n */
    public C89349b f182610n;

    /* renamed from: o */
    public String f182611o;

    /* renamed from: p */
    public int f182612p;

    /* renamed from: q */
    public boolean f182613q;

    /* renamed from: r */
    public C89349b f182614r;

    /* renamed from: s */
    public boolean f182615s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64301cx3)) {
            return false;
        }
        C64301cx3 cx32 = (C64301cx3) aVar;
        return C46238a.m51546a(this.BaseRequest, cx32.BaseRequest) && C46238a.m51546a(this.f182603d, cx32.f182603d) && C46238a.m51546a(this.f182604e, cx32.f182604e) && C46238a.m51546a(this.f182605f, cx32.f182605f) && C46238a.m51546a(this.f182606g, cx32.f182606g) && C46238a.m51546a(this.f182607h, cx32.f182607h) && C46238a.m51546a(this.f182608i, cx32.f182608i) && C46238a.m51546a(this.f182609j, cx32.f182609j) && C46238a.m51546a(this.f182610n, cx32.f182610n) && C46238a.m51546a(this.f182611o, cx32.f182611o) && C46238a.m51546a(Integer.valueOf(this.f182612p), Integer.valueOf(cx32.f182612p)) && C46238a.m51546a(Boolean.valueOf(this.f182613q), Boolean.valueOf(cx32.f182613q)) && C46238a.m51546a(this.f182614r, cx32.f182614r) && C46238a.m51546a(Boolean.valueOf(this.f182615s), Boolean.valueOf(cx32.f182615s));
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
            String str = this.f182603d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182604e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182605f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f182606g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f182607h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f182608i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f182609j;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            C89349b bVar = this.f182610n;
            if (bVar != null) {
                aVar.mo74315b(14, bVar);
            }
            String str8 = this.f182611o;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            aVar.mo74318e(16, this.f182612p);
            aVar.mo74314a(17, this.f182613q);
            C89349b bVar2 = this.f182614r;
            if (bVar2 != null) {
                aVar.mo74315b(18, bVar2);
            }
            aVar.mo74314a(19, this.f182615s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str9 = this.f182603d;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f182604e;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f182605f;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f182606g;
            if (str12 != null) {
                i3 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f182607h;
            if (str13 != null) {
                i3 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f182608i;
            if (str14 != null) {
                i3 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f182609j;
            if (str15 != null) {
                i3 += C52418a.m58683j(13, str15);
            }
            C89349b bVar3 = this.f182610n;
            if (bVar3 != null) {
                i3 += C52418a.m58675b(14, bVar3);
            }
            String str16 = this.f182611o;
            if (str16 != null) {
                i3 += C52418a.m58683j(15, str16);
            }
            int e = i3 + C52418a.m58678e(16, this.f182612p) + C52418a.m58674a(17, this.f182613q);
            C89349b bVar4 = this.f182614r;
            if (bVar4 != null) {
                e += C52418a.m58675b(18, bVar4);
            }
            return e + C52418a.m58674a(19, this.f182615s);
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
            C64301cx3 cx32 = objArr[1];
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
                        cx32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cx32.f182603d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cx32.f182604e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cx32.f182605f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cx32.f182606g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cx32.f182607h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cx32.f182608i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 13:
                            cx32.f182609j = aVar3.mo141633k(intValue);
                            return 0;
                        case 14:
                            cx32.f182610n = aVar3.mo141626d(intValue);
                            return 0;
                        case 15:
                            cx32.f182611o = aVar3.mo141633k(intValue);
                            return 0;
                        case 16:
                            cx32.f182612p = aVar3.mo141629g(intValue);
                            return 0;
                        case 17:
                            cx32.f182613q = aVar3.mo141625c(intValue);
                            return 0;
                        case 18:
                            cx32.f182614r = aVar3.mo141626d(intValue);
                            return 0;
                        case 19:
                            cx32.f182615s = aVar3.mo141625c(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
