package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveSessionExposeStruct */
public final class GroupLiveSessionExposeStruct extends C61103a {

    /* renamed from: d */
    public String f194211d = "";

    /* renamed from: e */
    public long f194212e;

    /* renamed from: f */
    public long f194213f;

    /* renamed from: g */
    public long f194214g;

    /* renamed from: h */
    public String f194215h = "";

    /* renamed from: i */
    public long f194216i;

    /* renamed from: j */
    public int mo1004j() {
        return 21799;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194211d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194212e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194213f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194214g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194215h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194216i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194211d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReddotType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194212e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194213f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194214g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveIDList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194215h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomIsMute");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194216i);
        return stringBuffer.toString();
    }
}
