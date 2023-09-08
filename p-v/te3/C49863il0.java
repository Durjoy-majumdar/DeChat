package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.il0 */
public class C49863il0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50140kk0> f135460d = new LinkedList<>();

    /* renamed from: e */
    public String f135461e;

    /* renamed from: f */
    public long f135462f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49863il0)) {
            return false;
        }
        C49863il0 il02 = (C49863il0) aVar;
        return C46238a.m51546a(this.f135460d, il02.f135460d) && C46238a.m51546a(this.f135461e, il02.f135461e) && C46238a.m51546a(Long.valueOf(this.f135462f), Long.valueOf(il02.f135462f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135460d);
            String str = this.f135461e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f135462f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f135460d) + 0;
            String str2 = this.f135461e;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            return g + C52418a.m58681h(3, this.f135462f);
        } else if (i == 2) {
            this.f135460d.clear();
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
            C49863il0 il02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50140kk0 kk02 = new C50140kk0();
                    if (bArr != null && bArr.length > 0) {
                        kk02.parseFrom(bArr);
                    }
                    il02.f135460d.add(kk02);
                }
                return 0;
            } else if (intValue == 2) {
                il02.f135461e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                il02.f135462f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
