package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d73 */
public class C64307d73 extends C47465a {

    /* renamed from: d */
    public int f182644d;

    /* renamed from: e */
    public String f182645e;

    /* renamed from: f */
    public String f182646f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64307d73)) {
            return false;
        }
        C64307d73 d732 = (C64307d73) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182644d), Integer.valueOf(d732.f182644d)) && C46238a.m51546a(this.f182645e, d732.f182645e) && C46238a.m51546a(this.f182646f, d732.f182646f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182644d);
            String str = this.f182645e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182646f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182644d) + 0;
            String str3 = this.f182645e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f182646f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C64307d73 d732 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d732.f182644d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                d732.f182645e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                d732.f182646f = aVar3.mo141633k(intValue);
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
                    if (hashCode != 109254796) {
                        if (hashCode != 1353942442) {
                            if (hashCode == 1804799183) {
                                if (next.equals("finder_username")) {
                                    c = 1;
                                }
                            }
                        } else if (next.equals("finder_joinlive_trace_buffer")) {
                            c = 2;
                        }
                    } else if (next.equals(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f182644d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f182645e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f182646f = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("OpenIMFinderInfo", e, "", new Object[0]);
            }
        }
        return this;
    }
}
