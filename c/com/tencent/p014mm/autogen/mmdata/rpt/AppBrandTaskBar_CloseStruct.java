package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;
import p172io.flutter.embedding.android.PatchedFlutterActivity;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_CloseStruct */
public final class AppBrandTaskBar_CloseStruct extends C61103a {

    /* renamed from: d */
    public String f194128d = "";

    /* renamed from: e */
    public long f194129e;

    /* renamed from: f */
    public long f194130f;

    /* renamed from: g */
    public long f194131g;

    /* renamed from: h */
    public long f194132h;

    /* renamed from: j */
    public int mo1004j() {
        return 21929;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194128d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194129e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194130f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194131g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194132h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194128d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194129e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("live_duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194130f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(PatchedFlutterActivity.EXTRA_PAGE_TYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194131g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194132h);
        return stringBuffer.toString();
    }
}
