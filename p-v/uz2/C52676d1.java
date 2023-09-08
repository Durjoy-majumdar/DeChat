package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.d1 */
public class C52676d1 extends C47465a {

    /* renamed from: d */
    public String f147081d;

    /* renamed from: e */
    public int f147082e;

    /* renamed from: f */
    public LinkedList<C52725x> f147083f = new LinkedList<>();

    /* renamed from: g */
    public int f147084g;

    /* renamed from: h */
    public long f147085h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52676d1)) {
            return false;
        }
        C52676d1 d1Var = (C52676d1) aVar;
        return C46238a.m51546a(this.f147081d, d1Var.f147081d) && C46238a.m51546a(Integer.valueOf(this.f147082e), Integer.valueOf(d1Var.f147082e)) && C46238a.m51546a(this.f147083f, d1Var.f147083f) && C46238a.m51546a(Integer.valueOf(this.f147084g), Integer.valueOf(d1Var.f147084g)) && C46238a.m51546a(Long.valueOf(this.f147085h), Long.valueOf(d1Var.f147085h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147081d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f147082e);
            aVar.mo74320g(3, 8, this.f147083f);
            aVar.mo74318e(4, this.f147084g);
            aVar.mo74321h(5, this.f147085h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f147081d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f147082e) + C52418a.m58680g(3, 8, this.f147083f) + C52418a.m58678e(4, this.f147084g) + C52418a.m58681h(5, this.f147085h);
        } else if (i == 2) {
            this.f147083f.clear();
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
            C52676d1 d1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d1Var.f147081d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d1Var.f147082e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52725x xVar = new C52725x();
                    if (bArr != null && bArr.length > 0) {
                        xVar.parseFrom(bArr);
                    }
                    d1Var.f147083f.add(xVar);
                }
                return 0;
            } else if (intValue == 4) {
                d1Var.f147084g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                d1Var.f147085h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147081d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "iconId", str, false);
            aVar.mo71655d(jSONObject, "showType", Integer.valueOf(this.f147082e), false);
            aVar.mo71655d(jSONObject, "actions", this.f147083f, false);
            aVar.mo71655d(jSONObject, "characterSetType", Integer.valueOf(this.f147084g), false);
            aVar.mo71655d(jSONObject, "flag", Long.valueOf(this.f147085h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
