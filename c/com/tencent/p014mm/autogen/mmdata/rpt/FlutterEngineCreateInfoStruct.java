package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FlutterEngineCreateInfoStruct */
public final class FlutterEngineCreateInfoStruct extends C61103a {

    /* renamed from: d */
    public String f343737d = "";

    /* renamed from: e */
    public long f343738e;

    /* renamed from: f */
    public long f343739f;

    /* renamed from: g */
    public long f343740g;

    /* renamed from: h */
    public long f343741h;

    /* renamed from: i */
    public long f343742i;

    /* renamed from: j */
    public String f343743j = "";

    /* renamed from: k */
    public long f343744k;

    /* renamed from: l */
    public long f343745l;

    /* renamed from: m */
    public long f343746m;

    /* renamed from: n */
    public long f343747n;

    /* renamed from: j */
    public int mo1004j() {
        return 28393;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343737d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343738e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343739f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343740g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343741h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343742i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343743j);
        stringBuffer.append(",");
        stringBuffer.append(this.f343744k);
        stringBuffer.append(",");
        stringBuffer.append(this.f343745l);
        stringBuffer.append(",");
        stringBuffer.append(this.f343746m);
        stringBuffer.append(",");
        stringBuffer.append(this.f343747n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EngineId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343737d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsRootEngine");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343738e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343739f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SinceEngineGroupCreate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343740g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllEngineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343741h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveEngineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343742i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Route");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343743j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnapshotCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343744k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnapshotAttach");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343745l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnapshotTimeout");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343746m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DetachCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343747n);
        return stringBuffer.toString();
    }
}
