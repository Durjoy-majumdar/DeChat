package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.b */
public class C52422b extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C52425e> f146506d = new LinkedList<>();

    /* renamed from: e */
    public C52427g f146507e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52422b)) {
            return false;
        }
        C52422b bVar = (C52422b) aVar;
        return C46238a.m51546a(this.BaseResponse, bVar.BaseResponse) && C46238a.m51546a(this.f146506d, bVar.f146506d) && C46238a.m51546a(this.f146507e, bVar.f146507e);
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
                aVar.mo74320g(2, 8, this.f146506d);
                C52427g gVar = this.f146507e;
                if (gVar != null) {
                    aVar.mo74322i(3, gVar.computeSize());
                    this.f146507e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f146506d);
            C52427g gVar2 = this.f146507e;
            return gVar2 != null ? g + C52418a.m58682i(3, gVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f146506d.clear();
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
            C52422b bVar = objArr[1];
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
                    bVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52425e eVar = new C52425e();
                    if (bArr2 != null && bArr2.length > 0) {
                        eVar.parseFrom(bArr2);
                    }
                    bVar.f146506d.add(eVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52427g gVar3 = new C52427g();
                    if (bArr3 != null && bArr3.length > 0) {
                        gVar3.parseFrom(bArr3);
                    }
                    bVar.f146507e = gVar3;
                }
                return 0;
            }
        }
    }
}
