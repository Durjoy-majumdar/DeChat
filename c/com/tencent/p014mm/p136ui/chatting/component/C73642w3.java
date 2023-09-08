package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.view.C57704m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import hk3.C76227e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p270xi.C91212b;
import w72.C22877b;
import zj3.C79368l;
import zj3.C79374o0;

@C91212b(exportInterface = C79374o0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.w3 */
public class C73642w3 extends C73412a implements C79374o0 {

    /* renamed from: e */
    public View f216237e;

    /* renamed from: f */
    public C57704m f216238f;

    /* renamed from: g */
    public long f216239g = 0;

    /* renamed from: h */
    public long f216240h = 0;

    /* renamed from: i */
    public long f216241i = 0;

    /* renamed from: j */
    public Runnable f216242j;

    /* renamed from: com.tencent.mm.ui.chatting.component.w3$a */
    public class C73643a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216243d;

        public C73643a(C72963f4 f4Var) {
            this.f216243d = f4Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73642w3.this.getClass();
            C73642w3 w3Var = C73642w3.this;
            long j = w3Var.f216239g;
            C72963f4 f4Var = this.f216243d;
            ((C79368l) w3Var.f215752d.f193278b.mo102812a(C79368l.class)).mo108214y2(j, false, true, false, C76577a.m92151b(w3Var.f215752d.mo91565f(), 120), false, C76227e.C76228a.ACTION_POSITION);
            w3Var.mo102667f();
            if (f4Var != null) {
                switch (f4Var.getType()) {
                    case 49:
                    case 1048625:
                    case 419430449:
                    case 436207665:
                    case 754974769:
                    case 771751985:
                    case 805306417:
                    case 822083633:
                    case 855638065:
                    case 939524145:
                    case 973078577:
                    case 975175729:
                    case 1040187441:
                    case 1090519089:
                        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                        if (u == null) {
                            Log.m105920e("MicroMsg.QuoteMsgTongueComponent", "appMsgContent is null");
                            break;
                        } else {
                            C22877b.m26854a(4, f4Var.mo108774y2(), 49, (long) u.f195582i);
                            break;
                        }
                    default:
                        C22877b.m26854a(4, f4Var.mo108774y2(), (long) f4Var.getType(), 0);
                        break;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C57704m mVar = this.f216238f;
        if (mVar != null) {
            mVar.dismiss();
        }
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        long j = this.f216240h;
        if (j >= ((long) i) && j < ((long) (i + i2))) {
            mo102667f();
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        C57704m mVar;
        if (i == 1 && (mVar = this.f216238f) != null && mVar.isShowing()) {
            this.f216238f.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r0 > r7) goto L_0x0068;
     */
    /* renamed from: Y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102666Y5(int r7) {
        /*
            r6 = this;
            java.lang.Class<zj3.c1> r0 = zj3.C79344c1.class
            android.view.View r1 = r6.f216237e
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = -2
            r3 = 2131165553(0x7f070171, float:1.7945326E38)
            r4 = 3
            r5 = 0
            if (r7 == r2) goto L_0x0097
            if (r7 == r4) goto L_0x0087
            if (r7 == 0) goto L_0x0077
            r2 = 1
            if (r7 == r2) goto L_0x001e
            goto L_0x00b6
        L_0x001e:
            ck3.b r7 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r0)
            zj3.c1 r7 = (zj3.C79344c1) r7
            boolean r0 = r7.mo102266Q2()
            if (r0 == 0) goto L_0x0033
            int r0 = r7.mo102267V1()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            boolean r2 = r7.mo102272e1()
            if (r2 == 0) goto L_0x0048
            ck3.b r2 = r6.f215752d
            android.content.res.Resources r2 = r2.mo91572m()
            r4 = 2131165585(0x7f070191, float:1.7945391E38)
            int r2 = r2.getDimensionPixelSize(r4)
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            boolean r7 = r7.mo102264M()
            if (r7 == 0) goto L_0x005d
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            r4 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r7 = r7.getDimensionPixelSize(r4)
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            if (r2 <= r0) goto L_0x0064
            if (r2 <= r7) goto L_0x0067
            r0 = r2
            goto L_0x0068
        L_0x0064:
            if (r0 <= r7) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r0 = r7
        L_0x0068:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r3)
            int r7 = r7 + r0
            r1.setMargins(r5, r5, r5, r7)
            goto L_0x00b6
        L_0x0077:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r3)
            int r7 = r7 * 3
            r1.setMargins(r5, r5, r5, r7)
            goto L_0x00b6
        L_0x0087:
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r3)
            int r7 = r7 * 3
            r1.setMargins(r5, r5, r5, r7)
            goto L_0x00b6
        L_0x0097:
            ck3.b r7 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r0)
            zj3.c1 r7 = (zj3.C79344c1) r7
            boolean r7 = r7.mo102266Q2()
            if (r7 != 0) goto L_0x00b6
            ck3.b r7 = r6.f215752d
            android.content.res.Resources r7 = r7.mo91572m()
            int r7 = r7.getDimensionPixelSize(r3)
            int r7 = r7 * 3
            r1.setMargins(r5, r5, r5, r7)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73642w3.mo102666Y5(int):void");
    }

    /* renamed from: e */
    public void mo70065e() {
        View c = this.f215752d.mo91562c(C0966R.C0970id.b5j);
        this.f216237e = c;
        if (c != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = c;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f216239g = 0;
            this.f216241i = 0;
        }
    }

    /* renamed from: f */
    public void mo102667f() {
        View view = this.f216237e;
        if (view != null) {
            if (view.getVisibility() == 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) this.f216237e.getWidth(), 0.0f, 0.0f);
                translateAnimation.setDuration(300);
                translateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.f215752d.mo91565f(), 17432581));
                this.f216237e.startAnimation(translateAnimation);
                this.f216241i = 0;
                this.f216239g = 0;
                this.f216240h = 0;
            }
            View view2 = this.f216237e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
    }

    /* renamed from: h1 */
    public void mo102668h1(View view, View.OnClickListener onClickListener) {
        C57704m mVar = this.f216238f;
        if (mVar != null) {
            mVar.dismiss();
            this.f216238f = null;
        }
        this.f216238f = new C57704m(view.getContext());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        try {
            C57704m mVar2 = this.f216238f;
            mVar2.f165155j = iArr[0];
            mVar2.f165156n = C76577a.m92151b(view.getContext(), 2);
            this.f216238f.f165157o = C76577a.m92151b(view.getContext(), 100);
            this.f216238f.mo82067a(view);
            this.f216238f.f165159q = onClickListener;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* renamed from: h3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102669h3(com.tencent.p014mm.storage.C72963f4 r12, com.tencent.p014mm.storage.C72963f4 r13, int r14) {
        /*
            r11 = this;
            java.lang.Class<zj3.e> r0 = zj3.C79348e.class
            android.view.View r1 = r11.f216237e
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            ck3.b r1 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r0)
            zj3.e r1 = (zj3.C79348e) r1
            if (r13 == 0) goto L_0x002e
            if (r12 == 0) goto L_0x002e
            long r2 = r13.getMsgId()
            long r4 = r11.f216241i
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            long r2 = r13.getMsgId()
            r11.f216239g = r2
            long r2 = r12.getMsgId()
            r11.f216241i = r2
            long r13 = (long) r14
            r11.f216240h = r13
        L_0x002e:
            ck3.b r13 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r0)
            zj3.e r13 = (zj3.C79348e) r13
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            r2 = 0
            r3 = 1
            if (r14 != 0) goto L_0x007e
            ck3.b r14 = r11.f215752d
            boolean r14 = r14.mo91585z()
            if (r14 != 0) goto L_0x007e
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85842m5(r14)
            if (r14 != 0) goto L_0x007e
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = eb0.C45628s0.m50738C(r14)
            if (r14 != 0) goto L_0x007e
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85816S4(r14)
            if (r14 != 0) goto L_0x007e
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85849t5(r14)
            if (r14 == 0) goto L_0x00ec
        L_0x007e:
            ck3.b r14 = r11.f215752d
            boolean r14 = r14.mo91582w()
            if (r14 != 0) goto L_0x00ec
            boolean r13 = r13.mo70071q1()
            if (r13 != 0) goto L_0x00ec
            ck3.b r13 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r0)
            zj3.e r13 = (zj3.C79348e) r13
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85840k5(r14)
            if (r14 != 0) goto L_0x00e6
            ck3.b r14 = r11.f215752d
            java.lang.String r14 = r14.mo91577r()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85806K4(r14)
            if (r14 == 0) goto L_0x00af
            goto L_0x00e6
        L_0x00af:
            ck3.b r14 = r11.f215752d
            com.tencent.mm.storage.z1 r14 = r14.mo91574o()
            boolean r14 = r14.mo62916m3()
            if (r14 == 0) goto L_0x00e4
            ug.c r14 = r13.getBizInfo()
            if (r14 == 0) goto L_0x00e4
            ug.c r14 = r13.getBizInfo()
            boolean r14 = r14.mo73507y2()
            if (r14 == 0) goto L_0x00d9
            java.lang.Class<ex0.d> r14 = ex0.C45696d.class
            k40.a r14 = f40.C86709a0.m107533q(r14)
            ex0.d r14 = (ex0.C45696d) r14
            boolean r14 = r14.k20()
            if (r14 == 0) goto L_0x00e6
        L_0x00d9:
            ug.c r13 = r13.getBizInfo()
            boolean r13 = r13.mo73506x2()
            if (r13 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r13 = 0
            goto L_0x00e7
        L_0x00e6:
            r13 = 1
        L_0x00e7:
            if (r13 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r13 = 0
            goto L_0x00ed
        L_0x00ec:
            r13 = 1
        L_0x00ed:
            r14 = 2
            java.lang.String r0 = "MicroMsg.QuoteMsgTongueComponent"
            if (r13 != 0) goto L_0x0150
            java.lang.Object[] r12 = new java.lang.Object[r14]
            ck3.b r13 = r11.f215752d
            java.lang.String r13 = r13.mo91577r()
            r12[r2] = r13
            boolean r13 = r1.mo70071q1()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r3] = r13
            java.lang.String r13 = "[tryShowTongue] no show tongue! username:%s isBizChat:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r13, r12)
            android.view.View r12 = r11.f216237e
            r13 = 8
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r13)
            java.lang.Object[] r4 = r14.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent"
            java.lang.String r6 = "tryShowTongue"
            java.lang.String r7 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/storage/MsgInfo;I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r12
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r14.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r4 = "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent"
            java.lang.String r5 = "tryShowTongue"
            java.lang.String r6 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/storage/MsgInfo;I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0150:
            java.lang.String r13 = "[update] mGoBackToHistoryMsgLayout VISIBLE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            ck3.b r13 = r11.f215752d
            r1 = 2131299242(0x7f090baa, float:1.821648E38)
            android.view.View r13 = r13.mo91562c(r1)
            android.widget.TextView r13 = (android.widget.TextView) r13
            ck3.b r1 = r11.f215752d
            android.content.res.Resources r1 = r1.mo91572m()
            r4 = 2131823619(0x7f110c03, float:1.9280043E38)
            java.lang.String r1 = r1.getString(r4)
            r13.setText(r1)
            android.view.View r13 = r11.f216237e
            com.tencent.mm.ui.chatting.component.w3$a r1 = new com.tencent.mm.ui.chatting.component.w3$a
            r1.<init>(r12)
            r13.setOnClickListener(r1)
            ck3.b r12 = r11.f215752d
            java.lang.Class<zj3.x> r13 = zj3.C79389x.class
            com.tencent.mm.ui.chatting.manager.a r12 = r12.f193278b
            xi.d r12 = r12.mo102812a(r13)
            zj3.x r12 = (zj3.C79389x) r12
            ck3.b r13 = r11.f215752d
            java.lang.String r13 = r13.mo91577r()
            boolean r12 = r12.mo102443k(r13)
            if (r12 != 0) goto L_0x024d
            android.view.View r12 = r11.f216237e
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x01a1
            java.lang.String r12 = "[showMsgTongue] has show!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r12)
            goto L_0x024d
        L_0x01a1:
            ck3.b r12 = r11.f215752d
            com.tencent.mm.pluginsdk.ui.tools.n0 r12 = r12.mo91570k()
            int r12 = r12.getFirstVisiblePosition()
            ck3.b r13 = r11.f215752d
            com.tencent.mm.pluginsdk.ui.tools.n0 r13 = r13.mo91570k()
            int r13 = r13.getLastVisiblePosition()
            int r12 = java.lang.Math.max(r12, r2)
            int r13 = java.lang.Math.max(r13, r2)
            if (r12 < 0) goto L_0x01f4
            ck3.b r1 = r11.f215752d
            com.tencent.mm.pluginsdk.ui.tools.n0 r1 = r1.mo91570k()
            com.tencent.mm.pluginsdk.ui.tools.m0 r1 = r1.mo81303l()
            int r1 = r1.getCount()
            if (r13 < r1) goto L_0x01d0
            goto L_0x01f4
        L_0x01d0:
            if (r12 > r13) goto L_0x021c
            ck3.b r14 = r11.f215752d
            com.tencent.mm.pluginsdk.ui.tools.n0 r14 = r14.mo91570k()
            com.tencent.mm.pluginsdk.ui.tools.m0 r14 = r14.mo81303l()
            java.lang.Object r14 = r14.getItem(r12)
            com.tencent.mm.storage.f4 r14 = (com.tencent.p014mm.storage.C72963f4) r14
            if (r14 != 0) goto L_0x01e5
            goto L_0x01f1
        L_0x01e5:
            long r4 = r11.f216239g
            long r6 = r14.getMsgId()
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x01f1
            r2 = 1
            goto L_0x021c
        L_0x01f1:
            int r12 = r12 + 1
            goto L_0x01d0
        L_0x01f4:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1[r2] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r1[r3] = r12
            ck3.b r12 = r11.f215752d
            com.tencent.mm.pluginsdk.ui.tools.n0 r12 = r12.mo91570k()
            com.tencent.mm.pluginsdk.ui.tools.m0 r12 = r12.mo81303l()
            int r12 = r12.getCount()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1[r14] = r12
            java.lang.String r12 = "invalid position %d-%d, cnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r1)
        L_0x021c:
            if (r2 == 0) goto L_0x0224
            java.lang.String r12 = "[showMsgTongue] is AheadMsgInScreen!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            goto L_0x024d
        L_0x0224:
            ck3.b r12 = r11.f215752d
            r12.mo91578s()
            ck3.b r12 = r11.f215752d
            java.lang.Class<zj3.d0> r13 = zj3.C79346d0.class
            com.tencent.mm.ui.chatting.manager.a r12 = r12.f193278b
            xi.d r12 = r12.mo102812a(r13)
            zj3.d0 r12 = (zj3.C79346d0) r12
            r12.mo102652f()
            android.view.View r12 = r11.f216237e
            java.lang.Runnable r13 = r11.f216242j
            r12.removeCallbacks(r13)
            android.view.View r12 = r11.f216237e
            com.tencent.mm.ui.chatting.component.x3 r13 = new com.tencent.mm.ui.chatting.component.x3
            r13.<init>(r11)
            r11.f216242j = r13
            r0 = 100
            r12.postDelayed(r13, r0)
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73642w3.mo102669h3(com.tencent.mm.storage.f4, com.tencent.mm.storage.f4, int):void");
    }
}
