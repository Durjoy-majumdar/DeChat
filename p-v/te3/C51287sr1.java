package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sr1 */
public class C51287sr1 extends C47465a {

    /* renamed from: d */
    public C50300lr1 f141698d;

    /* renamed from: e */
    public LinkedList<String> f141699e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51287sr1)) {
            return false;
        }
        C51287sr1 sr12 = (C51287sr1) aVar;
        return C46238a.m51546a(this.f141698d, sr12.f141698d) && C46238a.m51546a(this.f141699e, sr12.f141699e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50300lr1 lr12 = this.f141698d;
            if (lr12 != null) {
                if (lr12 != null) {
                    aVar.mo74322i(1, lr12.computeSize());
                    this.f141698d.writeFields(aVar);
                }
                aVar.mo74320g(2, 1, this.f141699e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: GameItem");
        } else if (i == 1) {
            C50300lr1 lr13 = this.f141698d;
            if (lr13 != null) {
                i2 = 0 + C52418a.m58682i(1, lr13.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f141699e);
        } else if (i == 2) {
            this.f141699e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141698d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: GameItem");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51287sr1 sr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50300lr1 lr14 = new C50300lr1();
                    if (bArr != null && bArr.length > 0) {
                        lr14.parseFrom(bArr);
                    }
                    sr12.f141698d = lr14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                sr12.f141699e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
