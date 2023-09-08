package com.tencent.p014mm.game.report.service;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.FileReaderHelper;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p156gj.C87203t;
import q20.C89449a;
import x10.C53277a;
import x10.C53283g;

/* renamed from: com.tencent.mm.game.report.service.a */
public final class C40315a {

    /* renamed from: a */
    public static final C40315a f108386a = new C40315a();

    /* renamed from: b */
    public static long f108387b;

    /* renamed from: c */
    public static final LinkedList<C53277a> f108388c = new LinkedList<>();

    /* renamed from: d */
    public static boolean f108389d;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/game/report/service/a$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "report-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.game.report.service.a$a */
    public static final class C40316a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            C40315a.f108386a.mo63007a((Bundle) obj);
        }
    }

    /* renamed from: com.tencent.mm.game.report.service.a$b */
    public static final class C40317b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C53277a f108390d;

        public C40317b(C53277a aVar) {
            this.f108390d = aVar;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C53283g gVar;
            Log.m105925i("MicroMsg.GameChatReport", "tryDoScene, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0 && (gVar = this.f108390d.f148860d) != null) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, Long.valueOf(gVar.f148875e));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_CHAT_UNREAD_MSG_STATE_BOOLEAN_SYNC, Boolean.valueOf(gVar.f148876f));
            }
            C40315a.f108389d = false;
            C40315a.f108386a.mo63008b();
            return 0;
        }
    }

    /* renamed from: a */
    public final synchronized void mo63007a(Bundle bundle) {
        if (bundle != null) {
            if (MMApplicationContext.isMainProcess()) {
                C53277a aVar = new C53277a();
                if (bundle.getInt(FileReaderHelper.OPEN_FILE_FROM_CMD, 0) == 1) {
                    if (f108387b == 0) {
                        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, 1000L);
                        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
                        f108387b = Util.nullAsNil((Long) f);
                    }
                    C53283g gVar = new C53283g();
                    long j = f108387b + 1;
                    f108387b = j;
                    gVar.f148875e = j;
                    gVar.f148874d = C87203t.m108278n();
                    gVar.f148876f = bundle.getBoolean("has_unread_msg", false);
                    aVar.f148860d = gVar;
                    C40315a aVar2 = f108386a;
                    synchronized (aVar2) {
                        if (C86709a0.m107523b().mo121114l()) {
                            if (!C86718e.m107551r()) {
                                f108388c.add(aVar);
                                aVar2.mo63008b();
                            }
                        }
                        Log.m105928w("MicroMsg.GameChatReport", "report, account not ready");
                    }
                }
            } else {
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C40316a.class, (C1256g) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo63008b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = f108389d     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "MicroMsg.GameChatReport"
            java.lang.String r1 = "tryDoScene isBusy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x005a }
            monitor-exit(r4)
            return
        L_0x000e:
            java.util.LinkedList<x10.a> r0 = f108388c     // Catch:{ all -> 0x005a }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "MicroMsg.GameChatReport"
            java.lang.String r1 = "waitingList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x005a }
            monitor-exit(r4)
            return
        L_0x001f:
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x005a }
            x10.a r0 = (x10.C53277a) r0     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0052
            r2 = 1
            f108389d = r2     // Catch:{ all -> 0x005a }
            ob0.c$b r2 = new ob0.c$b     // Catch:{ all -> 0x005a }
            r2.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/chatreport"
            r2.f127068c = r3     // Catch:{ all -> 0x005a }
            r3 = 4352(0x1100, float:6.098E-42)
            r2.f127069d = r3     // Catch:{ all -> 0x005a }
            r2.f127070e = r1     // Catch:{ all -> 0x005a }
            r2.f127071f = r1     // Catch:{ all -> 0x005a }
            r2.f127066a = r0     // Catch:{ all -> 0x005a }
            x10.b r3 = new x10.b     // Catch:{ all -> 0x005a }
            r3.<init>()     // Catch:{ all -> 0x005a }
            r2.f127067b = r3     // Catch:{ all -> 0x005a }
            ob0.c r2 = r2.mo72403a()     // Catch:{ all -> 0x005a }
            com.tencent.mm.game.report.service.a$b r3 = new com.tencent.mm.game.report.service.a$b     // Catch:{ all -> 0x005a }
            r3.<init>(r0)     // Catch:{ all -> 0x005a }
            ob0.C89144l0.m111429e(r2, r3, r1)     // Catch:{ all -> 0x005a }
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            if (r2 != 0) goto L_0x0058
            r4.mo63008b()     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r4)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.game.report.service.C40315a.mo63008b():void");
    }
}
