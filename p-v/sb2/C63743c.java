package sb2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59822f;
import hb2.C59830o;
import hb2.C59833q;
import j20.C117292a;
import java.util.ArrayList;
import jb2.C46469u;
import nb2.C61646d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import te3.C64435i23;
import te3.C64482k23;
import te3.C64488kb1;
import te3.C64511l23;

/* renamed from: sb2.c */
public final class C63743c extends UIComponent {

    /* renamed from: d */
    public final String f180696d = "MicroMsg.MusicMvCommentUIC";

    /* renamed from: e */
    public final C13601g f180697e;

    /* renamed from: f */
    public final C13601g f180698f;

    /* renamed from: g */
    public final C13601g f180699g;

    /* renamed from: h */
    public View f180700h;

    /* renamed from: i */
    public View f180701i;

    /* renamed from: j */
    public View f180702j;

    /* renamed from: n */
    public final C13643k1 f180703n;

    /* renamed from: o */
    public boolean f180704o;

    /* renamed from: sb2.c$a */
    public static final class C63744a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63743c f180705d;

        public C63744a(C63743c cVar) {
            this.f180705d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f180705d.f180696d, "click comment input");
            C63743c cVar = this.f180705d;
            cVar.f180704o = true;
            View view2 = cVar.f180700h;
            if (view2 != null) {
                C13643k1 k1Var = cVar.f180703n;
                k1Var.mo13035a(view2);
                k1Var.mo13036b(C110826x0.m151017e(Integer.valueOf(C0966R.C0970id.b7j), Integer.valueOf(C0966R.C0970id.b55), Integer.valueOf(C0966R.C0970id.f358390ev0), Integer.valueOf(C0966R.C0970id.gju), Integer.valueOf(C0966R.C0970id.m8k)));
            }
            cVar.mo88563e3().setVisibility(0);
            ((MusicMvCommentFooter) ((C36570n) cVar.f180698f).getValue()).setVisibility(0);
            cVar.mo88563e3().setAlpha(0.0f);
            cVar.mo88563e3().animate().alpha(1.0f).setDuration(200).start();
            View view3 = cVar.f180702j;
            ViewGroup viewGroup = (ViewGroup) (view3 != null ? view3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(cVar.f180702j);
            }
            ((ViewGroup) ((C36570n) cVar.f180699g).getValue()).addView(cVar.f180702j);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.c$b */
    public static final class C63745b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63743c f180706d;

        public C63745b(C63743c cVar) {
            this.f180706d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63743c.m75009c3(this.f180706d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.c$c */
    public static final class C63746c implements MusicMvCommentFooter.C57088a {

        /* renamed from: a */
        public final /* synthetic */ C63743c f180707a;

        /* renamed from: b */
        public final /* synthetic */ C61646d f180708b;

        public C63746c(C63743c cVar, C61646d dVar) {
            this.f180707a = cVar;
            this.f180708b = dVar;
        }

        /* renamed from: a */
        public void mo80540a(String str, String str2) {
            String str3;
            FinderObject d;
            String str4;
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    C61646d dVar = this.f180708b;
                    C59830o oVar = C59830o.f170808a;
                    C59822f fVar = dVar.f175298d;
                    C87412m.m108594g(fVar, "musicMv");
                    C64488kb1 kb12 = C59830o.f170818k;
                    if (!(kb12 == null || (str3 = kb12.f183909i) == null || Util.isNullOrNil(str))) {
                        C64482k23 k232 = new C64482k23();
                        C64435i23 i232 = new C64435i23();
                        i232.f183594d = 1;
                        C64511l23 l232 = new C64511l23();
                        i232.f183595e = l232;
                        l232.f184027d = str;
                        k232.f183878h = String.valueOf(C31543z5.m39453c());
                        k232.f183879i = str3;
                        k232.f183876f = C75592q0.m90783m();
                        k232.f183874d = i232;
                        k232.f183880j = (int) (System.currentTimeMillis() / ((long) 1000));
                        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", "postLiveMsg isMvWithBeat:" + fVar.f170778z);
                        if (!fVar.f170778z && (d = C59822f.f170752A.mo84779d(fVar)) != null) {
                            k232.f183882o = d.f164794id;
                            k232.f183883p = d.objectNonceId;
                            FinderContact finderContact = d.contact;
                            if (finderContact == null || (str4 = finderContact.nickname) == null) {
                                str4 = "";
                            }
                            k232.f183884q = str4;
                        }
                        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", "postLiveMsg msg.objectId:" + k232.f183882o + " msg.objectNonceId:" + k232.f183883p);
                        C46469u uVar = C59830o.f170826s;
                        if (uVar != null) {
                            C86709a0.m107524d().mo123458d(uVar);
                        }
                        C64488kb1 kb13 = C59830o.f170818k;
                        if (kb13 != null) {
                            C59830o.f170826s = new C46469u(k232, kb13, 1);
                            C86709a0.m107524d().mo123460f(C59830o.f170826s);
                        }
                        C64488kb1 kb14 = C59830o.f170818k;
                        Activity activity = C59830o.f170829v;
                        if (!(kb14 == null || activity == null)) {
                            C59833q.f170832a.mo84793d(activity, kb14, fVar, 1, 0);
                        }
                    }
                }
            }
            C63743c.m75009c3(this.f180707a);
        }
    }

    /* renamed from: sb2.c$d */
    public static final class C63747d extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63747d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180709d = appCompatActivity;
        }

        public Object invoke() {
            return (ViewGroup) this.f180709d.findViewById(C0966R.C0970id.b7i);
        }
    }

    /* renamed from: sb2.c$e */
    public static final class C63748e extends C87413o implements C32224a<MusicMvCommentFooter> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63748e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180710d = appCompatActivity;
        }

        public Object invoke() {
            return (MusicMvCommentFooter) this.f180710d.findViewById(C0966R.C0970id.b55);
        }
    }

    /* renamed from: sb2.c$f */
    public static final class C63749f extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63749f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180711d = appCompatActivity;
        }

        public Object invoke() {
            return (ViewGroup) this.f180711d.findViewById(C0966R.C0970id.gpp);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63743c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180697e = C36568h.m40985a(new C63747d(appCompatActivity));
        this.f180698f = C36568h.m40985a(new C63748e(appCompatActivity));
        this.f180699g = C36568h.m40985a(new C63749f(appCompatActivity));
        this.f180703n = new C13643k1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75009c3(sb2.C63743c r16) {
        /*
            r0 = r16
            r1 = 0
            r0.f180704o = r1
            sb2.k1 r2 = r0.f180703n
            java.util.HashMap<java.lang.Integer, sb2.k1$b> r3 = r2.f38657b
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0011:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r4 = r3.next()
            sb2.k1$b r4 = (sb2.C13643k1.C13646b) r4
            boolean r6 = r4.f38664e
            if (r6 == 0) goto L_0x0011
            android.view.View r6 = r2.f38656a
            if (r6 == 0) goto L_0x002c
            int r5 = r4.f38660a
            android.view.View r5 = r6.findViewById(r5)
        L_0x002c:
            if (r5 != 0) goto L_0x002f
            goto L_0x0011
        L_0x002f:
            android.view.ViewPropertyAnimator r6 = r5.animate()
            r6.cancel()
            int r6 = r4.f38661b
            if (r6 != 0) goto L_0x0094
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13.mo10233c(r6)
            java.lang.Object[] r7 = r13.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord"
            java.lang.String r9 = "restore"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r6 = r5
            r14 = r13
            r13 = r15
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord"
            java.lang.String r8 = "restore"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.ViewPropertyAnimator r5 = r5.animate()
            float r4 = r4.f38662c
            android.view.ViewPropertyAnimator r4 = r5.alpha(r4)
            r6 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r6)
            r4.start()
            goto L_0x0011
        L_0x0094:
            r6 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r8 = r5.animate()
            float r9 = r4.f38662c
            android.view.ViewPropertyAnimator r8 = r8.alpha(r9)
            android.view.ViewPropertyAnimator r6 = r8.setDuration(r6)
            sb2.m1 r7 = new sb2.m1
            r7.<init>(r5, r4)
            android.view.ViewPropertyAnimator r4 = r6.withEndAction(r7)
            r4.start()
            goto L_0x0011
        L_0x00b2:
            java.util.HashMap<java.lang.Integer, sb2.k1$b> r1 = r2.f38657b
            r1.clear()
            android.view.ViewGroup r1 = r16.mo88563e3()
            r2 = 8
            r1.setVisibility(r2)
            rx3.g r1 = r0.f180698f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter) r1
            r1.setVisibility(r2)
            android.view.View r1 = r0.f180702j
            if (r1 == 0) goto L_0x00d5
            android.view.ViewParent r5 = r1.getParent()
        L_0x00d5:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x00de
            android.view.View r1 = r0.f180702j
            r5.removeView(r1)
        L_0x00de:
            android.view.View r1 = r0.f180700h
            if (r1 == 0) goto L_0x00f2
            r2 = 2131309255(0x7f0932c7, float:1.8236789E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00f2
            android.view.View r0 = r0.f180702j
            r1.addView(r0)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63743c.m75009c3(sb2.c):void");
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88562d3(android.view.View r5, nb2.C61646d r6) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = r4.f180696d
            java.lang.String r1 = "bindView: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.View r0 = r4.f180701i
            r1 = 0
            if (r0 == 0) goto L_0x0014
            r0.setOnClickListener(r1)
        L_0x0014:
            boolean r0 = r4.f180704o
            r2 = 2131299984(0x7f090e90, float:1.8217985E38)
            if (r0 == 0) goto L_0x0077
            android.view.View r0 = r4.f180700h
            if (r0 == 0) goto L_0x0081
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 != 0) goto L_0x0081
            android.view.View r0 = r4.f180702j
            if (r0 == 0) goto L_0x002e
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0038
            android.view.View r3 = r4.f180702j
            r0.removeView(r3)
        L_0x0038:
            android.view.View r0 = r4.f180700h
            if (r0 == 0) goto L_0x004c
            r3 = 2131309255(0x7f0932c7, float:1.8236789E38)
            android.view.View r0 = r0.findViewById(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x004c
            android.view.View r3 = r4.f180702j
            r0.addView(r3)
        L_0x004c:
            if (r5 == 0) goto L_0x0053
            android.view.View r0 = r5.findViewById(r2)
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            r4.f180702j = r0
            if (r0 == 0) goto L_0x005d
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0067
            android.view.View r2 = r4.f180702j
            r0.removeView(r2)
        L_0x0067:
            rx3.g r0 = r4.f180699g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r4.f180702j
            r0.addView(r2)
            goto L_0x0081
        L_0x0077:
            if (r5 == 0) goto L_0x007e
            android.view.View r0 = r5.findViewById(r2)
            goto L_0x007f
        L_0x007e:
            r0 = r1
        L_0x007f:
            r4.f180702j = r0
        L_0x0081:
            r4.f180700h = r5
            if (r5 == 0) goto L_0x008f
            r0 = 2131300003(0x7f090ea3, float:1.8218023E38)
            android.view.View r5 = r5.findViewById(r0)
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x008f:
            r4.f180701i = r1
            if (r1 == 0) goto L_0x009b
            sb2.c$a r5 = new sb2.c$a
            r5.<init>(r4)
            r1.setOnClickListener(r5)
        L_0x009b:
            android.view.ViewGroup r5 = r4.mo88563e3()
            sb2.c$b r0 = new sb2.c$b
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            rx3.g r5 = r4.f180698f
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter r5 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter) r5
            sb2.c$c r0 = new sb2.c$c
            r0.<init>(r4, r6)
            r5.setOnCommentSendImp(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63743c.mo88562d3(android.view.View, nb2.d):void");
    }

    /* renamed from: e3 */
    public final ViewGroup mo88563e3() {
        return (ViewGroup) ((C36570n) this.f180697e).getValue();
    }
}
