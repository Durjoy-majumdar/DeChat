package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.x0 */
public class C52726x0 extends C49335eu3 {

    /* renamed from: d */
    public int f147292d;

    /* renamed from: e */
    public int f147293e;

    /* renamed from: f */
    public int f147294f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52726x0)) {
            return false;
        }
        C52726x0 x0Var = (C52726x0) aVar;
        return C46238a.m51546a(this.BaseResponse, x0Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f147292d), Integer.valueOf(x0Var.f147292d)) && C46238a.m51546a(Integer.valueOf(this.f147293e), Integer.valueOf(x0Var.f147293e)) && C46238a.m51546a(Integer.valueOf(this.f147294f), Integer.valueOf(x0Var.f147294f));
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
                aVar.mo74318e(2, this.f147292d);
                aVar.mo74318e(3, this.f147293e);
                aVar.mo74318e(4, this.f147294f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f147292d) + C52418a.m58678e(3, this.f147293e) + C52418a.m58678e(4, this.f147294f);
        } else if (i == 2) {
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
            C52726x0 x0Var = objArr[1];
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
                    x0Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                x0Var.f147292d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                x0Var.f147293e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                x0Var.f147294f = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "liked_count", Integer.valueOf(this.f147292d), false);
            aVar.mo71655d(jSONObject, "live_member_count", Integer.valueOf(this.f147293e), false);
            aVar.mo71655d(jSONObject, "referenced_count", Integer.valueOf(this.f147294f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
