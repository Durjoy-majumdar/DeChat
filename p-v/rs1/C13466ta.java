package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8815x4;
import ky2.C10432i;
import ms1.C11089e;
import ms1.C11090f;
import pt1.C12006c;
import pt1.C35640b;
import te3.C49873in1;
import z04.C112550d0;
import z04.C66731x;
import zc1.C66785b;

@C113200q(initialMode = 2)
/* renamed from: rs1.ta */
public final class C13466ta extends UIComponent implements C8815x4 {

    /* renamed from: d */
    public C11090f f38169d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13466ta(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo12885c3(int i, int i2) {
        if ((i & i2) > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
            if (this.f38169d == null) {
                String string = getContext().getString(C0966R.string.eru);
                C87412m.m108593f(string, "context.getString(R.stri…_teens_guide_dialog_tips)");
                Log.m105924i("Finder.FinderTeensGuideUIC", "tips=" + string);
                C11089e eVar = new C11089e(getActivity());
                this.f38169d = eVar;
                eVar.mo11228c(string);
            }
            C11090f fVar = this.f38169d;
            if (fVar != null) {
                fVar.mo11227a();
            }
        }
    }

    /* renamed from: e1 */
    public void mo9641e1() {
        Class cls = C10432i.class;
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        boolean Pj0 = ((C10432i) C86312j.m106911c(cls)).Pj0();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC;
        long G = i.mo119673G(aVar, 0);
        long F = C58739j4.f168176a.mo83678F();
        Log.m105924i("Finder.FinderTeensGuideUIC", "isTeenMode=" + e + " lastime=" + G + " todayStartTime=" + F + " isHideTeenMode=" + Pj0);
        if (!e && !Pj0) {
            if (F >= G) {
                Class cls2 = C12006c.class;
                C49873in1 in12 = C66785b.f191882e.mo90673n0().mo62397b().f140473q;
                int i2 = 0;
                int i3 = in12 != null ? in12.f135520f : 0;
                AppCompatActivity activity = getActivity();
                if (activity instanceof OccupyFinderUI5) {
                    mo12885c3(i3, 2);
                } else if (activity instanceof FinderHomeUI) {
                    C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…inderHomeUIC::class.java)");
                    int d3 = ((FinderHomeUIC) a).mo5128d3();
                    if (d3 == 1) {
                        mo12885c3(i3, 2);
                    } else if (d3 == 3 || d3 == 4) {
                        mo12885c3(i3, 1);
                    } else {
                        mo12885c3(i3, 4);
                    }
                } else if (activity instanceof FinderShareFeedRelUI) {
                    AppCompatActivity activity2 = getActivity();
                    C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI");
                    if (((FinderShareFeedRelUI) activity2).mo2194I7() == 16) {
                        mo12885c3(i3, 1);
                    } else {
                        mo12885c3(i3, 4);
                    }
                } else if (C35640b.f95284a.mo60347a(getActivity())) {
                    String stringExtra = getIntent().getStringExtra("key_context_id");
                    String str = stringExtra != null ? (String) C112550d0.m153784T(stringExtra, new char[]{'-'}, false, 0, 6, (Object) null).get(0) : null;
                    if (str != null) {
                        if (C66731x.m78731e(str) != null) {
                            i2 = Integer.parseInt(str);
                        }
                    }
                    if (i2 == 12 || i2 == 23) {
                        mo12885c3(i3, 1);
                    } else {
                        mo12885c3(i3, 4);
                    }
                } else {
                    AppCompatActivity activity3 = getActivity();
                    C87412m.m108594g(activity3, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    if (!((C12006c) C86312j.m106911c(cls2)).mo9221Tt(activity3)) {
                        AppCompatActivity activity4 = getActivity();
                        C87412m.m108594g(activity4, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        if (!((C12006c) C86312j.m106911c(cls2)).mo9223cq(activity4)) {
                            AppCompatActivity activity5 = getActivity();
                            C87412m.m108594g(activity5, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                            if (!((C12006c) C86312j.m106911c(cls2)).mo9222Vz(activity5)) {
                                mo12885c3(i3, 4);
                                return;
                            }
                        }
                    }
                    mo12885c3(i3, 1);
                }
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (pt1.C35640b.f95284a.mo60347a(getActivity()) == false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreateAfter(r4)
            java.lang.Class<pt1.c> r4 = pt1.C12006c.class
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r0, r1)
            di3.d r2 = di3.C86312j.m106911c(r4)
            pt1.c r2 = (pt1.C12006c) r2
            boolean r0 = r2.mo9223cq(r0)
            if (r0 != 0) goto L_0x0043
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            gy3.C87412m.m108594g(r0, r1)
            di3.d r4 = di3.C86312j.m106911c(r4)
            pt1.c r4 = (pt1.C12006c) r4
            boolean r4 = r4.mo9221Tt(r0)
            if (r4 != 0) goto L_0x0043
            int r4 = com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5.f14943w
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r4 != 0) goto L_0x0043
            pt1.b r4 = pt1.C35640b.f95284a
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            boolean r4 = r4.mo60347a(r0)
            if (r4 == 0) goto L_0x004b
        L_0x0043:
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5
            if (r4 == 0) goto L_0x004d
        L_0x004b:
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0053
            r3.mo9641e1()
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13466ta.onCreateAfter(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C11090f fVar = this.f38169d;
        if (fVar != null) {
            ((C11089e) fVar).dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13466ta(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
