package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t50 */
public class C51345t50 extends C49335eu3 {

    /* renamed from: d */
    public int f141958d;

    /* renamed from: e */
    public int f141959e;

    /* renamed from: f */
    public int f141960f;

    /* renamed from: g */
    public C51018qv3 f141961g;

    /* renamed from: h */
    public long f141962h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51345t50)) {
            return false;
        }
        C51345t50 t502 = (C51345t50) aVar;
        return C46238a.m51546a(this.BaseResponse, t502.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141958d), Integer.valueOf(t502.f141958d)) && C46238a.m51546a(Integer.valueOf(this.f141959e), Integer.valueOf(t502.f141959e)) && C46238a.m51546a(Integer.valueOf(this.f141960f), Integer.valueOf(t502.f141960f)) && C46238a.m51546a(this.f141961g, t502.f141961g) && C46238a.m51546a(Long.valueOf(this.f141962h), Long.valueOf(t502.f141962h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141961g != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f141958d);
                aVar.mo74318e(3, this.f141959e);
                aVar.mo74318e(4, this.f141960f);
                C51018qv3 qv32 = this.f141961g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f141961g.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f141962h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141958d) + C52418a.m58678e(3, this.f141959e) + C52418a.m58678e(4, this.f141960f);
            C51018qv3 qv33 = this.f141961g;
            if (qv33 != null) {
                e += C52418a.m58682i(5, qv33.computeSize());
            }
            return e + C52418a.m58681h(6, this.f141962h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141961g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51345t50 t502 = objArr[1];
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
                        t502.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    t502.f141958d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t502.f141959e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t502.f141960f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        t502.f141961g = qv34;
                    }
                    return 0;
                case 6:
                    t502.f141962h = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
