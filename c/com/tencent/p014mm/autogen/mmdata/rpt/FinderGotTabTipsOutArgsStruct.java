package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsOutArgsStruct */
public final class FinderGotTabTipsOutArgsStruct extends C61103a {

    /* renamed from: d */
    public long f343671d = 0;

    /* renamed from: e */
    public long f343672e = 0;

    /* renamed from: f */
    public String f343673f = "";

    public FinderGotTabTipsOutArgsStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343671d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343672e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343673f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343671d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("edgeLogId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343672e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("edgeLogVal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343673f);
        return stringBuffer.toString();
    }

    public FinderGotTabTipsOutArgsStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 3) {
                String[] strArr = new String[3];
                Arrays.fill(strArr, 0, 3, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f343671d = mo86051k(split[0]);
            this.f343672e = mo86051k(split[1]);
            this.f343673f = mo86045b("edgeLogVal", split[2], true);
        }
    }
}
