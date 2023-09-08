package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct */
public final class SessionMsgSearchActionLogStruct extends C61103a {

    /* renamed from: d */
    public String f156817d = "";

    /* renamed from: e */
    public String f156818e = "";

    /* renamed from: f */
    public long f156819f = 0;

    /* renamed from: g */
    public long f156820g;

    /* renamed from: h */
    public long f156821h;

    /* renamed from: i */
    public String f156822i = "";

    /* renamed from: j */
    public long f156823j;

    /* renamed from: k */
    public long f156824k;

    /* renamed from: l */
    public long f156825l;

    /* renamed from: m */
    public long f156826m;

    /* renamed from: n */
    public long f156827n;

    /* renamed from: o */
    public String f156828o = "";

    /* renamed from: p */
    public long f156829p;

    /* renamed from: q */
    public long f156830q;

    /* renamed from: r */
    public long f156831r = 0;

    /* renamed from: s */
    public long f156832s;

    /* renamed from: t */
    public long f156833t;

    /* renamed from: u */
    public long f156834u;

    /* renamed from: j */
    public int mo1004j() {
        return 25884;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156817d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156818e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156819f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156820g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156821h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156822i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156823j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156824k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156825l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156826m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156827n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156828o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156829p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156830q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156831r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156832s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156833t);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156834u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156817d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchsessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156818e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156819f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156820g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156821h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SearchIntents.EXTRA_QUERY);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156822i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchcost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156823j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sub_tab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156824k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfImageDone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156825l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfAllImageDone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156826m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resultCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156827n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156828o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("loadingcost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156829p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("imagecnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156830q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageIdentify");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156831r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156832s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickPositionSameType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156833t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findercnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("verticalSearchEntrance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156834u);
        return stringBuffer.toString();
    }
}
