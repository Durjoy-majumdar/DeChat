package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ya1 */
public class C52092ya1 extends C47465a {

    /* renamed from: d */
    public int f145209d;

    /* renamed from: e */
    public String f145210e;

    /* renamed from: f */
    public int f145211f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52092ya1)) {
            return false;
        }
        C52092ya1 ya12 = (C52092ya1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145209d), Integer.valueOf(ya12.f145209d)) && C46238a.m51546a(this.f145210e, ya12.f145210e) && C46238a.m51546a(Integer.valueOf(this.f145211f), Integer.valueOf(ya12.f145211f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145209d);
            String str = this.f145210e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145211f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145209d) + 0;
            String str2 = this.f145210e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f145211f);
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
            C52092ya1 ya12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ya12.f145209d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ya12.f145210e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ya12.f145211f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f145209d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "rewardedDuration", valueOf, true);
            aVar.mo71655d(jSONObject, "feedbackInfo", this.f145210e, true);
            aVar.mo71655d(jSONObject, "closeType", Integer.valueOf(this.f145211f), true);
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
                    if (hashCode != -1726121517) {
                        if (hashCode != -1282863166) {
                            if (hashCode == -482466478) {
                                if (next.equals("closeType")) {
                                    c = 2;
                                }
                            }
                        } else if (next.equals("rewardedDuration")) {
                            c = 0;
                        }
                    } else if (next.equals("feedbackInfo")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f145209d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f145210e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f145211f = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderLiveWxaAdResult", e, "", new Object[0]);
            }
        }
        return this;
    }
}
