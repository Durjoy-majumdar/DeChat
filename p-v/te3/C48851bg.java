package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bg */
public class C48851bg extends C47465a {

    /* renamed from: d */
    public String f131091d;

    /* renamed from: e */
    public LinkedList<String> f131092e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48851bg)) {
            return false;
        }
        C48851bg bgVar = (C48851bg) aVar;
        return C46238a.m51546a(this.f131091d, bgVar.f131091d) && C46238a.m51546a(this.f131092e, bgVar.f131092e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131091d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f131092e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131091d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f131092e);
        } else if (i == 2) {
            this.f131092e.clear();
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
            C48851bg bgVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bgVar.f131091d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bgVar.f131092e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
