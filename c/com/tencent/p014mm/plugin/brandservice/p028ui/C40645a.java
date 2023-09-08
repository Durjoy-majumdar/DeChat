package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fx0.C45829j;
import hx0.C46126a;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p196ln.C76705f;
import p248ug.C52558c;
import qj3.C47856a;
import te3.C49772hy3;
import te3.C50139kk;
import te3.C50413mk;
import te3.C51163rv3;
import te3.C51187s10;
import te3.C51256sk;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.a */
public class C40645a extends C46126a {

    /* renamed from: o */
    public static C40647b f109177o;

    /* renamed from: h */
    public CharSequence f109178h;

    /* renamed from: i */
    public CharSequence f109179i;

    /* renamed from: j */
    public CharSequence f109180j;

    /* renamed from: k */
    public CharSequence f109181k;

    /* renamed from: l */
    public String f109182l;

    /* renamed from: m */
    public boolean f109183m;

    /* renamed from: n */
    public boolean f109184n;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.a$a */
    public static class C40646a extends C45829j.C45830a implements C47856a.C47857a {

        /* renamed from: b */
        public TextView f109185b;

        /* renamed from: c */
        public View f109186c;

        /* renamed from: d */
        public TextView f109187d;

        /* renamed from: e */
        public TextView f109188e;

        /* renamed from: f */
        public TextView f109189f;

        /* renamed from: g */
        public View f109190g;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.a$b */
    public static class C40647b extends C47856a.C47858b {
        /* renamed from: a */
        public void mo63542a(View view, C47856a.C47857a aVar) {
            if (view != null && aVar != null && (aVar instanceof C40646a)) {
                C40646a aVar2 = (C40646a) aVar;
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.bqq);
                aVar2.f109190g = view.findViewById(C0966R.C0970id.a_l);
                aVar2.f123739a = (ImageView) view.findViewById(C0966R.C0970id.a1q);
                aVar2.f109185b = (TextView) view.findViewById(C0966R.C0970id.hfu);
                aVar2.f109186c = view.findViewById(C0966R.C0970id.l3u);
                aVar2.f109188e = (TextView) view.findViewById(C0966R.C0970id.f358311ec3);
                aVar2.f109187d = (TextView) view.findViewById(C0966R.C0970id.f8j);
                aVar2.f109189f = (TextView) view.findViewById(C0966R.C0970id.luj);
            }
        }

        /* renamed from: b */
        public void mo63543b(Context context, C47856a.C47857a aVar, C47856a aVar2, Object... objArr) {
            C47856a.C47857a aVar3 = aVar;
            C47856a aVar4 = aVar2;
            if (context == null || aVar3 == null || aVar4 == null || aVar4.f128456b == null) {
                Log.m105920e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar3 instanceof C40646a)) {
                Log.m105920e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            } else if (!(aVar4 instanceof C40645a)) {
                Log.m105920e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            } else {
                C40646a aVar5 = (C40646a) aVar3;
                C40645a aVar6 = (C40645a) aVar4;
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(aVar5.f123739a, aVar6.f109182l);
                View view = aVar5.f109186c;
                int i = 8;
                int i2 = aVar6.f109183m ? 0 : 8;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar7.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = aVar5.f109190g;
                if (aVar6.f109184n) {
                    i = 0;
                }
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(Integer.valueOf(i));
                View view4 = view3;
                C117292a.m165358d(view4, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C45829j.m51129b(aVar5.f109185b, aVar6.f109179i);
                boolean b = C45829j.m51129b(aVar5.f109189f, aVar6.f109181k);
                boolean b2 = C45829j.m51129b(aVar5.f109188e, aVar6.f109180j);
                if (C45829j.m51129b(aVar5.f109187d, aVar6.f109178h)) {
                    if (b || b2) {
                        aVar5.f109187d.setMaxLines(1);
                    } else {
                        aVar5.f109187d.setMaxLines(2);
                    }
                }
                Log.m105919d("MicroMsg.BizContactDataItem", "fillingView , nickName : %s, followFriends : %s.", aVar6.f109179i, aVar6.f109180j);
            }
        }

        /* renamed from: c */
        public View mo63544c(Context context, ViewGroup viewGroup, View view) {
            return view == null ? View.inflate(context, C0966R.C0971layout.bvf, (ViewGroup) null) : view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo63545d(android.content.Context r17, android.view.View r18, qj3.C47856a r19, java.lang.Object... r20) {
            /*
                r16 = this;
                r1 = r17
                r3 = r19
                r0 = r20
                boolean r2 = r3 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.C40645a
                r4 = 0
                if (r2 != 0) goto L_0x000c
                return r4
            L_0x000c:
                r2 = r3
                com.tencent.mm.plugin.brandservice.ui.a r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.C40645a) r2
                java.lang.Object r5 = r3.f128456b
                boolean r6 = r5 instanceof te3.C51256sk
                java.lang.String r7 = "MicroMsg.BizContactDataItem"
                if (r6 != 0) goto L_0x001d
                java.lang.String r0 = "The DataItem is not a instance of BusinessResultItem."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                return r4
            L_0x001d:
                te3.sk r5 = (te3.C51256sk) r5
                te3.kk r6 = r5.f141568e
                if (r6 == 0) goto L_0x0180
                te3.hy3 r6 = r6.f136834f
                if (r6 != 0) goto L_0x0029
                goto L_0x0180
            L_0x0029:
                java.lang.String r6 = ""
                r8 = 0
                if (r0 == 0) goto L_0x005c
                int r9 = r0.length
                if (r9 <= 0) goto L_0x003a
                r9 = r0[r4]
                boolean r10 = r9 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.C40658c
                if (r10 == 0) goto L_0x003a
                com.tencent.mm.plugin.brandservice.ui.c r9 = (com.tencent.p014mm.plugin.brandservice.p028ui.C40658c) r9
                goto L_0x003b
            L_0x003a:
                r9 = r8
            L_0x003b:
                int r10 = r0.length
                r11 = 2
                if (r10 <= r11) goto L_0x004c
                r10 = r0[r11]
                boolean r11 = r10 instanceof java.lang.Integer
                if (r11 == 0) goto L_0x004c
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                goto L_0x004d
            L_0x004c:
                r10 = 0
            L_0x004d:
                int r11 = r0.length
                r12 = 3
                if (r11 <= r12) goto L_0x005a
                r0 = r0[r12]
                boolean r11 = r0 instanceof java.lang.String
                if (r11 == 0) goto L_0x005a
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x005f
            L_0x005a:
                r0 = r6
                goto L_0x005f
            L_0x005c:
                r0 = r6
                r9 = r8
                r10 = 0
            L_0x005f:
                te3.kk r5 = r5.f141568e
                java.lang.String r11 = r5.f136836h
                te3.hy3 r5 = r5.f136834f
                te3.rv3 r12 = r5.f134961e
                if (r12 == 0) goto L_0x006c
                java.lang.String r12 = r12.f141175d
                goto L_0x006d
            L_0x006c:
                r12 = r8
            L_0x006d:
                te3.rv3 r13 = r5.f134960d
                if (r13 == 0) goto L_0x0074
                java.lang.String r13 = r13.f141175d
                goto L_0x0075
            L_0x0074:
                r13 = r8
            L_0x0075:
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r14 == 0) goto L_0x0081
                java.lang.String r0 = "onItemClick but username is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                return r4
            L_0x0081:
                java.lang.Class<c00.q> r14 = c00.C39884q.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                c00.q r14 = (c00.C39884q) r14
                r14.mo55839ow(r13)
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                r15 = 1
                if (r14 != 0) goto L_0x00b8
                r0 = 8
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                java.lang.String r5 = "rawUrl"
                r4.putExtra(r5, r11)
                java.lang.String r5 = "useJs"
                r4.putExtra(r5, r15)
                java.lang.String r5 = "vertical_scroll"
                r4.putExtra(r5, r15)
                java.lang.String r5 = "webview"
                java.lang.String r6 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r1, r5, r6, r4, r8)
                r4 = 8
                goto L_0x016d
            L_0x00b8:
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                f62.k0 r8 = (f62.C75700k0) r8
                com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
                com.tencent.mm.storage.z1 r8 = r8.get(r13)
                android.content.Intent r11 = new android.content.Intent
                r11.<init>()
                android.os.Bundle r14 = new android.os.Bundle
                r14.<init>()
                java.lang.String r15 = "Contact_Ext_Args_Search_Id"
                r14.putString(r15, r0)
                int r0 = r2.f124288f
                java.lang.String r15 = "Contact_Ext_Args_Index"
                r14.putInt(r15, r0)
                java.lang.String r0 = "Contact_Ext_Args_Query_String"
                r14.putString(r0, r6)
                java.lang.String r0 = "Contact_Scene"
                r14.putInt(r0, r10)
                java.lang.String r15 = "Contact_Ext_Args"
                r11.putExtra(r15, r14)
                java.lang.String r14 = "Contact_User"
                r11.putExtra(r14, r13)
                r11.putExtra(r0, r10)
                boolean r0 = r8.mo62927s3()
                if (r0 != 0) goto L_0x015b
                java.lang.String r0 = r5.f134970q
                java.lang.String r8 = "Contact_Alias"
                r11.putExtra(r8, r0)
                java.lang.String r0 = "Contact_Nick"
                r11.putExtra(r0, r12)
                java.lang.String r0 = r5.f134965i
                java.lang.String r8 = "Contact_Signature"
                r11.putExtra(r8, r0)
                java.lang.String r0 = r5.f134973t
                java.lang.String r8 = r5.f134963g
                java.lang.String r10 = r5.f134964h
                java.lang.String r0 = com.tencent.p014mm.storage.RegionCodeDecoder.m124564q(r0, r8, r10)
                java.lang.String r8 = "Contact_RegionCode"
                r11.putExtra(r8, r0)
                int r0 = r5.f134962f
                java.lang.String r8 = "Contact_Sex"
                r11.putExtra(r8, r0)
                java.lang.String r0 = r5.f134968o
                java.lang.String r8 = "Contact_VUser_Info"
                r11.putExtra(r8, r0)
                int r0 = r5.f134967n
                java.lang.String r8 = "Contact_VUser_Info_Flag"
                r11.putExtra(r8, r0)
                int r0 = r5.f134972s
                java.lang.String r8 = "Contact_KWeibo_flag"
                r11.putExtra(r8, r0)
                java.lang.String r0 = r5.f134969p
                java.lang.String r8 = "Contact_KWeibo"
                r11.putExtra(r8, r0)
                java.lang.String r0 = r5.f134971r
                java.lang.String r8 = "Contact_KWeiboNick"
                r11.putExtra(r8, r0)
                te3.s10 r0 = r5.f134974u
                if (r0 == 0) goto L_0x015b
                java.lang.String r5 = "Contact_customInfo"
                byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0155 }
                r11.putExtra(r5, r0)     // Catch:{ IOException -> 0x0155 }
                goto L_0x015b
            L_0x0155:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r4)
            L_0x015b:
                java.lang.Class<om.f> r0 = p214om.C11502f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                om.f r0 = (p214om.C11502f) r0
                wc3.z r0 = r0.mo11462yM()
                com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
                r0.mo93174g(r11, r1)
                r4 = 1
            L_0x016d:
                com.tencent.mm.plugin.brandservice.ui.c$b r1 = r2.f124289g
                if (r1 == 0) goto L_0x017e
                if (r9 == 0) goto L_0x017e
                int r6 = r2.f124288f
                int r7 = r2.f124287e
                r2 = r9
                r3 = r19
                r5 = r13
                r1.mo63467a(r2, r3, r4, r5, r6, r7)
            L_0x017e:
                r1 = 1
                return r1
            L_0x0180:
                java.lang.String r0 = "The brItem.ContactItem or brItem.ContactItem.ContactItem is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.C40645a.C40647b.mo63545d(android.content.Context, android.view.View, qj3.a, java.lang.Object[]):boolean");
        }
    }

    public C40645a(Object obj) {
        super(5, obj);
    }

    /* renamed from: a */
    public void mo63539a(Context context, C47856a.C47857a aVar, Object... objArr) {
        Object obj;
        C49772hy3 hy32;
        C52558c cVar;
        CharSequence charSequence;
        if (!this.f128457c) {
            if (context == null || aVar == null || (obj = this.f128456b) == null) {
                Log.m105920e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar instanceof C40646a)) {
                Log.m105920e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            } else if (!(obj instanceof C51256sk)) {
                Log.m105920e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            } else {
                C40646a aVar2 = (C40646a) aVar;
                C50139kk kkVar = ((C51256sk) obj).f141568e;
                if (kkVar == null || (hy32 = kkVar.f136834f) == null) {
                    Log.m105920e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
                    return;
                }
                C50413mk mkVar = kkVar.f136833e;
                if (objArr != null && objArr.length > 1) {
                    List<String> list = objArr[1];
                    if (list instanceof List) {
                        this.f124286d = list;
                    }
                }
                this.f109182l = hy32.f134960d.f141175d;
                this.f109180j = mkVar == null ? "" : mkVar.f138076e;
                C51163rv3 rv32 = hy32.f134961e;
                C52558c.C52560b.C52566e eVar = null;
                try {
                    this.f109179i = C45829j.m51130c(context, rv32 == null ? null : rv32.f141175d, this.f124286d, (int) aVar2.f109185b.getTextSize());
                } catch (Exception unused) {
                    this.f109179i = "";
                }
                String str = hy32.f134960d.f141175d;
                C51187s10 s102 = hy32.f134974u;
                if (s102 != null) {
                    cVar = new C52558c();
                    cVar.field_username = str;
                    int i = C45829j.f123738a;
                    cVar.field_brandFlag = s102.f141260d;
                    cVar.field_brandIconURL = s102.f141263g;
                    cVar.field_brandInfo = s102.f141262f;
                    cVar.field_extInfo = s102.f141261e;
                } else {
                    cVar = null;
                }
                if (!(cVar == null || cVar.mo73500r2(false) == null)) {
                    eVar = cVar.mo73500r2(false).mo73521n();
                }
                if (eVar != null) {
                    C52558c.C52560b r2 = cVar.mo73500r2(false);
                    JSONObject jSONObject = r2.f146795a;
                    if (jSONObject != null) {
                        r2.f146818x = Util.getInt(jSONObject.optString("IsTrademarkProtection"), 0) == 1;
                    }
                    this.f109184n = r2.f146818x && !Util.isNullOrNil(eVar.f146837b);
                    this.f109183m = hy32.f134967n != 0;
                }
                Log.m105927v("MicroMsg.BizContactDataItem", "verifyFlag : %d", Integer.valueOf(hy32.f134967n));
                String str2 = hy32.f134970q;
                if (this.f124286d.size() > 0 && str2 != null && str2.toLowerCase().equals(this.f124286d.get(0).toLowerCase())) {
                    try {
                        this.f109181k = C45829j.m51130c(context, str2, this.f124286d, (int) aVar2.f109189f.getTextSize());
                        this.f109181k = TextUtils.concat(new CharSequence[]{context.getResources().getString(C0966R.string.f361247ih2), this.f109181k});
                    } catch (Exception unused2) {
                        this.f109181k = "";
                    }
                }
                CharSequence charSequence2 = this.f109181k;
                if (charSequence2 == null || charSequence2.length() == 0 || (charSequence = this.f109180j) == null || ((String) charSequence).length() == 0) {
                    try {
                        this.f109178h = C45829j.m51130c(context, hy32.f134965i, this.f124286d, (int) aVar2.f109187d.getTextSize());
                    } catch (Exception unused3) {
                        this.f109178h = "";
                    }
                }
                Log.m105919d("MicroMsg.BizContactDataItem", "nickName : %s, followFriends : %s.", this.f109179i, this.f109180j);
                this.f128457c = true;
            }
        }
    }

    /* renamed from: b */
    public C47856a.C47857a mo63540b() {
        return new C40646a();
    }

    /* renamed from: c */
    public C47856a.C47858b mo63541c() {
        if (f109177o == null) {
            f109177o = new C40647b();
        }
        return f109177o;
    }
}
