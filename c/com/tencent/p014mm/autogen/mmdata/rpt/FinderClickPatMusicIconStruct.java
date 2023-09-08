package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderClickPatMusicIconStruct */
public final class FinderClickPatMusicIconStruct extends C61103a {

    /* renamed from: d */
    public long f155137d;

    /* renamed from: e */
    public long f155138e;

    /* renamed from: f */
    public long f155139f;

    /* renamed from: g */
    public long f155140g;

    /* renamed from: h */
    public long f155141h;

    /* renamed from: j */
    public int mo1004j() {
        return 21077;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155137d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155138e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155139f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155140g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155141h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickTimestamps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155137d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155138e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Outcome");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155139f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155140g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Followcount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155141h);
        return stringBuffer.toString();
    }
}
