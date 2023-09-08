package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.NewPoiDetailFinderStruct */
public final class NewPoiDetailFinderStruct extends C61103a {

    /* renamed from: d */
    public long f156698d;

    /* renamed from: e */
    public long f156699e;

    /* renamed from: f */
    public long f156700f;

    /* renamed from: g */
    public long f156701g;

    /* renamed from: h */
    public String f156702h = "";

    /* renamed from: i */
    public String f156703i = "";

    /* renamed from: j */
    public String f156704j = "";

    /* renamed from: k */
    public String f156705k = "";

    /* renamed from: l */
    public String f156706l = "";

    /* renamed from: m */
    public String f156707m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22116;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156698d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156699e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156700f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156701g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156702h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156703i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156704j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156705k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156706l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156707m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156698d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionTS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156699e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156700f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DynamicState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156701g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156702h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156703i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("POIID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156704j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("POIDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156705k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156706l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sourceid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156707m);
        return stringBuffer.toString();
    }
}
