package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rc */
public class C51087rc extends C47465a {

    /* renamed from: d */
    public String f140811d;

    /* renamed from: e */
    public String f140812e;

    /* renamed from: f */
    public int f140813f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51087rc)) {
            return false;
        }
        C51087rc rcVar = (C51087rc) aVar;
        return C46238a.m51546a(this.f140811d, rcVar.f140811d) && C46238a.m51546a(this.f140812e, rcVar.f140812e) && C46238a.m51546a(Integer.valueOf(this.f140813f), Integer.valueOf(rcVar.f140813f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140811d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140812e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f140813f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140811d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140812e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f140813f);
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
            C51087rc rcVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rcVar.f140811d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rcVar.f140812e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                rcVar.f140813f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f140811d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "wording", str, true);
            aVar.mo71655d(jSONObject, "recommend_reason", this.f140812e, true);
            aVar.mo71655d(jSONObject, "highlight_time", Integer.valueOf(this.f140813f), true);
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
                    if (hashCode != 516640632) {
                        if (hashCode != 1524956312) {
                            if (hashCode == 1781166887) {
                                if (next.equals("recommend_reason")) {
                                    c = 1;
                                }
                            }
                        } else if (next.equals("wording")) {
                            c = 0;
                        }
                    } else if (next.equals("highlight_time")) {
                        c = 2;
                    }
                    if (c == 0) {
                        this.f140811d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f140812e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f140813f = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BigButtonStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
