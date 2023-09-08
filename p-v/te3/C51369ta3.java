package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ta3 */
public class C51369ta3 extends C47465a {

    /* renamed from: d */
    public C50367m80 f142080d;

    /* renamed from: e */
    public LinkedList<String> f142081e = new LinkedList<>();

    /* renamed from: f */
    public int f142082f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51369ta3)) {
            return false;
        }
        C51369ta3 ta32 = (C51369ta3) aVar;
        return C46238a.m51546a(this.f142080d, ta32.f142080d) && C46238a.m51546a(this.f142081e, ta32.f142081e) && C46238a.m51546a(Integer.valueOf(this.f142082f), Integer.valueOf(ta32.f142082f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50367m80 m802 = this.f142080d;
            if (m802 != null) {
                aVar.mo74322i(1, m802.computeSize());
                this.f142080d.writeFields(aVar);
            }
            aVar.mo74320g(2, 1, this.f142081e);
            aVar.mo74318e(3, this.f142082f);
            return 0;
        } else if (i == 1) {
            C50367m80 m803 = this.f142080d;
            if (m803 != null) {
                i2 = 0 + C52418a.m58682i(1, m803.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f142081e) + C52418a.m58678e(3, this.f142082f);
        } else if (i == 2) {
            this.f142081e.clear();
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
            C51369ta3 ta32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50367m80 m804 = new C50367m80();
                    if (bArr != null && bArr.length > 0) {
                        m804.parseFrom(bArr);
                    }
                    ta32.f142080d = m804;
                }
                return 0;
            } else if (intValue == 2) {
                ta32.f142081e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ta32.f142082f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
