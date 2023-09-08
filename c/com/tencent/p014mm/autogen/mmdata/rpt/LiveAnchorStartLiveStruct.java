package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveAnchorStartLiveStruct */
public final class LiveAnchorStartLiveStruct extends C61103a {

    /* renamed from: d */
    public long f156342d;

    /* renamed from: e */
    public String f156343e = "";

    /* renamed from: f */
    public long f156344f;

    /* renamed from: g */
    public long f156345g;

    /* renamed from: h */
    public String f156346h = "";

    /* renamed from: i */
    public long f156347i;

    /* renamed from: j */
    public long f156348j;

    /* renamed from: k */
    public long f156349k;

    /* renamed from: l */
    public long f156350l;

    /* renamed from: m */
    public long f156351m;

    /* renamed from: n */
    public long f156352n;

    /* renamed from: o */
    public long f156353o;

    /* renamed from: j */
    public int mo1004j() {
        return 19890;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156342d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156343e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156344f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156345g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156346h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156347i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156348j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156349k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156350l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156351m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156352n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156353o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156342d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156343e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rulePop");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156344f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ruleCheck");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156345g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156346h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("customTopic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156347i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cameraStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156348j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("horizontalStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156349k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156350l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errcode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156351m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156352n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156353o);
        return stringBuffer.toString();
    }
}
