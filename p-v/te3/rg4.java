package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class rg4 extends C47465a {

    /* renamed from: A */
    public String f259795A;

    /* renamed from: d */
    public String f259796d;

    /* renamed from: e */
    public String f259797e;

    /* renamed from: f */
    public int f259798f;

    /* renamed from: g */
    public String f259799g;

    /* renamed from: h */
    public String f259800h;

    /* renamed from: i */
    public String f259801i;

    /* renamed from: j */
    public String f259802j;

    /* renamed from: n */
    public String f259803n;

    /* renamed from: o */
    public String f259804o;

    /* renamed from: p */
    public String f259805p;

    /* renamed from: q */
    public String f259806q;

    /* renamed from: r */
    public int f259807r;

    /* renamed from: s */
    public int f259808s;

    /* renamed from: t */
    public int f259809t;

    /* renamed from: u */
    public int f259810u;

    /* renamed from: v */
    public int f259811v;

    /* renamed from: w */
    public int f259812w;

    /* renamed from: x */
    public int f259813x;

    /* renamed from: y */
    public int f259814y;

    /* renamed from: z */
    public String f259815z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rg4)) {
            return false;
        }
        rg4 rg4 = (rg4) aVar;
        return C46238a.m51546a(this.f259796d, rg4.f259796d) && C46238a.m51546a(this.f259797e, rg4.f259797e) && C46238a.m51546a(Integer.valueOf(this.f259798f), Integer.valueOf(rg4.f259798f)) && C46238a.m51546a(this.f259799g, rg4.f259799g) && C46238a.m51546a(this.f259800h, rg4.f259800h) && C46238a.m51546a(this.f259801i, rg4.f259801i) && C46238a.m51546a(this.f259802j, rg4.f259802j) && C46238a.m51546a(this.f259803n, rg4.f259803n) && C46238a.m51546a(this.f259804o, rg4.f259804o) && C46238a.m51546a(this.f259805p, rg4.f259805p) && C46238a.m51546a(this.f259806q, rg4.f259806q) && C46238a.m51546a(Integer.valueOf(this.f259807r), Integer.valueOf(rg4.f259807r)) && C46238a.m51546a(Integer.valueOf(this.f259808s), Integer.valueOf(rg4.f259808s)) && C46238a.m51546a(Integer.valueOf(this.f259809t), Integer.valueOf(rg4.f259809t)) && C46238a.m51546a(Integer.valueOf(this.f259810u), Integer.valueOf(rg4.f259810u)) && C46238a.m51546a(Integer.valueOf(this.f259811v), Integer.valueOf(rg4.f259811v)) && C46238a.m51546a(Integer.valueOf(this.f259812w), Integer.valueOf(rg4.f259812w)) && C46238a.m51546a(Integer.valueOf(this.f259813x), Integer.valueOf(rg4.f259813x)) && C46238a.m51546a(Integer.valueOf(this.f259814y), Integer.valueOf(rg4.f259814y)) && C46238a.m51546a(this.f259815z, rg4.f259815z) && C46238a.m51546a(this.f259795A, rg4.f259795A);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259796d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: patchId");
            } else if (this.f259799g == null) {
                throw new C52419b("Not all required fields were included: newApkMd5");
            } else if (this.f259800h == null) {
                throw new C52419b("Not all required fields were included: oldApkMd5");
            } else if (this.f259801i == null) {
                throw new C52419b("Not all required fields were included: title");
            } else if (this.f259803n == null) {
                throw new C52419b("Not all required fields were included: okBtn");
            } else if (this.f259804o == null) {
                throw new C52419b("Not all required fields were included: cancelBtn");
            } else if (this.f259806q != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f259797e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f259798f);
                String str3 = this.f259799g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f259800h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f259801i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                String str6 = this.f259802j;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                String str7 = this.f259803n;
                if (str7 != null) {
                    aVar.mo74323j(8, str7);
                }
                String str8 = this.f259804o;
                if (str8 != null) {
                    aVar.mo74323j(9, str8);
                }
                String str9 = this.f259805p;
                if (str9 != null) {
                    aVar.mo74323j(10, str9);
                }
                String str10 = this.f259806q;
                if (str10 != null) {
                    aVar.mo74323j(11, str10);
                }
                aVar.mo74318e(12, this.f259807r);
                aVar.mo74318e(13, this.f259808s);
                aVar.mo74318e(14, this.f259809t);
                aVar.mo74318e(15, this.f259810u);
                aVar.mo74318e(16, this.f259811v);
                aVar.mo74318e(17, this.f259812w);
                aVar.mo74318e(18, this.f259813x);
                aVar.mo74318e(19, this.f259814y);
                String str11 = this.f259815z;
                if (str11 != null) {
                    aVar.mo74323j(20, str11);
                }
                String str12 = this.f259795A;
                if (str12 != null) {
                    aVar.mo74323j(21, str12);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: patchMd5");
            }
        } else if (i2 == 1) {
            String str13 = this.f259796d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            String str14 = this.f259797e;
            if (str14 != null) {
                i3 += C52418a.m58683j(2, str14);
            }
            int e = i3 + C52418a.m58678e(3, this.f259798f);
            String str15 = this.f259799g;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f259800h;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f259801i;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f259802j;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            String str19 = this.f259803n;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            String str20 = this.f259804o;
            if (str20 != null) {
                e += C52418a.m58683j(9, str20);
            }
            String str21 = this.f259805p;
            if (str21 != null) {
                e += C52418a.m58683j(10, str21);
            }
            String str22 = this.f259806q;
            if (str22 != null) {
                e += C52418a.m58683j(11, str22);
            }
            int e2 = e + C52418a.m58678e(12, this.f259807r) + C52418a.m58678e(13, this.f259808s) + C52418a.m58678e(14, this.f259809t) + C52418a.m58678e(15, this.f259810u) + C52418a.m58678e(16, this.f259811v) + C52418a.m58678e(17, this.f259812w) + C52418a.m58678e(18, this.f259813x) + C52418a.m58678e(19, this.f259814y);
            String str23 = this.f259815z;
            if (str23 != null) {
                e2 += C52418a.m58683j(20, str23);
            }
            String str24 = this.f259795A;
            return str24 != null ? e2 + C52418a.m58683j(21, str24) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f259796d == null) {
                throw new C52419b("Not all required fields were included: patchId");
            } else if (this.f259799g == null) {
                throw new C52419b("Not all required fields were included: newApkMd5");
            } else if (this.f259800h == null) {
                throw new C52419b("Not all required fields were included: oldApkMd5");
            } else if (this.f259801i == null) {
                throw new C52419b("Not all required fields were included: title");
            } else if (this.f259803n == null) {
                throw new C52419b("Not all required fields were included: okBtn");
            } else if (this.f259804o == null) {
                throw new C52419b("Not all required fields were included: cancelBtn");
            } else if (this.f259806q != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: patchMd5");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            rg4 rg4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rg4.f259796d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rg4.f259797e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rg4.f259798f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rg4.f259799g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rg4.f259800h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rg4.f259801i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rg4.f259802j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rg4.f259803n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    rg4.f259804o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    rg4.f259805p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    rg4.f259806q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    rg4.f259807r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    rg4.f259808s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    rg4.f259809t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    rg4.f259810u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    rg4.f259811v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    rg4.f259812w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    rg4.f259813x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    rg4.f259814y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    rg4.f259815z = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    rg4.f259795A = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
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
                        case -1780691089:
                            if (next.equals("isShowDialog")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -1364966910:
                            if (next.equals("cdnUrl")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -1114961022:
                            if (next.equals("newApkMd5")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -791595133:
                            if (next.equals("patchId")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -737365201:
                            if (next.equals("isShowRedot")) {
                                c = 15;
                                break;
                            }
                            break;
                        case -722265993:
                            if (next.equals("showDialogIntervalTime")) {
                                c = 18;
                                break;
                            }
                            break;
                        case -519374818:
                            if (next.equals("downloadingTitle")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -513404823:
                            if (next.equals("patchSize")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -500633081:
                            if (next.equals("showDialogMaxTimes")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -203964767:
                            if (next.equals("newApkPath")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108417:
                            if (next.equals("msg")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 105765600:
                            if (next.equals("okBtn")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 476548482:
                            if (next.equals("cancelBtn")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 688591589:
                            if (next.equals(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                                c = 11;
                                break;
                            }
                            break;
                        case 719273028:
                            if (next.equals("updateClientVersion")) {
                                c = 12;
                                break;
                            }
                            break;
                        case 908960928:
                            if (next.equals("packageType")) {
                                c = 13;
                                break;
                            }
                            break;
                        case 1004621513:
                            if (next.equals("oldApkMd5")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1230358550:
                            if (next.equals("patchMd5")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 1268725447:
                            if (next.equals("downloadingMsg")) {
                                c = 20;
                                break;
                            }
                            break;
                        case 2062213586:
                            if (next.equals("isShowNotification")) {
                                c = 14;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f259796d = (String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f259797e = (String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f259798f = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f259799g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f259800h = (String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f259801i = (String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f259802j = (String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f259803n = (String) jSONObject.opt(next);
                            break;
                        case 8:
                            this.f259804o = (String) jSONObject.opt(next);
                            break;
                        case 9:
                            this.f259805p = (String) jSONObject.opt(next);
                            break;
                        case 10:
                            this.f259806q = (String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f259807r = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 12:
                            this.f259808s = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 13:
                            this.f259809t = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f259810u = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f259811v = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f259812w = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f259813x = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f259814y = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f259815z = (String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.f259795A = (String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("TinkerInstallDialog", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f259796d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "patchId", str, false);
            aVar.mo71655d(jSONObject, "newApkPath", this.f259797e, false);
            aVar.mo71655d(jSONObject, "patchSize", Integer.valueOf(this.f259798f), false);
            aVar.mo71655d(jSONObject, "newApkMd5", this.f259799g, false);
            aVar.mo71655d(jSONObject, "oldApkMd5", this.f259800h, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f259801i, false);
            aVar.mo71655d(jSONObject, "msg", this.f259802j, false);
            aVar.mo71655d(jSONObject, "okBtn", this.f259803n, false);
            aVar.mo71655d(jSONObject, "cancelBtn", this.f259804o, false);
            aVar.mo71655d(jSONObject, "cdnUrl", this.f259805p, false);
            aVar.mo71655d(jSONObject, "patchMd5", this.f259806q, false);
            aVar.mo71655d(jSONObject, AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, Integer.valueOf(this.f259807r), false);
            aVar.mo71655d(jSONObject, "updateClientVersion", Integer.valueOf(this.f259808s), false);
            aVar.mo71655d(jSONObject, "packageType", Integer.valueOf(this.f259809t), false);
            aVar.mo71655d(jSONObject, "isShowNotification", Integer.valueOf(this.f259810u), false);
            aVar.mo71655d(jSONObject, "isShowRedot", Integer.valueOf(this.f259811v), false);
            aVar.mo71655d(jSONObject, "isShowDialog", Integer.valueOf(this.f259812w), false);
            aVar.mo71655d(jSONObject, "showDialogMaxTimes", Integer.valueOf(this.f259813x), false);
            aVar.mo71655d(jSONObject, "showDialogIntervalTime", Integer.valueOf(this.f259814y), false);
            aVar.mo71655d(jSONObject, "downloadingTitle", this.f259815z, false);
            aVar.mo71655d(jSONObject, "downloadingMsg", this.f259795A, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
