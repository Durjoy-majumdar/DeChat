package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yh4 extends C47465a {

    /* renamed from: d */
    public String f354603d;

    /* renamed from: e */
    public long f354604e;

    /* renamed from: f */
    public long f354605f;

    /* renamed from: g */
    public long f354606g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yh4)) {
            return false;
        }
        yh4 yh4 = (yh4) aVar;
        return C46238a.m51546a(this.f354603d, yh4.f354603d) && C46238a.m51546a(Long.valueOf(this.f354604e), Long.valueOf(yh4.f354604e)) && C46238a.m51546a(Long.valueOf(this.f354605f), Long.valueOf(yh4.f354605f)) && C46238a.m51546a(Long.valueOf(this.f354606g), Long.valueOf(yh4.f354606g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354603d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f354604e);
            aVar.mo74321h(3, this.f354605f);
            aVar.mo74321h(4, this.f354606g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f354603d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f354604e) + C52418a.m58681h(3, this.f354605f) + C52418a.m58681h(4, this.f354606g);
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
            yh4 yh4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yh4.f354603d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yh4.f354604e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                yh4.f354605f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                yh4.f354606g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f354603d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "mediaId", str, false);
            aVar.mo71655d(jSONObject, "preloadOffset", Long.valueOf(this.f354604e), false);
            aVar.mo71655d(jSONObject, "preloadPercent", Long.valueOf(this.f354605f), false);
            aVar.mo71655d(jSONObject, "videoSize", Long.valueOf(this.f354606g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
