package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBulletPostStruct */
public final class FinderBulletPostStruct extends C61103a {

    /* renamed from: d */
    public String f155087d = "";

    /* renamed from: e */
    public String f155088e = "";

    /* renamed from: f */
    public String f155089f = "";

    /* renamed from: g */
    public int f155090g;

    /* renamed from: h */
    public long f155091h;

    /* renamed from: i */
    public long f155092i;

    /* renamed from: j */
    public int f155093j;

    /* renamed from: k */
    public int f155094k;

    /* renamed from: l */
    public int f155095l;

    /* renamed from: j */
    public int mo1004j() {
        return 26131;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155087d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155088e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155089f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155090g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155091h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155092i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155093j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155094k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155095l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("bs_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155087d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feed_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155088e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bs_content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155089f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bs_status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155090g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bs_createtime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155091h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("post_play_sec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155092i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("screen_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155093j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bs_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155094k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("post_play_times");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155095l);
        return stringBuffer.toString();
    }
}
