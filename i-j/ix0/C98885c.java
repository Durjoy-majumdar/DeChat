package ix0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C39884q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import ex0.C20643e;
import he0.C76158j;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99252h;
import kv1.C99261r;
import lv1.C99681n;
import n20.C61605g;
import n20.C61611s;
import p227rn.C48052u;
import p227rn.C48053v;
import p255vr.C78470h;
import pv1.C22019b;

/* renamed from: ix0.c */
public class C98885c extends C22019b implements C20643e {

    /* renamed from: p */
    public C99681n f289876p;

    /* renamed from: q */
    public C72996z1 f289877q;

    /* renamed from: r */
    public String f289878r;

    /* renamed from: s */
    public String f289879s;

    /* renamed from: t */
    public CharSequence f289880t;

    /* renamed from: u */
    public CharSequence f289881u;

    /* renamed from: v */
    public C98887b f289882v = new C98887b();

    /* renamed from: w */
    public C98886a f289883w = new C98886a(this);

    /* renamed from: ix0.c$a */
    public class C98886a extends C22019b.C22020a {

        /* renamed from: a */
        public View f289884a;

        /* renamed from: b */
        public ImageView f289885b;

        /* renamed from: c */
        public TextView f289886c;

        /* renamed from: d */
        public TextView f289887d;

        /* renamed from: e */
        public WeImageView f289888e;

        public C98886a(C98885c cVar) {
            super(cVar);
        }
    }

    /* renamed from: ix0.c$b */
    public class C98887b extends C22019b.C22021b {
        public C98887b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C78470h.class;
            C98885c cVar = (C98885c) bVar;
            C98886a aVar2 = (C98886a) aVar;
            ((C78470h) C86312j.m106911c(cls)).Zo0(aVar2.f289884a, C98885c.this.f62326d);
            int h = C76577a.m92157h(context, C0966R.dimen.f3796en);
            C61605g gVar = new C61605g(h, h);
            gVar.f175195d = C0966R.C0969drawable.be5;
            gVar.f175194c = 0.5f;
            ((C61611s) C86312j.m106911c(C61611s.class)).mo84732PU(aVar2.f289885b, Util.nullAs(cVar.f289879s, ""), gVar);
            if (C45628s0.m50748M(cVar.f289878r)) {
                ((C78470h) C86312j.m106911c(cls)).mo108300VH(((C76158j) C86312j.m106911c(C76158j.class)).bm0(context, cVar.f289880t), aVar2.f289886c);
            } else {
                ((C78470h) C86312j.m106911c(cls)).mo108300VH(cVar.f289880t, aVar2.f289886c);
            }
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(cVar.f289881u, aVar2.f289887d);
            boolean z = true;
            if ((cVar.f289877q.mo73953E2() & 512) > 0) {
                aVar2.f289888e.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_star_identify, C76577a.m92153d(context, C0966R.color.a7u)));
                aVar2.f289888e.setVisibility(0);
                return;
            }
            if ((cVar.f289877q.mo73953E2() & 16) <= 0) {
                z = false;
            }
            if (z) {
                aVar2.f289888e.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_star_identify, C76577a.m92153d(context, C0966R.color.f2956ac)));
                aVar2.f289888e.setVisibility(0);
                return;
            }
            aVar2.f289888e.setVisibility(8);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.asq, viewGroup, false);
            C98886a aVar = C98885c.this.f289883w;
            aVar.f289885b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f289886c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f289887d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f289884a = inflate.findViewById(C0966R.C0970id.c7p);
            aVar.f289888e = (WeImageView) inflate.findViewById(C0966R.C0970id.f2a);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Context context2 = context;
            Class cls = C99261r.class;
            Class cls2 = C48053v.class;
            C98885c cVar = (C98885c) bVar;
            if (!WeChatBrands.Business.Entries.SessionOa.checkAvailable(view.getContext()) && !C72996z1.m85805J5(String.valueOf(cVar.f289878r))) {
                return true;
            }
            mo35141a(C98885c.this.mo35139k(), cVar.f289876p);
            if (((C48053v) C86312j.m106911c(cls2)).mo72617gl(cVar.f289878r)) {
                Intent intent = new Intent();
                intent.putExtra("enterprise_biz_name", cVar.f289878r);
                intent.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(cVar.f289878r));
                StringBuilder sb = new StringBuilder();
                sb.append("");
                C98885c.this.getClass();
                sb.append(C99252h.f291031d);
                intent.putExtra("uinserve_search_id", sb.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                C98885c.this.getClass();
                sb4.append(C99252h.f291030c);
                intent.putExtra("uinserve_search_session_id", sb4.toString());
                intent.putExtra("enterprise_from_scene", 3);
                intent.putExtra("uinserve_search_session_id", "" + C99252h.m129297b());
                C88144b.m109801s(context2, ".ui.conversation.EnterpriseConversationUI", intent, (Bundle) null);
            } else if (((C48053v) C86312j.m106911c(cls2)).mo72614OE(cVar.f289878r)) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", cVar.f289878r);
                intent2.addFlags(67108864);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("");
                C98885c.this.getClass();
                sb5.append(C99252h.f291031d);
                intent2.putExtra("uinserve_search_id", sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append("");
                C98885c.this.getClass();
                sb6.append(C99252h.f291030c);
                intent2.putExtra("uinserve_search_session_id", sb6.toString());
                intent2.putExtra("biz_chat_from_scene", 5);
                intent2.putExtra("uinserve_search_time_token", "" + C99252h.m129297b());
                C88144b.m109801s(context2, ".ui.bizchat.BizChatConversationUI", intent2, (Bundle) null);
            } else if (((C48053v) C86312j.m106911c(cls2)).mo72618kL(cVar.f289878r)) {
                C48052u v = ((C48053v) C86312j.m106911c(cls2)).mo72619v(cVar.f289878r);
                String B = v == null ? null : v.mo72807B();
                if (B == null) {
                    B = "";
                }
                Intent intent3 = new Intent();
                intent3.putExtra("rawUrl", B);
                intent3.putExtra("useJs", true);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("");
                C98885c.this.getClass();
                sb7.append(C99252h.f291031d);
                intent3.putExtra("uinserve_search_id", sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append("");
                C98885c.this.getClass();
                sb8.append(C99252h.f291030c);
                intent3.putExtra("uinserve_search_session_id", sb8.toString());
                intent3.putExtra("uinserve_search_time_token", "" + C99252h.m129297b());
                intent3.putExtra("srcUsername", cVar.f289878r);
                intent3.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent3.addFlags(67108864);
                C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            } else {
                Intent intent4 = new Intent();
                intent4.putExtra("Chat_User", cVar.f289878r);
                intent4.putExtra("finish_direct", true);
                intent4.putExtra("specific_chat_from_scene", 3);
                intent4.putExtra("preChatTYPE", 9);
                intent4.putExtra("chat_from_scene", 5);
                StringBuilder sb9 = new StringBuilder();
                sb9.append("");
                C98885c.this.getClass();
                sb9.append(C99252h.f291031d);
                intent4.putExtra("uinserve_search_id", sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append("");
                C98885c.this.getClass();
                sb10.append(C99252h.f291030c);
                intent4.putExtra("uinserve_search_session_id", sb10.toString());
                intent4.putExtra("uinserve_search_time_token", "" + C99252h.m129297b());
                intent4.putExtra("KOpenArticleSceneFromScene", 7);
                C88144b.m109801s(context2, ".ui.chatting.ChattingUI", intent4, (Bundle) null);
            }
            ((C39884q) C86312j.m106911c(C39884q.class)).mo55839ow(cVar.f289878r);
            ((C99261r) C86312j.m106911c(cls)).rv0(cVar.f289878r, cVar.f289880t.toString(), cVar.f289879s, 5);
            ((C99261r) C86312j.m106911c(cls)).mo23817hN(cVar);
            return true;
        }
    }

    public C98885c(int i) {
        super(4, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r8 = ((p248ug.C52574z) di3.C86312j.m106911c(p248ug.C52574z.class)).mo73533Qp(r12.f289878r).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r8.hasNext() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r9 = ((p629ny.C76979h) di3.C86312j.m106911c(r14)).Te0(r13, r8.next(), (float) kg3.C76577a.m92157h(r13, com.tencent.p014mm.C0966R.dimen.f3927j7));
        r12.f289881u = r9;
        r9 = kv1.C99254i.m129308e(lv1.C99667f.m130091d(r9, r12.f62327e, r7, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r9.f292108b != 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        r12.f289881u = r9.f292107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r12.f289881u = android.text.TextUtils.concat(new java.lang.CharSequence[]{r12.f289881u, r13.getString(com.tencent.p014mm.C0966R.string.ig6) + r0});
        r8 = r7;
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r13, pv1.C22019b.C22020a r14, java.lang.Object... r15) {
        /*
            r12 = this;
            java.lang.Class<ny.h> r14 = p629ny.C76979h.class
            lv1.n r15 = r12.f289876p
            java.lang.String r15 = r15.f292151e
            r12.f289878r = r15
            java.lang.Class<f62.k0> r15 = f62.C75700k0.class
            k40.a r15 = f40.C86709a0.m107533q(r15)
            f62.k0 r15 = (f62.C75700k0) r15
            com.tencent.mm.storage.u3 r15 = r15.mo96097Ni()
            java.lang.String r0 = r12.f289878r
            com.tencent.mm.storage.z1 r15 = r15.get(r0)
            r12.f289877q = r15
            java.lang.Class<rn.v> r15 = p227rn.C48053v.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            rn.v r15 = (p227rn.C48053v) r15
            java.lang.String r0 = r12.f289878r
            rn.u r15 = r15.mo72619v(r0)
            if (r15 != 0) goto L_0x002f
            java.lang.String r0 = ""
            goto L_0x0033
        L_0x002f:
            java.lang.String r0 = r15.mo72812i1()
        L_0x0033:
            r12.f289879s = r0
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r1 = r12.f289878r
            java.lang.String r0 = r0.getDisplayName(r1)
            r1 = 0
            r2 = 1
            if (r15 == 0) goto L_0x0050
            boolean r15 = r15.mo72810e0()
            if (r15 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r15 = 0
            goto L_0x0051
        L_0x0050:
            r15 = 1
        L_0x0051:
            lv1.n r3 = r12.f289876p
            int r3 = r3.f292149c
            r4 = 0
            r5 = 2
            r6 = 2131165591(0x7f070197, float:1.7945403E38)
            if (r3 == r2) goto L_0x0103
            if (r3 == r5) goto L_0x0100
            r7 = 3
            if (r3 == r7) goto L_0x00fe
            r7 = 15
            if (r3 == r7) goto L_0x00de
            switch(r3) {
                case 19: goto L_0x0074;
                case 20: goto L_0x0071;
                case 21: goto L_0x006f;
                default: goto L_0x0068;
            }
        L_0x0068:
            r7 = r4
            r3 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            goto L_0x0109
        L_0x006f:
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r7 = 1
            goto L_0x0076
        L_0x0074:
            r3 = 0
            r7 = 0
        L_0x0076:
            java.lang.Class<ug.z> r8 = p248ug.C52574z.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ug.z r8 = (p248ug.C52574z) r8
            java.lang.String r9 = r12.f289878r
            java.util.ArrayList r8 = r8.mo73533Qp(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x0088:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b7
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            di3.d r10 = di3.C86312j.m106911c(r14)
            ny.h r10 = (p629ny.C76979h) r10
            int r11 = kg3.C76577a.m92157h(r13, r6)
            float r11 = (float) r11
            android.text.SpannableString r9 = r10.Te0(r13, r9, r11)
            r12.f289881u = r9
            lv1.i r10 = r12.f62327e
            lv1.f r9 = lv1.C99667f.m130091d(r9, r10, r7, r3)
            lv1.g r9 = kv1.C99254i.m129308e(r9)
            int r10 = r9.f292108b
            if (r10 != 0) goto L_0x0088
            java.lang.CharSequence r8 = r9.f292107a
            r12.f289881u = r8
        L_0x00b7:
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r5]
            java.lang.CharSequence r9 = r12.f289881u
            r8[r1] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 2131835376(0x7f1139f0, float:1.9303889E38)
            java.lang.String r10 = r13.getString(r10)
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8[r2] = r9
            java.lang.CharSequence r8 = android.text.TextUtils.concat(r8)
            r12.f289881u = r8
            r8 = r7
            r9 = 0
            goto L_0x0107
        L_0x00de:
            com.tencent.mm.storage.z1 r3 = r12.f289877q
            java.lang.String r3 = r3.mo62913l2()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x00f0
            com.tencent.mm.storage.z1 r3 = r12.f289877q
            java.lang.String r3 = r3.getUsername()
        L_0x00f0:
            r4 = r3
            r3 = 2131835413(0x7f113a15, float:1.9303964E38)
            java.lang.String r3 = r13.getString(r3)
            r7 = r3
            r3 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            goto L_0x0109
        L_0x00fe:
            r3 = 1
            goto L_0x0101
        L_0x0100:
            r3 = 0
        L_0x0101:
            r7 = 1
            goto L_0x0105
        L_0x0103:
            r3 = 0
            r7 = 0
        L_0x0105:
            r8 = r7
            r9 = 1
        L_0x0107:
            r10 = 0
            r7 = r4
        L_0x0109:
            if (r9 == 0) goto L_0x0139
            di3.d r9 = di3.C86312j.m106911c(r14)
            ny.h r9 = (p629ny.C76979h) r9
            int r11 = kg3.C76577a.m92157h(r13, r6)
            float r11 = (float) r11
            android.text.SpannableString r0 = r9.Te0(r13, r0, r11)
            r12.f289880t = r0
            lv1.i r9 = r12.f62327e
            lv1.f r0 = lv1.C99667f.m130091d(r0, r9, r8, r3)
            lv1.g r0 = kv1.C99254i.m129308e(r0)
            java.lang.CharSequence r0 = r0.f292107a
            r12.f289880t = r0
            int r0 = r12.f62329g
            r9 = -8
            if (r0 != r9) goto L_0x014a
            r0 = 2131830469(0x7f1126c5, float:1.9293936E38)
            java.lang.String r0 = r13.getString(r0)
            r12.f289881u = r0
            goto L_0x014a
        L_0x0139:
            di3.d r9 = di3.C86312j.m106911c(r14)
            ny.h r9 = (p629ny.C76979h) r9
            int r11 = kg3.C76577a.m92157h(r13, r6)
            float r11 = (float) r11
            android.text.SpannableString r0 = r9.Te0(r13, r0, r11)
            r12.f289880t = r0
        L_0x014a:
            if (r10 == 0) goto L_0x0179
            if (r15 == 0) goto L_0x0179
            di3.d r14 = di3.C86312j.m106911c(r14)
            ny.h r14 = (p629ny.C76979h) r14
            int r15 = kg3.C76577a.m92157h(r13, r6)
            float r15 = (float) r15
            android.text.SpannableString r13 = r14.Te0(r13, r4, r15)
            r12.f289881u = r13
            lv1.i r14 = r12.f62327e
            lv1.f r13 = lv1.C99667f.m130091d(r13, r14, r8, r3)
            lv1.g r13 = kv1.C99254i.m129308e(r13)
            java.lang.CharSequence r13 = r13.f292107a
            r12.f289881u = r13
            java.lang.CharSequence[] r14 = new java.lang.CharSequence[r5]
            r14[r1] = r7
            r14[r2] = r13
            java.lang.CharSequence r13 = android.text.TextUtils.concat(r14)
            r12.f289881u = r13
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.C98885c.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: d */
    public String mo35132d() {
        CharSequence charSequence = this.f289880t;
        return charSequence != null ? charSequence.toString() : "";
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f289876p.f292164r;
    }

    public String getUserName() {
        return this.f289878r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f289882v;
    }
}
