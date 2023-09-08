package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct */
public final class WeAppFileSystemTempFileSingleAllocStatStruct extends C61103a {

    /* renamed from: d */
    public String f236577d = "";

    /* renamed from: e */
    public long f236578e = 0;

    /* renamed from: f */
    public C80751a f236579f;

    /* renamed from: g */
    public long f236580g = 0;

    /* renamed from: h */
    public long f236581h = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct$a */
    public enum C80751a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236586d;

        /* access modifiers changed from: public */
        C80751a(int i) {
            this.f236586d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 17688;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236577d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236578e);
        stringBuffer.append(",");
        C80751a aVar = this.f236579f;
        stringBuffer.append(aVar != null ? aVar.f236586d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236580g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236581h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236577d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236578e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236579f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236580g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileAllocSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236581h);
        return stringBuffer.toString();
    }
}
