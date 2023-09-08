package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.n */
public class C52700n extends C47465a {

    /* renamed from: d */
    public String f147163d;

    /* renamed from: e */
    public long f147164e;

    /* renamed from: f */
    public String f147165f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52700n)) {
            return false;
        }
        C52700n nVar = (C52700n) aVar;
        return C46238a.m51546a(this.f147163d, nVar.f147163d) && C46238a.m51546a(Long.valueOf(this.f147164e), Long.valueOf(nVar.f147164e)) && C46238a.m51546a(this.f147165f, nVar.f147165f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147163d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f147164e);
            String str2 = this.f147165f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f147163d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f147164e);
            String str4 = this.f147165f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
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
            C52700n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nVar.f147163d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nVar.f147164e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nVar.f147165f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147163d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "iconId", str, false);
            aVar.mo71655d(jSONObject, "postTime", Long.valueOf(this.f147164e), false);
            aVar.mo71655d(jSONObject, "statusDesc", this.f147165f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
