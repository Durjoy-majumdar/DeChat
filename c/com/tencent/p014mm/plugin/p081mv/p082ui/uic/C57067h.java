package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.SpeedyLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import i03.C60241d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ma2.C61454t;
import nb2.C61645c0;
import p143ds.C58433i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sb2.C63772i1;
import sx3.C110818d0;
import te3.C64550mb1;
import te3.C64621p23;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.h */
public final class C57067h extends UIComponent implements C63772i1 {

    /* renamed from: d */
    public C64621p23 f163407d;

    /* renamed from: e */
    public ArrayList<C57068a> f163408e = new ArrayList<>();

    /* renamed from: f */
    public WxRecyclerView f163409f;

    /* renamed from: g */
    public LinkedList<C60241d> f163410g = new LinkedList<>();

    /* renamed from: h */
    public int f163411h = -1;

    /* renamed from: i */
    public final int f163412i;

    /* renamed from: j */
    public final C13601g f163413j;

    /* renamed from: n */
    public final C13601g f163414n;

    /* renamed from: o */
    public C63772i1 f163415o;

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.h$a */
    public final class C57068a implements C9493c {

        /* renamed from: d */
        public final long f163416d;

        /* renamed from: e */
        public final int f163417e;

        /* renamed from: f */
        public C64550mb1 f163418f;

        /* renamed from: g */
        public boolean f163419g;

        /* renamed from: h */
        public boolean f163420h;

        /* renamed from: i */
        public float f163421i = 1.0f;

        public C57068a(C57067h hVar, long j, int i) {
            this.f163416d = j;
            this.f163417e = i;
        }

        /* renamed from: c */
        public int mo75c() {
            return this.f163417e;
        }

        public long getItemId() {
            return this.f163416d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.h$b */
    public final class C57069b extends C60896i<C57068a> {

        /* renamed from: e */
        public final C63772i1 f163422e;

        public C57069b(C63772i1 i1Var) {
            this.f163422e = i1Var;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.bj7;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C64550mb1 mb12;
            View D;
            C60905o oVar2 = oVar;
            int i3 = i;
            List list2 = list;
            C57068a aVar = (C57068a) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(aVar, "item");
            int i4 = 4;
            float f = 1.0f;
            boolean z2 = false;
            if (list2 != null) {
                if (list2.contains(1)) {
                    View D2 = oVar2.mo85812D(C0966R.C0970id.j95);
                    if (D2 != null) {
                        if (aVar.f163420h) {
                            i4 = 0;
                        }
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(i4));
                        View view = D2;
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View D3 = oVar2.mo85812D(C0966R.C0970id.f358981i80);
                    if (D3 != null) {
                        D3.setScaleX(aVar.f163420h ? 1.0f - aVar.f163421i : 1.0f);
                    }
                }
                if (list2.contains(2) && (D = oVar2.mo85812D(C0966R.C0970id.f358981i80)) != null) {
                    if (aVar.f163420h) {
                        f = 1.0f - aVar.f163421i;
                    }
                    D.setScaleX(f);
                    return;
                }
                return;
            }
            TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.kky);
            if (!(textView == null || (mb12 = aVar.f163418f) == null)) {
                int i5 = mb12.f184259e;
                StringBuilder sb = new StringBuilder();
                sb.append(C61645c0.m72363c(i5));
                sb.append('s');
                textView.setText(sb.toString());
            }
            View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.j95);
            if (findViewById != null) {
                if (aVar.f163420h) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(4);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            oVar2.f44854d.setOnClickListener(new C57072i(this, i3));
            View D4 = oVar2.mo85812D(C0966R.C0970id.f358981i80);
            D4.setPivotX((float) C57067h.this.f163412i);
            if (aVar.f163420h) {
                D4.setScaleX(1.0f - aVar.f163421i);
            } else {
                D4.setScaleX(1.0f);
            }
            ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.bv8);
            imageView.setImageDrawable((Drawable) null);
            C57067h hVar = C57067h.this;
            if (i3 < hVar.f163410g.size()) {
                C60241d dVar = hVar.f163410g.get(i3);
                C87412m.m108593f(dVar, "mediaInfoList[position]");
                C60241d dVar2 = dVar;
                if (aVar.f163419g) {
                    String str = dVar2.f165948t;
                    C87412m.m108593f(str, "mediaInfo.path");
                    if (str.length() > 0) {
                        String str2 = dVar2.f165948t;
                        C61454t tVar = C61454t.f174766a;
                        String b = tVar.mo86430b("thumb_" + dVar2.f165948t.hashCode());
                        C87412m.m108593f(str2, "videoPath");
                        ((C58433i) C86312j.m106911c(C58433i.class)).Bc0(imageView, 2, b, str2, (long) str2.hashCode(), i, 0);
                        return;
                    }
                }
                String str3 = dVar2.f165936h;
                C87412m.m108593f(str3, "mediaInfo.thumbUrl");
                if (str3.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    C61454t tVar2 = C61454t.f174766a;
                    bVar.f59350f = tVar2.mo86430b("thumb_" + dVar2.f165947s);
                    bVar.f59346b = true;
                    bVar.f59345a = true;
                    C20828a.m22825b().mo32519h(dVar2.f165936h + dVar2.f165937i, imageView, bVar.mo32666a());
                    return;
                }
                imageView.setImageDrawable((Drawable) null);
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.h$c */
    public static final class C57070c extends C87413o implements C32224a<WxRecyclerAdapter<C57068a>> {

        /* renamed from: d */
        public final /* synthetic */ C57067h f163424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57070c(C57067h hVar) {
            super(0);
            this.f163424d = hVar;
        }

        public Object invoke() {
            return new WxRecyclerAdapter(new MusicMvPreviewTrackUIC$adapter$2$1(this.f163424d), this.f163424d.f163408e, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.h$d */
    public static final class C57071d extends C87413o implements C32224a<SpeedyLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f163425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57071d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f163425d = appCompatActivity;
        }

        public Object invoke() {
            SpeedyLinearLayoutManager speedyLinearLayoutManager = new SpeedyLinearLayoutManager(this.f163425d, 0, false);
            speedyLinearLayoutManager.f163661v = 100.0f;
            return speedyLinearLayoutManager;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57067h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f163412i = C76577a.m92155f(appCompatActivity, C0966R.dimen.f3755d6);
        this.f163413j = C36568h.m40985a(new C57070c(this));
        this.f163414n = C36568h.m40985a(new C57071d(appCompatActivity));
    }

    /* renamed from: c3 */
    public final WxRecyclerAdapter<C57068a> mo80499c3() {
        return (WxRecyclerAdapter) ((C36570n) this.f163413j).getValue();
    }

    /* renamed from: d3 */
    public final void mo80500d3(int i) {
        C57068a aVar = (C57068a) C110818d0.m150917O(this.f163408e, this.f163411h);
        if (aVar != null) {
            aVar.f163420h = false;
            mo80499c3().notifyItemChanged(this.f163411h + mo80499c3().mo85796c6(), 1);
        }
        C57068a aVar2 = (C57068a) C110818d0.m150917O(this.f163408e, i);
        if (aVar2 != null) {
            aVar2.f163421i = 0.0f;
            aVar2.f163420h = true;
            mo80499c3().notifyItemChanged(mo80499c3().mo85796c6() + i, 1);
        }
        WxRecyclerView wxRecyclerView = this.f163409f;
        if (wxRecyclerView != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(mo80499c3().mo85796c6() + i));
            WxRecyclerView wxRecyclerView2 = wxRecyclerView;
            C117292a.m165358d(wxRecyclerView2, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        this.f163411h = i;
    }

    public void select(int i) {
        mo80500d3(i);
        C63772i1 i1Var = this.f163415o;
        if (i1Var != null) {
            i1Var.select(i);
        }
    }
}
