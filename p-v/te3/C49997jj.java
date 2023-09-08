package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jj */
public class C49997jj extends C49335eu3 {

    /* renamed from: d */
    public C49216e14 f136146d;

    /* renamed from: e */
    public C49363f14 f136147e;

    /* renamed from: f */
    public C48940c14 f136148f;

    /* renamed from: g */
    public int f136149g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49997jj)) {
            return false;
        }
        C49997jj jjVar = (C49997jj) aVar;
        return C46238a.m51546a(this.BaseResponse, jjVar.BaseResponse) && C46238a.m51546a(this.f136146d, jjVar.f136146d) && C46238a.m51546a(this.f136147e, jjVar.f136147e) && C46238a.m51546a(this.f136148f, jjVar.f136148f) && C46238a.m51546a(Integer.valueOf(this.f136149g), Integer.valueOf(jjVar.f136149g));
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
            C49216e14 e142 = this.f136146d;
            if (e142 != null) {
                aVar.mo74322i(2, e142.computeSize());
                this.f136146d.writeFields(aVar);
            }
            C49363f14 f142 = this.f136147e;
            if (f142 != null) {
                aVar.mo74322i(3, f142.computeSize());
                this.f136147e.writeFields(aVar);
            }
            C48940c14 c142 = this.f136148f;
            if (c142 != null) {
                aVar.mo74322i(4, c142.computeSize());
                this.f136148f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f136149g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49216e14 e143 = this.f136146d;
            if (e143 != null) {
                i2 += C52418a.m58682i(2, e143.computeSize());
            }
            C49363f14 f143 = this.f136147e;
            if (f143 != null) {
                i2 += C52418a.m58682i(3, f143.computeSize());
            }
            C48940c14 c143 = this.f136148f;
            if (c143 != null) {
                i2 += C52418a.m58682i(4, c143.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f136149g);
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
            C49997jj jjVar = objArr[1];
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
                    jjVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49216e14 e144 = new C49216e14();
                    if (bArr2 != null && bArr2.length > 0) {
                        e144.parseFrom(bArr2);
                    }
                    jjVar.f136146d = e144;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49363f14 f144 = new C49363f14();
                    if (bArr3 != null && bArr3.length > 0) {
                        f144.parseFrom(bArr3);
                    }
                    jjVar.f136147e = f144;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C48940c14 c144 = new C48940c14();
                    if (bArr4 != null && bArr4.length > 0) {
                        c144.parseFrom(bArr4);
                    }
                    jjVar.f136148f = c144;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jjVar.f136149g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
