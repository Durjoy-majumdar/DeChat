package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kb2.C60992f;
import kb2.C60995i;
import kotlin.Metadata;
import n03.C61597a;
import n03.C61598b;
import p501dz.C58467i;
import qb2.C62598a;
import qb2.C62599b;
import qb2.C62600c;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63738a;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64470jh3;
import te3.C64493kh3;
import te3.C64525lh3;
import ub2.C65257a;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC */
public final class MusicMvAlbumPreviewRecyclerUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f163221d;

    /* renamed from: e */
    public final C13601g f163222e;

    /* renamed from: f */
    public final C13601g f163223f = C36568h.m40985a(new C57003h(this));

    /* renamed from: g */
    public final C13601g f163224g;

    /* renamed from: h */
    public C60992f f163225h;

    /* renamed from: i */
    public MvPreviewLiveList f163226i;

    /* renamed from: j */
    public C103009m<C60995i> f163227j;

    /* renamed from: n */
    public final C13601g f163228n;

    /* renamed from: o */
    public final C57002g f163229o;

    /* renamed from: p */
    public final C57001f f163230p;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lkb2/i;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "<init>", "(Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC;Lac2/f;Lzb2/h;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList */
    public final class MvPreviewLiveList extends MvvmList<C60995i> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MvPreviewLiveList(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, C54000f<C60995i, C53998c<C60995i>, C39534d<C60995i>> fVar, C53769h hVar) {
            super(fVar, hVar, musicMvAlbumPreviewRecyclerUIC.getActivity(), (LifecycleScope) null, (List) null, 24, (C8480h) null);
            C87412m.m108594g(fVar, "dataSource");
            C87412m.m108594g(hVar, "config");
        }

        /* renamed from: b */
        public String mo5660b() {
            return "MicroMsg.Mv.MusicMvAlbumPreviewRecyclerUIC";
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$a */
    public static final class C56996a extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56996a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163231d = appCompatActivity;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f163231d, 0, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$b */
    public static final class C56997b extends C87413o implements C32226l<C62598a, C13598b0> {

        /* renamed from: d */
        public static final C56997b f163232d = new C56997b();

        public C56997b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C62598a aVar = (C62598a) obj;
            C87412m.m108594g(aVar, "state");
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C62599b)) {
                aVar.f177784d = ((C62599b) action).f177786a;
            }
            IStateAction action2 = aVar.getAction();
            if (action2 != null && (action2 instanceof C62600c)) {
                aVar.f177785e = ((C62600c) action2).f177788b;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$c */
    public static final class C56998c<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163233d;

        public C56998c(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
            this.f163233d = musicMvAlbumPreviewRecyclerUIC;
        }

        public void onChanged(Object obj) {
            LiveData<C91988j<T>> liveData;
            C62598a aVar = (C62598a) obj;
            C87412m.m108594g(aVar, "state");
            IStateAction action = aVar.getAction();
            if (action != null) {
                MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163233d;
                if (action instanceof C62599b) {
                    C62599b bVar = (C62599b) action;
                    C60992f fVar = new C60992f(bVar.f177786a);
                    musicMvAlbumPreviewRecyclerUIC.f163225h = fVar;
                    fVar.f173704e = bVar.f177786a.f184108f;
                    MvPreviewLiveList mvPreviewLiveList = new MvPreviewLiveList(musicMvAlbumPreviewRecyclerUIC, fVar, new C53769h());
                    musicMvAlbumPreviewRecyclerUIC.f163226i = mvPreviewLiveList;
                    musicMvAlbumPreviewRecyclerUIC.f163227j = new C103009m<>(mvPreviewLiveList, new MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1(musicMvAlbumPreviewRecyclerUIC), false);
                    musicMvAlbumPreviewRecyclerUIC.getRecyclerView().setAdapter(musicMvAlbumPreviewRecyclerUIC.f163227j);
                    musicMvAlbumPreviewRecyclerUIC.getRecyclerView().setLayoutManager((WxLinearLayoutManager) ((C36570n) musicMvAlbumPreviewRecyclerUIC.f163222e).getValue());
                    ((C65257a) ((C36570n) musicMvAlbumPreviewRecyclerUIC.f163223f).getValue()).mo75025b(musicMvAlbumPreviewRecyclerUIC.getRecyclerView());
                    MvPreviewLiveList mvPreviewLiveList2 = musicMvAlbumPreviewRecyclerUIC.f163226i;
                    if (mvPreviewLiveList2 != null && (liveData = mvPreviewLiveList2.f272358t) != null) {
                        liveData.observe(musicMvAlbumPreviewRecyclerUIC.getActivity(), new C57061b(musicMvAlbumPreviewRecyclerUIC, action));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$d */
    public static final class C56999d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63738a f163234d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163235e;

        public C56999d(C63738a aVar, MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
            this.f163234d = aVar;
            this.f163235e = musicMvAlbumPreviewRecyclerUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60995i iVar = this.f163234d.mo88561c3().getState().f177785e;
            if (iVar != null) {
                MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163235e;
                C63738a aVar = this.f163234d;
                GalleryItem$MediaItem galleryItem$MediaItem = iVar.f173717j;
                if (galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem) {
                    C87412m.m108592e(galleryItem$MediaItem, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                    Integer valueOf = Integer.valueOf(((GalleryItem$VideoMediaItem) galleryItem$MediaItem).f162766w);
                    if (valueOf != null && valueOf.intValue() <= 2000) {
                        C77426q qVar = new C77426q(musicMvAlbumPreviewRecyclerUIC.getActivity());
                        qVar.mo107595g(musicMvAlbumPreviewRecyclerUIC.getResources().getString(C0966R.string.h2s));
                        qVar.mo107602n(musicMvAlbumPreviewRecyclerUIC.getResources().getString(C0966R.string.f8028zq));
                        qVar.mo107603o();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                iVar.f173715h = !iVar.f173715h;
                aVar.mo88561c3().dispatch(new C62600c(C62600c.C62601a.CheckBox, iVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$e */
    public static final class C57000e<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163236d;

        public C57000e(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
            this.f163236d = musicMvAlbumPreviewRecyclerUIC;
        }

        public void onChanged(Object obj) {
            C62598a aVar = (C62598a) obj;
            C87412m.m108594g(aVar, "state");
            IStateAction action = aVar.getAction();
            if (action != null) {
                MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163236d;
                if (action instanceof C62600c) {
                    C62600c cVar = (C62600c) action;
                    int ordinal = cVar.f177787a.ordinal();
                    if (ordinal == 0) {
                        musicMvAlbumPreviewRecyclerUIC.mo80438d3().setChecked(cVar.f177788b.f173715h);
                    } else if (ordinal == 1) {
                        musicMvAlbumPreviewRecyclerUIC.mo80438d3().setChecked(cVar.f177788b.f173715h);
                        C60992f fVar = musicMvAlbumPreviewRecyclerUIC.f163225h;
                        if (fVar != null) {
                            fVar.f173704e = cVar.f177788b.f173714g;
                        }
                        MvPreviewLiveList mvPreviewLiveList = musicMvAlbumPreviewRecyclerUIC.f163226i;
                        if (mvPreviewLiveList != null) {
                            mvPreviewLiveList.mo129609m();
                        }
                        C64525lh3 lh32 = aVar.f177784d;
                        if (lh32 != null) {
                            MvPreviewLiveList mvPreviewLiveList2 = musicMvAlbumPreviewRecyclerUIC.f163226i;
                            C53769h hVar = mvPreviewLiveList2 != null ? mvPreviewLiveList2.f272346e : null;
                            if (hVar != null) {
                                C60995i iVar = cVar.f177788b;
                                hVar.f150922c = MusicMvAlbumPreviewRecyclerUIC.m65698c3(musicMvAlbumPreviewRecyclerUIC, lh32, iVar.f173714g, iVar.f173711d);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$f */
    public static final class C57001f implements C65257a.C65258a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163237a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f163238b;

        public C57001f(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, AppCompatActivity appCompatActivity) {
            this.f163237a = musicMvAlbumPreviewRecyclerUIC;
            this.f163238b = appCompatActivity;
        }

        public void onPageSelected(int i) {
            RecyclerView.C16631z F0;
            ArrayList<T> arrayList;
            C60995i iVar;
            MvPreviewLiveList mvPreviewLiveList = this.f163237a.f163226i;
            if (!(mvPreviewLiveList == null || (arrayList = mvPreviewLiveList.f272353o) == null || (iVar = (C60995i) C110818d0.m150917O(arrayList, i)) == null)) {
                C39622i0 a = C39818r.f106831a.mo62444c(this.f163238b).mo75002a(C63738a.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…eviewDataUIC::class.java)");
                ((C63738a) a).mo88561c3().dispatch(new C62600c(C62600c.C62601a.Gallery, iVar));
            }
            MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163237a;
            int childCount = musicMvAlbumPreviewRecyclerUIC.getRecyclerView().getChildCount();
            if (childCount >= 0) {
                int i2 = 0;
                while (true) {
                    View childAt = musicMvAlbumPreviewRecyclerUIC.getRecyclerView().getChildAt(i2);
                    if (!(childAt == null || (F0 = musicMvAlbumPreviewRecyclerUIC.getRecyclerView().mo17021F0(childAt)) == null)) {
                        View findViewById = F0.f44854d.findViewById(C0966R.C0970id.h7c);
                        C61597a aVar = findViewById instanceof C61597a ? (C61597a) findViewById : null;
                        if (aVar != null) {
                            aVar.mo81157c(musicMvAlbumPreviewRecyclerUIC.mo80439e3());
                            View findViewById2 = F0.f44854d.findViewById(C0966R.C0970id.hwy);
                            if (findViewById2 != null) {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                View view = findViewById2;
                                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                    if (i2 != childCount) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$g */
    public static final class C57002g implements C65257a.C65259b {

        /* renamed from: a */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163239a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f163240b;

        public C57002g(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, AppCompatActivity appCompatActivity) {
            this.f163239a = musicMvAlbumPreviewRecyclerUIC;
            this.f163240b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo80443a(int i) {
            ArrayList<T> arrayList;
            C60995i iVar;
            MvPreviewLiveList mvPreviewLiveList = this.f163239a.f163226i;
            if (mvPreviewLiveList != null && (arrayList = mvPreviewLiveList.f272353o) != null && (iVar = (C60995i) C110818d0.m150917O(arrayList, i)) != null) {
                C39622i0 a = C39818r.f106831a.mo62444c(this.f163240b).mo75002a(C63738a.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…eviewDataUIC::class.java)");
                ((C63738a) a).mo88561c3().dispatch(new C62600c(C62600c.C62601a.Gallery, iVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$h */
    public static final class C57003h extends C87413o implements C32224a<C65257a> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57003h(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
            super(0);
            this.f163241d = musicMvAlbumPreviewRecyclerUIC;
        }

        public Object invoke() {
            C65257a aVar = new C65257a();
            MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163241d;
            aVar.f187880o = musicMvAlbumPreviewRecyclerUIC.f163229o;
            aVar.f187879n = musicMvAlbumPreviewRecyclerUIC.f163230p;
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$i */
    public static final class C57004i extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57004i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163242d = appCompatActivity;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f163242d.findViewById(C0966R.C0970id.iiq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$j */
    public static final class C57005j extends C87413o implements C32224a<CheckBox> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57005j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163243d = appCompatActivity;
        }

        public Object invoke() {
            return (CheckBox) this.f163243d.findViewById(C0966R.C0970id.gpy);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$k */
    public static final class C57006k extends C87413o implements C32224a<C61598b> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57006k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163244d = appCompatActivity;
        }

        public Object invoke() {
            return ((C58467i) C86312j.m106911c(C58467i.class)).s60(this.f163244d, C0966R.C0970id.h7c, 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvAlbumPreviewRecyclerUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f163221d = C36568h.m40985a(new C57004i(appCompatActivity));
        this.f163222e = C36568h.m40985a(new C56996a(appCompatActivity));
        this.f163224g = C36568h.m40985a(new C57006k(appCompatActivity));
        this.f163228n = C36568h.m40985a(new C57005j(appCompatActivity));
        this.f163229o = new C57002g(this, appCompatActivity);
        this.f163230p = new C57001f(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public static final int m65698c3(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, C64525lh3 lh32, String str, String str2) {
        LinkedList<C64470jh3> linkedList;
        musicMvAlbumPreviewRecyclerUIC.getClass();
        LinkedList<C64493kh3> linkedList2 = lh32.f184106d;
        C87412m.m108593f(linkedList2, "obj.sourceList");
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList2) {
            if (C87412m.m108589b(((C64493kh3) next).f183943e, str)) {
                arrayList.add(next);
            }
        }
        C64493kh3 kh32 = (C64493kh3) C110818d0.m150917O(arrayList, 0);
        if (kh32 == null || (linkedList = kh32.f183942d) == null) {
            return 0;
        }
        int i = 0;
        for (T next2 : linkedList) {
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (C87412m.m108589b(((C64470jh3) next2).f183796d, str2)) {
                return i;
            } else {
                i = i2;
            }
        }
        return 0;
    }

    /* renamed from: d3 */
    public final CheckBox mo80438d3() {
        return (CheckBox) ((C36570n) this.f163228n).getValue();
    }

    /* renamed from: e3 */
    public final C61598b mo80439e3() {
        return (C61598b) ((C36570n) this.f163224g).getValue();
    }

    public final WxRecyclerView getRecyclerView() {
        return (WxRecyclerView) ((C36570n) this.f163221d).getValue();
    }

    public void onCreate(Bundle bundle) {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63738a.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…eviewDataUIC::class.java)");
        C63738a aVar = (C63738a) a;
        aVar.mo88561c3().process((C0125s) getActivity(), C56997b.f163232d);
        aVar.mo88561c3().observe((C0125s) getActivity(), new C56998c(this));
        Util.expandViewTouchArea(mo80438d3(), 100, 100, 100, 100);
        mo80438d3().setOnClickListener(new C56999d(aVar, this));
        aVar.mo88561c3().observe((C0125s) getActivity(), new C57000e(this));
    }

    public void onDestroy() {
        mo80439e3().destroy();
    }
}
