package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MMBizExcerptsOpReportStruct */
public final class MMBizExcerptsOpReportStruct extends C61103a {

    /* renamed from: d */
    public long f48536d = 0;

    /* renamed from: e */
    public long f48537e = 0;

    /* renamed from: f */
    public long f48538f = 0;

    /* renamed from: g */
    public long f48539g = 0;

    /* renamed from: h */
    public long f48540h = 0;

    /* renamed from: i */
    public String f48541i = "";

    /* renamed from: j */
    public long f48542j = 0;

    /* renamed from: k */
    public long f48543k = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 28138;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48536d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48537e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48538f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48539g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48540h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48541i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48542j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48543k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BizUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48536d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppMsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48537e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemIdx");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48538f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("beginOffset");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48539g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("endOffet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48540h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("content_md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48541i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48542j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48543k);
        return stringBuffer.toString();
    }
}
