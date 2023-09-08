package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f4 */
public class C77925f4 extends C47465a {

    /* renamed from: d */
    public String f227322d;

    /* renamed from: e */
    public String f227323e;

    /* renamed from: f */
    public int f227324f;

    /* renamed from: g */
    public int f227325g;

    /* renamed from: h */
    public int f227326h;

    /* renamed from: i */
    public String f227327i;

    /* renamed from: j */
    public C77907be0 f227328j;

    /* renamed from: n */
    public String f227329n;

    /* renamed from: o */
    public String f227330o;

    /* renamed from: p */
    public int f227331p;

    /* renamed from: q */
    public LinkedList<C77920eb0> f227332q = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77925f4)) {
            return false;
        }
        C77925f4 f4Var = (C77925f4) aVar;
        return C46238a.m51546a(this.f227322d, f4Var.f227322d) && C46238a.m51546a(this.f227323e, f4Var.f227323e) && C46238a.m51546a(Integer.valueOf(this.f227324f), Integer.valueOf(f4Var.f227324f)) && C46238a.m51546a(Integer.valueOf(this.f227325g), Integer.valueOf(f4Var.f227325g)) && C46238a.m51546a(Integer.valueOf(this.f227326h), Integer.valueOf(f4Var.f227326h)) && C46238a.m51546a(this.f227327i, f4Var.f227327i) && C46238a.m51546a(this.f227328j, f4Var.f227328j) && C46238a.m51546a(this.f227329n, f4Var.f227329n) && C46238a.m51546a(this.f227330o, f4Var.f227330o) && C46238a.m51546a(Integer.valueOf(this.f227331p), Integer.valueOf(f4Var.f227331p)) && C46238a.m51546a(this.f227332q, f4Var.f227332q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227322d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: f2f_id");
            } else if (this.f227327i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f227323e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f227324f);
                aVar.mo74318e(4, this.f227325g);
                aVar.mo74318e(5, this.f227326h);
                String str3 = this.f227327i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                C77907be0 be02 = this.f227328j;
                if (be02 != null) {
                    aVar.mo74322i(7, be02.computeSize());
                    this.f227328j.writeFields(aVar);
                }
                String str4 = this.f227329n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f227330o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                aVar.mo74318e(10, this.f227331p);
                aVar.mo74320g(11, 8, this.f227332q);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: payok_checksign");
            }
        } else if (i2 == 1) {
            String str6 = this.f227322d;
            int j = str6 != null ? 0 + C52418a.m58683j(1, str6) : 0;
            String str7 = this.f227323e;
            if (str7 != null) {
                j += C52418a.m58683j(2, str7);
            }
            int e = j + C52418a.m58678e(3, this.f227324f) + C52418a.m58678e(4, this.f227325g) + C52418a.m58678e(5, this.f227326h);
            String str8 = this.f227327i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            C77907be0 be03 = this.f227328j;
            if (be03 != null) {
                e += C52418a.m58682i(7, be03.computeSize());
            }
            String str9 = this.f227329n;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f227330o;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            return e + C52418a.m58678e(10, this.f227331p) + C52418a.m58680g(11, 8, this.f227332q);
        } else if (i2 == 2) {
            this.f227332q.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227322d == null) {
                throw new C52419b("Not all required fields were included: f2f_id");
            } else if (this.f227327i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: payok_checksign");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77925f4 f4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f4Var.f227322d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    f4Var.f227323e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f4Var.f227324f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    f4Var.f227325g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    f4Var.f227326h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    f4Var.f227327i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C77907be0 be04 = new C77907be0();
                        if (bArr != null && bArr.length > 0) {
                            be04.parseFrom(bArr);
                        }
                        f4Var.f227328j = be04;
                    }
                    return 0;
                case 8:
                    f4Var.f227329n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    f4Var.f227330o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    f4Var.f227331p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C77920eb0 eb02 = new C77920eb0();
                        if (bArr2 != null && bArr2.length > 0) {
                            eb02.parseFrom(bArr2);
                        }
                        f4Var.f227332q.add(eb02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
