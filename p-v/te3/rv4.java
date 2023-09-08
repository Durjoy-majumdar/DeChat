package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class rv4 extends C101820nt3 {

    /* renamed from: d */
    public String f332256d;

    /* renamed from: e */
    public int f332257e;

    /* renamed from: f */
    public long f332258f;

    /* renamed from: g */
    public xv4 f332259g;

    /* renamed from: h */
    public long f332260h;

    /* renamed from: i */
    public int f332261i;

    /* renamed from: j */
    public int f332262j;

    /* renamed from: n */
    public int f332263n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rv4)) {
            return false;
        }
        rv4 rv4 = (rv4) aVar;
        return C46238a.m51546a(this.BaseRequest, rv4.BaseRequest) && C46238a.m51546a(this.f332256d, rv4.f332256d) && C46238a.m51546a(Integer.valueOf(this.f332257e), Integer.valueOf(rv4.f332257e)) && C46238a.m51546a(Long.valueOf(this.f332258f), Long.valueOf(rv4.f332258f)) && C46238a.m51546a(this.f332259g, rv4.f332259g) && C46238a.m51546a(Long.valueOf(this.f332260h), Long.valueOf(rv4.f332260h)) && C46238a.m51546a(Integer.valueOf(this.f332261i), Integer.valueOf(rv4.f332261i)) && C46238a.m51546a(Integer.valueOf(this.f332262j), Integer.valueOf(rv4.f332262j)) && C46238a.m51546a(Integer.valueOf(this.f332263n), Integer.valueOf(rv4.f332263n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f332259g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f332256d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f332257e);
                aVar.mo74321h(4, this.f332258f);
                xv4 xv4 = this.f332259g;
                if (xv4 != null) {
                    aVar.mo74322i(5, xv4.computeSize());
                    this.f332259g.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f332260h);
                aVar.mo74318e(7, this.f332261i);
                aVar.mo74318e(8, this.f332262j);
                aVar.mo74318e(9, this.f332263n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f332256d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f332257e) + C52418a.m58681h(4, this.f332258f);
            xv4 xv42 = this.f332259g;
            if (xv42 != null) {
                e += C52418a.m58682i(5, xv42.computeSize());
            }
            return e + C52418a.m58681h(6, this.f332260h) + C52418a.m58678e(7, this.f332261i) + C52418a.m58678e(8, this.f332262j) + C52418a.m58678e(9, this.f332263n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f332259g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReportData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            rv4 rv4 = objArr[1];
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
                        rv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rv4.f332256d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rv4.f332257e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rv4.f332258f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        xv4 xv43 = new xv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            xv43.parseFrom(bArr2);
                        }
                        rv4.f332259g = xv43;
                    }
                    return 0;
                case 6:
                    rv4.f332260h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    rv4.f332261i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rv4.f332262j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rv4.f332263n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
