package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nv4 extends C101820nt3 {

    /* renamed from: d */
    public int f298933d;

    /* renamed from: e */
    public long f298934e;

    /* renamed from: f */
    public int f298935f;

    /* renamed from: g */
    public int f298936g;

    /* renamed from: h */
    public int f298937h;

    /* renamed from: i */
    public LinkedList<qv4> f298938i = new LinkedList<>();

    /* renamed from: j */
    public int f298939j;

    /* renamed from: n */
    public int f298940n;

    /* renamed from: o */
    public LinkedList<C101864x23> f298941o = new LinkedList<>();

    /* renamed from: p */
    public int f298942p;

    /* renamed from: q */
    public int f298943q;

    /* renamed from: r */
    public long f298944r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nv4)) {
            return false;
        }
        nv4 nv4 = (nv4) aVar;
        return C46238a.m51546a(this.BaseRequest, nv4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f298933d), Integer.valueOf(nv4.f298933d)) && C46238a.m51546a(Long.valueOf(this.f298934e), Long.valueOf(nv4.f298934e)) && C46238a.m51546a(Integer.valueOf(this.f298935f), Integer.valueOf(nv4.f298935f)) && C46238a.m51546a(Integer.valueOf(this.f298936g), Integer.valueOf(nv4.f298936g)) && C46238a.m51546a(Integer.valueOf(this.f298937h), Integer.valueOf(nv4.f298937h)) && C46238a.m51546a(this.f298938i, nv4.f298938i) && C46238a.m51546a(Integer.valueOf(this.f298939j), Integer.valueOf(nv4.f298939j)) && C46238a.m51546a(Integer.valueOf(this.f298940n), Integer.valueOf(nv4.f298940n)) && C46238a.m51546a(this.f298941o, nv4.f298941o) && C46238a.m51546a(Integer.valueOf(this.f298942p), Integer.valueOf(nv4.f298942p)) && C46238a.m51546a(Integer.valueOf(this.f298943q), Integer.valueOf(nv4.f298943q)) && C46238a.m51546a(Long.valueOf(this.f298944r), Long.valueOf(nv4.f298944r));
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
            aVar.mo74318e(2, this.f298933d);
            aVar.mo74321h(3, this.f298934e);
            aVar.mo74318e(4, this.f298935f);
            aVar.mo74318e(5, this.f298936g);
            aVar.mo74318e(6, this.f298937h);
            aVar.mo74320g(7, 8, this.f298938i);
            aVar.mo74318e(8, this.f298939j);
            aVar.mo74318e(9, this.f298940n);
            aVar.mo74320g(10, 8, this.f298941o);
            aVar.mo74318e(11, this.f298942p);
            aVar.mo74318e(12, this.f298943q);
            aVar.mo74321h(14, this.f298944r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            return (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f298933d) + C52418a.m58681h(3, this.f298934e) + C52418a.m58678e(4, this.f298935f) + C52418a.m58678e(5, this.f298936g) + C52418a.m58678e(6, this.f298937h) + C52418a.m58680g(7, 8, this.f298938i) + C52418a.m58678e(8, this.f298939j) + C52418a.m58678e(9, this.f298940n) + C52418a.m58680g(10, 8, this.f298941o) + C52418a.m58678e(11, this.f298942p) + C52418a.m58678e(12, this.f298943q) + C52418a.m58681h(14, this.f298944r);
        } else if (i2 == 2) {
            this.f298938i.clear();
            this.f298941o.clear();
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
            nv4 nv4 = objArr[1];
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
                        nv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    nv4.f298933d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nv4.f298934e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    nv4.f298935f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nv4.f298936g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nv4.f298937h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        qv4 qv4 = new qv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv4.parseFrom(bArr2);
                        }
                        nv4.f298938i.add(qv4);
                    }
                    return 0;
                case 8:
                    nv4.f298939j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nv4.f298940n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101864x23 x232 = new C101864x23();
                        if (bArr3 != null && bArr3.length > 0) {
                            x232.parseFrom(bArr3);
                        }
                        nv4.f298941o.add(x232);
                    }
                    return 0;
                case 11:
                    nv4.f298942p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    nv4.f298943q = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    nv4.f298944r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
