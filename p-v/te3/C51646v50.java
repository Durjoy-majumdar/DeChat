package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v50 */
public class C51646v50 extends C49335eu3 {

    /* renamed from: d */
    public int f143303d;

    /* renamed from: e */
    public int f143304e;

    /* renamed from: f */
    public int f143305f;

    /* renamed from: g */
    public int f143306g;

    /* renamed from: h */
    public String f143307h;

    /* renamed from: i */
    public C51018qv3 f143308i;

    /* renamed from: j */
    public int f143309j;

    /* renamed from: n */
    public int f143310n;

    /* renamed from: o */
    public long f143311o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51646v50)) {
            return false;
        }
        C51646v50 v502 = (C51646v50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143303d), Integer.valueOf(v502.f143303d)) && C46238a.m51546a(Integer.valueOf(this.f143304e), Integer.valueOf(v502.f143304e)) && C46238a.m51546a(Integer.valueOf(this.f143305f), Integer.valueOf(v502.f143305f)) && C46238a.m51546a(Integer.valueOf(this.f143306g), Integer.valueOf(v502.f143306g)) && C46238a.m51546a(this.f143307h, v502.f143307h) && C46238a.m51546a(this.f143308i, v502.f143308i) && C46238a.m51546a(Integer.valueOf(this.f143309j), Integer.valueOf(v502.f143309j)) && C46238a.m51546a(this.BaseResponse, v502.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143310n), Integer.valueOf(v502.f143310n)) && C46238a.m51546a(Long.valueOf(this.f143311o), Long.valueOf(v502.f143311o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143308i == null) {
                throw new C52419b("Not all required fields were included: Data");
            } else if (this.BaseResponse != null) {
                aVar.mo74318e(1, this.f143303d);
                aVar.mo74318e(2, this.f143304e);
                aVar.mo74318e(3, this.f143305f);
                aVar.mo74318e(5, this.f143306g);
                String str = this.f143307h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                C51018qv3 qv32 = this.f143308i;
                if (qv32 != null) {
                    aVar.mo74322i(7, qv32.computeSize());
                    this.f143308i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f143309j);
                C49966ja jaVar = this.BaseResponse;
                if (jaVar != null) {
                    aVar.mo74322i(9, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(10, this.f143310n);
                aVar.mo74321h(11, this.f143311o);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143303d) + 0 + C52418a.m58678e(2, this.f143304e) + C52418a.m58678e(3, this.f143305f) + C52418a.m58678e(5, this.f143306g);
            String str2 = this.f143307h;
            if (str2 != null) {
                e += C52418a.m58683j(6, str2);
            }
            C51018qv3 qv33 = this.f143308i;
            if (qv33 != null) {
                e += C52418a.m58682i(7, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f143309j);
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                e2 += C52418a.m58682i(9, jaVar2.computeSize());
            }
            return e2 + C52418a.m58678e(10, this.f143310n) + C52418a.m58681h(11, this.f143311o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143308i == null) {
                throw new C52419b("Not all required fields were included: Data");
            } else if (this.BaseResponse != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51646v50 v502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v502.f143303d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    v502.f143304e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    v502.f143305f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    v502.f143306g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    v502.f143307h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        v502.f143308i = qv34;
                    }
                    return 0;
                case 8:
                    v502.f143309j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr2 != null && bArr2.length > 0) {
                            jaVar3.parseFrom(bArr2);
                        }
                        v502.BaseResponse = jaVar3;
                    }
                    return 0;
                case 10:
                    v502.f143310n = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    v502.f143311o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
