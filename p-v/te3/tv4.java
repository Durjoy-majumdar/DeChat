package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class tv4 extends C101820nt3 {

    /* renamed from: d */
    public long f299545d;

    /* renamed from: e */
    public long f299546e;

    /* renamed from: f */
    public int f299547f;

    /* renamed from: g */
    public C51163rv3 f299548g;

    /* renamed from: h */
    public C51163rv3 f299549h;

    /* renamed from: i */
    public double f299550i;

    /* renamed from: j */
    public double f299551j;

    /* renamed from: n */
    public int f299552n;

    /* renamed from: o */
    public int f299553o;

    /* renamed from: p */
    public LinkedList<ga4> f299554p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tv4)) {
            return false;
        }
        tv4 tv4 = (tv4) aVar;
        return C46238a.m51546a(this.BaseRequest, tv4.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f299545d), Long.valueOf(tv4.f299545d)) && C46238a.m51546a(Long.valueOf(this.f299546e), Long.valueOf(tv4.f299546e)) && C46238a.m51546a(Integer.valueOf(this.f299547f), Integer.valueOf(tv4.f299547f)) && C46238a.m51546a(this.f299548g, tv4.f299548g) && C46238a.m51546a(this.f299549h, tv4.f299549h) && C46238a.m51546a(Double.valueOf(this.f299550i), Double.valueOf(tv4.f299550i)) && C46238a.m51546a(Double.valueOf(this.f299551j), Double.valueOf(tv4.f299551j)) && C46238a.m51546a(Integer.valueOf(this.f299552n), Integer.valueOf(tv4.f299552n)) && C46238a.m51546a(Integer.valueOf(this.f299553o), Integer.valueOf(tv4.f299553o)) && C46238a.m51546a(this.f299554p, tv4.f299554p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299548g == null) {
                throw new C52419b("Not all required fields were included: NetName");
            } else if (this.f299549h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f299545d);
                aVar.mo74321h(3, this.f299546e);
                aVar.mo74318e(4, this.f299547f);
                C51163rv3 rv32 = this.f299548g;
                if (rv32 != null) {
                    aVar.mo74322i(5, rv32.computeSize());
                    this.f299548g.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f299549h;
                if (rv33 != null) {
                    aVar.mo74322i(6, rv33.computeSize());
                    this.f299549h.writeFields(aVar);
                }
                aVar.mo74316c(7, this.f299550i);
                aVar.mo74316c(8, this.f299551j);
                aVar.mo74318e(9, this.f299552n);
                aVar.mo74318e(10, this.f299553o);
                aVar.mo74320g(11, 8, this.f299554p);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: WifiName");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? C52418a.m58682i(1, iaVar2.computeSize()) + 0 : 0) + C52418a.m58681h(2, this.f299545d) + C52418a.m58681h(3, this.f299546e) + C52418a.m58678e(4, this.f299547f);
            C51163rv3 rv34 = this.f299548g;
            if (rv34 != null) {
                i3 += C52418a.m58682i(5, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f299549h;
            if (rv35 != null) {
                i3 += C52418a.m58682i(6, rv35.computeSize());
            }
            return i3 + C52418a.m58676c(7, this.f299550i) + C52418a.m58676c(8, this.f299551j) + C52418a.m58678e(9, this.f299552n) + C52418a.m58678e(10, this.f299553o) + C52418a.m58680g(11, 8, this.f299554p);
        } else if (i2 == 2) {
            this.f299554p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299548g == null) {
                throw new C52419b("Not all required fields were included: NetName");
            } else if (this.f299549h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: WifiName");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            tv4 tv4 = objArr[1];
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
                        tv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tv4.f299545d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    tv4.f299546e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    tv4.f299547f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        tv4.f299548g = rv36;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv37.mo73356d(bArr3);
                        }
                        tv4.f299549h = rv37;
                    }
                    return 0;
                case 7:
                    tv4.f299550i = aVar3.mo141627e(intValue);
                    return 0;
                case 8:
                    tv4.f299551j = aVar3.mo141627e(intValue);
                    return 0;
                case 9:
                    tv4.f299552n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    tv4.f299553o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        ga4 ga4 = new ga4();
                        if (bArr4 != null && bArr4.length > 0) {
                            ga4.parseFrom(bArr4);
                        }
                        tv4.f299554p.add(ga4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
