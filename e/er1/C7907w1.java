package er1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8795q1;
import java.lang.ref.WeakReference;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C47883u;
import rx3.C13598b0;
import tf0.C64916p1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: er1.w1 */
public final class C7907w1 implements C11385n {

    /* renamed from: d */
    public static final C7907w1 f26566d = new C7907w1();

    /* renamed from: e */
    public static final String f26567e = "FinderPostPreCheckHelper";

    /* renamed from: f */
    public static final int f26568f = 1;

    /* renamed from: g */
    public static final int f26569g = 2;

    /* renamed from: h */
    public static final int f26570h = 3;

    /* renamed from: i */
    public static final int f26571i = 4;

    /* renamed from: j */
    public static final int f26572j = 5;

    /* renamed from: er1.w1$a */
    public static final class C7908a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C7908a f26573d = new C7908a();

        public final void onClick(DialogInterface dialogInterface, int i) {
            C7335d c = C86312j.m106911c(C8795q1.class);
            C87412m.m108593f(c, "getService(IFinderAgreeS…PhoneService::class.java)");
            ((C8795q1) c).mo9627ME(Boolean.FALSE);
        }
    }

    /* renamed from: er1.w1$b */
    public static final class C7909b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f26574a;

        /* renamed from: b */
        public final /* synthetic */ Context f26575b;

        public C7909b(C32224a<C13598b0> aVar, Context context) {
            this.f26574a = aVar;
            this.f26575b = context;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            C32224a<C13598b0> aVar = this.f26574a;
            if (aVar != null) {
                aVar.invoke();
            }
            C7907w1 w1Var = C7907w1.f26566d;
            Context context = this.f26575b;
            w1Var.getClass();
            Intent intent = new Intent();
            intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
            MMWizardActivity.m7017L7(context, intent);
        }
    }

    /* renamed from: er1.w1$c */
    public static final class C7910c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f26576d;

        /* renamed from: e */
        public final /* synthetic */ Context f26577e;

        public C7910c(C32224a<C13598b0> aVar, Context context) {
            this.f26576d = aVar;
            this.f26577e = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C32224a<C13598b0> aVar = this.f26576d;
            if (aVar != null) {
                aVar.invoke();
            }
            C7907w1 w1Var = C7907w1.f26566d;
            Context context = this.f26577e;
            w1Var.getClass();
            Intent intent = new Intent();
            intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
            MMWizardActivity.m7017L7(context, intent);
        }
    }

    /* renamed from: a */
    public final boolean mo9028a() {
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99475o5.mo60266n().intValue();
        if (intValue == 0) {
            return C58784w3.f168295a.mo83947m();
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue != 2) {
            return C58784w3.f168295a.mo83947m();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo9029b(Context context, Integer num, C32224a<C13598b0> aVar) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C37521f.f99374d.getClass();
        if (C37521f.f99466n5.mo60266n().intValue() == 1) {
            Log.m105924i(f26567e, "ignore all pre check");
            return true;
        }
        if (mo9028a()) {
            C58784w3 w3Var = C58784w3.f168295a;
            if (!w3Var.mo83913Z0()) {
                return true;
            }
            w3Var.getClass();
            boolean u = C61926c.m72696u(C66785b.f191882e.mo90673n0().mo62398d().f141692x, 8);
            if (w3Var.mo83910X0()) {
                Log.m105924i(C58784w3.f168296b, "[checkAgreeGetPhone] " + u);
            }
            boolean z = !u;
            if (z) {
                FinderBottomCustomDialogHelper.Companion companion = FinderBottomCustomDialogHelper.Companion;
                String string = context2.getString(C0966R.string.f360487d52);
                String string2 = context2.getString(C0966R.string.d4z);
                String string3 = context2.getString(C0966R.string.f360485d50);
                String string4 = context2.getString(C0966R.string.d4u);
                C7908a aVar2 = C7908a.f26573d;
                C87412m.m108593f(string2, "getString(R.string.finde…t_dialog_foreign_content)");
                FinderBottomCustomDialogHelper.Companion.showConfirmTextDialog$default(companion, context, (Drawable) null, 0, string, string2, string3, string4, (Integer) null, aVar2, Boolean.FALSE, (DialogInterface.OnClickListener) null, (DialogInterface.OnDismissListener) null, 3206, (Object) null);
            }
            Log.m105924i(f26567e, "[checkHasBindPhone] show argee save phone");
            if (!z) {
                return true;
            }
        } else {
            mo9030c(context, num, aVar);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9030c(android.content.Context r17, java.lang.Integer r18, fy3.C32224a<rx3.C13598b0> r19) {
        /*
            r16 = this;
            r1 = r17
            r0 = r19
            int r2 = f26568f
            java.lang.String r3 = ""
            r4 = 1
            if (r18 != 0) goto L_0x000c
            goto L_0x001b
        L_0x000c:
            int r5 = r18.intValue()
            if (r5 != r2) goto L_0x001b
            r5 = 2131826380(0x7f1116cc, float:1.9285643E38)
            java.lang.String r5 = r1.getString(r5)
            goto L_0x0084
        L_0x001b:
            int r5 = f26569g
            if (r18 != 0) goto L_0x0020
            goto L_0x002e
        L_0x0020:
            int r6 = r18.intValue()
            if (r6 != r5) goto L_0x002e
            r5 = 2131826381(0x7f1116cd, float:1.9285645E38)
            java.lang.String r5 = r1.getString(r5)
            goto L_0x0084
        L_0x002e:
            int r5 = f26570h
            r6 = 0
            r7 = 2131826473(0x7f111729, float:1.9285831E38)
            if (r18 != 0) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            int r8 = r18.intValue()
            if (r8 != r5) goto L_0x004d
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r8 = 2131826476(0x7f11172c, float:1.9285837E38)
            java.lang.String r8 = r1.getString(r8)
            r5[r6] = r8
            java.lang.String r5 = r1.getString(r7, r5)
            goto L_0x0084
        L_0x004d:
            int r5 = f26571i
            if (r18 != 0) goto L_0x0052
            goto L_0x0068
        L_0x0052:
            int r8 = r18.intValue()
            if (r8 != r5) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r8 = 2131826475(0x7f11172b, float:1.9285835E38)
            java.lang.String r8 = r1.getString(r8)
            r5[r6] = r8
            java.lang.String r5 = r1.getString(r7, r5)
            goto L_0x0084
        L_0x0068:
            int r5 = f26572j
            if (r18 != 0) goto L_0x006d
            goto L_0x0083
        L_0x006d:
            int r8 = r18.intValue()
            if (r8 != r5) goto L_0x0083
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r8 = 2131826474(0x7f11172a, float:1.9285833E38)
            java.lang.String r8 = r1.getString(r8)
            r5[r6] = r8
            java.lang.String r5 = r1.getString(r7, r5)
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            java.lang.String r6 = "when (formScene) {\n     …     else -> \"\"\n        }"
            gy3.C87412m.m108593f(r5, r6)
            if (r18 != 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            int r7 = r18.intValue()
            if (r7 != r2) goto L_0x009c
            r2 = 2131826376(0x7f1116c8, float:1.9285635E38)
            java.lang.String r2 = r1.getString(r2)
        L_0x009a:
            r7 = r2
            goto L_0x00b0
        L_0x009c:
            int r2 = f26569g
            if (r18 != 0) goto L_0x00a1
            goto L_0x00af
        L_0x00a1:
            int r7 = r18.intValue()
            if (r7 != r2) goto L_0x00af
            r2 = 2131826377(0x7f1116c9, float:1.9285637E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x009a
        L_0x00af:
            r7 = r3
        L_0x00b0:
            gy3.C87412m.m108593f(r7, r6)
            er1.w3 r2 = er1.C58784w3.f168295a
            boolean r2 = r2.mo83913Z0()
            r3 = 2131826368(0x7f1116c0, float:1.9285618E38)
            r6 = 2131826369(0x7f1116c1, float:1.928562E38)
            if (r2 != 0) goto L_0x0114
            int r2 = f26570h
            if (r18 != 0) goto L_0x00c6
            goto L_0x00cc
        L_0x00c6:
            int r8 = r18.intValue()
            if (r8 == r2) goto L_0x0114
        L_0x00cc:
            int r2 = f26571i
            if (r18 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r8 = r18.intValue()
            if (r8 == r2) goto L_0x0114
        L_0x00d7:
            int r2 = f26572j
            if (r18 != 0) goto L_0x00dc
            goto L_0x00e3
        L_0x00dc:
            int r8 = r18.intValue()
            if (r8 != r2) goto L_0x00e3
            goto L_0x0114
        L_0x00e3:
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion r2 = com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r8 = r1.getString(r3)
            er1.w1$c r9 = new er1.w1$c
            r9.<init>(r0, r1)
            r3 = 0
            r4 = 0
            r10 = 0
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12 = 0
            r13 = 0
            r14 = 3206(0xc86, float:4.493E-42)
            r15 = 0
            r0 = r2
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion.showConfirmTextDialog$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = f26567e
            java.lang.String r1 = "[checkHasBindPhone] isUserWxForeign false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x013f
        L_0x0114:
            qo3.q r2 = new qo3.q
            r2.<init>(r1)
            r2.mo107595g(r5)
            r2.mo107589a(r4)
            java.lang.String r4 = r1.getString(r6)
            r2.mo107602n(r4)
            java.lang.String r3 = r1.getString(r3)
            r2.mo107598j(r3)
            er1.w1$b r3 = new er1.w1$b
            r3.<init>(r0, r1)
            r2.mo107600l(r3)
            r2.mo107603o()
            java.lang.String r0 = f26567e
            java.lang.String r1 = "[checkHasBindPhone] isUserWxForeign true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7907w1.mo9030c(android.content.Context, java.lang.Integer, fy3.a):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Activity activity;
        boolean z = false;
        if (!(yVar != null && yVar.getType() == 3862)) {
            if (!(yVar != null && yVar.getType() == 7143)) {
                if (yVar != null && yVar.getType() == 3906) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
        }
        if (i != 0) {
            String str2 = f26567e;
            Log.m105924i(str2, "errType=" + i + " errCode=" + i2);
        }
        if (i2 != -4300) {
            C37521f.f99374d.getClass();
            if (C37521f.f99475o5.mo60266n().intValue() != 2) {
                return;
            }
        }
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        C13598b0 b0Var = null;
        if (!(g == null || (activity = g.get()) == null)) {
            if (((C64916p1) C86312j.m106911c(C64916p1.class)).q90()) {
                int type = yVar.getType();
                if (type == 3862) {
                    f26566d.mo9030c(activity, Integer.valueOf(f26570h), (C32224a<C13598b0>) null);
                } else if (type == 3906) {
                    f26566d.mo9030c(activity, Integer.valueOf(f26571i), (C32224a<C13598b0>) null);
                } else if (type == 7143) {
                    f26566d.mo9030c(activity, Integer.valueOf(f26572j), (C32224a<C13598b0>) null);
                }
            } else {
                String str3 = f26567e;
                Log.m105920e(str3, "getTopActivity is in finder! " + activity.getClass().getName());
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e(f26567e, "getTopActivity is null!");
        }
    }
}
