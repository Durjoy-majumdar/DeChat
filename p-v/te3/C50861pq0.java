package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pq0 */
public class C50861pq0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f139901d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f139902e;

    /* renamed from: f */
    public int f139903f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50861pq0)) {
            return false;
        }
        C50861pq0 pq02 = (C50861pq0) aVar;
        return C46238a.m51546a(this.BaseResponse, pq02.BaseResponse) && C46238a.m51546a(this.f139901d, pq02.f139901d) && C46238a.m51546a(this.f139902e, pq02.f139902e) && C46238a.m51546a(Integer.valueOf(this.f139903f), Integer.valueOf(pq02.f139903f));
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
            aVar.mo74320g(2, 8, this.f139901d);
            C89349b bVar = this.f139902e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f139903f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f139901d);
            C89349b bVar2 = this.f139902e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f139903f);
        } else if (i == 2) {
            this.f139901d.clear();
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
            C50861pq0 pq02 = objArr[1];
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
                    pq02.BaseResponse = jaVar3;
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
                    pq02.f139901d.add(finderObject);
                }
                return 0;
            } else if (intValue == 3) {
                pq02.f139902e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pq02.f139903f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
