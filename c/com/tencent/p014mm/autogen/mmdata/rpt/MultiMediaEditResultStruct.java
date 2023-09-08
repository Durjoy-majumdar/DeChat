package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct */
public final class MultiMediaEditResultStruct extends C61103a {

    /* renamed from: d */
    public String f265739d = "";

    /* renamed from: e */
    public String f265740e = "";

    /* renamed from: f */
    public long f265741f;

    /* renamed from: g */
    public long f265742g;

    /* renamed from: h */
    public long f265743h;

    /* renamed from: i */
    public long f265744i;

    /* renamed from: j */
    public long f265745j;

    /* renamed from: k */
    public long f265746k;

    /* renamed from: l */
    public String f265747l = "";

    /* renamed from: m */
    public long f265748m;

    /* renamed from: n */
    public long f265749n;

    /* renamed from: o */
    public String f265750o = "";

    /* renamed from: p */
    public String f265751p = "";

    /* renamed from: q */
    public String f265752q = "";

    /* renamed from: r */
    public int f265753r = -1;

    /* renamed from: s */
    public long f265754s;

    /* renamed from: t */
    public String f265755t = "";

    /* renamed from: u */
    public long f265756u;

    /* renamed from: j */
    public int mo1004j() {
        return 20741;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265739d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265740e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265741f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265742g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265743h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265744i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265745j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265746k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265747l);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265748m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265749n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265750o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265751p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265752q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265753r);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265754s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265755t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265756u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EditId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265739d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JsonInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265740e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265741f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265742g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EditItemCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265743h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AudioCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265744i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265745j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265746k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TemplateId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265747l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TemplateResourceReady");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadTemplateTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsEnableImageEnhancement");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265748m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265749n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SeekTimeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265750o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdateCompositionTimeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265751p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoGOPStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265752q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265753r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EditType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AudioId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265754s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MusicFeedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265755t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SoundTrackType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265756u);
        return stringBuffer.toString();
    }
}
