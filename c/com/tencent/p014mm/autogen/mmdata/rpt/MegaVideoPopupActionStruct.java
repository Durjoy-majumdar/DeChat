package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MegaVideoPopupActionStruct */
public final class MegaVideoPopupActionStruct extends C61103a {

    /* renamed from: d */
    public long f156492d;

    /* renamed from: e */
    public long f156493e;

    /* renamed from: f */
    public String f156494f = "";

    /* renamed from: g */
    public long f156495g;

    /* renamed from: h */
    public String f156496h = "";

    /* renamed from: i */
    public String f156497i = "";

    /* renamed from: j */
    public String f156498j = "";

    /* renamed from: k */
    public String f156499k = "";

    /* renamed from: l */
    public long f156500l;

    /* renamed from: j */
    public int mo1004j() {
        return 21155;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156492d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156493e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156494f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156495g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156496h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156497i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156498j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156499k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156500l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OpType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156492d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156493e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MiniSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156494f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TaskOrder");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156495g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LongVideoId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156496h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156497i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156498j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156499k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifPictureInPicture");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156500l);
        return stringBuffer.toString();
    }
}
