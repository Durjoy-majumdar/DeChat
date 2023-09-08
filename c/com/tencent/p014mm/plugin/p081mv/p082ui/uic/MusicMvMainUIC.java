package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.layoutmanager.Flip3DLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58389m1;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C32799i;
import hb2.C59822f;
import hb2.C59830o;
import hb2.C59833q;
import hb2.C59836s;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jb2.C46457e;
import jb2.C46459g;
import jb2.C46463n;
import jb2.C60790h;
import jb2.C60791k;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import la2.C99364n;
import lu3.C34379c;
import m03.C109458k;
import m03.C61426c;
import nb2.C61646d;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import p501dz.C58467i;
import p529fv.C59326j;
import p529fv.C59329p;
import p529fv.C59330q;
import p599lr.C61381b;
import p640ox.C77049b;
import p749xh.C102658n6;
import qc0.C101093a;
import qc0.C101106m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63756e;
import sb2.C63801l;
import sb2.C63807m;
import sx3.C110818d0;
import sx3.C64197v;
import tb2.C64216a;
import te3.C49085d23;
import te3.C49712hj1;
import te3.C50008jm0;
import te3.C64441i93;
import te3.C64488kb1;
import te3.C64621p23;
import te3.C64654qd;
import te3.C64719t23;
import te3.C64793w23;
import te3.C64821x13;
import te3.db4;
import te3.op4;
import ub2.C65257a;
import up1.C65415e0;
import uq1.C65464w;
import vp1.C65834e;
import wp1.C15585f;
import wx3.C15601d;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC */
public final class MusicMvMainUIC extends UIComponent {

    /* renamed from: J */
    public static final Object f163257J = new Object();

    /* renamed from: A */
    public int f163258A;

    /* renamed from: B */
    public final C57028j f163259B;

    /* renamed from: C */
    public final C57029k f163260C;

    /* renamed from: D */
    public final IListener<MusicPlayerEvent> f163261D;

    /* renamed from: E */
    public final C11385n f163262E;

    /* renamed from: F */
    public boolean f163263F;

    /* renamed from: G */
    public boolean f163264G;

    /* renamed from: H */
    public final C65464w f163265H;

    /* renamed from: I */
    public final MusicMvMainUIC$finderCommentEventListener$1 f163266I;

    /* renamed from: d */
    public final String f163267d = "MicroMsg.Mv.MusicMvMainUIC";

    /* renamed from: e */
    public final String f163268e = "MicroMsg.Mv.GetLyric";

    /* renamed from: f */
    public WxRecyclerView f163269f;

    /* renamed from: g */
    public ArrayList<C61646d> f163270g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<C61646d> f163271h = new ArrayList<>();

    /* renamed from: i */
    public final C13601g f163272i;

    /* renamed from: j */
    public final C94223g.C94224a f163273j;

    /* renamed from: n */
    public final C65257a f163274n;

    /* renamed from: o */
    public int f163275o;

    /* renamed from: p */
    public C61426c f163276p;

    /* renamed from: q */
    public boolean f163277q;

    /* renamed from: r */
    public boolean f163278r;

    /* renamed from: s */
    public Flip3DLayoutManager f163279s;

    /* renamed from: t */
    public boolean f163280t;

    /* renamed from: u */
    public boolean f163281u;

    /* renamed from: v */
    public volatile C59836s f163282v;

    /* renamed from: w */
    public boolean f163283w;

    /* renamed from: x */
    public int f163284x;

    /* renamed from: y */
    public long f163285y;

    /* renamed from: z */
    public float f163286z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$a */
    public static final class C57014a extends C87413o implements C32224a<WxRecyclerAdapter<C61646d>> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163287d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f163288e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57014a(MusicMvMainUIC musicMvMainUIC, AppCompatActivity appCompatActivity) {
            super(0);
            this.f163287d = musicMvMainUIC;
            this.f163288e = appCompatActivity;
        }

        public Object invoke() {
            return new WxRecyclerAdapter(new MusicMvMainUIC$adapter$2$1(this.f163288e), this.f163287d.f163270g, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$b */
    public static final class C57015b implements C109458k {
        /* renamed from: a */
        public void mo80423a(int i) {
            C99364n.m129616h().mo138822a().mo32203a(i);
        }

        public long getCurrentPosition() {
            return (long) C99364n.m129616h().mo138822a().getPlayPosition();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$c */
    public static final class C57016c implements C65464w {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163289d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f163290e;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$c$a */
        public static final class C57017a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163291d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57017a(MusicMvMainUIC musicMvMainUIC) {
                super(0);
                this.f163291d = musicMvMainUIC;
            }

            public Object invoke() {
                this.f163291d.mo80454j3().notifyItemChanged(0, "finderPostListener_onPostEnd");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$c$b */
        public static final class C57018b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163292d;

            /* renamed from: e */
            public final /* synthetic */ AppCompatActivity f163293e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57018b(MusicMvMainUIC musicMvMainUIC, AppCompatActivity appCompatActivity) {
                super(0);
                this.f163292d = musicMvMainUIC;
                this.f163293e = appCompatActivity;
            }

            public Object invoke() {
                this.f163292d.mo80454j3().notifyItemChanged(0, MusicMvMainUIC.f163257J);
                C76912y0.m92769h(this.f163293e, this.f163292d.getString(C0966R.string.a1u), C0966R.raw.icons_filled_done);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$c$c */
        public static final class C57019c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163294d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57019c(MusicMvMainUIC musicMvMainUIC) {
                super(0);
                this.f163294d = musicMvMainUIC;
            }

            public Object invoke() {
                this.f163294d.mo80454j3().notifyItemChanged(0, "finderPostListener_onPostStart");
                return C13598b0.f38549a;
            }
        }

        public C57016c(MusicMvMainUIC musicMvMainUIC, AppCompatActivity appCompatActivity) {
            this.f163289d = musicMvMainUIC;
            this.f163290e = appCompatActivity;
        }

        public void onPostEnd(long j, boolean z) {
            C61646d dVar;
            C59822f fVar;
            String str = this.f163289d.f163267d;
            Log.m105924i(str, "onPostEnd " + j + ' ' + z);
            ArrayList<C61646d> arrayList = this.f163289d.f163270g;
            if (!(arrayList.size() > 0)) {
                arrayList = null;
            }
            if (arrayList != null && (dVar = arrayList.get(0)) != null && (fVar = dVar.f175298d) != null) {
                MusicMvMainUIC musicMvMainUIC = this.f163289d;
                Long l = fVar.f170753a;
                if (l != null && l.longValue() == j && !z) {
                    fVar.f170768p = 3;
                    C61926c.m72668M(new C57017a(musicMvMainUIC));
                }
            }
        }

        public void onPostNotify(long j, boolean z) {
            String str = this.f163289d.f163267d;
            Log.m105924i(str, "onPostNotify " + j + ' ' + z);
        }

        public void onPostOk(long j, long j2) {
            C61646d dVar;
            C59822f fVar;
            ArrayList<C61646d> arrayList = this.f163289d.f163270g;
            C13598b0 b0Var = null;
            if (!(arrayList.size() > 0)) {
                arrayList = null;
            }
            if (!(arrayList == null || (dVar = arrayList.get(0)) == null || (fVar = dVar.f175298d) == null)) {
                MusicMvMainUIC musicMvMainUIC = this.f163289d;
                AppCompatActivity appCompatActivity = this.f163290e;
                Log.m105924i(musicMvMainUIC.f163267d, "onPostOk " + j + ' ' + j2);
                Long l = fVar.f170753a;
                if (l != null && l.longValue() == j) {
                    fVar.f170768p = 4;
                    FinderItem e = C65834e.f189316a.mo89871e(j2);
                    if (e != null) {
                        fVar.f170772t = e.getFeedObject();
                        musicMvMainUIC.mo80455k3(e.getId(), e.getObjectNonceId(), fVar);
                    }
                    C61926c.m72668M(new C57018b(musicMvMainUIC, appCompatActivity));
                } else {
                    Log.m105924i(musicMvMainUIC.f163267d, "first item difference local id " + fVar.f170753a + ' ' + j);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(this.f163289d.f163267d, "onPostOk not found mv " + j + ' ' + j2);
            }
        }

        public void onPostStart(long j) {
            C61646d dVar;
            C59822f fVar;
            String str = this.f163289d.f163267d;
            Log.m105924i(str, "onPostStart " + j);
            ArrayList<C61646d> arrayList = this.f163289d.f163270g;
            if (!(arrayList.size() > 0)) {
                arrayList = null;
            }
            if (arrayList != null && (dVar = arrayList.get(0)) != null && (fVar = dVar.f175298d) != null) {
                MusicMvMainUIC musicMvMainUIC = this.f163289d;
                Long l = fVar.f170753a;
                if (l != null && l.longValue() == j) {
                    fVar.f170768p = 2;
                    C61926c.m72668M(new C57019c(musicMvMainUIC));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$d */
    public static final class C57020d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163295d;

        /* renamed from: e */
        public final /* synthetic */ C50008jm0 f163296e;

        /* renamed from: f */
        public final /* synthetic */ C59822f f163297f;

        public C57020d(MusicMvMainUIC musicMvMainUIC, C50008jm0 jm02, C59822f fVar) {
            this.f163295d = musicMvMainUIC;
            this.f163296e = jm02;
            this.f163297f = fVar;
        }

        public final void run() {
            MusicMvMainUIC.m65710e3(this.f163295d, this.f163296e, this.f163297f.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$e */
    public static final class C57021e extends RecyclerView.C0131u {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163298d;

        public C57021e(MusicMvMainUIC musicMvMainUIC) {
            this.f163298d = musicMvMainUIC;
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            View view;
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            MusicMvMainUIC musicMvMainUIC = this.f163298d;
            musicMvMainUIC.getClass();
            C39818r rVar = C39818r.f106831a;
            ((MusicMvSongInfoUIC) rVar.mo62444c(musicMvMainUIC.getActivity()).mo75002a(MusicMvSongInfoUIC.class)).getClass();
            if (((C63807m) rVar.mo62444c(musicMvMainUIC.getActivity()).mo75002a(C63807m.class)).f180880f.f163669g.mo90642b()) {
                Log.m105924i(musicMvMainUIC.f163267d, "mv list dialog showing now enable scroll");
                musicMvMainUIC.f163279s.f165720w = true;
                musicMvMainUIC.f163285y = -1;
            } else {
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    if (musicMvMainUIC.f163284x == 0 && musicMvMainUIC.f163286z >= 0.0f) {
                        long j = musicMvMainUIC.f163285y;
                        if (j > 0 && Util.ticksToNow(j) <= ((long) ViewConfiguration.getTapTimeout())) {
                            musicMvMainUIC.f163279s.f165720w = false;
                            Log.m105924i(musicMvMainUIC.f163267d, "tap disable scroll");
                            musicMvMainUIC.f163286z = -1.0f;
                        }
                    }
                    musicMvMainUIC.f163279s.f165720w = true;
                    musicMvMainUIC.f163286z = -1.0f;
                } else {
                    WxRecyclerView wxRecyclerView = musicMvMainUIC.f163269f;
                    View view2 = null;
                    RecyclerView.C16631z I0 = wxRecyclerView != null ? wxRecyclerView.mo17023I0(musicMvMainUIC.f163274n.f187878m) : null;
                    if (motionEvent.getAction() == 0) {
                        if (!(I0 == null || (view = I0.f44854d) == null)) {
                            view2 = view.findViewById(C0966R.C0970id.edp);
                        }
                        int[] iArr = new int[2];
                        if (view2 != null) {
                            view2.getLocationInWindow(iArr);
                        }
                        if (iArr[1] <= 0 || motionEvent.getY() < ((float) iArr[1])) {
                            musicMvMainUIC.f163286z = motionEvent.getY();
                        } else {
                            Log.m105924i(musicMvMainUIC.f163267d, "touch bottom area ignore");
                            musicMvMainUIC.f163286z = -1.0f;
                            musicMvMainUIC.f163279s.f165720w = true;
                            musicMvMainUIC.f163285y = -1;
                        }
                    }
                    if (I0 != null) {
                        View findViewById = I0.f44854d.findViewById(C0966R.C0970id.f358390ev0);
                        int[] iArr2 = new int[2];
                        findViewById.getLocationInWindow(iArr2);
                        if (musicMvMainUIC.f163258A <= 0) {
                            musicMvMainUIC.f163258A = C76577a.m92157h(musicMvMainUIC.getContext(), C0966R.dimen.f3754d5);
                        }
                        float f = musicMvMainUIC.f163286z;
                        if (f < 0.0f || f > ((float) (findViewById.getHeight() + iArr2[1] + musicMvMainUIC.f163258A))) {
                            musicMvMainUIC.f163279s.f165720w = true;
                        } else {
                            musicMvMainUIC.f163279s.f165720w = false;
                        }
                    } else {
                        musicMvMainUIC.f163279s.f165720w = true;
                    }
                }
                musicMvMainUIC.f163284x = motionEvent.getAction();
                musicMvMainUIC.f163285y = Util.currentTicks();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$f */
    public static final class C57022f implements C65257a.C65259b {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163299a;

        public C57022f(MusicMvMainUIC musicMvMainUIC) {
            this.f163299a = musicMvMainUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
            r0 = r0.mo17023I0(r5);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80443a(int r5) {
            /*
                r4 = this;
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                java.lang.String r0 = r0.f163267d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPageSettle:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ", lastPos:"
                r1.append(r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163299a
                int r2 = r2.f163275o
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                int r1 = r0.f163275o
                if (r1 != r5) goto L_0x002c
                return
            L_0x002c:
                r0.getClass()
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                boolean r0 = r0.f163283w
                if (r0 == 0) goto L_0x0053
                java.lang.Class<ox.b> r0 = p640ox.C77049b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ox.b r0 = (p640ox.C77049b) r0
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r4.f163299a
                android.app.Activity r1 = r1.getContext()
                r2 = 7
                java.lang.Class<te3.w23> r3 = te3.C64793w23.class
                pe3.a r0 = r0.Wi0(r1, r2, r3)
                te3.w23 r0 = (te3.C64793w23) r0
                if (r0 != 0) goto L_0x004f
                goto L_0x0053
            L_0x004f:
                r1 = 13
                r0.f186033d = r1
            L_0x0053:
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                r1 = 0
                r0.f163283w = r1
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.f163269f
                if (r0 == 0) goto L_0x0065
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17023I0(r5)
                if (r0 == 0) goto L_0x0065
                android.view.View r0 = r0.f44854d
                goto L_0x0066
            L_0x0065:
                r0 = 0
            L_0x0066:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163299a
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r2 = r1.mo62444c(r2)
                java.lang.Class<sb2.o> r3 = sb2.C63816o.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                sb2.o r2 = (sb2.C63816o) r2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = r4.f163299a
                java.util.ArrayList<nb2.d> r3 = r3.f163270g
                java.lang.Object r3 = r3.get(r5)
                nb2.d r3 = (nb2.C61646d) r3
                hb2.f r3 = r3.f175298d
                r2.mo88611j3(r0, r3)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163299a
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<sb2.c> r2 = sb2.C63743c.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                sb2.c r1 = (sb2.C63743c) r1
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163299a
                java.util.ArrayList<nb2.d> r2 = r2.f163270g
                java.lang.Object r2 = r2.get(r5)
                java.lang.String r3 = "dataList[position]"
                gy3.C87412m.m108593f(r2, r3)
                nb2.d r2 = (nb2.C61646d) r2
                r1.mo88562d3(r0, r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65711f3(r0, r5)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                r0.f163275o = r5
                r0.mo80451K3(r5)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163299a
                r0.mo80447F3(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.C57022f.mo80443a(int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$g */
    public static final class C57023g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163300d;

        public C57023g(MusicMvMainUIC musicMvMainUIC) {
            this.f163300d = musicMvMainUIC;
        }

        public final void run() {
            MusicMvMainUIC musicMvMainUIC = this.f163300d;
            musicMvMainUIC.f163274n.mo75025b(musicMvMainUIC.f163269f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h */
    public static final class C57024h extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163301a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h$a */
        public static final class C57025a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163302d;

            public C57025a(MusicMvMainUIC musicMvMainUIC) {
                this.f163302d = musicMvMainUIC;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
                r0 = r1.mo17023I0(r0.f163275o);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163302d
                    int r1 = r0.f163275o
                    com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65711f3(r0, r1)
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163302d
                    com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f163269f
                    if (r1 == 0) goto L_0x0018
                    int r0 = r0.f163275o
                    androidx.recyclerview.widget.RecyclerView$z r0 = r1.mo17023I0(r0)
                    if (r0 == 0) goto L_0x0018
                    android.view.View r0 = r0.f44854d
                    goto L_0x0019
                L_0x0018:
                    r0 = 0
                L_0x0019:
                    bl3.r r1 = bl3.C39818r.f106831a
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163302d
                    androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                    bl3.r$a r1 = r1.mo62444c(r2)
                    java.lang.Class<sb2.c> r2 = sb2.C63743c.class
                    androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                    sb2.c r1 = (sb2.C63743c) r1
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163302d
                    java.util.ArrayList<nb2.d> r3 = r2.f163270g
                    int r2 = r2.f163275o
                    java.lang.Object r2 = r3.get(r2)
                    java.lang.String r3 = "dataList[lastPos]"
                    gy3.C87412m.m108593f(r2, r3)
                    nb2.d r2 = (nb2.C61646d) r2
                    r1.mo88562d3(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.C57024h.C57025a.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h$b */
        public static final class C57026b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163303d;

            public C57026b(MusicMvMainUIC musicMvMainUIC) {
                this.f163303d = musicMvMainUIC;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
                r0 = r1.mo17023I0(r0.f163275o);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163303d
                    int r1 = r0.f163275o
                    com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65711f3(r0, r1)
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r4.f163303d
                    com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f163269f
                    if (r1 == 0) goto L_0x0018
                    int r0 = r0.f163275o
                    androidx.recyclerview.widget.RecyclerView$z r0 = r1.mo17023I0(r0)
                    if (r0 == 0) goto L_0x0018
                    android.view.View r0 = r0.f44854d
                    goto L_0x0019
                L_0x0018:
                    r0 = 0
                L_0x0019:
                    bl3.r r1 = bl3.C39818r.f106831a
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163303d
                    androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                    bl3.r$a r1 = r1.mo62444c(r2)
                    java.lang.Class<sb2.c> r2 = sb2.C63743c.class
                    androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                    sb2.c r1 = (sb2.C63743c) r1
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r4.f163303d
                    java.util.ArrayList<nb2.d> r3 = r2.f163270g
                    int r2 = r2.f163275o
                    java.lang.Object r2 = r3.get(r2)
                    java.lang.String r3 = "dataList[lastPos]"
                    gy3.C87412m.m108593f(r2, r3)
                    nb2.d r2 = (nb2.C61646d) r2
                    r1.mo88562d3(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.C57024h.C57026b.run():void");
            }
        }

        public C57024h(MusicMvMainUIC musicMvMainUIC) {
            this.f163301a = musicMvMainUIC;
        }

        /* renamed from: b */
        public void mo2556b() {
            WxRecyclerView wxRecyclerView;
            String str = this.f163301a.f163267d;
            Log.m105918d(str, "onChanged, lastPos:" + this.f163301a.f163275o + ", dataList.size:" + this.f163301a.f163270g.size());
            if (this.f163301a.f163270g.size() > 0) {
                MusicMvMainUIC musicMvMainUIC = this.f163301a;
                if (musicMvMainUIC.f163275o >= 0 && (wxRecyclerView = musicMvMainUIC.f163269f) != null) {
                    wxRecyclerView.post(new C57025a(musicMvMainUIC));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0047, code lost:
            r0 = r3.f163301a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2557c(int r4, int r5) {
            /*
                r3 = this;
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r3.f163301a
                java.lang.String r0 = r0.f163267d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onItemRangeChanged, lastPos:"
                r1.append(r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r3.f163301a
                int r2 = r2.f163275o
                r1.append(r2)
                java.lang.String r2 = ", positionStart:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ", itemCount:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ", dataList.size:"
                r1.append(r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r3.f163301a
                java.util.ArrayList<nb2.d> r2 = r2.f163270g
                int r2 = r2.size()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r3.f163301a
                java.util.ArrayList<nb2.d> r0 = r0.f163270g
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x0068
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r0 = r3.f163301a
                int r1 = r0.f163275o
                if (r1 < 0) goto L_0x0068
                int r5 = r5 + r4
                r2 = 0
                if (r4 > r1) goto L_0x0054
                if (r1 >= r5) goto L_0x0054
                r2 = 1
            L_0x0054:
                if (r2 == 0) goto L_0x0068
                ub2.a r4 = r0.f163274n
                boolean r4 = r4.f187875j
                if (r4 != 0) goto L_0x0068
                com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r0.f163269f
                if (r4 == 0) goto L_0x0068
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h$b r5 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h$b
                r5.<init>(r0)
                r4.post(r5)
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.C57024h.mo2557c(int, int):void");
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            String str = this.f163301a.f163267d;
            Log.m105924i(str, "onItemRangeChanged, lastPos:" + this.f163301a.f163275o + ", positionStart:" + i + ", itemCount:" + i2 + ", dataList.size:" + this.f163301a.f163270g.size() + ", payLoad:" + obj);
            Object obj2 = MusicMvMainUIC.f163257J;
            if (!C87412m.m108589b(obj, MusicMvMainUIC.f163257J)) {
                mo2557c(i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$i */
    public static final class C57027i implements C64216a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163304a;

        public C57027i(MusicMvMainUIC musicMvMainUIC) {
            this.f163304a = musicMvMainUIC;
        }

        /* renamed from: a */
        public void mo80464a(Long l, String str, long j) {
            C59822f c3 = (l == null || str == null) ? null : MusicMvMainUIC.m65708c3(this.f163304a, l.longValue(), str);
            C59830o oVar = C59830o.f170808a;
            C64488kb1 kb12 = C59830o.f170818k;
            Activity activity = C59830o.f170829v;
            if (kb12 != null && activity != null) {
                C59833q.f170832a.mo84793d(activity, kb12, c3, 6, j);
            }
        }

        /* renamed from: b */
        public void mo80465b(long j, String str) {
            long j2 = j;
            String str2 = str;
            C87412m.m108594g(str2, "nonceId");
            MusicMvMainUIC musicMvMainUIC = this.f163304a;
            musicMvMainUIC.getClass();
            Class cls = C64793w23.class;
            Class cls2 = C77049b.class;
            String str3 = musicMvMainUIC.f163267d;
            Log.m105924i(str3, "start to switchToMv from id dataList.size:" + musicMvMainUIC.f163270g.size());
            Iterator<C61646d> it = musicMvMainUIC.f163270g.iterator();
            boolean z = false;
            int i = 0;
            while (it.hasNext()) {
                C61646d next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    FinderObject d = C59822f.f170752A.mo84779d(next.f175298d);
                    int i3 = i2;
                    if (d != null && d.f164794id == j2 && C87412m.m108589b(d.objectNonceId, str2)) {
                        String str4 = musicMvMainUIC.f163267d;
                        Log.m105924i(str4, "switchToMv exist index:" + i);
                        musicMvMainUIC.mo80458n3(i);
                        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(musicMvMainUIC.getContext(), 7, cls);
                        if (w232 != null) {
                            w232.f186033d = 11;
                        }
                        musicMvMainUIC.mo80448G3(i);
                        z = true;
                    }
                    i = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (!z) {
                Log.m105924i(musicMvMainUIC.f163267d, "switchToMv not exist");
                ArrayList<C61646d> arrayList = musicMvMainUIC.f163270g;
                C59822f fVar = new C59822f();
                fVar.f170755c = Long.valueOf(j);
                fVar.f170756d = str2;
                musicMvMainUIC.mo80455k3(j2, str2, fVar);
                arrayList.add(new C61646d(fVar));
                int size = musicMvMainUIC.f163270g.size() - 1;
                musicMvMainUIC.mo80458n3(size);
                String str5 = musicMvMainUIC.f163267d;
                Log.m105924i(str5, "switchToMv final index:" + size + ", dataList.size:" + musicMvMainUIC.f163270g.size());
                musicMvMainUIC.mo80454j3().notifyItemInserted(size);
                C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(musicMvMainUIC.getContext(), 7, cls);
                if (w233 != null) {
                    w233.f186033d = 11;
                }
                musicMvMainUIC.mo80448G3(size);
            }
        }

        /* renamed from: c */
        public void mo80466c(Long l, String str, long j) {
            C59822f c3 = (l == null || str == null) ? null : MusicMvMainUIC.m65708c3(this.f163304a, l.longValue(), str);
            C59830o oVar = C59830o.f170808a;
            C64488kb1 kb12 = C59830o.f170818k;
            Activity activity = C59830o.f170829v;
            if (kb12 != null && activity != null) {
                C59833q.f170832a.mo84793d(activity, kb12, c3, 7, j);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$j */
    public static final class C57028j implements C65257a.C65258a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163305a;

        public C57028j(MusicMvMainUIC musicMvMainUIC) {
            this.f163305a = musicMvMainUIC;
        }

        public void onPageSelected(int i) {
            C59822f fVar;
            FinderObject d;
            String str = this.f163305a.f163267d;
            Log.m105924i(str, "onPageSelected:" + i);
            C61646d dVar = (C61646d) C110818d0.m150917O(this.f163305a.f163270g, i);
            if (!(dVar == null || (fVar = dVar.f175298d) == null || (d = C59822f.f170752A.mo84779d(fVar)) == null)) {
                new C49712hj1().f134675i = 91;
                db4 db4 = new db4();
                db4.f182676d = d.f164794id;
                db4.f182680h = d.objectNonceId;
                db4.f182677e = new C64654qd();
                op4 op4 = new op4();
                op4.f184693j = C31543z5.m39453c();
                op4.f184694n = C31543z5.m39453c() + ((long) 1000);
                op4.f184689f = 1000;
                op4.f184690g = 1000;
                op4.f184691h = 1000;
                op4.f184687d = 1;
                op4.f184688e = 1;
                op4.f184692i = 1000;
                op4.f184695o = 1000;
                op4.f184696p = 1;
                db4.f182678f = op4;
                C64441i93 i932 = new C64441i93();
                i932.f183650e = 100;
                i932.f183651f = 1000;
                i932.f183663u = 100;
                db4.f182679g = i932;
            }
            if (((C61646d) C110818d0.m150917O(this.f163305a.f163270g, i)) != null) {
                MusicMvMainUIC musicMvMainUIC = this.f163305a;
                musicMvMainUIC.getClass();
                musicMvMainUIC.f163282v = new C59836s(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$k */
    public static final class C57029k implements C65257a.C65260c {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163306a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$k$a */
        public static final class C57030a extends C87413o implements C32226l<Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163307d;

            /* renamed from: e */
            public final /* synthetic */ int f163308e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57030a(MusicMvMainUIC musicMvMainUIC, int i) {
                super(1);
                this.f163307d = musicMvMainUIC;
                this.f163308e = i;
            }

            public Object invoke(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                Log.m105924i(this.f163307d.f163267d, "requestSnapshot finished");
                this.f163307d.f163270g.get(this.f163308e).f175298d.getClass();
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C57066g(this.f163307d, this.f163308e, (C15601d<? super C57066g>) null), 2, (Object) null);
                this.f163307d.mo80454j3().notifyItemChanged(this.f163308e, MusicMvMainUIC.f163257J);
                return C13598b0.f38549a;
            }
        }

        public C57029k(MusicMvMainUIC musicMvMainUIC) {
            this.f163306a = musicMvMainUIC;
        }

        /* renamed from: a */
        public void mo80467a(int i) {
            String str = this.f163306a.f163267d;
            Log.m105924i(str, "onPageStartChange:" + i + ", dataList.size:" + this.f163306a.f163270g.size());
            if (i < this.f163306a.f163270g.size() && i >= 0) {
                if (this.f163306a.f163270g.size() > 1) {
                    this.f163306a.mo80458n3(i);
                }
                MusicMvMainUIC musicMvMainUIC = this.f163306a;
                musicMvMainUIC.f163283w = true;
                C61426c cVar = musicMvMainUIC.f163276p;
                if (cVar != null) {
                    cVar.mo86374b(new C57030a(musicMvMainUIC, i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$l */
    public static final class C57031l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163309d;

        public C57031l(MusicMvMainUIC musicMvMainUIC) {
            this.f163309d = musicMvMainUIC;
        }

        public final void run() {
            MusicMvMainUIC musicMvMainUIC = this.f163309d;
            MusicMvMainUIC.m65711f3(musicMvMainUIC, musicMvMainUIC.f163275o);
            WxRecyclerAdapter<C61646d> j3 = this.f163309d.mo80454j3();
            int i = this.f163309d.f163275o;
            Object obj = MusicMvMainUIC.f163257J;
            j3.notifyItemRangeChanged(i, 1, MusicMvMainUIC.f163257J);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$m */
    public static final class C57032m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163310d;

        /* renamed from: e */
        public final /* synthetic */ boolean f163311e;

        public C57032m(MusicMvMainUIC musicMvMainUIC, boolean z) {
            this.f163310d = musicMvMainUIC;
            this.f163311e = z;
        }

        public final void run() {
            C61426c cVar = this.f163310d.f163276p;
            if (cVar != null) {
                cVar.start();
            }
            WxRecyclerAdapter<C61646d> j3 = this.f163310d.mo80454j3();
            int i = this.f163310d.f163275o;
            Object obj = MusicMvMainUIC.f163257J;
            j3.notifyItemRangeChanged(i, 1, MusicMvMainUIC.f163257J);
            if (!C99364n.m129616h().mo138822a().mo32206f()) {
                MusicMvMainUIC musicMvMainUIC = this.f163310d;
                if (musicMvMainUIC.f163278r || this.f163311e) {
                    musicMvMainUIC.mo80451K3(musicMvMainUIC.f163275o);
                    MusicMvMainUIC musicMvMainUIC2 = this.f163310d;
                    musicMvMainUIC2.mo80447F3(musicMvMainUIC2.f163275o);
                    MusicMvMainUIC musicMvMainUIC3 = this.f163310d;
                    musicMvMainUIC3.getClass();
                    if (!C101093a.m132481c()) {
                        Intent intent = musicMvMainUIC3.getActivity().getIntent();
                        if (intent != null ? intent.getBooleanExtra("key_music_stop_or_complete", false) : false) {
                            C101093a.m132488j(C101093a.m132480b());
                        } else {
                            C101093a.m132486h();
                        }
                    }
                } else {
                    C61426c cVar2 = musicMvMainUIC.f163276p;
                    if (cVar2 != null) {
                        cVar2.setPauseOnVideoPlay(true);
                    }
                }
            }
            this.f163310d.f163278r = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n */
    public static final class C57033n implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163312d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvMainUIC f163313e;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$a */
        public static final class C57034a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppCompatActivity f163314d;

            /* renamed from: e */
            public final /* synthetic */ C49085d23 f163315e;

            public C57034a(AppCompatActivity appCompatActivity, C49085d23 d232) {
                this.f163314d = appCompatActivity;
                this.f163315e = d232;
            }

            public final void run() {
                C102658n6 bp = ((C59330q) C86312j.m106911c(C59330q.class)).mo84438bp(this.f163314d);
                if (bp != null) {
                    C49085d23 d232 = this.f163315e;
                    ((C59329p) C86312j.m106911c(C59329p.class)).mo84019Ts(bp.field_musicId, bp.field_songAlbum, d232.f132078f, d232.f132076d, false, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$b */
        public static final class C57035b implements C44580q1 {

            /* renamed from: a */
            public final /* synthetic */ MusicMvSongInfoUIC f163316a;

            /* renamed from: b */
            public final /* synthetic */ C59822f f163317b;

            /* renamed from: c */
            public final /* synthetic */ MusicMvMainUIC f163318c;

            /* renamed from: d */
            public final /* synthetic */ C63756e f163319d;

            public C57035b(MusicMvSongInfoUIC musicMvSongInfoUIC, C59822f fVar, MusicMvMainUIC musicMvMainUIC, C63756e eVar) {
                this.f163316a = musicMvSongInfoUIC;
                this.f163317b = fVar;
                this.f163318c = musicMvMainUIC;
                this.f163319d = eVar;
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                int i = z ? 3 : 1;
                MusicMvSongInfoUIC musicMvSongInfoUIC = this.f163316a;
                C64488kb1 kb12 = musicMvSongInfoUIC.f163371d;
                C59822f fVar = this.f163317b;
                MusicMvMainUIC musicMvMainUIC = this.f163318c;
                C63756e eVar = this.f163319d;
                if (kb12 != null && fVar != null) {
                    C59833q.f170832a.mo84795f(musicMvMainUIC.getContext(), kb12, fVar, 4, i, 6, musicMvSongInfoUIC.f163374g ? 1 : 2, eVar.mo88571e3(), eVar.mo88569c3(), eVar.mo88570d3(), eVar.f180736H);
                }
            }
        }

        public C57033n(AppCompatActivity appCompatActivity, MusicMvMainUIC musicMvMainUIC) {
            this.f163312d = appCompatActivity;
            this.f163313e = musicMvMainUIC;
        }

        /* JADX WARNING: type inference failed for: r12v2, types: [rx3.b0] */
        /* JADX WARNING: type inference failed for: r12v9, types: [java.lang.Integer] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSceneEnd(int r23, int r24, java.lang.String r25, ob0.C117747y r26) {
            /*
                r22 = this;
                r0 = r22
                r1 = r26
                java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC> r2 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC.class
                java.lang.Class<sb2.o> r3 = sb2.C63816o.class
                java.lang.Class<sb2.e> r4 = sb2.C63756e.class
                boolean r5 = r1 instanceof jb2.C46455a
                if (r5 == 0) goto L_0x0028
                r5 = r1
                jb2.a r5 = (jb2.C46455a) r5
                int r5 = r5.f125136d
                if (r5 == 0) goto L_0x0028
                androidx.appcompat.app.AppCompatActivity r6 = r0.f163312d
                int r6 = r6.hashCode()
                if (r5 == r6) goto L_0x0028
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                java.lang.String r1 = r1.f163267d
                java.lang.String r2 = "not the same page of netscene"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                return
            L_0x0028:
                bl3.r r5 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r6 = r0.f163312d
                bl3.r$a r6 = r5.mo62444c(r6)
                androidx.lifecycle.i0 r6 = r6.mo75002a(r4)
                java.lang.String r7 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
                gy3.C87412m.m108593f(r6, r7)
                sb2.e r6 = (sb2.C63756e) r6
                boolean r8 = r1 instanceof jb2.C46465q
                r9 = 1
                if (r8 == 0) goto L_0x0057
                if (r23 != 0) goto L_0x0051
                if (r24 != 0) goto L_0x0051
                jb2.q r1 = (jb2.C46465q) r1
                te3.b23 r1 = r1.f125182p
                if (r1 == 0) goto L_0x0051
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                r2.mo80457m3(r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0051:
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                r1.f163281u = r9
                goto L_0x07a2
            L_0x0057:
                boolean r8 = r1 instanceof jb2.C46466r
                r10 = 0
                r12 = 0
                r13 = 0
                if (r8 == 0) goto L_0x01d8
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                jb2.r r1 = (jb2.C46466r) r1
                te3.d23 r1 = r1.f125186o
                if (r1 == 0) goto L_0x01bf
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                androidx.appcompat.app.AppCompatActivity r4 = r0.f163312d
                java.lang.String r7 = r1.f132076d
                if (r7 == 0) goto L_0x0095
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x0079
                r8 = 1
                goto L_0x007a
            L_0x0079:
                r8 = 0
            L_0x007a:
                if (r8 == 0) goto L_0x0088
                te3.kb1 r8 = r6.f180744i
                java.lang.String r8 = r8.f183910j
                boolean r8 = android.text.TextUtils.isEmpty(r8)
                if (r8 == 0) goto L_0x0088
                r8 = 1
                goto L_0x0089
            L_0x0088:
                r8 = 0
            L_0x0089:
                if (r8 == 0) goto L_0x008c
                goto L_0x008d
            L_0x008c:
                r7 = r12
            L_0x008d:
                if (r7 == 0) goto L_0x0095
                te3.kb1 r8 = r6.f180744i
                r8.f183910j = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0095:
                java.lang.String r7 = r1.f132077e
                if (r7 == 0) goto L_0x00ae
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x00a1
                r8 = 1
                goto L_0x00a2
            L_0x00a1:
                r8 = 0
            L_0x00a2:
                if (r8 == 0) goto L_0x00a5
                goto L_0x00a6
            L_0x00a5:
                r7 = r12
            L_0x00a6:
                if (r7 == 0) goto L_0x00ae
                te3.kb1 r8 = r6.f180744i
                r8.f183911n = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x00ae:
                java.lang.String r7 = r1.f132078f
                if (r7 == 0) goto L_0x00c7
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x00ba
                r8 = 1
                goto L_0x00bb
            L_0x00ba:
                r8 = 0
            L_0x00bb:
                if (r8 == 0) goto L_0x00be
                goto L_0x00bf
            L_0x00be:
                r7 = r12
            L_0x00bf:
                if (r7 == 0) goto L_0x00c7
                te3.kb1 r8 = r6.f180744i
                r8.f183912o = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x00c7:
                java.lang.String r7 = r1.f132079g
                if (r7 == 0) goto L_0x00e0
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x00d3
                r8 = 1
                goto L_0x00d4
            L_0x00d3:
                r8 = 0
            L_0x00d4:
                if (r8 == 0) goto L_0x00d7
                goto L_0x00d8
            L_0x00d7:
                r7 = r12
            L_0x00d8:
                if (r7 == 0) goto L_0x00e0
                te3.kb1 r8 = r6.f180744i
                r8.f183913p = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x00e0:
                long r7 = r1.f132081i
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                long r14 = r7.longValue()
                int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r8 <= 0) goto L_0x00f0
                r8 = 1
                goto L_0x00f1
            L_0x00f0:
                r8 = 0
            L_0x00f1:
                if (r8 == 0) goto L_0x00f4
                goto L_0x00f5
            L_0x00f4:
                r7 = r12
            L_0x00f5:
                if (r7 == 0) goto L_0x0101
                long r7 = r7.longValue()
                te3.kb1 r10 = r6.f180744i
                r10.f183915r = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0101:
                java.lang.String r7 = r1.f132082j
                if (r7 == 0) goto L_0x011a
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x010d
                r8 = 1
                goto L_0x010e
            L_0x010d:
                r8 = 0
            L_0x010e:
                if (r8 == 0) goto L_0x0111
                goto L_0x0112
            L_0x0111:
                r7 = r12
            L_0x0112:
                if (r7 == 0) goto L_0x011a
                te3.kb1 r8 = r6.f180744i
                r8.f183920w = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x011a:
                ve3.n0 r7 = r1.f132083n
                if (r7 == 0) goto L_0x0122
                r6.f180754v = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0122:
                te3.v23 r7 = r1.f132084o
                if (r7 == 0) goto L_0x012a
                r6.f180756x = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x012a:
                java.lang.String r7 = r2.f163267d
                java.lang.Object[] r8 = new java.lang.Object[r9]
                lb2.h r9 = lb2.C61275h.f174381a
                te3.kb1 r10 = r6.f180744i
                java.lang.String r9 = r9.mo86261c(r10)
                r8[r13] = r9
                java.lang.String r9 = "getSongStatus %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r9, r8)
                java.lang.String r7 = r2.f163267d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "resp.musician finder_username:"
                r8.append(r9)
                te3.v23 r9 = r1.f132084o
                if (r9 == 0) goto L_0x0151
                java.lang.String r9 = r9.f143267d
                goto L_0x0152
            L_0x0151:
                r9 = r12
            L_0x0152:
                r8.append(r9)
                java.lang.String r9 = " jumpType:"
                r8.append(r9)
                te3.v23 r9 = r1.f132084o
                if (r9 == 0) goto L_0x0164
                int r9 = r9.f143269f
                java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            L_0x0164:
                r8.append(r12)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.lang.String r7 = r2.f163267d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "get lyric from SongStatus "
                r8.append(r9)
                java.lang.String r10 = r1.f132076d
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r8)
                java.lang.String r2 = r2.f163268e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                java.lang.String r8 = r1.f132076d
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
                r6.mo88573g3()
                bl3.r$a r2 = r5.mo62444c(r4)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                sb2.o r2 = (sb2.C63816o) r2
                te3.kb1 r3 = r6.f180744i
                ma2.s r5 = r6.f180745j
                r2.mo88612k3(r3, r5, r13)
                r6.mo88574i3()
                zt3.t r2 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$a r3 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$a
                r3.<init>(r4, r1)
                zt3.j r2 = (zt3.C119157j) r2
                r2.mo183875f(r3)
            L_0x01bf:
                hb2.q r7 = hb2.C59833q.f170832a
                androidx.appcompat.app.AppCompatActivity r8 = r0.f163312d
                te3.kb1 r9 = r6.f180744i
                hb2.f r10 = r6.f180743h
                int r11 = r6.mo88571e3()
                int r12 = r6.mo88569c3()
                java.lang.String r13 = r6.mo88570d3()
                r7.mo84797i(r8, r9, r10, r11, r12, r13)
                goto L_0x07a2
            L_0x01d8:
                boolean r8 = r1 instanceof jb2.C46463n
                java.lang.String r14 = "mv"
                if (r8 == 0) goto L_0x026b
                if (r23 != 0) goto L_0x01f4
                if (r24 != 0) goto L_0x01f4
                jb2.n r1 = (jb2.C46463n) r1
                te3.jm0 r2 = r1.f125173r
                if (r2 == 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = r0.f163313e
                int r1 = r1.f125169n
                com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65710e3(r3, r2, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x07a2
            L_0x01f4:
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                java.util.ArrayList<nb2.d> r3 = r2.f163270g
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
            L_0x01fd:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x07a2
                java.lang.Object r5 = r3.next()
                int r6 = r4 + 1
                if (r4 < 0) goto L_0x0267
                nb2.d r5 = (nb2.C61646d) r5
                hb2.f r7 = r5.f175298d
                int r7 = r7.hashCode()
                r8 = r1
                jb2.n r8 = (jb2.C46463n) r8
                int r8 = r8.f125169n
                if (r7 != r8) goto L_0x0265
                hb2.f$a r7 = hb2.C59822f.f170752A
                hb2.f r8 = r5.f175298d
                r7.getClass()
                gy3.C87412m.m108594g(r8, r14)
                r8.f170770r = r9
                r8.f170762j = r12
                r8.f170761i = r12
                java.util.LinkedList<te3.mb1> r7 = r8.f170759g
                r7.clear()
                r8.f170763k = r13
                r8.f170764l = r13
                r8.f170765m = r13
                r8.f170766n = r13
                r8.f170769q = r12
                r8.f170772t = r12
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r8.f170773u
                r7.clear()
                java.lang.String r7 = r2.f163267d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "notifyItemChanged5:"
                r8.append(r10)
                r8.append(r4)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r7 = r2.mo80454j3()
                java.lang.String r8 = "NetSceneMusicMvGetFinderFeedDetail_fail"
                r7.notifyItemChanged(r4, r8)
                hb2.f r4 = r5.f175298d
                r2.mo80449I3(r4)
            L_0x0265:
                r4 = r6
                goto L_0x01fd
            L_0x0267:
                sx3.C64197v.m75542k()
                throw r12
            L_0x026b:
                boolean r8 = r1 instanceof jb2.C60791k
                java.lang.String r15 = ""
                if (r8 == 0) goto L_0x0390
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                r2.f163280t = r9
                java.lang.String r2 = r2.f163267d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onSceneEnd MusicLiveGetBeatTrack songId:"
                r3.append(r4)
                jb2.k r1 = (jb2.C60791k) r1
                te3.kb1 r4 = r1.f173146i
                java.lang.String r4 = r4.f183909i
                r3.append(r4)
                java.lang.String r4 = " trackPoint:"
                r3.append(r4)
                te3.q13 r4 = r1.f173151q
                if (r4 == 0) goto L_0x029b
                java.util.LinkedList<java.lang.Integer> r4 = r4.f140089d
                goto L_0x029c
            L_0x029b:
                r4 = r12
            L_0x029c:
                r3.append(r4)
                java.lang.String r4 = " flexSize:"
                r3.append(r4)
                te3.q13 r4 = r1.f173151q
                if (r4 == 0) goto L_0x02b5
                java.util.LinkedList<java.lang.Integer> r4 = r4.f140090e
                if (r4 == 0) goto L_0x02b5
                int r4 = r4.size()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x02b6
            L_0x02b5:
                r4 = r12
            L_0x02b6:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                int r2 = r1.f173147j
                te3.q13 r3 = r1.f173151q
                if (r3 == 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r4 = r0.f163313e
                java.util.LinkedList<java.lang.Integer> r5 = r3.f140090e
                int r5 = r5.size()
                r6.f180753u = r5
                java.util.ArrayList<nb2.d> r5 = r4.f163270g
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L_0x02d7:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x02fb
                java.lang.Object r7 = r5.next()
                int r8 = r6 + 1
                if (r6 < 0) goto L_0x02f7
                nb2.d r7 = (nb2.C61646d) r7
                hb2.f r14 = r7.f175298d
                int r14 = r14.hashCode()
                int r13 = r1.f173148n
                if (r14 != r13) goto L_0x02f4
                hb2.f r1 = r7.f175298d
                goto L_0x02fd
            L_0x02f4:
                r6 = r8
                r13 = 0
                goto L_0x02d7
            L_0x02f7:
                sx3.C64197v.m75542k()
                throw r12
            L_0x02fb:
                r6 = -1
                r1 = r12
            L_0x02fd:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                if (r1 == 0) goto L_0x0363
                if (r6 < 0) goto L_0x030c
                java.util.LinkedList<te3.mb1> r5 = r1.f170759g
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x030c
                goto L_0x030d
            L_0x030c:
                r9 = 0
            L_0x030d:
                if (r9 == 0) goto L_0x0310
                r12 = r1
            L_0x0310:
                if (r12 == 0) goto L_0x0363
                java.util.LinkedList<java.lang.Integer> r1 = r3.f140089d
                java.lang.String r3 = "beatTrackResponse.break_point_ms"
                gy3.C87412m.m108593f(r1, r3)
                java.util.Iterator r1 = r1.iterator()
                r13 = 0
            L_0x031e:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0349
                java.lang.Object r3 = r1.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                te3.mb1 r5 = new te3.mb1
                r5.<init>()
                r5.f184260f = r10
                r5.f184261g = r15
                long r7 = (long) r13
                r5.f184258d = r7
                int r7 = r3.intValue()
                int r7 = r7 - r13
                r5.f184259e = r7
                r5.f184262h = r10
                java.util.LinkedList<te3.mb1> r7 = r12.f170759g
                r7.add(r5)
                int r13 = r3.intValue()
                goto L_0x031e
            L_0x0349:
                if (r13 >= r2) goto L_0x0361
                te3.mb1 r1 = new te3.mb1
                r1.<init>()
                r1.f184260f = r10
                r1.f184261g = r15
                long r7 = (long) r13
                r1.f184258d = r7
                int r2 = r2 - r13
                r1.f184259e = r2
                r1.f184262h = r10
                java.util.LinkedList<te3.mb1> r2 = r12.f170759g
                r2.add(r1)
            L_0x0361:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0363:
                boolean r1 = r4.f163281u
                if (r1 == 0) goto L_0x07a2
                java.lang.String r1 = r4.f163267d
                java.lang.String r2 = "get beat track notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.String r1 = r4.f163267d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "notifyItemChanged6:"
                r2.append(r3)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r4.mo80454j3()
                java.lang.String r2 = "NetSceneMusicMvGetBeatTrack"
                r1.notifyItemChanged(r6, r2)
                goto L_0x07a2
            L_0x0390:
                boolean r8 = r1 instanceof jb2.C46460i
                if (r8 == 0) goto L_0x03f2
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                jb2.i r1 = (jb2.C46460i) r1
                te3.m13 r1 = r1.f125157o
                if (r1 == 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                long r3 = r1.f137750d
                r6.f180747o = r3
                te3.kb1 r3 = r6.f180744i
                java.lang.String r4 = r1.f137752f
                r3.f183909i = r4
                java.lang.String r3 = r1.f137751e
                r6.f180748p = r3
                java.lang.String r3 = r1.f137753g
                if (r3 != 0) goto L_0x03b3
                r3 = r15
            L_0x03b3:
                r6.f180729A = r3
                java.lang.String r3 = r1.f137754h
                if (r3 != 0) goto L_0x03ba
                goto L_0x03bb
            L_0x03ba:
                r15 = r3
            L_0x03bb:
                r6.f180730B = r15
                r2.f163263F = r9
                r2.mo80456l3()
                java.lang.String r2 = r2.f163267d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "NetSceneMusicMvCheckPermission songId:"
                r3.append(r4)
                java.lang.String r4 = r1.f137752f
                r3.append(r4)
                java.lang.String r4 = " mvPostPermissionBit:"
                r3.append(r4)
                long r4 = r1.f137750d
                r3.append(r4)
                java.lang.String r4 = " statusVerifyInfo:"
                r3.append(r4)
                java.lang.String r1 = r1.f137751e
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x07a2
            L_0x03f2:
                boolean r6 = r1 instanceof je1.C46530q2
                if (r6 == 0) goto L_0x0487
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                java.lang.String r1 = r1.f163267d
                java.lang.String r2 = "ret delete mv finished"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                int r2 = r1.f163275o
                java.util.ArrayList<nb2.d> r1 = r1.f163270g
                int r1 = r1.size()
                if (r2 >= r1) goto L_0x07a2
                hb2.f$a r1 = hb2.C59822f.f170752A
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                java.util.ArrayList<nb2.d> r3 = r2.f163270g
                int r2 = r2.f163275o
                java.lang.Object r2 = r3.get(r2)
                nb2.d r2 = (nb2.C61646d) r2
                hb2.f r2 = r2.f175298d
                r1.getClass()
                gy3.C87412m.m108594g(r2, r14)
                r2.f170770r = r9
                r2.f170762j = r12
                r2.f170761i = r12
                java.util.LinkedList<te3.mb1> r1 = r2.f170759g
                java.util.Iterator r1 = r1.iterator()
            L_0x0432:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0448
                java.lang.Object r3 = r1.next()
                te3.mb1 r3 = (te3.C64550mb1) r3
                r3.f184261g = r15
                r3.f184260f = r10
                r4 = 0
                r3.f184263i = r4
                r3.f184264j = r4
                goto L_0x0432
            L_0x0448:
                r4 = 0
                r2.f170763k = r4
                r2.f170764l = r4
                r2.f170765m = r4
                r2.f170766n = r4
                r2.f170769q = r12
                r2.f170772t = r12
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r2.f170773u
                r1.clear()
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                java.util.ArrayList<nb2.d> r2 = r1.f163270g
                int r1 = r1.f163275o
                java.lang.Object r1 = r2.get(r1)
                nb2.d r1 = (nb2.C61646d) r1
                hb2.f r1 = r1.f175298d
                r1.f170770r = r9
                la2.n r1 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
                r2 = 0
                r1.mo32203a(r2)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r1.mo80454j3()
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                int r2 = r2.f163275o
                java.lang.String r3 = "NetSceneDeleteFinderObject"
                r1.notifyItemRangeChanged(r2, r9, r3)
                goto L_0x07a2
            L_0x0487:
                boolean r6 = r1 instanceof jb2.C46464p
                java.lang.String r8 = "UICProvider.of(activity)…vSongInfoUIC::class.java)"
                if (r6 == 0) goto L_0x054f
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                if (r6 == 0) goto L_0x0497
                r3 = r1
                jb2.p r3 = (jb2.C46464p) r3
                goto L_0x0498
            L_0x0497:
                r3 = r12
            L_0x0498:
                if (r3 == 0) goto L_0x04a2
                te3.v13 r3 = r3.f125177o
                if (r3 == 0) goto L_0x04a2
                java.lang.String r3 = r3.f143245d
                r15 = r3
                goto L_0x04a3
            L_0x04a2:
                r15 = r12
            L_0x04a3:
                if (r6 == 0) goto L_0x04a9
                r3 = r1
                jb2.p r3 = (jb2.C46464p) r3
                goto L_0x04aa
            L_0x04a9:
                r3 = r12
            L_0x04aa:
                if (r3 == 0) goto L_0x04b5
                te3.v13 r3 = r3.f125177o
                if (r3 == 0) goto L_0x04b5
                java.lang.String r3 = r3.f143246e
                r16 = r3
                goto L_0x04b7
            L_0x04b5:
                r16 = r12
            L_0x04b7:
                if (r6 == 0) goto L_0x04bd
                r3 = r1
                jb2.p r3 = (jb2.C46464p) r3
                goto L_0x04be
            L_0x04bd:
                r3 = r12
            L_0x04be:
                if (r3 == 0) goto L_0x04c9
                te3.v13 r3 = r3.f125177o
                if (r3 == 0) goto L_0x04c9
                java.lang.String r3 = r3.f143247f
                r17 = r3
                goto L_0x04cb
            L_0x04c9:
                r17 = r12
            L_0x04cb:
                if (r6 == 0) goto L_0x04d0
                jb2.p r1 = (jb2.C46464p) r1
                goto L_0x04d1
            L_0x04d0:
                r1 = r12
            L_0x04d1:
                if (r1 == 0) goto L_0x04dc
                te3.v13 r1 = r1.f125177o
                if (r1 == 0) goto L_0x04dc
                java.lang.String r1 = r1.f143248g
                r18 = r1
                goto L_0x04de
            L_0x04dc:
                r18 = r12
            L_0x04de:
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                java.lang.String r1 = r1.f163267d
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r6 = 0
                r3[r6] = r15
                r3[r9] = r16
                r6 = 2
                r3[r6] = r17
                r6 = 3
                r3[r6] = r18
                java.lang.String r6 = "get ticket token:%s, scheme:%s, description:%s, confirmText:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r3)
                androidx.appcompat.app.AppCompatActivity r1 = r0.f163312d
                bl3.r$a r1 = r5.mo62444c(r1)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
                gy3.C87412m.m108593f(r1, r7)
                sb2.e r1 = (sb2.C63756e) r1
                androidx.appcompat.app.AppCompatActivity r3 = r0.f163312d
                bl3.r$a r3 = r5.mo62444c(r3)
                androidx.lifecycle.i0 r2 = r3.mo75002a(r2)
                gy3.C87412m.m108593f(r2, r8)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC) r2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = r0.f163313e
                java.util.ArrayList<nb2.d> r4 = r3.f163270g
                int r3 = r3.f163275o
                java.lang.Object r3 = sx3.C110818d0.m150917O(r4, r3)
                nb2.d r3 = (nb2.C61646d) r3
                if (r3 == 0) goto L_0x0523
                hb2.f r12 = r3.f175298d
            L_0x0523:
                java.lang.Class<fv.q> r3 = p529fv.C59330q.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                r13 = r3
                fv.q r13 = (p529fv.C59330q) r13
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = r0.f163313e
                android.app.Activity r14 = r3.getContext()
                qc0.m r3 = qc0.C101093a.m132480b()
                java.lang.String r4 = "getMusicWrapper()"
                gy3.C87412m.m108593f(r3, r4)
                te3.kb1 r4 = r2.f163371d
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$b r5 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$n$b
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r6 = r0.f163313e
                r5.<init>(r2, r12, r6, r1)
                r19 = r3
                r20 = r4
                r21 = r5
                r13.mo84437VL(r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x07a2
            L_0x054f:
                boolean r6 = r1 instanceof jb2.C60790h
                if (r6 == 0) goto L_0x0611
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                qc0.m r6 = qc0.C101093a.m132480b()
                jb2.h r1 = (jb2.C60790h) r1
                ob0.c r1 = r1.f173144e
                if (r1 == 0) goto L_0x056c
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                if (r1 == 0) goto L_0x056c
                te3.y13 r1 = (te3.C52053y13) r1
                java.util.LinkedList<te3.z13> r1 = r1.f145074d
                goto L_0x056d
            L_0x056c:
                r1 = r12
            L_0x056d:
                androidx.appcompat.app.AppCompatActivity r10 = r0.f163312d
                bl3.r$a r10 = r5.mo62444c(r10)
                androidx.lifecycle.i0 r2 = r10.mo75002a(r2)
                gy3.C87412m.m108593f(r2, r8)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC) r2
                androidx.appcompat.app.AppCompatActivity r8 = r0.f163312d
                bl3.r$a r8 = r5.mo62444c(r8)
                androidx.lifecycle.i0 r4 = r8.mo75002a(r4)
                gy3.C87412m.m108593f(r4, r7)
                sb2.e r4 = (sb2.C63756e) r4
                if (r1 == 0) goto L_0x07a2
                r7 = 0
                java.lang.Object r8 = r1.get(r7)
                te3.z13 r8 = (te3.C64871z13) r8
                if (r8 == 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r7 = r0.f163313e
                androidx.appcompat.app.AppCompatActivity r10 = r0.f163312d
                int r11 = r8.f186618d
                if (r11 != 0) goto L_0x05eb
                te3.x13 r11 = r8.f186620f
                if (r11 == 0) goto L_0x05de
                int r11 = r8.f186622h
                if (r11 != r9) goto L_0x05dc
                boolean r9 = r2.f163374g
                if (r9 == 0) goto L_0x05dc
                java.lang.Class<fv.o> r9 = p529fv.C59327o.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                fv.o r9 = (p529fv.C59327o) r9
                r9.mo84015Xb(r1)
                te3.kb1 r1 = r4.f180744i
                java.lang.String r9 = r8.f186624j
                r1.f183910j = r9
                java.lang.String r1 = r8.f186621g
                r6.f295955Q = r1
                qc0.C101093a.m132488j(r6)
                r4.mo88573g3()
                bl3.r$a r1 = r5.mo62444c(r10)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
                sb2.o r1 = (sb2.C63816o) r1
                te3.kb1 r3 = r4.f180744i
                ma2.s r4 = r4.f180745j
                r5 = 0
                r1.mo88612k3(r3, r4, r5)
                r2.mo80491g3()
                r2.f163374g = r5
            L_0x05dc:
                rx3.b0 r12 = rx3.C13598b0.f38549a
            L_0x05de:
                if (r12 != 0) goto L_0x060d
                java.lang.String r1 = r7.f163267d
                java.lang.String r2 = "linkInfo.info is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x060d
            L_0x05eb:
                java.lang.String r1 = r7.f163267d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "errCode:"
                r2.append(r3)
                int r3 = r8.f186618d
                r2.append(r3)
                java.lang.String r3 = ", errMsg:"
                r2.append(r3)
                java.lang.String r3 = r8.f186619e
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x060d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x07a2
            L_0x0611:
                boolean r2 = r1 instanceof jb2.C46459g
                if (r2 == 0) goto L_0x0658
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                jb2.g r1 = (jb2.C46459g) r1
                androidx.appcompat.app.AppCompatActivity r2 = r0.f163312d
                ob0.c r1 = r1.f125152j
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoResp"
                gy3.C87412m.m108592e(r1, r3)
                te3.s13 r1 = (te3.C51190s13) r1
                bl3.r$a r2 = r5.mo62444c(r2)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
                gy3.C87412m.m108593f(r2, r7)
                sb2.e r2 = (sb2.C63756e) r2
                int r3 = r1.f141271d
                r2.f180731C = r3
                int r3 = r1.f141272e
                r2.f180732D = r3
                int r3 = r1.f141273f
                r2.f180733E = r3
                boolean r1 = r1.f141274g
                r2.f180734F = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = r0.f163313e
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r1.mo80454j3()
                java.lang.String r2 = "UniComponent"
                r3 = 0
                r1.notifyItemChanged(r3, r2)
                goto L_0x07a2
            L_0x0658:
                boolean r2 = r1 instanceof jb2.C46458f
                if (r2 == 0) goto L_0x06f3
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                androidx.appcompat.app.AppCompatActivity r2 = r0.f163312d
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = r0.f163313e
                jb2.f r1 = (jb2.C46458f) r1
                ob0.c r6 = r1.f125150f
                ob0.c$d r6 = r6.f127056b
                pe3.a r6 = r6.f127083a
                java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse"
                gy3.C87412m.m108592e(r6, r8)
                ue3.f r6 = (ue3.C52553f) r6
                bl3.r$a r2 = r5.mo62444c(r2)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
                gy3.C87412m.m108593f(r2, r7)
                sb2.e r2 = (sb2.C63756e) r2
                java.util.LinkedList<java.lang.String> r4 = r2.f180737I
                r4.clear()
                java.util.LinkedList<java.lang.Object> r4 = r2.f180738J
                r4.clear()
                java.util.LinkedList<ue3.h> r4 = r6.f146776d
                if (r4 == 0) goto L_0x06e8
                int r4 = r4.size()
                if (r4 <= 0) goto L_0x06e8
                java.util.LinkedList<ue3.h> r4 = r6.f146776d
                java.lang.String r5 = "it.results"
                gy3.C87412m.m108593f(r4, r5)
                java.util.Iterator r4 = r4.iterator()
            L_0x06a0:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x06d0
                java.lang.Object r5 = r4.next()
                ue3.h r5 = (ue3.C52554h) r5
                if (r5 == 0) goto L_0x06a0
                java.lang.String r6 = r5.f146777d
                if (r6 == 0) goto L_0x06a0
                java.util.LinkedList<java.lang.String> r7 = r2.f180737I
                r7.add(r6)
                java.lang.String r6 = r3.f163267d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "NetSceneMMListenItem tingIds:"
                r7.append(r8)
                java.lang.String r5 = r5.f146777d
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                goto L_0x06a0
            L_0x06d0:
                java.util.LinkedList<java.lang.String> r4 = r2.f180737I
                int r4 = r4.size()
                if (r4 <= 0) goto L_0x06e0
                java.util.LinkedList<java.lang.String> r2 = r2.f180737I
                java.lang.String r1 = r1.f125148d
                com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65709d3(r3, r2, r1)
                goto L_0x06ef
            L_0x06e0:
                java.lang.String r1 = r3.f163267d
                java.lang.String r2 = "NetSceneMMListenItem tingIds is empty, don't getMusicStory"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x06ef
            L_0x06e8:
                java.lang.String r1 = r3.f163267d
                java.lang.String r2 = "NetSceneMMListenItem music results is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x06ef:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x07a2
            L_0x06f3:
                boolean r2 = r1 instanceof jb2.C9287d
                if (r2 == 0) goto L_0x0703
                if (r23 != 0) goto L_0x07a2
                if (r24 == 0) goto L_0x06fd
                goto L_0x07a2
            L_0x06fd:
                jb2.d r1 = (jb2.C9287d) r1
                r1.getClass()
                throw r12
            L_0x0703:
                boolean r2 = r1 instanceof jb2.C46457e
                if (r2 == 0) goto L_0x07a2
                if (r23 != 0) goto L_0x07a2
                if (r24 != 0) goto L_0x07a2
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r2 = r0.f163313e
                androidx.appcompat.app.AppCompatActivity r5 = r0.f163312d
                jb2.e r1 = (jb2.C46457e) r1
                ob0.c r6 = r1.f125146f
                ob0.c$d r6 = r6.f127056b
                pe3.a r6 = r6.f127083a
                java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse"
                gy3.C87412m.m108592e(r6, r8)
                ue3.d r6 = (ue3.C52551d) r6
                java.lang.String r8 = r2.f163267d
                java.lang.String r10 = "NetSceneMMListenGetLyric get music listen lyric callback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
                java.util.LinkedList<ue3.a> r6 = r6.f146771d
                if (r6 == 0) goto L_0x07a0
                java.util.Iterator r6 = r6.iterator()
                r8 = 0
            L_0x072f:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x07a0
                java.lang.Object r10 = r6.next()
                int r11 = r8 + 1
                if (r8 < 0) goto L_0x079c
                ue3.a r10 = (ue3.C52548a) r10
                java.lang.String r8 = r2.f163267d
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.String r14 = r10.f146762d
                r15 = 0
                r13[r15] = r14
                java.lang.String r14 = "getLyricRespItem.lyric:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r13)
                java.lang.String r8 = r10.f146762d
                if (r8 == 0) goto L_0x0799
                bl3.r r8 = bl3.C39818r.f106831a
                bl3.r$a r13 = r8.mo62444c(r5)
                androidx.lifecycle.i0 r13 = r13.mo75002a(r4)
                gy3.C87412m.m108593f(r13, r7)
                sb2.e r13 = (sb2.C63756e) r13
                te3.kb1 r14 = r13.f180744i
                java.lang.String r15 = r10.f146762d
                r14.f183910j = r15
                r13.mo88573g3()
                r14 = 0
                r13.f180746n = r14
                bl3.r$a r8 = r8.mo62444c(r5)
                androidx.lifecycle.i0 r8 = r8.mo75002a(r3)
                sb2.o r8 = (sb2.C63816o) r8
                te3.kb1 r14 = r13.f180744i
                ma2.s r13 = r13.f180745j
                r8.mo88612k3(r14, r13, r9)
                java.lang.String r8 = r2.f163267d
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.String r14 = r1.f125144d
                r15 = 0
                r13[r15] = r14
                java.lang.String r14 = "putLyricsCache cacheKey:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r13)
                hb2.i r8 = hb2.C32799i.f89226a
                java.lang.String r13 = r1.f125144d
                java.lang.String r10 = r10.f146762d
                gy3.C87412m.m108591d(r10)
                r8.mo58807b(r13, r10)
                goto L_0x079a
            L_0x0799:
                r15 = 0
            L_0x079a:
                r8 = r11
                goto L_0x072f
            L_0x079c:
                sx3.C64197v.m75542k()
                throw r12
            L_0x07a0:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x07a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.C57033n.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$o */
    public static final class C57036o implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMainUIC f163320a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$o$a */
        public static final class C57037a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f163321d;

            /* renamed from: e */
            public final /* synthetic */ int f163322e;

            /* renamed from: f */
            public final /* synthetic */ MusicMvMainUIC f163323f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57037a(int i, int i2, MusicMvMainUIC musicMvMainUIC) {
                super(0);
                this.f163321d = i;
                this.f163322e = i2;
                this.f163323f = musicMvMainUIC;
            }

            public Object invoke() {
                C59836s sVar;
                if (this.f163321d >= 0 && this.f163322e >= 0 && (sVar = this.f163323f.f163282v) != null) {
                    MusicMvMainUIC musicMvMainUIC = this.f163323f;
                    int i = this.f163321d;
                    int i2 = this.f163322e;
                    Log.m105918d(musicMvMainUIC.f163267d, "onVideoProgressUpdate : currentPos :" + i + "  totalDuration:" + i2 + " maxPlayPercent :" + sVar.f170842d + " maxPlayLength:" + sVar.f170841c + " retryPlayTimes:" + sVar.f170843e);
                    if (i < sVar.f170841c) {
                        sVar.f170843e++;
                    }
                    sVar.f170841c = i;
                    sVar.f170842d = (int) ((((float) 100) * ((float) i)) / ((float) i2));
                }
                return C13598b0.f38549a;
            }
        }

        public C57036o(MusicMvMainUIC musicMvMainUIC) {
            this.f163320a = musicMvMainUIC;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            C61926c.m72668M(new C57037a(i, i2, this.f163320a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$p */
    public static final class C57038p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMainUIC f163324d;

        /* renamed from: e */
        public final /* synthetic */ int f163325e;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$p$a */
        public static final class C57039a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMainUIC f163326d;

            /* renamed from: e */
            public final /* synthetic */ int f163327e;

            public C57039a(MusicMvMainUIC musicMvMainUIC, int i) {
                this.f163326d = musicMvMainUIC;
                this.f163327e = i;
            }

            public final void run() {
                Log.m105924i(this.f163326d.f163267d, "post smooth scroll");
                WxRecyclerView wxRecyclerView = this.f163326d.f163269f;
                if (wxRecyclerView != null) {
                    int i = this.f163327e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }

        public C57038p(MusicMvMainUIC musicMvMainUIC, int i) {
            this.f163324d = musicMvMainUIC;
            this.f163325e = i;
        }

        public final void run() {
            Log.m105924i(this.f163324d.f163267d, "post stopScroll");
            WxRecyclerView wxRecyclerView = this.f163324d.f163269f;
            if (wxRecyclerView != null) {
                wxRecyclerView.mo17155w1();
            }
            MusicMvMainUIC musicMvMainUIC = this.f163324d;
            WxRecyclerView wxRecyclerView2 = musicMvMainUIC.f163269f;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.post(new C57039a(musicMvMainUIC, this.f163325e));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMainUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f163272i = C36568h.m40985a(new C57014a(this, appCompatActivity));
        this.f163273j = new C57036o(this);
        this.f163274n = new C65257a();
        this.f163275o = -1;
        this.f163279s = new Flip3DLayoutManager(appCompatActivity, 0, false);
        this.f163285y = -1;
        this.f163286z = -1.0f;
        this.f163258A = -1;
        this.f163259B = new C57028j(this);
        this.f163260C = new C57029k(this);
        C40008f fVar = C40008f.f107254d;
        this.f163261D = new MusicMvMainUIC$musicListener$1(appCompatActivity, this, fVar);
        this.f163262E = new C57033n(appCompatActivity, this);
        this.f163265H = new C57016c(this, appCompatActivity);
        this.f163266I = new MusicMvMainUIC$finderCommentEventListener$1(appCompatActivity, this, fVar);
    }

    /* renamed from: c3 */
    public static final C59822f m65708c3(MusicMvMainUIC musicMvMainUIC, long j, String str) {
        Iterator<C61646d> it = musicMvMainUIC.f163270g.iterator();
        int i = 0;
        while (it.hasNext()) {
            C61646d next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C61646d dVar = next;
                FinderObject d = C59822f.f170752A.mo84779d(dVar.f175298d);
                if (d == null || d.f164794id != j || !C87412m.m108589b(d.objectNonceId, str)) {
                    i = i2;
                } else {
                    String str2 = musicMvMainUIC.f163267d;
                    Log.m105924i(str2, "getMusicMv exist index:" + i);
                    C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(musicMvMainUIC.getContext(), 7, C64793w23.class);
                    if (w232 != null) {
                        w232.f186033d = 11;
                    }
                    return dVar.f175298d;
                }
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return null;
    }

    /* renamed from: d3 */
    public static final void m65709d3(MusicMvMainUIC musicMvMainUIC, LinkedList linkedList, String str) {
        Log.m105925i(musicMvMainUIC.f163267d, "getMusicStory ids size:", Integer.valueOf(linkedList.size()));
        C39622i0 a = C39818r.f106831a.mo62444c(musicMvMainUIC.getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C86709a0.m107524d().mo123460f(new C46457e(linkedList, 1, ((C63756e) a).f180744i.f183922y, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x017f  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65710e3(com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC r16, te3.C50008jm0 r17, int r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = r0.f163267d
            java.lang.String r4 = "handleGetCommentDetailResponse"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r16.getActivity()
            bl3.r$a r3 = r3.mo62444c(r4)
            java.lang.Class<sb2.e> r4 = sb2.C63756e.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            sb2.e r3 = (sb2.C63756e) r3
            java.util.ArrayList<nb2.d> r4 = r0.f163270g
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 0
        L_0x002c:
            boolean r8 = r4.hasNext()
            r9 = 0
            java.lang.String r11 = "resp.refObjectList"
            r12 = 0
            r13 = 1
            if (r8 == 0) goto L_0x00c6
            java.lang.Object r8 = r4.next()
            int r14 = r7 + 1
            if (r7 < 0) goto L_0x00c2
            nb2.d r8 = (nb2.C61646d) r8
            hb2.f r12 = r8.f175298d
            int r12 = r12.hashCode()
            if (r12 != r2) goto L_0x00bf
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r1.f136192p
            gy3.C87412m.m108593f(r6, r11)
            java.util.Iterator r6 = r6.iterator()
        L_0x0054:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x006b
            java.lang.Object r12 = r6.next()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
            lb2.h r15 = lb2.C61275h.f174381a
            java.lang.String r5 = "it"
            gy3.C87412m.m108593f(r12, r5)
            r15.mo86259a(r12)
            goto L_0x0054
        L_0x006b:
            hb2.f r5 = r8.f175298d
            java.lang.Long r5 = r5.f170753a
            if (r5 == 0) goto L_0x0087
            long r5 = r5.longValue()
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x0087
            hb2.f r5 = r8.f175298d
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r1.f136184e
            r5.f170772t = r6
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r1.f136192p
            gy3.C87412m.m108593f(r6, r11)
            r5.f170773u = r6
            goto L_0x00be
        L_0x0087:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r1.f136184e
            if (r5 == 0) goto L_0x00be
            hb2.f$a r6 = hb2.C59822f.f170752A
            hb2.f r9 = r8.f175298d
            r6.mo84777b(r5, r9)
            hb2.f r5 = r8.f175298d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r1.f136192p
            gy3.C87412m.m108593f(r6, r11)
            r5.getClass()
            r5.f170767o = r6
            java.lang.String r5 = r0.f163267d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "notifyItemChanged1:"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r16.mo80454j3()
            java.lang.String r6 = "CommentDetailResponse"
            r5.notifyItemChanged(r7, r6)
        L_0x00be:
            r6 = 1
        L_0x00bf:
            r7 = r14
            goto L_0x002c
        L_0x00c2:
            sx3.C64197v.m75542k()
            throw r12
        L_0x00c6:
            if (r6 != 0) goto L_0x0203
            r4 = -1
            java.util.ArrayList<nb2.d> r5 = r0.f163271h
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x00d0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01fc
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x01f8
            nb2.d r7 = (nb2.C61646d) r7
            hb2.f r14 = r7.f175298d
            int r14 = r14.hashCode()
            if (r14 != r2) goto L_0x01f4
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r1.f136184e
            if (r14 == 0) goto L_0x01f4
            hb2.f$a r2 = hb2.C59822f.f170752A
            hb2.f r4 = r7.f175298d
            r2.mo84777b(r14, r4)
            hb2.f r2 = r7.f175298d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r1.f136192p
            gy3.C87412m.m108593f(r1, r11)
            r2.getClass()
            r2.f170767o = r1
            java.util.ArrayList<nb2.d> r1 = r0.f163270g
            int r2 = r1.size()
            if (r2 != r13) goto L_0x0109
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            if (r2 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r1 = r12
        L_0x010e:
            java.lang.String r2 = "notifyItemChanged2"
            if (r1 == 0) goto L_0x017c
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            nb2.d r1 = (nb2.C61646d) r1
            if (r1 == 0) goto L_0x017c
            hb2.f r1 = r1.f175298d
            if (r1 == 0) goto L_0x017c
            hb2.f r4 = r3.f180743h
            boolean r4 = gy3.C87412m.m108589b(r1, r4)
            if (r4 == 0) goto L_0x0143
            hb2.f r3 = r3.f180743h
            java.lang.Long r3 = r3.f170755c
            if (r3 == 0) goto L_0x0135
            long r3 = r3.longValue()
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0143
        L_0x0135:
            java.lang.Long r3 = r1.f170753a
            if (r3 == 0) goto L_0x0141
            long r3 = r3.longValue()
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0143
        L_0x0141:
            r3 = 1
            goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            if (r3 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r1 = r12
        L_0x0148:
            if (r1 == 0) goto L_0x017c
            java.util.ArrayList<nb2.d> r3 = r0.f163270g
            r3.clear()
            hb2.f r3 = r7.f175298d
            boolean r1 = r1.f170771s
            r3.f170771s = r1
            java.util.ArrayList<nb2.d> r1 = r0.f163270g
            r1.add(r7)
            java.lang.String r1 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notifyItemChanged2:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r16.mo80454j3()
            r3 = 0
            r1.notifyItemChanged(r3, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x017d
        L_0x017c:
            r1 = r12
        L_0x017d:
            if (r1 != 0) goto L_0x01f2
            java.util.ArrayList<nb2.d> r1 = r0.f163270g
            r1.add(r7)
            java.util.ArrayList<nb2.d> r1 = r0.f163270g
            int r3 = r1.size()
            r4 = 2
            if (r3 > r4) goto L_0x018f
            r3 = 1
            goto L_0x0190
        L_0x018f:
            r3 = 0
        L_0x0190:
            if (r3 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r1 = r12
        L_0x0194:
            if (r1 == 0) goto L_0x01c6
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            nb2.d r1 = (nb2.C61646d) r1
            if (r1 == 0) goto L_0x01c6
            hb2.f r3 = r1.f175298d
            boolean r3 = r3.f170770r
            if (r3 == 0) goto L_0x01a5
            r12 = r1
        L_0x01a5:
            if (r12 == 0) goto L_0x01c6
            java.lang.String r1 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notifyItemChanged3:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r16.mo80454j3()
            r7 = 0
            r1.notifyItemChanged(r7, r2)
        L_0x01c6:
            java.lang.String r1 = r0.f163267d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notifyItemInserted4:"
            r2.append(r3)
            java.util.ArrayList<nb2.d> r3 = r0.f163270g
            int r3 = r3.size()
            int r3 = r3 - r13
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r16.mo80454j3()
            java.util.ArrayList<nb2.d> r2 = r0.f163270g
            int r2 = r2.size()
            int r2 = r2 - r13
            r1.notifyItemInserted(r2)
        L_0x01f2:
            r4 = r6
            goto L_0x01fc
        L_0x01f4:
            r7 = 0
            r6 = r8
            goto L_0x00d0
        L_0x01f8:
            sx3.C64197v.m75542k()
            throw r12
        L_0x01fc:
            if (r4 < 0) goto L_0x0203
            java.util.ArrayList<nb2.d> r0 = r0.f163271h
            r0.remove(r4)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65710e3(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC, te3.jm0, int):void");
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [m03.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65711f3(com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC r14, int r15) {
        /*
            java.lang.Class<te3.w23> r0 = te3.C64793w23.class
            java.lang.Class<ox.b> r1 = p640ox.C77049b.class
            if (r15 >= 0) goto L_0x001f
            java.lang.String r14 = r14.f163267d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshVideo position error:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r15)
            goto L_0x02ee
        L_0x001f:
            java.util.ArrayList<nb2.d> r2 = r14.f163270g
            java.lang.Object r2 = r2.get(r15)
            nb2.d r2 = (nb2.C61646d) r2
            hb2.f r2 = r2.f175298d
            java.util.LinkedList<te3.mb1> r2 = r2.f170759g
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0061
            java.util.ArrayList<nb2.d> r2 = r14.f163270g
            java.lang.Object r2 = r2.get(r15)
            nb2.d r2 = (nb2.C61646d) r2
            hb2.f r2 = r2.f175298d
            java.util.LinkedList<te3.mb1> r2 = r2.f170760h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0061
            java.lang.String r14 = r14.f163267d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshVideo "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = " trackDataList empty"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            goto L_0x02ee
        L_0x0061:
            hb2.f$a r2 = hb2.C59822f.f170752A
            java.util.ArrayList<nb2.d> r3 = r14.f163270g
            java.lang.Object r3 = r3.get(r15)
            nb2.d r3 = (nb2.C61646d) r3
            hb2.f r3 = r3.f175298d
            boolean r2 = r2.mo84780e(r3)
            if (r2 != 0) goto L_0x00a4
            java.util.ArrayList<nb2.d> r2 = r14.f163270g
            java.lang.Object r2 = r2.get(r15)
            nb2.d r2 = (nb2.C61646d) r2
            hb2.f r2 = r2.f175298d
            java.lang.Long r2 = r2.f170753a
            if (r2 == 0) goto L_0x009a
            java.util.ArrayList<nb2.d> r2 = r14.f163270g
            java.lang.Object r2 = r2.get(r15)
            nb2.d r2 = (nb2.C61646d) r2
            hb2.f r2 = r2.f175298d
            java.lang.Long r2 = r2.f170753a
            r3 = 0
            if (r2 != 0) goto L_0x0092
            goto L_0x00a4
        L_0x0092:
            long r5 = r2.longValue()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00a4
        L_0x009a:
            java.lang.String r14 = r14.f163267d
            java.lang.String r15 = "no mv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            goto L_0x02ee
        L_0x00a4:
            di3.d r2 = di3.C86312j.m106911c(r1)
            ox.b r2 = (p640ox.C77049b) r2
            android.app.Activity r3 = r14.getContext()
            r4 = 7
            pe3.a r2 = r2.Wi0(r3, r4, r0)
            te3.w23 r2 = (te3.C64793w23) r2
            r3 = 2
            if (r2 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r2.f186039j = r3
        L_0x00bb:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ox.b r1 = (p640ox.C77049b) r1
            androidx.appcompat.app.AppCompatActivity r2 = r14.getActivity()
            pe3.a r0 = r1.Wi0(r2, r4, r0)
            te3.w23 r0 = (te3.C64793w23) r0
            if (r0 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r0.f186040n = r3
        L_0x00d0:
            java.lang.String r0 = r14.f163267d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshVideo, position:"
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = ", lastPos:"
            r1.append(r2)
            int r2 = r14.f163275o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r14.mo80452g3()
            java.lang.String r0 = r14.f163267d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshVideo, videoLayout.parent:"
            r1.append(r2)
            m03.c r2 = r14.f163276p
            boolean r3 = r2 instanceof android.view.View
            r4 = 0
            if (r3 == 0) goto L_0x010b
            android.view.View r2 = (android.view.View) r2
            goto L_0x010c
        L_0x010b:
            r2 = r4
        L_0x010c:
            if (r2 == 0) goto L_0x0113
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x0114
        L_0x0113:
            r2 = r4
        L_0x0114:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r0 = r14.f163275o
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            r2 = 1
            r3 = 0
            if (r0 == r15) goto L_0x01af
            if (r0 < 0) goto L_0x01af
            hb2.s r0 = r14.f163282v
            if (r0 != 0) goto L_0x012e
            goto L_0x0135
        L_0x012e:
            m03.c r0 = r14.f163276p
            if (r0 == 0) goto L_0x0135
            r0.getCurrentPositionMs()
        L_0x0135:
            la2.n r0 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r0 = r0.mo138822a()
            boolean r0 = r0.mo32206f()
            r0 = r0 ^ r2
            java.lang.String r5 = r14.f163267d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "recycle last video, isVideoPause:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r8 = ", videoLayout.parent:"
            r6.append(r8)
            m03.c r8 = r14.f163276p
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x0160
            android.view.View r8 = (android.view.View) r8
            goto L_0x0161
        L_0x0160:
            r8 = r4
        L_0x0161:
            if (r8 == 0) goto L_0x0168
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x0169
        L_0x0168:
            r8 = r4
        L_0x0169:
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            m03.c r5 = r14.f163276p
            if (r5 == 0) goto L_0x017a
            r5.pause()
        L_0x017a:
            m03.c r5 = r14.f163276p
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L_0x0183
            android.view.View r5 = (android.view.View) r5
            goto L_0x0184
        L_0x0183:
            r5 = r4
        L_0x0184:
            if (r5 == 0) goto L_0x018b
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x018c
        L_0x018b:
            r5 = r4
        L_0x018c:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x019a
            m03.c r6 = r14.f163276p
            gy3.C87412m.m108592e(r6, r1)
            android.view.View r6 = (android.view.View) r6
            r5.removeView(r6)
        L_0x019a:
            java.lang.String r5 = r14.f163267d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r14.f163269f
            if (r5 == 0) goto L_0x01b9
            androidx.recyclerview.widget.RecyclerView$z r5 = r5.mo17023I0(r15)
            goto L_0x01ba
        L_0x01b9:
            r5 = r4
        L_0x01ba:
            if (r5 == 0) goto L_0x02ee
            android.view.View r5 = r5.f44854d
            r6 = 2131316141(0x7f094dad, float:1.8250755E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            m03.c r6 = r14.f163276p
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L_0x01d0
            android.view.View r6 = (android.view.View) r6
            goto L_0x01d1
        L_0x01d0:
            r6 = r4
        L_0x01d1:
            if (r6 == 0) goto L_0x01d8
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x01d9
        L_0x01d8:
            r6 = r4
        L_0x01d9:
            if (r6 != 0) goto L_0x0250
            m03.c r6 = r14.f163276p
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L_0x01e4
            android.view.View r6 = (android.view.View) r6
            goto L_0x01e5
        L_0x01e4:
            r6 = r4
        L_0x01e5:
            if (r6 != 0) goto L_0x01e8
            goto L_0x01ee
        L_0x01e8:
            r7 = 2131309855(0x7f09351f, float:1.8238006E38)
            r6.setId(r7)
        L_0x01ee:
            java.lang.String r6 = r14.f163267d
            java.lang.String r7 = "refreshVideo add videoLayout to current videoContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            m03.c r6 = r14.f163276p
            gy3.C87412m.m108592e(r6, r1)
            android.view.View r6 = (android.view.View) r6
            r5.addView(r6)
            m03.c r1 = r14.f163276p
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L_0x0209
            android.view.View r1 = (android.view.View) r1
            goto L_0x020a
        L_0x0209:
            r1 = r4
        L_0x020a:
            if (r1 != 0) goto L_0x020d
            goto L_0x0250
        L_0x020d:
            r5 = 0
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC"
            java.lang.String r8 = "refreshVideo"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setAlpha"
            java.lang.String r12 = "(F)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r13.mo10231a(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r6 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC"
            java.lang.String r7 = "refreshVideo"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0250:
            int r1 = r14.f163275o
            if (r1 < 0) goto L_0x0273
            hb2.q r1 = hb2.C59833q.f170832a
            androidx.appcompat.app.AppCompatActivity r3 = r14.getActivity()
            java.util.ArrayList<nb2.d> r5 = r14.f163270g
            int r6 = r14.f163275o
            java.lang.Object r5 = r5.get(r6)
            nb2.d r5 = (nb2.C61646d) r5
            hb2.f r5 = r5.f175298d
            m03.c r6 = r14.f163276p
            if (r6 == 0) goto L_0x026f
            i03.c r6 = r6.getReportInfo()
            goto L_0x0270
        L_0x026f:
            r6 = r4
        L_0x0270:
            r1.mo84800l(r3, r5, r6)
        L_0x0273:
            java.lang.String r1 = r14.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "refreshVideo current music position:"
            r3.append(r5)
            la2.n r5 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r5 = r5.mo138822a()
            int r5 = r5.getPlayPosition()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.util.ArrayList<nb2.d> r1 = r14.f163270g
            java.lang.Object r15 = r1.get(r15)
            nb2.d r15 = (nb2.C61646d) r15
            hb2.f r15 = r15.f175298d
            m03.c r1 = r14.f163276p
            if (r1 == 0) goto L_0x02ab
            java.util.LinkedList r3 = r15.mo84775a()
            r1.setMediaList(r3)
        L_0x02ab:
            m03.c r1 = r14.f163276p
            if (r1 != 0) goto L_0x02b0
            goto L_0x02b8
        L_0x02b0:
            sb2.q r3 = new sb2.q
            r3.<init>(r14)
            r1.setFirstFrameRenderCallback(r3)
        L_0x02b8:
            m03.c r1 = r14.f163276p
            if (r1 != 0) goto L_0x02bd
            goto L_0x02c5
        L_0x02bd:
            sb2.r r3 = new sb2.r
            r3.<init>(r15)
            r1.setPlayStatusChangeListener(r3)
        L_0x02c5:
            m03.c r15 = r14.f163276p
            if (r15 == 0) goto L_0x02cc
            r15.start()
        L_0x02cc:
            la2.n r15 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r15 = r15.mo138822a()
            r15.getPlayPosition()
            m03.c r15 = r14.f163276p
            if (r15 != 0) goto L_0x02dc
            goto L_0x02df
        L_0x02dc:
            r15.setPauseOnVideoPlay(r0)
        L_0x02df:
            m03.c r14 = r14.f163276p
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto L_0x02e8
            r4 = r14
            android.view.View r4 = (android.view.View) r4
        L_0x02e8:
            if (r4 != 0) goto L_0x02eb
            goto L_0x02ee
        L_0x02eb:
            r4.setKeepScreenOn(r2)
        L_0x02ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.m65711f3(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC, int):void");
    }

    /* renamed from: F3 */
    public final void mo80447F3(int i) {
        C59822f fVar;
        Log.m105927v(this.f163267d, "alvinluo resetStatData position: %s", Integer.valueOf(i));
        C61646d dVar = (C61646d) C110818d0.m150917O(this.f163270g, i);
        if (dVar != null && (fVar = dVar.f175298d) != null) {
            fVar.f170775w = 0;
            fVar.f170776x = 0;
        }
    }

    /* renamed from: G3 */
    public final void mo80448G3(int i) {
        int i2 = i;
        if (i2 != this.f163274n.f187878m) {
            String str = this.f163267d;
            Log.m105924i(str, "scrollMvToPosition:" + i2 + ", snapPosition:" + this.f163274n.f187878m + ", dataList.size:" + this.f163270g.size());
            this.f163279s.f165720w = true;
            if (i2 > this.f163274n.f187878m) {
                WxRecyclerView wxRecyclerView = this.f163269f;
                if (wxRecyclerView != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2 - 1));
                    WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                    C117292a.m165358d(wxRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    wxRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                }
            } else {
                WxRecyclerView wxRecyclerView3 = this.f163269f;
                if (wxRecyclerView3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2 + 1));
                    WxRecyclerView wxRecyclerView4 = wxRecyclerView3;
                    C117292a.m165358d(wxRecyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    wxRecyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(wxRecyclerView4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "scrollMvToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
            WxRecyclerView wxRecyclerView5 = this.f163269f;
            if (wxRecyclerView5 != null) {
                wxRecyclerView5.post(new C57038p(this, i2));
            }
        }
    }

    /* renamed from: I3 */
    public final void mo80449I3(C59822f fVar) {
        C87412m.m108594g(fVar, "musicMv");
        int duration = C99364n.m129616h().mo138822a().getDuration();
        if (duration != 0) {
            this.f163261D.dead();
            C64488kb1 kb12 = ((C63756e) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63756e.class)).f180744i;
            kb12.f183918u = duration;
            String str = this.f163267d;
            Log.m105924i(str, "syncBeatTrack songId:" + kb12.f183909i + " songName:" + kb12.f183904d + " singer:" + kb12.f183905e + " musicTotalDuration:" + duration);
            C86709a0.m107524d().mo123460f(new C60791k(kb12, duration, fVar.hashCode(), getActivity().hashCode()));
            return;
        }
        Log.m105924i(this.f163267d, "wait song start");
        this.f163261D.alive();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01fa  */
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80450J3() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<sb2.e> r0 = sb2.C63756e.class
            la2.n r2 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r2 = r2.mo138822a()
            int r2 = r2.getDuration()
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r18.getActivity()
            bl3.r$a r4 = r3.mo62444c(r4)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r0)
            sb2.e r4 = (sb2.C63756e) r4
            te3.kb1 r4 = r4.f180744i
            androidx.appcompat.app.AppCompatActivity r5 = r18.getActivity()
            bl3.r$a r3 = r3.mo62444c(r5)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r0)
            sb2.e r3 = (sb2.C63756e) r3
            boolean r3 = r3.f180746n
            if (r2 <= 0) goto L_0x025f
            if (r3 == 0) goto L_0x025f
            r4.f183918u = r2
            java.lang.String r2 = r1.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getMusicListenIds songId:"
            r3.append(r5)
            java.lang.String r5 = r4.f183909i
            r3.append(r5)
            java.lang.String r5 = " appId:"
            r3.append(r5)
            java.lang.String r5 = r4.f183907g
            r3.append(r5)
            java.lang.String r5 = " webUrl:"
            r3.append(r5)
            java.lang.String r5 = r4.f183908h
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.f183904d
            r2.append(r3)
            r3 = 95
            r2.append(r3)
            java.lang.String r5 = r4.f183905e
            r2.append(r5)
            r2.append(r3)
            java.lang.String r5 = r4.f183907g
            r2.append(r5)
            r2.append(r3)
            int r3 = r4.f183918u
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.nio.charset.Charset r3 = z04.C119027c.f356488a
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r5)
            r5 = 2
            byte[] r2 = android.util.Base64.encode(r2, r5)
            java.lang.String r5 = "encode(\"${songInfo.songN…s.UTF_8), Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2, r3)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r5)
            java.lang.String r3 = r1.f163267d
            java.lang.String r5 = "getMusicListenIds cacheKey:%s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
            hb2.i r3 = hb2.C32799i.f89226a
            java.lang.String r5 = "cacheKey"
            gy3.C87412m.m108593f(r2, r5)
            r3.getClass()
            boolean r5 = hb2.C32799i.f89227b
            if (r5 != 0) goto L_0x00c8
            goto L_0x01b1
        L_0x00c8:
            java.lang.String r5 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "tryGetLyricCache, key:"
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.HashMap<hb2.n, hb2.m> r5 = hb2.C32799i.f89230e
            hb2.n r11 = new hb2.n
            r11.<init>(r2)
            java.lang.Object r11 = r5.get(r11)
            hb2.m r11 = (hb2.C32801m) r11
            if (r11 == 0) goto L_0x01a9
            long r12 = r11.f89234b
            long r12 = r9 - r12
            r14 = 43200000(0x2932e00, double:2.1343636E-316)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0109
            java.lang.String r3 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.String r5 = "tryGetLyricCache success from cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            java.lang.String r3 = r11.f89233a
            goto L_0x019e
        L_0x0109:
            java.lang.String r11 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.String r12 = "tryGetLyricCache failed timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            monitor-enter(r3)
            java.lang.String r11 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r12.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r13 = "evictLyricTimeoutCache, timestamp:"
            r12.append(r13)     // Catch:{ all -> 0x01a6 }
            r12.append(r9)     // Catch:{ all -> 0x01a6 }
            java.lang.String r13 = ", lyricsCache.size:"
            r12.append(r13)     // Catch:{ all -> 0x01a6 }
            int r13 = r5.size()     // Catch:{ all -> 0x01a6 }
            r12.append(r13)     // Catch:{ all -> 0x01a6 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x01a6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r11.<init>()     // Catch:{ all -> 0x01a6 }
            monitor-enter(r5)     // Catch:{ all -> 0x01a6 }
            java.util.Set r12 = r5.entrySet()     // Catch:{ all -> 0x01a3 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x01a3 }
        L_0x0142:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x01a3 }
            if (r13 == 0) goto L_0x0167
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x01a3 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x01a3 }
            java.lang.Object r16 = r13.getValue()     // Catch:{ all -> 0x01a3 }
            r7 = r16
            hb2.m r7 = (hb2.C32801m) r7     // Catch:{ all -> 0x01a3 }
            long r6 = r7.f89234b     // Catch:{ all -> 0x01a3 }
            long r6 = r9 - r6
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0165
            java.lang.Object r6 = r13.getKey()     // Catch:{ all -> 0x01a3 }
            r11.add(r6)     // Catch:{ all -> 0x01a3 }
        L_0x0165:
            r6 = 1
            goto L_0x0142
        L_0x0167:
            monitor-exit(r5)     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x016c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x017e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01a6 }
            hb2.n r6 = (hb2.C8507n) r6     // Catch:{ all -> 0x01a6 }
            java.util.HashMap<hb2.n, hb2.m> r7 = hb2.C32799i.f89230e     // Catch:{ all -> 0x01a6 }
            r7.remove(r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x016c
        L_0x017e:
            java.lang.String r5 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r6.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "finished evictLyricTimeoutCache, lyricsCache.size:"
            r6.append(r7)     // Catch:{ all -> 0x01a6 }
            java.util.HashMap<hb2.n, hb2.m> r7 = hb2.C32799i.f89230e     // Catch:{ all -> 0x01a6 }
            int r7 = r7.size()     // Catch:{ all -> 0x01a6 }
            r6.append(r7)     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x01a6 }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01a6 }
            monitor-exit(r3)
            r3 = 0
        L_0x019e:
            if (r3 != 0) goto L_0x01a1
            goto L_0x01a9
        L_0x01a1:
            r7 = r3
            goto L_0x01b2
        L_0x01a3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01a9:
            java.lang.String r3 = "MicroMsg.Mv.MusicMvCgiRetCache"
            java.lang.String r5 = "tryGetLyricCache not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            if (r7 == 0) goto L_0x01fa
            java.lang.String r2 = r1.f163267d
            java.lang.String r3 = "get Music lyric hit cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            bl3.r$a r3 = r2.mo62444c(r3)
            androidx.lifecycle.i0 r0 = r3.mo75002a(r0)
            java.lang.String r3 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r0, r3)
            sb2.e r0 = (sb2.C63756e) r0
            te3.kb1 r3 = r0.f180744i
            r3.f183910j = r7
            r0.f180746n = r8
            java.lang.String r3 = r1.f163267d
            java.lang.String r4 = "parse lyric cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r0.mo88573g3()
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            bl3.r$a r2 = r2.mo62444c(r3)
            java.lang.Class<sb2.o> r3 = sb2.C63816o.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            sb2.o r2 = (sb2.C63816o) r2
            te3.kb1 r3 = r0.f180744i
            ma2.s r0 = r0.f180745j
            r4 = 1
            r2.mo88612k3(r3, r0, r4)
            goto L_0x025f
        L_0x01fa:
            java.lang.String r0 = r1.f163267d
            java.lang.String r3 = "do getMusicListenIds"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            ue3.g r0 = new ue3.g
            r0.<init>()
            java.lang.String r3 = r4.f183904d
            r0.f188072d = r3
            java.lang.String r3 = r4.f183905e
            r0.f188073e = r3
            java.lang.String r3 = r4.f183906f
            r0.f188074f = r3
            java.lang.String r3 = r4.f183907g
            r0.f188075g = r3
            java.lang.String r3 = r4.f183908h
            r0.f188076h = r3
            java.lang.String r3 = r4.f183909i
            r0.f188077i = r3
            java.lang.String r3 = r4.f183910j
            r0.f188078j = r3
            java.lang.String r3 = r4.f183911n
            r0.f188079n = r3
            java.lang.String r3 = r4.f183912o
            r0.f188080o = r3
            java.lang.String r3 = r4.f183913p
            r0.f188081p = r3
            java.lang.String r3 = r4.f183914q
            r0.f188082q = r3
            long r5 = r4.f183915r
            r0.f188083r = r5
            java.lang.String r3 = r4.f183916s
            r0.f188084s = r3
            java.lang.String r3 = r4.f183917t
            r0.f188085t = r3
            int r3 = r4.f183918u
            r0.f188086u = r3
            java.lang.String r3 = ""
            r0.f188087v = r3
            java.lang.String r4 = r4.f183922y
            r0.f188088w = r4
            r4 = 1
            r0.f188089x = r4
            r0.f188090y = r4
            r0.f188091z = r3
            r0.f188063A = r3
            ob0.b0 r3 = f40.C86709a0.m107524d()
            jb2.f r5 = new jb2.f
            r5.<init>(r0, r4, r4, r2)
            r3.mo123460f(r5)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.mo80450J3():void");
    }

    /* renamed from: K3 */
    public final void mo80451K3(int i) {
        C59822f fVar;
        Class cls = C59326j.class;
        Log.m105927v(this.f163267d, "alvinluo updateFloatBallMvInfo position: %s", Integer.valueOf(i));
        C59326j jVar = (C59326j) C86312j.m106911c(cls);
        Intent intent = getActivity().getIntent();
        jVar.mo84429HI(intent != null ? intent.getExtras() : null);
        C61646d dVar = (C61646d) C110818d0.m150917O(this.f163270g, i);
        if (dVar != null && (fVar = dVar.f175298d) != null) {
            C59326j jVar2 = (C59326j) C86312j.m106911c(cls);
            C64719t23 t232 = new C64719t23();
            if (!fVar.f170778z) {
                Long l = fVar.f170755c;
                t232.f185459d = C61926c.m72691p(l != null ? l.longValue() : 0);
                t232.f185460e = fVar.f170756d;
                t232.f185461f = fVar.f170757e;
                t232.f185462g = fVar.f170758f;
            }
            jVar2.mo84432pg(t232);
        }
    }

    /* renamed from: g3 */
    public final void mo80452g3() {
        if (this.f163276p == null) {
            C61426c Nu0 = ((C58467i) C86312j.m106911c(C58467i.class)).Nu0(getActivity());
            this.f163276p = Nu0;
            if (Nu0 != null) {
                Nu0.setMvMusicProxy(new C57015b());
            }
            C61426c cVar = this.f163276p;
            View view = cVar instanceof View ? (View) cVar : null;
            if (view != null) {
                view.setId(C0966R.C0970id.h7c);
            }
        }
        C61426c cVar2 = this.f163276p;
        if (cVar2 != null) {
            cVar2.setMediaChangeListener(((C63807m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63807m.class)).f180882h);
        }
    }

    /* renamed from: i3 */
    public final int mo80453i3(C64488kb1 kb12, C44580q1 q1Var) {
        C87412m.m108594g(kb12, "songInfo");
        Log.m105924i(this.f163267d, "doJumpToApp: ");
        this.f163278r = true;
        C101106m k = C99364n.m129616h().mo138832k();
        if (k != null) {
            return ((C59330q) C86312j.m106911c(C59330q.class)).mo84436LI(getContext(), k, kb12, q1Var);
        }
        return -1;
    }

    /* renamed from: j3 */
    public final WxRecyclerAdapter<C61646d> mo80454j3() {
        return (WxRecyclerAdapter) ((C36570n) this.f163272i).getValue();
    }

    /* renamed from: k3 */
    public final void mo80455k3(long j, String str, C59822f fVar) {
        C34379c<?> cVar;
        C87412m.m108594g(str, "mvNonceId");
        C87412m.m108594g(fVar, "musicMv");
        String str2 = this.f163267d;
        Log.m105924i(str2, "getMvDetailInfo mvObjectId:" + j + " mvNonceId:" + str + " localId:" + fVar.f170753a);
        C50008jm0 c = C32799i.f89226a.mo58808c(j, str);
        if (c != null) {
            Log.m105924i(this.f163267d, "getMvDetailInfo hit cache");
            cVar = ((C119157j) C119157j.f356862d).mo183895z(new C57020d(this, c, fVar));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            C86709a0.m107524d().mo123460f(new C46463n(j, str, fVar.hashCode(), getActivity().hashCode()));
        }
    }

    /* renamed from: l3 */
    public final void mo80456l3() {
        if (!this.f163263F || !this.f163264G) {
            Log.m105920e(this.f163267d, "con is not satisfy, don't do getUniInfo");
            return;
        }
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        boolean z = true;
        if (!(eVar.f180729A.length() == 0)) {
            if (eVar.f180730B.length() != 0) {
                z = false;
            }
            if (!z) {
                Log.m105924i(this.f163267d, "getUniInfo");
                C86709a0.m107524d().mo123460f(new C46459g(eVar.f180729A, eVar.f180730B, getActivity().hashCode()));
                return;
            }
        }
        mo80454j3().notifyItemChanged(0, "NotPermittedSong");
        Log.m105920e(this.f163267d, "NotPermittedSong");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80457m3(te3.C48799b23 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleGetMvRecommendListResponse dataList:"
            r3.append(r4)
            java.util.ArrayList<nb2.d> r4 = r0.f163270g
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.LinkedList<java.lang.Boolean> r2 = r1.f130915q
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r18.getActivity()
            bl3.r$a r3 = r3.mo62444c(r4)
            java.lang.Class<sb2.e> r4 = sb2.C63756e.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            sb2.e r3 = (sb2.C63756e) r3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r1.f130905d
            int r5 = r4.size()
            r6 = 0
            r7 = 1
            if (r5 <= 0) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            r8 = 0
            if (r5 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = r8
        L_0x004b:
            if (r4 == 0) goto L_0x01ef
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r9 = 0
        L_0x0053:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x01ec
            java.lang.Object r10 = r4.next()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
            java.util.ArrayList<nb2.d> r11 = r0.f163270g
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            nb2.d r11 = (nb2.C61646d) r11
            if (r11 == 0) goto L_0x007e
            hb2.f r11 = r11.f175298d
            if (r11 == 0) goto L_0x007e
            java.lang.Long r11 = r11.f170755c
            long r12 = r10.f164794id
            if (r11 != 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x007e
            r11 = 1
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            int r12 = r9 + 1
            if (r11 != 0) goto L_0x01e9
            hb2.f r11 = new hb2.f
            r11.<init>()
            hb2.f$a r13 = hb2.C59822f.f170752A
            java.lang.String r14 = "it"
            gy3.C87412m.m108593f(r10, r14)
            r13.mo84777b(r10, r11)
            int r13 = r2.size()
            if (r13 <= 0) goto L_0x00b4
            int r13 = r2.size()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r14 = r1.f130905d
            int r14 = r14.size()
            if (r13 != r14) goto L_0x00b4
            java.lang.Object r13 = r2.get(r9)
            java.lang.String r14 = "isMvWithBeatList[nowIndex]"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            goto L_0x00b5
        L_0x00b4:
            r13 = 0
        L_0x00b5:
            if (r13 == 0) goto L_0x01c9
            nb2.d r5 = new nb2.d
            r5.<init>(r11)
            r11.f170778z = r13
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            r11.add(r10)
            hb2.f r10 = r5.f175298d
            r10.getClass()
            r10.f170767o = r11
            java.util.ArrayList<nb2.d> r10 = r0.f163270g
            int r11 = r10.size()
            if (r11 != r7) goto L_0x00d7
            r11 = 1
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            if (r11 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r10 = r8
        L_0x00dc:
            java.lang.String r11 = "notifyItemChanged2"
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = sx3.C110818d0.m150914L(r10)
            nb2.d r10 = (nb2.C61646d) r10
            if (r10 == 0) goto L_0x0151
            hb2.f r10 = r10.f175298d
            if (r10 == 0) goto L_0x0151
            hb2.f r13 = r3.f180743h
            boolean r13 = gy3.C87412m.m108589b(r10, r13)
            if (r13 == 0) goto L_0x0119
            hb2.f r13 = r3.f180743h
            java.lang.Long r13 = r13.f170755c
            r14 = 0
            if (r13 == 0) goto L_0x0108
            if (r13 != 0) goto L_0x0100
            goto L_0x0119
        L_0x0100:
            long r16 = r13.longValue()
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0119
        L_0x0108:
            java.lang.Long r13 = r10.f170753a
            if (r13 == 0) goto L_0x0117
            if (r13 != 0) goto L_0x010f
            goto L_0x0119
        L_0x010f:
            long r16 = r13.longValue()
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0119
        L_0x0117:
            r13 = 1
            goto L_0x011a
        L_0x0119:
            r13 = 0
        L_0x011a:
            if (r13 == 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r10 = r8
        L_0x011e:
            if (r10 == 0) goto L_0x0151
            java.util.ArrayList<nb2.d> r13 = r0.f163270g
            r13.clear()
            hb2.f r13 = r5.f175298d
            boolean r10 = r10.f170771s
            r13.f170771s = r10
            java.util.ArrayList<nb2.d> r10 = r0.f163270g
            r10.add(r5)
            java.lang.String r10 = r0.f163267d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "notifyItemChanged2:"
            r13.append(r14)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r10 = r18.mo80454j3()
            r10.notifyItemChanged(r6, r11)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x0152
        L_0x0151:
            r10 = r8
        L_0x0152:
            if (r10 != 0) goto L_0x01c7
            java.util.ArrayList<nb2.d> r10 = r0.f163270g
            r10.add(r5)
            java.util.ArrayList<nb2.d> r5 = r0.f163270g
            int r10 = r5.size()
            r13 = 2
            if (r10 > r13) goto L_0x0164
            r10 = 1
            goto L_0x0165
        L_0x0164:
            r10 = 0
        L_0x0165:
            if (r10 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r5 = r8
        L_0x0169:
            if (r5 == 0) goto L_0x019b
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            nb2.d r5 = (nb2.C61646d) r5
            if (r5 == 0) goto L_0x019b
            hb2.f r10 = r5.f175298d
            boolean r10 = r10.f170770r
            if (r10 == 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r5 = r8
        L_0x017b:
            if (r5 == 0) goto L_0x019b
            java.lang.String r5 = r0.f163267d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "notifyItemChanged3:"
            r10.append(r13)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r18.mo80454j3()
            r5.notifyItemChanged(r6, r11)
        L_0x019b:
            java.lang.String r5 = r0.f163267d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "notifyItemInserted4:"
            r9.append(r10)
            java.util.ArrayList<nb2.d> r10 = r0.f163270g
            int r10 = r10.size()
            int r10 = r10 - r7
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r18.mo80454j3()
            java.util.ArrayList<nb2.d> r9 = r0.f163270g
            int r9 = r9.size()
            int r9 = r9 - r7
            r5.notifyItemInserted(r9)
        L_0x01c7:
            r5 = 1
            goto L_0x01e9
        L_0x01c9:
            java.util.ArrayList<nb2.d> r9 = r0.f163271h
            nb2.d r10 = new nb2.d
            r10.<init>(r11)
            r9.add(r10)
            java.lang.Long r9 = r11.f170755c
            java.lang.String r10 = r11.f170756d
            if (r9 == 0) goto L_0x01e9
            if (r10 == 0) goto L_0x01e9
            long r13 = r9.longValue()
            java.lang.String r9 = r0.f163267d
            java.lang.String r15 = "handleGetMvRecommendListResponse do getMvDetailInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r15)
            r0.mo80455k3(r13, r10, r11)
        L_0x01e9:
            r9 = r12
            goto L_0x0053
        L_0x01ec:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x01f0
        L_0x01ef:
            r5 = 0
        L_0x01f0:
            if (r8 != 0) goto L_0x0226
            boolean r2 = r0.f163280t
            if (r2 == 0) goto L_0x0221
            java.lang.String r2 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get mv list notify, dataList.size:"
            r3.append(r4)
            java.util.ArrayList<nb2.d> r4 = r0.f163270g
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = r18.mo80454j3()
            java.util.ArrayList<nb2.d> r3 = r0.f163270g
            int r3 = r3.size()
            java.lang.String r4 = "handleGetMvRecommendListResponse"
            r2.notifyItemRangeChanged(r6, r3, r4)
        L_0x0221:
            r0.f163264G = r7
            r18.mo80456l3()
        L_0x0226:
            if (r5 == 0) goto L_0x022d
            r0.f163264G = r7
            r18.mo80456l3()
        L_0x022d:
            java.util.LinkedList<java.lang.Boolean> r2 = r1.f130915q
            java.lang.String r3 = "resp.is_mv_with_beat"
            gy3.C87412m.m108593f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0239:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0251
            java.lang.Object r3 = r2.next()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r4 = r0.f163267d
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r6] = r3
            java.lang.String r3 = "is_mv_with_beat:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r5)
            goto L_0x0239
        L_0x0251:
            java.lang.String r2 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get mv recommend is_mv_with_beat list "
            r3.append(r4)
            java.util.LinkedList<java.lang.Boolean> r4 = r1.f130915q
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.String r2 = r0.f163267d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get mv recommend list "
            r3.append(r4)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r1.f130905d
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.mo80457m3(te3.b23):void");
    }

    /* renamed from: n3 */
    public final void mo80458n3(int i) {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C61646d dVar = (C61646d) C110818d0.m150917O(this.f163270g, this.f163275o);
        if (dVar != null) {
            C59833q.f170832a.mo84794e(getContext(), eVar.f180744i, dVar.f175298d);
        }
        mo80459o3(eVar);
    }

    /* renamed from: o3 */
    public final void mo80459o3(C63756e eVar) {
        C61646d dVar;
        String str;
        String str2;
        FinderObjectDesc finderObjectDesc;
        C59836s sVar = this.f163282v;
        if (sVar != null && (dVar = (C61646d) C110818d0.m150917O(this.f163270g, this.f163275o)) != null) {
            C59833q qVar = C59833q.f170832a;
            Activity context = getContext();
            C64488kb1 kb12 = eVar.f180744i;
            C59822f fVar = dVar.f175298d;
            qVar.getClass();
            C87412m.m108594g(context, "context");
            C87412m.m108594g(kb12, "songInfo");
            C87412m.m108594g(fVar, "musicMv");
            db4 db4 = new db4();
            Long l = fVar.f170755c;
            db4.f182676d = l != null ? l.longValue() : 0;
            db4.f182680h = fVar.f170756d;
            db4.f182678f = new op4();
            db4.f182679g = new C64441i93();
            FinderObject finderObject = fVar.f170769q;
            db4.f182689t = (finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null) ? 0 : finderObjectDesc.mediaType;
            String str3 = "";
            if ((finderObject == null || (str = finderObject.username) == null) && (str = C66785b.f191882e.mo90662O5()) == null) {
                str = str3;
            }
            db4.f182681i = str;
            long j = sVar.f170840b;
            db4.f182682j = j;
            FinderObject finderObject2 = fVar.f170769q;
            if (!(finderObject2 == null || (str2 = finderObject2.sessionBuffer) == null)) {
                str3 = str2;
            }
            db4.f182684o = str3;
            db4.f182692w = j;
            long c = C31543z5.m39453c();
            op4 op4 = db4.f182678f;
            if (op4 != null) {
                op4.f184687d = kb12.f183918u;
                long j2 = sVar.f170840b;
                long j3 = c - j2;
                op4.f184688e = (int) (j3 / ((long) 1000));
                op4.f184689f = j3;
                long j4 = fVar.f170775w;
                op4.f184690g = j4;
                op4.f184691h = j4;
                op4.f184692i = j3;
                op4.f184693j = j2;
                op4.f184694n = c;
                op4.f184696p = fVar.f170776x;
            }
            C64441i93 i932 = db4.f182679g;
            if (i932 != null) {
                i932.f183650e = sVar.f170842d;
                i932.f183651f = op4 != null ? op4.f184688e : 0;
                i932.f183663u = sVar.f170841c;
                i932.f183652g = sVar.f170843e;
            }
            Log.m105924i("MicroMsg.Mv.MvReportLogic", "print stats: " + db4 + " index:" + sVar.f170839a);
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
            C49712hj1 hj12 = new C49712hj1();
            if (w232 != null) {
                hj12.f134671e = w232.f186034e;
                hj12.f134675i = 91;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(db4);
            C58389m1.f167287a.mo83224a(linkedList, hj12, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        C86709a0.m107524d().mo123455a(6860, this.f163262E);
        C86709a0.m107524d().mo123455a(3763, this.f163262E);
        C86709a0.m107524d().mo123455a(5292, this.f163262E);
        C86709a0.m107524d().mo123455a(5904, this.f163262E);
        C86709a0.m107524d().mo123455a(5286, this.f163262E);
        C86709a0.m107524d().mo123455a(3627, this.f163262E);
        C86709a0.m107524d().mo123455a(6448, this.f163262E);
        C86709a0.m107524d().mo123455a(6473, this.f163262E);
        C86709a0.m107524d().mo123455a(8967, this.f163262E);
        C86709a0.m107524d().mo123455a(8167, this.f163262E);
        C86709a0.m107524d().mo123455a(8141, this.f163262E);
        C86709a0.m107524d().mo123455a(5950, this.f163262E);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12412e(this.f163265H);
        this.f163266I.alive();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<sb2.e> r1 = sb2.C63756e.class
            java.lang.Class<te3.w23> r2 = te3.C64793w23.class
            java.lang.Class<ox.b> r3 = p640ox.C77049b.class
            androidx.appcompat.app.AppCompatActivity r4 = r20.getActivity()
            r5 = 2131312021(0x7f093d95, float:1.8242399E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
            r0.f163269f = r4
            if (r4 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            com.tencent.mm.view.layoutmanager.Flip3DLayoutManager r5 = r0.f163279s
            r4.setLayoutManager(r5)
        L_0x001f:
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r5 = r20.getActivity()
            bl3.r$a r5 = r4.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r1)
            java.lang.String r6 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            sb2.e r5 = (sb2.C63756e) r5
            nb2.d r7 = new nb2.d
            hb2.f r8 = r5.f180743h
            r7.<init>(r8)
            hb2.f r8 = r7.f175298d
            java.lang.String r9 = "musicMv"
            gy3.C87412m.m108594g(r8, r9)
            java.lang.Long r9 = r8.f170753a
            if (r9 == 0) goto L_0x004f
            java.lang.String r8 = r0.f163267d
            java.lang.String r9 = "init local music mv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            goto L_0x00a4
        L_0x004f:
            java.lang.String r9 = r0.f163267d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "fillMusicMvData musicMv.mvObjectId:"
            r10.append(r11)
            java.lang.Long r11 = r8.f170755c
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            boolean r9 = r8.f170778z
            if (r9 == 0) goto L_0x0074
            java.lang.String r9 = r0.f163267d
            java.lang.String r10 = "musicMv is MvWithBeat, don't getMvDetailInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            goto L_0x00a1
        L_0x0074:
            java.lang.Long r9 = r8.f170755c
            if (r9 == 0) goto L_0x00a1
            java.lang.String r10 = r8.f170756d
            if (r10 == 0) goto L_0x00a1
            long r11 = r9.longValue()
            r0.mo80455k3(r11, r10, r8)
            java.lang.String r9 = r0.f163267d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "init finder music mv "
            r13.append(r14)
            r13.append(r11)
            r11 = 32
            r13.append(r11)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
        L_0x00a1:
            r0.mo80449I3(r8)
        L_0x00a4:
            r20.mo80450J3()
            androidx.appcompat.app.AppCompatActivity r8 = r20.getActivity()
            bl3.r$a r8 = r4.mo62444c(r8)
            androidx.lifecycle.i0 r1 = r8.mo75002a(r1)
            gy3.C87412m.m108593f(r1, r6)
            sb2.e r1 = (sb2.C63756e) r1
            java.lang.String r6 = r0.f163267d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "asyncCheckPostPermission songId:"
            r8.append(r9)
            te3.kb1 r9 = r1.f180744i
            java.lang.String r9 = r9.f183909i
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            ob0.b0 r6 = f40.C86709a0.m107524d()
            jb2.i r8 = new jb2.i
            te3.kb1 r1 = r1.f180744i
            androidx.appcompat.app.AppCompatActivity r9 = r20.getActivity()
            int r9 = r9.hashCode()
            r8.<init>(r1, r9)
            r6.mo123460f(r8)
            java.util.ArrayList<nb2.d> r1 = r0.f163270g
            r1.add(r7)
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f163269f
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f9
        L_0x00f2:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r6 = r20.mo80454j3()
            r1.setAdapter(r6)
        L_0x00f9:
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f163269f
            if (r1 == 0) goto L_0x0105
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$e r6 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$e
            r6.<init>(r0)
            r1.mo17092j0(r6)
        L_0x0105:
            ub2.a r1 = r0.f163274n
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$f r6 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$f
            r6.<init>(r0)
            r1.f187880o = r6
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f163269f
            if (r1 == 0) goto L_0x011a
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$g r6 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$g
            r6.<init>(r0)
            r1.post(r6)
        L_0x011a:
            ub2.a r1 = r0.f163274n
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$j r6 = r0.f163259B
            r1.f187879n = r6
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$k r6 = r0.f163260C
            r1.f187881p = r6
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r20.mo80454j3()
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h r6 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$h
            r6.<init>(r0)
            r1.registerAdapterDataObserver(r6)
            te3.kb1 r1 = r5.f180744i
            java.lang.String r6 = r0.f163267d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getSongDetailInfo songId:"
            r8.append(r9)
            java.lang.String r9 = r1.f183909i
            r8.append(r9)
            java.lang.String r9 = " appId:"
            r8.append(r9)
            java.lang.String r9 = r1.f183907g
            r8.append(r9)
            java.lang.String r9 = " webUrl:"
            r8.append(r9)
            java.lang.String r9 = r1.f183908h
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            ob0.b0 r6 = f40.C86709a0.m107524d()
            jb2.r r8 = new jb2.r
            androidx.appcompat.app.AppCompatActivity r9 = r20.getActivity()
            int r9 = r9.hashCode()
            r8.<init>(r1, r9)
            r6.mo123460f(r8)
            java.lang.String r1 = r0.f163267d
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            hb2.f r9 = r7.f175298d
            java.lang.Long r9 = r9.f170755c
            r10 = 0
            r8[r10] = r9
            java.lang.String r9 = "init mv mvObjectId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r8)
            te3.kb1 r13 = r5.f180744i
            hb2.f r1 = r7.f175298d
            java.lang.Long r1 = r1.f170755c
            r7 = 0
            if (r1 == 0) goto L_0x019b
            if (r1 != 0) goto L_0x0190
            goto L_0x0198
        L_0x0190:
            long r11 = r1.longValue()
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x019b
        L_0x0198:
            r16 = 1
            goto L_0x019d
        L_0x019b:
            r16 = 0
        L_0x019d:
            java.lang.String r1 = r0.f163267d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "getMVList songId:"
            r9.append(r11)
            java.lang.String r11 = r13.f183909i
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ox.b r1 = (p640ox.C77049b) r1
            android.app.Activity r9 = r20.getContext()
            r15 = 7
            pe3.a r1 = r1.Wi0(r9, r15, r2)
            r12 = r1
            te3.w23 r12 = (te3.C64793w23) r12
            byte[] r1 = r13.toByteArray()
            r9 = 2
            byte[] r1 = android.util.Base64.encode(r1, r9)
            java.lang.String r9 = "encode(songInfo.toByteArray(), Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r1, r9)
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r9 = z04.C119027c.f356488a
            r14.<init>(r1, r9)
            hb2.i r1 = hb2.C32799i.f89226a
            r1.getClass()
            boolean r9 = hb2.C32799i.f89227b
            if (r9 != 0) goto L_0x01e6
            goto L_0x0241
        L_0x01e6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "tryGetCacheMvRecommendList, songInfoBase64:"
            r9.append(r11)
            int r11 = r14.hashCode()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "MicroMsg.Mv.MusicMvCgiRetCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.HashMap<hb2.l, hb2.k> r9 = hb2.C32799i.f89229d
            hb2.l r15 = new hb2.l
            r15.<init>(r14)
            java.lang.Object r9 = r9.get(r15)
            hb2.k r9 = (hb2.C32800k) r9
            if (r9 == 0) goto L_0x023a
            r15 = r11
            long r10 = r9.f89232b
            long r10 = r7 - r10
            r17 = 180000(0x2bf20, double:8.8932E-319)
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 > 0) goto L_0x022a
            java.lang.String r1 = "tryGetCacheMvRecommendList success from cache"
            r10 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            te3.b23 r1 = r9.f89231a
            goto L_0x0235
        L_0x022a:
            r10 = r15
            java.lang.String r9 = "tryGetCacheMvRecommendList failed timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            r1.mo58806a(r7)
            r1 = 0
        L_0x0235:
            if (r1 != 0) goto L_0x0238
            goto L_0x023b
        L_0x0238:
            r11 = r1
            goto L_0x0242
        L_0x023a:
            r10 = r11
        L_0x023b:
            java.lang.String r1 = "tryGetCacheMvRecommendList not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x0241:
            r11 = 0
        L_0x0242:
            if (r11 == 0) goto L_0x0252
            java.lang.String r1 = r0.f163267d
            java.lang.String r7 = "getMVList hit cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r0.mo80457m3(r11)
            r0.f163281u = r6
            r7 = 7
            goto L_0x0268
        L_0x0252:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            jb2.q r6 = new jb2.q
            androidx.appcompat.app.AppCompatActivity r7 = r20.getActivity()
            int r15 = r7.hashCode()
            r11 = r6
            r7 = 7
            r11.<init>(r12, r13, r14, r15, r16)
            r1.mo123460f(r6)
        L_0x0268:
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            bl3.r$a r1 = r4.mo62444c(r1)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC> r6 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r6)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC) r1
            ub2.a r6 = r0.f163274n
            r1.f163372e = r6
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            bl3.r$a r1 = r4.mo62444c(r1)
            java.lang.Class<sb2.b> r6 = sb2.C63741b.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r6)
            sb2.b r1 = (sb2.C63741b) r1
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$i r6 = new com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$i
            r6.<init>(r0)
            r1.f180692d = r6
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            bl3.r$a r1 = r4.mo62444c(r1)
            java.lang.Class<sb2.o> r4 = sb2.C63816o.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            sb2.o r1 = (sb2.C63816o) r1
            te3.kb1 r4 = r5.f180744i
            ma2.s r5 = r5.f180745j
            r6 = 0
            r1.mo88612k3(r4, r5, r6)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ox.b r1 = (p640ox.C77049b) r1
            android.app.Activity r4 = r20.getContext()
            pe3.a r1 = r1.Wi0(r4, r7, r2)
            te3.w23 r1 = (te3.C64793w23) r1
            if (r1 != 0) goto L_0x02be
            goto L_0x02c4
        L_0x02be:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r1.f186041o = r4
        L_0x02c4:
            di3.d r1 = di3.C86312j.m106911c(r3)
            ox.b r1 = (p640ox.C77049b) r1
            android.app.Activity r3 = r20.getContext()
            pe3.a r1 = r1.Wi0(r3, r7, r2)
            te3.w23 r1 = (te3.C64793w23) r1
            if (r1 != 0) goto L_0x02d7
            goto L_0x02db
        L_0x02d7:
            r2 = 0
            r1.f186042p = r2
        L_0x02db:
            r20.mo80452g3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.onCreateAfter(android.os.Bundle):void");
    }

    public void onDestroy() {
        C59822f fVar;
        Log.m105924i(this.f163267d, "onDestroy");
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12417j(this.f163265H);
        C86709a0.m107524d().mo123470p(6860, this.f163262E);
        C86709a0.m107524d().mo123470p(3763, this.f163262E);
        C86709a0.m107524d().mo123470p(5292, this.f163262E);
        C86709a0.m107524d().mo123470p(5904, this.f163262E);
        C86709a0.m107524d().mo123470p(5286, this.f163262E);
        C86709a0.m107524d().mo123470p(3627, this.f163262E);
        C86709a0.m107524d().mo123470p(6448, this.f163262E);
        C86709a0.m107524d().mo123470p(6473, this.f163262E);
        C86709a0.m107524d().mo123470p(8967, this.f163262E);
        C86709a0.m107524d().mo123470p(8167, this.f163262E);
        C86709a0.m107524d().mo123470p(8141, this.f163262E);
        C86709a0.m107524d().mo123470p(5950, this.f163262E);
        C61426c cVar = this.f163276p;
        if (cVar != null) {
            cVar.release();
        }
        this.f163261D.dead();
        this.f163277q = false;
        this.f163266I.dead();
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C61646d dVar = (C61646d) C110818d0.m150917O(this.f163270g, this.f163275o);
        if (!(dVar == null || (fVar = dVar.f175298d) == null)) {
            C59833q qVar = C59833q.f170832a;
            qVar.mo84794e(getContext(), eVar.f180744i, fVar);
            AppCompatActivity activity = getActivity();
            C61426c cVar2 = this.f163276p;
            qVar.mo84800l(activity, fVar, cVar2 != null ? cVar2.getReportInfo() : null);
        }
        mo80459o3(eVar);
        if (!C101093a.m132481c()) {
            C101093a.m132490l();
        }
    }

    public void onNewIntent(Intent intent) {
        byte[] byteArrayExtra;
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("key_track_data")) != null) {
            C64621p23 p232 = new C64621p23();
            p232.parseFrom(byteArrayExtra);
            C59822f a = C59822f.f170752A.mo84776a(p232);
            FinderItem d = C15585f.f42211a.mo14341d(p232.f184743h);
            if (d != null) {
                if (d.isPostFailed()) {
                    a.f170768p = 3;
                } else if (!d.isPostFinish()) {
                    a.f170768p = 2;
                } else {
                    a.f170768p = 1;
                }
            }
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(getContext(), 7, C64793w23.class);
            if (w232 != null) {
                w232.f186033d = 14;
            }
            C99364n.m129616h().mo138822a().mo32203a(0);
            String str = this.f163267d;
            Log.m105924i(str, "onNewIntent mvLocalId:" + a.f170753a + " coverPath:" + a.f170754b + " mvPostStatus:" + a.f170768p);
            this.f163277q = false;
            this.f163270g.add(0, new C61646d(a));
            mo80454j3().notifyDataSetChanged();
            WxRecyclerView wxRecyclerView = this.f163269f;
            if (wxRecyclerView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                C117292a.m165358d(wxRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    public void onPause() {
        super.onPause();
        C61426c cVar = this.f163276p;
        if (cVar != null) {
            cVar.pause();
        }
        this.f163277q = true;
        Log.m105924i(this.f163267d, "onPause");
        C99364n.m129616h().mo138828g(this.f163273j);
    }

    public void onResume() {
        super.onResume();
        C39818r rVar = C39818r.f106831a;
        Intent intent = ((C63801l) rVar.mo62443b(getContext()).mo75002a(C63801l.class)).getActivity().getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_enter_from_float_ball", false) : false;
        String str = this.f163267d;
        Log.m105924i(str, "onResume, needResumePosition:" + this.f163277q + ", isJumpToApp:" + this.f163278r + ", fromFloatBall: " + booleanExtra);
        C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C101106m k = C99364n.m129616h().mo138832k();
        if (!eVar.mo88572f3(k)) {
            String str2 = this.f163267d;
            Log.m105924i(str2, "onResume different music firstTimeEnterMusicId:" + eVar.f180742g + ' ');
            C65415e0 e0Var = C65415e0.f188260a;
            C64488kb1 kb12 = eVar.f180744i;
            String str3 = eVar.f180742g;
            String str4 = "";
            if (str3 == null && (str3 = kb12.f183909i) == null) {
                str3 = str4;
            }
            Integer num = eVar.f180741f;
            int intValue = num != null ? num.intValue() : 0;
            String str5 = eVar.f180743h.f170757e;
            if (str5 != null) {
                str4 = str5;
            }
            e0Var.mo89506d(kb12, str3, intValue, str4);
            WxRecyclerView wxRecyclerView = this.f163269f;
            if (wxRecyclerView != null) {
                wxRecyclerView.post(new C57031l(this));
            }
        } else if (this.f163277q || this.f163278r || booleanExtra) {
            String str6 = this.f163267d;
            Log.m105924i(str6, "onResume same music " + k.f295960e + ' ' + k.f295959d + ", musicPlayer.isPlaying:" + C99364n.m129616h().mo138822a().mo32206f());
            WxRecyclerView wxRecyclerView2 = this.f163269f;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.post(new C57032m(this, booleanExtra));
            }
        }
        this.f163277q = false;
        C99364n.m129616h().mo138823b(this.f163273j);
        C39622i0 a2 = rVar.mo62444c(getActivity()).mo75002a(MusicMvSongInfoUIC.class);
        C87412m.m108593f(a2, "UICProvider.of(activity)…vSongInfoUIC::class.java)");
        if (((MusicMvSongInfoUIC) a2).f163374g) {
            String str7 = k.f295972t;
            C87412m.m108593f(str7, "musicWrapper.AppId");
            String str8 = k.f295954P;
            C87412m.m108593f(str8, "musicWrapper.mid");
            if (!Util.isNullOrNil(str8)) {
                LinkedList linkedList = new LinkedList();
                C64821x13 x132 = new C64821x13();
                x132.f186251d = str7;
                x132.f186252e = str8;
                linkedList.add(x132);
                C86709a0.m107524d().mo123460f(new C60790h(linkedList));
            }
        }
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f163267d, "onStart: ");
        C61426c cVar = this.f163276p;
        if (cVar != null) {
            cVar.setMute(true);
        }
        C61426c cVar2 = this.f163276p;
        if (cVar2 != null) {
            cVar2.start();
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f163267d, "onStop");
        C61426c cVar = this.f163276p;
        if (cVar != null) {
            cVar.stop();
        }
    }
}
