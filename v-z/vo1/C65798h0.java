package vo1;

import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPresenter;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayViewCallback;
import gy3.C87412m;
import vo1.C65770a0;

/* renamed from: vo1.h0 */
public final class C65798h0 extends UIComponent {

    /* renamed from: d */
    public FinderLiveReplayPresenter f189244d;

    /* renamed from: e */
    public FinderLiveReplayViewCallback f189245e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65798h0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajl;
    }

    public boolean onBackPressed() {
        Class cls = C54519d.class;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C54519d dVar = (C54519d) bVar.mo89819a().mo89804e(cls);
        if (dVar != null && dVar.f152861x) {
            C54991o oVar = (C54991o) bVar.mo89819a().mo89804e(C54991o.class);
            if (oVar != null) {
                oVar.f154350p0 = false;
            }
            bVar.mo89820b();
            getActivity().finish();
            return true;
        }
        C54519d dVar2 = (C54519d) bVar.mo89819a().mo89804e(cls);
        if (dVar2 != null) {
            dVar2.mo75380o3(true);
        }
        return super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f189245e;
        if (finderLiveReplayViewCallback != null && (finderLiveReplayPluginLayout = finderLiveReplayViewCallback.f160736n.f189252a) != null) {
            finderLiveReplayPluginLayout.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r1v33, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            super.onCreate(r17)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r1 == 0) goto L_0x001d
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            r3 = 8
            r1.setSelfNavigationBarVisible(r3)
        L_0x001d:
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r3 = 2097280(0x200080, float:2.938915E-39)
            r1.addFlags(r3)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r3)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r4 = 1024(0x400, float:1.435E-42)
            r1.clearFlags(r4)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r5 = 512(0x200, float:7.175E-43)
            r1.clearFlags(r5)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r1.clearFlags(r3)
            android.app.Activity r1 = r16.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r3 = 2
            if (r1 != r3) goto L_0x008b
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r5 = 7942(0x1f06, float:1.1129E-41)
            r1.setSystemUiVisibility(r5)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r1.addFlags(r4)
            goto L_0x009c
        L_0x008b:
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r4 = 1792(0x700, float:2.511E-42)
            r1.setSystemUiVisibility(r4)
        L_0x009c:
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r4)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r4 = 0
            r1.setStatusBarColor(r4)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r1.setNavigationBarColor(r4)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r5 = -3
            r1.setFormat(r5)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getActivity()
            android.view.Window r1 = r1.getWindow()
            r5 = 51
            r1.setSoftInputMode(r5)
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter r1 = new com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter
            android.app.Activity r5 = r16.getContext()
            android.content.Intent r6 = r16.getIntent()
            r1.<init>(r5, r6)
            r0.f189244d = r1
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback r1 = new com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback
            androidx.appcompat.app.AppCompatActivity r5 = r16.getActivity()
            gy3.C87412m.m108592e(r5, r2)
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter r2 = r0.f189244d
            gy3.C87412m.m108591d(r2)
            r1.<init>(r5, r2)
            r0.f189245e = r1
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter r2 = r0.f189244d
            r5 = 0
            if (r2 == 0) goto L_0x0150
            android.content.Intent r6 = r2.f16395e
            java.lang.String r7 = "KEY_PARAMS_SOURCE_TYPE"
            int r6 = r6.getIntExtra(r7, r4)
            if (r6 != r3) goto L_0x0133
            com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader r7 = new com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader
            android.content.Intent r8 = r2.f16395e
            java.lang.String r9 = "finder_username"
            java.lang.String r8 = r8.getStringExtra(r9)
            if (r8 != 0) goto L_0x011a
            java.lang.String r8 = ""
        L_0x011a:
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r9 = r9.mo90662O5()
            r7.<init>(r8, r9, r4, r5)
            vo1.y r8 = new vo1.y
            r8.<init>(r2)
            r7.f15083g = r8
            r2.f16396f = r7
            zp3.w r8 = r1.mo13972x0()
            r7.register(r8)
        L_0x0133:
            r2.f16397g = r1
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1 r2 = r2.f16398h
            r2.alive()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "init sourceType:"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "FinderLiveReplayPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x0150:
            com.tencent.mm.ui.MMActivity r2 = r1.f160729d
            androidx.lifecycle.j r2 = r2.getLifecycle()
            r2.addObserver(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r2 = r1.f160733h
            r6 = 1
            r2.setHasFixedSize(r6)
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager r7 = new com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager
            com.tencent.mm.ui.MMActivity r8 = r1.f160729d
            r7.<init>(r8, r6, r4)
            vo1.j0 r8 = new vo1.j0
            r8.<init>(r1)
            r7.f159781z = r8
            r1.f160734i = r7
            com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView.m63293z1(r2, r7, r5, r3, r5)
            vo1.e r3 = new vo1.e
            r3.<init>()
            vo1.j r7 = r1.f160730e
            java.util.ArrayList r7 = r7.mo3867F()
            java.lang.String r8 = "list"
            gy3.C87412m.m108594g(r7, r8)
            r3.f189232d = r7
            r3.notifyDataSetChanged()
            vo1.a0$b r7 = vo1.C65770a0.f189184r
            vo1.a0 r7 = r7.mo89819a()
            yo1.c r7 = r7.f189188b
            if (r7 == 0) goto L_0x0194
            int r7 = r7.f43187b
            goto L_0x0195
        L_0x0194:
            r7 = 0
        L_0x0195:
            if (r7 < 0) goto L_0x019e
            int r8 = r3.getItemCount()
            if (r7 >= r8) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r6 = 0
        L_0x019f:
            if (r6 == 0) goto L_0x01e3
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r6 = r1.f160733h
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r7)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r8 = r6
            r5 = r15
            r15 = r7
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.mo17115r1(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback"
            java.lang.String r10 = "initView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPosition"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x01e3:
            r2.setAdapter(r3)
            com.tencent.mm.plugin.finder.ui.x0 r3 = r1.f160731f
            r3.mo75025b(r2)
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.f160732g
            r2.setEnableRefresh(r4)
            vo1.k0 r3 = new vo1.k0
            r3.<init>(r1)
            r2.setActionCallback(r3)
            r1 = 2131303797(0x7f091d75, float:1.8225719E38)
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x020c
            r3 = 2131298942(0x7f090a7e, float:1.8215871E38)
            android.view.View r1 = r1.findViewById(r3)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            if (r5 != 0) goto L_0x0210
            goto L_0x0222
        L_0x0210:
            android.content.Context r1 = r2.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828698(0x7f111fda, float:1.9290344E38)
            java.lang.String r1 = r1.getString(r2)
            r5.setText(r1)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65798h0.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveReplayPresenter finderLiveReplayPresenter = this.f189244d;
        if (finderLiveReplayPresenter != null) {
            finderLiveReplayPresenter.onDetach();
        }
    }
}
