package sr1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import fy3.C32227p;
import gy3.C87412m;
import oj3.C62036a;
import rx3.C13598b0;
import te3.C64689rq2;

/* renamed from: sr1.e */
public class C13775e extends C62036a<C64689rq2, View> {

    /* renamed from: g */
    public boolean f38893g;

    /* renamed from: h */
    public C32227p<? super Boolean, ? super FinderVideoLayout.C56521b, C13598b0> f38894h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: pl1.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: pl1.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: pl1.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(oj3.C62040b r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r12, r0)
            super.onBindViewHolder(r12, r13)
            java.lang.Object r0 = r11.mo86983F4(r13)
            r12.f173503E = r0
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            int r2 = r11.getItemViewType(r13)
            r3 = 2
            if (r2 == r3) goto L_0x001e
            r3 = 7
            if (r2 == r3) goto L_0x001e
            goto L_0x00e2
        L_0x001e:
            java.lang.Object r13 = r11.mo86983F4(r13)
            te3.rq2 r13 = (te3.C64689rq2) r13
            r2 = 2131302684(0x7f09191c, float:1.8223461E38)
            android.view.View r12 = r12.mo85812D(r2)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r12.setLayoutParams(r2)
            r3 = 17
            r2.gravity = r3
            boolean r2 = r11.f38893g
            if (r2 == 0) goto L_0x004f
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r1)
            bl3.c r2 = r2.mo62447c(r0)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            goto L_0x005f
        L_0x004f:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r1)
            bl3.c r2 = r2.mo62447c(r0)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11861A2()
        L_0x005f:
            r9 = r2
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r12.setScaleType(r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108593f(r13, r2)
            up1.y r4 = up1.C27696y.RAW_IMAGE
            boolean r2 = r11.f38893g
            if (r2 == 0) goto L_0x007b
            pl1.x r8 = new pl1.x
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0088
        L_0x007b:
            pl1.b0 r10 = new pl1.b0
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r2 = r10
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r8 = r10
        L_0x0088:
            l60.b r2 = r9.mo85955a(r8)
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99412h2
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 0
            if (r3 <= 0) goto L_0x00a7
            p60.e r3 = new p60.e
            r5 = 3
            r3.<init>(r4, r4, r5, r4)
            r4 = r3
        L_0x00a7:
            r2.f291321e = r4
            boolean r3 = r11.f38893g
            if (r3 == 0) goto L_0x00c0
            pl1.e0$a r3 = pl1.C11978e0.C11979a.DARK_TIMELINE
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            goto L_0x00d2
        L_0x00c0:
            pl1.e0$a r3 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
        L_0x00d2:
            r2.mo138758f(r0)
            sr1.d r0 = new sr1.d
            r0.<init>(r13)
            r2.mo85952b(r0)
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r12)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr1.C13775e.onBindViewHolder(oj3.b, int):void");
    }

    /* renamed from: g5 */
    public View mo13137g5(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ali, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(parent.conte…container, parent, false)");
        return inflate;
    }

    public int getItemViewType(int i) {
        return ((C64689rq2) this.f176359d.get(i)).f185268f;
    }
}
