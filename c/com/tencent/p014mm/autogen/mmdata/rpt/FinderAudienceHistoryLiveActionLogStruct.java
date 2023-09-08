package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderAudienceHistoryLiveActionLogStruct */
public final class FinderAudienceHistoryLiveActionLogStruct extends C61103a {

    /* renamed from: d */
    public String f155071d = "";

    /* renamed from: e */
    public long f155072e;

    /* renamed from: f */
    public String f155073f = "";

    /* renamed from: g */
    public String f155074g = "";

    /* renamed from: h */
    public String f155075h = "";

    /* renamed from: i */
    public long f155076i;

    /* renamed from: j */
    public int mo1004j() {
        return 23432;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155071d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155072e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155073f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155074g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155075h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155076i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionts");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155071d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155072e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155073f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155074g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155075h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionts_new");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155076i);
        return stringBuffer.toString();
    }
}
