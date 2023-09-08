package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderInteractionSearchStruct */
public final class FinderInteractionSearchStruct extends C61103a {

    /* renamed from: d */
    public String f155370d = "";

    /* renamed from: e */
    public String f155371e = "";

    /* renamed from: f */
    public String f155372f = "";

    /* renamed from: g */
    public String f155373g = "";

    /* renamed from: h */
    public int f155374h;

    /* renamed from: i */
    public int f155375i;

    /* renamed from: j */
    public int f155376j;

    /* renamed from: k */
    public int f155377k;

    /* renamed from: l */
    public String f155378l = "";

    /* renamed from: m */
    public String f155379m = "";

    /* renamed from: n */
    public int f155380n;

    /* renamed from: o */
    public String f155381o = "";

    /* renamed from: p */
    public int f155382p;

    /* renamed from: q */
    public String f155383q = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26093;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155370d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155371e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155372f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155373g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155374h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155375i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155376j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155377k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155378l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155379m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155380n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155381o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155382p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155383q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155370d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClicktabcontextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155371e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155372f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155373g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155374h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155375i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155376j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155377k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TagText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155378l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueryText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155379m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155380n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155381o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155382p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155383q);
        return stringBuffer.toString();
    }
}
