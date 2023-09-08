package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bu2 */
public class C101762bu2 extends C47465a {

    /* renamed from: d */
    public int f297993d;

    /* renamed from: e */
    public String f297994e;

    /* renamed from: f */
    public long f297995f;

    /* renamed from: g */
    public long f297996g;

    /* renamed from: h */
    public String f297997h;

    /* renamed from: i */
    public int f297998i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101762bu2)) {
            return false;
        }
        C101762bu2 bu22 = (C101762bu2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f297993d), Integer.valueOf(bu22.f297993d)) && C46238a.m51546a(this.f297994e, bu22.f297994e) && C46238a.m51546a(Long.valueOf(this.f297995f), Long.valueOf(bu22.f297995f)) && C46238a.m51546a(Long.valueOf(this.f297996g), Long.valueOf(bu22.f297996g)) && C46238a.m51546a(this.f297997h, bu22.f297997h) && C46238a.m51546a(Integer.valueOf(this.f297998i), Integer.valueOf(bu22.f297998i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f297993d);
            String str = this.f297994e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f297995f);
            aVar.mo74321h(4, this.f297996g);
            String str2 = this.f297997h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f297998i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f297993d) + 0;
            String str3 = this.f297994e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int h = e + C52418a.m58681h(3, this.f297995f) + C52418a.m58681h(4, this.f297996g);
            String str4 = this.f297997h;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            return h + C52418a.m58678e(6, this.f297998i);
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
            C101762bu2 bu22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bu22.f297993d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bu22.f297994e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bu22.f297995f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    bu22.f297996g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    bu22.f297997h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bu22.f297998i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f297993d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, valueOf, false);
            aVar.mo71655d(jSONObject, "Json", this.f297994e, false);
            aVar.mo71655d(jSONObject, "CacheSecond", Long.valueOf(this.f297995f), false);
            aVar.mo71655d(jSONObject, "LastCacheSecond", Long.valueOf(this.f297996g), false);
            aVar.mo71655d(jSONObject, "SearchID", this.f297997h, false);
            aVar.mo71655d(jSONObject, "Type", Integer.valueOf(this.f297998i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
