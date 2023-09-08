package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavCacheStruct */
public final class FavCacheStruct extends C61103a {

    /* renamed from: d */
    public long f265518d;

    /* renamed from: e */
    public long f265519e;

    /* renamed from: f */
    public long f265520f;

    /* renamed from: g */
    public long f265521g = 0;

    /* renamed from: h */
    public long f265522h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18053;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265518d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265519e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265520f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265521g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265522h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("favid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265518d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("favsize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265519e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cachecnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265520f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cachelsize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265521g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cachesuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265522h);
        return stringBuffer.toString();
    }
}
