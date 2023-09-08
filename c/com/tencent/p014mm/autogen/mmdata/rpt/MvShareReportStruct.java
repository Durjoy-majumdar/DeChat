package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvShareReportStruct */
public final class MvShareReportStruct extends C61103a {

    /* renamed from: d */
    public String f156663d = "";

    /* renamed from: e */
    public String f156664e = "";

    /* renamed from: f */
    public String f156665f = "";

    /* renamed from: g */
    public String f156666g = "";

    /* renamed from: h */
    public String f156667h = "";

    /* renamed from: i */
    public long f156668i;

    /* renamed from: j */
    public String f156669j = "";

    /* renamed from: k */
    public String f156670k = "";

    /* renamed from: l */
    public String f156671l = "";

    /* renamed from: m */
    public String f156672m = "";

    /* renamed from: n */
    public long f156673n;

    /* renamed from: o */
    public String f156674o = "";

    /* renamed from: p */
    public String f156675p = "";

    /* renamed from: q */
    public long f156676q;

    /* renamed from: r */
    public long f156677r;

    /* renamed from: j */
    public int mo1004j() {
        return 22233;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156663d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156664e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156665f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156666g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156667h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156668i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156669j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156670k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156671l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156672m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156673n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156674o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156675p);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156676q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156677r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156663d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156664e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156665f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156666g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156667h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156668i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156669j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156670k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvUserId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156671l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156672m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156673n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromSourceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156674o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156675p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewSDK");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareMusicType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156676q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareButton");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156677r);
        return stringBuffer.toString();
    }
}
