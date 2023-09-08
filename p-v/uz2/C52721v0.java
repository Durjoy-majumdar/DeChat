package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.v0 */
public class C52721v0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C52673c1> f147267d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f147268e;

    /* renamed from: f */
    public boolean f147269f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52721v0)) {
            return false;
        }
        C52721v0 v0Var = (C52721v0) aVar;
        return C46238a.m51546a(this.BaseResponse, v0Var.BaseResponse) && C46238a.m51546a(this.f147267d, v0Var.f147267d) && C46238a.m51546a(this.f147268e, v0Var.f147268e) && C46238a.m51546a(Boolean.valueOf(this.f147269f), Boolean.valueOf(v0Var.f147269f));
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
                aVar.mo74320g(2, 8, this.f147267d);
                C89349b bVar = this.f147268e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74314a(4, this.f147269f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f147267d);
            C89349b bVar2 = this.f147268e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58674a(4, this.f147269f);
        } else if (i == 2) {
            this.f147267d.clear();
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
            C52721v0 v0Var = objArr[1];
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
                    v0Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52673c1 c1Var = new C52673c1();
                    if (bArr2 != null && bArr2.length > 0) {
                        c1Var.parseFrom(bArr2);
                    }
                    v0Var.f147267d.add(c1Var);
                }
                return 0;
            } else if (intValue == 3) {
                v0Var.f147268e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                v0Var.f147269f = aVar3.mo141625c(intValue);
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
            aVar.mo71655d(jSONObject, "histories", this.f147267d, false);
            aVar.mo71655d(jSONObject, "context", this.f147268e, false);
            aVar.mo71655d(jSONObject, "continue_flag", Boolean.valueOf(this.f147269f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
