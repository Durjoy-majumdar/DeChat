package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y9 */
public class C52086y9 extends C47465a {

    /* renamed from: d */
    public int f145185d;

    /* renamed from: e */
    public C52275zk f145186e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52086y9)) {
            return false;
        }
        C52086y9 y9Var = (C52086y9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145185d), Integer.valueOf(y9Var.f145185d)) && C46238a.m51546a(this.f145186e, y9Var.f145186e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145185d);
            C52275zk zkVar = this.f145186e;
            if (zkVar != null) {
                aVar.mo74322i(2, zkVar.computeSize());
                this.f145186e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145185d) + 0;
            C52275zk zkVar2 = this.f145186e;
            return zkVar2 != null ? e + C52418a.m58682i(2, zkVar2.computeSize()) : e;
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
            C52086y9 y9Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y9Var.f145185d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52275zk zkVar3 = new C52275zk();
                    if (bArr != null && bArr.length > 0) {
                        zkVar3.parseFrom(bArr);
                    }
                    y9Var.f145186e = zkVar3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f145185d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "status", valueOf, true);
            aVar.mo71655d(jSONObject, "button_style", this.f145186e, true);
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
                    if (hashCode != -892481550) {
                        if (hashCode == 1292368484) {
                            if (next.equals("button_style")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("status")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f145185d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C52275zk zkVar = new C52275zk();
                            zkVar.toPb(((JSONObject) opt).toString());
                            this.f145186e = zkVar;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BariableButtonInfo", e, "", new Object[0]);
            }
        }
        return this;
    }
}
