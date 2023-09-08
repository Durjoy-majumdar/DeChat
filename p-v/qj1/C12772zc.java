package qj1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import ks3.C10409j;
import l31.C61212e;
import o40.C61926c;
import org.libpag.PAGView;
import pg1.C11935b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: qj1.zc */
public final class C12772zc extends C62660c {

    /* renamed from: A */
    public final String f36574A = "live_gift_bubble_flip_type";

    /* renamed from: p */
    public final ViewGroup f36575p;

    /* renamed from: q */
    public final String f36576q = "FinderLiveOneClickGiftPlugin";

    /* renamed from: r */
    public final C13601g f36577r = C36568h.m40985a(new C12783j(this));

    /* renamed from: s */
    public final C13601g f36578s = C36568h.m40985a(new C12782i(this));

    /* renamed from: t */
    public final C13601g f36579t = C36568h.m40985a(new C12778f(this));

    /* renamed from: u */
    public PAGView f36580u;

    /* renamed from: v */
    public final C13601g f36581v = C36568h.m40985a(new C12777e(this));

    /* renamed from: w */
    public final C13601g f36582w = C36568h.m40985a(new C12776d(this));

    /* renamed from: x */
    public C8916d f36583x;

    /* renamed from: y */
    public final String f36584y = "live_gift_bubble_gift_id";

    /* renamed from: z */
    public final String f36585z = "live_gift_bubble_text";

    /* renamed from: qj1.zc$a */
    public static final class C12773a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36586d;

        public C12773a(C12772zc zcVar) {
            this.f36586d = zcVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f36586d.mo12318a1();
            boolean z = motionEvent.getAction() != 2;
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: qj1.zc$b */
    public static final class C12774b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36587d;

        /* renamed from: e */
        public final /* synthetic */ C58124b f36588e;

        /* renamed from: qj1.zc$b$a */
        public static final class C12775a extends C87413o implements C32227p<Long, Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12772zc f36589d;

            /* renamed from: e */
            public final /* synthetic */ C58124b f36590e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12775a(C12772zc zcVar, C58124b bVar) {
                super(2);
                this.f36589d = zcVar;
                this.f36590e = bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                ((Number) obj2).longValue();
                String str = this.f36589d.f36576q;
                Log.m105924i(str, "getWeCoinBalance: " + longValue);
                if (longValue >= 0) {
                    ((C54991o) this.f36589d.mo87696x0(C54991o.class)).mo76019q4(longValue);
                    C8916d dVar = this.f36589d.f36583x;
                    if (dVar != null) {
                        C58124b bVar = this.f36590e;
                        C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_EVENT_GIFT_SHOW_SEND_BTN;
                        Bundle bundle = new Bundle();
                        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", dVar.field_rewardProductId);
                        bundle.putBoolean("PARAM_FINDER_LIVE_SEND_GIFT_FROM_ONECLICK", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar.statusChange(bVar2, bundle);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C12774b(C12772zc zcVar, C58124b bVar) {
            this.f36587d = zcVar;
            this.f36588e = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54795n5 D0 = this.f36587d.mo14476D0();
            if (D0 != null) {
                D0.mo75729d(System.currentTimeMillis(), new C12775a(this.f36587d, this.f36588e));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.zc$d */
    public static final class C12776d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12776d(C12772zc zcVar) {
            super(0);
            this.f36591d = zcVar;
        }

        public Object invoke() {
            return this.f36591d.f36575p.findViewById(C0966R.C0970id.nm4);
        }
    }

    /* renamed from: qj1.zc$e */
    public static final class C12777e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12777e(C12772zc zcVar) {
            super(0);
            this.f36592d = zcVar;
        }

        public Object invoke() {
            return this.f36592d.f36575p.findViewById(C0966R.C0970id.nm5);
        }
    }

    /* renamed from: qj1.zc$f */
    public static final class C12778f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12778f(C12772zc zcVar) {
            super(0);
            this.f36593d = zcVar;
        }

        public Object invoke() {
            return (ImageView) this.f36593d.f36575p.findViewById(C0966R.C0970id.nm_);
        }
    }

    /* renamed from: qj1.zc$g */
    public static final class C12779g<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36594d;

        public C12779g(C12772zc zcVar) {
            this.f36594d = zcVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:70:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                te3.r91 r1 = (te3.C51075r91) r1
                ok1.e r2 = ok1.C62042e.f176370a
                boolean r3 = r2.mo87027N0()
                if (r3 != 0) goto L_0x020d
                qj1.zc r3 = r0.f36594d
                fj1.b r3 = r3.mo87684A0()
                boolean r3 = r2.mo87067b1(r3)
                if (r3 == 0) goto L_0x020d
                qj1.zc r3 = r0.f36594d
                java.lang.String r4 = "it"
                gy3.C87412m.m108593f(r1, r4)
                java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
                java.lang.Class<pg1.b> r6 = pg1.C11935b.class
                java.lang.Class<l31.e> r7 = l31.C61212e.class
                java.lang.Class<qj1.e8> r8 = qj1.C12360e8.class
                qj1.c r8 = r3.mo87687E0(r8)
                qj1.e8 r8 = (qj1.C12360e8) r8
                r9 = 1
                r10 = 0
                if (r8 == 0) goto L_0x003d
                int r8 = r8.mo14483f0()
                if (r8 != 0) goto L_0x003d
                r8 = 1
                goto L_0x003e
            L_0x003d:
                r8 = 0
            L_0x003e:
                if (r8 == 0) goto L_0x0057
                java.lang.String r2 = r3.f36576q
                java.lang.String r4 = "receive onclick gift msg, but visitor sending Gift，so return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                androidx.lifecycle.i0 r2 = r3.mo87696x0(r6)
                pg1.b r2 = (pg1.C11935b) r2
                long r3 = r1.f140771d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r2.f34867g = r1
                goto L_0x0216
            L_0x0057:
                fj1.b r8 = r3.mo87684A0()
                boolean r2 = r2.mo87057Y0(r8)
                if (r2 == 0) goto L_0x0078
                java.lang.String r2 = r3.f36576q
                java.lang.String r4 = "receive onclick gift msg, but security forbid send gift，so return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                androidx.lifecycle.i0 r2 = r3.mo87696x0(r6)
                pg1.b r2 = (pg1.C11935b) r2
                long r3 = r1.f140771d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r2.f34867g = r1
                goto L_0x0216
            L_0x0078:
                java.lang.Class<qj1.dg> r2 = qj1.C62741dg.class
                qj1.c r2 = r3.mo87687E0(r2)
                qj1.dg r2 = (qj1.C62741dg) r2
                if (r2 == 0) goto L_0x0203
                il1.g8 r2 = r2.f178127v
                android.view.ViewGroup r2 = r2.f28427a
                if (r2 == 0) goto L_0x0203
                r11 = 2131303550(0x7f091c7e, float:1.8225218E38)
                android.view.View r2 = r2.findViewById(r11)
                if (r2 == 0) goto L_0x0203
                boolean r11 = r2.isShown()
                if (r11 == 0) goto L_0x0098
                goto L_0x0099
            L_0x0098:
                r2 = 0
            L_0x0099:
                if (r2 == 0) goto L_0x0203
                te3.p11 r11 = r1.f140772e
                if (r11 == 0) goto L_0x0203
                di3.d r12 = di3.C86312j.m106911c(r7)
                l31.e r12 = (l31.C61212e) r12
                android.view.View r13 = r3.mo12319b1()
                java.lang.String r14 = r3.f36584y
                r12.Nl0(r13, r14)
                di3.d r12 = di3.C86312j.m106911c(r7)
                l31.e r12 = (l31.C61212e) r12
                android.view.View r13 = r3.mo12319b1()
                java.lang.String r14 = r3.f36585z
                r12.Nl0(r13, r14)
                di3.d r12 = di3.C86312j.m106911c(r7)
                l31.e r12 = (l31.C61212e) r12
                android.view.View r13 = r3.mo12319b1()
                java.lang.String r14 = r3.f36574A
                r12.Nl0(r13, r14)
                di3.d r7 = di3.C86312j.m106911c(r7)
                l31.e r7 = (l31.C61212e) r7
                android.view.View r12 = r3.mo12319b1()
                r13 = 2
                rx3.l[] r13 = new rx3.C13604l[r13]
                java.lang.String r14 = r3.f36584y
                java.lang.String r15 = r11.f139507d
                java.lang.String r15 = java.lang.String.valueOf(r15)
                rx3.l r8 = new rx3.l
                r8.<init>(r14, r15)
                r13[r10] = r8
                java.lang.String r8 = r3.f36585z
                java.lang.String r14 = r1.f140773f
                java.lang.String r15 = ""
                if (r14 != 0) goto L_0x00f1
                r14 = r15
            L_0x00f1:
                rx3.l r10 = new rx3.l
                r10.<init>(r8, r14)
                r13[r9] = r10
                java.util.Map r8 = sx3.C90364q0.m113147f(r13)
                r7.mo86149PM(r12, r8)
                r3.mo12318a1()
                r3.mo12317Z0(r2)
                ig1.d$a r2 = ig1.C8916d.f28211b1
                ig1.d r2 = r2.mo9727a(r11)
                r7 = 0
                r3.mo10792g(r7)
                androidx.lifecycle.i0 r6 = r3.mo87696x0(r6)
                pg1.b r6 = (pg1.C11935b) r6
                long r7 = r1.f140771d
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.f34867g = r7
                rx3.g r6 = r3.f36577r
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                android.widget.TextView r6 = (android.widget.TextView) r6
                java.lang.String r1 = r1.f140773f
                if (r1 == 0) goto L_0x012c
                r15 = r1
            L_0x012c:
                r6.setText(r15)
                cj1.y1 r1 = cj1.C0639y1.f1510a
                java.lang.String r6 = r2.field_rewardProductId
                r7 = 0
                java.lang.String r1 = r1.mo616h(r6, r9, r7)
                if (r1 == 0) goto L_0x0143
                int r6 = r1.length()
                if (r6 != 0) goto L_0x0141
                goto L_0x0143
            L_0x0141:
                r6 = 0
                goto L_0x0144
            L_0x0143:
                r6 = 1
            L_0x0144:
                if (r6 != 0) goto L_0x014d
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
                if (r6 == 0) goto L_0x014d
                goto L_0x014e
            L_0x014d:
                r9 = 0
            L_0x014e:
                if (r9 == 0) goto L_0x0152
                r7 = r1
                goto L_0x0153
            L_0x0152:
                r7 = 0
            L_0x0153:
                r1 = 8
                if (r7 == 0) goto L_0x0196
                android.view.ViewGroup r6 = r3.f36575p
                r8 = 2131304080(0x7f091e90, float:1.8226292E38)
                android.view.View r6 = r6.findViewById(r8)
                org.libpag.PAGView r6 = (org.libpag.PAGView) r6
                r3.f36580u = r6
                if (r6 != 0) goto L_0x0167
                goto L_0x016e
            L_0x0167:
                org.libpag.PAGFile r7 = org.libpag.PAGFile.Load((java.lang.String) r7)
                r6.setComposition(r7)
            L_0x016e:
                org.libpag.PAGView r6 = r3.f36580u
                if (r6 == 0) goto L_0x0176
                r7 = -1
                r6.setRepeatCount(r7)
            L_0x0176:
                org.libpag.PAGView r6 = r3.f36580u
                if (r6 == 0) goto L_0x017d
                r6.play()
            L_0x017d:
                org.libpag.PAGView r6 = r3.f36580u
                if (r6 != 0) goto L_0x0182
                goto L_0x0186
            L_0x0182:
                r7 = 0
                r6.setVisibility(r7)
            L_0x0186:
                rx3.g r6 = r3.f36579t
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r6.setVisibility(r1)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                goto L_0x0197
            L_0x0196:
                r7 = 0
            L_0x0197:
                if (r7 != 0) goto L_0x01ea
                bl3.r r6 = bl3.C39818r.f106831a
                bl3.r$a r7 = r6.mo62446e(r5)
                bl3.c r7 = r7.mo62447c(r4)
                pl1.s0 r7 = (pl1.C11990s0) r7
                k60.d r7 = r7.mo11871f2()
                pl1.n0 r8 = new pl1.n0
                java.lang.String r9 = r2.field_thumbnailFileUrl
                up1.y r10 = up1.C27696y.THUMB_IMAGE
                r8.<init>(r9, r10)
                rx3.g r9 = r3.f36579t
                rx3.n r9 = (rx3.C36570n) r9
                java.lang.Object r9 = r9.getValue()
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                java.lang.String r10 = "giftImgView"
                gy3.C87412m.m108593f(r9, r10)
                pl1.e0$a r10 = pl1.C11978e0.C11979a.AVATAR
                bl3.r$a r5 = r6.mo62446e(r5)
                bl3.c r4 = r5.mo62447c(r4)
                pl1.s0 r4 = (pl1.C11990s0) r4
                n60.f r4 = r4.mo11867O2(r10)
                r7.mo85957c(r8, r9, r4)
                org.libpag.PAGView r4 = r3.f36580u
                if (r4 != 0) goto L_0x01d9
                goto L_0x01dc
            L_0x01d9:
                r4.setVisibility(r1)
            L_0x01dc:
                rx3.g r1 = r3.f36579t
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r4 = 0
                r1.setVisibility(r4)
            L_0x01ea:
                rx3.g r1 = r3.f36578s
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.widget.TextView r1 = (android.widget.TextView) r1
                float r4 = r2.field_price
                int r4 = (int) r4
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.setText(r4)
                r3.f36583x = r2
                rx3.b0 r7 = rx3.C13598b0.f38549a
                goto L_0x0204
            L_0x0203:
                r7 = 0
            L_0x0204:
                if (r7 != 0) goto L_0x0216
                r1 = 0
                r3.f36583x = r1
                r3.mo12318a1()
                goto L_0x0216
            L_0x020d:
                qj1.zc r1 = r0.f36594d
                java.lang.String r1 = r1.f36576q
                java.lang.String r2 = "receive onclick gift msg, but not allow"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x0216:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12772zc.C12779g.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: qj1.zc$h */
    public static final class C12780h<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36595d;

        /* renamed from: qj1.zc$h$a */
        public /* synthetic */ class C12781a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f36596a;

            static {
                int[] iArr = new int[C10409j.values().length];
                iArr[0] = 1;
                iArr[2] = 2;
                iArr[1] = 3;
                f36596a = iArr;
            }
        }

        public C12780h(C12772zc zcVar) {
            this.f36595d = zcVar;
        }

        public void onChanged(Object obj) {
            CharSequence charSequence;
            C10409j jVar = (C10409j) obj;
            Log.m105924i(this.f36595d.f36576q, "user send gift, dimiss");
            int i = jVar == null ? -1 : C12781a.f36596a[jVar.ordinal()];
            if (i == 1) {
                C61926c.m72668M(new C12248ad(this.f36595d));
            } else if ((i == 2 || i == 3) && this.f36595d.mo14483f0() == 0) {
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                View b1 = this.f36595d.mo12319b1();
                C13604l[] lVarArr = new C13604l[3];
                lVarArr[0] = new C13604l(this.f36595d.f36574A, 1);
                C12772zc zcVar = this.f36595d;
                String str = zcVar.f36584y;
                C8916d dVar = zcVar.f36583x;
                CharSequence charSequence2 = "";
                if (dVar == null || (charSequence = dVar.field_rewardProductId) == null) {
                    charSequence = charSequence2;
                }
                lVarArr[1] = new C13604l(str, charSequence);
                String str2 = zcVar.f36585z;
                CharSequence text = ((TextView) ((C36570n) zcVar.f36577r).getValue()).getText();
                if (text != null) {
                    charSequence2 = text;
                }
                lVarArr[2] = new C13604l(str2, charSequence2);
                eVar.mo86153W7("view_clk", b1, C90364q0.m113147f(lVarArr), 25561);
            }
        }
    }

    /* renamed from: qj1.zc$i */
    public static final class C12782i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12782i(C12772zc zcVar) {
            super(0);
            this.f36597d = zcVar;
        }

        public Object invoke() {
            return (TextView) this.f36597d.f36575p.findViewById(C0966R.C0970id.nm7);
        }
    }

    /* renamed from: qj1.zc$j */
    public static final class C12783j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C12772zc f36598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12783j(C12772zc zcVar) {
            super(0);
            this.f36598d = zcVar;
        }

        public Object invoke() {
            return (TextView) this.f36598d.f36575p.findViewById(C0966R.C0970id.nm8);
        }
    }

    /* renamed from: qj1.zc$c */
    public /* synthetic */ class C12784c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36599a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[118] = 1;
            f36599a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12772zc(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        Class cls = C61212e.class;
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36575p = viewGroup;
        viewGroup.setOnTouchListener(new C12773a(this));
        ((C61212e) C86312j.m106911c(cls)).o30(mo12319b1(), "live_gift_bubble");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(mo12319b1(), 32, 25561);
        mo12319b1().setOnClickListener(new C12774b(this, bVar));
    }

    /* JADX WARNING: type inference failed for: r8v19, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12317Z0(android.view.View r15) {
        /*
            r14 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r1 = r0.y
            int r0 = r0.x
            boolean r2 = r14.mo82893g0()
            if (r2 == 0) goto L_0x001b
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            boolean r3 = r14.mo82893g0()
            if (r3 == 0) goto L_0x002b
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r3 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = r1
            goto L_0x002c
        L_0x002b:
            r3 = r0
        L_0x002c:
            int[] r4 = o40.C61926c.m72690o(r15)
            r5 = 0
            r6 = r4[r5]
            int r7 = r15.getWidth()
            int r6 = r6 + r7
            r7 = 1
            r7 = r4[r7]
            android.view.ViewGroup r8 = r14.f36575p
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165279(0x7f07005f, float:1.794477E38)
            float r8 = r8.getDimension(r9)
            android.view.ViewGroup r9 = r14.f36575p
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r9 = r9.getDimension(r10)
            int r2 = r2 - r7
            float r2 = (float) r2
            float r2 = r2 - r8
            int r8 = r3 - r6
            float r8 = (float) r8
            android.view.ViewGroup r10 = r14.f36575p
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165363(0x7f0700b3, float:1.794494E38)
            float r10 = r10.getDimension(r11)
            float r8 = r8 - r10
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r9 = r8
        L_0x007b:
            android.view.ViewGroup r8 = r14.f36575p
            int r10 = r8.getPaddingLeft()
            android.view.ViewGroup r11 = r14.f36575p
            int r11 = r11.getPaddingTop()
            int r12 = (int) r9
            int r13 = (int) r2
            r8.setPadding(r10, r11, r12, r13)
            android.view.ViewGroup r8 = r14.f36575p
            boolean r10 = r8 instanceof android.widget.LinearLayout
            r11 = 0
            if (r10 == 0) goto L_0x0096
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            goto L_0x0097
        L_0x0096:
            r8 = r11
        L_0x0097:
            if (r8 != 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            r10 = 85
            r8.setGravity(r10)
        L_0x009f:
            float r3 = (float) r3
            float r3 = r3 - r9
            android.view.ViewGroup r8 = r14.f36575p
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r8 = r8.getDimension(r10)
            float r10 = (float) r6
            float r3 = r3 - r10
            int r10 = r15.getWidth()
            r12 = 2
            int r10 = r10 / r12
            float r10 = (float) r10
            float r12 = (float) r12
            float r8 = r8 / r12
            float r10 = r10 - r8
            float r3 = r3 + r10
            rx3.g r8 = r14.f36582w
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r10 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r10 == 0) goto L_0x00d4
            r11 = r8
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
        L_0x00d4:
            if (r11 == 0) goto L_0x00e6
            int r3 = (int) r3
            r11.rightMargin = r3
            rx3.g r3 = r14.f36582w
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setLayoutParams(r11)
        L_0x00e6:
            er1.j4 r3 = er1.C58739j4.f168176a
            boolean r3 = r3.mo83692U()
            if (r3 == 0) goto L_0x0144
            java.lang.String r3 = r14.f36576q
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "targetView = "
            r8.append(r10)
            r8.append(r15)
            java.lang.String r15 = ",targetViewLoc-x = "
            r8.append(r15)
            r15 = r4[r5]
            r8.append(r15)
            java.lang.String r15 = ", screenHeightHardWare = "
            r8.append(r15)
            r8.append(r1)
            java.lang.String r15 = ", screenWidthHardWare = "
            r8.append(r15)
            r8.append(r0)
            java.lang.String r15 = ", targetViewRight = "
            r8.append(r15)
            r8.append(r6)
            java.lang.String r15 = ", targetViewTop = "
            r8.append(r15)
            r8.append(r7)
            java.lang.String r15 = ", paddingBottom = "
            r8.append(r15)
            r8.append(r2)
            java.lang.String r15 = ", paddingEnd = "
            r8.append(r15)
            r8.append(r9)
            java.lang.String r15 = ", "
            r8.append(r15)
            java.lang.String r15 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12772zc.mo12317Z0(android.view.View):void");
    }

    /* renamed from: a1 */
    public final void mo12318a1() {
        mo10792g(8);
        PAGView pAGView = this.f36580u;
        if (pAGView != null) {
            pAGView.stop();
        }
        this.f36580u = null;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final View mo12319b1() {
        return (View) this.f36581v.getValue();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C11935b) mo87696x0(C11935b.class)).f34868h.observe(this, new C12779g(this));
        ((C54991o) mo87696x0(C54991o.class)).f154263U1.observe(this, new C12780h(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        ViewGroup viewGroup;
        View findViewById;
        C87412m.m108594g(bVar, "status");
        if (C12784c.f36599a[bVar.ordinal()] == 1 && mo14483f0() == 0) {
            C62741dg dgVar = (C62741dg) mo87687E0(C62741dg.class);
            C13598b0 b0Var = null;
            if (!(dgVar == null || (viewGroup = dgVar.f178127v.f28427a) == null || (findViewById = viewGroup.findViewById(C0966R.C0970id.dma)) == null)) {
                if (!findViewById.isShown()) {
                    findViewById = null;
                }
                if (findViewById != null) {
                    mo12317Z0(findViewById);
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var == null) {
                mo12318a1();
            }
        }
    }
}
