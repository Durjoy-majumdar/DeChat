package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStatusOperateCliLogStruct */
public final class TextStatusOperateCliLogStruct extends C61103a {

    /* renamed from: d */
    public String f194613d = "";

    /* renamed from: e */
    public long f194614e;

    /* renamed from: f */
    public String f194615f = "";

    /* renamed from: g */
    public long f194616g;

    /* renamed from: h */
    public long f194617h;

    /* renamed from: i */
    public String f194618i = "";

    /* renamed from: j */
    public long f194619j;

    /* renamed from: k */
    public String f194620k = "";

    /* renamed from: l */
    public String f194621l = "";

    /* renamed from: m */
    public String f194622m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22208;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194613d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194614e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194615f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194616g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194617h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194618i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194619j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194620k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194621l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194622m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194613d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194614e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194615f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194616g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllFriendsStatusEntranceStyle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194617h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194618i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReddotType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194619j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostRecomIconID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194620k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194621l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194622m);
        return stringBuffer.toString();
    }
}
