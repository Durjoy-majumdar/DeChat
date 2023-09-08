package hd0;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import h81.C32735h;
import java.util.Map;
import te3.C101783gu2;
import te3.tc4;

/* renamed from: hd0.n0 */
public class C98408n0 {

    /* renamed from: A */
    public String f288533A = "";

    /* renamed from: B */
    public String f288534B = "";

    /* renamed from: C */
    public tc4 f288535C = new tc4();

    /* renamed from: D */
    public String f288536D = "";

    /* renamed from: E */
    public int f288537E = 0;

    /* renamed from: F */
    public C101783gu2 f288538F = new C101783gu2();

    /* renamed from: G */
    public int f288539G = 0;

    /* renamed from: H */
    public int f288540H = 0;

    /* renamed from: I */
    public long f288541I;

    /* renamed from: J */
    public String f288542J;

    /* renamed from: K */
    public String f288543K;

    /* renamed from: L */
    public String f288544L;

    /* renamed from: M */
    public boolean f288545M = false;

    /* renamed from: N */
    public String f288546N;

    /* renamed from: O */
    public int f288547O;

    /* renamed from: P */
    public int f288548P = -1;

    /* renamed from: Q */
    public boolean f288549Q;

    /* renamed from: R */
    public boolean f288550R;

    /* renamed from: S */
    public boolean f288551S;

    /* renamed from: T */
    public boolean f288552T;

    /* renamed from: U */
    public boolean f288553U;

    /* renamed from: a */
    public String f288554a = "";

    /* renamed from: b */
    public String f288555b = "";

    /* renamed from: c */
    public long f288556c = 0;

    /* renamed from: d */
    public int f288557d = 0;

    /* renamed from: e */
    public int f288558e = 0;

    /* renamed from: f */
    public int f288559f = 0;

    /* renamed from: g */
    public int f288560g = 0;

    /* renamed from: h */
    public int f288561h = 0;

    /* renamed from: i */
    public int f288562i = 0;

    /* renamed from: j */
    public long f288563j = 0;

    /* renamed from: k */
    public long f288564k = 0;

    /* renamed from: l */
    public long f288565l = 0;

    /* renamed from: m */
    public int f288566m = 0;

    /* renamed from: n */
    public long f288567n = 0;

    /* renamed from: o */
    public int f288568o = 0;

    /* renamed from: p */
    public int f288569p = 0;

    /* renamed from: q */
    public String f288570q = "";

    /* renamed from: r */
    public String f288571r = "";

    /* renamed from: s */
    public int f288572s = 0;

    /* renamed from: t */
    public int f288573t = 0;

    /* renamed from: u */
    public String f288574u = "";

    /* renamed from: v */
    public String f288575v = "";

    /* renamed from: w */
    public int f288576w = 0;

    /* renamed from: x */
    public long f288577x = 0;

    /* renamed from: y */
    public String f288578y = "";

    /* renamed from: z */
    public String f288579z = "";

    /* renamed from: c */
    public static String m127710c(String str) {
        try {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            return parseXml != null ? parseXml.get(".msg.videomsg.$cdnvideourl") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void mo137698a(Cursor cursor) {
        this.f288554a = cursor.getString(0);
        this.f288555b = cursor.getString(1);
        this.f288556c = cursor.getLong(2);
        this.f288557d = cursor.getInt(3);
        this.f288558e = cursor.getInt(4);
        this.f288559f = cursor.getInt(5);
        this.f288560g = cursor.getInt(6);
        this.f288561h = cursor.getInt(7);
        this.f288562i = cursor.getInt(8);
        this.f288563j = cursor.getLong(9);
        this.f288564k = cursor.getLong(10);
        this.f288565l = cursor.getLong(11);
        this.f288566m = cursor.getInt(12);
        this.f288567n = cursor.getLong(13);
        this.f288568o = cursor.getInt(14);
        this.f288569p = cursor.getInt(15);
        this.f288570q = cursor.getString(16);
        this.f288571r = cursor.getString(17);
        this.f288572s = cursor.getInt(18);
        this.f288573t = cursor.getInt(19);
        this.f288574u = cursor.getString(20);
        this.f288575v = cursor.getString(21);
        this.f288576w = cursor.getInt(22);
        this.f288577x = cursor.getLong(23);
        this.f288578y = cursor.getString(24);
        this.f288579z = cursor.getString(25);
        byte[] blob = cursor.getBlob(26);
        tc4 tc4 = new tc4();
        this.f288535C = tc4;
        try {
            tc4.parseFrom(blob);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoInfo", e, "", new Object[0]);
        }
        this.f288536D = cursor.getString(27);
        this.f288537E = cursor.getInt(28);
        byte[] blob2 = cursor.getBlob(29);
        C101783gu2 gu22 = new C101783gu2();
        this.f288538F = gu22;
        try {
            gu22.parseFrom(blob2);
        } catch (Exception unused) {
        }
        this.f288539G = cursor.getInt(30);
        this.f288540H = cursor.getInt(31);
        this.f288541I = (long) cursor.getInt(32);
        this.f288542J = cursor.getString(33);
        this.f288543K = cursor.getString(34);
        this.f288546N = cursor.getString(35);
        this.f288547O = cursor.getInt(36);
        this.f288544L = cursor.getString(37);
        this.f288533A = cursor.getString(38);
        this.f288534B = cursor.getString(39);
    }

    /* renamed from: b */
    public ContentValues mo137699b() {
        ContentValues contentValues = new ContentValues();
        boolean z = true;
        if ((this.f288548P & 1) != 0) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, mo137700d());
        }
        if ((this.f288548P & 2) != 0) {
            String str = this.f288555b;
            if (str == null) {
                str = "";
            }
            contentValues.put("clientid", str);
        }
        if ((this.f288548P & 4) != 0) {
            contentValues.put("msgsvrid", Long.valueOf(this.f288556c));
        }
        if ((this.f288548P & 8) != 0) {
            contentValues.put("netoffset", Integer.valueOf(this.f288557d));
        }
        if ((this.f288548P & 16) != 0) {
            contentValues.put("filenowsize", Integer.valueOf(this.f288558e));
        }
        if ((this.f288548P & 32) != 0) {
            contentValues.put("totallen", Integer.valueOf(this.f288559f));
        }
        if ((this.f288548P & 64) != 0) {
            contentValues.put("thumbnetoffset", Integer.valueOf(this.f288560g));
        }
        if ((this.f288548P & 128) != 0) {
            contentValues.put("thumblen", Integer.valueOf(this.f288561h));
        }
        if ((this.f288548P & 256) != 0) {
            contentValues.put("status", Integer.valueOf(this.f288562i));
        }
        if ((this.f288548P & 512) != 0) {
            contentValues.put("createtime", Long.valueOf(this.f288563j));
        }
        if ((this.f288548P & 1024) != 0) {
            contentValues.put("lastmodifytime", Long.valueOf(this.f288564k));
        }
        if ((this.f288548P & 2048) != 0) {
            contentValues.put("downloadtime", Long.valueOf(this.f288565l));
        }
        if ((this.f288548P & 4096) != 0) {
            contentValues.put("videolength", Integer.valueOf(this.f288566m));
        }
        if ((this.f288548P & 8192) != 0) {
            contentValues.put("msglocalid", Long.valueOf(this.f288567n));
        }
        if ((this.f288548P & 16384) != 0) {
            contentValues.put("nettimes", Integer.valueOf(this.f288568o));
        }
        if ((this.f288548P & 32768) != 0) {
            contentValues.put("cameratype", Integer.valueOf(this.f288569p));
        }
        if ((this.f288548P & 65536) != 0) {
            contentValues.put("user", mo137707k());
        }
        if ((this.f288548P & 131072) != 0) {
            contentValues.put("human", mo137701e());
        }
        if ((this.f288548P & 262144) != 0) {
            contentValues.put("reserved1", Integer.valueOf(this.f288572s));
        }
        if ((this.f288548P & 524288) != 0) {
            contentValues.put("reserved2", Integer.valueOf(this.f288573t));
        }
        if ((this.f288548P & 1048576) != 0) {
            contentValues.put("reserved3", mo137702f());
        }
        if ((this.f288548P & 2097152) != 0) {
            contentValues.put("reserved4", mo137705i());
        }
        if ((this.f288548P & 4194304) != 0) {
            contentValues.put("videofuncflag", Integer.valueOf(this.f288576w));
        }
        if ((this.f288548P & 8388608) != 0) {
            contentValues.put("masssendid", Long.valueOf(this.f288577x));
        }
        if ((this.f288548P & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
            contentValues.put("masssendlist", this.f288578y);
        }
        if ((this.f288548P & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0) {
            contentValues.put("videomd5", this.f288579z);
        }
        if ((this.f288548P & 67108864) != 0) {
            byte[] bArr = new byte[0];
            try {
                bArr = this.f288535C.toByteArray();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoInfo", e, "", new Object[0]);
            }
            contentValues.put("streamvideo", bArr);
        }
        if ((this.f288548P & 134217728) != 0) {
            contentValues.put("statextstr", this.f288536D);
        }
        if ((this.f288548P & 268435456) != 0) {
            contentValues.put("downloadscene", Integer.valueOf(this.f288537E));
        }
        if ((this.f288548P & 536870912) != 0) {
            byte[] bArr2 = new byte[0];
            try {
                bArr2 = this.f288538F.toByteArray();
            } catch (Exception unused) {
            }
            contentValues.put("mmsightextinfo", bArr2);
        }
        if ((this.f288548P & 1) != 0) {
            contentValues.put("preloadsize", Integer.valueOf(this.f288539G));
        }
        if ((this.f288548P & 2) != 0) {
            contentValues.put("videoformat", Integer.valueOf(this.f288540H));
        }
        if (this.f288549Q) {
            contentValues.put("forward_msg_local_id", Long.valueOf(this.f288541I));
        }
        if (this.f288550R) {
            contentValues.put("msg_uuid", this.f288542J);
        }
        if (this.f288551S) {
            contentValues.put("share_app_info", this.f288543K);
        }
        if (this.f288552T) {
            contentValues.put("origin_file_name", this.f288546N);
        }
        if (this.f288553U) {
            if (this.f288547O != 1) {
                z = false;
            }
            contentValues.put("had_clicked_video", Boolean.valueOf(z));
        }
        if (this.f288545M) {
            contentValues.put("media_id", this.f288544L);
        }
        if (!TextUtils.isEmpty(this.f288533A)) {
            contentValues.put("media_flag", this.f288533A);
        }
        if (!TextUtils.isEmpty(this.f288534B)) {
            contentValues.put("video_path", this.f288534B);
        }
        return contentValues;
    }

    /* renamed from: d */
    public String mo137700d() {
        String str = this.f288554a;
        return str == null ? "" : str;
    }

    /* renamed from: e */
    public String mo137701e() {
        String str = this.f288571r;
        return str == null ? "" : str;
    }

    /* renamed from: f */
    public String mo137702f() {
        String str = this.f288574u;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public long mo137703g() {
        return this.f288577x;
    }

    /* renamed from: h */
    public String mo137704h() {
        return this.f288544L;
    }

    /* renamed from: i */
    public String mo137705i() {
        String str = this.f288575v;
        return str == null ? "" : str;
    }

    /* renamed from: j */
    public int mo137706j() {
        return this.f288562i;
    }

    /* renamed from: k */
    public String mo137707k() {
        String str = this.f288570q;
        return str == null ? "" : str;
    }

    /* renamed from: l */
    public int mo137708l() {
        return this.f288540H;
    }

    /* renamed from: m */
    public int mo137709m() {
        return this.f288576w;
    }

    /* renamed from: n */
    public boolean mo137710n() {
        int i = this.f288562i;
        if (i != 199 && i != 199 && i != 143) {
            return false;
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_video_info_error_repair, true) && !TextUtils.isEmpty(this.f288534B) && !TextUtils.isEmpty(this.f288554a) && this.f288554a.contains("sns_table")) {
            if (C86013q1.m106451l(this.f288534B) <= 0) {
                return false;
            }
            return this.f288559f <= 0 || C86013q1.m106451l(this.f288534B) >= ((long) this.f288559f);
        }
    }

    /* renamed from: o */
    public boolean mo137711o() {
        int i = this.f288562i;
        return i == 121 || i == 122 || i == 120 || i == 123;
    }

    /* renamed from: p */
    public boolean mo137712p() {
        int i = this.f288562i;
        return i == 140 || i == 141 || i == 142;
    }

    /* renamed from: q */
    public void mo137713q(int i) {
        this.f288562i = i;
    }

    /* renamed from: r */
    public void mo137714r(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (this.f288535C == null) {
            this.f288535C = new tc4();
        }
        tc4 tc4 = this.f288535C;
        tc4.f299541h = str2;
        tc4.f299538e = i;
        tc4.f299537d = str;
        tc4.f299539f = str3;
        tc4.f299540g = str4;
        tc4.f299543j = str5;
        tc4.f299544n = str6;
    }

    public String toString() {
        return "VideoInfo{fileName='" + this.f288554a + '\'' + ", clientId='" + this.f288555b + '\'' + ", msgSvrId=" + this.f288556c + ", netOffset=" + this.f288557d + ", fileNowSize=" + this.f288558e + ", totalLen=" + this.f288559f + ", thumbNetOffset=" + this.f288560g + ", thumbLen=" + this.f288561h + ", status=" + this.f288562i + ", createTime=" + this.f288563j + ", lastModifyTime=" + this.f288564k + ", priorityTime=" + this.f288565l + ", videoLength=" + this.f288566m + ", msgLocalId=" + this.f288567n + ", netTimes=" + this.f288568o + ", cameraType=" + this.f288569p + ", user='" + this.f288570q + '\'' + ", human='" + this.f288571r + '\'' + ", isExport=" + this.f288572s + ", isUseCdn=" + this.f288573t + ", importPath='" + this.f288574u + '\'' + ", recvXml='" + this.f288575v + '\'' + ", videoFuncFlag=" + this.f288576w + ", massSendId=" + this.f288577x + ", massSendList='" + this.f288578y + '\'' + ", videoMD5='" + this.f288579z + '\'' + ", streamVideoProto=" + this.f288535C + ", statextstr='" + this.f288536D + '\'' + ", downloadScene=" + this.f288537E + ", mmSightExtInfo=" + this.f288538F + ", preloadSize=" + this.f288539G + ", videoFormat=" + this.f288540H + ", flag=" + this.f288548P + ", mediaId=" + this.f288544L + ", videoFlag=" + this.f288533A + ", videoPath=" + this.f288534B + '}';
    }
}
