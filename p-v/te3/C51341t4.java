package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t4 */
public class C51341t4 extends C47465a {

    /* renamed from: d */
    public String f141938d;

    /* renamed from: e */
    public C77935gl2 f141939e;

    /* renamed from: f */
    public C77935gl2 f141940f;

    /* renamed from: g */
    public int f141941g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51341t4)) {
            return false;
        }
        C51341t4 t4Var = (C51341t4) aVar;
        return C46238a.m51546a(this.f141938d, t4Var.f141938d) && C46238a.m51546a(this.f141939e, t4Var.f141939e) && C46238a.m51546a(this.f141940f, t4Var.f141940f) && C46238a.m51546a(Integer.valueOf(this.f141941g), Integer.valueOf(t4Var.f141941g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141938d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C77935gl2 gl22 = this.f141939e;
            if (gl22 != null) {
                aVar.mo74322i(2, gl22.computeSize());
                this.f141939e.writeFields(aVar);
            }
            C77935gl2 gl23 = this.f141940f;
            if (gl23 != null) {
                aVar.mo74322i(3, gl23.computeSize());
                this.f141940f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f141941g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f141938d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C77935gl2 gl24 = this.f141939e;
            if (gl24 != null) {
                i2 += C52418a.m58682i(2, gl24.computeSize());
            }
            C77935gl2 gl25 = this.f141940f;
            if (gl25 != null) {
                i2 += C52418a.m58682i(3, gl25.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f141941g);
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
            C51341t4 t4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t4Var.f141938d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C77935gl2 gl26 = new C77935gl2();
                    if (bArr != null && bArr.length > 0) {
                        gl26.parseFrom(bArr);
                    }
                    t4Var.f141939e = gl26;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77935gl2 gl27 = new C77935gl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        gl27.parseFrom(bArr2);
                    }
                    t4Var.f141940f = gl27;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                t4Var.f141941g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
