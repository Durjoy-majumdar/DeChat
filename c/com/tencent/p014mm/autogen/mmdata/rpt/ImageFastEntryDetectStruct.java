package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct */
public final class ImageFastEntryDetectStruct extends C61103a {

    /* renamed from: d */
    public long f265638d = 0;

    /* renamed from: e */
    public long f265639e = 0;

    /* renamed from: f */
    public String f265640f = "";

    /* renamed from: g */
    public long f265641g = 0;

    /* renamed from: h */
    public long f265642h = 0;

    /* renamed from: i */
    public long f265643i = 0;

    /* renamed from: j */
    public String f265644j = "";

    /* renamed from: k */
    public String f265645k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19776;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265638d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265639e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265640f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265641g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265642h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265643i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265644j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265645k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OpenPictureTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265638d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpenPictureType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265639e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265640f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeIconTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265641g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PictureConcluding");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265642h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IconType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265643i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265644j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AesKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265645k);
        return stringBuffer.toString();
    }
}
