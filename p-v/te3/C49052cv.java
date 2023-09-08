package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cv */
public class C49052cv extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f131971d = new LinkedList<>();

    /* renamed from: e */
    public String f131972e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49052cv)) {
            return false;
        }
        C49052cv cvVar = (C49052cv) aVar;
        return C46238a.m51546a(this.f131971d, cvVar.f131971d) && C46238a.m51546a(this.f131972e, cvVar.f131972e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f131971d);
            String str = this.f131972e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f131971d) + 0;
            String str2 = this.f131972e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f131971d.clear();
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
            C49052cv cvVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cvVar.f131971d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                cvVar.f131972e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
