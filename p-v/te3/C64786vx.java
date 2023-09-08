package te3;

import com.google.android.gms.dynamite.ProviderConstants;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vx */
public class C64786vx extends C47465a {

    /* renamed from: d */
    public String f185998d;

    /* renamed from: e */
    public String f185999e;

    /* renamed from: f */
    public String f186000f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64786vx)) {
            return false;
        }
        C64786vx vxVar = (C64786vx) aVar;
        return C46238a.m51546a(this.f185998d, vxVar.f185998d) && C46238a.m51546a(this.f185999e, vxVar.f185999e) && C46238a.m51546a(this.f186000f, vxVar.f186000f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185998d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185999e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186000f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f185998d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185999e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f186000f;
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
            C64786vx vxVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vxVar.f185998d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vxVar.f185999e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vxVar.f186000f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f185998d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appId", str, false);
            aVar.mo71655d(jSONObject, "appName", this.f185999e, false);
            aVar.mo71655d(jSONObject, ProviderConstants.API_COLNAME_FEATURE_VERSION, this.f186000f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
