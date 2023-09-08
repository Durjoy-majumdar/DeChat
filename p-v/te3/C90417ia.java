package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ia */
public class C90417ia extends C47465a {

    /* renamed from: d */
    public C89349b f259570d;

    /* renamed from: e */
    public int f259571e;

    /* renamed from: f */
    public C89349b f259572f;

    /* renamed from: g */
    public int f259573g;

    /* renamed from: h */
    public C89349b f259574h;

    /* renamed from: i */
    public int f259575i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90417ia)) {
            return false;
        }
        C90417ia iaVar = (C90417ia) aVar;
        return C46238a.m51546a(this.f259570d, iaVar.f259570d) && C46238a.m51546a(Integer.valueOf(this.f259571e), Integer.valueOf(iaVar.f259571e)) && C46238a.m51546a(this.f259572f, iaVar.f259572f) && C46238a.m51546a(Integer.valueOf(this.f259573g), Integer.valueOf(iaVar.f259573g)) && C46238a.m51546a(this.f259574h, iaVar.f259574h) && C46238a.m51546a(Integer.valueOf(this.f259575i), Integer.valueOf(iaVar.f259575i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f259570d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74318e(2, this.f259571e);
            C89349b bVar2 = this.f259572f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            aVar.mo74318e(4, this.f259573g);
            C89349b bVar3 = this.f259574h;
            if (bVar3 != null) {
                aVar.mo74315b(5, bVar3);
            }
            aVar.mo74318e(6, this.f259575i);
            return 0;
        } else if (i == 1) {
            C89349b bVar4 = this.f259570d;
            if (bVar4 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar4);
            }
            int e = i2 + C52418a.m58678e(2, this.f259571e);
            C89349b bVar5 = this.f259572f;
            if (bVar5 != null) {
                e += C52418a.m58675b(3, bVar5);
            }
            int e2 = e + C52418a.m58678e(4, this.f259573g);
            C89349b bVar6 = this.f259574h;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(5, bVar6);
            }
            return e2 + C52418a.m58678e(6, this.f259575i);
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
            C90417ia iaVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iaVar.f259570d = aVar3.mo141626d(intValue);
                    return 0;
                case 2:
                    iaVar.f259571e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    iaVar.f259572f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    iaVar.f259573g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    iaVar.f259574h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    iaVar.f259575i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C89349b bVar = this.f259570d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "SessionKey", bVar, false);
            aVar.mo71655d(jSONObject, "Uin", Integer.valueOf(this.f259571e), false);
            aVar.mo71655d(jSONObject, "DeviceID", this.f259572f, false);
            aVar.mo71655d(jSONObject, "ClientVersion", Integer.valueOf(this.f259573g), false);
            aVar.mo71655d(jSONObject, "DeviceType", this.f259574h, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f259575i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
