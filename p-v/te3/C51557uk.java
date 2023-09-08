package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uk */
public class C51557uk extends C47465a {

    /* renamed from: d */
    public long f142888d;

    /* renamed from: e */
    public String f142889e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51557uk)) {
            return false;
        }
        C51557uk ukVar = (C51557uk) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142888d), Long.valueOf(ukVar.f142888d)) && C46238a.m51546a(this.f142889e, ukVar.f142889e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142889e != null) {
                aVar.mo74321h(1, this.f142888d);
                String str = this.f142889e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjectDesc");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f142888d) + 0;
            String str2 = this.f142889e;
            return str2 != null ? h + C52418a.m58683j(2, str2) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142889e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjectDesc");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51557uk ukVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ukVar.f142888d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ukVar.f142889e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f142888d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Id", valueOf, false);
            aVar.mo71655d(jSONObject, "ObjectDesc", this.f142889e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
