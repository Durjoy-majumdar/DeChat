package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct */
public final class SnsTemplateReportStruct extends C61103a {
    public SnsTemplateReportStruct() {
        mo86052l(FirebaseAnalytics.C113379b.SOURCE, 0);
        mo86052l("sessionID", "");
        mo86052l("mediadetail", "");
        mo86052l("egviewcnt", 0);
        mo86052l("egpreviewcnt", 0);
        mo86052l("egendcnt", 0);
        mo86052l("musiccnt", 0);
        mo86052l("egdetail", "");
        mo86052l("editdetail", "");
        mo86052l("moreAction", 0);
        mo86052l("installMiaojian", 0);
        mo86052l("miaojiansheet", 0);
        mo86052l("final_egid", "");
        mo86052l("final_musicid", "");
        mo86052l("final_musictype", 0);
        mo86052l("goToMJAppResult", 0);
    }

    /* renamed from: j */
    public int mo1004j() {
        return 25245;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i(FirebaseAnalytics.C113379b.SOURCE));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("sessionID"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediadetail"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egviewcnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egpreviewcnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egendcnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("musiccnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egdetail"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("editdetail"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("moreAction"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("installMiaojian"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("miaojiansheet"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("final_egid"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("final_musicid"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("final_musictype"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("goToMJAppResult"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FirebaseAnalytics.C113379b.SOURCE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i(FirebaseAnalytics.C113379b.SOURCE));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("sessionID"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediadetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediadetail"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egviewcnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egviewcnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egpreviewcnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egpreviewcnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egendcnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egendcnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("musiccnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("musiccnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egdetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egdetail"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editdetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("editdetail"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("moreAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("moreAction"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("installMiaojian");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("installMiaojian"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("miaojiansheet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("miaojiansheet"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("final_egid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("final_egid"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("final_musicid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("final_musicid"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("final_musictype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("final_musictype"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("goToMJAppResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("goToMJAppResult"));
        return stringBuffer.toString();
    }

    public SnsTemplateReportStruct setEditdetail(String str) {
        mo86052l("editdetail", mo86045b("editdetail", str, true));
        return this;
    }

    public SnsTemplateReportStruct setEgdetail(String str) {
        mo86052l("egdetail", mo86045b("egdetail", str, true));
        return this;
    }

    public SnsTemplateReportStruct setEgendcnt(int i) {
        mo86052l("egendcnt", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setEgpreviewcnt(int i) {
        mo86052l("egpreviewcnt", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setEgviewcnt(int i) {
        mo86052l("egviewcnt", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setFinal_egid(String str) {
        mo86052l("final_egid", mo86045b("final_egid", str, true));
        return this;
    }

    public SnsTemplateReportStruct setFinal_musicid(String str) {
        mo86052l("final_musicid", mo86045b("final_musicid", str, true));
        return this;
    }

    public SnsTemplateReportStruct setFinal_musictype(int i) {
        mo86052l("final_musictype", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setGoToMJAppResult(int i) {
        mo86052l("goToMJAppResult", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setInstallMiaojian(int i) {
        mo86052l("installMiaojian", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setMediadetail(String str) {
        mo86052l("mediadetail", mo86045b("mediadetail", str, true));
        return this;
    }

    public SnsTemplateReportStruct setMiaojiansheet(int i) {
        mo86052l("miaojiansheet", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setMoreAction(int i) {
        mo86052l("moreAction", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setMusiccnt(int i) {
        mo86052l("musiccnt", Integer.valueOf(i));
        return this;
    }

    public SnsTemplateReportStruct setSessionID(String str) {
        mo86052l("sessionID", mo86045b("sessionID", str, true));
        return this;
    }

    public SnsTemplateReportStruct setSource(int i) {
        mo86052l(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(i));
        return this;
    }
}
