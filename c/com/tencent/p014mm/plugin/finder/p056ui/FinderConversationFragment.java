package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import bl3.C0317e;
import bl3.C39818r;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import di3.C7335d;
import di3.C86312j;
import dj3.C45405a;
import dp1.C45430b;
import dp1.C45436j2;
import dp1.C58417y0;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import p629ny.C76979h;
import p749xh.C66276va;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C64580ne1;
import ue1.C52528f;
import ue1.C52530g;
import ue1.C52538i;
import ue1.C52541j;
import ue1.C52542k;
import ue1.C52543l;
import up1.C52593j;
import wp1.C66169h;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import ye1.C53517h;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment */
public final class FinderConversationFragment extends FinderBaseConversationFragment {

    /* renamed from: H */
    public static final /* synthetic */ int f111770H = 0;

    /* renamed from: B */
    public final C13601g f111771B = C36568h.m40985a(new C41510d(this));

    /* renamed from: C */
    public final C52528f f111772C = C52593j.f146894e.mo73554a();

    /* renamed from: D */
    public C45436j2 f111773D;

    /* renamed from: E */
    public final int[] f111774E = {4};

    /* renamed from: F */
    public final int f111775F = 1;

    /* renamed from: G */
    public final FinderConversationFragment$notificationListener$1 f111776G = new FinderConversationFragment$notificationListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$a */
    public static final class C41504a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C41504a f111777d = new C41504a();

        public C41504a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$b */
    public static final class C41505b extends C87413o implements C32226l<C45405a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationFragment f111778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41505b(FinderConversationFragment finderConversationFragment) {
            super(1);
            this.f111778d = finderConversationFragment;
        }

        public Object invoke(Object obj) {
            C45405a aVar = (C45405a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            this.f111778d.f111744y = aVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$c */
    public static final class C41506c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationFragment f111779d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderConversationFragment$onResume$1$1", mo125469f = "FinderConversationFragment.kt", mo125470l = {104}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$c$a */
        public static final class C41507a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f111780d;

            /* renamed from: e */
            public final /* synthetic */ FinderConversationFragment f111781e;

            /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$c$a$a */
            public static final class C41508a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C52593j f111782d;

                /* renamed from: e */
                public final /* synthetic */ C52528f f111783e;

                public C41508a(C52593j jVar, C52528f fVar) {
                    this.f111782d = jVar;
                    this.f111783e = fVar;
                }

                public final void run() {
                    if (this.f111782d.delete(this.f111783e, true, "rowid", "senderUserName")) {
                        C52593j jVar = this.f111782d;
                        C52528f fVar = this.f111783e;
                        jVar.doNotify(fVar.field_sessionId, 6, fVar);
                    }
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderConversationFragment$onResume$1$1$2", mo125469f = "FinderConversationFragment.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$c$a$b */
            public static final class C41509b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ FinderConversationFragment f111784d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C41509b(FinderConversationFragment finderConversationFragment, C15601d<? super C41509b> dVar) {
                    super(2, dVar);
                    this.f111784d = finderConversationFragment;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C41509b(this.f111784d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C41509b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    FinderConversationFragment finderConversationFragment = this.f111784d;
                    int i = FinderConversationFragment.f111770H;
                    finderConversationFragment.mo62821V().notifyItemChanged(0);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C41507a(FinderConversationFragment finderConversationFragment, C15601d<? super C41507a> dVar) {
                super(2, dVar);
                this.f111781e = finderConversationFragment;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C41507a(this.f111781e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C41507a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                View view;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f111780d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C52541j jVar = (C52541j) this.f111781e.mo62824Z();
                    List<C52528f> Yt = ((C52593j) jVar.mo62834L4()).mo73550Yt(jVar.f146749a, 0, 1, new int[]{1}, jVar.f146751c);
                    if (!Yt.isEmpty()) {
                        str = Yt.get(0).f146722a1 + XVFSFile.PATH_SEPARATOR_CHAR + Yt.get(0).field_digest;
                    } else {
                        str = "";
                    }
                    long j = Yt.isEmpty() ^ true ? Yt.get(0).field_updateTime : 0;
                    C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
                    int Lo = Bx0.mo73548Lo(2, (String) ((C36570n) this.f111781e.f111741v).getValue());
                    C52528f fVar = Bx0.get("findersayhisessionholder");
                    if (Lo > 0 && fVar.systemRowid > 0 && (!C87412m.m108589b(str, fVar.field_digest) || j != fVar.field_updateTime)) {
                        Log.m105925i("Finder.FinderBaseConversationFragment", "[onResume] update digest=%s", str);
                        fVar.field_digest = str;
                        fVar.field_updateTime = j;
                        if (Bx0.update(fVar.systemRowid, fVar, false)) {
                            Bx0.doNotify(fVar.field_sessionId, 1, fVar);
                        }
                    } else if (fVar.systemRowid > 0 && Lo == 0 && (view = this.f111781e.f165437h) != null) {
                        view.postDelayed(new C41508a(Bx0, fVar), 1000);
                    }
                    this.f111781e.mo64597l0();
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C41509b bVar = new C41509b(this.f111781e, (C15601d<? super C41509b>) null);
                    this.f111780d = 1;
                    if (C53895h.m60469g(k2Var, bVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C41506c(FinderConversationFragment finderConversationFragment) {
            this.f111779d = finderConversationFragment;
        }

        public final void run() {
            C39622i0 a = C39818r.f106831a.mo62445d(this.f111779d).mo75002a(C0317e.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…ineViewModel::class.java)");
            C0317e.launch$default((C0317e) a, (C66212f) null, (C53934p0) null, new C41507a(this.f111779d, (C15601d<? super C41507a>) null), 3, (Object) null);
            C45436j2 j2Var = this.f111779d.f111773D;
            boolean z = true;
            if (j2Var == null || !j2Var.mo70930a()) {
                z = false;
            }
            if (z) {
                this.f111779d.mo64596k0();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$d */
    public static final class C41510d extends C87413o implements C32224a<C53517h> {

        /* renamed from: d */
        public final /* synthetic */ FinderConversationFragment f111785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41510d(FinderConversationFragment finderConversationFragment) {
            super(0);
            this.f111785d = finderConversationFragment;
        }

        public Object invoke() {
            FinderConversationFragment finderConversationFragment = this.f111785d;
            int i = FinderConversationFragment.f111770H;
            View view = finderConversationFragment.f165437h;
            C87412m.m108591d(view);
            return C53517h.m60070a(view.findViewById(C0966R.C0970id.mc5));
        }
    }

    /* renamed from: T */
    public BasePrivateMsgConvListFragment.C40273a<C52528f> mo62819T() {
        C52542k kVar = new C52542k();
        kVar.f146730n = new C52543l(C41504a.f111777d);
        kVar.f146729j = new C52538i(this, new C41505b(this));
        return kVar;
    }

    /* renamed from: j0 */
    public void mo64586j0() {
        C45436j2 j2Var = this.f111773D;
        boolean z = true;
        if (j2Var == null || !j2Var.mo70930a()) {
            z = false;
        }
        if (z) {
            mo64596k0();
        }
    }

    /* renamed from: k0 */
    public final void mo64596k0() {
        String str;
        Intent intent;
        C13442s8 f;
        Class cls = C58417y0.class;
        C49712hj1 hj12 = null;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i = c != null ? c.field_systemMsgCount : 0;
        if (i > 0) {
            ((C58417y0) C86312j.m106911c(cls)).Yx0(i, 1);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c2;
            FragmentActivity activity = getActivity();
            if (!(activity == null || (f = C13442s8.f38060Q0.mo12873f(activity)) == null)) {
                hj12 = f.mo12861q3();
            }
            C58417y0.Nx0(y0Var, "11", 4, 1, 5, 0, i, (String) null, (String) null, 0, hj12, 0, 0, 3520, (Object) null);
        } else {
            ((C58417y0) C86312j.m106911c(cls)).Yx0(0, 1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (intent = activity2.getIntent()) == null || (str = intent.getStringExtra("key_context_id")) == null) {
            str = "";
        }
        ((C58417y0) C86312j.m106911c(cls)).Uy0(str, 0);
    }

    /* renamed from: l0 */
    public final void mo64597l0() {
        ArrayList arrayList = new ArrayList();
        List<C66276va> b = C66169h.f190180a.mo90243b(MAlarmHandler.NEXT_FIRE_INTERVAL, 1, this.f111774E, this.f111775F, (String) ((C36570n) this.f111741v).getValue());
        ArrayList arrayList2 = new ArrayList();
        for (C66276va i : b) {
            C55011a i2 = C66169h.f190180a.mo90250i(i);
            if (i2 != null) {
                arrayList2.add(i2);
            }
        }
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            C64580ne1 ne12 = ((C55011a) arrayList.get(0)).f154465d.field_notify;
            this.f111772C.field_updateTime = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, (long) ((C55011a) arrayList.get(0)).f154465d.field_createTime) * ((long) 1000);
            this.f111772C.field_digest = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, ne12.f184466d);
        }
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i3 = c != null ? c.field_systemMsgCount : 0;
        C52528f fVar = this.f111772C;
        fVar.field_unReadCount = i3;
        fVar.field_readStatus = 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == 1) {
            BasePrivateMsgConvListFragment.C40273a V = mo62821V();
            C87412m.m108592e(V, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationAdapter");
            C52530g gVar = (C52530g) V;
            int P = C110818d0.m150918P(gVar.f146725f, gVar.f146726g.get("findersayhisessionholder"));
            if (P >= 0 && P < gVar.f146725f.size()) {
                gVar.f146725f.remove(P);
                gVar.f146726g.remove("findersayhisessionholder");
                gVar.mo73476O5(P);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f111776G.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().f158526c.mo2442b();
        C45436j2 j2Var = this.f111773D;
        if (j2Var != null) {
            j2Var.f122971d = null;
            C45430b<ID> bVar = j2Var.f122974g;
            if (bVar != null) {
                bVar.f122951a = false;
                bVar.f122952b = null;
            }
            j2Var.f122976h = null;
        }
        this.f111776G.dead();
    }

    public void onResume() {
        super.onResume();
        View view = this.f165437h;
        if (view != null) {
            view.post(new C41506c(this));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        if (mo62821V() instanceof C52542k) {
            C52528f fVar = this.f111772C;
            fVar.f146722a1 = getString(C0966R.string.d4k);
            fVar.field_sessionId = "finder_system_message";
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = MMApplicationContext.getContext();
            String str = fVar.f146722a1;
            if (str == null) {
                str = "";
            }
            fVar.f146721Z0 = hVar.mo107057T1(context, str);
            mo64597l0();
            BasePrivateMsgConvListFragment.C40273a V = mo62821V();
            C87412m.m108592e(V, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ((C52542k) V).f146752o.add(this.f111772C);
        }
        super.onViewCreated(view, bundle);
        C45436j2 j2Var = new C45436j2();
        C45430b<ID> bVar = j2Var.f122974g;
        if (bVar != null) {
            bVar.f122952b = new C41531b0(this);
        }
        RecyclerView recyclerView = ((C53517h) ((C36570n) this.f111771B).getValue()).f150477a;
        C87412m.m108593f(recyclerView, "uiBinding.conversationRecyclerView");
        j2Var.f122971d = recyclerView;
        recyclerView.mo17043c(j2Var);
        C45430b<ID> bVar2 = j2Var.f122974g;
        if (bVar2 != null) {
            bVar2.f122951a = true;
        }
        if (recyclerView.getAdapter() instanceof C52542k) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            j2Var.f122976h = (C52542k) adapter;
        }
        this.f111773D = j2Var;
    }
}
