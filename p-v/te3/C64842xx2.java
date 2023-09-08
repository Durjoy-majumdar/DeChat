package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xx2 */
public class C64842xx2 extends C47465a {

    /* renamed from: d */
    public boolean f186414d;

    /* renamed from: e */
    public String f186415e;

    /* renamed from: f */
    public LinkedList<Integer> f186416f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64842xx2)) {
            return false;
        }
        C64842xx2 xx22 = (C64842xx2) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f186414d), Boolean.valueOf(xx22.f186414d)) && C46238a.m51546a(this.f186415e, xx22.f186415e) && C46238a.m51546a(this.f186416f, xx22.f186416f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f186414d);
            String str = this.f186415e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f186416f);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f186414d) + 0;
            String str2 = this.f186415e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            return a + C52418a.m58680g(3, 2, this.f186416f);
        } else if (i == 2) {
            this.f186416f.clear();
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
            C64842xx2 xx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xx22.f186414d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                xx22.f186415e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xx22.f186416f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
