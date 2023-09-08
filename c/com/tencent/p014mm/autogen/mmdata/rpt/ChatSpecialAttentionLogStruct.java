package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct */
public final class ChatSpecialAttentionLogStruct extends C61103a {

    /* renamed from: d */
    public int f107866d = 0;

    /* renamed from: e */
    public String f107867e = "";

    /* renamed from: f */
    public int f107868f = 0;

    /* renamed from: g */
    public String f107869g = "";

    /* renamed from: h */
    public String f107870h = "";

    /* renamed from: i */
    public int f107871i = 0;

    /* renamed from: j */
    public int f107872j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 23492;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107866d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107867e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107868f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107869g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107870h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107871i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107872j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107866d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107867e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ListCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107868f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107869g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("delList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107870h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107871i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("delCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107872j);
        return stringBuffer.toString();
    }
}
