package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jq2 */
public class C50023jq2 extends C47465a {

    /* renamed from: d */
    public String f136256d;

    /* renamed from: e */
    public String f136257e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50023jq2)) {
            return false;
        }
        C50023jq2 jq22 = (C50023jq2) aVar;
        return C46238a.m51546a(this.f136256d, jq22.f136256d) && C46238a.m51546a(this.f136257e, jq22.f136257e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136256d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136257e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f136256d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f136257e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            C50023jq2 jq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jq22.f136256d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                jq22.f136257e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136256d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "icon_url", str, true);
            aVar.mo71655d(jSONObject, "wording", this.f136257e, true);
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
                    int hashCode = next.hashCode();
                    if (hashCode != -737588055) {
                        if (hashCode == 1524956312) {
                            if (next.equals("wording")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("icon_url")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f136256d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f136257e = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("LoadingStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
