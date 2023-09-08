package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FowardMsgReportStruct */
public final class FowardMsgReportStruct extends C61103a {

    /* renamed from: d */
    public String f69506d = "";

    /* renamed from: e */
    public long f69507e;

    /* renamed from: f */
    public long f69508f;

    /* renamed from: g */
    public long f69509g;

    /* renamed from: h */
    public long f69510h;

    /* renamed from: i */
    public long f69511i;

    /* renamed from: j */
    public long f69512j;

    /* renamed from: k */
    public long f69513k;

    /* renamed from: l */
    public String f69514l = "";

    /* renamed from: m */
    public long f69515m;

    /* renamed from: n */
    public String f69516n = "";

    /* renamed from: o */
    public long f69517o;

    /* renamed from: p */
    public long f69518p;

    /* renamed from: q */
    public long f69519q;

    /* renamed from: r */
    public long f69520r;

    /* renamed from: s */
    public String f69521s = "";

    /* renamed from: t */
    public long f69522t;

    /* renamed from: j */
    public int mo1004j() {
        return 23009;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69506d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69507e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69508f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69509g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69510h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69511i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69512j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69513k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69514l);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69515m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69516n);
        stringBuffer.append(",");
        stringBuffer.append(this.f69517o);
        stringBuffer.append(",");
        stringBuffer.append(this.f69518p);
        stringBuffer.append(",");
        stringBuffer.append(this.f69519q);
        stringBuffer.append(",");
        stringBuffer.append(this.f69520r);
        stringBuffer.append(",");
        stringBuffer.append(this.f69521s);
        stringBuffer.append(",");
        stringBuffer.append(this.f69522t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MsgTypeList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69506d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecieveType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69507e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UsedListSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69508f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecentListSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69509g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateNew");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69510h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsMultiSelect");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69511i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69512j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickZone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69513k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69514l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppMsgInnerTypeList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TopSessionCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69515m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerAppMsgTypeList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69516n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69517o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LogVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69518p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OneLineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69519q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Del_count");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69520r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Del_list");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69521s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InGroupBox");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69522t);
        return stringBuffer.toString();
    }
}
