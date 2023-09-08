package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.music.p080ui.transition.GravityArcMotion;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.model.flex.MusicMvFlexLiveList;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMachineFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyFavFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyLikeFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyPostFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabSearchFragment;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import hb2.C59822f;
import hb2.C59826g;
import hb2.C59828h;
import hb2.C59833q;
import ib2.C60265a;
import ib2.C60268b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import la2.C99364n;
import nj3.C88989a;
import o40.C61926c;
import p1136n3.C109678b;
import p529fv.C59330q;
import p529fv.C59331r;
import p640ox.C77049b;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63740a0;
import sb2.C63742b0;
import sb2.C63757e0;
import sb2.C63759f0;
import sb2.C63774j0;
import sb2.C63844s;
import sb2.C63845s0;
import sb2.C63872x;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C48501y0;
import te3.C50480n13;
import te3.C64488kb1;
import te3.C64621p23;
import te3.C64793w23;
import wb2.C65946a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMakerUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$a;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(33)
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI */
public final class MusicMvMakerUI extends BaseMusicMvUI implements MusicMVCardChooseView.C57080a {

    /* renamed from: u */
    public static int f163030u;

    /* renamed from: e */
    public final C13601g f163031e = C36568h.m40985a(new C56915i(this));

    /* renamed from: f */
    public final C13601g f163032f = C36568h.m40985a(new C56913g(this));

    /* renamed from: g */
    public final C13601g f163033g = C36568h.m40985a(new C56908c(this));

    /* renamed from: h */
    public final C13601g f163034h = C36568h.m40985a(new C56917k(this));

    /* renamed from: i */
    public final C13601g f163035i = C36568h.m40985a(new C56918l(this));

    /* renamed from: j */
    public final C13601g f163036j = C36568h.m40985a(new C56912f(this));

    /* renamed from: n */
    public final C13601g f163037n = C36568h.m40985a(new C56906a(this));

    /* renamed from: o */
    public final C13601g f163038o = C36568h.m40985a(new C56907b(this));

    /* renamed from: p */
    public final C13601g f163039p = C36568h.m40985a(new C56914h(this));

    /* renamed from: q */
    public final C13601g f163040q = C36568h.m40985a(new C56909d(this));

    /* renamed from: r */
    public int f163041r;

    /* renamed from: s */
    public final C0120a0<Integer> f163042s = new C56916j(this);

    /* renamed from: t */
    public final C56934w f163043t = new C56934w(this);

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$a */
    public static final class C56906a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56906a(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163044d = musicMvMakerUI;
        }

        public Object invoke() {
            return this.f163044d.findViewById(C0966R.C0970id.f5670le);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$b */
    public static final class C56907b extends C87413o implements C32224a<MMRoundCornerImageView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56907b(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163045d = musicMvMakerUI;
        }

        public Object invoke() {
            return (MMRoundCornerImageView) this.f163045d.findViewById(C0966R.C0970id.f5671lf);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$c */
    public static final class C56908c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56908c(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163046d = musicMvMakerUI;
        }

        public Object invoke() {
            return this.f163046d.findViewById(C0966R.C0970id.apv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$d */
    public static final class C56909d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56909d(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163047d = musicMvMakerUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f163047d.findViewById(C0966R.C0970id.e_b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$e */
    public static final class C56910e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163048d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f163049e;

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$e$a */
        public static final class C56911a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerUI f163050d;

            public C56911a(MusicMvMakerUI musicMvMakerUI) {
                this.f163050d = musicMvMakerUI;
            }

            public final void run() {
                MusicMvMakerUI musicMvMakerUI = this.f163050d;
                int i = MusicMvMakerUI.f163030u;
                View K7 = musicMvMakerUI.mo80362K7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = K7;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$makeMediaThumbTransition$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$makeMediaThumbTransition$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C56910e(MusicMvMakerUI musicMvMakerUI, C32224a<C13598b0> aVar) {
            this.f163048d = musicMvMakerUI;
            this.f163049e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            MusicMvMakerUI musicMvMakerUI = this.f163048d;
            int i = MusicMvMakerUI.f163030u;
            musicMvMakerUI.mo80363L7().animate().alpha(0.0f).setDuration(200).withEndAction(new C56911a(this.f163048d)).start();
            C32224a<C13598b0> aVar = this.f163049e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$f */
    public static final class C56912f extends C87413o implements C32224a<MusicMVCardChooseView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56912f(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163051d = musicMvMakerUI;
        }

        public Object invoke() {
            return (MusicMVCardChooseView) this.f163051d.findViewById(C0966R.C0970id.h7r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$g */
    public static final class C56913g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56913g(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163052d = musicMvMakerUI;
        }

        public Object invoke() {
            return this.f163052d.findViewById(C0966R.C0970id.h7z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$h */
    public static final class C56914h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56914h(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163053d = musicMvMakerUI;
        }

        public Object invoke() {
            return (ImageView) this.f163053d.findViewById(C0966R.C0970id.f358818h82);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$i */
    public static final class C56915i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56915i(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163054d = musicMvMakerUI;
        }

        public Object invoke() {
            return this.f163054d.findViewById(C0966R.C0970id.h8a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$j */
    public static final class C56916j<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163055d;

        public C56916j(MusicMvMakerUI musicMvMakerUI) {
            this.f163055d = musicMvMakerUI;
        }

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f163055d).mo75002a(C63759f0.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…rFlexEditUIC::class.java)");
            C63759f0 f0Var = (C63759f0) a;
            C39622i0 a2 = rVar.mo62444c(this.f163055d).mo75002a(MusicMvMakerFixEditUIC.class);
            C87412m.m108593f(a2, "UICProvider.of(this).get…erFixEditUIC::class.java)");
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) a2;
            if (num != null && num.intValue() == 1) {
                ((WxRecyclerView) ((C36570n) f0Var.f180774j).getValue()).setVisibility(0);
                musicMvMakerFixEditUIC.mo80476g3().setVisibility(8);
                MusicMvMakerUI musicMvMakerUI = this.f163055d;
                int i = MusicMvMakerUI.f163030u;
                MusicMVCardChooseView M7 = musicMvMakerUI.mo80365M7();
                if (M7 != null) {
                    if (!M7.f163460D) {
                        MusicMVCardChooseView.m65780r(M7, M7.f163475R0, M7.f163479T0, false, (C32226l) null, (C32224a) null, 28, (Object) null);
                    }
                    M7.f163496p0 = 3;
                    M7.mo80521l();
                    M7.mo80525p(true, 2000);
                    MusicMvTabMachineFragment musicMvTabMachineFragment = M7.f163503w;
                    if (musicMvTabMachineFragment != null) {
                        musicMvTabMachineFragment.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyPostFragment musicMvTabMyPostFragment = M7.f163504x;
                    if (musicMvTabMyPostFragment != null) {
                        musicMvTabMyPostFragment.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyFavFragment musicMvTabMyFavFragment = M7.f163506y;
                    if (musicMvTabMyFavFragment != null) {
                        musicMvTabMyFavFragment.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = M7.f163508z;
                    if (musicMvTabMyLikeFragment != null) {
                        musicMvTabMyLikeFragment.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabSearchFragment musicMvTabSearchFragment = M7.f163495p;
                    if (musicMvTabSearchFragment != null) {
                        musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
                    }
                }
            } else if (num != null && num.intValue() == 0) {
                ((WxRecyclerView) ((C36570n) f0Var.f180774j).getValue()).setVisibility(8);
                musicMvMakerFixEditUIC.mo80476g3().setVisibility(0);
                if (musicMvMakerFixEditUIC.f163339n.f187878m == -1) {
                    musicMvMakerFixEditUIC.mo80476g3().post(new C63872x(musicMvMakerFixEditUIC));
                }
                MusicMvMakerUI musicMvMakerUI2 = this.f163055d;
                int i2 = MusicMvMakerUI.f163030u;
                MusicMVCardChooseView M72 = musicMvMakerUI2.mo80365M7();
                if (M72 != null) {
                    if (!M72.f163460D) {
                        MusicMVCardChooseView.m65780r(M72, M72.f163479T0, M72.f163475R0, false, (C32226l) null, (C32224a) null, 28, (Object) null);
                    }
                    M72.f163496p0 = 2;
                    M72.mo80521l();
                    M72.mo80525p(false, MusicMVCardChooseView.f163455X0);
                    MusicMvTabMachineFragment musicMvTabMachineFragment2 = M72.f163503w;
                    if (musicMvTabMachineFragment2 != null) {
                        musicMvTabMachineFragment2.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyPostFragment musicMvTabMyPostFragment2 = M72.f163504x;
                    if (musicMvTabMyPostFragment2 != null) {
                        musicMvTabMyPostFragment2.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyFavFragment musicMvTabMyFavFragment2 = M72.f163506y;
                    if (musicMvTabMyFavFragment2 != null) {
                        musicMvTabMyFavFragment2.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabMyLikeFragment musicMvTabMyLikeFragment2 = M72.f163508z;
                    if (musicMvTabMyLikeFragment2 != null) {
                        musicMvTabMyLikeFragment2.getAdapter().notifyDataSetChanged();
                    }
                    MusicMvTabSearchFragment musicMvTabSearchFragment2 = M72.f163495p;
                    if (musicMvTabSearchFragment2 != null) {
                        musicMvTabSearchFragment2.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$k */
    public static final class C56917k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56917k(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163056d = musicMvMakerUI;
        }

        public Object invoke() {
            return this.f163056d.findViewById(C0966R.C0970id.hfc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$l */
    public static final class C56918l extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56918l(MusicMvMakerUI musicMvMakerUI) {
            super(0);
            this.f163057d = musicMvMakerUI;
        }

        public Object invoke() {
            return (WeImageView) this.f163057d.findViewById(C0966R.C0970id.hfh);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$m */
    public static final class C56919m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163058d;

        /* renamed from: e */
        public final /* synthetic */ GalleryItem$MediaItem f163059e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56919m(MusicMvMakerUI musicMvMakerUI, GalleryItem$MediaItem galleryItem$MediaItem) {
            super(0);
            this.f163058d = musicMvMakerUI;
            this.f163059e = galleryItem$MediaItem;
        }

        public Object invoke() {
            Class cls = MusicMvMakerFixEditUIC.class;
            C39818r rVar = C39818r.f106831a;
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163058d).mo75002a(cls);
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) this.f163059e;
            musicMvMakerFixEditUIC.getClass();
            C87412m.m108594g(galleryItem$VideoMediaItem, "data");
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateAlbumItem:" + galleryItem$VideoMediaItem);
            if (musicMvMakerFixEditUIC.f163333e.size() != 0) {
                int i = musicMvMakerFixEditUIC.f163339n.f187878m;
                C59811e eVar = musicMvMakerFixEditUIC.f163333e.get(i);
                C87412m.m108593f(eVar, "dataList[pos]");
                C59811e eVar2 = eVar;
                C59811e eVar3 = new C59811e();
                C59811e.f170722p.mo84767c(eVar2, eVar3);
                C59811e eVar4 = musicMvMakerFixEditUIC.f163334f.get(i);
                C87412m.m108593f(eVar4, "initMusicDataList[pos]");
                C59811e eVar5 = eVar4;
                eVar3.f170732o = eVar2;
                musicMvMakerFixEditUIC.f163333e.set(i, eVar3);
                eVar3.f170727g = 1;
                eVar3.f170730j = new C59811e.C59818f(galleryItem$VideoMediaItem);
                String b = galleryItem$VideoMediaItem.mo11841b();
                C87412m.m108593f(b, "videoItem.uniqueValue()");
                String str = galleryItem$VideoMediaItem.f162747d;
                C87412m.m108593f(str, "videoItem.originalPath");
                C59811e.C59821i iVar = new C59811e.C59821i(b, str, (long) galleryItem$VideoMediaItem.f162766w, 0, 0, 24, (C8480h) null);
                iVar.f170746d = galleryItem$VideoMediaItem.f162768y;
                iVar.f170747e = galleryItem$VideoMediaItem.f162767x;
                eVar3.f170731n = iVar;
                MvCreateReportHelper.f163005a.mo80351b(i, eVar3);
                musicMvMakerFixEditUIC.mo80477i3(i, eVar3, new C63740a0(musicMvMakerFixEditUIC, i, eVar3));
            }
            ((MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163058d).mo75002a(cls)).f163346u = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$n */
    public static final class C56920n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163060d;

        public C56920n(MusicMvMakerUI musicMvMakerUI) {
            this.f163060d = musicMvMakerUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f163060d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$o */
    public static final class C56921o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163061d;

        public C56921o(MusicMvMakerUI musicMvMakerUI) {
            this.f163061d = musicMvMakerUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMvMakerUI.m65639H7(this.f163061d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$p */
    public static final class C56922p<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ TextView f163062d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvMakerUI f163063e;

        /* renamed from: f */
        public final /* synthetic */ TextView f163064f;

        public C56922p(TextView textView, MusicMvMakerUI musicMvMakerUI, TextView textView2) {
            this.f163062d = textView;
            this.f163063e = musicMvMakerUI;
            this.f163064f = textView2;
        }

        public void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                TextView textView = this.f163062d;
                if (textView != null) {
                    textView.setTextColor(this.f163063e.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                }
                TextView textView2 = this.f163064f;
                if (textView2 != null) {
                    textView2.setTextColor(this.f163063e.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                }
                MusicMvMakerUI.m65640I7(this.f163063e);
                return;
            }
            TextView textView3 = this.f163064f;
            if (textView3 != null) {
                textView3.setTextColor(this.f163063e.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            }
            TextView textView4 = this.f163062d;
            if (textView4 != null) {
                textView4.setTextColor(this.f163063e.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
            MusicMvMakerUI musicMvMakerUI = this.f163063e;
            int i = MusicMvMakerUI.f163030u;
            musicMvMakerUI.getClass();
            ArrayList<T> arrayList = ((C63759f0) C39818r.f106831a.mo62444c(musicMvMakerUI).mo75002a(C63759f0.class)).f180772h.f272353o;
            boolean z2 = false;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C60265a) it.next()).f171813e != 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            musicMvMakerUI.mo80367O7(z2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$q */
    public static final class C56923q<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163065d;

        /* renamed from: e */
        public final /* synthetic */ C63759f0 f163066e;

        /* renamed from: f */
        public final /* synthetic */ C65946a f163067f;

        /* renamed from: g */
        public final /* synthetic */ MusicMvMakerFixEditUIC f163068g;

        /* renamed from: h */
        public final /* synthetic */ C63844s f163069h;

        public C56923q(MusicMvMakerUI musicMvMakerUI, C63759f0 f0Var, C65946a aVar, MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, C63844s sVar) {
            this.f163065d = musicMvMakerUI;
            this.f163066e = f0Var;
            this.f163067f = aVar;
            this.f163068g = musicMvMakerFixEditUIC;
            this.f163069h = sVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: java.lang.Integer} */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0064, code lost:
            r5 = (r5 = r5.objectDesc).mvInfo;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0193, code lost:
            if (r12 == null) goto L_0x0195;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r37) {
            /*
                r36 = this;
                r0 = r36
                r1 = r37
                te3.p23 r1 = (te3.C64621p23) r1
                java.lang.Class<fv.r> r2 = p529fv.C59331r.class
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI r3 = r0.f163065d
                sb2.f0 r4 = r0.f163066e
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$w r5 = r3.f163043t
                r4.f180776o = r5
                android.content.Intent r5 = r4.getIntent()
                java.lang.String r6 = "key_mv_from_scene"
                r7 = 0
                r5.getIntExtra(r6, r7)
                rx3.g r5 = r4.f180774j
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r5
                rx3.g r8 = r4.f180775n
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                com.tencent.mm.view.recyclerview.WxLinearLayoutManager r8 = (com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager) r8
                r5.setLayoutManager(r8)
                rx3.g r5 = r4.f180774j
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r5
                zb2.m<ib2.a> r8 = r4.f180773i
                r5.setAdapter(r8)
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r5 = r4.f180772h
                androidx.lifecycle.LiveData<ac2.j<T>> r5 = r5.f272358t
                androidx.appcompat.app.AppCompatActivity r8 = r4.getActivity()
                sb2.g0 r9 = new sb2.g0
                r9.<init>(r4)
                r5.observe(r8, r9)
                sb2.f0 r4 = r0.f163066e
                java.lang.String r5 = "trackData"
                gy3.C87412m.m108593f(r1, r5)
                r4.getClass()
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r1.f184739d
                r8 = 1
                if (r5 == 0) goto L_0x006e
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
                if (r5 == 0) goto L_0x006e
                te3.hb1 r5 = r5.mvInfo
                if (r5 == 0) goto L_0x006e
                int r5 = r5.f183461j
                if (r5 != r8) goto L_0x006e
                r5 = 1
                goto L_0x006f
            L_0x006e:
                r5 = 0
            L_0x006f:
                java.lang.String r9 = "trackData.refObjectList"
                r11 = 0
                if (r5 != 0) goto L_0x0078
                goto L_0x0274
            L_0x0078:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r14 = r1.f184740e
                gy3.C87412m.m108593f(r14, r9)
                java.util.Iterator r14 = r14.iterator()
            L_0x0086:
                boolean r15 = r14.hasNext()
                java.lang.String r10 = ""
                if (r15 == 0) goto L_0x009e
                java.lang.Object r15 = r14.next()
                com.tencent.mm.protocal.protobuf.FinderObject r15 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r15
                java.lang.String r13 = r15.objectNonceId
                if (r13 != 0) goto L_0x0099
                goto L_0x009a
            L_0x0099:
                r10 = r13
            L_0x009a:
                r5.put(r10, r15)
                goto L_0x0086
            L_0x009e:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "initDraftSelectItem "
                r13.append(r14)
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r1.f184739d
                if (r14 == 0) goto L_0x00c1
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r14 = r14.objectDesc
                if (r14 == 0) goto L_0x00c1
                te3.hb1 r14 = r14.mvInfo
                if (r14 == 0) goto L_0x00c1
                java.util.LinkedList<te3.mb1> r14 = r14.f183460i
                if (r14 == 0) goto L_0x00c1
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x00c2
            L_0x00c1:
                r14 = 0
            L_0x00c2:
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "MicroMsg.Mv.MusicMvMakerFlexEditUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
                com.tencent.mm.protocal.protobuf.FinderObject r13 = r1.f184739d
                if (r13 == 0) goto L_0x0274
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r13 = r13.objectDesc
                if (r13 == 0) goto L_0x0274
                te3.hb1 r13 = r13.mvInfo
                if (r13 == 0) goto L_0x0274
                java.util.LinkedList<te3.mb1> r13 = r13.f183460i
                if (r13 == 0) goto L_0x0274
                java.util.Iterator r13 = r13.iterator()
                r14 = 0
            L_0x00e3:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x0274
                java.lang.Object r15 = r13.next()
                int r16 = r14 + 1
                if (r14 < 0) goto L_0x026f
                te3.mb1 r15 = (te3.C64550mb1) r15
                java.lang.String r8 = r15.f184261g
                java.lang.Object r8 = r5.get(r8)
                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                if (r8 == 0) goto L_0x0266
                r17 = r8
                long r7 = r15.f184260f
                int r18 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r18 != 0) goto L_0x01fe
                ib2.a r7 = new ib2.a
                java.lang.String r8 = r15.f184261g
                if (r8 != 0) goto L_0x010e
                r20 = r10
                goto L_0x0110
            L_0x010e:
                r20 = r8
            L_0x0110:
                r21 = 1
                long r18 = java.lang.System.currentTimeMillis()
                long r11 = (long) r14
                long r22 = r18 + r11
                r24 = 0
                r19 = r7
                r19.<init>(r20, r21, r22, r24)
                ib2.a$a r8 = new ib2.a$a
                r26 = 0
                r28 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 63
                r35 = 0
                r25 = r8
                r25.<init>(r26, r28, r30, r31, r32, r33, r34, r35)
                r7.f171816h = r8
                java.lang.String r11 = r15.f184261g     // Catch:{ Exception -> 0x014a }
                if (r11 == 0) goto L_0x014b
                java.lang.String r12 = "local_"
                r14 = 0
                java.lang.String r11 = z04.C112551y.m153814n(r11, r12, r10, r14)     // Catch:{ Exception -> 0x014a }
                long r11 = java.lang.Long.parseLong(r11)     // Catch:{ Exception -> 0x014a }
                goto L_0x014d
            L_0x014a:
            L_0x014b:
                r11 = 0
            L_0x014d:
                r8.f171820a = r11
                r8 = r17
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
                if (r8 == 0) goto L_0x01f0
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r8 = r8.media
                if (r8 == 0) goto L_0x01f0
                java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
                com.tencent.mm.protocal.protobuf.FinderMedia r8 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r8
                if (r8 == 0) goto L_0x01f0
                ib2.a$a r11 = r7.f171816h
                if (r11 != 0) goto L_0x0166
                goto L_0x016a
            L_0x0166:
                java.lang.String r12 = r8.url
                r11.f171822c = r12
            L_0x016a:
                if (r11 != 0) goto L_0x016d
                goto L_0x0172
            L_0x016d:
                float r12 = r8.width
                int r12 = (int) r12
                r11.f171824e = r12
            L_0x0172:
                if (r11 != 0) goto L_0x0175
                goto L_0x017a
            L_0x0175:
                float r12 = r8.height
                int r12 = (int) r12
                r11.f171825f = r12
            L_0x017a:
                if (r11 != 0) goto L_0x017d
                goto L_0x019d
            L_0x017d:
                java.lang.String r12 = r8.decodeKey
                if (r12 == 0) goto L_0x0195
                boolean r14 = z04.C112551y.m153811k(r12)
                r15 = 1
                r14 = r14 ^ r15
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x0192
                goto L_0x0193
            L_0x0192:
                r12 = 0
            L_0x0193:
                if (r12 != 0) goto L_0x0197
            L_0x0195:
                java.lang.String r12 = "0"
            L_0x0197:
                long r14 = java.lang.Long.parseLong(r12)
                r11.f171821b = r14
            L_0x019d:
                int r11 = r8.videoDuration
                r7.f171818j = r11
                if (r11 <= 0) goto L_0x01d3
                ib2.a$a r11 = r7.f171816h
                if (r11 != 0) goto L_0x01a8
                goto L_0x01f0
            L_0x01a8:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r12 = new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem
                r12.<init>()
                ib2.a$a r14 = r7.f171816h
                if (r14 == 0) goto L_0x01b4
                long r14 = r14.f171820a
                goto L_0x01b6
            L_0x01b4:
                r14 = 0
            L_0x01b6:
                r12.f162751h = r14
                int r14 = r8.videoDuration
                java.lang.String r15 = r8.url
                r12.f162747d = r15
                r12.f162750g = r15
                int r15 = r8.bitrate
                r12.f162763C = r15
                float r15 = r8.width
                int r15 = (int) r15
                r12.f162768y = r15
                float r8 = r8.height
                int r8 = (int) r8
                r12.f162767x = r8
                r12.f162766w = r14
                r11.f171823d = r12
                goto L_0x01f0
            L_0x01d3:
                ib2.a$a r11 = r7.f171816h
                if (r11 != 0) goto L_0x01d8
                goto L_0x01f0
            L_0x01d8:
                com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r12 = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem
                r12.<init>()
                ib2.a$a r14 = r7.f171816h
                if (r14 == 0) goto L_0x01e4
                long r14 = r14.f171820a
                goto L_0x01e6
            L_0x01e4:
                r14 = 0
            L_0x01e6:
                r12.f162751h = r14
                java.lang.String r8 = r8.url
                r12.f162747d = r8
                r12.f162750g = r8
                r11.f171823d = r12
            L_0x01f0:
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r8 = r4.f180772h
                r11 = 2
                r12 = 0
                r14 = 0
                com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119209l(r8, r7, r14, r11, r12)
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r7 = r4.f180772h
                r7.mo80353u()
                goto L_0x0266
            L_0x01fe:
                r8 = r17
                ib2.a r7 = new ib2.a
                long r11 = r8.f164794id
                java.lang.String r18 = o40.C61926c.m72691p(r11)
                r19 = 2
                long r11 = java.lang.System.currentTimeMillis()
                long r14 = (long) r14
                long r20 = r11 + r14
                r22 = -1
                r17 = r7
                r17.<init>(r18, r19, r20, r22)
                ib2.a$b r11 = new ib2.a$b
                r12 = 3
                r14 = 0
                r11.<init>(r14, r14, r12, r14)
                r7.f171817i = r11
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r8.objectDesc
                if (r11 == 0) goto L_0x0258
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r11.media
                if (r11 == 0) goto L_0x0258
                java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
                com.tencent.mm.protocal.protobuf.FinderMedia r11 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r11
                if (r11 == 0) goto L_0x0258
                ib2.a$b r12 = r7.f171817i
                if (r12 != 0) goto L_0x0236
                goto L_0x024b
            L_0x0236:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = r11.thumbUrl
                r14.append(r15)
                java.lang.String r15 = r11.thumb_url_token
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r12.f171826a = r14
            L_0x024b:
                ib2.a$b r12 = r7.f171817i
                if (r12 != 0) goto L_0x0250
                goto L_0x0252
            L_0x0250:
                r12.f171827b = r8
            L_0x0252:
                int r8 = r11.videoDuration
                int r8 = r8 * 1000
                r7.f171818j = r8
            L_0x0258:
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r8 = r4.f180772h
                r11 = 2
                r12 = 0
                r14 = 0
                com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119209l(r8, r7, r14, r11, r12)
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r7 = r4.f180772h
                r7.mo80353u()
                goto L_0x0267
            L_0x0266:
                r12 = 0
            L_0x0267:
                r14 = r16
                r7 = 0
                r8 = 1
                r11 = 0
                goto L_0x00e3
            L_0x026f:
                r12 = 0
                sx3.C64197v.m75542k()
                throw r12
            L_0x0274:
                wb2.a r4 = r0.f163067f
                com.tencent.mm.sdk.coroutines.LifecycleScope r10 = r4.mo89983c3()
                a14.h0 r4 = a14.C53872d1.f151117a
                a14.k2 r11 = f14.C58901s.f168555a
                r12 = 0
                com.tencent.mm.plugin.mv.ui.a r13 = new com.tencent.mm.plugin.mv.ui.a
                sb2.f0 r4 = r0.f163066e
                sb2.s r5 = r0.f163069h
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI r7 = r0.f163065d
                r8 = 0
                r13.<init>(r4, r5, r7, r8)
                r14 = 2
                r15 = 0
                a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r4 = r0.f163068g
                r4.f163344s = r1
                sb2.s r5 = r0.f163069h
                xh.n6 r5 = r5.f180974d
                r4.f163345t = r5
                android.content.Intent r5 = r4.getIntent()
                r7 = 0
                int r5 = r5.getIntExtra(r6, r7)
                r4.f163349x = r5
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                r6 = 0
                r5.setItemAnimator(r6)
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                rx3.g r6 = r4.f163336h
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
                r5.setLayoutManager(r6)
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r6 = r4.mo80475f3()
                r5.setAdapter(r6)
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$e r6 = r4.f163340o
                r6.getClass()
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 70
                int r6 = kg3.C76577a.m92151b(r6, r7)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$e r8 = r4.f163340o
                r8.getClass()
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r7 = kg3.C76577a.m92151b(r8, r7)
                r8 = 0
                r5.setPadding(r6, r8, r7, r8)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$e r5 = r4.f163340o
                android.app.Activity r6 = r4.getContext()
                int r6 = kg3.C76577a.m92145A(r6)
                r5.f163351a = r6
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                sb2.u r6 = new sb2.u
                r6.<init>(r4)
                r5.addOnLayoutChangeListener(r6)
                com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.mo80476g3()
                rx3.g r6 = r4.f163338j
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                ya2.f r6 = (ya2.C15942f) r6
                r5.mo17085h0(r6)
                ub2.a r5 = r4.f163339n
                sb2.v r6 = new sb2.v
                r6.<init>(r4)
                r5.f187880o = r6
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r4.mo80475f3()
                sb2.w r6 = new sb2.w
                r6.<init>(r4)
                r5.registerAdapterDataObserver(r6)
                te3.p23 r5 = r4.f163344s
                if (r5 == 0) goto L_0x04b0
                hb2.e$b r7 = hb2.C59811e.f170722p
                xh.n6 r8 = r4.f163345t
                r7.getClass()
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                if (r8 == 0) goto L_0x0351
                java.lang.Class<fv.p> r11 = p529fv.C59329p.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                fv.p r11 = (p529fv.C59329p) r11
                r12 = 0
                ma2.s r8 = r11.is0(r8, r12)
                if (r8 != 0) goto L_0x0352
            L_0x0351:
                r8 = 0
            L_0x0352:
                com.tencent.mm.protocal.protobuf.FinderObject r11 = r5.f184739d
                if (r11 == 0) goto L_0x03ca
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
                if (r11 == 0) goto L_0x03ca
                te3.hb1 r11 = r11.mvInfo
                if (r11 == 0) goto L_0x03ca
                java.util.LinkedList<te3.mb1> r11 = r11.f183455d
                if (r11 == 0) goto L_0x03ca
                java.util.Iterator r11 = r11.iterator()
                r12 = 0
            L_0x0367:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x03ca
                java.lang.Object r13 = r11.next()
                int r14 = r12 + 1
                if (r12 < 0) goto L_0x03c5
                te3.mb1 r13 = (te3.C64550mb1) r13
                hb2.e$b r15 = hb2.C59811e.f170722p
                java.lang.String r6 = "mvTrack"
                gy3.C87412m.m108593f(r13, r6)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r5.f184740e
                gy3.C87412m.m108593f(r6, r9)
                hb2.e r6 = r15.mo84766b(r13, r8, r6)
                r17 = r11
                te3.hb1 r11 = r5.f184744i
                if (r11 == 0) goto L_0x03b6
                java.util.LinkedList<te3.mb1> r11 = r11.f183455d
                if (r11 == 0) goto L_0x03b6
                java.lang.Object r11 = sx3.C110818d0.m150917O(r11, r12)
                te3.mb1 r11 = (te3.C64550mb1) r11
                if (r11 == 0) goto L_0x03b6
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r5.f184740e
                gy3.C87412m.m108593f(r12, r9)
                hb2.e r12 = r15.mo84766b(r11, r8, r12)
                r15 = 0
                r12.f170727g = r15
                java.lang.String r13 = r13.f184261g
                java.lang.String r11 = r11.f184261g
                boolean r11 = gy3.C87412m.m108589b(r13, r11)
                if (r11 != 0) goto L_0x03b3
                r6.f170732o = r12
                goto L_0x03b7
            L_0x03b3:
                r6.f170727g = r15
                goto L_0x03b7
            L_0x03b6:
                r12 = 0
            L_0x03b7:
                r7.add(r6)
                if (r12 != 0) goto L_0x03bd
                goto L_0x03be
            L_0x03bd:
                r6 = r12
            L_0x03be:
                r10.add(r6)
                r12 = r14
                r11 = r17
                goto L_0x0367
            L_0x03c5:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x03ca:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "updateMusicItemList size:"
                r6.append(r8)
                int r8 = r7.size()
                r6.append(r8)
                java.lang.String r8 = ", origin size:"
                r6.append(r8)
                int r8 = r10.size()
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "MicroMsg.Mv.MusicMvMakerFixEditUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                java.util.ArrayList<hb2.e> r6 = r4.f163333e
                r6.clear()
                java.util.ArrayList<hb2.e> r6 = r4.f163333e
                r6.addAll(r7)
                java.util.ArrayList<hb2.e> r6 = r4.f163334f
                r6.clear()
                java.util.ArrayList<hb2.e> r6 = r4.f163334f
                r6.addAll(r10)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r6 = r4.mo80475f3()
                r6.notifyDataSetChanged()
                com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r4.mo80476g3()
                sb2.c0 r7 = new sb2.c0
                r7.<init>(r4)
                r6.post(r7)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r7 = 0
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.add(r7)
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f184739d
                if (r5 == 0) goto L_0x0462
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
                if (r5 == 0) goto L_0x0462
                te3.hb1 r5 = r5.mvInfo
                if (r5 == 0) goto L_0x0462
                java.util.LinkedList<te3.mb1> r5 = r5.f183455d
                if (r5 == 0) goto L_0x0462
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r9 = sx3.C36907w.m41090l(r5, r8)
                r7.<init>(r9)
                java.util.Iterator r5 = r5.iterator()
            L_0x0445:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x045f
                java.lang.Object r8 = r5.next()
                te3.mb1 r8 = (te3.C64550mb1) r8
                long r9 = r8.f184258d
                int r8 = r8.f184259e
                long r11 = (long) r8
                long r9 = r9 + r11
                java.lang.Long r8 = java.lang.Long.valueOf(r9)
                r7.add(r8)
                goto L_0x0445
            L_0x045f:
                r6.addAll(r7)
            L_0x0462:
                rx3.g r5 = r4.f163338j
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                ya2.f r5 = (ya2.C15942f) r5
                r5.getClass()
                java.util.ArrayList<java.lang.String> r7 = r5.f42828g
                r7.clear()
                java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
                java.util.Locale r8 = java.util.Locale.getDefault()
                java.lang.String r9 = "mm:ss"
                r7.<init>(r9, r8)
                java.util.ArrayList<java.lang.String> r5 = r5.f42828g
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r10 = sx3.C36907w.m41090l(r6, r9)
                r8.<init>(r10)
                java.util.Iterator r6 = r6.iterator()
            L_0x0491:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x04ad
                java.lang.Object r9 = r6.next()
                java.lang.Number r9 = (java.lang.Number) r9
                long r9 = r9.longValue()
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                java.lang.String r9 = r7.format(r9)
                r8.add(r9)
                goto L_0x0491
            L_0x04ad:
                r5.addAll(r8)
            L_0x04b0:
                java.lang.Class<dz.f> r5 = p501dz.C58464f.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                java.lang.String r6 = "getService(IMMTPPlayerFactoryService::class.java)"
                gy3.C87412m.m108593f(r5, r6)
                dz.f r5 = (p501dz.C58464f) r5
                androidx.appcompat.app.AppCompatActivity r6 = r4.getActivity()
                r7 = 1
                j03.c r5 = r5.mo82803ux(r6, r7)
                r4.f163348w = r5
                if (r5 == 0) goto L_0x04cd
                r5.mo81116a()
            L_0x04cd:
                j03.c r4 = r4.f163348w
                boolean r5 = r4 instanceof android.view.View
                if (r5 == 0) goto L_0x04d7
                r12 = r4
                android.view.View r12 = (android.view.View) r12
                goto L_0x04d8
            L_0x04d7:
                r12 = 0
            L_0x04d8:
                if (r12 != 0) goto L_0x04db
                goto L_0x04e1
            L_0x04db:
                r4 = 2131309855(0x7f09351f, float:1.8238006E38)
                r12.setId(r4)
            L_0x04e1:
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r4 = r0.f163068g
                com.tencent.mm.plugin.mv.ui.b r5 = new com.tencent.mm.plugin.mv.ui.b
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI r6 = r0.f163065d
                sb2.s r7 = r0.f163069h
                r5.<init>(r6, r7)
                r4.f163343r = r5
                xh.n6 r4 = r7.f180974d
                if (r4 == 0) goto L_0x0961
                int r5 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.f163030u
                float r7 = (float) r5
                r8 = 1055286886(0x3ee66666, float:0.45)
                float r7 = r7 * r8
                int r7 = (int) r7
                r8 = 64
                int r8 = kg3.C76577a.m92151b(r3, r8)
                int r5 = r5 - r8
                int r8 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.f163030u
                r9 = 256(0x100, float:3.59E-43)
                int r9 = kg3.C76577a.m92151b(r3, r9)
                int r8 = r8 - r9
                com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView r9 = r6.mo80365M7()
                if (r9 == 0) goto L_0x0957
                r9.f163458B = r3
                r9.f163465I = r4
                r9.f163475R0 = r7
                r9.f163477S0 = r5
                r9.f163479T0 = r8
                android.content.Context r4 = r9.getContext()
                int r4 = kg3.C76577a.m92145A(r4)
                r9.f163457A = r4
                di3.d r4 = di3.C86312j.m106911c(r2)
                fv.r r4 = (p529fv.C59331r) r4
                boolean r4 = r4.mo84023QS()
                if (r4 == 0) goto L_0x0547
                r18 = 0
                int r4 = r9.f163479T0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 24
                r24 = 0
                r17 = r9
                r19 = r4
                com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView.m65780r(r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x055c
            L_0x0547:
                r18 = 0
                int r4 = r9.f163475R0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 24
                r24 = 0
                r17 = r9
                r19 = r4
                com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView.m65780r(r17, r18, r19, r20, r21, r22, r23, r24)
            L_0x055c:
                db2.a r4 = r9.f163462F
                android.widget.RelativeLayout r4 = r4.f166791a
                if (r4 == 0) goto L_0x056a
                ub2.h r5 = new ub2.h
                r5.<init>(r9)
                r4.setOnClickListener(r5)
            L_0x056a:
                r4 = 2131299709(0x7f090d7d, float:1.8217427E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
                r9.f163489g = r4
                r5 = 8
                if (r4 != 0) goto L_0x057a
                goto L_0x057d
            L_0x057a:
                r4.setVisibility(r5)
            L_0x057d:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r9.f163489g
                if (r4 == 0) goto L_0x0589
                ub2.n r7 = new ub2.n
                r7.<init>(r9)
                r4.setOnClickListener(r7)
            L_0x0589:
                r4 = 2131315426(0x7f094ae2, float:1.8249305E38)
                android.view.View r4 = r9.findViewById(r4)
                com.google.android.material.tabs.TabLayout r4 = (com.google.android.material.tabs.TabLayout) r4
                r9.f163486d = r4
                if (r4 == 0) goto L_0x059b
                ub2.t r7 = r9.f163466J
                r4.mo146882a(r7)
            L_0x059b:
                java.util.ArrayList<java.lang.String> r4 = r9.f163464H
                int r4 = r4.size()
                r7 = 0
            L_0x05a2:
                if (r7 >= r4) goto L_0x05ce
                com.google.android.material.tabs.TabLayout r8 = r9.f163486d
                if (r8 == 0) goto L_0x05b3
                com.google.android.material.tabs.TabLayout$f r8 = r8.mo146908l()
                com.google.android.material.tabs.TabLayout r10 = r9.f163486d
                if (r10 == 0) goto L_0x05b3
                r10.mo146887b(r8)
            L_0x05b3:
                com.google.android.material.tabs.TabLayout r8 = r9.f163486d
                if (r8 == 0) goto L_0x05bc
                com.google.android.material.tabs.TabLayout$f r12 = r8.mo146907k(r7)
                goto L_0x05bd
            L_0x05bc:
                r12 = 0
            L_0x05bd:
                if (r12 != 0) goto L_0x05c0
                goto L_0x05cb
            L_0x05c0:
                java.util.ArrayList<java.lang.String> r8 = r9.f163464H
                java.lang.Object r8 = r8.get(r7)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r12.mo76123d(r8)
            L_0x05cb:
                int r7 = r7 + 1
                goto L_0x05a2
            L_0x05ce:
                java.lang.Class<h81.h> r4 = h81.C32735h.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                h81.h r4 = (h81.C32735h) r4
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_jump_to_record_media
                r8 = 1
                r4.mo58784wf(r7, r8)
                r4 = 2131296787(0x7f090213, float:1.82115E38)
                android.view.View r4 = r9.findViewById(r4)
                androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
                r9.f163487e = r4
                mb2.c r4 = new mb2.c
                android.content.Context r7 = r9.getContext()
                java.lang.String r8 = "context"
                gy3.C87412m.m108593f(r7, r8)
                r4.<init>(r7)
                r9.f163488f = r4
                mb2.d r4 = new mb2.d
                r7 = 2
                r4.<init>(r7)
                mb2.c r7 = r9.f163488f
                gy3.C87412m.m108591d(r7)
                java.util.LinkedList<mb2.e> r8 = r7.f174781i
                r8.remove(r4)
                java.util.LinkedList<mb2.e> r7 = r7.f174781i
                r7.add(r4)
                androidx.recyclerview.widget.RecyclerView r4 = r9.f163487e
                if (r4 != 0) goto L_0x0611
                goto L_0x0616
            L_0x0611:
                mb2.c r7 = r9.f163488f
                r4.setAdapter(r7)
            L_0x0616:
                com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager r4 = new com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager
                com.tencent.mm.ui.MMActivity r7 = r9.f163458B
                if (r7 == 0) goto L_0x0621
                androidx.appcompat.app.AppCompatActivity r12 = r7.getContext()
                goto L_0x0622
            L_0x0621:
                r12 = 0
            L_0x0622:
                r7 = 4
                r4.<init>(r12, r7)
                androidx.recyclerview.widget.RecyclerView r8 = r9.f163487e
                if (r8 != 0) goto L_0x062b
                goto L_0x062e
            L_0x062b:
                r8.setLayoutManager(r4)
            L_0x062e:
                android.content.Context r8 = r9.getContext()
                android.content.res.Resources r10 = r8.getResources()
                r11 = 2131166987(0x7f07070b, float:1.7948235E38)
                int r18 = r10.getDimensionPixelSize(r11)
                int r19 = r10.getDimensionPixelSize(r11)
                r10 = 2131100808(0x7f060488, float:1.7814008E38)
                int r20 = p385u2.C111105a.m151500b(r8, r10)
                r21 = 0
                ub2.c r8 = new ub2.c
                r22 = 0
                r17 = r8
                r17.<init>(r18, r19, r20, r21, r22)
                androidx.recyclerview.widget.RecyclerView r10 = r9.f163487e
                if (r10 == 0) goto L_0x065a
                r10.mo17085h0(r8)
            L_0x065a:
                androidx.recyclerview.widget.RecyclerView r8 = r9.f163487e
                if (r8 == 0) goto L_0x0666
                ub2.g r10 = new ub2.g
                r10.<init>(r9, r4)
                r8.mo17043c(r10)
            L_0x0666:
                androidx.recyclerview.widget.RecyclerView r4 = r9.f163487e
                if (r4 != 0) goto L_0x066b
                goto L_0x0670
            L_0x066b:
                ub2.p r8 = r9.f163461E
                r4.setOnFlingListener(r8)
            L_0x0670:
                mb2.c r4 = r9.f163488f
                if (r4 == 0) goto L_0x0678
                mb2.c$c r8 = r9.f163470N
                r4.f174784o = r8
            L_0x0678:
                com.tencent.mm.ui.MMActivity r4 = r9.f163458B
                java.lang.String r8 = "MicroMsg.Mv.MusicMVCardChooseView"
                if (r4 == 0) goto L_0x06d5
                android.content.Intent r10 = r4.getIntent()
                android.os.Bundle r10 = r10.getExtras()
                if (r10 == 0) goto L_0x06af
                java.util.Set r11 = r10.keySet()
                java.util.Iterator r11 = r11.iterator()
            L_0x0690:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x06b4
                java.lang.Object r12 = r11.next()
                java.lang.String r12 = (java.lang.String) r12
                r13 = 2
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r15 = 0
                r14[r15] = r12
                java.lang.Object r12 = r10.get(r12)
                r15 = 1
                r14[r15] = r12
                java.lang.String r12 = "key=%s | value=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r14)
                goto L_0x0690
            L_0x06af:
                java.lang.String r10 = "initView, oops! no extras data!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r10)
            L_0x06b4:
                android.content.Intent r10 = r4.getIntent()
                java.lang.String r11 = "album_video_max_duration"
                r12 = 10
                r10.getIntExtra(r11, r12)
                android.content.Intent r10 = r4.getIntent()
                java.lang.String r11 = "album_video_min_duration"
                r12 = 0
                r10.getIntExtra(r11, r12)
                android.content.Intent r4 = r4.getIntent()
                r10 = 9
                java.lang.String r11 = "max_select_count"
                r4.getIntExtra(r11, r10)
            L_0x06d5:
                r9.mo80521l()
                r4 = 2131302701(0x7f09192d, float:1.8223496E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
                r9.f163490h = r4
                if (r4 != 0) goto L_0x06e6
                goto L_0x06e9
            L_0x06e6:
                r4.setVisibility(r7)
            L_0x06e9:
                r4 = 2131304480(0x7f092020, float:1.8227104E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
                r9.f163491i = r4
                r4 = 2131312883(0x7f0940f3, float:1.8244147E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
                r9.f163492j = r4
                if (r4 == 0) goto L_0x0709
                ub2.i r7 = new ub2.i
                r7.<init>(r9)
                r4.setOnClickListener(r7)
            L_0x0709:
                r4 = 2131312970(0x7f09414a, float:1.8244324E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.FTSSearchNoActionBarView) r4
                r9.f163494o = r4
                if (r4 == 0) goto L_0x0719
                r4.setSearchViewListener(r9)
            L_0x0719:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x0731
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x0731
                android.content.Context r7 = r9.getContext()
                r10 = 2131821674(0x7f11046a, float:1.9276098E38)
                java.lang.String r7 = r7.getString(r10)
                r4.setHint(r7)
            L_0x0731:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x074d
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x074d
                android.content.Context r7 = r9.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r10 = 2131099699(0x7f060033, float:1.7811759E38)
                int r7 = r7.getColor(r10)
                r4.setHintColor(r7)
            L_0x074d:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x0769
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x0769
                android.content.Context r7 = r9.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r10 = 2131099704(0x7f060038, float:1.7811769E38)
                int r7 = r7.getColor(r10)
                r4.setTextColor(r7)
            L_0x0769:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x0776
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x0776
                r4.setFtsEditTextListener(r9)
            L_0x0776:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x0784
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x0784
                r7 = 0
                r4.setCanDeleteTag(r7)
            L_0x0784:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x0791
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x0791
                r4.mo70335c()
            L_0x0791:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x079e
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x079e
                r4.mo70339g()
            L_0x079e:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x07ab
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x07ab
                r4.mo70338f()
            L_0x07ab:
                com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView r4 = r9.f163494o
                if (r4 == 0) goto L_0x07c1
                com.tencent.mm.ui.search.FTSEditTextView r4 = r4.getFtsEditText()
                if (r4 == 0) goto L_0x07c1
                android.widget.ImageButton r4 = r4.getClearBtn()
                if (r4 == 0) goto L_0x07c1
                r7 = -1
                android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r4.setColorFilter(r7, r10)
            L_0x07c1:
                r4 = 2131312952(0x7f094138, float:1.8244287E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163493n = r4
                if (r4 != 0) goto L_0x07cf
                goto L_0x07d2
            L_0x07cf:
                r4.setVisibility(r5)
            L_0x07d2:
                r4 = 2131310735(0x7f09388f, float:1.823979E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabSearchFragment) r4
                r9.f163495p = r4
                java.lang.String r5 = "itemClickedListener"
                if (r4 == 0) goto L_0x07e8
                ub2.e r7 = r9.f163468L
                gy3.C87412m.m108594g(r7, r5)
                r4.f163635i = r7
            L_0x07e8:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment r4 = r9.f163495p
                if (r4 == 0) goto L_0x07f6
                ub2.f r7 = r9.f163469M
                java.lang.String r10 = "resultListener"
                gy3.C87412m.m108594g(r7, r10)
                r4.f163636j = r7
            L_0x07f6:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment r4 = r9.f163495p
                if (r4 == 0) goto L_0x07ff
                ub2.p r7 = r9.f163461E
                r4.setOnFlingListener(r7)
            L_0x07ff:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment r4 = r9.f163495p
                if (r4 != 0) goto L_0x0804
                goto L_0x0809
            L_0x0804:
                fy3.a<rx3.b0> r7 = r9.f163485W0
                r4.setOnSceneEndListener(r7)
            L_0x0809:
                r4 = 2131310312(0x7f0936e8, float:1.8238932E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r9.f163497q = r4
                r4 = 2131308034(0x7f092e02, float:1.8234312E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163498r = r4
                r4 = 2131309948(0x7f09357c, float:1.8238194E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163499s = r4
                r4 = 2131309950(0x7f09357e, float:1.8238198E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163500t = r4
                r4 = 2131309944(0x7f093578, float:1.8238186E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163501u = r4
                r4 = 2131309949(0x7f09357d, float:1.8238196E38)
                android.view.View r4 = r9.findViewById(r4)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                r9.f163502v = r4
                r4 = 2131310731(0x7f09388b, float:1.8239782E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMachineFragment) r4
                r9.f163503w = r4
                r4 = 2131310734(0x7f09388e, float:1.8239788E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyPostFragment) r4
                r9.f163504x = r4
                r4 = 2131310732(0x7f09388c, float:1.8239784E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyFavFragment) r4
                r9.f163506y = r4
                r4 = 2131310733(0x7f09388d, float:1.8239786E38)
                android.view.View r4 = r9.findViewById(r4)
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r4 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyLikeFragment) r4
                r9.f163508z = r4
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r4 = r9.f163506y
                if (r4 == 0) goto L_0x0882
                ub2.e r7 = r9.f163468L
                gy3.C87412m.m108594g(r7, r5)
                r4.f163635i = r7
            L_0x0882:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r4 = r9.f163503w
                if (r4 == 0) goto L_0x088d
                ub2.e r7 = r9.f163468L
                gy3.C87412m.m108594g(r7, r5)
                r4.f163635i = r7
            L_0x088d:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r4 = r9.f163504x
                if (r4 == 0) goto L_0x0898
                ub2.e r7 = r9.f163468L
                gy3.C87412m.m108594g(r7, r5)
                r4.f163635i = r7
            L_0x0898:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r4 = r9.f163508z
                if (r4 == 0) goto L_0x08a3
                ub2.e r7 = r9.f163468L
                gy3.C87412m.m108594g(r7, r5)
                r4.f163635i = r7
            L_0x08a3:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r4 = r9.f163503w
                if (r4 == 0) goto L_0x08ae
                xh.n6 r5 = r9.f163465I
                r7 = 0
                r4.mo80601c(r5, r7)
                goto L_0x08af
            L_0x08ae:
                r7 = 0
            L_0x08af:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r4 = r9.f163504x
                if (r4 == 0) goto L_0x08b8
                xh.n6 r5 = r9.f163465I
                r4.mo80601c(r5, r7)
            L_0x08b8:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r4 = r9.f163506y
                if (r4 == 0) goto L_0x08c1
                xh.n6 r5 = r9.f163465I
                r4.mo80601c(r5, r7)
            L_0x08c1:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r4 = r9.f163508z
                if (r4 == 0) goto L_0x08ca
                xh.n6 r5 = r9.f163465I
                r4.mo80601c(r5, r7)
            L_0x08ca:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r4 = r9.f163503w
                if (r4 == 0) goto L_0x08d3
                ub2.p r5 = r9.f163461E
                r4.setOnFlingListener(r5)
            L_0x08d3:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r4 = r9.f163504x
                if (r4 == 0) goto L_0x08dc
                ub2.p r5 = r9.f163461E
                r4.setOnFlingListener(r5)
            L_0x08dc:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r4 = r9.f163506y
                if (r4 == 0) goto L_0x08e5
                ub2.p r5 = r9.f163461E
                r4.setOnFlingListener(r5)
            L_0x08e5:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r4 = r9.f163508z
                if (r4 == 0) goto L_0x08ee
                ub2.p r5 = r9.f163461E
                r4.setOnFlingListener(r5)
            L_0x08ee:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r4 = r9.f163503w
                if (r4 != 0) goto L_0x08f3
                goto L_0x08f8
            L_0x08f3:
                fy3.a<rx3.b0> r5 = r9.f163485W0
                r4.setOnSceneEndListener(r5)
            L_0x08f8:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r4 = r9.f163504x
                if (r4 != 0) goto L_0x08fd
                goto L_0x0902
            L_0x08fd:
                fy3.a<rx3.b0> r5 = r9.f163485W0
                r4.setOnSceneEndListener(r5)
            L_0x0902:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r4 = r9.f163506y
                if (r4 != 0) goto L_0x0907
                goto L_0x090c
            L_0x0907:
                fy3.a<rx3.b0> r5 = r9.f163485W0
                r4.setOnSceneEndListener(r5)
            L_0x090c:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r4 = r9.f163508z
                if (r4 != 0) goto L_0x0911
                goto L_0x0916
            L_0x0911:
                fy3.a<rx3.b0> r5 = r9.f163485W0
                r4.setOnSceneEndListener(r5)
            L_0x0916:
                android.widget.LinearLayout r4 = r9.f163499s
                if (r4 == 0) goto L_0x0922
                ub2.j r5 = new ub2.j
                r5.<init>(r9)
                r4.setOnClickListener(r5)
            L_0x0922:
                android.widget.LinearLayout r4 = r9.f163500t
                if (r4 == 0) goto L_0x092e
                ub2.k r5 = new ub2.k
                r5.<init>(r9)
                r4.setOnClickListener(r5)
            L_0x092e:
                android.widget.LinearLayout r4 = r9.f163501u
                if (r4 == 0) goto L_0x093a
                ub2.l r5 = new ub2.l
                r5.<init>(r9)
                r4.setOnClickListener(r5)
            L_0x093a:
                android.widget.LinearLayout r4 = r9.f163502v
                if (r4 == 0) goto L_0x0946
                ub2.m r5 = new ub2.m
                r5.<init>(r9)
                r4.setOnClickListener(r5)
            L_0x0946:
                java.lang.String r4 = "init completed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
                java.lang.Class<com.tencent.mm.plugin.gallery.model.j> r4 = com.tencent.p014mm.plugin.gallery.model.C56791j.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gallery.model.j r4 = (com.tencent.p014mm.plugin.gallery.model.C56791j) r4
                r4.w50()
                goto L_0x0958
            L_0x0957:
                r7 = 0
            L_0x0958:
                com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView r4 = r6.mo80365M7()
                if (r4 == 0) goto L_0x0962
                r4.f163463G = r3
                goto L_0x0962
            L_0x0961:
                r7 = 0
            L_0x0962:
                di3.d r2 = di3.C86312j.m106911c(r2)
                fv.r r2 = (p529fv.C59331r) r2
                boolean r2 = r2.mo84023QS()
                if (r2 != 0) goto L_0x0982
                sb2.s r1 = r0.f163069h
                androidx.lifecycle.z r1 = r1.mo88633c3()
                r14 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
                r1.postValue(r2)
                sb2.s r1 = r0.f163069h
                r1.mo88635e3(r14)
                goto L_0x09bf
            L_0x0982:
                r14 = 0
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f184739d
                if (r1 == 0) goto L_0x09ab
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x09ab
                te3.hb1 r1 = r1.mvInfo
                if (r1 == 0) goto L_0x09ab
                int r1 = r1.f183461j
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r1.intValue()
                r3 = 1
                if (r2 != r3) goto L_0x099e
                r2 = 1
                goto L_0x099f
            L_0x099e:
                r2 = 0
            L_0x099f:
                if (r2 == 0) goto L_0x09a3
                r13 = r1
                goto L_0x09a4
            L_0x09a3:
                r13 = r7
            L_0x09a4:
                if (r13 == 0) goto L_0x09ab
                int r7 = r13.intValue()
                goto L_0x09ac
            L_0x09ab:
                r7 = 0
            L_0x09ac:
                sb2.s r1 = r0.f163069h
                androidx.lifecycle.z r1 = r1.mo88633c3()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r1.postValue(r2)
                sb2.s r1 = r0.f163069h
                r2 = 1
                r1.mo88635e3(r2)
            L_0x09bf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.C56923q.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r */
    public static final class C56924r implements C63774j0.C63775a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMakerUI f163070a;

        /* renamed from: b */
        public final /* synthetic */ C63844s f163071b;

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r$a */
        public static final class C56925a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerUI f163072d;

            public C56925a(MusicMvMakerUI musicMvMakerUI) {
                this.f163072d = musicMvMakerUI;
            }

            public void onAnimationEnd(Animator animator) {
                MusicMvMakerUI musicMvMakerUI = this.f163072d;
                int i = MusicMvMakerUI.f163030u;
                musicMvMakerUI.mo80363L7().setAlpha(1.0f);
                View K7 = this.f163072d.mo80362K7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(K7, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5$onCancel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(K7, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5$onCancel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r$b */
        public static final class C56926b extends C87413o implements C32227p<Integer, C59811e, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f163073d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56926b(boolean z) {
                super(2);
                this.f163073d = z;
            }

            public Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                C59811e eVar = (C59811e) obj2;
                C87412m.m108594g(eVar, "itemData");
                MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                boolean z = this.f163073d;
                MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
                c.f156559r = c.mo86045b("FeedId", eVar.mo84760a(), true);
                c.f156560s = c.mo86045b("FinderUin", eVar.mo84761b(), true);
                c.f156563v = (long) MvCreateReportHelper.f163008d;
                c.f156565x = (long) intValue;
                c.f156566y = (long) MvCreateReportHelper.f163007c;
                c.f156537A = eVar.mo84763f();
                c.f156567z = z ? 1 : 2;
                c.f156552k = 5;
                c.mo86054n();
                c.mo86056r();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r$c */
        public static final class C56927c extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerUI f163074d;

            public C56927c(MusicMvMakerUI musicMvMakerUI) {
                this.f163074d = musicMvMakerUI;
            }

            public void onAnimationEnd(Animator animator) {
                MusicMvMakerUI musicMvMakerUI = this.f163074d;
                int i = MusicMvMakerUI.f163030u;
                View K7 = musicMvMakerUI.mo80362K7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = K7;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5$onConfirm$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5$onConfirm$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r$d */
        public static final class C56928d extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerUI f163075d;

            public C56928d(MusicMvMakerUI musicMvMakerUI) {
                this.f163075d = musicMvMakerUI;
            }

            public void onAnimationEnd(Animator animator) {
                MusicMvMakerUI musicMvMakerUI = this.f163075d;
                int i = MusicMvMakerUI.f163030u;
                musicMvMakerUI.mo80365M7().animate().setListener((Animator.AnimatorListener) null);
                MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) C39818r.f106831a.mo62444c(this.f163075d).mo75002a(MusicMvMakerFixEditUIC.class);
                musicMvMakerFixEditUIC.getClass();
                Log.m105918d("MicroMsg.Mv.MusicMvMakerFixEditUIC", "moveToNextItem, lastPos:" + musicMvMakerFixEditUIC.f163341p);
                if (musicMvMakerFixEditUIC.f163341p + 1 < musicMvMakerFixEditUIC.mo80475f3().getItemCount()) {
                    WxRecyclerView g3 = musicMvMakerFixEditUIC.mo80476g3();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(musicMvMakerFixEditUIC.f163341p + 1));
                    WxRecyclerView wxRecyclerView = g3;
                    C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    g3.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$r$e */
        public static final class C56929e extends C87413o implements C32227p<Integer, C59811e, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f163076d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56929e(boolean z) {
                super(2);
                this.f163076d = z;
            }

            public Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                C59811e eVar = (C59811e) obj2;
                C87412m.m108594g(eVar, "itemData");
                MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                boolean z = this.f163076d;
                MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
                c.f156559r = c.mo86045b("FeedId", eVar.mo84760a(), true);
                c.f156560s = c.mo86045b("FinderUin", eVar.mo84761b(), true);
                int i = MvCreateReportHelper.f163007c;
                if (i == 3) {
                    c.f156563v = (long) MvCreateReportHelper.f163008d;
                }
                c.f156565x = (long) intValue;
                c.f156566y = (long) i;
                c.f156537A = eVar.mo84763f();
                c.f156567z = z ? 1 : 2;
                c.f156552k = 4;
                c.mo86054n();
                c.mo86056r();
                return C13598b0.f38549a;
            }
        }

        public C56924r(MusicMvMakerUI musicMvMakerUI, C63844s sVar) {
            this.f163070a = musicMvMakerUI;
            this.f163071b = sVar;
        }

        /* renamed from: a */
        public void mo80377a(boolean z) {
            int i;
            Class cls = MusicMvMakerFixEditUIC.class;
            MusicMvMakerUI musicMvMakerUI = this.f163070a;
            int i2 = MusicMvMakerUI.f163030u;
            View K7 = musicMvMakerUI.mo80362K7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = K7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f163070a.mo80363L7().setRadius(C76577a.m92151b(this.f163070a.getContext(), 12));
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f163070a).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this@Musi…erFixEditUIC::class.java)");
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) a;
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC2 = (MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163070a).mo75002a(cls);
            View findViewByPosition = ((LinearLayoutManager) ((C36570n) musicMvMakerFixEditUIC2.f163336h).getValue()).findViewByPosition(musicMvMakerFixEditUIC2.f163339n.f187878m);
            ImageView imageView = (ImageView) ((C36570n) this.f163070a.f163039p).getValue();
            C87412m.m108593f(imageView, "mvItemEditThumb");
            C87412m.m108591d(findViewByPosition);
            MMRoundCornerImageView L7 = this.f163070a.mo80363L7();
            C87412m.m108593f(L7, "albumFakeThumb");
            Animator b = C59828h.m69722a(imageView).mo84782b(C59828h.m69722a(findViewByPosition), L7, musicMvMakerFixEditUIC.f163347v);
            b.addListener(new C56925a(this.f163070a));
            b.setDuration(250);
            b.start();
            C56926b bVar = new C56926b(z);
            int i3 = musicMvMakerFixEditUIC.f163339n.f187878m;
            C59811e eVar = (C59811e) C110818d0.m150917O(musicMvMakerFixEditUIC.f163333e, i3);
            if (eVar != null) {
                bVar.invoke(Integer.valueOf(i3), eVar);
            }
            ((C63774j0) rVar.mo62444c(this.f163070a).mo75002a(C63774j0.class)).mo88584l3(false);
            if (musicMvMakerFixEditUIC.f163347v && (i = musicMvMakerFixEditUIC.f163341p) >= 0 && i < musicMvMakerFixEditUIC.f163333e.size()) {
                C59811e eVar2 = musicMvMakerFixEditUIC.f163333e.get(musicMvMakerFixEditUIC.f163341p);
                C87412m.m108593f(eVar2, "dataList[lastPos]");
                C59811e eVar3 = eVar2;
                int i4 = musicMvMakerFixEditUIC.f163341p;
                C59811e eVar4 = eVar3.f170732o;
                if (eVar4 != null) {
                    eVar4.f170728h = eVar3.f170728h;
                    musicMvMakerFixEditUIC.f163333e.set(i4, eVar4);
                    musicMvMakerFixEditUIC.mo80475f3().notifyItemChanged(i4);
                    musicMvMakerFixEditUIC.mo80479k3(i4);
                }
            }
            this.f163070a.mo80365M7().animate().translationY(0.0f).start();
            this.f163070a.mo80365M7().mo80513d();
            if (!this.f163071b.mo88634d3()) {
                MusicMvMakerUI.m65640I7(this.f163070a);
            }
        }

        /* renamed from: b */
        public void mo80378b(boolean z) {
            C59811e eVar;
            Class cls = MusicMvMakerFixEditUIC.class;
            MusicMvMakerUI musicMvMakerUI = this.f163070a;
            int i = MusicMvMakerUI.f163030u;
            View K7 = musicMvMakerUI.mo80362K7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = K7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f163070a.mo80363L7().setRadius(C76577a.m92151b(this.f163070a.getContext(), 12));
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f163070a).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this@Musi…erFixEditUIC::class.java)");
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) a;
            if (z) {
                musicMvMakerFixEditUIC.f163346u = true;
            }
            View findViewByPosition = ((LinearLayoutManager) ((C36570n) musicMvMakerFixEditUIC.f163336h).getValue()).findViewByPosition(musicMvMakerFixEditUIC.f163339n.f187878m);
            ImageView imageView = (ImageView) ((C36570n) this.f163070a.f163039p).getValue();
            C87412m.m108593f(imageView, "mvItemEditThumb");
            C87412m.m108591d(findViewByPosition);
            MMRoundCornerImageView L7 = this.f163070a.mo80363L7();
            C87412m.m108593f(L7, "albumFakeThumb");
            Animator b = C59828h.m69722a(imageView).mo84782b(C59828h.m69722a(findViewByPosition), L7, false);
            b.addListener(new C56927c(this.f163070a));
            b.setDuration(250);
            b.start();
            this.f163070a.mo80365M7().animate().translationY(0.0f).setListener(new C56928d(this.f163070a)).start();
            C56929e eVar2 = new C56929e(z);
            int i2 = musicMvMakerFixEditUIC.f163339n.f187878m;
            C59811e eVar3 = (C59811e) C110818d0.m150917O(musicMvMakerFixEditUIC.f163333e, i2);
            if (eVar3 != null) {
                eVar2.invoke(Integer.valueOf(i2), eVar3);
            }
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC2 = (MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163070a).mo75002a(cls);
            musicMvMakerFixEditUIC2.getClass();
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "disableCurrentSyncMusic");
            if (musicMvMakerFixEditUIC2.f163339n.f187878m + 1 < musicMvMakerFixEditUIC2.mo80475f3().getItemCount() && (eVar = (C59811e) C110818d0.m150917O(musicMvMakerFixEditUIC2.f163333e, musicMvMakerFixEditUIC2.f163339n.f187878m)) != null) {
                eVar.f170729i = false;
            }
            ((C63774j0) rVar.mo62444c(this.f163070a).mo75002a(C63774j0.class)).mo88584l3(false);
            this.f163070a.mo80365M7().mo80513d();
            if (!this.f163071b.mo88634d3()) {
                MusicMvMakerUI.m65640I7(this.f163070a);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$s */
    public static final class C56930s<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163077d;

        public C56930s(MusicMvMakerUI musicMvMakerUI) {
            this.f163077d = musicMvMakerUI;
        }

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                MusicMvMakerUI.m65639H7(this.f163077d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$t */
    public static final class C56931t<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163078d;

        public C56931t(MusicMvMakerUI musicMvMakerUI) {
            this.f163078d = musicMvMakerUI;
        }

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                MusicMvMakerUI musicMvMakerUI = this.f163078d;
                int i = MusicMvMakerUI.f163030u;
                MusicMVCardChooseView M7 = musicMvMakerUI.mo80365M7();
                if (M7 != null) {
                    M7.mo80520k();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$u */
    public static final class C56932u implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63844s f163079d;

        public C56932u(C63844s sVar) {
            this.f163079d = sVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$fixTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer value = this.f163079d.mo88633c3().getValue();
            if (value == null || value.intValue() != 0) {
                this.f163079d.mo88633c3().postValue(0);
                MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                MvCreateReportHelper.f163006b.f156540D = 2;
                MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
                c.f156552k = 12;
                c.mo86054n();
                c.mo86056r();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$fixTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$v */
    public static final class C56933v implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63844s f163080d;

        public C56933v(C63844s sVar) {
            this.f163080d = sVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$flexTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer value = this.f163080d.mo88633c3().getValue();
            if (value == null || value.intValue() != 1) {
                this.f163080d.mo88633c3().postValue(1);
                MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                MvCreateReportHelper.f163006b.f156540D = 1;
                MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
                c.f156552k = 12;
                c.mo86054n();
                c.mo86056r();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$flexTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$w */
    public static final class C56934w implements C60268b.C60269a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMakerUI f163081a;

        public C56934w(MusicMvMakerUI musicMvMakerUI) {
            this.f163081a = musicMvMakerUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80384a(int r11, ib2.C60265a r12) {
            /*
                r10 = this;
                java.lang.String r0 = "item"
                gy3.C87412m.m108594g(r12, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OnDelBtnClicked, pos:"
                r0.append(r1)
                r0.append(r11)
                java.lang.String r1 = ", type:"
                r0.append(r1)
                int r1 = r12.f171813e
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.Mv.MusicMvMakerUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                int r0 = r12.f171813e
                r1 = 1
                r2 = 0
                r3 = 3
                if (r0 == r1) goto L_0x003a
                if (r0 != r3) goto L_0x002f
                goto L_0x003a
            L_0x002f:
                ib2.a$b r0 = r12.f171817i
                if (r0 == 0) goto L_0x0045
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f171827b
                if (r0 == 0) goto L_0x0045
                long r4 = r0.f164794id
                goto L_0x0040
            L_0x003a:
                ib2.a$a r0 = r12.f171816h
                if (r0 == 0) goto L_0x0045
                long r4 = r0.f171820a
            L_0x0040:
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                goto L_0x0046
            L_0x0045:
                r0 = r2
            L_0x0046:
                com.tencent.mm.plugin.mv.model.MvCreateReportHelper r4 = com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper.f163005a
                com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct r4 = r4.mo80352c()
                r5 = 13
                r4.f156552k = r5
                r4.f156544H = r1
                int r5 = com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper.f163007c
                long r6 = (long) r5
                r4.f156566y = r6
                r6 = 2
                if (r5 == r1) goto L_0x005f
                if (r5 == r6) goto L_0x005f
                long r7 = (long) r11
                r4.f156563v = r7
            L_0x005f:
                r4.mo86054n()
                r4.mo86056r()
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI r11 = r10.f163081a
                int r4 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.f163030u
                com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView r11 = r11.mo80365M7()
                if (r11 == 0) goto L_0x0119
                int r12 = r12.f171813e
                java.lang.String r4 = ", uniqueId:"
                java.lang.String r5 = "MicroMsg.Mv.MusicMVCardChooseView"
                if (r0 != 0) goto L_0x0093
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "invalid parameters, type:"
                r11.append(r1)
                r11.append(r12)
                r11.append(r4)
                r11.append(r0)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
                goto L_0x0119
            L_0x0093:
                if (r12 == r1) goto L_0x00e1
                if (r12 == r6) goto L_0x00b4
                if (r12 == r3) goto L_0x00e1
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "error logic.type:"
                r11.append(r1)
                r11.append(r12)
                r11.append(r4)
                r11.append(r0)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
                goto L_0x0119
            L_0x00b4:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r12 = r11.f163503w
                if (r12 == 0) goto L_0x00bf
                long r1 = r0.longValue()
                r12.mo80602d(r1)
            L_0x00bf:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r12 = r11.f163504x
                if (r12 == 0) goto L_0x00ca
                long r1 = r0.longValue()
                r12.mo80602d(r1)
            L_0x00ca:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r12 = r11.f163506y
                if (r12 == 0) goto L_0x00d5
                long r1 = r0.longValue()
                r12.mo80602d(r1)
            L_0x00d5:
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r11 = r11.f163508z
                if (r11 == 0) goto L_0x0119
                long r0 = r0.longValue()
                r11.mo80602d(r0)
                goto L_0x0119
            L_0x00e1:
                mb2.c r11 = r11.f163488f
                if (r11 == 0) goto L_0x0119
                long r0 = r0.longValue()
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r12 = r11.f174777e
                java.util.Iterator r12 = r12.iterator()
                r3 = 0
                r4 = 0
            L_0x00f1:
                boolean r5 = r12.hasNext()
                if (r5 == 0) goto L_0x0119
                java.lang.Object r5 = r12.next()
                int r6 = r4 + 1
                if (r4 < 0) goto L_0x0115
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r5
                long r7 = r5.f162751h
                int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r9 != 0) goto L_0x0113
                r5.f162759s = r3
                java.util.LinkedList<mb2.e> r5 = r11.f174781i
                int r5 = r5.size()
                int r4 = r4 + r5
                r11.notifyItemChanged(r4)
            L_0x0113:
                r4 = r6
                goto L_0x00f1
            L_0x0115:
                sx3.C64197v.m75542k()
                throw r2
            L_0x0119:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.C56934w.mo80384a(int, ib2.a):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$x */
    public static final class C56935x extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163082d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvTabFragment.C57119e f163083e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56935x(MusicMvMakerUI musicMvMakerUI, MusicMvTabFragment.C57119e eVar) {
            super(0);
            this.f163082d = musicMvMakerUI;
            this.f163083e = eVar;
        }

        public Object invoke() {
            Class cls = MusicMvMakerFixEditUIC.class;
            C39818r rVar = C39818r.f106831a;
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163082d).mo75002a(cls);
            MusicMvTabFragment.C57119e eVar = this.f163083e;
            musicMvMakerFixEditUIC.getClass();
            C87412m.m108594g(eVar, "data");
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateFinderItem:" + eVar);
            if (musicMvMakerFixEditUIC.f163333e.size() != 0) {
                int i = musicMvMakerFixEditUIC.f163339n.f187878m;
                C59811e eVar2 = musicMvMakerFixEditUIC.f163333e.get(i);
                C87412m.m108593f(eVar2, "dataList[pos]");
                C59811e eVar3 = eVar2;
                C59811e eVar4 = new C59811e();
                C59811e.C59813b bVar = C59811e.f170722p;
                bVar.mo84767c(eVar3, eVar4);
                C59811e eVar5 = musicMvMakerFixEditUIC.f163334f.get(i);
                C87412m.m108593f(eVar5, "initMusicDataList[pos]");
                C59811e eVar6 = eVar5;
                eVar4.f170732o = eVar3;
                musicMvMakerFixEditUIC.f163333e.set(i, eVar4);
                bVar.mo84765a(eVar, eVar4);
                MvCreateReportHelper.f163005a.mo80351b(i, eVar4);
                musicMvMakerFixEditUIC.mo80477i3(i, eVar4, new C63742b0(musicMvMakerFixEditUIC, i, eVar4));
            }
            ((MusicMvMakerFixEditUIC) rVar.mo62444c(this.f163082d).mo75002a(cls)).f163346u = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$y */
    public static final class C56936y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerUI f163084d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<GalleryItem$MediaItem> f163085e;

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$y$a */
        public static final class C56937a extends C87413o implements C32226l<List<? extends C60265a>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<GalleryItem$MediaItem> f163086d;

            /* renamed from: e */
            public final /* synthetic */ MusicMvFlexLiveList f163087e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56937a(LinkedList<GalleryItem$MediaItem> linkedList, MusicMvFlexLiveList musicMvFlexLiveList) {
                super(1);
                this.f163086d = linkedList;
                this.f163087e = musicMvFlexLiveList;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.util.List r15 = (java.util.List) r15
                    java.lang.String r0 = "snapshotList"
                    gy3.C87412m.m108594g(r15, r0)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r15 = r15.iterator()
                L_0x0011:
                    boolean r1 = r15.hasNext()
                    r2 = 0
                    if (r1 == 0) goto L_0x002b
                    java.lang.Object r1 = r15.next()
                    r3 = r1
                    ib2.a r3 = (ib2.C60265a) r3
                    int r3 = r3.f171813e
                    r4 = 3
                    if (r3 != r4) goto L_0x0025
                    r2 = 1
                L_0x0025:
                    if (r2 == 0) goto L_0x0011
                    r0.add(r1)
                    goto L_0x0011
                L_0x002b:
                    java.util.LinkedList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r15 = r14.f163086d
                    com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r1 = r14.f163087e
                    java.util.Iterator r0 = r0.iterator()
                L_0x0033:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x00d5
                    java.lang.Object r3 = r0.next()
                    ib2.a r3 = (ib2.C60265a) r3
                    ib2.a$a r4 = r3.f171816h
                    if (r4 == 0) goto L_0x0033
                    long r5 = r4.f171820a
                    r7 = -1
                    int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r9 != 0) goto L_0x0033
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r6 = r15.iterator()
                L_0x0054:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L_0x0066
                    java.lang.Object r7 = r6.next()
                    boolean r8 = r7 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
                    if (r8 == 0) goto L_0x0054
                    r5.add(r7)
                    goto L_0x0054
                L_0x0066:
                    java.util.Iterator r5 = r5.iterator()
                    boolean r6 = r5.hasNext()
                    if (r6 != 0) goto L_0x0072
                    r5 = 0
                    goto L_0x00a7
                L_0x0072:
                    java.lang.Object r6 = r5.next()
                    boolean r7 = r5.hasNext()
                    if (r7 != 0) goto L_0x007e
                L_0x007c:
                    r5 = r6
                    goto L_0x00a7
                L_0x007e:
                    r7 = r6
                    com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r7
                    long r7 = r7.f162752i
                    long r9 = r4.f171821b
                    long r7 = r7 - r9
                    long r7 = java.lang.Math.abs(r7)
                L_0x008a:
                    java.lang.Object r9 = r5.next()
                    r10 = r9
                    com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r10
                    long r10 = r10.f162752i
                    long r12 = r4.f171821b
                    long r10 = r10 - r12
                    long r10 = java.lang.Math.abs(r10)
                    int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                    if (r12 <= 0) goto L_0x00a0
                    r6 = r9
                    r7 = r10
                L_0x00a0:
                    boolean r9 = r5.hasNext()
                    if (r9 != 0) goto L_0x008a
                    goto L_0x007c
                L_0x00a7:
                    com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r5
                    if (r5 == 0) goto L_0x0033
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "local_"
                    r6.append(r7)
                    long r7 = r5.f162751h
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    java.lang.String r7 = "<set-?>"
                    gy3.C87412m.m108594g(r6, r7)
                    r3.f171812d = r6
                    long r6 = r5.f162751h
                    r4.f171820a = r6
                    java.lang.String r6 = r5.f162747d
                    r4.f171822c = r6
                    r4.f171823d = r5
                    r1.mo129615s(r3, r2)
                    goto L_0x0033
                L_0x00d5:
                    rx3.b0 r15 = rx3.C13598b0.f38549a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.C56936y.C56937a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        public C56936y(MusicMvMakerUI musicMvMakerUI, LinkedList<GalleryItem$MediaItem> linkedList) {
            this.f163084d = musicMvMakerUI;
            this.f163085e = linkedList;
        }

        public final void run() {
            MusicMvFlexLiveList musicMvFlexLiveList = ((C63759f0) C39818r.f106831a.mo62444c(this.f163084d).mo75002a(C63759f0.class)).f180772h;
            musicMvFlexLiveList.mo129602c(new C56937a(this.f163085e, musicMvFlexLiveList));
        }
    }

    /* renamed from: H7 */
    public static final void m65639H7(MusicMvMakerUI musicMvMakerUI) {
        MusicMvMakerUI musicMvMakerUI2 = musicMvMakerUI;
        musicMvMakerUI.getClass();
        Class cls = MusicMvMakerFixEditUIC.class;
        Class cls2 = C63844s.class;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(musicMvMakerUI2).mo75002a(cls2);
        C87412m.m108593f(a, "UICProvider.of(this).get…MakerDataUIC::class.java)");
        Integer value = ((C63844s) a).mo88633c3().getValue();
        if (value != null && value.intValue() == 1) {
            C63759f0 f0Var = (C63759f0) rVar.mo62444c(musicMvMakerUI2).mo75002a(C63759f0.class);
            ProgressDialog progressDialog = f0Var.f180778q;
            if (progressDialog != null) {
                progressDialog.show();
            } else {
                Activity context = f0Var.getContext();
                Activity context2 = f0Var.getContext();
                C89779i0 c = C89779i0.m112246c(context, context2 != null ? context2.getString(C0966R.string.a4d) : null, false, 0, (DialogInterface.OnCancelListener) null);
                f0Var.f180778q = c;
                c.show();
            }
            C50480n13 n132 = new C50480n13();
            C39622i0 a2 = rVar.mo62444c(f0Var.getActivity()).mo75002a(cls2);
            C87412m.m108593f(a2, "UICProvider.of(activity)…MakerDataUIC::class.java)");
            C63844s sVar = (C63844s) a2;
            C39622i0 a3 = rVar.mo62444c(f0Var.getActivity()).mo75002a(C65946a.class);
            C87412m.m108593f(a3, "UICProvider.of(activity)…ycleScopeUIC::class.java)");
            n132.f138329d = sVar.f180975e;
            f0Var.f180772h.mo129602c(new C63757e0(n132, f0Var, (C65946a) a3, sVar));
        } else if (((MusicMvMakerFixEditUIC) rVar.mo62444c(musicMvMakerUI2).mo75002a(cls)).mo80473d3()) {
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) rVar.mo62444c(musicMvMakerUI2).mo75002a(cls);
            musicMvMakerFixEditUIC.getClass();
            Intent intent = new Intent(musicMvMakerFixEditUIC.getActivity(), MusicMvMakerPreviewUI.class);
            C64621p23 e3 = musicMvMakerFixEditUIC.mo80474e3(musicMvMakerFixEditUIC.f163344s);
            if (e3 != null) {
                intent.putExtra("key_track_data", e3.toByteArray());
            }
            intent.putExtra("key_seek_to_start", true);
            C61926c.m72680e(intent, musicMvMakerFixEditUIC.getActivity().getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
            AppCompatActivity activity = musicMvMakerFixEditUIC.getActivity();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "onNextBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "onNextBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ArrayList<C59811e> arrayList = musicMvMakerFixEditUIC.f163333e;
            ArrayList arrayList2 = new ArrayList();
            Iterator<C59811e> it = arrayList.iterator();
            while (it.hasNext()) {
                C59811e next = it.next();
                if (next.f170732o != null) {
                    arrayList2.add(next);
                }
            }
            MvCreateReportHelper.f163005a.mo80350a(0, arrayList2.size());
        }
    }

    /* renamed from: I7 */
    public static final void m65640I7(MusicMvMakerUI musicMvMakerUI) {
        musicMvMakerUI.getClass();
        musicMvMakerUI.mo80367O7(((MusicMvMakerFixEditUIC) C39818r.f106831a.mo62444c(musicMvMakerUI).mo75002a(MusicMvMakerFixEditUIC.class)).mo80473d3());
    }

    /* renamed from: G4 */
    public void mo80360G4(GalleryItem$MediaItem galleryItem$MediaItem, C59826g gVar) {
        C87412m.m108594g(galleryItem$MediaItem, "data");
        if (galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem) {
            mo80366N7(gVar, new C56919m(this, galleryItem$MediaItem));
        } else {
            Log.m105920e("MicroMsg.Mv.MusicMvMakerUI", "data must be GalleryItem.VideoMediaItem");
        }
    }

    /* renamed from: J7 */
    public final boolean mo80361J7(int i, int i2, boolean z) {
        if (!z || i > 2000) {
            C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C63844s.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…MakerDataUIC::class.java)");
            int i3 = this.f163041r + i2;
            this.f163041r = i3;
            C64621p23 value = ((C63844s) a).f180977g.getValue();
            if (i3 <= (value != null ? value.f184745j : 0)) {
                return true;
            }
            this.f163041r -= i2;
            C77426q qVar = new C77426q(this);
            qVar.mo107595g(getResources().getString(C0966R.string.f361079h34));
            qVar.mo107602n(getResources().getString(C0966R.string.f8028zq));
            qVar.mo107603o();
            return false;
        }
        C77426q qVar2 = new C77426q(this);
        qVar2.mo107595g(getResources().getString(C0966R.string.h2s));
        qVar2.mo107602n(getResources().getString(C0966R.string.f8028zq));
        qVar2.mo107603o();
        return false;
    }

    /* renamed from: K7 */
    public final View mo80362K7() {
        return (View) ((C36570n) this.f163037n).getValue();
    }

    /* renamed from: L7 */
    public final MMRoundCornerImageView mo80363L7() {
        return (MMRoundCornerImageView) ((C36570n) this.f163038o).getValue();
    }

    /* renamed from: M1 */
    public void mo80364M1(MusicMvTabFragment.C57119e eVar, C59826g gVar) {
        C87412m.m108594g(eVar, "data");
        mo80366N7(gVar, new C56935x(this, eVar));
    }

    /* renamed from: M7 */
    public final MusicMVCardChooseView mo80365M7() {
        return (MusicMVCardChooseView) ((C36570n) this.f163036j).getValue();
    }

    /* renamed from: N7 */
    public final void mo80366N7(C59826g gVar, C32224a<C13598b0> aVar) {
        if (gVar != null) {
            View K7 = mo80362K7();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(K7, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI", "makeMediaThumbTransition", "(Lcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(K7, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI", "makeMediaThumbTransition", "(Lcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MMRoundCornerImageView L7 = mo80363L7();
            C87412m.m108593f(L7, "albumFakeThumb");
            gVar.mo84781a(L7);
            mo80363L7().setRadius(0);
            int[] iArr = new int[2];
            ((RecyclerView) ((C36570n) this.f163040q).getValue()).getLocationInWindow(iArr);
            iArr[0] = iArr[0] + ((((RecyclerView) ((C36570n) this.f163040q).getValue()).getWidth() - gVar.f170787c.getWidth()) / 2);
            iArr[1] = iArr[1] + ((((RecyclerView) ((C36570n) this.f163040q).getValue()).getHeight() - gVar.f170787c.getHeight()) / 2);
            GravityArcMotion gravityArcMotion = new GravityArcMotion();
            Point point = gVar.f170786b;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo80363L7(), "x", "y", gravityArcMotion.getPath((float) point.x, (float) point.y, (float) iArr[0], (float) iArr[1]));
            ofFloat.setInterpolator(new C109678b());
            ofFloat.setDuration(400);
            ofFloat.addListener(new C56910e(this, aVar));
            ofFloat.start();
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: O7 */
    public final void mo80367O7(boolean z) {
        if (z) {
            View view = (View) ((C36570n) this.f163034h).getValue();
            if (view != null) {
                view.setBackground(getResources().getDrawable(C0966R.C0969drawable.ajf));
            }
            ((WeImageView) ((C36570n) this.f163035i).getValue()).setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6));
            return;
        }
        View view2 = (View) ((C36570n) this.f163034h).getValue();
        if (view2 != null) {
            view2.setBackground(getResources().getDrawable(C0966R.C0969drawable.aje));
        }
        ((WeImageView) ((C36570n) this.f163035i).getValue()).setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
    }

    /* renamed from: Z6 */
    public void mo80368Z6(LinkedList<GalleryItem$MediaItem> linkedList) {
        C87412m.m108594g(linkedList, "mediaItems");
        ((C119157j) C119157j.f356862d).mo183875f(new C56936y(this, linkedList));
    }

    /* renamed from: b6 */
    public boolean mo80369b6(boolean z, GalleryItem$MediaItem galleryItem$MediaItem, int i) {
        GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$MediaItem;
        C87412m.m108594g(galleryItem$MediaItem2, "data");
        String str = "local_" + galleryItem$MediaItem2.f162751h;
        boolean z2 = galleryItem$MediaItem2 instanceof GalleryItem$VideoMediaItem;
        int i2 = z2 ? 3 : 1;
        int i3 = z2 ? ((GalleryItem$VideoMediaItem) galleryItem$MediaItem2).f162766w : 0;
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C63759f0.class);
        C87412m.m108593f(a, "UICProvider.of(this@Musi…rFlexEditUIC::class.java)");
        C63759f0 f0Var = (C63759f0) a;
        f0Var.f180780s = true;
        if (!z) {
            this.f163041r -= i2;
            f0Var.f180772h.mo129610n(str);
            f0Var.f180772h.mo80353u();
            return true;
        } else if (!mo80361J7(i3, i2, z2)) {
            return false;
        } else {
            C59811e eVar = new C59811e();
            eVar.f170727g = 1;
            C59811e.f170722p.getClass();
            eVar.f170727g = 1;
            eVar.f170730j = new C59811e.C59818f(galleryItem$MediaItem2);
            if (z2) {
                String b = galleryItem$MediaItem.mo11841b();
                C87412m.m108593f(b, "mediaItem.uniqueValue()");
                GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) galleryItem$MediaItem2;
                String str2 = galleryItem$VideoMediaItem.f162747d;
                C87412m.m108593f(str2, "mediaItem.originalPath");
                C59811e.C59821i iVar = new C59811e.C59821i(b, str2, (long) galleryItem$VideoMediaItem.f162766w, 0, 0, 24, (C8480h) null);
                iVar.f170746d = galleryItem$VideoMediaItem.f162768y;
                iVar.f170747e = galleryItem$VideoMediaItem.f162767x;
                eVar.f170731n = iVar;
            }
            MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
            MvCreateReportHelper.f163007c = 2;
            mvCreateReportHelper.mo80351b(f0Var.f180772h.f272353o.size(), eVar);
            C60265a aVar = new C60265a(str, 1, System.currentTimeMillis(), i);
            C60265a.C60266a aVar2 = new C60265a.C60266a(0, 0, (String) null, (GalleryItem$MediaItem) null, 0, 0, 63, (C8480h) null);
            aVar.f171816h = aVar2;
            aVar2.f171822c = galleryItem$MediaItem.mo80159e();
            C60265a.C60266a aVar3 = aVar.f171816h;
            if (aVar3 != null) {
                aVar3.f171820a = galleryItem$MediaItem2.f162751h;
            }
            if (aVar3 != null) {
                aVar3.f171821b = galleryItem$MediaItem2.f162752i;
            }
            if (aVar3 != null) {
                aVar3.f171823d = galleryItem$MediaItem2;
            }
            if (z2) {
                aVar.f171818j = ((GalleryItem$VideoMediaItem) galleryItem$MediaItem2).f162766w;
            } else {
                aVar.f171818j = 0;
                Point pictureSize = BitmapUtil.getPictureSize(galleryItem$MediaItem.mo80159e());
                C60265a.C60266a aVar4 = aVar.f171816h;
                if (aVar4 != null) {
                    aVar4.f171824e = pictureSize != null ? pictureSize.x : 0;
                }
                if (aVar4 != null) {
                    aVar4.f171825f = pictureSize != null ? pictureSize.y : 0;
                }
            }
            MvvmList.m119209l(f0Var.f180772h, aVar, false, 2, (Object) null);
            f0Var.f180772h.mo80353u();
            return true;
        }
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bj_;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(MusicMvMakerFixEditUIC.class, C63759f0.class, C63774j0.class, C63844s.class, C63845s0.class));
    }

    public void onBusinessPermissionDenied(String str) {
        ((C63759f0) C39818r.f106831a.mo62444c(this).mo75002a(C63759f0.class)).onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
        hideActionbarLine();
        C76577a.m92145A(this);
        f163030u = C75044y4.m89990b(this).y;
        View view = (View) ((C36570n) this.f163033g).getValue();
        if (view != null) {
            view.setOnClickListener(new C56920n(this));
        }
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(this).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
        C65946a aVar = (C65946a) a;
        C39622i0 a2 = rVar.mo62444c(this).mo75002a(C63844s.class);
        C87412m.m108593f(a2, "UICProvider.of(this).get…MakerDataUIC::class.java)");
        C63844s sVar = (C63844s) a2;
        C39622i0 a3 = rVar.mo62444c(this).mo75002a(C63759f0.class);
        C87412m.m108593f(a3, "UICProvider.of(this).get…rFlexEditUIC::class.java)");
        C63759f0 f0Var = (C63759f0) a3;
        C39622i0 a4 = rVar.mo62444c(this).mo75002a(MusicMvMakerFixEditUIC.class);
        C87412m.m108593f(a4, "UICProvider.of(this).get…erFixEditUIC::class.java)");
        MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) a4;
        View view2 = (View) ((C36570n) this.f163034h).getValue();
        if (view2 != null) {
            view2.setOnClickListener(new C56921o(this));
        }
        if (((C59331r) C86312j.m106911c(C59331r.class)).mo84023QS()) {
            ((LinearLayout) findViewById(C0966R.C0970id.h8i)).setVisibility(0);
            TextView textView = (TextView) findViewById(C0966R.C0970id.ea8);
            TextView textView2 = null;
            if (textView != null) {
                textView.setOnClickListener(new C56933v(sVar));
            } else {
                textView = null;
            }
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.e_j);
            if (textView3 != null) {
                textView3.setOnClickListener(new C56932u(sVar));
                textView2 = textView3;
            }
            sVar.mo88633c3().observe(this, new C56922p(textView2, this, textView));
        }
        sVar.mo88633c3().observe(this, this.f163042s);
        sVar.f180977g.observe(this, new C56923q(this, f0Var, aVar, musicMvMakerFixEditUIC, sVar));
        ((C63774j0) rVar.mo62444c(this).mo75002a(C63774j0.class)).f180811H = new C56924r(this, sVar);
        C59833q qVar = C59833q.f170832a;
        C64488kb1 kb12 = sVar.f180975e;
        qVar.getClass();
        C87412m.m108594g(kb12, "songInfo");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 7, C64793w23.class);
        if (w232 != null && 10 == w232.f186033d) {
            qVar.mo84797i(this, kb12, new C59822f(), 1, 1, "");
        }
        f0Var.f180769e.observe(this, new C56930s(this));
        f0Var.f180771g.observe(this, new C56931t(this));
    }

    public void onDestroy() {
        super.onDestroy();
        MusicMVCardChooseView M7 = mo80365M7();
        if (M7 != null) {
            Class cls = C56791j.class;
            ((C56791j) C86312j.m106911c(cls)).mo80182i0(M7);
            TabLayout tabLayout = M7.f163486d;
            if (tabLayout != null) {
                tabLayout.f309491K.remove(M7.f163466J);
            }
            MusicMvTabSearchFragment musicMvTabSearchFragment = M7.f163495p;
            if (musicMvTabSearchFragment != null) {
                C86709a0.m107524d().mo123470p(3820, musicMvTabSearchFragment);
            }
            MusicMvTabMyFavFragment musicMvTabMyFavFragment = M7.f163506y;
            if (musicMvTabMyFavFragment != null) {
                C86709a0.m107524d().mo123470p(3966, musicMvTabMyFavFragment);
            }
            MusicMvTabMachineFragment musicMvTabMachineFragment = M7.f163503w;
            if (musicMvTabMachineFragment != null) {
                C86709a0.m107524d().mo123470p(6860, musicMvTabMachineFragment);
            }
            MusicMvTabMyPostFragment musicMvTabMyPostFragment = M7.f163504x;
            if (musicMvTabMyPostFragment != null) {
                C86709a0.m107524d().mo123470p(3736, musicMvTabMyPostFragment);
            }
            MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = M7.f163508z;
            if (musicMvTabMyLikeFragment != null) {
                C86709a0.m107524d().mo123470p(3965, musicMvTabMyLikeFragment);
            }
            ((C56791j) C86312j.m106911c(cls)).Bd0();
        }
    }

    public void onPause() {
        super.onPause();
        MusicMVCardChooseView M7 = mo80365M7();
        if (M7 != null) {
            M7.f163471P = true;
        }
        Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.valueOf(true & true));
    }

    public void onResume() {
        super.onResume();
        MusicMVCardChooseView M7 = mo80365M7();
        if (M7 != null) {
            M7.f163471P = false;
        }
        ((C59330q) C86312j.m106911c(C59330q.class)).mo84435HN(this, false, false);
    }

    /* renamed from: p6 */
    public void mo80370p6(int i) {
        boolean z;
        int i2;
        Class<MusicMvRouterUI> cls = MusicMvRouterUI.class;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(this).mo75002a(C63844s.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…MakerDataUIC::class.java)");
        Integer value = ((C63844s) a).mo88633c3().getValue();
        if (value != null && value.intValue() == 0) {
            i2 = i;
            z = true;
        } else {
            i2 = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            z = false;
        }
        if (z) {
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) rVar.mo62444c(this).mo75002a(MusicMvMakerFixEditUIC.class);
            musicMvMakerFixEditUIC.getClass();
            C99364n.m129616h().mo138822a().pause();
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "takePhoto, minDuration:" + i + ", maxDuration:" + i2);
            Intent intent = new Intent(musicMvMakerFixEditUIC.getActivity(), cls);
            intent.putExtra("KEY_MUSIC_ROUTER", 1);
            intent.putExtra("KEY_IS_FIX_CLIP_MODE", z);
            intent.putExtra("KEY_MIN_RECORD_DURATION", i);
            intent.putExtra("KEY_MAX_RECORD_DURATION", i2);
            musicMvMakerFixEditUIC.getActivity().startActivityForResult(intent, 1024);
            return;
        }
        C63759f0 f0Var = (C63759f0) rVar.mo62444c(this).mo75002a(C63759f0.class);
        f0Var.getClass();
        C99364n.m129616h().mo138822a().pause();
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "takePhoto, minDuration:" + i + ", maxDuration:" + i2);
        Intent intent2 = new Intent(f0Var.getActivity(), cls);
        intent2.putExtra("KEY_MUSIC_ROUTER", 1);
        intent2.putExtra("KEY_IS_FIX_CLIP_MODE", z);
        intent2.putExtra("KEY_MIN_RECORD_DURATION", i);
        intent2.putExtra("KEY_MAX_RECORD_DURATION", i2);
        f0Var.getActivity().startActivityForResult(intent2, 1025);
    }

    /* renamed from: s4 */
    public void mo80371s4() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150917O((r0 = (r0 = r0.objectDesc).media), 0);
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo80372v0(boolean r13, com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment.C57119e r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r14, r0)
            long r0 = r14.f163648a
            java.lang.String r3 = o40.C61926c.m72691p(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r14.f163649b
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0025
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L_0x0025
            int r0 = r0.videoDuration
            int r0 = r0 * 1000
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62444c(r12)
            java.lang.Class<sb2.f0> r4 = sb2.C63759f0.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(this@Musi…rFlexEditUIC::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r8 = r2
            sb2.f0 r8 = (sb2.C63759f0) r8
            r9 = 1
            r8.f180780s = r9
            r10 = 3
            if (r13 != 0) goto L_0x0050
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r13 = r8.f180772h
            r13.mo129610n(r3)
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r13 = r8.f180772h
            r13.mo80353u()
            int r13 = r12.f163041r
            int r13 = r13 - r10
            r12.f163041r = r13
            return r9
        L_0x0050:
            boolean r13 = r12.mo80361J7(r0, r10, r9)
            if (r13 != 0) goto L_0x0057
            return r1
        L_0x0057:
            hb2.e r13 = new hb2.e
            r13.<init>()
            r11 = 2
            r13.f170727g = r11
            hb2.e$b r2 = hb2.C59811e.f170722p
            r2.mo84765a(r14, r13)
            com.tencent.mm.plugin.mv.model.MvCreateReportHelper r2 = com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper.f163005a
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r4 = r8.f180772h
            java.util.ArrayList<T> r4 = r4.f272353o
            int r4 = r4.size()
            r2.mo80351b(r4, r13)
            ib2.a r13 = new ib2.a
            r4 = 2
            long r5 = java.lang.System.currentTimeMillis()
            r2 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7)
            ib2.a$b r15 = new ib2.a$b
            r2 = 0
            r15.<init>(r2, r2, r10, r2)
            r13.f171817i = r15
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.f163649b
            r15.f171827b = r14
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r15.f171827b
            if (r14 == 0) goto L_0x00b1
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r14 = r14.objectDesc
            if (r14 == 0) goto L_0x00b1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r14 = r14.media
            if (r14 == 0) goto L_0x00b1
            java.lang.Object r14 = sx3.C110818d0.m150917O(r14, r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r14 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r14
            if (r14 == 0) goto L_0x00b1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r14.thumbUrl
            r3.append(r4)
            java.lang.String r14 = r14.thumb_url_token
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            goto L_0x00b2
        L_0x00b1:
            r14 = r2
        L_0x00b2:
            r15.f171826a = r14
            r13.f171818j = r0
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r14 = r8.f180772h
            com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119209l(r14, r13, r1, r11, r2)
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r13 = r8.f180772h
            r13.mo80353u()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerUI.mo80372v0(boolean, com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$e, int):boolean");
    }
}
