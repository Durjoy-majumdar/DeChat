package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import db2.C58255d;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g03.C59338a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import hb2.C59826g;
import hb2.C59828h;
import hb2.C59833q;
import i03.C60238a;
import i03.C60239b;
import j03.C60695a;
import j03.C60699c;
import java.util.ArrayList;
import java.util.Collection;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import la2.C99364n;
import nb2.C61639a;
import p192l4.C10462b;
import p500dy.C97560f;
import p749xh.C102658n6;
import p851es.C58800a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63844s;
import sb2.C63845s0;
import sb2.C63874y;
import sb2.C63878z;
import sx3.C110818d0;
import te3.C64621p23;
import ub2.C65257a;
import wb2.C65946a;
import wx3.C15601d;
import ya2.C15942f;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC */
public final class MusicMvMakerFixEditUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f163332d = C36568h.m40985a(new C57046g(this));

    /* renamed from: e */
    public final ArrayList<C59811e> f163333e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C59811e> f163334f = new ArrayList<>();

    /* renamed from: g */
    public final C13601g f163335g = C36568h.m40985a(new C57045f(this));

    /* renamed from: h */
    public final C13601g f163336h;

    /* renamed from: i */
    public final C13601g f163337i;

    /* renamed from: j */
    public final C13601g f163338j;

    /* renamed from: n */
    public final C65257a f163339n;

    /* renamed from: o */
    public final C57044e f163340o;

    /* renamed from: p */
    public int f163341p;

    /* renamed from: q */
    public final C94223g.C94224a f163342q;

    /* renamed from: r */
    public C57043d f163343r;

    /* renamed from: s */
    public C64621p23 f163344s;

    /* renamed from: t */
    public C102658n6 f163345t;

    /* renamed from: u */
    public boolean f163346u;

    /* renamed from: v */
    public boolean f163347v;

    /* renamed from: w */
    public C60699c f163348w;

    /* renamed from: x */
    public int f163349x;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC$MusicMVVideoItemConverterFactory;", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC$b;", "sizeResolver", "Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC$b;", "getSizeResolver", "()Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC$b;", "<init>", "(Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC$b;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$MusicMVVideoItemConverterFactory */
    public final class MusicMVVideoItemConverterFactory implements C9500j {
        private final C57041b sizeResolver;
        public final /* synthetic */ MusicMvMakerFixEditUIC this$0;

        public MusicMVVideoItemConverterFactory(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, C57041b bVar) {
            C87412m.m108594g(bVar, "sizeResolver");
            this.this$0 = musicMvMakerFixEditUIC;
            this.sizeResolver = bVar;
        }

        public C60896i<?> getItemConvert(int i) {
            return new C61639a(this.sizeResolver, new C57042c());
        }

        public final C57041b getSizeResolver() {
            return this.sizeResolver;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$a */
    public interface C57040a {
        /* renamed from: a */
        void mo80481a(int i, C59811e eVar, View view);

        /* renamed from: b */
        void mo80482b(int i, C59811e eVar, View view);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$b */
    public interface C57041b {
        /* renamed from: a */
        int mo80483a();
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$c */
    public final class C57042c implements C57040a {
        public C57042c() {
        }

        /* renamed from: a */
        public void mo80481a(int i, C59811e eVar, View view) {
            C87412m.m108594g(eVar, "item");
            C87412m.m108594g(view, "itemView");
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onRollback: " + i);
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = MusicMvMakerFixEditUIC.this;
            if (i < musicMvMakerFixEditUIC.f163334f.size()) {
                C59811e eVar2 = musicMvMakerFixEditUIC.f163334f.get(i);
                C87412m.m108593f(eVar2, "initMusicDataList[position]");
                C59811e eVar3 = eVar2;
                eVar3.f170728h = eVar.f170728h;
                eVar.f170732o = null;
                musicMvMakerFixEditUIC.f163333e.set(i, eVar3);
                musicMvMakerFixEditUIC.mo80475f3().notifyItemChanged(i);
                musicMvMakerFixEditUIC.mo80479k3(i);
            }
            C57043d dVar = MusicMvMakerFixEditUIC.this.f163343r;
            if (dVar != null) {
                dVar.mo80399c(i, eVar);
            }
        }

        /* renamed from: b */
        public void mo80482b(int i, C59811e eVar, View view) {
            C87412m.m108594g(eVar, "item");
            C87412m.m108594g(view, "itemView");
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onEdit: " + i);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.h8_);
            if (imageView != null) {
                MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = MusicMvMakerFixEditUIC.this;
                C59826g a = C59828h.m69722a(imageView);
                C57043d dVar = musicMvMakerFixEditUIC.f163343r;
                if (dVar != null) {
                    dVar.mo80398b(i, eVar, false, a);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$d */
    public interface C57043d {
        /* renamed from: a */
        void mo80397a();

        /* renamed from: b */
        void mo80398b(int i, C59811e eVar, boolean z, C59826g gVar);

        /* renamed from: c */
        void mo80399c(int i, C59811e eVar);

        /* renamed from: d */
        void mo80400d(int i, C59811e eVar);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$e */
    public final class C57044e implements C57041b {

        /* renamed from: a */
        public int f163351a;

        public C57044e() {
        }

        /* renamed from: a */
        public int mo80483a() {
            int i;
            int i2 = this.f163351a;
            if (i2 == 0) {
                i2 = C76577a.m92145A(MusicMvMakerFixEditUIC.this.getActivity());
                i = C76577a.m92151b(MMApplicationContext.getContext(), 70);
            } else {
                i = C76577a.m92151b(MMApplicationContext.getContext(), 70);
            }
            return i2 - (i * 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$f */
    public static final class C57045f extends C87413o implements C32224a<WxRecyclerAdapter<C59811e>> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57045f(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            super(0);
            this.f163353d = musicMvMakerFixEditUIC;
        }

        public Object invoke() {
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f163353d;
            return new WxRecyclerAdapter(new MusicMVVideoItemConverterFactory(musicMvMakerFixEditUIC, musicMvMakerFixEditUIC.f163340o), this.f163353d.f163333e, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$g */
    public static final class C57046g extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57046g(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            super(0);
            this.f163354d = musicMvMakerFixEditUIC;
        }

        public Object invoke() {
            return ((C58255d) ((C36570n) this.f163354d.f163337i).getValue()).f166810a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$h */
    public static final class C57047h extends C87413o implements C32224a<C15942f> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57047h(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163355d = appCompatActivity;
        }

        public Object invoke() {
            return new C15942f(this.f163355d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$i */
    public static final class C57048i extends C87413o implements C32224a<LinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57048i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163356d = appCompatActivity;
        }

        public Object invoke() {
            return new LinearLayoutManager(this.f163356d, 0, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$j */
    public static final class C57049j implements C58800a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f163357a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<C59826g, C13598b0> f163358b;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$j$a */
        public static final class C57050a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f163359d;

            /* renamed from: e */
            public final /* synthetic */ C32226l<C59826g, C13598b0> f163360e;

            /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$j$a$a */
            public static final class C57051a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ImageView f163361d;

                /* renamed from: e */
                public final /* synthetic */ C32226l<C59826g, C13598b0> f163362e;

                public C57051a(ImageView imageView, C32226l<? super C59826g, C13598b0> lVar) {
                    this.f163361d = imageView;
                    this.f163362e = lVar;
                }

                public final void run() {
                    this.f163361d.setVisibility(4);
                    C59826g a = C59828h.m69722a(this.f163361d);
                    C32226l<C59826g, C13598b0> lVar = this.f163362e;
                    if (lVar != null) {
                        lVar.invoke(a);
                    }
                }
            }

            public C57050a(ImageView imageView, C32226l<? super C59826g, C13598b0> lVar) {
                this.f163359d = imageView;
                this.f163360e = lVar;
            }

            public final void run() {
                this.f163359d.animate().alpha(1.0f).setDuration(200).withEndAction(new C57051a(this.f163359d, this.f163360e)).start();
            }
        }

        public C57049j(ImageView imageView, C32226l<? super C59826g, C13598b0> lVar) {
            this.f163357a = imageView;
            this.f163358b = lVar;
        }

        /* renamed from: a */
        public void mo80484a() {
            ((C119157j) C119157j.f356862d).mo183895z(new C57050a(this.f163357a, this.f163358b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$k */
    public static final class C57052k implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163363a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$k$a */
        public static final class C57053a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerFixEditUIC f163364d;

            /* renamed from: e */
            public final /* synthetic */ int f163365e;

            public C57053a(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, int i, int i2) {
                this.f163364d = musicMvMakerFixEditUIC;
                this.f163365e = i;
            }

            public final void run() {
                MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f163364d;
                int i = this.f163365e;
                RecyclerView.C16631z I0 = musicMvMakerFixEditUIC.mo80476g3().mo17023I0(musicMvMakerFixEditUIC.f163341p);
                if (I0 != null) {
                    ((TextView) I0.f44854d.findViewById(C0966R.C0970id.h86)).setText(musicMvMakerFixEditUIC.f163333e.get(musicMvMakerFixEditUIC.f163341p).mo84762d(i));
                }
            }
        }

        public C57052k(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            this.f163363a = musicMvMakerFixEditUIC;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            ((C119157j) C119157j.f356862d).mo183895z(new C57053a(this.f163363a, i, i2));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$onActivityResult$1", mo125469f = "MusicMvMakerFixEditUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$l */
    public static final class C57054l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163366d;

        /* renamed from: e */
        public final /* synthetic */ Intent f163367e;

        /* renamed from: f */
        public final /* synthetic */ int f163368f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57054l(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, Intent intent, int i, C15601d<? super C57054l> dVar) {
            super(2, dVar);
            this.f163366d = musicMvMakerFixEditUIC;
            this.f163367e = intent;
            this.f163368f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57054l(this.f163366d, this.f163367e, this.f163368f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57054l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f163366d;
            Intent intent = this.f163367e;
            int i = this.f163368f;
            musicMvMakerFixEditUIC.getClass();
            if (i == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
                String str = "";
                String str2 = stringExtra == null ? str : stringExtra;
                String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                boolean k = C86013q1.m106450k(str2);
                boolean k2 = C86013q1.m106450k(str);
                int i2 = musicMvMakerFixEditUIC.f163339n.f187878m;
                Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "takePhotoFinished, videoPath:" + str2 + ", videoExist:" + k + ", thumbPath:" + str + ", thumbExist:" + k2 + ", pos:" + i2);
                if (k) {
                    C94554a e302 = ((C97560f) C86312j.m106911c(C97560f.class)).e30(str2, true);
                    C59811e eVar = new C59811e();
                    C59811e.C59813b bVar = C59811e.f170722p;
                    C59811e eVar2 = musicMvMakerFixEditUIC.f163333e.get(i2);
                    C87412m.m108593f(eVar2, "dataList[pos]");
                    bVar.mo84767c(eVar2, eVar);
                    eVar.f170727g = 3;
                    eVar.f170730j = new C59811e.C59812a(str, str2);
                    C59811e eVar3 = musicMvMakerFixEditUIC.f163334f.get(i2);
                    C87412m.m108593f(eVar3, "initMusicDataList[pos]");
                    C59811e eVar4 = eVar3;
                    eVar.f170732o = musicMvMakerFixEditUIC.f163333e.get(i2);
                    C59811e.C59821i iVar = new C59811e.C59821i(str2 + '_' + str2.hashCode(), str2, (long) e302.f273443a, 0, 0, 24, (C8480h) null);
                    iVar.f170746d = e302.f273445c;
                    iVar.f170747e = e302.f273446d;
                    eVar.f170731n = iVar;
                    musicMvMakerFixEditUIC.f163333e.set(i2, eVar);
                    MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                    MvCreateReportHelper.f163007c = 1;
                    mvCreateReportHelper.mo80351b(i2, eVar);
                    ((C119157j) C119157j.f356862d).mo183895z(new C63878z(musicMvMakerFixEditUIC, i2, eVar));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$m */
    public static final class C57055m extends C87413o implements C32224a<C58255d> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57055m(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            super(0);
            this.f163369d = musicMvMakerFixEditUIC;
        }

        public Object invoke() {
            View findViewById = this.f163369d.findViewById(C0966R.C0970id.f7d);
            int i = C0966R.C0970id.f5670le;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f5670le);
            if (frameLayout != null) {
                i = C0966R.C0970id.f5671lf;
                MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f5671lf);
                if (mMRoundCornerImageView != null) {
                    i = C0966R.C0970id.apv;
                    WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.apv);
                    if (weImageView != null) {
                        i = C0966R.C0970id.e_b;
                        WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.e_b);
                        if (wxRecyclerView != null) {
                            i = C0966R.C0970id.e_j;
                            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.e_j);
                            if (textView != null) {
                                i = C0966R.C0970id.ea5;
                                WxRecyclerView wxRecyclerView2 = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.ea5);
                                if (wxRecyclerView2 != null) {
                                    i = C0966R.C0970id.ea8;
                                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.ea8);
                                    if (textView2 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                        i = C0966R.C0970id.h7q;
                                        Guideline guideline = (Guideline) C10462b.m10395a(findViewById, C0966R.C0970id.h7q);
                                        if (guideline != null) {
                                            i = C0966R.C0970id.h7r;
                                            MusicMVCardChooseView musicMVCardChooseView = (MusicMVCardChooseView) C10462b.m10395a(findViewById, C0966R.C0970id.h7r);
                                            if (musicMVCardChooseView != null) {
                                                i = C0966R.C0970id.h7z;
                                                Guideline guideline2 = (Guideline) C10462b.m10395a(findViewById, C0966R.C0970id.h7z);
                                                if (guideline2 != null) {
                                                    i = C0966R.C0970id.h8a;
                                                    Guideline guideline3 = (Guideline) C10462b.m10395a(findViewById, C0966R.C0970id.h8a);
                                                    if (guideline3 != null) {
                                                        i = C0966R.C0970id.h8b;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.h8b);
                                                        if (relativeLayout2 != null) {
                                                            i = C0966R.C0970id.h8i;
                                                            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.h8i);
                                                            if (linearLayout != null) {
                                                                i = C0966R.C0970id.hfc;
                                                                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.hfc);
                                                                if (linearLayout2 != null) {
                                                                    i = C0966R.C0970id.hfh;
                                                                    WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.hfh);
                                                                    if (weImageView2 != null) {
                                                                        return new C58255d(relativeLayout, frameLayout, mMRoundCornerImageView, weImageView, wxRecyclerView, textView, wxRecyclerView2, textView2, relativeLayout, guideline, musicMVCardChooseView, guideline2, guideline3, relativeLayout2, linearLayout, linearLayout2, weImageView2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMakerFixEditUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f163336h = C36568h.m40985a(new C57048i(appCompatActivity));
        this.f163337i = C36568h.m40985a(new C57055m(this));
        this.f163338j = C36568h.m40985a(new C57047h(appCompatActivity));
        this.f163339n = new C65257a();
        this.f163340o = new C57044e();
        this.f163341p = -1;
        this.f163342q = new C57052k(this);
    }

    /* renamed from: c3 */
    public static final void m65737c3(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, int i) {
        musicMvMakerFixEditUIC.getClass();
        C39622i0 a = C39818r.f106831a.mo62444c(musicMvMakerFixEditUIC.getActivity()).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…ycleScopeUIC::class.java)");
        LifecycleScope c3 = ((C65946a) a).mo89983c3();
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C63874y(i, musicMvMakerFixEditUIC, (C15601d<? super C63874y>) null), 2, (Object) null);
    }

    /* renamed from: d3 */
    public final boolean mo80473d3() {
        boolean z;
        ArrayList<C59811e> arrayList = this.f163333e;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (C59811e eVar : arrayList) {
                if (eVar.f170732o != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r8 = r7.objectDesc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0302, code lost:
        if (r8 != false) goto L_0x0304;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0286 A[SYNTHETIC] */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64621p23 mo80474e3(te3.C64621p23 r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            if (r2 == 0) goto L_0x0400
            te3.p23 r4 = new te3.p23
            r4.<init>()
            long r5 = r2.f184743h
            r4.f184743h = r5
            com.tencent.mm.protocal.protobuf.FinderObject r0 = new com.tencent.mm.protocal.protobuf.FinderObject
            r0.<init>()
            r4.f184739d = r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r2.f184739d
            java.lang.String r5 = "MicroMsg.Mv.MusicMvMakerFixEditUIC"
            r6 = 0
            if (r0 == 0) goto L_0x0035
            byte[] r0 = r0.toByteArray()
            if (r0 == 0) goto L_0x0035
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r4.f184739d     // Catch:{ Exception -> 0x002b }
            if (r7 == 0) goto L_0x0035
            r7.parseFrom(r0)     // Catch:{ Exception -> 0x002b }
            goto L_0x0035
        L_0x002b:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "createMvData"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r8, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0035:
            te3.hb1 r0 = r2.f184744i
            r4.f184744i = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r4.f184739d
            if (r7 == 0) goto L_0x0049
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r7.objectDesc
            if (r8 == 0) goto L_0x0049
            te3.hb1 r8 = r8.mvInfo
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            if (r8 != 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r8.f183461j = r6
        L_0x004f:
            if (r7 == 0) goto L_0x0060
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0060
            te3.hb1 r7 = r7.mvInfo
            if (r7 == 0) goto L_0x0060
            java.util.LinkedList<te3.mb1> r7 = r7.f183460i
            if (r7 == 0) goto L_0x0060
            r7.clear()
        L_0x0060:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r4.f184740e
            r7.clear()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r4.f184739d
            r8 = 1
            if (r7 == 0) goto L_0x0271
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0271
            te3.hb1 r7 = r7.mvInfo
            if (r7 == 0) goto L_0x0271
            java.util.LinkedList<te3.mb1> r7 = r7.f183455d
            if (r7 == 0) goto L_0x0271
            java.util.Iterator r7 = r7.iterator()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x007d:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x026f
            java.lang.Object r12 = r7.next()
            int r13 = r9 + 1
            if (r9 < 0) goto L_0x026a
            te3.mb1 r12 = (te3.C64550mb1) r12
            java.util.ArrayList<hb2.e> r14 = r1.f163333e
            java.lang.Object r14 = sx3.C110818d0.m150917O(r14, r9)
            hb2.e r14 = (hb2.C59811e) r14
            if (r14 == 0) goto L_0x0264
            hb2.e$h r15 = r14.f170731n
            if (r15 == 0) goto L_0x0264
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.mo84769b()
            if (r15 == 0) goto L_0x0264
            r16 = r4
            long r3 = r15.f164794id
            r12.f184260f = r3
            java.lang.String r3 = r15.objectNonceId
            r12.f184261g = r3
            java.util.ArrayList<hb2.e> r3 = r1.f163333e
            java.lang.Object r3 = r3.get(r9)
            hb2.e r3 = (hb2.C59811e) r3
            hb2.e$h r3 = r3.f170731n
            r17 = 0
            if (r3 == 0) goto L_0x00be
            long r3 = r3.mo84772e()
            goto L_0x00c0
        L_0x00be:
            r3 = r17
        L_0x00c0:
            r12.f184262h = r3
            java.util.ArrayList<hb2.e> r3 = r1.f163333e
            java.lang.Object r3 = r3.get(r9)
            hb2.e r3 = (hb2.C59811e) r3
            hb2.e$h r3 = r3.f170731n
            if (r3 == 0) goto L_0x00d6
            boolean r3 = r3.mo84770c()
            if (r3 != r8) goto L_0x00d6
            r3 = 1
            goto L_0x00d7
        L_0x00d6:
            r3 = 0
        L_0x00d7:
            r12.f184271t = r3
            java.util.ArrayList<hb2.e> r3 = r1.f163333e
            java.lang.Object r3 = r3.get(r9)
            hb2.e r3 = (hb2.C59811e) r3
            hb2.e$h r3 = r3.f170731n
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r3.mo84770c()
            if (r3 != r8) goto L_0x00ed
            r3 = 1
            goto L_0x00ee
        L_0x00ed:
            r3 = 0
        L_0x00ee:
            if (r3 == 0) goto L_0x014d
            java.util.ArrayList<hb2.e> r3 = r1.f163333e
            java.lang.Object r3 = r3.get(r9)
            hb2.e r3 = (hb2.C59811e) r3
            hb2.e$h r3 = r3.f170731n
            boolean r3 = r3 instanceof hb2.C59811e.C59821i
            if (r3 == 0) goto L_0x014d
            te3.nb1 r3 = new te3.nb1
            r3.<init>()
            java.util.ArrayList<hb2.e> r4 = r1.f163333e
            java.lang.Object r4 = r4.get(r9)
            hb2.e r4 = (hb2.C59811e) r4
            hb2.e$h r4 = r4.f170731n
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.mv.model.MusicMVVideoConvertData.LocalVideoData"
            gy3.C87412m.m108592e(r4, r9)
            hb2.e$i r4 = (hb2.C59811e.C59821i) r4
            java.lang.String r9 = r4.f170744b
            r3.f184450d = r9
            long r8 = r4.f170750h
            r3.f184451e = r8
            r12.f184272u = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "local_material_id:"
            r3.append(r8)
            java.lang.String r8 = r4.f170744b
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "local_material_time_offset_in_clip_ms:"
            r3.append(r8)
            long r8 = r4.f170750h
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x014d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "set finderMVTrack, timeOffsetInClipMs:"
            r3.append(r4)
            long r8 = r12.f184262h
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.lang.String r3 = r15.objectNonceId
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L_0x0223
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r15.objectDesc
            if (r3 != 0) goto L_0x0171
            goto L_0x0178
        L_0x0171:
            te3.hb1 r4 = new te3.hb1
            r4.<init>()
            r3.mvInfo = r4
        L_0x0178:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r15.objectDesc
            if (r3 == 0) goto L_0x017f
            te3.hb1 r4 = r3.mvInfo
            goto L_0x0180
        L_0x017f:
            r4 = 0
        L_0x0180:
            if (r4 != 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r4.f183461j = r6
        L_0x0185:
            if (r3 == 0) goto L_0x0192
            te3.hb1 r3 = r3.mvInfo
            if (r3 == 0) goto L_0x0192
            java.util.LinkedList<te3.mb1> r3 = r3.f183455d
            if (r3 == 0) goto L_0x0192
            r3.add(r12)
        L_0x0192:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r15.objectDesc
            r4 = 4
            if (r3 != 0) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            r3.mediaType = r4
        L_0x019a:
            if (r3 == 0) goto L_0x01a7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x01a7
            java.lang.Object r3 = r3.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            goto L_0x01a8
        L_0x01a7:
            r3 = 0
        L_0x01a8:
            if (r3 != 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            r3.mediaType = r4
        L_0x01ad:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r15.objectDesc
            if (r3 == 0) goto L_0x01bc
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x01bc
            java.lang.Object r3 = r3.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            goto L_0x01bd
        L_0x01bc:
            r3 = 0
        L_0x01bd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "ref object media size:"
            r4.append(r8)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r15.objectDesc
            if (r8 == 0) goto L_0x01d9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r8 = r8.media
            if (r8 == 0) goto L_0x01d9
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x01da
        L_0x01d9:
            r8 = 0
        L_0x01da:
            r4.append(r8)
            java.lang.String r8 = ", "
            r4.append(r8)
            if (r3 == 0) goto L_0x01e7
            java.lang.String r8 = r3.url
            goto L_0x01e8
        L_0x01e7:
            r8 = 0
        L_0x01e8:
            r4.append(r8)
            java.lang.String r8 = ", ["
            r4.append(r8)
            if (r3 == 0) goto L_0x01f9
            float r8 = r3.width
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x01fa
        L_0x01f9:
            r8 = 0
        L_0x01fa:
            r4.append(r8)
            r8 = 32
            r4.append(r8)
            if (r3 == 0) goto L_0x020b
            float r3 = r3.height
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            r4.append(r3)
            r3 = 93
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r3 = r16
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r3.f184740e
            r4.add(r15)
            goto L_0x0225
        L_0x0223:
            r3 = r16
        L_0x0225:
            long r8 = r15.f164794id
            int r4 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x0259
            java.lang.String r4 = r15.objectNonceId
            if (r4 == 0) goto L_0x023c
            java.lang.String r8 = "local_"
            boolean r4 = z04.C112551y.m153819s(r4, r8, r6)
            r8 = 1
            if (r4 != r8) goto L_0x023d
            r19 = 1
            goto L_0x023f
        L_0x023c:
            r8 = 1
        L_0x023d:
            r19 = 0
        L_0x023f:
            if (r19 == 0) goto L_0x0259
            r12.f184264j = r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "createMvData isFirstUpload "
            r4.append(r8)
            java.lang.String r8 = r15.objectNonceId
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
        L_0x0259:
            hb2.e r4 = r14.f170732o
            if (r4 == 0) goto L_0x0265
            if (r11 != 0) goto L_0x0265
            long r8 = r12.f184258d
            int r10 = (int) r8
            r11 = r15
            goto L_0x0265
        L_0x0264:
            r3 = r4
        L_0x0265:
            r4 = r3
            r9 = r13
            r8 = 1
            goto L_0x007d
        L_0x026a:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x026f:
            r3 = r4
            goto L_0x0274
        L_0x0271:
            r3 = r4
            r10 = 0
            r11 = 0
        L_0x0274:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r3.f184740e
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r2.f184740e
            java.lang.String r8 = "it.refObjectList"
            gy3.C87412m.m108593f(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0286:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02d8
            java.lang.Object r9 = r7.next()
            r12 = r9
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
            te3.hb1 r13 = r2.f184744i
            if (r13 == 0) goto L_0x02c4
            java.util.LinkedList<te3.mb1> r13 = r13.f183455d
            if (r13 == 0) goto L_0x02c4
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x02a4
        L_0x02a1:
            r13 = 0
        L_0x02a2:
            r14 = 1
            goto L_0x02c0
        L_0x02a4:
            java.util.Iterator r13 = r13.iterator()
        L_0x02a8:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x02a1
            java.lang.Object r14 = r13.next()
            te3.mb1 r14 = (te3.C64550mb1) r14
            java.lang.String r14 = r14.f184261g
            java.lang.String r15 = r12.objectNonceId
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 == 0) goto L_0x02a8
            r13 = 1
            goto L_0x02a2
        L_0x02c0:
            if (r13 != r14) goto L_0x02c4
            r13 = 1
            goto L_0x02c5
        L_0x02c4:
            r13 = 0
        L_0x02c5:
            if (r13 == 0) goto L_0x02d1
            java.lang.String r12 = r12.objectNonceId
            boolean r12 = r0.add(r12)
            if (r12 == 0) goto L_0x02d1
            r12 = 1
            goto L_0x02d2
        L_0x02d1:
            r12 = 0
        L_0x02d2:
            if (r12 == 0) goto L_0x0286
            r8.add(r9)
            goto L_0x0286
        L_0x02d8:
            r4.addAll(r8)
            java.lang.String r0 = r2.f184741f
            r3.f184741f = r0
            int r2 = r1.f163349x
            java.lang.String r4 = ".auto"
            if (r2 == 0) goto L_0x0304
            if (r0 == 0) goto L_0x02f2
            r2 = 2
            r7 = 0
            boolean r0 = z04.C112551y.m153808h(r0, r4, r6, r2, r7)
            r8 = 1
            if (r0 != r8) goto L_0x02f3
            r0 = 1
            goto L_0x02f4
        L_0x02f2:
            r8 = 1
        L_0x02f3:
            r0 = 0
        L_0x02f4:
            if (r0 != 0) goto L_0x0304
            java.lang.String r0 = r3.f184741f
            if (r0 == 0) goto L_0x0302
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0301
            goto L_0x0302
        L_0x0301:
            r8 = 0
        L_0x0302:
            if (r8 == 0) goto L_0x03ff
        L_0x0304:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r20.getActivity()
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<sb2.j0> r2 = sb2.C63774j0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            sb2.j0 r0 = (sb2.C63774j0) r0
            int r2 = r0.f180829x
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Bitmap r0 = r0.f180830y
            int r2 = r2.intValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "originCoverPath:"
            r7.append(r8)
            java.lang.String r8 = r3.f184741f
            r7.append(r8)
            java.lang.String r8 = ", fromScene:"
            r7.append(r8)
            int r8 = r1.f163349x
            r7.append(r8)
            java.lang.String r8 = ", thumbObj:"
            r7.append(r8)
            r7.append(r11)
            java.lang.String r8 = ", thumbMvTime:"
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = " firstRenderTime:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ", firstRenderFrame:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            if (r2 > r10) goto L_0x03de
            if (r0 == 0) goto L_0x03de
            if (r11 == 0) goto L_0x036d
            java.lang.String r2 = r11.objectNonceId
            if (r2 != 0) goto L_0x0375
        L_0x036d:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L_0x0375:
            java.lang.String r7 = "thumbObj?.objectNonceId …D.randomUUID().toString()"
            gy3.C87412m.m108593f(r2, r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            ma2.t r8 = ma2.C61454t.f174766a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "thumb_"
            r9.append(r10)
            java.nio.charset.Charset r10 = z04.C119027c.f356488a
            byte[] r2 = r2.getBytes(r10)
            java.lang.String r10 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r10)
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            java.lang.String r2 = r8.mo86430b(r2)
            r7.<init>((java.lang.String) r2)
            java.lang.String r2 = r7.mo119971i()
            java.lang.String r7 = "VFSFile(MusicFileNameUti…Array())}\")).absolutePath"
            gy3.C87412m.m108593f(r2, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r7.append(r4)
            java.lang.String r2 = r7.toString()
            r4 = 70
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r4, r7, r2, r6)
            r3.f184741f = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "auto generate thumb succeed: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x03ff
        L_0x03de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "current firstRenderTime["
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = "] large than thumbMvTime["
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = "], do not generate thumb!"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x03ff:
            return r3
        L_0x0400:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC.mo80474e3(te3.p23):te3.p23");
    }

    /* renamed from: f3 */
    public final WxRecyclerAdapter<C59811e> mo80475f3() {
        return (WxRecyclerAdapter) ((C36570n) this.f163335g).getValue();
    }

    /* renamed from: g3 */
    public final WxRecyclerView mo80476g3() {
        return (WxRecyclerView) ((C36570n) this.f163332d).getValue();
    }

    /* renamed from: i3 */
    public final void mo80477i3(int i, C59811e eVar, C32226l<? super C59826g, C13598b0> lVar) {
        ImageView imageView;
        View findViewByPosition = ((LinearLayoutManager) ((C36570n) this.f163336h).getValue()).findViewByPosition(i);
        if (findViewByPosition != null && (imageView = (ImageView) findViewByPosition.findViewById(C0966R.C0970id.h85)) != null) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            C59811e.C59819g gVar = eVar.f170730j;
            if (gVar != null) {
                gVar.mo84764a(imageView, new C57049j(imageView, lVar));
            }
        }
    }

    /* renamed from: j3 */
    public final void mo80478j3() {
        C59338a effector;
        C60695a player;
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "pauseVideo");
        RecyclerView.C16631z I0 = mo80476g3().mo17023I0(this.f163341p);
        if (I0 != null) {
            View findViewById = I0.f44854d.findViewById(C0966R.C0970id.h7c);
            C60239b bVar = null;
            C60699c cVar = findViewById instanceof C60699c ? (C60699c) findViewById : null;
            if (cVar != null) {
                C60695a player2 = cVar.getPlayer();
                if (player2 != null) {
                    C60695a.C60696a.m71001d(player2, (C32224a) null, 1, (Object) null);
                }
                C60695a player3 = cVar.getPlayer();
                if (player3 != null) {
                    player3.stop();
                }
            }
            int i = this.f163341p;
            if (i >= 0) {
                C59811e eVar = this.f163333e.get(i);
                C87412m.m108593f(eVar, "dataList[lastPos]");
                C59811e eVar2 = eVar;
                C60699c cVar2 = this.f163348w;
                C60238a reportInfo = (cVar2 == null || (player = cVar2.getPlayer()) == null) ? null : player.getReportInfo();
                C60699c cVar3 = this.f163348w;
                if (!(cVar3 == null || (effector = cVar3.getEffector()) == null)) {
                    bVar = effector.getReportInfo();
                }
                C59833q.f170832a.mo84798j(getActivity(), this.f163344s, this.f163341p, eVar2, reportInfo, bVar);
            }
        }
    }

    /* renamed from: k3 */
    public final void mo80479k3(int i) {
        int i2 = this.f163341p;
        if (i != i2) {
            C59811e eVar = (C59811e) C110818d0.m150917O(this.f163333e, i2);
            if (eVar != null && eVar.f170728h) {
                eVar.f170728h = false;
                eVar.f170729i = false;
                RecyclerView.C16631z I0 = mo80476g3().mo17023I0(this.f163341p);
                if (I0 instanceof C60905o) {
                    C61639a.f175284h.mo86585a((C60905o) I0, eVar);
                }
            }
            C59811e eVar2 = (C59811e) C110818d0.m150917O(this.f163333e, i);
            if (eVar2 != null && !eVar2.f170728h) {
                eVar2.f170728h = true;
                eVar2.f170729i = true;
                RecyclerView.C16631z I02 = mo80476g3().mo17023I0(i);
                if (I02 instanceof C60905o) {
                    C61639a.f175284h.mo86585a((C60905o) I02, eVar2);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onActivityResult, requestCodec:" + i + ", resultCodec:" + i2);
        if (i == 1024) {
            C99364n.m129616h().mo138822a().resume();
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C57054l(this, intent, i2, (C15601d<? super C57054l>) null), 2, (Object) null);
        }
    }

    public boolean onBackPressed() {
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(C63844s.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…MakerDataUIC::class.java)");
        Integer value = ((C63844s) a).mo88633c3().getValue();
        if (value == null || value.intValue() != 0) {
            return false;
        }
        ((C63845s0) rVar.mo62444c(getActivity()).mo75002a(C63845s0.class)).mo88636c3(mo80474e3(this.f163344s), this.f163346u, 2);
        return true;
    }

    public void onDestroy() {
        C59338a effector;
        C60695a player;
        super.onDestroy();
        C60699c cVar = this.f163348w;
        if (!(cVar == null || (player = cVar.getPlayer()) == null)) {
            player.recycle();
        }
        C60699c cVar2 = this.f163348w;
        if (cVar2 != null && (effector = cVar2.getEffector()) != null) {
            effector.release();
        }
    }

    public void onPause() {
        super.onPause();
        mo80478j3();
        C99364n.m129616h().mo138828g(this.f163342q);
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "resumeVideo");
        mo80475f3().notifyItemChanged(this.f163339n.f187878m);
        C99364n.m129616h().mo138823b(this.f163342q);
    }
}
