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

public class xe4 extends C47465a {

    /* renamed from: d */
    public String f228416d;

    /* renamed from: e */
    public String f228417e;

    /* renamed from: f */
    public int f228418f;

    /* renamed from: g */
    public String f228419g;

    /* renamed from: h */
    public String f228420h;

    /* renamed from: i */
    public String f228421i;

    /* renamed from: j */
    public LinkedList<C49768hy> f228422j = new LinkedList<>();

    /* renamed from: n */
    public String f228423n;

    /* renamed from: o */
    public String f228424o;

    /* renamed from: p */
    public int f228425p;

    /* renamed from: q */
    public int f228426q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xe4)) {
            return false;
        }
        xe4 xe4 = (xe4) aVar;
        return C46238a.m51546a(this.f228416d, xe4.f228416d) && C46238a.m51546a(this.f228417e, xe4.f228417e) && C46238a.m51546a(Integer.valueOf(this.f228418f), Integer.valueOf(xe4.f228418f)) && C46238a.m51546a(this.f228419g, xe4.f228419g) && C46238a.m51546a(this.f228420h, xe4.f228420h) && C46238a.m51546a(this.f228421i, xe4.f228421i) && C46238a.m51546a(this.f228422j, xe4.f228422j) && C46238a.m51546a(this.f228423n, xe4.f228423n) && C46238a.m51546a(this.f228424o, xe4.f228424o) && C46238a.m51546a(Integer.valueOf(this.f228425p), Integer.valueOf(xe4.f228425p)) && C46238a.m51546a(Integer.valueOf(this.f228426q), Integer.valueOf(xe4.f228426q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228416d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228417e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f228418f);
            String str3 = this.f228419g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f228420h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f228421i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74320g(7, 8, this.f228422j);
            String str6 = this.f228423n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f228424o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74318e(10, this.f228425p);
            aVar.mo74318e(11, this.f228426q);
            return 0;
        } else if (i == 1) {
            String str8 = this.f228416d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f228417e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f228418f);
            String str10 = this.f228419g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f228420h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f228421i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            int g = e + C52418a.m58680g(7, 8, this.f228422j);
            String str13 = this.f228423n;
            if (str13 != null) {
                g += C52418a.m58683j(8, str13);
            }
            String str14 = this.f228424o;
            if (str14 != null) {
                g += C52418a.m58683j(9, str14);
            }
            return g + C52418a.m58678e(10, this.f228425p) + C52418a.m58678e(11, this.f228426q);
        } else if (i == 2) {
            this.f228422j.clear();
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
            xe4 xe4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xe4.f228416d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xe4.f228417e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xe4.f228418f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    xe4.f228419g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xe4.f228420h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xe4.f228421i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49768hy hyVar = new C49768hy();
                        if (bArr != null && bArr.length > 0) {
                            hyVar.parseFrom(bArr);
                        }
                        xe4.f228422j.add(hyVar);
                    }
                    return 0;
                case 8:
                    xe4.f228423n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xe4.f228424o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xe4.f228425p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    xe4.f228426q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f228416d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "searchId", str, false);
            aVar.mo71655d(jSONObject, "sessionId", this.f228417e, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f228418f), false);
            aVar.mo71655d(jSONObject, "url", this.f228419g, false);
            aVar.mo71655d(jSONObject, "requestId", this.f228420h, false);
            aVar.mo71655d(jSONObject, "keyword", this.f228421i, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f228422j, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f228423n, false);
            aVar.mo71655d(jSONObject, "talker", this.f228424o, false);
            aVar.mo71655d(jSONObject, "enterType", Integer.valueOf(this.f228425p), false);
            aVar.mo71655d(jSONObject, "dismissType", Integer.valueOf(this.f228426q), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
