package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mb1 */
public class C64550mb1 extends C47465a {

    /* renamed from: d */
    public long f184258d;

    /* renamed from: e */
    public int f184259e;

    /* renamed from: f */
    public long f184260f;

    /* renamed from: g */
    public String f184261g;

    /* renamed from: h */
    public long f184262h;

    /* renamed from: i */
    public int f184263i;

    /* renamed from: j */
    public int f184264j;

    /* renamed from: n */
    public C51019qw f184265n;

    /* renamed from: o */
    public FinderContact f184266o;

    /* renamed from: p */
    public float f184267p;

    /* renamed from: q */
    public String f184268q;

    /* renamed from: r */
    public LinkedList<Integer> f184269r = new LinkedList<>();

    /* renamed from: s */
    public int f184270s;

    /* renamed from: t */
    public int f184271t;

    /* renamed from: u */
    public C64575nb1 f184272u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64550mb1)) {
            return false;
        }
        C64550mb1 mb12 = (C64550mb1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184258d), Long.valueOf(mb12.f184258d)) && C46238a.m51546a(Integer.valueOf(this.f184259e), Integer.valueOf(mb12.f184259e)) && C46238a.m51546a(Long.valueOf(this.f184260f), Long.valueOf(mb12.f184260f)) && C46238a.m51546a(this.f184261g, mb12.f184261g) && C46238a.m51546a(Long.valueOf(this.f184262h), Long.valueOf(mb12.f184262h)) && C46238a.m51546a(Integer.valueOf(this.f184263i), Integer.valueOf(mb12.f184263i)) && C46238a.m51546a(Integer.valueOf(this.f184264j), Integer.valueOf(mb12.f184264j)) && C46238a.m51546a(this.f184265n, mb12.f184265n) && C46238a.m51546a(this.f184266o, mb12.f184266o) && C46238a.m51546a(Float.valueOf(this.f184267p), Float.valueOf(mb12.f184267p)) && C46238a.m51546a(this.f184268q, mb12.f184268q) && C46238a.m51546a(this.f184269r, mb12.f184269r) && C46238a.m51546a(Integer.valueOf(this.f184270s), Integer.valueOf(mb12.f184270s)) && C46238a.m51546a(Integer.valueOf(this.f184271t), Integer.valueOf(mb12.f184271t)) && C46238a.m51546a(this.f184272u, mb12.f184272u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184258d);
            aVar.mo74318e(2, this.f184259e);
            aVar.mo74321h(3, this.f184260f);
            String str = this.f184261g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f184262h);
            aVar.mo74318e(6, this.f184263i);
            aVar.mo74318e(7, this.f184264j);
            C51019qw qwVar = this.f184265n;
            if (qwVar != null) {
                aVar.mo74322i(8, qwVar.computeSize());
                this.f184265n.writeFields(aVar);
            }
            FinderContact finderContact = this.f184266o;
            if (finderContact != null) {
                aVar.mo74322i(9, finderContact.computeSize());
                this.f184266o.writeFields(aVar);
            }
            aVar.mo74317d(10, this.f184267p);
            String str2 = this.f184268q;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74320g(12, 2, this.f184269r);
            aVar.mo74318e(13, this.f184270s);
            aVar.mo74318e(14, this.f184271t);
            C64575nb1 nb12 = this.f184272u;
            if (nb12 != null) {
                aVar.mo74322i(15, nb12.computeSize());
                this.f184272u.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f184258d) + 0 + C52418a.m58678e(2, this.f184259e) + C52418a.m58681h(3, this.f184260f);
            String str3 = this.f184261g;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            int h2 = h + C52418a.m58681h(5, this.f184262h) + C52418a.m58678e(6, this.f184263i) + C52418a.m58678e(7, this.f184264j);
            C51019qw qwVar2 = this.f184265n;
            if (qwVar2 != null) {
                h2 += C52418a.m58682i(8, qwVar2.computeSize());
            }
            FinderContact finderContact2 = this.f184266o;
            if (finderContact2 != null) {
                h2 += C52418a.m58682i(9, finderContact2.computeSize());
            }
            int d = h2 + C52418a.m58677d(10, this.f184267p);
            String str4 = this.f184268q;
            if (str4 != null) {
                d += C52418a.m58683j(11, str4);
            }
            int g = d + C52418a.m58680g(12, 2, this.f184269r) + C52418a.m58678e(13, this.f184270s) + C52418a.m58678e(14, this.f184271t);
            C64575nb1 nb13 = this.f184272u;
            return nb13 != null ? g + C52418a.m58682i(15, nb13.computeSize()) : g;
        } else if (i2 == 2) {
            this.f184269r.clear();
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
            C64550mb1 mb12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mb12.f184258d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    mb12.f184259e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mb12.f184260f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    mb12.f184261g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mb12.f184262h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    mb12.f184263i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mb12.f184264j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51019qw qwVar3 = new C51019qw();
                        if (bArr != null && bArr.length > 0) {
                            qwVar3.parseFrom(bArr);
                        }
                        mb12.f184265n = qwVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderContact3.parseFrom(bArr2);
                        }
                        mb12.f184266o = finderContact3;
                    }
                    return 0;
                case 10:
                    mb12.f184267p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    mb12.f184268q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    mb12.f184269r.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 13:
                    mb12.f184270s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    mb12.f184271t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64575nb1 nb14 = new C64575nb1();
                        if (bArr3 != null && bArr3.length > 0) {
                            nb14.parseFrom(bArr3);
                        }
                        mb12.f184272u = nb14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
