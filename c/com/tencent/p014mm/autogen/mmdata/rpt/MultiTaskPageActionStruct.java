package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskPageActionStruct */
public final class MultiTaskPageActionStruct extends C61103a {

    /* renamed from: d */
    public long f343780d;

    /* renamed from: e */
    public String f343781e = "";

    /* renamed from: f */
    public long f343782f;

    /* renamed from: g */
    public long f343783g;

    /* renamed from: h */
    public long f343784h;

    /* renamed from: i */
    public long f343785i;

    /* renamed from: j */
    public long f343786j;

    /* renamed from: k */
    public long f343787k;

    /* renamed from: j */
    public int mo1004j() {
        return 21920;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343780d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343781e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343782f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343783g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343784h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343785i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343786j);
        stringBuffer.append(",");
        stringBuffer.append(this.f343787k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343780d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343781e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343782f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343783g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FullScreen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343784h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TaskCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343785i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343786j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterChatting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343787k);
        return stringBuffer.toString();
    }
}
