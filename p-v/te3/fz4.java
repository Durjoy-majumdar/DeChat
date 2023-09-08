package te3;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fz4 extends C47465a {

    /* renamed from: d */
    public String f354021d;

    /* renamed from: e */
    public int f354022e;

    /* renamed from: f */
    public C89349b f354023f;

    /* renamed from: g */
    public String f354024g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fz4)) {
            return false;
        }
        fz4 fz4 = (fz4) aVar;
        return C46238a.m51546a(this.f354021d, fz4.f354021d) && C46238a.m51546a(Integer.valueOf(this.f354022e), Integer.valueOf(fz4.f354022e)) && C46238a.m51546a(this.f354023f, fz4.f354023f) && C46238a.m51546a(this.f354024g, fz4.f354024g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354021d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f354022e);
            C89349b bVar = this.f354023f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f354024g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f354021d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f354022e);
            C89349b bVar2 = this.f354023f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            String str4 = this.f354024g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            fz4 fz4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fz4.f354021d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fz4.f354022e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                fz4.f354023f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fz4.f354024g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f354021d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appid", str, true);
            aVar.mo71655d(jSONObject, "version_type", Integer.valueOf(this.f354022e), true);
            aVar.mo71655d(jSONObject, "data_buffer", this.f354023f, true);
            aVar.mo71655d(jSONObject, "path", this.f354024g, true);
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
                        case -1815507339:
                            if (next.equals("data_buffer")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -102469055:
                            if (next.equals("version_type")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals("path")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 93029116:
                            if (next.equals("appid")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f354021d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        this.f354022e = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 2) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof String) {
                            this.f354023f = C89349b.m111674a(Base64.decode((String) opt, 0));
                        }
                    } else if (c == 3) {
                        this.f354024g = (String) jSONObject.opt(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("WeAppData", e, "", new Object[0]);
            }
        }
        return this;
    }
}
