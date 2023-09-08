package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UserProfileItemClickLogStruct */
public final class UserProfileItemClickLogStruct extends C61103a {

    /* renamed from: d */
    public long f194643d = 0;

    /* renamed from: e */
    public long f194644e = 0;

    /* renamed from: f */
    public long f194645f = 0;

    /* renamed from: g */
    public String f194646g = "";

    /* renamed from: h */
    public int f194647h = -1;

    /* renamed from: i */
    public String f194648i = "";

    /* renamed from: j */
    public long f194649j;

    /* renamed from: k */
    public long f194650k;

    /* renamed from: l */
    public long f194651l;

    /* renamed from: m */
    public long f194652m;

    /* renamed from: n */
    public long f194653n;

    /* renamed from: j */
    public int mo1004j() {
        return 16055;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194643d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194644e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194645f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194646g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194647h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194648i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194649j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194650k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194651l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194652m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194653n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194643d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194644e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194645f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194646g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194647h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TextStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194648i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194649j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasSns");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194650k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasFinder");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194651l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasSignature");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194652m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserGender");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194653n);
        return stringBuffer.toString();
    }
}
