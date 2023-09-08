package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import jq3.C60898l;
import jq3.C60905o;
import nj3.C11184p0;
import nj3.C76912y0;
import up1.C14364t0;

/* renamed from: com.tencent.mm.plugin.finder.ui.a0 */
public final class C3767a0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f17232d;

    /* renamed from: e */
    public final /* synthetic */ FinderBlockListSearchUI f17233e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f17234f;

    /* renamed from: com.tencent.mm.plugin.finder.ui.a0$a */
    public static final class C3768a implements C14364t0.C14366b {

        /* renamed from: a */
        public final /* synthetic */ FinderBlockListSearchUI f17235a;

        /* renamed from: b */
        public final /* synthetic */ int f17236b;

        /* renamed from: c */
        public final /* synthetic */ RecyclerView.C16613e<C60905o> f17237c;

        public C3768a(FinderBlockListSearchUI finderBlockListSearchUI, int i, RecyclerView.C16613e<C60905o> eVar) {
            this.f17235a = finderBlockListSearchUI;
            this.f17236b = i;
            this.f17237c = eVar;
        }

        /* renamed from: a */
        public void mo3725a(boolean z) {
            if (z) {
                this.f17235a.f16781q.remove(this.f17236b);
                RecyclerView.C16613e<C60905o> eVar = this.f17237c;
                eVar.notifyItemRemoved(((C60898l) eVar).mo85796c6() + this.f17236b);
                return;
            }
            C76912y0.makeText((Context) this.f17235a.getContext(), (CharSequence) StateEvent.ProcessResult.FAILED, 0).show();
        }
    }

    public C3767a0(int i, FinderBlockListSearchUI finderBlockListSearchUI, RecyclerView.C16613e<C60905o> eVar) {
        this.f17232d = i;
        this.f17233e = finderBlockListSearchUI;
        this.f17234f = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r5 = r4.f17233e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r5, int r6) {
        /*
            r4 = this;
            int r5 = r4.f17232d
            if (r5 < 0) goto L_0x002e
            com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI r6 = r4.f17233e
            java.util.ArrayList<cm1.q> r6 = r6.f16781q
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x002e
            com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI r5 = r4.f17233e
            up1.t0 r6 = r5.f16783s
            if (r6 == 0) goto L_0x002e
            java.util.ArrayList<cm1.q> r5 = r5.f16781q
            int r0 = r4.f17232d
            java.lang.Object r5 = r5.get(r0)
            cm1.q r5 = (cm1.C0767q) r5
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f1809d
            com.tencent.mm.plugin.finder.ui.a0$a r0 = new com.tencent.mm.plugin.finder.ui.a0$a
            com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI r1 = r4.f17233e
            int r2 = r4.f17232d
            androidx.recyclerview.widget.RecyclerView$e<jq3.o> r3 = r4.f17234f
            r0.<init>(r1, r2, r3)
            r6.mo13651m(r5, r0)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C3767a0.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
