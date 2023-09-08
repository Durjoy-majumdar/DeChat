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

/* renamed from: te3.eh0 */
public class C49284eh0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51446tu> f132922d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<FinderObject> f132923e = new LinkedList<>();

    /* renamed from: f */
    public C49002ch0 f132924f;

    /* renamed from: g */
    public C89349b f132925g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49284eh0)) {
            return false;
        }
        C49284eh0 eh02 = (C49284eh0) aVar;
        return C46238a.m51546a(this.BaseResponse, eh02.BaseResponse) && C46238a.m51546a(this.f132922d, eh02.f132922d) && C46238a.m51546a(this.f132923e, eh02.f132923e) && C46238a.m51546a(this.f132924f, eh02.f132924f) && C46238a.m51546a(this.f132925g, eh02.f132925g);
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
                aVar.mo74320g(2, 8, this.f132922d);
                aVar.mo74320g(3, 8, this.f132923e);
                C49002ch0 ch02 = this.f132924f;
                if (ch02 != null) {
                    aVar.mo74322i(4, ch02.computeSize());
                    this.f132924f.writeFields(aVar);
                }
                C89349b bVar = this.f132925g;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f132922d) + C52418a.m58680g(3, 8, this.f132923e);
            C49002ch0 ch03 = this.f132924f;
            if (ch03 != null) {
                g += C52418a.m58682i(4, ch03.computeSize());
            }
            C89349b bVar2 = this.f132925g;
            return bVar2 != null ? g + C52418a.m58675b(5, bVar2) : g;
        } else if (i == 2) {
            this.f132922d.clear();
            this.f132923e.clear();
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
            C49284eh0 eh02 = objArr[1];
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
                    eh02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51446tu tuVar = new C51446tu();
                    if (bArr2 != null && bArr2.length > 0) {
                        tuVar.parseFrom(bArr2);
                    }
                    eh02.f132922d.add(tuVar);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    FinderObject finderObject = new FinderObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObject.parseFrom(bArr3);
                    }
                    eh02.f132923e.add(finderObject);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C49002ch0 ch04 = new C49002ch0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ch04.parseFrom(bArr4);
                    }
                    eh02.f132924f = ch04;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                eh02.f132925g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
