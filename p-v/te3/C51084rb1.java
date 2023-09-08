package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rb1 */
public class C51084rb1 extends C49335eu3 {

    /* renamed from: d */
    public String f140804d;

    /* renamed from: e */
    public C89349b f140805e;

    /* renamed from: f */
    public C48779ay0 f140806f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51084rb1)) {
            return false;
        }
        C51084rb1 rb12 = (C51084rb1) aVar;
        return C46238a.m51546a(this.BaseResponse, rb12.BaseResponse) && C46238a.m51546a(this.f140804d, rb12.f140804d) && C46238a.m51546a(this.f140805e, rb12.f140805e) && C46238a.m51546a(this.f140806f, rb12.f140806f);
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
            String str = this.f140804d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f140805e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C48779ay0 ay02 = this.f140806f;
            if (ay02 != null) {
                aVar.mo74322i(4, ay02.computeSize());
                this.f140806f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f140804d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f140805e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C48779ay0 ay03 = this.f140806f;
            return ay03 != null ? i2 + C52418a.m58682i(4, ay03.computeSize()) : i2;
        } else if (i == 2) {
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
            C51084rb1 rb12 = objArr[1];
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
                    rb12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                rb12.f140804d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rb12.f140805e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48779ay0 ay04 = new C48779ay0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ay04.parseFrom(bArr2);
                    }
                    rb12.f140806f = ay04;
                }
                return 0;
            }
        }
    }
}
