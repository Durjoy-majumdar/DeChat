package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z33 */
public class C52212z33 extends C47465a {

    /* renamed from: d */
    public String f145671d;

    /* renamed from: e */
    public String f145672e;

    /* renamed from: f */
    public String f145673f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52212z33)) {
            return false;
        }
        C52212z33 z332 = (C52212z33) aVar;
        return C46238a.m51546a(this.f145671d, z332.f145671d) && C46238a.m51546a(this.f145672e, z332.f145672e) && C46238a.m51546a(this.f145673f, z332.f145673f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145671d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145672e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f145673f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f145671d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f145672e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f145673f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
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
            C52212z33 z332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z332.f145671d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                z332.f145672e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                z332.f145673f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f145671d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "icon_url", str, true);
            aVar.mo71655d(jSONObject, "wording", this.f145672e, true);
            aVar.mo71655d(jSONObject, "recommend_reason", this.f145673f, true);
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
                        if (hashCode != 1524956312) {
                            if (hashCode == 1781166887) {
                                if (next.equals("recommend_reason")) {
                                    c = 2;
                                }
                            }
                        } else if (next.equals("wording")) {
                            c = 1;
                        }
                    } else if (next.equals("icon_url")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f145671d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f145672e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f145673f = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("NormalBubbleStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
