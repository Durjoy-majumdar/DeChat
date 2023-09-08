package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ph4 extends C47465a {

    /* renamed from: d */
    public String f64399d;

    /* renamed from: e */
    public String f64400e;

    /* renamed from: f */
    public String f64401f;

    /* renamed from: g */
    public String f64402g;

    /* renamed from: h */
    public String f64403h;

    /* renamed from: i */
    public String f64404i;

    /* renamed from: j */
    public String f64405j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ph4)) {
            return false;
        }
        ph4 ph4 = (ph4) aVar;
        return C46238a.m51546a(this.f64399d, ph4.f64399d) && C46238a.m51546a(this.f64400e, ph4.f64400e) && C46238a.m51546a(this.f64401f, ph4.f64401f) && C46238a.m51546a(this.f64402g, ph4.f64402g) && C46238a.m51546a(this.f64403h, ph4.f64403h) && C46238a.m51546a(this.f64404i, ph4.f64404i) && C46238a.m51546a(this.f64405j, ph4.f64405j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64399d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64400e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64401f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64402g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f64403h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f64404i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f64405j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f64399d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f64400e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f64401f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f64402g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f64403h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f64404i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f64405j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
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
            ph4 ph4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ph4.f64399d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ph4.f64400e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ph4.f64401f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ph4.f64402g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ph4.f64403h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ph4.f64404i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ph4.f64405j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64399d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            aVar.mo71655d(jSONObject, "desc", this.f64400e, false);
            aVar.mo71655d(jSONObject, "relativeURL", this.f64401f, false);
            aVar.mo71655d(jSONObject, "originalId", this.f64402g, false);
            aVar.mo71655d(jSONObject, "weAppName", this.f64403h, false);
            aVar.mo71655d(jSONObject, "appId", this.f64404i, false);
            aVar.mo71655d(jSONObject, "avatar", this.f64405j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
