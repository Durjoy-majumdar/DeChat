package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l02 */
public class C118440l02 extends C101820nt3 {

    /* renamed from: d */
    public String f354079d;

    /* renamed from: e */
    public String f354080e;

    /* renamed from: f */
    public float f354081f;

    /* renamed from: g */
    public String f354082g;

    /* renamed from: h */
    public String f354083h;

    /* renamed from: i */
    public int f354084i;

    /* renamed from: j */
    public String f354085j;

    /* renamed from: n */
    public String f354086n;

    /* renamed from: o */
    public C118476wb3 f354087o;

    /* renamed from: p */
    public C89349b f354088p;

    /* renamed from: q */
    public boolean f354089q;

    /* renamed from: r */
    public int f354090r;

    /* renamed from: s */
    public long f354091s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118440l02)) {
            return false;
        }
        C118440l02 l022 = (C118440l02) aVar;
        return C46238a.m51546a(this.BaseRequest, l022.BaseRequest) && C46238a.m51546a(this.f354079d, l022.f354079d) && C46238a.m51546a(this.f354080e, l022.f354080e) && C46238a.m51546a(Float.valueOf(this.f354081f), Float.valueOf(l022.f354081f)) && C46238a.m51546a(this.f354082g, l022.f354082g) && C46238a.m51546a(this.f354083h, l022.f354083h) && C46238a.m51546a(Integer.valueOf(this.f354084i), Integer.valueOf(l022.f354084i)) && C46238a.m51546a(this.f354085j, l022.f354085j) && C46238a.m51546a(this.f354086n, l022.f354086n) && C46238a.m51546a(this.f354087o, l022.f354087o) && C46238a.m51546a(this.f354088p, l022.f354088p) && C46238a.m51546a(Boolean.valueOf(this.f354089q), Boolean.valueOf(l022.f354089q)) && C46238a.m51546a(Integer.valueOf(this.f354090r), Integer.valueOf(l022.f354090r)) && C46238a.m51546a(Long.valueOf(this.f354091s), Long.valueOf(l022.f354091s));
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
            String str = this.f354079d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f354080e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74317d(4, this.f354081f);
            String str3 = this.f354082g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f354083h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f354084i);
            String str5 = this.f354085j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f354086n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            C118476wb3 wb32 = this.f354087o;
            if (wb32 != null) {
                aVar.mo74322i(10, wb32.computeSize());
                this.f354087o.writeFields(aVar);
            }
            C89349b bVar = this.f354088p;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            aVar.mo74314a(12, this.f354089q);
            aVar.mo74318e(13, this.f354090r);
            aVar.mo74321h(14, this.f354091s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str7 = this.f354079d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f354080e;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            int d = i3 + C52418a.m58677d(4, this.f354081f);
            String str9 = this.f354082g;
            if (str9 != null) {
                d += C52418a.m58683j(5, str9);
            }
            String str10 = this.f354083h;
            if (str10 != null) {
                d += C52418a.m58683j(6, str10);
            }
            int e = d + C52418a.m58678e(7, this.f354084i);
            String str11 = this.f354085j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f354086n;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            C118476wb3 wb33 = this.f354087o;
            if (wb33 != null) {
                e += C52418a.m58682i(10, wb33.computeSize());
            }
            C89349b bVar2 = this.f354088p;
            if (bVar2 != null) {
                e += C52418a.m58675b(11, bVar2);
            }
            return e + C52418a.m58674a(12, this.f354089q) + C52418a.m58678e(13, this.f354090r) + C52418a.m58681h(14, this.f354091s);
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
            C118440l02 l022 = objArr[1];
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
                        l022.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    l022.f354079d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l022.f354080e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l022.f354081f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    l022.f354082g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l022.f354083h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    l022.f354084i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    l022.f354085j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    l022.f354086n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C118476wb3 wb34 = new C118476wb3();
                        if (bArr2 != null && bArr2.length > 0) {
                            wb34.parseFrom(bArr2);
                        }
                        l022.f354087o = wb34;
                    }
                    return 0;
                case 11:
                    l022.f354088p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    l022.f354089q = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    l022.f354090r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    l022.f354091s = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
