package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveComplaintStruct */
public final class LiveComplaintStruct extends C61103a {

    /* renamed from: d */
    public long f156365d;

    /* renamed from: e */
    public String f156366e = "";

    /* renamed from: f */
    public long f156367f;

    /* renamed from: g */
    public String f156368g = "";

    /* renamed from: h */
    public String f156369h = "";

    /* renamed from: i */
    public long f156370i;

    /* renamed from: j */
    public long f156371j;

    /* renamed from: k */
    public String f156372k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19896;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156365d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156366e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156367f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156368g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156369h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156370i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156371j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156372k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156365d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156366e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156367f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156368g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156369h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156370i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audienceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156371j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156372k);
        return stringBuffer.toString();
    }
}
