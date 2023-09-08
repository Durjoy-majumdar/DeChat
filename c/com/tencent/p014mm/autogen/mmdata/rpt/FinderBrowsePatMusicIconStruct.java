package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBrowsePatMusicIconStruct */
public final class FinderBrowsePatMusicIconStruct extends C61103a {

    /* renamed from: d */
    public String f155083d = "";

    /* renamed from: e */
    public long f155084e;

    /* renamed from: f */
    public long f155085f;

    /* renamed from: g */
    public long f155086g;

    /* renamed from: j */
    public int mo1004j() {
        return 21345;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155083d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155084e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155085f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155086g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155083d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155084e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155085f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Followcount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155086g);
        return stringBuffer.toString();
    }
}
