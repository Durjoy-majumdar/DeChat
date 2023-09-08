package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DiscoverFinderClickStruct */
public final class DiscoverFinderClickStruct extends C61103a {

    /* renamed from: d */
    public long f154959d;

    /* renamed from: e */
    public long f154960e;

    /* renamed from: f */
    public long f154961f;

    /* renamed from: g */
    public long f154962g;

    /* renamed from: h */
    public long f154963h;

    /* renamed from: i */
    public long f154964i;

    /* renamed from: j */
    public long f154965j;

    /* renamed from: k */
    public long f154966k;

    /* renamed from: l */
    public String f154967l = "";

    /* renamed from: m */
    public String f154968m = "";

    /* renamed from: n */
    public String f154969n = "";

    /* renamed from: o */
    public long f154970o;

    /* renamed from: j */
    public int mo1004j() {
        return 19025;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154959d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154960e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154961f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154962g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154963h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154964i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154965j);
        stringBuffer.append(",");
        stringBuffer.append(this.f154966k);
        stringBuffer.append(",");
        stringBuffer.append(this.f154967l);
        stringBuffer.append(",");
        stringBuffer.append(this.f154968m);
        stringBuffer.append(",");
        stringBuffer.append(this.f154969n);
        stringBuffer.append(",");
        stringBuffer.append(this.f154970o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ReddotFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154959d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasLocation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154960e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasLocationPermission");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154961f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FollowInitPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154962g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FriendInitPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154963h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LBSInitPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154964i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HotInitPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154965j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154966k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterRedDotId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154967l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154968m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154969n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AutoRefresh");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154970o);
        return stringBuffer.toString();
    }
}
