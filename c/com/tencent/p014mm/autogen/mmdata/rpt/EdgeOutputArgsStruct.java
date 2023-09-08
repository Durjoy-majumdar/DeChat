package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EdgeOutputArgsStruct */
public final class EdgeOutputArgsStruct extends C61103a {

    /* renamed from: d */
    public long f343667d = 0;

    /* renamed from: e */
    public long f343668e = 0;

    /* renamed from: f */
    public long f343669f = 0;

    /* renamed from: g */
    public String f343670g = "";

    public EdgeOutputArgsStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343667d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343668e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343669f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343670g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343667d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("syncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343668e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("edgeLogId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343669f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("edgeLogVal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343670g);
        return stringBuffer.toString();
    }

    public EdgeOutputArgsStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 4) {
                String[] strArr = new String[4];
                Arrays.fill(strArr, 0, 4, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f343667d = mo86051k(split[0]);
            this.f343668e = mo86051k(split[1]);
            this.f343669f = mo86051k(split[2]);
            this.f343670g = mo86045b("edgeLogVal", split[3], true);
        }
    }
}
