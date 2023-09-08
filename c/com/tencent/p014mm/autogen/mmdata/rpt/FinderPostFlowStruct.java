package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPostFlowStruct */
public final class FinderPostFlowStruct extends C61103a {

    /* renamed from: d */
    public int f155796d;

    /* renamed from: e */
    public String f155797e = "";

    /* renamed from: f */
    public int f155798f;

    /* renamed from: g */
    public String f155799g = "";

    /* renamed from: h */
    public int f155800h;

    /* renamed from: i */
    public int f155801i;

    /* renamed from: j */
    public String f155802j = "";

    /* renamed from: k */
    public String f155803k = "";

    /* renamed from: l */
    public int f155804l;

    /* renamed from: m */
    public int f155805m;

    /* renamed from: n */
    public int f155806n;

    /* renamed from: j */
    public int mo1004j() {
        return 23825;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155796d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155797e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155798f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155799g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155800h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155801i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155802j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155803k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155804l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155805m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155806n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155796d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FlowId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155797e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StageId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155798f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155799g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Succ");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155800h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("KeyStage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155801i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaInfoJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155802j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CustomInfoJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155803k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155804l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155805m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155806n);
        return stringBuffer.toString();
    }
}
