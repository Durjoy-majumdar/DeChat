package com.tencent.p014mm.album.p836ui.gallery.uic;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.p136ui.anim.transition.view.AnimMultiTouchImage;
import com.tencent.p014mm.p136ui.base.DragDownContainer;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.InterceptRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gj3.C59469a;
import gj3.C59474h;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import kg3.C76577a;
import kotlin.Metadata;
import mh0.C99864d;
import o40.C61926c;
import p1083jg.C98939a;
import p1086ro.C101415b;
import p278yh.C66642a;
import p278yh.C66644d;
import p434ig.C98672d;
import p434ig.C98674g;
import p606mm.C99933h;
import p663qo.C63287k;
import p816jl.C60878a;
import p849e3.C58525r;
import p855lg.C61278a;
import p858ng.C61687a;
import p858ng.C61689a0;
import p858ng.C61691c;
import p858ng.C61696d;
import p858ng.C61704k;
import p858ng.C61710l;
import p858ng.C61711m;
import p858ng.C61712n;
import p858ng.C61713o;
import p858ng.C61717p;
import p858ng.C61718q;
import p858ng.C61723r;
import p858ng.C61724s;
import p858ng.C61725t;
import p858ng.C61726u;
import p858ng.C61727v;
import p858ng.C61728w;
import p858ng.C61730x;
import p858ng.C61731y;
import p858ng.C61732z;
import p859og.C62002a;
import p859og.C62003b;
import p859og.C62005d;
import ph0.C100792a;
import qh0.C62619a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import th0.C101880a;
import th0.C101888l;
import yb2.C15946a;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC */
public final class AlbumGalleryUIC extends C15946a {

    /* renamed from: d */
    public final C13601g f154632d = C36568h.m40985a(new C55089r(this));

    /* renamed from: e */
    public MvPreviewLiveList f154633e;

    /* renamed from: f */
    public C103009m<C61278a> f154634f;

    /* renamed from: g */
    public C61278a f154635g;

    /* renamed from: h */
    public final C13601g f154636h = C36568h.m40985a(new C55087p(this));

    /* renamed from: i */
    public boolean f154637i;

    /* renamed from: j */
    public final C13601g f154638j;

    /* renamed from: n */
    public final C13601g f154639n;

    /* renamed from: o */
    public final AlbumGalleryUIC$layoutManager$1 f154640o;

    /* renamed from: p */
    public final C55084m f154641p;

    /* renamed from: q */
    public final C55083l f154642q;

    /* renamed from: r */
    public boolean f154643r;

    /* renamed from: s */
    public final MTimerHandler f154644s;

    /* renamed from: t */
    public final C55074c f154645t;

    /* renamed from: u */
    public final C92795s f154646u;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$MvPreviewLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Llg/a;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lac2/f;Lzb2/h;)V", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$MvPreviewLiveList */
    public static final class MvPreviewLiveList extends MvvmList<C61278a> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MvPreviewLiveList(AppCompatActivity appCompatActivity, C54000f<C61278a, C53998c<C61278a>, C39534d<C61278a>> fVar, C53769h hVar) {
            super(fVar, hVar, appCompatActivity, (LifecycleScope) null, (List) null, 24, (C8480h) null);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(fVar, "dataSource");
            C87412m.m108594g(hVar, "config");
        }

        /* renamed from: b */
        public String mo5660b() {
            return "MicroMsg.Mvvm.MvvmList";
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$a */
    public static final class C55070a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ AlbumGalleryUIC f154647a;

        public C55070a(AlbumGalleryUIC albumGalleryUIC) {
            this.f154647a = albumGalleryUIC;
        }

        public void onAnimationEnd(Animation animation) {
            C87412m.m108594g(animation, "animation");
            this.f154647a.mo76192j3().mo90691d().setVisibility(8);
            this.f154647a.f154644s.stopTimer();
        }

        public void onAnimationRepeat(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$b */
    public static final class C55071b implements C92795s {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154648d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f154649e;

        /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$b$a */
        public static final class C55072a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AlbumGalleryUIC f154650d;

            /* renamed from: e */
            public final /* synthetic */ AppCompatActivity f154651e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55072a(AlbumGalleryUIC albumGalleryUIC, AppCompatActivity appCompatActivity) {
                super(0);
                this.f154650d = albumGalleryUIC;
                this.f154651e = appCompatActivity;
            }

            public Object invoke() {
                C103009m<C61278a> mVar;
                C98672d dVar;
                AlbumGalleryUIC albumGalleryUIC = this.f154650d;
                C61278a aVar = albumGalleryUIC.f154635g;
                if (aVar != null) {
                    AppCompatActivity appCompatActivity = this.f154651e;
                    albumGalleryUIC.mo76195m3(aVar);
                    C61278a aVar2 = albumGalleryUIC.f154635g;
                    boolean z = false;
                    if (!(aVar2 == null || (dVar = aVar2.f174389h) == null || dVar.mo55274P() != 4)) {
                        z = true;
                    }
                    if (!z && (mVar = albumGalleryUIC.f154634f) != null) {
                        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C61691c.class);
                        C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                        mVar.notifyItemChanged(((C61691c) a).mo86622c3().getState().f175413g);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$b$b */
        public static final class C55073b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AlbumGalleryUIC f154652d;

            /* renamed from: e */
            public final /* synthetic */ AppCompatActivity f154653e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55073b(AlbumGalleryUIC albumGalleryUIC, AppCompatActivity appCompatActivity) {
                super(0);
                this.f154652d = albumGalleryUIC;
                this.f154653e = appCompatActivity;
            }

            public Object invoke() {
                C98672d dVar;
                this.f154652d.mo76192j3().mo90690c().setVisibility(8);
                boolean z = false;
                this.f154652d.mo76192j3().mo90689b().setVisibility(0);
                C61278a aVar = this.f154652d.f154635g;
                if (!(aVar == null || (dVar = aVar.f174389h) == null || dVar.mo55274P() != 4)) {
                    z = true;
                }
                if (z) {
                    this.f154652d.mo76192j3().mo90689b().setText(this.f154653e.getResources().getString(C0966R.string.bzf));
                } else {
                    this.f154652d.mo76192j3().mo90689b().setText(this.f154653e.getResources().getString(C0966R.string.bze));
                }
                return C13598b0.f38549a;
            }
        }

        public C55071b(AlbumGalleryUIC albumGalleryUIC, AppCompatActivity appCompatActivity) {
            this.f154648d = albumGalleryUIC;
            this.f154649e = appCompatActivity;
        }

        /* renamed from: o2 */
        public void mo76200o2(int i, C55385t tVar) {
            C72963f4 f4Var;
            C72963f4 f4Var2;
            C87412m.m108594g(tVar, "mediaTaskInfo");
            C61278a aVar = this.f154648d.f154635g;
            if (aVar != null) {
                String str = tVar.f157721c;
                Long l = null;
                C98672d dVar = aVar.f174389h;
                if (C87412m.m108589b(str, dVar != null ? dVar.mo55264K() : null)) {
                    if (i == 1) {
                        C61926c.m72668M(new C55072a(this.f154648d, this.f154649e));
                    } else if (i == 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("download error, msgId: ");
                        C61278a aVar2 = this.f154648d.f154635g;
                        if (!(aVar2 == null || (f4Var = aVar2.f174390i) == null)) {
                            l = Long.valueOf(f4Var.getMsgId());
                        }
                        sb.append(l);
                        sb.append(", dataId: ");
                        sb.append(tVar.f157721c);
                        Log.m105924i("MicroMsg.AlbumGalleryUIC", sb.toString());
                    } else if (i == 3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("download expired, msgId: ");
                        C61278a aVar3 = this.f154648d.f154635g;
                        if (!(aVar3 == null || (f4Var2 = aVar3.f174390i) == null)) {
                            l = Long.valueOf(f4Var2.getMsgId());
                        }
                        sb4.append(l);
                        sb4.append(", dataId: ");
                        sb4.append(tVar.f157721c);
                        Log.m105924i("MicroMsg.AlbumGalleryUIC", sb4.toString());
                        C61926c.m72668M(new C55073b(this.f154648d, this.f154649e));
                    } else if (i == 4) {
                        AlbumGalleryUIC albumGalleryUIC = this.f154648d;
                        long j = tVar.f157723e;
                        long j2 = tVar.f157724f;
                        albumGalleryUIC.getClass();
                        C61926c.m72668M(new C61717p(albumGalleryUIC, j2, j, true));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$c */
    public static final class C55074c extends C59469a {

        /* renamed from: b */
        public final /* synthetic */ AlbumGalleryUIC f154654b;

        public C55074c(AlbumGalleryUIC albumGalleryUIC) {
            this.f154654b = albumGalleryUIC;
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            if (!(list == null || map == null)) {
                list.clear();
                map.clear();
                RecyclerView.LayoutManager layoutManager = this.f154654b.mo76192j3().mo90692e().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    C59474h.f169945h.mo84575a(list, map, linearLayoutManager.findViewByPosition(linearLayoutManager.mo17004z()), Integer.MAX_VALUE);
                }
            }
            super.onMapSharedElements(list, map);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            if (!(list2 == null || list3 == null || list2.size() != list3.size())) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    View view = list2.get(i);
                    View view2 = list3.get(i);
                    if ((view instanceof AnimMultiTouchImage) && (view2 instanceof ImageView)) {
                        AnimMultiTouchImage animMultiTouchImage = (AnimMultiTouchImage) view;
                        if (animMultiTouchImage.getDrawable() == null) {
                            ImageView imageView = (ImageView) view2;
                            if (imageView.getDrawable() != null) {
                                Drawable drawable = imageView.getDrawable();
                                if (drawable instanceof BitmapDrawable) {
                                    animMultiTouchImage.setAnimBitmap(((BitmapDrawable) drawable).getBitmap());
                                }
                            }
                        }
                    }
                }
            }
            super.onSharedElementStart(list, list2, list3);
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$d */
    public /* synthetic */ class C55075d extends C24565l implements C32226l<C61710l, C13598b0> {
        public C55075d(Object obj) {
            super(1, obj, AlbumGalleryUIC.class, "processState", "processState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C61710l) obj, "p0");
            ((AlbumGalleryUIC) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$e */
    public /* synthetic */ class C55076e extends C24565l implements C32226l<C61710l, C13598b0> {
        public C55076e(Object obj) {
            super(1, obj, AlbumGalleryUIC.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C61710l lVar = (C61710l) obj;
            C87412m.m108594g(lVar, "p0");
            AlbumGalleryUIC.m62190g3((AlbumGalleryUIC) this.receiver, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$f */
    public /* synthetic */ class C55077f extends C24565l implements C32226l<C61710l, C13598b0> {
        public C55077f(Object obj) {
            super(1, obj, AlbumGalleryUIC.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C61710l lVar = (C61710l) obj;
            C87412m.m108594g(lVar, "p0");
            AlbumGalleryUIC.m62190g3((AlbumGalleryUIC) this.receiver, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$g */
    public static final class C55078g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154655d;

        public C55078g(AlbumGalleryUIC albumGalleryUIC) {
            this.f154655d = albumGalleryUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f154655d.getActivity().onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$h */
    public static final class C55079h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154656d;

        public C55079h(AlbumGalleryUIC albumGalleryUIC) {
            this.f154656d = albumGalleryUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumGalleryUIC albumGalleryUIC = this.f154656d;
            C61278a aVar = albumGalleryUIC.f154635g;
            if (aVar != null) {
                AppCompatActivity activity = albumGalleryUIC.getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                ((C61691c) a).mo86622c3().dispatch(new C61727v(aVar, 13));
            }
            C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$i */
    public static final class C55080i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154657d;

        public C55080i(AlbumGalleryUIC albumGalleryUIC) {
            this.f154657d = albumGalleryUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity activity = this.f154657d.getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61704k.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…lleryMenuUIC::class.java)");
            ((C61704k) a).mo86624c3().dispatch(new C61730x(15));
            C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$j */
    public static final class C55081j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154658d;

        public C55081j(AlbumGalleryUIC albumGalleryUIC) {
            this.f154658d = albumGalleryUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f154658d.mo76192j3().mo90690c().setVisibility(0);
            this.f154658d.mo76192j3().mo90689b().setVisibility(8);
            AppCompatActivity activity = this.f154658d.getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
            ((C61691c) a).mo86622c3().dispatch(new C61689a0(14));
            this.f154658d.mo76192j3().mo90690c().setText("0%");
            C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$k */
    public static final class C55082k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154659d;

        public C55082k(AlbumGalleryUIC albumGalleryUIC) {
            this.f154659d = albumGalleryUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f154659d.mo76192j3().mo90690c().setVisibility(8);
            this.f154659d.mo76192j3().mo90689b().setVisibility(0);
            AppCompatActivity activity = this.f154659d.getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
            ((C61691c) a).mo86622c3().dispatch(new C61723r());
            C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$l */
    public static final class C55083l implements C60878a.C46560a {

        /* renamed from: a */
        public final /* synthetic */ AlbumGalleryUIC f154660a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f154661b;

        public C55083l(AlbumGalleryUIC albumGalleryUIC, AppCompatActivity appCompatActivity) {
            this.f154660a = albumGalleryUIC;
            this.f154661b = appCompatActivity;
        }

        public void onPageSelected(int i) {
            ArrayList<T> arrayList;
            C61278a aVar;
            int i2 = i;
            Class cls = C61691c.class;
            MvPreviewLiveList mvPreviewLiveList = this.f154660a.f154633e;
            if (mvPreviewLiveList != null && (arrayList = mvPreviewLiveList.f272353o) != null && (aVar = (C61278a) C110818d0.m150917O(arrayList, i2)) != null) {
                AlbumGalleryUIC albumGalleryUIC = this.f154660a;
                AppCompatActivity appCompatActivity = this.f154661b;
                if (!C87412m.m108589b(albumGalleryUIC.f154635g, aVar)) {
                    albumGalleryUIC.f154635g = aVar;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C39818r rVar = C39818r.f106831a;
                    C39622i0 a = rVar.mo62444c(appCompatActivity).mo75002a(cls);
                    C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                    ((C61691c) a).mo86622c3().dispatch(new C61728w(C61728w.C61729a.Gallery, aVar, i2));
                    C39622i0 a2 = rVar.mo62444c(appCompatActivity).mo75002a(C61718q.class);
                    C87412m.m108593f(a2, "UICProvider.of(activity)…leryVideoUIC::class.java)");
                    C61718q qVar = (C61718q) a2;
                    InterceptRecyclerView e = albumGalleryUIC.mo76192j3().mo90692e();
                    C87412m.m108593f(e, "uiBinding.recyclerView");
                    AlbumVideoView albumVideoView = qVar.f175424d;
                    if (albumVideoView != null) {
                        albumVideoView.mo76211d();
                    }
                    C61278a aVar2 = qVar.f175425e;
                    if (aVar2 != null) {
                        AppCompatActivity activity = qVar.getActivity();
                        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C39622i0 a3 = rVar.mo62444c(activity).mo75002a(cls);
                        C87412m.m108593f(a3, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                        ((C61691c) a3).mo86622c3().dispatch(new C61724s(aVar2, false));
                    }
                    RecyclerView.C16631z I0 = e.mo17023I0(i2);
                    C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                    if (oVar != null) {
                        RecyclerView.C16613e adapter = e.getAdapter();
                        if (adapter != null && adapter.getItemViewType(i2) == 4) {
                            C66644d dVar = new C66644d(oVar.f44854d);
                            if (!dVar.mo90695a().mo76210c()) {
                                if (i2 != ((Number) ((C36570n) qVar.f175427g).getValue()).intValue() || qVar.f175426f) {
                                    dVar.mo90695a().setStartAfterPrepared(false);
                                    dVar.mo90695a().mo76214g(true);
                                } else {
                                    dVar.mo90695a().mo76214g(false);
                                    dVar.mo90695a().setStartAfterPrepared(true);
                                    qVar.f175426f = true;
                                }
                                C101880a aVar3 = C101880a.f299976a;
                                AlbumVideoView a4 = dVar.mo90695a();
                                C87412m.m108593f(a4, "uiBinding.videoView");
                                aVar3.mo141345b(aVar, i2, a4);
                                AlbumVideoView a5 = dVar.mo90695a();
                                Log.m105925i(a5.f154680d, "VideoPlay:   onResume() isStartAfterPrepared:%s", Boolean.valueOf(a5.f154699z));
                                ((C63287k) C86312j.m106911c(C63287k.class)).mo88185wy(a5.f154679I);
                                if (!a5.f154691r) {
                                    if (Util.isNullOrNil(a5.f154690q) || !C86013q1.m106450k(a5.f154690q)) {
                                        Log.m105924i(a5.f154680d, "VideoPlay: fullPath is  null, show error, toggleVideo()");
                                        a5.f154681e.post(new C62005d(a5, false));
                                    } else {
                                        Log.m105924i(a5.f154680d, "VideoPlay: fullPath is not null,exist,  toggleVideo()");
                                        a5.f154681e.post(new C62002a(a5));
                                        a5.mo76212e(a5.f154690q);
                                    }
                                }
                                int i3 = a5.f154698y;
                                if (i3 > 0) {
                                    a5.f154688o.setVideoTotalTime(i3 / 1000);
                                }
                                C58525r.m67941a(a5.f154689p, new C62003b(a5));
                                qVar.f175424d = dVar.mo90695a();
                                qVar.f175425e = aVar;
                            }
                            Context context = oVar.f173499A;
                            C87412m.m108593f(context, "holder.context");
                            ((AlbumGalleryUIC) rVar.mo62443b(context).mo75002a(AlbumGalleryUIC.class)).mo76192j3().mo90692e().setInterceptChildView(dVar.mo90695a().getFooterRootVideo());
                        }
                    }
                    TextView a6 = albumGalleryUIC.mo76192j3().mo90688a();
                    C39622i0 a7 = rVar.mo62444c(appCompatActivity).mo75002a(cls);
                    C87412m.m108593f(a7, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                    a6.setText(albumGalleryUIC.mo76191i3(i2 + 1, ((C61691c) a7).mo86622c3().getState().f175411e));
                    albumGalleryUIC.mo76196n3();
                    albumGalleryUIC.mo76195m3(aVar);
                    if (albumGalleryUIC.f154637i) {
                        C61278a aVar4 = albumGalleryUIC.f154635g;
                        C72963f4 f4Var = aVar4 != null ? aVar4.f174390i : null;
                        C101888l lVar = C101888l.f300029a;
                        int size = lVar.mo141354c(aVar4 != null ? aVar4.f174388g : null).size();
                        C61278a aVar5 = albumGalleryUIC.f154635g;
                        int size2 = lVar.mo141355d(aVar5 != null ? aVar5.f174388g : null).size();
                        C61278a aVar6 = albumGalleryUIC.f154635g;
                        ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(12, f4Var, size, size2, aVar6 != null ? aVar6.f174389h : null, i));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$m */
    public static final class C55084m implements C60878a.C46561b {

        /* renamed from: a */
        public final /* synthetic */ AlbumGalleryUIC f154662a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f154663b;

        public C55084m(AlbumGalleryUIC albumGalleryUIC, AppCompatActivity appCompatActivity) {
            this.f154662a = albumGalleryUIC;
            this.f154663b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo67434a(int i) {
            ArrayList<T> arrayList;
            C61278a aVar;
            MvPreviewLiveList mvPreviewLiveList = this.f154662a.f154633e;
            if (mvPreviewLiveList != null && (arrayList = mvPreviewLiveList.f272353o) != null && (aVar = (C61278a) C110818d0.m150917O(arrayList, i)) != null) {
                AppCompatActivity appCompatActivity = this.f154663b;
                C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C61691c.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                ((C61691c) a).mo86622c3().dispatch(new C61728w(C61728w.C61729a.Gallery, aVar, i));
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$n */
    public static final class C55085n extends C87413o implements C32224a<C60878a> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55085n(AlbumGalleryUIC albumGalleryUIC) {
            super(0);
            this.f154664d = albumGalleryUIC;
        }

        public Object invoke() {
            C60878a aVar = new C60878a();
            AlbumGalleryUIC albumGalleryUIC = this.f154664d;
            aVar.f173448n = albumGalleryUIC.f154641p;
            aVar.f173447m = albumGalleryUIC.f154642q;
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$o */
    public static final class C55086o extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55086o(AlbumGalleryUIC albumGalleryUIC) {
            super(0);
            this.f154665d = albumGalleryUIC;
        }

        public Object invoke() {
            return Integer.valueOf(this.f154665d.getIntent().getIntExtra("album_enter_from_scene", 1));
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$p */
    public static final class C55087p extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55087p(AlbumGalleryUIC albumGalleryUIC) {
            super(0);
            this.f154666d = albumGalleryUIC;
        }

        public Object invoke() {
            return Integer.valueOf(this.f154666d.getIntent().getIntExtra("album_enter_position_from_list_page", 0));
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$q */
    public static final class C55088q implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154667d;

        public C55088q(AlbumGalleryUIC albumGalleryUIC) {
            this.f154667d = albumGalleryUIC;
        }

        public final boolean onTimerExpired() {
            this.f154667d.mo76194l3();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$r */
    public static final class C55089r extends C87413o implements C32224a<C66642a> {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f154668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55089r(AlbumGalleryUIC albumGalleryUIC) {
            super(0);
            this.f154668d = albumGalleryUIC;
        }

        public Object invoke() {
            return new C66642a(this.f154668d.getRootView());
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.uic.AlbumGalleryUIC$s */
    public static final class C55090s extends C87413o implements C32224a<UIStateCenter<C61710l>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f154669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55090s(AppCompatActivity appCompatActivity) {
            super(0);
            this.f154669d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C61710l(), this.f154669d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumGalleryUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C55086o(this));
        this.f154638j = C36568h.m40985a(new C55085n(this));
        this.f154639n = C36568h.m40985a(new C55090s(appCompatActivity));
        this.f154640o = new AlbumGalleryUIC$layoutManager$1(appCompatActivity);
        this.f154641p = new C55084m(this, appCompatActivity);
        this.f154642q = new C55083l(this, appCompatActivity);
        this.f154644s = new MTimerHandler(new C55088q(this), false);
        this.f154645t = new C55074c(this);
        this.f154646u = new C55071b(this, appCompatActivity);
    }

    /* renamed from: g3 */
    public static final void m62190g3(AlbumGalleryUIC albumGalleryUIC, C61710l lVar) {
        C61724s sVar;
        C61278a aVar;
        String str;
        AlbumGalleryUIC albumGalleryUIC2 = albumGalleryUIC;
        albumGalleryUIC.getClass();
        Class cls = C63287k.class;
        Class cls2 = C101415b.class;
        Class cls3 = C99864d.class;
        IStateAction action = lVar.getAction();
        if (action != null && (action instanceof C61696d)) {
            albumGalleryUIC.mo76192j3().mo90692e().setLayoutManager(albumGalleryUIC2.f154640o);
            C66642a j3 = albumGalleryUIC.mo76192j3();
            if (j3.f191626h == null) {
                j3.f191626h = (DragDownContainer) j3.f191619a.findViewById(C0966R.C0970id.o67);
            }
            j3.f191626h.setScaleListener(new C61711m(albumGalleryUIC2));
            C61696d dVar = (C61696d) action;
            MvPreviewLiveList mvPreviewLiveList = new MvPreviewLiveList(albumGalleryUIC.getActivity(), new C61687a(dVar.f175391a), new C53769h());
            albumGalleryUIC2.f154634f = new C103009m<>(mvPreviewLiveList, new AlbumGalleryUIC$buildItemConvertFactory$1(albumGalleryUIC2), false);
            albumGalleryUIC.mo76192j3().mo90692e().setAdapter(albumGalleryUIC2.f154634f);
            albumGalleryUIC2.f154633e = mvPreviewLiveList;
            ((C60878a) ((C36570n) albumGalleryUIC2.f154638j).getValue()).mo75025b(albumGalleryUIC.mo76192j3().mo90692e());
            C103009m<C61278a> mVar = albumGalleryUIC2.f154634f;
            if (mVar != null) {
                mVar.f165746y = new C61712n(albumGalleryUIC2);
            }
            albumGalleryUIC.mo76192j3().mo90692e().post(new C61713o(albumGalleryUIC2));
            albumGalleryUIC.mo76192j3().mo90688a().setText(albumGalleryUIC2.mo76191i3(((Number) ((C36570n) albumGalleryUIC2.f154636h).getValue()).intValue(), dVar.f175391a));
        }
        IStateAction action2 = lVar.getAction();
        if (action2 != null && (action2 instanceof C61689a0)) {
            C61689a0 a0Var = (C61689a0) action2;
            C61278a aVar2 = albumGalleryUIC2.f154635g;
            if (aVar2 != null) {
                albumGalleryUIC2.f154644s.stopTimer();
                if (aVar2.f174389h.mo55274P() == 4) {
                    String j = C100792a.f295260a.mo140238j(aVar2.f174389h, aVar2.f174390i);
                    Log.m105925i("MicroMsg.AlbumGalleryUIC", "start download video, path:%s", j);
                    C98597b.C60245a aVar3 = C98597b.f289091e;
                    C7335d c = C86312j.m106911c(cls3);
                    C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                    ((C101415b) aVar3.mo85231a((C98598e) c, cls2)).mo140926j3(aVar2.f174390i, aVar2.f174389h, j, true);
                } else if (aVar2.f174389h.mo55274P() == 2) {
                    C100792a aVar4 = C100792a.f295260a;
                    String j2 = aVar4.mo140238j(aVar2.f174389h, aVar2.f174390i);
                    Log.m105925i("MicroMsg.AlbumGalleryUIC", "start download img, path:%s", j2);
                    C98597b.C60245a aVar5 = C98597b.f289091e;
                    C7335d c2 = C86312j.m106911c(cls3);
                    C87412m.m108593f(c2, "getService(AlbumFeatureService::class.java)");
                    C101415b bVar = (C101415b) aVar5.mo85231a((C98598e) c2, cls2);
                    C72963f4 f4Var = aVar2.f174390i;
                    C98672d dVar2 = aVar2.f174389h;
                    C87412m.m108594g(dVar2, "dataItem");
                    String o = aVar4.mo140243o(dVar2.mo55264K(), f4Var, true);
                    C55385t tVar = new C55385t();
                    tVar.f157719a = dVar2.mo55248C();
                    tVar.f157720b = dVar2.mo55250D();
                    tVar.f157721c = dVar2.mo55264K();
                    tVar.f157722d = o;
                    tVar.f157724f = dVar2.mo55268M();
                    tVar.f157725g = o.hashCode();
                    tVar.f157726h = j2;
                    tVar.f157727i = dVar2.mo55282T();
                    tVar.f157732n = dVar2.mo55286V();
                    tVar.f157733o = f4Var != null ? f4Var.getMsgId() : 0;
                    ((C63287k) C86312j.m106911c(cls)).mo88184wS(tVar);
                }
                C61278a aVar6 = albumGalleryUIC2.f154635g;
                C98674g gVar = null;
                C72963f4 f4Var2 = aVar6 != null ? aVar6.f174390i : null;
                C101888l lVar2 = C101888l.f300029a;
                int size = lVar2.mo141354c(aVar6 != null ? aVar6.f174388g : null).size();
                C61278a aVar7 = albumGalleryUIC2.f154635g;
                if (aVar7 != null) {
                    gVar = aVar7.f174388g;
                }
                int size2 = lVar2.mo141355d(gVar).size();
                long j4 = a0Var.f175385a;
                C61278a aVar8 = albumGalleryUIC2.f154635g;
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(j4, f4Var2, size, size2, aVar2.f174389h, aVar8 != null ? aVar8.f174386e : 0));
            }
        }
        IStateAction action3 = lVar.getAction();
        if (!(action3 == null || !(action3 instanceof C61724s) || (aVar = sVar.f175433a) == null)) {
            C98597b.C60245a aVar9 = C98597b.f289091e;
            C7335d c3 = C86312j.m106911c(cls3);
            C87412m.m108593f(c3, "getService(AlbumFeatureService::class.java)");
            C101415b bVar2 = (C101415b) aVar9.mo85231a((C98598e) c3, cls2);
            C72963f4 f4Var3 = aVar.f174390i;
            C98672d dVar3 = aVar.f174389h;
            boolean z = (sVar = (C61724s) action3).f175434b;
            C87412m.m108594g(dVar3, "dataItem");
            if (z || Util.isNullOrNil(dVar3.mo55302d0())) {
                str = C100792a.f295260a.mo140242n(dVar3.mo55264K(), f4Var3 != null ? f4Var3.getMsgId() : 0, true);
            } else {
                C100792a aVar10 = C100792a.f295260a;
                str = aVar10.mo140243o(aVar10.mo140244p(dVar3.mo55264K()), f4Var3, true);
            }
            ((C63287k) C86312j.m106911c(cls)).mo88182lc(str);
        }
        IStateAction action4 = lVar.getAction();
        if (action4 != null && (action4 instanceof C61723r)) {
            C61723r rVar = (C61723r) action4;
            ((C63287k) C86312j.m106911c(cls)).mo88186yO();
        }
        IStateAction action5 = lVar.getAction();
        if (action5 != null && (action5 instanceof C61731y)) {
            C61731y yVar = (C61731y) action5;
            C61926c.m72668M(new C61717p(albumGalleryUIC, yVar.f175444b, yVar.f175443a, false));
        }
        IStateAction action6 = lVar.getAction();
        if (action6 != null && (action6 instanceof C61725t)) {
            albumGalleryUIC2.mo76195m3(((C61725t) action6).f175435a);
        }
        IStateAction action7 = lVar.getAction();
        if (action7 != null && (action7 instanceof C61732z)) {
            C61732z zVar = (C61732z) action7;
            albumGalleryUIC.mo76196n3();
        }
        IStateAction action8 = lVar.getAction();
        if (action8 != null && (action8 instanceof C61726u)) {
            C61726u uVar = (C61726u) action8;
            albumGalleryUIC.mo76194l3();
        }
    }

    /* renamed from: i3 */
    public final String mo76191i3(int i, List<C61278a> list) {
        return "" + i + XVFSFile.SEPARATOR_CHAR + list.size();
    }

    /* renamed from: j3 */
    public final C66642a mo76192j3() {
        return (C66642a) ((C36570n) this.f154632d).getValue();
    }

    /* renamed from: k3 */
    public final UIStateCenter<C61710l> mo76193k3() {
        return (UIStateCenter) ((C36570n) this.f154639n).getValue();
    }

    /* renamed from: l3 */
    public final void mo76194l3() {
        if (this.f154643r) {
            this.f154643r = false;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) 150);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new AccelerateInterpolator(10.0f));
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setAnimationListener(new C55070a(this));
            mo76192j3().mo90691d().clearAnimation();
            mo76192j3().mo90691d().startAnimation(alphaAnimation);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76195m3(p855lg.C61278a r10) {
        /*
            r9 = this;
            th0.l r0 = th0.C101888l.f300029a
            ig.d r1 = r10.f174389h
            com.tencent.mm.storage.f4 r2 = r10.f174390i
            boolean r1 = r0.mo141359i(r1, r2)
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L_0x0141
            yh.a r1 = r9.mo76192j3()
            android.widget.Button r1 = r1.mo90689b()
            r1.setVisibility(r3)
            yh.a r1 = r9.mo76192j3()
            android.widget.Button r1 = r1.mo90690c()
            r1.setVisibility(r2)
            yh.a r1 = r9.mo76192j3()
            android.widget.TextView r1 = r1.mo90688a()
            r1.setVisibility(r3)
            ig.d r1 = r10.f174389h
            int r1 = r1.mo55274P()
            java.lang.String r4 = "albumDataItem"
            r5 = 2
            r6 = 1
            if (r1 != r5) goto L_0x0098
            ig.d r1 = r10.f174389h
            com.tencent.mm.storage.f4 r7 = r10.f174390i
            gy3.C87412m.m108594g(r1, r4)
            int r8 = r1.mo55274P()
            if (r8 == r5) goto L_0x004a
            goto L_0x005e
        L_0x004a:
            boolean r5 = r0.mo141359i(r1, r7)
            if (r5 == 0) goto L_0x005e
            ph0.a r5 = ph0.C100792a.f295260a
            java.lang.String r1 = r5.mo140238j(r1, r7)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x005e
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 != 0) goto L_0x0098
            yh.a r0 = r9.mo76192j3()
            android.widget.Button r0 = r0.mo90689b()
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131820910(0x7f11016e, float:1.9274548E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            th0.a r6 = th0.C101880a.f299976a
            ig.d r10 = r10.f174389h
            long r7 = r10.mo55268M()
            java.lang.String r10 = r6.mo141344a(r7)
            r5[r3] = r10
            java.lang.String r10 = r1.getString(r4, r5)
            r0.setText(r10)
            yh.a r10 = r9.mo76192j3()
            android.widget.TextView r10 = r10.mo90688a()
            r10.setVisibility(r2)
            goto L_0x0162
        L_0x0098:
            ig.d r1 = r10.f174389h
            int r1 = r1.mo55274P()
            r5 = 4
            if (r1 != r5) goto L_0x011f
            mh0.a r1 = r10.f174387f
            ig.d r7 = r10.f174389h
            com.tencent.mm.storage.f4 r8 = r10.f174390i
            gy3.C87412m.m108594g(r7, r4)
            int r4 = r7.mo55274P()
            if (r4 == r5) goto L_0x00b1
            goto L_0x00e6
        L_0x00b1:
            boolean r0 = r0.mo141359i(r7, r8)
            if (r0 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00d5
            java.lang.String r0 = r7.mo55264K()
            mh0.q r0 = r1.mo139216A(r0)
            if (r0 == 0) goto L_0x00d5
            int r1 = r0.mo55387L()
            if (r1 == 0) goto L_0x00d5
            int r1 = r0.mo55388M()
            int r0 = r0.mo55387L()
            if (r1 != r0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            if (r0 != 0) goto L_0x00e4
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r0 = r0.mo140238j(r7, r8)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x00e6
        L_0x00e4:
            r0 = 1
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            if (r0 != 0) goto L_0x011f
            yh.a r0 = r9.mo76192j3()
            android.widget.Button r0 = r0.mo90689b()
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131820912(0x7f110170, float:1.9274552E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            th0.a r6 = th0.C101880a.f299976a
            ig.d r10 = r10.f174389h
            long r7 = r10.mo55268M()
            java.lang.String r10 = r6.mo141344a(r7)
            r5[r3] = r10
            java.lang.String r10 = r1.getString(r4, r5)
            r0.setText(r10)
            yh.a r10 = r9.mo76192j3()
            android.widget.TextView r10 = r10.mo90688a()
            r10.setVisibility(r2)
            goto L_0x0162
        L_0x011f:
            yh.a r10 = r9.mo76192j3()
            android.widget.Button r10 = r10.mo90689b()
            r10.setVisibility(r2)
            yh.a r10 = r9.mo76192j3()
            android.widget.Button r10 = r10.mo90690c()
            r10.setVisibility(r2)
            yh.a r10 = r9.mo76192j3()
            android.widget.TextView r10 = r10.mo90688a()
            r10.setVisibility(r3)
            goto L_0x0162
        L_0x0141:
            yh.a r10 = r9.mo76192j3()
            android.widget.Button r10 = r10.mo90689b()
            r10.setVisibility(r2)
            yh.a r10 = r9.mo76192j3()
            android.widget.Button r10 = r10.mo90690c()
            r10.setVisibility(r2)
            yh.a r10 = r9.mo76192j3()
            android.widget.TextView r10 = r10.mo90688a()
            r10.setVisibility(r3)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC.mo76195m3(lg.a):void");
    }

    /* renamed from: n3 */
    public final void mo76196n3() {
        if (!this.f154643r) {
            this.f154643r = true;
            this.f154644s.stopTimer();
            mo76192j3().mo90691d().setVisibility(0);
            mo76192j3().mo90691d().clearAnimation();
            RelativeLayout d = mo76192j3().mo90691d();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setFillAfter(true);
            d.startAnimation(alphaAnimation);
            this.f154644s.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    public void onCreate(Bundle bundle) {
        mo76193k3().process((C0125s) getActivity(), new C55075d(this));
        mo76193k3().observe((C0125s) getActivity(), new C55076e(this));
        AppCompatActivity activity = getActivity();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
        ((C61691c) a).mo86622c3().observe((C0125s) getActivity(), new C55077f(this));
        C66642a j3 = mo76192j3();
        if (j3.f191620b == null) {
            j3.f191620b = (FrameLayout) j3.f191619a.findViewById(C0966R.C0970id.dqq);
        }
        j3.f191620b.setOnClickListener(new C55078g(this));
        C66642a j35 = mo76192j3();
        if (j35.f191625g == null) {
            j35.f191625g = (FrameLayout) j35.f191619a.findViewById(C0966R.C0970id.c9n);
        }
        j35.f191625g.setOnClickListener(new C55079h(this));
        C66642a j36 = mo76192j3();
        if (j36.f191624f == null) {
            j36.f191624f = (FrameLayout) j36.f191619a.findViewById(C0966R.C0970id.gzq);
        }
        j36.f191624f.setOnClickListener(new C55080i(this));
        mo76192j3().mo90690c().getPaint().setFakeBoldText(true);
        mo76192j3().mo90689b().getPaint().setFakeBoldText(true);
        float f = 1.125f;
        float p = C76577a.m92165p(getActivity());
        if (1.125f > p) {
            f = p;
        }
        float f2 = ((float) 12) * f;
        mo76192j3().mo90690c().setTextSize(1, f2);
        mo76192j3().mo90690c().setTextSize(1, f2);
        mo76192j3().mo90689b().setOnClickListener(new C55081j(this));
        mo76192j3().mo90690c().setOnClickListener(new C55082k(this));
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88185wy(this.f154646u);
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        ((C59474h) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C59474h.class)).f169946d.mo84573a(this.f154645t);
    }

    public void onDestroy() {
        Class cls = C63287k.class;
        this.f154644s.stopTimer();
        ((C63287k) C86312j.m106911c(cls)).mo88186yO();
        ((C63287k) C86312j.m106911c(cls)).mo88181kj(this.f154646u);
    }
}
