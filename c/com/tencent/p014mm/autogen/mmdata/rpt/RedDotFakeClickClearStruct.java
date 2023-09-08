package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedDotFakeClickClearStruct */
public final class RedDotFakeClickClearStruct extends C61103a {

    /* renamed from: d */
    public long f156767d;

    /* renamed from: e */
    public long f156768e;

    /* renamed from: f */
    public long f156769f;

    /* renamed from: g */
    public String f156770g = "";

    /* renamed from: h */
    public String f156771h = "";

    /* renamed from: i */
    public long f156772i;

    /* renamed from: j */
    public String f156773j = "";

    /* renamed from: k */
    public String f156774k = "";

    /* renamed from: l */
    public long f156775l;

    /* renamed from: m */
    public String f156776m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20951;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156767d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156768e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156769f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156770g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156771h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156772i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156773j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156774k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156775l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156776m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RedDotCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156767d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156768e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156769f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotTipsID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156770g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156771h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156772i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WhiteListReddotList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156773j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OverwriteRedDotTipsID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156774k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotactiontimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156775l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156776m);
        return stringBuffer.toString();
    }
}
