package com.tencent.p014mm.plugin.album.p838ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import p206nj.C11171e;
import p226rg.C101375c;
import p226rg.C63404a;
import p226rg.C63417i;
import p226rg.C63422j;
import p226rg.C63426k;
import p278yh.C66643c;
import p849e3.C58525r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/album/ui/AlbumGridUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI */
public final class AlbumGridUI extends BaseMvvmActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f157912f = 0;

    /* renamed from: d */
    public final C13601g f157913d = C36568h.m40985a(new C55439e(this));

    /* renamed from: e */
    public final C13601g f157914e = C36568h.m40985a(new C55440f(this));

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$a */
    public static final class C55435a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGridUI f157915d;

        public C55435a(AlbumGridUI albumGridUI) {
            this.f157915d = albumGridUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f157915d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$b */
    public /* synthetic */ class C55436b extends C24565l implements C32226l<C63426k, C13598b0> {
        public C55436b(Object obj) {
            super(1, obj, AlbumGridUI.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            int i = AlbumGridUI.f157912f;
            ((AlbumGridUI) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$c */
    public /* synthetic */ class C55437c extends C24565l implements C32226l<C63426k, C13598b0> {
        public C55437c(Object obj) {
            super(1, obj, AlbumGridUI.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
            r7 = r4.f179898c.f177045g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r19
                rg.k r0 = (p226rg.C63426k) r0
                java.lang.String r1 = "p0"
                gy3.C87412m.m108594g(r0, r1)
                r1 = r18
                java.lang.Object r2 = r1.receiver
                com.tencent.mm.plugin.album.ui.AlbumGridUI r2 = (com.tencent.p014mm.plugin.album.p838ui.AlbumGridUI) r2
                int r3 = com.tencent.p014mm.plugin.album.p838ui.AlbumGridUI.f157912f
                r2.getClass()
                java.lang.Class<gj3.h> r3 = gj3.C59474h.class
                com.tencent.mm.sdk.statecenter.IStateAction r4 = r0.getAction()
                if (r4 == 0) goto L_0x0123
                boolean r5 = r4 instanceof p226rg.C63414e
                if (r5 == 0) goto L_0x0123
                rg.e r4 = (p226rg.C63414e) r4
                bl3.r r5 = bl3.C39818r.f106831a
                bl3.r$a r6 = r5.mo62443b(r2)
                androidx.lifecycle.i0 r6 = r6.mo75002a(r3)
                gj3.h r6 = (gj3.C59474h) r6
                r7 = 1
                r8 = 0
                if (r6 == 0) goto L_0x0037
                boolean r6 = r6.f169948f
                if (r6 != r7) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r7 = 0
            L_0x0038:
                if (r7 == 0) goto L_0x003c
                goto L_0x015a
            L_0x003c:
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                pg.a r7 = r4.f179898c
                com.tencent.mm.storage.f4 r7 = r7.f177045g
                boolean r7 = th0.C101888l.m134034e(r7)
                r9 = 0
                if (r7 == 0) goto L_0x0057
                pg.a r7 = r4.f179898c
                com.tencent.mm.storage.f4 r7 = r7.f177045g
                if (r7 == 0) goto L_0x0057
                java.lang.String r7 = r7.mo108768t()
                goto L_0x0058
            L_0x0057:
                r7 = r9
            L_0x0058:
                pg.a r10 = r4.f179898c
                com.tencent.mm.storage.f4 r10 = r10.f177045g
                if (r10 == 0) goto L_0x0067
                long r10 = r10.getMsgId()
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                goto L_0x0068
            L_0x0067:
                r10 = r9
            L_0x0068:
                java.lang.String r11 = "img_gallery_msg_id"
                r6.putExtra(r11, r10)
                pg.a r10 = r4.f179898c
                com.tencent.mm.storage.f4 r10 = r10.f177045g
                if (r10 == 0) goto L_0x007c
                long r10 = r10.mo108774y2()
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                goto L_0x007d
            L_0x007c:
                r10 = r9
            L_0x007d:
                java.lang.String r11 = "img_gallery_msg_svr_id"
                r6.putExtra(r11, r10)
                pg.a r10 = r4.f179898c
                com.tencent.mm.storage.f4 r10 = r10.f177045g
                if (r10 == 0) goto L_0x008c
                java.lang.String r9 = r10.mo108768t()
            L_0x008c:
                java.lang.String r10 = "img_gallery_talker"
                r6.putExtra(r10, r9)
                java.lang.String r9 = "img_gallery_chatroom_name"
                r6.putExtra(r9, r7)
                int r7 = r4.f179899d
                java.lang.String r9 = "album_enter_position_from_list_page"
                r6.putExtra(r9, r7)
                rx3.g r7 = r2.f157913d
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.String r9 = "album_enter_from_scene"
                r6.putExtra(r9, r7)
                ig.g r7 = r4.f179897b
                java.lang.String r7 = r7.mo141118z()
                java.lang.String r10 = "album_enter_info_data"
                r6.putExtra(r10, r7)
                androidx.appcompat.app.AppCompatActivity r7 = r2.getContext()
                java.lang.String r10 = "context"
                gy3.C87412m.m108593f(r7, r10)
                bl3.r$a r5 = r5.mo62444c(r7)
                androidx.lifecycle.i0 r3 = r5.mo75002a(r3)
                gj3.h r3 = (gj3.C59474h) r3
                gj3.f r10 = r3.f169947e
                android.view.View r11 = r4.f179896a
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                android.os.Bundle r3 = gj3.C59473f.m69397a(r10, r11, r12, r13, r14, r15)
                androidx.appcompat.app.AppCompatActivity r5 = r2.getContext()
                java.lang.String r7 = "album"
                java.lang.String r10 = "com.tencent.mm.plugin.album.ui.AlbumGalleryUI"
                ke3.C88144b.m109791i(r5, r7, r10, r6, r3)
                r2.overridePendingTransition(r8, r8)
                pg.a r3 = r4.f179898c
                com.tencent.mm.storage.f4 r13 = r3.f177045g
                th0.l r3 = th0.C101888l.f300029a
                ig.g r5 = r4.f179897b
                java.util.List r5 = r3.mo141354c(r5)
                int r14 = r5.size()
                ig.g r5 = r4.f179897b
                java.util.List r3 = r3.mo141355d(r5)
                int r15 = r3.size()
                r11 = 11
                int r3 = r4.f179899d
                pg.a r4 = r4.f179898c
                ig.d r4 = r4.f177044f
                java.lang.Class<mm.h> r5 = p606mm.C99933h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                mm.h r5 = (p606mm.C99933h) r5
                java.lang.Class<qh0.a> r6 = qh0.C62619a.class
                jg.a r7 = new jg.a
                r10 = r7
                r16 = r4
                r17 = r3
                r10.<init>(r11, r13, r14, r15, r16, r17)
                r3 = 18
                r5.mo84406lr(r3, r9, r6, r7)
            L_0x0123:
                com.tencent.mm.sdk.statecenter.IStateAction r0 = r0.getAction()
                if (r0 == 0) goto L_0x015a
                boolean r3 = r0 instanceof p226rg.C63415f
                if (r3 == 0) goto L_0x015a
                rg.f r0 = (p226rg.C63415f) r0
                bl3.r r3 = bl3.C39818r.f106831a
                bl3.r$a r2 = r3.mo62444c(r2)
                java.lang.Class<rg.i> r3 = p226rg.C63417i.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                java.lang.String r3 = "UICProvider.of(activity)…eviewMenuUIC::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                rg.i r2 = (p226rg.C63417i) r2
                rx3.g r2 = r2.f179905e
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                com.tencent.mm.sdk.statecenter.UIStateCenter r2 = (com.tencent.p014mm.sdk.statecenter.UIStateCenter) r2
                rg.t r3 = new rg.t
                r4 = 60
                com.tencent.mm.storage.f4 r6 = r0.f179901b
                ig.g r0 = r0.f179900a
                r3.<init>(r4, r6, r0)
                r2.dispatch(r3)
            L_0x015a:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.album.p838ui.AlbumGridUI.C55437c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$d */
    public static final class C55438d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AlbumGridUI f157916d;

        public C55438d(AlbumGridUI albumGridUI) {
            this.f157916d = albumGridUI;
        }

        public final void run() {
            AlbumGridUI albumGridUI = this.f157916d;
            int i = AlbumGridUI.f157912f;
            boolean d = C75044y4.m89992d(albumGridUI.getContext());
            int c = C75044y4.m89991c(albumGridUI.getContext());
            Log.m105925i("MicroMsg.AlbumPreviewUI", "%d handleVerticalUI album preview ui isNavBarVisibility %b navBarHeight %d", Integer.valueOf(albumGridUI.hashCode()), Boolean.valueOf(d), Integer.valueOf(c));
            if (d) {
                ViewGroup.LayoutParams layoutParams = ((C66643c) ((C36570n) albumGridUI.f157914e).getValue()).mo90694b().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = c + albumGridUI.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                ((C66643c) ((C36570n) albumGridUI.f157914e).getValue()).mo90694b().setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$e */
    public static final class C55439e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGridUI f157917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55439e(AlbumGridUI albumGridUI) {
            super(0);
            this.f157917d = albumGridUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f157917d.getIntent().getIntExtra("album_enter_from_scene", 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.album.ui.AlbumGridUI$f */
    public static final class C55440f extends C87413o implements C32224a<C66643c> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGridUI f157918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55440f(AlbumGridUI albumGridUI) {
            super(0);
            this.f157918d = albumGridUI;
        }

        public Object invoke() {
            AlbumGridUI albumGridUI = this.f157918d;
            int i = AlbumGridUI.f157912f;
            return new C66643c(albumGridUI.getContentView());
        }
    }

    public void finishAfterTransition() {
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d79;
    }

    public void onCreate(Bundle bundle) {
        Class cls = AlbumPreviewUIC.class;
        requestWindowFeature(1);
        C85875k4.m106195m0(this);
        setTheme(C0966R.style.f8631pc);
        super.onCreate(bundle);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        setLightNavigationbarIcon();
        setBackBtn(new C55435a(this));
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = C39818r.f106831a.mo62444c(context).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(activity)…umPreviewUIC::class.java)");
        ((AlbumPreviewUIC) a).mo76239k3().process((C0125s) this, new C55436b(this));
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        C39622i0 a2 = C39818r.f106831a.mo62444c(context2).mo75002a(cls);
        C87412m.m108593f(a2, "UICProvider.of(activity)…umPreviewUIC::class.java)");
        ((AlbumPreviewUIC) a2).mo76239k3().observe((C0125s) this, new C55437c(this));
    }

    public void onResume() {
        super.onResume();
        C58525r.m67941a(((C66643c) ((C36570n) this.f157914e).getValue()).mo90694b(), new C55438d(this));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(AlbumPreviewUIC.class);
        hashSet.add(C63404a.class);
        hashSet.add(C101375c.class);
        hashSet.add(C63422j.class);
        hashSet.add(C63417i.class);
    }
}
