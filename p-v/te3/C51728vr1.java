package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vr1 */
public class C51728vr1 extends C47465a {

    /* renamed from: d */
    public String f143630d;

    /* renamed from: e */
    public C89349b f143631e;

    /* renamed from: f */
    public long f143632f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51728vr1)) {
            return false;
        }
        C51728vr1 vr12 = (C51728vr1) aVar;
        return C46238a.m51546a(this.f143630d, vr12.f143630d) && C46238a.m51546a(this.f143631e, vr12.f143631e) && C46238a.m51546a(Long.valueOf(this.f143632f), Long.valueOf(vr12.f143632f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143630d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f143631e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f143632f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f143630d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C89349b bVar2 = this.f143631e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58681h(3, this.f143632f);
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
            C51728vr1 vr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vr12.f143630d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vr12.f143631e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vr12.f143632f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
