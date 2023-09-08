package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeSportFinderStruct */
public final class WeSportFinderStruct extends C61103a {

    /* renamed from: d */
    public long f48674d;

    /* renamed from: e */
    public long f48675e;

    /* renamed from: f */
    public String f48676f = "";

    /* renamed from: g */
    public long f48677g;

    /* renamed from: h */
    public long f48678h;

    /* renamed from: i */
    public String f48679i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27236;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48674d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48675e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48676f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48677g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48678h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48679i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("pageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48674d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("infoSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48675e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("infoSourceName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48676f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifHasFinder");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48677g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifFinderClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48678h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("viewedUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48679i);
        return stringBuffer.toString();
    }
}
