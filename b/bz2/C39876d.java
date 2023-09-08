package bz2;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39688b;
import bz2.C39873b;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C60905o;
import mz2.C47151d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vz2.C78501d;

/* renamed from: bz2.d */
public final class C39876d extends C60896i<C47151d> {

    /* renamed from: e */
    public GridLayoutManager f106935e;

    /* renamed from: f */
    public final C13601g f106936f = C36568h.m40985a(C39878b.f106938d);

    /* renamed from: g */
    public final C39877a f106937g = new C39877a();

    /* renamed from: bz2.d$a */
    public static final class C39877a implements C39873b.C39874a {
        /* renamed from: a */
        public void mo62497a(Context context, long j) {
            C87412m.m108594g(context, "context");
            C78501d.m94809k(C78501d.f229945a, 2, 0, (String) null, 6, (Object) null);
            C39688b.f106469j.mo62270b(j, context);
        }
    }

    /* renamed from: bz2.d$b */
    public static final class C39878b extends C87413o implements C32224a<RecyclerView.C16623q> {

        /* renamed from: d */
        public static final C39878b f106938d = new C39878b();

        public C39878b() {
            super(0);
        }

        public Object invoke() {
            RecyclerView.C16623q qVar = new RecyclerView.C16623q();
            qVar.mo17336e(0, 100);
            return qVar;
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cqn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r8, jq3.C9493c r9, int r10, int r11, boolean r12, java.util.List r13) {
        /*
            r7 = this;
            mz2.d r9 = (mz2.C47151d) r9
            java.lang.String r10 = "holder"
            gy3.C87412m.m108594g(r8, r10)
            java.lang.String r10 = "item"
            gy3.C87412m.m108594g(r9, r10)
            android.content.Context r10 = r8.f173499A
            java.lang.String r11 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r10, r11)
            android.app.Activity r10 = (android.app.Activity) r10
            android.view.WindowManager r11 = r10.getWindowManager()
            android.view.Display r11 = r11.getDefaultDisplay()
            int r11 = r11.getWidth()
            android.view.WindowManager r10 = r10.getWindowManager()
            android.view.Display r10 = r10.getDefaultDisplay()
            int r10 = r10.getHeight()
            int r10 = java.lang.Math.min(r11, r10)
            android.content.Context r11 = r8.f173499A
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r11 = r11.getDimension(r12)
            float r10 = (float) r10
            float r10 = r10 - r11
            android.content.Context r11 = r8.f173499A
            android.content.res.Resources r11 = r11.getResources()
            r13 = 2131165294(0x7f07006e, float:1.7944801E38)
            float r11 = r11.getDimension(r13)
            android.content.Context r13 = r8.f173499A
            android.content.res.Resources r13 = r13.getResources()
            float r12 = r13.getDimension(r12)
            float r10 = r10 - r12
            float r10 = r10 - r11
            android.content.Context r11 = r8.f173499A
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131165355(0x7f0700ab, float:1.7944925E38)
            float r11 = r11.getDimension(r12)
            float r10 = r10 / r11
            androidx.recyclerview.widget.GridLayoutManager r11 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r12 = r8.f173499A
            int r10 = (int) r10
            r11.<init>(r12, r10)
            r7.f106935e = r11
            r10 = 2131315779(0x7f094c43, float:1.825002E38)
            android.view.View r10 = r8.mo85812D(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131315871(0x7f094c9f, float:1.8250207E38)
            android.view.View r11 = r8.mo85812D(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131315774(0x7f094c3e, float:1.825001E38)
            android.view.View r12 = r8.mo85812D(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r9.f126675d
            r0 = 0
            r1 = 0
            if (r13 == 0) goto L_0x00a2
            r11.setVisibility(r0)
            r11.setText(r13)
            android.text.TextPaint r13 = r11.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r13)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x00a3
        L_0x00a2:
            r13 = r1
        L_0x00a3:
            r2 = 8
            if (r13 != 0) goto L_0x00aa
            r11.setVisibility(r2)
        L_0x00aa:
            java.lang.String r11 = r9.f126676e
            if (r11 == 0) goto L_0x00be
            r12.setVisibility(r0)
            r12.setText(r11)
            android.text.TextPaint r11 = r12.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x00bf
        L_0x00be:
            r11 = r1
        L_0x00bf:
            if (r11 != 0) goto L_0x00c4
            r12.setVisibility(r2)
        L_0x00c4:
            java.util.List<uz2.c1> r11 = r9.f126677f
            java.util.Iterator r11 = r11.iterator()
        L_0x00ca:
            boolean r12 = r11.hasNext()
            r13 = 1
            if (r12 == 0) goto L_0x011b
            java.lang.Object r12 = r11.next()
            uz2.c1 r12 = (uz2.C52673c1) r12
            rz2.c r12 = mz2.C47149b.m52432a(r12)
            java.lang.String r12 = r12.field_IconID
            b03.c r2 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r2 = r2.mo62289a(r12)
            if (r2 != 0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r9.f126679h
            boolean r2 = r2.containsKey(r12)
            java.lang.String r3 = "iconId"
            if (r2 == 0) goto L_0x010e
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r9.f126679h
            java.lang.Object r2 = r2.get(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r9.f126679h
            gy3.C87412m.m108593f(r12, r3)
            gy3.C87412m.m108591d(r2)
            int r2 = r2.intValue()
            int r2 = r2 + r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r4.put(r12, r13)
            goto L_0x00ca
        L_0x010e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r9.f126679h
            gy3.C87412m.m108593f(r12, r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.put(r12, r13)
            goto L_0x00ca
        L_0x011b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r9.f126679h
            boolean r11 = r11.isEmpty()
            java.lang.String r12 = "maxCount"
            if (r11 == 0) goto L_0x0126
            goto L_0x0137
        L_0x0126:
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r9.f126679h
            java.util.Collection r11 = r11.values()
            java.lang.String r2 = "officialStatusWordMap.values"
            gy3.C87412m.m108593f(r11, r2)
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0139
        L_0x0137:
            r11 = 0
            goto L_0x0146
        L_0x0139:
            java.lang.Object r11 = java.util.Collections.max(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            gy3.C87412m.m108593f(r11, r12)
            int r11 = r11.intValue()
        L_0x0146:
            java.util.List<uz2.c1> r2 = r9.f126677f
            java.util.Iterator r2 = r2.iterator()
        L_0x014c:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "title"
            if (r3 == 0) goto L_0x01b0
            java.lang.Object r3 = r2.next()
            uz2.c1 r3 = (uz2.C52673c1) r3
            rz2.c r3 = mz2.C47149b.m52432a(r3)
            java.lang.String r5 = r3.field_IconID
            b03.c r6 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r5 = r6.mo62289a(r5)
            if (r5 == 0) goto L_0x014c
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r3, r0, r13, r1)
            java.lang.String r3 = r3.f147092i
            if (r3 == 0) goto L_0x017b
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r5 = 0
            goto L_0x017c
        L_0x017b:
            r5 = 1
        L_0x017c:
            if (r5 != 0) goto L_0x014c
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r9.f126680i
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x01a3
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r9.f126680i
            java.lang.Object r5 = r5.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r9.f126680i
            gy3.C87412m.m108593f(r3, r4)
            gy3.C87412m.m108591d(r5)
            int r4 = r5.intValue()
            int r4 = r4 + r13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.put(r3, r4)
            goto L_0x014c
        L_0x01a3:
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r9.f126680i
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5.put(r3, r4)
            goto L_0x014c
        L_0x01b0:
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r9.f126680i
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01b9
            goto L_0x01ca
        L_0x01b9:
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r9.f126680i
            java.util.Collection r2 = r2.values()
            java.lang.String r3 = "customStatusWordMap.values"
            gy3.C87412m.m108593f(r2, r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01cc
        L_0x01ca:
            r12 = 0
            goto L_0x01d9
        L_0x01cc:
            java.lang.Object r2 = java.util.Collections.max(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            gy3.C87412m.m108593f(r2, r12)
            int r12 = r2.intValue()
        L_0x01d9:
            if (r12 < r11) goto L_0x0218
            java.util.List<uz2.c1> r11 = r9.f126677f
            java.util.Iterator r11 = r11.iterator()
        L_0x01e1:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0254
            java.lang.Object r2 = r11.next()
            uz2.c1 r2 = (uz2.C52673c1) r2
            rz2.c r2 = mz2.C47149b.m52432a(r2)
            java.lang.String r3 = r2.field_IconID
            b03.c r5 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r3 = r5.mo62289a(r3)
            if (r3 == 0) goto L_0x01e1
            uz2.e0 r2 = p773yy.C66710j.C53637a.m60171a(r2, r0, r13, r1)
            java.lang.String r2 = r2.f147092i
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r9.f126680i
            java.lang.Object r3 = r3.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x020e
            goto L_0x01e1
        L_0x020e:
            int r3 = r3.intValue()
            if (r3 != r12) goto L_0x01e1
            gy3.C87412m.m108593f(r2, r4)
            goto L_0x0256
        L_0x0218:
            java.util.List<uz2.c1> r12 = r9.f126677f
            java.util.Iterator r12 = r12.iterator()
        L_0x021e:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0254
            java.lang.Object r2 = r12.next()
            uz2.c1 r2 = (uz2.C52673c1) r2
            rz2.c r2 = mz2.C47149b.m52432a(r2)
            java.lang.String r2 = r2.field_IconID
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r3 = r3.mo62289a(r2)
            if (r3 != 0) goto L_0x021e
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r9.f126679h
            java.lang.Object r3 = r3.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x0245
            goto L_0x021e
        L_0x0245:
            int r3 = r3.intValue()
            if (r3 != r11) goto L_0x021e
            b03.c r11 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            java.lang.String r2 = r11.mo62300l(r2)
            goto L_0x0256
        L_0x0254:
            java.lang.String r2 = ""
        L_0x0256:
            r11 = 4
            if (r2 == 0) goto L_0x028c
            int r12 = r2.length()
            if (r12 != 0) goto L_0x0261
            r12 = 1
            goto L_0x0262
        L_0x0261:
            r12 = 0
        L_0x0262:
            if (r12 == 0) goto L_0x0268
            r10.setVisibility(r11)
            goto L_0x028a
        L_0x0268:
            r10.setVisibility(r0)
            android.content.Context r12 = r8.f173499A
            r1 = 2131837919(0x7f1143df, float:1.9309047E38)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r3[r0] = r2
            java.lang.String r12 = r12.getString(r1, r3)
            java.lang.String r1 = "holder.context.getString…_history_most_status, it)"
            gy3.C87412m.m108593f(r12, r1)
            int r1 = r12.length()
            if (r1 <= 0) goto L_0x0284
            goto L_0x0285
        L_0x0284:
            r13 = 0
        L_0x0285:
            if (r13 == 0) goto L_0x028a
            r10.setText(r12)
        L_0x028a:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x028c:
            if (r1 != 0) goto L_0x0291
            r10.setVisibility(r11)
        L_0x0291:
            r10 = 2131312682(0x7f09402a, float:1.824374E38)
            android.view.View r8 = r8.mo85812D(r10)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            androidx.recyclerview.widget.GridLayoutManager r10 = r7.f106935e
            r8.setLayoutManager(r10)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r10 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.textstatus.convert.album.HistoryItemConvert$buildItemConverts$1 r11 = new com.tencent.mm.plugin.textstatus.convert.album.HistoryItemConvert$buildItemConverts$1
            r11.<init>(r7)
            java.util.ArrayList<mz2.c> r9 = r9.f126678g
            r10.<init>(r11, r9, r0)
            r8.setAdapter(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bz2.C39876d.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ((RecyclerView) oVar.mo85812D(C0966R.C0970id.mhc)).setRecycledViewPool((RecyclerView.C16623q) ((C36570n) this.f106936f).getValue());
    }
}
