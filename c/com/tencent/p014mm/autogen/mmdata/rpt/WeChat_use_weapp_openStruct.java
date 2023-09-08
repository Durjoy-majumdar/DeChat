package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct */
public final class WeChat_use_weapp_openStruct extends C61103a {

    /* renamed from: d */
    public String f310543d = "";

    /* renamed from: e */
    public long f310544e;

    /* renamed from: f */
    public long f310545f;

    /* renamed from: g */
    public long f310546g;

    /* renamed from: h */
    public long f310547h;

    /* renamed from: i */
    public String f310548i = "";

    /* renamed from: j */
    public String f310549j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21775;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310543d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310544e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310545f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310546g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310547h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310548i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310549j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310543d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310544e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scene_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310545f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_sum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310546g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310547h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310548i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310549j);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public WeChat_use_weapp_openStruct mo148158s(String str) {
        this.f310543d = mo86045b("session", str, true);
        return this;
    }
}
