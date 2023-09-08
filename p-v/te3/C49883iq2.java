package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iq2 */
public class C49883iq2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C89349b> f135581d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C89349b> f135582e = new LinkedList<>();

    /* renamed from: f */
    public int f135583f;

    /* renamed from: g */
    public LinkedList<String> f135584g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<String> f135585h = new LinkedList<>();

    /* renamed from: i */
    public boolean f135586i;

    /* renamed from: j */
    public C51020qw0 f135587j;

    /* renamed from: n */
    public C51946xa1 f135588n;

    /* renamed from: o */
    public int f135589o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49883iq2)) {
            return false;
        }
        C49883iq2 iq22 = (C49883iq2) aVar;
        return C46238a.m51546a(this.f135581d, iq22.f135581d) && C46238a.m51546a(this.f135582e, iq22.f135582e) && C46238a.m51546a(Integer.valueOf(this.f135583f), Integer.valueOf(iq22.f135583f)) && C46238a.m51546a(this.f135584g, iq22.f135584g) && C46238a.m51546a(this.f135585h, iq22.f135585h) && C46238a.m51546a(Boolean.valueOf(this.f135586i), Boolean.valueOf(iq22.f135586i)) && C46238a.m51546a(this.f135587j, iq22.f135587j) && C46238a.m51546a(this.f135588n, iq22.f135588n) && C46238a.m51546a(Integer.valueOf(this.f135589o), Integer.valueOf(iq22.f135589o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 6, this.f135581d);
            aVar.mo74320g(2, 6, this.f135582e);
            aVar.mo74318e(3, this.f135583f);
            aVar.mo74320g(4, 1, this.f135584g);
            aVar.mo74320g(5, 1, this.f135585h);
            aVar.mo74314a(6, this.f135586i);
            C51020qw0 qw02 = this.f135587j;
            if (qw02 != null) {
                aVar.mo74322i(7, qw02.computeSize());
                this.f135587j.writeFields(aVar);
            }
            C51946xa1 xa12 = this.f135588n;
            if (xa12 != null) {
                aVar.mo74322i(8, xa12.computeSize());
                this.f135588n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f135589o);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 6, this.f135581d) + 0 + C52418a.m58680g(2, 6, this.f135582e) + C52418a.m58678e(3, this.f135583f) + C52418a.m58680g(4, 1, this.f135584g) + C52418a.m58680g(5, 1, this.f135585h) + C52418a.m58674a(6, this.f135586i);
            C51020qw0 qw03 = this.f135587j;
            if (qw03 != null) {
                g += C52418a.m58682i(7, qw03.computeSize());
            }
            C51946xa1 xa13 = this.f135588n;
            if (xa13 != null) {
                g += C52418a.m58682i(8, xa13.computeSize());
            }
            return g + C52418a.m58678e(9, this.f135589o);
        } else if (i == 2) {
            this.f135581d.clear();
            this.f135582e.clear();
            this.f135584g.clear();
            this.f135585h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49883iq2 iq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iq22.f135581d.add(aVar3.mo141626d(intValue));
                    return 0;
                case 2:
                    iq22.f135582e.add(aVar3.mo141626d(intValue));
                    return 0;
                case 3:
                    iq22.f135583f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    iq22.f135584g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    iq22.f135585h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    iq22.f135586i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51020qw0 qw04 = new C51020qw0();
                        if (bArr != null && bArr.length > 0) {
                            qw04.parseFrom(bArr);
                        }
                        iq22.f135587j = qw04;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51946xa1 xa14 = new C51946xa1();
                        if (bArr2 != null && bArr2.length > 0) {
                            xa14.parseFrom(bArr2);
                        }
                        iq22.f135588n = xa14;
                    }
                    return 0;
                case 9:
                    iq22.f135589o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
