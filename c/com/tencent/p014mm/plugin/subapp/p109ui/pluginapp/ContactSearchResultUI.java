package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ke3.C88144b;
import lj3.C10541a;
import p196ln.C76706g;
import p248ug.C78157d;
import te3.C51043r10;
import te3.C77917dy3;
import te3.C77961kx3;
import te3.C77967mx3;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI */
public class ContactSearchResultUI extends MMActivity {

    /* renamed from: d */
    public ListView f206346d;

    /* renamed from: e */
    public LinkedList<C77961kx3> f206347e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C77917dy3> f206348f = new LinkedList<>();

    /* renamed from: g */
    public Map<String, C71284d> f206349g;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$a */
    public class C71281a implements MenuItem.OnMenuItemClickListener {
        public C71281a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactSearchResultUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$b */
    public class C71282b implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f206351d;

        public C71282b(int i) {
            this.f206351d = i;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            int headerViewsCount = i - ContactSearchResultUI.this.f206346d.getHeaderViewsCount();
            if (headerViewsCount < 0 || headerViewsCount >= ContactSearchResultUI.this.f206346d.getCount()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else if (headerViewsCount >= ContactSearchResultUI.this.f206347e.size()) {
                ContactSearchResultUI contactSearchResultUI = ContactSearchResultUI.this;
                C77917dy3 dy32 = contactSearchResultUI.f206348f.get(i - contactSearchResultUI.f206347e.size());
                ContactSearchResultUI contactSearchResultUI2 = ContactSearchResultUI.this;
                contactSearchResultUI2.getClass();
                Intent intent = new Intent();
                int i2 = dy32.f227198o;
                C78157d.m94368a(intent, dy32, 2 == i2 ? 15 : 1 == i2 ? 1 : 0);
                C88144b.m109791i(contactSearchResultUI2, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else {
                C77961kx3 kx32 = ContactSearchResultUI.this.f206347e.get(headerViewsCount);
                String str = kx32.f227763d.f141175d;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                if (z1Var.mo62927s3()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", str);
                    intent2.putExtra("Contact_Scene", 3);
                    if (str != null && str.length() > 0) {
                        if (z1Var.mo62916m3()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.kvStat(10298, str + "," + 35);
                            intent2.putExtra("Contact_Scene", 35);
                        }
                        C88144b.m109791i(ContactSearchResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                } else {
                    if ((kx32.f227773q & 8) > 0) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(10298, kx32.f227763d.f141175d + "," + 35);
                    }
                    Intent intent3 = new Intent();
                    intent3.putExtra("Contact_User", kx32.f227763d.f141175d);
                    intent3.putExtra("Contact_Alias", kx32.f227776t);
                    intent3.putExtra("Contact_Nick", kx32.f227764e.f141175d);
                    intent3.putExtra("Contact_Signature", kx32.f227771o);
                    intent3.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(kx32.f227756A, kx32.f227769j, kx32.f227770n));
                    intent3.putExtra("Contact_Sex", kx32.f227767h);
                    intent3.putExtra("Contact_VUser_Info", kx32.f227774r);
                    intent3.putExtra("Contact_VUser_Info_Flag", kx32.f227773q);
                    intent3.putExtra("Contact_KWeibo_flag", kx32.f227778v);
                    intent3.putExtra("Contact_KWeibo", kx32.f227775s);
                    intent3.putExtra("Contact_KWeiboNick", kx32.f227777u);
                    intent3.putExtra("Contact_KSnsIFlag", kx32.f227782z.f130392d);
                    intent3.putExtra("Contact_KSnsBgId", kx32.f227782z.f130394f);
                    intent3.putExtra("Contact_KSnsBgUrl", kx32.f227782z.f130393e);
                    intent3.putExtra("Contact_Scene", 35);
                    int i3 = this.f206351d;
                    if (i3 != 0) {
                        intent3.putExtra("add_more_friend_search_scene", i3);
                    }
                    C51043r10 r102 = kx32.f227758C;
                    if (r102 != null) {
                        try {
                            intent3.putExtra("Contact_customInfo", r102.toByteArray());
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e, "", new Object[0]);
                        }
                    }
                    if ((kx32.f227773q & 8) > 0) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.kvStat(10298, kx32.f227763d.f141175d + "," + 35);
                    }
                    C88144b.m109791i(ContactSearchResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$c */
    public class C71283c extends BaseAdapter {

        /* renamed from: d */
        public Context f206353d;

        public C71283c(Context context) {
            this.f206353d = context;
        }

        public int getCount() {
            return ContactSearchResultUI.this.f206347e.size() + ContactSearchResultUI.this.f206348f.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                java.lang.Class<ln.f> r3 = p196ln.C76705f.class
                r4 = 0
                if (r30 != 0) goto L_0x0050
                android.content.Context r5 = r0.f206353d
                r6 = 2131497340(0x7f0c117c, float:1.861827E38)
                android.view.View r5 = android.view.View.inflate(r5, r6, r4)
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$e r6 = new com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$e
                r6.<init>()
                r7 = 2131297456(0x7f0904b0, float:1.8212857E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r6.f206358b = r7
                r7 = 2131310274(0x7f0936c2, float:1.8238855E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r6.f206359c = r7
                r7 = 2131316101(0x7f094d85, float:1.8250674E38)
                android.view.View r7 = r5.findViewById(r7)
                r6.f206361e = r7
                r7 = 2131306489(0x7f0927f9, float:1.8231179E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r6.f206360d = r7
                r7 = 2131297826(0x7f090622, float:1.8213608E38)
                android.view.View r7 = r5.findViewById(r7)
                r6.f206362f = r7
                r5.setTag(r6)
                goto L_0x0059
            L_0x0050:
                java.lang.Object r5 = r30.getTag()
                r6 = r5
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$e r6 = (com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.C71285e) r6
                r5 = r30
            L_0x0059:
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.this
                java.util.LinkedList<te3.kx3> r7 = r7.f206347e
                int r7 = r7.size()
                java.lang.String r8 = ""
                r9 = 8
                r10 = 0
                if (r1 < r7) goto L_0x0142
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI r4 = com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.this
                java.util.LinkedList<te3.dy3> r7 = r4.f206348f
                java.util.LinkedList<te3.kx3> r4 = r4.f206347e
                int r4 = r4.size()
                int r1 = r1 - r4
                java.lang.Object r1 = r7.get(r1)
                te3.dy3 r1 = (te3.C77917dy3) r1
                java.lang.String r4 = r1.f227190d
                r6.f206357a = r4
                di3.d r4 = di3.C86312j.m106911c(r3)
                ln.f r4 = (p196ln.C76705f) r4
                android.widget.ImageView r7 = r6.f206358b
                java.lang.String r11 = r6.f206357a
                r4.mo106822J5(r7, r11)
                android.widget.ImageView r4 = r6.f206358b
                java.lang.String r7 = r6.f206357a
                r4.setTag(r7)
                di3.d r3 = di3.C86312j.m106911c(r3)
                ln.f r3 = (p196ln.C76705f) r3
                android.widget.ImageView r4 = r6.f206358b
                java.lang.String r7 = r6.f206357a
                r3.mo106849z(r4, r7)
                android.view.View r3 = r6.f206361e
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r4.mo10233c(r7)
                java.lang.Object[] r12 = r4.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r14 = "getView"
                java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r3
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r4 = r4.mo10231a(r10)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r12 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                android.view.View r3 = r6.f206362f
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r4.mo10233c(r7)
                java.lang.Object[] r19 = r4.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r21 = "getView"
                java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r3
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                java.lang.Object r4 = r4.mo10231a(r10)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r19 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r20 = "getView"
                java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.TextView r3 = r6.f206360d
                r3.setText(r8)
                android.widget.TextView r3 = r6.f206359c     // Catch:{ Exception -> 0x013c }
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x013c }
                ny.h r2 = (p629ny.C76979h) r2     // Catch:{ Exception -> 0x013c }
                android.content.Context r4 = r0.f206353d     // Catch:{ Exception -> 0x013c }
                java.lang.String r1 = r1.f227191e     // Catch:{ Exception -> 0x013c }
                android.widget.TextView r7 = r6.f206359c     // Catch:{ Exception -> 0x013c }
                float r7 = r7.getTextSize()     // Catch:{ Exception -> 0x013c }
                android.text.SpannableString r1 = r2.yp0(r4, r1, r7)     // Catch:{ Exception -> 0x013c }
                r3.setText(r1)     // Catch:{ Exception -> 0x013c }
                goto L_0x0141
            L_0x013c:
                android.widget.TextView r1 = r6.f206359c
                r1.setText(r8)
            L_0x0141:
                return r5
            L_0x0142:
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI r7 = com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.this
                java.util.LinkedList<te3.kx3> r7 = r7.f206347e
                java.lang.Object r1 = r7.get(r1)
                te3.kx3 r1 = (te3.C77961kx3) r1
                java.lang.String r7 = "MicroMsg.ContactSearchResultAdapter"
                if (r1 != 0) goto L_0x0156
                java.lang.String r1 = "shouldnot be empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
                return r5
            L_0x0156:
                te3.rv3 r11 = r1.f227763d
                java.lang.String r11 = r11.f141175d
                r6.f206357a = r11
                di3.d r11 = di3.C86312j.m106911c(r3)
                ln.f r11 = (p196ln.C76705f) r11
                android.widget.ImageView r12 = r6.f206358b
                java.lang.String r13 = r6.f206357a
                r11.mo106822J5(r12, r13)
                android.widget.ImageView r11 = r6.f206358b
                java.lang.String r12 = r6.f206357a
                r11.setTag(r12)
                di3.d r3 = di3.C86312j.m106911c(r3)
                ln.f r3 = (p196ln.C76705f) r3
                android.widget.ImageView r11 = r6.f206358b
                java.lang.String r12 = r6.f206357a
                r3.mo106849z(r11, r12)
                te3.rv3 r3 = r1.f227763d
                java.lang.String r3 = r3.f141175d
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI r11 = com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.this
                java.util.Map<java.lang.String, com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d> r11 = r11.f206349g
                java.util.HashMap r11 = (java.util.HashMap) r11
                java.lang.Object r11 = r11.get(r3)
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d r11 = (com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.C71284d) r11
                r12 = 1
                if (r11 != 0) goto L_0x01fc
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d r11 = new com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d
                r11.<init>()
                com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI r13 = com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.this
                java.util.Map<java.lang.String, com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d> r13 = r13.f206349g
                java.util.HashMap r13 = (java.util.HashMap) r13
                r13.put(r3, r11)
                te3.r10 r13 = r1.f227758C
                if (r13 == 0) goto L_0x01fc
                ug.c r14 = new ug.c
                r14.<init>()
                r14.field_username = r3
                int r3 = r13.f140656d
                r14.field_brandFlag = r3
                java.lang.String r3 = r13.f140659g
                r14.field_brandIconURL = r3
                java.lang.String r3 = r13.f140658f
                r14.field_brandInfo = r3
                java.lang.String r3 = r13.f140657e
                r14.field_extInfo = r3
                ug.c$b r3 = r14.mo73500r2(r10)
                if (r3 == 0) goto L_0x01c7
                ug.c$b r3 = r14.mo73500r2(r10)
                ug.c$b$e r4 = r3.mo73521n()
            L_0x01c7:
                if (r4 == 0) goto L_0x01fc
                ug.c$b r3 = r14.mo73500r2(r10)
                org.json.JSONObject r13 = r3.f146795a
                if (r13 == 0) goto L_0x01e2
                java.lang.String r14 = "IsTrademarkProtection"
                java.lang.String r13 = r13.optString(r14)
                int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r10)
                if (r13 != r12) goto L_0x01df
                r13 = 1
                goto L_0x01e0
            L_0x01df:
                r13 = 0
            L_0x01e0:
                r3.f146818x = r13
            L_0x01e2:
                boolean r3 = r3.f146818x
                if (r3 == 0) goto L_0x01f0
                java.lang.String r3 = r4.f146837b
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x01f0
                r3 = 1
                goto L_0x01f1
            L_0x01f0:
                r3 = 0
            L_0x01f1:
                r11.f206355a = r3
                int r3 = r1.f227773q
                if (r3 == 0) goto L_0x01f9
                r3 = 1
                goto L_0x01fa
            L_0x01f9:
                r3 = 0
            L_0x01fa:
                r11.f206356b = r3
            L_0x01fc:
                android.view.View r3 = r6.f206361e
                boolean r4 = r11.f206356b
                if (r4 == 0) goto L_0x0204
                r4 = 0
                goto L_0x0206
            L_0x0204:
                r4 = 8
            L_0x0206:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r15.mo10233c(r4)
                java.lang.Object[] r14 = r15.mo10232b()
                java.lang.String r4 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r16 = "dealVerifyInfo"
                java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r3
                r9 = r15
                r15 = r4
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r4 = r9.mo10231a(r10)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r14 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r15 = "dealVerifyInfo"
                java.lang.String r16 = "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                android.view.View r3 = r6.f206362f
                boolean r4 = r11.f206355a
                if (r4 == 0) goto L_0x024e
                r9 = 0
                goto L_0x0250
            L_0x024e:
                r9 = 8
            L_0x0250:
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r4.mo10233c(r9)
                java.lang.Object[] r21 = r4.mo10232b()
                java.lang.String r22 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r23 = "dealVerifyInfo"
                java.lang.String r24 = "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V"
                java.lang.String r25 = "android/view/View_EXEC_"
                java.lang.String r26 = "setVisibility"
                java.lang.String r27 = "(I)V"
                r20 = r3
                j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
                java.lang.Object r4 = r4.mo10231a(r10)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r21 = "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter"
                java.lang.String r22 = "dealVerifyInfo"
                java.lang.String r23 = "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V"
                java.lang.String r24 = "android/view/View_EXEC_"
                java.lang.String r25 = "setVisibility"
                java.lang.String r26 = "(I)V"
                j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
                java.lang.Object[] r3 = new java.lang.Object[r12]
                int r4 = r1.f227773q
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                java.lang.String r4 = "verifyFlay : %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r4, r3)
                java.lang.String r3 = r1.f227771o
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
                android.widget.TextView r4 = r6.f206360d     // Catch:{ Exception -> 0x02bb }
                di3.d r7 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x02bb }
                ny.h r7 = (p629ny.C76979h) r7     // Catch:{ Exception -> 0x02bb }
                android.content.Context r9 = r0.f206353d     // Catch:{ Exception -> 0x02bb }
                android.widget.TextView r10 = r6.f206360d     // Catch:{ Exception -> 0x02bb }
                float r10 = r10.getTextSize()     // Catch:{ Exception -> 0x02bb }
                android.text.SpannableString r3 = r7.yp0(r9, r3, r10)     // Catch:{ Exception -> 0x02bb }
                r4.setText(r3)     // Catch:{ Exception -> 0x02bb }
                goto L_0x02c0
            L_0x02bb:
                android.widget.TextView r3 = r6.f206360d
                r3.setText(r8)
            L_0x02c0:
                android.widget.TextView r3 = r6.f206359c     // Catch:{ Exception -> 0x02fa }
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x02fa }
                ny.h r2 = (p629ny.C76979h) r2     // Catch:{ Exception -> 0x02fa }
                android.content.Context r4 = r0.f206353d     // Catch:{ Exception -> 0x02fa }
                te3.rv3 r7 = r1.f227764e     // Catch:{ Exception -> 0x02fa }
                java.lang.String r7 = r7.f141175d     // Catch:{ Exception -> 0x02fa }
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x02fa }
                if (r7 != 0) goto L_0x02d9
                te3.rv3 r1 = r1.f227764e     // Catch:{ Exception -> 0x02fa }
                java.lang.String r1 = r1.f141175d     // Catch:{ Exception -> 0x02fa }
                goto L_0x02ec
            L_0x02d9:
                java.lang.String r7 = r1.f227776t     // Catch:{ Exception -> 0x02fa }
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x02fa }
                if (r7 != 0) goto L_0x02e4
                java.lang.String r1 = r1.f227776t     // Catch:{ Exception -> 0x02fa }
                goto L_0x02ec
            L_0x02e4:
                te3.rv3 r1 = r1.f227763d     // Catch:{ Exception -> 0x02fa }
                java.lang.String r1 = r1.f141175d     // Catch:{ Exception -> 0x02fa }
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)     // Catch:{ Exception -> 0x02fa }
            L_0x02ec:
                android.widget.TextView r7 = r6.f206359c     // Catch:{ Exception -> 0x02fa }
                float r7 = r7.getTextSize()     // Catch:{ Exception -> 0x02fa }
                android.text.SpannableString r1 = r2.yp0(r4, r1, r7)     // Catch:{ Exception -> 0x02fa }
                r3.setText(r1)     // Catch:{ Exception -> 0x02fa }
                goto L_0x02ff
            L_0x02fa:
                android.widget.TextView r1 = r6.f206359c
                r1.setText(r8)
            L_0x02ff:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.ContactSearchResultUI.C71283c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$d */
    public static class C71284d {

        /* renamed from: a */
        public boolean f206355a;

        /* renamed from: b */
        public boolean f206356b;
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI$e */
    public static class C71285e {

        /* renamed from: a */
        public String f206357a;

        /* renamed from: b */
        public ImageView f206358b;

        /* renamed from: c */
        public TextView f206359c;

        /* renamed from: d */
        public TextView f206360d;

        /* renamed from: e */
        public View f206361e;

        /* renamed from: f */
        public View f206362f;
    }

    static {
        new MMHandler(Looper.getMainLooper());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7095y3;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.bug);
        setBackBtn(new C71281a());
        this.f206349g = new HashMap();
        this.f206346d = (ListView) findViewById(C0966R.C0970id.irx);
        this.f206346d.setEmptyView((TextView) findViewById(C0966R.C0970id.cig));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("result");
        int intExtra = getIntent().getIntExtra("add_more_friend_search_scene", 0);
        if (byteArrayExtra != null) {
            try {
                C77967mx3 mx32 = (C77967mx3) new C77967mx3().parseFrom(byteArrayExtra);
                if (mx32 != null) {
                    this.f206347e = mx32.f227846E;
                    this.f206348f = mx32.f227855N;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e, "SearchContactResponse", new Object[0]);
                try {
                    this.f206348f.add((C77917dy3) new C77917dy3().parseFrom(byteArrayExtra));
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e2, "SearchOpenIMContactItem", new Object[0]);
                }
            }
        }
        if (this.f206347e.size() != 0 || !this.f206348f.isEmpty()) {
            this.f206346d.setAdapter(new C71283c(this));
            this.f206346d.setOnItemClickListener(new C71282b(intExtra));
            this.f206346d.setOnScrollListener(new C10541a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93574a();
        Map<String, C71284d> map = this.f206349g;
        if (map != null) {
            ((HashMap) map).clear();
        }
        super.onDestroy();
    }
}
