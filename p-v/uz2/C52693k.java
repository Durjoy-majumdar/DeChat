package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.k */
public class C52693k extends C49335eu3 {

    /* renamed from: d */
    public String f147149d;

    /* renamed from: e */
    public String f147150e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52693k)) {
            return false;
        }
        C52693k kVar = (C52693k) aVar;
        return C46238a.m51546a(this.BaseResponse, kVar.BaseResponse) && C46238a.m51546a(this.f147149d, kVar.f147149d) && C46238a.m51546a(this.f147150e, kVar.f147150e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            String str = this.f147149d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147150e;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f147149d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f147150e;
            return str4 != null ? i2 + C52418a.m58683j(5, str4) : i2;
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
            C52693k kVar = objArr[1];
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
                    kVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kVar.f147149d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kVar.f147150e = aVar3.mo141633k(intValue);
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
            aVar.mo71655d(jSONObject, "text_status_id", this.f147149d, false);
            aVar.mo71655d(jSONObject, "text_status_ext_info", this.f147150e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
