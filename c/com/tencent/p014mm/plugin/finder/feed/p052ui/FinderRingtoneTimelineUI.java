package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8757a2;
import ht1.C8766f5;
import ht1.C8768g2;
import ht1.C8773i2;
import ht1.C8787n2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kf1.C10069z8;
import kf1.C9854m5;
import kotlin.Metadata;
import p145dx.C58457w;
import p145dx.C58458y;
import p145dx.C7523p;
import p145dx.C7525r;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vf1.C14811p4;
import vf1.C14816q4;
import vf1.C14821r4;
import vf1.C14826s4;
import vf1.C14831t4;
import vp1.C65834e;
import wj2.C66132f;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRingtoneTimelineLoader;", "Lkf1/z8;", "Lcom/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI */
public final class FinderRingtoneTimelineUI extends FinderLoaderFeedUI<FinderRingtoneTimelineLoader, C10069z8, FinderRingtoneTimelineContract$Presenter> {

    /* renamed from: A */
    public final C13601g f14772A = C36568h.m40985a(new C3043c(this));

    /* renamed from: B */
    public boolean f14773B;

    /* renamed from: C */
    public int f14774C;

    /* renamed from: D */
    public long f14775D;

    /* renamed from: E */
    public String f14776E = "";

    /* renamed from: F */
    public int f14777F = 2;

    /* renamed from: G */
    public String f14778G = "";

    /* renamed from: H */
    public float f14779H = -1.0f;

    /* renamed from: I */
    public final int f14780I = ViewConfiguration.getTouchSlop();

    /* renamed from: s */
    public FinderRingtoneTimelineContract$Presenter f14781s;

    /* renamed from: t */
    public C10069z8 f14782t;

    /* renamed from: u */
    public FinderRingtoneTimelineLoader f14783u;

    /* renamed from: v */
    public TextView f14784v;

    /* renamed from: w */
    public boolean f14785w = true;

    /* renamed from: x */
    public final C13601g f14786x = C36568h.m40985a(new C3041a(this));

    /* renamed from: y */
    public BaseFinderFeed f14787y;

    /* renamed from: z */
    public final C13601g f14788z = C36568h.m40985a(new C3045e(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI$a */
    public static final class C3041a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderRingtoneTimelineUI f14789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3041a(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
            super(0);
            this.f14789d = finderRingtoneTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14789d.getIntent().getIntExtra("key_comment_scene", 25));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI$b */
    public static final class C3042b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderRingtoneTimelineUI f14790d;

        public C3042b(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
            this.f14790d = finderRingtoneTimelineUI;
        }

        public final void onClick(View view) {
            Class cls = C58457w.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderRingtoneTimelineUI finderRingtoneTimelineUI = this.f14790d;
            if (!finderRingtoneTimelineUI.f14773B) {
                ((C58457w) C86312j.m106911c(cls)).Fo0(this.f14790d);
                C7525r rVar = (C7525r) C86312j.m106911c(C7525r.class);
                FinderRingtoneTimelineUI finderRingtoneTimelineUI2 = this.f14790d;
                String unsignedLongString = Util.getUnsignedLongString(finderRingtoneTimelineUI2.f14775D);
                C87412m.m108593f(unsignedLongString, "getUnsignedLongString(objectId)");
                String str = this.f14790d.f14778G;
                if (str == null) {
                    str = "";
                }
                rVar.mo8650rm(finderRingtoneTimelineUI2, unsignedLongString, str);
                this.f14790d.finish();
            } else {
                C10069z8 z8Var = finderRingtoneTimelineUI.f14782t;
                if (z8Var == null) {
                    C87412m.m108603p("viewCallback");
                    throw null;
                } else if (z8Var.getRecyclerView().getLayoutManager() instanceof FinderLinearLayoutManager) {
                    C10069z8 z8Var2 = this.f14790d.f14782t;
                    if (z8Var2 != null) {
                        RecyclerView.LayoutManager layoutManager = z8Var2.getRecyclerView().getLayoutManager();
                        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                        int C = ((FinderLinearLayoutManager) layoutManager).mo16957C();
                        if (C >= 0) {
                            FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f14790d.f14783u;
                            if (finderRingtoneTimelineLoader == null) {
                                C87412m.m108603p("feedLoader");
                                throw null;
                            } else if (C < finderRingtoneTimelineLoader.getDataList().size()) {
                                FinderRingtoneTimelineLoader finderRingtoneTimelineLoader2 = this.f14790d.f14783u;
                                if (finderRingtoneTimelineLoader2 != null) {
                                    Object obj = finderRingtoneTimelineLoader2.getDataList().get(C);
                                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                                    C66132f Xz = ((C7523p) C86312j.m106911c(C7523p.class)).mo8647Xz(((BaseFinderFeed) obj).getItemId());
                                    if (Xz == null) {
                                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        return;
                                    }
                                    ((C58457w) C86312j.m106911c(cls)).mo82794b8(this.f14790d, Xz);
                                } else {
                                    C87412m.m108603p("feedLoader");
                                    throw null;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("select invalid position:");
                        sb.append(C);
                        sb.append(", size:");
                        FinderRingtoneTimelineLoader finderRingtoneTimelineLoader3 = this.f14790d.f14783u;
                        if (finderRingtoneTimelineLoader3 != null) {
                            sb.append(finderRingtoneTimelineLoader3.getDataList().size());
                            Log.m105928w("Finder.FinderRingtoneTimelineUI", sb.toString());
                        } else {
                            C87412m.m108603p("feedLoader");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI$c */
    public static final class C3043c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderRingtoneTimelineUI f14791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3043c(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
            super(0);
            this.f14791d = finderRingtoneTimelineUI;
        }

        public Object invoke() {
            return this.f14791d.findViewById(C0966R.C0970id.g19);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI$d */
    public static final class C3044d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderRingtoneTimelineUI f14792d;

        /* renamed from: e */
        public final /* synthetic */ View f14793e;

        public C3044d(FinderRingtoneTimelineUI finderRingtoneTimelineUI, View view) {
            this.f14792d = finderRingtoneTimelineUI;
            this.f14793e = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14792d.mo3099X7(true);
            View view2 = this.f14793e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.f14792d.f14781s;
            if (finderRingtoneTimelineContract$Presenter != null) {
                finderRingtoneTimelineContract$Presenter.requestRefresh();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI$e */
    public static final class C3045e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderRingtoneTimelineUI f14794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3045e(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
            super(0);
            this.f14794d = finderRingtoneTimelineUI;
        }

        public Object invoke() {
            return this.f14794d.findViewById(C0966R.C0970id.f359187ji0);
        }
    }

    /* renamed from: V7 */
    public static final View m2957V7(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
        Object value = ((C36570n) finderRingtoneTimelineUI.f14788z).getValue();
        C87412m.m108593f(value, "<get-tipsLayout>(...)");
        return (View) value;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f14783u;
        if (finderRingtoneTimelineLoader != null) {
            return finderRingtoneTimelineLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.f14781s;
        if (finderRingtoneTimelineContract$Presenter != null) {
            return finderRingtoneTimelineContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C10069z8 z8Var = this.f14782t;
        if (z8Var != null) {
            return z8Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        this.f14775D = getIntent().getLongExtra("feed_object_id", 0);
        String stringExtra = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14776E = stringExtra;
        getIntent().getIntExtra("report_scene", 0);
        this.f14778G = getIntent().getStringExtra("from_user");
        boolean z = true;
        this.f14773B = this.f14775D == 0;
        this.f14774C = getIntent().getIntExtra("KEY_RINGTONE_LOADER_TYPE", 0);
        FinderItem e = C65834e.f189316a.mo89871e(this.f14775D);
        if (e != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("use cache cacheTime=");
            long j = (long) 1000;
            sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, e.getTimestamps() / j));
            sb.append(", cacheTime=");
            sb.append(e.getTimestamps());
            sb.append(" current=");
            sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, C31543z5.m39453c() / j));
            sb.append(", urlValidDuration=");
            sb.append(e.getFeedObject().urlValidDuration);
            sb.append('s');
            Log.m105924i("Finder.FinderRingtoneTimelineUI", sb.toString());
            if (e.getTimestamps() <= 0 || C31543z5.m39453c() < e.getTimestamps() + (((long) e.getFeedObject().urlValidDuration) * 1000)) {
                this.f14787y = C15585f.f42211a.mo14348k(e);
            }
        }
        if (this.f14787y != null || this.f14773B) {
            mo3099X7(false);
        } else {
            Log.m105924i("Finder.FinderRingtoneTimelineUI", "cache null.show progress");
            mo3099X7(true);
        }
        FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = new FinderRingtoneTimelineContract$Presenter(this, this.f14773B);
        finderRingtoneTimelineContract$Presenter.f13215y = this.f14787y;
        finderRingtoneTimelineContract$Presenter.f13213w = new C14811p4(this);
        new C14816q4(this, finderRingtoneTimelineContract$Presenter);
        finderRingtoneTimelineContract$Presenter.f13214x = new C14821r4(this);
        this.f14781s = finderRingtoneTimelineContract$Presenter;
        FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = new FinderRingtoneTimelineLoader(this.f14775D, this.f14776E, this.f14774C, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
        finderRingtoneTimelineLoader.initFromCache(getIntent());
        finderRingtoneTimelineLoader.setInitDone(new C14826s4(this, finderRingtoneTimelineLoader));
        finderRingtoneTimelineLoader.f13821g = new C14831t4(this);
        this.f14783u = finderRingtoneTimelineLoader;
        FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter2 = this.f14781s;
        if (finderRingtoneTimelineContract$Presenter2 != null) {
            this.f14782t = new C10069z8(this, finderRingtoneTimelineContract$Presenter2, this.f14777F, ((Number) ((C36570n) this.f14786x).getValue()).intValue());
            if (this.f14773B && !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, false)) {
                z = false;
            }
            this.f14785w = z;
            if (z) {
                View W7 = mo3098W7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = W7;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                W7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View W72 = mo3098W7();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = W72;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                W72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById = findViewById(C0966R.C0970id.f359445ky1);
            C87412m.m108593f(findViewById, "findViewById(R.id.tv_select)");
            TextView textView = (TextView) findViewById;
            this.f14784v = textView;
            textView.setText(getString(!this.f14773B ? C0966R.string.iy5 : C0966R.string.f7929wj));
            TextView textView2 = this.f14784v;
            if (textView2 != null) {
                textView2.setOnClickListener(new C3042b(this));
            } else {
                C87412m.m108603p("selectTv");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: W7 */
    public final View mo3098W7() {
        Object value = ((C36570n) this.f14772A).getValue();
        C87412m.m108593f(value, "<get-popupTipsLayout>(...)");
        return (View) value;
    }

    /* renamed from: X7 */
    public final void mo3099X7(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.f359188ji1);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: Y7 */
    public final void mo3100Y7(boolean z) {
        Log.m105924i("Finder.FinderRingtoneTimelineUI", "showRetryTips ifShow:" + z);
        View findViewById = findViewById(C0966R.C0970id.is8);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C3044d(this, findViewById));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r8 = r6.f44854d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r12, r0)
            android.view.View r0 = r11.mo3098W7()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x012e
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0128
            r1 = 1
            if (r0 == r1) goto L_0x001a
            goto L_0x012e
        L_0x001a:
            float r0 = r11.f14779H
            float r2 = r12.getY()
            float r0 = r0 - r2
            android.view.View r2 = r11.mo3098W7()
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x012e
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x012e
            int r3 = r11.f14780I
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x012e
            android.view.View r0 = r11.mo3098W7()
            r3 = 48
            r4 = 250(0xfa, double:1.235E-321)
            int r6 = r0.getVisibility()
            if (r6 != 0) goto L_0x0116
            androidx.appcompat.app.AppCompatActivity r6 = r11.getContext()
            int r3 = kg3.C76577a.m92151b(r6, r3)
            float r3 = (float) r3
            kf1.z8 r6 = r11.f14782t
            r7 = 0
            if (r6 == 0) goto L_0x010f
            androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
            r8 = 0
            androidx.recyclerview.widget.RecyclerView$z r6 = r6.mo17023I0(r8)
            if (r6 == 0) goto L_0x006a
            android.view.View r8 = r6.f44854d
            if (r8 == 0) goto L_0x006a
            r9 = 2131302830(0x7f0919ae, float:1.8223757E38)
            android.view.View r8 = r8.findViewById(r9)
            goto L_0x006b
        L_0x006a:
            r8 = r7
        L_0x006b:
            if (r6 == 0) goto L_0x0079
            android.view.View r9 = r6.f44854d
            if (r9 == 0) goto L_0x0079
            r10 = 2131304750(0x7f09212e, float:1.8227651E38)
            android.view.View r9 = r9.findViewById(r10)
            goto L_0x007a
        L_0x0079:
            r9 = r7
        L_0x007a:
            if (r6 == 0) goto L_0x0088
            android.view.View r6 = r6.f44854d
            if (r6 == 0) goto L_0x0088
            r10 = 2131301992(0x7f091668, float:1.8222058E38)
            android.view.View r6 = r6.findViewById(r10)
            goto L_0x0089
        L_0x0088:
            r6 = r7
        L_0x0089:
            if (r8 == 0) goto L_0x00a0
            android.view.ViewPropertyAnimator r8 = r8.animate()
            if (r8 == 0) goto L_0x00a0
            android.view.ViewPropertyAnimator r8 = r8.translationYBy(r3)
            if (r8 == 0) goto L_0x00a0
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r4)
            if (r8 == 0) goto L_0x00a0
            r8.start()
        L_0x00a0:
            if (r9 == 0) goto L_0x00b7
            android.view.ViewPropertyAnimator r8 = r9.animate()
            if (r8 == 0) goto L_0x00b7
            android.view.ViewPropertyAnimator r8 = r8.translationYBy(r3)
            if (r8 == 0) goto L_0x00b7
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r4)
            if (r8 == 0) goto L_0x00b7
            r8.start()
        L_0x00b7:
            if (r6 == 0) goto L_0x00ce
            android.view.ViewPropertyAnimator r6 = r6.animate()
            if (r6 == 0) goto L_0x00ce
            android.view.ViewPropertyAnimator r6 = r6.translationYBy(r3)
            if (r6 == 0) goto L_0x00ce
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r4)
            if (r6 == 0) goto L_0x00ce
            r6.start()
        L_0x00ce:
            android.widget.TextView r6 = r11.f14784v
            if (r6 == 0) goto L_0x0108
            android.view.ViewPropertyAnimator r6 = r6.animate()
            if (r6 == 0) goto L_0x00e7
            android.view.ViewPropertyAnimator r3 = r6.translationYBy(r3)
            if (r3 == 0) goto L_0x00e7
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r4)
            if (r3 == 0) goto L_0x00e7
            r3.start()
        L_0x00e7:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            if (r3 == 0) goto L_0x0116
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            if (r2 == 0) goto L_0x0116
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r4)
            if (r2 == 0) goto L_0x0116
            vf1.o4 r3 = new vf1.o4
            r3.<init>(r0)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r3)
            if (r0 == 0) goto L_0x0116
            r0.start()
            goto L_0x0116
        L_0x0108:
            java.lang.String r12 = "selectTv"
            gy3.C87412m.m108603p(r12)
            throw r7
        L_0x010f:
            java.lang.String r12 = "viewCallback"
            gy3.C87412m.m108603p(r12)
            throw r7
        L_0x0116:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.mo119677K(r2, r3)
            r11.f14785w = r1
            goto L_0x012e
        L_0x0128:
            float r0 = r12.getY()
            r11.f14779H = r0
        L_0x012e:
            boolean r12 = super.dispatchTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRingtoneTimelineUI.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.coz;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        Class cls = C58458y.class;
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(((C58458y) C86312j.m106911c(cls)).tk0());
        hashSet.add(((C58458y) C86312j.m106911c(cls)).Sp0());
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8757a2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8768g2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8766f5.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8787n2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8773i2.class)));
    }
}
