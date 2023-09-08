package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BackupTransferReportStruct */
public final class BackupTransferReportStruct extends C61103a {
    public BackupTransferReportStruct() {
        mo86052l("prepareTime", 0);
        mo86052l("transTime", 0);
        mo86052l("importTime", 0);
        mo86052l("transSpeed", 0);
        mo86052l("mediaSize", 0);
        mo86052l("mediaCount", 0);
        mo86052l("msgCount", 0);
        mo86052l("totalSize", 0);
        mo86052l("originDBSize", 0);
        mo86052l("packTime", 0);
        mo86052l("readDBTime", 0);
        mo86052l("error", 0);
    }

    /* renamed from: j */
    public int mo1004j() {
        return 26800;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("prepareTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("transTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("importTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("transSpeed"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaSize"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("msgCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("totalSize"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("originDBSize"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("packTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("readDBTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("error"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("prepareTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("prepareTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("transTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("transTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("importTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("importTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("transSpeed");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("transSpeed"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaSize"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("msgCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("totalSize"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("originDBSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("originDBSize"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("packTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("packTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("readDBTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("readDBTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("error");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("error"));
        return stringBuffer.toString();
    }
}
