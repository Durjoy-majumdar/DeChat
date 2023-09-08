package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import kb2.C60995i;
import kb2.C60996j;
import kg3.C76577a;
import kotlin.Metadata;
import qb2.C62598a;
import qb2.C62599b;
import qb2.C62600c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63738a;
import te3.C64506kz3;
import te3.C64525lh3;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC */
public final class MusicMvAlbumPreviewSelectedUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f163245d;

    /* renamed from: e */
    public final C13601g f163246e;

    /* renamed from: f */
    public final C13601g f163247f;

    /* renamed from: g */
    public MvPreviewLiveList f163248g;

    /* renamed from: h */
    public C103009m<C60995i> f163249h;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lkb2/i;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "<init>", "(Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC;Lac2/f;Lzb2/h;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList */
    public final class MvPreviewLiveList extends MvvmList<C60995i> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MvPreviewLiveList(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC, C54000f<C60995i, C53998c<C60995i>, C39534d<C60995i>> fVar, C53769h hVar) {
            super(fVar, hVar, musicMvAlbumPreviewSelectedUIC.getActivity(), (LifecycleScope) null, (List) null, 24, (C8480h) null);
            C87412m.m108594g(fVar, "dataSource");
            C87412m.m108594g(hVar, "config");
        }

        /* renamed from: b */
        public String mo5660b() {
            return "MicroMsg.Mv.MusicMvAlbumPreviewSelectedUIC";
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$a */
    public final class C57007a extends RecyclerView.C0129l {
        public C57007a(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC) {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 6);
            rect.set(b, 0, b, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$b */
    public static final class C57008b extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57008b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163250d = appCompatActivity;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f163250d, 0, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$c */
    public static final class C57009c extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57009c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163251d = appCompatActivity;
        }

        public Object invoke() {
            return (Button) this.f163251d.findViewById(C0966R.C0970id.hfe);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$d */
    public static final class C57010d<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewSelectedUIC f163252d;

        /* renamed from: e */
        public final /* synthetic */ C63738a f163253e;

        public C57010d(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC, C63738a aVar) {
            this.f163252d = musicMvAlbumPreviewSelectedUIC;
            this.f163253e = aVar;
        }

        public void onChanged(Object obj) {
            C64525lh3 lh32;
            C62598a aVar = (C62598a) obj;
            C87412m.m108594g(aVar, "state");
            if ((aVar.getAction() instanceof C62599b) && (lh32 = aVar.f177784d) != null) {
                MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC = this.f163252d;
                C63738a aVar2 = this.f163253e;
                C60996j jVar = new C60996j(lh32);
                musicMvAlbumPreviewSelectedUIC.getClass();
                MvPreviewLiveList mvPreviewLiveList = new MvPreviewLiveList(musicMvAlbumPreviewSelectedUIC, jVar, new C53769h());
                musicMvAlbumPreviewSelectedUIC.f163248g = mvPreviewLiveList;
                LiveData<C91988j<T>> liveData = mvPreviewLiveList.f272358t;
                if (liveData != null) {
                    liveData.observe(musicMvAlbumPreviewSelectedUIC.getActivity(), new C57062c(musicMvAlbumPreviewSelectedUIC));
                }
                MvPreviewLiveList mvPreviewLiveList2 = musicMvAlbumPreviewSelectedUIC.f163248g;
                if (mvPreviewLiveList2 != null) {
                    musicMvAlbumPreviewSelectedUIC.f163249h = new C103009m<>(mvPreviewLiveList2, new MusicMvAlbumPreviewSelectedUIC$buildItemConvertFactory$1(), false);
                }
                MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).setAdapter(musicMvAlbumPreviewSelectedUIC.f163249h);
                MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).setLayoutManager((WxLinearLayoutManager) ((C36570n) musicMvAlbumPreviewSelectedUIC.f163247f).getValue());
                MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).mo17085h0(new C57007a(musicMvAlbumPreviewSelectedUIC));
                int b = C76577a.m92151b(MMApplicationContext.getContext(), 10);
                View view = new View(musicMvAlbumPreviewSelectedUIC.getActivity());
                view.setPadding(b, 0, 0, 0);
                C103009m<C60995i> mVar = musicMvAlbumPreviewSelectedUIC.f163249h;
                if (mVar != null) {
                    C60898l.m71329W5(mVar, view, view.hashCode(), false, 4, (Object) null);
                }
                View view2 = new View(musicMvAlbumPreviewSelectedUIC.getActivity());
                view2.setPadding(b, 0, 0, 0);
                C103009m<C60995i> mVar2 = musicMvAlbumPreviewSelectedUIC.f163249h;
                if (mVar2 != null) {
                    C60898l.m71327S5(mVar2, view2, view2.hashCode(), false, 4, (Object) null);
                }
                C103009m<C60995i> mVar3 = musicMvAlbumPreviewSelectedUIC.f163249h;
                if (mVar3 != null) {
                    mVar3.f173488o = new C57063d(aVar2);
                }
                if (lh32.f184107e.size() > 0) {
                    MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).setVisibility(0);
                    musicMvAlbumPreviewSelectedUIC.mo80444d3().setEnabled(true);
                    return;
                }
                MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).setVisibility(8);
                musicMvAlbumPreviewSelectedUIC.mo80444d3().setEnabled(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$e */
    public static final class C57011e<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewSelectedUIC f163254d;

        public C57011e(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC) {
            this.f163254d = musicMvAlbumPreviewSelectedUIC;
        }

        public void onChanged(Object obj) {
            C62598a aVar = (C62598a) obj;
            C87412m.m108594g(aVar, "state");
            IStateAction action = aVar.getAction();
            if (action != null) {
                MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC = this.f163254d;
                if (action instanceof C62600c) {
                    C62600c cVar = (C62600c) action;
                    C60995i iVar = cVar.f177788b;
                    int ordinal = cVar.f177787a.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        MvPreviewLiveList mvPreviewLiveList = musicMvAlbumPreviewSelectedUIC.f163248g;
                        if (mvPreviewLiveList != null) {
                            mvPreviewLiveList.mo129614r(new C57065f(iVar));
                        }
                    } else if (ordinal == 2) {
                        if (iVar.f173715h) {
                            C60995i iVar2 = (C60995i) iVar.mo90777Ow();
                            iVar2.f173712e = 0;
                            MvPreviewLiveList mvPreviewLiveList2 = musicMvAlbumPreviewSelectedUIC.f163248g;
                            if (mvPreviewLiveList2 != null) {
                                mvPreviewLiveList2.mo129615s(iVar2, true);
                            }
                            MvPreviewLiveList mvPreviewLiveList3 = musicMvAlbumPreviewSelectedUIC.f163248g;
                            if (mvPreviewLiveList3 != null) {
                                mvPreviewLiveList3.mo129614r(new C57064e(iVar));
                                return;
                            }
                            return;
                        }
                        MvPreviewLiveList mvPreviewLiveList4 = musicMvAlbumPreviewSelectedUIC.f163248g;
                        if (mvPreviewLiveList4 != null) {
                            mvPreviewLiveList4.mo129612p(iVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$f */
    public static final class C57012f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewSelectedUIC f163255d;

        public C57012f(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC) {
            this.f163255d = musicMvAlbumPreviewSelectedUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f163255d.mo80445e3(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$g */
    public static final class C57013g extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57013g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163256d = appCompatActivity;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f163256d.findViewById(C0966R.C0970id.ja8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvAlbumPreviewSelectedUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f163245d = C36568h.m40985a(new C57013g(appCompatActivity));
        this.f163246e = C36568h.m40985a(new C57009c(appCompatActivity));
        this.f163247f = C36568h.m40985a(new C57008b(appCompatActivity));
    }

    /* renamed from: c3 */
    public static final WxRecyclerView m65703c3(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC) {
        return (WxRecyclerView) ((C36570n) musicMvAlbumPreviewSelectedUIC.f163245d).getValue();
    }

    /* renamed from: d3 */
    public final Button mo80444d3() {
        return (Button) ((C36570n) this.f163246e).getValue();
    }

    /* renamed from: e3 */
    public final void mo80445e3(int i) {
        MvPreviewLiveList mvPreviewLiveList = this.f163248g;
        if (mvPreviewLiveList != null) {
            Intent intent = new Intent();
            C64525lh3 lh32 = new C64525lh3();
            for (T t : mvPreviewLiveList.f272353o) {
                LinkedList<C64506kz3> linkedList = lh32.f184107e;
                C64506kz3 kz32 = new C64506kz3();
                kz32.f184007e = t.f173714g;
                kz32.f184006d = t.f173713f;
                linkedList.add(kz32);
            }
            intent.putExtra("PreviewItemObjCallbackAction", i);
            intent.putExtra("PreviewItemObjCallback", lh32.toByteArray());
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    public void onCreate(Bundle bundle) {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63738a.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…eviewDataUIC::class.java)");
        C63738a aVar = (C63738a) a;
        aVar.mo88561c3().observe((C0125s) getActivity(), new C57010d(this, aVar));
        aVar.mo88561c3().observe((C0125s) getActivity(), new C57011e(this));
        mo80444d3().setOnClickListener(new C57012f(this));
    }
}
