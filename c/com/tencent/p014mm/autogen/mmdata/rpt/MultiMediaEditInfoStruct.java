package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct */
public final class MultiMediaEditInfoStruct extends C61103a {

    /* renamed from: A */
    public String f310210A = "";

    /* renamed from: B */
    public String f310211B = "";

    /* renamed from: C */
    public String f310212C = "";

    /* renamed from: D */
    public long f310213D;

    /* renamed from: d */
    public String f310214d = "";

    /* renamed from: e */
    public String f310215e = "";

    /* renamed from: f */
    public String f310216f = "";

    /* renamed from: g */
    public String f310217g = "";

    /* renamed from: h */
    public String f310218h = "";

    /* renamed from: i */
    public String f310219i = "";

    /* renamed from: j */
    public String f310220j = "";

    /* renamed from: k */
    public String f310221k = "";

    /* renamed from: l */
    public String f310222l = "";

    /* renamed from: m */
    public String f310223m = "";

    /* renamed from: n */
    public String f310224n = "";

    /* renamed from: o */
    public String f310225o = "";

    /* renamed from: p */
    public String f310226p = "";

    /* renamed from: q */
    public long f310227q;

    /* renamed from: r */
    public long f310228r;

    /* renamed from: s */
    public long f310229s;

    /* renamed from: t */
    public long f310230t;

    /* renamed from: u */
    public String f310231u = "";

    /* renamed from: v */
    public String f310232v = "";

    /* renamed from: w */
    public String f310233w = "";

    /* renamed from: x */
    public String f310234x = "";

    /* renamed from: y */
    public String f310235y = "";

    /* renamed from: z */
    public String f310236z = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19904;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310214d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310215e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310216f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310217g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310218h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310219i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310220j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310221k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310222l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310223m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310224n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310225o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310226p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310227q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310228r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310229s);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310230t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310231u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310232v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310233w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310234x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310235y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310236z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310210A);
        stringBuffer.append(",");
        stringBuffer.append(this.f310211B);
        stringBuffer.append(",");
        stringBuffer.append(this.f310212C);
        stringBuffer.append(",");
        stringBuffer.append(this.f310213D);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PostId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310214d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EditId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310215e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310216f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isBeauty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310217g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("targetDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310218h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("originDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310219i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isSlowMotion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310220j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("dragCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310221k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scaleCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310222l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickEditCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310223m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("durationCutCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310224n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("durationScrollCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310225o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDurationCut");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310226p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cropRectChangeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310227q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("seekBarDragCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310228r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is60sDurationCut");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310229s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NextStep");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310230t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310231u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CaptionInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310232v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TextInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310233w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310234x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TransitionInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310235y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TrSpeedInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310236z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FilterInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310210A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TemplateInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310211B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BeautyInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310212C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310213D);
        return stringBuffer.toString();
    }
}
