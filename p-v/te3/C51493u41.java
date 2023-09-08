package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u41 */
public class C51493u41 extends C47465a {

    /* renamed from: d */
    public long f142590d;

    /* renamed from: e */
    public int f142591e;

    /* renamed from: f */
    public C64265bq2 f142592f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51493u41)) {
            return false;
        }
        C51493u41 u412 = (C51493u41) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142590d), Long.valueOf(u412.f142590d)) && C46238a.m51546a(Integer.valueOf(this.f142591e), Integer.valueOf(u412.f142591e)) && C46238a.m51546a(this.f142592f, u412.f142592f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142590d);
            aVar.mo74318e(2, this.f142591e);
            C64265bq2 bq22 = this.f142592f;
            if (bq22 != null) {
                aVar.mo74322i(3, bq22.computeSize());
                this.f142592f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f142590d) + 0 + C52418a.m58678e(2, this.f142591e);
            C64265bq2 bq23 = this.f142592f;
            return bq23 != null ? h + C52418a.m58682i(3, bq23.computeSize()) : h;
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
            C51493u41 u412 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u412.f142590d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                u412.f142591e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64265bq2 bq24 = new C64265bq2();
                    if (bArr != null && bArr.length > 0) {
                        bq24.parseFrom(bArr);
                    }
                    u412.f142592f = bq24;
                }
                return 0;
            }
        }
    }
}
