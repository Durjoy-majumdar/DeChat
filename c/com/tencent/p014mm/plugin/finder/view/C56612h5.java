package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.base.MediaPlayBanner;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import em1.C58636b;
import em1.C97671a;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import oj3.C62036a;
import oj3.C62040b;
import p749xh.C66261f3;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62372x;
import rx3.C13598b0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.view.h5 */
public final class C56612h5 extends C56630k {

    /* renamed from: o */
    public final FrameLayout f162305o;

    /* renamed from: p */
    public FinderObject f162306p;

    /* renamed from: q */
    public final String f162307q = "Finder.TextStatusImageView";

    /* renamed from: r */
    public final C58636b f162308r = mo79968n();

    /* renamed from: s */
    public final MediaPlayBanner f162309s;

    /* renamed from: t */
    public boolean f162310t;

    /* renamed from: com.tencent.mm.plugin.finder.view.h5$a */
    public static final class C56613a extends C62036a<C64689rq2, View> {

        /* renamed from: g */
        public final /* synthetic */ C56612h5 f162311g;

        /* renamed from: com.tencent.mm.plugin.finder.view.h5$a$a */
        public static final class C56614a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C64689rq2 f162312d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f162313e;

            public C56614a(C64689rq2 rq22, ImageView imageView) {
                this.f162312d = rq22;
                this.f162313e = imageView;
            }

            public final void run() {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C64689rq2 rq22 = this.f162312d;
                C87412m.m108593f(rq22, "item");
                C99344b<C100810g0, Bitmap> b = f2.mo85956b(new C62372x(rq22, C27696y.RAW_IMAGE, (String) null, 4, (C8480h) null), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                ImageView imageView = this.f162313e;
                C87412m.m108593f(imageView, "imageView");
                ((C99342a) b).mo85954d(imageView);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.h5$a$b */
        public static final class C56615b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C64689rq2 f162314d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f162315e;

            public C56615b(C64689rq2 rq22, ImageView imageView) {
                this.f162314d = rq22;
                this.f162315e = imageView;
            }

            public final void run() {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C60979d<C100810g0> C = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11863C();
                C64689rq2 rq22 = this.f162314d;
                C87412m.m108593f(rq22, "item");
                C99344b<C100810g0, Bitmap> b = C.mo85956b(new C62372x(rq22, C27696y.THUMB_IMAGE, (String) null, 4, (C8480h) null), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                ImageView imageView = this.f162315e;
                C87412m.m108593f(imageView, "bgView");
                ((C99342a) b).mo85954d(imageView);
            }
        }

        public C56613a(C56612h5 h5Var) {
            this.f162311g = h5Var;
        }

        /* renamed from: G4 */
        public void onBindViewHolder(C62040b bVar, int i) {
            C87412m.m108594g(bVar, "holder");
            super.onBindViewHolder(bVar, i);
            C64689rq2 rq22 = (C64689rq2) mo86983F4(i);
            ImageView imageView = (ImageView) bVar.f44854d.findViewById(C0966R.C0970id.ick);
            ImageView imageView2 = (ImageView) bVar.f44854d.findViewById(C0966R.C0970id.a8h);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bVar.f173499A.getResources().getDisplayMetrics().widthPixels, -2);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f162311g.f162305o.getHeight() < 0 ? -1 : this.f162311g.f162305o.getHeight()));
            imageView.post(new C56614a(rq22, imageView));
            imageView2.post(new C56615b(rq22, imageView2));
        }

        /* renamed from: g5 */
        public View mo13137g5(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.aq_, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…ge_layout, parent, false)");
            return inflate;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.h5$b */
    public static final class C56616b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56612h5 f162316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56616b(C56612h5 h5Var) {
            super(0);
            this.f162316d = h5Var;
        }

        public Object invoke() {
            C56612h5 h5Var = this.f162316d;
            h5Var.mo79969o(h5Var.f162306p);
            C56612h5 h5Var2 = this.f162316d;
            h5Var2.mo79966k(h5Var2.mo79984l());
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56612h5(java.lang.String r3, android.widget.FrameLayout r4, uz2.C65488a0 r5, uz2.C65490m r6, com.tencent.p014mm.protocal.protobuf.FinderObject r7) {
        /*
            r2 = this;
            java.lang.String r3 = "parent"
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "jumpInfo"
            gy3.C87412m.m108594g(r5, r3)
            java.lang.String r3 = "pullDownParam"
            gy3.C87412m.m108594g(r6, r3)
            java.lang.String r3 = "finderObject"
            gy3.C87412m.m108594g(r7, r3)
            android.content.Context r3 = r4.getContext()
            java.lang.String r5 = "parent.context"
            gy3.C87412m.m108593f(r3, r5)
            r2.<init>(r3, r7, r6)
            r2.f162305o = r4
            r2.f162306p = r7
            java.lang.String r3 = "Finder.TextStatusImageView"
            r2.f162307q = r3
            em1.b r3 = r2.mo79968n()
            r2.f162308r = r3
            com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r3 = new com.tencent.mm.plugin.finder.view.base.MediaPlayBanner
            android.content.Context r6 = r4.getContext()
            gy3.C87412m.m108593f(r6, r5)
            r3.<init>(r6)
            r2.f162309s = r3
            android.content.Context r5 = r4.getContext()
            android.view.LayoutInflater r5 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r5)
            r6 = 2131495566(0x7f0c0a8e, float:1.8614672E38)
            r7 = 1
            r5.inflate(r6, r4, r7)
            r5 = 2131300426(0x7f09104a, float:1.8218881E38)
            android.view.View r5 = r4.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r6.<init>(r0, r0)
            r5.addView(r3, r6)
            android.content.Context r6 = r4.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r0 = 2131495565(0x7f0c0a8d, float:1.861467E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r4, r1)
            r5.addView(r6)
            com.tencent.mm.view.RecyclerHorizontalViewPager r5 = r3.getRecyclerView()
            r5.setHasFixedSize(r1)
            com.tencent.mm.view.RecyclerHorizontalViewPager r5 = r3.getRecyclerView()
            r5.setFrozeTouch(r7)
            com.tencent.mm.plugin.finder.view.h5$a r5 = new com.tencent.mm.plugin.finder.view.h5$a
            r5.<init>(r2)
            r3.setAdapter(r5)
            r3.setAutoPlay(r1)
            com.tencent.mm.plugin.finder.view.h5$b r3 = new com.tencent.mm.plugin.finder.view.h5$b
            r3.<init>(r2)
            o40.C61926c.m72677b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56612h5.<init>(java.lang.String, android.widget.FrameLayout, uz2.a0, uz2.m, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    /* renamed from: e */
    public void mo79961e() {
        super.mo79961e();
        C58636b bVar = this.f162308r;
        if (bVar != null) {
            ((C97671a) bVar).pause();
        }
        this.f162309s.setAutoPlay(false);
        Log.m105924i(this.f162307q, "[onPostClose]");
    }

    /* renamed from: f */
    public void mo79962f() {
        this.f170310d = true;
        Log.m105924i(this.f162307q, "[onPostOpen]");
        if (mo79984l()) {
            C58636b bVar = this.f162308r;
            boolean z = false;
            if (bVar != null && !((C97671a) bVar).isPlaying()) {
                z = true;
            }
            if (z) {
                ((C97671a) this.f162308r).play();
            }
        }
        this.f162309s.setAutoPlay(true);
    }

    /* renamed from: g */
    public void mo79963g() {
        Log.m105924i(this.f162307q, "[onPreClose]");
        this.f162310t = false;
        mo79966k(mo79984l());
    }

    public String getTag() {
        return "Finder.TextStatusImageView";
    }

    /* renamed from: h */
    public void mo79964h() {
        Log.m105924i(this.f162307q, "[onPreOpen]");
        this.f162310t = true;
        mo79966k(mo79984l());
        mo79983j();
    }

    /* renamed from: i */
    public void mo79965i(float f) {
    }

    /* renamed from: k */
    public void mo79966k(boolean z) {
        C58636b bVar;
        String str = this.f162307q;
        Log.m105924i(str, "[checkShowValid] isFeedValid=" + z + " isViewOpen=" + this.f162310t);
        if (z) {
            View findViewById = this.f162305o.findViewById(C0966R.C0970id.f8m);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f162310t && (bVar = this.f162308r) != null) {
                ((C97671a) bVar).play();
                return;
            }
            return;
        }
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) f;
        if (str2.length() > 0) {
            String str3 = this.f162307q;
            Log.m105924i(str3, "[checkShowValidLayout] wording=" + str2);
            TextView textView = (TextView) this.f162305o.findViewById(C0966R.C0970id.f8o);
            if (textView != null) {
                textView.setText(str2);
            }
        }
        View findViewById2 = this.f162305o.findViewById(C0966R.C0970id.f8m);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f162310t) {
            View findViewById3 = this.f162305o.findViewById(C0966R.C0970id.f8n);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById4 = this.f162305o.findViewById(C0966R.C0970id.ew9);
            if (findViewById4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById5 = this.f162305o.findViewById(C0966R.C0970id.ew9);
            if (findViewById5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view5 = findViewById5;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById6 = this.f162305o.findViewById(C0966R.C0970id.f8n);
            if (findViewById6 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view6 = findViewById6;
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C58636b bVar2 = this.f162308r;
        if (bVar2 != null) {
            ((C97671a) bVar2).pause();
        }
    }

    /* renamed from: m */
    public void mo79967m(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        this.f162306p = finderObject;
        String str = this.f162307q;
        Log.m105928w(str, "[resetFinderObject] feedId=" + C61926c.m72691p(finderObject.f164794id));
        mo79969o(finderObject);
        C58636b bVar = this.f162308r;
        if (bVar != null) {
            ((C97671a) bVar).release();
        }
        mo79968n();
        mo79966k(mo79984l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r0.feedBgmInfo;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final em1.C58636b mo79968n() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem$a r0 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r4.f162306p
            int r2 = r1.objectType
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo79056a(r1, r2)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            r1 = 0
            if (r0 == 0) goto L_0x001a
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x001a
            te3.td1 r0 = r0.f185873d
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x0044
            java.lang.String r2 = r0.f185539i
            r3 = 1
            if (r2 == 0) goto L_0x002b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r0 == 0) goto L_0x0044
            android.widget.FrameLayout r1 = r4.f162305o
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "parent.context"
            gy3.C87412m.m108593f(r1, r2)
            em1.a r2 = new em1.a
            r2.<init>(r1, r0)
            r1 = r2
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56612h5.mo79968n():em1.b");
    }

    /* renamed from: o */
    public final void mo79969o(FinderObject finderObject) {
        LinkedList<C64689rq2> mediaList;
        RecyclerView.C16613e<C62040b> adapter = this.f162309s.getAdapter();
        C62036a aVar = adapter instanceof C62036a ? (C62036a) adapter : null;
        if (aVar != null && (mediaList = FinderItem.Companion.mo79056a(finderObject, finderObject.objectType).getMediaList()) != null) {
            aVar.f176359d = mediaList;
            aVar.notifyDataSetChanged();
        }
    }

    public void onDestroy() {
        this.f162347h = false;
        this.f162348i.dead();
        Log.m105924i(this.f162307q, "[onDestroy]");
        C58636b bVar = this.f162308r;
        if (bVar != null) {
            ((C97671a) bVar).release();
        }
    }
}
