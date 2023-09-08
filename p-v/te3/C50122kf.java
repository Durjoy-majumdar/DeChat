package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kf */
public class C50122kf extends C47465a {

    /* renamed from: d */
    public String f136726d;

    /* renamed from: e */
    public int f136727e;

    /* renamed from: f */
    public int f136728f;

    /* renamed from: g */
    public int f136729g;

    /* renamed from: h */
    public int f136730h;

    /* renamed from: i */
    public long f136731i;

    /* renamed from: j */
    public long f136732j;

    /* renamed from: n */
    public int f136733n;

    /* renamed from: o */
    public boolean f136734o;

    /* renamed from: p */
    public int f136735p;

    /* renamed from: q */
    public boolean f136736q;

    /* renamed from: r */
    public C51801w9 f136737r;

    /* renamed from: s */
    public boolean f136738s;

    /* renamed from: t */
    public C52297zr f136739t;

    /* renamed from: u */
    public LinkedList<ey4> f136740u = new LinkedList<>();

    /* renamed from: v */
    public boolean f136741v;

    /* renamed from: w */
    public LinkedList<String> f136742w = new LinkedList<>();

    /* renamed from: x */
    public String f136743x;

    /* renamed from: y */
    public String f136744y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50122kf)) {
            return false;
        }
        C50122kf kfVar = (C50122kf) aVar;
        return C46238a.m51546a(this.f136726d, kfVar.f136726d) && C46238a.m51546a(Integer.valueOf(this.f136727e), Integer.valueOf(kfVar.f136727e)) && C46238a.m51546a(Integer.valueOf(this.f136728f), Integer.valueOf(kfVar.f136728f)) && C46238a.m51546a(Integer.valueOf(this.f136729g), Integer.valueOf(kfVar.f136729g)) && C46238a.m51546a(Integer.valueOf(this.f136730h), Integer.valueOf(kfVar.f136730h)) && C46238a.m51546a(Long.valueOf(this.f136731i), Long.valueOf(kfVar.f136731i)) && C46238a.m51546a(Long.valueOf(this.f136732j), Long.valueOf(kfVar.f136732j)) && C46238a.m51546a(Integer.valueOf(this.f136733n), Integer.valueOf(kfVar.f136733n)) && C46238a.m51546a(Boolean.valueOf(this.f136734o), Boolean.valueOf(kfVar.f136734o)) && C46238a.m51546a(Integer.valueOf(this.f136735p), Integer.valueOf(kfVar.f136735p)) && C46238a.m51546a(Boolean.valueOf(this.f136736q), Boolean.valueOf(kfVar.f136736q)) && C46238a.m51546a(this.f136737r, kfVar.f136737r) && C46238a.m51546a(Boolean.valueOf(this.f136738s), Boolean.valueOf(kfVar.f136738s)) && C46238a.m51546a(this.f136739t, kfVar.f136739t) && C46238a.m51546a(this.f136740u, kfVar.f136740u) && C46238a.m51546a(Boolean.valueOf(this.f136741v), Boolean.valueOf(kfVar.f136741v)) && C46238a.m51546a(this.f136742w, kfVar.f136742w) && C46238a.m51546a(this.f136743x, kfVar.f136743x) && C46238a.m51546a(this.f136744y, kfVar.f136744y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136726d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f136727e);
                aVar.mo74318e(3, this.f136728f);
                aVar.mo74318e(4, this.f136729g);
                aVar.mo74318e(5, this.f136730h);
                aVar.mo74321h(6, this.f136731i);
                aVar.mo74321h(7, this.f136732j);
                aVar.mo74318e(8, this.f136733n);
                aVar.mo74314a(9, this.f136734o);
                aVar.mo74318e(10, this.f136735p);
                aVar.mo74314a(11, this.f136736q);
                C51801w9 w9Var = this.f136737r;
                if (w9Var != null) {
                    aVar.mo74322i(12, w9Var.computeSize());
                    this.f136737r.writeFields(aVar);
                }
                aVar.mo74314a(13, this.f136738s);
                C52297zr zrVar = this.f136739t;
                if (zrVar != null) {
                    aVar.mo74322i(14, zrVar.computeSize());
                    this.f136739t.writeFields(aVar);
                }
                aVar.mo74320g(15, 8, this.f136740u);
                aVar.mo74314a(16, this.f136741v);
                aVar.mo74320g(17, 1, this.f136742w);
                String str2 = this.f136743x;
                if (str2 != null) {
                    aVar.mo74323j(18, str2);
                }
                String str3 = this.f136744y;
                if (str3 != null) {
                    aVar.mo74323j(19, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i2 == 1) {
            String str4 = this.f136726d;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f136727e) + C52418a.m58678e(3, this.f136728f) + C52418a.m58678e(4, this.f136729g) + C52418a.m58678e(5, this.f136730h) + C52418a.m58681h(6, this.f136731i) + C52418a.m58681h(7, this.f136732j) + C52418a.m58678e(8, this.f136733n) + C52418a.m58674a(9, this.f136734o) + C52418a.m58678e(10, this.f136735p) + C52418a.m58674a(11, this.f136736q);
            C51801w9 w9Var2 = this.f136737r;
            if (w9Var2 != null) {
                e += C52418a.m58682i(12, w9Var2.computeSize());
            }
            int a = e + C52418a.m58674a(13, this.f136738s);
            C52297zr zrVar2 = this.f136739t;
            if (zrVar2 != null) {
                a += C52418a.m58682i(14, zrVar2.computeSize());
            }
            int g = a + C52418a.m58680g(15, 8, this.f136740u) + C52418a.m58674a(16, this.f136741v) + C52418a.m58680g(17, 1, this.f136742w);
            String str5 = this.f136743x;
            if (str5 != null) {
                g += C52418a.m58683j(18, str5);
            }
            String str6 = this.f136744y;
            return str6 != null ? g + C52418a.m58683j(19, str6) : g;
        } else if (i2 == 2) {
            this.f136740u.clear();
            this.f136742w.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136726d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50122kf kfVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kfVar.f136726d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kfVar.f136727e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    kfVar.f136728f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kfVar.f136729g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kfVar.f136730h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kfVar.f136731i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    kfVar.f136732j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    kfVar.f136733n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    kfVar.f136734o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    kfVar.f136735p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kfVar.f136736q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51801w9 w9Var3 = new C51801w9();
                        if (bArr != null && bArr.length > 0) {
                            w9Var3.parseFrom(bArr);
                        }
                        kfVar.f136737r = w9Var3;
                    }
                    return 0;
                case 13:
                    kfVar.f136738s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52297zr zrVar3 = new C52297zr();
                        if (bArr2 != null && bArr2.length > 0) {
                            zrVar3.parseFrom(bArr2);
                        }
                        kfVar.f136739t = zrVar3;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        ey4 ey4 = new ey4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ey4.parseFrom(bArr3);
                        }
                        kfVar.f136740u.add(ey4);
                    }
                    return 0;
                case 16:
                    kfVar.f136741v = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    kfVar.f136742w.add(aVar3.mo141633k(intValue));
                    return 0;
                case 18:
                    kfVar.f136743x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    kfVar.f136744y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
