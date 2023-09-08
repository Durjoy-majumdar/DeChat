package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct */
public final class FinderLiveStreamStruct extends C61103a {

    /* renamed from: d */
    public String f155694d = "";

    /* renamed from: e */
    public String f155695e = "";

    /* renamed from: f */
    public int f155696f;

    /* renamed from: g */
    public String f155697g = "";

    /* renamed from: h */
    public long f155698h;

    /* renamed from: i */
    public long f155699i;

    /* renamed from: j */
    public String f155700j = "";

    /* renamed from: k */
    public long f155701k;

    /* renamed from: l */
    public String f155702l = "";

    /* renamed from: m */
    public String f155703m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21017;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155694d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155695e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155696f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155697g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155698h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155699i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155700j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155701k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155702l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155703m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinderUsrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155694d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderWxAppInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155695e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPrivate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155696f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155697g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155698h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155699i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155700j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155701k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConnectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConnectDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155702l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Params");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155703m);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderLiveStreamStruct mo76264s(String str) {
        this.f155700j = mo86045b("ActionJson", str, true);
        return this;
    }
}
