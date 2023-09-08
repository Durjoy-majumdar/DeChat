package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vi3 */
public class C110972vi3 extends C49335eu3 {

    /* renamed from: d */
    public int f332291d;

    /* renamed from: e */
    public long f332292e;

    /* renamed from: f */
    public int f332293f;

    /* renamed from: g */
    public LinkedList<C50550ni3> f332294g = new LinkedList<>();

    /* renamed from: h */
    public int f332295h;

    /* renamed from: i */
    public int f332296i;

    /* renamed from: j */
    public int f332297j;

    /* renamed from: n */
    public long f332298n;

    /* renamed from: o */
    public int f332299o;

    /* renamed from: p */
    public C89349b f332300p;

    /* renamed from: q */
    public int f332301q;

    /* renamed from: r */
    public int f332302r;

    /* renamed from: s */
    public String f332303s;

    /* renamed from: t */
    public int f332304t;

    /* renamed from: u */
    public LinkedList<C50550ni3> f332305u = new LinkedList<>();

    /* renamed from: v */
    public int f332306v;

    /* renamed from: w */
    public String f332307w;

    /* renamed from: x */
    public C89349b f332308x;

    /* renamed from: y */
    public int f332309y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110972vi3)) {
            return false;
        }
        C110972vi3 vi32 = (C110972vi3) aVar;
        return C46238a.m51546a(this.BaseResponse, vi32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f332291d), Integer.valueOf(vi32.f332291d)) && C46238a.m51546a(Long.valueOf(this.f332292e), Long.valueOf(vi32.f332292e)) && C46238a.m51546a(Integer.valueOf(this.f332293f), Integer.valueOf(vi32.f332293f)) && C46238a.m51546a(this.f332294g, vi32.f332294g) && C46238a.m51546a(Integer.valueOf(this.f332295h), Integer.valueOf(vi32.f332295h)) && C46238a.m51546a(Integer.valueOf(this.f332296i), Integer.valueOf(vi32.f332296i)) && C46238a.m51546a(Integer.valueOf(this.f332297j), Integer.valueOf(vi32.f332297j)) && C46238a.m51546a(Long.valueOf(this.f332298n), Long.valueOf(vi32.f332298n)) && C46238a.m51546a(Integer.valueOf(this.f332299o), Integer.valueOf(vi32.f332299o)) && C46238a.m51546a(this.f332300p, vi32.f332300p) && C46238a.m51546a(Integer.valueOf(this.f332301q), Integer.valueOf(vi32.f332301q)) && C46238a.m51546a(Integer.valueOf(this.f332302r), Integer.valueOf(vi32.f332302r)) && C46238a.m51546a(this.f332303s, vi32.f332303s) && C46238a.m51546a(Integer.valueOf(this.f332304t), Integer.valueOf(vi32.f332304t)) && C46238a.m51546a(this.f332305u, vi32.f332305u) && C46238a.m51546a(Integer.valueOf(this.f332306v), Integer.valueOf(vi32.f332306v)) && C46238a.m51546a(this.f332307w, vi32.f332307w) && C46238a.m51546a(this.f332308x, vi32.f332308x) && C46238a.m51546a(Integer.valueOf(this.f332309y), Integer.valueOf(vi32.f332309y));
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
                aVar.mo74318e(2, this.f332291d);
                aVar.mo74321h(3, this.f332292e);
                aVar.mo74318e(4, this.f332293f);
                aVar.mo74320g(5, 8, this.f332294g);
                aVar.mo74318e(6, this.f332295h);
                aVar.mo74318e(7, this.f332296i);
                aVar.mo74318e(8, this.f332297j);
                aVar.mo74321h(9, this.f332298n);
                aVar.mo74318e(10, this.f332299o);
                C89349b bVar = this.f332300p;
                if (bVar != null) {
                    aVar.mo74315b(11, bVar);
                }
                aVar.mo74318e(12, this.f332301q);
                aVar.mo74318e(13, this.f332302r);
                String str = this.f332303s;
                if (str != null) {
                    aVar.mo74323j(14, str);
                }
                aVar.mo74318e(15, this.f332304t);
                aVar.mo74320g(16, 8, this.f332305u);
                aVar.mo74318e(17, this.f332306v);
                String str2 = this.f332307w;
                if (str2 != null) {
                    aVar.mo74323j(18, str2);
                }
                C89349b bVar2 = this.f332308x;
                if (bVar2 != null) {
                    aVar.mo74315b(19, bVar2);
                }
                aVar.mo74318e(20, this.f332309y);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f332291d) + C52418a.m58681h(3, this.f332292e) + C52418a.m58678e(4, this.f332293f) + C52418a.m58680g(5, 8, this.f332294g) + C52418a.m58678e(6, this.f332295h) + C52418a.m58678e(7, this.f332296i) + C52418a.m58678e(8, this.f332297j) + C52418a.m58681h(9, this.f332298n) + C52418a.m58678e(10, this.f332299o);
            C89349b bVar3 = this.f332300p;
            if (bVar3 != null) {
                e += C52418a.m58675b(11, bVar3);
            }
            int e2 = e + C52418a.m58678e(12, this.f332301q) + C52418a.m58678e(13, this.f332302r);
            String str3 = this.f332303s;
            if (str3 != null) {
                e2 += C52418a.m58683j(14, str3);
            }
            int e3 = e2 + C52418a.m58678e(15, this.f332304t) + C52418a.m58680g(16, 8, this.f332305u) + C52418a.m58678e(17, this.f332306v);
            String str4 = this.f332307w;
            if (str4 != null) {
                e3 += C52418a.m58683j(18, str4);
            }
            C89349b bVar4 = this.f332308x;
            if (bVar4 != null) {
                e3 += C52418a.m58675b(19, bVar4);
            }
            return e3 + C52418a.m58678e(20, this.f332309y);
        } else if (i2 == 2) {
            this.f332294g.clear();
            this.f332305u.clear();
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
            C110972vi3 vi32 = objArr[1];
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
                        vi32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    vi32.f332291d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vi32.f332292e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    vi32.f332293f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50550ni3 ni32 = new C50550ni3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ni32.parseFrom(bArr2);
                        }
                        vi32.f332294g.add(ni32);
                    }
                    return 0;
                case 6:
                    vi32.f332295h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vi32.f332296i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vi32.f332297j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    vi32.f332298n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    vi32.f332299o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    vi32.f332300p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    vi32.f332301q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    vi32.f332302r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    vi32.f332303s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    vi32.f332304t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50550ni3 ni33 = new C50550ni3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ni33.parseFrom(bArr3);
                        }
                        vi32.f332305u.add(ni33);
                    }
                    return 0;
                case 17:
                    vi32.f332306v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    vi32.f332307w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    vi32.f332308x = aVar3.mo141626d(intValue);
                    return 0;
                case 20:
                    vi32.f332309y = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
