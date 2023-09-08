package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ve1 */
public class C64770ve1 extends C47465a {

    /* renamed from: d */
    public C64726td1 f185873d;

    /* renamed from: e */
    public String f185874e;

    /* renamed from: f */
    public int f185875f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64770ve1)) {
            return false;
        }
        C64770ve1 ve12 = (C64770ve1) aVar;
        return C46238a.m51546a(this.f185873d, ve12.f185873d) && C46238a.m51546a(this.f185874e, ve12.f185874e) && C46238a.m51546a(Integer.valueOf(this.f185875f), Integer.valueOf(ve12.f185875f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64726td1 td12 = this.f185873d;
            if (td12 != null) {
                aVar.mo74322i(1, td12.computeSize());
                this.f185873d.writeFields(aVar);
            }
            String str = this.f185874e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f185875f);
            return 0;
        } else if (i == 1) {
            C64726td1 td13 = this.f185873d;
            if (td13 != null) {
                i2 = 0 + C52418a.m58682i(1, td13.computeSize());
            }
            String str2 = this.f185874e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f185875f);
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
            C64770ve1 ve12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64726td1 td14 = new C64726td1();
                    if (bArr != null && bArr.length > 0) {
                        td14.parseFrom(bArr);
                    }
                    ve12.f185873d = td14;
                }
                return 0;
            } else if (intValue == 2) {
                ve12.f185874e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ve12.f185875f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
