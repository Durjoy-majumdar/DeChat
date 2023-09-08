package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qj4 extends C49335eu3 {

    /* renamed from: d */
    public int f185040d;

    /* renamed from: e */
    public String f185041e;

    /* renamed from: f */
    public int f185042f;

    /* renamed from: g */
    public LinkedList<C64731tl2> f185043g = new LinkedList<>();

    /* renamed from: h */
    public C77935gl2 f185044h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qj4)) {
            return false;
        }
        qj4 qj4 = (qj4) aVar;
        return C46238a.m51546a(this.BaseResponse, qj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f185040d), Integer.valueOf(qj4.f185040d)) && C46238a.m51546a(this.f185041e, qj4.f185041e) && C46238a.m51546a(Integer.valueOf(this.f185042f), Integer.valueOf(qj4.f185042f)) && C46238a.m51546a(this.f185043g, qj4.f185043g) && C46238a.m51546a(this.f185044h, qj4.f185044h);
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
            aVar.mo74318e(2, this.f185040d);
            String str = this.f185041e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f185042f);
            aVar.mo74320g(5, 8, this.f185043g);
            C77935gl2 gl22 = this.f185044h;
            if (gl22 != null) {
                aVar.mo74322i(6, gl22.computeSize());
                this.f185044h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185040d);
            String str2 = this.f185041e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f185042f) + C52418a.m58680g(5, 8, this.f185043g);
            C77935gl2 gl23 = this.f185044h;
            return gl23 != null ? e2 + C52418a.m58682i(6, gl23.computeSize()) : e2;
        } else if (i == 2) {
            this.f185043g.clear();
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
            qj4 qj4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        qj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    qj4.f185040d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qj4.f185041e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qj4.f185042f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64731tl2 tl22 = new C64731tl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            tl22.parseFrom(bArr2);
                        }
                        qj4.f185043g.add(tl22);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C77935gl2 gl24 = new C77935gl2();
                        if (bArr3 != null && bArr3.length > 0) {
                            gl24.parseFrom(bArr3);
                        }
                        qj4.f185044h = gl24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
