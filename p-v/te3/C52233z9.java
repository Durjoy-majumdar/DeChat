package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z9 */
public class C52233z9 extends C47465a {

    /* renamed from: d */
    public int f145767d;

    /* renamed from: e */
    public LinkedList<C52086y9> f145768e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52233z9)) {
            return false;
        }
        C52233z9 z9Var = (C52233z9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145767d), Integer.valueOf(z9Var.f145767d)) && C46238a.m51546a(this.f145768e, z9Var.f145768e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145767d);
            aVar.mo74320g(2, 8, this.f145768e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f145767d) + 0 + C52418a.m58680g(2, 8, this.f145768e);
        } else {
            if (i == 2) {
                this.f145768e.clear();
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
                C52233z9 z9Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    z9Var.f145767d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52086y9 y9Var = new C52086y9();
                        if (bArr != null && bArr.length > 0) {
                            y9Var.parseFrom(bArr);
                        }
                        z9Var.f145768e.add(y9Var);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f145767d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "current_status", valueOf, true);
            aVar.mo71655d(jSONObject, "braiable_button_list", this.f145768e, true);
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
                    if (hashCode != -2041118050) {
                        if (hashCode == -1438538376) {
                            if (next.equals("current_status")) {
                                c = 0;
                            }
                        }
                    } else if (next.equals("braiable_button_list")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f145767d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) opt;
                            for (int i = 0; i < jSONArray.length(); i++) {
                                Object obj = jSONArray.get(i);
                                if (obj instanceof JSONObject) {
                                    LinkedList<C52086y9> linkedList = this.f145768e;
                                    C52086y9 y9Var = new C52086y9();
                                    y9Var.toPb(((JSONObject) obj).toString());
                                    linkedList.add(y9Var);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BariableButtonStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
