package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import p910lj.C76701a;
import ri2.C13004a;
import si2.C48389j;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI */
public class BankRemitDetailUI extends BankRemitBaseUI {

    /* renamed from: e */
    public ImageView f115920e;

    /* renamed from: f */
    public ImageView f115921f;

    /* renamed from: g */
    public TextView f115922g;

    /* renamed from: h */
    public TextView f115923h;

    /* renamed from: i */
    public TextView f115924i;

    /* renamed from: j */
    public TextView f115925j;

    /* renamed from: n */
    public View f115926n;

    /* renamed from: o */
    public View f115927o;

    /* renamed from: p */
    public LinearLayout f115928p;

    /* renamed from: q */
    public ViewGroup f115929q;

    /* renamed from: r */
    public String f115930r;

    /* renamed from: s */
    public int f115931s;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI$b */
    public class C5045b extends C7089c0 {
        public C5045b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.BankRemitDetailUI", "click finish btn");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
            intent.addFlags(67108864);
            BankRemitDetailUI bankRemitDetailUI = BankRemitDetailUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            BankRemitDetailUI bankRemitDetailUI2 = bankRemitDetailUI;
            C117292a.m165358d(bankRemitDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bankRemitDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bankRemitDetailUI2, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI$a */
    public class C42810a implements MenuItem.OnMenuItemClickListener {
        public C42810a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.BankRemitDetailUI", "back press");
            BankRemitDetailUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI$c */
    public class C42811c implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48389j f115933a;

        public C42811c(C48389j jVar) {
            this.f115933a = jVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", Integer.valueOf(this.f115933a.f129530s.f132401d), this.f115933a.f129530s.f132402e);
            if (!Util.isNullOrNil(this.f115933a.f129530s.f132402e)) {
                C76701a.makeText((Context) BankRemitDetailUI.this, (CharSequence) this.f115933a.f129530s.f132402e, 1).show();
            } else {
                C76701a.makeText((Context) BankRemitDetailUI.this, (int) C0966R.string.f360159ah2, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI$d */
    public class C42812d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48389j f115935a;

        public C42812d(C48389j jVar) {
            this.f115935a = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x026f  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x028c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0291  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x02d7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo66496a(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = 4
                java.lang.Object[] r2 = new java.lang.Object[r1]
                si2.j r3 = r0.f115935a
                te3.dl3 r3 = r3.f129530s
                int r3 = r3.f132403f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                si2.j r3 = r0.f115935a
                te3.dl3 r3 = r3.f129530s
                int r3 = r3.f132405h
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 1
                r2[r5] = r3
                si2.j r3 = r0.f115935a
                te3.dl3 r3 = r3.f129530s
                int r3 = r3.f132406i
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6 = 2
                r2[r6] = r3
                si2.j r3 = r0.f115935a
                te3.dl3 r3 = r3.f129530s
                java.lang.String r3 = r3.f132408n
                r7 = 3
                r2[r7] = r3
                java.lang.String r3 = "MicroMsg.BankRemitDetailUI"
                java.lang.String r8 = "state: %s, amount: %s, fee: %s, account: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r2)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI r2 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitDetailUI.this
                si2.j r8 = r0.f115935a
                te3.dl3 r8 = r8.f129530s
                int r9 = r8.f132403f
                r2.getClass()
                java.lang.String r8 = r8.f132404g
                r10 = 2131101252(0x7f060644, float:1.7814908E38)
                r11 = 5
                if (r9 == r5) goto L_0x0144
                if (r9 == r6) goto L_0x0107
                if (r9 == r7) goto L_0x00d2
                r7 = 2131755229(0x7f1000dd, float:1.9141331E38)
                if (r9 == r1) goto L_0x009f
                if (r9 == r11) goto L_0x006c
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r7[r4] = r8
                java.lang.String r8 = "unknown state: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r7)
                r3 = 0
                goto L_0x0179
            L_0x006c:
                android.widget.ImageView r3 = r2.f115921f
                android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
                r3.setScaleType(r9)
                android.widget.ImageView r3 = r2.f115921f
                r3.setImageResource(r7)
                android.widget.TextView r3 = r2.f115923h
                android.content.res.Resources r7 = r2.getResources()
                int r7 = r7.getColor(r10)
                r3.setTextColor(r7)
                android.widget.TextView r3 = r2.f115923h
                r7 = 2131822385(0x7f110731, float:1.927754E38)
                r3.setText(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r3 != 0) goto L_0x0178
                android.widget.TextView r3 = r2.f115925j
                r3.setText(r8)
                android.widget.TextView r3 = r2.f115925j
                r3.setVisibility(r4)
                goto L_0x0178
            L_0x009f:
                android.widget.ImageView r3 = r2.f115920e
                android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
                r3.setScaleType(r9)
                android.widget.ImageView r3 = r2.f115920e
                r3.setImageResource(r7)
                android.widget.TextView r3 = r2.f115922g
                android.content.res.Resources r7 = r2.getResources()
                int r7 = r7.getColor(r10)
                r3.setTextColor(r7)
                android.widget.TextView r3 = r2.f115922g
                r7 = 2131822387(0x7f110733, float:1.9277544E38)
                r3.setText(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r3 != 0) goto L_0x0178
                android.widget.TextView r3 = r2.f115924i
                r3.setText(r8)
                android.widget.TextView r3 = r2.f115924i
                r3.setVisibility(r4)
                goto L_0x0178
            L_0x00d2:
                android.widget.ImageView r3 = r2.f115920e
                android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
                r3.setScaleType(r7)
                android.widget.ImageView r3 = r2.f115920e
                r7 = 2131755228(0x7f1000dc, float:1.914133E38)
                r3.setImageResource(r7)
                android.widget.TextView r3 = r2.f115922g
                android.content.res.Resources r7 = r2.getResources()
                int r7 = r7.getColor(r10)
                r3.setTextColor(r7)
                android.widget.TextView r3 = r2.f115922g
                r7 = 2131822384(0x7f110730, float:1.9277538E38)
                r3.setText(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r3 != 0) goto L_0x0178
                android.widget.TextView r3 = r2.f115924i
                r3.setText(r8)
                android.widget.TextView r3 = r2.f115924i
                r3.setVisibility(r4)
                goto L_0x0178
            L_0x0107:
                android.view.View r3 = r2.f115927o
                android.content.res.Resources r7 = r2.getResources()
                r9 = 2131231127(0x7f080197, float:1.8078326E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r9)
                r3.setBackground(r7)
                android.widget.ImageView r3 = r2.f115921f
                android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
                r3.setScaleType(r7)
                android.widget.ImageView r3 = r2.f115921f
                r7 = 2131755232(0x7f1000e0, float:1.9141337E38)
                r3.setImageResource(r7)
                android.widget.TextView r3 = r2.f115923h
                android.content.res.Resources r7 = r2.getResources()
                int r7 = r7.getColor(r10)
                r3.setTextColor(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r3 != 0) goto L_0x0178
                android.widget.TextView r3 = r2.f115925j
                r3.setText(r8)
                android.widget.TextView r3 = r2.f115925j
                r3.setVisibility(r4)
                goto L_0x0178
            L_0x0144:
                android.widget.ImageView r3 = r2.f115920e
                android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
                r3.setScaleType(r7)
                android.widget.ImageView r3 = r2.f115920e
                r7 = 2131755234(0x7f1000e2, float:1.9141342E38)
                r3.setImageResource(r7)
                android.widget.TextView r3 = r2.f115924i
                android.content.res.Resources r7 = r2.getResources()
                int r7 = r7.getColor(r10)
                r3.setTextColor(r7)
                android.widget.TextView r3 = r2.f115922g
                r7 = 2131822382(0x7f11072e, float:1.9277534E38)
                r3.setText(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r3 != 0) goto L_0x0178
                android.widget.TextView r3 = r2.f115924i
                r3.setText(r8)
                android.widget.TextView r3 = r2.f115924i
                r3.setVisibility(r4)
            L_0x0178:
                r3 = 1
            L_0x0179:
                r7 = 8
                if (r3 == 0) goto L_0x01c6
                r3 = 2131298347(0x7f09082b, float:1.8214665E38)
                android.view.View r2 = r2.findViewById(r3)
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r3.mo10233c(r8)
                java.lang.Object[] r13 = r3.mo10232b()
                java.lang.String r14 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI"
                java.lang.String r15 = "refreshStateIv"
                java.lang.String r16 = "(ILjava/lang/String;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r12 = r2
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r13 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI"
                java.lang.String r14 = "refreshStateIv"
                java.lang.String r15 = "(ILjava/lang/String;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            L_0x01c6:
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI r2 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitDetailUI.this
                si2.j r3 = r0.f115935a
                te3.dl3 r3 = r3.f129530s
                r2.getClass()
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r8 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r8.<init>((android.content.Context) r2, (boolean) r4)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r9 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r9.<init>((android.content.Context) r2, (boolean) r4)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r10 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r10.<init>((android.content.Context) r2, (boolean) r5)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r12 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r12.<init>((android.content.Context) r2, (boolean) r5)
                r13 = 2131822380(0x7f11072c, float:1.927753E38)
                java.lang.String r14 = r3.f132407j
                r8.mo6014b(r13, r14)
                r13 = 2131822379(0x7f11072b, float:1.9277528E38)
                java.lang.String r14 = r3.f132408n
                r9.mo6014b(r13, r14)
                r13 = 2131822378(0x7f11072a, float:1.9277526E38)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = com.tencent.p014mm.wallet_core.model.C45121z0.m49962b()
                r14.append(r15)
                int r15 = r3.f132405h
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = ""
                r7.append(r11)
                r7.append(r15)
                java.lang.String r7 = r7.toString()
                java.lang.String r15 = "100"
                double r4 = ti2.C78028a.m94173a(r7, r15, r6, r1)
                r14.append(r4)
                java.lang.String r4 = r14.toString()
                r10.mo6014b(r13, r4)
                r4 = 2131822375(0x7f110727, float:1.927752E38)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = com.tencent.p014mm.wallet_core.model.C45121z0.m49962b()
                r5.append(r7)
                int r7 = r3.f132406i
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r11)
                r13.append(r7)
                java.lang.String r7 = r13.toString()
                double r13 = ti2.C78028a.m94173a(r7, r15, r6, r1)
                r5.append(r13)
                java.lang.String r1 = r5.toString()
                r12.mo6014b(r4, r1)
                android.widget.LinearLayout r1 = r2.f115928p
                r1.addView(r8)
                android.widget.LinearLayout r1 = r2.f115928p
                r1.addView(r9)
                android.widget.LinearLayout r1 = r2.f115928p
                r1.addView(r10)
                android.widget.LinearLayout r1 = r2.f115928p
                r1.addView(r12)
                java.lang.String r1 = r3.f132409o
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x028c
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r1 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r4 = 0
                r1.<init>((android.content.Context) r2, (boolean) r4)
                r4 = 2131822373(0x7f110725, float:1.9277516E38)
                java.lang.String r5 = r3.f132409o
                android.content.Context r7 = r1.getContext()
                java.lang.String r4 = r7.getString(r4)
                r7 = 1
                r1.mo6015c(r4, r5, r7)
                android.widget.LinearLayout r4 = r2.f115928p
                r4.addView(r1)
                goto L_0x028d
            L_0x028c:
                r7 = 1
            L_0x028d:
                int r1 = r2.f115931s
                if (r1 != r7) goto L_0x02c7
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r1 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r4 = 0
                r1.<init>((android.content.Context) r2, (boolean) r4)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r5 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r5.<init>((android.content.Context) r2, (boolean) r4)
                r4 = 2131822388(0x7f110734, float:1.9277546E38)
                java.lang.String r7 = r3.f132410p
                r1.mo6014b(r4, r7)
                int r4 = r3.f132403f
                if (r4 != r6) goto L_0x02b1
                r4 = 2131822372(0x7f110724, float:1.9277514E38)
                java.lang.String r6 = r3.f132412r
                r5.mo6014b(r4, r6)
                goto L_0x02bc
            L_0x02b1:
                r6 = 5
                if (r4 == r6) goto L_0x02bc
                r4 = 2131822374(0x7f110726, float:1.9277518E38)
                java.lang.String r6 = r3.f132411q
                r5.mo6014b(r4, r6)
            L_0x02bc:
                android.widget.LinearLayout r4 = r2.f115928p
                r4.addView(r1)
                android.widget.LinearLayout r1 = r2.f115928p
                r1.addView(r5)
                goto L_0x02cf
            L_0x02c7:
                android.widget.LinearLayout r1 = r2.f115928p
                r4 = 2131231124(0x7f080194, float:1.807832E38)
                r1.setBackgroundResource(r4)
            L_0x02cf:
                java.lang.String r1 = r3.f132413s
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x02ea
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView r1 = new com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
                r4 = 0
                r1.<init>((android.content.Context) r2, (boolean) r4)
                r4 = 2131822381(0x7f11072d, float:1.9277532E38)
                java.lang.String r3 = r3.f132413s
                r1.mo6014b(r4, r3)
                android.widget.LinearLayout r3 = r2.f115928p
                r3.addView(r1)
            L_0x02ea:
                r1 = 2131298324(0x7f090814, float:1.8214618E38)
                android.view.View r1 = r2.findViewById(r1)
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r4 = r2.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI"
                java.lang.String r6 = "addContentView"
                java.lang.String r7 = "(Lcom/tencent/mm/protocal/protobuf/QueryDetailResp;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r1
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r4 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI"
                java.lang.String r5 = "addContentView"
                java.lang.String r6 = "(Lcom/tencent/mm/protocal/protobuf/QueryDetailResp;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r3 = r1
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI r1 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitDetailUI.this
                android.view.ViewGroup r1 = r1.f115929q
                r2 = 0
                r1.setVisibility(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitDetailUI.C42812d.mo66496a(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: I7 */
    public void mo66989I7() {
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        View j = getSupportActionBar().mo91099j();
        if (j != null) {
            View findViewById = j.findViewById(C0966R.C0970id.c7p);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.f3553xj));
            }
            View findViewById2 = j.findViewById(16908308);
            if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                ((TextView) findViewById2).setTextColor(getResources().getColor(C0966R.color.a7f));
            }
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.al6));
        BankRemitBaseUI.m46480H7(this);
        getContentView().setFitsSystemWindows(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6553i3;
    }

    public void initView() {
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.aj8);
        this.f115920e = (ImageView) findViewById(C0966R.C0970id.aj9);
        this.f115921f = (ImageView) findViewById(C0966R.C0970id.aj_);
        TextView textView = (TextView) findViewById(C0966R.C0970id.aji);
        this.f115922g = (TextView) findViewById(C0966R.C0970id.ajj);
        this.f115923h = (TextView) findViewById(C0966R.C0970id.ajk);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.aj5);
        this.f115924i = (TextView) findViewById(C0966R.C0970id.aj6);
        this.f115925j = (TextView) findViewById(C0966R.C0970id.aj7);
        this.f115926n = findViewById(C0966R.C0970id.ajd);
        this.f115927o = findViewById(C0966R.C0970id.aje);
        this.f115928p = (LinearLayout) findViewById(C0966R.C0970id.aiz);
        this.f115929q = (ViewGroup) findViewById(C0966R.C0970id.aj4);
        if (this.f115931s == 1) {
            View findViewById = findViewById(C0966R.C0970id.f357573aj3);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((Button) findViewById(C0966R.C0970id.f357572aj2)).setOnClickListener(new C5045b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1579);
        this.f115930r = getIntent().getStringExtra("key_transfer_bill_id");
        int intExtra = getIntent().getIntExtra("key_enter_scene", 0);
        this.f115931s = intExtra;
        Log.m105925i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", this.f115930r, Integer.valueOf(intExtra));
        initView();
        Log.m105924i("MicroMsg.BankRemitDetailUI", "do query detail");
        doSceneProgress(new C48389j(this.f115930r));
        if (this.f115931s == 0) {
            showHomeBtn(false);
            enableBackMenu(false);
            setMMTitle((int) C0966R.string.ahf);
        } else {
            showHomeBtn(true);
            enableBackMenu(true);
            setMMTitle((int) C0966R.string.ahe);
        }
        setBackBtn(new C42810a());
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1579);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C48389j) {
            C48389j jVar = (C48389j) yVar;
            jVar.mo104823q1(new C42812d(jVar));
            jVar.mo104820l1(new C42811c(jVar));
            if (jVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitDetailUI", "net error: %s", jVar);
                C76701a.makeText((Context) this, (int) C0966R.string.f360159ah2, 1).show();
            }
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C13004a.class);
    }
}
