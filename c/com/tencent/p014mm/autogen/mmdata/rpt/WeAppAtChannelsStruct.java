package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppAtChannelsStruct */
public final class WeAppAtChannelsStruct extends C61103a {

    /* renamed from: d */
    public String f156955d = "";

    /* renamed from: e */
    public long f156956e;

    /* renamed from: f */
    public String f156957f = "";

    /* renamed from: g */
    public String f156958g = "";

    /* renamed from: h */
    public String f156959h = "";

    /* renamed from: i */
    public long f156960i;

    /* renamed from: j */
    public String f156961j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22265;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156955d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156956e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156957f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156958g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156959h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156960i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156961j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156955d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156956e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156957f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156958g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("click_tab_context_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156959h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156960i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pageResrouceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156961j);
        return stringBuffer.toString();
    }
}
