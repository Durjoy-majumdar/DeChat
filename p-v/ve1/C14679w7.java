package ve1;

import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0750m;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import n60.C100075f;
import up1.C37521f;

/* renamed from: ve1.w7 */
public final class C14679w7 extends C60896i<C0750m> {
    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.f293182h = C0966R.raw.finder_filled_activity;
        C37521f fVar = C37521f.f99374d;
        aVar.f293181g = fVar.mo61198x();
        aVar.f293180f = fVar.mo61199y();
        aVar.f293185k = new AlphaAnimation(0.0f, 1.0f);
        aVar.mo139398a();
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ap5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00eb, code lost:
        if (r1 == null) goto L_0x00ed;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r17, jq3.C9493c r18, int r19, int r20, boolean r21, java.util.List r22) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            cm1.m r1 = (cm1.C0750m) r1
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r1, r4)
            r4 = 2131313048(0x7f094198, float:1.8244482E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131313050(0x7f09419a, float:1.8244486E38)
            android.view.View r5 = r0.mo85812D(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131313052(0x7f09419c, float:1.824449E38)
            android.view.View r6 = r0.mo85812D(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131313051(0x7f09419b, float:1.8244488E38)
            android.view.View r7 = r0.mo85812D(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            te3.zj0 r8 = r1.f1768d
            java.lang.String r8 = r8.f146010i
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0049
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r8 = 0
            goto L_0x004a
        L_0x0049:
            r8 = 1
        L_0x004a:
            r11 = 8
            if (r8 == 0) goto L_0x0055
            r5.setVisibility(r9)
            r4.setVisibility(r11)
            goto L_0x0092
        L_0x0055:
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r12 = r8.mo62446e(r3)
            bl3.c r12 = r12.mo62447c(r2)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11871f2()
            pl1.n0 r13 = new pl1.n0
            te3.zj0 r14 = r1.f1768d
            java.lang.String r14 = r14.f146010i
            if (r14 != 0) goto L_0x006f
            java.lang.String r14 = ""
        L_0x006f:
            up1.y r15 = up1.C27696y.RAW_IMAGE
            r13.<init>(r14, r15)
            java.lang.String r14 = "avatarView"
            gy3.C87412m.m108593f(r4, r14)
            pl1.e0$a r14 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r3 = r8.mo62446e(r3)
            bl3.c r2 = r3.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r14)
            r12.mo85957c(r13, r4, r2)
            r4.setVisibility(r9)
            r5.setVisibility(r11)
        L_0x0092:
            er1.w3 r2 = er1.C58784w3.f168295a
            te3.zj0 r3 = r1.f1768d
            long r3 = r3.f146022x
            boolean r2 = r2.mo83908W0(r3)
            if (r2 == 0) goto L_0x00c2
            te3.zj0 r2 = r1.f1768d
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r2.f146006e
            if (r3 == 0) goto L_0x00a7
            java.lang.String r3 = r3.nickname
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.String r2 = r2.f146007f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ": "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r6.setText(r2)
            goto L_0x00c9
        L_0x00c2:
            te3.zj0 r2 = r1.f1768d
            java.lang.String r2 = r2.f146007f
            r6.setText(r2)
        L_0x00c9:
            te3.zj0 r2 = r1.f1768d
            int r2 = r2.f146012n
            r3 = 2
            java.lang.String r2 = er1.C7878t0.m8034c(r3, r2)
            te3.zj0 r1 = r1.f1768d
            te3.ek0 r1 = r1.f146023y
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r1.f132971f
            if (r1 == 0) goto L_0x00ed
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L_0x0103
        L_0x00ed:
            android.view.View r0 = r0.f44854d
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131826080(0x7f1115a0, float:1.9285034E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r9] = r2
            java.lang.String r1 = r0.getString(r1, r3)
            java.lang.String r0 = "holder.itemView.resource…ity_item_desc, countText)"
            gy3.C87412m.m108593f(r1, r0)
        L_0x0103:
            r7.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14679w7.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
