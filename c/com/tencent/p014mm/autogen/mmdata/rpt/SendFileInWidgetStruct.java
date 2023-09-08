package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct */
public final class SendFileInWidgetStruct extends C61103a {

    /* renamed from: d */
    public long f265847d = 0;

    /* renamed from: e */
    public long f265848e = 0;

    /* renamed from: f */
    public long f265849f = 0;

    /* renamed from: g */
    public long f265850g = 0;

    /* renamed from: h */
    public long f265851h = 0;

    /* renamed from: i */
    public long f265852i = 0;

    /* renamed from: j */
    public long f265853j = 0;

    /* renamed from: k */
    public long f265854k = 0;

    /* renamed from: l */
    public long f265855l = 0;

    /* renamed from: m */
    public long f265856m = 0;

    /* renamed from: n */
    public long f265857n = 0;

    /* renamed from: o */
    public String f265858o = "";

    /* renamed from: p */
    public long f265859p = 0;

    /* renamed from: q */
    public long f265860q = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19359;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265847d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265848e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265849f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265850g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265851h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265852i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265853j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265854k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265855l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265856m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265857n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265858o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265859p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265860q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hasConfirm");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265847d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switchToChat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265848e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switchToFav");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265849f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switchToCloud");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265850g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasClickSearch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265851h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasClickDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265852i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265853j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FavFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265854k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CloudFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265855l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FirstScreenCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265856m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BelowScreenCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265857n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchKeyword");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265858o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switchToAlbum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265859p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265860q);
        return stringBuffer.toString();
    }
}
