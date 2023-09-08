package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.h */
public class C52832h extends C47465a {

    /* renamed from: d */
    public String f147584d;

    /* renamed from: e */
    public String f147585e;

    /* renamed from: f */
    public String f147586f;

    /* renamed from: g */
    public LinkedList<String> f147587g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52832h)) {
            return false;
        }
        C52832h hVar = (C52832h) aVar;
        return C46238a.m51546a(this.f147584d, hVar.f147584d) && C46238a.m51546a(this.f147585e, hVar.f147585e) && C46238a.m51546a(this.f147586f, hVar.f147586f) && C46238a.m51546a(this.f147587g, hVar.f147587g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147584d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147585e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f147586f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f147587g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f147584d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f147585e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f147586f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 1, this.f147587g);
        } else if (i == 2) {
            this.f147587g.clear();
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
            C52832h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hVar.f147584d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hVar.f147585e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hVar.f147586f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hVar.f147587g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
