package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class y84 extends C49335eu3 {

    /* renamed from: d */
    public int f145177d;

    /* renamed from: e */
    public int f145178e;

    /* renamed from: f */
    public String f145179f;

    /* renamed from: g */
    public t64 f145180g;

    /* renamed from: h */
    public int f145181h;

    /* renamed from: i */
    public LinkedList<t64> f145182i = new LinkedList<>();

    /* renamed from: j */
    public long f145183j;

    /* renamed from: n */
    public int f145184n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y84)) {
            return false;
        }
        y84 y84 = (y84) aVar;
        return C46238a.m51546a(this.BaseResponse, y84.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145177d), Integer.valueOf(y84.f145177d)) && C46238a.m51546a(Integer.valueOf(this.f145178e), Integer.valueOf(y84.f145178e)) && C46238a.m51546a(this.f145179f, y84.f145179f) && C46238a.m51546a(this.f145180g, y84.f145180g) && C46238a.m51546a(Integer.valueOf(this.f145181h), Integer.valueOf(y84.f145181h)) && C46238a.m51546a(this.f145182i, y84.f145182i) && C46238a.m51546a(Long.valueOf(this.f145183j), Long.valueOf(y84.f145183j)) && C46238a.m51546a(Integer.valueOf(this.f145184n), Integer.valueOf(y84.f145184n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145180g != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f145177d);
                aVar.mo74318e(3, this.f145178e);
                String str = this.f145179f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                t64 t64 = this.f145180g;
                if (t64 != null) {
                    aVar.mo74322i(5, t64.computeSize());
                    this.f145180g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f145181h);
                aVar.mo74320g(7, 8, this.f145182i);
                aVar.mo74321h(8, this.f145183j);
                aVar.mo74318e(9, this.f145184n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BufferUrl");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145177d) + C52418a.m58678e(3, this.f145178e);
            String str2 = this.f145179f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            t64 t642 = this.f145180g;
            if (t642 != null) {
                e += C52418a.m58682i(5, t642.computeSize());
            }
            return e + C52418a.m58678e(6, this.f145181h) + C52418a.m58680g(7, 8, this.f145182i) + C52418a.m58681h(8, this.f145183j) + C52418a.m58678e(9, this.f145184n);
        } else if (i == 2) {
            this.f145182i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145180g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BufferUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            y84 y84 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        y84.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    y84.f145177d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    y84.f145178e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    y84.f145179f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        t64 t643 = new t64();
                        if (bArr2 != null && bArr2.length > 0) {
                            t643.parseFrom(bArr2);
                        }
                        y84.f145180g = t643;
                    }
                    return 0;
                case 6:
                    y84.f145181h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        t64 t644 = new t64();
                        if (bArr3 != null && bArr3.length > 0) {
                            t644.parseFrom(bArr3);
                        }
                        y84.f145182i.add(t644);
                    }
                    return 0;
                case 8:
                    y84.f145183j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    y84.f145184n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
