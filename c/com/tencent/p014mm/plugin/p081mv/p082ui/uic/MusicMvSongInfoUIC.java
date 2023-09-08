package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricPreludeView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import la2.C99364n;
import lg3.C76694b;
import ma2.C61453s;
import o40.C61926c;
import p529fv.C59326j;
import p529fv.C59327o;
import qc0.C101093a;
import qc0.C101106m;
import qo3.C77398g;
import rx3.C13598b0;
import sb2.C13634a1;
import sb2.C13635b1;
import sb2.C63756e;
import sb2.C63807m;
import sb2.C63816o;
import te3.C64488kb1;
import ub2.C65257a;
import ub2.C65269d;
import ub2.C65304p0;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC */
public final class MusicMvSongInfoUIC extends UIComponent {

    /* renamed from: d */
    public C64488kb1 f163371d;

    /* renamed from: e */
    public C65257a f163372e;

    /* renamed from: f */
    public C77398g f163373f;

    /* renamed from: g */
    public boolean f163374g;

    /* renamed from: h */
    public View f163375h;

    /* renamed from: i */
    public long f163376i;

    /* renamed from: j */
    public long f163377j;

    /* renamed from: n */
    public boolean f163378n;

    /* renamed from: o */
    public final C94223g.C94224a f163379o;

    /* renamed from: p */
    public final HashMap<Integer, WeakReference<MusicMainSeekBar>> f163380p = new HashMap<>();

    /* renamed from: q */
    public final HashMap<Integer, WeakReference<RecyclerView>> f163381q = new HashMap<>();

    /* renamed from: r */
    public final HashMap<Integer, WeakReference<MusicMvLyricPreludeView>> f163382r = new HashMap<>();

    /* renamed from: s */
    public final HashMap<Integer, WeakReference<WeImageView>> f163383s = new HashMap<>();

    /* renamed from: t */
    public final IListener<?> f163384t;

    /* renamed from: u */
    public final IListener<?> f163385u;

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$a */
    public static final class C57056a implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvSongInfoUIC f163386a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f163387b;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$a$a */
        public static final class C57057a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f163388d;

            /* renamed from: e */
            public final /* synthetic */ int f163389e;

            /* renamed from: f */
            public final /* synthetic */ MusicMvSongInfoUIC f163390f;

            /* renamed from: g */
            public final /* synthetic */ AppCompatActivity f163391g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57057a(int i, int i2, MusicMvSongInfoUIC musicMvSongInfoUIC, AppCompatActivity appCompatActivity) {
                super(0);
                this.f163388d = i;
                this.f163389e = i2;
                this.f163390f = musicMvSongInfoUIC;
                this.f163391g = appCompatActivity;
            }

            public Object invoke() {
                List<MusicMvLyricView.C57106f> data;
                MusicMvLyricView.C57106f fVar;
                MusicMvLyricView.C57105e eVar;
                LinearLayoutManager linearLayoutManager;
                if (this.f163388d >= 0 && this.f163389e >= 0) {
                    Collection<WeakReference<MusicMainSeekBar>> values = this.f163390f.f163380p.values();
                    C87412m.m108593f(values, "seekBarMap.values");
                    int i = this.f163388d;
                    int i2 = this.f163389e;
                    for (WeakReference weakReference : values) {
                        MusicMainSeekBar musicMainSeekBar = (MusicMainSeekBar) weakReference.get();
                        if (musicMainSeekBar != null) {
                            musicMainSeekBar.setProgress(i);
                        }
                        MusicMainSeekBar musicMainSeekBar2 = (MusicMainSeekBar) weakReference.get();
                        if (musicMainSeekBar2 != null) {
                            musicMainSeekBar2.setMaxProgress(i2);
                        }
                    }
                    C63816o oVar = (C63816o) C39818r.f106831a.mo62444c(this.f163391g).mo75002a(C63816o.class);
                    int i3 = this.f163388d;
                    oVar.f180916o = i3;
                    int i4 = oVar.f180917p;
                    C61453s sVar = oVar.f180915n;
                    if (sVar != null) {
                        i4 = sVar.mo86428c((long) i3);
                    }
                    int i5 = 1;
                    if (i4 != oVar.f180917p && i4 >= 0) {
                        Iterator<RecyclerView> it = oVar.f180913i.iterator();
                        while (it.hasNext()) {
                            RecyclerView next = it.next();
                            if (next.getVisibility() == 0 && (linearLayoutManager = (LinearLayoutManager) next.getLayoutManager()) != null) {
                                int C = linearLayoutManager.mo16957C();
                                int E = linearLayoutManager.mo16959E();
                                next.mo17155w1();
                                if (i4 <= E + i5 && C - i5 <= i4) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(Integer.valueOf(i4));
                                    RecyclerView recyclerView = next;
                                    C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                                    next.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                                } else {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(Integer.valueOf(i4));
                                    RecyclerView recyclerView2 = next;
                                    C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                                    next.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                                }
                            }
                            i5 = 1;
                        }
                    }
                    oVar.f180917p = i4;
                    MusicMvLyricView f3 = oVar.mo88608f3();
                    if (f3 != null && f3.getVisibility() == 0) {
                        MusicMvLyricView f35 = oVar.mo88608f3();
                        if (f35 != null) {
                            int i6 = MusicMvLyricView.f163579J;
                            C61926c.m72668M(new C65304p0(f35, (long) i3, true));
                        }
                        MusicMvLyricView f36 = oVar.mo88608f3();
                        if (!(f36 == null || f36.f163584B == 0)) {
                            WxRecyclerView wxRecyclerView = f36.f163593e;
                            RecyclerView.C0129l T0 = wxRecyclerView != null ? wxRecyclerView.mo17033T0(0) : null;
                            C87412m.m108592e(T0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
                            C65269d dVar = (C65269d) T0;
                            if (f36.f163591I <= 3) {
                                Log.m105925i("MicroMsg.MusicMvCommentView", "checkPreludeTime preludeLen:%d", Long.valueOf(f36.f163584B));
                                f36.f163591I++;
                            }
                            long j = f36.f163584B;
                            dVar.f187910r = j;
                            long j2 = (long) i3;
                            int i7 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                            if (i7 < 0 && !dVar.f187909q) {
                                Log.m105924i("MicroMsg.MusicMvCommentView", "startAnim");
                                dVar.mo89398m(j2);
                                f36.f163585C = true;
                                if (f36.f163607v == 0) {
                                    f36.mo80565c(0, 0);
                                }
                            } else if (i7 > 0) {
                                if (dVar.f187909q) {
                                    Log.m105924i(C65269d.f187898y, "stopAnim");
                                }
                                dVar.f187909q = false;
                                dVar.f187900e.invalidate();
                                f36.f163585C = false;
                                if (f36.f163607v == 0) {
                                    WxRecyclerAdapter<MusicMvLyricView.C57106f> wxRecyclerAdapter = f36.f163594f;
                                    if ((wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null || (fVar = data.get(0)) == null || (eVar = fVar.f163618d) == null || eVar.f163617f) ? false : true) {
                                        f36.mo80565c(0, 0);
                                    }
                                }
                            }
                        }
                    } else {
                        long j3 = oVar.f180925x;
                        if (j3 != 0) {
                            if (oVar.f180907I <= 10) {
                                Log.m105925i(oVar.f180908d, "checkPreludeTime preludeLen:%d, ", Long.valueOf(j3));
                                oVar.f180907I++;
                            }
                            MusicMvLyricPreludeView musicMvLyricPreludeView = oVar.f180924w;
                            if (musicMvLyricPreludeView != null) {
                                musicMvLyricPreludeView.setPreludeLen(oVar.f180925x);
                                long j4 = (long) i3;
                                if (j4 < oVar.f180925x && !musicMvLyricPreludeView.getEnableAnim()) {
                                    Log.m105924i(oVar.f180908d, "checkPreludeTime startAnim");
                                    musicMvLyricPreludeView.setVisibility(0);
                                    RecyclerView recyclerView3 = oVar.f180912h;
                                    if (recyclerView3 != null) {
                                        recyclerView3.setVisibility(4);
                                    }
                                    musicMvLyricPreludeView.mo80553f(j4);
                                    oVar.f180926y = true;
                                } else if (j4 > oVar.f180925x) {
                                    if (musicMvLyricPreludeView.getEnableAnim()) {
                                        musicMvLyricPreludeView.f163562o = false;
                                        musicMvLyricPreludeView.invalidate();
                                        Log.m105924i(oVar.f180908d, "checkPreludeTime stopAnim");
                                    }
                                    oVar.f180926y = false;
                                    if (musicMvLyricPreludeView.getVisibility() == 0) {
                                        musicMvLyricPreludeView.setVisibility(8);
                                    }
                                    RecyclerView recyclerView4 = oVar.f180912h;
                                    if (!(recyclerView4 != null && recyclerView4.getVisibility() == 0)) {
                                        RecyclerView recyclerView5 = oVar.f180912h;
                                        if (recyclerView5 != null) {
                                            recyclerView5.setVisibility(0);
                                        }
                                        RecyclerView recyclerView6 = oVar.f180912h;
                                        if (recyclerView6 != null) {
                                            recyclerView6.setAlpha(1.0f);
                                        }
                                        Log.m105924i(oVar.f180908d, "scrollToFistLine");
                                        if (oVar.f180917p <= 0) {
                                            Iterator<RecyclerView> it4 = oVar.f180913i.iterator();
                                            while (it4.hasNext()) {
                                                RecyclerView next2 = it4.next();
                                                if (next2.getVisibility() == 0 && ((LinearLayoutManager) next2.getLayoutManager()) != null) {
                                                    C9556a aVar3 = new C9556a();
                                                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                                    aVar3.mo10233c(0);
                                                    RecyclerView recyclerView7 = next2;
                                                    C117292a.m165358d(recyclerView7, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                                    next2.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                                                    C117292a.m165359e(recyclerView7, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ((C63756e) C39818r.f106831a.mo62444c(this.f163391g).mo75002a(C63756e.class)).f180744i.f183918u = this.f163389e;
                }
                return C13598b0.f38549a;
            }
        }

        public C57056a(MusicMvSongInfoUIC musicMvSongInfoUIC, AppCompatActivity appCompatActivity) {
            this.f163386a = musicMvSongInfoUIC;
            this.f163387b = appCompatActivity;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            C61926c.m72668M(new C57057a(i, i2, this.f163386a, this.f163387b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$b */
    public static final class C57058b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvSongInfoUIC f163392d;

        /* renamed from: e */
        public final /* synthetic */ View f163393e;

        public C57058b(MusicMvSongInfoUIC musicMvSongInfoUIC, View view) {
            this.f163392d = musicMvSongInfoUIC;
            this.f163393e = view;
        }

        public final void run() {
            MusicMvSongInfoUIC.m65757c3(this.f163392d, this.f163393e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvSongInfoUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        new HashMap();
        this.f163379o = new C57056a(this, appCompatActivity);
        C40008f fVar = C40008f.f107254d;
        this.f163384t = new MusicMvSongInfoUIC$musicCheckErrorListener$1(appCompatActivity, this, fVar);
        this.f163385u = new MusicMvSongInfoUIC$musicPlayerListener$1(appCompatActivity, this, fVar);
    }

    /* renamed from: c3 */
    public static final void m65757c3(MusicMvSongInfoUIC musicMvSongInfoUIC, View view) {
        View findViewById;
        View findViewById2;
        musicMvSongInfoUIC.getClass();
        Class cls = C59327o.class;
        C59327o oVar = (C59327o) C86312j.m106911c(cls);
        C101106m b = C101093a.m132480b();
        View view2 = null;
        Integer Z30 = oVar.Z30(b != null ? b.f295954P : null);
        if (Z30 != null && Z30.intValue() == 2) {
            C59327o oVar2 = (C59327o) C86312j.m106911c(cls);
            C101106m b2 = C101093a.m132480b();
            if (C87412m.m108589b(oVar2.mo84017jl(b2 != null ? b2.f295954P : null), Boolean.TRUE)) {
                ((C59326j) C86312j.m106911c(C59326j.class)).mo84433uL();
                if ((view != null ? view.findViewById(C0966R.C0970id.kul) : null) != null) {
                    int i = 0;
                    if (musicMvSongInfoUIC.f163378n) {
                        View findViewById3 = view != null ? view.findViewById(C0966R.C0970id.epw) : null;
                        if (findViewById3 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view3 = findViewById3;
                            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (view != null) {
                            view2 = view.findViewById(C0966R.C0970id.epw);
                        }
                        if (view2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(Float.valueOf(1.0f));
                            View view4 = view2;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(150);
                    int width = (view == null || (findViewById2 = view.findViewById(C0966R.C0970id.kul)) == null) ? 0 : findViewById2.getWidth();
                    if (!(view == null || (findViewById = view.findViewById(C0966R.C0970id.kum)) == null)) {
                        i = findViewById.getWidth();
                    }
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new C13634a1(width, i, view));
                    ofFloat.addListener(new C13635b1(view, musicMvSongInfoUIC));
                    ofFloat.start();
                }
            }
        }
    }

    /* renamed from: d3 */
    public final void mo80488d3() {
        Collection<WeakReference<RecyclerView>> values = this.f163381q.values();
        C87412m.m108593f(values, "lyricLineViewMap.values");
        for (WeakReference weakReference : values) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        }
        Collection<WeakReference<MusicMvLyricPreludeView>> values2 = this.f163382r.values();
        C87412m.m108593f(values2, "lyricPreludeViewMap.values");
        for (WeakReference weakReference2 : values2) {
            MusicMvLyricPreludeView musicMvLyricPreludeView = (MusicMvLyricPreludeView) weakReference2.get();
            if (musicMvLyricPreludeView != null) {
                musicMvLyricPreludeView.setVisibility(4);
            }
            MusicMvLyricPreludeView musicMvLyricPreludeView2 = (MusicMvLyricPreludeView) weakReference2.get();
            if (musicMvLyricPreludeView2 != null) {
                musicMvLyricPreludeView2.mo80550c();
            }
        }
    }

    /* renamed from: e3 */
    public final void mo80489e3() {
        Collection<WeakReference<WeImageView>> values = this.f163383s.values();
        C87412m.m108593f(values, "mediaIconIvMap.values");
        for (WeakReference weakReference : values) {
            WeImageView weImageView = (WeImageView) weakReference.get();
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: f3 */
    public final void mo80490f3() {
        Collection<WeakReference<MusicMainSeekBar>> values = this.f163380p.values();
        C87412m.m108593f(values, "seekBarMap.values");
        for (WeakReference weakReference : values) {
            MusicMainSeekBar musicMainSeekBar = (MusicMainSeekBar) weakReference.get();
            if (musicMainSeekBar != null) {
                musicMainSeekBar.setVisibility(8);
            }
        }
    }

    /* renamed from: g3 */
    public final void mo80491g3() {
        View view = this.f163375h;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.kul);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: i3 */
    public final void mo80492i3() {
        Class cls = C63816o.class;
        C39818r rVar = C39818r.f106831a;
        if (!((C63816o) rVar.mo62444c(getActivity()).mo75002a(cls)).f180919r && !((C63816o) rVar.mo62444c(getActivity()).mo75002a(cls)).f180926y) {
            Collection<WeakReference<RecyclerView>> values = this.f163381q.values();
            C87412m.m108593f(values, "lyricLineViewMap.values");
            for (WeakReference weakReference : values) {
                RecyclerView recyclerView = (RecyclerView) weakReference.get();
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
            }
        }
        if (((C63816o) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f180926y) {
            Collection<WeakReference<MusicMvLyricPreludeView>> values2 = this.f163382r.values();
            C87412m.m108593f(values2, "lyricPreludeViewMap.values");
            for (WeakReference weakReference2 : values2) {
                MusicMvLyricPreludeView musicMvLyricPreludeView = (MusicMvLyricPreludeView) weakReference2.get();
                if (musicMvLyricPreludeView != null) {
                    musicMvLyricPreludeView.setVisibility(0);
                }
                MusicMvLyricPreludeView musicMvLyricPreludeView2 = (MusicMvLyricPreludeView) weakReference2.get();
                if (musicMvLyricPreludeView2 != null) {
                    musicMvLyricPreludeView2.mo80551d();
                }
            }
        }
    }

    /* renamed from: j3 */
    public final void mo80493j3() {
        Collection<WeakReference<WeImageView>> values = this.f163383s.values();
        C87412m.m108593f(values, "mediaIconIvMap.values");
        for (WeakReference weakReference : values) {
            WeImageView weImageView = (WeImageView) weakReference.get();
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        }
    }

    /* renamed from: k3 */
    public final void mo80494k3() {
        Collection<WeakReference<MusicMainSeekBar>> values = this.f163380p.values();
        C87412m.m108593f(values, "seekBarMap.values");
        for (WeakReference weakReference : values) {
            MusicMainSeekBar musicMainSeekBar = (MusicMainSeekBar) weakReference.get();
            if (musicMainSeekBar != null) {
                musicMainSeekBar.setVisibility(0);
            }
        }
    }

    /* renamed from: l3 */
    public final void mo80495l3(View view) {
        View view2 = view;
        Class cls = C63756e.class;
        Class cls2 = C59327o.class;
        C59327o oVar = (C59327o) C86312j.m106911c(cls2);
        C101106m b = C101093a.m132480b();
        Integer Z30 = oVar.Z30(b != null ? b.f295954P : null);
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        if ((Z30 != null && Z30.intValue() == 2) || eVar.f180758z == 2) {
            View findViewById = view2.findViewById(C0966R.C0970id.kul);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f163374g = true;
            if (C76694b.m92336b(C76577a.m92162m(getContext())) >= 6) {
                View findViewById2 = view2.findViewById(C0966R.C0970id.epw);
                TextView textView = findViewById2 instanceof TextView ? (TextView) findViewById2 : null;
                if (textView != null) {
                    textView.setText(getActivity().getString(C0966R.string.f361083h50));
                }
                View findViewById3 = view2.findViewById(C0966R.C0970id.epx);
                TextView textView2 = findViewById3 instanceof TextView ? (TextView) findViewById3 : null;
                if (textView2 != null) {
                    textView2.setText(getActivity().getString(C0966R.string.f361083h50));
                }
            }
            C59327o oVar2 = (C59327o) C86312j.m106911c(cls2);
            C101106m b2 = C101093a.m132480b();
            if (C87412m.m108589b(oVar2.mo84017jl(b2 != null ? b2.f295954P : null), Boolean.TRUE) && (0 instanceof LinearLayout.LayoutParams)) {
                LinearLayout.LayoutParams layoutParams = null;
            }
            if (((C63756e) rVar.mo62444c(getActivity()).mo75002a(cls)).f180755w) {
                view2.post(new C57058b(this, view2));
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            ((C63807m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63807m.class)).f180881g.mo89415b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", "onCreate");
        this.f163384t.alive();
        this.f163385u.alive();
    }

    public void onDestroy() {
        C77398g gVar = this.f163373f;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f163384t.dead();
        this.f163385u.dead();
        ((C63807m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63807m.class)).f180881g.mo89414a();
        C99364n.m129616h().mo138828g(this.f163379o);
        ((C59327o) C86312j.m106911c(C59327o.class)).mo84018ws();
        super.onDestroy();
    }

    public void onPause() {
        C99364n.m129616h().mo138828g(this.f163379o);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C99364n.m129616h().mo138823b(this.f163379o);
    }
}
