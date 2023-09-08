package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveAnchorFinishLiveStruct */
public final class LiveAnchorFinishLiveStruct extends C61103a {

    /* renamed from: d */
    public long f9922d;

    /* renamed from: e */
    public String f9923e = "";

    /* renamed from: f */
    public long f9924f;

    /* renamed from: g */
    public String f9925g = "";

    /* renamed from: h */
    public long f9926h;

    /* renamed from: i */
    public long f9927i;

    /* renamed from: j */
    public long f9928j;

    /* renamed from: k */
    public long f9929k;

    /* renamed from: l */
    public long f9930l;

    /* renamed from: m */
    public long f9931m;

    /* renamed from: n */
    public long f9932n;

    /* renamed from: o */
    public long f9933o;

    /* renamed from: p */
    public long f9934p;

    /* renamed from: j */
    public int mo1004j() {
        return 19891;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9922d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9923e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9924f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9925g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9926h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9927i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9928j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9929k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9930l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9931m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9932n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9933o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9934p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9922d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9923e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9924f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9925g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9926h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audienceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9927i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audienceCountMax");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9928j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9929k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("heartCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9930l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("connectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9931m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("allowReplay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9932n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9933o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("costTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9934p);
        return stringBuffer.toString();
    }
}
