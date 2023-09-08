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

/* renamed from: te3.ir3 */
public class C49888ir3 extends C47465a {

    /* renamed from: d */
    public C51028qy f135628d;

    /* renamed from: e */
    public C49570gk f135629e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49888ir3)) {
            return false;
        }
        C49888ir3 ir32 = (C49888ir3) aVar;
        return C46238a.m51546a(this.f135628d, ir32.f135628d) && C46238a.m51546a(this.f135629e, ir32.f135629e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51028qy qyVar = this.f135628d;
            if (qyVar != null) {
                aVar.mo74322i(1, qyVar.computeSize());
                this.f135628d.writeFields(aVar);
            }
            C49570gk gkVar = this.f135629e;
            if (gkVar != null) {
                aVar.mo74322i(2, gkVar.computeSize());
                this.f135629e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51028qy qyVar2 = this.f135628d;
            if (qyVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, qyVar2.computeSize());
            }
            C49570gk gkVar2 = this.f135629e;
            return gkVar2 != null ? i2 + C52418a.m58682i(2, gkVar2.computeSize()) : i2;
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
            C49888ir3 ir32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51028qy qyVar3 = new C51028qy();
                    if (bArr != null && bArr.length > 0) {
                        qyVar3.parseFrom(bArr);
                    }
                    ir32.f135628d = qyVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49570gk gkVar3 = new C49570gk();
                    if (bArr2 != null && bArr2.length > 0) {
                        gkVar3.parseFrom(bArr2);
                    }
                    ir32.f135629e = gkVar3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C51028qy qyVar = this.f135628d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "common", qyVar, true);
            aVar.mo71655d(jSONObject, "business", this.f135629e, true);
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
                    if (hashCode != -1354814997) {
                        if (hashCode == -1146830912) {
                            if (next.equals("business")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("common")) {
                        c = 0;
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C51028qy qyVar = new C51028qy();
                            qyVar.toPb(((JSONObject) opt).toString());
                            this.f135628d = qyVar;
                        }
                    } else if (c == 1) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C49570gk gkVar = new C49570gk();
                            gkVar.toPb(((JSONObject) opt2).toString());
                            this.f135629e = gkVar;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("RenderAttr", e, "", new Object[0]);
            }
        }
        return this;
    }
}
