package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GalleryOpeReportStruct */
public final class GalleryOpeReportStruct extends C61103a {

    /* renamed from: d */
    public long f265600d;

    /* renamed from: e */
    public long f265601e;

    /* renamed from: f */
    public long f265602f;

    /* renamed from: g */
    public long f265603g;

    /* renamed from: h */
    public long f265604h;

    /* renamed from: i */
    public long f265605i;

    /* renamed from: j */
    public long f265606j;

    /* renamed from: k */
    public long f265607k;

    /* renamed from: l */
    public long f265608l;

    /* renamed from: m */
    public String f265609m = "";

    /* renamed from: n */
    public long f265610n;

    /* renamed from: o */
    public long f265611o;

    /* renamed from: p */
    public long f265612p;

    /* renamed from: q */
    public long f265613q;

    /* renamed from: r */
    public String f265614r = "";

    /* renamed from: s */
    public long f265615s;

    /* renamed from: t */
    public long f265616t;

    /* renamed from: u */
    public long f265617u;

    /* renamed from: j */
    public int mo1004j() {
        return 18077;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265600d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265601e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265602f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265603g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265604h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265605i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265606j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265607k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265608l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265609m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265610n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265611o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265612p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265613q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265614r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265615s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265616t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265617u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265600d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("displaySearch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265601e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useSearch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265602f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useSwitch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265603g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendCountFromSearchUnOCR");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265604h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendCountFromSearchOCR");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265605i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendCountFromClassify");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265606j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendCountFromDefault");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265607k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendCountFromOther");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265608l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendMediaPoi");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265609m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalSelectedImageCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265610n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalSelectedVideoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265611o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsCollection");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265612p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NextStep");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265613q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265614r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalSelectedImageCountBySliding");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265615s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalSelectedVideoCountBySliding");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265616t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeInGallery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265617u);
        return stringBuffer.toString();
    }
}
