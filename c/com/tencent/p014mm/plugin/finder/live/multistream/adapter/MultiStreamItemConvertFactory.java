package com.tencent.p014mm.plugin.finder.live.multistream.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import kotlin.Metadata;
import nj1.C61755b;
import oj1.C62034b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory;", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "Lnj1/b;", "service", "Lnj1/b;", "getService", "()Lnj1/b;", "<init>", "(Lnj1/b;)V", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory */
public final class MultiStreamItemConvertFactory implements C9500j {
    private final C61755b service;

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a */
    public static final class C55940a implements C9493c {

        /* renamed from: d */
        public final C62034b f159457d;

        /* renamed from: e */
        public boolean f159458e;

        public C55940a(C62034b bVar, boolean z, int i, C8480h hVar) {
            z = (i & 2) != 0 ? false : z;
            C87412m.m108594g(bVar, "data");
            this.f159457d = bVar;
            this.f159458e = z;
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        public long getItemId() {
            return (long) hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$b */
    public final class C55941b extends C60896i<C55940a> {
        public C55941b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.ct6;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0109, code lost:
            if (r2 == null) goto L_0x010b;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo44e(jq3.C60905o r23, jq3.C9493c r24, int r25, int r26, boolean r27, java.util.List r28) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a r2 = (com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.C55940a) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "item"
                gy3.C87412m.m108594g(r2, r3)
                oj1.b r3 = r2.f159457d
                te3.aq2 r3 = r3.f176355b
                java.lang.String r3 = r3.f182133f
                r4 = 2131315113(0x7f0949a9, float:1.824867E38)
                r5 = 0
                if (r3 == 0) goto L_0x0037
                android.view.View r6 = r1.mo85812D(r4)
                android.widget.TextView r6 = (android.widget.TextView) r6
                byte[] r3 = android.util.Base64.decode(r3, r5)
                java.lang.String r7 = "decode(it, Base64.DEFAULT)"
                gy3.C87412m.m108593f(r3, r7)
                java.lang.String r7 = new java.lang.String
                java.nio.charset.Charset r8 = z04.C119027c.f356488a
                r7.<init>(r3, r8)
                r6.setText(r7)
            L_0x0037:
                boolean r3 = r2.f159458e
                r6 = 2131313130(0x7f0941ea, float:1.8244648E38)
                if (r3 == 0) goto L_0x0099
                android.view.View r3 = r1.mo85812D(r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                android.content.Context r4 = r1.f173499A
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131099800(0x7f060098, float:1.7811963E38)
                int r4 = r4.getColor(r7)
                r3.setTextColor(r4)
                android.view.View r3 = r1.mo85812D(r6)
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r6)
                java.lang.Object[] r8 = r4.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamItemConvert"
                java.lang.String r10 = "onBindViewHolder"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamConvertData;IIZLjava/util/List;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r3
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamItemConvert"
                java.lang.String r9 = "onBindViewHolder"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamConvertData;IIZLjava/util/List;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x00f5
            L_0x0099:
                android.view.View r3 = r1.mo85812D(r6)
                r6 = 8
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r6)
                java.lang.Object[] r15 = r7.mo10232b()
                java.lang.String r16 = "com/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamItemConvert"
                java.lang.String r17 = "onBindViewHolder"
                java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamConvertData;IIZLjava/util/List;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                r14 = r3
                j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                java.lang.Object r6 = r7.mo10231a(r5)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r15 = "com/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamItemConvert"
                java.lang.String r16 = "onBindViewHolder"
                java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory$MultiStreamConvertData;IIZLjava/util/List;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
                android.view.View r3 = r1.mo85812D(r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                android.content.Context r4 = r1.f173499A
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131099804(0x7f06009c, float:1.7811972E38)
                int r4 = r4.getColor(r6)
                r3.setTextColor(r4)
            L_0x00f5:
                oj1.b r2 = r2.f159457d
                te3.aq2 r2 = r2.f176355b
                java.lang.String r2 = r2.f182134g
                r3 = 0
                if (r2 == 0) goto L_0x010b
                int r4 = r2.length()
                if (r4 <= 0) goto L_0x0105
                r5 = 1
            L_0x0105:
                if (r5 == 0) goto L_0x0108
                goto L_0x0109
            L_0x0108:
                r2 = r3
            L_0x0109:
                if (r2 != 0) goto L_0x0115
            L_0x010b:
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory r2 = com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.this
                nj1.b r2 = r2.getService()
                java.lang.String r2 = r2.mo86662y()
            L_0x0115:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "onBindViewHolder url: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r5 = " pos: "
                r4.append(r5)
                r5 = r25
                r4.append(r5)
                java.lang.String r5 = " coverUrl: "
                r4.append(r5)
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory r5 = com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.this
                nj1.b r5 = r5.getService()
                java.lang.String r5 = r5.mo86662y()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "MultiStreamItemConvert"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                bl3.r r4 = bl3.C39818r.f106831a
                java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
                bl3.r$a r4 = r4.mo62446e(r5)
                java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
                bl3.c r4 = r4.mo62447c(r5)
                pl1.s0 r4 = (pl1.C11990s0) r4
                k60.d r4 = r4.mo11871f2()
                pl1.n0 r5 = new pl1.n0
                up1.y r6 = up1.C27696y.THUMB_IMAGE
                r5.<init>(r2, r6)
                l60.b r2 = r4.mo85955a(r5)
                r4 = 2131308050(0x7f092e12, float:1.8234345E38)
                android.view.View r4 = r1.mo85812D(r4)
                java.lang.String r5 = "holder.getView<ImageView>(R.id.loading_view)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                l60.a r2 = (l60.C99342a) r2
                r2.mo85954d(r4)
                androidx.constraintlayout.widget.a r2 = new androidx.constraintlayout.widget.a
                r2.<init>()
                android.view.View r4 = r1.f44854d
                java.lang.String r5 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
                gy3.C87412m.m108592e(r4, r5)
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r2.mo16716c(r4)
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory r4 = com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.this
                nj1.b r4 = r4.getService()
                boolean r4 = r4.mo86656S()
                r6 = 2131300398(0x7f09102e, float:1.8218825E38)
                if (r4 == 0) goto L_0x01a2
                androidx.constraintlayout.widget.a$a r4 = r2.mo16721h(r6)
                java.lang.String r6 = "3:4"
                r4.f44559w = r6
                goto L_0x01aa
            L_0x01a2:
                androidx.constraintlayout.widget.a$a r4 = r2.mo16721h(r6)
                java.lang.String r6 = "16:9"
                r4.f44559w = r6
            L_0x01aa:
                android.view.View r1 = r1.f44854d
                gy3.C87412m.m108592e(r1, r5)
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r2.mo16714a(r1)
                r1.setConstraintSet(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.C55941b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    public MultiStreamItemConvertFactory(C61755b bVar) {
        C87412m.m108594g(bVar, "service");
        this.service = bVar;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C55941b();
    }

    public final C61755b getService() {
        return this.service;
    }
}
