package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct */
public final class WxaUpdatableMsgReportStruct extends C61103a {

    /* renamed from: d */
    public String f237460d = "";

    /* renamed from: e */
    public String f237461e = "";

    /* renamed from: f */
    public long f237462f = 0;

    /* renamed from: g */
    public String f237463g = "";

    /* renamed from: h */
    public String f237464h = "";

    /* renamed from: i */
    public C80797c f237465i;

    /* renamed from: j */
    public C80796b f237466j;

    /* renamed from: k */
    public long f237467k = 0;

    /* renamed from: l */
    public String f237468l = "";

    /* renamed from: m */
    public C80798d f237469m;

    /* renamed from: n */
    public C80799e f237470n;

    /* renamed from: o */
    public C80795a f237471o;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct$a */
    public enum C80795a {
        undefined(0),
        normal(1000),
        plugin(1001),
        wxstore(1002),
        merchant(1003),
        wagame(1004),
        gift(1005);
        

        /* renamed from: d */
        public final int f237480d;

        /* access modifiers changed from: public */
        C80795a(int i) {
            this.f237480d = i;
        }

        /* renamed from: a */
        public static C80795a m98639a(int i) {
            if (i == 0) {
                return undefined;
            }
            switch (i) {
                case 1000:
                    return normal;
                case 1001:
                    return plugin;
                case 1002:
                    return wxstore;
                case 1003:
                    return merchant;
                case 1004:
                    return wagame;
                case 1005:
                    return gift;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct$b */
    public enum C80796b {
        SHAREAPPMSG(1),
        CLICKAPPMSG(2),
        CLICKSUBSCRIBETV(3),
        CLICKSTARTGAME(4);
        

        /* renamed from: d */
        public final int f237486d;

        /* access modifiers changed from: public */
        C80796b(int i) {
            this.f237486d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct$c */
    public enum C80797c {
        YES(1),
        NO(2);
        

        /* renamed from: d */
        public final int f237490d;

        /* access modifiers changed from: public */
        C80797c(int i) {
            this.f237490d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct$d */
    public enum C80798d {
        DEFAULT(0),
        DOING(1),
        DONE(2);
        

        /* renamed from: d */
        public final int f237495d;

        /* access modifiers changed from: public */
        C80798d(int i) {
            this.f237495d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct$e */
    public enum C80799e {
        DEFAULT(0),
        NOTSUBSCRIBE(1),
        SUBSCRIBE(2);
        

        /* renamed from: d */
        public final int f237500d;

        /* access modifiers changed from: public */
        C80799e(int i) {
            this.f237500d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16024;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237460d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237461e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237462f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237463g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237464h);
        stringBuffer.append(",");
        C80797c cVar = this.f237465i;
        int i = -1;
        stringBuffer.append(cVar != null ? cVar.f237490d : -1);
        stringBuffer.append(",");
        C80796b bVar = this.f237466j;
        stringBuffer.append(bVar != null ? bVar.f237486d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237467k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237468l);
        stringBuffer.append(",");
        C80798d dVar = this.f237469m;
        stringBuffer.append(dVar != null ? dVar.f237495d : -1);
        stringBuffer.append(",");
        C80799e eVar = this.f237470n;
        stringBuffer.append(eVar != null ? eVar.f237500d : -1);
        stringBuffer.append(",");
        C80795a aVar = this.f237471o;
        if (aVar != null) {
            i = aVar.f237480d;
        }
        stringBuffer.append(i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237460d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237461e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237462f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareTicket");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237463g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChattingId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237464h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsGroupChatting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237465i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237466j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237467k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneNote");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237468l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237469m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubScribeState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237470n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237471o);
        return stringBuffer.toString();
    }
}
