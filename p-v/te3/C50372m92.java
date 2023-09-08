package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m92 */
public class C50372m92 extends C49335eu3 {

    /* renamed from: d */
    public int f137915d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f137916e = new LinkedList<>();

    /* renamed from: f */
    public String f137917f;

    /* renamed from: g */
    public C51018qv3 f137918g;

    /* renamed from: h */
    public int f137919h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50372m92)) {
            return false;
        }
        C50372m92 m922 = (C50372m92) aVar;
        return C46238a.m51546a(this.BaseResponse, m922.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137915d), Integer.valueOf(m922.f137915d)) && C46238a.m51546a(this.f137916e, m922.f137916e) && C46238a.m51546a(this.f137917f, m922.f137917f) && C46238a.m51546a(this.f137918g, m922.f137918g) && C46238a.m51546a(Integer.valueOf(this.f137919h), Integer.valueOf(m922.f137919h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f137915d);
                aVar.mo74320g(3, 8, this.f137916e);
                String str = this.f137917f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C51018qv3 qv32 = this.f137918g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f137918g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f137919h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137915d) + C52418a.m58680g(3, 8, this.f137916e);
            String str2 = this.f137917f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            C51018qv3 qv33 = this.f137918g;
            if (qv33 != null) {
                e += C52418a.m58682i(5, qv33.computeSize());
            }
            return e + C52418a.m58678e(6, this.f137919h);
        } else if (i == 2) {
            this.f137916e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50372m92 m922 = objArr[1];
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
                        m922.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    m922.f137915d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        m922.f137916e.add(rv32);
                    }
                    return 0;
                case 4:
                    m922.f137917f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        m922.f137918g = qv34;
                    }
                    return 0;
                case 6:
                    m922.f137919h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
