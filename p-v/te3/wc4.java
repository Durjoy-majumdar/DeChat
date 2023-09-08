package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wc4 extends C47465a {

    /* renamed from: d */
    public String f186073d;

    /* renamed from: e */
    public String f186074e;

    /* renamed from: f */
    public String f186075f;

    /* renamed from: g */
    public String f186076g;

    /* renamed from: h */
    public String f186077h;

    /* renamed from: i */
    public String f186078i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wc4)) {
            return false;
        }
        wc4 wc4 = (wc4) aVar;
        return C46238a.m51546a(this.f186073d, wc4.f186073d) && C46238a.m51546a(this.f186074e, wc4.f186074e) && C46238a.m51546a(this.f186075f, wc4.f186075f) && C46238a.m51546a(this.f186076g, wc4.f186076g) && C46238a.m51546a(this.f186077h, wc4.f186077h) && C46238a.m51546a(this.f186078i, wc4.f186078i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186073d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186074e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186075f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186076g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f186077h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f186078i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f186073d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f186074e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f186075f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f186076g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f186077h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f186078i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            wc4 wc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wc4.f186073d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wc4.f186074e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wc4.f186075f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wc4.f186076g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wc4.f186077h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wc4.f186078i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f186073d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "subTitle", str, true);
            aVar.mo71655d(jSONObject, "iconUrl", this.f186074e, true);
            aVar.mo71655d(jSONObject, "lightColor", this.f186075f, true);
            aVar.mo71655d(jSONObject, "darkColor", this.f186076g, true);
            aVar.mo71655d(jSONObject, "iconLightColor", this.f186077h, true);
            aVar.mo71655d(jSONObject, "iconDarkColor", this.f186078i, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -2090050568:
                            if (next.equals("subTitle")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1878095475:
                            if (next.equals("darkColor")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1715118778:
                            if (next.equals("iconLightColor")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -234567699:
                            if (next.equals("lightColor")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1537828116:
                            if (next.equals("iconDarkColor")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1638765110:
                            if (next.equals("iconUrl")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f186073d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f186074e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f186075f = (String) jSONObject.opt(next);
                    } else if (c == 3) {
                        this.f186076g = (String) jSONObject.opt(next);
                    } else if (c == 4) {
                        this.f186077h = (String) jSONObject.opt(next);
                    } else if (c == 5) {
                        this.f186078i = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("SubContent", e, "", new Object[0]);
            }
        }
        return this;
    }
}
