package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct */
public final class SnsCoverActionStruct extends C61103a {

    /* renamed from: d */
    public int f265978d;

    /* renamed from: e */
    public int f265979e;

    /* renamed from: f */
    public String f265980f = "";

    /* renamed from: g */
    public int f265981g;

    /* renamed from: h */
    public String f265982h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23665;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265978d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265979e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265980f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265981g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265982h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265978d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265979e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OwnerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265980f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265981g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderFeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265982h);
        return stringBuffer.toString();
    }
}
