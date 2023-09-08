package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.KBInvokeWechatStruct */
public final class KBInvokeWechatStruct extends C61103a {

    /* renamed from: d */
    public long f48521d;

    /* renamed from: e */
    public long f48522e;

    /* renamed from: f */
    public String f48523f = "";

    /* renamed from: g */
    public String f48524g = "";

    /* renamed from: h */
    public String f48525h = "";

    /* renamed from: i */
    public String f48526i = "";

    /* renamed from: j */
    public String f48527j = "";

    /* renamed from: k */
    public String f48528k = "";

    /* renamed from: l */
    public String f48529l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25573;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48521d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48522e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48523f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48524g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48525h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48526i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48527j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48528k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48529l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48521d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48522e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentTitle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48523f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48524g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48525h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48526i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiProductID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48527j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48528k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48529l);
        return stringBuffer.toString();
    }
}
