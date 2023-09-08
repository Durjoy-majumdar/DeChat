package com.tencent.p014mm.modelstat;

import android.content.Intent;
import android.os.Bundle;
import ce2.C28544a;
import com.eclipsesource.mmv8.Platform;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.p014mm.autogen.events.HotPatchApplyEvent;
import com.tencent.p014mm.autogen.events.UploadSQLTraceEvent;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import eb0.C75592q0;
import ee0.C31566b;
import f40.C86709a0;
import f62.C31920a0;
import java.util.Map;
import ke3.C88144b;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C36666k0;

/* renamed from: com.tencent.mm.modelstat.o */
public class C29039o extends C31566b.C31567a implements C35141t {

    /* renamed from: e */
    public static final /* synthetic */ int f79581e = 0;

    /* renamed from: com.tencent.mm.modelstat.o$a */
    public class C29040a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f79582d;

        public C29040a(C29039o oVar, long j) {
            this.f79582d = j;
        }

        public void run() {
            long nowMilliSecond = Util.nowMilliSecond();
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", Long.valueOf(C29039o.m38533mI(new C86009m1(C86709a0.m107535s().f251807e), this.f79582d)), C86709a0.m107535s().f251807e);
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", Long.valueOf(C29039o.m38533mI(new C86009m1(C86709a0.m107535s().f251805c), this.f79582d)), C86709a0.m107535s().f251805c);
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", Long.valueOf(C29039o.m38533mI(new C86009m1(C86709a0.m107535s().f251805c), this.f79582d)), C86709a0.m107535s().f251805c);
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", Long.valueOf(C29039o.m38533mI(new C86009m1(C86709a0.m107535s().f251806d), this.f79582d)), C86709a0.m107535s().f251806d);
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", Long.valueOf(C29039o.m38533mI(new C86009m1(C72994y1.f212832a), this.f79582d)), C72994y1.f212832a);
            Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile finish %s", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
        }
    }

    /* renamed from: com.tencent.mm.modelstat.o$b */
    public class C29041b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f79583d;

        /* renamed from: e */
        public final /* synthetic */ String f79584e;

        public C29041b(C29039o oVar, int i, String str) {
            this.f79583d = i;
            this.f79584e = str;
        }

        public void run() {
            int i = this.f79583d;
            if (i == 1) {
                ThreadPool.post((Runnable) new C36666k0(C86709a0.m107535s().f251806d + this.f79584e, C75592q0.m90789s(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
            } else if (i == 2) {
                ThreadPool.post((Runnable) new C36666k0(C86709a0.m107535s().f251807e + this.f79584e, C75592q0.m90789s(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
            } else if (i == 3) {
                ThreadPool.post((Runnable) new C36666k0(this.f79584e, C75592q0.m90789s(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
            }
        }

        public String toString() {
            return super.toString() + "|onPreAddMessage";
        }
    }

    /* renamed from: com.tencent.mm.modelstat.o$c */
    public static class C29042c {

        /* renamed from: a */
        public static C29039o f79585a = new C29039o();
    }

    /* renamed from: mI */
    public static long m38533mI(C86009m1 m1Var, long j) {
        long r;
        long j2 = 0;
        try {
            C86009m1[] u = m1Var.mo119984u();
            for (int i = 0; i < u.length; i++) {
                if (u[i].mo119977o()) {
                    r = m38533mI(u[i], j);
                } else {
                    if (u[i].mo119980r() > j) {
                        Log.m105925i("MicroMsg.NetStatMsgExtension", "getFolderSize filesize:%s [%s]", Long.valueOf(u[i].mo119980r()), u[i].mo119976n());
                    }
                    r = u[i].mo119980r();
                }
                j2 += r;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetStatMsgExtension", "getFolderSize :%s", Util.stackTraceToString(e));
        }
        return j2;
    }

    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.NetStatMsgExtension", "skip ipxx stat while account not set");
            return null;
        }
        String str = aVar.f94242a.f227631h.f141175d;
        Log.m105919d("MicroMsg.NetStatMsgExtension", "onPreAddMessage %s", str);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Log.m105925i("MicroMsg.NetStatMsgExtension", "get ipxx cmd=%s", str);
        Map<String, String> parseXml = XmlParser.parseXml(str, FileReaderHelper.OPEN_FILE_FROM_CMD, (String) null);
        if (parseXml == null) {
            Map<String, String> parseXml2 = XmlParser.parseXml(str, "ClearCache", (String) null);
            if (parseXml2 != null) {
                long j = Util.getLong(parseXml2.get(".ClearCache.androidCacheMask"), 0);
                Intent intent = new Intent();
                intent.putExtra("key_mask", j);
                intent.putExtra("key_message", parseXml2.get(".ClearCache.message"));
                C88144b.m109801s(MMApplicationContext.getContext(), ".ui.ClearCacheUI", intent, (Bundle) null);
            } else {
                Map<String, String> parseXml3 = XmlParser.parseXml(str, "uploadFiles", (String) null);
                if (parseXml3 != null && !parseXml3.isEmpty()) {
                    C28544a.INSTANCE.mo56046b(parseXml3);
                }
            }
        } else {
            int i = Util.getInt(parseXml.get(".cmd.trace.$code"), -1);
            if (i <= 0) {
                int i2 = Util.getInt(parseXml.get(".cmd.hprof.$type"), -1);
                if (i2 > 0) {
                    Log.m105919d("MicroMsg.NetStatMsgExtension", "hprof type: %d", Integer.valueOf(i2));
                    return null;
                } else if (Platform.ANDROID.equalsIgnoreCase(parseXml.get(".cmd.prconfig.$os"))) {
                    HotPatchApplyEvent hotPatchApplyEvent = new HotPatchApplyEvent();
                    if (!"clear".equalsIgnoreCase(parseXml.get(".cmd.prconfig.$op"))) {
                        hotPatchApplyEvent.f78833d.f78834a = parseXml.get(".cmd.prconfig.xml.$url");
                        hotPatchApplyEvent.f78833d.f78835b = parseXml.get(".cmd.prconfig.xml.$signature");
                        hotPatchApplyEvent.f78833d.f78836c = parseXml.get(".cmd.prconfig.$url");
                        hotPatchApplyEvent.f78833d.f78837d = parseXml.get(".cmd.prconfig.$signature");
                    } else if (!BuildInfo.REV.equalsIgnoreCase(parseXml.get(".cmd.prconfig.$revision"))) {
                        return null;
                    } else {
                        Log.m105928w("MicroMsg.NetStatMsgExtension", "receive cmd to clear cur patch.");
                        hotPatchApplyEvent.f78833d.f78839f = 1;
                    }
                    hotPatchApplyEvent.asyncPublish(C86709a0.m107525e().getLooper());
                    return null;
                } else {
                    int i3 = Util.getInt(parseXml.get(".cmd.clearfile.$fb"), -1);
                    if (i3 == 1) {
                        C86709a0.m107525e().postToWorker(new C29040a(this, (long) Util.getInt(parseXml.get(".cmd.clearfile.$ps"), 1048576)));
                    } else if (i3 == 2) {
                        String str2 = parseXml.get(".cmd.clearfile.$pd");
                        C86009m1 m1Var = new C86009m1(str2);
                        Object[] objArr = new Object[2];
                        objArr[0] = str2;
                        long j2 = -1;
                        objArr[1] = Long.valueOf(m1Var.mo119967g() ? m1Var.mo119980r() : -1);
                        Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile delete :[%s] length:%s", objArr);
                        C86013q1.m106447h(str2);
                        C86009m1 m1Var2 = new C86009m1(str2);
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = str2;
                        if (m1Var2.mo119967g()) {
                            j2 = m1Var2.mo119980r();
                        }
                        objArr2[1] = Long.valueOf(j2);
                        Log.m105925i("MicroMsg.NetStatMsgExtension", "clearfile delete finish :[%s] length:%s", objArr2);
                    } else if (i3 == 3) {
                        Log.m105924i("MicroMsg.NetStatMsgExtension", "running  clearfile start:" + C86709a0.m107535s().mo121139f() + ".tem");
                        StringBuilder sb = new StringBuilder();
                        sb.append(C86709a0.m107535s().mo121139f());
                        sb.append(".tem");
                        C86013q1.m106447h(sb.toString());
                        C86013q1.m106447h(C86709a0.m107535s().mo121140g() + ".tem");
                        Log.m105924i("MicroMsg.NetStatMsgExtension", "running  clearfile end:" + C86709a0.m107535s().mo121139f() + ".tem");
                    }
                    int i4 = Util.getInt(parseXml.get(".cmd.updzh.$pt"), -1);
                    String str3 = parseXml.get(".cmd.updzh.$pd");
                    Log.m105919d("MicroMsg.NetStatMsgExtension", "StackReportUploader pt:%d pd:%s", Integer.valueOf(i4), str3);
                    if (i4 > 0 && !Util.isNullOrNil(str3)) {
                        C86709a0.m107525e().postToWorker(new C29041b(this, i4, str3));
                    }
                    int i5 = Util.getInt(parseXml.get(".cmd.testbizad.type"), -1);
                    if (i5 > 0) {
                        ((C31920a0) C86312j.m106911c(C31920a0.class)).mo58431Wg(i5, parseXml.get(".cmd.testbizad.content"));
                        return null;
                    }
                    C28544a.INSTANCE.mo56046b(parseXml);
                    if (Platform.ANDROID.equalsIgnoreCase(parseXml.get(".cmd.magicpkg.$os"))) {
                        String str4 = parseXml.get(".cmd.magicpkg.$pkgid");
                        Log.m105925i("MicroMsg.NetStatMsgExtension", "processMagicBootsCmd pkgid:%s", str4);
                        if (!Util.isNullOrNil(str4)) {
                            ((C30211n0) C86312j.m106911c(C30211n0.class)).X90(str4, parseXml.get(".cmd.magicpkg.$url"), parseXml.get(".cmd.magicpkg.$signature"), parseXml.get(".cmd.magicpkg.$op"));
                        }
                    }
                }
            } else if (i == 6) {
                new UploadSQLTraceEvent().publish();
                return null;
            } else {
                String str5 = parseXml.get(".cmd.trace.$class");
                Util.getInt(parseXml.get(".cmd.trace.$size"), 0);
                Util.getInt(parseXml.get(".cmd.trace.$type"), 0);
                return null;
            }
        }
        Log.appenderFlush();
        C86709a0.m107524d().f256809d.mo55473f0(str);
        try {
            Thread.sleep(50, 0);
        } catch (Exception unused) {
        }
        LogLogic.initIPxxLogInfo();
        MMProtocalJni.setProtocalJniLogLevel(Log.getLogLevel());
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    public void qu0(int i, int i2, int i3, int i4) {
        if (C86709a0.m107523b().mo121114l()) {
            if (!C86709a0.m107528h().f251724a.f251792d) {
                Log.m105924i("MicroMsg.NetStatMsgExtension", "kernel has not startup");
                return;
            }
            Log.m105925i("MicroMsg.NetStatMsgExtension", "reportNetFlow wifi[%d, %d] mobile[%d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            long j = 0;
            if (C114786m0.m161568a(MMApplicationContext.getContext())) {
                long j2 = i > 0 ? (long) i : 0;
                if (i2 > 0) {
                    j = (long) i2;
                }
                C114749s.m161433b(j2, j, 0);
                return;
            }
            long j3 = i3 > 0 ? (long) i3 : 0;
            if (i4 > 0) {
                j = (long) i4;
            }
            C114749s.m161432a(j3, j, 0);
        }
    }
}
