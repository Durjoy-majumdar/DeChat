package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct */
public final class StoryQuitPublishStruct extends C61103a {

    /* renamed from: d */
    public long f310314d = 0;

    /* renamed from: e */
    public String f310315e = "";

    /* renamed from: f */
    public long f310316f = 0;

    /* renamed from: g */
    public long f310317g = 0;

    /* renamed from: h */
    public long f310318h = 0;

    /* renamed from: i */
    public long f310319i = 0;

    /* renamed from: j */
    public long f310320j = 0;

    /* renamed from: k */
    public long f310321k = 0;

    /* renamed from: l */
    public long f310322l = 0;

    /* renamed from: m */
    public long f310323m = 0;

    /* renamed from: n */
    public long f310324n = 0;

    /* renamed from: o */
    public String f310325o = "";

    /* renamed from: p */
    public long f310326p = 0;

    /* renamed from: q */
    public long f310327q = 0;

    /* renamed from: r */
    public long f310328r = 0;

    /* renamed from: s */
    public long f310329s = 2;

    /* renamed from: t */
    public long f310330t = 0;

    /* renamed from: u */
    public long f310331u = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16639;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310314d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310315e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310316f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310317g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310318h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310319i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310320j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310321k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310322l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310323m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310324n);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310325o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310326p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310327q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310328r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310329s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310330t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310331u);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310314d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PublishObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310315e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310316f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310317g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QuitTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310318h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasRecordVideo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310319i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasEnterAllbum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310320j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiWidgetCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310321k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TextWidgetCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310322l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAddMusic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310323m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAddPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310324n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewActionTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310325o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310326p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsClickSearchMusic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310327q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPublicTimeLine");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310328r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PublishVideoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310329s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PhotoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310330t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsAddTextIntro");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310331u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddTextIntroWordCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }
}
