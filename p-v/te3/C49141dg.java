package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dg */
public class C49141dg extends C47465a {

    /* renamed from: d */
    public String f132299d;

    /* renamed from: e */
    public LinkedList<String> f132300e = new LinkedList<>();

    /* renamed from: f */
    public String f132301f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49141dg)) {
            return false;
        }
        C49141dg dgVar = (C49141dg) aVar;
        return C46238a.m51546a(this.f132299d, dgVar.f132299d) && C46238a.m51546a(this.f132300e, dgVar.f132300e) && C46238a.m51546a(this.f132301f, dgVar.f132301f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132299d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f132300e);
            String str2 = this.f132301f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f132299d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f132300e);
            String str4 = this.f132301f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f132300e.clear();
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
            C49141dg dgVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dgVar.f132299d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                dgVar.f132300e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                dgVar.f132301f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
