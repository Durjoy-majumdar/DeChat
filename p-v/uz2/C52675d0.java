package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.d0 */
public class C52675d0 extends C47465a {

    /* renamed from: d */
    public int f147075d;

    /* renamed from: e */
    public String f147076e;

    /* renamed from: f */
    public String f147077f;

    /* renamed from: g */
    public long f147078g;

    /* renamed from: h */
    public String f147079h;

    /* renamed from: i */
    public int f147080i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52675d0)) {
            return false;
        }
        C52675d0 d0Var = (C52675d0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147075d), Integer.valueOf(d0Var.f147075d)) && C46238a.m51546a(this.f147076e, d0Var.f147076e) && C46238a.m51546a(this.f147077f, d0Var.f147077f) && C46238a.m51546a(Long.valueOf(this.f147078g), Long.valueOf(d0Var.f147078g)) && C46238a.m51546a(this.f147079h, d0Var.f147079h) && C46238a.m51546a(Integer.valueOf(this.f147080i), Integer.valueOf(d0Var.f147080i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147075d);
            String str = this.f147076e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147077f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f147078g);
            String str3 = this.f147079h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f147080i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147075d) + 0;
            String str4 = this.f147076e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f147077f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int h = e + C52418a.m58681h(4, this.f147078g);
            String str6 = this.f147079h;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            return h + C52418a.m58678e(6, this.f147080i);
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
            C52675d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d0Var.f147075d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    d0Var.f147076e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d0Var.f147077f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d0Var.f147078g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    d0Var.f147079h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d0Var.f147080i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147075d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "action", valueOf, false);
            aVar.mo71655d(jSONObject, "tag", this.f147076e, false);
            aVar.mo71655d(jSONObject, "source_id", this.f147077f, false);
            aVar.mo71655d(jSONObject, "card_key", Long.valueOf(this.f147078g), false);
            aVar.mo71655d(jSONObject, "status_id", this.f147079h, false);
            aVar.mo71655d(jSONObject, "modify_count", Integer.valueOf(this.f147080i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
