package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ax3 */
public class C90403ax3 extends C101820nt3 {

    /* renamed from: d */
    public int f259419d;

    /* renamed from: e */
    public LinkedList<String> f259420e = new LinkedList<>();

    /* renamed from: f */
    public String f259421f;

    /* renamed from: g */
    public String f259422g;

    /* renamed from: h */
    public String f259423h;

    /* renamed from: i */
    public int f259424i;

    /* renamed from: j */
    public String f259425j;

    /* renamed from: n */
    public C89349b f259426n;

    /* renamed from: o */
    public C89349b f259427o;

    /* renamed from: p */
    public String f259428p;

    /* renamed from: q */
    public int f259429q;

    /* renamed from: r */
    public C89349b f259430r;

    /* renamed from: s */
    public boolean f259431s;

    /* renamed from: t */
    public boolean f259432t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90403ax3)) {
            return false;
        }
        C90403ax3 ax32 = (C90403ax3) aVar;
        return C46238a.m51546a(this.BaseRequest, ax32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f259419d), Integer.valueOf(ax32.f259419d)) && C46238a.m51546a(this.f259420e, ax32.f259420e) && C46238a.m51546a(this.f259421f, ax32.f259421f) && C46238a.m51546a(this.f259422g, ax32.f259422g) && C46238a.m51546a(this.f259423h, ax32.f259423h) && C46238a.m51546a(Integer.valueOf(this.f259424i), Integer.valueOf(ax32.f259424i)) && C46238a.m51546a(this.f259425j, ax32.f259425j) && C46238a.m51546a(this.f259426n, ax32.f259426n) && C46238a.m51546a(this.f259427o, ax32.f259427o) && C46238a.m51546a(this.f259428p, ax32.f259428p) && C46238a.m51546a(Integer.valueOf(this.f259429q), Integer.valueOf(ax32.f259429q)) && C46238a.m51546a(this.f259430r, ax32.f259430r) && C46238a.m51546a(Boolean.valueOf(this.f259431s), Boolean.valueOf(ax32.f259431s)) && C46238a.m51546a(Boolean.valueOf(this.f259432t), Boolean.valueOf(ax32.f259432t));
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
            aVar.mo74318e(3, this.f259419d);
            aVar.mo74320g(4, 1, this.f259420e);
            String str = this.f259421f;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f259422g;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f259423h;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f259424i);
            String str4 = this.f259425j;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            C89349b bVar = this.f259426n;
            if (bVar != null) {
                aVar.mo74315b(15, bVar);
            }
            C89349b bVar2 = this.f259427o;
            if (bVar2 != null) {
                aVar.mo74315b(16, bVar2);
            }
            String str5 = this.f259428p;
            if (str5 != null) {
                aVar.mo74323j(17, str5);
            }
            aVar.mo74318e(18, this.f259429q);
            C89349b bVar3 = this.f259430r;
            if (bVar3 != null) {
                aVar.mo74315b(19, bVar3);
            }
            aVar.mo74314a(20, this.f259431s);
            aVar.mo74314a(21, this.f259432t);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(3, this.f259419d) + C52418a.m58680g(4, 1, this.f259420e);
            String str6 = this.f259421f;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f259422g;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f259423h;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            int e2 = e + C52418a.m58678e(8, this.f259424i);
            String str9 = this.f259425j;
            if (str9 != null) {
                e2 += C52418a.m58683j(14, str9);
            }
            C89349b bVar4 = this.f259426n;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(15, bVar4);
            }
            C89349b bVar5 = this.f259427o;
            if (bVar5 != null) {
                e2 += C52418a.m58675b(16, bVar5);
            }
            String str10 = this.f259428p;
            if (str10 != null) {
                e2 += C52418a.m58683j(17, str10);
            }
            int e3 = e2 + C52418a.m58678e(18, this.f259429q);
            C89349b bVar6 = this.f259430r;
            if (bVar6 != null) {
                e3 += C52418a.m58675b(19, bVar6);
            }
            return e3 + C52418a.m58674a(20, this.f259431s) + C52418a.m58674a(21, this.f259432t);
        } else if (i2 == 2) {
            this.f259420e.clear();
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
            C90403ax3 ax32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                switch (intValue) {
                    case 3:
                        ax32.f259419d = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        ax32.f259420e.add(aVar3.mo141633k(intValue));
                        return 0;
                    case 5:
                        ax32.f259421f = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        ax32.f259422g = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        ax32.f259423h = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        ax32.f259424i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 14:
                                ax32.f259425j = aVar3.mo141633k(intValue);
                                return 0;
                            case 15:
                                ax32.f259426n = aVar3.mo141626d(intValue);
                                return 0;
                            case 16:
                                ax32.f259427o = aVar3.mo141626d(intValue);
                                return 0;
                            case 17:
                                ax32.f259428p = aVar3.mo141633k(intValue);
                                return 0;
                            case 18:
                                ax32.f259429q = aVar3.mo141629g(intValue);
                                return 0;
                            case 19:
                                ax32.f259430r = aVar3.mo141626d(intValue);
                                return 0;
                            case 20:
                                ax32.f259431s = aVar3.mo141625c(intValue);
                                return 0;
                            case 21:
                                ax32.f259432t = aVar3.mo141625c(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    ax32.BaseRequest = iaVar3;
                }
                return 0;
            }
        }
    }
}
