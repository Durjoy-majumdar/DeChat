package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UploadVideoInfoStruct */
public final class UploadVideoInfoStruct extends C61103a {

    /* renamed from: A */
    public long f79191A = 0;

    /* renamed from: B */
    public String f79192B = "";

    /* renamed from: C */
    public long f79193C = 0;

    /* renamed from: D */
    public String f79194D = "";

    /* renamed from: E */
    public long f79195E = 0;

    /* renamed from: F */
    public long f79196F = 0;

    /* renamed from: d */
    public String f79197d = "";

    /* renamed from: e */
    public String f79198e = "";

    /* renamed from: f */
    public int f79199f = 0;

    /* renamed from: g */
    public String f79200g = "";

    /* renamed from: h */
    public String f79201h = "";

    /* renamed from: i */
    public String f79202i = "";

    /* renamed from: j */
    public long f79203j = 0;

    /* renamed from: k */
    public long f79204k = 0;

    /* renamed from: l */
    public long f79205l = 0;

    /* renamed from: m */
    public long f79206m = 0;

    /* renamed from: n */
    public long f79207n = 0;

    /* renamed from: o */
    public long f79208o = 0;

    /* renamed from: p */
    public long f79209p = 0;

    /* renamed from: q */
    public long f79210q = 0;

    /* renamed from: r */
    public long f79211r = 0;

    /* renamed from: s */
    public int f79212s = 0;

    /* renamed from: t */
    public long f79213t = 0;

    /* renamed from: u */
    public long f79214u = 0;

    /* renamed from: v */
    public long f79215v = 0;

    /* renamed from: w */
    public long f79216w = 0;

    /* renamed from: x */
    public long f79217x = 0;

    /* renamed from: y */
    public long f79218y = 0;

    /* renamed from: z */
    public long f79219z = 0;

    public UploadVideoInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 13794;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79197d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79198e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79199f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79200g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79201h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79202i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79203j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79204k);
        stringBuffer.append(",");
        stringBuffer.append(this.f79205l);
        stringBuffer.append(",");
        stringBuffer.append(this.f79206m);
        stringBuffer.append(",");
        stringBuffer.append(this.f79207n);
        stringBuffer.append(",");
        stringBuffer.append(this.f79208o);
        stringBuffer.append(",");
        stringBuffer.append(this.f79209p);
        stringBuffer.append(",");
        stringBuffer.append(this.f79210q);
        stringBuffer.append(",");
        stringBuffer.append(this.f79211r);
        stringBuffer.append(",");
        stringBuffer.append(this.f79212s);
        stringBuffer.append(",");
        stringBuffer.append(this.f79213t);
        stringBuffer.append(",");
        stringBuffer.append(this.f79214u);
        stringBuffer.append(",");
        stringBuffer.append(this.f79215v);
        stringBuffer.append(",");
        stringBuffer.append(this.f79216w);
        stringBuffer.append(",");
        stringBuffer.append(this.f79217x);
        stringBuffer.append(",");
        stringBuffer.append(this.f79218y);
        stringBuffer.append(",");
        stringBuffer.append(this.f79219z);
        stringBuffer.append(",");
        stringBuffer.append(this.f79191A);
        stringBuffer.append(",");
        stringBuffer.append(this.f79192B);
        stringBuffer.append(",");
        stringBuffer.append(this.f79193C);
        stringBuffer.append(",");
        stringBuffer.append(this.f79194D);
        stringBuffer.append(",");
        stringBuffer.append(this.f79195E);
        stringBuffer.append(",");
        stringBuffer.append(this.f79196F);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ToUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79197d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79198e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79199f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FieldId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79200g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79201h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsInfoId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79202i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79203j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79204k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79205l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79206m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalVideoBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79207n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalAudioBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79208o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79209p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79210q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79211r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79212s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79213t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79214u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpVideoBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79215v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpAudioiBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79216w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79217x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79218y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79219z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79191A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNIp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79192B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalAudioChannel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79193C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79194D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("upload_speed");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79195E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("upload_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79196F);
        return stringBuffer.toString();
    }

    public UploadVideoInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 29) {
                String[] strArr = new String[29];
                Arrays.fill(strArr, 0, 29, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f79197d = mo86045b("ToUser", split[0], true);
            this.f79198e = mo86045b("MsgSource", split[1], true);
            this.f79199f = Util.getInt(split[2], 0);
            this.f79200g = mo86045b("FieldId", split[3], true);
            this.f79201h = mo86045b("NewMd5", split[4], true);
            this.f79202i = mo86045b("SnsInfoId", split[5], true);
            this.f79203j = mo86051k(split[6]);
            this.f79204k = mo86051k(split[7]);
            this.f79205l = mo86051k(split[8]);
            this.f79206m = mo86051k(split[9]);
            this.f79207n = mo86051k(split[10]);
            this.f79208o = mo86051k(split[11]);
            this.f79209p = mo86051k(split[12]);
            this.f79210q = mo86051k(split[13]);
            this.f79211r = mo86051k(split[14]);
            this.f79212s = Util.getInt(split[15], 0);
            this.f79213t = mo86051k(split[16]);
            this.f79214u = mo86051k(split[17]);
            this.f79215v = mo86051k(split[18]);
            this.f79216w = mo86051k(split[19]);
            this.f79217x = mo86051k(split[20]);
            this.f79218y = mo86051k(split[21]);
            this.f79219z = mo86051k(split[22]);
            this.f79191A = mo86051k(split[23]);
            this.f79192B = mo86045b("CDNIp", split[24], true);
            this.f79193C = mo86051k(split[25]);
            this.f79194D = mo86045b("SnsUrl", split[26], true);
            this.f79195E = mo86051k(split[27]);
            this.f79196F = mo86051k(split[28]);
        }
    }
}
