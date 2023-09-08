package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j82 */
public class C49959j82 extends C47465a {

    /* renamed from: d */
    public int f135918d;

    /* renamed from: e */
    public String f135919e;

    /* renamed from: f */
    public int f135920f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49959j82)) {
            return false;
        }
        C49959j82 j822 = (C49959j82) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135918d), Integer.valueOf(j822.f135918d)) && C46238a.m51546a(this.f135919e, j822.f135919e) && C46238a.m51546a(Integer.valueOf(this.f135920f), Integer.valueOf(j822.f135920f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135918d);
            String str = this.f135919e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f135920f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135918d) + 0;
            String str2 = this.f135919e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f135920f);
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
            C49959j82 j822 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j822.f135918d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                j822.f135919e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                j822.f135920f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f135918d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Scene", valueOf, false);
            aVar.mo71655d(jSONObject, "RequestKey", this.f135919e, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f135920f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
