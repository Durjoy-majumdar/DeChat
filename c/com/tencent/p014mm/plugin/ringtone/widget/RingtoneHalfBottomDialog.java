package com.tencent.p014mm.plugin.ringtone.widget;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C39623j;
import ck2.C54881c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import d14.C58052j1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fk2.C59122a;
import fk2.C59123c;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qo3.C101218e0;
import rj2.C63451c;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog */
public final class RingtoneHalfBottomDialog {

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$a */
    public static final class C5150a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f20545d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f20546e;

        public C5150a(C8477a0 a0Var, ImageView imageView) {
            this.f20545d = a0Var;
            this.f20546e = imageView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8477a0 a0Var = this.f20545d;
            a0Var.f27482d = !a0Var.f27482d;
            ImageView imageView = this.f20546e;
            if (imageView != null) {
                imageView.setImageDrawable(C76577a.m92158i(MMApplicationContext.getContext(), this.f20545d.f27482d ? C0966R.raw.checkbox_selected_filled : C0966R.C0969drawable.f4823ny));
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_RINGTONE_SET_AS_STATUS_WHEN_USE_BOOLEAN_SYNC, Boolean.valueOf(this.f20545d.f27482d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$f */
    public static final class C5151f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32228q<Boolean, String, C101218e0, C53973z1> f20547d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f20548e;

        /* renamed from: f */
        public final /* synthetic */ String f20549f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C101218e0> f20550g;

        public C5151f(C32228q<? super Boolean, ? super String, ? super C101218e0, ? extends C53973z1> qVar, C8477a0 a0Var, String str, C8479f0<C101218e0> f0Var) {
            this.f20547d = qVar;
            this.f20548e = a0Var;
            this.f20549f = str;
            this.f20550g = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32228q<Boolean, String, C101218e0, C53973z1> qVar = this.f20547d;
            Boolean valueOf = Boolean.valueOf(this.f20548e.f27482d);
            String str = this.f20549f;
            if (str.length() == 0) {
                str = C75592q0.m90789s();
            }
            C87412m.m108593f(str, "toUser.ifEmpty { ConfigS…tUsernameFromUserInfo() }");
            qVar.invoke(valueOf, str, this.f20550g.f27484d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$b */
    public static final class C57306b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f164112d;

        /* renamed from: e */
        public final /* synthetic */ C32228q<Boolean, String, C101218e0, C53973z1> f164113e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f164114f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C101218e0> f164115g;

        /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$b$a */
        public static final class C57307a implements C59122a {

            /* renamed from: a */
            public final /* synthetic */ C32228q<Boolean, String, C101218e0, C53973z1> f164116a;

            /* renamed from: b */
            public final /* synthetic */ C8477a0 f164117b;

            /* renamed from: c */
            public final /* synthetic */ C8479f0<C101218e0> f164118c;

            public C57307a(C32228q<? super Boolean, ? super String, ? super C101218e0, ? extends C53973z1> qVar, C8477a0 a0Var, C8479f0<C101218e0> f0Var) {
                this.f164116a = qVar;
                this.f164117b = a0Var;
                this.f164118c = f0Var;
            }

            /* renamed from: a */
            public void mo80850a(String str, String str2) {
                C87412m.m108594g(str, "displayName");
                C87412m.m108594g(str2, "username");
                this.f164116a.invoke(Boolean.valueOf(this.f164117b.f27482d), str2, this.f164118c.f27484d);
            }
        }

        public C57306b(Context context, C32228q<? super Boolean, ? super String, ? super C101218e0, ? extends C53973z1> qVar, C8477a0 a0Var, C8479f0<C101218e0> f0Var) {
            this.f164112d = context;
            this.f164113e = qVar;
            this.f164114f = a0Var;
            this.f164115g = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            new C59123c(this.f164112d, new C57307a(this.f164113e, this.f164114f, this.f164115g)).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$c */
    public static final class C57308c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMAnimateView f164119d;

        /* renamed from: e */
        public final /* synthetic */ C54881c0 f164120e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C101218e0> f164121f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f164122g;

        public C57308c(MMAnimateView mMAnimateView, C54881c0 c0Var, C8479f0<C101218e0> f0Var, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
            this.f164119d = mMAnimateView;
            this.f164120e = c0Var;
            this.f164121f = f0Var;
            this.f164122g = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f164119d.mo129237x();
            this.f164119d.mo129226s();
            C54881c0 c0Var = this.f164120e;
            if (c0Var != null) {
                Log.m105924i("MicroMsg.RingtonePlayUIC", "release");
                c0Var.f153830b.mo88319f3();
                C63451c cVar = c0Var.f153830b;
                ((C58052j1) cVar.f179978g).setValue(new C63451c.C63452a.C63454b(0, (C66132f) null, 3));
                cVar.mo88316c3();
                C53973z1 z1Var = cVar.f179984p;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C53930o0.m60558e(c0Var.f153829a, (CancellationException) null, 1, (Object) null);
            }
            ((C101218e0) this.f164121f.f27484d).mo140680z();
            C32227p<Boolean, Integer, C13598b0> pVar = this.f164122g;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$d */
    public static final class C57309d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C101218e0, C13598b0> f164123d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C101218e0> f164124e;

        /* renamed from: f */
        public final /* synthetic */ boolean f164125f;

        /* renamed from: g */
        public final /* synthetic */ MMAnimateView f164126g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f164127h;

        /* renamed from: i */
        public final /* synthetic */ View f164128i;

        /* renamed from: j */
        public final /* synthetic */ Context f164129j;

        /* renamed from: n */
        public final /* synthetic */ View f164130n;

        /* renamed from: o */
        public final /* synthetic */ C54881c0 f164131o;

        /* renamed from: p */
        public final /* synthetic */ C66132f f164132p;

        /* renamed from: q */
        public final /* synthetic */ C8477a0 f164133q;

        /* renamed from: r */
        public final /* synthetic */ long f164134r;

        /* renamed from: s */
        public final /* synthetic */ int f164135s;

        /* renamed from: t */
        public final /* synthetic */ String f164136t;

        /* renamed from: u */
        public final /* synthetic */ boolean f164137u;

        /* renamed from: v */
        public final /* synthetic */ String f164138v;

        /* renamed from: w */
        public final /* synthetic */ boolean f164139w;

        public C57309d(C32226l<? super C101218e0, C13598b0> lVar, C8479f0<C101218e0> f0Var, boolean z, MMAnimateView mMAnimateView, C8477a0 a0Var, View view, Context context, View view2, C54881c0 c0Var, C66132f fVar, C8477a0 a0Var2, long j, int i, String str, boolean z2, String str2, boolean z3) {
            this.f164123d = lVar;
            this.f164124e = f0Var;
            this.f164125f = z;
            this.f164126g = mMAnimateView;
            this.f164127h = a0Var;
            this.f164128i = view;
            this.f164129j = context;
            this.f164130n = view2;
            this.f164131o = c0Var;
            this.f164132p = fVar;
            this.f164133q = a0Var2;
            this.f164134r = j;
            this.f164135s = i;
            this.f164136t = str;
            this.f164137u = z2;
            this.f164138v = str2;
            this.f164139w = z3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0140  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r26) {
            /*
                r25 = this;
                r6 = r25
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r26
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r25
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                fy3.l<qo3.e0, rx3.b0> r0 = r6.f164123d
                if (r0 == 0) goto L_0x002c
                gy3.f0<qo3.e0> r1 = r6.f164124e
                T r1 = r1.f27484d
                r0.invoke(r1)
            L_0x002c:
                boolean r0 = r6.f164125f
                java.lang.String r1 = "(Landroid/view/View;)V"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                if (r0 != 0) goto L_0x003d
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x003d:
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r6.f164126g
                r0.mo129237x()
                gy3.a0 r0 = r6.f164127h
                boolean r0 = r0.f27482d
                r5 = 0
                if (r0 != 0) goto L_0x00aa
                android.view.View r0 = r6.f164128i
                android.content.Context r7 = r6.f164129j
                r8 = 2131234664(0x7f080f68, float:1.80855E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
                r0.setBackground(r7)
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r6.f164126g
                r0.setVisibility(r5)
                android.view.View r0 = r6.f164130n
                if (r0 != 0) goto L_0x0061
                goto L_0x00a4
            L_0x0061:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r15.mo10233c(r7)
                java.lang.Object[] r8 = r15.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                java.lang.String r10 = "onClick"
                java.lang.String r11 = "(Landroid/view/View;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r0
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r7 = r15.mo10231a(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r0.setVisibility(r7)
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                java.lang.String r9 = "onClick"
                java.lang.String r10 = "(Landroid/view/View;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r7 = r0
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x00a4:
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r6.f164126g
                r0.mo129236w()
                goto L_0x00c3
            L_0x00aa:
                android.view.View r0 = r6.f164128i
                android.content.Context r7 = r6.f164129j
                r8 = 2131234665(0x7f080f69, float:1.8085502E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
                r0.setBackground(r7)
                com.tencent.mm.plugin.gif.MMAnimateView r0 = r6.f164126g
                r7 = 8
                r0.setVisibility(r7)
                android.view.View r0 = r6.f164130n
                if (r0 != 0) goto L_0x00c6
            L_0x00c3:
                r26 = r1
                goto L_0x010c
            L_0x00c6:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r15.mo10233c(r7)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                java.lang.String r11 = "onClick"
                java.lang.String r12 = "(Landroid/view/View;)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r8 = r0
                r26 = r1
                r1 = r15
                r15 = r7
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r1 = r1.mo10231a(r5)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r9 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5"
                java.lang.String r10 = "onClick"
                java.lang.String r11 = "(Landroid/view/View;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x010c:
                ck2.c0 r0 = r6.f164131o
                if (r0 == 0) goto L_0x011d
                wj2.f r1 = r6.f164132p
                r7 = 0
                gy3.a0 r9 = r6.f164127h
                boolean r9 = r9.f27482d
                r9 = r9 ^ 1
                r0.mo75822a(r1, r7, r9)
            L_0x011d:
                gy3.a0 r0 = r6.f164127h
                boolean r1 = r0.f27482d
                r1 = r1 ^ 1
                r0.f27482d = r1
                wj2.f r0 = r6.f164132p
                java.lang.String r7 = r0.mo90173d()
                wj2.f r0 = r6.f164132p
                long r8 = r0.mo90172c()
                gy3.a0 r0 = r6.f164133q
                boolean r0 = r0.f27482d
                ck2.c0 r1 = r6.f164131o
                if (r1 == 0) goto L_0x0140
                rj2.c r1 = r1.f153830b
                boolean r5 = r1.f179987s
                r20 = r5
                goto L_0x0142
            L_0x0140:
                r20 = 0
            L_0x0142:
                long r10 = r6.f164134r
                r12 = 3
                int r14 = r6.f164135s
                java.lang.String r1 = r6.f164136t
                r15 = r1
                r18 = r1
                r16 = 0
                boolean r1 = r6.f164137u
                r19 = r1
                java.lang.String r1 = r6.f164138v
                r21 = r1
                boolean r1 = r6.f164139w
                r22 = r1
                r23 = 64
                r24 = 0
                r17 = r0
                xj2.C66286a.m78218e(r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                r0 = r26
                j20.C117292a.m165361g(r6, r4, r3, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ringtone.widget.RingtoneHalfBottomDialog.C57309d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$e */
    public static final class C57310e implements C101218e0.C77394n {

        /* renamed from: a */
        public final /* synthetic */ View f164140a;

        /* renamed from: b */
        public final /* synthetic */ MMAnimateView f164141b;

        /* renamed from: c */
        public final /* synthetic */ C54881c0 f164142c;

        /* renamed from: d */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f164143d;

        public C57310e(View view, MMAnimateView mMAnimateView, C54881c0 c0Var, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
            this.f164140a = view;
            this.f164141b = mMAnimateView;
            this.f164142c = c0Var;
            this.f164143d = pVar;
        }

        public final void dismiss() {
            View view = this.f164140a;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$7", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$7", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f164141b.mo129237x();
            this.f164141b.mo129226s();
            C54881c0 c0Var = this.f164142c;
            if (c0Var != null) {
                Log.m105924i("MicroMsg.RingtonePlayUIC", "release");
                c0Var.f153830b.mo88319f3();
                C63451c cVar = c0Var.f153830b;
                ((C58052j1) cVar.f179978g).setValue(new C63451c.C63452a.C63454b(0, (C66132f) null, 3));
                cVar.mo88316c3();
                C53973z1 z1Var = cVar.f179984p;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C53930o0.m60558e(c0Var.f153829a, (CancellationException) null, 1, (Object) null);
            }
            C32227p<Boolean, Integer, C13598b0> pVar = this.f164143d;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$g */
    public static final class C57311g extends C87413o implements C32228q<Boolean, String, C101218e0, C53973z1> {

        /* renamed from: d */
        public final /* synthetic */ Context f164144d;

        /* renamed from: e */
        public final /* synthetic */ C66132f f164145e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f164146f;

        /* renamed from: g */
        public final /* synthetic */ long f164147g;

        /* renamed from: h */
        public final /* synthetic */ int f164148h;

        /* renamed from: i */
        public final /* synthetic */ C54881c0 f164149i;

        /* renamed from: j */
        public final /* synthetic */ String f164150j;

        /* renamed from: n */
        public final /* synthetic */ boolean f164151n;

        /* renamed from: o */
        public final /* synthetic */ int f164152o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57311g(Context context, C66132f fVar, C32227p<? super Boolean, ? super Integer, C13598b0> pVar, long j, int i, C54881c0 c0Var, String str, boolean z, int i2) {
            super(3);
            this.f164144d = context;
            this.f164145e = fVar;
            this.f164146f = pVar;
            this.f164147g = j;
            this.f164148h = i;
            this.f164149i = c0Var;
            this.f164150j = str;
            this.f164151n = z;
            this.f164152o = i2;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            C101218e0 e0Var = (C101218e0) obj3;
            C87412m.m108594g(str, "toFriend");
            C87412m.m108594g(e0Var, "dialog");
            return C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C57312a(str, this.f164144d, this.f164145e, booleanValue, e0Var, this.f164146f, this.f164147g, this.f164148h, this.f164149i, this.f164150j, this.f164151n, this.f164152o, (C15601d<? super C57312a>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x060e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final qo3.C101218e0 m66040a(android.content.Context r42, androidx.lifecycle.C39623j r43, java.lang.String r44, wj2.C66132f r45, long r46, int r48, int r49, java.lang.String r50, boolean r51, boolean r52, fy3.C32226l<? super qo3.C101218e0, rx3.C13598b0> r53, fy3.C32227p<? super java.lang.Boolean, ? super java.lang.Integer, rx3.C13598b0> r54) {
        /*
            r15 = r42
            r14 = r43
            r12 = r44
            r13 = r45
            r11 = r54
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "lifecycle"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "toUser"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "tpMediaInfoDesc"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "recRequestId"
            r10 = r50
            gy3.C87412m.m108594g(r10, r0)
            r9 = 0
            if (r52 == 0) goto L_0x0033
            ck2.c0 r0 = new ck2.c0
            r0.<init>()
            r8 = r0
            goto L_0x0034
        L_0x0033:
            r8 = r9
        L_0x0034:
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$g r7 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$g
            r0 = r7
            r1 = r42
            r2 = r45
            r3 = r54
            r4 = r46
            r6 = r48
            r14 = r7
            r7 = r8
            r11 = r8
            r8 = r50
            r16 = r14
            r14 = r9
            r9 = r51
            r10 = r49
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            r0 = 1
            r2 = 1
            r10 = 0
            int r3 = (r46 > r0 ? 1 : (r46 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0098
            int r0 = r44.length()
            if (r0 != 0) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r0 = gy3.C87412m.m108589b(r12, r0)
            if (r0 == 0) goto L_0x0098
        L_0x006d:
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r0, r1)
            wj2.f r0 = nj2.C61768p.m72482j(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r13.f190081d
            if (r1 == 0) goto L_0x0087
            long r0 = r0.f190092o
            long r4 = r13.f190092o
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0091
            goto L_0x008f
        L_0x0087:
            int r1 = r13.f190094q
            if (r1 == 0) goto L_0x0091
            int r0 = r0.f190094q
            if (r0 != r1) goto L_0x0091
        L_0x008f:
            r0 = 1
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x0098
            r0 = 2131497271(0x7f0c1137, float:1.861813E38)
            goto L_0x009b
        L_0x0098:
            r0 = 2131497270(0x7f0c1136, float:1.8618128E38)
        L_0x009b:
            gy3.a0 r9 = new gy3.a0
            r9.<init>()
            r9.f27482d = r2
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_ringtone_set_as_status_when_use
            boolean r1 = r1.mo58784wf(r4, r2)
            gy3.a0 r8 = new gy3.a0
            r8.<init>()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_RINGTONE_SET_AS_STATUS_WHEN_USE_BOOLEAN_SYNC
            boolean r1 = r4.mo119686g(r5, r1)
            r8.f27482d = r1
            d03.a r1 = r13.f190078a
            if (r1 != 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r1.f165940l = r2
        L_0x00cc:
            if (r11 == 0) goto L_0x00d5
            r4 = 0
            r11.mo75822a(r13, r4, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00d5:
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            qo3.e0 r1 = new qo3.e0
            r1.<init>(r15, r10, r10, r2)
            r7.f27484d = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r42)
            android.view.View r6 = r1.inflate(r0, r14)
            r0 = 2131312552(0x7f093fa8, float:1.8243476E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131312575(0x7f093fbf, float:1.8243522E38)
            android.view.View r1 = r6.findViewById(r1)
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            if (r5 == 0) goto L_0x0103
            android.text.TextPaint r1 = r5.getPaint()
            r14 = r1
        L_0x0103:
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r14)
            r1 = 2131312534(0x7f093f96, float:1.824344E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4 = 2131312550(0x7f093fa6, float:1.8243472E38)
            android.view.View r14 = r6.findViewById(r4)
            java.lang.String r4 = nj2.C61767o.m72469e(r10)
            r2 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r2 = r6.findViewById(r2)
            r10 = 2131312537(0x7f093f99, float:1.8243445E38)
            android.view.View r10 = r6.findViewById(r10)
            r25 = r11
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMAnimateView"
            gy3.C87412m.m108592e(r10, r11)
            r11 = r10
            com.tencent.mm.plugin.gif.MMAnimateView r11 = (com.tencent.p014mm.plugin.gif.MMAnimateView) r11
            if (r2 != 0) goto L_0x0138
            r26 = r14
            goto L_0x0180
        L_0x0138:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r26 = r14
            r17 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            r10.mo10233c(r14)
            java.lang.Object[] r18 = r10.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r20 = "showRingtoneSettingHalfUI"
            java.lang.String r21 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r14 = 0
            java.lang.Object r10 = r10.mo10231a(r14)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r2.setVisibility(r10)
            java.lang.String r18 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r19 = "showRingtoneSettingHalfUI"
            java.lang.String r20 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0180:
            r11.setImageFilePath(r4)
            r11.mo129237x()
            r11.mo129236w()
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r4 = 2131312576(0x7f093fc0, float:1.8243524E38)
            android.view.View r4 = r6.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x01ae
            r10 = 2131756258(0x7f1004e2, float:1.9143418E38)
            android.content.res.Resources r14 = r42.getResources()
            r23 = r2
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r2 = r14.getColor(r2)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r15, r10, r2)
            r4.setImageDrawable(r2)
            goto L_0x01b0
        L_0x01ae:
            r23 = r2
        L_0x01b0:
            if (r1 == 0) goto L_0x01c6
            T r2 = r7.f27484d
            qo3.e0 r2 = (qo3.C101218e0) r2
            android.view.View r2 = r2.f296384g
            android.content.Context r2 = r2.getContext()
            r10 = 2131232083(0x7f080553, float:1.8080265E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r10)
            r1.setImageDrawable(r2)
        L_0x01c6:
            if (r1 == 0) goto L_0x01e6
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r10 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r2, r10)
            r17 = r2
            ht1.t1 r17 = (ht1.C60200t1) r17
            java.lang.String r2 = r13.f190088k
            r20 = 0
            r21 = 4
            r22 = 0
            r18 = r2
            r19 = r1
            ht1.C60200t1.C60201a.m70370h(r17, r18, r19, r20, r21, r22)
        L_0x01e6:
            r1 = 2131311575(0x7f093bd7, float:1.8241494E38)
            android.view.View r1 = r6.findViewById(r1)
            r2 = 2131312579(0x7f093fc3, float:1.824353E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10 = 2131312543(0x7f093f9f, float:1.8243458E38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r17 = 8
            r18 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r14.mo10233c(r9)
            java.lang.Object[] r28 = r14.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r1
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r14 = r14.mo10231a(r9)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r9 = r14.intValue()
            r1.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r1 = r13.f190086i
            r2.setText(r1)
            java.lang.String r1 = r13.f190087j
            r10.setText(r1)
            r1 = 2131312577(0x7f093fc1, float:1.8243526E38)
            android.view.View r1 = r6.findViewById(r1)
            r2 = 2131313232(0x7f094250, float:1.8244855E38)
            android.view.View r2 = r6.findViewById(r2)
            r9 = 2131313233(0x7f094251, float:1.8244857E38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 2131299543(0x7f090cd7, float:1.821709E38)
            android.view.View r10 = r6.findViewById(r10)
            r14 = 2131312479(0x7f093f5f, float:1.8243328E38)
            android.view.View r14 = r6.findViewById(r14)
            r19 = r6
            if (r9 == 0) goto L_0x0290
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r13 = r8.f27482d
            if (r13 == 0) goto L_0x0286
            r13 = 2131755394(0x7f100182, float:1.9141666E38)
            goto L_0x0289
        L_0x0286:
            r13 = 2131231750(0x7f080406, float:1.807959E38)
        L_0x0289:
            android.graphics.drawable.Drawable r6 = kg3.C76577a.m92158i(r6, r13)
            r9.setImageDrawable(r6)
        L_0x0290:
            if (r2 == 0) goto L_0x029a
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$a r6 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$a
            r6.<init>(r8, r9)
            r2.setOnClickListener(r6)
        L_0x029a:
            if (r10 == 0) goto L_0x02a7
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$b r6 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$b
            r13 = r16
            r6.<init>(r15, r13, r8, r7)
            r10.setOnClickListener(r6)
            goto L_0x02a9
        L_0x02a7:
            r13 = r16
        L_0x02a9:
            wj2.f r6 = nj2.C61768p.m72481i(r44)
            if (r6 == 0) goto L_0x02b2
            r20 = 1
            goto L_0x02b4
        L_0x02b2:
            r20 = 0
        L_0x02b4:
            int r6 = r44.length()
            if (r6 != 0) goto L_0x02bc
            r6 = 1
            goto L_0x02bd
        L_0x02bc:
            r6 = 0
        L_0x02bd:
            if (r6 == 0) goto L_0x0352
            if (r2 != 0) goto L_0x02c4
            r16 = r13
            goto L_0x0309
        L_0x02c4:
            k20.a r6 = new k20.a
            r6.<init>()
            r16 = r13
            r9 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r6.mo10233c(r13)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0309:
            if (r10 != 0) goto L_0x030d
            goto L_0x047c
        L_0x030d:
            k20.a r6 = new k20.a
            r6.<init>()
            r9 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r6.mo10233c(r13)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r10
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x047c
        L_0x0352:
            r16 = r13
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r6 = gy3.C87412m.m108589b(r12, r6)
            if (r6 == 0) goto L_0x03ec
            if (r2 != 0) goto L_0x0361
            goto L_0x03a4
        L_0x0361:
            k20.a r6 = new k20.a
            r6.<init>()
            r9 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r6.mo10233c(r13)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x03a4:
            if (r10 != 0) goto L_0x03a8
            goto L_0x047c
        L_0x03a8:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r6.mo10233c(r9)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r10
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x047c
        L_0x03ec:
            if (r2 != 0) goto L_0x03ef
            goto L_0x0431
        L_0x03ef:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r6.mo10233c(r9)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0431:
            if (r10 != 0) goto L_0x0434
            goto L_0x0476
        L_0x0434:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r6.mo10233c(r9)
            java.lang.Object[] r28 = r6.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r10
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0476:
            r6 = 2131835682(0x7f113b22, float:1.930451E38)
            r0.setText(r6)
        L_0x047c:
            if (r1 != 0) goto L_0x0481
            r13 = r48
            goto L_0x04cd
        L_0x0481:
            r6 = 11
            r13 = r48
            if (r13 != r6) goto L_0x0489
            r6 = 0
            goto L_0x048b
        L_0x0489:
            r6 = 8
        L_0x048b:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.mo10233c(r6)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r1
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 0
            java.lang.Object r9 = r9.mo10231a(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r6 = r9.intValue()
            r1.setVisibility(r6)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x04cd:
            if (r3 != 0) goto L_0x052a
            r1 = 2131833883(0x7f11341b, float:1.930086E38)
            r0.setText(r1)
            r0 = 2131835840(0x7f113bc0, float:1.930483E38)
            r5.setText(r0)
            if (r14 != 0) goto L_0x04de
            goto L_0x052a
        L_0x04de:
            boolean r0 = r45.mo90179j()
            if (r0 == 0) goto L_0x04e6
            r0 = 0
            goto L_0x04e8
        L_0x04e6:
            r0 = 8
        L_0x04e8:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo10233c(r0)
            java.lang.Object[] r28 = r1.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r14
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = 0
            java.lang.Object r1 = r1.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            r14.setVisibility(r0)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x052a:
            boolean r0 = r45.mo90180k()
            if (r0 == 0) goto L_0x0582
            r0 = 0
            r8.f27482d = r0
            if (r2 != 0) goto L_0x0537
            r10 = 0
            goto L_0x0579
        L_0x0537:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0.mo10233c(r1)
            java.lang.Object[] r28 = r0.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r30 = "showRingtoneSettingHalfUI"
            java.lang.String r31 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r28 = "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog"
            java.lang.String r29 = "showRingtoneSettingHalfUI"
            java.lang.String r30 = "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;JIILjava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0579:
            java.lang.String r0 = "MicroMsg.RingtoneHalfBottomDialog"
            java.lang.String r1 = "music ringtone, hide set status!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0583
        L_0x0582:
            r10 = 0
        L_0x0583:
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$c r0 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$c
            r14 = r54
            r9 = r25
            r0.<init>(r11, r9, r7, r14)
            r4.setOnClickListener(r0)
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$d r6 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$d
            r0 = r6
            r1 = r53
            r4 = r23
            r2 = r7
            r3 = r52
            r4 = r11
            r35 = r5
            r5 = r18
            r37 = r6
            r36 = r19
            r6 = r26
            r38 = r7
            r7 = r42
            r49 = r8
            r8 = r23
            r19 = r18
            r21 = 0
            r10 = r45
            r52 = r11
            r11 = r49
            r12 = r46
            r39 = r16
            r40 = r26
            r14 = r48
            r15 = r44
            r16 = r20
            r17 = r50
            r18 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r0 = r37
            r1 = r40
            r1.setOnClickListener(r0)
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6 r8 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6
            r0 = r8
            r2 = r42
            r3 = r52
            r4 = r23
            r5 = r25
            r6 = r45
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r43
            r0.addObserver(r8)
            r15 = r38
            T r0 = r15.f27484d
            qo3.e0 r0 = (qo3.C101218e0) r0
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$e r1 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$e
            r10 = r52
            r2 = r54
            r3 = r23
            r1.<init>(r3, r10, r9, r2)
            r0.mo140665l(r1)
            r1 = r35
            if (r1 == 0) goto L_0x060e
            com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$f r0 = new com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$f
            r11 = r44
            r3 = r49
            r2 = r39
            r0.<init>(r2, r3, r11, r15)
            r1.setOnClickListener(r0)
            goto L_0x0612
        L_0x060e:
            r11 = r44
            r3 = r49
        L_0x0612:
            T r0 = r15.f27484d
            qo3.e0 r0 = (qo3.C101218e0) r0
            r1 = r36
            r0.mo140663j(r1)
            T r0 = r15.f27484d
            qo3.e0 r0 = (qo3.C101218e0) r0
            r0.mo140655A()
            java.lang.String r0 = r45.mo90173d()
            long r1 = r45.mo90172c()
            boolean r10 = r3.f27482d
            if (r9 == 0) goto L_0x0634
            rj2.c r3 = r9.f153830b
            boolean r3 = r3.f179987s
            r13 = r3
            goto L_0x0635
        L_0x0634:
            r13 = 0
        L_0x0635:
            r5 = 1
            r9 = 0
            r16 = 64
            r17 = 0
            r3 = r46
            r7 = r48
            r8 = r44
            r11 = r44
            r12 = r20
            r14 = r50
            r41 = r15
            r15 = r51
            xj2.C66286a.m78218e(r0, r1, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r41
            T r0 = r0.f27484d
            qo3.e0 r0 = (qo3.C101218e0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ringtone.widget.RingtoneHalfBottomDialog.m66040a(android.content.Context, androidx.lifecycle.j, java.lang.String, wj2.f, long, int, int, java.lang.String, boolean, boolean, fy3.l, fy3.p):qo3.e0");
    }

    /* renamed from: b */
    public static /* synthetic */ C101218e0 m66041b(Context context, C39623j jVar, String str, C66132f fVar, long j, int i, int i2, String str2, boolean z, boolean z2, C32226l lVar, C32227p pVar, int i3, Object obj) {
        boolean z3;
        int i4 = i3;
        boolean z4 = false;
        int i5 = (i4 & 64) != 0 ? 0 : i2;
        String str3 = (i4 & 128) != 0 ? "" : str2;
        if ((i4 & 256) != 0) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ringtone_video_timeline, 0) > 1) {
                z4 = true;
            }
            z3 = z4;
        } else {
            z3 = z;
        }
        return m66040a(context, jVar, str, fVar, j, i, i5, str3, z3, (i4 & 512) != 0 ? true : z2, (i4 & 1024) != 0 ? null : lVar, (i4 & 2048) != 0 ? null : pVar);
    }
}
