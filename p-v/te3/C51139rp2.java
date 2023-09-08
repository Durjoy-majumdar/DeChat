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

/* renamed from: te3.rp2 */
public class C51139rp2 extends C47465a {

    /* renamed from: d */
    public C49098d51 f141072d;

    /* renamed from: e */
    public String f141073e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51139rp2)) {
            return false;
        }
        C51139rp2 rp22 = (C51139rp2) aVar;
        return C46238a.m51546a(this.f141072d, rp22.f141072d) && C46238a.m51546a(this.f141073e, rp22.f141073e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49098d51 d512 = this.f141072d;
            if (d512 != null) {
                aVar.mo74322i(1, d512.computeSize());
                this.f141072d.writeFields(aVar);
            }
            String str = this.f141073e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C49098d51 d513 = this.f141072d;
            if (d513 != null) {
                i2 = 0 + C52418a.m58682i(1, d513.computeSize());
            }
            String str2 = this.f141073e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C51139rp2 rp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49098d51 d514 = new C49098d51();
                    if (bArr != null && bArr.length > 0) {
                        d514.parseFrom(bArr);
                    }
                    rp22.f141072d = d514;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                rp22.f141073e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49098d51 d512 = this.f141072d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "live_notice_info", d512, true);
            aVar.mo71655d(jSONObject, "byp_report_chnl_extra", this.f141073e, true);
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
                    if (hashCode != -1480291879) {
                        if (hashCode == -324396318) {
                            if (next.equals("live_notice_info")) {
                                c = 0;
                            }
                        }
                    } else if (next.equals("byp_report_chnl_extra")) {
                        c = 1;
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            this.f141072d = (C49098d51) new C49098d51().toPb(((JSONObject) opt).toString());
                        }
                    } else if (c == 1) {
                        this.f141073e = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("LiveReservationStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
