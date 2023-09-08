package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicShakeLyricLayoutManager */
public final class MusicShakeLyricLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final int f163162v;

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicShakeLyricLayoutManager$a */
    public static final class C56964a extends C54256s {
        public C56964a(Context context) {
            super(context);
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 600.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MusicShakeLyricLayoutManager(android.content.Context r1, int r2, boolean r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0005
            r2 = 1
        L_0x0005:
            r4 = r4 & 4
            r5 = 0
            if (r4 == 0) goto L_0x000b
            r3 = 0
        L_0x000b:
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r1, r4)
            r0.<init>(r1, r2, r3)
            int r1 = kg3.C76577a.m92151b(r1, r5)
            r0.f163162v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.shake.MusicShakeLyricLayoutManager.<init>(android.content.Context, int, boolean, int, gy3.h):void");
    }

    /* renamed from: c0 */
    public final void mo80415c0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int top = (childAt.getTop() + childAt.getBottom()) / 2;
                int height = getHeight() / 2;
                int measuredHeight = childAt.getMeasuredHeight();
                View findViewById = childAt.findViewById(C0966R.C0970id.gjt);
                TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
                if ((textView != null ? textView.getLineCount() : 0) > 1) {
                    measuredHeight /= 2;
                    top = (top + childAt.getBottom()) / 2;
                }
                int i2 = top - height;
                if (measuredHeight - Math.abs(i2) > this.f163162v) {
                    float min = Math.min(((float) 1) - (((float) Math.abs(i2)) / ((float) (measuredHeight - this.f163162v))), 1.0f);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(min));
                    C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(childAt, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        mo80415c0();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i, rVar, wVar);
        mo80415c0();
        return scrollVerticallyBy;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C56964a aVar = new C56964a(recyclerView.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
