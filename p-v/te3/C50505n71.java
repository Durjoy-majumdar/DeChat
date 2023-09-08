package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n71 */
public class C50505n71 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f138455d;

    /* renamed from: e */
    public long f138456e;

    /* renamed from: f */
    public int f138457f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50505n71)) {
            return false;
        }
        C50505n71 n712 = (C50505n71) aVar;
        return C46238a.m51546a(this.f138455d, n712.f138455d) && C46238a.m51546a(Long.valueOf(this.f138456e), Long.valueOf(n712.f138456e)) && C46238a.m51546a(Integer.valueOf(this.f138457f), Integer.valueOf(n712.f138457f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f138455d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f138455d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f138456e);
            aVar.mo74318e(3, this.f138457f);
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f138455d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f138456e) + C52418a.m58678e(3, this.f138457f);
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
            C50505n71 n712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    n712.f138455d = hx04;
                }
                return 0;
            } else if (intValue == 2) {
                n712.f138456e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n712.f138457f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
