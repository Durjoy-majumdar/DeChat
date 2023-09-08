package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.og */
public class C22518og extends C49335eu3 {

    /* renamed from: d */
    public long f64340d;

    /* renamed from: e */
    public int f64341e;

    /* renamed from: f */
    public int f64342f;

    /* renamed from: g */
    public long f64343g;

    /* renamed from: h */
    public int f64344h;

    /* renamed from: i */
    public LinkedList<C22501jg> f64345i = new LinkedList<>();

    /* renamed from: j */
    public int f64346j;

    /* renamed from: n */
    public String f64347n;

    /* renamed from: o */
    public int f64348o;

    /* renamed from: p */
    public int f64349p;

    /* renamed from: q */
    public LinkedList<C49733ho3> f64350q = new LinkedList<>();

    /* renamed from: r */
    public String f64351r;

    /* renamed from: s */
    public C49588go3 f64352s;

    /* renamed from: t */
    public int f64353t;

    /* renamed from: u */
    public int f64354u;

    /* renamed from: v */
    public int f64355v;

    /* renamed from: w */
    public String f64356w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22518og)) {
            return false;
        }
        C22518og ogVar = (C22518og) aVar;
        return C46238a.m51546a(this.BaseResponse, ogVar.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f64340d), Long.valueOf(ogVar.f64340d)) && C46238a.m51546a(Integer.valueOf(this.f64341e), Integer.valueOf(ogVar.f64341e)) && C46238a.m51546a(Integer.valueOf(this.f64342f), Integer.valueOf(ogVar.f64342f)) && C46238a.m51546a(Long.valueOf(this.f64343g), Long.valueOf(ogVar.f64343g)) && C46238a.m51546a(Integer.valueOf(this.f64344h), Integer.valueOf(ogVar.f64344h)) && C46238a.m51546a(this.f64345i, ogVar.f64345i) && C46238a.m51546a(Integer.valueOf(this.f64346j), Integer.valueOf(ogVar.f64346j)) && C46238a.m51546a(this.f64347n, ogVar.f64347n) && C46238a.m51546a(Integer.valueOf(this.f64348o), Integer.valueOf(ogVar.f64348o)) && C46238a.m51546a(Integer.valueOf(this.f64349p), Integer.valueOf(ogVar.f64349p)) && C46238a.m51546a(this.f64350q, ogVar.f64350q) && C46238a.m51546a(this.f64351r, ogVar.f64351r) && C46238a.m51546a(this.f64352s, ogVar.f64352s) && C46238a.m51546a(Integer.valueOf(this.f64353t), Integer.valueOf(ogVar.f64353t)) && C46238a.m51546a(Integer.valueOf(this.f64354u), Integer.valueOf(ogVar.f64354u)) && C46238a.m51546a(Integer.valueOf(this.f64355v), Integer.valueOf(ogVar.f64355v)) && C46238a.m51546a(this.f64356w, ogVar.f64356w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f64340d);
                aVar.mo74318e(3, this.f64341e);
                aVar.mo74318e(4, this.f64342f);
                aVar.mo74321h(5, this.f64343g);
                aVar.mo74318e(6, this.f64344h);
                aVar.mo74320g(7, 8, this.f64345i);
                aVar.mo74318e(8, this.f64346j);
                String str = this.f64347n;
                if (str != null) {
                    aVar.mo74323j(9, str);
                }
                aVar.mo74318e(10, this.f64348o);
                aVar.mo74318e(11, this.f64349p);
                aVar.mo74320g(12, 8, this.f64350q);
                String str2 = this.f64351r;
                if (str2 != null) {
                    aVar.mo74323j(14, str2);
                }
                C49588go3 go32 = this.f64352s;
                if (go32 != null) {
                    aVar.mo74322i(16, go32.computeSize());
                    this.f64352s.writeFields(aVar);
                }
                aVar.mo74318e(17, this.f64353t);
                aVar.mo74318e(18, this.f64354u);
                aVar.mo74318e(19, this.f64355v);
                String str3 = this.f64356w;
                if (str3 != null) {
                    aVar.mo74323j(21, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f64340d) + C52418a.m58678e(3, this.f64341e) + C52418a.m58678e(4, this.f64342f) + C52418a.m58681h(5, this.f64343g) + C52418a.m58678e(6, this.f64344h) + C52418a.m58680g(7, 8, this.f64345i) + C52418a.m58678e(8, this.f64346j);
            String str4 = this.f64347n;
            if (str4 != null) {
                h += C52418a.m58683j(9, str4);
            }
            int e = h + C52418a.m58678e(10, this.f64348o) + C52418a.m58678e(11, this.f64349p) + C52418a.m58680g(12, 8, this.f64350q);
            String str5 = this.f64351r;
            if (str5 != null) {
                e += C52418a.m58683j(14, str5);
            }
            C49588go3 go33 = this.f64352s;
            if (go33 != null) {
                e += C52418a.m58682i(16, go33.computeSize());
            }
            int e2 = e + C52418a.m58678e(17, this.f64353t) + C52418a.m58678e(18, this.f64354u) + C52418a.m58678e(19, this.f64355v);
            String str6 = this.f64356w;
            return str6 != null ? e2 + C52418a.m58683j(21, str6) : e2;
        } else if (i2 == 2) {
            this.f64345i.clear();
            this.f64350q.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22518og ogVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ogVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ogVar.f64340d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ogVar.f64341e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ogVar.f64342f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ogVar.f64343g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ogVar.f64344h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C22501jg jgVar = new C22501jg();
                        if (bArr2 != null && bArr2.length > 0) {
                            jgVar.parseFrom(bArr2);
                        }
                        ogVar.f64345i.add(jgVar);
                    }
                    return 0;
                case 8:
                    ogVar.f64346j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ogVar.f64347n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ogVar.f64348o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ogVar.f64349p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49733ho3 ho32 = new C49733ho3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ho32.parseFrom(bArr3);
                        }
                        ogVar.f64350q.add(ho32);
                    }
                    return 0;
                case 14:
                    ogVar.f64351r = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49588go3 go34 = new C49588go3();
                        if (bArr4 != null && bArr4.length > 0) {
                            go34.parseFrom(bArr4);
                        }
                        ogVar.f64352s = go34;
                    }
                    return 0;
                case 17:
                    ogVar.f64353t = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    ogVar.f64354u = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    ogVar.f64355v = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    ogVar.f64356w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
