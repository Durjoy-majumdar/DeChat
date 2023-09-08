package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class pu4 extends C101820nt3 {

    /* renamed from: d */
    public String f332244d;

    /* renamed from: e */
    public int f332245e;

    /* renamed from: f */
    public long f332246f;

    /* renamed from: g */
    public String f332247g;

    /* renamed from: h */
    public xv4 f332248h;

    /* renamed from: i */
    public int f332249i;

    /* renamed from: j */
    public long f332250j;

    /* renamed from: n */
    public int f332251n;

    /* renamed from: o */
    public int f332252o;

    /* renamed from: p */
    public int f332253p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pu4)) {
            return false;
        }
        pu4 pu4 = (pu4) aVar;
        return C46238a.m51546a(this.BaseRequest, pu4.BaseRequest) && C46238a.m51546a(this.f332244d, pu4.f332244d) && C46238a.m51546a(Integer.valueOf(this.f332245e), Integer.valueOf(pu4.f332245e)) && C46238a.m51546a(Long.valueOf(this.f332246f), Long.valueOf(pu4.f332246f)) && C46238a.m51546a(this.f332247g, pu4.f332247g) && C46238a.m51546a(this.f332248h, pu4.f332248h) && C46238a.m51546a(Integer.valueOf(this.f332249i), Integer.valueOf(pu4.f332249i)) && C46238a.m51546a(Long.valueOf(this.f332250j), Long.valueOf(pu4.f332250j)) && C46238a.m51546a(Integer.valueOf(this.f332251n), Integer.valueOf(pu4.f332251n)) && C46238a.m51546a(Integer.valueOf(this.f332252o), Integer.valueOf(pu4.f332252o)) && C46238a.m51546a(Integer.valueOf(this.f332253p), Integer.valueOf(pu4.f332253p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f332248h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f332244d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f332245e);
                aVar.mo74321h(4, this.f332246f);
                String str2 = this.f332247g;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                xv4 xv4 = this.f332248h;
                if (xv4 != null) {
                    aVar.mo74322i(8, xv4.computeSize());
                    this.f332248h.writeFields(aVar);
                }
                aVar.mo74318e(9, this.f332249i);
                aVar.mo74321h(10, this.f332250j);
                aVar.mo74318e(11, this.f332251n);
                aVar.mo74318e(12, this.f332252o);
                aVar.mo74318e(13, this.f332253p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f332244d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f332245e) + C52418a.m58681h(4, this.f332246f);
            String str4 = this.f332247g;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            xv4 xv42 = this.f332248h;
            if (xv42 != null) {
                e += C52418a.m58682i(8, xv42.computeSize());
            }
            return e + C52418a.m58678e(9, this.f332249i) + C52418a.m58681h(10, this.f332250j) + C52418a.m58678e(11, this.f332251n) + C52418a.m58678e(12, this.f332252o) + C52418a.m58678e(13, this.f332253p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f332248h != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            pu4 pu4 = objArr[1];
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
                        pu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pu4.f332244d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pu4.f332245e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pu4.f332246f = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    pu4.f332247g = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        xv4 xv43 = new xv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            xv43.parseFrom(bArr2);
                        }
                        pu4.f332248h = xv43;
                    }
                    return 0;
                case 9:
                    pu4.f332249i = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pu4.f332250j = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    pu4.f332251n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    pu4.f332252o = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    pu4.f332253p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
