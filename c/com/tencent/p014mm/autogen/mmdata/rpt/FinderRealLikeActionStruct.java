package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRealLikeActionStruct */
public final class FinderRealLikeActionStruct extends C61103a {

    /* renamed from: d */
    public long f155922d;

    /* renamed from: e */
    public String f155923e = "";

    /* renamed from: f */
    public String f155924f = "";

    /* renamed from: g */
    public String f155925g = "";

    /* renamed from: h */
    public String f155926h = "";

    /* renamed from: i */
    public String f155927i = "";

    /* renamed from: j */
    public long f155928j;

    /* renamed from: j */
    public int mo1004j() {
        return 19956;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155922d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155923e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155924f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155925g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155926h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155927i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155928j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155922d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155923e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155924f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155925g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155926h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155927i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155928j);
        return stringBuffer.toString();
    }
}
