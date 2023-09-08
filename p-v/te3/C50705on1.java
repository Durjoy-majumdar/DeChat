package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.on1 */
public class C50705on1 extends C47465a {

    /* renamed from: d */
    public int f139267d;

    /* renamed from: e */
    public String f139268e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50705on1)) {
            return false;
        }
        C50705on1 on12 = (C50705on1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139267d), Integer.valueOf(on12.f139267d)) && C46238a.m51546a(this.f139268e, on12.f139268e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139267d);
            String str = this.f139268e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139267d) + 0;
            String str2 = this.f139268e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C50705on1 on12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                on12.f139267d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                on12.f139268e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f139267d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "jumpPriority", valueOf, true);
            aVar.mo71655d(jSONObject, "show_ext_info", this.f139268e, true);
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
                    if (hashCode != -609434638) {
                        if (hashCode == -86367474) {
                            if (next.equals("show_ext_info")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("jumpPriority")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f139267d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f139268e = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderTipsShowTabExtInfo", e, "", new Object[0]);
            }
        }
        return this;
    }
}
