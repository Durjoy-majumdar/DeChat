package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DiscoverNearbyEntranceStruct */
public final class DiscoverNearbyEntranceStruct extends C61103a {

    /* renamed from: d */
    public long f154971d;

    /* renamed from: e */
    public long f154972e;

    /* renamed from: f */
    public String f154973f = "";

    /* renamed from: g */
    public String f154974g = "";

    /* renamed from: h */
    public long f154975h;

    /* renamed from: j */
    public int mo1004j() {
        return 21831;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154971d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154972e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154973f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154974g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154975h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154971d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154972e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154973f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154974g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Entrance_Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154975h);
        return stringBuffer.toString();
    }
}
