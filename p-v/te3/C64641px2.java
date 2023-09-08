package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.px2 */
public class C64641px2 extends C47465a {

    /* renamed from: d */
    public C64480jx2 f184912d;

    /* renamed from: e */
    public C64240aq3 f184913e;

    /* renamed from: f */
    public C49347ex2 f184914f;

    /* renamed from: g */
    public C64379fx2 f184915g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64641px2)) {
            return false;
        }
        C64641px2 px22 = (C64641px2) aVar;
        return C46238a.m51546a(this.f184912d, px22.f184912d) && C46238a.m51546a(this.f184913e, px22.f184913e) && C46238a.m51546a(this.f184914f, px22.f184914f) && C46238a.m51546a(this.f184915g, px22.f184915g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64480jx2 jx22 = this.f184912d;
            if (jx22 != null) {
                aVar.mo74322i(1, jx22.computeSize());
                this.f184912d.writeFields(aVar);
            }
            C64240aq3 aq32 = this.f184913e;
            if (aq32 != null) {
                aVar.mo74322i(2, aq32.computeSize());
                this.f184913e.writeFields(aVar);
            }
            C49347ex2 ex22 = this.f184914f;
            if (ex22 != null) {
                aVar.mo74322i(3, ex22.computeSize());
                this.f184914f.writeFields(aVar);
            }
            C64379fx2 fx22 = this.f184915g;
            if (fx22 != null) {
                aVar.mo74322i(4, fx22.computeSize());
                this.f184915g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64480jx2 jx23 = this.f184912d;
            if (jx23 != null) {
                i2 = 0 + C52418a.m58682i(1, jx23.computeSize());
            }
            C64240aq3 aq33 = this.f184913e;
            if (aq33 != null) {
                i2 += C52418a.m58682i(2, aq33.computeSize());
            }
            C49347ex2 ex23 = this.f184914f;
            if (ex23 != null) {
                i2 += C52418a.m58682i(3, ex23.computeSize());
            }
            C64379fx2 fx23 = this.f184915g;
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
            C64641px2 px22 = objArr[1];
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
                    px22.f184912d = jx24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64240aq3 aq34 = new C64240aq3();
                    if (bArr2 != null && bArr2.length > 0) {
                        aq34.parseFrom(bArr2);
                    }
                    px22.f184913e = aq34;
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
                    px22.f184914f = ex24;
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
                    px22.f184915g = fx24;
                }
                return 0;
            }
        }
    }
}
