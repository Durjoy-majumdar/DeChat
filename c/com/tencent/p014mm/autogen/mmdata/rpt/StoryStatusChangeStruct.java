package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct */
public final class StoryStatusChangeStruct extends C61103a {

    /* renamed from: d */
    public String f266301d = "";

    /* renamed from: e */
    public long f266302e = 0;

    /* renamed from: f */
    public long f266303f = 0;

    /* renamed from: g */
    public long f266304g = 0;

    /* renamed from: h */
    public long f266305h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 17090;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266301d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266302e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266303f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266304g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266305h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StoryId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266301d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266302e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreviewEnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266303f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266304g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsAlbumStarButton");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266305h);
        return stringBuffer.toString();
    }
}
