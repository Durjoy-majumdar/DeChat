package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import hf2.C8515a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import p196ln.C76706g;
import p248ug.C52558c;
import pj3.C47511g;
import rb0.C47984k;
import rb0.C47987l;
import rb0.C47989m;
import rb0.C48009v0;
import te3.C51043r10;
import te3.d45;

/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI */
public class NewBizInfoMoreInofUI extends MMPreference implements C47989m.C47992c {

    /* renamed from: r */
    public static final String f115431r = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/infringement?username=%s&from=1#wechat_redirect");

    /* renamed from: d */
    public C47511g f115432d;

    /* renamed from: e */
    public C72996z1 f115433e;

    /* renamed from: f */
    public C51043r10 f115434f;

    /* renamed from: g */
    public C52558c f115435g;

    /* renamed from: h */
    public C52558c.C52560b f115436h;

    /* renamed from: i */
    public List<C52558c.C52559a> f115437i;

    /* renamed from: j */
    public boolean f115438j = false;

    /* renamed from: n */
    public Bundle f115439n;

    /* renamed from: o */
    public int f115440o;

    /* renamed from: p */
    public String f115441p;

    /* renamed from: q */
    public boolean f115442q;

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI$a */
    public class C42647a implements Preference.C44716c {

        /* renamed from: a */
        public final /* synthetic */ KeyValuePreference f115443a;

        public C42647a(KeyValuePreference keyValuePreference) {
            this.f115443a = keyValuePreference;
        }

        /* renamed from: a */
        public boolean mo66781a(Preference preference) {
            ClipboardHelper.setText(this.f115443a.f121281n);
            C76879j.m92726T(NewBizInfoMoreInofUI.this.getContext(), NewBizInfoMoreInofUI.this.getContext().getString(C0966R.string.f7938wv));
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo66776H7(C47987l lVar) {
        Class cls = C76706g.class;
        long currentTimeMillis = System.currentTimeMillis();
        C68098o oVar = (C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg();
        if (oVar.mo93607Lo(lVar.field_openId) == null) {
            C68097n nVar = new C68097n();
            nVar.f195728a = lVar.field_openId;
            nVar.f195731d = lVar.field_headImgUrl;
            nVar.f195733f = 0;
            nVar.f195729b = 3;
            oVar.mo93608Yt(nVar);
        }
        ((C68082g) ((C76706g) C86312j.m106911c(cls)).mo106847uz()).mo93575b(lVar.field_openId);
        Log.m105919d("MicroMsg.NewBizInfoMoreInofUI", "downloadKFAvatar, %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p248ug.C52558c.C52559a mo66777I7() {
        /*
            r7 = this;
            java.util.List<ug.c$a> r0 = r7.f115437i
            r1 = 0
            java.lang.String r2 = "brandInfoList is null not show location"
            java.lang.String r3 = "MicroMsg.NewBizInfoMoreInofUI"
            if (r0 == 0) goto L_0x0040
            int r0 = r0.size()
            if (r0 >= 0) goto L_0x0010
            goto L_0x0040
        L_0x0010:
            java.util.List<ug.c$a> r0 = r7.f115437i
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r0.next()
            ug.c$a r4 = (p248ug.C52558c.C52559a) r4
            java.lang.String r5 = r4.f146787b
            java.lang.String r6 = "__mp_wording__brandinfo_location"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003b
            r5 = 2131824091(0x7f110ddb, float:1.9281E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = r4.f146786a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0016
        L_0x003b:
            return r4
        L_0x003c:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            return r1
        L_0x0040:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI.mo66777I7():ug.c$a");
    }

    /* renamed from: J7 */
    public final void mo66778J7(int i, String str) {
        int i2;
        int i3;
        String str2;
        Bundle bundle = this.f115439n;
        if (bundle == null || !((i2 = this.f115440o) == 39 || i2 == 56 || i2 == 35 || i2 == 87 || i2 == 88 || i2 == 89 || i2 == 85)) {
            Log.m105918d("MicroMsg.NewBizInfoMoreInofUI", "mExtArgs is null or the add contact action is not from biz search.");
        } else if (this.f115433e == null) {
            Log.m105924i("MicroMsg.NewBizInfoMoreInofUI", "contact is null.");
        } else {
            String string = bundle.getString("Contact_Ext_Args_Search_Id");
            String nullAsNil = Util.nullAsNil(this.f115439n.getString("Contact_Ext_Args_Query_String"));
            int i4 = this.f115439n.getInt("Contact_Ext_Args_Index");
            int i5 = this.f115440o;
            if (i5 == 35) {
                i3 = 1;
            } else if (i5 != 85) {
                switch (i5) {
                    case 87:
                        i3 = 2;
                        break;
                    case 88:
                        i3 = 3;
                        break;
                    case 89:
                        i3 = 4;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
            } else {
                i3 = 5;
            }
            String nullAsNil2 = Util.nullAsNil(this.f115439n.getString("Contact_Ext_Extra_Params"));
            String str3 = nullAsNil + "," + i + "," + Util.nullAsNil(this.f115433e.getUsername()) + "," + i4 + "," + (System.currentTimeMillis() / 1000) + "," + string + "," + i3;
            if (!Util.isNullOrNil(str)) {
                str2 = str3 + "," + str + "," + nullAsNil2;
            } else {
                str2 = str3 + ",," + nullAsNil2;
            }
            Log.m105927v("MicroMsg.NewBizInfoMoreInofUI", "report 10866: %s", str2);
            C115669n.INSTANCE.kvStat(10866, str2);
        }
    }

    /* renamed from: L6 */
    public String mo66779L6() {
        return "MicroMsg.NewBizInfoMoreInofUI";
    }

    /* renamed from: g5 */
    public void mo66780g5(LinkedList<d45> linkedList) {
        C48009v0.Gx0().mo72778e(this);
        if (this.f115432d == null) {
            Log.m105920e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, screen is null");
        } else if (this.f115433e == null) {
            Log.m105920e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, contact is null");
        } else if (linkedList == null || linkedList.size() <= 0) {
            Log.m105928w("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, worker is null");
        } else {
            if (!Util.isNullOrNil(this.f115441p)) {
                Iterator<d45> it = linkedList.iterator();
                while (it.hasNext()) {
                    d45 next = it.next();
                    String str = next.f132111d;
                    if (str != null && str.equals(this.f115441p)) {
                        this.f115432d.mo72529n("contact_info_kf_worker", false);
                        this.f115432d.mo72519a("contact_info_kf_worker").mo7741E(next.f132113f);
                        return;
                    }
                }
            }
            this.f115432d.mo72529n("contact_info_kf_worker", false);
            this.f115432d.mo72519a("contact_info_kf_worker").mo7741E(linkedList.get(0).f132113f);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8922bg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r16 = this;
            r1 = r16
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            pj3.g r2 = r1.f115432d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "biz_placed_to_the_top"
            r5 = 1
            r2.mo72529n(r4, r5)
            com.tencent.mm.storage.z1 r2 = r1.f115433e
            java.lang.String r2 = r2.getUsername()
            ug.c r2 = rb0.C47984k.m53328b(r2)
            r4 = 0
            r1.f115437i = r4
            r1.f115436h = r4
            r6 = 0
            if (r2 == 0) goto L_0x0026
            ug.c$b r7 = r2.mo73500r2(r6)
            if (r7 != 0) goto L_0x0053
        L_0x0026:
            te3.r10 r7 = r1.f115434f
            if (r7 == 0) goto L_0x0053
            ug.c r2 = new ug.c
            r2.<init>()
            com.tencent.mm.storage.z1 r7 = r1.f115433e
            java.lang.String r7 = r7.getUsername()
            r2.field_username = r7
            te3.r10 r7 = r1.f115434f
            int r8 = r7.f140656d
            r2.field_brandFlag = r8
            java.lang.String r8 = r7.f140659g
            r2.field_brandIconURL = r8
            java.lang.String r8 = r7.f140658f
            r2.field_brandInfo = r8
            java.lang.String r7 = r7.f140657e
            r2.field_extInfo = r7
            ug.c$b r7 = r2.mo73500r2(r6)
            int r7 = r7.mo73517j()
            r2.field_type = r7
        L_0x0053:
            if (r2 == 0) goto L_0x0085
            java.lang.String r7 = r2.field_brandInfo
            if (r7 != 0) goto L_0x0085
            java.lang.String r7 = r2.field_extInfo
            if (r7 != 0) goto L_0x0085
            te3.r10 r7 = r1.f115434f
            if (r7 == 0) goto L_0x0085
            com.tencent.mm.storage.z1 r7 = r1.f115433e
            java.lang.String r7 = r7.getUsername()
            r2.field_username = r7
            te3.r10 r7 = r1.f115434f
            int r8 = r7.f140656d
            r2.field_brandFlag = r8
            java.lang.String r8 = r7.f140659g
            r2.field_brandIconURL = r8
            java.lang.String r8 = r7.f140658f
            r2.field_brandInfo = r8
            java.lang.String r7 = r7.f140657e
            r2.field_extInfo = r7
            ug.c$b r7 = r2.mo73500r2(r6)
            int r7 = r7.mo73517j()
            r2.field_type = r7
        L_0x0085:
            if (r2 == 0) goto L_0x00ab
            r1.f115435g = r2
            java.util.List r7 = r2.mo73496n2()
            r1.f115437i = r7
            ug.c$b r2 = r2.mo73500r2(r6)
            r1.f115436h = r2
            org.json.JSONObject r7 = r2.f146795a
            if (r7 == 0) goto L_0x00a7
            java.lang.String r8 = "IsShowMember"
            java.lang.String r7 = r7.optString(r8)
            java.lang.String r8 = "1"
            boolean r7 = r8.equals(r7)
            r2.f146797c = r7
        L_0x00a7:
            boolean r2 = r2.f146797c
            r1.f115438j = r2
        L_0x00ab:
            com.tencent.mm.storage.z1 r2 = r1.f115433e
            boolean r2 = r2.mo62927s3()
            java.lang.String r7 = "contact_info_wechat_account"
            if (r2 == 0) goto L_0x014d
            ug.c r2 = r1.f115435g
            if (r2 != 0) goto L_0x00bb
            r2 = 1
            goto L_0x00bf
        L_0x00bb:
            boolean r2 = r2.mo72810e0()
        L_0x00bf:
            if (r2 == 0) goto L_0x014d
            pj3.g r2 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r7)
            com.tencent.mm.ui.base.preference.KeyValuePreference r2 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r2
            com.tencent.mm.storage.z1 r8 = r1.f115433e
            java.lang.String r8 = r8.mo62913l2()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x00ee
            pj3.g r8 = r1.f115432d
            r8.mo72529n(r7, r6)
            di3.d r7 = di3.C86312j.m106911c(r0)
            ny.h r7 = (p629ny.C76979h) r7
            com.tencent.mm.storage.z1 r8 = r1.f115433e
            java.lang.String r8 = r8.mo62913l2()
            android.text.SpannableString r7 = r7.mo107057T1(r1, r8)
            r2.mo7741E(r7)
            goto L_0x0145
        L_0x00ee:
            com.tencent.mm.storage.z1 r8 = r1.f115433e
            java.lang.String r8 = r8.getUsername()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85802I4(r8)
            if (r8 != 0) goto L_0x0140
            com.tencent.mm.storage.z1 r8 = r1.f115433e
            java.lang.String r8 = r8.getUsername()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85796D5(r8)
            if (r8 != 0) goto L_0x0140
            pj3.g r8 = r1.f115432d
            r8.mo72529n(r7, r6)
            com.tencent.mm.storage.z1 r7 = r1.f115433e
            java.lang.String r7 = r7.mo62911k3()
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            androidx.appcompat.app.AppCompatActivity r9 = r16.getContext()
            com.tencent.mm.storage.z1 r10 = r1.f115433e
            java.lang.String r10 = r10.getUsername()
            java.lang.String r9 = com.tencent.p014mm.plugin.profile.C70142g.m82630b(r9, r10)
            r8.append(r9)
            com.tencent.mm.storage.z1 r9 = r1.f115433e
            java.lang.String r9 = r9.getUsername()
            java.lang.String r7 = com.tencent.p014mm.plugin.profile.C70142g.m82631c(r9, r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r2.mo7741E(r7)
            goto L_0x0145
        L_0x0140:
            pj3.g r8 = r1.f115432d
            r8.mo72529n(r7, r5)
        L_0x0145:
            com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI$a r7 = new com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI$a
            r7.<init>(r2)
            r2.f121277g = r7
            goto L_0x0152
        L_0x014d:
            pj3.g r2 = r1.f115432d
            r2.mo72529n(r7, r5)
        L_0x0152:
            ug.c$b r2 = r1.f115436h
            r7 = 2
            r8 = 49
            java.lang.String r9 = "contact_info_verifyuser"
            java.lang.String r10 = "MicroMsg.NewBizInfoMoreInofUI"
            if (r2 == 0) goto L_0x0250
            ug.c$b$e r2 = r2.mo73521n()
            if (r2 == 0) goto L_0x0250
            ug.c$b r2 = r1.f115436h
            ug.c$b$e r2 = r2.mo73521n()
            java.lang.String r2 = r2.f146837b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0250
            ug.c$b r2 = r1.f115436h
            ug.c$b$e r2 = r2.mo73521n()
            pj3.g r11 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r11 = r11.mo72519a(r9)
            com.tencent.mm.ui.base.preference.KeyValuePreference r11 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r11
            if (r11 == 0) goto L_0x024a
            r11.f121243P = r5
            r11.f121245R = r8
            r11.f121240L = r6
            java.lang.String r9 = r2.f146838c
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x01d6
            int r9 = r2.f146836a
            if (r9 == 0) goto L_0x01c8
            if (r9 == r5) goto L_0x01bc
            if (r9 == r7) goto L_0x01b0
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12[r6] = r9
            java.lang.String r9 = "getVerifyStr, error type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r9, r12)
            android.content.res.Resources r9 = r16.getResources()
            r12 = 2131824168(0x7f110e28, float:1.9281156E38)
            java.lang.String r9 = r9.getString(r12)
            goto L_0x01d3
        L_0x01b0:
            android.content.res.Resources r9 = r16.getResources()
            r12 = 2131824081(0x7f110dd1, float:1.928098E38)
            java.lang.String r9 = r9.getString(r12)
            goto L_0x01d3
        L_0x01bc:
            android.content.res.Resources r9 = r16.getResources()
            r12 = 2131824080(0x7f110dd0, float:1.9280978E38)
            java.lang.String r9 = r9.getString(r12)
            goto L_0x01d3
        L_0x01c8:
            android.content.res.Resources r9 = r16.getResources()
            r12 = 2131824391(0x7f110f07, float:1.9281609E38)
            java.lang.String r9 = r9.getString(r12)
        L_0x01d3:
            r11.f121242N = r9
            goto L_0x01da
        L_0x01d6:
            java.lang.String r9 = r2.f146838c
            r11.f121242N = r9
        L_0x01da:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r6] = r3
            java.lang.String r12 = "verify bmp is null ? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r9)
            r11.f121249V = r4
            java.lang.String r9 = r2.f146837b
            if (r9 == 0) goto L_0x0244
            java.lang.String r9 = r2.f146840e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            java.lang.String r2 = r2.f146837b
            java.lang.String r2 = r2.trim()
            android.text.SpannableString r2 = r0.mo107057T1(r1, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 != 0) goto L_0x0240
            android.text.SpannableString r12 = new android.text.SpannableString     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            r0.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            java.lang.String r13 = " "
            r0.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            r0.append(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            java.lang.String r0 = r0.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            r12.<init>(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0231 }
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r2 = -36352(0xffffffffffff7200, float:NaN)
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            int r2 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r9 = 17
            r12.setSpan(r0, r6, r2, r9)     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r2 = r12
            goto L_0x0240
        L_0x022e:
            r0 = move-exception
            r2 = r12
            goto L_0x0232
        L_0x0231:
            r0 = move-exception
        L_0x0232:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r9[r6] = r0
            java.lang.String r0 = "verifySummary setSpan error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r9)
        L_0x0240:
            r11.mo7741E(r2)
            goto L_0x0288
        L_0x0244:
            java.lang.String r0 = "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0288
        L_0x024a:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
            goto L_0x0288
        L_0x0250:
            ug.c$b r0 = r1.f115436h
            if (r0 == 0) goto L_0x027e
            ug.c$b$h r0 = r0.mo73515h()
            if (r0 == 0) goto L_0x027e
            ug.c$b r0 = r1.f115436h
            ug.c$b$h r0 = r0.mo73515h()
            java.lang.String r0 = r0.f146848a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x027e
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r9)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            if (r0 == 0) goto L_0x0288
            ug.c$b r2 = r1.f115436h
            ug.c$b$h r2 = r2.mo73515h()
            java.lang.String r2 = r2.f146848a
            r0.mo7741E(r2)
            goto L_0x0288
        L_0x027e:
            java.lang.String r0 = "has not verify info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
        L_0x0288:
            ug.c$b r0 = r1.f115436h
            java.lang.String r2 = "contact_info_trademark"
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = r0.mo73519l()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02d6
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r2)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            if (r0 == 0) goto L_0x02e0
            r0.f121243P = r5
            r0.f121245R = r8
            r0.f121240L = r6
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r3
            java.lang.String r3 = "trademark bmp is null ? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            r0.f121249V = r4
            ug.c$b r2 = r1.f115436h
            java.lang.String r2 = r2.mo73519l()
            r0.mo7741E(r2)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            ug.c$b r2 = r1.f115436h
            java.lang.String r2 = r2.mo73519l()
            r0[r6] = r2
            ug.c$b r2 = r1.f115436h
            java.lang.String r2 = r2.mo73520m()
            r0[r5] = r2
            java.lang.String r2 = "trademark name : %s, url : %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r0)
            goto L_0x02e0
        L_0x02d6:
            java.lang.String r0 = "has not trademark info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r2, r5)
        L_0x02e0:
            ug.c$b r0 = r1.f115436h
            java.lang.String r2 = "string"
            java.lang.String r3 = "contact_info_privilege"
            if (r0 == 0) goto L_0x036a
            java.util.List r0 = r0.mo73514g()
            if (r0 == 0) goto L_0x036a
            ug.c$b r0 = r1.f115436h
            java.util.List r0 = r0.mo73514g()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x036a
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r3)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            r0.f121243P = r5
            r0.f121245R = r8
            r0.mo69912I(r6)
            java.util.List<android.view.View> r3 = r0.f121251X
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            r3.clear()
            ug.c$b r3 = r1.f115436h
            java.util.List r3 = r3.mo73514g()
            java.util.Iterator r3 = r3.iterator()
        L_0x031b:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x036f
            java.lang.Object r8 = r3.next()
            ug.c$b$g r8 = (p248ug.C52558c.C52560b.C52568g) r8
            r9 = 2131496084(0x7f0c0c94, float:1.8615723E38)
            android.view.View r9 = android.view.View.inflate(r1, r9, r4)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r11 = 2131306304(0x7f092740, float:1.8230803E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            sf2.c r12 = new sf2.c
            android.content.res.Resources r13 = r16.getResources()
            java.lang.String r14 = r8.f146845a
            r12.<init>(r13, r14)
            r11.setImageDrawable(r12)
            java.lang.String r11 = r8.f146846b
            android.content.res.Resources r12 = r16.getResources()
            java.lang.String r8 = r8.f146847c
            java.lang.String r13 = r16.getPackageName()
            r12.getIdentifier(r8, r2, r13)
            r8 = 2131314717(0x7f09481d, float:1.8247867E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r11)
            java.util.List<android.view.View> r8 = r0.f121251X
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            r8.add(r9)
            goto L_0x031b
        L_0x036a:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r3, r5)
        L_0x036f:
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r3 = "Contact_BIZ_KF_WORKER_ID"
            java.lang.String r0 = r0.getStringExtra(r3)
            java.lang.Class<ln.i> r3 = p196ln.C76708i.class
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r0
            boolean r9 = r1.f115442q
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r5] = r9
            java.lang.String r9 = "updateKF %s, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r8)
            boolean r8 = r1.f115442q
            if (r8 == 0) goto L_0x0393
            goto L_0x04b7
        L_0x0393:
            r1.f115441p = r0
            ug.c$b r8 = r1.f115436h
            java.lang.String r9 = "contact_info_kf_worker"
            if (r8 == 0) goto L_0x04b2
            org.json.JSONObject r11 = r8.f146795a
            if (r11 == 0) goto L_0x03a7
            java.lang.String r12 = "FunctionFlag"
            int r11 = r11.optInt(r12)
            r8.f146819y = r11
        L_0x03a7:
            int r8 = r8.f146819y
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r11 = p248ug.C52558c.f146783y0
            r8 = r8 & r5
            if (r8 <= 0) goto L_0x03b0
            r8 = 1
            goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            if (r8 == 0) goto L_0x04b2
            com.tencent.mm.storage.z1 r8 = r1.f115433e
            if (r8 != 0) goto L_0x03b9
            goto L_0x04b2
        L_0x03b9:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r11 = 2000(0x7d0, double:9.88E-321)
            if (r8 == 0) goto L_0x0431
            rb0.n r0 = rb0.C48009v0.Hx0()
            com.tencent.mm.storage.z1 r7 = r1.f115433e
            java.lang.String r7 = r7.getUsername()
            rb0.l r0 = r0.mo72784qq(r7)
            if (r0 != 0) goto L_0x03f2
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
            rb0.m r0 = rb0.C48009v0.Gx0()
            r0.mo72774a(r1)
            rb0.m r0 = rb0.C48009v0.Gx0()
            com.tencent.mm.storage.z1 r3 = r1.f115433e
            java.lang.String r3 = r3.getUsername()
            java.lang.String r7 = eb0.C75592q0.m90789s()
            r0.mo72776c(r3, r7)
            r1.f115442q = r5
            goto L_0x04b7
        L_0x03f2:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = r0.field_openId
            r7[r6] = r8
            java.lang.String r8 = "has default kf %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r8, r7)
            pj3.g r7 = r1.f115432d
            r7.mo72529n(r9, r6)
            pj3.g r7 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r9)
            com.tencent.mm.plugin.profile.ui.IconWidgetPreference r7 = (com.tencent.p014mm.plugin.profile.p088ui.IconWidgetPreference) r7
            java.lang.String r8 = r0.field_nickname
            r7.mo7741E(r8)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.i r3 = (p196ln.C76708i) r3
            java.lang.String r8 = r0.field_openId
            android.graphics.Bitmap r3 = r3.N50(r8)
            if (r3 != 0) goto L_0x042c
            r1.mo66776H7(r0)
            java.lang.String r0 = r0.field_openId
            hf2.b r3 = new hf2.b
            r3.<init>(r1, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r11)
            goto L_0x04b7
        L_0x042c:
            r7.mo5914I(r3)
            goto L_0x04b7
        L_0x0431:
            rb0.n r8 = rb0.C48009v0.Hx0()
            rb0.l r13 = r8.mo72780Lo(r0)
            if (r13 == 0) goto L_0x0441
            boolean r14 = r8.mo72782Yt(r13)
            if (r14 == 0) goto L_0x0457
        L_0x0441:
            rb0.m r14 = rb0.C48009v0.Gx0()
            r14.mo72774a(r1)
            rb0.m r14 = rb0.C48009v0.Gx0()
            com.tencent.mm.storage.z1 r15 = r1.f115433e
            java.lang.String r15 = r15.getUsername()
            r14.mo72777d(r15, r0, r5)
            r1.f115442q = r5
        L_0x0457:
            if (r13 != 0) goto L_0x0469
            java.lang.String r0 = "no such kf, get default kf"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            com.tencent.mm.storage.z1 r0 = r1.f115433e
            java.lang.String r0 = r0.getUsername()
            rb0.l r13 = r8.mo72784qq(r0)
        L_0x0469:
            if (r13 != 0) goto L_0x0471
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
            goto L_0x04b7
        L_0x0471:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r6)
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r9)
            com.tencent.mm.plugin.profile.ui.IconWidgetPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.IconWidgetPreference) r0
            java.lang.String r8 = r13.field_nickname
            r0.mo7741E(r8)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.i r3 = (p196ln.C76708i) r3
            java.lang.String r8 = r13.field_openId
            android.graphics.Bitmap r3 = r3.N50(r8)
            if (r3 != 0) goto L_0x049f
            r1.mo66776H7(r13)
            java.lang.String r0 = r13.field_openId
            hf2.b r3 = new hf2.b
            r3.<init>(r1, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r11)
            goto L_0x04a2
        L_0x049f:
            r0.mo5914I(r3)
        L_0x04a2:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = r13.field_openId
            r0[r6] = r3
            java.lang.String r3 = r13.field_nickname
            r0[r5] = r3
            java.lang.String r3 = "kf worker %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r0)
            goto L_0x04b7
        L_0x04b2:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
        L_0x04b7:
            ug.c$b r0 = r1.f115436h
            r3 = 2131101015(0x7f060557, float:1.7814428E38)
            java.lang.String r7 = "contact_info_service_phone"
            if (r0 == 0) goto L_0x04eb
            java.lang.String r0 = r0.mo73516i()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x04eb
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r7, r6)
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r7)
            if (r0 == 0) goto L_0x04f0
            ug.c$b r7 = r1.f115436h
            java.lang.String r7 = r7.mo73516i()
            r0.mo7741E(r7)
            android.content.res.Resources r7 = r16.getResources()
            int r7 = r7.getColor(r3)
            r0.f121293z = r7
            goto L_0x04f0
        L_0x04eb:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r7, r5)
        L_0x04f0:
            ug.c$b r0 = r1.f115436h
            java.lang.String r7 = "contact_info_guarantee_info"
            java.lang.String r8 = "contact_info_reputation"
            java.lang.String r9 = "contact_info_scope_of_business"
            if (r0 == 0) goto L_0x058d
            ug.c$b$f r0 = r0.mo73513f()
            if (r0 == 0) goto L_0x058d
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r8)
            com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.BizInfoPayInfoIconPreference) r0
            ug.c$b r11 = r1.f115436h
            ug.c$b$f r11 = r11.mo73513f()
            int r11 = r11.f146841a
            if (r11 <= 0) goto L_0x0525
            ug.c$b r8 = r1.f115436h
            ug.c$b$f r8 = r8.mo73513f()
            int r8 = r8.f146841a
            int r11 = r0.f20125M
            if (r8 != r11) goto L_0x051f
            goto L_0x052a
        L_0x051f:
            r0.f20125M = r8
            r0.mo5901J()
            goto L_0x052a
        L_0x0525:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r8, r5)
        L_0x052a:
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r7)
            com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.BizInfoPayInfoIconPreference) r0
            ug.c$b r8 = r1.f115436h
            ug.c$b$f r8 = r8.mo73513f()
            java.util.List<java.lang.String> r8 = r8.f146843c
            if (r8 == 0) goto L_0x055a
            ug.c$b r8 = r1.f115436h
            ug.c$b$f r8 = r8.mo73513f()
            java.util.List<java.lang.String> r8 = r8.f146843c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x055a
            ug.c$b r7 = r1.f115436h
            ug.c$b$f r7 = r7.mo73513f()
            java.util.List<java.lang.String> r7 = r7.f146843c
            r0.f20124L = r7
            r0.mo5901J()
            goto L_0x055f
        L_0x055a:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r7, r5)
        L_0x055f:
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r9)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            ug.c$b r7 = r1.f115436h
            ug.c$b$f r7 = r7.mo73513f()
            java.lang.String r7 = r7.f146842b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0587
            ug.c$b r7 = r1.f115436h
            ug.c$b$f r7 = r7.mo73513f()
            java.lang.String r7 = r7.f146842b
            r0.mo7741E(r7)
            r7 = 4
            r0.f121247T = r7
            r0.mo69912I(r6)
            goto L_0x059c
        L_0x0587:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
            goto L_0x059c
        L_0x058d:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r8, r5)
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r7, r5)
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r9, r5)
        L_0x059c:
            com.tencent.mm.storage.z1 r0 = r1.f115433e
            java.util.Set<java.lang.String> r7 = eb0.C45628s0.f123410p
            int r0 = r0.mo73955G2()
            r0 = r0 & r5
            if (r0 == 0) goto L_0x05a9
            r0 = 1
            goto L_0x05aa
        L_0x05a9:
            r0 = 0
        L_0x05aa:
            java.lang.String r7 = "contact_info_verifyuser_weibo"
            if (r0 == 0) goto L_0x060e
            com.tencent.mm.storage.z1 r0 = r1.f115433e
            java.lang.String r0 = r0.f149545p0
            if (r0 == 0) goto L_0x060e
            java.lang.String r8 = ""
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x060e
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r7)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            if (r0 == 0) goto L_0x0613
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.storage.z1 r11 = r1.f115433e
            java.lang.String r11 = r11.mo73956H2()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r8)
            r7.append(r11)
            r11 = 2131836331(0x7f113dab, float:1.9305826E38)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.tencent.mm.storage.z1 r13 = r1.f115433e
            java.lang.String r13 = r13.f149545p0
            boolean r14 = eb0.C45628s0.m50754S(r13)
            if (r14 == 0) goto L_0x05f4
            java.lang.String r14 = "http://t.qq.com/"
            java.lang.String r13 = r13.replace(r14, r8)
            java.lang.String r14 = "t.qq.com/"
            java.lang.String r8 = r13.replace(r14, r8)
        L_0x05f4:
            r12[r6] = r8
            java.lang.String r8 = r1.getString(r11, r12)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.mo7741E(r7)
            int r3 = kg3.C76577a.m92153d(r1, r3)
            r0.f121293z = r3
            r0.mo69912I(r6)
            goto L_0x0613
        L_0x060e:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r7, r5)
        L_0x0613:
            ug.c$b r0 = r1.f115436h
            java.lang.String r3 = "near_field_service"
            if (r0 == 0) goto L_0x062d
            boolean r0 = r0.mo73524q()
            if (r0 == 0) goto L_0x062d
            pj3.g r0 = r1.f115432d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r3)
            r3 = 2131840191(0x7f114cbf, float:1.9313655E38)
            r0.mo7740D(r3)
            goto L_0x0632
        L_0x062d:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r3, r5)
        L_0x0632:
            ug.c$a r0 = r16.mo66777I7()
            java.lang.String r3 = "contact_info_see_locate"
            if (r0 == 0) goto L_0x0640
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r3, r6)
            goto L_0x0645
        L_0x0640:
            pj3.g r0 = r1.f115432d
            r0.mo72529n(r3, r5)
        L_0x0645:
            pj3.g r0 = r1.f115432d
            java.lang.String r3 = "contact_info_category2"
            int r0 = r0.mo72521d(r3)
            if (r0 < 0) goto L_0x07be
            java.util.List<ug.c$a> r3 = r1.f115437i
            if (r3 == 0) goto L_0x07be
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x07be
            java.util.List<ug.c$a> r3 = r1.f115437i
            int r3 = r3.size()
            int r3 = r3 - r5
        L_0x0660:
            if (r3 < 0) goto L_0x07c4
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            if (r5 != 0) goto L_0x066c
            goto L_0x07ba
        L_0x066c:
            r5 = 2131824086(0x7f110dd6, float:1.928099E38)
            java.lang.String r5 = r1.getString(r5)
            java.util.List<ug.c$a> r6 = r1.f115437i
            java.lang.Object r6 = r6.get(r3)
            ug.c$a r6 = (p248ug.C52558c.C52559a) r6
            java.lang.String r6 = r6.f146786a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0689
            boolean r5 = r1.f115438j
            if (r5 != 0) goto L_0x0689
            goto L_0x07ba
        L_0x0689:
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            ug.c$a r5 = (p248ug.C52558c.C52559a) r5
            java.lang.String r5 = r5.f146786a
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x06ab
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            ug.c$a r5 = (p248ug.C52558c.C52559a) r5
            java.lang.String r5 = r5.f146787b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x06ab
            goto L_0x07ba
        L_0x06ab:
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            ug.c$a r5 = (p248ug.C52558c.C52559a) r5
            java.lang.String r5 = r5.f146787b
            java.lang.String r6 = "__mp_wording__brandinfo_location"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x07ba
            r5 = 2131824091(0x7f110ddb, float:1.9281E38)
            java.lang.String r5 = r1.getString(r5)
            java.util.List<ug.c$a> r6 = r1.f115437i
            java.lang.Object r6 = r6.get(r3)
            ug.c$a r6 = (p248ug.C52558c.C52559a) r6
            java.lang.String r6 = r6.f146786a
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x07ba
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            ug.c$a r5 = (p248ug.C52558c.C52559a) r5
            java.lang.String r5 = r5.f146787b
            java.lang.String r6 = "__mp_wording__brandinfo_history_massmsg"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x06e8
            goto L_0x07ba
        L_0x06e8:
            com.tencent.mm.ui.base.preference.Preference r5 = new com.tencent.mm.ui.base.preference.Preference
            r5.<init>(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "contact_info_bizinfo_external#"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r5.mo26273A(r7)
            java.util.List<ug.c$a> r7 = r1.f115437i
            java.lang.Object r7 = r7.get(r3)
            ug.c$a r7 = (p248ug.C52558c.C52559a) r7
            java.lang.String r7 = r7.f146786a
            android.content.res.Resources r8 = r16.getResources()
            java.util.List<ug.c$a> r10 = r1.f115437i
            java.lang.Object r10 = r10.get(r3)
            ug.c$a r10 = (p248ug.C52558c.C52559a) r10
            java.lang.String r10 = r10.f146787b
            java.lang.String r11 = r16.getPackageName()
            int r8 = r8.getIdentifier(r10, r2, r11)
            if (r8 <= 0) goto L_0x0727
            java.lang.String r7 = r1.getString(r8)
        L_0x0727:
            ug.c r8 = r1.f115435g
            boolean r8 = r8.mo73503u2()
            if (r8 == 0) goto L_0x0753
            java.util.List<ug.c$a> r8 = r1.f115437i
            java.lang.Object r8 = r8.get(r3)
            ug.c$a r8 = (p248ug.C52558c.C52559a) r8
            java.lang.String r8 = r8.f146787b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x074c
            r6 = 2131820556(0x7f11000c, float:1.927383E38)
            java.lang.String r6 = r1.getString(r6)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0753
        L_0x074c:
            r6 = 2131825142(0x7f1111f6, float:1.9283132E38)
            java.lang.String r7 = r1.getString(r6)
        L_0x0753:
            r5.mo69924H(r7)
            java.util.List<ug.c$a> r6 = r1.f115437i
            java.lang.Object r6 = r6.get(r3)
            ug.c$a r6 = (p248ug.C52558c.C52559a) r6
            java.lang.String r6 = r6.f146789d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0773
            java.util.List<ug.c$a> r6 = r1.f115437i
            java.lang.Object r6 = r6.get(r3)
            ug.c$a r6 = (p248ug.C52558c.C52559a) r6
            java.lang.String r6 = r6.f146789d
            r5.mo7741E(r6)
        L_0x0773:
            java.util.List<ug.c$a> r6 = r1.f115437i
            java.lang.Object r6 = r6.get(r3)
            ug.c$a r6 = (p248ug.C52558c.C52559a) r6
            java.lang.String r6 = r6.f146787b
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r7 = "__mp_wording__brandinfo_feedback"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0794
            pj3.g r6 = r1.f115432d
            int r6 = r6.mo72521d(r9)
            if (r6 <= 0) goto L_0x0794
            int r6 = r6 + 1
            goto L_0x0795
        L_0x0794:
            r6 = r0
        L_0x0795:
            pj3.g r7 = r1.f115432d
            r7.mo72524h(r5, r6)
            java.util.List<ug.c$a> r5 = r1.f115437i
            java.lang.Object r5 = r5.get(r3)
            ug.c$a r5 = (p248ug.C52558c.C52559a) r5
            java.lang.String r5 = r5.f146787b
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r7 = "__mp_wording__brandinfo_biz_detail"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x07ba
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r5 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            r5.<init>(r1, r4)
            pj3.g r7 = r1.f115432d
            r7.mo72524h(r5, r6)
        L_0x07ba:
            int r3 = r3 + -1
            goto L_0x0660
        L_0x07be:
            java.lang.String r0 = "pos no more"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
        L_0x07c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        C51043r10 r102;
        super.onCreate(bundle);
        this.f115432d = getPreferenceScreen();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        setMMTitle((int) C0966R.string.bkr);
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new C8515a(this));
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("Contact_User"));
        String nullAsNil2 = Util.nullAsNil(getIntent().getStringExtra("Contact_Alias"));
        int intExtra = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
        int intExtra2 = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
        String stringExtra = getIntent().getStringExtra("Contact_KWeibo");
        String stringExtra2 = getIntent().getStringExtra("Contact_KWeiboNick");
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(nullAsNil);
        this.f115433e = z1Var;
        if (z1Var == null || ((int) z1Var.f108320R1) == 0 || Util.nullAsNil(z1Var.getUsername()).length() <= 0) {
            C72996z1 z1Var2 = new C72996z1();
            this.f115433e = z1Var2;
            z1Var2.setUsername(nullAsNil);
            this.f115433e.mo62857I2(nullAsNil2);
            this.f115433e.mo62894d3(intExtra);
            this.f115433e.mo62928s4(stringExtra);
            this.f115433e.mo62896e3(intExtra2);
            this.f115433e.mo62899f3(stringExtra2);
        } else if (intExtra != 0) {
            this.f115433e.mo62894d3(intExtra);
        }
        this.f115435g = C47984k.m53328b(this.f115433e.getUsername());
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("Contact_customInfo");
        if (byteArrayExtra == null) {
            r102 = null;
        } else {
            try {
                r102 = (C51043r10) new C51043r10().parseFrom(byteArrayExtra);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.NewBizInfoMoreInofUI", e, "", new Object[0]);
            }
        }
        this.f115434f = r102;
        this.f115440o = getIntent().getIntExtra("Contact_Scene", 9);
        this.f115439n = getIntent().getBundleExtra("Contact_Ext_Args");
        initView();
    }

    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r15v6, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0255  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceTreeClick(pj3.C47511g r34, com.tencent.p014mm.p136ui.base.preference.Preference r35) {
        /*
            r33 = this;
            r8 = r33
            r0 = r35
            java.lang.String r9 = r0.f121285r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r1 = " item has been clicked!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = "MicroMsg.NewBizInfoMoreInofUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.lang.String r0 = "contact_info_see_locate"
            boolean r0 = r0.endsWith(r9)
            java.lang.String r11 = "jsapiargs"
            java.lang.String r12 = "KBizSearchExtArgs"
            java.lang.String r13 = "KFromBizSearch"
            java.lang.String r14 = "from biz search."
            java.lang.String r6 = "prePublishId"
            java.lang.String r5 = "KPublisherId"
            java.lang.String r4 = "brand_profile"
            java.lang.String r2 = "geta8key_scene"
            java.lang.String r1 = "vertical_scroll"
            java.lang.String r7 = "useJs"
            java.lang.String r15 = ".ui.tools.WebViewUI"
            java.lang.String r3 = "webview"
            r17 = r9
            java.lang.String r9 = "rawUrl"
            r18 = r3
            if (r0 == 0) goto L_0x00da
            ug.c$a r0 = r33.mo66777I7()
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "[onPreferenceTreeClick] info is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r0 = 0
            return r0
        L_0x0054:
            java.lang.String r3 = r0.f146788c
            r21 = r15
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            r15.putExtra(r9, r3)
            r3 = 1
            r15.putExtra(r7, r3)
            r15.putExtra(r1, r3)
            r1 = 3
            r15.putExtra(r2, r1)
            r15.putExtra(r5, r4)
            r15.putExtra(r6, r4)
            android.os.Bundle r1 = r8.f115439n
            if (r1 == 0) goto L_0x0083
            int r1 = r8.f115440o
            r2 = 39
            if (r1 == r2) goto L_0x0095
            r2 = 56
            if (r1 == r2) goto L_0x0095
            r2 = 35
            if (r1 == r2) goto L_0x0095
        L_0x0083:
            int r1 = r8.f115440o
            r3 = 87
            if (r1 == r3) goto L_0x0095
            r2 = 89
            if (r1 == r2) goto L_0x0095
            r2 = 85
            if (r1 == r2) goto L_0x0095
            r2 = 88
            if (r1 != r2) goto L_0x00d0
        L_0x0095:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r14)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 1
            r1.putBoolean(r13, r2)
            android.os.Bundle r2 = r8.f115439n
            r1.putBundle(r12, r2)
            r15.putExtra(r11, r1)
            com.tencent.mm.storage.z1 r1 = r8.f115433e
            boolean r1 = r1.mo62927s3()
            if (r1 == 0) goto L_0x00b3
            r1 = 7
            goto L_0x00b4
        L_0x00b3:
            r1 = 6
        L_0x00b4:
            android.content.res.Resources r2 = r33.getResources()
            java.lang.String r3 = r0.f146787b
            java.lang.String r4 = r33.getPackageName()
            java.lang.String r5 = "string"
            int r2 = r2.getIdentifier(r3, r5, r4)
            java.lang.String r0 = r0.f146786a
            if (r2 <= 0) goto L_0x00cd
            java.lang.String r0 = r8.getString(r2)
        L_0x00cd:
            r8.mo66778J7(r1, r0)
        L_0x00d0:
            r1 = r18
            r0 = r21
            r2 = 0
            ke3.C88144b.m109791i(r8, r1, r0, r15, r2)
            r15 = 1
            return r15
        L_0x00da:
            r0 = r15
            r3 = r18
            java.lang.String r15 = "contact_info_verifyuser"
            r18 = r11
            r11 = r17
            boolean r15 = r15.endsWith(r11)
            if (r15 == 0) goto L_0x015c
            ug.c r4 = r8.f115435g
            r5 = 1
            if (r4 != 0) goto L_0x00ef
            return r5
        L_0x00ef:
            r6 = 0
            ug.c$b r4 = r4.mo73500r2(r6)
            if (r4 != 0) goto L_0x00f7
            return r5
        L_0x00f7:
            ug.c$b$e r5 = r4.mo73521n()
            if (r5 == 0) goto L_0x0110
            ug.c$b$e r5 = r4.mo73521n()
            java.lang.String r5 = r5.f146839d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0110
            ug.c$b$e r4 = r4.mo73521n()
            java.lang.String r4 = r4.f146839d
            goto L_0x012a
        L_0x0110:
            ug.c$b$h r5 = r4.mo73515h()
            if (r5 == 0) goto L_0x0129
            ug.c$b$h r5 = r4.mo73515h()
            java.lang.String r5 = r5.f146849b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0129
            ug.c$b$h r4 = r4.mo73515h()
            java.lang.String r4 = r4.f146849b
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0147
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r5.putExtra(r9, r4)
            r4 = 1
            r5.putExtra(r7, r4)
            r5.putExtra(r1, r4)
            r1 = 3
            r5.putExtra(r2, r1)
            r1 = 0
            ke3.C88144b.m109791i(r8, r3, r0, r5, r1)
        L_0x0147:
            com.tencent.mm.storage.z1 r0 = r8.f115433e
            java.lang.String r1 = r0.getUsername()
            r2 = 1200(0x4b0, float:1.682E-42)
            int r3 = r8.f115440o
            r4 = 0
            android.content.Intent r6 = r33.getIntent()
            kf2.C46723f.m52019a(r1, r2, r3, r4, r6)
            r15 = 1
            return r15
        L_0x015c:
            java.lang.String r15 = "contact_info_trademark"
            boolean r15 = r15.endsWith(r11)
            if (r15 == 0) goto L_0x01a1
            ug.c r4 = r8.f115435g
            if (r4 != 0) goto L_0x016a
            r5 = 1
            return r5
        L_0x016a:
            r15 = 0
            ug.c$b r5 = r4.mo73500r2(r15)
            if (r5 == 0) goto L_0x019f
            ug.c$b r5 = r4.mo73500r2(r15)
            java.lang.String r5 = r5.mo73520m()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x019f
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            ug.c$b r4 = r4.mo73500r2(r15)
            java.lang.String r4 = r4.mo73520m()
            r5.putExtra(r9, r4)
            r4 = 1
            r5.putExtra(r7, r4)
            r5.putExtra(r1, r4)
            r1 = 3
            r5.putExtra(r2, r1)
            r1 = 0
            ke3.C88144b.m109791i(r8, r3, r0, r5, r1)
            goto L_0x01a0
        L_0x019f:
            r4 = 1
        L_0x01a0:
            return r4
        L_0x01a1:
            r16 = 3
            r17 = 0
            r19 = 1
            java.lang.String r15 = "contact_info_service_phone"
            boolean r20 = r15.equals(r11)
            if (r20 == 0) goto L_0x0226
            r21 = r0
            r0 = r34
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r15)
            if (r0 == 0) goto L_0x0215
            java.lang.CharSequence r15 = r0.mo5913r()
            if (r15 == 0) goto L_0x0215
            java.lang.CharSequence r15 = r0.mo5913r()
            java.lang.String r15 = r15.toString()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0215
            java.lang.CharSequence r0 = r0.mo5913r()
            java.lang.String r15 = r0.toString()
            r0 = 2131824113(0x7f110df1, float:1.9281045E38)
            java.lang.String r20 = r8.getString(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r22 = r8.getString(r0)
            hf2.c r0 = new hf2.c
            r0.<init>(r8, r15)
            r23 = 1
            r24 = 0
            java.lang.String r25 = ""
            r26 = r21
            r21 = r0
            r0 = r33
            r27 = r1
            r1 = r23
            r28 = r2
            r2 = r15
            r29 = r3
            r15 = 1
            r3 = r25
            r30 = r4
            r4 = r20
            r31 = r5
            r5 = r22
            r32 = r6
            r6 = r21
            r35 = r12
            r12 = r7
            r7 = r24
            nj3.C76879j.m92717K(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0238
        L_0x0215:
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r35 = r12
            r26 = r21
            goto L_0x0236
        L_0x0226:
            r26 = r0
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r35 = r12
        L_0x0236:
            r15 = 1
            r12 = r7
        L_0x0238:
            java.lang.String r0 = "contact_info_bizinfo_external#"
            boolean r1 = r11.startsWith(r0)
            if (r1 == 0) goto L_0x02ec
            java.lang.String r1 = ""
            java.lang.String r0 = r11.replace(r0, r1)
            r1 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 < 0) goto L_0x02ec
            java.util.List<ug.c$a> r1 = r8.f115437i
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x02ec
            java.util.List<ug.c$a> r1 = r8.f115437i
            java.lang.Object r0 = r1.get(r0)
            ug.c$a r0 = (p248ug.C52558c.C52559a) r0
            java.lang.String r1 = r0.f146788c
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.putExtra(r9, r1)
            r2.putExtra(r12, r15)
            r1 = r27
            r2.putExtra(r1, r15)
            r3 = r28
            r1 = 3
            r2.putExtra(r3, r1)
            r3 = r30
            r1 = r31
            r2.putExtra(r1, r3)
            r1 = r32
            r2.putExtra(r1, r3)
            android.os.Bundle r1 = r8.f115439n
            if (r1 == 0) goto L_0x0293
            int r1 = r8.f115440o
            r3 = 39
            if (r1 == r3) goto L_0x02a5
            r3 = 56
            if (r1 == r3) goto L_0x02a5
            r3 = 35
            if (r1 == r3) goto L_0x02a5
        L_0x0293:
            int r1 = r8.f115440o
            r3 = 87
            if (r1 == r3) goto L_0x02a5
            r3 = 89
            if (r1 == r3) goto L_0x02a5
            r3 = 85
            if (r1 == r3) goto L_0x02a5
            r3 = 88
            if (r1 != r3) goto L_0x02e3
        L_0x02a5:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r14)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putBoolean(r13, r15)
            android.os.Bundle r3 = r8.f115439n
            r4 = r35
            r1.putBundle(r4, r3)
            r3 = r18
            r2.putExtra(r3, r1)
            com.tencent.mm.storage.z1 r1 = r8.f115433e
            boolean r1 = r1.mo62927s3()
            if (r1 == 0) goto L_0x02c6
            r1 = 7
            goto L_0x02c7
        L_0x02c6:
            r1 = 6
        L_0x02c7:
            android.content.res.Resources r3 = r33.getResources()
            java.lang.String r4 = r0.f146787b
            java.lang.String r5 = r33.getPackageName()
            java.lang.String r6 = "string"
            int r3 = r3.getIdentifier(r4, r6, r5)
            java.lang.String r0 = r0.f146786a
            if (r3 <= 0) goto L_0x02e0
            java.lang.String r0 = r8.getString(r3)
        L_0x02e0:
            r8.mo66778J7(r1, r0)
        L_0x02e3:
            r0 = r26
            r4 = r29
            r5 = 0
            ke3.C88144b.m109791i(r8, r4, r0, r2, r5)
            return r15
        L_0x02ec:
            r0 = r26
            r1 = r27
            r3 = r28
            r4 = r29
            r5 = 0
            java.lang.String r2 = "contact_info_verifyuser_weibo"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x030e
            gf2.a r0 = new gf2.a
            r0.<init>(r8)
            com.tencent.mm.storage.z1 r1 = r8.f115433e
            java.lang.String r2 = r1.f149545p0
            java.lang.String r1 = r1.getUsername()
            r0.mo71332a(r2, r1)
            return r15
        L_0x030e:
            java.lang.String r2 = "contact_info_guarantee_info"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0349
            ug.c$b r2 = r8.f115436h
            ug.c$b$f r2 = r2.mo73513f()
            if (r2 == 0) goto L_0x0349
            ug.c$b r2 = r8.f115436h
            ug.c$b$f r2 = r2.mo73513f()
            java.lang.String r2 = r2.f146844d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0349
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            ug.c$b r6 = r8.f115436h
            ug.c$b$f r6 = r6.mo73513f()
            java.lang.String r6 = r6.f146844d
            r2.putExtra(r9, r6)
            r2.putExtra(r12, r15)
            r2.putExtra(r1, r15)
            r1 = 3
            r2.putExtra(r3, r1)
            ke3.C88144b.m109791i(r8, r4, r0, r2, r5)
        L_0x0349:
            java.lang.String r1 = "contact_info_expose_btn"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0383
            com.tencent.mm.storage.z1 r1 = r8.f115433e
            if (r1 == 0) goto L_0x0383
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0360
            goto L_0x0383
        L_0x0360:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = f115431r
            java.lang.Object[] r3 = new java.lang.Object[r15]
            com.tencent.mm.storage.z1 r6 = r8.f115433e
            java.lang.String r6 = r6.getUsername()
            r7 = 0
            r3[r7] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.putExtra(r9, r2)
            java.lang.String r2 = "showShare"
            r1.putExtra(r2, r7)
            ke3.C88144b.m109791i(r8, r4, r0, r1, r5)
            goto L_0x0384
        L_0x0383:
            r7 = 0
        L_0x0384:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI.onPreferenceTreeClick(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }
}
