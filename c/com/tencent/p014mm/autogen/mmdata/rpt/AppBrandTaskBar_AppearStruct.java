package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_AppearStruct */
public final class AppBrandTaskBar_AppearStruct extends C61103a {

    /* renamed from: d */
    public String f69436d = "";

    /* renamed from: e */
    public long f69437e;

    /* renamed from: f */
    public long f69438f;

    /* renamed from: g */
    public long f69439g;

    /* renamed from: h */
    public long f69440h;

    /* renamed from: i */
    public long f69441i;

    /* renamed from: j */
    public long f69442j;

    /* renamed from: k */
    public long f69443k;

    /* renamed from: l */
    public long f69444l;

    /* renamed from: m */
    public long f69445m;

    /* renamed from: n */
    public long f69446n;

    /* renamed from: o */
    public long f69447o;

    /* renamed from: j */
    public int mo1004j() {
        return 21927;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69436d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69437e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69438f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69439g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69440h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69441i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69442j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69443k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69444l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69445m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69446n);
        stringBuffer.append(",");
        stringBuffer.append(this.f69447o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69436d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69437e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("background_status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69438f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("weapp_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69439g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("brand_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69440h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("file_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69441i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("note_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69442j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mpvideo_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finder_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69443k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("live_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69444l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myweapp_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69445m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("music_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69446n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("page");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69447o);
        return stringBuffer.toString();
    }
}
