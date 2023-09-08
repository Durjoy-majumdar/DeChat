package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class is4 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f135650d;

    /* renamed from: e */
    public C89349b f135651e;

    /* renamed from: f */
    public String f135652f;

    /* renamed from: g */
    public LinkedList<et4> f135653g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof is4)) {
            return false;
        }
        is4 is4 = (is4) aVar;
        return C46238a.m51546a(this.BaseResponse, is4.BaseResponse) && C46238a.m51546a(this.f135650d, is4.f135650d) && C46238a.m51546a(this.f135651e, is4.f135651e) && C46238a.m51546a(this.f135652f, is4.f135652f) && C46238a.m51546a(this.f135653g, is4.f135653g);
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
                C89349b bVar = this.f135650d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                C89349b bVar2 = this.f135651e;
                if (bVar2 != null) {
                    aVar.mo74315b(3, bVar2);
                }
                String str = this.f135652f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74320g(5, 8, this.f135653g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar3 = this.f135650d;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f135651e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(3, bVar4);
            }
            String str2 = this.f135652f;
            if (str2 != null) {
                i2 += C52418a.m58683j(4, str2);
            }
            return i2 + C52418a.m58680g(5, 8, this.f135653g);
        } else if (i == 2) {
            this.f135653g.clear();
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
            is4 is4 = objArr[1];
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
                    is4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                is4.f135650d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                is4.f135651e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                is4.f135652f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    et4 et4 = new et4();
                    if (bArr2 != null && bArr2.length > 0) {
                        et4.parseFrom(bArr2);
                    }
                    is4.f135653g.add(et4);
                }
                return 0;
            }
        }
    }
}
