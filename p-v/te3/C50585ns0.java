package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ns0 */
public class C50585ns0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51059r51> f138743d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64699s51> f138744e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50585ns0)) {
            return false;
        }
        C50585ns0 ns02 = (C50585ns0) aVar;
        return C46238a.m51546a(this.BaseResponse, ns02.BaseResponse) && C46238a.m51546a(this.f138743d, ns02.f138743d) && C46238a.m51546a(this.f138744e, ns02.f138744e);
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
            aVar.mo74320g(2, 8, this.f138743d);
            aVar.mo74320g(3, 8, this.f138744e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f138743d) + C52418a.m58680g(3, 8, this.f138744e);
        } else if (i == 2) {
            this.f138743d.clear();
            this.f138744e.clear();
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
            C50585ns0 ns02 = objArr[1];
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
                    ns02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51059r51 r512 = new C51059r51();
                    if (bArr2 != null && bArr2.length > 0) {
                        r512.parseFrom(bArr2);
                    }
                    ns02.f138743d.add(r512);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64699s51 s512 = new C64699s51();
                    if (bArr3 != null && bArr3.length > 0) {
                        s512.parseFrom(bArr3);
                    }
                    ns02.f138744e.add(s512);
                }
                return 0;
            }
        }
    }
}
