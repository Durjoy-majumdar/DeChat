package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pm0 */
public class C50848pm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f139830d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f139831e;

    /* renamed from: f */
    public int f139832f;

    /* renamed from: g */
    public int f139833g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50848pm0)) {
            return false;
        }
        C50848pm0 pm02 = (C50848pm0) aVar;
        return C46238a.m51546a(this.BaseResponse, pm02.BaseResponse) && C46238a.m51546a(this.f139830d, pm02.f139830d) && C46238a.m51546a(this.f139831e, pm02.f139831e) && C46238a.m51546a(Integer.valueOf(this.f139832f), Integer.valueOf(pm02.f139832f)) && C46238a.m51546a(Integer.valueOf(this.f139833g), Integer.valueOf(pm02.f139833g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f139830d);
            C89349b bVar = this.f139831e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f139832f);
            aVar.mo74318e(5, this.f139833g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f139830d);
            C89349b bVar2 = this.f139831e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f139832f) + C52418a.m58678e(5, this.f139833g);
        } else if (i == 2) {
            this.f139830d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50848pm0 pm02 = objArr[1];
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
                    pm02.BaseResponse = jaVar3;
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
                    pm02.f139830d.add(finderObject);
                }
                return 0;
            } else if (intValue == 3) {
                pm02.f139831e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                pm02.f139832f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pm02.f139833g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
