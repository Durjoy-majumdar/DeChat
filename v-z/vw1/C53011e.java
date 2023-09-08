package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.e */
public class C53011e extends C47465a {

    /* renamed from: d */
    public String f147931d;

    /* renamed from: e */
    public String f147932e;

    /* renamed from: f */
    public String f147933f;

    /* renamed from: g */
    public String f147934g;

    /* renamed from: h */
    public int f147935h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53011e)) {
            return false;
        }
        C53011e eVar = (C53011e) aVar;
        return C46238a.m51546a(this.f147931d, eVar.f147931d) && C46238a.m51546a(this.f147932e, eVar.f147932e) && C46238a.m51546a(this.f147933f, eVar.f147933f) && C46238a.m51546a(this.f147934g, eVar.f147934g) && C46238a.m51546a(Integer.valueOf(this.f147935h), Integer.valueOf(eVar.f147935h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147931d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147932e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f147933f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f147934g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f147935h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f147931d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f147932e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f147933f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f147934g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f147935h);
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
            C53011e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eVar.f147931d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                eVar.f147932e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                eVar.f147933f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                eVar.f147934g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                eVar.f147935h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
