package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.j1 */
public class C52692j1 extends C47465a {

    /* renamed from: d */
    public int f147146d;

    /* renamed from: e */
    public C52695k1 f147147e;

    /* renamed from: f */
    public C52686h1 f147148f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52692j1)) {
            return false;
        }
        C52692j1 j1Var = (C52692j1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147146d), Integer.valueOf(j1Var.f147146d)) && C46238a.m51546a(this.f147147e, j1Var.f147147e) && C46238a.m51546a(this.f147148f, j1Var.f147148f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147146d);
            C52695k1 k1Var = this.f147147e;
            if (k1Var != null) {
                aVar.mo74322i(2, k1Var.computeSize());
                this.f147147e.writeFields(aVar);
            }
            C52686h1 h1Var = this.f147148f;
            if (h1Var != null) {
                aVar.mo74322i(3, h1Var.computeSize());
                this.f147148f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147146d) + 0;
            C52695k1 k1Var2 = this.f147147e;
            if (k1Var2 != null) {
                e += C52418a.m58682i(2, k1Var2.computeSize());
            }
            C52686h1 h1Var2 = this.f147148f;
            return h1Var2 != null ? e + C52418a.m58682i(3, h1Var2.computeSize()) : e;
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
            C52692j1 j1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j1Var.f147146d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52695k1 k1Var3 = new C52695k1();
                    if (bArr != null && bArr.length > 0) {
                        k1Var3.parseFrom(bArr);
                    }
                    j1Var.f147147e = k1Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C52686h1 h1Var3 = new C52686h1();
                    if (bArr2 != null && bArr2.length > 0) {
                        h1Var3.parseFrom(bArr2);
                    }
                    j1Var.f147148f = h1Var3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147146d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "type", valueOf, false);
            aVar.mo71655d(jSONObject, "music", this.f147147e, false);
            aVar.mo71655d(jSONObject, "finder", this.f147148f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
