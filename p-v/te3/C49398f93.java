package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f93 */
public class C49398f93 extends C47465a {

    /* renamed from: d */
    public int f133363d;

    /* renamed from: e */
    public C49677h93 f133364e;

    /* renamed from: f */
    public String f133365f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49398f93)) {
            return false;
        }
        C49398f93 f932 = (C49398f93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133363d), Integer.valueOf(f932.f133363d)) && C46238a.m51546a(this.f133364e, f932.f133364e) && C46238a.m51546a(this.f133365f, f932.f133365f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133363d);
            C49677h93 h932 = this.f133364e;
            if (h932 != null) {
                aVar.mo74322i(2, h932.computeSize());
                this.f133364e.writeFields(aVar);
            }
            String str = this.f133365f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133363d) + 0;
            C49677h93 h933 = this.f133364e;
            if (h933 != null) {
                e += C52418a.m58682i(2, h933.computeSize());
            }
            String str2 = this.f133365f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C49398f93 f932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f932.f133363d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49677h93 h934 = new C49677h93();
                    if (bArr != null && bArr.length > 0) {
                        h934.parseFrom(bArr);
                    }
                    f932.f133364e = h934;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f932.f133365f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
