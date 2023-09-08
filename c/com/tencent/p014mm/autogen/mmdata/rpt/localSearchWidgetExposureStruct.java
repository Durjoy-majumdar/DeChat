package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.localSearchWidgetExposureStruct */
public final class localSearchWidgetExposureStruct extends C61103a {

    /* renamed from: d */
    public String f10125d = "";

    /* renamed from: e */
    public String f10126e = "";

    /* renamed from: f */
    public String f10127f = "";

    /* renamed from: g */
    public String f10128g = "";

    /* renamed from: h */
    public String f10129h = "";

    /* renamed from: i */
    public String f10130i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16032;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f10125d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10126e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10127f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10128g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10129h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10130i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10125d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10126e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10127f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SearchIntents.EXTRA_QUERY);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10128g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resulttype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10129h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resultsubtypelist");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10130i);
        return stringBuffer.toString();
    }
}
