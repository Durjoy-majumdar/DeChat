package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine */
public final class AtFeedSelectStateMachine {

    /* renamed from: a */
    public final AppCompatActivity f18565a;

    /* renamed from: b */
    public final List<? extends BaseFinderFeed> f18566b;

    /* renamed from: c */
    public C4245c f18567c = C4245c.INIT;

    /* renamed from: d */
    public HashMap<Long, Integer> f18568d = new HashMap<>();

    /* renamed from: e */
    public HashMap<Long, Integer> f18569e = new HashMap<>();

    /* renamed from: f */
    public List<C4244b> f18570f = new ArrayList();

    /* renamed from: g */
    public final AtFeedSelectStateMachine$updateListener$1 f18571g = new AtFeedSelectStateMachine$updateListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine$a */
    public static final class C4243a {

        /* renamed from: a */
        public final List<Long> f18572a;

        /* renamed from: b */
        public final List<Long> f18573b;

        public C4243a(List<Long> list, List<Long> list2) {
            this.f18572a = list;
            this.f18573b = list2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine$b */
    public interface C4244b {
        /* renamed from: a */
        void mo5111a(C4245c cVar, C4243a aVar);
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine$c */
    public enum C4245c {
        INIT,
        ENTER,
        PRE_CONFIRM,
        CONFIRMED,
        EXIT,
        DESTROY
    }

    public AtFeedSelectStateMachine(AppCompatActivity appCompatActivity, List<? extends BaseFinderFeed> list) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list, "data");
        this.f18565a = appCompatActivity;
        this.f18566b = list;
    }

    /* renamed from: a */
    public final void mo5107a(boolean z) {
        this.f18568d.clear();
        HashMap<Long, Integer> hashMap = this.f18568d;
        this.f18568d = this.f18569e;
        this.f18569e = hashMap;
        mo5109c(C4245c.CONFIRMED);
    }

    /* renamed from: b */
    public final C13604l<List<Long>, List<Long>> mo5108b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry next : this.f18569e.entrySet()) {
            Integer num = this.f18568d.get(next.getKey());
            if (!(num == null || ((Number) next.getValue()).intValue() == num.intValue())) {
                if (((Number) next.getValue()).intValue() == 3) {
                    arrayList2.add(next.getKey());
                } else if (((Number) next.getValue()).intValue() == 2) {
                    arrayList.add(next.getKey());
                }
            }
        }
        return new C13604l<>(arrayList, arrayList2);
    }

    /* renamed from: c */
    public final void mo5109c(C4245c cVar) {
        C4243a aVar;
        Class cls = C13442s8.class;
        Class cls2 = C58417y0.class;
        C87412m.m108594g(cVar, "state");
        Log.m105924i("Finder.AtFeedSelectStateMachine", "onStateChange :from " + cVar + " to: " + cVar);
        this.f18567c = cVar;
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            ((C58417y0) C86312j.m106911c(cls2)).Fy0(1, "manage_yes", "", ((C13442s8) C39818r.f106831a.mo62444c(this.f18565a).mo75002a(cls)).mo12861q3());
            aVar = new C4243a((List<Long>) null, (List<Long>) null);
        } else if (ordinal != 2) {
            aVar = ordinal != 3 ? new C4243a((List<Long>) null, (List<Long>) null) : new C4243a((List<Long>) null, (List<Long>) null);
        } else {
            C13604l<List<Long>, List<Long>> b = mo5108b();
            int size = ((List) b.f38555d).size();
            int size2 = ((List) b.f38556e).size();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("add_count", size);
            jSONObject.put("delete_count", size2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …unt)\n        }.toString()");
            ((C58417y0) C86312j.m106911c(cls2)).Fy0(1, "select_yes_icon", jSONObject2, ((C13442s8) C39818r.f106831a.mo62444c(this.f18565a).mo75002a(cls)).mo12861q3());
            aVar = new C4243a((List) b.f38555d, (List) b.f38556e);
        }
        Iterator it = ((ArrayList) this.f18570f).iterator();
        while (it.hasNext()) {
            ((C4244b) it.next()).mo5111a(cVar, aVar);
        }
    }

    /* renamed from: d */
    public final void mo5110d(boolean z) {
        HashMap<Long, Integer> hashMap = z ? this.f18568d : this.f18569e;
        hashMap.clear();
        for (BaseFinderFeed baseFinderFeed : this.f18566b) {
            hashMap.put(Long.valueOf(baseFinderFeed.getItemId()), Integer.valueOf(baseFinderFeed.mo3513o().getMentionListSelected()));
        }
    }
}
