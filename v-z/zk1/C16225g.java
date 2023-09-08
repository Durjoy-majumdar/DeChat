package zk1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import te3.C49540gb3;
import te3.C49712hj1;
import te3.C51773w21;
import te3.C52204z21;
import tf0.C13883o1;
import up1.C37521f;

/* renamed from: zk1.g */
public final class C16225g extends UIComponent {

    /* renamed from: zk1.g$a */
    public static final class C16226a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f43452d;

        public C16226a(MMActivity mMActivity) {
            this.f43452d = mMActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f43452d.finish();
            return true;
        }
    }

    /* renamed from: zk1.g$b */
    public static final class C16227b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16225g f43453d;

        /* renamed from: e */
        public final /* synthetic */ C52204z21 f43454e;

        /* renamed from: f */
        public final /* synthetic */ long f43455f;

        /* renamed from: g */
        public final /* synthetic */ C49712hj1 f43456g;

        /* renamed from: h */
        public final /* synthetic */ String f43457h;

        public C16227b(C16225g gVar, C52204z21 z212, long j, C49712hj1 hj12, String str) {
            this.f43453d = gVar;
            this.f43454e = z212;
            this.f43455f = j;
            this.f43456g = hj12;
            this.f43457h = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C37521f.f99374d.getClass();
            if (C37521f.f99376d2.mo60266n().intValue() <= 0) {
                C76912y0.makeText(view.getContext(), (CharSequence) view.getContext().getResources().getString(C0966R.string.d2x), 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C51773w21 w212 = new C51773w21();
            w212.f143824d = this.f43457h;
            w212.f143829i = false;
            C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
            AppCompatActivity activity = this.f43453d.getActivity();
            C52204z21 z212 = this.f43454e;
            C49540gb3 gb32 = z212.f145651r;
            int i = gb32 != null ? gb32.f133951d : 0;
            String str = z212.f145640d;
            if (str == null) {
                str = "";
            }
            o1Var.mo13254H9(activity, i, w212, str, this.f43455f, this.f43456g, false);
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.my0((C54116w) c, C54067f0.C0071v0.CLICK_WIN_DETAIL_ENTER_PRIVATE_UI, "", (String) null, 0, 12, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16225g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aht;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            super.onCreate(r19)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r2 = 2131828127(0x7f111d9f, float:1.9289186E38)
            r0.setMMTitle((int) r2)
            zk1.g$a r2 = new zk1.g$a
            r2.<init>(r0)
            r0.setBackBtn(r2)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "KEY_LIVE_ANCHOR_USERNAME"
            java.lang.String r9 = r0.getStringExtra(r2)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "KEY_LOTTERY_HISTORY_INFO"
            byte[] r0 = r0.getByteArrayExtra(r2)
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0052
            te3.z21 r5 = new te3.z21
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0053
        L_0x0045:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r5
            java.lang.String r5 = "FinderLiveLotteryDetailUIC"
            java.lang.String r6 = "onCreate: lottery info parse errpr"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r0)
        L_0x0052:
            r5 = 0
        L_0x0053:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.content.Intent r0 = r0.getIntent()
            r6 = 0
            java.lang.String r8 = "KEY_LOTTERY_HISTORY_OBJECT_ID"
            long r6 = r0.getLongExtra(r8, r6)
            if (r5 == 0) goto L_0x0227
            fe1.d$b r0 = fe1.C58961d.f168673a
            fe1.q r0 = r0.mo84155b(r9)
            androidx.appcompat.app.AppCompatActivity r8 = r18.getActivity()
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131827852(0x7f111c8c, float:1.9288628E38)
            java.lang.String r8 = r8.getString(r10)
            java.lang.String r10 = "activity.resources.getSt…ery_history_detail_title)"
            gy3.C87412m.m108593f(r8, r10)
            if (r0 == 0) goto L_0x0099
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r8 = 183(0xb7, float:2.56E-43)
            r10.append(r8)
            java.lang.String r0 = r0.getNickname()
            r10.append(r0)
            java.lang.String r8 = r10.toString()
        L_0x0099:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r10 = 2131308221(0x7f092ebd, float:1.8234691E38)
            android.view.View r0 = r0.findViewById(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r8)
            java.lang.String r0 = r5.f145644h
            if (r0 == 0) goto L_0x00b6
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = 0
            goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            r8 = 2131308216(0x7f092eb8, float:1.8234681E38)
            if (r0 == 0) goto L_0x0109
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.view.View r0 = r0.findViewById(r8)
            r8 = 8
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r8)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r0
            r3 = r15
            r15 = r8
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0151
        L_0x0109:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.view.View r0 = r0.findViewById(r8)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r8)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0151:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r3 = 2131308218(0x7f092eba, float:1.8234685E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = r5.f145644h
            r0.setText(r3)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r3 = 2131308232(0x7f092ec8, float:1.8234714E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0177
            rl1.o0 r3 = rl1.C13064o0.f37206a
            r3.mo12568g(r0)
        L_0x0177:
            ok1.e r0 = ok1.C62042e.f176370a
            te3.u21 r3 = r5.f145645i
            java.lang.String r0 = r0.mo87103o0(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            r8 = 2131308220(0x7f092ebc, float:1.823469E38)
            android.view.View r3 = r3.findViewById(r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r3 = 2131308217(0x7f092eb9, float:1.8234683E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131827846(0x7f111c86, float:1.9288616E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r10 = r5.f145646j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r4] = r10
            java.lang.String r2 = r3.getString(r8, r2)
            r0.setText(r2)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r2 = 2131308219(0x7f092ebb, float:1.8234687E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r2 = r5.f145642f
            long r2 = (long) r2
            java.lang.String r4 = "yyyy-MM-dd HH:mm"
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r4, r2)
            r0.setText(r2)
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            androidx.appcompat.app.AppCompatActivity r2 = r18.getActivity()
            gy3.C87412m.m108592e(r2, r1)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            ht1.g4 r0 = r0.gr0(r2)
            if (r0 == 0) goto L_0x01ef
            te3.hj1 r0 = r0.mo12861q3()
            r8 = r0
            goto L_0x01f0
        L_0x01ef:
            r8 = 0
        L_0x01f0:
            dp1.h r0 = dp1.C58363h.f167137a
            dp1.h$b r10 = dp1.C58363h.f167143g
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90662O5()
            java.lang.String r1 = ""
            if (r9 != 0) goto L_0x0200
            r2 = r1
            goto L_0x0201
        L_0x0200:
            r2 = r9
        L_0x0201:
            r10.mo83123c(r0, r1, r2)
            r12 = 4
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r8
            dp1.C58363h.C58364b.m67609b(r10, r11, r12, r14, r15, r16)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r1 = 2131308246(0x7f092ed6, float:1.8234742E38)
            android.view.View r0 = r0.findViewById(r1)
            zk1.g$b r1 = new zk1.g$b
            r3 = r1
            r4 = r18
            r3.<init>(r4, r5, r6, r8, r9)
            r0.setOnClickListener(r1)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0228
        L_0x0227:
            r3 = 0
        L_0x0228:
            if (r3 != 0) goto L_0x0231
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r0.finish()
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C16225g.onCreate(android.os.Bundle):void");
    }
}
