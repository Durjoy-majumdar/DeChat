package ej1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import bp3.C79758p;
import cj1.C0581o5;
import cj1.C0642y3;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import go3.C76003c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C98522w3;
import j20.C117292a;
import java.util.ArrayList;
import oa1.C117731d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50310lu0;
import te3.C52013xs0;
import te3.C64311db1;
import te3.m74;
import tf0.C13883o1;
import tf0.C64916p1;
import tf3.C101877q;
import up1.C37521f;
import yg1.C15999b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ej1.w */
public final class C7715w extends C15999b {

    /* renamed from: k */
    public static final C7718c f26137k = new C7718c((C8480h) null);

    /* renamed from: l */
    public static final C13601g<Integer> f26138l = C36568h.m40985a(C7717b.f26143d);

    /* renamed from: m */
    public static final C13601g<Integer> f26139m = C36568h.m40985a(C7716a.f26142d);

    /* renamed from: i */
    public final C45795b f26140i;

    /* renamed from: j */
    public final String f26141j = "CommentItemLocation";

    /* renamed from: ej1.w$a */
    public static final class C7716a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7716a f26142d = new C7716a();

        public C7716a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C74942w4.m89784a(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: ej1.w$b */
    public static final class C7717b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7717b f26143d = new C7717b();

        public C7717b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C74942w4.m89784a(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: ej1.w$c */
    public static final class C7718c {

        /* renamed from: ej1.w$c$a */
        public static final class C7719a extends ClickableSpan {

            /* renamed from: d */
            public final /* synthetic */ Context f26144d;

            /* renamed from: e */
            public final /* synthetic */ C50310lu0 f26145e;

            public C7719a(Context context, C50310lu0 lu02) {
                this.f26144d = context;
                this.f26145e = lu02;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
                C87412m.m108594g(view, "widget");
                C7715w.f26137k.mo8837b(this.f26144d, this.f26145e);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            }

            public void updateDrawState(TextPaint textPaint) {
                C87412m.m108594g(textPaint, "ds");
                textPaint.setColor(this.f26144d.getResources().getColor(C0966R.color.f3417s5));
                textPaint.setUnderlineText(false);
                textPaint.clearShadowLayer();
            }
        }

        /* renamed from: ej1.w$c$b */
        public static final class C7720b extends ClickableSpan {

            /* renamed from: d */
            public final /* synthetic */ Context f26146d;

            /* renamed from: e */
            public final /* synthetic */ C50310lu0 f26147e;

            public C7720b(Context context, C50310lu0 lu02) {
                this.f26146d = context;
                this.f26147e = lu02;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
                C87412m.m108594g(view, "widget");
                C7715w.f26137k.mo8837b(this.f26146d, this.f26147e);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            }

            public void updateDrawState(TextPaint textPaint) {
                C87412m.m108594g(textPaint, "ds");
                textPaint.setColor(this.f26146d.getResources().getColor(C0966R.color.f3417s5));
                textPaint.setUnderlineText(false);
                textPaint.clearShadowLayer();
            }
        }

        public C7718c(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rx3.C13605o<java.lang.CharSequence, java.lang.String, java.lang.String> mo8836a(android.content.Context r18, boolean r19, cj1.C0581o5 r20, te3.C50310lu0 r21, java.lang.String r22, boolean r23, android.text.TextPaint r24) {
            /*
                r17 = this;
                r7 = r18
                r8 = r21
                r9 = r22
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "msg"
                r10 = r20
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "payload"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "city"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r0 = "paint"
                r2 = r24
                gy3.C87412m.m108594g(r2, r0)
                ok1.e r11 = ok1.C62042e.f176370a
                java.lang.String r12 = r20.mo571e()
                java.lang.String r13 = r20.mo573g()
                r14 = 0
                r15 = 4
                r16 = 0
                java.lang.String r0 = ok1.C62042e.m72808l0(r11, r12, r13, r14, r15, r16)
                r11 = 1
                r12 = 0
                if (r19 == 0) goto L_0x0068
                c50.b r1 = c50.C54655b.f153178f1
                if (r1 == 0) goto L_0x003f
                r1 = 1
                goto L_0x0040
            L_0x003f:
                r1 = 0
            L_0x0040:
                if (r1 != 0) goto L_0x004e
                i50.a r1 = i50.C60251a.f171781k1
                if (r1 == 0) goto L_0x0048
                r1 = 1
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                if (r1 == 0) goto L_0x004c
                goto L_0x004e
            L_0x004c:
                r1 = 0
                goto L_0x004f
            L_0x004e:
                r1 = 1
            L_0x004f:
                if (r1 != 0) goto L_0x0068
                te3.hx0 r1 = r20.mo579i()
                if (r1 == 0) goto L_0x005e
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
                if (r1 == 0) goto L_0x005e
                java.lang.String r1 = r1.username
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                java.lang.String r0 = er1.C7878t0.m8042k(r1, r0)
                java.lang.String r1 = "makeAnonymousNameIfIsMyS…ickname\n                )"
                gy3.C87412m.m108593f(r0, r1)
            L_0x0068:
                r3 = r0
                java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                tf0.p1 r0 = (tf0.C64916p1) r0
                r4 = 0
                r5 = 8
                r6 = 0
                r1 = r18
                r2 = r24
                java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76441h(r0, r1, r2, r3, r4, r5, r6)
                te3.hx0 r1 = r20.mo579i()
                if (r1 == 0) goto L_0x008f
                int r1 = r1.f134926n
                r2 = 3
                if (r1 != r2) goto L_0x008f
                r1 = 1
                goto L_0x0090
            L_0x008f:
                r1 = 0
            L_0x0090:
                if (r1 == 0) goto L_0x00a7
                if (r19 != 0) goto L_0x00a7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r2 = " "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x00a8
            L_0x00a7:
                r1 = r0
            L_0x00a8:
                r2 = 2131832002(0x7f112cc2, float:1.9297046E38)
                java.lang.Object[] r3 = new java.lang.Object[r11]
                r3[r12] = r1
                java.lang.String r1 = r7.getString(r2, r3)
                java.lang.String r2 = "context.getString(\n     …serNickName\n            )"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 2131827224(0x7f111a18, float:1.9287355E38)
                java.lang.Object[] r3 = new java.lang.Object[r11]
                r3[r12] = r9
                java.lang.String r2 = r7.getString(r2, r3)
                java.lang.String r3 = "context.getString(com.te…the_specified_city, city)"
                gy3.C87412m.m108593f(r2, r3)
                if (r23 == 0) goto L_0x00d0
                java.lang.String r2 = r8.f137643e
                if (r2 != 0) goto L_0x00d0
                java.lang.String r2 = ""
            L_0x00d0:
                rx3.o r3 = new rx3.o
                r3.<init>(r0, r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ej1.C7715w.C7718c.mo8836a(android.content.Context, boolean, cj1.o5, te3.lu0, java.lang.String, boolean, android.text.TextPaint):rx3.o");
        }

        /* renamed from: b */
        public final void mo8837b(Context context, C50310lu0 lu02) {
            String str;
            Class cls = C13883o1.class;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(lu02, "payload");
            Intent intent = new Intent();
            m74 m74 = new m74();
            C64311db1 db12 = lu02.f137642d;
            float f = 0.0f;
            m74.f184220e = db12 != null ? db12.f182662e : 0.0f;
            if (db12 != null) {
                f = db12.f182661d;
            }
            m74.f184219d = f;
            m74.f184221f = db12 != null ? db12.f182663f : null;
            intent.putExtra("key_location", m74.toByteArray());
            intent.putExtra("key_from_type", C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER);
            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
            if (gr02 != null) {
                intent.putExtra("key_from_scene", gr02.mo12864t3());
                intent.putExtra("key_context_id", gr02.mo12866v3());
            }
            C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(C98522w3.class)).mo3991CD(), 8);
            C101877q qVar = new C101877q();
            boolean z = false;
            if (C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1) {
                C64311db1 db13 = lu02.f137642d;
                if (!(db13 == null || (str = db13.f182666i) == null || !C112551y.m153819s(str, "foursquare_", false))) {
                    z = true;
                }
                if (!z) {
                    C37521f.f99374d.getClass();
                    if (C37521f.f99576z4.mo60266n().intValue() != 0) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                        C13883o1.C13884a.m13253e((C13883o1) c, context, intent, m74, 0, 8, (Object) null);
                        return;
                    }
                }
            }
            ((C13883o1) C86312j.m106911c(cls)).I00(context, intent);
        }

        /* renamed from: c */
        public final void mo8838c(Context context, C50310lu0 lu02, C75375u uVar, boolean z, String str) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(lu02, "payload");
            C87412m.m108594g(uVar, "finallyUserMessage");
            C87412m.m108594g(str, "city");
            int E = C112550d0.m153769E(uVar, str, 0, false, 6, (Object) null);
            if (E >= 0 && str.length() + E <= uVar.length()) {
                uVar.mo105705b(new C7719a(context, lu02), E, str.length() + E, 33);
            }
            if (!z) {
                Drawable drawable = context.getResources().getDrawable(C0966R.raw.icons_filled_location_blue);
                C74933u4.m89769f(drawable, context.getResources().getColor(C0966R.color.f3418s6));
                drawable.setBounds(0, 0, ((Number) ((C36570n) C7715w.f26138l).getValue()).intValue(), ((Number) ((C36570n) C7715w.f26139m).getValue()).intValue());
                uVar.mo105705b(new C76003c(drawable, 1), uVar.length() - 1, uVar.length(), 33);
                uVar.mo105705b(new C7720b(context, lu02), uVar.length() - 1, uVar.length(), 33);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7715w(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26140i = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8798b(android.content.Context r27, qk1.C12806i0.C12807a r28, cj1.C0581o5 r29, int r30) {
        /*
            r26 = this;
            r0 = r26
            r9 = r27
            r10 = r28
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "msg"
            r11 = r29
            gy3.C87412m.m108594g(r11, r1)
            super.mo8798b(r27, r28, r29, r30)
            fj1.b r1 = r0.f26140i
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75998e3()
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0046
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 != 0) goto L_0x0041
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r1 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r1 = 0
            goto L_0x0042
        L_0x0041:
            r1 = 1
        L_0x0042:
            if (r1 != 0) goto L_0x0046
            r14 = 1
            goto L_0x0047
        L_0x0046:
            r14 = 0
        L_0x0047:
            java.lang.Object r1 = r29.mo563q()
            boolean r2 = r1 instanceof te3.C50310lu0
            if (r2 == 0) goto L_0x0053
            te3.lu0 r1 = (te3.C50310lu0) r1
            r8 = r1
            goto L_0x0054
        L_0x0053:
            r8 = 0
        L_0x0054:
            if (r8 != 0) goto L_0x005f
            java.lang.String r1 = r0.f26141j
            java.lang.String r2 = "[onBindPoiMsg]: payload is not FinderLiveAppMsgLocationInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x01e5
        L_0x005f:
            te3.db1 r1 = r8.f137642d
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r1.f182663f
            r7 = r1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 == 0) goto L_0x0073
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r1 = 0
            goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = r0.f26141j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onBindPoiMsg]: city is null or empty:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x01e5
        L_0x008e:
            te3.hx0 r1 = r29.mo579i()
            if (r1 == 0) goto L_0x0099
            java.util.LinkedList<te3.aw0> r1 = r1.f134930r
            r17 = r1
            goto L_0x009b
        L_0x0099:
            r17 = 0
        L_0x009b:
            if (r17 == 0) goto L_0x00a2
            int r1 = r17.size()
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            if (r1 <= 0) goto L_0x00c4
            wk1.n r16 = wk1.C15440n.f41895a
            int[] r1 = wk1.C15440n.f41914t
            r2 = 6
            int[] r18 = sx3.C110821n.m150971r(r1, r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r10.f36658A
            r19 = 0
            r20 = 0
            r21 = 4
            r23 = 0
            r24 = 76
            r25 = 0
            r22 = r1
            java.util.List r1 = wk1.C15440n.m14441q(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = r1
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            java.lang.String r1 = r8.f137643e
            if (r1 == 0) goto L_0x00d2
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r1 = 0
            goto L_0x00d3
        L_0x00d2:
            r1 = 1
        L_0x00d3:
            r16 = r1 ^ 1
            ej1.w$c r1 = f26137k
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r10.f36658A
            android.text.TextPaint r5 = r2.getPaint()
            java.lang.String r2 = "holder.contentTv.paint"
            gy3.C87412m.m108593f(r5, r2)
            r2 = r27
            r3 = r14
            r4 = r29
            r17 = r5
            r5 = r8
            r15 = r6
            r6 = r7
            r18 = r7
            r7 = r16
            r19 = r8
            r8 = r17
            rx3.o r1 = r1.mo8836a(r2, r3, r4, r5, r6, r7, r8)
            A r2 = r1.f38557d
            r7 = r2
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            B r2 = r1.f38558e
            java.lang.String r2 = (java.lang.String) r2
            C r1 = r1.f38559f
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r10.f36658A
            r4 = 2131302534(0x7f091886, float:1.8223157E38)
            r3.setTag(r4, r1)
            java.lang.String r3 = ""
            java.lang.String r1 = r0.mo14623a(r3, r15, r2, r1)
            de3.u r8 = new de3.u
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            r4 = 0
            android.text.SpannableString r1 = r3.Te0(r9, r1, r4)
            r8.<init>((android.text.SpannableString) r1)
            r6 = 33
            if (r15 == 0) goto L_0x0143
            java.util.Iterator r1 = r15.iterator()
            r3 = 0
        L_0x012e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0141
            java.lang.Object r4 = r1.next()
            android.text.style.ImageSpan r4 = (android.text.style.ImageSpan) r4
            int r5 = r3 + 1
            r8.mo105705b(r4, r3, r5, r6)
            r3 = r5
            goto L_0x012e
        L_0x0141:
            r15 = r3
            goto L_0x0144
        L_0x0143:
            r15 = 0
        L_0x0144:
            android.text.style.ForegroundColorSpan r1 = r0.f43053f
            int r2 = r2.length()
            int r2 = r2 + r15
            r8.mo105705b(r1, r15, r2, r6)
            ej1.w$c r1 = f26137k
            r2 = r27
            r3 = r19
            r4 = r8
            r5 = r16
            r6 = r18
            r1.mo8838c(r2, r3, r4, r5, r6)
            java.lang.String r1 = r29.mo571e()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85817T4(r1)
            if (r1 == 0) goto L_0x01a6
            if (r14 != 0) goto L_0x01a6
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r2 = r0.f43048a
            te3.hx0 r3 = r29.mo579i()
            if (r3 == 0) goto L_0x0175
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            goto L_0x0176
        L_0x0175:
            r3 = 0
        L_0x0176:
            boolean r1 = r1.mo87087i1(r2, r3)
            if (r1 != 0) goto L_0x01a6
            rx3.g r1 = r0.f43054g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            go3.c r1 = (go3.C76003c) r1
            java.lang.String r2 = r7.toString()
            int r2 = z04.C112550d0.m153766B(r8, r2, r13, r13)
            int r3 = r7.length()
            int r2 = r2 + r3
            java.lang.String r3 = r7.toString()
            int r3 = z04.C112550d0.m153766B(r8, r3, r13, r13)
            int r4 = r7.length()
            int r3 = r3 + r4
            int r3 = r3 + r12
            r4 = 33
            r8.mo105705b(r1, r2, r3, r4)
        L_0x01a6:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r10.f36658A
            r1.mo104279b(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r10.f36658A
            int r2 = r0.f43055h
            float r2 = (float) r2
            r1.setTextSize(r2)
            android.view.View r1 = r10.f36659B
            android.content.res.Resources r2 = r27.getResources()
            r3 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setBackground(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r10.f36658A
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            if (r15 != 0) goto L_0x01d6
            int r13 = r26.mo14628i()
        L_0x01d6:
            int r2 = r1.getPaddingTop()
            int r3 = r1.getPaddingRight()
            int r4 = r1.getPaddingBottom()
            r1.setPadding(r13, r2, r3, r4)
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7715w.mo8798b(android.content.Context, qk1.i0$a, cj1.o5, int):void");
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0642y3(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20035;
    }
}
