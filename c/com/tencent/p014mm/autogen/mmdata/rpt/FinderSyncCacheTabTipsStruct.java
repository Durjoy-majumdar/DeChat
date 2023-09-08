package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSyncCacheTabTipsStruct */
public final class FinderSyncCacheTabTipsStruct extends C61103a {

    /* renamed from: d */
    public String f48474d = "";

    /* renamed from: e */
    public String f48475e = "";

    /* renamed from: f */
    public int f48476f;

    /* renamed from: g */
    public int f48477g;

    /* renamed from: j */
    public int mo1004j() {
        return 22823;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48474d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48475e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48476f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48477g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48474d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48475e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48476f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48477g);
        return stringBuffer.toString();
    }
}
