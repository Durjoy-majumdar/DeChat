package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct */
public final class EmojiResReportStruct extends C61103a {

    /* renamed from: d */
    public long f265432d;

    /* renamed from: e */
    public long f265433e;

    /* renamed from: f */
    public int f265434f;

    /* renamed from: g */
    public int f265435g;

    /* renamed from: h */
    public int f265436h;

    /* renamed from: i */
    public int f265437i;

    /* renamed from: j */
    public int f265438j;

    /* renamed from: j */
    public int mo1004j() {
        return 21843;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265432d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265433e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265434f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265435g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265436h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265437i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265438j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265432d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265433e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emojiCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265434f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("oldVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265435g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265436h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265437i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265438j);
        return stringBuffer.toString();
    }
}
