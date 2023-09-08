package com.tencent.p014mm.autogen.mmdata.rpt;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FeatureActionReportStruct */
public final class FeatureActionReportStruct extends C61103a {

    /* renamed from: d */
    public String f69469d = "";

    /* renamed from: e */
    public String f69470e = "";

    /* renamed from: f */
    public String f69471f = "";

    /* renamed from: g */
    public long f69472g;

    /* renamed from: h */
    public long f69473h;

    /* renamed from: i */
    public long f69474i;

    /* renamed from: j */
    public long f69475j;

    /* renamed from: k */
    public String f69476k = "";

    /* renamed from: l */
    public String f69477l = "";

    /* renamed from: m */
    public String f69478m = "";

    /* renamed from: n */
    public long f69479n;

    /* renamed from: o */
    public String f69480o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25147;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69469d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69470e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69471f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69472g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69473h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69474i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69475j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69476k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69477l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69478m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69479n);
        stringBuffer.append(",");
        stringBuffer.append(this.f69480o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69469d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69470e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69471f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_SCENE_TYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69472g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69473h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69474i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClientTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69475j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeatureInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69476k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69477l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DocInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69478m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReqBusinessType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69479n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ParentSearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69480o);
        return stringBuffer.toString();
    }
}
