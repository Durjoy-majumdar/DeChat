package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AddDeleteStruct */
public final class AppBrandTaskBar_Feed_AddDeleteStruct extends C61103a {

    /* renamed from: d */
    public String f69454d = "";

    /* renamed from: e */
    public String f69455e = "";

    /* renamed from: f */
    public long f69456f;

    /* renamed from: g */
    public long f69457g;

    /* renamed from: h */
    public String f69458h = "";

    /* renamed from: i */
    public long f69459i;

    /* renamed from: j */
    public long f69460j;

    /* renamed from: k */
    public long f69461k;

    /* renamed from: l */
    public long f69462l;

    /* renamed from: j */
    public int mo1004j() {
        return 21926;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69454d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69455e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69456f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69457g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69458h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69459i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69460j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69461k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69462l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69454d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69455e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action_channel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69456f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.CONTENT_TYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69457g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("content_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69458h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("live_duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69459i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69460j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("index_from");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69461k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("index_to");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69462l);
        return stringBuffer.toString();
    }
}
