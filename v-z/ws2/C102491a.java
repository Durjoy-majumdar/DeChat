package ws2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95296z0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95251e;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ps2.C100882l;
import ps2.C100894u;
import qs2.C101253a;
import qs2.C101255a0;
import qs2.C101271i0;
import vr2.C37817q;
import wo2.C102466d;

/* renamed from: ws2.a */
public class C102491a extends RecyclerView.C16613e<RecyclerView.C16631z> implements C95251e.C95254c {

    /* renamed from: d */
    public C100882l f301781d;

    /* renamed from: e */
    public Context f301782e;

    /* renamed from: f */
    public int f301783f;

    /* renamed from: g */
    public LinkedHashMap<String, C95295z> f301784g = new LinkedHashMap<>();

    /* renamed from: h */
    public LinearLayoutManager f301785h;

    /* renamed from: i */
    public int f301786i;

    /* renamed from: ws2.a$a */
    public class C102492a extends RecyclerView.C16631z {

        /* renamed from: z */
        public LinearLayout f301787z;

        public C102492a(C102491a aVar, View view) {
            super(view);
            this.f301787z = (LinearLayout) view.findViewById(C0966R.C0970id.br8);
        }

        /* renamed from: y */
        public static /* synthetic */ LinearLayout m135303y(C102492a aVar) {
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter$ContentView");
            LinearLayout linearLayout = aVar.f301787z;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter$ContentView");
            return linearLayout;
        }
    }

    public C102491a(C100882l lVar, int i, Context context, LinearLayoutManager linearLayoutManager) {
        this.f301785h = linearLayoutManager;
        this.f301781d = lVar;
        this.f301783f = i;
        this.f301782e = context;
    }

    /* renamed from: F4 */
    public C95295z mo142108F4(int i) {
        SnsMethodCalculate.markStartTimeMs("getCompByIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        C95295z zVar = this.f301784g.get(this.f301781d.f295429d.get(i).f296495a);
        SnsMethodCalculate.markEndTimeMs("getCompByIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return zVar;
    }

    /* renamed from: G4 */
    public C95295z mo142109G4() {
        SnsMethodCalculate.markStartTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        try {
            C95295z zVar = this.f301784g.get(this.f301781d.f295429d.get(this.f301785h.mo16959E()).f296495a);
            SnsMethodCalculate.markEndTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return zVar;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return null;
        }
    }

    /* renamed from: N */
    public boolean mo131789N(int i) {
        SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        if (i < this.f301785h.mo16957C() || i > this.f301785h.mo16959E()) {
            Log.m105926v("MicroMsg.ContentAdapter", "index %d not visible");
            SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return false;
        }
        C95295z zVar = this.f301784g.get(this.f301781d.f295429d.get(i).f296495a);
        if (zVar != null) {
            Log.m105919d("MicroMsg.ContentAdapter", "comp %s, isExposure %s", zVar, Boolean.valueOf(zVar.mo131640s()));
            boolean s = zVar.mo131640s();
            SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return s;
        }
        SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return false;
    }

    /* renamed from: O4 */
    public C95295z mo142110O4() {
        SnsMethodCalculate.markStartTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        try {
            C95295z zVar = this.f301784g.get(this.f301781d.f295429d.get(this.f301785h.mo16959E() - 1).f296495a);
            SnsMethodCalculate.markEndTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return zVar;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return null;
        }
    }

    /* renamed from: f0 */
    public void mo131790f0(int i, C95251e eVar) {
        SnsMethodCalculate.markStartTimeMs("exposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        C101255a0 a0Var = this.f301781d.f295429d.get(i);
        C95295z zVar = this.f301784g.get(a0Var.f296495a);
        if (zVar != null) {
            zVar.mo124360B();
            zVar.mo130145A();
            int i2 = a0Var.f296505k;
            if (i2 == 61 || i2 == 62 || i2 == 142) {
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getAllExposuring", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((HashMap) eVar.f276442b).entrySet()) {
                    if (((C95251e.C95253b) entry.getValue()).f276446a) {
                        arrayList.add((Integer) entry.getKey());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getAllExposuring", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue != i && mo131789N(intValue)) {
                        C95295z F4 = mo142108F4(intValue);
                        if (F4 instanceof C101253a) {
                            C101253a aVar = (C101253a) F4;
                            aVar.getClass();
                            SnsMethodCalculate.markStartTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                            boolean z = aVar.f296489s;
                            SnsMethodCalculate.markEndTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                            if (!z || !this.f301781d.f295433h || intValue != 0) {
                                SnsMethodCalculate.markStartTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                                boolean z2 = ((C101253a) zVar).f296489s;
                                SnsMethodCalculate.markEndTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                                if (z2) {
                                    aVar.mo130232G();
                                }
                            } else {
                                ((C101253a) zVar).mo130232G();
                            }
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    /* renamed from: f3 */
    public void mo131791f3(int i) {
        SnsMethodCalculate.markStartTimeMs("updateExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        C95295z F4 = mo142108F4(i);
        if (C100894u.m132237q(F4.mo131850h().f296505k)) {
            ((C95250a) F4).mo130197G();
        }
        SnsMethodCalculate.markEndTimeMs("updateExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        int size = this.f301781d.f295429d.size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return size;
    }

    public int getItemViewType(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return i;
    }

    /* renamed from: l2 */
    public void mo131792l2(int i) {
        SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        if (i < 0 || i >= this.f301781d.f295429d.size()) {
            Log.m105929w("MicroMsg.ContentAdapter", "endExposure index[%d], size[%d]", Integer.valueOf(i), Integer.valueOf(this.f301781d.f295429d.size()));
            SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return;
        }
        C95295z zVar = this.f301784g.get(this.f301781d.f295429d.get(i).f296495a);
        if (zVar != null) {
            zVar.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        Log.m105924i("MicroMsg.ContentAdapter", "display page " + this.f301781d.f295432g + ", pos " + i);
        C102492a aVar = (C102492a) zVar;
        C102492a.m135303y(aVar).removeAllViews();
        C101255a0 a0Var = this.f301781d.f295429d.get(i);
        C95295z zVar2 = this.f301784g.get(a0Var.f296495a);
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = this.f301783f;
        String str = a0Var.f296506l;
        int i3 = 0;
        if (str != null && str.length() > 0) {
            try {
                i2 = Color.parseColor(a0Var.f296506l);
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.ContentAdapter", "parse cellBackgroundColor error: %s", a0Var.f296506l);
            }
        }
        C102492a.m135303y(aVar).setBackgroundColor(i2);
        if (zVar2 != null) {
            zVar2.mo130213z(this.f301781d.f295429d.get(i));
            i3 = 1;
        } else {
            zVar2 = C96328z2.m123559a(C102492a.m135303y(aVar).getContext(), a0Var, C102492a.m135303y(aVar), i2);
            this.f301784g.put(a0Var.f296495a, zVar2);
        }
        View p = zVar2.mo131855p();
        if (p.getParent() != null && (p.getParent() instanceof ViewGroup)) {
            ((ViewGroup) p.getParent()).removeView(p);
        }
        C102492a.m135303y(aVar).addView(p);
        if (i == 0) {
            SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            LinkedHashMap<String, C95295z> linkedHashMap = this.f301784g;
            Collection<C95295z> values = linkedHashMap == null ? Collections.EMPTY_LIST : linkedHashMap.values();
            SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            C95295z next = values.iterator().next();
            if (next != null && (next instanceof C95296z0)) {
                HashMap hashMap = new HashMap();
                hashMap.put("startIndex", Integer.valueOf(this.f301786i));
                next.mo131858w(hashMap);
            }
        } else if (zVar2 instanceof C95296z0) {
            zVar2.mo131858w(new HashMap());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C101271i0 m = zVar2.mo131854m();
        if (C102466d.m135253c()) {
            C37817q.m41546b("landing_page_rv_bind_view_cost", "" + m.mo140742i(), a0Var.f296505k, (int) currentTimeMillis2, "snsId=" + m.mo140740g() + "|isOnlyUpdate=" + i3 + "|cid=" + a0Var.f296495a);
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        C102492a aVar = new C102492a(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6343c8, viewGroup, false));
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return aVar;
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        for (Map.Entry<String, C95295z> value : this.f301784g.entrySet()) {
            ((C95295z) value.getValue()).mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    /* renamed from: s0 */
    public boolean mo131794s0(int i) {
        SnsMethodCalculate.markStartTimeMs("isContainerComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        boolean q = C100894u.m132237q(this.f301781d.f295429d.get(i).f296505k);
        SnsMethodCalculate.markEndTimeMs("isContainerComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return q;
    }
}
