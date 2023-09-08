package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.l0 */
public class C52697l0 extends C47465a {

    /* renamed from: d */
    public int f147156d;

    /* renamed from: e */
    public int f147157e;

    /* renamed from: f */
    public String f147158f;

    /* renamed from: g */
    public C89349b f147159g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52697l0)) {
            return false;
        }
        C52697l0 l0Var = (C52697l0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147156d), Integer.valueOf(l0Var.f147156d)) && C46238a.m51546a(Integer.valueOf(this.f147157e), Integer.valueOf(l0Var.f147157e)) && C46238a.m51546a(this.f147158f, l0Var.f147158f) && C46238a.m51546a(this.f147159g, l0Var.f147159g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147156d);
            aVar.mo74318e(2, this.f147157e);
            String str = this.f147158f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f147159g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147156d) + 0 + C52418a.m58678e(2, this.f147157e);
            String str2 = this.f147158f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f147159g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C52697l0 l0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l0Var.f147156d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                l0Var.f147157e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                l0Var.f147158f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l0Var.f147159g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147156d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "cmd_id", valueOf, false);
            aVar.mo71655d(jSONObject, "ret_code", Integer.valueOf(this.f147157e), false);
            aVar.mo71655d(jSONObject, "ret_msg", this.f147158f, false);
            aVar.mo71655d(jSONObject, "ret_buf", this.f147159g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
