package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveNotifyReplaceStruct */
public final class LiveNotifyReplaceStruct extends C61103a {

    /* renamed from: d */
    public long f156397d;

    /* renamed from: e */
    public long f156398e;

    /* renamed from: f */
    public String f156399f = "";

    /* renamed from: g */
    public String f156400g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22623;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156397d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156398e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156399f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156400g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NewMsgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156397d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnReadLiveEndCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156398e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewTipsIDs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156399f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteTipsIDs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156400g);
        return stringBuffer.toString();
    }
}
