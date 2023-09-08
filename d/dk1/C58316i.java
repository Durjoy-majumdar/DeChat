package dk1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: dk1.i */
public final class C58316i extends C60896i<C58307a> {

    /* renamed from: e */
    public static final int f166990e = C76577a.m92151b(MMApplicationContext.getContext(), 80);

    /* renamed from: f */
    public static final int f166991f = C76577a.m92151b(MMApplicationContext.getContext(), 108);

    /* renamed from: g */
    public static final Map<String, Integer> f166992g = new HashMap();

    /* renamed from: dk1.i$a */
    public static final class C58317a extends ShapeDrawable.ShaderFactory {

        /* renamed from: a */
        public final /* synthetic */ int f166993a;

        public C58317a(int i) {
            this.f166993a = i;
        }

        public Shader resize(int i, int i2) {
            float f = ((float) i) / 2.0f;
            float f2 = (float) i2;
            int i3 = this.f166993a;
            return new LinearGradient(f, 0.0f, f, f2, new int[]{0, i3, i3}, new float[]{0.0f, 0.58f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ak5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r6 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r20, jq3.C9493c r21, int r22, int r23, boolean r24, java.util.List r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            dk1.a r2 = (dk1.C58307a) r2
            java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r2, r5)
            android.view.View r5 = r1.f44854d
            r6 = 2131313560(0x7f094398, float:1.824552E38)
            android.view.View r5 = r5.findViewById(r6)
            boolean r6 = r2.f166954e
            r7 = 0
            if (r6 == 0) goto L_0x002b
            r6 = 2131233052(0x7f08091c, float:1.808223E38)
            r5.setBackgroundResource(r6)
            goto L_0x002e
        L_0x002b:
            r5.setBackground(r7)
        L_0x002e:
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            al1.h r6 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r6 = r6.f151977d
            java.lang.String r6 = r6.f157068i
            java.lang.String r8 = ""
            if (r6 != 0) goto L_0x003e
            r6 = r8
        L_0x003e:
            r5.f27484d = r6
            int r6 = r6.length()
            r9 = 0
            r10 = 1
            if (r6 != 0) goto L_0x004a
            r6 = 1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 == 0) goto L_0x0126
            vp1.e r6 = vp1.C65834e.f189316a
            al1.h r11 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            long r11 = r11.f157075s
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo89871e(r11)
            if (r6 == 0) goto L_0x00eb
            er1.j4 r11 = er1.C58739j4.f168176a
            r11.getClass()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.contact
            if (r11 == 0) goto L_0x006c
            java.lang.String r11 = r11.headUrl
            if (r11 != 0) goto L_0x006d
        L_0x006c:
            r11 = r8
        L_0x006d:
            java.util.LinkedList r6 = r6.getLiveMediaList()
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            te3.rq2 r6 = (te3.C64689rq2) r6
            if (r6 == 0) goto L_0x00ba
            java.lang.String r12 = r6.f185283w
            if (r12 == 0) goto L_0x0086
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r12 = 0
            goto L_0x0087
        L_0x0086:
            r12 = 1
        L_0x0087:
            if (r12 == 0) goto L_0x00a1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r6.f185267e
            r12.append(r13)
            java.lang.String r6 = r6.f185288z
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            goto L_0x00b8
        L_0x00a1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r6.f185283w
            r12.append(r13)
            java.lang.String r6 = r6.f185234A
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
        L_0x00b8:
            if (r6 != 0) goto L_0x00bb
        L_0x00ba:
            r6 = r8
        L_0x00bb:
            java.lang.String r12 = er1.C58739j4.f168177b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getLiveCoverUrl, cover: "
            r13.append(r14)
            r13.append(r6)
            java.lang.String r14 = ", head: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            int r12 = r6.length()
            if (r12 != 0) goto L_0x00e1
            r12 = 1
            goto L_0x00e2
        L_0x00e1:
            r12 = 0
        L_0x00e2:
            if (r12 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r11 = r6
        L_0x00e6:
            r5.f27484d = r11
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x00ec
        L_0x00eb:
            r6 = r7
        L_0x00ec:
            if (r6 != 0) goto L_0x0126
            al1.h r6 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r6 = r6.f151977d
            java.lang.String r6 = r6.f157069j
            if (r6 == 0) goto L_0x00fd
            fe1.d$b r11 = fe1.C58961d.f168673a
            fe1.q r6 = r11.mo84155b(r6)
            goto L_0x00fe
        L_0x00fd:
            r6 = r7
        L_0x00fe:
            if (r6 == 0) goto L_0x0111
            java.lang.String r11 = r6.field_liveCoverImg
            if (r11 == 0) goto L_0x0111
            int r11 = r11.length()
            if (r11 != 0) goto L_0x010c
            r11 = 1
            goto L_0x010d
        L_0x010c:
            r11 = 0
        L_0x010d:
            if (r11 != r10) goto L_0x0111
            r11 = 1
            goto L_0x0112
        L_0x0111:
            r11 = 0
        L_0x0112:
            if (r11 != 0) goto L_0x011f
            if (r6 == 0) goto L_0x0119
            java.lang.String r6 = r6.field_liveCoverImg
            goto L_0x011a
        L_0x0119:
            r6 = r7
        L_0x011a:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x0124
        L_0x011f:
            java.lang.String r6 = r6.field_avatarUrl
            if (r6 != 0) goto L_0x0124
            r6 = r8
        L_0x0124:
            r5.f27484d = r6
        L_0x0126:
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            al1.h r11 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            java.lang.String r11 = r11.f157079w
            r6.f27484d = r11
            if (r11 == 0) goto L_0x013e
            int r11 = r11.length()
            if (r11 != 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r11 = 0
            goto L_0x013f
        L_0x013e:
            r11 = 1
        L_0x013f:
            if (r11 == 0) goto L_0x014c
            al1.h r11 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            java.lang.String r11 = r11.f157053K
            if (r11 != 0) goto L_0x014a
            r11 = r8
        L_0x014a:
            r6.f27484d = r11
        L_0x014c:
            T r11 = r6.f27484d
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            if (r11 == 0) goto L_0x0158
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0159
        L_0x0158:
            r9 = 1
        L_0x0159:
            if (r9 == 0) goto L_0x016f
            fe1.d$b r9 = fe1.C58961d.f168673a
            al1.h r11 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            java.lang.String r11 = r11.f157069j
            fe1.q r9 = r9.mo84155b(r11)
            if (r9 == 0) goto L_0x016d
            java.lang.String r8 = r9.getNickname()
        L_0x016d:
            r6.f27484d = r8
        L_0x016f:
            r8 = 2131306750(0x7f0928fe, float:1.8231708E38)
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0181
            T r9 = r6.f27484d
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
        L_0x0181:
            r8 = 2131306749(0x7f0928fd, float:1.8231706E38)
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x01c9
            fe1.d$b r9 = fe1.C58961d.f168673a
            al1.h r2 = r2.f166953d
            com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
            java.lang.String r2 = r2.f157069j
            fe1.q r2 = r9.mo84155b(r2)
            if (r2 == 0) goto L_0x019f
            java.lang.String r2 = r2.getAvatarUrl()
            goto L_0x01a0
        L_0x019f:
            r2 = r7
        L_0x01a0:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r11 = r9.mo62446e(r4)
            bl3.c r11 = r11.mo62447c(r3)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11872i2()
            pl1.f r12 = new pl1.f
            r13 = 2
            r12.<init>(r2, r7, r13, r7)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r7 = r9.mo62446e(r4)
            bl3.c r7 = r7.mo62447c(r3)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r2 = r7.mo11867O2(r2)
            r11.mo85957c(r12, r8, r2)
        L_0x01c9:
            r2 = 2131306709(0x7f0928d5, float:1.8231625E38)
            android.view.View r2 = r1.mo85812D(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0202
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r8 = r7.mo62446e(r4)
            bl3.c r8 = r8.mo62447c(r3)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            T r11 = r5.f27484d
            java.lang.String r11 = (java.lang.String) r11
            up1.y r12 = up1.C27696y.RAW_IMAGE
            r9.<init>(r11, r12)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r4 = r7.mo62446e(r4)
            bl3.c r3 = r4.mo62447c(r3)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r11)
            r8.mo85957c(r9, r2, r3)
        L_0x0202:
            r2 = 2131306710(0x7f0928d6, float:1.8231627E38)
            android.view.View r2 = r1.mo85812D(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x02f9
            java.util.Map<java.lang.String, java.lang.Integer> r3 = f166992g
            T r4 = r5.f27484d
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r4 = "#bind nickName="
            java.lang.String r7 = "Finder.FinderSideBarConvert"
            if (r3 == 0) goto L_0x024f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            T r4 = r6.f27484d
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = " cache="
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            int r1 = r3.intValue()
            T r3 = r6.f27484d
            java.lang.String r4 = "nickname"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r0.mo83067j(r1, r2, r3)
            goto L_0x02f9
        L_0x024f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            T r4 = r6.f27484d
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = " no cache"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            android.content.Context r1 = r1.f173499A
            java.lang.String r3 = "holder.context"
            gy3.C87412m.m108593f(r1, r3)
            T r3 = r5.f27484d
            java.lang.String r3 = (java.lang.String) r3
            int r13 = f166990e
            int r14 = f166991f
            dk1.h r4 = new dk1.h
            r4.<init>(r6, r5, r0, r2)
            java.lang.Class<rn.t> r2 = p227rn.C63485t.class
            java.lang.Class<rn.s> r5 = p227rn.C63484s.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            rn.s r5 = (p227rn.C63484s) r5
            java.lang.String r3 = r5.mo60498zH(r3, r10)
            r5 = 8
            int r1 = kg3.C76577a.m92151b(r1, r5)
            float r1 = (float) r1
            gc0.a r5 = gc0.C20828a.m22825b()
            hc0.c$b r6 = new hc0.c$b
            r6.<init>()
            r7 = 2131231335(0x7f080267, float:1.8078748E38)
            r6.f59361q = r7
            r6.f59346b = r10
            r6.f59354j = r13
            r6.f59355k = r14
            di3.d r7 = di3.C86312j.m106911c(r2)
            rn.t r7 = (p227rn.C63485t) r7
            ic0.c r7 = r7.mo35195EL(r10)
            r6.f59369y = r7
            di3.d r7 = di3.C86312j.m106911c(r2)
            rn.t r7 = (p227rn.C63485t) r7
            ic0.a r7 = r7.mo35194BK(r10)
            r6.f59370z = r7
            di3.d r7 = di3.C86312j.m106911c(r2)
            rn.t r7 = (p227rn.C63485t) r7
            ic0.i r7 = r7.Zd0(r10)
            r6.f59343A = r7
            java.lang.String r7 = p243tn.C14050a.m13405b(r3)
            r6.f59350f = r7
            hc0.c r6 = r6.mo32666a()
            r7 = 0
            di3.d r2 = di3.C86312j.m106911c(r2)
            r11 = r2
            rn.t r11 = (p227rn.C63485t) r11
            r12 = 1
            r15 = 1
            r16 = 1
            r17 = r1
            r18 = r4
            ic0.h r1 = r11.mo35197zY(r12, r13, r14, r15, r16, r17, r18)
            r2 = 0
            r20 = r5
            r21 = r3
            r22 = r2
            r23 = r6
            r24 = r7
            r25 = r1
            r20.mo32522k(r21, r22, r23, r24, r25)
        L_0x02f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk1.C58316i.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.findViewById(C0966R.C0970id.jkr).setBackground((Drawable) null);
    }

    /* renamed from: j */
    public final void mo83067j(int i, ImageView imageView, String str) {
        Log.m105924i("Finder.FinderSideBarConvert", "#renderToBlurBg nickName=" + str + " load with url onProcessBitmap: color=" + i);
        C58317a aVar = new C58317a(i | -16777216);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(aVar);
        imageView.setBackground(paintDrawable);
        imageView.setVisibility(0);
    }
}
