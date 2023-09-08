package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchTipActionStruct */
public final class WCTopicSearchTipActionStruct extends C61103a {

    /* renamed from: d */
    public String f108017d = "";

    /* renamed from: e */
    public int f108018e;

    /* renamed from: f */
    public String f108019f = "";

    /* renamed from: g */
    public int f108020g;

    /* renamed from: h */
    public int f108021h;

    /* renamed from: i */
    public String f108022i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23012;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f108017d);
        stringBuffer.append(",");
        stringBuffer.append(this.f108018e);
        stringBuffer.append(",");
        stringBuffer.append(this.f108019f);
        stringBuffer.append(",");
        stringBuffer.append(this.f108020g);
        stringBuffer.append(",");
        stringBuffer.append(this.f108021h);
        stringBuffer.append(",");
        stringBuffer.append(this.f108022i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("requestid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108017d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108018e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(StateEvent.Name.MESSAGE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108019f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actiontype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108020g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pagetype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108021h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108022i);
        return stringBuffer.toString();
    }
}
