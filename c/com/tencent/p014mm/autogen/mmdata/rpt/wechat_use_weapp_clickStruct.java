package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct */
public final class wechat_use_weapp_clickStruct extends C61103a {

    /* renamed from: d */
    public String f310558d = "";

    /* renamed from: e */
    public long f310559e;

    /* renamed from: f */
    public long f310560f;

    /* renamed from: g */
    public String f310561g = "";

    /* renamed from: h */
    public String f310562h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21776;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310558d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310559e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310560f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310561g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310562h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310558d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_sum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310559e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310560f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_ID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310561g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310562h);
        return stringBuffer.toString();
    }
}
