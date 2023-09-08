package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiSessionInfoStruct */
public final class AiSessionInfoStruct extends C61103a {

    /* renamed from: d */
    public String f79109d = "";

    /* renamed from: e */
    public String f79110e = "";

    /* renamed from: f */
    public String f79111f = "";

    /* renamed from: g */
    public long f79112g;

    /* renamed from: h */
    public long f79113h;

    /* renamed from: i */
    public long f79114i;

    public AiSessionInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 21948;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79109d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79110e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79111f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79112g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79113h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79114i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lastSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79109d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79110e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("nextSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79111f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionEnterMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79112g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionQuitMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79113h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79114i);
        return stringBuffer.toString();
    }

    public AiSessionInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 6) {
                String[] strArr = new String[6];
                Arrays.fill(strArr, 0, 6, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f79109d = mo86045b("lastSessionId", split[0], true);
            this.f79110e = mo86045b("currSessionId", split[1], true);
            this.f79111f = mo86045b("nextSessionId", split[2], true);
            this.f79112g = mo86051k(split[3]);
            this.f79113h = mo86051k(split[4]);
            this.f79114i = mo86051k(split[5]);
        }
    }
}
