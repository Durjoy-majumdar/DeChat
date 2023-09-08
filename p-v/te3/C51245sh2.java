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

/* renamed from: te3.sh2 */
public class C51245sh2 extends C47465a {

    /* renamed from: d */
    public String f141519d;

    /* renamed from: e */
    public C51547uh2 f141520e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51245sh2)) {
            return false;
        }
        C51245sh2 sh22 = (C51245sh2) aVar;
        return C46238a.m51546a(this.f141519d, sh22.f141519d) && C46238a.m51546a(this.f141520e, sh22.f141520e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141519d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51547uh2 uh22 = this.f141520e;
            if (uh22 != null) {
                aVar.mo74322i(2, uh22.computeSize());
                this.f141520e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f141519d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51547uh2 uh23 = this.f141520e;
            return uh23 != null ? i2 + C52418a.m58682i(2, uh23.computeSize()) : i2;
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
            C51245sh2 sh22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sh22.f141519d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51547uh2 uh24 = new C51547uh2();
                    if (bArr != null && bArr.length > 0) {
                        uh24.parseFrom(bArr);
                    }
                    sh22.f141520e = uh24;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f141519d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "icon_image_key", str, true);
            aVar.mo71655d(jSONObject, "icon_url", this.f141520e, true);
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
                    if (hashCode != -1545796299) {
                        if (hashCode == -737588055) {
                            if (next.equals("icon_url")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("icon_image_key")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f141519d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C51547uh2 uh22 = new C51547uh2();
                            uh22.toPb(((JSONObject) opt).toString());
                            this.f141520e = uh22;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Icon", e, "", new Object[0]);
            }
        }
        return this;
    }
}
