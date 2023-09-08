package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gt4 extends C101820nt3 {

    /* renamed from: d */
    public String f134259d;

    /* renamed from: e */
    public C51018qv3 f134260e;

    /* renamed from: f */
    public int f134261f;

    /* renamed from: g */
    public String f134262g;

    /* renamed from: h */
    public int f134263h;

    /* renamed from: i */
    public int f134264i;

    /* renamed from: j */
    public int f134265j;

    /* renamed from: n */
    public int f134266n;

    /* renamed from: o */
    public int f134267o;

    /* renamed from: p */
    public int f134268p;

    /* renamed from: q */
    public int f134269q;

    /* renamed from: r */
    public LinkedList<C51163rv3> f134270r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C51018qv3> f134271s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gt4)) {
            return false;
        }
        gt4 gt4 = (gt4) aVar;
        return C46238a.m51546a(this.BaseRequest, gt4.BaseRequest) && C46238a.m51546a(this.f134259d, gt4.f134259d) && C46238a.m51546a(this.f134260e, gt4.f134260e) && C46238a.m51546a(Integer.valueOf(this.f134261f), Integer.valueOf(gt4.f134261f)) && C46238a.m51546a(this.f134262g, gt4.f134262g) && C46238a.m51546a(Integer.valueOf(this.f134263h), Integer.valueOf(gt4.f134263h)) && C46238a.m51546a(Integer.valueOf(this.f134264i), Integer.valueOf(gt4.f134264i)) && C46238a.m51546a(Integer.valueOf(this.f134265j), Integer.valueOf(gt4.f134265j)) && C46238a.m51546a(Integer.valueOf(this.f134266n), Integer.valueOf(gt4.f134266n)) && C46238a.m51546a(Integer.valueOf(this.f134267o), Integer.valueOf(gt4.f134267o)) && C46238a.m51546a(Integer.valueOf(this.f134268p), Integer.valueOf(gt4.f134268p)) && C46238a.m51546a(Integer.valueOf(this.f134269q), Integer.valueOf(gt4.f134269q)) && C46238a.m51546a(this.f134270r, gt4.f134270r) && C46238a.m51546a(this.f134271s, gt4.f134271s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f134260e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f134259d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f134260e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f134260e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f134261f);
                String str2 = this.f134262g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f134263h);
                aVar.mo74318e(7, this.f134264i);
                aVar.mo74318e(8, this.f134265j);
                aVar.mo74318e(9, this.f134266n);
                aVar.mo74318e(10, this.f134267o);
                aVar.mo74318e(11, this.f134268p);
                aVar.mo74318e(12, this.f134269q);
                aVar.mo74320g(13, 8, this.f134270r);
                aVar.mo74320g(14, 8, this.f134271s);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str3 = this.f134259d;
            if (str3 != null) {
                i3 += C52418a.m58683j(2, str3);
            }
            C51018qv3 qv33 = this.f134260e;
            if (qv33 != null) {
                i3 += C52418a.m58682i(3, qv33.computeSize());
            }
            int e = i3 + C52418a.m58678e(4, this.f134261f);
            String str4 = this.f134262g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f134263h) + C52418a.m58678e(7, this.f134264i) + C52418a.m58678e(8, this.f134265j) + C52418a.m58678e(9, this.f134266n) + C52418a.m58678e(10, this.f134267o) + C52418a.m58678e(11, this.f134268p) + C52418a.m58678e(12, this.f134269q) + C52418a.m58680g(13, 8, this.f134270r) + C52418a.m58680g(14, 8, this.f134271s);
        } else if (i2 == 2) {
            this.f134270r.clear();
            this.f134271s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134260e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            gt4 gt4 = objArr[1];
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
                        gt4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gt4.f134259d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        gt4.f134260e = qv34;
                    }
                    return 0;
                case 4:
                    gt4.f134261f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gt4.f134262g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gt4.f134263h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gt4.f134264i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gt4.f134265j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    gt4.f134266n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    gt4.f134267o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    gt4.f134268p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    gt4.f134269q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv32.mo73356d(bArr3);
                        }
                        gt4.f134270r.add(rv32);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv35 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv35.mo73348f(bArr4);
                        }
                        gt4.f134271s.add(qv35);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
