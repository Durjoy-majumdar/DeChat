package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zf4 extends C47465a {

    /* renamed from: d */
    public LinkedList<vf4> f145863d = new LinkedList<>();

    /* renamed from: e */
    public String f145864e;

    /* renamed from: f */
    public int f145865f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zf4)) {
            return false;
        }
        zf4 zf4 = (zf4) aVar;
        return C46238a.m51546a(this.f145863d, zf4.f145863d) && C46238a.m51546a(this.f145864e, zf4.f145864e) && C46238a.m51546a(Integer.valueOf(this.f145865f), Integer.valueOf(zf4.f145865f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f145863d);
            String str = this.f145864e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145865f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f145863d) + 0;
            String str2 = this.f145864e;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            return g + C52418a.m58678e(3, this.f145865f);
        } else if (i == 2) {
            this.f145863d.clear();
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
            zf4 zf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    vf4 vf4 = new vf4();
                    if (bArr != null && bArr.length > 0) {
                        vf4.parseFrom(bArr);
                    }
                    zf4.f145863d.add(vf4);
                }
                return 0;
            } else if (intValue == 2) {
                zf4.f145864e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                zf4.f145865f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
