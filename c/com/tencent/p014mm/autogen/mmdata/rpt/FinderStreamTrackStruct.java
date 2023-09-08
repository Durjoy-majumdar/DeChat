package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct */
public final class FinderStreamTrackStruct extends C61103a {

    /* renamed from: d */
    public int f156107d;

    /* renamed from: e */
    public long f156108e = -1;

    /* renamed from: f */
    public String f156109f = "";

    /* renamed from: g */
    public String f156110g = "";

    /* renamed from: h */
    public int f156111h = -1;

    /* renamed from: i */
    public String f156112i = "";

    /* renamed from: j */
    public long f156113j;

    /* renamed from: k */
    public String f156114k = "";

    /* renamed from: l */
    public long f156115l = -1;

    /* renamed from: m */
    public long f156116m = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 22138;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156107d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156108e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156109f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156110g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156111h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156112i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156113j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156114k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156115l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156116m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("innerversion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156107d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156108e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156109f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156110g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156111h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resultExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156112i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156113j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("snn");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156114k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156115l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156116m);
        return stringBuffer.toString();
    }
}
