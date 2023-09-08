package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lz2 */
public class C50331lz2 extends C47465a {

    /* renamed from: d */
    public String f137726d;

    /* renamed from: e */
    public String f137727e;

    /* renamed from: f */
    public String f137728f;

    /* renamed from: g */
    public int f137729g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50331lz2)) {
            return false;
        }
        C50331lz2 lz22 = (C50331lz2) aVar;
        return C46238a.m51546a(this.f137726d, lz22.f137726d) && C46238a.m51546a(this.f137727e, lz22.f137727e) && C46238a.m51546a(this.f137728f, lz22.f137728f) && C46238a.m51546a(Integer.valueOf(this.f137729g), Integer.valueOf(lz22.f137729g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137726d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137727e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137728f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f137729g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f137726d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f137727e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f137728f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f137729g);
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
            C50331lz2 lz22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lz22.f137726d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lz22.f137727e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lz22.f137728f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lz22.f137729g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f137726d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appid", str, false);
            aVar.mo71655d(jSONObject, "plugin_appid", this.f137727e, false);
            aVar.mo71655d(jSONObject, "scope", this.f137728f, false);
            aVar.mo71655d(jSONObject, "state", Integer.valueOf(this.f137729g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
