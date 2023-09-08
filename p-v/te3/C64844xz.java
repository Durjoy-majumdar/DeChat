package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xz */
public class C64844xz extends C47465a {

    /* renamed from: d */
    public String f186422d;

    /* renamed from: e */
    public LinkedList<Integer> f186423e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64844xz)) {
            return false;
        }
        C64844xz xzVar = (C64844xz) aVar;
        return C46238a.m51546a(this.f186422d, xzVar.f186422d) && C46238a.m51546a(this.f186423e, xzVar.f186423e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186422d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 2, this.f186423e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f186422d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 2, this.f186423e);
        } else if (i == 2) {
            this.f186423e.clear();
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
            C64844xz xzVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xzVar.f186422d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                xzVar.f186423e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
