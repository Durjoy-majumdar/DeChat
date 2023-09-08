package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.r1 */
public class C52712r1 extends C47465a {

    /* renamed from: d */
    public String f147195d;

    /* renamed from: e */
    public boolean f147196e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52712r1)) {
            return false;
        }
        C52712r1 r1Var = (C52712r1) aVar;
        return C46238a.m51546a(this.f147195d, r1Var.f147195d) && C46238a.m51546a(Boolean.valueOf(this.f147196e), Boolean.valueOf(r1Var.f147196e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147195d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f147196e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f147195d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.f147196e);
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
            C52712r1 r1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r1Var.f147195d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                r1Var.f147196e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147195d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "enc_username", str, false);
            aVar.mo71655d(jSONObject, "block", Boolean.valueOf(this.f147196e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
