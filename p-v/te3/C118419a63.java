package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a63 */
public class C118419a63 extends C47465a {

    /* renamed from: d */
    public fh4 f353901d;

    /* renamed from: e */
    public boolean f353902e = false;

    /* renamed from: f */
    public boolean f353903f = false;

    /* renamed from: g */
    public String f353904g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118419a63)) {
            return false;
        }
        C118419a63 a632 = (C118419a63) aVar;
        return C46238a.m51546a(this.f353901d, a632.f353901d) && C46238a.m51546a(Boolean.valueOf(this.f353902e), Boolean.valueOf(a632.f353902e)) && C46238a.m51546a(Boolean.valueOf(this.f353903f), Boolean.valueOf(a632.f353903f)) && C46238a.m51546a(this.f353904g, a632.f353904g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f353901d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f353901d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f353902e);
            aVar.mo74314a(3, this.f353903f);
            String str = this.f353904g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f353901d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f353902e) + C52418a.m58674a(3, this.f353903f);
            String str2 = this.f353904g;
            return str2 != null ? a + C52418a.m58683j(4, str2) : a;
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
            C118419a63 a632 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    fh4 fh43 = new fh4();
                    if (bArr != null && bArr.length > 0) {
                        fh43.parseFrom(bArr);
                    }
                    a632.f353901d = fh43;
                }
                return 0;
            } else if (intValue == 2) {
                a632.f353902e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                a632.f353903f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                a632.f353904g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
