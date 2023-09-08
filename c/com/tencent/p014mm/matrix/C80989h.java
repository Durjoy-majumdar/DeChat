package com.tencent.p014mm.matrix;

import android.app.Application;
import android.text.TextUtils;
import com.tencent.matrix.openglleak.hook.OpenGLHook;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import hm3.C32961g;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p1034se.C90177c;
import p1040te.C90399e;
import p1046ue.C90648b;
import p1046ue.C90650d;
import p1046ue.C90652e;
import p1053ve.C90771e;

/* renamed from: com.tencent.mm.matrix.h */
public class C80989h implements C90177c {

    /* renamed from: com.tencent.mm.matrix.h$a */
    public class C80990a implements C90399e.C90402c {
        public C80990a(C80989h hVar) {
        }

        /* renamed from: a */
        public void mo112812a(C90650d dVar) {
            String str;
            C90650d dVar2 = dVar;
            if (dVar2 == null) {
                Log.m105920e("MatrixDelegate", "OpenGLInfo null");
                return;
            }
            C90650d.C90651a aVar = dVar2.f260446e;
            C90650d.C90651a aVar2 = C90650d.C90651a.EGL_CONTEXT;
            if (aVar == aVar2) {
                C90648b bVar = new C90648b(aVar2);
                if (dVar2.f260447f != bVar) {
                    dVar2.f260447f = bVar;
                }
            } else if (dVar2.f260447f == null) {
                Log.m105920e("MatrixDelegate", "opengl res memory null");
                return;
            }
            Log.m105920e("LeakMonitorForBackstage", dVar.toString());
            String str2 = "";
            String str3 = "";
            if (dVar.mo124787b() != null) {
                str2 = dVar.mo124787b().replace(",", " ").replace("\n", ";").replace("\t", "");
                C90652e eVar = C90652e.f260459f;
                synchronized (eVar.f260461b) {
                    int indexOf = ((LinkedList) eVar.f260461b).indexOf(dVar2);
                    if (-1 == indexOf) {
                        str = "res already released, can not get native stack";
                    } else {
                        C90650d dVar3 = (C90650d) ((LinkedList) eVar.f260461b).get(indexOf);
                        if (dVar3 == null) {
                            str = "";
                        } else {
                            long j = dVar3.f260445d;
                            str = j != 0 ? OpenGLHook.dumpBriefNativeStack(j) : "";
                        }
                    }
                }
                str3 = str.replace("\n", "").replace("\t", "");
            }
            String a = dVar2.f260447f.mo124781a();
            if (!TextUtils.isEmpty(a)) {
                a = a.replace(",", " ").replace("\n", ";").replace("\t", "");
            }
            int ordinal = dVar2.f260446e.ordinal();
            int i = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 0 : 10 : 4 : 3 : 2 : 1;
            String valueOf = String.valueOf(OpenGLHook.getInstance().getResidualQueueSize());
            String valueOf2 = String.valueOf(dVar.mo124789d());
            String str4 = "";
            if (dVar.mo124786a() != null) {
                str4 = dVar.mo124786a().replace("\n", ";").replace("\t", "");
            }
            String str5 = "";
            C90648b bVar2 = dVar2.f260447f;
            if (bVar2 != null) {
                C90771e.C90772a aVar3 = bVar2.f260432h;
                str5 = (aVar3 == null ? "" : aVar3.f260668a).replace("\n", ";").replace("\t", "");
            }
            C115669n.INSTANCE.mo160131h(24828, Integer.valueOf(i), Long.valueOf(dVar2.f260447f.mo124782b()), dVar2.f260451j.f260663b, str4, str2, str5, a, valueOf, valueOf2, "", Integer.valueOf(dVar.mo124788c() ? 1 : 0), BuildInfo.REV, BuildInfo.BUILD_TAG, str3 + "==========;" + str4);
        }
    }

    /* renamed from: com.tencent.mm.matrix.h$b */
    public class C80991b implements C90399e.C90401b {
        public C80991b(C80989h hVar) {
        }

        /* renamed from: a */
        public void mo112813a(List<C90650d> list) {
            if (list != null && list.size() != 0) {
                if (BuildInfo.DEBUG || (WeChatEnvironment.hasDebugger() && Log.getLogLevel() <= 1)) {
                    Log.m105924i("MicroMsg.MatrixOpenGLLeakResultUI", "leak detected, start ui");
                    new C32961g().mo58891e(list);
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    C90650d dVar = list.get(i4);
                    C90648b bVar = dVar == null ? null : dVar.f260447f;
                    if (bVar != null) {
                        if (dVar.mo124788c()) {
                            i2 = (int) (((long) i2) + bVar.mo124782b());
                            if (!dVar.mo124789d()) {
                                i3 = (int) (((long) i3) + bVar.mo124782b());
                            }
                        } else {
                            i = (int) (((long) i) + bVar.mo124782b());
                        }
                    }
                }
                if (i != 0 || i2 != 0) {
                    C115669n.INSTANCE.mo160131h(25641, Integer.valueOf(i2), Integer.valueOf(i), String.valueOf(i3), String.valueOf(BuildInfo.IS_FLAVOR_P_ALPHA || BuildInfo.ENABLE_MATRIX_OPENGL_HOOK), "", "", "");
                }
            }
        }
    }

    public C80989h(C80981c cVar) {
    }

    /* renamed from: a */
    public void mo112811a() {
        long j;
        TimeUnit timeUnit;
        C115669n.INSTANCE.mo175913w(1403, 38, 1);
        Log.m105920e("OpenglLeakPlugin.TAG", "onHookSuccess call & report");
        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            timeUnit = TimeUnit.MINUTES;
            j = 2;
        } else {
            timeUnit = TimeUnit.MINUTES;
            j = 15;
        }
        C90399e eVar = new C90399e(timeUnit.toMillis(j));
        eVar.f259414g = new C80990a(this);
        eVar.mo124620a((Application) MMApplicationContext.getContext().getApplicationContext());
        eVar.f259415h = new C80991b(this);
    }
}
