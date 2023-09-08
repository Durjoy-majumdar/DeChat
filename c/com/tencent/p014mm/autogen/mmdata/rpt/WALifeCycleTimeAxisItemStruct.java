package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct */
public final class WALifeCycleTimeAxisItemStruct extends C61103a {

    /* renamed from: d */
    public String f236461d = "";

    /* renamed from: e */
    public String f236462e = "";

    /* renamed from: f */
    public long f236463f;

    /* renamed from: g */
    public String f236464g = "";

    /* renamed from: h */
    public long f236465h;

    /* renamed from: i */
    public String f236466i = "";

    /* renamed from: j */
    public long f236467j;

    /* renamed from: k */
    public long f236468k;

    /* renamed from: j */
    public int mo1004j() {
        return 19175;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236461d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236462e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236463f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236464g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236465h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236466i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236467j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236468k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236461d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236462e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeStampInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236463f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236464g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236465h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Parent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236466i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Category");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236467j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Option");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236468k);
        return stringBuffer.toString();
    }
}
