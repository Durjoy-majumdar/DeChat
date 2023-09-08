package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class v64 extends C49335eu3 {

    /* renamed from: d */
    public String f143362d;

    /* renamed from: e */
    public int f143363e;

    /* renamed from: f */
    public LinkedList<SnsObject> f143364f = new LinkedList<>();

    /* renamed from: g */
    public int f143365g;

    /* renamed from: h */
    public String f143366h;

    /* renamed from: i */
    public int f143367i;

    /* renamed from: j */
    public j84 f143368j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v64)) {
            return false;
        }
        v64 v64 = (v64) aVar;
        return C46238a.m51546a(this.BaseResponse, v64.BaseResponse) && C46238a.m51546a(this.f143362d, v64.f143362d) && C46238a.m51546a(Integer.valueOf(this.f143363e), Integer.valueOf(v64.f143363e)) && C46238a.m51546a(this.f143364f, v64.f143364f) && C46238a.m51546a(Integer.valueOf(this.f143365g), Integer.valueOf(v64.f143365g)) && C46238a.m51546a(this.f143366h, v64.f143366h) && C46238a.m51546a(Integer.valueOf(this.f143367i), Integer.valueOf(v64.f143367i)) && C46238a.m51546a(this.f143368j, v64.f143368j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143368j != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f143362d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f143363e);
                aVar.mo74320g(4, 8, this.f143364f);
                aVar.mo74318e(5, this.f143365g);
                String str2 = this.f143366h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74318e(7, this.f143367i);
                j84 j84 = this.f143368j;
                if (j84 != null) {
                    aVar.mo74322i(8, j84.computeSize());
                    this.f143368j.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServerConfig");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f143362d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f143363e) + C52418a.m58680g(4, 8, this.f143364f) + C52418a.m58678e(5, this.f143365g);
            String str4 = this.f143366h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            int e2 = e + C52418a.m58678e(7, this.f143367i);
            j84 j842 = this.f143368j;
            return j842 != null ? e2 + C52418a.m58682i(8, j842.computeSize()) : e2;
        } else if (i == 2) {
            this.f143364f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143368j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServerConfig");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            v64 v64 = objArr[1];
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
                        v64.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    v64.f143362d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v64.f143363e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        SnsObject snsObject = new SnsObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            snsObject.parseFrom(bArr2);
                        }
                        v64.f143364f.add(snsObject);
                    }
                    return 0;
                case 5:
                    v64.f143365g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    v64.f143366h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    v64.f143367i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        j84 j843 = new j84();
                        if (bArr3 != null && bArr3.length > 0) {
                            j843.parseFrom(bArr3);
                        }
                        v64.f143368j = j843;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
