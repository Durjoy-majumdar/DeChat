package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class ga4 extends C47465a {

    /* renamed from: d */
    public int f298277d;

    /* renamed from: e */
    public int f298278e;

    /* renamed from: f */
    public int f298279f;

    /* renamed from: g */
    public vt4 f298280g;

    /* renamed from: h */
    public int f298281h;

    /* renamed from: i */
    public int f298282i;

    /* renamed from: j */
    public int f298283j;

    /* renamed from: n */
    public int f298284n;

    /* renamed from: o */
    public LinkedList<Integer> f298285o = new LinkedList<>();

    /* renamed from: p */
    public int f298286p;

    /* renamed from: q */
    public LinkedList<Integer> f298287q = new LinkedList<>();

    /* renamed from: r */
    public int f298288r;

    /* renamed from: s */
    public LinkedList<Integer> f298289s = new LinkedList<>();

    /* renamed from: t */
    public String f298290t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ga4)) {
            return false;
        }
        ga4 ga4 = (ga4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298277d), Integer.valueOf(ga4.f298277d)) && C46238a.m51546a(Integer.valueOf(this.f298278e), Integer.valueOf(ga4.f298278e)) && C46238a.m51546a(Integer.valueOf(this.f298279f), Integer.valueOf(ga4.f298279f)) && C46238a.m51546a(this.f298280g, ga4.f298280g) && C46238a.m51546a(Integer.valueOf(this.f298281h), Integer.valueOf(ga4.f298281h)) && C46238a.m51546a(Integer.valueOf(this.f298282i), Integer.valueOf(ga4.f298282i)) && C46238a.m51546a(Integer.valueOf(this.f298283j), Integer.valueOf(ga4.f298283j)) && C46238a.m51546a(Integer.valueOf(this.f298284n), Integer.valueOf(ga4.f298284n)) && C46238a.m51546a(this.f298285o, ga4.f298285o) && C46238a.m51546a(Integer.valueOf(this.f298286p), Integer.valueOf(ga4.f298286p)) && C46238a.m51546a(this.f298287q, ga4.f298287q) && C46238a.m51546a(Integer.valueOf(this.f298288r), Integer.valueOf(ga4.f298288r)) && C46238a.m51546a(this.f298289s, ga4.f298289s) && C46238a.m51546a(this.f298290t, ga4.f298290t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f298280g != null) {
                aVar.mo74318e(1, this.f298277d);
                aVar.mo74318e(2, this.f298278e);
                aVar.mo74318e(3, this.f298279f);
                vt4 vt4 = this.f298280g;
                if (vt4 != null) {
                    aVar.mo74322i(4, vt4.computeSize());
                    this.f298280g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f298281h);
                aVar.mo74318e(6, this.f298282i);
                aVar.mo74318e(7, this.f298283j);
                aVar.mo74318e(8, this.f298284n);
                aVar.mo74324k(9, 2, this.f298285o);
                aVar.mo74318e(10, this.f298286p);
                aVar.mo74324k(11, 2, this.f298287q);
                aVar.mo74318e(12, this.f298288r);
                aVar.mo74324k(13, 2, this.f298289s);
                String str = this.f298290t;
                if (str == null) {
                    return 0;
                }
                aVar.mo74323j(14, str);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Addr");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f298277d) + 0 + C52418a.m58678e(2, this.f298278e) + C52418a.m58678e(3, this.f298279f);
            vt4 vt42 = this.f298280g;
            if (vt42 != null) {
                e += C52418a.m58682i(4, vt42.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f298281h) + C52418a.m58678e(6, this.f298282i) + C52418a.m58678e(7, this.f298283j) + C52418a.m58678e(8, this.f298284n) + C52418a.m58684k(9, 2, this.f298285o) + C52418a.m58678e(10, this.f298286p) + C52418a.m58684k(11, 2, this.f298287q) + C52418a.m58678e(12, this.f298288r) + C52418a.m58684k(13, 2, this.f298289s);
            String str2 = this.f298290t;
            return str2 != null ? e2 + C52418a.m58683j(14, str2) : e2;
        } else if (i2 == 2) {
            this.f298285o.clear();
            this.f298287q.clear();
            this.f298289s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298280g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Addr");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ga4 ga4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ga4.f298277d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ga4.f298278e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ga4.f298279f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        vt4 vt43 = new vt4();
                        if (bArr != null && bArr.length > 0) {
                            vt43.parseFrom(bArr);
                        }
                        ga4.f298280g = vt43;
                    }
                    return 0;
                case 5:
                    ga4.f298281h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ga4.f298282i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ga4.f298283j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ga4.f298284n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    ga4.f298285o = linkedList;
                    return 0;
                case 10:
                    ga4.f298286p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                    }
                    ga4.f298287q = linkedList2;
                    return 0;
                case 12:
                    ga4.f298288r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    byte[] bArr4 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar6 = new C102536a(bArr4, 0, bArr4.length);
                    LinkedList<Integer> linkedList3 = new LinkedList<>();
                    while (aVar6.f301908c < aVar6.f301907b) {
                        linkedList3.add(Integer.valueOf(aVar6.mo142153f()));
                    }
                    ga4.f298289s = linkedList3;
                    return 0;
                case 14:
                    ga4.f298290t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
