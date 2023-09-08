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

/* renamed from: te3.ey */
public class C49349ey extends C47465a {

    /* renamed from: d */
    public LinkedList<uc4> f133169d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49349ey) && C46238a.m51546a(this.f133169d, ((C49349ey) aVar).f133169d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f133169d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133169d) + 0;
        } else {
            if (i == 2) {
                this.f133169d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C49349ey eyVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    uc4 uc4 = new uc4();
                    if (bArr != null && bArr.length > 0) {
                        uc4.parseFrom(bArr);
                    }
                    eyVar.f133169d.add(uc4);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "style", this.f133169d, true);
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
                    if (next.hashCode() == 109780401) {
                        if (next.equals("style")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) opt;
                            for (int i = 0; i < jSONArray.length(); i++) {
                                Object obj = jSONArray.get(i);
                                if (obj instanceof JSONObject) {
                                    LinkedList<uc4> linkedList = this.f133169d;
                                    uc4 uc4 = new uc4();
                                    uc4.toPb(((JSONObject) obj).toString());
                                    linkedList.add(uc4);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("CombinationStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
