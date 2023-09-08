package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g00 */
public class C49493g00 extends C47465a {

    /* renamed from: d */
    public boolean f133755d;

    /* renamed from: e */
    public String f133756e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49493g00)) {
            return false;
        }
        C49493g00 g002 = (C49493g00) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f133755d), Boolean.valueOf(g002.f133755d)) && C46238a.m51546a(this.f133756e, g002.f133756e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f133755d);
            String str = this.f133756e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f133755d) + 0;
            String str2 = this.f133756e;
            return str2 != null ? a + C52418a.m58683j(2, str2) : a;
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
            C49493g00 g002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g002.f133755d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                g002.f133756e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean valueOf = Boolean.valueOf(this.f133755d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "use_remark", valueOf, true);
            aVar.mo71655d(jSONObject, "username", this.f133756e, true);
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
                    if (hashCode != -1512045256) {
                        if (hashCode == -265713450) {
                            if (next.equals("username")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("use_remark")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f133755d = ((Boolean) jSONObject.opt(next)).booleanValue();
                    } else if (c == 1) {
                        this.f133756e = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("ContentAttr", e, "", new Object[0]);
            }
        }
        return this;
    }
}
