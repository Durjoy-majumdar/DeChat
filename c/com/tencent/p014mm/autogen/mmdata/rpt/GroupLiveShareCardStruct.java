package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct */
public final class GroupLiveShareCardStruct extends C61103a {

    /* renamed from: d */
    public String f156276d = "";

    /* renamed from: e */
    public long f156277e;

    /* renamed from: f */
    public long f156278f;

    /* renamed from: g */
    public long f156279g;

    /* renamed from: h */
    public String f156280h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22469;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156276d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156277e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156278f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156279g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156280h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156276d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReddotType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156277e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156278f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156279g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveIDList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156280h);
        return stringBuffer.toString();
    }
}
