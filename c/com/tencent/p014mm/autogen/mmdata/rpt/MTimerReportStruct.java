package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MTimerReportStruct */
public final class MTimerReportStruct extends C61103a {
    public MTimerReportStruct() {
        mo86052l("initOfflineTask", "");
        mo86052l("setTask", "");
        mo86052l("unsetTask", "");
        mo86052l("executeTask", "");
        mo86052l("executeTaskTime", 0);
        mo86052l(C66261f3.COL_UPDATETIME, "");
    }

    /* renamed from: j */
    public int mo1004j() {
        return 25357;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("initOfflineTask"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("setTask"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("unsetTask"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("executeTask"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("executeTaskTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i(C66261f3.COL_UPDATETIME));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("initOfflineTask");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("initOfflineTask"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("setTask");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("setTask"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("unsetTask");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("unsetTask"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("executeTask");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("executeTask"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("executeTaskTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("executeTaskTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(C66261f3.COL_UPDATETIME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i(C66261f3.COL_UPDATETIME));
        return stringBuffer.toString();
    }
}
