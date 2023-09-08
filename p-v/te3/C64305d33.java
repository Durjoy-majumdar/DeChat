package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d33 */
public class C64305d33 extends C47465a {

    /* renamed from: d */
    public String f182629d;

    /* renamed from: e */
    public String f182630e;

    /* renamed from: f */
    public String f182631f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64305d33)) {
            return false;
        }
        C64305d33 d332 = (C64305d33) aVar;
        return C46238a.m51546a(this.f182629d, d332.f182629d) && C46238a.m51546a(this.f182630e, d332.f182630e) && C46238a.m51546a(this.f182631f, d332.f182631f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182629d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182630e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182631f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f182629d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182630e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182631f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
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
            C64305d33 d332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d332.f182629d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d332.f182630e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                d332.f182631f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f182629d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, TPReportKeys.Common.COMMON_SEQ, str, false);
            aVar.mo71655d(jSONObject, "url", this.f182630e, false);
            aVar.mo71655d(jSONObject, XWalkReaderBasePlugin.PARAM_KEY_TOKEN, this.f182631f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
