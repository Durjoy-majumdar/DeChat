package com.tencent.p014mm.plugin.p081mv.model.flex;

import ac2.C39534d;
import ac2.C39535k;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import c14.C54637q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C45252f;
import d14.C58057l;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ib2.C60265a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C77813z;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/model/flex/MusicMvFlexLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lib2/a;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lzb2/h;Landroidx/lifecycle/s;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList */
public final class MusicMvFlexLiveList extends MvvmList<C60265a> {

    /* renamed from: x */
    public final C54637q<HashSet<C60265a>> f163010x;

    /* renamed from: y */
    public final C45252f<HashSet<C60265a>> f163011y;

    /* renamed from: com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList$a */
    public static final class C56896a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ MusicMvFlexLiveList f163012d;

        public C56896a(MusicMvFlexLiveList musicMvFlexLiveList) {
            this.f163012d = musicMvFlexLiveList;
        }

        public void onChanged(Object obj) {
            if (((C91988j) obj).f263327a == C39535k.UIRefresh) {
                MusicMvFlexLiveList musicMvFlexLiveList = this.f163012d;
                musicMvFlexLiveList.f163010x.mo75539t(C110818d0.m150951w0(musicMvFlexLiveList.f272353o));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList$b */
    public static final class C56897b extends C87413o implements C32226l<ArrayList<C60265a>, C13598b0> {

        /* renamed from: d */
        public static final C56897b f163013d = new C56897b();

        public C56897b() {
            super(1);
        }

        public Object invoke(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
            C77813z.m93908n(arrayList);
            if (arrayList.size() == 1) {
                C60265a aVar = (C60265a) C110818d0.m150916N(arrayList);
                if (aVar != null) {
                    aVar.f171819n = C0966R.C0969drawable.f357288aj0;
                }
            } else if (arrayList.size() > 1) {
                int i = 0;
                for (Object next : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C60265a aVar2 = (C60265a) next;
                        if (i == 0) {
                            aVar2.f171819n = C0966R.C0969drawable.aiy;
                        } else if (i == arrayList.size() - 1) {
                            aVar2.f171819n = C0966R.C0969drawable.aix;
                        } else {
                            aVar2.f171819n = C0966R.C0969drawable.aiz;
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvFlexLiveList(C54000f<C60265a, C53998c<C60265a>, C39534d<C60265a>> fVar, C53769h hVar, C0125s sVar) {
        super(fVar, hVar, sVar, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
        this.f272358t.observe(this, new C56896a(this));
        C54637q<HashSet<C60265a>> qVar = new C54637q<>();
        this.f163010x = qVar;
        this.f163011y = new C58057l(qVar);
    }

    /* renamed from: u */
    public final void mo80353u() {
        mo129614r(C56897b.f163013d);
    }
}
