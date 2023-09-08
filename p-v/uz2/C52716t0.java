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

/* renamed from: uz2.t0 */
public class C52716t0 extends C49335eu3 {

    /* renamed from: d */
    public C52679e1 f147217d;

    /* renamed from: e */
    public C52699m0 f147218e;

    /* renamed from: f */
    public C52669b0 f147219f;

    /* renamed from: g */
    public LinkedList<C52679e1> f147220g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52716t0)) {
            return false;
        }
        C52716t0 t0Var = (C52716t0) aVar;
        return C46238a.m51546a(this.BaseResponse, t0Var.BaseResponse) && C46238a.m51546a(this.f147217d, t0Var.f147217d) && C46238a.m51546a(this.f147218e, t0Var.f147218e) && C46238a.m51546a(this.f147219f, t0Var.f147219f) && C46238a.m51546a(this.f147220g, t0Var.f147220g);
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
                C52679e1 e1Var = this.f147217d;
                if (e1Var != null) {
                    aVar.mo74322i(2, e1Var.computeSize());
                    this.f147217d.writeFields(aVar);
                }
                C52699m0 m0Var = this.f147218e;
                if (m0Var != null) {
                    aVar.mo74322i(3, m0Var.computeSize());
                    this.f147218e.writeFields(aVar);
                }
                C52669b0 b0Var = this.f147219f;
                if (b0Var != null) {
                    aVar.mo74322i(4, b0Var.computeSize());
                    this.f147219f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f147220g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52679e1 e1Var2 = this.f147217d;
            if (e1Var2 != null) {
                i2 += C52418a.m58682i(2, e1Var2.computeSize());
            }
            C52699m0 m0Var2 = this.f147218e;
            if (m0Var2 != null) {
                i2 += C52418a.m58682i(3, m0Var2.computeSize());
            }
            C52669b0 b0Var2 = this.f147219f;
            if (b0Var2 != null) {
                i2 += C52418a.m58682i(4, b0Var2.computeSize());
            }
            return i2 + C52418a.m58680g(5, 8, this.f147220g);
        } else if (i == 2) {
            this.f147220g.clear();
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
            C52716t0 t0Var = objArr[1];
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
                    t0Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52679e1 e1Var3 = new C52679e1();
                    if (bArr2 != null && bArr2.length > 0) {
                        e1Var3.parseFrom(bArr2);
                    }
                    t0Var.f147217d = e1Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52699m0 m0Var3 = new C52699m0();
                    if (bArr3 != null && bArr3.length > 0) {
                        m0Var3.parseFrom(bArr3);
                    }
                    t0Var.f147218e = m0Var3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C52669b0 b0Var3 = new C52669b0();
                    if (bArr4 != null && bArr4.length > 0) {
                        b0Var3.parseFrom(bArr4);
                    }
                    t0Var.f147219f = b0Var3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C52679e1 e1Var4 = new C52679e1();
                    if (bArr5 != null && bArr5.length > 0) {
                        e1Var4.parseFrom(bArr5);
                    }
                    t0Var.f147220g.add(e1Var4);
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
            aVar.mo71655d(jSONObject, "icon_config", this.f147217d, false);
            aVar.mo71655d(jSONObject, "cover_agenda", this.f147218e, false);
            aVar.mo71655d(jSONObject, "key_value_config", this.f147219f, false);
            aVar.mo71655d(jSONObject, "icon_configs", this.f147220g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
