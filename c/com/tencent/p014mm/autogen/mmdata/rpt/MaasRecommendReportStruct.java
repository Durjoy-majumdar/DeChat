package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct */
public final class MaasRecommendReportStruct extends C61103a {

    /* renamed from: d */
    public long f69523d;

    /* renamed from: e */
    public long f69524e;

    /* renamed from: f */
    public int f69525f;

    /* renamed from: g */
    public int f69526g;

    /* renamed from: h */
    public String f69527h = "";

    /* renamed from: i */
    public String f69528i = "";

    /* renamed from: j */
    public String f69529j = "";

    /* renamed from: k */
    public String f69530k = "";

    /* renamed from: l */
    public int f69531l;

    /* renamed from: m */
    public int f69532m;

    /* renamed from: n */
    public String f69533n = "";

    /* renamed from: o */
    public String f69534o = "";

    /* renamed from: p */
    public String f69535p = "";

    /* renamed from: q */
    public String f69536q = "";

    /* renamed from: r */
    public String f69537r = "";

    /* renamed from: s */
    public String f69538s = "";

    /* renamed from: t */
    public String f69539t = "";

    /* renamed from: u */
    public String f69540u = "";

    /* renamed from: v */
    public int f69541v;

    /* renamed from: w */
    public int f69542w;

    /* renamed from: x */
    public String f69543x = "";

    /* renamed from: y */
    public int f69544y;

    /* renamed from: z */
    public String f69545z = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25621;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69523d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69524e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69525f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69526g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69527h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69528i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69529j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69530k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69531l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69532m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69533n);
        stringBuffer.append(",");
        stringBuffer.append(this.f69534o);
        stringBuffer.append(",");
        stringBuffer.append(this.f69535p);
        stringBuffer.append(",");
        stringBuffer.append(this.f69536q);
        stringBuffer.append(",");
        stringBuffer.append(this.f69537r);
        stringBuffer.append(",");
        stringBuffer.append(this.f69538s);
        stringBuffer.append(",");
        stringBuffer.append(this.f69539t);
        stringBuffer.append(",");
        stringBuffer.append(this.f69540u);
        stringBuffer.append(",");
        stringBuffer.append(this.f69541v);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69542w);
        stringBuffer.append(",");
        stringBuffer.append(this.f69543x);
        stringBuffer.append(",");
        stringBuffer.append(this.f69544y);
        stringBuffer.append(",");
        stringBuffer.append(this.f69545z);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("recommendStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69523d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("recommendEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69524e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69525f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediacnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69526g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediadetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69527h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("recids");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69528i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exposeids");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69529j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("previewseq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69530k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exposemjlink");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69531l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotomjapp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69532m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editres");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69533n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("savetid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69534o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("savesid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69535p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scenetag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69536q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("projectClassification");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69537r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("request_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69538s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69539t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("creation_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69540u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("creationscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69541v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("goToMJAppResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("song_source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69542w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("song_name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69543x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("template_source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69544y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sdkinfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69545z);
        return stringBuffer.toString();
    }
}
