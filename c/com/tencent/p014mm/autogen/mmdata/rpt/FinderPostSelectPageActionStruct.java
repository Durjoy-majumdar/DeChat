package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct */
public final class FinderPostSelectPageActionStruct extends C61103a {

    /* renamed from: d */
    public String f155817d = "";

    /* renamed from: e */
    public String f155818e = "";

    /* renamed from: f */
    public long f155819f;

    /* renamed from: g */
    public long f155820g;

    /* renamed from: h */
    public long f155821h;

    /* renamed from: j */
    public int mo1004j() {
        return 21149;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155817d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155818e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155819f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155820g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155821h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155817d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155818e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155819f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155820g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155821h);
        return stringBuffer.toString();
    }
}
