package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u1 */
public class C118471u1 extends C47465a {

    /* renamed from: d */
    public LinkedList<mf4> f354473d = new LinkedList<>();

    /* renamed from: e */
    public C118463s1 f354474e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118471u1)) {
            return false;
        }
        C118471u1 u1Var = (C118471u1) aVar;
        return C46238a.m51546a(this.f354473d, u1Var.f354473d) && C46238a.m51546a(this.f354474e, u1Var.f354474e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f354473d);
            C118463s1 s1Var = this.f354474e;
            if (s1Var != null) {
                aVar.mo74322i(2, s1Var.computeSize());
                this.f354474e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f354473d) + 0;
            C118463s1 s1Var2 = this.f354474e;
            return s1Var2 != null ? g + C52418a.m58682i(2, s1Var2.computeSize()) : g;
        } else if (i == 2) {
            this.f354473d.clear();
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
            C118471u1 u1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    mf4 mf4 = new mf4();
                    if (bArr != null && bArr.length > 0) {
                        mf4.parseFrom(bArr);
                    }
                    u1Var.f354473d.add(mf4);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C118463s1 s1Var3 = new C118463s1();
                    if (bArr2 != null && bArr2.length > 0) {
                        s1Var3.parseFrom(bArr2);
                    }
                    u1Var.f354474e = s1Var3;
                }
                return 0;
            }
        }
    }
}
