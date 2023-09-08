package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kv1.C61173o;
import kv1.C99252h;
import lv1.C10656l;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI */
public class ContactMoreInfoUI extends MMActivity implements C61173o, View.OnClickListener {

    /* renamed from: d */
    public String f20141d;

    /* renamed from: e */
    public C72996z1 f20142e;

    /* renamed from: f */
    public String f20143f;

    /* renamed from: g */
    public ProfileNormalItemView f20144g;

    /* renamed from: h */
    public ProfileNormalItemView f20145h;

    /* renamed from: i */
    public ProfileNormalItemView f20146i;

    /* renamed from: j */
    public ProfileNormalItemView f20147j;

    /* renamed from: n */
    public ProfileNormalItemView f20148n;

    /* renamed from: o */
    public ProfileNormalItemView f20149o;

    /* renamed from: p */
    public ProfileNormalItemView f20150p;

    /* renamed from: q */
    public ProfileNormalItemView f20151q;

    /* renamed from: r */
    public ProfileNormalItemView f20152r;

    /* renamed from: s */
    public String f20153s;

    /* renamed from: t */
    public String f20154t;

    /* renamed from: u */
    public String f20155u;

    /* renamed from: v */
    public long f20156v;

    /* renamed from: w */
    public String f20157w;

    /* renamed from: x */
    public String f20158x = null;

    /* renamed from: y */
    public MMHandler f20159y = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI$a */
    public class C4943a implements MenuItem.OnMenuItemClickListener {
        public C4943a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactMoreInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI$b */
    public class C4944b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f20161d;

        public C4944b(int i) {
            this.f20161d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C99252h.m129299d(this.f20161d);
            if (this.f20161d > 0) {
                Intent intent = new Intent(ContactMoreInfoUI.this, CommonChatroomInfoUI.class);
                intent.putExtra("Select_Talker_Name", ContactMoreInfoUI.this.f20142e.getUsername());
                ContactMoreInfoUI contactMoreInfoUI = ContactMoreInfoUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ContactMoreInfoUI contactMoreInfoUI2 = contactMoreInfoUI;
                C117292a.m165358d(contactMoreInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                contactMoreInfoUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(contactMoreInfoUI2, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        if (lVar.f32074c == 0) {
            int intValue = ((Integer) lVar.f32076e.get(0).f292161o).intValue();
            this.f20148n.f20218f = getString(C0966R.string.blm, new Object[]{Integer.valueOf(intValue)});
            this.f20148n.f20219g = new C4944b(intValue);
        } else {
            this.f20148n.f20218f = getString(C0966R.string.blm, new Object[]{0});
        }
        this.f20148n.mo5919b();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7075xg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r14 = this;
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            java.lang.String r1 = ""
            super.initView()
            r2 = 2131821586(0x7f110412, float:1.927592E38)
            r14.setMMTitle((int) r2)
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI$a r2 = new com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI$a
            r2.<init>()
            r14.setBackBtn(r2)
            r2 = 2131307337(0x7f092b49, float:1.8232898E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20144g = r2
            r2 = 2131305710(0x7f0924ee, float:1.8229599E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20145h = r2
            r2 = 2131311559(0x7f093bc7, float:1.8241462E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20146i = r2
            r2 = 2131301071(0x7f0912cf, float:1.822019E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20147j = r2
            r3 = 8
            r2.setVisibility(r3)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20147j
            r4 = 2131824114(0x7f110df2, float:1.9281047E38)
            java.lang.String r4 = r14.getString(r4)
            r2.f20217e = r4
            r2 = 2131313578(0x7f0943aa, float:1.8245557E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20150p = r2
            r4 = 2131824313(0x7f110eb9, float:1.928145E38)
            r2.mo5922e(r4)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20150p
            android.widget.TextView r2 = r2.f20221i
            r4 = 0
            r2.setSingleLine(r4)
            r2 = 2131305217(0x7f092301, float:1.8228599E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20151q = r2
            r5 = 2131824367(0x7f110eef, float:1.928156E38)
            r2.mo5922e(r5)
            r2 = 2131317053(0x7f09513d, float:1.8252605E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20149o = r2
            r2 = 2131300037(0x7f090ec5, float:1.8218092E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20148n = r2
            r5 = 1
            r2.mo5920c(r5)
            r2 = 2131305230(0x7f09230e, float:1.8228625E38)
            android.view.View r2 = r14.findViewById(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = (com.tencent.p014mm.plugin.profile.p088ui.ProfileNormalItemView) r2
            r14.f20152r = r2
            r6 = 2131824119(0x7f110df7, float:1.9281057E38)
            r2.mo5922e(r6)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20152r
            r2.mo5920c(r5)
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r6 = "LinkedinPluginClose"
            java.lang.String r2 = r2.mo107405c(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x00cc
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            if (r2 != 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r2 = 0
            goto L_0x00cd
        L_0x00cc:
            r2 = 1
        L_0x00cd:
            r6 = 2131101324(0x7f06068c, float:1.7815054E38)
            if (r2 == 0) goto L_0x010d
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            java.lang.String r2 = r2.f149517U0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x010d
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20144g
            r2.setVisibility(r4)
            java.lang.String r2 = r14.f20153s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00ef
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            java.lang.String r2 = r2.f149519V0
            r14.f20153s = r2
        L_0x00ef:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20144g
            java.lang.String r7 = r14.f20153s
            r2.f20218f = r7
            com.tencent.mm.plugin.profile.ui.e0 r7 = new com.tencent.mm.plugin.profile.ui.e0
            r7.<init>(r14)
            r2.f20219g = r7
            android.content.res.Resources r7 = r14.getResources()
            int r7 = r7.getColor(r6)
            android.widget.TextView r8 = r2.f20221i
            r8.setTextColor(r7)
            r2.mo5919b()
            goto L_0x0112
        L_0x010d:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20144g
            r2.setVisibility(r3)
        L_0x0112:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20145h
            r2.setVisibility(r4)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20145h
            java.lang.String r7 = r14.f20155u
            r2.f20218f = r7
            r2.mo5919b()
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r7 = 9
            r8 = 0
            java.lang.Object r2 = r2.mo119684e(r7, r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            android.content.Intent r7 = r14.getIntent()
            r9 = 0
            java.lang.String r11 = "Contact_Uin"
            long r11 = r7.getLongExtra(r11, r9)
            r14.f20156v = r11
            android.content.Intent r7 = r14.getIntent()
            java.lang.String r11 = "Contact_QQNick"
            java.lang.String r7 = r7.getStringExtra(r11)
            r14.f20157w = r7
            long r11 = r14.f20156v
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x01ad
            if (r2 == 0) goto L_0x01ad
            if (r7 == 0) goto L_0x015f
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0174
        L_0x015f:
            long r9 = r14.f20156v
            hg0.b1 r2 = dg0.C75398e.Ax0()
            hg0.a1 r2 = r2.mo106404a(r9)
            if (r2 != 0) goto L_0x016c
            r2 = r8
        L_0x016c:
            if (r2 == 0) goto L_0x0174
            java.lang.String r2 = r2.mo106399c()
            r14.f20157w = r2
        L_0x0174:
            java.lang.String r2 = r14.f20157w
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = " "
            r7.append(r2)
            sg.q r2 = new sg.q
            long r9 = r14.f20156v
            r2.<init>((long) r9)
            long r9 = r2.longValue()
            r7.append(r9)
            java.lang.String r2 = r7.toString()
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r7 = r14.f20146i
            r7.setVisibility(r4)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r7 = r14.f20146i
            r7.f20218f = r2
            com.tencent.mm.plugin.profile.ui.f0 r2 = new com.tencent.mm.plugin.profile.ui.f0
            r2.<init>(r14)
            r7.f20219g = r2
            r7.mo5919b()
            goto L_0x01b2
        L_0x01ad:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20146i
            r2.setVisibility(r3)
        L_0x01b2:
            java.lang.String r2 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x01ce }
            com.tencent.mm.storage.z1 r7 = r14.f20142e     // Catch:{ all -> 0x01ce }
            java.lang.String r7 = r7.getUsername()     // Catch:{ all -> 0x01ce }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x01ce }
            if (r2 == 0) goto L_0x01c9
            eb0.o4 r2 = eb0.C75590o4.m90741b()     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = r2.f222068e     // Catch:{ all -> 0x01ce }
            goto L_0x01d0
        L_0x01c9:
            com.tencent.mm.storage.z1 r2 = r14.f20142e     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = r2.f149516U     // Catch:{ all -> 0x01ce }
            goto L_0x01d0
        L_0x01ce:
            r2 = r1
        L_0x01d0:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r7 = r14.f20150p
            di3.d r9 = di3.C86312j.m106911c(r0)
            ny.h r9 = (p629ny.C76979h) r9
            android.text.SpannableString r2 = r9.mo107057T1(r14, r2)
            r7.f20218f = r2
            r7.mo5919b()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mm.storage.z1 r7 = r14.f20142e
            int r7 = r7.getSource()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r4] = r7
            java.lang.String r7 = "MicroMsg.ContactMoreInfoUI"
            java.lang.String r9 = "[initFriendSource] source:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r2)
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.getSource()
            r9 = 1000000(0xf4240, float:1.401298E-39)
            r10 = 5
            if (r2 == r5) goto L_0x03d3
            if (r2 == r3) goto L_0x0347
            r11 = 10
            r12 = 2131824364(0x7f110eec, float:1.9281554E38)
            r13 = 2131824363(0x7f110eeb, float:1.9281552E38)
            if (r2 == r11) goto L_0x0333
            r11 = 34
            if (r2 == r11) goto L_0x0329
            r11 = 48
            if (r2 == r11) goto L_0x031f
            r11 = 76
            if (r2 == r11) goto L_0x0315
            r11 = 3
            if (r2 == r11) goto L_0x02fb
            r11 = 4
            if (r2 == r11) goto L_0x02f1
            r11 = 17
            if (r2 == r11) goto L_0x02d7
            r11 = 18
            if (r2 == r11) goto L_0x02bd
            switch(r2) {
                case 12: goto L_0x02f1;
                case 13: goto L_0x0251;
                case 14: goto L_0x0347;
                case 15: goto L_0x0237;
                default: goto L_0x022b;
            }
        L_0x022b:
            switch(r2) {
                case 22: goto L_0x0299;
                case 23: goto L_0x0299;
                case 24: goto L_0x0299;
                case 25: goto L_0x027f;
                case 26: goto L_0x0299;
                case 27: goto L_0x0299;
                case 28: goto L_0x0299;
                case 29: goto L_0x0299;
                case 30: goto L_0x0265;
                default: goto L_0x022e;
            }
        L_0x022e:
            switch(r2) {
                case 58: goto L_0x02b3;
                case 59: goto L_0x02b3;
                case 60: goto L_0x02b3;
                default: goto L_0x0231;
            }
        L_0x0231:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.f20218f = r8
            goto L_0x03ea
        L_0x0237:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x0247
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824352(0x7f110ee0, float:1.928153E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0247:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824351(0x7f110edf, float:1.9281527E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0251:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x025e
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.mo5921d(r12)
            goto L_0x03ea
        L_0x025e:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.mo5921d(r13)
            goto L_0x03ea
        L_0x0265:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x0275
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824348(0x7f110edc, float:1.9281521E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0275:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824347(0x7f110edb, float:1.928152E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x027f:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x028f
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824328(0x7f110ec8, float:1.928148E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x028f:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824327(0x7f110ec7, float:1.9281479E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0299:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x02a9
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824361(0x7f110ee9, float:1.9281548E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02a9:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824360(0x7f110ee8, float:1.9281546E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02b3:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131830991(0x7f1128cf, float:1.9294995E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02bd:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x02cd
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824343(0x7f110ed7, float:1.9281511E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02cd:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824342(0x7f110ed6, float:1.928151E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02d7:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x02e7
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824333(0x7f110ecd, float:1.928149E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02e7:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824330(0x7f110eca, float:1.9281485E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02f1:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131830280(0x7f112608, float:1.9293553E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x02fb:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x030b
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824358(0x7f110ee6, float:1.9281542E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x030b:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824357(0x7f110ee5, float:1.928154E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0315:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824345(0x7f110ed9, float:1.9281515E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x031f:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824350(0x7f110ede, float:1.9281525E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0329:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824325(0x7f110ec5, float:1.9281475E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x0333:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x0340
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.mo5921d(r12)
            goto L_0x03ea
        L_0x0340:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.mo5921d(r13)
            goto L_0x03ea
        L_0x0347:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            java.lang.String r2 = r2.mo73950B2()
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r11.get(r2)
            if (r2 == 0) goto L_0x0382
            java.lang.String r11 = r2.getUsername()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x036a
            goto L_0x0382
        L_0x036a:
            java.lang.String r11 = r2.getNickname()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x037d
            java.lang.String r2 = r2.getUsername()
            java.lang.String r2 = eb0.C45612m0.m50698o(r2)
            goto L_0x0383
        L_0x037d:
            java.lang.String r2 = r2.getNickname()
            goto L_0x0383
        L_0x0382:
            r2 = r8
        L_0x0383:
            com.tencent.mm.storage.z1 r11 = r14.f20142e
            int r11 = r11.f149526Z
            if (r11 <= r9) goto L_0x03b5
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x039b
            r9 = 2131824339(0x7f110ed3, float:1.9281503E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r4] = r2
            java.lang.String r2 = r14.getString(r9, r11)
            goto L_0x03a2
        L_0x039b:
            r2 = 2131824337(0x7f110ed1, float:1.92815E38)
            java.lang.String r2 = r14.getString(r2)
        L_0x03a2:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r9 = r14.f20151q
            android.widget.TextView r11 = r9.f20221i
            r11.setMaxLines(r10)
            android.widget.TextView r9 = r9.f20221i
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            r9.setEllipsize(r11)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r9 = r14.f20151q
            r9.f20218f = r2
            goto L_0x03ea
        L_0x03b5:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x03c7
            r9 = 2131824338(0x7f110ed2, float:1.9281501E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r4] = r2
            java.lang.String r2 = r14.getString(r9, r11)
            goto L_0x03ce
        L_0x03c7:
            r2 = 2131824336(0x7f110ed0, float:1.9281497E38)
            java.lang.String r2 = r14.getString(r2)
        L_0x03ce:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r9 = r14.f20151q
            r9.f20218f = r2
            goto L_0x03ea
        L_0x03d3:
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            int r2 = r2.f149526Z
            if (r2 <= r9) goto L_0x03e2
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824355(0x7f110ee3, float:1.9281536E38)
            r2.mo5921d(r9)
            goto L_0x03ea
        L_0x03e2:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r9 = 2131824354(0x7f110ee2, float:1.9281534E38)
            r2.mo5921d(r9)
        L_0x03ea:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20151q
            r2.mo5919b()
            com.tencent.mm.storage.z1 r2 = r14.f20142e
            java.lang.String r9 = eb0.C75592q0.m90789s()
            java.lang.String r11 = r2.getUsername()
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0410
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_STRING
            java.lang.Object r2 = r2.mo119685f(r9, r8)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0412
        L_0x0410:
            java.lang.String r2 = r2.f149523X0
        L_0x0412:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x0432
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x042c }
            r9.<init>(r2)     // Catch:{ JSONException -> 0x042c }
            java.lang.String r2 = "ShopUrl"
            java.lang.String r2 = r9.optString(r2)     // Catch:{ JSONException -> 0x042c }
            r14.f20158x = r2     // Catch:{ JSONException -> 0x042c }
            java.lang.String r2 = "ShopName"
            java.lang.String r8 = r9.optString(r2)     // Catch:{ JSONException -> 0x042c }
            goto L_0x0432
        L_0x042c:
            r2 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r9)
        L_0x0432:
            java.lang.String r1 = r14.f20158x
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x045d
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20149o
            r1.setVisibility(r4)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20149o
            r1.f20218f = r8
            android.content.res.Resources r2 = r14.getResources()
            int r2 = r2.getColor(r6)
            android.widget.TextView r1 = r1.f20221i
            r1.setTextColor(r2)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20149o
            com.tencent.mm.plugin.profile.ui.d0 r2 = new com.tencent.mm.plugin.profile.ui.d0
            r2.<init>(r14)
            r1.f20219g = r2
            r1.mo5919b()
            goto L_0x0462
        L_0x045d:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20149o
            r1.setVisibility(r3)
        L_0x0462:
            com.tencent.mm.storage.z1 r1 = r14.f20142e
            java.lang.Class<he0.j> r2 = he0.C76158j.class
            java.lang.String r6 = r1.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            if (r6 == 0) goto L_0x04bf
            int r6 = r1.f149530c1
            if (r6 == 0) goto L_0x04bf
            di3.d r6 = di3.C86312j.m106911c(r2)
            he0.j r6 = (he0.C76158j) r6
            java.lang.String r7 = r1.mo73980x2()
            he0.j$a r8 = he0.C76158j.C8510a.TYPE_WORDING
            java.lang.String r9 = "openim_intro_desc"
            java.lang.String r6 = r6.S10(r7, r9, r8, r4)
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r7 = r14.f20152r
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            androidx.appcompat.app.AppCompatActivity r8 = r14.getContext()
            android.text.SpannableString r0 = r0.mo107057T1(r8, r6)
            r7.f20218f = r0
            di3.d r0 = di3.C86312j.m106911c(r2)
            he0.j r0 = (he0.C76158j) r0
            java.lang.String r2 = r1.mo73980x2()
            he0.j$a r7 = he0.C76158j.C8510a.TYPE_URL
            java.lang.String r8 = "openim_intro_url"
            java.lang.String r0 = r0.S10(r2, r8, r7, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x04bf
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r2 = r14.f20152r
            com.tencent.mm.plugin.profile.ui.g0 r4 = new com.tencent.mm.plugin.profile.ui.g0
            r4.<init>(r14, r0, r1, r6)
            r2.f20219g = r4
            r2.mo5919b()
            goto L_0x04c4
        L_0x04bf:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r0 = r14.f20152r
            r0.setVisibility(r3)
        L_0x04c4:
            com.tencent.mm.storage.z1 r0 = r14.f20142e
            java.lang.String r0 = r0.getUsername()
            java.lang.String r1 = eb0.C75592q0.m90789s()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x052e
            com.tencent.mm.storage.z1 r0 = r14.f20142e
            java.lang.String r1 = r0.getUsername()
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04ea
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r0 = r14.f20148n
            r0.setVisibility(r3)
            goto L_0x052e
        L_0x04ea:
            int r1 = r0.f149500H
            r2 = 2
            if (r1 != r5) goto L_0x04f8
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20148n
            r3 = 2131824104(0x7f110de8, float:1.9281026E38)
            r1.mo5922e(r3)
            goto L_0x050b
        L_0x04f8:
            if (r1 != r2) goto L_0x0503
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20148n
            r3 = 2131824103(0x7f110de7, float:1.9281024E38)
            r1.mo5922e(r3)
            goto L_0x050b
        L_0x0503:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20148n
            r3 = 2131824108(0x7f110dec, float:1.9281035E38)
            r1.mo5922e(r3)
        L_0x050b:
            com.tencent.mm.plugin.profile.ui.ProfileNormalItemView r1 = r14.f20148n
            r1.mo5919b()
            lv1.k r1 = new lv1.k
            r1.<init>()
            java.lang.String r0 = r0.getUsername()
            r1.f224468c = r0
            r1.f224478m = r14
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f20159y
            r1.f224479n = r0
            r1.f224467b = r10
            java.lang.Class<kv1.q> r0 = kv1.C99260q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kv1.q r0 = (kv1.C99260q) r0
            r0.Xn0(r2, r1)
        L_0x052e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactMoreInfoUI.initView():void");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f20143f = getIntent().getStringExtra("Contact_ChatRoomId");
        this.f20141d = getIntent().getStringExtra("Contact_User");
        this.f20142e = C97625j3.m125812b().mo105907v().get(this.f20141d);
        this.f20153s = getIntent().getStringExtra("KLinkedInAddFriendNickName");
        this.f20154t = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
        this.f20155u = getIntent().getStringExtra("verify_gmail");
        getIntent().getStringExtra("profileName");
        if (!Util.isNullOrNil(this.f20143f)) {
            ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(this.f20143f);
        }
        initView();
    }
}
