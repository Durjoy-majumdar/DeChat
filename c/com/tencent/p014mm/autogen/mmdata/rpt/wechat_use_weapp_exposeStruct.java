package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct */
public final class wechat_use_weapp_exposeStruct extends C61103a {

    /* renamed from: d */
    public String f310563d = "";

    /* renamed from: e */
    public long f310564e;

    /* renamed from: f */
    public String f310565f = "";

    /* renamed from: g */
    public String f310566g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21777;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310563d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310564e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310565f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310566g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310563d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scene_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310564e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310565f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310566g);
        return stringBuffer.toString();
    }
}
