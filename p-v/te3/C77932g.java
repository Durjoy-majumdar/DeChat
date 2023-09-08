package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g */
public class C77932g extends C101820nt3 {

    /* renamed from: d */
    public int f227417d;

    /* renamed from: e */
    public long f227418e;

    /* renamed from: f */
    public String f227419f;

    /* renamed from: g */
    public LinkedList<String> f227420g = new LinkedList<>();

    /* renamed from: h */
    public int f227421h;

    /* renamed from: i */
    public String f227422i;

    /* renamed from: j */
    public C77963l1 f227423j;

    /* renamed from: n */
    public long f227424n;

    /* renamed from: o */
    public String f227425o;

    /* renamed from: p */
    public String f227426p;

    /* renamed from: q */
    public String f227427q;

    /* renamed from: r */
    public String f227428r;

    /* renamed from: s */
    public boolean f227429s;

    /* renamed from: t */
    public LinkedList<s94> f227430t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77932g)) {
            return false;
        }
        C77932g gVar = (C77932g) aVar;
        return C46238a.m51546a(this.BaseRequest, gVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f227417d), Integer.valueOf(gVar.f227417d)) && C46238a.m51546a(Long.valueOf(this.f227418e), Long.valueOf(gVar.f227418e)) && C46238a.m51546a(this.f227419f, gVar.f227419f) && C46238a.m51546a(this.f227420g, gVar.f227420g) && C46238a.m51546a(Integer.valueOf(this.f227421h), Integer.valueOf(gVar.f227421h)) && C46238a.m51546a(this.f227422i, gVar.f227422i) && C46238a.m51546a(this.f227423j, gVar.f227423j) && C46238a.m51546a(Long.valueOf(this.f227424n), Long.valueOf(gVar.f227424n)) && C46238a.m51546a(this.f227425o, gVar.f227425o) && C46238a.m51546a(this.f227426p, gVar.f227426p) && C46238a.m51546a(this.f227427q, gVar.f227427q) && C46238a.m51546a(this.f227428r, gVar.f227428r) && C46238a.m51546a(Boolean.valueOf(this.f227429s), Boolean.valueOf(gVar.f227429s)) && C46238a.m51546a(this.f227430t, gVar.f227430t);
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
            aVar.mo74318e(2, this.f227417d);
            aVar.mo74321h(3, this.f227418e);
            String str = this.f227419f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74320g(5, 1, this.f227420g);
            aVar.mo74318e(6, this.f227421h);
            String str2 = this.f227422i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C77963l1 l1Var = this.f227423j;
            if (l1Var != null) {
                aVar.mo74322i(8, l1Var.computeSize());
                this.f227423j.writeFields(aVar);
            }
            aVar.mo74321h(9, this.f227424n);
            String str3 = this.f227425o;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            String str4 = this.f227426p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            String str5 = this.f227427q;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            String str6 = this.f227428r;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74314a(14, this.f227429s);
            aVar.mo74320g(15, 8, this.f227430t);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227417d) + C52418a.m58681h(3, this.f227418e);
            String str7 = this.f227419f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int g = e + C52418a.m58680g(5, 1, this.f227420g) + C52418a.m58678e(6, this.f227421h);
            String str8 = this.f227422i;
            if (str8 != null) {
                g += C52418a.m58683j(7, str8);
            }
            C77963l1 l1Var2 = this.f227423j;
            if (l1Var2 != null) {
                g += C52418a.m58682i(8, l1Var2.computeSize());
            }
            int h = g + C52418a.m58681h(9, this.f227424n);
            String str9 = this.f227425o;
            if (str9 != null) {
                h += C52418a.m58683j(10, str9);
            }
            String str10 = this.f227426p;
            if (str10 != null) {
                h += C52418a.m58683j(11, str10);
            }
            String str11 = this.f227427q;
            if (str11 != null) {
                h += C52418a.m58683j(12, str11);
            }
            String str12 = this.f227428r;
            if (str12 != null) {
                h += C52418a.m58683j(13, str12);
            }
            return h + C52418a.m58674a(14, this.f227429s) + C52418a.m58680g(15, 8, this.f227430t);
        } else if (i2 == 2) {
            this.f227420g.clear();
            this.f227430t.clear();
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
            C77932g gVar = objArr[1];
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
                        gVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gVar.f227417d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gVar.f227418e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    gVar.f227419f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gVar.f227420g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    gVar.f227421h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gVar.f227422i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        gVar.f227423j = l1Var3;
                    }
                    return 0;
                case 9:
                    gVar.f227424n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    gVar.f227425o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gVar.f227426p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    gVar.f227427q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    gVar.f227428r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    gVar.f227429s = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        s94 s94 = new s94();
                        if (bArr3 != null && bArr3.length > 0) {
                            s94.parseFrom(bArr3);
                        }
                        gVar.f227430t.add(s94);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
