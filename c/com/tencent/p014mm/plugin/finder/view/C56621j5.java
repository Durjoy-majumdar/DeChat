package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import co1.C55041a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56630k;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d03.C58010a;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j03.C60695a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l60.C99344b;
import m03.C61431n;
import nc3.C34767b;
import o40.C61926c;
import p182kk.C61104a;
import p749xh.C66261f3;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import pl1.C62367r0;
import pl1.C62372x;
import r60.C101350i;
import rx3.C13598b0;
import sx3.C110818d0;
import t60.C64207e;
import te3.C64689rq2;
import up1.C27696y;
import uz2.C65490m;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.finder.view.j5 */
public final class C56621j5 extends C56630k {

    /* renamed from: o */
    public final FrameLayout f162323o;

    /* renamed from: p */
    public final String f162324p = getTag();

    /* renamed from: q */
    public FeedData f162325q;

    /* renamed from: r */
    public final ImageView f162326r;

    /* renamed from: s */
    public MMTPEffectVideoLayout f162327s;

    /* renamed from: t */
    public boolean f162328t;

    /* renamed from: u */
    public boolean f162329u;

    /* renamed from: v */
    public C34767b.C34768c f162330v;

    /* renamed from: com.tencent.mm.plugin.finder.view.j5$a */
    public static final class C56622a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C56621j5 f162331a;

        public C56622a(C56621j5 j5Var) {
            this.f162331a = j5Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C56621j5 j5Var = this.f162331a;
            j5Var.f162326r.post(new C56617i5((Bitmap) obj, j5Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.j5$b */
    public static final class C56623b extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56621j5 f162332d;

        /* renamed from: e */
        public final /* synthetic */ MMTPEffectVideoLayout f162333e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56623b(C56621j5 j5Var, MMTPEffectVideoLayout mMTPEffectVideoLayout) {
            super(3);
            this.f162332d = j5Var;
            this.f162333e = mMTPEffectVideoLayout;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            int intValue = ((Number) obj2).intValue();
            int intValue2 = ((Number) obj3).intValue();
            Log.m105924i(this.f162332d.f162324p, "onFirstFrameAvailable");
            C56621j5 j5Var = this.f162332d;
            C65490m mVar = j5Var.f162346g;
            if (mVar.f188446e == 1 && !mVar.f188447f) {
                String str = j5Var.f162324p;
                StringBuilder sb = new StringBuilder();
                sb.append("[onPlayStarted] isViewOpen=");
                sb.append(this.f162332d.f162329u);
                sb.append(" width=");
                sb.append(intValue);
                sb.append(" height=");
                sb.append(intValue2);
                sb.append(" isPlaying=");
                C60695a player = this.f162333e.getPlayer();
                sb.append(player != null ? Boolean.valueOf(player.isPlaying()) : null);
                Log.m105924i(str, sb.toString());
                C56621j5 j5Var2 = this.f162332d;
                if (!j5Var2.f162329u) {
                    j5Var2.mo79977o();
                }
            }
            this.f162332d.f162326r.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.j5$c */
    public static final class C56624c implements C61431n {

        /* renamed from: a */
        public long f162334a;

        /* renamed from: b */
        public final /* synthetic */ C56621j5 f162335b;

        public C56624c(C56621j5 j5Var) {
            this.f162335b = j5Var;
        }

        /* renamed from: a */
        public void mo79982a(C58010a aVar, long j) {
            C56630k.C30030c cVar;
            if (this.f162334a > j && (cVar = this.f162335b.f162349j) != null) {
                cVar.f81273c++;
            }
            this.f162334a = j;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.j5$d */
    public static final class C56625d implements C34767b.C21622a {

        /* renamed from: a */
        public final /* synthetic */ C56621j5 f162336a;

        public C56625d(C56621j5 j5Var) {
            this.f162336a = j5Var;
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            C60695a player = this.f162336a.f162327s.getPlayer();
            if (player != null) {
                player.setMute(true);
            }
        }

        public void onResume() {
            C60695a player = this.f162336a.f162327s.getPlayer();
            if (player != null) {
                player.setMute(false);
            }
        }

        public void onStop() {
            C60695a player = this.f162336a.f162327s.getPlayer();
            if (player != null) {
                player.setMute(true);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56621j5(java.lang.String r1, android.widget.FrameLayout r2, uz2.C65488a0 r3, uz2.C65490m r4, com.tencent.p014mm.protocal.protobuf.FinderObject r5) {
        /*
            r0 = this;
            java.lang.String r1 = "parent"
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "jumpInfo"
            gy3.C87412m.m108594g(r3, r1)
            java.lang.String r1 = "pullDownParam"
            gy3.C87412m.m108594g(r4, r1)
            java.lang.String r1 = "finderObject"
            gy3.C87412m.m108594g(r5, r1)
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = "parent.context"
            gy3.C87412m.m108593f(r1, r3)
            r0.<init>(r1, r5, r4)
            r0.f162323o = r2
            java.lang.String r1 = r0.getTag()
            r0.f162324p = r1
            com.tencent.mm.plugin.finder.storage.FeedData$a r1 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FinderItem$a r3 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            int r4 = r5.objectType
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo79056a(r5, r4)
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.mo78884b(r3)
            r0.f162325q = r1
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r2.getContext()
            r1.<init>(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r1.setLayoutParams(r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r3)
            r0.f162326r = r1
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r3 = r0.mo79976n()
            r0.f162327s = r3
            android.content.Context r3 = r2.getContext()
            android.view.LayoutInflater r3 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r3)
            r4 = 2131495566(0x7f0c0a8e, float:1.8614672E38)
            r5 = 1
            r3.inflate(r4, r2, r5)
            r3 = 2131300426(0x7f09104a, float:1.8218881E38)
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r4 = r0.f162327s
            r3.addView(r4)
            r3.addView(r1)
            android.content.Context r1 = r2.getContext()
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r4 = 2131495565(0x7f0c0a8d, float:1.861467E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r4, r2, r5)
            r3.addView(r1)
            boolean r1 = r0.mo79984l()
            r0.mo79966k(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56621j5.<init>(java.lang.String, android.widget.FrameLayout, uz2.a0, uz2.m, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    /* renamed from: c */
    public long mo79974c() {
        C56630k.C30030c cVar = this.f162349j;
        if (cVar != null) {
            return (long) cVar.f81273c;
        }
        return 1;
    }

    /* renamed from: d */
    public boolean mo79975d() {
        return true;
    }

    /* renamed from: e */
    public void mo79961e() {
        super.mo79961e();
        mo79966k(mo79984l());
        C60695a player = this.f162327s.getPlayer();
        if (player != null) {
            player.mo85614i(false);
        }
        String str = this.f162324p;
        StringBuilder sb = new StringBuilder();
        sb.append("[onPostClose] isPlaying=");
        C60695a player2 = this.f162327s.getPlayer();
        sb.append(player2 != null ? Boolean.valueOf(player2.isPlaying()) : null);
        sb.append(" isPreviewVideo:");
        sb.append(this.f162346g.f188447f);
        Log.m105924i(str, sb.toString());
        if (this.f162346g.f188447f) {
            mo79981s(true);
        } else {
            mo79977o();
        }
    }

    /* renamed from: f */
    public void mo79962f() {
        this.f170310d = true;
        String str = this.f162324p;
        Log.m105924i(str, "[onPostOpen] isFeedValid=" + mo79984l());
        mo79966k(mo79984l());
        mo79983j();
        mo79978p();
    }

    /* renamed from: g */
    public void mo79963g() {
        Log.m105924i(this.f162324p, "[onPreClose]");
        this.f162329u = false;
    }

    public String getTag() {
        return "Finder.TextStatusVideoView@" + hashCode();
    }

    /* renamed from: h */
    public void mo79964h() {
        Log.m105924i(this.f162324p, "[onPreOpen]");
        this.f162349j = new C56630k.C30030c(0);
        this.f162329u = true;
    }

    /* renamed from: i */
    public void mo79965i(float f) {
    }

    /* renamed from: k */
    public void mo79966k(boolean z) {
        String str = this.f162324p;
        Log.m105924i(str, "[checkShowValidLayout] isFeedValid=" + z + " isViewOpen=" + this.f162329u);
        if (z) {
            View findViewById = this.f162323o.findViewById(C0966R.C0970id.f8m);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo79980r(this.f162327s);
            return;
        }
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) f;
        if (!(str2.length() == 0)) {
            String str3 = this.f162324p;
            Log.m105924i(str3, "[checkShowValidLayout] wording=" + str2);
            TextView textView = (TextView) this.f162323o.findViewById(C0966R.C0970id.f8o);
            if (textView != null) {
                textView.setText(str2);
            }
        }
        View findViewById2 = this.f162323o.findViewById(C0966R.C0970id.f8m);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f162329u) {
            View findViewById3 = this.f162323o.findViewById(C0966R.C0970id.f8n);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById4 = this.f162323o.findViewById(C0966R.C0970id.ew9);
            if (findViewById4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById5 = this.f162323o.findViewById(C0966R.C0970id.ew9);
            if (findViewById5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view5 = findViewById5;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById6 = this.f162323o.findViewById(C0966R.C0970id.f8n);
            if (findViewById6 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view6 = findViewById6;
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo79977o();
    }

    /* renamed from: m */
    public void mo79967m(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        String str = this.f162324p;
        StringBuilder sb = new StringBuilder();
        sb.append("[resetFinderObject] feedId=");
        sb.append(C61926c.m72691p(finderObject.f164794id));
        sb.append(" player");
        C60695a player = this.f162327s.getPlayer();
        sb.append(player != null ? Integer.valueOf(player.hashCode()) : null);
        Log.m105928w(str, sb.toString());
        this.f162325q = FeedData.Companion.mo78884b(FinderItem.Companion.mo79056a(finderObject, finderObject.objectType));
        C60695a player2 = this.f162327s.getPlayer();
        if (player2 != null) {
            player2.stop();
        }
        C60695a player3 = this.f162327s.getPlayer();
        if (player3 != null) {
            player3.recycle();
        }
        this.f162327s.mo81101g();
        ((ViewGroup) this.f162323o.findViewById(C0966R.C0970id.bso)).removeView(this.f162327s);
        this.f162327s = mo79976n();
        mo79981s(!this.f162329u || C61104a.m71668x() || C61104a.m71642B(this.f162327s.getContext(), false));
        ((ViewGroup) this.f162323o.findViewById(C0966R.C0970id.bso)).addView(this.f162327s, 0);
    }

    /* renamed from: n */
    public final MMTPEffectVideoLayout mo79976n() {
        Class<C11990s0> cls;
        C58010a aVar;
        Class<C11990s0> cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C27696y yVar = C27696y.THUMB_IMAGE;
        Context context = this.f162323o.getContext();
        C87412m.m108593f(context, "parent.context");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = new MMTPEffectVideoLayout(context, false);
        mMTPEffectVideoLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mMTPEffectVideoLayout.mo81100f();
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(this.f162325q.getMediaList());
        if (rq22 != null) {
            C62367r0 a = C55041a.f154526a.mo76098a(this.f162325q.getId(), rq22, false);
            String str = a.mo11841b() + "_textStatus";
            String str2 = a.getPath() + "_textStatus";
            String url = a.getUrl();
            String urlToken = a.getUrlToken();
            String decodeKey = a.getDecodeKey();
            long j = (long) rq22.f185269g;
            String g = a.mo87422g();
            cls = cls2;
            String str3 = decodeKey;
            C62344b0 b0Var = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
            String path = b0Var.getPath();
            String thumbUrl = b0Var.getThumbUrl();
            String thumbUrlToken = b0Var.getThumbUrlToken();
            String str4 = urlToken;
            aVar = new C58010a(str, str2, url, (int) rq22.f185270h, (int) rq22.f185271i);
            aVar.f165932d = str3;
            aVar.f165931c = str4;
            aVar.f165935g = j;
            aVar.f165930b = g;
            aVar.f165938j = path;
            aVar.f165936h = thumbUrl;
            aVar.f165937i = thumbUrlToken;
        } else {
            cls = cls2;
            aVar = new C58010a("", "", "", 0, 0);
        }
        mMTPEffectVideoLayout.setMediaInfo(aVar);
        mMTPEffectVideoLayout.getEffectManager().mo154924d();
        mMTPEffectVideoLayout.setKeepScreenOn(true);
        C60695a player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            player.mo85614i(true);
        }
        C60695a player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            player2.setLoop(true);
        }
        this.f162327s = mMTPEffectVideoLayout;
        mo79981s(true);
        C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(this.f162325q.getMediaList());
        C62372x xVar = rq23 != null ? new C62372x(rq23, yVar, (String) null, 4, (C8480h) null) : null;
        if (xVar != null) {
            C39818r rVar = C39818r.f106831a;
            Class<C11990s0> cls4 = cls;
            C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls4)).mo11871f2().mo85956b(xVar, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls4)).mo11867O2(C11978e0.C11979a.TIMELINE));
            C56622a aVar2 = new C56622a(this);
            b.getClass();
            b.f291320d = aVar2;
            b.mo85953c();
        }
        this.f162326r.setVisibility(0);
        mMTPEffectVideoLayout.setOnFirstFrameAvailable(new C56623b(this, mMTPEffectVideoLayout));
        C60695a player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            player3.mo85620n(new C56624c(this), 200);
        }
        this.f162328t = false;
        mo79980r(mMTPEffectVideoLayout);
        if (this.f162346g.f188447f) {
            mo79983j();
        }
        return mMTPEffectVideoLayout;
    }

    /* renamed from: o */
    public final void mo79977o() {
        C60695a player = this.f162327s.getPlayer();
        if (player != null) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        mo79979q();
    }

    public void onDestroy() {
        this.f162347h = false;
        this.f162348i.dead();
        String str = this.f162324p;
        StringBuilder sb = new StringBuilder();
        sb.append("[onDestroy] player:");
        C60695a player = this.f162327s.getPlayer();
        sb.append(player != null ? Integer.valueOf(player.hashCode()) : null);
        Log.m105924i(str, sb.toString());
        mo79979q();
        C60695a player2 = this.f162327s.getPlayer();
        if (player2 != null) {
            player2.stop();
        }
        C60695a player3 = this.f162327s.getPlayer();
        if (player3 != null) {
            player3.recycle();
        }
        this.f162327s.mo81101g();
    }

    public void onPause() {
        Log.m105924i(this.f162324p, "[onPause]");
        if (this.f162346g.f188447f) {
            mo79977o();
        }
    }

    public void onResume() {
        Log.m105924i(this.f162324p, "[onResume]");
        if (this.f162346g.f188447f) {
            mo79978p();
        }
    }

    /* renamed from: p */
    public final void mo79978p() {
        if (mo79984l()) {
            boolean z = false;
            if (!this.f162329u || C61104a.m71668x() || C61104a.m71642B(this.f162327s.getContext(), false)) {
                z = true;
            }
            mo79981s(z);
            C60695a player = this.f162327s.getPlayer();
            if (player != null) {
                player.mo85614i(true);
            }
            C60695a player2 = this.f162327s.getPlayer();
            if (player2 != null) {
                player2.mo85619m();
            }
            Log.m105918d(this.f162324p, "playVideo startToPlay");
        }
    }

    /* renamed from: q */
    public final void mo79979q() {
        C34767b.C34768c cVar = this.f162330v;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f162330v = null;
    }

    /* renamed from: r */
    public final void mo79980r(MMTPEffectVideoLayout mMTPEffectVideoLayout) {
        C60695a player;
        C87412m.m108594g(mMTPEffectVideoLayout, "<this>");
        C65490m mVar = this.f162346g;
        boolean z = mVar.f188446e == 1 && !mVar.f188447f && !this.f162329u;
        if (z) {
            if (!this.f162328t && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
                player.prepare();
            }
            this.f162328t = true;
        } else {
            C60695a player2 = mMTPEffectVideoLayout.getPlayer();
            if (player2 != null) {
                player2.mo85619m();
            }
        }
        String str = this.f162324p;
        Log.m105918d(str, "tryInitVideo " + z + ' ' + this.f162328t);
    }

    /* renamed from: s */
    public final void mo79981s(boolean z) {
        boolean z2 = false;
        if (!z) {
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34774j.f93457c, new C56625d(this));
            this.f162330v = el;
            if (el != null && el.mo34198a()) {
                z2 = true;
            }
        } else {
            mo79979q();
        }
        C60695a player = this.f162327s.getPlayer();
        if (player != null) {
            player.setMute(true ^ z2);
        }
    }
}
