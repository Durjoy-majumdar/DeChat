package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BackupMigrationReportStruct */
public final class BackupMigrationReportStruct extends C61103a {
    public BackupMigrationReportStruct() {
        mo86052l("Type", 0);
        mo86052l("PairDevice", 0);
        mo86052l("Action", 0);
        mo86052l("Status", 0);
        mo86052l("CostTime", 0);
        mo86052l("Size", 0);
        mo86052l("SessionID", "");
        mo86052l("Size2", 0);
        mo86052l("Size3", 0);
    }

    /* renamed from: j */
    public int mo1004j() {
        return 26824;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("Type"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("PairDevice"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Action"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Status"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("CostTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Size"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("SessionID"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Size2"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Size3"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Type"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PairDevice");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("PairDevice"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Action"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Status"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("CostTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Size");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Size"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("SessionID"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Size2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Size2"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Size3");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Size3"));
        return stringBuffer.toString();
    }
}
