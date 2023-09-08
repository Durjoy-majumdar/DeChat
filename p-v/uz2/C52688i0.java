package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.i0 */
public class C52688i0 extends C47465a {

    /* renamed from: d */
    public int f147136d;

    /* renamed from: e */
    public String f147137e;

    /* renamed from: f */
    public String f147138f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52688i0)) {
            return false;
        }
        C52688i0 i0Var = (C52688i0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147136d), Integer.valueOf(i0Var.f147136d)) && C46238a.m51546a(this.f147137e, i0Var.f147137e) && C46238a.m51546a(this.f147138f, i0Var.f147138f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147136d);
            String str = this.f147137e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147138f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147136d) + 0;
            String str3 = this.f147137e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f147138f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C52688i0 i0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i0Var.f147136d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                i0Var.f147137e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                i0Var.f147138f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147136d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "action_type", valueOf, false);
            aVar.mo71655d(jSONObject, "url", this.f147137e, false);
            aVar.mo71655d(jSONObject, "ext_info", this.f147138f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
