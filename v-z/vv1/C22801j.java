package vv1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ob0.C89132b;
import te3.C49404fb3;
import yb2.C15946a;

/* renamed from: vv1.j */
public final class C22801j extends C15946a {

    /* renamed from: d */
    public final String f65551d = "MicroMsg.FTS.FTSRelevantSearchUIC";

    /* renamed from: e */
    public long f65552e;

    /* renamed from: f */
    public String f65553f = "";

    /* renamed from: g */
    public boolean f65554g;

    /* renamed from: h */
    public C89132b<C49404fb3> f65555h;

    /* renamed from: vv1.j$a */
    public static final class C22802a<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C22801j f65556d;

        public C22802a(C22801j jVar) {
            this.f65556d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r0 = (w00.C78505k) r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r12) {
            /*
                r11 = this;
                uv1.a r12 = (uv1.C65479a) r12
                java.lang.String r0 = "state"
                gy3.C87412m.m108594g(r12, r0)
                vv1.j r2 = r11.f65556d
                com.tencent.mm.sdk.statecenter.IStateAction r0 = r12.getAction()
                if (r0 == 0) goto L_0x00cd
                boolean r1 = r0 instanceof w00.C78505k
                if (r1 == 0) goto L_0x00cd
                w00.k r0 = (w00.C78505k) r0
                com.tencent.mm.sdk.statecenter.IStateActionResult r1 = r0.getResult()
                if (r1 == 0) goto L_0x00cd
                boolean r3 = r1 instanceof w00.C78506l
                if (r3 == 0) goto L_0x00cd
                w00.l r1 = (w00.C78506l) r1
                java.lang.String r5 = r0.f229954a
                long r3 = r0.f229955b
                boolean r6 = r1.f229956a
                r2.getClass()
                r0 = 5
                int r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r0)
                te3.eb3 r7 = new te3.eb3
                r7.<init>()
                r8 = 0
                r2.f65552e = r8
                r8 = 0
                r2.f65554g = r8
                r7.f63778d = r5
                java.lang.String r9 = java.lang.String.valueOf(r3)
                r7.f63781g = r9
                long r9 = kv1.C99252h.f291030c
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r7.f63780f = r9
                r9 = 1
                r7.f63783i = r9
                r7.f63784j = r1
                int r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r8)
                r7.f63789r = r1
                if (r6 == 0) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r0 = 6
            L_0x005b:
                r7.f63790s = r0
                android.app.Activity r0 = r2.getContext()
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r8)
                android.app.Activity r1 = r2.getContext()
                kg3.C76577a.m92172w(r1)
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.String r8 = "current_text_size_scale_key"
                float r0 = r0.getFloat(r8, r1)
                java.util.LinkedList<te3.hy> r1 = r7.f63792u
                te3.hy r8 = new te3.hy
                r8.<init>()
                java.lang.String r9 = "fontSize"
                r8.f134951d = r9
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.f134953f = r0
                r1.add(r8)
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                r1 = 1076(0x434, float:1.508E-42)
                r0.f127069d = r1
                java.lang.String r1 = "/cgi-bin/mmsearch-bin/pardussearch"
                r0.f127068c = r1
                r0.f127066a = r7
                te3.fb3 r1 = new te3.fb3
                r1.<init>()
                r0.f127067b = r1
                ob0.c r0 = r0.mo72403a()
                ob0.b r1 = new ob0.b
                r1.<init>()
                r1.mo123453j(r0)
                r2.f65555h = r1
                nr3.e r0 = r1.mo9225i()
                if (r0 == 0) goto L_0x00cd
                androidx.appcompat.app.AppCompatActivity r1 = r2.getActivity()
                java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>"
                gy3.C87412m.m108592e(r1, r7)
                jp3.b r1 = (jp3.C9487b) r1
                r0.mo11397F(r1)
                vv1.k r7 = new vv1.k
                r1 = r7
                r1.<init>(r2, r3, r5, r6)
                r0.mo123064p(r7)
            L_0x00cd:
                vv1.j r0 = r11.f65556d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r12.getAction()
                if (r1 == 0) goto L_0x012a
                boolean r2 = r1 instanceof w00.C22841m
                if (r2 == 0) goto L_0x012a
                w00.m r1 = (w00.C22841m) r1
                ob0.b<te3.fb3> r2 = r0.f65555h
                if (r2 == 0) goto L_0x012a
                ob0.c r3 = r2.f256789f
                ob0.c$c r3 = r3.f127055a
                pe3.a r3 = r3.f127080a
                boolean r4 = r3 instanceof te3.C22494eb3
                if (r4 == 0) goto L_0x00ea
                goto L_0x00eb
            L_0x00ea:
                r3 = 0
            L_0x00eb:
                if (r3 == 0) goto L_0x012a
                te3.eb3 r3 = (te3.C22494eb3) r3
                java.lang.String r4 = r3.f63781g
                long r5 = r1.f65669a
                java.lang.String r1 = java.lang.String.valueOf(r5)
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x012a
                r2.mo85581g()
                java.lang.String r0 = r0.f65551d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "cancel cgi "
                r1.append(r2)
                java.lang.String r2 = r3.f63778d
                r1.append(r2)
                r2 = 32
                r1.append(r2)
                java.lang.String r4 = r3.f63781g
                r1.append(r4)
                r1.append(r2)
                java.lang.String r2 = r3.f63780f
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x012a:
                vv1.j r0 = r11.f65556d
                com.tencent.mm.sdk.statecenter.IStateAction r12 = r12.getAction()
                if (r12 == 0) goto L_0x0144
                boolean r1 = r12 instanceof w00.C22840j
                if (r1 == 0) goto L_0x0144
                w00.j r12 = (w00.C22840j) r12
                long r1 = r12.f65666a
                r0.f65552e = r1
                java.lang.String r1 = r12.f65667b
                r0.f65553f = r1
                boolean r12 = r12.f65668c
                r0.f65554g = r12
            L_0x0144:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vv1.C22801j.C22802a.onChanged(java.lang.Object):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22801j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C22802a(this));
        }
    }
}
