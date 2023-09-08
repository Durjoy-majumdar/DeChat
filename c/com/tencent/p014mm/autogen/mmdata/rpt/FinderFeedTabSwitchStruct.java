package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFeedTabSwitchStruct */
public final class FinderFeedTabSwitchStruct extends C61103a {

    /* renamed from: d */
    public long f155252d = 0;

    /* renamed from: e */
    public long f155253e;

    /* renamed from: f */
    public long f155254f;

    /* renamed from: g */
    public String f155255g = "";

    /* renamed from: h */
    public String f155256h = "";

    /* renamed from: i */
    public long f155257i;

    /* renamed from: j */
    public long f155258j;

    /* renamed from: k */
    public String f155259k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19949;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155252d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155253e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155254f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155255g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155256h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155257i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155258j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155259k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("fromTab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155252d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toTab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155253e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155254f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155255g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155256h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155257i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ManuallyTapped");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155258j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155259k);
        return stringBuffer.toString();
    }
}
