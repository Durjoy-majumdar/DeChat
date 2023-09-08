package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.e1 */
public class C52679e1 extends C47465a {

    /* renamed from: d */
    public long f147101d;

    /* renamed from: e */
    public String f147102e;

    /* renamed from: f */
    public LinkedList<C52681f1> f147103f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C52676d1> f147104g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52679e1)) {
            return false;
        }
        C52679e1 e1Var = (C52679e1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f147101d), Long.valueOf(e1Var.f147101d)) && C46238a.m51546a(this.f147102e, e1Var.f147102e) && C46238a.m51546a(this.f147103f, e1Var.f147103f) && C46238a.m51546a(this.f147104g, e1Var.f147104g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f147101d);
            String str = this.f147102e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f147103f);
            aVar.mo74320g(4, 8, this.f147104g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f147101d) + 0;
            String str2 = this.f147102e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58680g(3, 8, this.f147103f) + C52418a.m58680g(4, 8, this.f147104g);
        } else if (i == 2) {
            this.f147103f.clear();
            this.f147104g.clear();
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
            C52679e1 e1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e1Var.f147101d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                e1Var.f147102e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52681f1 f1Var = new C52681f1();
                    if (bArr != null && bArr.length > 0) {
                        f1Var.parseFrom(bArr);
                    }
                    e1Var.f147103f.add(f1Var);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C52676d1 d1Var = new C52676d1();
                    if (bArr2 != null && bArr2.length > 0) {
                        d1Var.parseFrom(bArr2);
                    }
                    e1Var.f147104g.add(d1Var);
                }
                return 0;
            }
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f147101d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "key", valueOf, false);
            aVar.mo71655d(jSONObject, "configId", this.f147102e, false);
            aVar.mo71655d(jSONObject, "iconGroups", this.f147103f, false);
            aVar.mo71655d(jSONObject, "icons", this.f147104g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
