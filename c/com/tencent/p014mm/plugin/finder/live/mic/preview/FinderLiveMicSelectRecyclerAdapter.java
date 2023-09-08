package com.tencent.p014mm.plugin.finder.live.mic.preview;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hp1.C8703w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter */
public final class FinderLiveMicSelectRecyclerAdapter extends WxRecyclerAdapter<C55914a> {

    /* renamed from: G */
    public final C32226l<C55916c, C13598b0> f159334G;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeLayoutFactory;", "Ljq3/j;", "", "type", "Ljq3/i;", "Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$a;", "getItemConvert", "", "anchorUserId", "Ljava/lang/String;", "getAnchorUserId", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$c;", "Lrx3/b0;", "micEvent", "Lfy3/l;", "getMicEvent", "()Lfy3/l;", "<init>", "(Ljava/lang/String;Lfy3/l;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$MicChangeLayoutFactory */
    public static final class MicChangeLayoutFactory implements C9500j {
        private final String anchorUserId;
        private final C32226l<C55916c, C13598b0> micEvent;

        public MicChangeLayoutFactory(String str, C32226l<? super C55916c, C13598b0> lVar) {
            C87412m.m108594g(str, "anchorUserId");
            C87412m.m108594g(lVar, "micEvent");
            this.anchorUserId = str;
            this.micEvent = lVar;
        }

        public final String getAnchorUserId() {
            return this.anchorUserId;
        }

        public C60896i<C55914a> getItemConvert(int i) {
            return new C55915b(this.anchorUserId, this.micEvent);
        }

        public final C32226l<C55916c, C13598b0> getMicEvent() {
            return this.micEvent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$a */
    public static final class C55914a implements C9493c {

        /* renamed from: d */
        public final C54130j f159335d;

        /* renamed from: e */
        public boolean f159336e;

        /* renamed from: f */
        public boolean f159337f;

        /* renamed from: g */
        public final boolean f159338g;

        public C55914a() {
            this((C54130j) null, false, false, false, 15, (C8480h) null);
        }

        public C55914a(C54130j jVar, boolean z, boolean z2, boolean z3, int i, C8480h hVar) {
            jVar = (i & 1) != 0 ? null : jVar;
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? true : z2;
            z3 = (i & 8) != 0 ? false : z3;
            this.f159335d = jVar;
            this.f159336e = z;
            this.f159337f = z2;
            this.f159338g = z3;
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55914a)) {
                return false;
            }
            C55914a aVar = (C55914a) obj;
            return C87412m.m108589b(this.f159335d, aVar.f159335d) && this.f159336e == aVar.f159336e && this.f159337f == aVar.f159337f && this.f159338g == aVar.f159338g;
        }

        public long getItemId() {
            return (long) hashCode();
        }

        public int hashCode() {
            C54130j jVar = this.f159335d;
            int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
            boolean z = this.f159336e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f159337f;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f159338g;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MicChangeData(micUser=" + this.f159335d + ", isSelected=" + this.f159336e + ", isHeaderEnableClick=" + this.f159337f + ", isNeedHideRecoverIcon=" + this.f159338g + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$b */
    public static final class C55915b extends C60896i<C55914a> {

        /* renamed from: e */
        public final String f159339e;

        /* renamed from: f */
        public final C32226l<C55916c, C13598b0> f159340f;

        public C55915b(String str, C32226l<? super C55916c, C13598b0> lVar) {
            C87412m.m108594g(str, "anchorUserId");
            C87412m.m108594g(lVar, "micEvent");
            this.f159339e = str;
            this.f159340f = lVar;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.cyf;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            CharSequence charSequence;
            C55914a aVar = (C55914a) cVar;
            Class cls = C76979h.class;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(aVar, "item");
            if (aVar.f159335d != null) {
                View D = oVar.mo85812D(C0966R.C0970id.n_i);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setOnClickListener(new C55918a(oVar, aVar, this, i));
                TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.n9v);
                if (!C87412m.m108589b(aVar.f159335d.f151997a, this.f159339e)) {
                    String str = aVar.f159335d.f152000d;
                    if (str == null || str.length() == 0) {
                        charSequence = ((C76979h) C86312j.m106911c(cls)).Te0(MMApplicationContext.getContext(), aVar.f159335d.f152000d, textView.getTextSize());
                    } else {
                        C76979h hVar = (C76979h) C86312j.m106911c(cls);
                        Context context = MMApplicationContext.getContext();
                        C8703w0 w0Var = C8703w0.f27927a;
                        String str2 = aVar.f159335d.f152000d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        charSequence = hVar.Te0(context, w0Var.mo9552c(str2, ""), textView.getTextSize());
                    }
                } else {
                    charSequence = textView.getContext().getResources().getString(C0966R.string.dg_);
                }
                textView.setText(charSequence);
                View D2 = oVar.mo85812D(C0966R.C0970id.n_j);
                int i3 = aVar.f159336e ? 0 : 8;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Integer.valueOf(i3));
                View view2 = D2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicChangeData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$c */
    public static abstract class C55916c {
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$d */
    public static final class C55917d extends C55916c {

        /* renamed from: a */
        public final C54130j f159341a;

        public C55917d(C54130j jVar, int i) {
            this.f159341a = jVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMicSelectRecyclerAdapter(ArrayList<C55914a> arrayList, String str, C32226l<? super C55916c, C13598b0> lVar) {
        super(new MicChangeLayoutFactory(str, lVar), arrayList, false);
        C87412m.m108594g(arrayList, "dataList");
        C87412m.m108594g(str, "anchorUserId");
        C87412m.m108594g(lVar, "micEvent");
        this.f159334G = lVar;
    }
}
