package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ForwardHalfPanelReportStruct */
public final class ForwardHalfPanelReportStruct extends C61103a {

    /* renamed from: d */
    public long f156263d = 0;

    /* renamed from: e */
    public long f156264e = 0;

    /* renamed from: f */
    public String f156265f = "";

    /* renamed from: g */
    public long f156266g = 0;

    /* renamed from: h */
    public long f156267h = 0;

    /* renamed from: i */
    public long f156268i = 0;

    /* renamed from: j */
    public String f156269j = "";

    /* renamed from: k */
    public String f156270k = "";

    /* renamed from: l */
    public long f156271l = 0;

    /* renamed from: m */
    public long f156272m = 0;

    /* renamed from: n */
    public String f156273n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24035;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156263d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156264e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156265f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156266g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156267h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156268i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156269j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156270k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156271l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156272m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156273n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("exit_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156263d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Del_count");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156264e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Del_list");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156265f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fastListSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156266g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OneLineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156267h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156268i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156269j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerAppMsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156270k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156271l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LogVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156272m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156273n);
        return stringBuffer.toString();
    }
}
