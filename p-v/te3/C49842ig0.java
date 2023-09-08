package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ig0 */
public class C49842ig0 extends C47465a {

    /* renamed from: d */
    public int f135312d;

    /* renamed from: e */
    public int f135313e;

    /* renamed from: f */
    public C89349b f135314f;

    /* renamed from: g */
    public int f135315g;

    /* renamed from: h */
    public C50741ow f135316h;

    /* renamed from: i */
    public long f135317i;

    /* renamed from: j */
    public int f135318j;

    /* renamed from: n */
    public LinkedList<C51822we1> f135319n = new LinkedList<>();

    /* renamed from: o */
    public int f135320o;

    /* renamed from: p */
    public C48995cf0 f135321p;

    /* renamed from: q */
    public C89349b f135322q;

    /* renamed from: r */
    public long f135323r;

    /* renamed from: s */
    public C50677og1 f135324s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49842ig0)) {
            return false;
        }
        C49842ig0 ig02 = (C49842ig0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135312d), Integer.valueOf(ig02.f135312d)) && C46238a.m51546a(Integer.valueOf(this.f135313e), Integer.valueOf(ig02.f135313e)) && C46238a.m51546a(this.f135314f, ig02.f135314f) && C46238a.m51546a(Integer.valueOf(this.f135315g), Integer.valueOf(ig02.f135315g)) && C46238a.m51546a(this.f135316h, ig02.f135316h) && C46238a.m51546a(Long.valueOf(this.f135317i), Long.valueOf(ig02.f135317i)) && C46238a.m51546a(Integer.valueOf(this.f135318j), Integer.valueOf(ig02.f135318j)) && C46238a.m51546a(this.f135319n, ig02.f135319n) && C46238a.m51546a(Integer.valueOf(this.f135320o), Integer.valueOf(ig02.f135320o)) && C46238a.m51546a(this.f135321p, ig02.f135321p) && C46238a.m51546a(this.f135322q, ig02.f135322q) && C46238a.m51546a(Long.valueOf(this.f135323r), Long.valueOf(ig02.f135323r)) && C46238a.m51546a(this.f135324s, ig02.f135324s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135312d);
            aVar.mo74318e(2, this.f135313e);
            C89349b bVar = this.f135314f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f135315g);
            C50741ow owVar = this.f135316h;
            if (owVar != null) {
                aVar.mo74322i(5, owVar.computeSize());
                this.f135316h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f135317i);
            aVar.mo74318e(7, this.f135318j);
            aVar.mo74320g(8, 8, this.f135319n);
            aVar.mo74318e(10, this.f135320o);
            C48995cf0 cf02 = this.f135321p;
            if (cf02 != null) {
                aVar.mo74322i(11, cf02.computeSize());
                this.f135321p.writeFields(aVar);
            }
            C89349b bVar2 = this.f135322q;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            aVar.mo74321h(13, this.f135323r);
            C50677og1 og12 = this.f135324s;
            if (og12 == null) {
                return 0;
            }
            aVar.mo74322i(14, og12.computeSize());
            this.f135324s.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f135312d) + 0 + C52418a.m58678e(2, this.f135313e);
            C89349b bVar3 = this.f135314f;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            int e2 = e + C52418a.m58678e(4, this.f135315g);
            C50741ow owVar2 = this.f135316h;
            if (owVar2 != null) {
                e2 += C52418a.m58682i(5, owVar2.computeSize());
            }
            int h = e2 + C52418a.m58681h(6, this.f135317i) + C52418a.m58678e(7, this.f135318j) + C52418a.m58680g(8, 8, this.f135319n) + C52418a.m58678e(10, this.f135320o);
            C48995cf0 cf03 = this.f135321p;
            if (cf03 != null) {
                h += C52418a.m58682i(11, cf03.computeSize());
            }
            C89349b bVar4 = this.f135322q;
            if (bVar4 != null) {
                h += C52418a.m58675b(12, bVar4);
            }
            int h2 = h + C52418a.m58681h(13, this.f135323r);
            C50677og1 og13 = this.f135324s;
            return og13 != null ? h2 + C52418a.m58682i(14, og13.computeSize()) : h2;
        } else if (i2 == 2) {
            this.f135319n.clear();
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
            C49842ig0 ig02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ig02.f135312d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ig02.f135313e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ig02.f135314f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ig02.f135315g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50741ow owVar3 = new C50741ow();
                        if (bArr != null && bArr.length > 0) {
                            owVar3.parseFrom(bArr);
                        }
                        ig02.f135316h = owVar3;
                    }
                    return 0;
                case 6:
                    ig02.f135317i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ig02.f135318j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51822we1 we12 = new C51822we1();
                        if (bArr2 != null && bArr2.length > 0) {
                            we12.parseFrom(bArr2);
                        }
                        ig02.f135319n.add(we12);
                    }
                    return 0;
                case 10:
                    ig02.f135320o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48995cf0 cf04 = new C48995cf0();
                        if (bArr3 != null && bArr3.length > 0) {
                            cf04.parseFrom(bArr3);
                        }
                        ig02.f135321p = cf04;
                    }
                    return 0;
                case 12:
                    ig02.f135322q = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    ig02.f135323r = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50677og1 og14 = new C50677og1();
                        if (bArr4 != null && bArr4.length > 0) {
                            og14.parseFrom(bArr4);
                        }
                        ig02.f135324s = og14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
