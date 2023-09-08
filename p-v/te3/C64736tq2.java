package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tq2 */
public class C64736tq2 extends C47465a {

    /* renamed from: d */
    public String f185645d;

    /* renamed from: e */
    public int f185646e;

    /* renamed from: f */
    public int f185647f;

    /* renamed from: g */
    public LinkedList<C64689rq2> f185648g = new LinkedList<>();

    /* renamed from: h */
    public int f185649h;

    /* renamed from: i */
    public int f185650i;

    /* renamed from: j */
    public long f185651j;

    /* renamed from: n */
    public long f185652n;

    /* renamed from: o */
    public long f185653o;

    /* renamed from: p */
    public long f185654p;

    /* renamed from: q */
    public long f185655q;

    /* renamed from: r */
    public LinkedList<C64589nq2> f185656r = new LinkedList<>();

    /* renamed from: s */
    public C64268br3 f185657s;

    /* renamed from: t */
    public int f185658t;

    /* renamed from: u */
    public String f185659u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64736tq2)) {
            return false;
        }
        C64736tq2 tq22 = (C64736tq2) aVar;
        return C46238a.m51546a(this.f185645d, tq22.f185645d) && C46238a.m51546a(Integer.valueOf(this.f185646e), Integer.valueOf(tq22.f185646e)) && C46238a.m51546a(Integer.valueOf(this.f185647f), Integer.valueOf(tq22.f185647f)) && C46238a.m51546a(this.f185648g, tq22.f185648g) && C46238a.m51546a(Integer.valueOf(this.f185649h), Integer.valueOf(tq22.f185649h)) && C46238a.m51546a(Integer.valueOf(this.f185650i), Integer.valueOf(tq22.f185650i)) && C46238a.m51546a(Long.valueOf(this.f185651j), Long.valueOf(tq22.f185651j)) && C46238a.m51546a(Long.valueOf(this.f185652n), Long.valueOf(tq22.f185652n)) && C46238a.m51546a(Long.valueOf(this.f185653o), Long.valueOf(tq22.f185653o)) && C46238a.m51546a(Long.valueOf(this.f185654p), Long.valueOf(tq22.f185654p)) && C46238a.m51546a(Long.valueOf(this.f185655q), Long.valueOf(tq22.f185655q)) && C46238a.m51546a(this.f185656r, tq22.f185656r) && C46238a.m51546a(this.f185657s, tq22.f185657s) && C46238a.m51546a(Integer.valueOf(this.f185658t), Integer.valueOf(tq22.f185658t)) && C46238a.m51546a(this.f185659u, tq22.f185659u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185645d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185646e);
            aVar.mo74318e(3, this.f185647f);
            aVar.mo74320g(4, 8, this.f185648g);
            aVar.mo74318e(5, this.f185649h);
            aVar.mo74318e(6, this.f185650i);
            aVar.mo74321h(7, this.f185651j);
            aVar.mo74321h(8, this.f185652n);
            aVar.mo74321h(9, this.f185653o);
            aVar.mo74321h(10, this.f185654p);
            aVar.mo74321h(11, this.f185655q);
            aVar.mo74320g(12, 8, this.f185656r);
            C64268br3 br32 = this.f185657s;
            if (br32 != null) {
                aVar.mo74322i(13, br32.computeSize());
                this.f185657s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f185658t);
            String str2 = this.f185659u;
            if (str2 != null) {
                aVar.mo74323j(15, str2);
            }
            return 0;
        } else if (i2 == 1) {
            String str3 = this.f185645d;
            if (str3 != null) {
                i3 = C52418a.m58683j(1, str3) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f185646e) + C52418a.m58678e(3, this.f185647f) + C52418a.m58680g(4, 8, this.f185648g) + C52418a.m58678e(5, this.f185649h) + C52418a.m58678e(6, this.f185650i) + C52418a.m58681h(7, this.f185651j) + C52418a.m58681h(8, this.f185652n) + C52418a.m58681h(9, this.f185653o) + C52418a.m58681h(10, this.f185654p) + C52418a.m58681h(11, this.f185655q) + C52418a.m58680g(12, 8, this.f185656r);
            C64268br3 br33 = this.f185657s;
            if (br33 != null) {
                e += C52418a.m58682i(13, br33.computeSize());
            }
            int e2 = e + C52418a.m58678e(14, this.f185658t);
            String str4 = this.f185659u;
            return str4 != null ? e2 + C52418a.m58683j(15, str4) : e2;
        } else if (i2 == 2) {
            this.f185648g.clear();
            this.f185656r.clear();
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
            C64736tq2 tq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tq22.f185645d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tq22.f185646e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tq22.f185647f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64689rq2 rq22 = new C64689rq2();
                        if (bArr != null && bArr.length > 0) {
                            rq22.parseFrom(bArr);
                        }
                        tq22.f185648g.add(rq22);
                    }
                    return 0;
                case 5:
                    tq22.f185649h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tq22.f185650i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tq22.f185651j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    tq22.f185652n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    tq22.f185653o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    tq22.f185654p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    tq22.f185655q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64589nq2 nq22 = new C64589nq2();
                        if (bArr2 != null && bArr2.length > 0) {
                            nq22.parseFrom(bArr2);
                        }
                        tq22.f185656r.add(nq22);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64268br3 br34 = new C64268br3();
                        if (bArr3 != null && bArr3.length > 0) {
                            br34.parseFrom(bArr3);
                        }
                        tq22.f185657s = br34;
                    }
                    return 0;
                case 14:
                    tq22.f185658t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    tq22.f185659u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
