package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmojiProcessProfileStruct */
public final class EmojiProcessProfileStruct extends C61103a {

    /* renamed from: d */
    public int f265424d;

    /* renamed from: e */
    public int f265425e;

    /* renamed from: f */
    public long f265426f;

    /* renamed from: g */
    public int f265427g;

    /* renamed from: h */
    public int f265428h;

    /* renamed from: i */
    public long f265429i;

    /* renamed from: j */
    public int f265430j;

    /* renamed from: k */
    public int f265431k;

    /* renamed from: j */
    public int mo1004j() {
        return 23817;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265424d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265425e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265426f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265427g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265428h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265429i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265430j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265431k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HitCacheCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265424d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265425e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265426f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessDecodeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265427g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CacheHitPercent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265428h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265429i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurEmojiCacheCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265430j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiTextCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265431k);
        return stringBuffer.toString();
    }
}
