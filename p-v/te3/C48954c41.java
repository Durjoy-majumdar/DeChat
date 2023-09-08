package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c41 */
public class C48954c41 extends C47465a {

    /* renamed from: d */
    public String f131494d;

    /* renamed from: e */
    public C52118yh2 f131495e;

    /* renamed from: f */
    public int f131496f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48954c41)) {
            return false;
        }
        C48954c41 c412 = (C48954c41) aVar;
        return C46238a.m51546a(this.f131494d, c412.f131494d) && C46238a.m51546a(this.f131495e, c412.f131495e) && C46238a.m51546a(Integer.valueOf(this.f131496f), Integer.valueOf(c412.f131496f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131494d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C52118yh2 yh22 = this.f131495e;
            if (yh22 != null) {
                aVar.mo74322i(2, yh22.computeSize());
                this.f131495e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f131496f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131494d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C52118yh2 yh23 = this.f131495e;
            if (yh23 != null) {
                i2 += C52418a.m58682i(2, yh23.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f131496f);
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
            C48954c41 c412 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c412.f131494d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52118yh2 yh24 = new C52118yh2();
                    if (bArr != null && bArr.length > 0) {
                        yh24.parseFrom(bArr);
                    }
                    c412.f131495e = yh24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c412.f131496f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
