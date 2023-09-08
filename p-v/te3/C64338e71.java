package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e71 */
public class C64338e71 extends C47465a {

    /* renamed from: d */
    public int f182928d;

    /* renamed from: e */
    public long f182929e;

    /* renamed from: f */
    public int f182930f;

    /* renamed from: g */
    public int f182931g;

    /* renamed from: h */
    public String f182932h;

    /* renamed from: i */
    public C64359f71 f182933i;

    /* renamed from: j */
    public C64387g71 f182934j;

    /* renamed from: n */
    public LinkedList<C64662qp2> f182935n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C64662qp2> f182936o = new LinkedList<>();

    /* renamed from: p */
    public String f182937p;

    /* renamed from: q */
    public String f182938q;

    /* renamed from: r */
    public String f182939r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64338e71)) {
            return false;
        }
        C64338e71 e712 = (C64338e71) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182928d), Integer.valueOf(e712.f182928d)) && C46238a.m51546a(Long.valueOf(this.f182929e), Long.valueOf(e712.f182929e)) && C46238a.m51546a(Integer.valueOf(this.f182930f), Integer.valueOf(e712.f182930f)) && C46238a.m51546a(Integer.valueOf(this.f182931g), Integer.valueOf(e712.f182931g)) && C46238a.m51546a(this.f182932h, e712.f182932h) && C46238a.m51546a(this.f182933i, e712.f182933i) && C46238a.m51546a(this.f182934j, e712.f182934j) && C46238a.m51546a(this.f182935n, e712.f182935n) && C46238a.m51546a(this.f182936o, e712.f182936o) && C46238a.m51546a(this.f182937p, e712.f182937p) && C46238a.m51546a(this.f182938q, e712.f182938q) && C46238a.m51546a(this.f182939r, e712.f182939r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182928d);
            aVar.mo74321h(2, this.f182929e);
            aVar.mo74318e(3, this.f182930f);
            aVar.mo74318e(4, this.f182931g);
            String str = this.f182932h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C64359f71 f712 = this.f182933i;
            if (f712 != null) {
                aVar.mo74322i(6, f712.computeSize());
                this.f182933i.writeFields(aVar);
            }
            C64387g71 g712 = this.f182934j;
            if (g712 != null) {
                aVar.mo74322i(7, g712.computeSize());
                this.f182934j.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f182935n);
            aVar.mo74320g(9, 8, this.f182936o);
            String str2 = this.f182937p;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            String str3 = this.f182938q;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f182939r;
            if (str4 == null) {
                return 0;
            }
            aVar.mo74323j(12, str4);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f182928d) + 0 + C52418a.m58681h(2, this.f182929e) + C52418a.m58678e(3, this.f182930f) + C52418a.m58678e(4, this.f182931g);
            String str5 = this.f182932h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            C64359f71 f713 = this.f182933i;
            if (f713 != null) {
                e += C52418a.m58682i(6, f713.computeSize());
            }
            C64387g71 g713 = this.f182934j;
            if (g713 != null) {
                e += C52418a.m58682i(7, g713.computeSize());
            }
            int g = e + C52418a.m58680g(8, 8, this.f182935n) + C52418a.m58680g(9, 8, this.f182936o);
            String str6 = this.f182937p;
            if (str6 != null) {
                g += C52418a.m58683j(10, str6);
            }
            String str7 = this.f182938q;
            if (str7 != null) {
                g += C52418a.m58683j(11, str7);
            }
            String str8 = this.f182939r;
            return str8 != null ? g + C52418a.m58683j(12, str8) : g;
        } else if (i2 == 2) {
            this.f182935n.clear();
            this.f182936o.clear();
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
            C64338e71 e712 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e712.f182928d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    e712.f182929e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    e712.f182930f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e712.f182931g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e712.f182932h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64359f71 f714 = new C64359f71();
                        if (bArr != null && bArr.length > 0) {
                            f714.parseFrom(bArr);
                        }
                        e712.f182933i = f714;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64387g71 g714 = new C64387g71();
                        if (bArr2 != null && bArr2.length > 0) {
                            g714.parseFrom(bArr2);
                        }
                        e712.f182934j = g714;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64662qp2 qp22 = new C64662qp2();
                        if (bArr3 != null && bArr3.length > 0) {
                            qp22.parseFrom(bArr3);
                        }
                        e712.f182935n.add(qp22);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64662qp2 qp23 = new C64662qp2();
                        if (bArr4 != null && bArr4.length > 0) {
                            qp23.parseFrom(bArr4);
                        }
                        e712.f182936o.add(qp23);
                    }
                    return 0;
                case 10:
                    e712.f182937p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    e712.f182938q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    e712.f182939r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
