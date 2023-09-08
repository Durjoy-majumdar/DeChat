package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.q0 */
public class C52709q0 extends C101820nt3 {

    /* renamed from: d */
    public String f147185d;

    /* renamed from: e */
    public String f147186e;

    /* renamed from: f */
    public C52733z1 f147187f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52709q0)) {
            return false;
        }
        C52709q0 q0Var = (C52709q0) aVar;
        return C46238a.m51546a(this.BaseRequest, q0Var.BaseRequest) && C46238a.m51546a(this.f147185d, q0Var.f147185d) && C46238a.m51546a(this.f147186e, q0Var.f147186e) && C46238a.m51546a(this.f147187f, q0Var.f147187f);
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
            String str = this.f147185d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147186e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C52733z1 z1Var = this.f147187f;
            if (z1Var != null) {
                aVar.mo74322i(4, z1Var.computeSize());
                this.f147187f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f147185d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f147186e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C52733z1 z1Var2 = this.f147187f;
            return z1Var2 != null ? i2 + C52418a.m58682i(4, z1Var2.computeSize()) : i2;
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
            C52709q0 q0Var = objArr[1];
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
                    q0Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                q0Var.f147185d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q0Var.f147186e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52733z1 z1Var3 = new C52733z1();
                    if (bArr2 != null && bArr2.length > 0) {
                        z1Var3.parseFrom(bArr2);
                    }
                    q0Var.f147187f = z1Var3;
                }
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
            aVar.mo71655d(jSONObject, "url", this.f147185d, false);
            aVar.mo71655d(jSONObject, "status_signature", this.f147186e, false);
            aVar.mo71655d(jSONObject, "status_signature_ext_info", this.f147187f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
