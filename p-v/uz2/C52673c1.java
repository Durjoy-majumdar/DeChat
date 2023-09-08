package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.c1 */
public class C52673c1 extends C47465a {

    /* renamed from: d */
    public String f147067d;

    /* renamed from: e */
    public String f147068e;

    /* renamed from: f */
    public String f147069f;

    /* renamed from: g */
    public int f147070g;

    /* renamed from: h */
    public int f147071h;

    /* renamed from: i */
    public int f147072i;

    /* renamed from: j */
    public long f147073j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52673c1)) {
            return false;
        }
        C52673c1 c1Var = (C52673c1) aVar;
        return C46238a.m51546a(this.f147067d, c1Var.f147067d) && C46238a.m51546a(this.f147068e, c1Var.f147068e) && C46238a.m51546a(this.f147069f, c1Var.f147069f) && C46238a.m51546a(Integer.valueOf(this.f147070g), Integer.valueOf(c1Var.f147070g)) && C46238a.m51546a(Integer.valueOf(this.f147071h), Integer.valueOf(c1Var.f147071h)) && C46238a.m51546a(Integer.valueOf(this.f147072i), Integer.valueOf(c1Var.f147072i)) && C46238a.m51546a(Long.valueOf(this.f147073j), Long.valueOf(c1Var.f147073j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147067d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147068e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f147069f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f147070g);
            aVar.mo74318e(5, this.f147071h);
            aVar.mo74318e(6, this.f147072i);
            aVar.mo74321h(7, this.f147073j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f147067d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f147068e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f147069f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f147070g) + C52418a.m58678e(5, this.f147071h) + C52418a.m58678e(6, this.f147072i) + C52418a.m58681h(7, this.f147073j);
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
            C52673c1 c1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c1Var.f147067d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c1Var.f147068e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c1Var.f147069f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c1Var.f147070g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    c1Var.f147071h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    c1Var.f147072i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    c1Var.f147073j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147067d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "text_status_id", str, false);
            aVar.mo71655d(jSONObject, "topic_id", this.f147068e, false);
            aVar.mo71655d(jSONObject, "ext_info", this.f147069f, false);
            aVar.mo71655d(jSONObject, "liked_count", Integer.valueOf(this.f147070g), false);
            aVar.mo71655d(jSONObject, "create_time", Integer.valueOf(this.f147071h), false);
            aVar.mo71655d(jSONObject, "referenced_count", Integer.valueOf(this.f147072i), false);
            aVar.mo71655d(jSONObject, "key", Long.valueOf(this.f147073j), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
