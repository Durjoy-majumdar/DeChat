package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ro */
public class C51133ro extends C47465a {

    /* renamed from: d */
    public String f141056d;

    /* renamed from: e */
    public LinkedList<String> f141057e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51133ro)) {
            return false;
        }
        C51133ro roVar = (C51133ro) aVar;
        return C46238a.m51546a(this.f141056d, roVar.f141056d) && C46238a.m51546a(this.f141057e, roVar.f141057e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141056d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f141057e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f141056d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f141057e);
        } else if (i == 2) {
            this.f141057e.clear();
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
            C51133ro roVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                roVar.f141056d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                roVar.f141057e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
