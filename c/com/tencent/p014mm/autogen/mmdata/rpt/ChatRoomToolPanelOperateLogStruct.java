package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct */
public final class ChatRoomToolPanelOperateLogStruct extends C61103a {

    /* renamed from: d */
    public String f194158d = "";

    /* renamed from: e */
    public long f194159e;

    /* renamed from: f */
    public long f194160f;

    /* renamed from: g */
    public long f194161g = 0;

    /* renamed from: h */
    public long f194162h = 0;

    /* renamed from: i */
    public String f194163i = "";

    /* renamed from: j */
    public String f194164j = "";

    /* renamed from: k */
    public long f194165k = 0;

    /* renamed from: l */
    public String f194166l = "";

    /* renamed from: m */
    public String f194167m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19436;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194158d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194159e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194160f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194161g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194162h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194163i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194164j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194165k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194166l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194167m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomusrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194158d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194159e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194160f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("usedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194161g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194162h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194163i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194164j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isTop");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194165k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topAppList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194166l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("usedAppList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194167m);
        return stringBuffer.toString();
    }
}
