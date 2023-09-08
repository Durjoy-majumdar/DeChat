package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b10 */
public class C48791b10 extends C49335eu3 {

    /* renamed from: d */
    public int f130881d;

    /* renamed from: e */
    public String f130882e;

    /* renamed from: f */
    public C50957qg2 f130883f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48791b10)) {
            return false;
        }
        C48791b10 b102 = (C48791b10) aVar;
        return C46238a.m51546a(this.BaseResponse, b102.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130881d), Integer.valueOf(b102.f130881d)) && C46238a.m51546a(this.f130882e, b102.f130882e) && C46238a.m51546a(this.f130883f, b102.f130883f);
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
                aVar.mo74318e(2, this.f130881d);
                String str = this.f130882e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C50957qg2 qg22 = this.f130883f;
                if (qg22 != null) {
                    aVar.mo74322i(4, qg22.computeSize());
                    this.f130883f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130881d);
            String str2 = this.f130882e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C50957qg2 qg23 = this.f130883f;
            return qg23 != null ? e + C52418a.m58682i(4, qg23.computeSize()) : e;
        } else if (i == 2) {
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
            C48791b10 b102 = objArr[1];
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
                    b102.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b102.f130881d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b102.f130882e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50957qg2 qg24 = new C50957qg2();
                    if (bArr2 != null && bArr2.length > 0) {
                        qg24.parseFrom(bArr2);
                    }
                    b102.f130883f = qg24;
                }
                return 0;
            }
        }
    }
}
