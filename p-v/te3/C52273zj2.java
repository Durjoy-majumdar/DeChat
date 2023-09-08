package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zj2 */
public class C52273zj2 extends C101820nt3 {

    /* renamed from: d */
    public String f146027d;

    /* renamed from: e */
    public String f146028e;

    /* renamed from: f */
    public String f146029f;

    /* renamed from: g */
    public String f146030g;

    /* renamed from: h */
    public String f146031h;

    /* renamed from: i */
    public String f146032i;

    /* renamed from: j */
    public String f146033j;

    /* renamed from: n */
    public C89349b f146034n;

    /* renamed from: o */
    public int f146035o;

    /* renamed from: p */
    public LinkedList<C50696ok2> f146036p = new LinkedList<>();

    /* renamed from: q */
    public String f146037q;

    /* renamed from: r */
    public int f146038r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52273zj2)) {
            return false;
        }
        C52273zj2 zj22 = (C52273zj2) aVar;
        return C46238a.m51546a(this.BaseRequest, zj22.BaseRequest) && C46238a.m51546a(this.f146027d, zj22.f146027d) && C46238a.m51546a(this.f146028e, zj22.f146028e) && C46238a.m51546a(this.f146029f, zj22.f146029f) && C46238a.m51546a(this.f146030g, zj22.f146030g) && C46238a.m51546a(this.f146031h, zj22.f146031h) && C46238a.m51546a(this.f146032i, zj22.f146032i) && C46238a.m51546a(this.f146033j, zj22.f146033j) && C46238a.m51546a(this.f146034n, zj22.f146034n) && C46238a.m51546a(Integer.valueOf(this.f146035o), Integer.valueOf(zj22.f146035o)) && C46238a.m51546a(this.f146036p, zj22.f146036p) && C46238a.m51546a(this.f146037q, zj22.f146037q) && C46238a.m51546a(Integer.valueOf(this.f146038r), Integer.valueOf(zj22.f146038r));
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
            String str = this.f146027d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146028e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f146029f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f146030g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f146031h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f146032i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f146033j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            C89349b bVar = this.f146034n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            aVar.mo74318e(10, this.f146035o);
            aVar.mo74320g(11, 8, this.f146036p);
            String str8 = this.f146037q;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            aVar.mo74318e(13, this.f146038r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str9 = this.f146027d;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f146028e;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f146029f;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f146030g;
            if (str12 != null) {
                i3 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f146031h;
            if (str13 != null) {
                i3 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f146032i;
            if (str14 != null) {
                i3 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f146033j;
            if (str15 != null) {
                i3 += C52418a.m58683j(8, str15);
            }
            C89349b bVar2 = this.f146034n;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(9, bVar2);
            }
            int e = i3 + C52418a.m58678e(10, this.f146035o) + C52418a.m58680g(11, 8, this.f146036p);
            String str16 = this.f146037q;
            if (str16 != null) {
                e += C52418a.m58683j(12, str16);
            }
            return e + C52418a.m58678e(13, this.f146038r);
        } else if (i2 == 2) {
            this.f146036p.clear();
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
            C52273zj2 zj22 = objArr[1];
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
                        zj22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zj22.f146027d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zj22.f146028e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zj22.f146029f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zj22.f146030g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zj22.f146031h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zj22.f146032i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zj22.f146033j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zj22.f146034n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    zj22.f146035o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50696ok2 ok22 = new C50696ok2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ok22.parseFrom(bArr2);
                        }
                        zj22.f146036p.add(ok22);
                    }
                    return 0;
                case 12:
                    zj22.f146037q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zj22.f146038r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
