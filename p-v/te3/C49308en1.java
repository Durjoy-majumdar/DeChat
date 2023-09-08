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

/* renamed from: te3.en1 */
public class C49308en1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50301lr3> f133024d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49308en1) && C46238a.m51546a(this.f133024d, ((C49308en1) aVar).f133024d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f133024d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133024d) + 0;
        } else {
            if (i == 2) {
                this.f133024d.clear();
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
                C49308en1 en12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50301lr3 lr32 = new C50301lr3();
                    if (bArr != null && bArr.length > 0) {
                        lr32.parseFrom(bArr);
                    }
                    en12.f133024d.add(lr32);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "nodes", this.f133024d, true);
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
                    if (next.hashCode() == 104993457) {
                        if (next.equals("nodes")) {
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
                                    LinkedList<C50301lr3> linkedList = this.f133024d;
                                    C50301lr3 lr32 = new C50301lr3();
                                    lr32.toPb(((JSONObject) obj).toString());
                                    linkedList.add(lr32);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderTabTipsDSLRenderTmpl", e, "", new Object[0]);
            }
        }
        return this;
    }
}
