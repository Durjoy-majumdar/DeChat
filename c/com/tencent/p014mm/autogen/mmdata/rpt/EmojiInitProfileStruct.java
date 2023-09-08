package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmojiInitProfileStruct */
public final class EmojiInitProfileStruct extends C61103a {

    /* renamed from: d */
    public long f265420d;

    /* renamed from: e */
    public int f265421e;

    /* renamed from: f */
    public long f265422f;

    /* renamed from: g */
    public int f265423g = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 23818;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265420d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265421e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265422f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265423g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Version");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265420d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265421e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InitCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265422f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265423g);
        return stringBuffer.toString();
    }
}
