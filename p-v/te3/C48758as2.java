package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.as2 */
public class C48758as2 extends C47465a {

    /* renamed from: d */
    public String f130750d;

    /* renamed from: e */
    public String f130751e;

    /* renamed from: f */
    public String f130752f;

    /* renamed from: g */
    public int f130753g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48758as2)) {
            return false;
        }
        C48758as2 as22 = (C48758as2) aVar;
        return C46238a.m51546a(this.f130750d, as22.f130750d) && C46238a.m51546a(this.f130751e, as22.f130751e) && C46238a.m51546a(this.f130752f, as22.f130752f) && C46238a.m51546a(Integer.valueOf(this.f130753g), Integer.valueOf(as22.f130753g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130750d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130751e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130752f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f130753g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f130750d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f130751e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f130752f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f130753g);
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
            C48758as2 as22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                as22.f130750d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                as22.f130751e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                as22.f130752f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                as22.f130753g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f130750d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "icon_url", str, true);
            aVar.mo71655d(jSONObject, "wording", this.f130751e, true);
            aVar.mo71655d(jSONObject, "recommend_reason", this.f130752f, true);
            aVar.mo71655d(jSONObject, "lucky_status", Integer.valueOf(this.f130753g), true);
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
                        case -737588055:
                            if (next.equals("icon_url")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1109695785:
                            if (next.equals("lucky_status")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1524956312:
                            if (next.equals("wording")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1781166887:
                            if (next.equals("recommend_reason")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f130750d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f130751e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f130752f = (String) jSONObject.opt(next);
                    } else if (c == 3) {
                        this.f130753g = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("LuckyBag", e, "", new Object[0]);
            }
        }
        return this;
    }
}
