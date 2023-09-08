package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import i21.C98591h;
import ke3.C88144b;
import pv1.C22019b;
import xv1.C78991b;

/* renamed from: xv1.v */
public class C79000v extends C78991b {

    /* renamed from: w */
    public C79001a f231988w = new C79001a();

    /* renamed from: xv1.v$a */
    public class C79001a extends C78991b.C78993b {
        public C79001a() {
            super();
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            C79000v vVar = (C79000v) bVar;
            if (C72996z1.m85840k5(vVar.f231945r) && !WeChatBrands.Business.Entries.HomeNotifyMessage.checkAvailable(view.getContext())) {
                return true;
            }
            if ((C72996z1.m85843n5(vVar.f231945r) || C72996z1.m85847r5(vVar.f231945r)) && !WeChatBrands.Business.Entries.GlobalWeCom.checkAvailable(view.getContext())) {
                return true;
            }
            mo35141a(C79000v.this.mo35139k(), vVar.f231943p);
            Intent putExtra = new Intent().putExtra("Chat_User", vVar.f231945r).putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 5);
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", putExtra, (Bundle) null);
            ((C98591h) C86312j.m106911c(C98591h.class)).rt0(vVar.f231945r, 2);
            return true;
        }
    }

    public C79000v(int i) {
        super(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r7 = r1.f231944q.getNickname();
        r6 = r2.getString(com.tencent.p014mm.C0966R.string.igx);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        r7 = r5;
        r5 = null;
        r6 = null;
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r5 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x029f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r20, pv1.C22019b.C22020a r21, java.lang.Object... r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            lv1.n r0 = r1.f231943p
            java.lang.String r0 = r0.f292151e
            r1.f231945r = r0
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r4 = r1.f231945r
            com.tencent.mm.storage.z1 r0 = r0.get(r4)
            r1.f231944q = r0
            java.lang.String r0 = r1.f231945r
            java.lang.String r4 = kv1.C99251g.m129283d(r0)
            lv1.n r0 = r1.f231943p
            int r5 = r0.f292149c
            r8 = 0
            r9 = 11
            java.lang.String r10 = ""
            if (r5 == r9) goto L_0x0181
            r9 = 51
            if (r5 == r9) goto L_0x00d3
            switch(r5) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0067;
                case 3: goto L_0x0065;
                case 4: goto L_0x0058;
                case 5: goto L_0x0045;
                case 6: goto L_0x0042;
                case 7: goto L_0x0040;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r5) {
                case 15: goto L_0x00b1;
                case 16: goto L_0x0084;
                case 17: goto L_0x0079;
                case 18: goto L_0x006e;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = 0
            r5 = 0
            r9 = 0
            goto L_0x00cc
        L_0x0040:
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r5 = 1
            goto L_0x0047
        L_0x0045:
            r0 = 0
            r5 = 0
        L_0x0047:
            com.tencent.mm.storage.z1 r6 = r1.f231944q
            java.lang.String r6 = r6.getNickname()
            r9 = 2131835407(0x7f113a0f, float:1.9303952E38)
            java.lang.String r9 = r2.getString(r9)
            r7 = r6
            r6 = r9
            goto L_0x01f5
        L_0x0058:
            com.tencent.mm.storage.z1 r0 = r1.f231944q
            java.lang.String r0 = r0.f149513S0
            r5 = 2131835402(0x7f113a0a, float:1.9303942E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x01f1
        L_0x0065:
            r0 = 1
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r5 = 1
            goto L_0x006c
        L_0x006a:
            r0 = 0
            r5 = 0
        L_0x006c:
            r9 = 1
            goto L_0x00cc
        L_0x006e:
            java.lang.String r0 = r0.f292154h
            r5 = 2131835408(0x7f113a10, float:1.9303954E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x01f1
        L_0x0079:
            java.lang.String r0 = r0.f292154h
            r5 = 2131835401(0x7f113a09, float:1.930394E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x01f1
        L_0x0084:
            java.lang.String r0 = r0.f292154h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x00a8
            java.lang.String r5 = "​"
            java.lang.String[] r5 = r0.split(r5)
            int r6 = r5.length
            r9 = 0
        L_0x0095:
            if (r9 >= r6) goto L_0x00a8
            r11 = r5[r9]
            java.lang.String r12 = r19.mo35139k()
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x00a5
            r0 = r11
            goto L_0x00a8
        L_0x00a5:
            int r9 = r9 + 1
            goto L_0x0095
        L_0x00a8:
            r5 = 2131835406(0x7f113a0e, float:1.930395E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x01f1
        L_0x00b1:
            com.tencent.mm.storage.z1 r0 = r1.f231944q
            java.lang.String r0 = r0.mo62913l2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x00c3
            com.tencent.mm.storage.z1 r0 = r1.f231944q
            java.lang.String r0 = r0.getUsername()
        L_0x00c3:
            r5 = 2131835413(0x7f113a15, float:1.9303964E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x01f1
        L_0x00cc:
            r7 = r5
            r5 = 0
            r6 = 0
            r17 = 0
            goto L_0x01fe
        L_0x00d3:
            com.tencent.mm.storage.z1 r5 = r1.f231944q
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.String r0 = r5.f149532d1
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0103 }
            r11.<init>(r0)     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r0 = "custom_info"
            org.json.JSONArray r0 = r11.optJSONArray(r0)     // Catch:{ JSONException -> 0x0103 }
            if (r0 != 0) goto L_0x00ea
            goto L_0x010d
        L_0x00ea:
            r11 = 0
        L_0x00eb:
            int r12 = r0.length()     // Catch:{ JSONException -> 0x0103 }
            if (r11 >= r12) goto L_0x010d
            org.json.JSONObject r12 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x0103 }
            he0.l r13 = new he0.l     // Catch:{ JSONException -> 0x0103 }
            r13.<init>()     // Catch:{ JSONException -> 0x0103 }
            r13.mo106375a(r12)     // Catch:{ JSONException -> 0x0103 }
            r9.add(r13)     // Catch:{ JSONException -> 0x0103 }
            int r11 = r11 + 1
            goto L_0x00eb
        L_0x0103:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r12 = "MicroMsg.OpenIMCustomDetail"
            java.lang.String r13 = "parse"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r13, r11)
        L_0x010d:
            r0 = 0
        L_0x010e:
            int r11 = r9.size()
            if (r0 >= r11) goto L_0x0158
            java.lang.Object r11 = r9.get(r0)
            he0.l r11 = (he0.C76159l) r11
            java.util.List<he0.m> r12 = r11.f223089b
            java.util.Iterator r12 = r12.iterator()
        L_0x0120:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0155
            java.lang.Object r13 = r12.next()
            he0.m r13 = (he0.C76160m) r13
            java.lang.String r14 = r5.mo73980x2()
            java.lang.String r13 = r13.mo106376a(r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 != 0) goto L_0x0120
            lv1.i r14 = r1.f62327e
            java.lang.String[] r14 = r14.f292122c
            int r15 = r14.length
            r6 = 0
        L_0x0140:
            if (r6 >= r15) goto L_0x0120
            r7 = r14[r6]
            boolean r7 = r13.contains(r7)
            if (r7 == 0) goto L_0x0152
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r0 = r11.f223088a
            r6.<init>(r0, r13)
            goto L_0x0159
        L_0x0152:
            int r6 = r6 + 1
            goto L_0x0140
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x010e
        L_0x0158:
            r6 = 0
        L_0x0159:
            if (r6 == 0) goto L_0x017e
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r6 = "："
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r5 = r6
            r7 = 0
            r9 = 0
            r17 = 1
            r6 = r0
            r0 = 0
            goto L_0x01fe
        L_0x017e:
            r0 = r10
            r5 = r0
            goto L_0x01f1
        L_0x0181:
            java.lang.Class<kv1.q> r0 = kv1.C99260q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kv1.q r0 = (kv1.C99260q) r0
            kv1.m r0 = r0.mo128761xc()
            com.tencent.mm.storage.z1 r5 = r1.f231944q
            java.lang.String r5 = r5.mo73974r2()
            com.tencent.mm.plugin.fts.g r0 = (com.tencent.p014mm.plugin.fts.C68985g) r0
            java.util.List r0 = r0.mo94942c(r5)
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            lv1.i r6 = r1.f62327e
            java.lang.String[] r6 = r6.f292122c
            int r7 = r6.length
            r9 = 0
        L_0x01a4:
            if (r9 >= r7) goto L_0x01d5
            r11 = r6[r9]
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x01af:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01d2
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r13.toLowerCase()
            java.lang.String r14 = kv1.C99255j.m129319c(r14)
            boolean r14 = r14.contains(r11)
            if (r14 == 0) goto L_0x01af
            r5.append(r13)
            java.lang.String r13 = ","
            r5.append(r13)
            goto L_0x01af
        L_0x01d2:
            int r9 = r9 + 1
            goto L_0x01a4
        L_0x01d5:
            r5.trimToSize()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x01e0
            r0 = r10
            goto L_0x01ea
        L_0x01e0:
            int r0 = r5.length()
            int r0 = r0 + -1
            java.lang.String r0 = r5.substring(r8, r0)
        L_0x01ea:
            r5 = 2131835412(0x7f113a14, float:1.9303962E38)
            java.lang.String r5 = r2.getString(r5)
        L_0x01f1:
            r7 = r0
            r6 = r5
            r0 = 0
            r5 = 0
        L_0x01f5:
            r9 = 0
            r17 = 1
            r18 = r7
            r7 = r5
            r5 = r6
            r6 = r18
        L_0x01fe:
            r15 = 2131165591(0x7f070197, float:1.7945403E38)
            if (r9 == 0) goto L_0x022e
            di3.d r9 = di3.C86312j.m106911c(r3)
            ny.h r9 = (p629ny.C76979h) r9
            int r11 = kg3.C76577a.m92157h(r2, r15)
            float r11 = (float) r11
            android.text.SpannableString r11 = r9.Te0(r2, r4, r11)
            r1.f231946s = r11
            lv1.i r12 = r1.f62327e
            int r4 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r4 = (float) r4
            android.text.TextPaint r16 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            r13 = r7
            r14 = r0
            r9 = 2131165591(0x7f070197, float:1.7945403E38)
            r15 = r4
            lv1.f r4 = lv1.C99667f.m130092e(r11, r12, r13, r14, r15, r16)
            lv1.g r4 = kv1.C99254i.m129308e(r4)
            java.lang.CharSequence r4 = r4.f292107a
            r1.f231946s = r4
            goto L_0x0242
        L_0x022e:
            r9 = 2131165591(0x7f070197, float:1.7945403E38)
            di3.d r11 = di3.C86312j.m106911c(r3)
            ny.h r11 = (p629ny.C76979h) r11
            int r12 = kg3.C76577a.m92157h(r2, r9)
            float r12 = (float) r12
            android.text.SpannableString r4 = r11.Te0(r2, r4, r12)
            r1.f231946s = r4
        L_0x0242:
            if (r17 == 0) goto L_0x0278
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            int r4 = kg3.C76577a.m92157h(r2, r9)
            float r4 = (float) r4
            android.text.SpannableString r11 = r3.Te0(r2, r6, r4)
            r1.f231947t = r11
            lv1.i r12 = r1.f62327e
            int r2 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r15 = (float) r2
            android.text.TextPaint r16 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            r13 = r7
            r14 = r0
            lv1.f r0 = lv1.C99667f.m130092e(r11, r12, r13, r14, r15, r16)
            lv1.g r0 = kv1.C99254i.m129308e(r0)
            java.lang.CharSequence r0 = r0.f292107a
            r1.f231947t = r0
            r2 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r2[r8] = r5
            r3 = 1
            r2[r3] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r2)
            r1.f231947t = r0
        L_0x0278:
            com.tencent.mm.storage.z1 r0 = r1.f231944q
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x029f
            java.lang.Class<he0.j> r0 = he0.C76158j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            he0.j r0 = (he0.C76158j) r0
            com.tencent.mm.storage.z1 r2 = r1.f231944q
            java.lang.String r2 = r2.mo73980x2()
            com.tencent.mm.storage.z1 r3 = r1.f231944q
            java.lang.String r3 = r3.mo73976t2()
            java.lang.String r0 = r0.mo106373wo(r2, r3)
            r1.f231948u = r0
            goto L_0x02a1
        L_0x029f:
            r1.f231948u = r10
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.C79000v.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: d */
    public String mo35132d() {
        C72996z1 z1Var = this.f231944q;
        if (z1Var == null || !C72996z1.m85843n5(z1Var.getUsername())) {
            return "";
        }
        return "openim:" + this.f231944q.mo73980x2();
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f231988w;
    }
}
