package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gw4 extends C47465a {

    /* renamed from: d */
    public String f134333d;

    /* renamed from: e */
    public String f134334e;

    /* renamed from: f */
    public LinkedList<String> f134335f = new LinkedList<>();

    /* renamed from: g */
    public int f134336g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gw4)) {
            return false;
        }
        gw4 gw4 = (gw4) aVar;
        return C46238a.m51546a(this.f134333d, gw4.f134333d) && C46238a.m51546a(this.f134334e, gw4.f134334e) && C46238a.m51546a(this.f134335f, gw4.f134335f) && C46238a.m51546a(Integer.valueOf(this.f134336g), Integer.valueOf(gw4.f134336g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134333d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134334e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 1, this.f134335f);
            aVar.mo74318e(4, this.f134336g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f134333d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f134334e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 1, this.f134335f) + C52418a.m58678e(4, this.f134336g);
        } else if (i == 2) {
            this.f134335f.clear();
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
            gw4 gw4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gw4.f134333d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gw4.f134334e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gw4.f134335f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gw4.f134336g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
