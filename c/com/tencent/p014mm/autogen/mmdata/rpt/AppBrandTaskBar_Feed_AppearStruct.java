package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;
import p172io.flutter.embedding.android.PatchedFlutterActivity;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_Feed_AppearStruct */
public final class AppBrandTaskBar_Feed_AppearStruct extends C61103a {

    /* renamed from: d */
    public String f69463d = "";

    /* renamed from: e */
    public long f69464e;

    /* renamed from: f */
    public long f69465f;

    /* renamed from: g */
    public String f69466g = "";

    /* renamed from: h */
    public long f69467h;

    /* renamed from: i */
    public String f69468i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21930;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69463d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69464e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69465f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69466g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69467h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69468i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69463d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exp_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69464e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(PatchedFlutterActivity.EXTRA_PAGE_TYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69465f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("conent_list");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69466g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("content_status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69467h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("icon_appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69468i);
        return stringBuffer.toString();
    }
}
