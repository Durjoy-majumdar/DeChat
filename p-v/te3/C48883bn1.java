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

/* renamed from: te3.bn1 */
public class C48883bn1 extends C47465a {

    /* renamed from: d */
    public int f131214d;

    /* renamed from: e */
    public C64586nn1 f131215e;

    /* renamed from: f */
    public int f131216f;

    /* renamed from: g */
    public long f131217g;

    /* renamed from: h */
    public String f131218h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48883bn1)) {
            return false;
        }
        C48883bn1 bn12 = (C48883bn1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131214d), Integer.valueOf(bn12.f131214d)) && C46238a.m51546a(this.f131215e, bn12.f131215e) && C46238a.m51546a(Integer.valueOf(this.f131216f), Integer.valueOf(bn12.f131216f)) && C46238a.m51546a(Long.valueOf(this.f131217g), Long.valueOf(bn12.f131217g)) && C46238a.m51546a(this.f131218h, bn12.f131218h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131214d);
            C64586nn1 nn12 = this.f131215e;
            if (nn12 != null) {
                aVar.mo74322i(2, nn12.computeSize());
                this.f131215e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f131216f);
            aVar.mo74321h(4, this.f131217g);
            String str = this.f131218h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131214d) + 0;
            C64586nn1 nn13 = this.f131215e;
            if (nn13 != null) {
                e += C52418a.m58682i(2, nn13.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f131216f) + C52418a.m58681h(4, this.f131217g);
            String str2 = this.f131218h;
            return str2 != null ? e2 + C52418a.m58683j(5, str2) : e2;
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
            C48883bn1 bn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bn12.f131214d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64586nn1 nn14 = new C64586nn1();
                    if (bArr != null && bArr.length > 0) {
                        nn14.parseFrom(bArr);
                    }
                    bn12.f131215e = nn14;
                }
                return 0;
            } else if (intValue == 3) {
                bn12.f131216f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                bn12.f131217g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bn12.f131218h = aVar3.mo141633k(intValue);
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
                    switch (next.hashCode()) {
                        case -1903650640:
                            if (next.equals("show_info")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -883261635:
                            if (next.equals("show_seconds")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 266611646:
                            if (next.equals("tab_tips_object_id")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 497087130:
                            if (next.equals("show_reddot")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f131214d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C64586nn1 nn12 = new C64586nn1();
                            nn12.toPb(((JSONObject) opt).toString());
                            this.f131215e = nn12;
                        }
                    } else if (c == 2) {
                        this.f131216f = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 3) {
                        this.f131217g = jSONObject.optLong(next);
                    } else if (c == 4) {
                        this.f131218h = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderSyncTipsShowInfo", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f131214d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "show_reddot", valueOf, true);
            aVar.mo71655d(jSONObject, "show_info", this.f131215e, true);
            aVar.mo71655d(jSONObject, "show_seconds", Integer.valueOf(this.f131216f), true);
            aVar.mo71655d(jSONObject, "tab_tips_object_id", Long.valueOf(this.f131217g), true);
            aVar.mo71655d(jSONObject, "tips_id", this.f131218h, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
