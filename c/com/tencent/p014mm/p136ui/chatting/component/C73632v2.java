package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.StayTimeReport;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import hk3.C76227e;
import ht1.C46117w1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p270xi.C91212b;
import qy2.C77457v;
import xy1.C53472h;
import zj3.C79346d0;
import zj3.C79348e;
import zj3.C79360h;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79368l;
import zj3.C79377q;
import zj3.C79389x;

@C91212b(exportInterface = C79346d0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.v2 */
public class C73632v2 extends C73412a implements C79346d0 {

    /* renamed from: e */
    public View f216201e;

    /* renamed from: f */
    public int f216202f;

    /* renamed from: g */
    public int f216203g = 0;

    /* renamed from: h */
    public int f216204h = 0;

    /* renamed from: i */
    public int f216205i = 0;

    /* renamed from: j */
    public boolean f216206j = false;

    /* renamed from: n */
    public Runnable f216207n;

    /* renamed from: com.tencent.mm.ui.chatting.component.v2$a */
    public class C73633a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f216208d;

        public C73633a(int i) {
            this.f216208d = i;
        }

        public void onClick(View view) {
            Class cls = C79389x.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73632v2 v2Var = C73632v2.this;
            v2Var.f216203g = 2;
            StayTimeReport.C80808b bVar = StayTimeReport.f237543q.f237548e;
            if (bVar != null) {
                bVar.f237569i = 2;
            }
            if (((C79389x) v2Var.f215752d.f193278b.mo102812a(cls)).mo102443k(C73632v2.this.f215752d.mo91577r())) {
                ((C79389x) C73632v2.this.f215752d.f193278b.mo102812a(cls)).mo102444p0();
            } else {
                C73632v2 v2Var2 = C73632v2.this;
                ((C79368l) v2Var2.f215752d.f193278b.mo102812a(C79368l.class)).mo108172E5(this.f216208d, C76227e.C76228a.ACTION_POSITION);
                v2Var2.mo102652f();
            }
            if (C72996z1.m85806K4(C73632v2.this.f215752d.mo91577r())) {
                ((C79360h) C73632v2.this.f215752d.f193278b.mo102812a(C79360h.class)).mo102169A0();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: E */
    public int mo102648E() {
        return this.f216203g;
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        View view2;
        this.f216204h = i2;
        int i4 = this.f216202f;
        if (i4 > 0 && i3 - (i + 1) >= i4 && (view2 = this.f216201e) != null && view2.getVisibility() == 0) {
            Log.m105925i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr jacks onScroll dismissMsgTongue mUnreadMessage[%d] [%d,%d]", Integer.valueOf(this.f216202f), Integer.valueOf(i3), Integer.valueOf(i));
            mo102652f();
        }
    }

    /* renamed from: Y5 */
    public final boolean mo102649Y5() {
        C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
        if (C72996z1.m85840k5(this.f215752d.mo91577r()) || C72996z1.m85806K4(this.f215752d.mo91577r())) {
            return true;
        }
        if (!this.f215752d.mo91574o().mo62916m3() || eVar.getBizInfo() == null) {
            return false;
        }
        return (eVar.getBizInfo().mo73507y2() && !((C45696d) C86709a0.m107533q(C45696d.class)).k20()) || eVar.getBizInfo().mo73506x2();
    }

    /* renamed from: Z5 */
    public final void mo102650Z5() {
        int i;
        int i2;
        this.f216206j = false;
        C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
        if (eVar.mo70071q1()) {
            this.f216202f = eVar.mo70073r4();
        }
        if (!((!Util.isNullOrNil(this.f215752d.mo91577r()) && !this.f215752d.mo91585z() && !C72996z1.m85842m5(this.f215752d.mo91577r()) && !C45628s0.m50738C(this.f215752d.mo91577r()) && !C72996z1.m85816S4(this.f215752d.mo91577r()) && !C72996z1.m85849t5(this.f215752d.mo91577r())) || this.f215752d.mo91582w() || mo102649Y5())) {
            Log.m105929w("MicroMsg.HistoryMsgTongueComponent", "[tryShowTongue] no show tongue! username:%s unreadCount:%s isBizChat:%s", this.f215752d.mo91577r(), Integer.valueOf(this.f216202f), Boolean.valueOf(eVar.mo70071q1()));
            View view = this.f216201e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowTongueInner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowTongueInner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f216203g = 0;
            return;
        }
        int i3 = this.f216202f;
        int i4 = 10;
        int i5 = mo102649Y5() ? 5 : 10;
        Log.m105925i("MicroMsg.HistoryMsgTongueComponent", "[update] threshold:%s fixUnreadMessage:%s", Integer.valueOf(i5), Integer.valueOf(i3));
        if (i3 >= i5) {
            Log.m105924i("MicroMsg.HistoryMsgTongueComponent", "[update] mGoBackToHistoryMsgLayout VISIBLE");
            TextView textView = (TextView) this.f215752d.mo91562c(C0966R.C0970id.b5m);
            StayTimeReport stayTimeReport = StayTimeReport.f237543q;
            StayTimeReport.C80808b bVar = stayTimeReport.f237548e;
            if (bVar == null) {
                stayTimeReport.f237549f = 1;
            } else {
                bVar.f237569i = 1;
            }
            if (i3 > 999) {
                textView.setText(String.format(this.f215752d.mo91572m().getString(C0966R.string.b8c), new Object[]{999}));
            } else {
                textView.setText(String.format(this.f215752d.mo91572m().getString(C0966R.string.b8c), new Object[]{Integer.valueOf(i3)}));
            }
            if (eVar.mo70071q1()) {
                i2 = C97625j3.m125812b().mo105897l().mo100924h(this.f215752d.mo91577r(), eVar.mo70068i4());
                i = this.f216202f;
            } else {
                i2 = ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f215752d.mo91577r());
                i = this.f216202f;
            }
            this.f216201e.setOnClickListener(new C73633a(i2 - i));
            if (mo102649Y5()) {
                i4 = 5;
            }
            if (this.f216202f <= i4) {
                Log.m105928w("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] mUnreadMessageCount is smaller than threshold:" + i4);
                View view3 = this.f216201e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "showMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "showMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f216201e.getVisibility() == 0) {
                Log.m105928w("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] has show!!!");
            } else if (!C72996z1.m85840k5(this.f215752d.mo91577r()) || this.f216202f > this.f216204h) {
                this.f215752d.mo91571l().removeCallbacks(this.f216207n);
                MMHandler l = this.f215752d.mo91571l();
                C73641w2 w2Var = new C73641w2(this);
                this.f216207n = w2Var;
                l.postDelayed(w2Var, 100);
            } else {
                Log.m105924i("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] has fold message cell");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r0 > r7) goto L_0x00b8;
     */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102651b3(int r7) {
        /*
            r6 = this;
            java.lang.Class<zj3.c1> r0 = zj3.C79344c1.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.HistoryMsgTongueComponent"
            java.lang.String r5 = "tuneGoBackToHistoryMessagePos() called with: which = [%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r2)
            boolean r2 = r6.mo102649Y5()
            if (r2 == 0) goto L_0x001c
            r2 = 5
            goto L_0x001e
        L_0x001c:
            r2 = 10
        L_0x001e:
            int r3 = r6.f216202f
            if (r3 < r2) goto L_0x00f2
            android.view.View r2 = r6.f216201e
            if (r2 != 0) goto L_0x0028
            goto L_0x00f2
        L_0x0028:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r3 = -2
            r5 = 2131165553(0x7f070171, float:1.7945326E38)
            if (r7 == r3) goto L_0x00d5
            if (r7 == 0) goto L_0x00c7
            if (r7 == r1) goto L_0x006e
            r0 = 3
            if (r7 == r0) goto L_0x005d
            r0 = 4
            if (r7 == r0) goto L_0x0040
            goto L_0x00f2
        L_0x0040:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            r0 = 2131165357(0x7f0700ad, float:1.7944929E38)
            int r7 = r7.getDimensionPixelSize(r0)
            ck3.b r0 = r6.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            int r0 = r0.getDimensionPixelSize(r5)
            int r0 = r0 + r7
            r2.setMargins(r4, r0, r4, r4)
            goto L_0x00f2
        L_0x005d:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r5)
            int r7 = r7 * 3
            r2.setMargins(r4, r7, r4, r4)
            goto L_0x00f2
        L_0x006e:
            ck3.b r7 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r0)
            zj3.c1 r7 = (zj3.C79344c1) r7
            boolean r0 = r7.mo102266Q2()
            if (r0 == 0) goto L_0x0083
            int r0 = r7.mo102267V1()
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            boolean r1 = r7.mo102272e1()
            if (r1 == 0) goto L_0x0098
            ck3.b r1 = r6.f215752d
            android.content.res.Resources r1 = r1.mo91572m()
            r3 = 2131165585(0x7f070191, float:1.7945391E38)
            int r1 = r1.getDimensionPixelSize(r3)
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            boolean r7 = r7.mo102264M()
            if (r7 == 0) goto L_0x00ad
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            r3 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r7 = r7.getDimensionPixelSize(r3)
            goto L_0x00ae
        L_0x00ad:
            r7 = 0
        L_0x00ae:
            if (r1 <= r0) goto L_0x00b4
            if (r1 <= r7) goto L_0x00b7
            r0 = r1
            goto L_0x00b8
        L_0x00b4:
            if (r0 <= r7) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r0 = r7
        L_0x00b8:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r5)
            int r7 = r7 + r0
            r2.setMargins(r4, r7, r4, r4)
            goto L_0x00f2
        L_0x00c7:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r5)
            r2.setMargins(r4, r7, r4, r4)
            goto L_0x00f2
        L_0x00d5:
            ck3.b r7 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r0)
            zj3.c1 r7 = (zj3.C79344c1) r7
            boolean r7 = r7.mo102266Q2()
            if (r7 != 0) goto L_0x00f2
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r5)
            r2.setMargins(r4, r7, r4, r4)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73632v2.mo102651b3(int):void");
    }

    /* renamed from: e */
    public void mo70065e() {
        View c = this.f215752d.mo91562c(C0966R.C0970id.b5l);
        this.f216201e = c;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = c;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((C79365j) this.f215752d.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
            this.f216202f = ((C46117w1) C86312j.m106911c(C46117w1.class)).mo64582V(this.f215752d.mo91577r());
        } else {
            if (((C79366k) this.f215752d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                this.f216202f = ((C53472h) C86312j.m106911c(C53472h.class)).mo70726V(this.f215752d.mo91577r());
            } else {
                if (((C79377q) this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                    this.f216202f = ((C77457v) C86312j.m106911c(C77457v.class)).mo74148V(this.f215752d.mo91577r());
                } else {
                    C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
                    if (j != null) {
                        this.f216202f = j.mo108786G2();
                    }
                }
            }
        }
        Log.m105925i("MicroMsg.HistoryMsgTongueComponent", "[onChattingInit] mUnreadMessageCount:%s", Integer.valueOf(this.f216202f));
    }

    /* renamed from: f */
    public void mo102652f() {
        View view = this.f216201e;
        if (view != null) {
            this.f216202f = -1;
            if (view.getVisibility() == 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) this.f216201e.getWidth(), 0.0f, 0.0f);
                translateAnimation.setDuration(300);
                translateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.f215752d.mo91565f(), 17432581));
                this.f216201e.startAnimation(translateAnimation);
            }
            View view2 = this.f216201e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        mo102655v5();
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        this.f216205i = 0;
    }

    /* renamed from: n5 */
    public void mo102653n5(int i) {
        this.f216205i = i | this.f216205i;
        if (this.f216206j) {
            mo102655v5();
        }
    }

    /* renamed from: v0 */
    public int mo102654v0() {
        return this.f216202f;
    }

    /* renamed from: v5 */
    public void mo102655v5() {
        Log.m105919d("MicroMsg.HistoryMsgTongueComponent", "tryShowTongue() called:%s", Integer.valueOf(this.f216205i));
        if (this.f216205i == 1) {
            try {
                mo102650Z5();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.HistoryMsgTongueComponent", th, "tryShowTongue err", new Object[0]);
            }
        } else {
            this.f216206j = true;
        }
    }

    /* renamed from: z3 */
    public void mo102656z3(int i) {
        this.f216203g = i;
    }
}
