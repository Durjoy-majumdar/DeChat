package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct */
public final class MaaSCreationReportStruct extends C61103a {

    /* renamed from: d */
    public String f156477d = "";

    /* renamed from: e */
    public int f156478e;

    /* renamed from: f */
    public String f156479f = "";

    /* renamed from: g */
    public int f156480g;

    /* renamed from: h */
    public int f156481h;

    /* renamed from: i */
    public String f156482i = "";

    /* renamed from: j */
    public int f156483j;

    /* renamed from: k */
    public int f156484k;

    /* renamed from: l */
    public String f156485l = "";

    /* renamed from: m */
    public int f156486m;

    /* renamed from: n */
    public String f156487n = "";

    /* renamed from: o */
    public String f156488o = "";

    /* renamed from: p */
    public String f156489p = "";

    /* renamed from: q */
    public int f156490q;

    /* renamed from: r */
    public long f156491r;

    /* renamed from: j */
    public int mo1004j() {
        return 24946;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156477d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156478e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156479f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156480g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156481h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156482i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156483j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156484k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156485l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156486m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156487n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156488o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156489p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156490q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156491r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156477d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156478e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("importMediaInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156479f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("importVideoNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156480g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("importImageNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156481h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportMediaInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156482i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("movieOption");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156483j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportResultCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156484k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportResultErrorMessage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156485l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("creationResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156486m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportTemplateId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156487n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportMusicId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156488o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportParams");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156489p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("entrance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156490q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exportCallSpend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156491r);
        return stringBuffer.toString();
    }
}
