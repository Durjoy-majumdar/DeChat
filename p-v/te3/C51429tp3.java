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

/* renamed from: te3.tp3 */
public class C51429tp3 extends C47465a {

    /* renamed from: d */
    public int f142321d;

    /* renamed from: e */
    public C51547uh2 f142322e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51429tp3)) {
            return false;
        }
        C51429tp3 tp32 = (C51429tp3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142321d), Integer.valueOf(tp32.f142321d)) && C46238a.m51546a(this.f142322e, tp32.f142322e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142321d);
            C51547uh2 uh22 = this.f142322e;
            if (uh22 != null) {
                aVar.mo74322i(2, uh22.computeSize());
                this.f142322e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142321d) + 0;
            C51547uh2 uh23 = this.f142322e;
            return uh23 != null ? e + C52418a.m58682i(2, uh23.computeSize()) : e;
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
            C51429tp3 tp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tp32.f142321d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51547uh2 uh24 = new C51547uh2();
                    if (bArr != null && bArr.length > 0) {
                        uh24.parseFrom(bArr);
                    }
                    tp32.f142322e = uh24;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142321d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "static_icon", valueOf, true);
            aVar.mo71655d(jSONObject, "image_url", this.f142322e, true);
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
                    if (hashCode != -877823861) {
                        if (hashCode == 885259178) {
                            if (next.equals("static_icon")) {
                                c = 0;
                            }
                        }
                    } else if (next.equals("image_url")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f142321d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C51547uh2 uh22 = new C51547uh2();
                            uh22.toPb(((JSONObject) opt).toString());
                            this.f142322e = uh22;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("ReddotPendant", e, "", new Object[0]);
            }
        }
        return this;
    }
}
