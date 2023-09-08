package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI */
public class WalletMultiRcptSelectUI extends MMPreference {

    /* renamed from: i */
    public static final /* synthetic */ int f196925i = 0;

    /* renamed from: d */
    public C47511g f196926d;

    /* renamed from: e */
    public int f196927e = 0;

    /* renamed from: f */
    public RcptItem f196928f = null;

    /* renamed from: g */
    public RcptItem f196929g = null;

    /* renamed from: h */
    public List<RcptItem> f196930h;

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI$a */
    public class C68541a implements MenuItem.OnMenuItemClickListener {
        public C68541a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletMultiRcptSelectUI walletMultiRcptSelectUI = WalletMultiRcptSelectUI.this;
            int i = WalletMultiRcptSelectUI.f196925i;
            walletMultiRcptSelectUI.mo94170I7();
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94169H7(android.content.Intent r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x000a
            java.lang.String r7 = "MicroMsg.MultiRptSelectUI"
            java.lang.String r0 = "initData intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return
        L_0x000a:
            java.lang.String r0 = "key_stage"
            r1 = 0
            int r0 = r7.getIntExtra(r0, r1)
            r6.f196927e = r0
            java.lang.String r0 = "key_province"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            com.tencent.mm.plugin.address.model.RcptItem r0 = (com.tencent.p014mm.plugin.address.model.RcptItem) r0
            r6.f196928f = r0
            java.lang.String r0 = "key_city"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            com.tencent.mm.plugin.address.model.RcptItem r0 = (com.tencent.p014mm.plugin.address.model.RcptItem) r0
            r6.f196929g = r0
            java.lang.String r0 = "extra_province"
            java.lang.String r0 = r7.getStringExtra(r0)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0067
            xg0.C78803b.vx0()
            zg0.p r4 = xg0.C78803b.xx0()
            r4.getClass()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0043
        L_0x0041:
            r4 = r3
            goto L_0x0061
        L_0x0043:
            java.util.List r1 = r4.mo183780e(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x004d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.address.model.RcptItem r4 = (com.tencent.p014mm.plugin.address.model.RcptItem) r4
            java.lang.String r5 = r4.f196786d
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L_0x004d
        L_0x0061:
            r6.f196928f = r4
            if (r4 == 0) goto L_0x0067
            r6.f196927e = r2
        L_0x0067:
            java.lang.String r0 = "extra_city"
            java.lang.String r7 = r7.getStringExtra(r0)
            if (r7 == 0) goto L_0x00ab
            int r0 = r6.f196927e
            if (r2 != r0) goto L_0x00ab
            xg0.C78803b.vx0()
            zg0.p r0 = xg0.C78803b.xx0()
            com.tencent.mm.plugin.address.model.RcptItem r1 = r6.f196928f
            java.lang.String r1 = r1.f196787e
            java.util.List r0 = r0.mo183781f(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 != 0) goto L_0x008b
            goto L_0x00a4
        L_0x008b:
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.address.model.RcptItem r1 = (com.tencent.p014mm.plugin.address.model.RcptItem) r1
            java.lang.String r2 = r1.f196786d
            boolean r2 = r2.startsWith(r7)
            if (r2 == 0) goto L_0x008f
            r3 = r1
        L_0x00a4:
            r6.f196929g = r3
            if (r3 == 0) goto L_0x00ab
            r7 = 2
            r6.f196927e = r7
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.address.p879ui.WalletMultiRcptSelectUI.mo94169H7(android.content.Intent):void");
    }

    /* renamed from: I7 */
    public final void mo94170I7() {
        int i = this.f196927e;
        if (i == 1) {
            this.f196928f = null;
            this.f196927e = 0;
        } else if (i == 2) {
            this.f196929g = null;
            this.f196927e = 1;
        }
        Intent intent = new Intent();
        intent.putExtra("key_stage", this.f196927e);
        intent.putExtra("key_province", this.f196928f);
        intent.putExtra("key_city", this.f196929g);
        setResult(0, intent);
        finish();
    }

    public int getResourceId() {
        return C0966R.xml.f8935bs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r0 != 2) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            r1 = 2131820841(0x7f110129, float:1.9274408E38)
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = "ui_title"
            int r1 = r0.getIntExtra(r2, r1)
        L_0x0010:
            r5.setMMTitle((int) r1)
            com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI$a r1 = new com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI$a
            r1.<init>()
            r5.setBackBtn(r1)
            r5.mo94169H7(r0)
            zg0.p r0 = xg0.C78803b.xx0()
            r1 = 0
            java.util.List r0 = r0.mo183780e(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            java.lang.String r2 = "MicroMsg.MultiRptSelectUI"
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "list == null || list.isEmpty(), need loadata!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            zg0.p r0 = xg0.C78803b.xx0()
            r0.mo183782g()
        L_0x003d:
            int r0 = r5.f196927e
            if (r0 == 0) goto L_0x008c
            r3 = 1
            if (r0 == r3) goto L_0x0048
            r3 = 2
            if (r0 == r3) goto L_0x0064
            goto L_0x0080
        L_0x0048:
            com.tencent.mm.plugin.address.model.RcptItem r0 = r5.f196928f
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r0.f196787e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0064
            xg0.C78803b.vx0()
            zg0.p r0 = xg0.C78803b.xx0()
            com.tencent.mm.plugin.address.model.RcptItem r3 = r5.f196928f
            java.lang.String r3 = r3.f196787e
            java.util.List r0 = r0.mo183781f(r3)
            goto L_0x0097
        L_0x0064:
            com.tencent.mm.plugin.address.model.RcptItem r0 = r5.f196929g
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r0.f196787e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0080
            xg0.C78803b.vx0()
            zg0.p r0 = xg0.C78803b.xx0()
            com.tencent.mm.plugin.address.model.RcptItem r3 = r5.f196929g
            java.lang.String r3 = r3.f196787e
            java.util.List r0 = r0.mo183781f(r3)
            goto L_0x0097
        L_0x0080:
            xg0.C78803b.vx0()
            zg0.p r0 = xg0.C78803b.xx0()
            java.util.List r0 = r0.mo183780e(r1)
            goto L_0x0097
        L_0x008c:
            xg0.C78803b.vx0()
            zg0.p r0 = xg0.C78803b.xx0()
            java.util.List r0 = r0.mo183780e(r1)
        L_0x0097:
            r5.f196930h = r0
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00a6
            java.lang.String r0 = "initZoneItems error ,check zone lists!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x011f
        L_0x00a6:
            pj3.g r0 = r5.f196926d
            r0.removeAll()
        L_0x00ab:
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r5.f196930h
            int r0 = r0.size()
            r2 = 0
            if (r1 >= r0) goto L_0x0115
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r5.f196930h
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0112
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r5.f196930h
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.address.model.RcptItem r0 = (com.tencent.p014mm.plugin.address.model.RcptItem) r0
            java.lang.String r0 = r0.f196786d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00cd
            goto L_0x0112
        L_0x00cd:
            com.tencent.mm.plugin.address.ui.RcptPreference r0 = new com.tencent.mm.plugin.address.ui.RcptPreference
            r0.<init>(r5, r2)
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r2 = r5.f196930h
            java.lang.Object r2 = r2.get(r1)
            com.tencent.mm.plugin.address.model.RcptItem r2 = (com.tencent.p014mm.plugin.address.model.RcptItem) r2
            if (r2 == 0) goto L_0x0105
            java.lang.String r3 = r2.f196786d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00e5
            goto L_0x0105
        L_0x00e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.f196787e
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            int r4 = r0.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo26273A(r3)
            r0.f196924J = r2
            goto L_0x010d
        L_0x0105:
            java.lang.String r2 = "MicroMsg.RcptPreference"
            java.lang.String r3 = "setZoneItem item = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
        L_0x010d:
            pj3.g r2 = r5.f196926d
            r2.mo72527k(r0)
        L_0x0112:
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x0115:
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r0 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            r0.<init>(r5, r2)
            pj3.g r1 = r5.f196926d
            r1.mo72527k(r0)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.address.p879ui.WalletMultiRcptSelectUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                setResult(-1, intent);
                finish();
                return;
            }
            mo94169H7(intent);
        }
    }

    public void onBackPressed() {
        mo94170I7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196926d = getPreferenceScreen();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference instanceof RcptPreference) {
            RcptItem rcptItem = ((RcptPreference) preference).f196924J;
            if (rcptItem == null || Util.isNullOrNil(rcptItem.f196786d)) {
                Log.m105920e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
            } else {
                int i = rcptItem.f196789g;
                if (!(i == 0)) {
                    if (!(i == 1)) {
                        this.f196927e = 2;
                    }
                }
                int i2 = this.f196927e;
                if (i2 == 0) {
                    this.f196928f = rcptItem;
                    this.f196927e = 1;
                } else if (i2 == 1) {
                    this.f196929g = rcptItem;
                    this.f196927e = 2;
                } else if (i2 == 2) {
                    StringBuilder sb = new StringBuilder();
                    RcptItem rcptItem2 = this.f196928f;
                    if (rcptItem2 != null) {
                        sb.append(rcptItem2.f196786d);
                        sb.append(" ");
                    }
                    RcptItem rcptItem3 = this.f196929g;
                    if (rcptItem3 != null) {
                        sb.append(rcptItem3.f196786d);
                        sb.append(" ");
                    }
                    sb.append(rcptItem.f196786d);
                    Log.m105918d("MicroMsg.MultiRptSelectUI", "area_result: " + sb.toString() + ",item.name: " + rcptItem.f196786d);
                    Intent intent = new Intent();
                    intent.putExtra("karea_result", sb.toString());
                    intent.putExtra("kpost_code", rcptItem.f196788f);
                    intent.putExtra("kwcode", rcptItem.f196787e);
                    setResult(-1, intent);
                    finish();
                }
                Intent intent2 = getIntent();
                int intExtra = intent2 != null ? intent2.getIntExtra("ui_title", -1) : -1;
                Intent intent3 = new Intent(this, WalletMultiRcptSelectUI.class);
                intent3.putExtra("key_stage", this.f196927e);
                intent3.putExtra("key_province", this.f196928f);
                intent3.putExtra("key_city", this.f196929g);
                if (-1 != intExtra) {
                    intent3.putExtra("ui_title", intExtra);
                }
                startActivityForResult(intent3, 1);
            }
        }
        return false;
    }

    public void onResume() {
        super.onResume();
    }
}
