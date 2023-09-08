package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w64 extends C47465a {

    /* renamed from: d */
    public String f299703d;

    /* renamed from: e */
    public String f299704e;

    /* renamed from: f */
    public int f299705f;

    /* renamed from: g */
    public int f299706g;

    /* renamed from: h */
    public String f299707h;

    /* renamed from: i */
    public int f299708i;

    /* renamed from: j */
    public int f299709j;

    /* renamed from: n */
    public int f299710n;

    /* renamed from: o */
    public String f299711o;

    /* renamed from: p */
    public int f299712p;

    /* renamed from: q */
    public long f299713q;

    /* renamed from: r */
    public long f299714r;

    /* renamed from: s */
    public int f299715s;

    /* renamed from: t */
    public int f299716t;

    /* renamed from: u */
    public LinkedList<c74> f299717u = new LinkedList<>();

    /* renamed from: v */
    public int f299718v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w64)) {
            return false;
        }
        w64 w64 = (w64) aVar;
        return C46238a.m51546a(this.f299703d, w64.f299703d) && C46238a.m51546a(this.f299704e, w64.f299704e) && C46238a.m51546a(Integer.valueOf(this.f299705f), Integer.valueOf(w64.f299705f)) && C46238a.m51546a(Integer.valueOf(this.f299706g), Integer.valueOf(w64.f299706g)) && C46238a.m51546a(this.f299707h, w64.f299707h) && C46238a.m51546a(Integer.valueOf(this.f299708i), Integer.valueOf(w64.f299708i)) && C46238a.m51546a(Integer.valueOf(this.f299709j), Integer.valueOf(w64.f299709j)) && C46238a.m51546a(Integer.valueOf(this.f299710n), Integer.valueOf(w64.f299710n)) && C46238a.m51546a(this.f299711o, w64.f299711o) && C46238a.m51546a(Integer.valueOf(this.f299712p), Integer.valueOf(w64.f299712p)) && C46238a.m51546a(Long.valueOf(this.f299713q), Long.valueOf(w64.f299713q)) && C46238a.m51546a(Long.valueOf(this.f299714r), Long.valueOf(w64.f299714r)) && C46238a.m51546a(Integer.valueOf(this.f299715s), Integer.valueOf(w64.f299715s)) && C46238a.m51546a(Integer.valueOf(this.f299716t), Integer.valueOf(w64.f299716t)) && C46238a.m51546a(this.f299717u, w64.f299717u) && C46238a.m51546a(Integer.valueOf(this.f299718v), Integer.valueOf(w64.f299718v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299703d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299704e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f299705f);
            aVar.mo74318e(4, this.f299706g);
            String str3 = this.f299707h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f299708i);
            aVar.mo74318e(7, this.f299709j);
            aVar.mo74318e(8, this.f299710n);
            String str4 = this.f299711o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74318e(10, this.f299712p);
            aVar.mo74321h(11, this.f299713q);
            aVar.mo74321h(12, this.f299714r);
            aVar.mo74318e(13, this.f299715s);
            aVar.mo74318e(14, this.f299716t);
            aVar.mo74320g(15, 8, this.f299717u);
            aVar.mo74318e(16, this.f299718v);
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f299703d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            String str6 = this.f299704e;
            if (str6 != null) {
                i3 += C52418a.m58683j(2, str6);
            }
            int e = i3 + C52418a.m58678e(3, this.f299705f) + C52418a.m58678e(4, this.f299706g);
            String str7 = this.f299707h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f299708i) + C52418a.m58678e(7, this.f299709j) + C52418a.m58678e(8, this.f299710n);
            String str8 = this.f299711o;
            if (str8 != null) {
                e2 += C52418a.m58683j(9, str8);
            }
            return e2 + C52418a.m58678e(10, this.f299712p) + C52418a.m58681h(11, this.f299713q) + C52418a.m58681h(12, this.f299714r) + C52418a.m58678e(13, this.f299715s) + C52418a.m58678e(14, this.f299716t) + C52418a.m58680g(15, 8, this.f299717u) + C52418a.m58678e(16, this.f299718v);
        } else if (i2 == 2) {
            this.f299717u.clear();
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
            w64 w64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w64.f299703d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w64.f299704e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w64.f299705f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    w64.f299706g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    w64.f299707h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w64.f299708i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w64.f299709j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    w64.f299710n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    w64.f299711o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    w64.f299712p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    w64.f299713q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    w64.f299714r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    w64.f299715s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    w64.f299716t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        c74 c74 = new c74();
                        if (bArr != null && bArr.length > 0) {
                            c74.parseFrom(bArr);
                        }
                        w64.f299717u.add(c74);
                    }
                    return 0;
                case 16:
                    w64.f299718v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
