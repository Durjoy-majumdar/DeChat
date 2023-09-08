package com.tencent.p014mm.p136ui.chatting.layoutmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/layoutmanager/ChattingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager */
public final class ChattingLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager$a */
    public static final class C57686a extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ boolean f165100n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView f165101o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57686a(boolean z, RecyclerView recyclerView, Context context) {
            super(context);
            this.f165100n = z;
            this.f165101o = recyclerView;
        }

        /* renamed from: e */
        public void mo17384e() {
            Log.m105918d("ChattingLinearLayoutManager", hashCode() + " onStop() called");
            super.mo17384e();
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 25.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            int i2 = 50;
            if (this.f165100n) {
                RecyclerView recyclerView = this.f165101o;
                if ((recyclerView instanceof C72923q0 ? ((C72923q0) recyclerView).getExtraScrollDistance() : 0) > 0) {
                    i2 = 110;
                }
            }
            Log.m105919d("ChattingLinearLayoutManager", "calculateTimeForScrolling() called with: dx = %s scrollTime = %s", Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }

        /* renamed from: n */
        public int mo65616n() {
            return super.mo65616n();
        }

        /* renamed from: o */
        public int mo10341o() {
            int o = super.mo10341o();
            if (this.f165100n) {
                return 1;
            }
            return o;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingLinearLayoutManager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        Log.m105919d("ChattingLinearLayoutManager", "scrollToPositionWithOffset() called with: position = %s, offset = %s", Integer.valueOf(i), Integer.valueOf(i2));
        super.mo16973V(i, i2);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (Throwable th) {
            Log.printErrStackTrace("ChattingLinearLayoutManager", th, "onLayoutChildren err", new Object[0]);
        }
    }

    public void scrollToPosition(int i) {
        Log.m105919d("ChattingLinearLayoutManager", "scrollToPosition() called with: position = %s", Integer.valueOf(i));
        super.scrollToPosition(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r6.getAdapter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.C16628w r7, int r8) {
        /*
            r5 = this;
            r7 = 0
            if (r6 == 0) goto L_0x000e
            androidx.recyclerview.widget.RecyclerView$e r0 = r6.getAdapter()
            if (r0 == 0) goto L_0x000e
            int r0 = r0.getItemCount()
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r1 = 1
            int r0 = r0 - r1
            if (r0 != r8) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            gy3.C87412m.m108591d(r6)
            android.content.Context r3 = r6.getContext()
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager$a r4 = new com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager$a
            r4.<init>(r2, r6, r3)
            r4.f44872a = r8     // Catch:{ all -> 0x0028 }
            r5.startSmoothScroll(r4)     // Catch:{ all -> 0x0028 }
            goto L_0x0040
        L_0x0028:
            r6 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2[r1] = r7
            java.lang.String r7 = "ChattingLinearLayoutManager"
            java.lang.String r8 = "startSmoothScroll problem %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r6, r8, r2)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.layoutmanager.ChattingLinearLayoutManager.smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$w, int):void");
    }
}
