package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nn0 */
public class C50566nn0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f138688d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f138689e;

    /* renamed from: f */
    public int f138690f;

    /* renamed from: g */
    public C51974xh1 f138691g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50566nn0)) {
            return false;
        }
        C50566nn0 nn02 = (C50566nn0) aVar;
        return C46238a.m51546a(this.BaseResponse, nn02.BaseResponse) && C46238a.m51546a(this.f138688d, nn02.f138688d) && C46238a.m51546a(this.f138689e, nn02.f138689e) && C46238a.m51546a(Integer.valueOf(this.f138690f), Integer.valueOf(nn02.f138690f)) && C46238a.m51546a(this.f138691g, nn02.f138691g);
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
                aVar.mo74320g(2, 8, this.f138688d);
                C89349b bVar = this.f138689e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f138690f);
                C51974xh1 xh12 = this.f138691g;
                if (xh12 != null) {
                    aVar.mo74322i(5, xh12.computeSize());
                    this.f138691g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138688d);
            C89349b bVar2 = this.f138689e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f138690f);
            C51974xh1 xh13 = this.f138691g;
            return xh13 != null ? e + C52418a.m58682i(5, xh13.computeSize()) : e;
        } else if (i == 2) {
            this.f138688d.clear();
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
            C50566nn0 nn02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    nn02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject.parseFrom(bArr2);
                    }
                    nn02.f138688d.add(finderObject);
                }
                return 0;
            } else if (intValue == 3) {
                nn02.f138689e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                nn02.f138690f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51974xh1 xh14 = new C51974xh1();
                    if (bArr3 != null && bArr3.length > 0) {
                        xh14.parseFrom(bArr3);
                    }
                    nn02.f138691g = xh14;
                }
                return 0;
            }
        }
    }
}
