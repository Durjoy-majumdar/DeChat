package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c01 */
public class C48933c01 extends C49335eu3 {

    /* renamed from: d */
    public C64247az0 f131419d;

    /* renamed from: e */
    public C64789vy0 f131420e;

    /* renamed from: f */
    public boolean f131421f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48933c01)) {
            return false;
        }
        C48933c01 c012 = (C48933c01) aVar;
        return C46238a.m51546a(this.BaseResponse, c012.BaseResponse) && C46238a.m51546a(this.f131419d, c012.f131419d) && C46238a.m51546a(this.f131420e, c012.f131420e) && C46238a.m51546a(Boolean.valueOf(this.f131421f), Boolean.valueOf(c012.f131421f));
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
            C64247az0 az02 = this.f131419d;
            if (az02 != null) {
                aVar.mo74322i(2, az02.computeSize());
                this.f131419d.writeFields(aVar);
            }
            C64789vy0 vy02 = this.f131420e;
            if (vy02 != null) {
                aVar.mo74322i(3, vy02.computeSize());
                this.f131420e.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f131421f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C64247az0 az03 = this.f131419d;
            if (az03 != null) {
                i2 += C52418a.m58682i(2, az03.computeSize());
            }
            C64789vy0 vy03 = this.f131420e;
            if (vy03 != null) {
                i2 += C52418a.m58682i(3, vy03.computeSize());
            }
            return i2 + C52418a.m58674a(4, this.f131421f);
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
            C48933c01 c012 = objArr[1];
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
                    c012.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64247az0 az04 = new C64247az0();
                    if (bArr2 != null && bArr2.length > 0) {
                        az04.parseFrom(bArr2);
                    }
                    c012.f131419d = az04;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64789vy0 vy04 = new C64789vy0();
                    if (bArr3 != null && bArr3.length > 0) {
                        vy04.parseFrom(bArr3);
                    }
                    c012.f131420e = vy04;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c012.f131421f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
