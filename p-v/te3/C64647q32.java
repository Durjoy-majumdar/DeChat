package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q32 */
public class C64647q32 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C64896zu2> f184948d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64246av2> f184949e = new LinkedList<>();

    /* renamed from: f */
    public String f184950f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64647q32)) {
            return false;
        }
        C64647q32 q322 = (C64647q32) aVar;
        return C46238a.m51546a(this.BaseResponse, q322.BaseResponse) && C46238a.m51546a(this.f184948d, q322.f184948d) && C46238a.m51546a(this.f184949e, q322.f184949e) && C46238a.m51546a(this.f184950f, q322.f184950f);
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
                aVar.mo74320g(2, 8, this.f184948d);
                aVar.mo74320g(3, 8, this.f184949e);
                String str = this.f184950f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f184948d) + C52418a.m58680g(3, 8, this.f184949e);
            String str2 = this.f184950f;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f184948d.clear();
            this.f184949e.clear();
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
            C64647q32 q322 = objArr[1];
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
                    q322.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64896zu2 zu22 = new C64896zu2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zu22.parseFrom(bArr2);
                    }
                    q322.f184948d.add(zu22);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64246av2 av22 = new C64246av2();
                    if (bArr3 != null && bArr3.length > 0) {
                        av22.parseFrom(bArr3);
                    }
                    q322.f184949e.add(av22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                q322.f184950f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
