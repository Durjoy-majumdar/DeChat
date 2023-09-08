package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tf */
public class C51387tf extends C49335eu3 {

    /* renamed from: d */
    public boolean f142191d;

    /* renamed from: e */
    public int f142192e;

    /* renamed from: f */
    public String f142193f;

    /* renamed from: g */
    public String f142194g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51387tf)) {
            return false;
        }
        C51387tf tfVar = (C51387tf) aVar;
        return C46238a.m51546a(this.BaseResponse, tfVar.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f142191d), Boolean.valueOf(tfVar.f142191d)) && C46238a.m51546a(Integer.valueOf(this.f142192e), Integer.valueOf(tfVar.f142192e)) && C46238a.m51546a(this.f142193f, tfVar.f142193f) && C46238a.m51546a(this.f142194g, tfVar.f142194g);
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
            aVar.mo74314a(2, this.f142191d);
            aVar.mo74318e(3, this.f142192e);
            String str = this.f142193f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f142194g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f142191d) + C52418a.m58678e(3, this.f142192e);
            String str3 = this.f142193f;
            if (str3 != null) {
                a += C52418a.m58683j(4, str3);
            }
            String str4 = this.f142194g;
            return str4 != null ? a + C52418a.m58683j(5, str4) : a;
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
            C51387tf tfVar = objArr[1];
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
                    tfVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                tfVar.f142191d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                tfVar.f142192e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                tfVar.f142193f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tfVar.f142194g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
