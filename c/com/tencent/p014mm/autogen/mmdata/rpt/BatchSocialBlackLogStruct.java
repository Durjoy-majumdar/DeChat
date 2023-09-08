package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct */
public final class BatchSocialBlackLogStruct extends C61103a {

    /* renamed from: d */
    public long f9633d;

    /* renamed from: e */
    public long f9634e;

    /* renamed from: f */
    public long f9635f;

    /* renamed from: g */
    public String f9636g = "";

    /* renamed from: h */
    public long f9637h;

    /* renamed from: i */
    public long f9638i;

    /* renamed from: j */
    public long f9639j;

    /* renamed from: k */
    public String f9640k = "";

    /* renamed from: l */
    public String f9641l = "";

    /* renamed from: m */
    public long f9642m;

    /* renamed from: n */
    public String f9643n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19824;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9633d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9634e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9635f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9636g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9637h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9638i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9639j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9640k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9641l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9642m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9643n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actioncode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9633d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selectfriendnum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9634e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("modifiedsucfriendnum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9635f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("modifiedsucfriendlist");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9636g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("beforsocialblackfriendnum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9637h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("aftersocialblackfriendnum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9638i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionnum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9639j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selecttagname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9640k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selecttagid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9641l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("staytime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9642m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9643n);
        return stringBuffer.toString();
    }
}
