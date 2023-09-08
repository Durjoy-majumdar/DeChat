package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct */
public final class AiWeixinGpsInfoStruct extends C61103a {

    /* renamed from: d */
    public long f343648d = 0;

    /* renamed from: e */
    public long f343649e = 0;

    /* renamed from: f */
    public long f343650f = 0;

    /* renamed from: g */
    public String f343651g = "";

    /* renamed from: h */
    public String f343652h = "";

    public AiWeixinGpsInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343648d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343649e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343650f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343651g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343652h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lastGpsScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343648d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastGpsTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343649e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastPre");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343650f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("longitude");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343651g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("latitude");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343652h);
        return stringBuffer.toString();
    }

    public AiWeixinGpsInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 5) {
                String[] strArr = new String[5];
                Arrays.fill(strArr, 0, 5, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f343648d = mo86051k(split[0]);
            long k = mo86051k(split[1]);
            this.f343649e = k;
            mo86046c("lastGpsTimeMs", k);
            this.f343650f = mo86051k(split[2]);
            this.f343651g = mo86045b("longitude", split[3], true);
            this.f343652h = mo86045b("latitude", split[4], true);
        }
    }
}
