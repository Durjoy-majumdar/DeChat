package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.f1 */
public class C52681f1 extends C47465a {

    /* renamed from: d */
    public String f147106d;

    /* renamed from: e */
    public LinkedList<C52722w> f147107e = new LinkedList<>();

    /* renamed from: f */
    public String f147108f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52681f1)) {
            return false;
        }
        C52681f1 f1Var = (C52681f1) aVar;
        return C46238a.m51546a(this.f147106d, f1Var.f147106d) && C46238a.m51546a(this.f147107e, f1Var.f147107e) && C46238a.m51546a(this.f147108f, f1Var.f147108f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147106d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f147107e);
            String str2 = this.f147108f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f147106d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f147107e);
            String str4 = this.f147108f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f147107e.clear();
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
            C52681f1 f1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f1Var.f147106d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52722w wVar = new C52722w();
                    if (bArr != null && bArr.length > 0) {
                        wVar.parseFrom(bArr);
                    }
                    f1Var.f147107e.add(wVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f1Var.f147108f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147106d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "groupId", str, false);
            aVar.mo71655d(jSONObject, "iconGroupDescriptions", this.f147107e, false);
            aVar.mo71655d(jSONObject, "url", this.f147108f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
