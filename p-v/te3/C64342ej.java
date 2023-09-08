package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ej */
public class C64342ej extends C47465a {

    /* renamed from: d */
    public String f182972d;

    /* renamed from: e */
    public int f182973e;

    /* renamed from: f */
    public int f182974f;

    /* renamed from: g */
    public String f182975g;

    /* renamed from: h */
    public int f182976h;

    /* renamed from: i */
    public String f182977i;

    /* renamed from: j */
    public int f182978j;

    /* renamed from: n */
    public int f182979n;

    /* renamed from: o */
    public int f182980o;

    /* renamed from: p */
    public String f182981p;

    /* renamed from: q */
    public int f182982q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64342ej)) {
            return false;
        }
        C64342ej ejVar = (C64342ej) aVar;
        return C46238a.m51546a(this.f182972d, ejVar.f182972d) && C46238a.m51546a(Integer.valueOf(this.f182973e), Integer.valueOf(ejVar.f182973e)) && C46238a.m51546a(Integer.valueOf(this.f182974f), Integer.valueOf(ejVar.f182974f)) && C46238a.m51546a(this.f182975g, ejVar.f182975g) && C46238a.m51546a(Integer.valueOf(this.f182976h), Integer.valueOf(ejVar.f182976h)) && C46238a.m51546a(this.f182977i, ejVar.f182977i) && C46238a.m51546a(Integer.valueOf(this.f182978j), Integer.valueOf(ejVar.f182978j)) && C46238a.m51546a(Integer.valueOf(this.f182979n), Integer.valueOf(ejVar.f182979n)) && C46238a.m51546a(Integer.valueOf(this.f182980o), Integer.valueOf(ejVar.f182980o)) && C46238a.m51546a(this.f182981p, ejVar.f182981p) && C46238a.m51546a(Integer.valueOf(this.f182982q), Integer.valueOf(ejVar.f182982q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182972d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182973e);
            aVar.mo74318e(3, this.f182974f);
            String str2 = this.f182975g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f182976h);
            String str3 = this.f182977i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f182978j);
            aVar.mo74318e(8, this.f182979n);
            aVar.mo74318e(9, this.f182980o);
            String str4 = this.f182981p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            aVar.mo74318e(15, this.f182982q);
            return 0;
        } else if (i == 1) {
            String str5 = this.f182972d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f182973e) + C52418a.m58678e(3, this.f182974f);
            String str6 = this.f182975g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f182976h);
            String str7 = this.f182977i;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f182978j) + C52418a.m58678e(8, this.f182979n) + C52418a.m58678e(9, this.f182980o);
            String str8 = this.f182981p;
            if (str8 != null) {
                e3 += C52418a.m58683j(10, str8);
            }
            return e3 + C52418a.m58678e(15, this.f182982q);
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
            C64342ej ejVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 15) {
                switch (intValue) {
                    case 1:
                        ejVar.f182972d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        ejVar.f182973e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        ejVar.f182974f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        ejVar.f182975g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        ejVar.f182976h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        ejVar.f182977i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        ejVar.f182978j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        ejVar.f182979n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        ejVar.f182980o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        ejVar.f182981p = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                ejVar.f182982q = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f182972d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appid", str, false);
            aVar.mo71655d(jSONObject, "version_type", Integer.valueOf(this.f182973e), false);
            aVar.mo71655d(jSONObject, "app_version", Integer.valueOf(this.f182974f), false);
            aVar.mo71655d(jSONObject, "extinfo", this.f182975g, false);
            aVar.mo71655d(jSONObject, "appuin", Integer.valueOf(this.f182976h), false);
            aVar.mo71655d(jSONObject, "debugurl", this.f182977i, false);
            aVar.mo71655d(jSONObject, "isrefresh", Integer.valueOf(this.f182978j), false);
            aVar.mo71655d(jSONObject, "isdevtools", Integer.valueOf(this.f182979n), false);
            aVar.mo71655d(jSONObject, "isusing_cached_location", Integer.valueOf(this.f182980o), false);
            aVar.mo71655d(jSONObject, "from_url", this.f182981p, false);
            aVar.mo71655d(jSONObject, "screen_width", Integer.valueOf(this.f182982q), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
