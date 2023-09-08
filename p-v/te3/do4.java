package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class do4 extends C47465a {

    /* renamed from: d */
    public C89349b f132459d;

    /* renamed from: e */
    public int f132460e;

    /* renamed from: f */
    public long f132461f;

    /* renamed from: g */
    public int f132462g;

    /* renamed from: h */
    public int f132463h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof do4)) {
            return false;
        }
        do4 do4 = (do4) aVar;
        return C46238a.m51546a(this.f132459d, do4.f132459d) && C46238a.m51546a(Integer.valueOf(this.f132460e), Integer.valueOf(do4.f132460e)) && C46238a.m51546a(Long.valueOf(this.f132461f), Long.valueOf(do4.f132461f)) && C46238a.m51546a(Integer.valueOf(this.f132462g), Integer.valueOf(do4.f132462g)) && C46238a.m51546a(Integer.valueOf(this.f132463h), Integer.valueOf(do4.f132463h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f132459d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74318e(2, this.f132460e);
            aVar.mo74321h(3, this.f132461f);
            aVar.mo74318e(4, this.f132462g);
            aVar.mo74318e(5, this.f132463h);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f132459d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58678e(2, this.f132460e) + C52418a.m58681h(3, this.f132461f) + C52418a.m58678e(4, this.f132462g) + C52418a.m58678e(5, this.f132463h);
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
            do4 do4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                do4.f132459d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                do4.f132460e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                do4.f132461f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                do4.f132462g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                do4.f132463h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C89349b bVar = this.f132459d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Url", bVar, false);
            aVar.mo71655d(jSONObject, "DurationMs", Integer.valueOf(this.f132460e), false);
            aVar.mo71655d(jSONObject, "Filesize", Long.valueOf(this.f132461f), false);
            aVar.mo71655d(jSONObject, "Width", Integer.valueOf(this.f132462g), false);
            aVar.mo71655d(jSONObject, "Height", Integer.valueOf(this.f132463h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
