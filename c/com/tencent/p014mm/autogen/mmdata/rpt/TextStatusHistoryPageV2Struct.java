package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStatusHistoryPageV2Struct */
public final class TextStatusHistoryPageV2Struct extends C61103a {

    /* renamed from: d */
    public String f194593d = "";

    /* renamed from: e */
    public String f194594e = "";

    /* renamed from: f */
    public long f194595f;

    /* renamed from: g */
    public long f194596g;

    /* renamed from: j */
    public int mo1004j() {
        return 25117;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194593d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194594e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194595f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194596g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194593d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194594e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194595f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneStaytime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194596g);
        return stringBuffer.toString();
    }
}
