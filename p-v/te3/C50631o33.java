package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o33 */
public class C50631o33 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f138931d;

    /* renamed from: e */
    public C51018qv3 f138932e;

    /* renamed from: f */
    public int f138933f;

    /* renamed from: g */
    public int f138934g;

    /* renamed from: h */
    public int f138935h;

    /* renamed from: i */
    public LinkedList<C50886px> f138936i = new LinkedList<>();

    /* renamed from: j */
    public int f138937j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50631o33)) {
            return false;
        }
        C50631o33 o332 = (C50631o33) aVar;
        return C46238a.m51546a(this.BaseResponse, o332.BaseResponse) && C46238a.m51546a(this.f138931d, o332.f138931d) && C46238a.m51546a(this.f138932e, o332.f138932e) && C46238a.m51546a(Integer.valueOf(this.f138933f), Integer.valueOf(o332.f138933f)) && C46238a.m51546a(Integer.valueOf(this.f138934g), Integer.valueOf(o332.f138934g)) && C46238a.m51546a(Integer.valueOf(this.f138935h), Integer.valueOf(o332.f138935h)) && C46238a.m51546a(this.f138936i, o332.f138936i) && C46238a.m51546a(Integer.valueOf(this.f138937j), Integer.valueOf(o332.f138937j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138931d == null) {
                throw new C52419b("Not all required fields were included: CurrentSynckey");
            } else if (this.f138932e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f138931d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f138931d.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f138932e;
                if (qv33 != null) {
                    aVar.mo74322i(3, qv33.computeSize());
                    this.f138932e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f138933f);
                aVar.mo74318e(5, this.f138934g);
                aVar.mo74318e(6, this.f138935h);
                aVar.mo74320g(7, 8, this.f138936i);
                aVar.mo74318e(8, this.f138937j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MaxSynckey");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv34 = this.f138931d;
            if (qv34 != null) {
                i2 += C52418a.m58682i(2, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f138932e;
            if (qv35 != null) {
                i2 += C52418a.m58682i(3, qv35.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f138933f) + C52418a.m58678e(5, this.f138934g) + C52418a.m58678e(6, this.f138935h) + C52418a.m58680g(7, 8, this.f138936i) + C52418a.m58678e(8, this.f138937j);
        } else if (i == 2) {
            this.f138936i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138931d == null) {
                throw new C52419b("Not all required fields were included: CurrentSynckey");
            } else if (this.f138932e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MaxSynckey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50631o33 o332 = objArr[1];
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
                        o332.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        o332.f138931d = qv36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        o332.f138932e = qv37;
                    }
                    return 0;
                case 4:
                    o332.f138933f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    o332.f138934g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    o332.f138935h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50886px pxVar = new C50886px();
                        if (bArr4 != null && bArr4.length > 0) {
                            pxVar.parseFrom(bArr4);
                        }
                        o332.f138936i.add(pxVar);
                    }
                    return 0;
                case 8:
                    o332.f138937j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
