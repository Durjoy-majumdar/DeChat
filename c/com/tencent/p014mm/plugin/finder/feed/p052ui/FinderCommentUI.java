package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.ActionBar;
import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderTouchLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import nj3.C88989a;
import rs1.C13442s8;
import rx3.C13604l;
import ur1.C65468g;
import vf1.C65713m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderCommentUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI */
public final class FinderCommentUI extends MMFinderUI {

    /* renamed from: A */
    public boolean f158853A;

    /* renamed from: o */
    public final String f158854o = "Finder.FinderCommentUI";

    /* renamed from: p */
    public final long f158855p = 300;

    /* renamed from: q */
    public final int f158856q = 50;

    /* renamed from: r */
    public final int f158857r = 300;

    /* renamed from: s */
    public final float f158858s = 0.3f;

    /* renamed from: t */
    public FinderTouchLayout f158859t;

    /* renamed from: u */
    public FinderCommentDrawer f158860u;

    /* renamed from: v */
    public C13604l<C56597e1.C56598a.C30026a, C56597e1.C56598a.C56599b> f158861v;

    /* renamed from: w */
    public C65468g f158862w;

    /* renamed from: x */
    public boolean f158863x;

    /* renamed from: y */
    public long f158864y;

    /* renamed from: z */
    public int f158865z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI$a */
    public static final class C55798a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C55798a f158866d = new C55798a();

        public C55798a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI$b */
    public static final class C55799b implements CommentDrawerContract.CloseDrawerCallback {

        /* renamed from: a */
        public final /* synthetic */ FinderCommentUI f158867a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI$b$a */
        public static final class C55800a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentUI f158868d;

            public C55800a(FinderCommentUI finderCommentUI) {
                this.f158868d = finderCommentUI;
            }

            public final void run() {
                this.f158868d.finish();
            }
        }

        public C55799b(FinderCommentUI finderCommentUI) {
            this.f158867a = finderCommentUI;
        }

        /* renamed from: a */
        public void mo2377a(int i, List<? extends C55033u> list, boolean z) {
            C87412m.m108594g(list, "data");
            FinderCommentUI finderCommentUI = this.f158867a;
            if (!finderCommentUI.f158853A) {
                finderCommentUI.f158853A = true;
                Intent intent = new Intent();
                C56597e1.C56598a aVar = C56597e1.f162252i;
                C56597e1.C56598a.C30027c cVar = new C56597e1.C56598a.C30027c(i, list);
                long currentTimeMillis = System.currentTimeMillis();
                intent.putExtra("COMMENT_RESULT_KEY", currentTimeMillis);
                C56597e1.f162254k.put(Long.valueOf(currentTimeMillis), cVar);
                this.f158867a.setResult(0, intent);
                View contentView = this.f158867a.getContentView();
                FinderCommentUI finderCommentUI2 = this.f158867a;
                contentView.postDelayed(new C55800a(finderCommentUI2), finderCommentUI2.f158855p);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI$c */
    public static final class C55801c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentUI f158869d;

        /* renamed from: e */
        public final /* synthetic */ C56597e1.C56598a.C56599b f158870e;

        public C55801c(FinderCommentUI finderCommentUI, C56597e1.C56598a.C56599b bVar) {
            this.f158869d = finderCommentUI;
            this.f158870e = bVar;
        }

        public final void run() {
            FinderCommentDrawer O7 = this.f158869d.mo77402O7();
            C56597e1.C56598a.C56599b bVar = this.f158870e;
            FinderCommentDrawer.m65189m(O7, bVar.f162263a, bVar.f162264b, bVar.f162265c, bVar.f162266d, bVar.f162267e, bVar.f162268f, true, false, 0, false, 0, 0, 0, 8064, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI$d */
    public static final class C55802d implements FinderTouchLayout.C56569a {

        /* renamed from: a */
        public float f158871a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommentUI f158872b;

        public C55802d(FinderCommentUI finderCommentUI) {
            this.f158872b = finderCommentUI;
            this.f158871a = ((float) finderCommentUI.getResources().getDisplayMetrics().heightPixels) / ((float) finderCommentUI.getResources().getDisplayMetrics().widthPixels);
        }

        /* renamed from: a */
        public void mo77405a(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            String str = this.f158872b.f158854o;
            Log.m105924i(str, "translationY " + this.f158872b.mo77401N7().getTranslationY() + ", height:" + this.f158872b.mo77401N7().getHeight());
            float translationY = this.f158872b.mo77401N7().getTranslationY();
            FinderCommentUI finderCommentUI = this.f158872b;
            if (translationY > finderCommentUI.f158858s * ((float) finderCommentUI.mo77401N7().getHeight())) {
                this.f158872b.mo77402O7().mo79715l();
                return;
            }
            this.f158872b.mo77401N7().clearAnimation();
            this.f158872b.mo77401N7().animate().cancel();
            this.f158872b.mo77401N7().animate().setInterpolator(new DecelerateInterpolator(1.5f)).translationY(0.0f).setDuration(this.f158872b.f158855p).start();
        }

        /* renamed from: b */
        public boolean mo77406b(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            return motionEvent.getRawX() <= ((float) this.f158872b.f158856q) && motionEvent.getRawY() > ((float) this.f158872b.f158857r);
        }

        /* renamed from: c */
        public void mo77407c(float f) {
            this.f158872b.mo77401N7().setTranslationY(this.f158871a * f);
            String str = this.f158872b.f158854o;
            Log.m105924i(str, "distanceX " + f + ", translationY " + this.f158872b.mo77401N7().getTranslationY());
        }
    }

    /* renamed from: N7 */
    public final FinderTouchLayout mo77401N7() {
        FinderTouchLayout finderTouchLayout = this.f158859t;
        if (finderTouchLayout != null) {
            return finderTouchLayout;
        }
        C87412m.m108603p("containerView");
        throw null;
    }

    /* renamed from: O7 */
    public final FinderCommentDrawer mo77402O7() {
        FinderCommentDrawer finderCommentDrawer = this.f158860u;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer;
        }
        C87412m.m108603p("drawer");
        throw null;
    }

    public void finish() {
        hideVKB();
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a9r;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C13442s8.class;
        setTheme(C0966R.style.f8644pq);
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            ActionBar supportActionBar = getSupportActionBar();
            C87412m.m108591d(supportActionBar);
            supportActionBar.mo91112w(new ColorDrawable(0));
            ActionBar supportActionBar2 = getSupportActionBar();
            C87412m.m108591d(supportActionBar2);
            supportActionBar2.mo91104o();
        }
        C56597e1.C56598a aVar = C56597e1.f162252i;
        Intent intent = getIntent();
        C87412m.m108594g(intent, "intent");
        C13604l<C56597e1.C56598a.C30026a, C56597e1.C56598a.C56599b> remove = C56597e1.f162253j.remove(Long.valueOf(intent.getLongExtra("COMMENT_REQUEST_KEY", 0)));
        if (remove == null) {
            finish();
            return;
        }
        this.f158861v = remove;
        Intent intent2 = getIntent();
        C87412m.m108594g(intent2, "intent");
        this.f158863x = intent2.getBooleanExtra("FROM_MSG", false);
        Intent intent3 = getIntent();
        C87412m.m108594g(intent3, "intent");
        this.f158864y = intent3.getLongExtra("MENTION_ID", 0);
        Intent intent4 = getIntent();
        C87412m.m108594g(intent4, "intent");
        this.f158865z = intent4.getIntExtra("MENTION_CREATE_TIME", 0);
        C13604l<C56597e1.C56598a.C30026a, C56597e1.C56598a.C56599b> lVar = this.f158861v;
        if (lVar != null) {
            C56597e1.C56598a.C30026a aVar2 = (C56597e1.C56598a.C30026a) lVar.f38555d;
            if (lVar != null) {
                C56597e1.C56598a.C56599b bVar = (C56597e1.C56598a.C56599b) lVar.f38556e;
                View findViewById = findViewById(C0966R.C0970id.bk9);
                C87412m.m108593f(findViewById, "findViewById(R.id.comment_ui_container)");
                this.f158859t = (FinderTouchLayout) findViewById;
                this.f158862w = new C65713m(this.f158863x, bVar.f162263a, this.f158864y, this.f158865z, aVar2.f81264a, this, new FinderCommentDrawerPresenter(this));
                C39818r rVar = C39818r.f106831a;
                ((C13442s8) rVar.mo62444c(this).mo75002a(cls)).f38096i = ((C13442s8) rVar.mo62444c(this).mo75002a(cls)).f38095h;
                FinderCommentDrawer.C56551b bVar2 = FinderCommentDrawer.f162026V;
                View decorView = getWindow().getDecorView();
                C87412m.m108593f(decorView, "window.decorView");
                int i = aVar2.f81264a;
                C65468g gVar = this.f158862w;
                if (gVar != null) {
                    this.f158860u = FinderCommentDrawer.C56551b.m65197a(bVar2, this, decorView, i, gVar, aVar2.f81265b, true, 0, 64, (Object) null);
                    mo77402O7().setInterceptClose(C55798a.f158866d);
                    mo77402O7().setOnCloseDrawerCallback(new C55799b(this));
                    mo77401N7().post(new C55801c(this, bVar));
                    mo77401N7().setTouchListener(new C55802d(this));
                    return;
                }
                C87412m.m108603p("builder");
                throw null;
            }
            C87412m.m108603p("requestData");
            throw null;
        }
        C87412m.m108603p("requestData");
        throw null;
    }

    public void onDestroy() {
        mo77402O7().mo9498f();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }
}
