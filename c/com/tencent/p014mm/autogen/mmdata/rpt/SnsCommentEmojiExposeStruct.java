package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct */
public final class SnsCommentEmojiExposeStruct extends C61103a {

    /* renamed from: d */
    public String f265973d = "";

    /* renamed from: e */
    public String f265974e = "";

    /* renamed from: f */
    public String f265975f = "";

    /* renamed from: g */
    public String f265976g = "";

    /* renamed from: h */
    public String f265977h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18670;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265973d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265974e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265975f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265976g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265977h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265973d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentIdList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265974e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiIdList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265975f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickEmojiIconIdList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265976g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickEmojiIdList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265977h);
        return stringBuffer.toString();
    }
}
