package ed1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8783m1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qo3.C12925w;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: ed1.a */
public final class C7632a extends UIComponent implements C8783m1 {

    /* renamed from: d */
    public C12925w f25937d;

    /* renamed from: e */
    public boolean f25938e;

    /* renamed from: ed1.a$a */
    public static final class C7633a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7632a f25939d;

        public C7633a(C7632a aVar) {
            this.f25939d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
            r9 = r5.mo75251m2().f132491H;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r15) {
            /*
                r14 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r15)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r14
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                ed1.a r15 = r14.f25939d
                java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                qo3.w r2 = r15.f25937d
                java.lang.String r3 = "bottomSheet"
                r4 = 0
                if (r2 == 0) goto L_0x0144
                zc1.b r5 = zc1.C66785b.f191882e
                r6 = 0
                r7 = 1
                bd1.b r5 = zc1.C66783a.C66784a.m78800c(r5, r6, r7, r4)
                android.view.View r8 = r2.f36927f
                r9 = 2131302590(0x7f0918be, float:1.822327E38)
                android.view.View r8 = r8.findViewById(r9)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                if (r5 == 0) goto L_0x0048
                te3.dr2 r9 = r5.mo75251m2()
                te3.yu2 r9 = r9.f132491H
                if (r9 == 0) goto L_0x0048
                java.lang.String r9 = r9.f145515f
                goto L_0x0049
            L_0x0048:
                r9 = r4
            L_0x0049:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x008c
                bl3.r r9 = bl3.C39818r.f106831a
                bl3.r$a r10 = r9.mo62446e(r1)
                bl3.c r10 = r10.mo62447c(r0)
                pl1.s0 r10 = (pl1.C11990s0) r10
                k60.d r10 = r10.mo11865K1()
                pl1.f r11 = new pl1.f
                if (r5 == 0) goto L_0x006e
                te3.dr2 r12 = r5.mo75251m2()
                te3.yu2 r12 = r12.f132491H
                if (r12 == 0) goto L_0x006e
                java.lang.String r12 = r12.f145515f
                goto L_0x006f
            L_0x006e:
                r12 = r4
            L_0x006f:
                r13 = 2
                r11.<init>(r12, r4, r13, r4)
                java.lang.String r12 = "this"
                gy3.C87412m.m108593f(r8, r12)
                pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
                bl3.r$a r1 = r9.mo62446e(r1)
                bl3.c r0 = r1.mo62447c(r0)
                pl1.s0 r0 = (pl1.C11990s0) r0
                n60.f r0 = r0.mo11867O2(r12)
                r10.mo85957c(r11, r8, r0)
            L_0x008c:
                android.view.View r0 = r2.f36927f
                r1 = 2131302592(0x7f0918c0, float:1.8223274E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.text.TextPaint r0 = r0.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r0)
                if (r5 == 0) goto L_0x00a3
                java.lang.String r0 = r5.field_nickname
                goto L_0x00a4
            L_0x00a3:
                r0 = r4
            L_0x00a4:
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x00a9
                r0 = r1
            L_0x00a9:
                int r8 = r0.length()
                if (r8 <= 0) goto L_0x00b1
                r8 = 1
                goto L_0x00b2
            L_0x00b1:
                r8 = 0
            L_0x00b2:
                if (r8 == 0) goto L_0x00d9
                android.view.View r8 = r2.f36927f
                r9 = 2131302598(0x7f0918c6, float:1.8223287E38)
                android.view.View r8 = r8.findViewById(r9)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.Class<ny.h> r9 = p629ny.C76979h.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                ny.h r9 = (p629ny.C76979h) r9
                android.content.Context r10 = r8.getContext()
                android.text.SpannableString r0 = r9.mo107057T1(r10, r0)
                r8.setText(r0)
                android.text.TextPaint r0 = r8.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r0)
            L_0x00d9:
                if (r5 == 0) goto L_0x00e9
                te3.dr2 r0 = r5.mo75251m2()
                te3.yu2 r0 = r0.f132491H
                if (r0 == 0) goto L_0x00e9
                java.lang.String r0 = r0.f145513d
                if (r0 != 0) goto L_0x00e8
                goto L_0x00e9
            L_0x00e8:
                r1 = r0
            L_0x00e9:
                android.view.View r0 = r2.f36927f
                r5 = 2131302594(0x7f0918c2, float:1.8223279E38)
                android.view.View r0 = r0.findViewById(r5)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.app.Activity r5 = r15.getContext()
                android.content.res.Resources r5 = r5.getResources()
                r8 = 2131826018(0x7f111562, float:1.9284909E38)
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r9[r6] = r1
                java.lang.String r5 = r5.getString(r8, r9)
                r0.setText(r5)
                android.view.View r0 = r2.f36927f
                r2 = 2131302604(0x7f0918cc, float:1.8223299E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.app.Activity r15 = r15.getContext()
                android.content.res.Resources r15 = r15.getResources()
                r2 = 2131830101(0x7f112555, float:1.929319E38)
                java.lang.Object[] r5 = new java.lang.Object[r7]
                r5[r6] = r1
                java.lang.String r15 = r15.getString(r2, r5)
                r0.setText(r15)
                ed1.a r15 = r14.f25939d
                qo3.w r15 = r15.f25937d
                if (r15 == 0) goto L_0x0140
                r15.mo5086o()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r14, r15, r0, r1, r2)
                return
            L_0x0140:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x0144:
                gy3.C87412m.m108603p(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ed1.C7632a.C7633a.onClick(android.view.View):void");
        }
    }

    /* renamed from: ed1.a$b */
    public static final class C7634b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12925w f25940d;

        public C7634b(C12925w wVar) {
            this.f25940d = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25940d.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7632a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: A */
    public void mo8759A() {
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        this.f25938e = c != null ? c.mo75252n2() : false;
        View findViewById = findViewById(C0966R.C0970id.nta);
        if (findViewById != null) {
            int i = this.f25938e ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC", "initAccCompleteTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC", "initAccCompleteTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C7633a(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12925w wVar = new C12925w(getContext());
        wVar.mo12470j(C0966R.C0971layout.d3x);
        wVar.f36933o = true;
        wVar.f36927f.findViewById(C0966R.C0970id.ntl).setOnClickListener(new C7634b(wVar));
        this.f25937d = wVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7632a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
