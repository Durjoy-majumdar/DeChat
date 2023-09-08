package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class e84 extends C49335eu3 {

    /* renamed from: d */
    public SnsObject f132789d;

    /* renamed from: e */
    public String f132790e;

    /* renamed from: f */
    public w84 f132791f;

    /* renamed from: g */
    public int f132792g;

    /* renamed from: h */
    public LinkedList<C51163rv3> f132793h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e84)) {
            return false;
        }
        e84 e84 = (e84) aVar;
        return C46238a.m51546a(this.BaseResponse, e84.BaseResponse) && C46238a.m51546a(this.f132789d, e84.f132789d) && C46238a.m51546a(this.f132790e, e84.f132790e) && C46238a.m51546a(this.f132791f, e84.f132791f) && C46238a.m51546a(Integer.valueOf(this.f132792g), Integer.valueOf(e84.f132792g)) && C46238a.m51546a(this.f132793h, e84.f132793h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f132789d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                SnsObject snsObject = this.f132789d;
                if (snsObject != null) {
                    aVar.mo74322i(2, snsObject.computeSize());
                    this.f132789d.writeFields(aVar);
                }
                String str = this.f132790e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                w84 w84 = this.f132791f;
                if (w84 != null) {
                    aVar.mo74322i(4, w84.computeSize());
                    this.f132791f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f132792g);
                aVar.mo74320g(6, 8, this.f132793h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SnsObject");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            SnsObject snsObject2 = this.f132789d;
            if (snsObject2 != null) {
                i2 += C52418a.m58682i(2, snsObject2.computeSize());
            }
            String str2 = this.f132790e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            w84 w842 = this.f132791f;
            if (w842 != null) {
                i2 += C52418a.m58682i(4, w842.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f132792g) + C52418a.m58680g(6, 8, this.f132793h);
        } else if (i == 2) {
            this.f132793h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f132789d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SnsObject");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            e84 e84 = objArr[1];
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
                        e84.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        SnsObject snsObject3 = new SnsObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            snsObject3.parseFrom(bArr2);
                        }
                        e84.f132789d = snsObject3;
                    }
                    return 0;
                case 3:
                    e84.f132790e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        w84 w843 = new w84();
                        if (bArr3 != null && bArr3.length > 0) {
                            w843.parseFrom(bArr3);
                        }
                        e84.f132791f = w843;
                    }
                    return 0;
                case 5:
                    e84.f132792g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv32.mo73356d(bArr4);
                        }
                        e84.f132793h.add(rv32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
