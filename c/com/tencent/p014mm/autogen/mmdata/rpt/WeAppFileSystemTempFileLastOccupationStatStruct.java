package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct */
public final class WeAppFileSystemTempFileLastOccupationStatStruct extends C61103a {

    /* renamed from: d */
    public String f236560d = "";

    /* renamed from: e */
    public long f236561e = 0;

    /* renamed from: f */
    public C80750a f236562f;

    /* renamed from: g */
    public long f236563g = 0;

    /* renamed from: h */
    public long f236564h = 0;

    /* renamed from: i */
    public String f236565i = "";

    /* renamed from: j */
    public long f236566j = 0;

    /* renamed from: k */
    public long f236567k = 0;

    /* renamed from: l */
    public long f236568l = 0;

    /* renamed from: m */
    public long f236569m = 0;

    /* renamed from: n */
    public long f236570n = 0;

    /* renamed from: o */
    public long f236571o = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a */
    public enum C80750a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236576d;

        /* access modifiers changed from: public */
        C80750a(int i) {
            this.f236576d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 17687;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236560d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236561e);
        stringBuffer.append(",");
        C80750a aVar = this.f236562f;
        stringBuffer.append(aVar != null ? aVar.f236576d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236563g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236564h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236565i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236566j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236567k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236568l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236569m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236570n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236571o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236560d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236561e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236562f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236563g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileOccupation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236564h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DirPrefix");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236565i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236566j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalFileOccupation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236567k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TriggerSingleAppClean");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236568l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TriggerAllAppClean");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236569m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RuntimeFileOccupation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236570n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RuntimeSpaceStaticsEnable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236571o);
        return stringBuffer.toString();
    }
}
