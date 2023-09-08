package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FlutterVoIPP2PStruct */
public final class FlutterVoIPP2PStruct extends C61103a {

    /* renamed from: d */
    public int f310176d;

    /* renamed from: e */
    public int f310177e;

    /* renamed from: f */
    public int f310178f;

    /* renamed from: g */
    public long f310179g;

    /* renamed from: h */
    public long f310180h;

    /* renamed from: i */
    public long f310181i;

    /* renamed from: j */
    public long f310182j;

    /* renamed from: k */
    public long f310183k;

    /* renamed from: l */
    public long f310184l;

    /* renamed from: m */
    public long f310185m;

    /* renamed from: n */
    public long f310186n;

    /* renamed from: j */
    public int mo1004j() {
        return 23581;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310176d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310177e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310178f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310179g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310180h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310181i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310182j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310183k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310184l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310185m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310186n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Mode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310176d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310177e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasModeChanged");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310178f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LaunchCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310179g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RestoreFromPIPCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310180h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartPSS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310181i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AveragePSS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310182j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndPSS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310183k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310184l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BootCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310185m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SlowFrameRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310186n);
        return stringBuffer.toString();
    }
}
