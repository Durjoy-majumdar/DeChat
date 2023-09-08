package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.z */
public class C52731z extends C47465a {

    /* renamed from: d */
    public int f147304d;

    /* renamed from: e */
    public String f147305e;

    /* renamed from: f */
    public LinkedList<C65488a0> f147306f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52731z)) {
            return false;
        }
        C52731z zVar = (C52731z) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147304d), Integer.valueOf(zVar.f147304d)) && C46238a.m51546a(this.f147305e, zVar.f147305e) && C46238a.m51546a(this.f147306f, zVar.f147306f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147304d);
            String str = this.f147305e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f147306f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147304d) + 0;
            String str2 = this.f147305e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58680g(3, 8, this.f147306f);
        } else if (i == 2) {
            this.f147306f.clear();
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
            C52731z zVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zVar.f147304d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zVar.f147305e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C65488a0 a0Var = new C65488a0();
                    if (bArr != null && bArr.length > 0) {
                        a0Var.parseFrom(bArr);
                    }
                    zVar.f147306f.add(a0Var);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147304d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "elementType", valueOf, false);
            aVar.mo71655d(jSONObject, "elementKey", this.f147305e, false);
            aVar.mo71655d(jSONObject, "jumpInfos", this.f147306f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
