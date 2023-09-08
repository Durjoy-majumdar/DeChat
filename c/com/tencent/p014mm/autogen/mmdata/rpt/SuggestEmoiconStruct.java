package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct */
public final class SuggestEmoiconStruct extends C61103a {

    /* renamed from: d */
    public long f79168d = 0;

    /* renamed from: e */
    public String f79169e = "";

    /* renamed from: f */
    public String f79170f = "";

    /* renamed from: g */
    public long f79171g = 0;

    /* renamed from: h */
    public String f79172h = "";

    /* renamed from: i */
    public long f79173i = 0;

    /* renamed from: j */
    public String f79174j = "";

    /* renamed from: k */
    public String f79175k = "";

    /* renamed from: l */
    public String f79176l = "";

    /* renamed from: m */
    public String f79177m = "";

    /* renamed from: n */
    public long f79178n;

    /* renamed from: o */
    public long f79179o;

    /* renamed from: p */
    public String f79180p = "";

    /* renamed from: q */
    public String f79181q = "";

    /* renamed from: r */
    public String f79182r = "";

    /* renamed from: s */
    public long f79183s;

    /* renamed from: j */
    public int mo1004j() {
        return 10994;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79168d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79169e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79170f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79171g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79172h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79173i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79174j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79175k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f79176l);
        stringBuffer.append(",");
        stringBuffer.append(this.f79177m);
        stringBuffer.append(",");
        stringBuffer.append(this.f79178n);
        stringBuffer.append(",");
        stringBuffer.append(this.f79179o);
        stringBuffer.append(",");
        stringBuffer.append(this.f79180p);
        stringBuffer.append(",");
        stringBuffer.append(this.f79181q);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f79182r);
        stringBuffer.append(",");
        stringBuffer.append(this.f79183s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79168d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Word");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79169e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExpId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79170f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79171g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79172h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79173i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79174j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79175k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLocal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLocalSearch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79176l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WordVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79177m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WordType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79178n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WordSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79179o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79180p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79181q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("md5Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79182r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79183s);
        return stringBuffer.toString();
    }
}
