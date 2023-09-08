package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiWeixinConversionStruct */
public final class AiWeixinConversionStruct extends C61103a {

    /* renamed from: d */
    public long f343642d = 0;

    /* renamed from: e */
    public String f343643e = "";

    /* renamed from: f */
    public long f343644f = 0;

    /* renamed from: g */
    public long f343645g;

    /* renamed from: h */
    public long f343646h = 0;

    /* renamed from: i */
    public long f343647i = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343642d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343643e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343644f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343645g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343646h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343647i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343642d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("usrType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343643e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isTop");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343644f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343645g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sil");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343646h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("unread");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343647i);
        return stringBuffer.toString();
    }
}
