package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderHotSearchClickStruct */
public final class FinderHotSearchClickStruct extends C61103a {

    /* renamed from: d */
    public String f155350d = "";

    /* renamed from: e */
    public String f155351e = "";

    /* renamed from: f */
    public int f155352f;

    /* renamed from: g */
    public String f155353g = "";

    /* renamed from: h */
    public int f155354h;

    /* renamed from: i */
    public int f155355i;

    /* renamed from: j */
    public int f155356j;

    /* renamed from: k */
    public int f155357k;

    /* renamed from: l */
    public String f155358l = "";

    /* renamed from: m */
    public String f155359m = "";

    /* renamed from: n */
    public String f155360n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22080;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155350d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155351e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155352f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155353g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155354h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155355i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155356j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155357k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155358l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155359m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155360n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155350d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155351e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155352f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155353g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155354h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155355i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155356j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155357k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reasonId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155358l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hotWordId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155359m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155360n);
        return stringBuffer.toString();
    }
}
