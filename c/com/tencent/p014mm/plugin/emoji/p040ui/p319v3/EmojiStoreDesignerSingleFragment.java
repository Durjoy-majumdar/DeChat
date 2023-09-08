package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.C55627a;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiDesignerSinglePageSource;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Metadata;
import n61.C100084d;
import p61.C35378f;
import r61.C101358h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101800k70;
import u61.C101964h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleFragment;", "Landroidx/fragment/app/Fragment;", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment */
public final class EmojiStoreDesignerSingleFragment extends HellAndroidXFragment {

    /* renamed from: i */
    public static final /* synthetic */ int f197870i = 0;

    /* renamed from: d */
    public final int f197871d;

    /* renamed from: e */
    public final LiveData<C35378f> f197872e;

    /* renamed from: f */
    public final C46566c<C9486a> f197873f = new C46566c<>();

    /* renamed from: g */
    public final C13601g f197874g = C36568h.m40985a(new C68870e(this));

    /* renamed from: h */
    public final C13601g f197875h = C36568h.m40985a(new C68869d(this));

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment$a */
    public static final class C68867a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerSingleFragment f197876d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<List<? extends C101800k70>, Boolean, C13598b0> f197877e;

        /* renamed from: f */
        public final /* synthetic */ C100084d f197878f;

        public C68867a(EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment, C32227p<? super List<? extends C101800k70>, ? super Boolean, C13598b0> pVar, C100084d dVar) {
            this.f197876d = emojiStoreDesignerSingleFragment;
            this.f197877e = pVar;
            this.f197878f = dVar;
        }

        public void onChanged(Object obj) {
            C35378f fVar = (C35378f) obj;
            EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment = this.f197876d;
            EmojiDesignerSinglePageSource emojiDesignerSinglePageSource = new EmojiDesignerSinglePageSource(emojiStoreDesignerSingleFragment.f197873f, emojiStoreDesignerSingleFragment.f197871d, emojiStoreDesignerSingleFragment.f197872e.getValue(), this.f197877e);
            this.f197878f.f293205f = new C29874b(emojiDesignerSinglePageSource);
            emojiDesignerSinglePageSource.mo56963a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment$c */
    public static final class C68868c extends C87413o implements C32227p<List<? extends C101800k70>, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100084d f197879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68868c(C100084d dVar) {
            super(2);
            this.f197879d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            if (((Boolean) obj2).booleanValue()) {
                C100084d dVar = this.f197879d;
                dVar.f293204e.clear();
                dVar.notifyDataSetChanged();
            }
            if (list != null) {
                C100084d dVar2 = this.f197879d;
                dVar2.getClass();
                int size = dVar2.f293204e.size();
                dVar2.f293204e.addAll(list);
                dVar2.notifyItemRangeInserted(size, list.size());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment$d */
    public static final class C68869d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerSingleFragment f197880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68869d(EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment) {
            super(0);
            this.f197880d = emojiStoreDesignerSingleFragment;
        }

        public Object invoke() {
            return (RecyclerView) ((View) ((C36570n) this.f197880d.f197874g).getValue()).findViewById(C0966R.C0970id.cxf);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment$e */
    public static final class C68870e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerSingleFragment f197881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68870e(EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment) {
            super(0);
            this.f197881d = emojiStoreDesignerSingleFragment;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f197881d.requireContext()).inflate(C0966R.C0971layout.f7156x1, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment$b */
    public static final class C68871b implements C100084d.C100085a {

        /* renamed from: a */
        public final /* synthetic */ EmojiStoreDesignerSingleFragment f197882a;

        public C68871b(EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment) {
            this.f197882a = emojiStoreDesignerSingleFragment;
        }

        /* renamed from: a */
        public void mo94740a(C101800k70 k702, int i) {
            C87412m.m108594g(k702, "pbInfo");
            C115669n.INSTANCE.mo160131h(12787, 1, 0, k702.f298586d, "", k702.f298589g, k702.f298592j, 6);
            EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment = this.f197882a;
            int i2 = EmojiStoreDesignerSingleFragment.f197870i;
            emojiStoreDesignerSingleFragment.getClass();
            C39818r rVar = C39818r.f106831a;
            Context requireContext = emojiStoreDesignerSingleFragment.requireContext();
            C87412m.m108593f(requireContext, "requireContext()");
            ((C55627a) rVar.mo62443b(requireContext).mo75002a(C55627a.class)).f158330e.f154999j++;
            EmojiInfo h = C101964h.m134226h(k702);
            Context context = this.f197882a.getContext();
            C87412m.m108591d(context);
            C101358h hVar = new C101358h(context, h, false);
            hVar.f296925x = 5;
            hVar.f296923v = 0;
            hVar.f296922u = 0;
            hVar.f296924w = 6;
            hVar.f296921t = "";
            hVar.f296919r = null;
            hVar.f296920s = null;
            hVar.f296911g.mo140655A();
        }
    }

    public EmojiStoreDesignerSingleFragment(int i, LiveData<C35378f> liveData) {
        C87412m.m108594g(liveData, "liveData");
        this.f197871d = i;
        this.f197872e = liveData;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        C100084d dVar = new C100084d(new C68871b(this));
        ((RecyclerView) ((C36570n) this.f197875h).getValue()).setLayoutManager(new GridLayoutManager(requireContext(), 3));
        ((RecyclerView) ((C36570n) this.f197875h).getValue()).setAdapter(dVar);
        this.f197872e.observe(getViewLifecycleOwner(), new C68867a(this, new C68868c(dVar), dVar));
        return (RecyclerView) ((C36570n) this.f197875h).getValue();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f197873f.dead();
    }
}
