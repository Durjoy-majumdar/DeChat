package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tk */
public class C51406tk extends C47465a {

    /* renamed from: d */
    public C89349b f142251d;

    /* renamed from: e */
    public C89349b f142252e;

    /* renamed from: f */
    public LinkedList<C49785i14> f142253f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51406tk)) {
            return false;
        }
        C51406tk tkVar = (C51406tk) aVar;
        return C46238a.m51546a(this.f142251d, tkVar.f142251d) && C46238a.m51546a(this.f142252e, tkVar.f142252e) && C46238a.m51546a(this.f142253f, tkVar.f142253f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f142251d;
            if (bVar == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f142252e != null) {
                if (bVar != null) {
                    aVar.mo74315b(1, bVar);
                }
                C89349b bVar2 = this.f142252e;
                if (bVar2 != null) {
                    aVar.mo74315b(2, bVar2);
                }
                aVar.mo74320g(3, 8, this.f142253f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServiceUrl");
            }
        } else if (i == 1) {
            C89349b bVar3 = this.f142251d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f142252e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f142253f);
        } else if (i == 2) {
            this.f142253f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142251d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f142252e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServiceUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51406tk tkVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tkVar.f142251d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                tkVar.f142252e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49785i14 i142 = new C49785i14();
                    if (bArr != null && bArr.length > 0) {
                        i142.parseFrom(bArr);
                    }
                    tkVar.f142253f.add(i142);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C89349b bVar = this.f142251d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", bVar, false);
            aVar.mo71655d(jSONObject, "ServiceUrl", this.f142252e, false);
            aVar.mo71655d(jSONObject, "ItemFieldList", this.f142253f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
