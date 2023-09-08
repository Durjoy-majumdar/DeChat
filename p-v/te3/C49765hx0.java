package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hx0 */
public class C49765hx0 extends C47465a {

    /* renamed from: d */
    public FinderContact f134919d;

    /* renamed from: e */
    public int f134920e;

    /* renamed from: f */
    public int f134921f;

    /* renamed from: g */
    public int f134922g;

    /* renamed from: h */
    public int f134923h;

    /* renamed from: i */
    public C48770aw0 f134924i;

    /* renamed from: j */
    public String f134925j;

    /* renamed from: n */
    public int f134926n;

    /* renamed from: o */
    public String f134927o;

    /* renamed from: p */
    public C89349b f134928p;

    /* renamed from: q */
    public boolean f134929q;

    /* renamed from: r */
    public LinkedList<C48770aw0> f134930r = new LinkedList<>();

    /* renamed from: s */
    public int f134931s;

    /* renamed from: t */
    public long f134932t;

    /* renamed from: u */
    public boolean f134933u;

    /* renamed from: v */
    public long f134934v;

    /* renamed from: w */
    public C64756up2 f134935w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49765hx0)) {
            return false;
        }
        C49765hx0 hx02 = (C49765hx0) aVar;
        return C46238a.m51546a(this.f134919d, hx02.f134919d) && C46238a.m51546a(Integer.valueOf(this.f134920e), Integer.valueOf(hx02.f134920e)) && C46238a.m51546a(Integer.valueOf(this.f134921f), Integer.valueOf(hx02.f134921f)) && C46238a.m51546a(Integer.valueOf(this.f134922g), Integer.valueOf(hx02.f134922g)) && C46238a.m51546a(Integer.valueOf(this.f134923h), Integer.valueOf(hx02.f134923h)) && C46238a.m51546a(this.f134924i, hx02.f134924i) && C46238a.m51546a(this.f134925j, hx02.f134925j) && C46238a.m51546a(Integer.valueOf(this.f134926n), Integer.valueOf(hx02.f134926n)) && C46238a.m51546a(this.f134927o, hx02.f134927o) && C46238a.m51546a(this.f134928p, hx02.f134928p) && C46238a.m51546a(Boolean.valueOf(this.f134929q), Boolean.valueOf(hx02.f134929q)) && C46238a.m51546a(this.f134930r, hx02.f134930r) && C46238a.m51546a(Integer.valueOf(this.f134931s), Integer.valueOf(hx02.f134931s)) && C46238a.m51546a(Long.valueOf(this.f134932t), Long.valueOf(hx02.f134932t)) && C46238a.m51546a(Boolean.valueOf(this.f134933u), Boolean.valueOf(hx02.f134933u)) && C46238a.m51546a(Long.valueOf(this.f134934v), Long.valueOf(hx02.f134934v)) && C46238a.m51546a(this.f134935w, hx02.f134935w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f134919d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f134919d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f134920e);
            aVar.mo74318e(3, this.f134921f);
            aVar.mo74318e(4, this.f134922g);
            aVar.mo74318e(5, this.f134923h);
            C48770aw0 aw02 = this.f134924i;
            if (aw02 != null) {
                aVar.mo74322i(6, aw02.computeSize());
                this.f134924i.writeFields(aVar);
            }
            String str = this.f134925j;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            aVar.mo74318e(10, this.f134926n);
            String str2 = this.f134927o;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            C89349b bVar = this.f134928p;
            if (bVar != null) {
                aVar.mo74315b(12, bVar);
            }
            aVar.mo74314a(13, this.f134929q);
            aVar.mo74320g(14, 8, this.f134930r);
            aVar.mo74318e(15, this.f134931s);
            aVar.mo74321h(16, this.f134932t);
            aVar.mo74314a(17, this.f134933u);
            aVar.mo74321h(18, this.f134934v);
            C64756up2 up22 = this.f134935w;
            if (up22 != null) {
                aVar.mo74322i(19, up22.computeSize());
                this.f134935w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            FinderContact finderContact2 = this.f134919d;
            if (finderContact2 != null) {
                i3 = C52418a.m58682i(1, finderContact2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f134920e) + C52418a.m58678e(3, this.f134921f) + C52418a.m58678e(4, this.f134922g) + C52418a.m58678e(5, this.f134923h);
            C48770aw0 aw03 = this.f134924i;
            if (aw03 != null) {
                e += C52418a.m58682i(6, aw03.computeSize());
            }
            String str3 = this.f134925j;
            if (str3 != null) {
                e += C52418a.m58683j(9, str3);
            }
            int e2 = e + C52418a.m58678e(10, this.f134926n);
            String str4 = this.f134927o;
            if (str4 != null) {
                e2 += C52418a.m58683j(11, str4);
            }
            C89349b bVar2 = this.f134928p;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(12, bVar2);
            }
            int a = e2 + C52418a.m58674a(13, this.f134929q) + C52418a.m58680g(14, 8, this.f134930r) + C52418a.m58678e(15, this.f134931s) + C52418a.m58681h(16, this.f134932t) + C52418a.m58674a(17, this.f134933u) + C52418a.m58681h(18, this.f134934v);
            C64756up2 up23 = this.f134935w;
            return up23 != null ? a + C52418a.m58682i(19, up23.computeSize()) : a;
        } else if (i2 == 2) {
            this.f134930r.clear();
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
            C49765hx0 hx02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        hx02.f134919d = finderContact3;
                    }
                    return 0;
                case 2:
                    hx02.f134920e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hx02.f134921f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    hx02.f134922g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hx02.f134923h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48770aw0 aw04 = new C48770aw0();
                        if (bArr2 != null && bArr2.length > 0) {
                            aw04.parseFrom(bArr2);
                        }
                        hx02.f134924i = aw04;
                    }
                    return 0;
                case 9:
                    hx02.f134925j = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hx02.f134926n = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    hx02.f134927o = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    hx02.f134928p = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    hx02.f134929q = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48770aw0 aw05 = new C48770aw0();
                        if (bArr3 != null && bArr3.length > 0) {
                            aw05.parseFrom(bArr3);
                        }
                        hx02.f134930r.add(aw05);
                    }
                    return 0;
                case 15:
                    hx02.f134931s = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    hx02.f134932t = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    hx02.f134933u = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    hx02.f134934v = aVar3.mo141631i(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64756up2 up24 = new C64756up2();
                        if (bArr4 != null && bArr4.length > 0) {
                            up24.parseFrom(bArr4);
                        }
                        hx02.f134935w = up24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
