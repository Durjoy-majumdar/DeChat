package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jr3 */
public class C50028jr3 extends C47465a {

    /* renamed from: d */
    public String f136278d;

    /* renamed from: e */
    public String f136279e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50028jr3)) {
            return false;
        }
        C50028jr3 jr32 = (C50028jr3) aVar;
        return C46238a.m51546a(this.f136278d, jr32.f136278d) && C46238a.m51546a(this.f136279e, jr32.f136279e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136278d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136279e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f136278d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f136279e;
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
            C50028jr3 jr32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jr32.f136278d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                jr32.f136279e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136278d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "light", str, true);
            aVar.mo71655d(jSONObject, "dark", this.f136279e, true);
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
                    if (hashCode != 3075958) {
                        if (hashCode == 102970646) {
                            if (next.equals("light")) {
                                c = 0;
                            }
                        }
                    } else if (next.equals("dark")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f136278d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f136279e = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("RenderColor", e, "", new Object[0]);
            }
        }
        return this;
    }
}
