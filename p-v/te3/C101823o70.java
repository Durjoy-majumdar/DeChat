package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o70 */
public class C101823o70 extends C47465a {

    /* renamed from: d */
    public String f298976d;

    /* renamed from: e */
    public String f298977e;

    /* renamed from: f */
    public int f298978f;

    /* renamed from: g */
    public String f298979g;

    /* renamed from: h */
    public String f298980h;

    /* renamed from: i */
    public String f298981i;

    /* renamed from: j */
    public LinkedList<C49768hy> f298982j = new LinkedList<>();

    /* renamed from: n */
    public String f298983n;

    /* renamed from: o */
    public String f298984o;

    /* renamed from: p */
    public String f298985p;

    /* renamed from: q */
    public int f298986q;

    /* renamed from: r */
    public int f298987r;

    /* renamed from: s */
    public int f298988s;

    /* renamed from: t */
    public int f298989t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101823o70)) {
            return false;
        }
        C101823o70 o702 = (C101823o70) aVar;
        return C46238a.m51546a(this.f298976d, o702.f298976d) && C46238a.m51546a(this.f298977e, o702.f298977e) && C46238a.m51546a(Integer.valueOf(this.f298978f), Integer.valueOf(o702.f298978f)) && C46238a.m51546a(this.f298979g, o702.f298979g) && C46238a.m51546a(this.f298980h, o702.f298980h) && C46238a.m51546a(this.f298981i, o702.f298981i) && C46238a.m51546a(this.f298982j, o702.f298982j) && C46238a.m51546a(this.f298983n, o702.f298983n) && C46238a.m51546a(this.f298984o, o702.f298984o) && C46238a.m51546a(this.f298985p, o702.f298985p) && C46238a.m51546a(Integer.valueOf(this.f298986q), Integer.valueOf(o702.f298986q)) && C46238a.m51546a(Integer.valueOf(this.f298987r), Integer.valueOf(o702.f298987r)) && C46238a.m51546a(Integer.valueOf(this.f298988s), Integer.valueOf(o702.f298988s)) && C46238a.m51546a(Integer.valueOf(this.f298989t), Integer.valueOf(o702.f298989t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298976d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298977e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298978f);
            String str3 = this.f298979g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298980h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298981i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74320g(7, 8, this.f298982j);
            String str6 = this.f298983n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f298984o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f298985p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            aVar.mo74318e(11, this.f298986q);
            aVar.mo74318e(12, this.f298987r);
            aVar.mo74318e(13, this.f298988s);
            aVar.mo74318e(14, this.f298989t);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f298976d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f298977e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            int e = i3 + C52418a.m58678e(3, this.f298978f);
            String str11 = this.f298979g;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f298980h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f298981i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            int g = e + C52418a.m58680g(7, 8, this.f298982j);
            String str14 = this.f298983n;
            if (str14 != null) {
                g += C52418a.m58683j(8, str14);
            }
            String str15 = this.f298984o;
            if (str15 != null) {
                g += C52418a.m58683j(9, str15);
            }
            String str16 = this.f298985p;
            if (str16 != null) {
                g += C52418a.m58683j(10, str16);
            }
            return g + C52418a.m58678e(11, this.f298986q) + C52418a.m58678e(12, this.f298987r) + C52418a.m58678e(13, this.f298988s) + C52418a.m58678e(14, this.f298989t);
        } else if (i2 == 2) {
            this.f298982j.clear();
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
            C101823o70 o702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o702.f298976d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o702.f298977e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o702.f298978f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o702.f298979g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o702.f298980h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o702.f298981i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49768hy hyVar = new C49768hy();
                        if (bArr != null && bArr.length > 0) {
                            hyVar.parseFrom(bArr);
                        }
                        o702.f298982j.add(hyVar);
                    }
                    return 0;
                case 8:
                    o702.f298983n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    o702.f298984o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    o702.f298985p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    o702.f298986q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    o702.f298987r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    o702.f298988s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    o702.f298989t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f298976d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "searchId", str, false);
            aVar.mo71655d(jSONObject, "sessionId", this.f298977e, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f298978f), false);
            aVar.mo71655d(jSONObject, "url", this.f298979g, false);
            aVar.mo71655d(jSONObject, "requestId", this.f298980h, false);
            aVar.mo71655d(jSONObject, "keyword", this.f298981i, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f298982j, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f298983n, false);
            aVar.mo71655d(jSONObject, "talker", this.f298984o, false);
            aVar.mo71655d(jSONObject, "toSendText", this.f298985p, false);
            aVar.mo71655d(jSONObject, "enterScene", Integer.valueOf(this.f298986q), false);
            aVar.mo71655d(jSONObject, "needShowKeyboard", Integer.valueOf(this.f298987r), false);
            aVar.mo71655d(jSONObject, "forceDarkMode", Integer.valueOf(this.f298988s), false);
            aVar.mo71655d(jSONObject, "hideJumpMoreEntrance", Integer.valueOf(this.f298989t), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
