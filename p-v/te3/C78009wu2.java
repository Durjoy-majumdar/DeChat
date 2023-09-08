package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wu2 */
public class C78009wu2 extends C101820nt3 {

    /* renamed from: A */
    public int f228355A;

    /* renamed from: B */
    public String f228356B;

    /* renamed from: C */
    public String f228357C;

    /* renamed from: d */
    public String f228358d;

    /* renamed from: e */
    public String f228359e;

    /* renamed from: f */
    public String f228360f;

    /* renamed from: g */
    public int f228361g;

    /* renamed from: h */
    public int f228362h;

    /* renamed from: i */
    public C51018qv3 f228363i;

    /* renamed from: j */
    public int f228364j;

    /* renamed from: n */
    public int f228365n;

    /* renamed from: o */
    public int f228366o;

    /* renamed from: p */
    public int f228367p;

    /* renamed from: q */
    public C51018qv3 f228368q;

    /* renamed from: r */
    public int f228369r;

    /* renamed from: s */
    public int f228370s;

    /* renamed from: t */
    public int f228371t;

    /* renamed from: u */
    public int f228372u;

    /* renamed from: v */
    public int f228373v;

    /* renamed from: w */
    public int f228374w;

    /* renamed from: x */
    public String f228375x;

    /* renamed from: y */
    public String f228376y;

    /* renamed from: z */
    public int f228377z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78009wu2)) {
            return false;
        }
        C78009wu2 wu22 = (C78009wu2) aVar;
        return C46238a.m51546a(this.BaseRequest, wu22.BaseRequest) && C46238a.m51546a(this.f228358d, wu22.f228358d) && C46238a.m51546a(this.f228359e, wu22.f228359e) && C46238a.m51546a(this.f228360f, wu22.f228360f) && C46238a.m51546a(Integer.valueOf(this.f228361g), Integer.valueOf(wu22.f228361g)) && C46238a.m51546a(Integer.valueOf(this.f228362h), Integer.valueOf(wu22.f228362h)) && C46238a.m51546a(this.f228363i, wu22.f228363i) && C46238a.m51546a(Integer.valueOf(this.f228364j), Integer.valueOf(wu22.f228364j)) && C46238a.m51546a(Integer.valueOf(this.f228365n), Integer.valueOf(wu22.f228365n)) && C46238a.m51546a(Integer.valueOf(this.f228366o), Integer.valueOf(wu22.f228366o)) && C46238a.m51546a(Integer.valueOf(this.f228367p), Integer.valueOf(wu22.f228367p)) && C46238a.m51546a(this.f228368q, wu22.f228368q) && C46238a.m51546a(Integer.valueOf(this.f228369r), Integer.valueOf(wu22.f228369r)) && C46238a.m51546a(Integer.valueOf(this.f228370s), Integer.valueOf(wu22.f228370s)) && C46238a.m51546a(Integer.valueOf(this.f228371t), Integer.valueOf(wu22.f228371t)) && C46238a.m51546a(Integer.valueOf(this.f228372u), Integer.valueOf(wu22.f228372u)) && C46238a.m51546a(Integer.valueOf(this.f228373v), Integer.valueOf(wu22.f228373v)) && C46238a.m51546a(Integer.valueOf(this.f228374w), Integer.valueOf(wu22.f228374w)) && C46238a.m51546a(this.f228375x, wu22.f228375x) && C46238a.m51546a(this.f228376y, wu22.f228376y) && C46238a.m51546a(Integer.valueOf(this.f228377z), Integer.valueOf(wu22.f228377z)) && C46238a.m51546a(Integer.valueOf(this.f228355A), Integer.valueOf(wu22.f228355A)) && C46238a.m51546a(this.f228356B, wu22.f228356B) && C46238a.m51546a(this.f228357C, wu22.f228357C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f228363i == null) {
                throw new C52419b("Not all required fields were included: DataBuffer");
            } else if (this.f228368q != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f228358d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f228359e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f228360f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f228361g);
                aVar.mo74318e(6, this.f228362h);
                C51018qv3 qv32 = this.f228363i;
                if (qv32 != null) {
                    aVar.mo74322i(7, qv32.computeSize());
                    this.f228363i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f228364j);
                aVar.mo74318e(9, this.f228365n);
                aVar.mo74318e(10, this.f228366o);
                aVar.mo74318e(11, this.f228367p);
                C51018qv3 qv33 = this.f228368q;
                if (qv33 != null) {
                    aVar.mo74322i(12, qv33.computeSize());
                    this.f228368q.writeFields(aVar);
                }
                aVar.mo74318e(13, this.f228369r);
                aVar.mo74318e(14, this.f228370s);
                aVar.mo74318e(15, this.f228371t);
                aVar.mo74318e(16, this.f228372u);
                aVar.mo74318e(17, this.f228373v);
                aVar.mo74318e(18, this.f228374w);
                String str4 = this.f228375x;
                if (str4 != null) {
                    aVar.mo74323j(19, str4);
                }
                String str5 = this.f228376y;
                if (str5 != null) {
                    aVar.mo74323j(20, str5);
                }
                aVar.mo74318e(21, this.f228377z);
                aVar.mo74318e(22, this.f228355A);
                String str6 = this.f228356B;
                if (str6 != null) {
                    aVar.mo74323j(23, str6);
                }
                String str7 = this.f228357C;
                if (str7 != null) {
                    aVar.mo74323j(24, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbData");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str8 = this.f228358d;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f228359e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f228360f;
            if (str10 != null) {
                i3 += C52418a.m58683j(4, str10);
            }
            int e = i3 + C52418a.m58678e(5, this.f228361g) + C52418a.m58678e(6, this.f228362h);
            C51018qv3 qv34 = this.f228363i;
            if (qv34 != null) {
                e += C52418a.m58682i(7, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f228364j) + C52418a.m58678e(9, this.f228365n) + C52418a.m58678e(10, this.f228366o) + C52418a.m58678e(11, this.f228367p);
            C51018qv3 qv35 = this.f228368q;
            if (qv35 != null) {
                e2 += C52418a.m58682i(12, qv35.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.f228369r) + C52418a.m58678e(14, this.f228370s) + C52418a.m58678e(15, this.f228371t) + C52418a.m58678e(16, this.f228372u) + C52418a.m58678e(17, this.f228373v) + C52418a.m58678e(18, this.f228374w);
            String str11 = this.f228375x;
            if (str11 != null) {
                e3 += C52418a.m58683j(19, str11);
            }
            String str12 = this.f228376y;
            if (str12 != null) {
                e3 += C52418a.m58683j(20, str12);
            }
            int e4 = e3 + C52418a.m58678e(21, this.f228377z) + C52418a.m58678e(22, this.f228355A);
            String str13 = this.f228356B;
            if (str13 != null) {
                e4 += C52418a.m58683j(23, str13);
            }
            String str14 = this.f228357C;
            return str14 != null ? e4 + C52418a.m58683j(24, str14) : e4;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f228363i == null) {
                throw new C52419b("Not all required fields were included: DataBuffer");
            } else if (this.f228368q != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbData");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78009wu2 wu22 = objArr[1];
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
                        wu22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wu22.f228358d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wu22.f228359e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wu22.f228360f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wu22.f228361g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wu22.f228362h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        wu22.f228363i = qv36;
                    }
                    return 0;
                case 8:
                    wu22.f228364j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    wu22.f228365n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    wu22.f228366o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    wu22.f228367p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        wu22.f228368q = qv37;
                    }
                    return 0;
                case 13:
                    wu22.f228369r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    wu22.f228370s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    wu22.f228371t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    wu22.f228372u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    wu22.f228373v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    wu22.f228374w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    wu22.f228375x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    wu22.f228376y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    wu22.f228377z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    wu22.f228355A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    wu22.f228356B = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    wu22.f228357C = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
