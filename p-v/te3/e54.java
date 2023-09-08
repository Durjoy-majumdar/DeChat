package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e54 extends C47465a {

    /* renamed from: d */
    public String f63770d;

    /* renamed from: e */
    public String f63771e;

    /* renamed from: f */
    public long f63772f;

    /* renamed from: g */
    public int f63773g;

    /* renamed from: h */
    public String f63774h;

    /* renamed from: i */
    public String f63775i;

    /* renamed from: j */
    public String f63776j;

    /* renamed from: n */
    public String f63777n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e54)) {
            return false;
        }
        e54 e54 = (e54) aVar;
        return C46238a.m51546a(this.f63770d, e54.f63770d) && C46238a.m51546a(this.f63771e, e54.f63771e) && C46238a.m51546a(Long.valueOf(this.f63772f), Long.valueOf(e54.f63772f)) && C46238a.m51546a(Integer.valueOf(this.f63773g), Integer.valueOf(e54.f63773g)) && C46238a.m51546a(this.f63774h, e54.f63774h) && C46238a.m51546a(this.f63775i, e54.f63775i) && C46238a.m51546a(this.f63776j, e54.f63776j) && C46238a.m51546a(this.f63777n, e54.f63777n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f63770d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f63771e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f63772f);
            aVar.mo74318e(4, this.f63773g);
            String str3 = this.f63774h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f63775i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f63776j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f63777n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f63770d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f63771e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int h = i2 + C52418a.m58681h(3, this.f63772f) + C52418a.m58678e(4, this.f63773g);
            String str9 = this.f63774h;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            String str10 = this.f63775i;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            String str11 = this.f63776j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            String str12 = this.f63777n;
            return str12 != null ? h + C52418a.m58683j(8, str12) : h;
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
            e54 e54 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e54.f63770d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e54.f63771e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e54.f63772f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    e54.f63773g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e54.f63774h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e54.f63775i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e54.f63776j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e54.f63777n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f63770d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "id", str, false);
            aVar.mo71655d(jSONObject, "wording", this.f63771e, false);
            aVar.mo71655d(jSONObject, "category", Long.valueOf(this.f63772f), false);
            aVar.mo71655d(jSONObject, "actionType", Integer.valueOf(this.f63773g), false);
            aVar.mo71655d(jSONObject, "url", this.f63774h, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f63775i, false);
            aVar.mo71655d(jSONObject, "subTitle", this.f63776j, false);
            aVar.mo71655d(jSONObject, "icon", this.f63777n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
