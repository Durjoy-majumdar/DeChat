package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.th2 */
public class C51397th2 extends C47465a {

    /* renamed from: d */
    public int f142219d;

    /* renamed from: e */
    public int f142220e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51397th2)) {
            return false;
        }
        C51397th2 th22 = (C51397th2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142219d), Integer.valueOf(th22.f142219d)) && C46238a.m51546a(Integer.valueOf(this.f142220e), Integer.valueOf(th22.f142220e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142219d);
            aVar.mo74318e(2, this.f142220e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142219d) + 0 + C52418a.m58678e(2, this.f142220e);
        } else {
            if (i == 2) {
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
                C51397th2 th22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    th22.f142219d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    th22.f142220e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142219d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "id", valueOf, true);
            aVar.mo71655d(jSONObject, "positionFlag", Integer.valueOf(this.f142220e), true);
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
                    if (hashCode != 3355) {
                        if (hashCode == 33640501) {
                            if (next.equals("positionFlag")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("id")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f142219d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f142220e = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("IconConfig", e, "", new Object[0]);
            }
        }
        return this;
    }
}
