package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ho */
public class C49730ho extends C47465a {

    /* renamed from: d */
    public String f134753d;

    /* renamed from: e */
    public String f134754e;

    /* renamed from: f */
    public String f134755f;

    /* renamed from: g */
    public String f134756g;

    /* renamed from: h */
    public String f134757h;

    /* renamed from: i */
    public String f134758i;

    /* renamed from: j */
    public String f134759j;

    /* renamed from: n */
    public String f134760n;

    /* renamed from: o */
    public String f134761o;

    /* renamed from: p */
    public float f134762p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49730ho)) {
            return false;
        }
        C49730ho hoVar = (C49730ho) aVar;
        return C46238a.m51546a(this.f134753d, hoVar.f134753d) && C46238a.m51546a(this.f134754e, hoVar.f134754e) && C46238a.m51546a(this.f134755f, hoVar.f134755f) && C46238a.m51546a(this.f134756g, hoVar.f134756g) && C46238a.m51546a(this.f134757h, hoVar.f134757h) && C46238a.m51546a(this.f134758i, hoVar.f134758i) && C46238a.m51546a(this.f134759j, hoVar.f134759j) && C46238a.m51546a(this.f134760n, hoVar.f134760n) && C46238a.m51546a(this.f134761o, hoVar.f134761o) && C46238a.m51546a(Float.valueOf(this.f134762p), Float.valueOf(hoVar.f134762p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134753d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134754e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134755f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134756g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f134757h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f134758i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f134759j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f134760n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f134761o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            aVar.mo74317d(10, this.f134762p);
            return 0;
        } else if (i == 1) {
            String str10 = this.f134753d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f134754e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f134755f;
            if (str12 != null) {
                i2 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f134756g;
            if (str13 != null) {
                i2 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f134757h;
            if (str14 != null) {
                i2 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f134758i;
            if (str15 != null) {
                i2 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f134759j;
            if (str16 != null) {
                i2 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f134760n;
            if (str17 != null) {
                i2 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f134761o;
            if (str18 != null) {
                i2 += C52418a.m58683j(9, str18);
            }
            return i2 + C52418a.m58677d(10, this.f134762p);
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
            C49730ho hoVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hoVar.f134753d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hoVar.f134754e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hoVar.f134755f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hoVar.f134756g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hoVar.f134757h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hoVar.f134758i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hoVar.f134759j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hoVar.f134760n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hoVar.f134761o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hoVar.f134762p = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134753d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "image", str, true);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f134754e, true);
            aVar.mo71655d(jSONObject, "desc", this.f134755f, true);
            aVar.mo71655d(jSONObject, "button_icon", this.f134756g, true);
            aVar.mo71655d(jSONObject, "button_wording", this.f134757h, true);
            aVar.mo71655d(jSONObject, "action_icon", this.f134758i, true);
            aVar.mo71655d(jSONObject, "action_wording", this.f134759j, true);
            aVar.mo71655d(jSONObject, "button_font_color", this.f134760n, true);
            aVar.mo71655d(jSONObject, "button_bg_color", this.f134761o, true);
            aVar.mo71655d(jSONObject, "height_width_ratio", Float.valueOf(this.f134762p), true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -1777049286:
                            if (next.equals("height_width_ratio")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -1759740570:
                            if (next.equals("button_icon")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -463011168:
                            if (next.equals("button_font_color")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -390755441:
                            if (next.equals("action_wording")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -174229365:
                            if (next.equals("button_wording")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3079825:
                            if (next.equals("desc")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 100313435:
                            if (next.equals("image")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1583409378:
                            if (next.equals("action_icon")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1894750550:
                            if (next.equals("button_bg_color")) {
                                c = 8;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f134753d = (String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f134754e = (String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f134755f = (String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f134756g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f134757h = (String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f134758i = (String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f134759j = (String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f134760n = (String) jSONObject.opt(next);
                            break;
                        case 8:
                            this.f134761o = (String) jSONObject.opt(next);
                            break;
                        case 9:
                            this.f134762p = (float) jSONObject.optDouble(next);
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("CardStyle", e, "", new Object[0]);
            }
        }
        return this;
    }
}
