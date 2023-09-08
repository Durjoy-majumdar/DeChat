package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SecondCutSmallTailStruct */
public final class SecondCutSmallTailStruct extends C61103a {

    /* renamed from: d */
    public String f265830d = "";

    /* renamed from: e */
    public int f265831e;

    /* renamed from: f */
    public int f265832f = -1;

    /* renamed from: g */
    public int f265833g = -1;

    /* renamed from: h */
    public String f265834h = "";

    /* renamed from: i */
    public String f265835i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22624;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265830d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265831e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265832f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265833g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265834h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265835i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Publishid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265830d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265831e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstallMiaoJian");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265832f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifEg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265833g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265834h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MusicID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265835i);
        return stringBuffer.toString();
    }
}
