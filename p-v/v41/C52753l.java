package v41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.l */
public class C52753l extends C47465a {

    /* renamed from: d */
    public boolean f147405d;

    /* renamed from: e */
    public String f147406e;

    /* renamed from: f */
    public String f147407f;

    /* renamed from: g */
    public String f147408g;

    /* renamed from: h */
    public int f147409h;

    /* renamed from: i */
    public boolean f147410i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52753l)) {
            return false;
        }
        C52753l lVar = (C52753l) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f147405d), Boolean.valueOf(lVar.f147405d)) && C46238a.m51546a(this.f147406e, lVar.f147406e) && C46238a.m51546a(this.f147407f, lVar.f147407f) && C46238a.m51546a(this.f147408g, lVar.f147408g) && C46238a.m51546a(Integer.valueOf(this.f147409h), Integer.valueOf(lVar.f147409h)) && C46238a.m51546a(Boolean.valueOf(this.f147410i), Boolean.valueOf(lVar.f147410i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f147405d);
            String str = this.f147406e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147407f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147408g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f147409h);
            aVar.mo74314a(6, this.f147410i);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f147405d) + 0;
            String str4 = this.f147406e;
            if (str4 != null) {
                a += C52418a.m58683j(2, str4);
            }
            String str5 = this.f147407f;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            String str6 = this.f147408g;
            if (str6 != null) {
                a += C52418a.m58683j(4, str6);
            }
            return a + C52418a.m58678e(5, this.f147409h) + C52418a.m58674a(6, this.f147410i);
        } else if (i == 2) {
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
            C52753l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lVar.f147405d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    lVar.f147406e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lVar.f147407f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lVar.f147408g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lVar.f147409h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lVar.f147410i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
