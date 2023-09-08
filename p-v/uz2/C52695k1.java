package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: uz2.k1 */
public class C52695k1 extends C47465a {

    /* renamed from: d */
    public int f147153d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52695k1) && C46238a.m51546a(Integer.valueOf(this.f147153d), Integer.valueOf(((C52695k1) aVar).f147153d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74318e(1, this.f147153d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f147153d) + 0;
        } else {
            if (i == 2) {
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C52695k1 k1Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                k1Var.f147153d = aVar2.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "song_id", Integer.valueOf(this.f147153d), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
