package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56983r;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import la2.C99364n;
import ma2.C61453s;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.s */
public final class C56987s {

    /* renamed from: a */
    public final Context f163198a;

    /* renamed from: b */
    public final View f163199b;

    /* renamed from: c */
    public final int f163200c;

    /* renamed from: d */
    public final int f163201d;

    /* renamed from: e */
    public final C13601g f163202e = C36568h.m40985a(new C56989b(this));

    /* renamed from: f */
    public final ArrayList<String> f163203f = new ArrayList<>();

    /* renamed from: g */
    public C61453s f163204g;

    /* renamed from: h */
    public int f163205h = -1;

    /* renamed from: i */
    public int f163206i;

    /* renamed from: j */
    public final C56988a f163207j = new C56988a();

    /* renamed from: k */
    public final C94223g.C94224a f163208k = new C56990c(this);

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.s$a */
    public static final class C56988a implements C56983r.C56986b {
        /* renamed from: j */
        public void mo80432j(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.s$b */
    public static final class C56989b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C56987s f163209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56989b(C56987s sVar) {
            super(0);
            this.f163209d = sVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f163209d.f163199b.findViewById(C0966R.C0970id.gju);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.s$c */
    public static final class C56990c implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ C56987s f163210a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.shake.s$c$a */
        public static final class C56991a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f163211d;

            /* renamed from: e */
            public final /* synthetic */ int f163212e;

            /* renamed from: f */
            public final /* synthetic */ C56987s f163213f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56991a(int i, int i2, C56987s sVar) {
                super(0);
                this.f163211d = i;
                this.f163212e = i2;
                this.f163213f = sVar;
            }

            public Object invoke() {
                int i = this.f163211d;
                if (i > 0 && this.f163212e > 0) {
                    C56987s sVar = this.f163213f;
                    if (i - sVar.f163206i > 0) {
                        C56987s.m65692a(sVar, i);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C56990c(C56987s sVar) {
            this.f163210a = sVar;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            C61926c.m72668M(new C56991a(i, i2, this.f163210a));
        }
    }

    public C56987s(Context context, View view, int i, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "rootView");
        this.f163198a = context;
        this.f163199b = view;
        this.f163200c = i;
        this.f163201d = i2;
    }

    /* renamed from: a */
    public static final void m65692a(C56987s sVar, int i) {
        LinearLayoutManager linearLayoutManager;
        C56987s sVar2 = sVar;
        int i2 = sVar2.f163205h;
        C61453s sVar3 = sVar2.f163204g;
        if (sVar3 != null) {
            i2 = sVar3.mo86428c((long) i);
        }
        if (!(i2 == sVar2.f163205h || i2 < 0 || (linearLayoutManager = (LinearLayoutManager) sVar.mo80433b().getLayoutManager()) == null)) {
            int C = linearLayoutManager.mo16957C();
            int E = linearLayoutManager.mo16959E();
            sVar.mo80433b().mo17155w1();
            boolean z = true;
            if (sVar.mo80433b().getLayoutManager() instanceof MusicBlackLyricLayoutManager) {
                RecyclerView.C16613e adapter = sVar.mo80433b().getAdapter();
                C56983r rVar = adapter instanceof C56983r ? (C56983r) adapter : null;
                if (rVar != null && rVar.f163192e == 1) {
                    rVar.f163194g = i2;
                    rVar.notifyItemChanged(i2);
                    rVar.notifyItemChanged(i2 - 1);
                }
            }
            int i3 = C - 1;
            if (i2 > E + 1 || i3 > i2) {
                z = false;
            }
            if (z) {
                RecyclerView b = sVar.mo80433b();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                RecyclerView recyclerView = b;
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                b.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                RecyclerView b2 = sVar.mo80433b();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i2));
                RecyclerView recyclerView2 = b2;
                C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                b2.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        sVar2.f163205h = i2;
    }

    /* renamed from: b */
    public final RecyclerView mo80433b() {
        return (RecyclerView) ((C36570n) this.f163202e).getValue();
    }

    /* renamed from: c */
    public final void mo80434c() {
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onPause");
        C99364n.m129616h().mo138828g(this.f163208k);
    }
}
