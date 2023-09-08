package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RoomTodoEnterStruct */
public final class RoomTodoEnterStruct extends C61103a {

    /* renamed from: d */
    public String f69574d = "";

    /* renamed from: e */
    public long f69575e;

    /* renamed from: f */
    public long f69576f;

    /* renamed from: g */
    public long f69577g;

    /* renamed from: h */
    public long f69578h;

    /* renamed from: i */
    public String f69579i = "";

    /* renamed from: j */
    public String f69580j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19443;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69574d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69575e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69576f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69577g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69578h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69579i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69580j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69574d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69575e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69576f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69577g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69578h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("todoid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69579i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69580j);
        return stringBuffer.toString();
    }
}
