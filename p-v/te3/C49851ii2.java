package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ii2 */
public class C49851ii2 extends C47465a {

    /* renamed from: d */
    public String f135362d;

    /* renamed from: e */
    public C50675of3 f135363e;

    /* renamed from: f */
    public C50675of3 f135364f;

    /* renamed from: g */
    public int f135365g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49851ii2)) {
            return false;
        }
        C49851ii2 ii22 = (C49851ii2) aVar;
        return C46238a.m51546a(this.f135362d, ii22.f135362d) && C46238a.m51546a(this.f135363e, ii22.f135363e) && C46238a.m51546a(this.f135364f, ii22.f135364f) && C46238a.m51546a(Integer.valueOf(this.f135365g), Integer.valueOf(ii22.f135365g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135362d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50675of3 of32 = this.f135363e;
            if (of32 != null) {
                aVar.mo74322i(2, of32.computeSize());
                this.f135363e.writeFields(aVar);
            }
            C50675of3 of33 = this.f135364f;
            if (of33 != null) {
                aVar.mo74322i(3, of33.computeSize());
                this.f135364f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f135365g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f135362d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C50675of3 of34 = this.f135363e;
            if (of34 != null) {
                i2 += C52418a.m58682i(2, of34.computeSize());
            }
            C50675of3 of35 = this.f135364f;
            if (of35 != null) {
                i2 += C52418a.m58682i(3, of35.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f135365g);
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
            C49851ii2 ii22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ii22.f135362d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50675of3 of36 = new C50675of3();
                    if (bArr != null && bArr.length > 0) {
                        of36.parseFrom(bArr);
                    }
                    ii22.f135363e = of36;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50675of3 of37 = new C50675of3();
                    if (bArr2 != null && bArr2.length > 0) {
                        of37.parseFrom(bArr2);
                    }
                    ii22.f135364f = of37;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ii22.f135365g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
