package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kl0 */
public class C50144kl0 extends C47465a {

    /* renamed from: d */
    public C49842ig0 f136874d;

    /* renamed from: e */
    public int f136875e;

    /* renamed from: f */
    public String f136876f;

    /* renamed from: g */
    public int f136877g;

    /* renamed from: h */
    public LinkedList<C50080k43> f136878h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50144kl0)) {
            return false;
        }
        C50144kl0 kl02 = (C50144kl0) aVar;
        return C46238a.m51546a(this.f136874d, kl02.f136874d) && C46238a.m51546a(Integer.valueOf(this.f136875e), Integer.valueOf(kl02.f136875e)) && C46238a.m51546a(this.f136876f, kl02.f136876f) && C46238a.m51546a(Integer.valueOf(this.f136877g), Integer.valueOf(kl02.f136877g)) && C46238a.m51546a(this.f136878h, kl02.f136878h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49842ig0 ig02 = this.f136874d;
            if (ig02 != null) {
                aVar.mo74322i(1, ig02.computeSize());
                this.f136874d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136875e);
            String str = this.f136876f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f136877g);
            aVar.mo74320g(5, 8, this.f136878h);
            return 0;
        } else if (i == 1) {
            C49842ig0 ig03 = this.f136874d;
            if (ig03 != null) {
                i2 = 0 + C52418a.m58682i(1, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136875e);
            String str2 = this.f136876f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f136877g) + C52418a.m58680g(5, 8, this.f136878h);
        } else if (i == 2) {
            this.f136878h.clear();
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
            C50144kl0 kl02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr != null && bArr.length > 0) {
                        ig04.parseFrom(bArr);
                    }
                    kl02.f136874d = ig04;
                }
                return 0;
            } else if (intValue == 2) {
                kl02.f136875e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                kl02.f136876f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                kl02.f136877g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50080k43 k432 = new C50080k43();
                    if (bArr2 != null && bArr2.length > 0) {
                        k432.parseFrom(bArr2);
                    }
                    kl02.f136878h.add(k432);
                }
                return 0;
            }
        }
    }
}
