package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h52 */
public class C49661h52 extends C49335eu3 {

    /* renamed from: d */
    public C49243e73 f134450d;

    /* renamed from: e */
    public int f134451e;

    /* renamed from: f */
    public String f134452f;

    /* renamed from: g */
    public C49669h73 f134453g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49661h52)) {
            return false;
        }
        C49661h52 h522 = (C49661h52) aVar;
        return C46238a.m51546a(this.BaseResponse, h522.BaseResponse) && C46238a.m51546a(this.f134450d, h522.f134450d) && C46238a.m51546a(Integer.valueOf(this.f134451e), Integer.valueOf(h522.f134451e)) && C46238a.m51546a(this.f134452f, h522.f134452f) && C46238a.m51546a(this.f134453g, h522.f134453g);
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
            C49243e73 e732 = this.f134450d;
            if (e732 != null) {
                aVar.mo74322i(2, e732.computeSize());
                this.f134450d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f134451e);
            String str = this.f134452f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C49669h73 h732 = this.f134453g;
            if (h732 != null) {
                aVar.mo74322i(5, h732.computeSize());
                this.f134453g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49243e73 e733 = this.f134450d;
            if (e733 != null) {
                i2 += C52418a.m58682i(2, e733.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f134451e);
            String str2 = this.f134452f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            C49669h73 h733 = this.f134453g;
            return h733 != null ? e + C52418a.m58682i(5, h733.computeSize()) : e;
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
            C49661h52 h522 = objArr[1];
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
                    h522.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49243e73 e734 = new C49243e73();
                    if (bArr2 != null && bArr2.length > 0) {
                        e734.parseFrom(bArr2);
                    }
                    h522.f134450d = e734;
                }
                return 0;
            } else if (intValue == 3) {
                h522.f134451e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                h522.f134452f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49669h73 h734 = new C49669h73();
                    if (bArr3 != null && bArr3.length > 0) {
                        h734.parseFrom(bArr3);
                    }
                    h522.f134453g = h734;
                }
                return 0;
            }
        }
    }
}
