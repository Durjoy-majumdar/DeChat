package com.tencent.p014mm.plugin.album.p838ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import nj3.C88989a;
import p206nj.C11171e;
import p278yh.C66642a;
import p849e3.C58525r;
import p858ng.C61691c;
import p858ng.C61704k;
import p858ng.C61710l;
import p858ng.C61718q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sh0.C63890a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/album/ui/AlbumGalleryUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI */
public final class AlbumGalleryUI extends BaseMvvmActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f157907e = 0;

    /* renamed from: d */
    public final C13601g f157908d = C36568h.m40985a(new C55434e(this));

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI$a */
    public static final class C55430a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUI f157909d;

        public C55430a(AlbumGalleryUI albumGalleryUI) {
            this.f157909d = albumGalleryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f157909d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI$b */
    public /* synthetic */ class C55431b extends C24565l implements C32226l<C61710l, C13598b0> {
        public C55431b(Object obj) {
            super(1, obj, AlbumGalleryUI.class, "processState", "processState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C61710l) obj, "p0");
            int i = AlbumGalleryUI.f157907e;
            ((AlbumGalleryUI) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI$c */
    public /* synthetic */ class C55432c extends C24565l implements C32226l<C61710l, C13598b0> {
        public C55432c(Object obj) {
            super(1, obj, AlbumGalleryUI.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [androidx.lifecycle.i0] */
        /* JADX WARNING: type inference failed for: r0v8, types: [androidx.lifecycle.i0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Class<com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC> r0 = com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC.class
                ng.l r8 = (p858ng.C61710l) r8
                java.lang.String r1 = "p0"
                gy3.C87412m.m108594g(r8, r1)
                java.lang.Object r1 = r7.receiver
                com.tencent.mm.plugin.album.ui.AlbumGalleryUI r1 = (com.tencent.p014mm.plugin.album.p838ui.AlbumGalleryUI) r1
                int r2 = com.tencent.p014mm.plugin.album.p838ui.AlbumGalleryUI.f157907e
                r1.getClass()
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r8.getAction()
                if (r2 == 0) goto L_0x0023
                boolean r3 = r2 instanceof p858ng.C61696d
                if (r3 == 0) goto L_0x0023
                ng.d r2 = (p858ng.C61696d) r2
                java.lang.String r2 = r8.f175410d
                r1.setMMTitle((java.lang.String) r2)
            L_0x0023:
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r8.getAction()
                if (r2 == 0) goto L_0x00c4
                boolean r3 = r2 instanceof p858ng.C61697e
                if (r3 == 0) goto L_0x00c4
                ng.e r2 = (p858ng.C61697e) r2
                bl3.r r3 = bl3.C39818r.f106831a
                bl3.r$a r4 = r3.mo62444c(r1)
                java.lang.Class<ng.q> r5 = p858ng.C61718q.class
                androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
                java.lang.String r5 = "UICProvider.of(activity)…leryVideoUIC::class.java)"
                gy3.C87412m.m108593f(r4, r5)
                ng.q r4 = (p858ng.C61718q) r4
                lg.a r4 = r2.f175392a
                android.view.View r2 = r2.f175393b
                java.lang.String r5 = "item"
                gy3.C87412m.m108594g(r4, r5)
                java.lang.String r5 = "itemView"
                gy3.C87412m.m108594g(r2, r5)
                ig.d r4 = r4.f174389h
                int r4 = r4.mo55274P()
                r5 = 4
                if (r4 != r5) goto L_0x00c4
                r4 = 2131316244(0x7f094e14, float:1.8250964E38)
                android.view.View r2 = r2.findViewById(r4)
                com.tencent.mm.album.ui.gallery.view.AlbumVideoView r2 = (com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView) r2
                boolean r4 = r2.f154696w
                if (r4 != 0) goto L_0x006e
                java.lang.String r0 = r2.f154680d
                java.lang.String r2 = "handleSingleClick isPrepared:false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                goto L_0x00c4
            L_0x006e:
                boolean r4 = r2.f154697x
                r5 = 0
                java.lang.String r6 = "context"
                if (r4 == 0) goto L_0x009d
                r2.mo76209b()
                android.content.Context r2 = r2.getContext()
                gy3.C87412m.m108594g(r2, r6)
                boolean r4 = r2 instanceof androidx.appcompat.app.AppCompatActivity
                if (r4 == 0) goto L_0x0090
                androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
                bl3.r$a r2 = r3.mo62444c(r2)
                androidx.lifecycle.i0 r0 = r2.mo75002a(r0)
                r5 = r0
                com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC r5 = (com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC) r5
            L_0x0090:
                com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r5.mo76193k3()
                ng.u r2 = new ng.u
                r2.<init>()
                r0.dispatch(r2)
                goto L_0x00c4
            L_0x009d:
                r2.mo76218h()
                android.content.Context r2 = r2.getContext()
                gy3.C87412m.m108594g(r2, r6)
                boolean r4 = r2 instanceof androidx.appcompat.app.AppCompatActivity
                if (r4 == 0) goto L_0x00b8
                androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
                bl3.r$a r2 = r3.mo62444c(r2)
                androidx.lifecycle.i0 r0 = r2.mo75002a(r0)
                r5 = r0
                com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC r5 = (com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC) r5
            L_0x00b8:
                com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r5.mo76193k3()
                ng.z r2 = new ng.z
                r2.<init>()
                r0.dispatch(r2)
            L_0x00c4:
                com.tencent.mm.sdk.statecenter.IStateAction r8 = r8.getAction()
                if (r8 == 0) goto L_0x00f1
                boolean r0 = r8 instanceof p858ng.C61698f
                if (r0 == 0) goto L_0x00f1
                ng.f r8 = (p858ng.C61698f) r8
                bl3.r r8 = bl3.C39818r.f106831a
                bl3.r$a r8 = r8.mo62444c(r1)
                java.lang.Class<ng.k> r0 = p858ng.C61704k.class
                androidx.lifecycle.i0 r8 = r8.mo75002a(r0)
                java.lang.String r0 = "UICProvider.of(activity)…lleryMenuUIC::class.java)"
                gy3.C87412m.m108593f(r8, r0)
                ng.k r8 = (p858ng.C61704k) r8
                com.tencent.mm.sdk.statecenter.UIStateCenter r8 = r8.mo86624c3()
                ng.x r0 = new ng.x
                r1 = 20
                r0.<init>(r1)
                r8.dispatch(r0)
            L_0x00f1:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.album.p838ui.AlbumGalleryUI.C55432c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI$d */
    public static final class C55433d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUI f157910d;

        public C55433d(AlbumGalleryUI albumGalleryUI) {
            this.f157910d = albumGalleryUI;
        }

        public final void run() {
            AlbumGalleryUI albumGalleryUI = this.f157910d;
            int i = AlbumGalleryUI.f157907e;
            View decorView = albumGalleryUI.getWindow().getDecorView();
            C87412m.m108593f(decorView, "window.decorView");
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C63890a(decorView, albumGalleryUI));
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGalleryUI$e */
    public static final class C55434e extends C87413o implements C32224a<C66642a> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUI f157911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55434e(AlbumGalleryUI albumGalleryUI) {
            super(0);
            this.f157911d = albumGalleryUI;
        }

        public Object invoke() {
            AlbumGalleryUI albumGalleryUI = this.f157911d;
            int i = AlbumGalleryUI.f157907e;
            return new C66642a(albumGalleryUI.getContentView());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbw;
    }

    public void onBackPressed() {
        finishAfterTransition();
    }

    public void onCreate(Bundle bundle) {
        Class cls = AlbumGalleryUIC.class;
        requestWindowFeature(1);
        setTheme(C0966R.style.f8631pc);
        C85875k4.m106195m0(this);
        super.onCreate(bundle);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        setLightNavigationbarIcon();
        setBackBtn(new C55430a(this));
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(activity)…umGalleryUIC::class.java)");
        ((AlbumGalleryUIC) a).mo76193k3().process((C0125s) this, new C55431b(this));
        C39622i0 a2 = C39818r.f106831a.mo62444c(this).mo75002a(cls);
        C87412m.m108593f(a2, "UICProvider.of(activity)…umGalleryUIC::class.java)");
        ((AlbumGalleryUIC) a2).mo76193k3().observe((C0125s) this, new C55432c(this));
    }

    public void onResume() {
        super.onResume();
        C58525r.m67941a(((C66642a) ((C36570n) this.f157908d).getValue()).mo90691d(), new C55433d(this));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(AlbumGalleryUIC.class);
        hashSet.add(C61691c.class);
        hashSet.add(C61718q.class);
        hashSet.add(C61704k.class);
    }
}
