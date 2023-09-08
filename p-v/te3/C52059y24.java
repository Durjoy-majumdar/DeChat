package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y24 */
public class C52059y24 extends C101820nt3 {

    /* renamed from: d */
    public String f145088d;

    /* renamed from: e */
    public String f145089e;

    /* renamed from: f */
    public C51018qv3 f145090f;

    /* renamed from: g */
    public int f145091g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52059y24)) {
            return false;
        }
        C52059y24 y242 = (C52059y24) aVar;
        return C46238a.m51546a(this.BaseRequest, y242.BaseRequest) && C46238a.m51546a(this.f145088d, y242.f145088d) && C46238a.m51546a(this.f145089e, y242.f145089e) && C46238a.m51546a(this.f145090f, y242.f145090f) && C46238a.m51546a(Integer.valueOf(this.f145091g), Integer.valueOf(y242.f145091g));
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
            String str = this.f145088d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145089e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C51018qv3 qv32 = this.f145090f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f145090f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f145091g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f145088d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f145089e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C51018qv3 qv33 = this.f145090f;
            if (qv33 != null) {
                i2 += C52418a.m58682i(4, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f145091g);
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
            C52059y24 y242 = objArr[1];
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
                    y242.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                y242.f145088d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                y242.f145089e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    y242.f145090f = qv34;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                y242.f145091g = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "Password", this.f145088d, false);
            aVar.mo71655d(jSONObject, "Ticket", this.f145089e, false);
            aVar.mo71655d(jSONObject, "AutoAuthKey", this.f145090f, false);
            aVar.mo71655d(jSONObject, "TicketType", Integer.valueOf(this.f145091g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
