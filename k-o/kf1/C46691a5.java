package kf1;

import ak1.C0077k0;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C49098d51;
import te3.C49310eo0;
import te3.C49712hj1;
import te3.C52083y81;
import tf0.C13887q1;

/* renamed from: kf1.a5 */
public final class C46691a5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f125692d;

    /* renamed from: e */
    public final /* synthetic */ C46715z4 f125693e;

    /* renamed from: f */
    public final /* synthetic */ C49310eo0 f125694f;

    /* renamed from: g */
    public final /* synthetic */ String f125695g;

    /* renamed from: h */
    public final /* synthetic */ MMActivity f125696h;

    /* renamed from: kf1.a5$a */
    public static final class C46692a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C46715z4 f125697d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f125698e;

        public C46692a(C46715z4 z4Var, MMActivity mMActivity) {
            this.f125697d = z4Var;
            this.f125698e = mMActivity;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                this.f125697d.getClass();
                e0Var.mo107140d(C46715z4.f125757c, this.f125698e.getContext().getResources().getColor(C0966R.color.f2966ao), this.f125698e.getContext().getResources().getString(C0966R.string.e08));
            }
        }
    }

    /* renamed from: kf1.a5$b */
    public static final class C46693b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C46715z4 f125699d;

        /* renamed from: e */
        public final /* synthetic */ C49310eo0 f125700e;

        /* renamed from: f */
        public final /* synthetic */ String f125701f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C89779i0> f125702g;

        /* renamed from: h */
        public final /* synthetic */ MMActivity f125703h;

        /* renamed from: i */
        public final /* synthetic */ C46694c f125704i;

        /* renamed from: j */
        public final /* synthetic */ int f125705j;

        public C46693b(C46715z4 z4Var, C49310eo0 eo02, String str, C8479f0<C89779i0> f0Var, MMActivity mMActivity, C46694c cVar, int i) {
            this.f125699d = z4Var;
            this.f125700e = eo02;
            this.f125701f = str;
            this.f125702g = f0Var;
            this.f125703h = mMActivity;
            this.f125704i = cVar;
            this.f125705j = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            String str2;
            int itemId = menuItem.getItemId();
            this.f125699d.getClass();
            if (itemId == C46715z4.f125757c) {
                C46691a5.m51999a(this.f125702g, this.f125703h, this.f125704i, this.f125700e, this.f125705j);
                this.f125699d.getClass();
                C46715z4.f125758d = 7;
                C46715z4 z4Var = this.f125699d;
                C0077k0 k0Var = C0077k0.Cancle;
                C49310eo0 eo02 = this.f125700e;
                FinderContact finderContact = eo02.f133028f;
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = "";
                }
                C52083y81 y812 = eo02.f133027e;
                long j = y812 != null ? y812.f145171f : 0;
                String str3 = this.f125701f;
                C49098d51 d512 = eo02.f133026d;
                z4Var.mo71958c(k0Var, str, j, str3, (d512 == null || (str2 = d512.f132122h) == null) ? "" : str2);
            }
        }
    }

    /* renamed from: kf1.a5$c */
    public static final class C46694c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f125706d;

        /* renamed from: e */
        public final /* synthetic */ int f125707e;

        /* renamed from: f */
        public final /* synthetic */ MMActivity f125708f;

        /* renamed from: g */
        public final /* synthetic */ C46715z4 f125709g;

        public C46694c(C8479f0<C89779i0> f0Var, int i, MMActivity mMActivity, C46715z4 z4Var) {
            this.f125706d = f0Var;
            this.f125707e = i;
            this.f125708f = mMActivity;
            this.f125709g = z4Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89779i0 i0Var;
            C86709a0.m107524d().mo123470p(6276, this);
            C89779i0 i0Var2 = (C89779i0) this.f125706d.f27484d;
            if ((i0Var2 != null && i0Var2.isShowing()) && (i0Var = (C89779i0) this.f125706d.f27484d) != null) {
                i0Var.dismiss();
            }
            if (i == 0 && i2 == 0) {
                String string = this.f125707e == 1 ? this.f125708f.getContext().getString(C0966R.string.e6g) : this.f125708f.getContext().getString(C0966R.string.e6e);
                C87412m.m108593f(string, "if(op == ConstantsFinder…                        }");
                C76912y0.m92773l(this.f125708f.getContext(), string);
            } else {
                this.f125709g.getClass();
                C46715z4.f125758d = 0;
                C76912y0.m92773l(this.f125708f.getContext(), this.f125708f.getContext().getString(C0966R.string.dwo));
            }
            this.f125709g.getClass();
            C77407n nVar = C46715z4.f125756b;
            if (nVar != null) {
                nVar.mo107572p();
            }
        }
    }

    public C46691a5(int i, C46715z4 z4Var, C49310eo0 eo02, String str, MMActivity mMActivity) {
        this.f125692d = i;
        this.f125693e = z4Var;
        this.f125694f = eo02;
        this.f125695g = str;
        this.f125696h = mMActivity;
    }

    /* renamed from: a */
    public static final void m51999a(C8479f0<C89779i0> f0Var, MMActivity mMActivity, C46694c cVar, C49310eo0 eo02, int i) {
        String str;
        C49310eo0 eo03 = eo02;
        String str2 = null;
        f0Var.f27484d = C89779i0.m112248e(mMActivity.getContext(), mMActivity.getContext().getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
        C86709a0.m107524d().mo123455a(6276, cVar);
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1 q1Var = (C13887q1) c;
        FinderContact finderContact = eo03.f133028f;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        String str3 = str;
        C49098d51 d512 = eo03.f133026d;
        if (d512 != null) {
            str2 = d512.f132122h;
        }
        String str4 = str2;
        C87412m.m108591d(str4);
        C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a(q1Var, str3, str4, i, (C49712hj1) null, (String) null, 201, (Long) null, 80, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0044, code lost:
        r1 = r1.username;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r6 = r21
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r22
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher$refreshContentView$6$refreshReserveBtn$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r21
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            kf1.a5$c r13 = new kf1.a5$c
            int r0 = r6.f125692d
            com.tencent.mm.ui.MMActivity r1 = r6.f125696h
            kf1.z4 r2 = r6.f125693e
            r13.<init>(r11, r0, r1, r2)
            r2 = 1
            if (r0 != r2) goto L_0x0079
            te3.eo0 r2 = r6.f125694f
            m51999a(r11, r1, r13, r2, r0)
            kf1.z4 r14 = r6.f125693e
            ak1.k0 r15 = ak1.C0077k0.Book
            te3.eo0 r0 = r6.f125694f
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r0.f133028f
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r1.username
            if (r1 != 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r16 = r1
            goto L_0x004e
        L_0x004c:
            r16 = r2
        L_0x004e:
            te3.y81 r1 = r0.f133027e
            if (r1 == 0) goto L_0x0055
            long r3 = r1.f145171f
            goto L_0x0057
        L_0x0055:
            r3 = 0
        L_0x0057:
            r17 = r3
            java.lang.String r1 = r6.f125695g
            te3.d51 r0 = r0.f133026d
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r0.f132122h
            if (r0 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r20 = r0
            goto L_0x0069
        L_0x0067:
            r20 = r2
        L_0x0069:
            kf1.z4 r0 = kf1.C46715z4.f125755a
            r19 = r1
            r14.mo71958c(r15, r16, r17, r19, r20)
            kf1.z4 r0 = r6.f125693e
            r1 = 6
            r0.getClass()
            kf1.C46715z4.f125758d = r1
            goto L_0x009e
        L_0x0079:
            qo3.n r0 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
            r0.<init>((android.content.Context) r1, (int) r2, (boolean) r2)
            kf1.a5$a r1 = new kf1.a5$a
            kf1.z4 r8 = r6.f125693e
            com.tencent.mm.ui.MMActivity r12 = r6.f125696h
            r1.<init>(r8, r12)
            r0.f225771i = r1
            kf1.a5$b r1 = new kf1.a5$b
            te3.eo0 r9 = r6.f125694f
            java.lang.String r10 = r6.f125695g
            int r14 = r6.f125692d
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.f225782p = r1
            r0.mo107573q()
        L_0x009e:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher$refreshContentView$6$refreshReserveBtn$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C46691a5.onClick(android.view.View):void");
    }
}
