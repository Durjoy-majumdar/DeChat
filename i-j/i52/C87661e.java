package i52;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.console.C92618a;
import com.tencent.p014mm.plugin.magicbrush.C30204k0;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.file.XVFSFile;
import d42.C31066c0;
import d42.C31068j;
import di3.C86312j;
import e42.C31415g;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import p52.C117990g;
import q52.C35766o;
import tw0.C90584e;
import tw0.C90586i;
import tw0.C90587j;

/* renamed from: i52.e */
public class C87661e {

    /* renamed from: a */
    public static C87661e f253906a;

    /* renamed from: i52.e$a */
    public class C87662a implements C90586i {

        /* renamed from: a */
        public final /* synthetic */ String f253907a;

        /* renamed from: b */
        public final /* synthetic */ WxaMagicPkgInfo f253908b;

        /* renamed from: c */
        public final /* synthetic */ C31066c0 f253909c;

        public C87662a(String str, WxaMagicPkgInfo wxaMagicPkgInfo, C31066c0 c0Var) {
            this.f253907a = str;
            this.f253908b = wxaMagicPkgInfo;
            this.f253909c = c0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo122087a(List list) {
        }

        /* renamed from: b */
        public void mo122088b(C90587j jVar) {
            C90587j jVar2 = jVar;
            Class cls = IMagicBrushMonitor.class;
            C87661e eVar = C87661e.this;
            String str = this.f253907a;
            eVar.getClass();
            C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0("MagicPkgSyncSTORAGE", (String) null);
            if (wt02 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C31415g b = wt02.mo57964b("MagicPkgSyncSTORAGE", "MagicPkgIntervalTime" + str, String.valueOf(currentTimeMillis), "String");
                Log.m105925i("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time:%d,errNo:%d,errMsg:%s", str, Long.valueOf(currentTimeMillis), Integer.valueOf(b.f84089a), b.f84090b);
            } else {
                Log.m105921e("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time fail mmkv is nil", str);
            }
            if (!Util.isNullOrNil(jVar2.f260272d)) {
                WxaMagicPkgInfo wxaMagicPkgInfo = this.f253908b;
                if (wxaMagicPkgInfo == null || Util.isNullOrNil(wxaMagicPkgInfo.f81572o) || Util.isNullOrNil(jVar2.f260280l) || Integer.parseInt(this.f253908b.f81572o) < Integer.parseInt(jVar2.f260280l)) {
                    Log.m105925i("MicroMsg.MagicPkgLogic", "start to download magicpkg:%s,patchid:%s,url:%s", jVar2.f260278j, jVar2.f260274f, jVar2.f260272d);
                    C87657d.INSTANCE.mo122077a(jVar2, this.f253908b, this.f253907a, this.f253909c);
                    C115669n.INSTANCE.mo175913w(1909, 7, 1);
                    String str2 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo2 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str2, wxaMagicPkgInfo2 != null ? wxaMagicPkgInfo2.f81571n : null, wxaMagicPkgInfo2 != null ? wxaMagicPkgInfo2.f81572o : null, wxaMagicPkgInfo2 != null ? wxaMagicPkgInfo2.f81566f : null, 0, magicPkgScene, 1, 0);
                    return;
                }
                Log.m105925i("MicroMsg.MagicPkgLogic", "checkMagicPkg, pkgId:%s,patchId:%s,cur version:%s big than svr version:%s", jVar2.f260278j, jVar2.f260274f, this.f253908b.f81572o, jVar2.f260280l);
                C115669n.INSTANCE.mo175913w(1909, 20, 1);
                String str3 = this.f253907a;
                WxaMagicPkgInfo wxaMagicPkgInfo3 = this.f253908b;
                IMagicBrushMonitor.MagicPkgScene magicPkgScene2 = IMagicBrushMonitor.MagicPkgScene.Check;
                C87412m.m108594g(magicPkgScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str3, wxaMagicPkgInfo3 != null ? wxaMagicPkgInfo3.f81571n : null, wxaMagicPkgInfo3 != null ? wxaMagicPkgInfo3.f81572o : null, wxaMagicPkgInfo3 != null ? wxaMagicPkgInfo3.f81566f : null, 0, magicPkgScene2, 2, 10003);
                C31066c0 c0Var = this.f253909c;
                if (c0Var != null) {
                    ((C92618a.C80834a) c0Var).mo112588a(-1, "cur version big than svr version");
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.MagicPkgLogic", "checkMagicPkg, url is null, lowerPkgId:" + this.f253907a);
            C31066c0 c0Var2 = this.f253909c;
            if (c0Var2 != null) {
                WxaMagicPkgInfo wxaMagicPkgInfo4 = this.f253908b;
                if (wxaMagicPkgInfo4 != null) {
                    ((C92618a.C80834a) c0Var2).mo112589b(wxaMagicPkgInfo4);
                } else {
                    ((C92618a.C80834a) c0Var2).mo112588a(-1, "url is nil");
                }
            }
            switch (jVar2.f260277i) {
                case -1:
                    String str4 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo5 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene3 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene3, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str4, wxaMagicPkgInfo5 != null ? wxaMagicPkgInfo5.f81571n : null, wxaMagicPkgInfo5 != null ? wxaMagicPkgInfo5.f81572o : null, wxaMagicPkgInfo5 != null ? wxaMagicPkgInfo5.f81566f : null, 0, magicPkgScene3, 2, 10000);
                    return;
                case 1:
                    String str5 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo6 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene4 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene4, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str5, wxaMagicPkgInfo6 != null ? wxaMagicPkgInfo6.f81571n : null, wxaMagicPkgInfo6 != null ? wxaMagicPkgInfo6.f81572o : null, wxaMagicPkgInfo6 != null ? wxaMagicPkgInfo6.f81566f : null, 0, magicPkgScene4, 2, 1);
                    return;
                case 2:
                    String str6 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo7 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene5 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene5, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str6, wxaMagicPkgInfo7 != null ? wxaMagicPkgInfo7.f81571n : null, wxaMagicPkgInfo7 != null ? wxaMagicPkgInfo7.f81572o : null, wxaMagicPkgInfo7 != null ? wxaMagicPkgInfo7.f81566f : null, 0, magicPkgScene5, 2, 2);
                    return;
                case 3:
                    String str7 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo8 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene6 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene6, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str7, wxaMagicPkgInfo8 != null ? wxaMagicPkgInfo8.f81571n : null, wxaMagicPkgInfo8 != null ? wxaMagicPkgInfo8.f81572o : null, wxaMagicPkgInfo8 != null ? wxaMagicPkgInfo8.f81566f : null, 0, magicPkgScene6, 2, 3);
                    return;
                case 4:
                    String str8 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo9 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene7 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene7, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str8, wxaMagicPkgInfo9 != null ? wxaMagicPkgInfo9.f81571n : null, wxaMagicPkgInfo9 != null ? wxaMagicPkgInfo9.f81572o : null, wxaMagicPkgInfo9 != null ? wxaMagicPkgInfo9.f81566f : null, 0, magicPkgScene7, 2, 4);
                    return;
                case 5:
                    String str9 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo10 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene8 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene8, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str9, wxaMagicPkgInfo10 != null ? wxaMagicPkgInfo10.f81571n : null, wxaMagicPkgInfo10 != null ? wxaMagicPkgInfo10.f81572o : null, wxaMagicPkgInfo10 != null ? wxaMagicPkgInfo10.f81566f : null, 0, magicPkgScene8, 2, 5);
                    return;
                case 6:
                    String str10 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo11 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene9 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene9, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str10, wxaMagicPkgInfo11 != null ? wxaMagicPkgInfo11.f81571n : null, wxaMagicPkgInfo11 != null ? wxaMagicPkgInfo11.f81572o : null, wxaMagicPkgInfo11 != null ? wxaMagicPkgInfo11.f81566f : null, 0, magicPkgScene9, 2, 6);
                    return;
                default:
                    String str11 = this.f253907a;
                    WxaMagicPkgInfo wxaMagicPkgInfo12 = this.f253908b;
                    IMagicBrushMonitor.MagicPkgScene magicPkgScene10 = IMagicBrushMonitor.MagicPkgScene.Check;
                    C87412m.m108594g(magicPkgScene10, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str11, wxaMagicPkgInfo12 != null ? wxaMagicPkgInfo12.f81571n : null, wxaMagicPkgInfo12 != null ? wxaMagicPkgInfo12.f81572o : null, wxaMagicPkgInfo12 != null ? wxaMagicPkgInfo12.f81566f : null, 0, magicPkgScene10, 2, 10001);
                    return;
            }
        }
    }

    /* renamed from: d */
    public static C87661e m109006d() {
        if (f253906a == null) {
            synchronized (C87661e.class) {
                f253906a = new C87661e();
            }
        }
        return f253906a;
    }

    /* renamed from: a */
    public boolean mo122079a(String str) {
        String str2 = str;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.MagicPkgLogic", "check interval pkgid is nil");
            return false;
        }
        String str3 = null;
        C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0("MagicPkgSyncSTORAGE", (String) null);
        if (wt02 != null) {
            String str4 = "MagicPkgIntervalTime" + str2;
            Object[] w = wt02.mo57966w("MagicPkgSyncSTORAGE", str4);
            C31415g gVar = (C31415g) w[0];
            long currentTimeMillis = System.currentTimeMillis();
            C31415g gVar2 = C31415g.C7595b.f25862a;
            if (gVar == gVar2) {
                str3 = (String) w[1];
            }
            long parseLong = str3 == null ? 0 : Long.parseLong(str3);
            if (gVar != gVar2 || parseLong == 0) {
                int nextInt = new Random().nextInt(v2helper.VOIP_ENC_HEIGHT_LV1);
                long j = (currentTimeMillis - 21600000) + (((long) nextInt) * 60000);
                C31415g b = wt02.mo57964b("MagicPkgSyncSTORAGE", str4, String.valueOf(j), "String");
                Log.m105925i("MicroMsg.MagicPkgLogic", ":%s try to update after %d minute currentTime %s lastUpdate %s,update interval time,errNo:%d,errMsg:%s", str2, Integer.valueOf(nextInt), Long.valueOf(j), Long.valueOf(parseLong), Integer.valueOf(b.f84089a), b.f84090b);
            } else {
                long j2 = currentTimeMillis - parseLong;
                if (j2 >= 21600000 || j2 < 0) {
                    int i = Calendar.getInstance().get(11);
                    Log.m105925i("MicroMsg.MagicPkgLogic", "try to update pkg :%s,hour %d", str2, Integer.valueOf(i));
                    if (i != 8) {
                        return true;
                    }
                    int nextInt2 = new Random().nextInt(60);
                    long j3 = (currentTimeMillis - 21600000) + (((long) nextInt2) * 60000);
                    C31415g b2 = wt02.mo57964b("MagicPkgSyncSTORAGE", str4, String.valueOf(j3), "String");
                    Log.m105925i("MicroMsg.MagicPkgLogic", ":%s try to update random after %d minute currentTime %s lastUpdate %s,update interval time,errNo:%d,errMsg:%s", str2, Integer.valueOf(nextInt2), Long.valueOf(j3), Long.valueOf(parseLong), Integer.valueOf(b2.f84089a), b2.f84090b);
                } else {
                    Log.m105925i("MicroMsg.MagicPkgLogic", "It's not time to update magic pkg:%s. please wait %d minute", str2, Long.valueOf((21600000 - j2) / 60000));
                }
            }
        } else {
            Log.m105921e("MicroMsg.MagicPkgLogic", "check interval pkg:%s,get storage fail,storage is nil", str2);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo122080b(String str, String str2, boolean z, C31066c0 c0Var) {
        WxaMagicPkgInfo wxaMagicPkgInfo;
        C31066c0 c0Var2 = c0Var;
        Class cls = IMagicBrushMonitor.class;
        Log.m105925i("MicroMsg.MagicPkgLogic", "checkMagicPkg pkgId:%s,baseId:%s", str, str2);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.MagicPkgLogic", "checkMagicPkg invaild pkgid");
            return false;
        }
        String lowerCase = str.toLowerCase();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1909, 6, 1);
        WxaMagicPkgInfo e = mo122082e(lowerCase);
        if (e == null || !e.f81571n.equalsIgnoreCase("debug")) {
            String str3 = "default";
            if (e == null) {
                IMagicBrushMonitor.MagicPkgScene magicPkgScene = IMagicBrushMonitor.MagicPkgScene.Check;
                C87412m.m108594g(magicPkgScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                wxaMagicPkgInfo = e;
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(lowerCase, (String) null, (String) null, (String) null, 0, magicPkgScene, 0, 0);
            } else {
                if (!str2.isEmpty()) {
                    str3 = str2;
                } else if (!Util.isNullOrNil(e.f81571n)) {
                    str3 = e.f81571n;
                }
                IMagicBrushMonitor.MagicPkgScene magicPkgScene2 = IMagicBrushMonitor.MagicPkgScene.Check;
                C87412m.m108594g(magicPkgScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                IMagicBrushMonitor iMagicBrushMonitor = (IMagicBrushMonitor) C86312j.m106911c(cls);
                String str4 = null;
                String str5 = e != null ? e.f81571n : null;
                String str6 = e != null ? e.f81572o : null;
                if (e != null) {
                    str4 = e.f81566f;
                }
                String str7 = str4;
                wxaMagicPkgInfo = e;
                iMagicBrushMonitor.ir0(lowerCase, str5, str6, str7, 1, magicPkgScene2, 0, 0);
            }
            String str8 = str3;
            Log.m105925i("MicroMsg.MagicPkgLogic", "realBaseId is %s", str8);
            ((C90584e) C86312j.m106911c(C90584e.class)).G60(lowerCase, str8, "", z, new C87662a(lowerCase, wxaMagicPkgInfo, c0Var2));
            return true;
        }
        Log.m105924i("MicroMsg.MagicPkgLogic", "debug pkg no need download, local pkg in effect");
        if (c0Var2 != null) {
            ((C92618a.C80834a) c0Var2).mo112589b(e);
        }
        nVar.mo175913w(1909, 9, 1);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106436R(r7, r4) == 0) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo mo122081c(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            java.lang.String r3 = "MicroMsg.MagicPkgPath"
            java.lang.String r4 = "pkgDebugFileExist pkgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            java.lang.String r1 = "debug"
            java.lang.String r4 = i52.C33209f.m39987c(r13, r1)
            q52.o r5 = q52.C35766o.f95534a
            java.lang.String r5 = r5.mo60387a(r4)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            r6 = 0
            if (r5 == 0) goto L_0x002a
            java.lang.String r2 = "pkg exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
        L_0x0027:
            r2 = 1
            goto L_0x009d
        L_0x002a:
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = r5.getPath()     // Catch:{ Exception -> 0x008f }
            if (r7 == 0) goto L_0x004e
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r2, r2)     // Catch:{ Exception -> 0x008f }
            java.lang.String r8 = r5.getPath()     // Catch:{ Exception -> 0x008f }
            boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x008f }
            if (r8 != 0) goto L_0x004e
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ Exception -> 0x008f }
            android.net.Uri$Builder r5 = r5.path(r7)     // Catch:{ Exception -> 0x008f }
            android.net.Uri r5 = r5.build()     // Catch:{ Exception -> 0x008f }
        L_0x004e:
            java.lang.String r7 = i52.C33209f.m39990f(r13, r1)     // Catch:{ Exception -> 0x008f }
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)     // Catch:{ Exception -> 0x008f }
            if (r8 == 0) goto L_0x0098
            java.lang.String r8 = "zip exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.vfs.f0$h r9 = r8.mo177799l(r5, r6)     // Catch:{ Exception -> 0x008f }
            boolean r10 = r9.mo177810a()     // Catch:{ Exception -> 0x008f }
            if (r10 != 0) goto L_0x006c
            r10 = 0
            goto L_0x0074
        L_0x006c:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a     // Catch:{ Exception -> 0x008f }
            java.lang.String r11 = r9.f348992b     // Catch:{ Exception -> 0x008f }
            boolean r10 = r10.mo119948x(r11)     // Catch:{ Exception -> 0x008f }
        L_0x0074:
            if (r10 != 0) goto L_0x0088
            com.tencent.mm.vfs.f0$h r5 = r8.mo177799l(r5, r9)     // Catch:{ Exception -> 0x008f }
            boolean r8 = r5.mo177810a()     // Catch:{ Exception -> 0x008f }
            if (r8 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            com.tencent.mm.vfs.FileSystem$c r8 = r5.f348991a     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = r5.f348992b     // Catch:{ Exception -> 0x008f }
            r8.mo119937g(r5)     // Catch:{ Exception -> 0x008f }
        L_0x0088:
            int r4 = com.tencent.p014mm.vfs.C86013q1.m106436R(r7, r4)     // Catch:{ Exception -> 0x008f }
            if (r4 != 0) goto L_0x0098
            goto L_0x0027
        L_0x008f:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = "pkgFileExist"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r7, r5)
        L_0x0098:
            java.lang.String r4 = "debug pkg not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x009d:
            if (r2 == 0) goto L_0x00d6
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r2 = new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo
            r2.<init>()
            r2.f81564d = r13
            java.lang.String r3 = i52.C33209f.m39990f(r13, r1)
            r2.f81567g = r3
            java.lang.String r13 = i52.C33209f.m39987c(r13, r1)
            r2.f81568h = r13
            r2.f81570j = r0
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r2.f81574q = r3
            r2.f81571n = r1
            java.lang.String r13 = r2.f81567g
            java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106456q(r13)
            r2.f81566f = r13
            java.lang.String r13 = "9999999"
            r2.f81572o = r13
            q52.o r13 = q52.C35766o.f95534a
            java.lang.String r0 = r2.f81568h
            java.lang.String r13 = r13.mo60387a(r0)
            r2.f81573p = r13
            return r2
        L_0x00d6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.C87661e.mo122081c(java.lang.String):com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo");
    }

    /* renamed from: e */
    public WxaMagicPkgInfo mo122082e(String str) {
        Bundle bundle;
        WxaMagicPkgInfo c = mo122081c(str);
        if (c != null) {
            Log.m105925i("MicroMsg.MagicPkgLogic", "return pkgId:%s, debug pkg info", str);
            return c;
        }
        try {
            bundle = C117990g.m166405a("getMagicPkgInfo", str, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.MagicPkgLogic", "null == bundle, appId:" + str);
            return null;
        }
        bundle.setClassLoader(WxaMagicPkgInfo.class.getClassLoader());
        WxaMagicPkgInfo wxaMagicPkgInfo = (WxaMagicPkgInfo) bundle.getParcelable("MagicPkg");
        if (!C33209f.m39991g(wxaMagicPkgInfo)) {
            if (wxaMagicPkgInfo != null) {
                String c2 = C33209f.m39987c(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n);
                String f = C33209f.m39990f(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n);
                String b = C33209f.m39986b(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81569i);
                C86013q1.m106445f(c2);
                C86013q1.m106447h(f);
                C86013q1.m106447h(b);
                try {
                    C117990g.m166405a("removeMagicPkgInfo", wxaMagicPkgInfo.f81564d, (Bundle) null);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e2, "", new Object[0]);
                }
                mo122085h(wxaMagicPkgInfo);
            } else {
                Log.m105920e("MicroMsg.MagicPkgLogic", "remove db fail,info is nil");
            }
            mo122085h(wxaMagicPkgInfo);
            Log.m105925i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n);
            C115669n.INSTANCE.mo175913w(1909, 31, 1);
            return null;
        }
        if (Util.isNullOrNil(wxaMagicPkgInfo.f81573p)) {
            if (Util.isNullOrNil(wxaMagicPkgInfo.f81569i)) {
                wxaMagicPkgInfo.f81573p = C35766o.f95534a.mo60387a(wxaMagicPkgInfo.f81568h);
            } else {
                wxaMagicPkgInfo.f81573p = wxaMagicPkgInfo.f81567g;
            }
        }
        return wxaMagicPkgInfo;
    }

    /* renamed from: f */
    public List<WxaMagicPkgInfo> mo122083f() {
        Bundle bundle;
        try {
            bundle = C117990g.m166405a("getMagicPkgList", (String) null, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.MagicPkgLogic", "getMagicPkgList bundle is null.");
            return null;
        }
        bundle.setClassLoader(WxaMagicPkgInfo.class.getClassLoader());
        if (bundle.containsKey("MagicPkgList")) {
            return bundle.getParcelableArrayList("MagicPkgList");
        }
        return null;
    }

    /* renamed from: g */
    public void mo122084g(String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd pkgId:%s,op:%s,url:%s", str, str4, str2);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
            Log.m105920e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild argc");
            return;
        }
        String[] split = str4.split("#", 6);
        if (split.length != 6 || Util.isNullOrNil(split[0]) || Util.isNullOrNil(split[1]) || Util.isNullOrNil(split[2]) || Util.isNullOrNil(split[3]) || Util.isNullOrNil(split[4]) || Util.isNullOrNil(split[5])) {
            Log.m105920e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild op");
            return;
        }
        String lowerCase = str.toLowerCase();
        String str5 = split[0];
        String str6 = split[1];
        String str7 = split[2];
        String str8 = split[3];
        String str9 = split[4];
        String str10 = split[5];
        WxaMagicPkgInfo e = mo122082e(lowerCase);
        if (Util.isNullOrNil(str6) || e == null || Util.isNullOrNil(e.f81572o) || !str6.equalsIgnoreCase(e.f81572o)) {
            Log.m105924i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd version not match");
            return;
        }
        C90587j jVar = new C90587j();
        jVar.f260273e = str3;
        jVar.f260272d = new String(Base64.decode(str2, 0));
        jVar.f260271c = Integer.valueOf(Integer.parseInt(str8));
        jVar.f260274f = str9;
        jVar.f260278j = str;
        jVar.f260279k = str9;
        jVar.f260280l = str7;
        jVar.f260281m = str10;
        C87657d.INSTANCE.mo122077a(jVar, e, lowerCase, (C31066c0) null);
    }

    /* renamed from: h */
    public void mo122085h(WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo != null) {
            String c = C33209f.m39987c(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n);
            String f = C33209f.m39990f(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n);
            String b = C33209f.m39986b(wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81569i);
            C86013q1.m106445f(c);
            C86013q1.m106447h(f);
            C86013q1.m106447h(b);
            C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0("MagicPkgSyncSTORAGE", (String) null);
            if (wt02 != null) {
                C31415g a = wt02.mo57963a("MagicPkgSyncSTORAGE", wxaMagicPkgInfo.f81564d);
                if (a != C31415g.C7595b.f25862a) {
                    Log.m105925i("MicroMsg.MagicPkgLogic", "remove storage fail,errNo:%d,errMsg:%s", Integer.valueOf(a.f84089a), a.f84090b);
                    return;
                }
                return;
            }
            Log.m105921e("MicroMsg.MagicPkgLogic", "pkg:%s,remove storage fail,storage is nil", wxaMagicPkgInfo.f81564d);
            return;
        }
        Log.m105920e("MicroMsg.MagicPkgLogic", "remove storage fail,info is nil");
    }

    /* renamed from: i */
    public void mo122086i(WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo == null) {
            Log.m105920e("MicroMsg.MagicPkgLogic", "app is empty.");
        } else if (Util.isNullOrNil(wxaMagicPkgInfo.f81567g)) {
            Log.m105920e("MicroMsg.MagicPkgLogic", "app path is empty.");
        } else {
            Uri n = C116299g2.m163858n(wxaMagicPkgInfo.f81567g);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105920e("MicroMsg.MagicPkgLogic", "app file isn't exist.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("MagicPkg", wxaMagicPkgInfo);
            try {
                C117990g.m166405a("insertMagicPkgInfo", wxaMagicPkgInfo.f81564d, bundle);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e, "", new Object[0]);
            }
            C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0("MagicPkgSyncSTORAGE", (String) null);
            if (wt02 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pkgId", wxaMagicPkgInfo.f81564d);
                hashMap.put("url", wxaMagicPkgInfo.f81565e);
                hashMap.put("md5", wxaMagicPkgInfo.f81566f);
                hashMap.put("pkgpath", wxaMagicPkgInfo.f81567g);
                hashMap.put("unzippath", wxaMagicPkgInfo.f81568h);
                hashMap.put("originalName", wxaMagicPkgInfo.f81569i);
                hashMap.put("pkgtype", Integer.toString(wxaMagicPkgInfo.f81570j));
                hashMap.put("patchId", wxaMagicPkgInfo.f81571n);
                hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, wxaMagicPkgInfo.f81572o);
                hashMap.put("wxapath", wxaMagicPkgInfo.f81573p);
                Set keySet = hashMap.keySet();
                String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
                Arrays.sort(strArr);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strArr.length; i++) {
                    if (String.valueOf(hashMap.get(strArr[i])).trim().length() > 0) {
                        sb.append(strArr[i]);
                        sb.append(XVFSFile.PATH_SEPARATOR);
                        sb.append(String.valueOf(hashMap.get(strArr[i])).trim());
                    }
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
                C31415g b = wt02.mo57964b("MagicPkgSyncSTORAGE", wxaMagicPkgInfo.f81564d, sb.toString(), "String");
                if (b != C31415g.C7595b.f25862a) {
                    Log.m105925i("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,errNo:%d,errMsg:%s", wxaMagicPkgInfo.f81564d, Integer.valueOf(b.f84089a), b.f84090b);
                    return;
                }
                return;
            }
            Log.m105921e("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,storage is nil", wxaMagicPkgInfo.f81564d);
        }
    }
}
