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

/* renamed from: uz2.s0 */
public class C52714s0 extends C101820nt3 {

    /* renamed from: d */
    public long f147211d;

    /* renamed from: e */
    public long f147212e;

    /* renamed from: f */
    public long f147213f;

    /* renamed from: g */
    public int f147214g;

    /* renamed from: h */
    public LinkedList<C52728y> f147215h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52714s0)) {
            return false;
        }
        C52714s0 s0Var = (C52714s0) aVar;
        return C46238a.m51546a(this.BaseRequest, s0Var.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f147211d), Long.valueOf(s0Var.f147211d)) && C46238a.m51546a(Long.valueOf(this.f147212e), Long.valueOf(s0Var.f147212e)) && C46238a.m51546a(Long.valueOf(this.f147213f), Long.valueOf(s0Var.f147213f)) && C46238a.m51546a(Integer.valueOf(this.f147214g), Integer.valueOf(s0Var.f147214g)) && C46238a.m51546a(this.f147215h, s0Var.f147215h);
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
            aVar.mo74321h(2, this.f147211d);
            aVar.mo74321h(3, this.f147212e);
            aVar.mo74321h(4, this.f147213f);
            aVar.mo74318e(5, this.f147214g);
            aVar.mo74320g(6, 8, this.f147215h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f147211d) + C52418a.m58681h(3, this.f147212e) + C52418a.m58681h(4, this.f147213f) + C52418a.m58678e(5, this.f147214g) + C52418a.m58680g(6, 8, this.f147215h);
        } else if (i == 2) {
            this.f147215h.clear();
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
            C52714s0 s0Var = objArr[1];
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
                        s0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    s0Var.f147211d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    s0Var.f147212e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    s0Var.f147213f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    s0Var.f147214g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52728y yVar = new C52728y();
                        if (bArr2 != null && bArr2.length > 0) {
                            yVar.parseFrom(bArr2);
                        }
                        s0Var.f147215h.add(yVar);
                    }
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
            aVar.mo71655d(jSONObject, "key", Long.valueOf(this.f147211d), false);
            aVar.mo71655d(jSONObject, "cover_agenda_key", Long.valueOf(this.f147212e), false);
            aVar.mo71655d(jSONObject, "keyValueConfigKey", Long.valueOf(this.f147213f), false);
            aVar.mo71655d(jSONObject, "flag", Integer.valueOf(this.f147214g), false);
            aVar.mo71655d(jSONObject, "icon_config_id_keys", this.f147215h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
