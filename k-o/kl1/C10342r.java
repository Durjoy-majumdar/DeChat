package kl1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kl1.r */
public final class C10342r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10333o f31504d;

    /* renamed from: e */
    public final /* synthetic */ boolean f31505e;

    /* renamed from: f */
    public final /* synthetic */ int f31506f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10342r(C10333o oVar, boolean z, int i) {
        super(0);
        this.f31504d = oVar;
        this.f31505e = z;
        this.f31506f = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x090e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0910  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0913  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x091e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0994  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0287 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x090b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0285  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r65 = this;
            r0 = r65
            kl1.o r1 = r0.f31504d
            java.util.ArrayList<cj1.o5> r1 = r1.f31495l
            int r2 = r1.size()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r2 <= 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r1.remove(r4)
            cj1.o5 r1 = (cj1.C0581o5) r1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            java.lang.String r2 = "Finder.LiveCommentPlugin_BulletNew"
            if (r1 == 0) goto L_0x0c89
            kl1.o r8 = r0.f31504d
            boolean r9 = r0.f31505e
            r8.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "show bullet:"
            r10.append(r11)
            android.view.ViewGroup r11 = r8.f31484a
            int r11 = r11.hashCode()
            r10.append(r11)
            java.lang.String r11 = " comment:"
            r10.append(r11)
            java.lang.String r11 = r1.getContent()
            r10.append(r11)
            java.lang.String r11 = ",hashCode:"
            r10.append(r11)
            int r11 = r1.hashCode()
            r10.append(r11)
            java.lang.String r11 = ",id:"
            r10.append(r11)
            java.lang.String r11 = r1.mo572f()
            r10.append(r11)
            java.lang.String r11 = ",seq:"
            r10.append(r11)
            long r11 = r1.getSeq()
            r10.append(r11)
            java.lang.String r11 = ",animJob isActive:"
            r10.append(r11)
            kl1.d r11 = r8.mo10630b()
            a14.z1 r11 = r11.f31411d
            if (r11 == 0) goto L_0x0089
            a14.a r11 = (a14.C53851a) r11
            boolean r11 = r11.mo74466a()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            r10.append(r11)
            r11 = 33
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            rx3.g r2 = r8.f31492i
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            kl1.l r2 = (kl1.C10327l) r2
            r2.getClass()
            up1.y r10 = up1.C27696y.SMALL_AVATAR_IMAGE
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            pl1.e0$a r13 = pl1.C11978e0.C11979a.WX_AVATAR
            java.lang.Class<ny.h> r14 = p629ny.C76979h.class
            java.lang.Class<tf0.p1> r15 = tf0.C64916p1.class
            java.lang.Class<pl1.s0> r11 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            kl1.o r3 = r2.f31472a
            android.view.View r3 = r3.mo10631c()
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.mo10233c(r0)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r20 = "bindBulletView"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 0
            java.lang.Object r7 = r7.mo10231a(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r0 = r7.intValue()
            r3.setVisibility(r0)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r19 = "bindBulletView"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            int r0 = r1.getType()
            r3 = 10005(0x2715, float:1.402E-41)
            java.lang.String r7 = "getService(IFinderCommon…atureService::class.java)"
            java.lang.String r4 = "Finder.LiveCommentPlugin_BulletNew_View"
            java.lang.String r18 = ""
            if (r0 == r3) goto L_0x0770
            r3 = 10012(0x271c, float:1.403E-41)
            if (r0 == r3) goto L_0x06a0
            r3 = 20047(0x4e4f, float:2.8092E-41)
            if (r0 == r3) goto L_0x05cf
            r3 = 20076(0x4e6c, float:2.8132E-41)
            java.lang.String r7 = "type"
            if (r0 == r3) goto L_0x0359
            r3 = 20078(0x4e6e, float:2.8135E-41)
            if (r0 == r3) goto L_0x0123
            r21 = r9
            goto L_0x09e7
        L_0x0123:
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            int r4 = r2.f31477f
            r0.setTextColor(r4)
            kl1.o r0 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            java.util.HashMap r4 = r2.mo10629a()
            java.lang.Object r4 = r4.get(r5)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r0.setBackground(r4)
            kl1.o r0 = r2.f31472a
            java.util.ArrayList<cj1.o5> r0 = r0.f31495l
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x014c:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0169
            java.lang.Object r15 = r0.next()
            r19 = r15
            cj1.o5 r19 = (cj1.C0581o5) r19
            int r14 = r19.getType()
            if (r14 != r3) goto L_0x0162
            r14 = 1
            goto L_0x0163
        L_0x0162:
            r14 = 0
        L_0x0163:
            if (r14 == 0) goto L_0x014c
            r4.add(r15)
            goto L_0x014c
        L_0x0169:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 2
            java.util.List r14 = sx3.C110818d0.m150947s0(r4, r3)
            r0.addAll(r14)
            r0.add(r1)
            int r3 = r4.size()
            r4 = 1
            int r3 = r3 + r4
            java.lang.Object r4 = sx3.C110818d0.m150916N(r0)
            cj1.o5 r4 = (cj1.C0581o5) r4
            if (r4 == 0) goto L_0x018d
            java.lang.String r4 = r4.mo573g()
            if (r4 != 0) goto L_0x018f
        L_0x018d:
            r4 = r18
        L_0x018f:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r14.getClass()
            fj1.b r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r14 == 0) goto L_0x019f
            ok1.e r15 = ok1.C62042e.f176370a
            boolean r14 = r15.mo87032P0(r14)
            goto L_0x01a0
        L_0x019f:
            r14 = 0
        L_0x01a0:
            if (r14 == 0) goto L_0x02b4
            kl1.o r14 = r2.f31472a
            android.view.View r14 = r14.mo10631c()
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r5)
            java.lang.Object[] r27 = r15.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r29 = "bindBulletView"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r14
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 0
            java.lang.Object r15 = r15.mo10231a(r5)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r5 = r15.intValue()
            r14.setVisibility(r5)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r28 = "bindBulletView"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            rx3.g r5 = r2.f31476e
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.widget.ImageView[] r5 = (android.widget.ImageView[]) r5
            int r14 = r5.length
            r15 = 0
        L_0x01f0:
            if (r15 >= r14) goto L_0x0204
            r19 = r14
            r14 = r5[r15]
            r21 = r5
            r5 = 8
            r14.setVisibility(r5)
            int r15 = r15 + 1
            r14 = r19
            r5 = r21
            goto L_0x01f0
        L_0x0204:
            r5 = 3
            java.util.List r0 = sx3.C110818d0.m150948t0(r0, r5)
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x020e:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x02b1
            java.lang.Object r14 = r0.next()
            int r15 = r5 + 1
            if (r5 < 0) goto L_0x02ac
            cj1.o5 r14 = (cj1.C0581o5) r14
            r17 = r0
            rx3.g r0 = r2.f31476e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView[] r0 = (android.widget.ImageView[]) r0
            r0 = r0[r5]
            r5 = 0
            r0.setVisibility(r5)
            te3.hx0 r5 = r14.mo579i()
            if (r5 == 0) goto L_0x023f
            int r5 = r5.f134926n
            r19 = r15
            r15 = 3
            if (r5 != r15) goto L_0x0241
            r5 = 1
            goto L_0x0242
        L_0x023f:
            r19 = r15
        L_0x0241:
            r5 = 0
        L_0x0242:
            if (r5 == 0) goto L_0x025a
            rx3.l r5 = new rx3.l
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r15 = r15.mo62446e(r6)
            bl3.c r15 = r15.mo62447c(r11)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11872i2()
            r5.<init>(r15, r12)
            goto L_0x026f
        L_0x025a:
            rx3.l r5 = new rx3.l
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r15 = r15.mo62446e(r6)
            bl3.c r15 = r15.mo62447c(r11)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11865K1()
            r5.<init>(r15, r13)
        L_0x026f:
            A r15 = r5.f38555d
            k60.d r15 = (k60.C60979d) r15
            r21 = r9
            pl1.f r9 = new pl1.f
            te3.hx0 r14 = r14.mo579i()
            if (r14 == 0) goto L_0x0285
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
            if (r14 == 0) goto L_0x0285
            java.lang.String r14 = r14.headUrl
            if (r14 != 0) goto L_0x0287
        L_0x0285:
            r14 = r18
        L_0x0287:
            r9.<init>(r14, r10)
            B r5 = r5.f38556e
            pl1.e0$a r5 = (pl1.C11978e0.C11979a) r5
            gy3.C87412m.m108594g(r5, r7)
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r14 = r14.mo62446e(r6)
            bl3.c r14 = r14.mo62447c(r11)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r5 = r14.mo11867O2(r5)
            r15.mo85957c(r9, r0, r5)
            r0 = r17
            r5 = r19
            r9 = r21
            goto L_0x020e
        L_0x02ac:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x02b1:
            r21 = r9
            goto L_0x02fe
        L_0x02b4:
            r21 = r9
            kl1.o r0 = r2.f31472a
            android.view.View r9 = r0.mo10631c()
            k20.a r0 = new k20.a
            r0.<init>()
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo10233c(r5)
            java.lang.Object[] r27 = r0.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r29 = "bindBulletView"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r9
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 0
            java.lang.Object r0 = r0.mo10231a(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.setVisibility(r0)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r11 = "bindBulletView"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x02fe:
            r0 = 1
            if (r3 <= r0) goto L_0x032b
            kl1.o r5 = r2.f31472a
            android.widget.TextView r5 = r5.mo10632d()
            kl1.o r6 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r6 = r6.f31488e
            android.content.Context r6 = r6.getContext()
            r7 = 2131827434(0x7f111aea, float:1.928778E38)
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10[r0] = r3
            java.lang.String r3 = r6.getString(r7, r10)
            r5.setText(r3)
            kl1.b r3 = kl1.C10300b.f31392a
            r3.mo10609c(r9, r0)
            goto L_0x034e
        L_0x032b:
            kl1.o r3 = r2.f31472a
            android.widget.TextView r3 = r3.mo10632d()
            kl1.o r5 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r5 = r5.f31488e
            android.content.Context r5 = r5.getContext()
            r6 = 2131827435(0x7f111aeb, float:1.9287783E38)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r7[r0] = r4
            java.lang.String r4 = r5.getString(r6, r7)
            r3.setText(r4)
            kl1.b r3 = kl1.C10300b.f31392a
            r4 = 2
            r3.mo10609c(r4, r0)
        L_0x034e:
            kl1.o r0 = r2.f31472a
            java.util.ArrayList<cj1.o5> r0 = r0.f31495l
            kl1.k r2 = kl1.C10326k.f31466d
            o40.C61926c.m72673R(r0, r2)
            goto L_0x09e7
        L_0x0359:
            r21 = r9
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            int r3 = r2.f31477f
            r0.setTextColor(r3)
            kl1.o r0 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            java.util.HashMap r3 = r2.mo10629a()
            java.lang.Object r3 = r3.get(r5)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r0.setBackground(r3)
            java.lang.Object r0 = r1.mo563q()
            boolean r3 = r0 instanceof te3.C49752hu0
            if (r3 == 0) goto L_0x0382
            te3.hu0 r0 = (te3.C49752hu0) r0
            goto L_0x0383
        L_0x0382:
            r0 = 0
        L_0x0383:
            if (r0 == 0) goto L_0x09e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "like bullet msg: "
            r3.append(r9)
            org.json.JSONObject r9 = o40.C61937h.m72709h(r0)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.util.LinkedList<te3.tn2> r3 = r0.f134885e
            java.lang.String r9 = "it.merged_msg_list"
            gy3.C87412m.m108593f(r3, r9)
            java.util.Iterator r3 = r3.iterator()
            r9 = 0
            r14 = 0
        L_0x03aa:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x03cc
            java.lang.Object r15 = r3.next()
            int r19 = r14 + 1
            if (r14 < 0) goto L_0x03c7
            te3.tn2 r15 = (te3.C51420tn2) r15
            int r14 = r15.f142298d
            int r15 = r2.f31475d
            if (r14 != r15) goto L_0x03c4
            r9 = r19
            r14 = r9
            goto L_0x03aa
        L_0x03c4:
            r14 = r19
            goto L_0x03aa
        L_0x03c7:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x03cc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "resultIndex: "
            r3.append(r14)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            te3.tn2 r3 = r0.f134884d
            if (r3 == 0) goto L_0x03e7
            int r3 = r3.f142298d
            goto L_0x03e8
        L_0x03e7:
            r3 = 0
        L_0x03e8:
            r2.f31475d = r3
            if (r9 < 0) goto L_0x03f6
            java.util.LinkedList<te3.tn2> r3 = r0.f134885e
            int r3 = r3.size()
            if (r9 >= r3) goto L_0x03f6
            r3 = 1
            goto L_0x03f7
        L_0x03f6:
            r3 = 0
        L_0x03f7:
            if (r3 == 0) goto L_0x0402
            java.util.LinkedList<te3.tn2> r0 = r0.f134885e
            java.lang.Object r0 = r0.get(r9)
            te3.tn2 r0 = (te3.C51420tn2) r0
            goto L_0x0404
        L_0x0402:
            te3.tn2 r0 = r0.f134884d
        L_0x0404:
            if (r0 == 0) goto L_0x09e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "like bullet chosen msg: "
            r3.append(r9)
            org.json.JSONObject r9 = o40.C61937h.m72709h(r0)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.util.LinkedList<te3.wn2> r3 = r0.f142299e
            java.lang.String r4 = "it.user_info_list"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.wn2 r3 = (te3.C51857wn2) r3
            if (r3 == 0) goto L_0x0434
            java.lang.String r3 = r3.f144157d
            if (r3 != 0) goto L_0x0432
            goto L_0x0434
        L_0x0432:
            r18 = r3
        L_0x0434:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            fj1.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r3 == 0) goto L_0x0444
            ok1.e r9 = ok1.C62042e.f176370a
            boolean r3 = r9.mo87032P0(r3)
            goto L_0x0445
        L_0x0444:
            r3 = 0
        L_0x0445:
            if (r3 == 0) goto L_0x0530
            kl1.o r3 = r2.f31472a
            android.view.View r3 = r3.mo10631c()
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r5)
            java.lang.Object[] r27 = r9.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r29 = "bindBulletView"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r3
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 0
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r5 = r9.intValue()
            r3.setVisibility(r5)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r28 = "bindBulletView"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            rx3.g r3 = r2.f31476e
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.ImageView[] r3 = (android.widget.ImageView[]) r3
            int r5 = r3.length
            r9 = 0
        L_0x0495:
            if (r9 >= r5) goto L_0x04a1
            r14 = r3[r9]
            r15 = 8
            r14.setVisibility(r15)
            int r9 = r9 + 1
            goto L_0x0495
        L_0x04a1:
            java.util.LinkedList<te3.wn2> r3 = r0.f142299e
            gy3.C87412m.m108593f(r3, r4)
            r4 = 3
            java.util.List r3 = sx3.C110818d0.m150948t0(r3, r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x04b0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0578
            java.lang.Object r5 = r3.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L_0x052b
            te3.wn2 r5 = (te3.C51857wn2) r5
            rx3.g r14 = r2.f31476e
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.widget.ImageView[] r14 = (android.widget.ImageView[]) r14
            r4 = r14[r4]
            r14 = 0
            r4.setVisibility(r14)
            int r14 = r5.f144159f
            r15 = 3
            if (r14 != r15) goto L_0x04eb
            rx3.l r14 = new rx3.l
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r15 = r15.mo62446e(r6)
            bl3.c r15 = r15.mo62447c(r11)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11872i2()
            r14.<init>(r15, r12)
            goto L_0x0500
        L_0x04eb:
            rx3.l r14 = new rx3.l
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r15 = r15.mo62446e(r6)
            bl3.c r15 = r15.mo62447c(r11)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11865K1()
            r14.<init>(r15, r13)
        L_0x0500:
            A r15 = r14.f38555d
            k60.d r15 = (k60.C60979d) r15
            r17 = r3
            pl1.f r3 = new pl1.f
            java.lang.String r5 = r5.f144158e
            r3.<init>(r5, r10)
            B r5 = r14.f38556e
            pl1.e0$a r5 = (pl1.C11978e0.C11979a) r5
            gy3.C87412m.m108594g(r5, r7)
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r14 = r14.mo62446e(r6)
            bl3.c r14 = r14.mo62447c(r11)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r5 = r14.mo11867O2(r5)
            r15.mo85957c(r3, r4, r5)
            r4 = r9
            r3 = r17
            goto L_0x04b0
        L_0x052b:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0530:
            kl1.o r3 = r2.f31472a
            android.view.View r9 = r3.mo10631c()
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r27 = r3.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r29 = "bindBulletView"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r9
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r9.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentView"
            java.lang.String r11 = "bindBulletView"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0578:
            int r3 = r0.f142300f
            r4 = 1
            if (r3 <= r4) goto L_0x05a9
            kl1.o r3 = r2.f31472a
            android.widget.TextView r3 = r3.mo10632d()
            kl1.o r2 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r2 = r2.f31488e
            android.content.Context r2 = r2.getContext()
            r5 = 2131827652(0x7f111bc4, float:1.9288223E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r18
            int r0 = r0.f142300f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            java.lang.String r0 = r2.getString(r5, r6)
            r3.setText(r0)
            kl1.b r0 = kl1.C10300b.f31392a
            r0.mo10609c(r4, r4)
            goto L_0x05cb
        L_0x05a9:
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            kl1.o r2 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r2 = r2.f31488e
            android.content.Context r2 = r2.getContext()
            r3 = 2131827653(0x7f111bc5, float:1.9288225E38)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r18
            java.lang.String r2 = r2.getString(r3, r5)
            r0.setText(r2)
            kl1.b r0 = kl1.C10300b.f31392a
            r0.mo10609c(r4, r6)
        L_0x05cb:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09e7
        L_0x05cf:
            r21 = r9
            di3.d r0 = di3.C86312j.m106911c(r15)
            gy3.C87412m.m108593f(r0, r7)
            r9 = r0
            tf0.p1 r9 = (tf0.C64916p1) r9
            kl1.o r0 = r2.f31472a
            android.widget.TextView r10 = r0.mo10632d()
            android.text.SpannableString r11 = new android.text.SpannableString
            te3.hx0 r0 = r1.mo581k()
            if (r0 == 0) goto L_0x05f1
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x05f1
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x05f3
        L_0x05f1:
            r0 = r18
        L_0x05f3:
            r11.<init>(r0)
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76442i(r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "show FinderLiveAppMsgGameLivePurchaseTeamUpInfo "
            r3.append(r6)
            java.lang.Object r6 = r1.mo563q()
            if (r6 != 0) goto L_0x060f
            goto L_0x0611
        L_0x060f:
            r18 = r6
        L_0x0611:
            org.json.JSONObject r6 = o40.C61937h.m72709h(r18)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.Object r3 = r1.mo563q()
            boolean r4 = r3 instanceof te3.C49049cu0
            if (r4 == 0) goto L_0x062a
            te3.cu0 r3 = (te3.C49049cu0) r3
            goto L_0x062b
        L_0x062a:
            r3 = 0
        L_0x062b:
            if (r3 == 0) goto L_0x0682
            kl1.o r4 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r4 = r4.f31488e
            android.content.Context r4 = r4.getContext()
            int r3 = r3.f131959d
            r6 = 1
            if (r3 != r6) goto L_0x063e
            r3 = 2131828956(0x7f1120dc, float:1.9290868E38)
            goto L_0x0641
        L_0x063e:
            r3 = 2131828955(0x7f1120db, float:1.9290865E38)
        L_0x0641:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r0
            java.lang.String r0 = r4.getString(r3, r7)
            java.lang.String r3 = "widget.bulletContent.con…ame\n                    )"
            gy3.C87412m.m108593f(r0, r3)
            kl1.o r3 = r2.f31472a
            android.widget.TextView r3 = r3.mo10632d()
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0661
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0662
        L_0x0661:
            r3 = 0
        L_0x0662:
            if (r3 == 0) goto L_0x0677
            int r4 = kl1.C10327l.f31468i
            int r6 = r3.getPaddingTop()
            int r7 = r3.getPaddingRight()
            int r9 = r3.getPaddingBottom()
            r3.setPadding(r4, r6, r7, r9)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0677:
            kl1.o r3 = r2.f31472a
            android.widget.TextView r3 = r3.mo10632d()
            r3.setText(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0682:
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            int r3 = r2.f31477f
            r0.setTextColor(r3)
            kl1.o r0 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            java.util.HashMap r2 = r2.mo10629a()
            java.lang.Object r2 = r2.get(r5)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r0.setBackground(r2)
            goto L_0x09e7
        L_0x06a0:
            r21 = r9
            di3.d r0 = di3.C86312j.m106911c(r15)
            gy3.C87412m.m108593f(r0, r7)
            r26 = r0
            tf0.p1 r26 = (tf0.C64916p1) r26
            kl1.o r0 = r2.f31472a
            android.widget.TextView r27 = r0.mo10632d()
            android.text.SpannableString r0 = new android.text.SpannableString
            te3.hx0 r3 = r1.mo579i()
            if (r3 == 0) goto L_0x06c3
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x06c3
            java.lang.String r3 = r3.nickname
            if (r3 != 0) goto L_0x06c5
        L_0x06c3:
            r3 = r18
        L_0x06c5:
            r0.<init>(r3)
            r29 = 0
            r30 = 4
            r31 = 0
            r28 = r0
            java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76442i(r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " "
            r3.append(r4)
            kl1.o r4 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r4 = r4.f31488e
            android.content.Context r4 = r4.getContext()
            r6 = 2131828957(0x7f1120dd, float:1.929087E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r7 = 0
            r9[r7] = r0
            java.lang.String r0 = r4.getString(r6, r9)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            de3.u r3 = new de3.u
            di3.d r4 = di3.C86312j.m106911c(r14)
            ny.h r4 = (p629ny.C76979h) r4
            kl1.o r6 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r6 = r6.f31488e
            android.content.Context r6 = r6.getContext()
            android.text.SpannableString r0 = r4.mo107057T1(r6, r0)
            r3.<init>((android.text.SpannableString) r0)
            rx3.g r0 = r2.f31478g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            go3.c r0 = (go3.C76003c) r0
            r4 = 33
            r6 = 1
            r7 = 0
            r3.mo105705b(r0, r7, r6, r4)
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            android.view.ViewParent r0 = r0.getParent()
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0733
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0734
        L_0x0733:
            r0 = 0
        L_0x0734:
            if (r0 == 0) goto L_0x0749
            int r4 = kl1.C10327l.f31468i
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingRight()
            int r9 = r0.getPaddingBottom()
            r0.setPadding(r4, r6, r7, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0749:
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            r0.setText(r3)
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            int r3 = r2.f31477f
            r0.setTextColor(r3)
            kl1.o r0 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            java.util.HashMap r2 = r2.mo10629a()
            java.lang.Object r2 = r2.get(r5)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r0.setBackground(r2)
            goto L_0x09e7
        L_0x0770:
            r21 = r9
            java.lang.String r0 = r1.mo571e()
            if (r0 == 0) goto L_0x0781
            int r0 = r0.length()
            if (r0 != 0) goto L_0x077f
            goto L_0x0781
        L_0x077f:
            r0 = 0
            goto L_0x0782
        L_0x0781:
            r0 = 1
        L_0x0782:
            if (r0 != 0) goto L_0x07a2
            java.lang.String r0 = r1.mo571e()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 == 0) goto L_0x0793
            goto L_0x07a2
        L_0x0793:
            ok1.e r0 = ok1.C62042e.f176370a
            java.lang.String r3 = r1.mo571e()
            if (r3 != 0) goto L_0x079d
            r3 = r18
        L_0x079d:
            boolean r0 = r0.mo87063a1(r3)
            goto L_0x07a3
        L_0x07a2:
            r0 = 0
        L_0x07a3:
            r3 = 2131828204(0x7f111dec, float:1.9289342E38)
            di3.d r6 = di3.C86312j.m106911c(r15)
            gy3.C87412m.m108593f(r6, r7)
            r26 = r6
            tf0.p1 r26 = (tf0.C64916p1) r26
            kl1.o r6 = r2.f31472a
            android.widget.TextView r27 = r6.mo10632d()
            android.text.SpannableString r6 = new android.text.SpannableString
            te3.hx0 r7 = r1.mo579i()
            if (r7 == 0) goto L_0x07c7
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x07c7
            java.lang.String r7 = r7.nickname
            if (r7 != 0) goto L_0x07c9
        L_0x07c7:
            r7 = r18
        L_0x07c9:
            r6.<init>(r7)
            r29 = 0
            r30 = 4
            r31 = 0
            r28 = r6
            java.lang.CharSequence r6 = tf0.C64916p1.C64917a.m76442i(r26, r27, r28, r29, r30, r31)
            kl1.b r7 = kl1.C10300b.f31392a
            java.util.LinkedList r9 = r7.mo10607a(r1)
            ok1.e r10 = ok1.C62042e.f176370a
            int r10 = r10.mo87066b0(r9)
            kl1.o r11 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r11 = r11.f31488e
            boolean r12 = r1 instanceof cj1.C0556j5
            if (r12 == 0) goto L_0x085e
            r12 = r1
            cj1.j5 r12 = (cj1.C0556j5) r12
            te3.r41 r13 = r12.f1344a
            pe3.b r13 = r13.f185134q
            if (r13 == 0) goto L_0x085e
            te3.i21 r13 = new te3.i21
            r13.<init>()
            te3.r41 r12 = r12.f1344a
            pe3.b r12 = r12.f185134q
            if (r12 == 0) goto L_0x0805
            byte[] r12 = r12.mo123703f()
            goto L_0x0806
        L_0x0805:
            r12 = 0
        L_0x0806:
            r13.parseFrom(r12)
            int r12 = r13.f135034d
            r15 = 2
            if (r12 != r15) goto L_0x0811
            r3 = 2131828206(0x7f111dee, float:1.9289346E38)
        L_0x0811:
            java.lang.String r13 = r13.f135035e
            if (r13 != 0) goto L_0x0816
            goto L_0x0818
        L_0x0816:
            r18 = r13
        L_0x0818:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            if (r12 != r15) goto L_0x0833
            r12 = 0
            r13 = 0
            android.graphics.drawable.Drawable r5 = kl1.C10327l.m10265b(r2, r9, r13, r15, r12)
            if (r5 != 0) goto L_0x0847
            java.util.HashMap r5 = r2.mo10629a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object r5 = r5.get(r9)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L_0x0847
        L_0x0833:
            r12 = 0
            r13 = 0
            android.graphics.drawable.Drawable r9 = kl1.C10327l.m10265b(r2, r9, r13, r15, r12)
            if (r9 != 0) goto L_0x0846
            java.util.HashMap r9 = r2.mo10629a()
            java.lang.Object r5 = r9.get(r5)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L_0x0847
        L_0x0846:
            r5 = r9
        L_0x0847:
            if (r5 != 0) goto L_0x0873
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r9)
            java.lang.String r9 = "getContext().resources.g…e.finder_live_comment_bg)"
            gy3.C87412m.m108593f(r5, r9)
            goto L_0x0873
        L_0x085e:
            r12 = 2
            r13 = 0
            r15 = 0
            android.graphics.drawable.Drawable r9 = kl1.C10327l.m10265b(r2, r9, r15, r12, r13)
            if (r9 != 0) goto L_0x0872
            java.util.HashMap r9 = r2.mo10629a()
            java.lang.Object r5 = r9.get(r5)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L_0x0873
        L_0x0872:
            r5 = r9
        L_0x0873:
            r9 = r18
            r11.setBackground(r5)
            int r5 = r9.length()
            if (r5 != 0) goto L_0x0880
            r5 = 1
            goto L_0x0881
        L_0x0880:
            r5 = 0
        L_0x0881:
            if (r5 == 0) goto L_0x0896
            kl1.o r5 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r5 = r5.f31488e
            android.content.Context r5 = r5.getContext()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r11 = 0
            r12[r11] = r6
            java.lang.String r3 = r5.getString(r3, r12)
            goto L_0x08aa
        L_0x0896:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r5 = 32
            r3.append(r5)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
        L_0x08aa:
            java.lang.String r5 = "if (msgContent.isNullOrE…ontent\"\n                }"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "setBulletComment id:"
            r5.append(r6)
            java.lang.String r6 = r1.mo572f()
            r5.append(r6)
            java.lang.String r6 = ", msgContent: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = ", "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", level:"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r6 = ", is friend:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            int r0 = kl1.C10327l.f31469j
            java.util.LinkedList r4 = r7.mo10607a(r1)
            java.util.Iterator r5 = r4.iterator()
        L_0x08f2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x090b
            java.lang.Object r6 = r5.next()
            r7 = r6
            te3.aw0 r7 = (te3.C48770aw0) r7
            int r7 = r7.f130789d
            r9 = 8
            if (r7 != r9) goto L_0x0907
            r7 = 1
            goto L_0x0908
        L_0x0907:
            r7 = 0
        L_0x0908:
            if (r7 == 0) goto L_0x08f2
            goto L_0x090c
        L_0x090b:
            r6 = 0
        L_0x090c:
            if (r6 == 0) goto L_0x0910
            r5 = 1
            goto L_0x0911
        L_0x0910:
            r5 = 0
        L_0x0911:
            if (r5 == 0) goto L_0x0918
            kl1.m r5 = kl1.C10331m.f31482d
            o40.C61926c.m72675T(r4, r5)
        L_0x0918:
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x0994
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            wk1.r r7 = new wk1.r
            wk1.x r9 = wk1.C15483x.MODE_LIGHT_BG
            r11 = 0
            r7.<init>(r9, r11, r5, r11)
            r0.put(r6, r7)
            wk1.n r5 = wk1.C15440n.f41895a
            int[] r28 = wk1.C15440n.f41914t
            wk1.x r29 = wk1.C15483x.MODE_DARK
            wk1.y r30 = wk1.C15484y.SIZE_NORMAL
            r31 = 0
            kl1.o r6 = r2.f31472a
            android.widget.TextView r32 = r6.mo10632d()
            r34 = 16
            r35 = 0
            r26 = r5
            r27 = r4
            r33 = r0
            java.util.List r0 = wk1.C15440n.m14441q(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            kl1.o r4 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r4 = r4.f31488e
            android.content.Context r4 = r4.getContext()
            java.lang.String r6 = "widget.bulletContent.context"
            gy3.C87412m.m108593f(r4, r6)
            r6 = 1
            de3.u r3 = r5.mo14267p(r4, r3, r0, r6)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x096e
            int r0 = kl1.C10327l.f31467h
            goto L_0x0970
        L_0x096e:
            int r0 = kl1.C10327l.f31469j
        L_0x0970:
            kl1.o r4 = r2.f31472a
            android.widget.TextView r4 = r4.mo10632d()
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0981
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0982
        L_0x0981:
            r4 = 0
        L_0x0982:
            if (r4 == 0) goto L_0x09cf
            int r5 = r4.getPaddingTop()
            int r6 = r4.getPaddingRight()
            int r7 = r4.getPaddingBottom()
            r4.setPadding(r0, r5, r6, r7)
            goto L_0x09cf
        L_0x0994:
            de3.u r4 = new de3.u
            di3.d r5 = di3.C86312j.m106911c(r14)
            ny.h r5 = (p629ny.C76979h) r5
            kl1.o r6 = r2.f31472a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r6 = r6.f31488e
            android.content.Context r6 = r6.getContext()
            android.text.SpannableString r3 = r5.mo107057T1(r6, r3)
            r4.<init>((android.text.SpannableString) r3)
            kl1.o r3 = r2.f31472a
            android.widget.TextView r3 = r3.mo10632d()
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x09bc
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x09bd
        L_0x09bc:
            r3 = 0
        L_0x09bd:
            if (r3 == 0) goto L_0x09ce
            int r5 = r3.getPaddingTop()
            int r6 = r3.getPaddingRight()
            int r7 = r3.getPaddingBottom()
            r3.setPadding(r0, r5, r6, r7)
        L_0x09ce:
            r3 = r4
        L_0x09cf:
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            r0.setText(r3)
            kl1.o r0 = r2.f31472a
            android.widget.TextView r0 = r0.mo10632d()
            ok1.e r2 = ok1.C62042e.f176370a
            int r2 = r2.mo86989A0(r10)
            r0.setTextColor(r2)
        L_0x09e7:
            r0 = 1
            r8.mo10636h(r0)
            android.view.ViewGroup r0 = r8.f31484a
            r2 = 0
            r0.setVisibility(r2)
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r8.f31488e
            r0.setVisibility(r2)
            kl1.d r0 = r8.mo10630b()
            kl1.a$d r2 = kl1.C10289a.f31347i
            rx3.g r2 = r8.f31487d
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            kl1.a$a r3 = kl1.C10289a.C10290a.START
            kl1.b r4 = kl1.C10300b.f31392a
            rx3.l r1 = r4.mo10608b(r1)
            A r4 = r1.f38555d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            B r5 = r1.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r4 == 0) goto L_0x0a2a
            r4 = 40
            if (r5 < r4) goto L_0x0a2a
            r4 = 1
            goto L_0x0a2b
        L_0x0a2a:
            r4 = 0
        L_0x0a2b:
            kl1.a r6 = kl1.C10289a.f31350l
            if (r6 == 0) goto L_0x0a36
            boolean r7 = r6.f31354d
            r9 = 1
            if (r7 != r9) goto L_0x0a36
            r7 = 1
            goto L_0x0a37
        L_0x0a36:
            r7 = 0
        L_0x0a37:
            java.lang.String r9 = "AnimConfig"
            if (r7 == 0) goto L_0x0a5d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getCacheAnimConfig but config:"
            r6.append(r7)
            kl1.a r7 = kl1.C10289a.f31350l
            if (r7 == 0) goto L_0x0a4c
            java.lang.String r7 = r7.f31351a
            goto L_0x0a4d
        L_0x0a4c:
            r7 = 0
        L_0x0a4d:
            r6.append(r7)
            java.lang.String r7 = " still working!"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            r6 = 0
        L_0x0a5d:
            if (r6 != 0) goto L_0x0af0
            kl1.a r6 = new kl1.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r10 = java.lang.System.currentTimeMillis()
            r7.append(r10)
            java.lang.String r10 = "_level:"
            r7.append(r10)
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r7.append(r1)
            java.lang.String r27 = r7.toString()
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            kl1.a$h r1 = new kl1.a$h
            r32 = r1
            r33 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r53 = 8191(0x1fff, float:1.1478E-41)
            r54 = 0
            r32.<init>(r33, r34, r36, r38, r40, r42, r43, r44, r46, r47, r48, r49, r51, r53, r54)
            kl1.a$i r33 = new kl1.a$i
            r56 = 0
            r58 = 0
            r59 = 0
            r61 = 0
            r63 = 15
            r64 = 0
            r55 = r33
            r55.<init>(r56, r58, r59, r61, r63, r64)
            kl1.a$e r7 = new kl1.a$e
            r10 = 0
            r11 = 1
            r12 = 0
            r7.<init>(r12, r11, r10)
            r35 = 30
            r36 = 0
            r26 = r6
            r34 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "create new config:"
            r1.append(r7)
            java.lang.String r7 = r6.f31351a
            r1.append(r7)
            r7 = 33
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x0b0b
        L_0x0af0:
            r7 = 33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "create config,but exist cache config:"
            r1.append(r10)
            java.lang.String r10 = r6.f31351a
            r1.append(r10)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x0b0b:
            kl1.a$e r1 = r6.f31358h
            r1.f31366a = r5
            if (r4 == 0) goto L_0x0c42
            r6.f31352b = r3
            kl1.a$b r1 = kl1.C10289a.C10291b.H_JOIN
            r6.f31353c = r1
            java.lang.String r1 = "createConfig level:"
            r4 = 70
            r7 = 50
            r10 = 60
            if (r5 < r7) goto L_0x0bb7
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Integer, android.graphics.Bitmap> r11 = kl1.C10289a.f31348j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Object r12 = r11.get(r12)
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L_0x0b30
            goto L_0x0b90
        L_0x0b30:
            if (r7 > r5) goto L_0x0b36
            if (r5 >= r10) goto L_0x0b36
            r7 = 1
            goto L_0x0b37
        L_0x0b36:
            r7 = 0
        L_0x0b37:
            if (r7 == 0) goto L_0x0b4e
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131233463(0x7f080ab7, float:1.8083064E38)
            r13 = 0
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12, r13)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r7)
            goto L_0x0b86
        L_0x0b4e:
            if (r10 > r5) goto L_0x0b54
            if (r5 >= r4) goto L_0x0b54
            r7 = 1
            goto L_0x0b55
        L_0x0b54:
            r7 = 0
        L_0x0b55:
            if (r7 == 0) goto L_0x0b6e
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131233464(0x7f080ab8, float:1.8083066E38)
            r13 = 0
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12, r13)
            android.graphics.Bitmap r16 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r7)
            r7 = r16
            goto L_0x0b86
        L_0x0b6e:
            r13 = 0
            if (r5 < r4) goto L_0x0b85
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131233465(0x7f080ab9, float:1.8083068E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12, r13)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r7)
            goto L_0x0b86
        L_0x0b85:
            r7 = 0
        L_0x0b86:
            if (r7 == 0) goto L_0x0b8f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11.put(r12, r7)
        L_0x0b8f:
            r12 = r7
        L_0x0b90:
            if (r12 == 0) goto L_0x0ba0
            kl1.a$h r7 = r6.f31356f
            r11 = 1
            r7.f31379f = r11
            kl1.a$f r11 = r7.f31383j
            r11.f31368b = r12
            long r11 = r11.f31367a
            r7.f31385l = r11
            goto L_0x0bb7
        L_0x0ba0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r5)
            java.lang.String r11 = ",but flashLightBitmap is null!"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
        L_0x0bb7:
            if (r5 < r10) goto L_0x0c5e
            if (r2 == 0) goto L_0x0c5e
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Integer, org.libpag.PAGImage> r2 = kl1.C10289a.f31349k
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r2.get(r7)
            org.libpag.PAGImage r7 = (org.libpag.PAGImage) r7
            if (r7 == 0) goto L_0x0bca
            goto L_0x0c1e
        L_0x0bca:
            if (r10 > r5) goto L_0x0bd1
            if (r5 >= r4) goto L_0x0bd1
            r25 = 1
            goto L_0x0bd3
        L_0x0bd1:
            r25 = 0
        L_0x0bd3:
            java.lang.String r7 = "#FFE58F"
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r25 == 0) goto L_0x0bf5
            android.content.res.Resources r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r11 = 2131756575(0x7f10061f, float:1.9144061E38)
            android.graphics.drawable.Drawable r4 = hi3.C87515a.m108835e(r4, r11, r10)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r4)
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createBitmapWithColor(r4, r7)
            org.libpag.PAGImage r4 = org.libpag.PAGImage.FromBitmap(r4)
            goto L_0x0c14
        L_0x0bf5:
            if (r5 < r4) goto L_0x0c13
            android.content.res.Resources r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r11 = 2131756576(0x7f100620, float:1.9144063E38)
            android.graphics.drawable.Drawable r4 = hi3.C87515a.m108835e(r4, r11, r10)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r4)
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createBitmapWithColor(r4, r7)
            org.libpag.PAGImage r4 = org.libpag.PAGImage.FromBitmap(r4)
            goto L_0x0c14
        L_0x0c13:
            r4 = 0
        L_0x0c14:
            if (r4 == 0) goto L_0x0c1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r2.put(r7, r4)
        L_0x0c1d:
            r7 = r4
        L_0x0c1e:
            if (r7 == 0) goto L_0x0c2a
            kl1.a$h r1 = r6.f31356f
            r2 = 1
            r1.f31380g = r2
            kl1.a$g r1 = r1.f31384k
            r1.f31373d = r7
            goto L_0x0c5e
        L_0x0c2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ",but floatCoverReplaceImg is null!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r1)
            goto L_0x0c5e
        L_0x0c42:
            if (r21 == 0) goto L_0x0c46
            r1 = r3
            goto L_0x0c48
        L_0x0c46:
            kl1.a$a r1 = kl1.C10289a.C10290a.REPLACE
        L_0x0c48:
            r6.f31352b = r1
            if (r5 < 0) goto L_0x0c4f
            kl1.a$b r1 = kl1.C10289a.C10291b.NORMAL_JOIN
            goto L_0x0c51
        L_0x0c4f:
            kl1.a$b r1 = kl1.C10289a.C10291b.EXCEPT_JOIN
        L_0x0c51:
            r6.f31353c = r1
            kl1.a$i r1 = r6.f31357g
            if (r21 == 0) goto L_0x0c5a
            r4 = 2000(0x7d0, double:9.88E-321)
            goto L_0x0c5c
        L_0x0c5a:
            r4 = 1000(0x3e8, double:4.94E-321)
        L_0x0c5c:
            r1.f31389c = r4
        L_0x0c5e:
            kl1.q r1 = new kl1.q
            r1.<init>(r8)
            r0.getClass()
            kl1.a$a r2 = r6.f31352b
            if (r2 != r3) goto L_0x0c72
            kl1.o r2 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r2 = r2.f31488e
            r3 = 0
            r2.setAlpha(r3)
        L_0x0c72:
            kl1.o r2 = r0.f31408a
            qj1.e5 r7 = r2.f31485b
            r8 = 0
            r9 = 0
            kl1.i r10 = new kl1.i
            r2 = 0
            r10.<init>(r0, r6, r1, r2)
            r11 = 3
            r12 = 0
            a14.z1 r1 = nk1.C11207i.m11072h(r7, r8, r9, r10, r11, r12)
            r0.f31411d = r1
            r1 = r65
            goto L_0x0cef
        L_0x0c89:
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83692U()
            if (r0 == 0) goto L_0x0cca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "showNextBullet, bullet:"
            r0.append(r1)
            r1 = r65
            kl1.o r3 = r1.f31504d
            android.view.ViewGroup r3 = r3.f31484a
            int r3 = r3.hashCode()
            r0.append(r3)
            java.lang.String r3 = " source:"
            r0.append(r3)
            int r3 = r1.f31506f
            r0.append(r3)
            java.lang.String r3 = ", pushAnim:"
            r0.append(r3)
            boolean r3 = r1.f31505e
            r0.append(r3)
            java.lang.String r3 = " hide bullet!"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0ccc
        L_0x0cca:
            r1 = r65
        L_0x0ccc:
            kl1.o r0 = r1.f31504d
            r2 = 0
            r0.mo10636h(r2)
            kl1.o r0 = r1.f31504d
            android.view.ViewGroup r0 = r0.f31484a
            r2 = 4
            r0.setVisibility(r2)
            kl1.o r0 = r1.f31504d
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            r0.setVisibility(r2)
            boolean r0 = r1.f31505e
            if (r0 != 0) goto L_0x0cef
            kl1.o r0 = r1.f31504d
            kl1.d r0 = r0.mo10630b()
            r2 = 2
            r0.mo10613i(r2)
        L_0x0cef:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kl1.C10342r.invoke():java.lang.Object");
    }
}
