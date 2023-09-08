package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct */
public final class CalendarStatisticsStruct extends C61103a {

    /* renamed from: d */
    public long f48234d = 0;

    /* renamed from: e */
    public long f48235e = 0;

    /* renamed from: f */
    public long f48236f = 0;

    /* renamed from: g */
    public long f48237g = 0;

    /* renamed from: h */
    public long f48238h = 0;

    /* renamed from: i */
    public String f48239i = "";

    /* renamed from: j */
    public long f48240j = 0;

    /* renamed from: k */
    public long f48241k = 0;

    /* renamed from: l */
    public long f48242l = 0;

    /* renamed from: m */
    public long f48243m = 0;

    /* renamed from: n */
    public long f48244n = 0;

    /* renamed from: o */
    public String f48245o = "";

    /* renamed from: p */
    public String f48246p = "";

    public CalendarStatisticsStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48234d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48235e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48236f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48237g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48238h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48239i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48240j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48241k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48242l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48243m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48244n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48245o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48246p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48234d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstExposeTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48235e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstExposeCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48236f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48237g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalStayTimeSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48238h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48239i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tipsIdExposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48240j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48241k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterWithRedDotCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48242l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("dropRedDotCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48243m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deepReadCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48244n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTimeSecList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48245o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("vvCountList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48246p);
        return stringBuffer.toString();
    }

    public CalendarStatisticsStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 13) {
                String[] strArr = new String[13];
                Arrays.fill(strArr, 0, 13, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f48234d = mo86051k(split[0]);
            long k = mo86051k(split[1]);
            this.f48235e = k;
            mo86046c("firstExposeTimeMs", k);
            this.f48236f = mo86051k(split[2]);
            this.f48237g = mo86051k(split[3]);
            long k2 = mo86051k(split[4]);
            this.f48238h = k2;
            mo86047d("totalStayTimeSec", k2);
            this.f48239i = mo86045b("lastTipsId", split[5], true);
            this.f48240j = mo86051k(split[6]);
            this.f48241k = mo86051k(split[7]);
            this.f48242l = mo86051k(split[8]);
            this.f48243m = mo86051k(split[9]);
            this.f48244n = mo86051k(split[10]);
            this.f48245o = mo86045b("stayTimeSecList", split[11], true);
            this.f48246p = mo86045b("vvCountList", split[12], true);
        }
    }
}
