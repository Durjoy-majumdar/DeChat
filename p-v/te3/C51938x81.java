package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x81 */
public class C51938x81 extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f144517d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f144518e;

    /* renamed from: f */
    public C89349b f144519f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51938x81)) {
            return false;
        }
        C51938x81 x812 = (C51938x81) aVar;
        return C46238a.m51546a(this.f144517d, x812.f144517d) && C46238a.m51546a(this.f144518e, x812.f144518e) && C46238a.m51546a(this.f144519f, x812.f144519f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 3, this.f144517d);
            C89349b bVar = this.f144518e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f144519f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 3, this.f144517d) + 0;
            C89349b bVar3 = this.f144518e;
            if (bVar3 != null) {
                g += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f144519f;
            return bVar4 != null ? g + C52418a.m58675b(3, bVar4) : g;
        } else if (i == 2) {
            this.f144517d.clear();
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
            C51938x81 x812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x812.f144517d.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            } else if (intValue == 2) {
                x812.f144518e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x812.f144519f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
