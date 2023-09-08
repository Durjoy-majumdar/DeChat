package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zk */
public class C52275zk extends C47465a {

    /* renamed from: d */
    public String f146046d;

    /* renamed from: e */
    public String f146047e;

    /* renamed from: f */
    public String f146048f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52275zk)) {
            return false;
        }
        C52275zk zkVar = (C52275zk) aVar;
        return C46238a.m51546a(this.f146046d, zkVar.f146046d) && C46238a.m51546a(this.f146047e, zkVar.f146047e) && C46238a.m51546a(this.f146048f, zkVar.f146048f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146046d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f146047e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f146048f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f146046d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f146047e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f146048f;
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
            C52275zk zkVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zkVar.f146046d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                zkVar.f146047e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                zkVar.f146048f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f146046d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "wording", str, true);
            aVar.mo71655d(jSONObject, "font_color", this.f146047e, true);
            aVar.mo71655d(jSONObject, "bg_color", this.f146048f, true);
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
                    if (hashCode != -1265068311) {
                        if (hashCode != -507058317) {
                            if (hashCode == 1524956312) {
                                if (next.equals("wording")) {
                                    c = 0;
                                }
                            }
                        } else if (next.equals("font_color")) {
                            c = 1;
                        }
                    } else if (next.equals("bg_color")) {
                        c = 2;
                    }
                    if (c == 0) {
                        this.f146046d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f146047e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f146048f = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("ButtonStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
