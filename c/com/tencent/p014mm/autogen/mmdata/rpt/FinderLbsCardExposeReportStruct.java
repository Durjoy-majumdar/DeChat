package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct */
public final class FinderLbsCardExposeReportStruct extends C61103a {

    /* renamed from: d */
    public String f9829d = "";

    /* renamed from: e */
    public String f9830e = "";

    /* renamed from: f */
    public String f9831f = "";

    /* renamed from: g */
    public String f9832g = "";

    /* renamed from: h */
    public long f9833h;

    /* renamed from: i */
    public String f9834i = "";

    /* renamed from: j */
    public long f9835j;

    /* renamed from: k */
    public long f9836k;

    /* renamed from: l */
    public String f9837l = "";

    /* renamed from: m */
    public String f9838m = "";

    /* renamed from: n */
    public long f9839n;

    /* renamed from: o */
    public long f9840o;

    /* renamed from: p */
    public long f9841p;

    /* renamed from: q */
    public String f9842q = "";

    /* renamed from: r */
    public long f9843r;

    /* renamed from: s */
    public long f9844s;

    /* renamed from: t */
    public long f9845t;

    /* renamed from: u */
    public long f9846u;

    /* renamed from: v */
    public String f9847v = "";

    /* renamed from: w */
    public String f9848w = "";

    /* renamed from: x */
    public String f9849x = "";

    public FinderLbsCardExposeReportStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 21567;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9829d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9830e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9831f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9832g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9833h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9834i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9835j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9836k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9837l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9838m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9839n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9840o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9841p);
        stringBuffer.append(",");
        stringBuffer.append(this.f9842q);
        stringBuffer.append(",");
        stringBuffer.append(this.f9843r);
        stringBuffer.append(",");
        stringBuffer.append(this.f9844s);
        stringBuffer.append(",");
        stringBuffer.append(this.f9845t);
        stringBuffer.append(",");
        stringBuffer.append(this.f9846u);
        stringBuffer.append(",");
        stringBuffer.append(this.f9847v);
        stringBuffer.append(",");
        stringBuffer.append(this.f9848w);
        stringBuffer.append(",");
        stringBuffer.append(this.f9849x);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9829d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9830e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9831f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("refreshTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9832g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9833h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9834i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9835j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9836k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardTag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9837l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9838m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9839n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardStartExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9840o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardEndExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9841p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9842q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9843r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9844s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedStartExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9845t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedEndExposeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9846u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9847v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9848w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lng");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9849x);
        return stringBuffer.toString();
    }

    public FinderLbsCardExposeReportStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 21) {
                String[] strArr = new String[21];
                Arrays.fill(strArr, 0, 21, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f9829d = mo86045b("sessionid", split[0], true);
            this.f9830e = mo86045b("contextid", split[1], true);
            this.f9831f = mo86045b("clickTabContextId", split[2], true);
            this.f9832g = mo86045b("refreshTime", split[3], true);
            this.f9833h = mo86051k(split[4]);
            this.f9834i = mo86045b("cardid", split[5], true);
            this.f9835j = mo86051k(split[6]);
            this.f9836k = mo86051k(split[7]);
            this.f9837l = mo86045b("cardTag", split[8], true);
            this.f9838m = mo86045b("cardStatus", split[9], true);
            this.f9839n = mo86051k(split[10]);
            this.f9840o = mo86051k(split[11]);
            this.f9841p = mo86051k(split[12]);
            this.f9842q = mo86045b("feedid", split[13], true);
            this.f9843r = mo86051k(split[14]);
            this.f9844s = mo86051k(split[15]);
            this.f9845t = mo86051k(split[16]);
            this.f9846u = mo86051k(split[17]);
            this.f9847v = mo86045b("SessionBuffer", split[18], true);
            this.f9848w = mo86045b("lat", split[19], true);
            this.f9849x = mo86045b("lng", split[20], true);
        }
    }
}
