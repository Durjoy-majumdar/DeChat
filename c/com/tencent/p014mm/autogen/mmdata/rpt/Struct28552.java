package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.Struct28552 */
public final class Struct28552 extends C61103a {
    public Struct28552() {
        mo86052l("SnsUIType", -1);
        mo86052l("ADType", -1);
        mo86052l("Action", -1);
        mo86052l("Scene", -1);
        mo86052l("Aid", "");
    }

    /* renamed from: j */
    public int mo1004j() {
        return 28552;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("SnsUIType"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ADType"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Action"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Scene"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Aid"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SnsUIType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("SnsUIType"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ADType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ADType"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Action"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Scene"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Aid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Aid"));
        return stringBuffer.toString();
    }
}
