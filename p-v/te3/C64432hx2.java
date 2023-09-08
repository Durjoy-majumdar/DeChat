package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hx2 */
public class C64432hx2 extends C47465a {

    /* renamed from: d */
    public C64480jx2 f183564d;

    /* renamed from: e */
    public C64457ix2 f183565e;

    /* renamed from: f */
    public C49347ex2 f183566f;

    /* renamed from: g */
    public C64379fx2 f183567g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64432hx2)) {
            return false;
        }
        C64432hx2 hx22 = (C64432hx2) aVar;
        return C46238a.m51546a(this.f183564d, hx22.f183564d) && C46238a.m51546a(this.f183565e, hx22.f183565e) && C46238a.m51546a(this.f183566f, hx22.f183566f) && C46238a.m51546a(this.f183567g, hx22.f183567g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64480jx2 jx22 = this.f183564d;
            if (jx22 != null) {
                aVar.mo74322i(1, jx22.computeSize());
                this.f183564d.writeFields(aVar);
            }
            C64457ix2 ix22 = this.f183565e;
            if (ix22 != null) {
                aVar.mo74322i(2, ix22.computeSize());
                this.f183565e.writeFields(aVar);
            }
            C49347ex2 ex22 = this.f183566f;
            if (ex22 != null) {
                aVar.mo74322i(3, ex22.computeSize());
                this.f183566f.writeFields(aVar);
            }
            C64379fx2 fx22 = this.f183567g;
            if (fx22 != null) {
                aVar.mo74322i(4, fx22.computeSize());
                this.f183567g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64480jx2 jx23 = this.f183564d;
            if (jx23 != null) {
                i2 = 0 + C52418a.m58682i(1, jx23.computeSize());
            }
            C64457ix2 ix23 = this.f183565e;
            if (ix23 != null) {
                i2 += C52418a.m58682i(2, ix23.computeSize());
            }
            C49347ex2 ex23 = this.f183566f;
            if (ex23 != null) {
                i2 += C52418a.m58682i(3, ex23.computeSize());
            }
            C64379fx2 fx23 = this.f183567g;
            return fx23 != null ? i2 + C52418a.m58682i(4, fx23.computeSize()) : i2;
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
            C64432hx2 hx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64480jx2 jx24 = new C64480jx2();
                    if (bArr != null && bArr.length > 0) {
                        jx24.parseFrom(bArr);
                    }
                    hx22.f183564d = jx24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64457ix2 ix24 = new C64457ix2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ix24.parseFrom(bArr2);
                    }
                    hx22.f183565e = ix24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49347ex2 ex24 = new C49347ex2();
                    if (bArr3 != null && bArr3.length > 0) {
                        ex24.parseFrom(bArr3);
                    }
                    hx22.f183566f = ex24;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C64379fx2 fx24 = new C64379fx2();
                    if (bArr4 != null && bArr4.length > 0) {
                        fx24.parseFrom(bArr4);
                    }
                    hx22.f183567g = fx24;
                }
                return 0;
            }
        }
    }
}
