package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct */
public final class WeAppQualityWasmCachePrecompileStruct extends C61103a {

    /* renamed from: d */
    public String f237310d = "";

    /* renamed from: e */
    public long f237311e;

    /* renamed from: f */
    public long f237312f;

    /* renamed from: g */
    public long f237313g;

    /* renamed from: h */
    public long f237314h;

    /* renamed from: i */
    public long f237315i;

    /* renamed from: j */
    public long f237316j;

    /* renamed from: j */
    public int mo1004j() {
        return 27225;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237310d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237311e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237312f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237313g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237314h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237315i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237316j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237310d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237311e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WasmBytesSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237312f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CacheBytesSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237313g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WasmCompileCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237314h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WasmCompileFuncListCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237315i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WasmCompileResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237316j);
        return stringBuffer.toString();
    }
}
