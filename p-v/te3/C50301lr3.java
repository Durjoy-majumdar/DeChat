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

/* renamed from: te3.lr3 */
public class C50301lr3 extends C47465a {

    /* renamed from: d */
    public int f137619d;

    /* renamed from: e */
    public C50170kr3 f137620e;

    /* renamed from: f */
    public C49888ir3 f137621f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50301lr3)) {
            return false;
        }
        C50301lr3 lr32 = (C50301lr3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137619d), Integer.valueOf(lr32.f137619d)) && C46238a.m51546a(this.f137620e, lr32.f137620e) && C46238a.m51546a(this.f137621f, lr32.f137621f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137619d);
            C50170kr3 kr32 = this.f137620e;
            if (kr32 != null) {
                aVar.mo74322i(2, kr32.computeSize());
                this.f137620e.writeFields(aVar);
            }
            C49888ir3 ir32 = this.f137621f;
            if (ir32 != null) {
                aVar.mo74322i(3, ir32.computeSize());
                this.f137621f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137619d) + 0;
            C50170kr3 kr33 = this.f137620e;
            if (kr33 != null) {
                e += C52418a.m58682i(2, kr33.computeSize());
            }
            C49888ir3 ir33 = this.f137621f;
            return ir33 != null ? e + C52418a.m58682i(3, ir33.computeSize()) : e;
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
            C50301lr3 lr32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lr32.f137619d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50170kr3 kr34 = new C50170kr3();
                    if (bArr != null && bArr.length > 0) {
                        kr34.parseFrom(bArr);
                    }
                    lr32.f137620e = kr34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49888ir3 ir34 = new C49888ir3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ir34.parseFrom(bArr2);
                    }
                    lr32.f137621f = ir34;
                }
                return 0;
            }
        }
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
                    if (hashCode != 3004913) {
                        if (hashCode != 109780401) {
                            if (hashCode == 951530617) {
                                if (next.equals("content")) {
                                    c = 1;
                                }
                            }
                        } else if (next.equals("style")) {
                            c = 0;
                        }
                    } else if (next.equals("attr")) {
                        c = 2;
                    }
                    if (c == 0) {
                        this.f137619d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C50170kr3 kr32 = new C50170kr3();
                            kr32.toPb(((JSONObject) opt).toString());
                            this.f137620e = kr32;
                        }
                    } else if (c == 2) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C49888ir3 ir32 = new C49888ir3();
                            ir32.toPb(((JSONObject) opt2).toString());
                            this.f137621f = ir32;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("RenderNode", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f137619d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "style", valueOf, true);
            aVar.mo71655d(jSONObject, "content", this.f137620e, true);
            aVar.mo71655d(jSONObject, "attr", this.f137621f, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
