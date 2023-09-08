package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class vv4 extends C101820nt3 {

    /* renamed from: d */
    public int f299690d;

    /* renamed from: e */
    public int f299691e;

    /* renamed from: f */
    public int f299692f;

    /* renamed from: g */
    public int f299693g;

    /* renamed from: h */
    public int f299694h;

    /* renamed from: i */
    public int f299695i;

    /* renamed from: j */
    public int f299696j;

    /* renamed from: n */
    public LinkedList<Integer> f299697n = new LinkedList<>();

    /* renamed from: o */
    public int f299698o;

    /* renamed from: p */
    public int f299699p;

    /* renamed from: q */
    public LinkedList<Integer> f299700q = new LinkedList<>();

    /* renamed from: r */
    public int f299701r;

    /* renamed from: s */
    public int f299702s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vv4)) {
            return false;
        }
        vv4 vv4 = (vv4) aVar;
        return C46238a.m51546a(this.BaseRequest, vv4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f299690d), Integer.valueOf(vv4.f299690d)) && C46238a.m51546a(Integer.valueOf(this.f299691e), Integer.valueOf(vv4.f299691e)) && C46238a.m51546a(Integer.valueOf(this.f299692f), Integer.valueOf(vv4.f299692f)) && C46238a.m51546a(Integer.valueOf(this.f299693g), Integer.valueOf(vv4.f299693g)) && C46238a.m51546a(Integer.valueOf(this.f299694h), Integer.valueOf(vv4.f299694h)) && C46238a.m51546a(Integer.valueOf(this.f299695i), Integer.valueOf(vv4.f299695i)) && C46238a.m51546a(Integer.valueOf(this.f299696j), Integer.valueOf(vv4.f299696j)) && C46238a.m51546a(this.f299697n, vv4.f299697n) && C46238a.m51546a(Integer.valueOf(this.f299698o), Integer.valueOf(vv4.f299698o)) && C46238a.m51546a(Integer.valueOf(this.f299699p), Integer.valueOf(vv4.f299699p)) && C46238a.m51546a(this.f299700q, vv4.f299700q) && C46238a.m51546a(Integer.valueOf(this.f299701r), Integer.valueOf(vv4.f299701r)) && C46238a.m51546a(Integer.valueOf(this.f299702s), Integer.valueOf(vv4.f299702s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f299690d);
            aVar.mo74318e(3, this.f299691e);
            aVar.mo74318e(4, this.f299692f);
            aVar.mo74318e(5, this.f299693g);
            aVar.mo74318e(6, this.f299694h);
            aVar.mo74318e(7, this.f299695i);
            aVar.mo74318e(8, this.f299696j);
            aVar.mo74324k(9, 2, this.f299697n);
            aVar.mo74318e(10, this.f299698o);
            aVar.mo74318e(11, this.f299699p);
            aVar.mo74324k(12, 2, this.f299700q);
            aVar.mo74318e(13, this.f299701r);
            aVar.mo74318e(14, this.f299702s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            return (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f299690d) + C52418a.m58678e(3, this.f299691e) + C52418a.m58678e(4, this.f299692f) + C52418a.m58678e(5, this.f299693g) + C52418a.m58678e(6, this.f299694h) + C52418a.m58678e(7, this.f299695i) + C52418a.m58678e(8, this.f299696j) + C52418a.m58684k(9, 2, this.f299697n) + C52418a.m58678e(10, this.f299698o) + C52418a.m58678e(11, this.f299699p) + C52418a.m58684k(12, 2, this.f299700q) + C52418a.m58678e(13, this.f299701r) + C52418a.m58678e(14, this.f299702s);
        } else if (i2 == 2) {
            this.f299697n.clear();
            this.f299700q.clear();
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
            vv4 vv4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        vv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vv4.f299690d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vv4.f299691e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vv4.f299692f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vv4.f299693g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vv4.f299694h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vv4.f299695i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vv4.f299696j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    vv4.f299697n = linkedList;
                    return 0;
                case 10:
                    vv4.f299698o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    vv4.f299699p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                    }
                    vv4.f299700q = linkedList2;
                    return 0;
                case 13:
                    vv4.f299701r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    vv4.f299702s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
