package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tq3 */
public class C51432tq3 extends C47465a {

    /* renamed from: d */
    public int f142362d;

    /* renamed from: e */
    public int f142363e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51432tq3)) {
            return false;
        }
        C51432tq3 tq32 = (C51432tq3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142362d), Integer.valueOf(tq32.f142362d)) && C46238a.m51546a(Integer.valueOf(this.f142363e), Integer.valueOf(tq32.f142363e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142362d);
            aVar.mo74318e(2, this.f142363e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142362d) + 0 + C52418a.m58678e(2, this.f142363e);
        } else {
            if (i == 2) {
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
                C51432tq3 tq32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tq32.f142362d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    tq32.f142363e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142362d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "abscissa_percent", valueOf, true);
            aVar.mo71655d(jSONObject, "ordinate_percent", Integer.valueOf(this.f142363e), true);
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
                    if (hashCode != -349314897) {
                        if (hashCode == 766563346) {
                            if (next.equals("ordinate_percent")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("abscissa_percent")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f142362d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f142363e = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("RelativePosition", e, "", new Object[0]);
            }
        }
        return this;
    }
}
