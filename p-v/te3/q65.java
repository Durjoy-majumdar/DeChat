package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class q65 extends C101820nt3 {

    /* renamed from: d */
    public String f140163d;

    /* renamed from: e */
    public String f140164e;

    /* renamed from: f */
    public String f140165f;

    /* renamed from: g */
    public int f140166g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q65)) {
            return false;
        }
        q65 q65 = (q65) aVar;
        return C46238a.m51546a(this.BaseRequest, q65.BaseRequest) && C46238a.m51546a(this.f140163d, q65.f140163d) && C46238a.m51546a(this.f140164e, q65.f140164e) && C46238a.m51546a(this.f140165f, q65.f140165f) && C46238a.m51546a(Integer.valueOf(this.f140166g), Integer.valueOf(q65.f140166g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f140163d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140164e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f140165f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f140166g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f140163d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f140164e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f140165f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            return i2 + C52418a.m58678e(5, this.f140166g);
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
            q65 q65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    q65.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                q65.f140163d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q65.f140164e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                q65.f140165f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                q65.f140166g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "appid", this.f140163d, false);
            aVar.mo71655d(jSONObject, "model_id", this.f140164e, false);
            aVar.mo71655d(jSONObject, "sn", this.f140165f, false);
            aVar.mo71655d(jSONObject, "status", Integer.valueOf(this.f140166g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
