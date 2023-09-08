package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i14 */
public class C49785i14 extends C47465a {

    /* renamed from: d */
    public C89349b f135025d;

    /* renamed from: e */
    public C89349b f135026e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49785i14)) {
            return false;
        }
        C49785i14 i142 = (C49785i14) aVar;
        return C46238a.m51546a(this.f135025d, i142.f135025d) && C46238a.m51546a(this.f135026e, i142.f135026e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f135025d;
            if (bVar == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f135026e != null) {
                if (bVar != null) {
                    aVar.mo74315b(1, bVar);
                }
                C89349b bVar2 = this.f135026e;
                if (bVar2 != null) {
                    aVar.mo74315b(2, bVar2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Value");
            }
        } else if (i == 1) {
            C89349b bVar3 = this.f135025d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f135026e;
            return bVar4 != null ? i2 + C52418a.m58675b(2, bVar4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135025d == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f135026e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Value");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49785i14 i142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i142.f135025d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                i142.f135026e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C89349b bVar = this.f135025d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Name", bVar, false);
            aVar.mo71655d(jSONObject, "Value", this.f135026e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
