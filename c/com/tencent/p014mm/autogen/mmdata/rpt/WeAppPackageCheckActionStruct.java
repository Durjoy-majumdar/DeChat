package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPackageCheckActionStruct */
public final class WeAppPackageCheckActionStruct extends C61103a {

    /* renamed from: d */
    public long f236608d = 0;

    /* renamed from: e */
    public long f236609e = 0;

    /* renamed from: f */
    public long f236610f = 0;

    /* renamed from: g */
    public long f236611g = 0;

    /* renamed from: h */
    public long f236612h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15401;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236608d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236609e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236610f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236611g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236612h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AllPackageSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236608d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllPackageClientStoragePercent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236609e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClientStorageFreePercent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236610f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AbtestStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236611g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WeappCountThatHasPackage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236612h);
        return stringBuffer.toString();
    }
}
