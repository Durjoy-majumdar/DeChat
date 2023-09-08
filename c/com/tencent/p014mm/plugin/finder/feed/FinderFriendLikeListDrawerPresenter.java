package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0793y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedLikeEvent;
import com.tencent.p014mm.autogen.events.FinderUninterestEvent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58784w3;
import er1.C7832m3;
import er1.C7878t0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import je1.C9370r3;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import pe3.C89349b;
import rs1.C13442s8;
import ur1.C14378f;
import vp1.C14927d;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter */
public final class FinderFriendLikeListDrawerPresenter extends FinderLikeDrawerPresenter {

    /* renamed from: x */
    public final Context f13075x;

    /* renamed from: y */
    public IListener<FeedLikeEvent> f13076y;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$a */
    public static final class C2515a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f13077d;

        /* renamed from: e */
        public final /* synthetic */ FinderFriendLikeListDrawerPresenter f13078e;

        public C2515a(Context context, FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter) {
            this.f13077d = context;
            this.f13078e = finderFriendLikeListDrawerPresenter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter$doExtraTitleChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8.C13443a.m12791e(aVar, this.f13077d, intent, this.f13078e.mo2551i().getId(), (String) null, 0, 0, false, 0, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
            Context context = this.f13077d;
            bVar.getClass();
            C87412m.m108594g(context, "context");
            C58684b.Cx0(bVar, context, (Intent) null, 1, 2, (Object) null);
            C13442s8 f = aVar.mo12873f(this.f13077d);
            if (f != null) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Jx0(f.mo12861q3(), this.f13078e.mo2551i().getId(), 5, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter$doExtraTitleChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$b */
    public static final class C2516b extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.set(0, 0, 0, 0);
        }
    }

    public FinderFriendLikeListDrawerPresenter(Context context) {
        C87412m.m108594g(context, "context");
        this.f13075x = context;
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo2531a(Context context) {
        C87412m.m108594g(context, "context");
        return new C2516b();
    }

    /* renamed from: b */
    public RecyclerView.LayoutManager mo2532b(Context context) {
        C87412m.m108594g(context, "context");
        return new LinearLayoutManager(context, 1, false);
    }

    /* renamed from: c */
    public WxRecyclerAdapter<?> mo2533c(Context context) {
        C87412m.m108594g(context, "context");
        return new WxRecyclerAdapter<>(new FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1(this), this.f13103g, false);
    }

    /* renamed from: d */
    public void mo2534d(Context context, FrameLayout frameLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "headerLayout");
        View findViewById = frameLayout.findViewById(C0966R.C0970id.ca4);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        frameLayout.findViewById(C0966R.C0970id.ca4).setOnClickListener(new C2515a(context, this));
    }

    /* renamed from: f */
    public void mo2535f(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: g */
    public void mo2536g(C14378f fVar, FinderItem finderItem, C89349b bVar) {
        C87412m.m108594g(fVar, "builder");
        C87412m.m108594g(finderItem, "feedObj");
        super.mo2536g(fVar, finderItem, bVar);
        FinderFriendLikeListDrawerPresenter$onAttach$1 finderFriendLikeListDrawerPresenter$onAttach$1 = new FinderFriendLikeListDrawerPresenter$onAttach$1(this, C40008f.f107254d);
        this.f13076y = finderFriendLikeListDrawerPresenter$onAttach$1;
        finderFriendLikeListDrawerPresenter$onAttach$1.alive();
        C14927d.C14929b bVar2 = C14927d.f40957e;
        bVar2.mo13977a().mo13976a();
        bVar2.mo13977a().getClass();
        C86709a0.m107524d().mo123460f(new C9370r3(1));
    }

    public int getScene() {
        FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
        return 1;
    }

    /* renamed from: j */
    public C9500j mo2538j() {
        return new FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1(this);
    }

    /* renamed from: k */
    public CharSequence mo2539k() {
        if (mo2553l(mo2551i())) {
            C14378f fVar = this.f13106j;
            String string = fVar != null ? fVar.mo13677b().getString(C0966R.string.ddy, new Object[]{C7878t0.m8035d((long) this.f13109p)}) : null;
            C14378f fVar2 = this.f13106j;
            if (fVar2 == null) {
                return "";
            }
            Context b = fVar2.mo13677b();
            return C7832m3.m7968c(C7832m3.f26372a, 0, string == null ? "" : string, b, true, b.getResources().getColor(C0966R.color.FG_0), 0, false, 96, (Object) null);
        }
        Context context = MMApplicationContext.getContext();
        String string2 = context.getString(C0966R.string.foo, new Object[]{Integer.valueOf(Util.safeParseInt(C7878t0.m8035d((long) this.f13109p)))});
        C87412m.m108593f(string2, "context.getString(R.stri…osterNumber(totalCount)))");
        int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer b0 = w3Var.mo83917b0(1, true);
        return w3Var.mo83957q1(context, string2, '#', b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold, C0966R.color.a7f, dimension, dimension);
    }

    public void onDetach() {
        if (!this.f13113t) {
            Log.m105924i("Finder.DrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        ArrayList<C0793y> arrayList = this.f13103g;
        ArrayList<C0793y> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            boolean z = true;
            if (((C0793y) next).f1851d.f138728h != 1) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        for (C0793y yVar : arrayList2) {
            FinderUninterestEvent finderUninterestEvent = new FinderUninterestEvent();
            FinderUninterestEvent.C1068a aVar = finderUninterestEvent.f9262d;
            aVar.f9263a = yVar.f1851d.f138729i;
            aVar.f9264b = yVar.f1852e ? 1 : 0;
            finderUninterestEvent.publish();
        }
        super.onDetach();
        C14927d a = C14927d.f40957e.mo13977a();
        a.getClass();
        C86709a0.m107524d().mo123470p(3528, a);
        C86709a0.m107524d().mo123470p(3990, a);
        IListener<FeedLikeEvent> iListener = this.f13076y;
        if (iListener != null) {
            iListener.dead();
        }
    }
}
