package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.m0 */
public class C52699m0 extends C47465a {

    /* renamed from: d */
    public long f147161d;

    /* renamed from: e */
    public LinkedList<C52701n0> f147162e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52699m0)) {
            return false;
        }
        C52699m0 m0Var = (C52699m0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f147161d), Long.valueOf(m0Var.f147161d)) && C46238a.m51546a(this.f147162e, m0Var.f147162e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f147161d);
            aVar.mo74320g(2, 8, this.f147162e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f147161d) + 0 + C52418a.m58680g(2, 8, this.f147162e);
        } else {
            if (i == 2) {
                this.f147162e.clear();
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
                C52699m0 m0Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    m0Var.f147161d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52701n0 n0Var = new C52701n0();
                        if (bArr != null && bArr.length > 0) {
                            n0Var.parseFrom(bArr);
                        }
                        m0Var.f147162e.add(n0Var);
                    }
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f147161d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "key", valueOf, false);
            aVar.mo71655d(jSONObject, "cover_icons", this.f147162e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
