package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ng */
public class C22516ng extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C22501jg> f64298d = new LinkedList<>();

    /* renamed from: e */
    public int f64299e;

    /* renamed from: f */
    public int f64300f = 1;

    /* renamed from: g */
    public int f64301g;

    /* renamed from: h */
    public String f64302h;

    /* renamed from: i */
    public int f64303i;

    /* renamed from: j */
    public int f64304j;

    /* renamed from: n */
    public int f64305n;

    /* renamed from: o */
    public C64522lg f64306o;

    /* renamed from: p */
    public int f64307p;

    /* renamed from: q */
    public int f64308q;

    /* renamed from: r */
    public int f64309r;

    /* renamed from: s */
    public String f64310s;

    /* renamed from: t */
    public C22501jg f64311t;

    /* renamed from: u */
    public int f64312u;

    /* renamed from: v */
    public String f64313v;

    /* renamed from: w */
    public int f64314w;

    /* renamed from: x */
    public C89349b f64315x;

    /* renamed from: y */
    public String f64316y;

    /* renamed from: z */
    public boolean f64317z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22516ng)) {
            return false;
        }
        C22516ng ngVar = (C22516ng) aVar;
        return C46238a.m51546a(this.BaseRequest, ngVar.BaseRequest) && C46238a.m51546a(this.f64298d, ngVar.f64298d) && C46238a.m51546a(Integer.valueOf(this.f64299e), Integer.valueOf(ngVar.f64299e)) && C46238a.m51546a(Integer.valueOf(this.f64300f), Integer.valueOf(ngVar.f64300f)) && C46238a.m51546a(Integer.valueOf(this.f64301g), Integer.valueOf(ngVar.f64301g)) && C46238a.m51546a(this.f64302h, ngVar.f64302h) && C46238a.m51546a(Integer.valueOf(this.f64303i), Integer.valueOf(ngVar.f64303i)) && C46238a.m51546a(Integer.valueOf(this.f64304j), Integer.valueOf(ngVar.f64304j)) && C46238a.m51546a(Integer.valueOf(this.f64305n), Integer.valueOf(ngVar.f64305n)) && C46238a.m51546a(this.f64306o, ngVar.f64306o) && C46238a.m51546a(Integer.valueOf(this.f64307p), Integer.valueOf(ngVar.f64307p)) && C46238a.m51546a(Integer.valueOf(this.f64308q), Integer.valueOf(ngVar.f64308q)) && C46238a.m51546a(Integer.valueOf(this.f64309r), Integer.valueOf(ngVar.f64309r)) && C46238a.m51546a(this.f64310s, ngVar.f64310s) && C46238a.m51546a(this.f64311t, ngVar.f64311t) && C46238a.m51546a(Integer.valueOf(this.f64312u), Integer.valueOf(ngVar.f64312u)) && C46238a.m51546a(this.f64313v, ngVar.f64313v) && C46238a.m51546a(Integer.valueOf(this.f64314w), Integer.valueOf(ngVar.f64314w)) && C46238a.m51546a(this.f64315x, ngVar.f64315x) && C46238a.m51546a(this.f64316y, ngVar.f64316y) && C46238a.m51546a(Boolean.valueOf(this.f64317z), Boolean.valueOf(ngVar.f64317z));
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
            aVar.mo74320g(2, 8, this.f64298d);
            aVar.mo74318e(3, this.f64299e);
            aVar.mo74318e(4, this.f64300f);
            aVar.mo74318e(5, this.f64301g);
            String str = this.f64302h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f64303i);
            aVar.mo74318e(8, this.f64304j);
            aVar.mo74318e(9, this.f64305n);
            C64522lg lgVar = this.f64306o;
            if (lgVar != null) {
                aVar.mo74322i(10, lgVar.computeSize());
                this.f64306o.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f64307p);
            aVar.mo74318e(12, this.f64308q);
            aVar.mo74318e(13, this.f64309r);
            String str2 = this.f64310s;
            if (str2 != null) {
                aVar.mo74323j(14, str2);
            }
            C22501jg jgVar = this.f64311t;
            if (jgVar != null) {
                aVar.mo74322i(15, jgVar.computeSize());
                this.f64311t.writeFields(aVar);
            }
            aVar.mo74318e(17, this.f64312u);
            String str3 = this.f64313v;
            if (str3 != null) {
                aVar.mo74323j(18, str3);
            }
            aVar.mo74318e(19, this.f64314w);
            C89349b bVar = this.f64315x;
            if (bVar != null) {
                aVar.mo74315b(20, bVar);
            }
            String str4 = this.f64316y;
            if (str4 != null) {
                aVar.mo74323j(21, str4);
            }
            aVar.mo74314a(22, this.f64317z);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f64298d) + C52418a.m58678e(3, this.f64299e) + C52418a.m58678e(4, this.f64300f) + C52418a.m58678e(5, this.f64301g);
            String str5 = this.f64302h;
            if (str5 != null) {
                g += C52418a.m58683j(6, str5);
            }
            int e = g + C52418a.m58678e(7, this.f64303i) + C52418a.m58678e(8, this.f64304j) + C52418a.m58678e(9, this.f64305n);
            C64522lg lgVar2 = this.f64306o;
            if (lgVar2 != null) {
                e += C52418a.m58682i(10, lgVar2.computeSize());
            }
            int e2 = e + C52418a.m58678e(11, this.f64307p) + C52418a.m58678e(12, this.f64308q) + C52418a.m58678e(13, this.f64309r);
            String str6 = this.f64310s;
            if (str6 != null) {
                e2 += C52418a.m58683j(14, str6);
            }
            C22501jg jgVar2 = this.f64311t;
            if (jgVar2 != null) {
                e2 += C52418a.m58682i(15, jgVar2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(17, this.f64312u);
            String str7 = this.f64313v;
            if (str7 != null) {
                e3 += C52418a.m58683j(18, str7);
            }
            int e4 = e3 + C52418a.m58678e(19, this.f64314w);
            C89349b bVar2 = this.f64315x;
            if (bVar2 != null) {
                e4 += C52418a.m58675b(20, bVar2);
            }
            String str8 = this.f64316y;
            if (str8 != null) {
                e4 += C52418a.m58683j(21, str8);
            }
            return e4 + C52418a.m58674a(22, this.f64317z);
        } else if (i2 == 2) {
            this.f64298d.clear();
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
            C22516ng ngVar = objArr[1];
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
                        ngVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C22501jg jgVar3 = new C22501jg();
                        if (bArr2 != null && bArr2.length > 0) {
                            jgVar3.parseFrom(bArr2);
                        }
                        ngVar.f64298d.add(jgVar3);
                    }
                    return 0;
                case 3:
                    ngVar.f64299e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ngVar.f64300f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ngVar.f64301g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ngVar.f64302h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ngVar.f64303i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ngVar.f64304j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ngVar.f64305n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64522lg lgVar3 = new C64522lg();
                        if (bArr3 != null && bArr3.length > 0) {
                            lgVar3.parseFrom(bArr3);
                        }
                        ngVar.f64306o = lgVar3;
                    }
                    return 0;
                case 11:
                    ngVar.f64307p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ngVar.f64308q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ngVar.f64309r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    ngVar.f64310s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C22501jg jgVar4 = new C22501jg();
                        if (bArr4 != null && bArr4.length > 0) {
                            jgVar4.parseFrom(bArr4);
                        }
                        ngVar.f64311t = jgVar4;
                    }
                    return 0;
                case 17:
                    ngVar.f64312u = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    ngVar.f64313v = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    ngVar.f64314w = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    ngVar.f64315x = aVar3.mo141626d(intValue);
                    return 0;
                case 21:
                    ngVar.f64316y = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    ngVar.f64317z = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
