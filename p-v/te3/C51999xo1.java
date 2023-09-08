package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xo1 */
public class C51999xo1 extends C49335eu3 {

    /* renamed from: d */
    public C51575uo1 f144772d;

    /* renamed from: e */
    public C51719vo1 f144773e;

    /* renamed from: f */
    public C64726td1 f144774f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51999xo1)) {
            return false;
        }
        C51999xo1 xo12 = (C51999xo1) aVar;
        return C46238a.m51546a(this.BaseResponse, xo12.BaseResponse) && C46238a.m51546a(this.f144772d, xo12.f144772d) && C46238a.m51546a(this.f144773e, xo12.f144773e) && C46238a.m51546a(this.f144774f, xo12.f144774f);
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
            C51575uo1 uo12 = this.f144772d;
            if (uo12 != null) {
                aVar.mo74322i(2, uo12.computeSize());
                this.f144772d.writeFields(aVar);
            }
            C51719vo1 vo12 = this.f144773e;
            if (vo12 != null) {
                aVar.mo74322i(3, vo12.computeSize());
                this.f144773e.writeFields(aVar);
            }
            C64726td1 td12 = this.f144774f;
            if (td12 != null) {
                aVar.mo74322i(4, td12.computeSize());
                this.f144774f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51575uo1 uo13 = this.f144772d;
            if (uo13 != null) {
                i2 += C52418a.m58682i(2, uo13.computeSize());
            }
            C51719vo1 vo13 = this.f144773e;
            if (vo13 != null) {
                i2 += C52418a.m58682i(3, vo13.computeSize());
            }
            C64726td1 td13 = this.f144774f;
            return td13 != null ? i2 + C52418a.m58682i(4, td13.computeSize()) : i2;
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
            C51999xo1 xo12 = objArr[1];
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
                    xo12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51575uo1 uo14 = new C51575uo1();
                    if (bArr2 != null && bArr2.length > 0) {
                        uo14.parseFrom(bArr2);
                    }
                    xo12.f144772d = uo14;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51719vo1 vo14 = new C51719vo1();
                    if (bArr3 != null && bArr3.length > 0) {
                        vo14.parseFrom(bArr3);
                    }
                    xo12.f144773e = vo14;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C64726td1 td14 = new C64726td1();
                    if (bArr4 != null && bArr4.length > 0) {
                        td14.parseFrom(bArr4);
                    }
                    xo12.f144774f = td14;
                }
                return 0;
            }
        }
    }
}
