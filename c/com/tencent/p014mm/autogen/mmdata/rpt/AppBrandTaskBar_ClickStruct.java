package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;
import p172io.flutter.embedding.android.PatchedFlutterActivity;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_ClickStruct */
public final class AppBrandTaskBar_ClickStruct extends C61103a {

    /* renamed from: d */
    public String f69448d = "";

    /* renamed from: e */
    public long f69449e;

    /* renamed from: f */
    public long f69450f;

    /* renamed from: g */
    public String f69451g = "";

    /* renamed from: h */
    public long f69452h;

    /* renamed from: i */
    public String f69453i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21931;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69448d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69449e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69450f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69451g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69452h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69453i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69448d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(PatchedFlutterActivity.EXTRA_PAGE_TYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69449e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page_feed_index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69450f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("content_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69451g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69452h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("icon_appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69453i);
        return stringBuffer.toString();
    }
}
