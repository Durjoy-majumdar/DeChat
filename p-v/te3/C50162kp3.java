package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kp3 */
public class C50162kp3 extends C47465a {

    /* renamed from: d */
    public int f136972d;

    /* renamed from: e */
    public String f136973e;

    /* renamed from: f */
    public zf4 f136974f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50162kp3)) {
            return false;
        }
        C50162kp3 kp32 = (C50162kp3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136972d), Integer.valueOf(kp32.f136972d)) && C46238a.m51546a(this.f136973e, kp32.f136973e) && C46238a.m51546a(this.f136974f, kp32.f136974f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136972d);
            String str = this.f136973e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            zf4 zf4 = this.f136974f;
            if (zf4 != null) {
                aVar.mo74322i(3, zf4.computeSize());
                this.f136974f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136972d) + 0;
            String str2 = this.f136973e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            zf4 zf42 = this.f136974f;
            return zf42 != null ? e + C52418a.m58682i(3, zf42.computeSize()) : e;
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
            C50162kp3 kp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kp32.f136972d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                kp32.f136973e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    kp32.f136974f = zf43;
                }
                return 0;
            }
        }
    }
}
