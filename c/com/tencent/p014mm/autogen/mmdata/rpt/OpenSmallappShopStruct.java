package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenSmallappShopStruct */
public final class OpenSmallappShopStruct extends C61103a {

    /* renamed from: d */
    public long f156758d;

    /* renamed from: e */
    public long f156759e;

    /* renamed from: f */
    public long f156760f;

    /* renamed from: g */
    public String f156761g = "";

    /* renamed from: h */
    public String f156762h = "";

    /* renamed from: i */
    public String f156763i = "";

    /* renamed from: j */
    public String f156764j = "";

    /* renamed from: k */
    public String f156765k = "";

    /* renamed from: l */
    public String f156766l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21837;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156758d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156759e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156760f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156761g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156762h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156763i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156764j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156765k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156766l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionTS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156758d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156759e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156760f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("setting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156761g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156762h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156763i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156764j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156765k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156766l);
        return stringBuffer.toString();
    }
}
