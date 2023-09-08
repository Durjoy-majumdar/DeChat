package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.storage.C72996z1;
import df2.C75381g;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import kv1.C61173o;
import kv1.C99252h;
import lv1.C10656l;
import md3.C47001b;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI */
public class ContactProfileMoreUI extends MMPreference implements C61173o {

    /* renamed from: d */
    public C75381g f20163d;

    /* renamed from: e */
    public C47511g f20164e;

    /* renamed from: f */
    public C72996z1 f20165f;

    /* renamed from: g */
    public String f20166g;

    /* renamed from: h */
    public String f20167h;

    /* renamed from: com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI$a */
    public class C4945a implements MenuItem.OnMenuItemClickListener {
        public C4945a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactProfileMoreUI.this.finish();
            return true;
        }
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        Preference a = this.f20164e.mo72519a("common_chatroom");
        if (lVar.f32074c == 0) {
            int intValue = ((Integer) lVar.f32076e.get(0).f292161o).intValue();
            a.mo7741E(getString(C0966R.string.blm, new Object[]{Integer.valueOf(intValue)}));
            a.mo69925c().putInt("count", intValue);
        } else {
            a.mo7741E(getString(C0966R.string.blm, new Object[]{0}));
        }
        this.f20164e.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8887af;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r15 = 2131821586(0x7f110412, float:1.927592E38)
            r14.setMMTitle((int) r15)
            com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI$a r15 = new com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI$a
            r15.<init>()
            r14.setBackBtn(r15)
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "Is_RoomOwner"
            r1 = 0
            r15.getBooleanExtra(r0, r1)
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "Contact_ChatRoomId"
            java.lang.String r15 = r15.getStringExtra(r0)
            r14.f20167h = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "Contact_User"
            java.lang.String r15 = r15.getStringExtra(r0)
            r14.f20166g = r15
            eb0.c r15 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r15 = r15.mo105907v()
            java.lang.String r0 = r14.f20166g
            com.tencent.mm.storage.z1 r15 = r15.get(r0)
            r14.f20165f = r15
            java.lang.String r15 = r14.f20167h
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x005a
            eb0.c r15 = eb0.C97625j3.m125812b()
            eb0.m2 r15 = r15.mo105902q()
            java.lang.String r0 = r14.f20167h
            com.tencent.mm.storage.n1 r15 = (com.tencent.p014mm.storage.C44662n1) r15
            r15.mo69799Lo(r0)
        L_0x005a:
            df2.g r15 = new df2.g
            com.tencent.mm.storage.z1 r0 = r14.f20165f
            r15.<init>(r14, r0)
            r14.f20163d = r15
            pj3.g r15 = r14.getPreferenceScreen()
            r14.f20164e = r15
            com.tencent.mm.storage.z1 r0 = r14.f20165f
            java.lang.String r2 = "common_chatroom"
            com.tencent.mm.ui.base.preference.Preference r3 = r15.mo72519a(r2)
            java.lang.String r4 = r0.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            r5 = 1
            if (r4 != 0) goto L_0x008d
            java.lang.String r4 = r0.getUsername()
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r4 = 0
            goto L_0x008e
        L_0x008d:
            r4 = 1
        L_0x008e:
            r6 = 2
            if (r4 == 0) goto L_0x0095
            r15.mo72529n(r2, r5)
            goto L_0x00d5
        L_0x0095:
            int r2 = r0.f149500H
            if (r2 != r5) goto L_0x00a0
            r2 = 2131824104(0x7f110de8, float:1.9281026E38)
            r3.mo69923G(r2)
            goto L_0x00af
        L_0x00a0:
            if (r2 != r6) goto L_0x00a9
            r2 = 2131824103(0x7f110de7, float:1.9281024E38)
            r3.mo69923G(r2)
            goto L_0x00af
        L_0x00a9:
            r2 = 2131824108(0x7f110dec, float:1.9281035E38)
            r3.mo69923G(r2)
        L_0x00af:
            lv1.k r2 = new lv1.k
            r2.<init>()
            java.lang.String r0 = r0.getUsername()
            r2.f224468c = r0
            r2.f224478m = r14
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r3)
            r2.f224479n = r0
            r0 = 5
            r2.f224467b = r0
            java.lang.Class<kv1.q> r0 = kv1.C99260q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kv1.q r0 = (kv1.C99260q) r0
            r0.Xn0(r6, r2)
        L_0x00d5:
            pj3.g r0 = r14.f20164e
            java.lang.String r2 = "friend_source"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r2)
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.getSource()
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 0
            r8 = 3
            r9 = 10
            if (r3 == r5) goto L_0x020d
            r10 = 8
            if (r3 == r10) goto L_0x01f9
            r10 = 2131824364(0x7f110eec, float:1.9281554E38)
            r11 = 2131824363(0x7f110eeb, float:1.9281552E38)
            if (r3 == r9) goto L_0x01eb
            r12 = 34
            if (r3 == r12) goto L_0x01e4
            r12 = 48
            if (r3 == r12) goto L_0x01dd
            r12 = 76
            if (r3 == r12) goto L_0x01d6
            if (r3 == r8) goto L_0x01c2
            r12 = 4
            if (r3 == r12) goto L_0x01bb
            r12 = 17
            if (r3 == r12) goto L_0x01a5
            r12 = 18
            if (r3 == r12) goto L_0x018f
            switch(r3) {
                case 12: goto L_0x01bb;
                case 13: goto L_0x0135;
                case 14: goto L_0x01f9;
                case 15: goto L_0x011f;
                default: goto L_0x0114;
            }
        L_0x0114:
            switch(r3) {
                case 22: goto L_0x0171;
                case 23: goto L_0x0171;
                case 24: goto L_0x0171;
                case 25: goto L_0x015b;
                case 26: goto L_0x0171;
                case 27: goto L_0x0171;
                case 28: goto L_0x0171;
                case 29: goto L_0x0171;
                case 30: goto L_0x0145;
                default: goto L_0x0117;
            }
        L_0x0117:
            switch(r3) {
                case 58: goto L_0x0187;
                case 59: goto L_0x0187;
                case 60: goto L_0x0187;
                default: goto L_0x011a;
            }
        L_0x011a:
            r0.mo7741E(r7)
            goto L_0x0220
        L_0x011f:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x012d
            r3 = 2131824352(0x7f110ee0, float:1.928153E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x012d:
            r3 = 2131824351(0x7f110edf, float:1.9281527E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0135:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x0140
            r0.mo7740D(r10)
            goto L_0x0220
        L_0x0140:
            r0.mo7740D(r11)
            goto L_0x0220
        L_0x0145:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x0153
            r3 = 2131824348(0x7f110edc, float:1.9281521E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0153:
            r3 = 2131824347(0x7f110edb, float:1.928152E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x015b:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x0169
            r3 = 2131824328(0x7f110ec8, float:1.928148E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0169:
            r3 = 2131824327(0x7f110ec7, float:1.9281479E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0171:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x017f
            r3 = 2131824361(0x7f110ee9, float:1.9281548E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x017f:
            r3 = 2131824360(0x7f110ee8, float:1.9281546E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0187:
            r3 = 2131830991(0x7f1128cf, float:1.9294995E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x018f:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x019d
            r3 = 2131824343(0x7f110ed7, float:1.9281511E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x019d:
            r3 = 2131824342(0x7f110ed6, float:1.928151E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01a5:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x01b3
            r3 = 2131824333(0x7f110ecd, float:1.928149E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01b3:
            r3 = 2131824330(0x7f110eca, float:1.9281485E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01bb:
            r3 = 2131830280(0x7f112608, float:1.9293553E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01c2:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x01cf
            r3 = 2131824358(0x7f110ee6, float:1.9281542E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01cf:
            r3 = 2131824357(0x7f110ee5, float:1.928154E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01d6:
            r3 = 2131824345(0x7f110ed9, float:1.9281515E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01dd:
            r3 = 2131824350(0x7f110ede, float:1.9281525E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01e4:
            r3 = 2131824325(0x7f110ec5, float:1.9281475E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x01eb:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x01f5
            r0.mo7740D(r10)
            goto L_0x0220
        L_0x01f5:
            r0.mo7740D(r11)
            goto L_0x0220
        L_0x01f9:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x0206
            r3 = 2131824337(0x7f110ed1, float:1.92815E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x0206:
            r3 = 2131824336(0x7f110ed0, float:1.9281497E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x020d:
            com.tencent.mm.storage.z1 r3 = r14.f20165f
            int r3 = r3.f149526Z
            if (r3 <= r4) goto L_0x021a
            r3 = 2131824355(0x7f110ee3, float:1.9281536E38)
            r0.mo7740D(r3)
            goto L_0x0220
        L_0x021a:
            r3 = 2131824354(0x7f110ee2, float:1.9281534E38)
            r0.mo7740D(r3)
        L_0x0220:
            java.lang.CharSequence r0 = r0.mo5913r()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r0 == 0) goto L_0x022d
            r15.mo72529n(r2, r5)
        L_0x022d:
            java.lang.String r0 = "district"
            com.tencent.mm.ui.base.preference.Preference r2 = r15.mo72519a(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            d62.i r4 = (d62.C75339i) r4
            com.tencent.mm.storage.z1 r10 = r14.f20165f
            java.lang.String r10 = r10.f149518V
            java.lang.String r4 = r4.K90(r10)
            r3.append(r4)
            com.tencent.mm.storage.z1 r4 = r14.f20165f
            java.lang.String r4 = r4.f149520W
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r10 = ""
            if (r4 == 0) goto L_0x0259
            r4 = r10
            goto L_0x026e
        L_0x0259:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "  "
            r4.append(r11)
            com.tencent.mm.storage.z1 r11 = r14.f20165f
            java.lang.String r11 = r11.f149520W
            r4.append(r11)
            java.lang.String r4 = r4.toString()
        L_0x026e:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mo7741E(r3)
            java.lang.CharSequence r2 = r2.mo5913r()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)
            if (r2 == 0) goto L_0x0285
            r15.mo72529n(r0, r5)
        L_0x0285:
            java.lang.String r2 = "signature"
            com.tencent.mm.ui.base.preference.Preference r2 = r15.mo72519a(r2)
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            com.tencent.mm.storage.z1 r4 = r14.f20165f
            java.lang.String r4 = r4.f149516U
            android.text.SpannableString r3 = r3.mo107057T1(r14, r4)
            r2.mo7741E(r3)
            java.lang.CharSequence r2 = r2.mo5913r()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)
            if (r2 == 0) goto L_0x02ac
            r15.mo72529n(r0, r5)
        L_0x02ac:
            com.tencent.mm.storage.z1 r0 = r14.f20165f
            java.lang.String r2 = "weishop"
            com.tencent.mm.ui.base.preference.Preference r3 = r15.mo72519a(r2)
            java.lang.String r4 = eb0.C75592q0.m90789s()
            java.lang.String r11 = r0.getUsername()
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x02d4
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_STRING
            java.lang.Object r0 = r0.mo119685f(r4, r7)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x02d6
        L_0x02d4:
            java.lang.String r0 = r0.f149523X0
        L_0x02d6:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x02ff
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02f1 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02f1 }
            java.lang.String r0 = "ShopUrl"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x02f1 }
            java.lang.String r11 = "ShopName"
            java.lang.String r4 = r4.optString(r11)     // Catch:{ JSONException -> 0x02ef }
            r7 = r4
            goto L_0x02fb
        L_0x02ef:
            r4 = move-exception
            goto L_0x02f4
        L_0x02f1:
            r0 = move-exception
            r4 = r0
            r0 = r7
        L_0x02f4:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "MicroMsg.ContactProfileMoreUI"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r4, r10, r11)
        L_0x02fb:
            r13 = r7
            r7 = r0
            r0 = r13
            goto L_0x0300
        L_0x02ff:
            r0 = r7
        L_0x0300:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r4 != 0) goto L_0x0320
            r3.mo7741E(r0)
            android.content.res.Resources r0 = r14.getResources()
            r4 = 2131101324(0x7f06068c, float:1.7815054E38)
            int r0 = r0.getColor(r4)
            r3.f121293z = r0
            android.os.Bundle r0 = r3.mo69925c()
            java.lang.String r4 = "shopUrl"
            r0.putString(r4, r7)
        L_0x0320:
            java.lang.CharSequence r0 = r3.mo5913r()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            java.lang.String r3 = "contact_info_category_1"
            if (r0 == 0) goto L_0x0333
            r15.mo72529n(r2, r5)
            r15.mo72529n(r3, r5)
            goto L_0x0336
        L_0x0333:
            r15.mo72529n(r3, r1)
        L_0x0336:
            java.lang.String r0 = "add_to_black"
            com.tencent.mm.ui.base.preference.Preference r0 = r15.mo72519a(r0)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            com.tencent.mm.storage.z1 r1 = r14.f20165f
            boolean r1 = r1.mo62920o3()
            r0.mo6805K(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0.add(r1)
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            com.tencent.mm.storage.z1 r1 = r14.f20165f
            boolean r1 = r1.mo62927s3()
            if (r1 != 0) goto L_0x039e
            df2.g r1 = r14.f20163d
            int r1 = r1.f221635f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x039e
            java.lang.String r0 = "expose"
            r15.mo72529n(r0, r5)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactProfileMoreUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C75381g gVar = this.f20163d;
        gVar.getClass();
        ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(gVar);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("common_chatroom")) {
            int i = preference.mo69925c().getInt("count", 0);
            C99252h.m129299d(i);
            if (i <= 0) {
                return true;
            }
            Intent intent = new Intent(this, CommonChatroomInfoUI.class);
            intent.putExtra("Select_Talker_Name", this.f20165f.getUsername());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (preference.f121285r.equals("weishop")) {
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", preference.mo69925c().getString("shopUrl"));
            intent2.putExtra("geta8key_username", C75592q0.m90789s());
            C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
        } else if (preference.f121285r.equals("send_to_friend")) {
            this.f20163d.mo105718b();
        } else if (preference.f121285r.equals("add_to_black")) {
            this.f20163d.mo105719c(false);
        } else if (preference.f121285r.equals("expose")) {
            this.f20163d.mo105724h();
        } else if (preference.f121285r.equals("delete_contact")) {
            this.f20163d.mo105721e();
        }
        return false;
    }
}
