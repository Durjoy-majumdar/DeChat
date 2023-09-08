package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k */
public class C77956k extends C101820nt3 {

    /* renamed from: d */
    public String f227713d;

    /* renamed from: e */
    public long f227714e;

    /* renamed from: f */
    public LinkedList<C64541m> f227715f = new LinkedList<>();

    /* renamed from: g */
    public int f227716g;

    /* renamed from: h */
    public String f227717h;

    /* renamed from: i */
    public C77963l1 f227718i;

    /* renamed from: j */
    public long f227719j;

    /* renamed from: n */
    public String f227720n;

    /* renamed from: o */
    public String f227721o;

    /* renamed from: p */
    public String f227722p;

    /* renamed from: q */
    public String f227723q;

    /* renamed from: r */
    public boolean f227724r;

    /* renamed from: s */
    public LinkedList<s94> f227725s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77956k)) {
            return false;
        }
        C77956k kVar = (C77956k) aVar;
        return C46238a.m51546a(this.BaseRequest, kVar.BaseRequest) && C46238a.m51546a(this.f227713d, kVar.f227713d) && C46238a.m51546a(Long.valueOf(this.f227714e), Long.valueOf(kVar.f227714e)) && C46238a.m51546a(this.f227715f, kVar.f227715f) && C46238a.m51546a(Integer.valueOf(this.f227716g), Integer.valueOf(kVar.f227716g)) && C46238a.m51546a(this.f227717h, kVar.f227717h) && C46238a.m51546a(this.f227718i, kVar.f227718i) && C46238a.m51546a(Long.valueOf(this.f227719j), Long.valueOf(kVar.f227719j)) && C46238a.m51546a(this.f227720n, kVar.f227720n) && C46238a.m51546a(this.f227721o, kVar.f227721o) && C46238a.m51546a(this.f227722p, kVar.f227722p) && C46238a.m51546a(this.f227723q, kVar.f227723q) && C46238a.m51546a(Boolean.valueOf(this.f227724r), Boolean.valueOf(kVar.f227724r)) && C46238a.m51546a(this.f227725s, kVar.f227725s);
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
            String str = this.f227713d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f227714e);
            aVar.mo74320g(5, 8, this.f227715f);
            aVar.mo74318e(7, this.f227716g);
            String str2 = this.f227717h;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            C77963l1 l1Var = this.f227718i;
            if (l1Var != null) {
                aVar.mo74322i(9, l1Var.computeSize());
                this.f227718i.writeFields(aVar);
            }
            aVar.mo74321h(10, this.f227719j);
            String str3 = this.f227720n;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f227721o;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f227722p;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f227723q;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            aVar.mo74314a(15, this.f227724r);
            aVar.mo74320g(16, 8, this.f227725s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str7 = this.f227713d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            int h = i3 + C52418a.m58681h(3, this.f227714e) + C52418a.m58680g(5, 8, this.f227715f) + C52418a.m58678e(7, this.f227716g);
            String str8 = this.f227717h;
            if (str8 != null) {
                h += C52418a.m58683j(8, str8);
            }
            C77963l1 l1Var2 = this.f227718i;
            if (l1Var2 != null) {
                h += C52418a.m58682i(9, l1Var2.computeSize());
            }
            int h2 = h + C52418a.m58681h(10, this.f227719j);
            String str9 = this.f227720n;
            if (str9 != null) {
                h2 += C52418a.m58683j(11, str9);
            }
            String str10 = this.f227721o;
            if (str10 != null) {
                h2 += C52418a.m58683j(12, str10);
            }
            String str11 = this.f227722p;
            if (str11 != null) {
                h2 += C52418a.m58683j(13, str11);
            }
            String str12 = this.f227723q;
            if (str12 != null) {
                h2 += C52418a.m58683j(14, str12);
            }
            return h2 + C52418a.m58674a(15, this.f227724r) + C52418a.m58680g(16, 8, this.f227725s);
        } else if (i2 == 2) {
            this.f227715f.clear();
            this.f227725s.clear();
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
            C77956k kVar = objArr[1];
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
                        kVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    kVar.f227713d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kVar.f227714e = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64541m mVar = new C64541m();
                        if (bArr2 != null && bArr2.length > 0) {
                            mVar.parseFrom(bArr2);
                        }
                        kVar.f227715f.add(mVar);
                    }
                    return 0;
                case 7:
                    kVar.f227716g = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    kVar.f227717h = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr3 != null && bArr3.length > 0) {
                            l1Var3.parseFrom(bArr3);
                        }
                        kVar.f227718i = l1Var3;
                    }
                    return 0;
                case 10:
                    kVar.f227719j = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    kVar.f227720n = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    kVar.f227721o = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    kVar.f227722p = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    kVar.f227723q = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    kVar.f227724r = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        s94 s94 = new s94();
                        if (bArr4 != null && bArr4.length > 0) {
                            s94.parseFrom(bArr4);
                        }
                        kVar.f227725s.add(s94);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
