package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.g1 */
public class C52683g1 extends C47465a {

    /* renamed from: d */
    public C52681f1 f147110d;

    /* renamed from: e */
    public LinkedList<C52676d1> f147111e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52683g1)) {
            return false;
        }
        C52683g1 g1Var = (C52683g1) aVar;
        return C46238a.m51546a(this.f147110d, g1Var.f147110d) && C46238a.m51546a(this.f147111e, g1Var.f147111e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52681f1 f1Var = this.f147110d;
            if (f1Var != null) {
                aVar.mo74322i(1, f1Var.computeSize());
                this.f147110d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f147111e);
            return 0;
        } else if (i == 1) {
            C52681f1 f1Var2 = this.f147110d;
            if (f1Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, f1Var2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f147111e);
        } else if (i == 2) {
            this.f147111e.clear();
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
            C52683g1 g1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52681f1 f1Var3 = new C52681f1();
                    if (bArr != null && bArr.length > 0) {
                        f1Var3.parseFrom(bArr);
                    }
                    g1Var.f147110d = f1Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52676d1 d1Var = new C52676d1();
                    if (bArr2 != null && bArr2.length > 0) {
                        d1Var.parseFrom(bArr2);
                    }
                    g1Var.f147111e.add(d1Var);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C52681f1 f1Var = this.f147110d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "iconGroup", f1Var, false);
            aVar.mo71655d(jSONObject, "icons", this.f147111e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
