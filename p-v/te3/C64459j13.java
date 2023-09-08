package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j13 */
public class C64459j13 extends C47465a {

    /* renamed from: d */
    public String f183751d;

    /* renamed from: e */
    public String f183752e;

    /* renamed from: f */
    public String f183753f;

    /* renamed from: g */
    public int f183754g;

    /* renamed from: h */
    public String f183755h;

    /* renamed from: i */
    public String f183756i;

    /* renamed from: j */
    public int f183757j;

    /* renamed from: n */
    public boolean f183758n;

    /* renamed from: o */
    public String f183759o;

    /* renamed from: p */
    public int f183760p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64459j13)) {
            return false;
        }
        C64459j13 j132 = (C64459j13) aVar;
        return C46238a.m51546a(this.f183751d, j132.f183751d) && C46238a.m51546a(this.f183752e, j132.f183752e) && C46238a.m51546a(this.f183753f, j132.f183753f) && C46238a.m51546a(Integer.valueOf(this.f183754g), Integer.valueOf(j132.f183754g)) && C46238a.m51546a(this.f183755h, j132.f183755h) && C46238a.m51546a(this.f183756i, j132.f183756i) && C46238a.m51546a(Integer.valueOf(this.f183757j), Integer.valueOf(j132.f183757j)) && C46238a.m51546a(Boolean.valueOf(this.f183758n), Boolean.valueOf(j132.f183758n)) && C46238a.m51546a(this.f183759o, j132.f183759o) && C46238a.m51546a(Integer.valueOf(this.f183760p), Integer.valueOf(j132.f183760p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183751d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183752e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183753f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f183754g);
            String str4 = this.f183755h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f183756i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f183757j);
            aVar.mo74314a(8, this.f183758n);
            String str6 = this.f183759o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f183760p);
            return 0;
        } else if (i == 1) {
            String str7 = this.f183751d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f183752e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183753f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f183754g);
            String str10 = this.f183755h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f183756i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f183757j) + C52418a.m58674a(8, this.f183758n);
            String str12 = this.f183759o;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            return e2 + C52418a.m58678e(10, this.f183760p);
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
            C64459j13 j132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j132.f183751d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    j132.f183752e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j132.f183753f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j132.f183754g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j132.f183755h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j132.f183756i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    j132.f183757j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    j132.f183758n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    j132.f183759o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    j132.f183760p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f183751d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "nickname", str, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f183752e, false);
            aVar.mo71655d(jSONObject, "tipIconUrl", this.f183753f, false);
            aVar.mo71655d(jSONObject, "videoDurationSec", Integer.valueOf(this.f183754g), false);
            aVar.mo71655d(jSONObject, "fileExt", this.f183755h, false);
            aVar.mo71655d(jSONObject, "bizIcon", this.f183756i, false);
            aVar.mo71655d(jSONObject, "tipIconType", Integer.valueOf(this.f183757j), false);
            aVar.mo71655d(jSONObject, "defaultBg", Boolean.valueOf(this.f183758n), false);
            aVar.mo71655d(jSONObject, "tag", this.f183759o, false);
            aVar.mo71655d(jSONObject, "degree", Integer.valueOf(this.f183760p), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
