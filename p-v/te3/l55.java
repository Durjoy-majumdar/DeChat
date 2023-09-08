package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class l55 extends C47465a {

    /* renamed from: d */
    public C49388f7 f137189d;

    /* renamed from: e */
    public int f137190e;

    /* renamed from: f */
    public int f137191f;

    /* renamed from: g */
    public int f137192g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof l55)) {
            return false;
        }
        l55 l55 = (l55) aVar;
        return C46238a.m51546a(this.f137189d, l55.f137189d) && C46238a.m51546a(Integer.valueOf(this.f137190e), Integer.valueOf(l55.f137190e)) && C46238a.m51546a(Integer.valueOf(this.f137191f), Integer.valueOf(l55.f137191f)) && C46238a.m51546a(Integer.valueOf(this.f137192g), Integer.valueOf(l55.f137192g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49388f7 f7Var = this.f137189d;
            if (f7Var != null) {
                aVar.mo74322i(1, f7Var.computeSize());
                this.f137189d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137190e);
            aVar.mo74318e(3, this.f137191f);
            aVar.mo74318e(4, this.f137192g);
            return 0;
        } else if (i == 1) {
            C49388f7 f7Var2 = this.f137189d;
            if (f7Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, f7Var2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137190e) + C52418a.m58678e(3, this.f137191f) + C52418a.m58678e(4, this.f137192g);
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
            l55 l55 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49388f7 f7Var3 = new C49388f7();
                    if (bArr != null && bArr.length > 0) {
                        f7Var3.parseFrom(bArr);
                    }
                    l55.f137189d = f7Var3;
                }
                return 0;
            } else if (intValue == 2) {
                l55.f137190e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                l55.f137191f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l55.f137192g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
