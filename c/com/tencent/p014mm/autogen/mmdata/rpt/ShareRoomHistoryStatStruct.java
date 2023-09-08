package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct */
public final class ShareRoomHistoryStatStruct extends C61103a {

    /* renamed from: A */
    public long f194389A = 0;

    /* renamed from: B */
    public long f194390B;

    /* renamed from: C */
    public long f194391C;

    /* renamed from: d */
    public String f194392d = "";

    /* renamed from: e */
    public int f194393e;

    /* renamed from: f */
    public int f194394f;

    /* renamed from: g */
    public long f194395g;

    /* renamed from: h */
    public long f194396h = 0;

    /* renamed from: i */
    public long f194397i = 0;

    /* renamed from: j */
    public String f194398j = "";

    /* renamed from: k */
    public long f194399k = 0;

    /* renamed from: l */
    public long f194400l = 0;

    /* renamed from: m */
    public long f194401m;

    /* renamed from: n */
    public long f194402n;

    /* renamed from: o */
    public long f194403o;

    /* renamed from: p */
    public long f194404p = 0;

    /* renamed from: q */
    public long f194405q = 0;

    /* renamed from: r */
    public long f194406r = 0;

    /* renamed from: s */
    public long f194407s = 0;

    /* renamed from: t */
    public String f194408t = "";

    /* renamed from: u */
    public long f194409u;

    /* renamed from: v */
    public long f194410v;

    /* renamed from: w */
    public long f194411w;

    /* renamed from: x */
    public long f194412x = 0;

    /* renamed from: y */
    public long f194413y = 0;

    /* renamed from: z */
    public int f194414z = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 20518;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194392d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194393e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194394f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194395g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194396h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194397i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194398j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194399k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194400l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194401m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194402n);
        stringBuffer.append(",");
        stringBuffer.append(this.f194403o);
        stringBuffer.append(",");
        stringBuffer.append(this.f194404p);
        stringBuffer.append(",");
        stringBuffer.append(this.f194405q);
        stringBuffer.append(",");
        stringBuffer.append(this.f194406r);
        stringBuffer.append(",");
        stringBuffer.append(this.f194407s);
        stringBuffer.append(",");
        stringBuffer.append(this.f194408t);
        stringBuffer.append(",");
        stringBuffer.append(this.f194409u);
        stringBuffer.append(",");
        stringBuffer.append(this.f194410v);
        stringBuffer.append(",");
        stringBuffer.append(this.f194411w);
        stringBuffer.append(",");
        stringBuffer.append(this.f194412x);
        stringBuffer.append(",");
        stringBuffer.append(this.f194413y);
        stringBuffer.append(",");
        stringBuffer.append(this.f194414z);
        stringBuffer.append(",");
        stringBuffer.append(this.f194389A);
        stringBuffer.append(",");
        stringBuffer.append(this.f194390B);
        stringBuffer.append(",");
        stringBuffer.append(this.f194391C);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RoomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194392d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSharable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194393e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasClickedShareEntrance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194394f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InvitedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194395g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DefaultShareCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194396h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194397i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareCountByType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194398j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194399k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExceedCountPopupCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194400l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExceedSizePopupCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194401m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickClearCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194402n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SlideSelectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194403o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SlideUnSelectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194404p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickSelectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194405q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickUnSelectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194406r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194407s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InvitedUsrs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194408t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194409u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ManualReTryTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194410v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareTextSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194411w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReSelectUpSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194412x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReSelectUpCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194413y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsAssociate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194414z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadFailedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194389A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadWaitPopupCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194390B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadFailPopupCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194391C);
        return stringBuffer.toString();
    }
}
