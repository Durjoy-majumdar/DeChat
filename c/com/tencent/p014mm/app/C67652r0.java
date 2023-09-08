package com.tencent.p014mm.app;

import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.C74940w0;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MainTabUI;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import jb0.C46452a;
import jb0.C46453b;
import jr2.C76439o;
import jr2.C99019x;

/* renamed from: com.tencent.mm.app.r0 */
public class C67652r0 {

    /* renamed from: c */
    public static C67652r0 f193463c;

    /* renamed from: a */
    public boolean f193464a;

    /* renamed from: b */
    public MMHandler f193465b = new C67653a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.app.r0$a */
    public class C67653a extends MMHandler {
        public C67653a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == -1999) {
                C67652r0 r0Var = C67652r0.this;
                if (!r0Var.f193464a) {
                    r0Var.getClass();
                    LauncherUI instance = LauncherUI.getInstance();
                    if (instance != null && instance.f214341q) {
                        instance.mo101375O7().mo101428l("tab_main");
                        HomeUI homeUI = instance.getHomeUI();
                        if (homeUI.f214272a) {
                            homeUI.f214273b = true;
                        }
                        C76439o d = C99019x.m128972d();
                        if (d != null) {
                            C94901o oVar = (C94901o) d;
                            SnsMethodCalculate.markStartTimeMs("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            oVar.mo131113e();
                            oVar.f275008n = 0;
                            oVar.f275009o = 0;
                            oVar.f275001g.clear();
                            oVar.f275002h = false;
                            SnsMethodCalculate.markEndTimeMs("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        }
                        for (Fragment next : instance.mo101375O7().f214445o.values()) {
                            if (!(next instanceof MainUI)) {
                                ((C74940w0) next).mo101233A();
                            }
                        }
                    }
                    System.gc();
                }
            } else if (i == -2999) {
                C67652r0 r0Var2 = C67652r0.this;
                if (!r0Var2.f193464a) {
                    r0Var2.getClass();
                    LauncherUI instance2 = LauncherUI.getInstance();
                    if (instance2 != null) {
                        MainTabUI O7 = instance2.mo101375O7();
                        if (O7.f214445o.containsKey(0)) {
                            ((C74940w0) O7.f214445o.get(0)).mo101233A();
                        }
                    }
                    if (C86709a0.m107523b().mo121114l()) {
                        if (C46453b.f125131g == null) {
                            synchronized (C46453b.class) {
                                if (C46453b.f125131g == null) {
                                    C46453b.f125131g = new C46453b();
                                }
                            }
                        }
                        C46453b bVar = C46453b.f125131g;
                        bVar.getClass();
                        C86709a0.m107525e().postToWorker(new C46452a(bVar));
                    }
                    System.gc();
                }
            }
        }
    }
}
