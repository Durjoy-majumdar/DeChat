package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xt4 extends C101820nt3 {

    /* renamed from: d */
    public String f332325d;

    /* renamed from: e */
    public int f332326e;

    /* renamed from: f */
    public int f332327f;

    /* renamed from: g */
    public pv4 f332328g;

    /* renamed from: h */
    public pv4 f332329h;

    /* renamed from: i */
    public long f332330i;

    /* renamed from: j */
    public int f332331j;

    /* renamed from: n */
    public long f332332n;

    /* renamed from: o */
    public int f332333o;

    /* renamed from: p */
    public int f332334p;

    /* renamed from: q */
    public int f332335q;

    /* renamed from: r */
    public LinkedList<C101864x23> f332336r = new LinkedList<>();

    /* renamed from: s */
    public int f332337s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xt4)) {
            return false;
        }
        xt4 xt4 = (xt4) aVar;
        return C46238a.m51546a(this.BaseRequest, xt4.BaseRequest) && C46238a.m51546a(this.f332325d, xt4.f332325d) && C46238a.m51546a(Integer.valueOf(this.f332326e), Integer.valueOf(xt4.f332326e)) && C46238a.m51546a(Integer.valueOf(this.f332327f), Integer.valueOf(xt4.f332327f)) && C46238a.m51546a(this.f332328g, xt4.f332328g) && C46238a.m51546a(this.f332329h, xt4.f332329h) && C46238a.m51546a(Long.valueOf(this.f332330i), Long.valueOf(xt4.f332330i)) && C46238a.m51546a(Integer.valueOf(this.f332331j), Integer.valueOf(xt4.f332331j)) && C46238a.m51546a(Long.valueOf(this.f332332n), Long.valueOf(xt4.f332332n)) && C46238a.m51546a(Integer.valueOf(this.f332333o), Integer.valueOf(xt4.f332333o)) && C46238a.m51546a(Integer.valueOf(this.f332334p), Integer.valueOf(xt4.f332334p)) && C46238a.m51546a(Integer.valueOf(this.f332335q), Integer.valueOf(xt4.f332335q)) && C46238a.m51546a(this.f332336r, xt4.f332336r) && C46238a.m51546a(Integer.valueOf(this.f332337s), Integer.valueOf(xt4.f332337s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f332325d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f332326e);
            aVar.mo74318e(4, this.f332327f);
            pv4 pv4 = this.f332328g;
            if (pv4 != null) {
                aVar.mo74322i(5, pv4.computeSize());
                this.f332328g.writeFields(aVar);
            }
            pv4 pv42 = this.f332329h;
            if (pv42 != null) {
                aVar.mo74322i(6, pv42.computeSize());
                this.f332329h.writeFields(aVar);
            }
            aVar.mo74321h(7, this.f332330i);
            aVar.mo74318e(8, this.f332331j);
            aVar.mo74321h(9, this.f332332n);
            aVar.mo74318e(10, this.f332333o);
            aVar.mo74318e(11, this.f332334p);
            aVar.mo74318e(12, this.f332335q);
            aVar.mo74320g(13, 8, this.f332336r);
            aVar.mo74318e(14, this.f332337s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str2 = this.f332325d;
            if (str2 != null) {
                i3 += C52418a.m58683j(2, str2);
            }
            int e = i3 + C52418a.m58678e(3, this.f332326e) + C52418a.m58678e(4, this.f332327f);
            pv4 pv43 = this.f332328g;
            if (pv43 != null) {
                e += C52418a.m58682i(5, pv43.computeSize());
            }
            pv4 pv44 = this.f332329h;
            if (pv44 != null) {
                e += C52418a.m58682i(6, pv44.computeSize());
            }
            return e + C52418a.m58681h(7, this.f332330i) + C52418a.m58678e(8, this.f332331j) + C52418a.m58681h(9, this.f332332n) + C52418a.m58678e(10, this.f332333o) + C52418a.m58678e(11, this.f332334p) + C52418a.m58678e(12, this.f332335q) + C52418a.m58680g(13, 8, this.f332336r) + C52418a.m58678e(14, this.f332337s);
        } else if (i2 == 2) {
            this.f332336r.clear();
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
            xt4 xt4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        xt4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xt4.f332325d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xt4.f332326e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    xt4.f332327f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        pv4 pv45 = new pv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            pv45.parseFrom(bArr2);
                        }
                        xt4.f332328g = pv45;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        pv4 pv46 = new pv4();
                        if (bArr3 != null && bArr3.length > 0) {
                            pv46.parseFrom(bArr3);
                        }
                        xt4.f332329h = pv46;
                    }
                    return 0;
                case 7:
                    xt4.f332330i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    xt4.f332331j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    xt4.f332332n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    xt4.f332333o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    xt4.f332334p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    xt4.f332335q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C101864x23 x232 = new C101864x23();
                        if (bArr4 != null && bArr4.length > 0) {
                            x232.parseFrom(bArr4);
                        }
                        xt4.f332336r.add(x232);
                    }
                    return 0;
                case 14:
                    xt4.f332337s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
