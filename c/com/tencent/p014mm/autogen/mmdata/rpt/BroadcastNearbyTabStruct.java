package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BroadcastNearbyTabStruct */
public final class BroadcastNearbyTabStruct extends C61103a {

    /* renamed from: d */
    public String f48210d = "";

    /* renamed from: e */
    public String f48211e = "";

    /* renamed from: f */
    public String f48212f = "";

    /* renamed from: g */
    public long f48213g;

    /* renamed from: h */
    public long f48214h;

    /* renamed from: i */
    public String f48215i = "";

    /* renamed from: j */
    public long f48216j;

    /* renamed from: k */
    public long f48217k;

    /* renamed from: l */
    public long f48218l;

    /* renamed from: m */
    public long f48219m;

    /* renamed from: n */
    public String f48220n = "";

    /* renamed from: o */
    public String f48221o = "";

    /* renamed from: p */
    public String f48222p = "";

    /* renamed from: q */
    public long f48223q;

    /* renamed from: r */
    public long f48224r;

    /* renamed from: s */
    public long f48225s;

    /* renamed from: t */
    public long f48226t;

    /* renamed from: u */
    public long f48227u;

    /* renamed from: v */
    public long f48228v;

    /* renamed from: j */
    public int mo1004j() {
        return 21855;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48210d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48211e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48212f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48213g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48214h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48215i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48216j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48217k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48218l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48219m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48220n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48221o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48222p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48223q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48224r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48225s);
        stringBuffer.append(",");
        stringBuffer.append(this.f48226t);
        stringBuffer.append(",");
        stringBuffer.append(this.f48227u);
        stringBuffer.append(",");
        stringBuffer.append(this.f48228v);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48210d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48211e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48212f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("nearby_uin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48213g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("distance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48214h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("district");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48215i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("if_sns");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48216j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48217k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionTS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48218l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("filterType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48219m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("nearby_username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48220n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("city");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48221o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("country");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48222p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("if_finder");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48223q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("if_signature");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48224r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("if_nickname_has_emoji");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48225s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("to_user_pos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48226t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("to_user_gender");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48227u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("staytime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48228v);
        return stringBuffer.toString();
    }
}
