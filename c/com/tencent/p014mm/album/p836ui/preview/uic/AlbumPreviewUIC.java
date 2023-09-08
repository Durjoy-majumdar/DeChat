package com.tencent.p014mm.album.p836ui.preview.uic;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.view.recyclerview.WxGridLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p1083jg.C98939a;
import p181kg.C10074g;
import p226rg.C12996o;
import p226rg.C63408b;
import p226rg.C63413d;
import p226rg.C63426k;
import p226rg.C63427l;
import p226rg.C63428m;
import p226rg.C63429n;
import p226rg.C63430p;
import p278yh.C66643c;
import p434ig.C98672d;
import p434ig.C98674g;
import p548hg.C98450d;
import p606mm.C99933h;
import p849e3.C58521d;
import p861pg.C62279a;
import p861pg.C62280b;
import p861pg.C62281c;
import qh0.C62619a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import th0.C101888l;
import yb2.C15946a;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC */
public class AlbumPreviewUIC extends C15946a {

    /* renamed from: n */
    public static int f154706n;

    /* renamed from: o */
    public static int f154707o;

    /* renamed from: p */
    public static int f154708p;

    /* renamed from: d */
    public final int f154709d;

    /* renamed from: e */
    public final int f154710e;

    /* renamed from: f */
    public final C13601g f154711f = C36568h.m40985a(new C55103f(this));

    /* renamed from: g */
    public final C13601g f154712g;

    /* renamed from: h */
    public C63408b f154713h;

    /* renamed from: i */
    public C103009m<C62279a> f154714i;

    /* renamed from: j */
    public C58521d f154715j;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$MvPreviewLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lpg/a;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lac2/f;Lzb2/h;)V", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$MvPreviewLiveList */
    public static final class MvPreviewLiveList extends MvvmList<C62279a> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MvPreviewLiveList(AppCompatActivity appCompatActivity, C54000f<C62279a, C53998c<C62279a>, C39534d<C62279a>> fVar, C53769h hVar) {
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

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$a */
    public static final class C55098a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AlbumPreviewUIC f154716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55098a(AlbumPreviewUIC albumPreviewUIC) {
            super(0);
            this.f154716d = albumPreviewUIC;
        }

        public Object invoke() {
            return Integer.valueOf(this.f154716d.getIntent().getIntExtra("album_enter_from_scene", -1));
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$b */
    public static final class C55099b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f154717d;

        /* renamed from: e */
        public final /* synthetic */ AlbumPreviewUIC f154718e;

        public C55099b(View view, AlbumPreviewUIC albumPreviewUIC) {
            this.f154717d = view;
            this.f154718e = albumPreviewUIC;
        }

        public void onGlobalLayout() {
            this.f154717d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f154718e.mo76240l3((List<? extends C62279a>) null);
            C103009m<C62279a> mVar = this.f154718e.f154714i;
            if (mVar != null) {
                mVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$c */
    public static final class C55100c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f154719d;

        /* renamed from: e */
        public final /* synthetic */ AlbumPreviewUIC f154720e;

        public C55100c(View view, AlbumPreviewUIC albumPreviewUIC) {
            this.f154719d = view;
            this.f154720e = albumPreviewUIC;
        }

        public void onGlobalLayout() {
            this.f154719d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f154720e.mo76240l3((List<? extends C62279a>) null);
            C103009m<C62279a> mVar = this.f154720e.f154714i;
            if (mVar != null) {
                mVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$d */
    public /* synthetic */ class C55101d extends C24565l implements C32226l<C63426k, C13598b0> {
        public C55101d(Object obj) {
            super(1, obj, AlbumPreviewUIC.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C63426k kVar = (C63426k) obj;
            C87412m.m108594g(kVar, "p0");
            AlbumPreviewUIC albumPreviewUIC = (AlbumPreviewUIC) this.receiver;
            albumPreviewUIC.getClass();
            IStateAction action = kVar.getAction();
            if (action != null && (action instanceof C63413d)) {
                C63413d dVar = (C63413d) action;
                int i3 = albumPreviewUIC.mo76237i3(dVar.f179895b);
                for (int i = 0; i < i3; i++) {
                    List<C62279a> list = kVar.f179910d;
                    C62281c cVar = new C62281c(new C98672d(), i);
                    cVar.f177044f.mo55275P0(-1);
                    ((ArrayList) list).add(cVar);
                }
                ((ArrayList) kVar.f179910d).addAll(dVar.f179895b);
                for (int i2 = 0; i2 < i3; i2++) {
                    List<C62279a> list2 = kVar.f179910d;
                    C62280b bVar = new C62280b(new C98672d(), i2);
                    bVar.f177044f.mo55275P0(-2);
                    ((ArrayList) list2).add(bVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$e */
    public /* synthetic */ class C55102e extends C24565l implements C32226l<C63426k, C13598b0> {
        public C55102e(Object obj) {
            super(1, obj, AlbumPreviewUIC.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C63426k kVar = (C63426k) obj;
            C87412m.m108594g(kVar, "p0");
            AlbumPreviewUIC albumPreviewUIC = (AlbumPreviewUIC) this.receiver;
            albumPreviewUIC.getClass();
            IStateAction action = kVar.getAction();
            if (action != null && (action instanceof C63413d)) {
                C63413d dVar = (C63413d) action;
                int i3 = albumPreviewUIC.mo76237i3(dVar.f179895b);
                WxGridLayoutManager wxGridLayoutManager = new WxGridLayoutManager(albumPreviewUIC.getActivity(), i3);
                albumPreviewUIC.mo76240l3(dVar.f179895b);
                albumPreviewUIC.mo76238j3().mo90693a().setLayoutManager(wxGridLayoutManager);
                WxRecyclerView a = albumPreviewUIC.mo76238j3().mo90693a();
                AppCompatActivity activity = albumPreviewUIC.getActivity();
                C87412m.m108594g(activity, "context");
                int a2 = C74942w4.m89784a(activity, 2);
                AppCompatActivity activity2 = albumPreviewUIC.getActivity();
                C87412m.m108594g(activity2, "context");
                a.mo17085h0(new C10074g(i3, a2, C74942w4.m89784a(activity2, 2)));
                C63408b bVar = new C63408b(kVar.f179910d);
                albumPreviewUIC.f154714i = new C103009m<>(new MvPreviewLiveList(albumPreviewUIC.getActivity(), bVar, new C53769h()), new AlbumPreviewUIC$buildItemConvertFactory$1(i3), false);
                albumPreviewUIC.mo76238j3().mo90693a().setAdapter(albumPreviewUIC.f154714i);
                albumPreviewUIC.f154713h = bVar;
                C103009m<C62279a> mVar = albumPreviewUIC.f154714i;
                if (mVar != null) {
                    mVar.f165746y = new C63427l(albumPreviewUIC);
                }
                albumPreviewUIC.f154715j = new C58521d(albumPreviewUIC.getActivity(), new C63428m(albumPreviewUIC, action));
                albumPreviewUIC.mo76238j3().mo90693a().mo17092j0(new C63429n(albumPreviewUIC));
                C66643c j3 = albumPreviewUIC.mo76238j3();
                if (j3.f191631b == null) {
                    j3.f191631b = (FrameLayout) j3.f191630a.findViewById(C0966R.C0970id.dqq);
                }
                j3.f191631b.setOnClickListener(new C12996o(albumPreviewUIC));
                C66643c j35 = albumPreviewUIC.mo76238j3();
                if (j35.f191632c == null) {
                    j35.f191632c = (FrameLayout) j35.f191630a.findViewById(C0966R.C0970id.gzq);
                }
                j35.f191632c.setOnClickListener(new C63430p(albumPreviewUIC, action));
                C98674g gVar = new C98674g();
                List<C98672d> list = gVar.f289364h;
                List<C62279a> list2 = dVar.f179895b;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
                for (C62279a aVar : list2) {
                    arrayList.add(aVar.f177044f);
                }
                list.addAll(arrayList);
                C66643c j36 = albumPreviewUIC.mo76238j3();
                if (j36.f191635f == null) {
                    j36.f191635f = (TextView) j36.f191630a.findViewById(C0966R.C0970id.f357453cx1);
                }
                j36.f191635f.setText(((C98450d) C86312j.m106911c(C98450d.class)).mo137793FC(albumPreviewUIC.getActivity(), gVar));
                C101888l lVar = C101888l.f300029a;
                C72963f4 f4Var = dVar.f179894a;
                if (!lVar.mo141352a(f4Var != null ? f4Var.mo108768t() : null)) {
                    C66643c j37 = albumPreviewUIC.mo76238j3();
                    if (j37.f191632c == null) {
                        j37.f191632c = (FrameLayout) j37.f191630a.findViewById(C0966R.C0970id.gzq);
                    }
                    j37.f191632c.setVisibility(8);
                }
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(1, dVar.f179894a, lVar.mo141354c(gVar).size(), lVar.mo141355d(gVar).size(), (C98672d) null, 0));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$f */
    public static final class C55103f extends C87413o implements C32224a<C66643c> {

        /* renamed from: d */
        public final /* synthetic */ AlbumPreviewUIC f154721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55103f(AlbumPreviewUIC albumPreviewUIC) {
            super(0);
            this.f154721d = albumPreviewUIC;
        }

        public Object invoke() {
            return new C66643c(this.f154721d.getRootView());
        }
    }

    /* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$g */
    public static final class C55104g extends C87413o implements C32224a<UIStateCenter<C63426k>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f154722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55104g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f154722d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C63426k(), this.f154722d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumPreviewUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f154709d = C74942w4.m89784a(appCompatActivity, 88);
        this.f154710e = C74942w4.m89784a(appCompatActivity, 90);
        this.f154712g = C36568h.m40985a(new C55104g(appCompatActivity));
        C36568h.m40985a(new C55098a(this));
    }

    /* renamed from: g3 */
    public static final C98674g m62215g3(AlbumPreviewUIC albumPreviewUIC) {
        List<C62279a> list;
        albumPreviewUIC.getClass();
        C98674g gVar = new C98674g();
        C63408b bVar = albumPreviewUIC.f154713h;
        if (!(bVar == null || (list = bVar.f179891d) == null)) {
            for (C62279a aVar : list) {
                if (!(aVar.mo75c() == -1 || aVar.mo75c() == -2)) {
                    gVar.f289364h.add(aVar.f177044f);
                }
            }
        }
        return gVar;
    }

    /* renamed from: i3 */
    public final int mo76237i3(List<? extends C62279a> list) {
        C87412m.m108594g(list, "dataList");
        if (list.size() < 5) {
            return list.size() < 2 ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: j3 */
    public final C66643c mo76238j3() {
        return (C66643c) ((C36570n) this.f154711f).getValue();
    }

    /* renamed from: k3 */
    public final UIStateCenter<C63426k> mo76239k3() {
        return (UIStateCenter) ((C36570n) this.f154712g).getValue();
    }

    /* renamed from: l3 */
    public final void mo76240l3(List<? extends C62279a> list) {
        List<C62279a> list2;
        if (list == null) {
            C63408b bVar = this.f154713h;
            if (bVar == null || (list2 = bVar.f179891d) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T next : list2) {
                    C62279a aVar = (C62279a) next;
                    if ((aVar.mo75c() == -1 || aVar.mo75c() == -2) ? false : true) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
        }
        if (list != null) {
            int i3 = mo76237i3(list);
            int size = list.size() % i3 == 0 ? list.size() / i3 : (list.size() / i3) + 1;
            int i35 = mo76237i3(list);
            Point h = C85875k4.m106184h(getActivity());
            int i = h.y;
            AppCompatActivity activity = getActivity();
            C87412m.m108594g(activity, "context");
            int a = i35 < 3 ? C74942w4.m89784a(activity, 204) : C74942w4.m89784a(activity, 136);
            AppCompatActivity activity2 = getActivity();
            C87412m.m108594g(activity2, "context");
            int a2 = ((int) (((float) ((i - (a * size)) - ((size - 1) * C74942w4.m89784a(activity2, 2)))) - getActivity().getResources().getDimension(C0966R.dimen.f3709c2))) / 2;
            int i2 = this.f154709d;
            if (a2 < i2) {
                a2 = i2;
            }
            f154706n = a2;
            f154707o = this.f154710e;
            int i4 = h.x;
            AppCompatActivity activity3 = getActivity();
            C87412m.m108594g(activity3, "context");
            f154708p = (i4 - (C74942w4.m89784a(activity3, 2) * (i35 - 1))) / i35;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 1) {
            Log.m105919d("MicroMsg.AlbumPreviewUIC", "%d image gallery ui is vertical screen", Integer.valueOf(hashCode()));
            View decorView = getActivity().getWindow().getDecorView();
            C87412m.m108593f(decorView, "activity.window.decorView");
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C55099b(decorView, this));
        } else if (i == 2) {
            Log.m105919d("MicroMsg.AlbumPreviewUIC", "%d image gallery ui is horizontal screen", Integer.valueOf(hashCode()));
            View decorView2 = getActivity().getWindow().getDecorView();
            C87412m.m108593f(decorView2, "activity.window.decorView");
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new C55100c(decorView2, this));
        }
    }

    public void onCreate(Bundle bundle) {
        mo76239k3().process((C0125s) getActivity(), new C55101d(this));
        mo76239k3().observe((C0125s) getActivity(), new C55102e(this));
    }
}
