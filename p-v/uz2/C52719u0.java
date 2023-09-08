package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.u0 */
public class C52719u0 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f147255d;

    /* renamed from: e */
    public long f147256e;

    /* renamed from: f */
    public long f147257f;

    /* renamed from: g */
    public long f147258g;

    /* renamed from: h */
    public LinkedList<String> f147259h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52719u0)) {
            return false;
        }
        C52719u0 u0Var = (C52719u0) aVar;
        return C46238a.m51546a(this.BaseRequest, u0Var.BaseRequest) && C46238a.m51546a(this.f147255d, u0Var.f147255d) && C46238a.m51546a(Long.valueOf(this.f147256e), Long.valueOf(u0Var.f147256e)) && C46238a.m51546a(Long.valueOf(this.f147257f), Long.valueOf(u0Var.f147257f)) && C46238a.m51546a(Long.valueOf(this.f147258g), Long.valueOf(u0Var.f147258g)) && C46238a.m51546a(this.f147259h, u0Var.f147259h);
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
            C89349b bVar = this.f147255d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f147256e);
            aVar.mo74321h(4, this.f147257f);
            aVar.mo74321h(5, this.f147258g);
            aVar.mo74320g(6, 1, this.f147259h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f147255d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58681h(3, this.f147256e) + C52418a.m58681h(4, this.f147257f) + C52418a.m58681h(5, this.f147258g) + C52418a.m58680g(6, 1, this.f147259h);
        } else if (i == 2) {
            this.f147259h.clear();
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
            C52719u0 u0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        u0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    u0Var.f147255d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    u0Var.f147256e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    u0Var.f147257f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    u0Var.f147258g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    u0Var.f147259h.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "context", this.f147255d, false);
            aVar.mo71655d(jSONObject, "op", Long.valueOf(this.f147256e), false);
            aVar.mo71655d(jSONObject, "start_key", Long.valueOf(this.f147257f), false);
            aVar.mo71655d(jSONObject, "limit", Long.valueOf(this.f147258g), false);
            aVar.mo71655d(jSONObject, "statusIds", this.f147259h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
