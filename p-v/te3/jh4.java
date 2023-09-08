package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class jh4 extends C47465a {

    /* renamed from: A */
    public C51138rp1 f64025A;

    /* renamed from: B */
    public String f64026B;

    /* renamed from: C */
    public String f64027C;

    /* renamed from: D */
    public boolean f64028D;

    /* renamed from: d */
    public String f64029d;

    /* renamed from: e */
    public String f64030e;

    /* renamed from: f */
    public String f64031f;

    /* renamed from: g */
    public int f64032g;

    /* renamed from: h */
    public String f64033h;

    /* renamed from: i */
    public int f64034i;

    /* renamed from: j */
    public String f64035j;

    /* renamed from: n */
    public String f64036n;

    /* renamed from: o */
    public LinkedList<C49768hy> f64037o = new LinkedList<>();

    /* renamed from: p */
    public String f64038p;

    /* renamed from: q */
    public LinkedList<th4> f64039q = new LinkedList<>();

    /* renamed from: r */
    public int f64040r;

    /* renamed from: s */
    public int f64041s;

    /* renamed from: t */
    public String f64042t;

    /* renamed from: u */
    public int f64043u;

    /* renamed from: v */
    public String f64044v;

    /* renamed from: w */
    public String f64045w;

    /* renamed from: x */
    public String f64046x;

    /* renamed from: y */
    public LinkedList<String> f64047y = new LinkedList<>();

    /* renamed from: z */
    public int f64048z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jh4)) {
            return false;
        }
        jh4 jh4 = (jh4) aVar;
        return C46238a.m51546a(this.f64029d, jh4.f64029d) && C46238a.m51546a(this.f64030e, jh4.f64030e) && C46238a.m51546a(this.f64031f, jh4.f64031f) && C46238a.m51546a(Integer.valueOf(this.f64032g), Integer.valueOf(jh4.f64032g)) && C46238a.m51546a(this.f64033h, jh4.f64033h) && C46238a.m51546a(Integer.valueOf(this.f64034i), Integer.valueOf(jh4.f64034i)) && C46238a.m51546a(this.f64035j, jh4.f64035j) && C46238a.m51546a(this.f64036n, jh4.f64036n) && C46238a.m51546a(this.f64037o, jh4.f64037o) && C46238a.m51546a(this.f64038p, jh4.f64038p) && C46238a.m51546a(this.f64039q, jh4.f64039q) && C46238a.m51546a(Integer.valueOf(this.f64040r), Integer.valueOf(jh4.f64040r)) && C46238a.m51546a(Integer.valueOf(this.f64041s), Integer.valueOf(jh4.f64041s)) && C46238a.m51546a(this.f64042t, jh4.f64042t) && C46238a.m51546a(Integer.valueOf(this.f64043u), Integer.valueOf(jh4.f64043u)) && C46238a.m51546a(this.f64044v, jh4.f64044v) && C46238a.m51546a(this.f64045w, jh4.f64045w) && C46238a.m51546a(this.f64046x, jh4.f64046x) && C46238a.m51546a(this.f64047y, jh4.f64047y) && C46238a.m51546a(Integer.valueOf(this.f64048z), Integer.valueOf(jh4.f64048z)) && C46238a.m51546a(this.f64025A, jh4.f64025A) && C46238a.m51546a(this.f64026B, jh4.f64026B) && C46238a.m51546a(this.f64027C, jh4.f64027C) && C46238a.m51546a(Boolean.valueOf(this.f64028D), Boolean.valueOf(jh4.f64028D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64029d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64030e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64031f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f64032g);
            String str4 = this.f64033h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f64034i);
            String str5 = this.f64035j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f64036n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74320g(9, 8, this.f64037o);
            String str7 = this.f64038p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74320g(11, 8, this.f64039q);
            aVar.mo74318e(12, this.f64040r);
            aVar.mo74318e(13, this.f64041s);
            String str8 = this.f64042t;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            aVar.mo74318e(15, this.f64043u);
            String str9 = this.f64044v;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            String str10 = this.f64045w;
            if (str10 != null) {
                aVar.mo74323j(17, str10);
            }
            String str11 = this.f64046x;
            if (str11 != null) {
                aVar.mo74323j(18, str11);
            }
            aVar.mo74320g(19, 1, this.f64047y);
            aVar.mo74318e(20, this.f64048z);
            C51138rp1 rp12 = this.f64025A;
            if (rp12 != null) {
                aVar.mo74322i(21, rp12.computeSize());
                this.f64025A.writeFields(aVar);
            }
            String str12 = this.f64026B;
            if (str12 != null) {
                aVar.mo74323j(22, str12);
            }
            String str13 = this.f64027C;
            if (str13 != null) {
                aVar.mo74323j(23, str13);
            }
            aVar.mo74314a(24, this.f64028D);
            return 0;
        } else if (i2 == 1) {
            String str14 = this.f64029d;
            if (str14 != null) {
                i3 = C52418a.m58683j(1, str14) + 0;
            }
            String str15 = this.f64030e;
            if (str15 != null) {
                i3 += C52418a.m58683j(2, str15);
            }
            String str16 = this.f64031f;
            if (str16 != null) {
                i3 += C52418a.m58683j(3, str16);
            }
            int e = i3 + C52418a.m58678e(4, this.f64032g);
            String str17 = this.f64033h;
            if (str17 != null) {
                e += C52418a.m58683j(5, str17);
            }
            int e2 = e + C52418a.m58678e(6, this.f64034i);
            String str18 = this.f64035j;
            if (str18 != null) {
                e2 += C52418a.m58683j(7, str18);
            }
            String str19 = this.f64036n;
            if (str19 != null) {
                e2 += C52418a.m58683j(8, str19);
            }
            int g = e2 + C52418a.m58680g(9, 8, this.f64037o);
            String str20 = this.f64038p;
            if (str20 != null) {
                g += C52418a.m58683j(10, str20);
            }
            int g2 = g + C52418a.m58680g(11, 8, this.f64039q) + C52418a.m58678e(12, this.f64040r) + C52418a.m58678e(13, this.f64041s);
            String str21 = this.f64042t;
            if (str21 != null) {
                g2 += C52418a.m58683j(14, str21);
            }
            int e3 = g2 + C52418a.m58678e(15, this.f64043u);
            String str22 = this.f64044v;
            if (str22 != null) {
                e3 += C52418a.m58683j(16, str22);
            }
            String str23 = this.f64045w;
            if (str23 != null) {
                e3 += C52418a.m58683j(17, str23);
            }
            String str24 = this.f64046x;
            if (str24 != null) {
                e3 += C52418a.m58683j(18, str24);
            }
            int g3 = e3 + C52418a.m58680g(19, 1, this.f64047y) + C52418a.m58678e(20, this.f64048z);
            C51138rp1 rp13 = this.f64025A;
            if (rp13 != null) {
                g3 += C52418a.m58682i(21, rp13.computeSize());
            }
            String str25 = this.f64026B;
            if (str25 != null) {
                g3 += C52418a.m58683j(22, str25);
            }
            String str26 = this.f64027C;
            if (str26 != null) {
                g3 += C52418a.m58683j(23, str26);
            }
            return g3 + C52418a.m58674a(24, this.f64028D);
        } else if (i2 == 2) {
            this.f64037o.clear();
            this.f64039q.clear();
            this.f64047y.clear();
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
            jh4 jh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jh4.f64029d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jh4.f64030e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jh4.f64031f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jh4.f64032g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jh4.f64033h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jh4.f64034i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jh4.f64035j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jh4.f64036n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49768hy hyVar = new C49768hy();
                        if (bArr != null && bArr.length > 0) {
                            hyVar.parseFrom(bArr);
                        }
                        jh4.f64037o.add(hyVar);
                    }
                    return 0;
                case 10:
                    jh4.f64038p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        th4 th4 = new th4();
                        if (bArr2 != null && bArr2.length > 0) {
                            th4.parseFrom(bArr2);
                        }
                        jh4.f64039q.add(th4);
                    }
                    return 0;
                case 12:
                    jh4.f64040r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    jh4.f64041s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    jh4.f64042t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    jh4.f64043u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    jh4.f64044v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    jh4.f64045w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    jh4.f64046x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    jh4.f64047y.add(aVar3.mo141633k(intValue));
                    return 0;
                case 20:
                    jh4.f64048z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51138rp1 rp14 = new C51138rp1();
                        if (bArr3 != null && bArr3.length > 0) {
                            rp14.parseFrom(bArr3);
                        }
                        jh4.f64025A = rp14;
                    }
                    return 0;
                case 22:
                    jh4.f64026B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    jh4.f64027C = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    jh4.f64028D = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64029d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "searchId", str, false);
            aVar.mo71655d(jSONObject, "sessionId", this.f64030e, false);
            aVar.mo71655d(jSONObject, "subSessionId", this.f64031f, false);
            aVar.mo71655d(jSONObject, "offset", Integer.valueOf(this.f64032g), false);
            aVar.mo71655d(jSONObject, "keyword", this.f64033h, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f64034i), false);
            aVar.mo71655d(jSONObject, "url", this.f64035j, false);
            aVar.mo71655d(jSONObject, "requestId", this.f64036n, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f64037o, false);
            aVar.mo71655d(jSONObject, "contextId", this.f64038p, false);
            aVar.mo71655d(jSONObject, "stageList", this.f64039q, false);
            aVar.mo71655d(jSONObject, "firstLoadWebView", Integer.valueOf(this.f64040r), false);
            aVar.mo71655d(jSONObject, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, Integer.valueOf(this.f64041s), false);
            aVar.mo71655d(jSONObject, "navigationId", this.f64042t, false);
            aVar.mo71655d(jSONObject, "pageId", Integer.valueOf(this.f64043u), false);
            aVar.mo71655d(jSONObject, "pageTitle", this.f64044v, false);
            aVar.mo71655d(jSONObject, DownloadInfo.NETTYPE, this.f64045w, false);
            aVar.mo71655d(jSONObject, "webviewType", this.f64046x, false);
            aVar.mo71655d(jSONObject, "checkDocidList", this.f64047y, false);
            aVar.mo71655d(jSONObject, "actionBarColor", Integer.valueOf(this.f64048z), false);
            aVar.mo71655d(jSONObject, "floatingWindow", this.f64025A, false);
            aVar.mo71655d(jSONObject, "homeMsgId", this.f64026B, false);
            aVar.mo71655d(jSONObject, "redPointMsgId", this.f64027C, false);
            aVar.mo71655d(jSONObject, "directRequest", Boolean.valueOf(this.f64028D), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
