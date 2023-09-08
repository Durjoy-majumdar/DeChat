package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54423i;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2;
import di3.C86312j;
import gy3.C8478d0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.live.view.b0 */
public final class C56054b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55988i f159869d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55987h f159870e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159871f;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b0$a */
    public static final class C56055a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159872d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f159873e;

        public C56055a(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, C8478d0 d0Var) {
            this.f159872d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
            this.f159873e = d0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r0 = r0.f44854d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r0 = r3.f159872d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f159608x
                gy3.d0 r1 = r3.f159873e
                int r1 = r1.f27483d
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17023I0(r1)
                r1 = 0
                if (r0 == 0) goto L_0x001a
                android.view.View r0 = r0.f44854d
                if (r0 == 0) goto L_0x001a
                int[] r0 = o40.C61926c.m72690o(r0)
                r0 = r0[r1]
                goto L_0x001b
            L_0x001a:
                r0 = 0
            L_0x001b:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r2 = r3.f159872d
                androidx.recyclerview.widget.RecyclerView r2 = r2.f159608x
                r2.scrollBy(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56054b0.C56055a.run():void");
        }
    }

    public C56054b0(FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55988i iVar, FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55987h hVar, FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
        this.f159869d = iVar;
        this.f159870e = hVar;
        this.f159871f = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", view, (Map<String, Object>) null, 25561);
        C8478d0 d0Var = new C8478d0();
        Object tag = this.f159869d.f44854d.getTag();
        C54423i iVar = tag instanceof C54423i ? (C54423i) tag : null;
        Iterator<T> it = this.f159871f.getEffectItems().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (iVar == ((FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k) next).f159641d) {
                d0Var.f27483d = i;
                break;
            } else {
                i = i2;
            }
        }
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159871f;
        RecyclerView recyclerView = finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159608x;
        int i3 = d0Var.f27483d;
        int size = finderLiveCameraOptBeautyPowerfulDetailsViewV2.getEffectItems().size() - 1;
        if (i3 > size) {
            i3 = size;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f159871f;
        finderLiveCameraOptBeautyPowerfulDetailsViewV22.f159608x.post(new C56055a(finderLiveCameraOptBeautyPowerfulDetailsViewV22, d0Var));
        if (iVar != null) {
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55987h hVar = this.f159870e;
            hVar.getClass();
            hVar.f159627d = iVar;
            hVar.notifyDataSetChanged();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
