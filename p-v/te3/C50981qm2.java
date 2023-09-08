package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qm2 */
public class C50981qm2 extends C47465a {

    /* renamed from: d */
    public String f140392d;

    /* renamed from: e */
    public int f140393e;

    /* renamed from: f */
    public LinkedList<c45> f140394f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50981qm2)) {
            return false;
        }
        C50981qm2 qm22 = (C50981qm2) aVar;
        return C46238a.m51546a(this.f140392d, qm22.f140392d) && C46238a.m51546a(Integer.valueOf(this.f140393e), Integer.valueOf(qm22.f140393e)) && C46238a.m51546a(this.f140394f, qm22.f140394f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140392d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140393e);
            aVar.mo74320g(3, 8, this.f140394f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f140392d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f140393e) + C52418a.m58680g(3, 8, this.f140394f);
        } else if (i == 2) {
            this.f140394f.clear();
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
            C50981qm2 qm22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qm22.f140392d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                qm22.f140393e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    c45 c45 = new c45();
                    if (bArr != null && bArr.length > 0) {
                        c45.parseFrom(bArr);
                    }
                    qm22.f140394f.add(c45);
                }
                return 0;
            }
        }
    }
}
