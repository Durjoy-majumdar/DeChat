package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireActiveStruct */
public final class SolitaireActiveStruct extends C61103a {

    /* renamed from: d */
    public String f194429d = "";

    /* renamed from: e */
    public String f194430e = "";

    /* renamed from: f */
    public String f194431f = "";

    /* renamed from: g */
    public long f194432g = 0;

    /* renamed from: h */
    public long f194433h = 0;

    /* renamed from: i */
    public long f194434i = 0;

    /* renamed from: j */
    public long f194435j = 0;

    /* renamed from: k */
    public long f194436k = 0;

    /* renamed from: l */
    public String f194437l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18244;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194429d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194430e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194431f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194432g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194433h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194434i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194435j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194436k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194437l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194429d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LaunchUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194430e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194431f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionSvrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194432g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasHeader");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194433h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasTail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194434i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasExample");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194435j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActiveScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194436k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194437l);
        return stringBuffer.toString();
    }
}
