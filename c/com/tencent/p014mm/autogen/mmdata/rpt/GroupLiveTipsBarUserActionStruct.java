package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveTipsBarUserActionStruct */
public final class GroupLiveTipsBarUserActionStruct extends C61103a {

    /* renamed from: d */
    public String f194217d = "";

    /* renamed from: e */
    public long f194218e;

    /* renamed from: f */
    public String f194219f = "";

    /* renamed from: g */
    public long f194220g;

    /* renamed from: h */
    public long f194221h;

    /* renamed from: i */
    public int f194222i;

    /* renamed from: j */
    public int mo1004j() {
        return 21876;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194217d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194218e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194219f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194220g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194221h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194222i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194217d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LivesCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194218e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionToLiveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194219f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194220g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194221h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsReddotShining");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194222i);
        return stringBuffer.toString();
    }
}
