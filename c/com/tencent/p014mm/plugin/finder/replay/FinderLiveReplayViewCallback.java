package com.tencent.p014mm.plugin.finder.replay;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import al1.C54127h;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103928o;
import bl3.C39818r;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveRecyclerView;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dg1.C58263a;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p447aw.C103918d;
import p646pn.C110234e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49431fj1;
import uv0.C22663i;
import vo1.C14917k;
import vo1.C65770a0;
import vo1.C65785c0;
import vo1.C65789e;
import vo1.C65800j;
import vo1.C65805l0;
import wx3.C15601d;
import yo1.C16058c;
import yo1.C66687b;
import zp3.C16380c;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback;", "Lvo1/k;", "Ldg1/a;", "Lcom/tencent/mm/ui/MMActivity;", "activity", "Lvo1/j;", "presenter", "<init>", "(Lcom/tencent/mm/ui/MMActivity;Lvo1/j;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback */
public final class FinderLiveReplayViewCallback implements C14917k, C58263a {

    /* renamed from: d */
    public final MMActivity f160729d;

    /* renamed from: e */
    public final C65800j f160730e;

    /* renamed from: f */
    public final C56437x0 f160731f = new C56437x0();

    /* renamed from: g */
    public RefreshLoadMoreLayout f160732g;

    /* renamed from: h */
    public FinderLiveRecyclerView f160733h;

    /* renamed from: i */
    public FinderLiveLayoutManager f160734i;

    /* renamed from: j */
    public final C13601g f160735j;

    /* renamed from: n */
    public final C65805l0 f160736n;

    /* renamed from: o */
    public C66687b f160737o;

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback$a */
    public static final class C56250a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayViewCallback f160738d;

        /* renamed from: e */
        public final /* synthetic */ long f160739e;

        public C56250a(FinderLiveReplayViewCallback finderLiveReplayViewCallback, long j) {
            this.f160738d = finderLiveReplayViewCallback;
            this.f160739e = j;
        }

        public final void run() {
            RecyclerView.C16613e adapter = this.f160738d.f160733h.getAdapter();
            C65789e eVar = adapter instanceof C65789e ? (C65789e) adapter : null;
            if (eVar != null) {
                long j = this.f160739e;
                FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f160738d;
                ArrayList<C54127h> arrayList = eVar.f189232d;
                int i = -1;
                if (arrayList != null) {
                    Iterator<C54127h> it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().f151977d.f157064e == j) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
                ArrayList<C54127h> arrayList2 = eVar.f189232d;
                int size = arrayList2 != null ? arrayList2.size() : 0;
                Log.m105924i("FinderLiveReplayViewCallback", "delete deletePos:" + i + "(liveId:" + j + "),size:" + size + '!');
                C54991o oVar = (C54991o) C65770a0.f189184r.mo89819a().mo89804e(C54991o.class);
                if (oVar != null) {
                    oVar.f154350p0 = false;
                }
                finderLiveReplayViewCallback.f160729d.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback$b */
    public static final class C56251b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayViewCallback f160740d;

        /* renamed from: e */
        public final /* synthetic */ int f160741e;

        public C56251b(FinderLiveReplayViewCallback finderLiveReplayViewCallback, int i) {
            this.f160740d = finderLiveReplayViewCallback;
            this.f160741e = i;
        }

        public final void run() {
            FinderLiveRecyclerView finderLiveRecyclerView = this.f160740d.f160733h;
            int i = this.f160741e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(finderLiveRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            finderLiveRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback$c */
    public static final class C56252c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayViewCallback f160742d;

        /* renamed from: e */
        public final /* synthetic */ long f160743e;

        public C56252c(FinderLiveReplayViewCallback finderLiveReplayViewCallback, long j) {
            this.f160742d = finderLiveReplayViewCallback;
            this.f160743e = j;
        }

        public final void run() {
            FinderLiveLayoutManager finderLiveLayoutManager;
            FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f160742d;
            int i = finderLiveReplayViewCallback.f160736n.f189253b;
            RecyclerView.C16613e adapter = finderLiveReplayViewCallback.f160733h.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.FinderLiveReplayAdapter");
            ArrayList<C54127h> arrayList = ((C65789e) adapter).f189232d;
            int size = arrayList != null ? arrayList.size() : 0;
            Log.m105924i("FinderLiveReplayViewCallback", "restart curPos:" + i + "(liveId:" + this.f160743e + "),size:" + size + '!');
            if ((i >= 0 && i < size) && (finderLiveLayoutManager = this.f160742d.f160734i) != null) {
                FinderLiveLayoutManager.m63990e0(finderLiveLayoutManager, false, true, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback$d */
    public static final class C56253d extends C87413o implements C32224a<C16380c> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayViewCallback f160744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56253d(FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
            super(0);
            this.f160744d = finderLiveReplayViewCallback;
        }

        public Object invoke() {
            return new C16380c(this.f160744d.f160732g);
        }
    }

    public FinderLiveReplayViewCallback(MMActivity mMActivity, C65800j jVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(jVar, "presenter");
        this.f160729d = mMActivity;
        this.f160730e = jVar;
        View findViewById = mMActivity.findViewById(C0966R.C0970id.dye);
        C87412m.m108593f(findViewById, "activity.findViewById<Re…id.finder_live_replay_rf)");
        this.f160732g = (RefreshLoadMoreLayout) findViewById;
        View findViewById2 = mMActivity.findViewById(C0966R.C0970id.dyd);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.…ive_replay_recycler_view)");
        this.f160733h = (FinderLiveRecyclerView) findViewById2;
        this.f160735j = C36568h.m40985a(new C56253d(this));
        this.f160736n = new C65805l0(this.f160733h, ((C60172g4) C39818r.f106831a.mo62444c(mMActivity).mo62447c(C60172g4.class)).mo12861q3());
    }

    /* renamed from: S */
    public void mo13969S(long j) {
        this.f160733h.post(new C56252c(this, j));
    }

    public void delete(long j) {
        this.f160733h.post(new C56250a(this, j));
    }

    public MMFragmentActivity getActivity() {
        return this.f160729d;
    }

    /* renamed from: o0 */
    public void mo13971o0(int i) {
        RecyclerView.C16613e adapter;
        C49431fj1 fj12;
        int i2 = i;
        RecyclerView.C16613e adapter2 = this.f160733h.getAdapter();
        boolean z = false;
        int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
        FinderLiveLayoutManager finderLiveLayoutManager = this.f160734i;
        int E = finderLiveLayoutManager != null ? finderLiveLayoutManager.mo16959E() : -1;
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadMoreResult increment size:");
        sb.append(i2);
        sb.append(",adapterItemCount:");
        sb.append(itemCount);
        sb.append(",curPos:");
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C16058c cVar = bVar.mo89819a().f189188b;
        sb.append(cVar != null ? Integer.valueOf(cVar.f43187b) : null);
        sb.append(",lastVisibleItemPos:");
        sb.append(E);
        Log.m105924i("FinderLiveReplayViewCallback", sb.toString());
        if (i2 <= 0) {
            View c = this.f160732g.mo82392c(C0966R.C0970id.dqh);
            View findViewById = c != null ? c.findViewById(C0966R.C0970id.g3j) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View c2 = this.f160732g.mo82392c(C0966R.C0970id.dqh);
            View findViewById2 = c2 != null ? c2.findViewById(C0966R.C0970id.g2q) : null;
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View c3 = this.f160732g.mo82392c(C0966R.C0970id.dqh);
            if (c3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = c3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback", "onLoadMoreResult", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        RefreshLoadMoreLayout.C7080c cVar2 = new RefreshLoadMoreLayout.C7080c(-1);
        cVar2.f24953h = i2;
        cVar2.f24951f = true;
        C16058c cVar3 = bVar.mo89819a().f189188b;
        cVar2.f24952g = (cVar3 == null || (fj12 = cVar3.f43186a) == null || fj12.f133535g != 0) ? false : true;
        this.f160732g.onPreFinishLoadMoreSmooth(cVar2);
        int i3 = itemCount - i2;
        if (i2 > 0) {
            if ((i3 >= 0 && i3 < itemCount) && (adapter = this.f160733h.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(i3, i2);
            }
        }
        int i4 = E + 1;
        if (i2 > 0) {
            if (i4 >= 0 && i4 < itemCount) {
                z = true;
            }
            if (z) {
                this.f160733h.post(new C56251b(this, i4));
            }
        }
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("FinderLiveReplayViewCallback", "[LiveLifecycle]onCreate " + this);
        C66687b bVar = new C66687b(new C22663i(this.f160729d));
        this.f160737o = bVar;
        bVar.mo35648A(34, "LiveReplayFloatBall");
    }

    public void onDestroy(C0125s sVar) {
        Class cls = C54519d.class;
        C87412m.m108594g(sVar, "var1");
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C54519d dVar = (C54519d) bVar.mo89819a().mo89804e(cls);
        Boolean valueOf = dVar != null ? Boolean.valueOf(dVar.f152859v) : null;
        Log.m105924i("FinderLiveReplayViewCallback", "[LiveLifecycle]onDestroy " + this + ",manualClose:" + valueOf + '!');
        if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
            C65770a0 a = bVar.mo89819a();
            C54519d dVar2 = (C54519d) bVar.mo89819a().mo89804e(cls);
            a.mo89811l(7, dVar2 != null ? dVar2.mo75371d3() : 0, true);
        }
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f160736n.f189252a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.unMount();
        }
        C66687b bVar2 = this.f160737o;
        if (bVar2 != null) {
            bVar2.mo67996A0();
        }
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("FinderLiveReplayViewCallback", "[LiveLifecycle]onPause " + this);
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f160736n.f189252a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.pause();
        }
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Log.m105924i("FinderLiveReplayViewCallback", "[LiveLifecycle]onResume " + this);
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f160736n.f189252a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.resume();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [cp1.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart(androidx.lifecycle.C0125s r11) {
        /*
            r10 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<bp1.d> r1 = bp1.C54519d.class
            java.lang.String r2 = "var1"
            gy3.C87412m.m108594g(r11, r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "[LiveLifecycle]onStart "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = ", needMiniWindow:"
            r11.append(r2)
            vo1.a0$b r2 = vo1.C65770a0.f189184r
            vo1.a0 r3 = r2.mo89819a()
            androidx.lifecycle.i0 r3 = r3.mo89804e(r0)
            cl1.o r3 = (cl1.C54991o) r3
            r4 = 0
            if (r3 == 0) goto L_0x0032
            boolean r3 = r3.f154350p0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            r11.append(r3)
            java.lang.String r3 = ",manualClose:"
            r11.append(r3)
            vo1.a0 r3 = r2.mo89819a()
            androidx.lifecycle.i0 r3 = r3.mo89804e(r1)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x004e
            boolean r3 = r3.f152859v
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x004f
        L_0x004e:
            r3 = r4
        L_0x004f:
            r11.append(r3)
            java.lang.String r3 = ",manualMinimum:"
            r11.append(r3)
            vo1.a0 r3 = r2.mo89819a()
            androidx.lifecycle.i0 r3 = r3.mo89804e(r1)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x006a
            boolean r3 = r3.f152860w
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x006b
        L_0x006a:
            r3 = r4
        L_0x006b:
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.String r3 = "FinderLiveReplayViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            yo1.b r11 = r10.f160737o
            if (r11 == 0) goto L_0x007e
            r11.mo78184B0()
        L_0x007e:
            r11 = 1
            r5 = 0
            aw0.C103928o.m138641a(r11, r5, r11)
            java.lang.String r6 = "tryHideFloatBallWhenEnterPage hideFloatBall"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            vo1.a0 r3 = r2.mo89819a()
            cp1.o r6 = r3.f189191e
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout
            if (r7 == 0) goto L_0x0096
            r4 = r6
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r4 = (com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout) r4
        L_0x0096:
            if (r4 == 0) goto L_0x0105
            java.lang.Class<zo1.j0> r6 = zo1.C66925j0.class
            qj1.c r4 = r4.getPlugin(r6)
            zo1.j0 r4 = (zo1.C66925j0) r4
            if (r4 == 0) goto L_0x0105
            android.view.ViewGroup r4 = r4.f166287d
            if (r4 != 0) goto L_0x00a7
            goto L_0x0105
        L_0x00a7:
            cp1.m r6 = r3.f189201o
            if (r6 == 0) goto L_0x0105
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r7 = r6.f165852a
            if (r7 == 0) goto L_0x00c4
            gr1.q2 r7 = r7.getVideoMediaInfo()
            if (r7 == 0) goto L_0x00c4
            pl1.u0 r7 = r7.f170495e
            if (r7 == 0) goto L_0x00c4
            te3.rq2 r7 = r7.mo87421f()
            if (r7 == 0) goto L_0x00c4
            android.util.Size r7 = vp1.C65840n.m77566b(r7, r11)
            goto L_0x00c9
        L_0x00c4:
            android.util.Size r7 = new android.util.Size
            r7.<init>(r5, r5)
        L_0x00c9:
            androidx.lifecycle.i0 r8 = r3.mo89804e(r0)
            cl1.o r8 = (cl1.C54991o) r8
            if (r8 == 0) goto L_0x00d9
            boolean r8 = r8.mo75966J4()
            if (r8 != r11) goto L_0x00d9
            r8 = 1
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            if (r8 == 0) goto L_0x00ec
            int r8 = r7.getWidth()
            int r9 = r7.getHeight()
            if (r8 < r9) goto L_0x00ec
            int r8 = r7.getHeight()
            if (r8 > 0) goto L_0x00fd
        L_0x00ec:
            androidx.lifecycle.i0 r3 = r3.mo89804e(r1)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x00fa
            boolean r3 = r3.f152853p
            if (r3 != r11) goto L_0x00fa
            r3 = 1
            goto L_0x00fb
        L_0x00fa:
            r3 = 0
        L_0x00fb:
            if (r3 == 0) goto L_0x0100
        L_0x00fd:
            com.tencent.mm.pluginsdk.ui.a$e r3 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
            goto L_0x0102
        L_0x0100:
            com.tencent.mm.pluginsdk.ui.a$e r3 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
        L_0x0102:
            r6.mo82757c(r4, r7, r3, r5)
        L_0x0105:
            vo1.a0 r3 = r2.mo89819a()
            androidx.lifecycle.i0 r0 = r3.mo89804e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 != 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r0.f154350p0 = r11
        L_0x0114:
            vo1.a0 r11 = r2.mo89819a()
            androidx.lifecycle.i0 r11 = r11.mo89804e(r1)
            bp1.d r11 = (bp1.C54519d) r11
            if (r11 != 0) goto L_0x0121
            goto L_0x0124
        L_0x0121:
            r11.mo75379n3(r5)
        L_0x0124:
            vo1.a0 r11 = r2.mo89819a()
            androidx.lifecycle.i0 r11 = r11.mo89804e(r1)
            bp1.d r11 = (bp1.C54519d) r11
            if (r11 != 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r11.mo75380o3(r5)
        L_0x0134:
            vo1.l0 r11 = r10.f160736n
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r11 = r11.f189252a
            if (r11 == 0) goto L_0x013d
            r11.start()
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayViewCallback.onStart(androidx.lifecycle.s):void");
    }

    public void onStop(C0125s sVar) {
        Class cls = C110234e.class;
        Class cls2 = C54519d.class;
        C87412m.m108594g(sVar, "var1");
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C54991o oVar = (C54991o) bVar.mo89819a().mo89804e(C54991o.class);
        Boolean valueOf = oVar != null ? Boolean.valueOf(oVar.f154350p0) : null;
        C54519d dVar = (C54519d) bVar.mo89819a().mo89804e(cls2);
        Boolean valueOf2 = dVar != null ? Boolean.valueOf(dVar.f152859v) : null;
        C54519d dVar2 = (C54519d) bVar.mo89819a().mo89804e(cls2);
        Boolean valueOf3 = dVar2 != null ? Boolean.valueOf(dVar2.f152860w) : null;
        Log.m105924i("FinderLiveReplayViewCallback", "[LiveLifecycle]onStop " + this + ", needMiniView:" + valueOf + ", manualClose:" + valueOf2 + ",manualMinumum:" + valueOf3 + ",lifecycleOwner:" + sVar);
        Boolean bool = Boolean.TRUE;
        if (C87412m.m108589b(valueOf3, bool) || C87412m.m108589b(valueOf2, bool) || C87412m.m108589b(valueOf, bool)) {
            C66687b bVar2 = this.f160737o;
            if (bVar2 != null) {
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149141q(false);
                bVar2.f311726d.f311683H.f311721j = 4;
                bVar2.mo64001C();
            }
        } else {
            C66687b bVar3 = this.f160737o;
            if (bVar3 != null) {
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149141q(true);
                bVar3.f311726d.f311683H.f311721j = 4;
                bVar3.mo64001C();
            }
        }
        Boolean bool2 = Boolean.FALSE;
        if (C87412m.m108589b(valueOf2, bool2) && !C87412m.m108589b(valueOf, bool2)) {
            C65770a0 a = bVar.mo89819a();
            MMActivity mMActivity = this.f160729d;
            Intent intent = new Intent();
            intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
            C13598b0 b0Var = C13598b0.f38549a;
            C87412m.m108594g(mMActivity, "context");
            boolean TW = ((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(mMActivity, 21);
            Log.m105924i("FinderLiveReplayService", "tryToStartReplayMiniUI isFloatWindowOpAllowed:" + TW);
            if (TW) {
                a.mo89817r(intent);
            } else {
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151118b, (C53934p0) null, new C65785c0(mMActivity, a, intent, (C15601d<? super C65785c0>) null), 2, (Object) null);
            }
        }
        C103928o.m138642b();
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = this.f160736n.f189252a;
        if (finderLiveReplayPluginLayout != null) {
            finderLiveReplayPluginLayout.stop();
        }
    }

    /* renamed from: x0 */
    public C16389w mo13972x0() {
        return (C16380c) ((C36570n) this.f160735j).getValue();
    }
}
