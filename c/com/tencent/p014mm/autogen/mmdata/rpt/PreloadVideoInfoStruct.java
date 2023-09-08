package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PreloadVideoInfoStruct */
public final class PreloadVideoInfoStruct extends C61103a {

    /* renamed from: d */
    public long f265776d = 0;

    /* renamed from: e */
    public long f265777e = 0;

    /* renamed from: f */
    public long f265778f = 0;

    /* renamed from: g */
    public String f265779g = "";

    /* renamed from: h */
    public long f265780h = 0;

    /* renamed from: i */
    public int f265781i = 0;

    /* renamed from: j */
    public long f265782j = 0;

    /* renamed from: k */
    public String f265783k = "";

    /* renamed from: l */
    public String f265784l = "";

    /* renamed from: m */
    public String f265785m = "";

    /* renamed from: n */
    public long f265786n = 0;

    /* renamed from: o */
    public String f265787o = "";

    /* renamed from: p */
    public String f265788p = "";

    /* renamed from: q */
    public String f265789q = "";

    /* renamed from: r */
    public int f265790r;

    /* renamed from: s */
    public String f265791s = "";

    public PreloadVideoInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 14499;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265776d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265777e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265778f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265779g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265780h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265781i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265782j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265783k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265784l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265785m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265786n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265787o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265788p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265789q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265790r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265791s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DownloadStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265776d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265777e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265778f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265779g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265780h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadSpeed");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265781i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HadFinishSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265782j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNIp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265783k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265784l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Session");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265785m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatroomNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265786n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265787o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265788p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Publishid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265789q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BackSourceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265790r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoColdRuleExptGroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265791s);
        return stringBuffer.toString();
    }

    public PreloadVideoInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 16) {
                String[] strArr = new String[16];
                Arrays.fill(strArr, 0, 16, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265776d = mo86051k(split[0]);
            this.f265777e = mo86051k(split[1]);
            this.f265778f = mo86051k(split[2]);
            this.f265779g = mo86045b("NewMd5", split[3], true);
            this.f265780h = mo86051k(split[4]);
            this.f265781i = Util.getInt(split[5], 0);
            this.f265782j = mo86051k(split[6]);
            this.f265783k = mo86045b("CDNIp", split[7], true);
            this.f265784l = mo86045b("FromUser", split[8], true);
            this.f265785m = mo86045b("Session", split[9], true);
            this.f265786n = mo86051k(split[10]);
            this.f265787o = mo86045b("FileId", split[11], true);
            this.f265788p = mo86045b("SnsUrl", split[12], true);
            this.f265789q = mo86045b("Publishid", split[13], true);
            this.f265790r = Util.getInt(split[14], 0);
            this.f265791s = mo86045b("VideoColdRuleExptGroupId", split[15], true);
        }
    }
}
