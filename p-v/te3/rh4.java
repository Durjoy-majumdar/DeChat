package te3;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class rh4 extends C47465a {

    /* renamed from: d */
    public String f64533d;

    /* renamed from: e */
    public int f64534e;

    /* renamed from: f */
    public int f64535f;

    /* renamed from: g */
    public long f64536g;

    /* renamed from: h */
    public int f64537h;

    /* renamed from: i */
    public int f64538i;

    /* renamed from: j */
    public String f64539j;

    /* renamed from: n */
    public String f64540n;

    /* renamed from: o */
    public long f64541o;

    /* renamed from: p */
    public int f64542p;

    /* renamed from: q */
    public int f64543q;

    /* renamed from: r */
    public long f64544r;

    /* renamed from: s */
    public int f64545s;

    /* renamed from: t */
    public int f64546t;

    /* renamed from: u */
    public String f64547u;

    /* renamed from: v */
    public int f64548v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rh4)) {
            return false;
        }
        rh4 rh4 = (rh4) aVar;
        return C46238a.m51546a(this.f64533d, rh4.f64533d) && C46238a.m51546a(Integer.valueOf(this.f64534e), Integer.valueOf(rh4.f64534e)) && C46238a.m51546a(Integer.valueOf(this.f64535f), Integer.valueOf(rh4.f64535f)) && C46238a.m51546a(Long.valueOf(this.f64536g), Long.valueOf(rh4.f64536g)) && C46238a.m51546a(Integer.valueOf(this.f64537h), Integer.valueOf(rh4.f64537h)) && C46238a.m51546a(Integer.valueOf(this.f64538i), Integer.valueOf(rh4.f64538i)) && C46238a.m51546a(this.f64539j, rh4.f64539j) && C46238a.m51546a(this.f64540n, rh4.f64540n) && C46238a.m51546a(Long.valueOf(this.f64541o), Long.valueOf(rh4.f64541o)) && C46238a.m51546a(Integer.valueOf(this.f64542p), Integer.valueOf(rh4.f64542p)) && C46238a.m51546a(Integer.valueOf(this.f64543q), Integer.valueOf(rh4.f64543q)) && C46238a.m51546a(Long.valueOf(this.f64544r), Long.valueOf(rh4.f64544r)) && C46238a.m51546a(Integer.valueOf(this.f64545s), Integer.valueOf(rh4.f64545s)) && C46238a.m51546a(Integer.valueOf(this.f64546t), Integer.valueOf(rh4.f64546t)) && C46238a.m51546a(this.f64547u, rh4.f64547u) && C46238a.m51546a(Integer.valueOf(this.f64548v), Integer.valueOf(rh4.f64548v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64533d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f64534e);
            aVar.mo74318e(3, this.f64535f);
            aVar.mo74321h(4, this.f64536g);
            aVar.mo74318e(5, this.f64537h);
            aVar.mo74318e(6, this.f64538i);
            String str2 = this.f64539j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f64540n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74321h(9, this.f64541o);
            aVar.mo74318e(10, this.f64542p);
            aVar.mo74318e(11, this.f64543q);
            aVar.mo74321h(12, this.f64544r);
            aVar.mo74318e(13, this.f64545s);
            aVar.mo74318e(14, this.f64546t);
            String str4 = this.f64547u;
            if (str4 != null) {
                aVar.mo74323j(15, str4);
            }
            aVar.mo74318e(16, this.f64548v);
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f64533d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64534e) + C52418a.m58678e(3, this.f64535f) + C52418a.m58681h(4, this.f64536g) + C52418a.m58678e(5, this.f64537h) + C52418a.m58678e(6, this.f64538i);
            String str6 = this.f64539j;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            String str7 = this.f64540n;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            int h = e + C52418a.m58681h(9, this.f64541o) + C52418a.m58678e(10, this.f64542p) + C52418a.m58678e(11, this.f64543q) + C52418a.m58681h(12, this.f64544r) + C52418a.m58678e(13, this.f64545s) + C52418a.m58678e(14, this.f64546t);
            String str8 = this.f64547u;
            if (str8 != null) {
                h += C52418a.m58683j(15, str8);
            }
            return h + C52418a.m58678e(16, this.f64548v);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            rh4 rh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rh4.f64533d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rh4.f64534e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rh4.f64535f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rh4.f64536g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    rh4.f64537h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rh4.f64538i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rh4.f64539j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rh4.f64540n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    rh4.f64541o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    rh4.f64542p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    rh4.f64543q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    rh4.f64544r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    rh4.f64545s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    rh4.f64546t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    rh4.f64547u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    rh4.f64548v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64533d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "msgId", str, false);
            aVar.mo71655d(jSONObject, "entry", Integer.valueOf(this.f64534e), false);
            aVar.mo71655d(jSONObject, "clientVer", Integer.valueOf(this.f64535f), false);
            aVar.mo71655d(jSONObject, "expireTime", Long.valueOf(this.f64536g), false);
            aVar.mo71655d(jSONObject, "h5Version", Integer.valueOf(this.f64537h), false);
            aVar.mo71655d(jSONObject, "type", Integer.valueOf(this.f64538i), false);
            aVar.mo71655d(jSONObject, MimeTypes.BASE_TYPE_TEXT, this.f64539j, false);
            aVar.mo71655d(jSONObject, "icon", this.f64540n, false);
            aVar.mo71655d(jSONObject, "showTime", Long.valueOf(this.f64541o), false);
            aVar.mo71655d(jSONObject, "discovery", Integer.valueOf(this.f64542p), false);
            aVar.mo71655d(jSONObject, "clearFlag", Integer.valueOf(this.f64543q), false);
            aVar.mo71655d(jSONObject, "receiveTime", Long.valueOf(this.f64544r), false);
            aVar.mo71655d(jSONObject, "showFlag", Integer.valueOf(this.f64545s), false);
            aVar.mo71655d(jSONObject, TPReportKeys.Common.COMMON_SEQ, Integer.valueOf(this.f64546t), false);
            aVar.mo71655d(jSONObject, "extInfo", this.f64547u, false);
            aVar.mo71655d(jSONObject, DownloadInfo.PRIORITY, Integer.valueOf(this.f64548v), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
