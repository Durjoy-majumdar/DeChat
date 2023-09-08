package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l03 */
public class C50200l03 extends C47465a {

    /* renamed from: d */
    public String f137121d;

    /* renamed from: e */
    public double f137122e;

    /* renamed from: f */
    public long f137123f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50200l03)) {
            return false;
        }
        C50200l03 l032 = (C50200l03) aVar;
        return C46238a.m51546a(this.f137121d, l032.f137121d) && C46238a.m51546a(Double.valueOf(this.f137122e), Double.valueOf(l032.f137122e)) && C46238a.m51546a(Long.valueOf(this.f137123f), Long.valueOf(l032.f137123f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137121d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74316c(2, this.f137122e);
                aVar.mo74321h(3, this.f137123f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i == 1) {
            String str2 = this.f137121d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58676c(2, this.f137122e) + C52418a.m58681h(3, this.f137123f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137121d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50200l03 l032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l032.f137121d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                l032.f137122e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                l032.f137123f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f137121d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Username", str, false);
            aVar.mo71655d(jSONObject, "Score", Double.valueOf(this.f137122e), false);
            aVar.mo71655d(jSONObject, "LastUpdateTime", Long.valueOf(this.f137123f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
