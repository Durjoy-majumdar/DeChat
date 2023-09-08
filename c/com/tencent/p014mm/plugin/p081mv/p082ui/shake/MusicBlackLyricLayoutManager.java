package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/shake/MusicBlackLyricLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicBlackLyricLayoutManager */
public final class MusicBlackLyricLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final Context f163136v;

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicBlackLyricLayoutManager$a */
    public static final class C56961a extends C54256s {
        public C56961a(Context context) {
            super(context);
        }

        /* renamed from: h */
        public int mo6715h(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 600.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MusicBlackLyricLayoutManager(android.content.Context r1, int r2, boolean r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0005
            r2 = 1
        L_0x0005:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000a
            r3 = 0
        L_0x000a:
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r1, r4)
            r0.<init>(r1, r2, r3)
            r0.f163136v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.shake.MusicBlackLyricLayoutManager.<init>(android.content.Context, int, boolean, int, gy3.h):void");
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
    }

    public void scrollToPosition(int i) {
        int b = C76577a.m92151b(this.f163136v, 30);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(b));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/shake/MusicBlackLyricLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/mv/ui/shake/MusicBlackLyricLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return super.scrollVerticallyBy(i, rVar, wVar);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C56961a aVar = new C56961a(recyclerView.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
