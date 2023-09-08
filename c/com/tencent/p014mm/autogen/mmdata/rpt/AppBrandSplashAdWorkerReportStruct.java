package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct */
public final class AppBrandSplashAdWorkerReportStruct extends C61103a {

    /* renamed from: d */
    public String f236344d = "";

    /* renamed from: e */
    public String f236345e = "";

    /* renamed from: f */
    public long f236346f;

    /* renamed from: g */
    public long f236347g;

    /* renamed from: h */
    public long f236348h;

    /* renamed from: i */
    public long f236349i;

    /* renamed from: j */
    public long f236350j;

    /* renamed from: k */
    public long f236351k;

    /* renamed from: l */
    public long f236352l;

    /* renamed from: m */
    public String f236353m = "";

    /* renamed from: n */
    public long f236354n;

    /* renamed from: o */
    public long f236355o = -1;

    /* renamed from: p */
    public long f236356p = -1;

    /* renamed from: q */
    public long f236357q = -1;

    /* renamed from: r */
    public long f236358r = -1;

    /* renamed from: s */
    public long f236359s;

    /* renamed from: t */
    public long f236360t = -1;

    /* renamed from: u */
    public long f236361u = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 22732;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236344d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236345e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236346f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236347g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236348h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236349i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236350j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236351k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236352l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236353m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236354n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236355o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236356p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236357q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236358r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236359s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236360t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236361u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236344d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236345e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CheckSendShouldTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236346f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AdWorkerCreateStart");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236347g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AdWorkerCreateEnd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236348h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreloadStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236349i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WorkerCreateStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236350j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitingWorkerCreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236351k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236352l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AdWorkerCreateFailErrorMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236353m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShowAdState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236354n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartInjectJsTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236355o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JsInjectCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236356p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AdWorkerCreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236357q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CheckShowAdAllTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236358r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsEnableAdWhenColdLaunch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236359s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WorkerCreateEarlyTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236360t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isLoadingFinished");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236361u);
        return stringBuffer.toString();
    }
}
