package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class s45 extends C49335eu3 {

    /* renamed from: d */
    public bp4 f141326d;

    /* renamed from: e */
    public LinkedList<C51793w7> f141327e = new LinkedList<>();

    /* renamed from: f */
    public v75 f141328f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s45)) {
            return false;
        }
        s45 s45 = (s45) aVar;
        return C46238a.m51546a(this.BaseResponse, s45.BaseResponse) && C46238a.m51546a(this.f141326d, s45.f141326d) && C46238a.m51546a(this.f141327e, s45.f141327e) && C46238a.m51546a(this.f141328f, s45.f141328f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                bp4 bp4 = this.f141326d;
                if (bp4 != null) {
                    aVar.mo74322i(2, bp4.computeSize());
                    this.f141326d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f141327e);
                v75 v75 = this.f141328f;
                if (v75 != null) {
                    aVar.mo74322i(4, v75.computeSize());
                    this.f141328f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            bp4 bp42 = this.f141326d;
            if (bp42 != null) {
                i2 += C52418a.m58682i(2, bp42.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f141327e);
            v75 v752 = this.f141328f;
            return v752 != null ? g + C52418a.m58682i(4, v752.computeSize()) : g;
        } else if (i == 2) {
            this.f141327e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            s45 s45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    s45.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    bp4 bp43 = new bp4();
                    if (bArr2 != null && bArr2.length > 0) {
                        bp43.parseFrom(bArr2);
                    }
                    s45.f141326d = bp43;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51793w7 w7Var = new C51793w7();
                    if (bArr3 != null && bArr3.length > 0) {
                        w7Var.parseFrom(bArr3);
                    }
                    s45.f141327e.add(w7Var);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    v75 v753 = new v75();
                    if (bArr4 != null && bArr4.length > 0) {
                        v753.parseFrom(bArr4);
                    }
                    s45.f141328f = v753;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
            aVar.mo71655d(jSONObject, "userMgrBaseResp", this.f141326d, false);
            aVar.mo71655d(jSONObject, "authItem", this.f141327e, false);
            aVar.mo71655d(jSONObject, "use_user_info", this.f141328f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
