package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hp2 */
public class C49737hp2 extends C47465a {

    /* renamed from: d */
    public String f134807d;

    /* renamed from: e */
    public String f134808e;

    /* renamed from: f */
    public long f134809f;

    /* renamed from: g */
    public long f134810g;

    /* renamed from: h */
    public String f134811h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49737hp2)) {
            return false;
        }
        C49737hp2 hp22 = (C49737hp2) aVar;
        return C46238a.m51546a(this.f134807d, hp22.f134807d) && C46238a.m51546a(this.f134808e, hp22.f134808e) && C46238a.m51546a(Long.valueOf(this.f134809f), Long.valueOf(hp22.f134809f)) && C46238a.m51546a(Long.valueOf(this.f134810g), Long.valueOf(hp22.f134810g)) && C46238a.m51546a(this.f134811h, hp22.f134811h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134807d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134808e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f134809f);
            aVar.mo74321h(4, this.f134810g);
            String str3 = this.f134811h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f134807d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f134808e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f134809f) + C52418a.m58681h(4, this.f134810g);
            String str6 = this.f134811h;
            return str6 != null ? h + C52418a.m58683j(5, str6) : h;
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
            C49737hp2 hp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hp22.f134807d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hp22.f134808e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hp22.f134809f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                hp22.f134810g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                hp22.f134811h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134807d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "object_desc", str, true);
            aVar.mo71655d(jSONObject, "recommend_reason", this.f134808e, true);
            aVar.mo71655d(jSONObject, "object_id", Long.valueOf(this.f134809f), true);
            aVar.mo71655d(jSONObject, "live_id", Long.valueOf(this.f134810g), true);
            aVar.mo71655d(jSONObject, "byp_report_chnl_extra", this.f134811h, true);
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
                    switch (next.hashCode()) {
                        case -1489595877:
                            if (next.equals("object_id")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1480291879:
                            if (next.equals("byp_report_chnl_extra")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1277672559:
                            if (next.equals("object_desc")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 184289614:
                            if (next.equals("live_id")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1781166887:
                            if (next.equals("recommend_reason")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f134807d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f134808e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f134809f = jSONObject.optLong(next);
                    } else if (c == 3) {
                        this.f134810g = jSONObject.optLong(next);
                    } else if (c == 4) {
                        this.f134811h = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("LiveLivingStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
