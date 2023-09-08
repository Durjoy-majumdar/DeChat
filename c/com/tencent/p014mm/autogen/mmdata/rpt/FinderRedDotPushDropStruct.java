package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct */
public final class FinderRedDotPushDropStruct extends C61103a {

    /* renamed from: d */
    public long f155974d;

    /* renamed from: e */
    public String f155975e = "";

    /* renamed from: f */
    public String f155976f = "";

    /* renamed from: g */
    public String f155977g = "";

    /* renamed from: h */
    public String f155978h = "";

    /* renamed from: i */
    public String f155979i = "";

    /* renamed from: j */
    public String f155980j = "";

    /* renamed from: k */
    public String f155981k = "";

    /* renamed from: l */
    public long f155982l;

    /* renamed from: m */
    public String f155983m = "";

    /* renamed from: n */
    public String f155984n = "";

    /* renamed from: o */
    public long f155985o;

    /* renamed from: p */
    public String f155986p = "";

    /* renamed from: q */
    public long f155987q;

    /* renamed from: j */
    public int mo1004j() {
        return 23587;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155974d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155975e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155976f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155977g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155978h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155979i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155980j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155981k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155982l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155983m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155984n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155985o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155986p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155987q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RedDotCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155974d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotTipsID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155975e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155976f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoParentPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155977g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155978h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("objectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155979i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155980j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportExtInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155981k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155982l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155983m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155984n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155985o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155986p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_REASON);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155987q);
        return stringBuffer.toString();
    }
}
