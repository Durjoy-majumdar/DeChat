package com.tencent.p014mm.view;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct;
import com.tencent.p014mm.emoji.panel.EmojiPanelGroupView;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.emoji.sync.C41060a;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C44614y0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.smiley.C96959n;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.manager.C75075a;
import com.tencent.p014mm.view.manager.C97337b;
import com.tencent.p014mm.view.manager.SmileyPanelManager;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$b;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$c;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import i61.C98602h;
import jg3.C98942a;
import k14.C60942d;
import k14.C99088c;
import o40.C61926c;
import p171il.C98711d;
import p171il.C98720h0;
import p441aq.C92054g;
import p490dl.C97489o;
import p490dl.C97491p;
import p534gl.C32478k;
import p585kl.C76595c;
import p585kl.C76596h;
import p585kl.C99147e;
import p585kl.C99150i;
import p595ll.C34299h;
import p733vy.C37873b;
import p813fl.C97906h;
import p816jl.C60878a;
import vd3.C78405p;
import wx3.C15601d;
import z51.C39315g;
import zp3.C103055g;
import zp3.C103060h;
import zp3.C79407h0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.view.SmileyPanelImpl */
public class SmileyPanelImpl extends SmileyPanel implements C0124r {

    /* renamed from: g */
    public final SmileyPanelManager f285630g;

    /* renamed from: h */
    public boolean f285631h;

    /* renamed from: i */
    public boolean f285632i;

    public SmileyPanelImpl(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    /* renamed from: a */
    public void mo100188a() {
        this.f285630g.f285708M.alive();
    }

    /* renamed from: b */
    public void mo100189b() {
        Class cls = C39315g.class;
        if (this.f285632i) {
            Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: has destroyed");
            return;
        }
        this.f285632i = true;
        Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: ");
        this.f285630g.f285708M.dead();
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onDestroy %s", smileyPanelManager);
        smileyPanelManager.mo136450b();
        smileyPanelManager.f285698C.mo71266a();
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138014a();
        ((C39315g) C86312j.m106911c(cls)).getProvider().onDestroy();
    }

    /* renamed from: c */
    public void mo100190c() {
    }

    /* renamed from: d */
    public void mo100191d() {
        this.f285630g.mo136454f(false, false);
        this.f285630g.mo136453e(false, false);
        this.f285630g.mo136456h(false);
    }

    /* renamed from: e */
    public void mo100192e(boolean z) {
        C97906h hVar = this.f285630g.f285725p;
        hVar.f287219p = false;
        for (C32224a invoke : hVar.f287222s) {
            invoke.invoke();
        }
    }

    /* renamed from: f */
    public void mo100193f(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: g */
    public void mo100194g(boolean z) {
        RecyclerView recyclerView = this.f285630g.f285715f;
        if (recyclerView instanceof EmojiPanelGroupView) {
            ((EmojiPanelGroupView) recyclerView).f195268A1 = z;
        }
    }

    public C78405p getPanelSlideIndicator() {
        return this.f285630g.f285719j;
    }

    /* renamed from: h */
    public void mo100196h() {
        Log.m105918d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
        ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138014a();
        SmileyPanelManager smileyPanelManager = this.f285630g;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "saveSelectedTab: %s", smileyPanelManager.f285712c);
        C97489o g = C97489o.m125592g();
        g.f286141m = smileyPanelManager.f285712c;
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107535s().mo121142i().mo119676J(-29414086, g.f286141m);
        } else {
            C98942a.f290038b.mo122420a(-29414086, g.f286141m);
        }
        C96954m mVar = C96954m.f284033a;
        if (!C96954m.f284039g) {
            C96954m.f284039g = true;
            C53895h.m60466d(C96954m.f284035c, C53872d1.f151119c, (C53934p0) null, new C96959n((C15601d<? super C96959n>) null), 2, (Object) null);
        }
    }

    /* renamed from: i */
    public void mo100197i() {
        Log.m105918d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
        if (!this.f285631h) {
            this.f285631h = true;
            SmileyPanelManager smileyPanelManager = this.f285630g;
            smileyPanelManager.f285726q.mo137246b();
            smileyPanelManager.f285725p.getClass();
        }
        C96954m mVar = C96954m.f284033a;
        if (C96954m.f284039g) {
            Log.m105924i("MicroMsg.EmojiOcrService", "resume");
            C96954m.f284039g = false;
            C60942d dVar = (C60942d) C96954m.f284036d;
            if (dVar.mo85907a()) {
                C99088c.C99089a.m129046a(dVar, (Object) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: j */
    public void mo100198j() {
        this.f285630g.mo136449a();
    }

    /* renamed from: k */
    public void mo100199k() {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.f285725p.f287214k = C97491p.f286143a.mo136775d();
        smileyPanelManager.f285726q.mo137246b();
    }

    /* renamed from: l */
    public void mo100200l() {
    }

    /* renamed from: m */
    public void mo100201m() {
        this.f285630g.f285708M.dead();
    }

    /* renamed from: n */
    public void mo100202n() {
        this.f285630g.mo136452d(0);
    }

    /* renamed from: o */
    public void mo100203o(boolean z, boolean z2) {
        this.f285630g.mo136453e(z, z2);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onActivityDestroy() {
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onActivityDestroy:%s", getContext());
        mo100189b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onAttachedToWindow");
        SmileyPanelManager smileyPanelManager = this.f285630g;
        Class cls = C39315g.class;
        if (smileyPanelManager.f285714e) {
            Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "listener added %s", smileyPanelManager);
            return;
        }
        smileyPanelManager.f285714e = true;
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138024k(smileyPanelManager.f285703H);
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138022i(smileyPanelManager.f285704I);
        smileyPanelManager.f285705J.alive();
        smileyPanelManager.f285706K.alive();
        C92668a.C92674f fVar = C92668a.f266699q;
        fVar.mo126718b(false).mo126705f(smileyPanelManager.f285709N);
        fVar.mo126717a(false).mo126705f(smileyPanelManager.f285709N);
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager add listener. %s", smileyPanelManager);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDetachedFromWindow");
        this.f285630g.mo136450b();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onSizeChanged: %s, %s; %s, %s", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        super.onSizeChanged(i, i2, i3, i4);
        SmileyPanelManager smileyPanelManager = this.f285630g;
        if (smileyPanelManager != null) {
            boolean z = smileyPanelManager.f285710a.getResources().getConfiguration().orientation == 1;
            smileyPanelManager.f285735z.mo85309d(i);
            smileyPanelManager.f285734y.mo85309d(i);
            smileyPanelManager.f285725p.f287221r = smileyPanelManager.f285735z.f171991c;
            int dimensionPixelSize = smileyPanelManager.f285710a.getResources().getDimensionPixelSize(C0966R.dimen.a4m);
            ViewGroup.LayoutParams layoutParams = smileyPanelManager.f285722m.getLayoutParams();
            Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "updateViewSize: %s, %s, %s, canShowIntro:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(dimensionPixelSize), Boolean.valueOf(z));
            if (i2 >= dimensionPixelSize * 4) {
                dimensionPixelSize = smileyPanelManager.f285710a.getResources().getDimensionPixelSize(C0966R.dimen.a4l);
            }
            if (layoutParams.height != dimensionPixelSize) {
                layoutParams.height = dimensionPixelSize;
                smileyPanelManager.f285722m.setLayoutParams(layoutParams);
                smileyPanelManager.f285722m.post(new C97337b(smileyPanelManager));
            }
            C97906h hVar = smileyPanelManager.f285725p;
            if (hVar.f287213j != z) {
                hVar.f287213j = z;
                smileyPanelManager.f285726q.mo137246b();
            }
            C76595c.m92188a().f224191d = smileyPanelManager.f285735z.f171991c;
            C99150i.m129154a().f290714g = smileyPanelManager.f285734y.f171991c;
        }
    }

    /* renamed from: p */
    public void mo100204p(boolean z, boolean z2) {
        this.f285630g.mo136454f(z, z2);
    }

    /* renamed from: q */
    public void mo100205q(Context context, Runnable runnable) {
        this.f285630g.mo136458j(context, runnable);
    }

    /* renamed from: r */
    public void mo76247r(boolean z) {
        this.f285630g.f285723n.setBounce(z);
    }

    public void set16029ExtraInfo(String str) {
        C99150i.m129154a().f290715h = str;
    }

    public void setCallback(C44614y0 y0Var) {
        super.setCallback(y0Var);
        SmileyPanelManager smileyPanelManager = this.f285630g;
        C72837v1 v1Var = (C72837v1) y0Var;
        smileyPanelManager.f285696A = v1Var;
        smileyPanelManager.f285718i.f289454b = v1Var;
    }

    public void setDefaultEmojiByDetail(String str) {
        this.f285630g.mo136451c(str);
        this.f285630g.f285708M.alive();
    }

    public void setEntranceScene(int i) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        C99150i.m129154a().f290710c = i;
        C76595c.m92188a().f224190c = i;
        C76596h.f224195b = i;
        C97906h hVar = smileyPanelManager.f285725p;
        int i2 = hVar.f287204a;
        hVar.f287204a = i;
        boolean z = false;
        hVar.f287211h = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138020g() && (i == 1 || i == 12 || i == 7 || i == 8);
        C97906h hVar2 = smileyPanelManager.f285725p;
        if (i == 1) {
            z = true;
        }
        hVar2.f287209f = z;
        if (i2 != i) {
            smileyPanelManager.f285726q.mo137246b();
        }
        smileyPanelManager.f285718i.f289453a = i;
        smileyPanelManager.f285699D = i;
        smileyPanelManager.f285701F.getClass();
    }

    public void setHideSearchJumpMoreEntrance(boolean z) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setHideSearchDialogJumpMoreEntrance: %b", Boolean.valueOf(z));
        smileyPanelManager.f285731v = z;
    }

    public void setOnTextOperationListener(ChatFooterPanel.C72719a aVar) {
        super.setOnTextOperationListener(aVar);
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.f285697B = aVar;
        smileyPanelManager.f285718i.f289455c = aVar;
        smileyPanelManager.f285716g.f289504p = aVar;
    }

    public void setPortHeightPx(int i) {
        Log.m105919d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setPortHeightPx: %d", Integer.valueOf(i));
    }

    public void setSearchDialogForceDarkMode(boolean z) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setSearchDialogForceDarkMode: %b", Boolean.valueOf(z));
        smileyPanelManager.f285730u = z;
    }

    public void setSendButtonEnable(boolean z) {
        C97906h hVar = this.f285630g.f285725p;
        hVar.f287220q = z;
        for (C32224a invoke : hVar.f287222s) {
            invoke.invoke();
        }
    }

    public void setShowClose(boolean z) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.f285721l.setVisibility(z ? 0 : 8);
        if (z) {
            smileyPanelManager.f285720k.setBackgroundResource(C0966R.C0969drawable.emoji_panel_tab_bg_corner);
            return;
        }
        View view = smileyPanelManager.f285720k;
        C87412m.m108594g(view, "<this>");
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(C0966R.attr.f2803l1, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public void setShowGame(boolean z) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        C97906h hVar = smileyPanelManager.f285725p;
        boolean z2 = z != hVar.f287208e;
        hVar.f287208e = z;
        if (z2) {
            smileyPanelManager.f285726q.mo137246b();
        }
    }

    public void setShowSearch(boolean z) {
        if (!((C37873b) C86312j.m106911c(C37873b.class)).mo61224e()) {
            this.f285630g.mo136455g(z);
        } else {
            this.f285630g.mo136455g(false);
        }
    }

    public void setShowSend(boolean z) {
        C97906h hVar = this.f285630g.f285725p;
        hVar.f287219p = z;
        for (C32224a invoke : hVar.f287222s) {
            invoke.invoke();
        }
    }

    public void setShowSmiley(boolean z) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowSmiley: %s", Boolean.valueOf(z));
        smileyPanelManager.f285725p.f287206c = z;
    }

    public void setShowStore(boolean z) {
        this.f285630g.mo136456h(z);
    }

    public void setSmileyPanelExpandable(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setSmileyPanelExpandable: %s", String.valueOf(z));
        SmileyPanelManager smileyPanelManager = this.f285630g;
        C97906h hVar = smileyPanelManager.f285725p;
        if (z != hVar.f287216m) {
            hVar.f287216m = z;
            smileyPanelManager.f285716g.notifyDataSetChanged();
        }
        C103055g gVar = this.f285630g.f285719j;
        if (gVar != null) {
            if (!z) {
                if (!(gVar.f304060o || !gVar.f304055j.isFinished() || gVar.f304064s > 0)) {
                    gVar.f304059n = false;
                    return;
                }
                gVar.f304058m = new C103060h(gVar);
                C78405p.C78406a aVar = gVar.f304050e;
                if (aVar != null) {
                    ((ChatFooter$$e) aVar).mo100520d();
                }
                EmoticonBoardExpandStruct emoticonBoardExpandStruct = new EmoticonBoardExpandStruct();
                emoticonBoardExpandStruct.f265439d = System.currentTimeMillis();
                gVar.mo142759d(0, 500);
                emoticonBoardExpandStruct.f265440e = 2;
                C99147e eVar = gVar.f304065t;
                emoticonBoardExpandStruct.f265441f = ((long) (eVar != null ? eVar.f290703a : 0)) + 1;
                emoticonBoardExpandStruct.mo86054n();
                C78405p.C78406a aVar2 = gVar.f304050e;
                if (aVar2 != null) {
                    if (gVar.f304064s != gVar.f304061p) {
                        z2 = false;
                    }
                    ((ChatFooter$$e) aVar2).mo100519c(z2);
                    return;
                }
                return;
            }
            gVar.f304058m = null;
            gVar.f304059n = true;
        }
    }

    public void setTalkerName(String str) {
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.f285728s = str;
        smileyPanelManager.f285718i.f289456d = str;
        boolean z = Util.isNullOrNil(str) || (!C72996z1.m85843n5(str) && !C72996z1.m85847r5(str));
        C97906h hVar = smileyPanelManager.f285725p;
        if (hVar.f287208e != z) {
            hVar.f287208e = z;
            smileyPanelManager.f285726q.mo137246b();
        }
        if (C72996z1.m85832c5(smileyPanelManager.f285728s)) {
            C97906h hVar2 = smileyPanelManager.f285725p;
            if (hVar2.f287210g) {
                hVar2.f287210g = false;
                smileyPanelManager.f285726q.mo137246b();
            }
        }
    }

    public void setToSendText(String str) {
        this.f285630g.f285729t = str;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f285630g.mo136449a();
            return;
        }
        SmileyPanelManager smileyPanelManager = this.f285630g;
        smileyPanelManager.getClass();
        Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onPause: ");
        smileyPanelManager.f285711b = false;
        smileyPanelManager.f285698C.mo71266a();
        C96954m mVar = C96954m.f284033a;
        if (!C96954m.f284039g) {
            C96954m.f284039g = true;
            C53895h.m60466d(C96954m.f284035c, C53872d1.f151119c, (C53934p0) null, new C96959n((C15601d<? super C96959n>) null), 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmileyPanelImpl(Context context, AttributeSet attributeSet, boolean z) {
        super(new C85978w1(context, z ? C0966R.style.f8436ie : C0966R.style.f8435id), attributeSet);
        this.f285631h = false;
        this.f285632i = false;
        SmileyPanelManager smileyPanelManager = new SmileyPanelManager(getContext());
        this.f285630g = smileyPanelManager;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a27, this);
        smileyPanelManager.f285719j.f304048c = inflate;
        smileyPanelManager.f285715f = (RecyclerView) inflate.findViewById(C0966R.C0970id.cgo);
        smileyPanelManager.f285723n = (NestedBounceView) inflate.findViewById(C0966R.C0970id.cgd);
        C98711d dVar = new C98711d(smileyPanelManager.f285725p.f287204a);
        smileyPanelManager.f285718i = dVar;
        smileyPanelManager.f285716g.f289503o = dVar;
        smileyPanelManager.f285715f.setLayoutManager(smileyPanelManager.f285717h);
        smileyPanelManager.f285715f.setAdapter(smileyPanelManager.f285716g);
        smileyPanelManager.f285715f.setHasFixedSize(true);
        smileyPanelManager.f285715f.setFocusable(false);
        C60878a aVar = new C60878a();
        aVar.f173447m = new SmileyPanelManager$$b(smileyPanelManager);
        aVar.mo75025b(smileyPanelManager.f285715f);
        smileyPanelManager.f285722m = (RecyclerView) inflate.findViewById(C0966R.C0970id.jnk);
        C98720h0 h0Var = smileyPanelManager.f285724o;
        C98720h0.C98721a aVar2 = smileyPanelManager.f285707L;
        h0Var.getClass();
        C87412m.m108594g(aVar2, "onItemClickListener");
        h0Var.f289475f = aVar2;
        RecyclerView recyclerView = smileyPanelManager.f285722m;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        smileyPanelManager.f285722m.setAdapter(smileyPanelManager.f285724o);
        smileyPanelManager.f285722m.setItemAnimator((RecyclerView.C16616j) null);
        smileyPanelManager.f285720k = inflate.findViewById(C0966R.C0970id.cgr);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.cge);
        smileyPanelManager.f285721l = imageView;
        imageView.setOnClickListener(new C75075a(smileyPanelManager));
        smileyPanelManager.f285719j.f304065t = smileyPanelManager.f285701F;
        dVar.f289457e = new SmileyPanelManager$$c(smileyPanelManager);
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            fragmentActivity.runOnUiThread(new C79407h0(this, fragmentActivity));
        }
        if (MMApplicationContext.isMainProcess()) {
            C92668a.C92674f fVar = C92668a.f266699q;
            fVar.mo126718b(false).mo126702d(true);
            fVar.mo126717a(false).mo126702d(true);
            if (MMApplicationContext.isMainProcess()) {
                C61926c.m72657B("EmojiPackSyncManager_checkStart", true, C34299h.f92434d);
            }
            if (MMApplicationContext.isMainProcess()) {
                C61926c.m72657B("EmojiSuggestWordsSync_checkWordListUpdate", true, C32478k.f86290d);
            }
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C41060a(((C92054g) C86312j.m106911c(C92054g.class)).wx0()));
            if (C30777t2.f82756d.wx0()) {
                C96954m.f284033a.mo135539c(false);
            }
        }
    }
}
