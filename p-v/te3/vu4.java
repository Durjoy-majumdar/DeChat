package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class vu4 extends C101820nt3 {

    /* renamed from: d */
    public int f185982d;

    /* renamed from: e */
    public long f185983e;

    /* renamed from: f */
    public int f185984f;

    /* renamed from: g */
    public int f185985g;

    /* renamed from: h */
    public int f185986h;

    /* renamed from: i */
    public int f185987i;

    /* renamed from: j */
    public int f185988j;

    /* renamed from: n */
    public int f185989n;

    /* renamed from: o */
    public C51018qv3 f185990o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vu4)) {
            return false;
        }
        vu4 vu4 = (vu4) aVar;
        return C46238a.m51546a(this.BaseRequest, vu4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f185982d), Integer.valueOf(vu4.f185982d)) && C46238a.m51546a(Long.valueOf(this.f185983e), Long.valueOf(vu4.f185983e)) && C46238a.m51546a(Integer.valueOf(this.f185984f), Integer.valueOf(vu4.f185984f)) && C46238a.m51546a(Integer.valueOf(this.f185985g), Integer.valueOf(vu4.f185985g)) && C46238a.m51546a(Integer.valueOf(this.f185986h), Integer.valueOf(vu4.f185986h)) && C46238a.m51546a(Integer.valueOf(this.f185987i), Integer.valueOf(vu4.f185987i)) && C46238a.m51546a(Integer.valueOf(this.f185988j), Integer.valueOf(vu4.f185988j)) && C46238a.m51546a(Integer.valueOf(this.f185989n), Integer.valueOf(vu4.f185989n)) && C46238a.m51546a(this.f185990o, vu4.f185990o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185990o != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185982d);
                aVar.mo74321h(3, this.f185983e);
                aVar.mo74318e(4, this.f185984f);
                aVar.mo74318e(5, this.f185985g);
                aVar.mo74318e(6, this.f185986h);
                aVar.mo74318e(7, this.f185987i);
                aVar.mo74318e(8, this.f185988j);
                aVar.mo74318e(9, this.f185989n);
                C51018qv3 qv32 = this.f185990o;
                if (qv32 != null) {
                    aVar.mo74322i(10, qv32.computeSize());
                    this.f185990o.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185982d) + C52418a.m58681h(3, this.f185983e) + C52418a.m58678e(4, this.f185984f) + C52418a.m58678e(5, this.f185985g) + C52418a.m58678e(6, this.f185986h) + C52418a.m58678e(7, this.f185987i) + C52418a.m58678e(8, this.f185988j) + C52418a.m58678e(9, this.f185989n);
            C51018qv3 qv33 = this.f185990o;
            return qv33 != null ? e + C52418a.m58682i(10, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185990o != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            vu4 vu4 = objArr[1];
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
                        vu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vu4.f185982d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vu4.f185983e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    vu4.f185984f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vu4.f185985g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vu4.f185986h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vu4.f185987i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vu4.f185988j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    vu4.f185989n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        vu4.f185990o = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
