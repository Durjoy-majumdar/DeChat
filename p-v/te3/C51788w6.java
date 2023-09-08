package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w6 */
public class C51788w6 extends C47465a {

    /* renamed from: d */
    public int f143871d;

    /* renamed from: e */
    public int f143872e;

    /* renamed from: f */
    public int f143873f;

    /* renamed from: g */
    public C51929x6 f143874g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51788w6)) {
            return false;
        }
        C51788w6 w6Var = (C51788w6) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143871d), Integer.valueOf(w6Var.f143871d)) && C46238a.m51546a(Integer.valueOf(this.f143872e), Integer.valueOf(w6Var.f143872e)) && C46238a.m51546a(Integer.valueOf(this.f143873f), Integer.valueOf(w6Var.f143873f)) && C46238a.m51546a(this.f143874g, w6Var.f143874g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143871d);
            aVar.mo74318e(2, this.f143872e);
            aVar.mo74318e(3, this.f143873f);
            C51929x6 x6Var = this.f143874g;
            if (x6Var != null) {
                aVar.mo74322i(4, x6Var.computeSize());
                this.f143874g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143871d) + 0 + C52418a.m58678e(2, this.f143872e) + C52418a.m58678e(3, this.f143873f);
            C51929x6 x6Var2 = this.f143874g;
            return x6Var2 != null ? e + C52418a.m58682i(4, x6Var2.computeSize()) : e;
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
            C51788w6 w6Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w6Var.f143871d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                w6Var.f143872e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                w6Var.f143873f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51929x6 x6Var3 = new C51929x6();
                    if (bArr != null && bArr.length > 0) {
                        x6Var3.parseFrom(bArr);
                    }
                    w6Var.f143874g = x6Var3;
                }
                return 0;
            }
        }
    }
}
