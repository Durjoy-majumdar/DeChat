package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v81 */
public class C51660v81 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f143383d = new LinkedList<>();

    /* renamed from: e */
    public int f143384e;

    /* renamed from: f */
    public String f143385f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51660v81)) {
            return false;
        }
        C51660v81 v812 = (C51660v81) aVar;
        return C46238a.m51546a(this.f143383d, v812.f143383d) && C46238a.m51546a(Integer.valueOf(this.f143384e), Integer.valueOf(v812.f143384e)) && C46238a.m51546a(this.f143385f, v812.f143385f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f143383d);
            aVar.mo74318e(2, this.f143384e);
            String str = this.f143385f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f143383d) + 0 + C52418a.m58678e(2, this.f143384e);
            String str2 = this.f143385f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f143383d.clear();
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
            C51660v81 v812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v812.f143383d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 2) {
                v812.f143384e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                v812.f143385f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
