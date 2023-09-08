package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xf2 */
public class C64828xf2 extends C47465a {

    /* renamed from: d */
    public String f186294d;

    /* renamed from: e */
    public String f186295e;

    /* renamed from: f */
    public String f186296f;

    /* renamed from: g */
    public String f186297g;

    /* renamed from: h */
    public long f186298h;

    /* renamed from: i */
    public long f186299i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64828xf2)) {
            return false;
        }
        C64828xf2 xf22 = (C64828xf2) aVar;
        return C46238a.m51546a(this.f186294d, xf22.f186294d) && C46238a.m51546a(this.f186295e, xf22.f186295e) && C46238a.m51546a(this.f186296f, xf22.f186296f) && C46238a.m51546a(this.f186297g, xf22.f186297g) && C46238a.m51546a(Long.valueOf(this.f186298h), Long.valueOf(xf22.f186298h)) && C46238a.m51546a(Long.valueOf(this.f186299i), Long.valueOf(xf22.f186299i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186294d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186295e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186296f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186297g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f186298h);
            aVar.mo74321h(6, this.f186299i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f186294d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186295e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f186296f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f186297g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58681h(5, this.f186298h) + C52418a.m58681h(6, this.f186299i);
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
            C64828xf2 xf22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xf22.f186294d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xf22.f186295e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xf22.f186296f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xf22.f186297g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xf22.f186298h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    xf22.f186299i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f186294d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "downLoadId", str, false);
            aVar.mo71655d(jSONObject, "cdnUrl", this.f186295e, false);
            aVar.mo71655d(jSONObject, "patchFilePatch", this.f186296f, false);
            aVar.mo71655d(jSONObject, "status", this.f186297g, false);
            aVar.mo71655d(jSONObject, "startTime", Long.valueOf(this.f186298h), false);
            aVar.mo71655d(jSONObject, "finishDownloadTime", Long.valueOf(this.f186299i), false);
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
                        case -2129294769:
                            if (next.equals("startTime")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1483401020:
                            if (next.equals("patchFilePatch")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1364966910:
                            if (next.equals("cdnUrl")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -892481550:
                            if (next.equals("status")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -684021848:
                            if (next.equals("finishDownloadTime")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1123007459:
                            if (next.equals("downLoadId")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f186294d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f186295e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f186296f = (String) jSONObject.opt(next);
                    } else if (c == 3) {
                        this.f186297g = (String) jSONObject.opt(next);
                    } else if (c == 4) {
                        this.f186298h = jSONObject.optLong(next);
                    } else if (c == 5) {
                        this.f186299i = jSONObject.optLong(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("HdiffInstallStatus", e, "", new Object[0]);
            }
        }
        return this;
    }
}
