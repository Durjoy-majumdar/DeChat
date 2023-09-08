package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0782u0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: ve1.r4 */
public final class C14620r4 extends C60896i<C0782u0> {

    /* renamed from: e */
    public final String f40460e = "FinderLivePurchaseListConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aje;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r25, jq3.C9493c r26, int r27, int r28, boolean r29, java.util.List r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            cm1.u0 r2 = (cm1.C0782u0) r2
            java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = r0.f40460e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "bind view "
            r6.append(r7)
            sk1.a r7 = sk1.C63947a.f181274a
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r2.f1833d
            r9 = r27
            java.lang.String r7 = r7.mo88735u(r8, r9)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r5 = 2131312307(0x7f093eb3, float:1.8242979E38)
            android.view.View r5 = r1.mo85812D(r5)
            java.lang.String r6 = r2.mo725a()
            if (r5 == 0) goto L_0x006f
            com.tencent.mm.ui.widget.MMRoundCornerImageView r5 = (com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView) r5
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r8 = r7.mo62446e(r4)
            bl3.c r8 = r8.mo62447c(r3)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11870V()
            pl1.n0 r9 = new pl1.n0
            up1.y r10 = up1.C27696y.THUMB_IMAGE
            r9.<init>(r6, r10)
            pl1.e0$a r6 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r7 = r7.mo62446e(r4)
            bl3.c r7 = r7.mo62447c(r3)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r6 = r7.mo11867O2(r6)
            r8.mo85957c(r9, r5, r6)
        L_0x006f:
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r4)
            bl3.c r6 = r6.mo62447c(r3)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r7 = new pl1.f
            fe1.d$b r8 = fe1.C58961d.f168673a
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r2.f1833d
            java.lang.String r9 = r9.username
            fe1.q r9 = r8.mo84155b(r9)
            java.lang.String r10 = ""
            r11 = 0
            if (r9 == 0) goto L_0x0095
            java.lang.String r9 = r9.mo84172g0()
            goto L_0x00a2
        L_0x0095:
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r2.f1833d
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.contact
            if (r9 == 0) goto L_0x009e
            java.lang.String r9 = r9.headUrl
            goto L_0x009f
        L_0x009e:
            r9 = r11
        L_0x009f:
            if (r9 != 0) goto L_0x00a2
            r9 = r10
        L_0x00a2:
            r12 = 2
            r7.<init>(r9, r11, r12, r11)
            r9 = 2131312311(0x7f093eb7, float:1.8242987E38)
            android.view.View r9 = r1.mo85812D(r9)
            java.lang.String r13 = "holder.getView<ImageView>(R.id.replay_head_img)"
            gy3.C87412m.m108593f(r9, r13)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            pl1.e0$a r13 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r4 = r5.mo62446e(r4)
            bl3.c r3 = r4.mo62447c(r3)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r13)
            r6.mo85957c(r7, r9, r3)
            r3 = 2131312331(0x7f093ecb, float:1.8243028E38)
            android.view.View r4 = r1.mo85812D(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r2.f1833d
            java.lang.String r5 = r5.username
            fe1.q r5 = r8.mo84155b(r5)
            if (r5 == 0) goto L_0x00df
            java.lang.String r5 = r5.mo84196w1()
            goto L_0x00ec
        L_0x00df:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r2.f1833d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
            if (r5 == 0) goto L_0x00e8
            java.lang.String r5 = r5.nickname
            goto L_0x00e9
        L_0x00e8:
            r5 = r11
        L_0x00e9:
            if (r5 != 0) goto L_0x00ec
            r5 = r10
        L_0x00ec:
            r4.setText(r5)
            r4 = 2131312310(0x7f093eb6, float:1.8242985E38)
            android.view.View r5 = r1.mo85812D(r4)
            java.lang.String r6 = "holder.getView<ImageView>(R.id.replay_head_icon)"
            gy3.C87412m.m108593f(r5, r6)
            r14 = r5
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r2.f1833d
            java.lang.String r5 = r5.username
            fe1.q r5 = r8.mo84155b(r5)
            if (r5 == 0) goto L_0x010c
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r5 = r5.field_authInfo
            if (r5 != 0) goto L_0x0114
        L_0x010c:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r2.f1833d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
            if (r5 == 0) goto L_0x0116
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r5 = r5.authInfo
        L_0x0114:
            r15 = r5
            goto L_0x0117
        L_0x0116:
            r15 = r11
        L_0x0117:
            r5 = 8
            r6 = 0
            if (r15 == 0) goto L_0x0141
            int r7 = r15.authIconType
            if (r7 <= 0) goto L_0x013d
            r14.setVisibility(r6)
            java.lang.Class<tf0.p1> r7 = tf0.C64916p1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r7, r8)
            r13 = r7
            tf0.p1 r13 = (tf0.C64916p1) r13
            r16 = 0
            r17 = 0
            r18 = 8
            r19 = 0
            tf0.C64916p1.C64917a.m76444k(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0144
        L_0x013d:
            r14.setVisibility(r5)
            goto L_0x0144
        L_0x0141:
            r14.setVisibility(r5)
        L_0x0144:
            r7 = 2131312324(0x7f093ec4, float:1.8243013E38)
            android.view.View r8 = r1.mo85812D(r7)
            java.lang.String r9 = "holder.getView<TextView>(R.id.replay_status)"
            gy3.C87412m.m108593f(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r2.f1833d
            te3.c21 r9 = r9.liveInfo
            if (r9 == 0) goto L_0x015b
            java.lang.String r9 = r9.f182373R0
            goto L_0x015c
        L_0x015b:
            r9 = r11
        L_0x015c:
            if (r9 == 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r9 = r10
        L_0x0160:
            r8.setText(r9)
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r2.f1833d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
            if (r8 == 0) goto L_0x016c
            java.lang.String r8 = r8.description
            goto L_0x016d
        L_0x016c:
            r8 = r11
        L_0x016d:
            if (r8 != 0) goto L_0x0170
            r8 = r10
        L_0x0170:
            int r9 = r8.length()
            r13 = 1
            if (r9 != 0) goto L_0x0179
            r9 = 1
            goto L_0x017a
        L_0x0179:
            r9 = 0
        L_0x017a:
            r14 = 2131312309(0x7f093eb5, float:1.8242983E38)
            if (r9 == 0) goto L_0x0192
            android.view.View r8 = r1.mo85812D(r14)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setVisibility(r5)
            android.view.View r5 = r1.mo85812D(r14)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r10)
            goto L_0x01a4
        L_0x0192:
            android.view.View r5 = r1.mo85812D(r14)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setVisibility(r6)
            android.view.View r5 = r1.mo85812D(r14)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r8)
        L_0x01a4:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f1833d
            te3.c21 r2 = r2.liveInfo
            r5 = 2131312315(0x7f093ebb, float:1.8242995E38)
            if (r2 == 0) goto L_0x03ca
            int r2 = r2.f182396h
            android.view.View r8 = r1.mo85812D(r5)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            er1.w3 r11 = er1.C58784w3.f168295a
            r11.getClass()
            long r14 = (long) r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r2
            long r14 = r14 * r3
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = er1.C7878t0.f26492a
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r11 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x01d5
            r2 = r10
            goto L_0x03c5
        L_0x01d5:
            long r16 = r2.getTimeInMillis()
            java.util.HashMap<java.lang.Long, java.lang.Long> r11 = er1.C7878t0.f26493b
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            boolean r7 = r11.containsKey(r7)
            r18 = 60000(0xea60, double:2.9644E-319)
            if (r7 == 0) goto L_0x0221
            java.util.HashMap<java.lang.Long, java.lang.Long> r7 = er1.C7878t0.f26493b
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            java.lang.Object r7 = r7.get(r11)
            java.lang.Long r7 = (java.lang.Long) r7
            long r20 = r7.longValue()
            long r20 = r16 - r20
            int r7 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0218
            java.util.HashMap<java.lang.Long, java.lang.String> r7 = er1.C7878t0.f26494c
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            boolean r7 = r7.containsKey(r11)
            if (r7 == 0) goto L_0x0221
            java.util.HashMap<java.lang.Long, java.lang.String> r2 = er1.C7878t0.f26494c
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x03c5
        L_0x0218:
            java.util.HashMap<java.lang.Long, java.lang.Long> r7 = er1.C7878t0.f26493b
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r7.remove(r11)
        L_0x0221:
            long r20 = r16 - r14
            long r3 = r20 / r3
            r22 = 0
            int r7 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r7 != 0) goto L_0x025c
            long r2 = r20 / r18
            int r3 = (int) r2
            if (r3 >= r13) goto L_0x0231
            r3 = 1
        L_0x0231:
            android.content.res.Resources r2 = r9.getResources()
            r4 = 2131830019(0x7f112503, float:1.9293024E38)
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r6] = r3
            java.lang.String r2 = r2.getString(r4, r7)
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r3.put(r4, r6)
            goto L_0x03c5
        L_0x025c:
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar
            int r11 = r2.get(r13)
            int r12 = r2.get(r12)
            r5 = 5
            int r5 = r2.get(r5)
            r7.<init>(r11, r12, r5)
            long r11 = r7.getTimeInMillis()
            long r11 = r14 - r11
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x02ae
            int r5 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r5 > 0) goto L_0x02ae
            int r2 = (int) r3
            if (r2 >= r13) goto L_0x0283
            r2 = 1
        L_0x0283:
            android.content.res.Resources r3 = r9.getResources()
            r4 = 2131830014(0x7f1124fe, float:1.9293013E38)
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r6] = r2
            java.lang.String r2 = r3.getString(r4, r5)
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3.put(r4, r5)
            goto L_0x03c5
        L_0x02ae:
            long r3 = r7.getTimeInMillis()
            long r3 = r14 - r3
            long r3 = r3 + r18
            r11 = 1000(0x3e8, double:4.94E-321)
            r5 = 2131830343(0x7f112647, float:1.929368E38)
            java.lang.String r6 = " "
            int r20 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r20 <= 0) goto L_0x0300
            int r20 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r20 > 0) goto L_0x0300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131830369(0x7f112661, float:1.9293733E38)
            java.lang.String r3 = r9.getString(r3)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = r9.getString(r5)
            long r4 = r14 / r11
            java.lang.String r3 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3.put(r4, r5)
            goto L_0x03c5
        L_0x0300:
            long r3 = r7.getTimeInMillis()
            r20 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r3 = r3 - r20
            long r3 = r14 - r3
            int r7 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r7 < 0) goto L_0x034d
            int r7 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x034d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131830352(0x7f112650, float:1.9293699E38)
            java.lang.String r3 = r9.getString(r3)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = r9.getString(r5)
            long r4 = r14 / r11
            java.lang.String r3 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3.put(r4, r5)
            goto L_0x03c5
        L_0x034d:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar
            r3.<init>()
            r3.setTimeInMillis(r14)
            int r2 = r2.get(r13)
            int r3 = r3.get(r13)
            if (r2 != r3) goto L_0x0395
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r3 = 2131830313(0x7f112629, float:1.929362E38)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r5 = 0
            r4[r5] = r6
            java.lang.String r3 = r9.getString(r3, r4)
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3.put(r4, r5)
            goto L_0x03c5
        L_0x0395:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r3 = 2131830331(0x7f11263b, float:1.9293656E38)
            java.lang.String r3 = r9.getString(r3)
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap<java.lang.Long, java.lang.String> r3 = er1.C7878t0.f26494c
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r3.put(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.Long> r3 = er1.C7878t0.f26493b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3.put(r4, r5)
        L_0x03c5:
            r8.setText(r2)
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x03ca:
            if (r11 != 0) goto L_0x03d8
            r2 = 2131312315(0x7f093ebb, float:1.8242995E38)
            android.view.View r2 = r1.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r10)
        L_0x03d8:
            r2 = 2131312331(0x7f093ecb, float:1.8243028E38)
            android.view.View r2 = r1.mo85812D(r2)
            java.lang.String r3 = "holder.getView(R.id.replay_user_nickname)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131312310(0x7f093eb6, float:1.8242985E38)
            android.view.View r3 = r1.mo85812D(r3)
            java.lang.String r4 = "holder.getView(R.id.replay_head_icon)"
            gy3.C87412m.m108593f(r3, r4)
            r4 = 2131312324(0x7f093ec4, float:1.8243013E38)
            android.view.View r1 = r1.mo85812D(r4)
            java.lang.String r4 = "holder.getView(R.id.replay_status)"
            gy3.C87412m.m108593f(r1, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewTreeObserver r4 = r2.getViewTreeObserver()
            ve1.q4 r5 = new ve1.q4
            r5.<init>(r2, r3, r0, r1)
            r4.addOnPreDrawListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14620r4.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.ipg)).getPaint(), 0.8f);
    }
}
