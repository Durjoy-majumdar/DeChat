package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pr3 */
public class C22522pr3 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C22497fg> f64444d = new LinkedList<>();

    /* renamed from: e */
    public int f64445e;

    /* renamed from: f */
    public int f64446f;

    /* renamed from: g */
    public int f64447g;

    /* renamed from: h */
    public long f64448h;

    /* renamed from: i */
    public int f64449i;

    /* renamed from: j */
    public int f64450j;

    /* renamed from: n */
    public long f64451n;

    /* renamed from: o */
    public C22509lp3 f64452o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22522pr3)) {
            return false;
        }
        C22522pr3 pr32 = (C22522pr3) aVar;
        return C46238a.m51546a(this.BaseRequest, pr32.BaseRequest) && C46238a.m51546a(this.f64444d, pr32.f64444d) && C46238a.m51546a(Integer.valueOf(this.f64445e), Integer.valueOf(pr32.f64445e)) && C46238a.m51546a(Integer.valueOf(this.f64446f), Integer.valueOf(pr32.f64446f)) && C46238a.m51546a(Integer.valueOf(this.f64447g), Integer.valueOf(pr32.f64447g)) && C46238a.m51546a(Long.valueOf(this.f64448h), Long.valueOf(pr32.f64448h)) && C46238a.m51546a(Integer.valueOf(this.f64449i), Integer.valueOf(pr32.f64449i)) && C46238a.m51546a(Integer.valueOf(this.f64450j), Integer.valueOf(pr32.f64450j)) && C46238a.m51546a(Long.valueOf(this.f64451n), Long.valueOf(pr32.f64451n)) && C46238a.m51546a(this.f64452o, pr32.f64452o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f64444d);
            aVar.mo74318e(3, this.f64445e);
            aVar.mo74318e(4, this.f64446f);
            aVar.mo74318e(5, this.f64447g);
            aVar.mo74321h(6, this.f64448h);
            aVar.mo74318e(7, this.f64449i);
            aVar.mo74318e(8, this.f64450j);
            aVar.mo74321h(9, this.f64451n);
            C22509lp3 lp32 = this.f64452o;
            if (lp32 != null) {
                aVar.mo74322i(10, lp32.computeSize());
                this.f64452o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f64444d) + C52418a.m58678e(3, this.f64445e) + C52418a.m58678e(4, this.f64446f) + C52418a.m58678e(5, this.f64447g) + C52418a.m58681h(6, this.f64448h) + C52418a.m58678e(7, this.f64449i) + C52418a.m58678e(8, this.f64450j) + C52418a.m58681h(9, this.f64451n);
            C22509lp3 lp33 = this.f64452o;
            return lp33 != null ? g + C52418a.m58682i(10, lp33.computeSize()) : g;
        } else if (i == 2) {
            this.f64444d.clear();
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
            C22522pr3 pr32 = objArr[1];
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
                        pr32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22497fg fgVar = new C22497fg();
                        if (bArr2 != null && bArr2.length > 0) {
                            fgVar.parseFrom(bArr2);
                        }
                        pr32.f64444d.add(fgVar);
                    }
                    return 0;
                case 3:
                    pr32.f64445e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pr32.f64446f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    pr32.f64447g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pr32.f64448h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    pr32.f64449i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pr32.f64450j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pr32.f64451n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22509lp3 lp34 = new C22509lp3();
                        if (bArr3 != null && bArr3.length > 0) {
                            lp34.parseFrom(bArr3);
                        }
                        pr32.f64452o = lp34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
