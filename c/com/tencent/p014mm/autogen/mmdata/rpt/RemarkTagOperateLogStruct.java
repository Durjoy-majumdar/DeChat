package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct */
public final class RemarkTagOperateLogStruct extends C61103a {

    /* renamed from: d */
    public String f194329d = "";

    /* renamed from: e */
    public long f194330e;

    /* renamed from: f */
    public long f194331f;

    /* renamed from: g */
    public long f194332g;

    /* renamed from: h */
    public long f194333h;

    /* renamed from: i */
    public long f194334i;

    /* renamed from: j */
    public long f194335j;

    /* renamed from: k */
    public long f194336k;

    /* renamed from: l */
    public long f194337l;

    /* renamed from: m */
    public long f194338m;

    /* renamed from: n */
    public long f194339n;

    /* renamed from: o */
    public long f194340o;

    /* renamed from: p */
    public long f194341p;

    /* renamed from: q */
    public long f194342q;

    /* renamed from: r */
    public long f194343r;

    /* renamed from: j */
    public int mo1004j() {
        return 22865;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194329d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194330e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194331f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194332g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194333h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194334i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194335j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194336k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194337l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194338m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194339n);
        stringBuffer.append(",");
        stringBuffer.append(this.f194340o);
        stringBuffer.append(",");
        stringBuffer.append(this.f194341p);
        stringBuffer.append(",");
        stringBuffer.append(this.f194342q);
        stringBuffer.append(",");
        stringBuffer.append(this.f194343r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("friendUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194329d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isClickAll");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194330e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("buttonAddNewLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194331f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchAddNewLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194332g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selectAddLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194333h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchAddLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194334i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("oriLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194335j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("removedLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194336k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addedLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194337l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194338m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalLabelCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194339n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194340o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194341p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addremark");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194342q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.SOURCE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194343r);
        return stringBuffer.toString();
    }
}
