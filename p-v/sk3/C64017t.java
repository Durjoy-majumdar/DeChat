package sk3;

import android.view.View;
import fy3.C32228q;
import gy3.C24565l;
import ok3.C62072g;
import rx3.C13598b0;

/* renamed from: sk3.t */
public final /* synthetic */ class C64017t extends C24565l implements C32228q<View, Integer, C62072g, C13598b0> {
    public C64017t(Object obj) {
        super(3, obj, C64024v.class, "dealItemClick", "dealItemClick(Landroid/view/View;ILcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiResultAllResultItemBean;)V", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r16 = this;
            r0 = r17
            android.view.View r0 = (android.view.View) r0
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r19
            ok3.g r2 = (ok3.C62072g) r2
            java.lang.String r3 = "p0"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "p2"
            gy3.C87412m.m108594g(r2, r3)
            r3 = r16
            java.lang.Object r4 = r3.receiver
            sk3.v r4 = (sk3.C64024v) r4
            r4.getClass()
            java.lang.Class<om.f> r5 = p214om.C11502f.class
            java.lang.Class<rn.v> r6 = p227rn.C48053v.class
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "dealItemClick >> "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.FTSMultiItemAllResultUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            bl3.r r7 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r9 = r4.getActivity()
            bl3.r$a r9 = r7.mo62444c(r9)
            java.lang.Class<sk3.q0> r10 = sk3.C64004q0.class
            androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
            sk3.q0 r9 = (sk3.C64004q0) r9
            r9.mo88771c3()
            nk3.b r9 = r2.f176468b
            nk3.b r10 = nk3.C61796b.IMAGE
            r11 = 0
            if (r9 != r10) goto L_0x009f
            androidx.appcompat.app.AppCompatActivity r9 = r4.getActivity()
            bl3.r$a r7 = r7.mo62444c(r9)
            java.lang.Class<sk3.m> r9 = sk3.C63995m.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r9)
            sk3.m r7 = (sk3.C63995m) r7
            long r9 = r2.f176475i
            r7.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            gq3.h r7 = r7.mo88763e3()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r7 = r7.f170410q
            r13.<init>(r7)
            java.util.Iterator r7 = r13.iterator()
            r13 = 0
        L_0x007e:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x00ba
            java.lang.Object r14 = r7.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L_0x009b
            com.tencent.mm.api.QueryImageData r14 = (com.tencent.p014mm.api.QueryImageData) r14
            r18 = r13
            long r12 = r14.f154723d
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0099
            r13 = r18
            goto L_0x00bb
        L_0x0099:
            r13 = r15
            goto L_0x007e
        L_0x009b:
            sx3.C64197v.m75542k()
            throw r11
        L_0x009f:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<java.lang.Long>> r7 = r4.f181513G
            int r9 = r9.f175703d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r7.get(r9)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x00ba
            long r9 = r2.f176475i
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r13 = r7.indexOf(r9)
            goto L_0x00bb
        L_0x00ba:
            r13 = -1
        L_0x00bb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "getItemInSameTypePosition >> "
            r7.append(r9)
            r7.append(r13)
            java.lang.String r9 = ", "
            r7.append(r9)
            long r9 = r2.f176475i
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            rk3.a r7 = rk3.C63462a.f180011a
            nk3.b r8 = r2.f176468b
            int r8 = r8.f175703d
            r9 = 1
            int r1 = r1 + r9
            int r13 = r13 + r9
            r7.mo88329c(r8, r1, r13)
            java.lang.String r1 = r2.f176469c
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r1)
            if (r1 != 0) goto L_0x0122
            java.lang.String r1 = r2.f176469c
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85847r5(r1)
            if (r1 == 0) goto L_0x00f6
            goto L_0x0122
        L_0x00f6:
            java.lang.String r1 = r2.f176469c
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 == 0) goto L_0x010c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionOa
            android.content.Context r0 = r0.getContext()
            boolean r0 = r1.checkAvailable(r0)
            if (r0 != 0) goto L_0x0130
            goto L_0x0304
        L_0x010c:
            java.lang.String r1 = r2.f176469c
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85819U4(r1)
            if (r1 == 0) goto L_0x0130
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionOa
            android.content.Context r0 = r0.getContext()
            boolean r0 = r1.checkAvailable(r0)
            if (r0 != 0) goto L_0x0130
            goto L_0x0304
        L_0x0122:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalWeCom
            android.content.Context r0 = r0.getContext()
            boolean r0 = r1.checkAvailable(r0)
            if (r0 != 0) goto L_0x0130
            goto L_0x0304
        L_0x0130:
            di3.d r0 = di3.C86312j.m106911c(r6)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r1 = r2.f176469c
            boolean r0 = r0.mo72617gl(r1)
            java.lang.String r1 = "Contact_User"
            if (r0 == 0) goto L_0x0165
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r2.f176469c
            android.content.Intent r0 = r0.putExtra(r1, r2)
            java.lang.String r1 = "Intent().putExtra(Consta…act.KUser, item.userName)"
            gy3.C87412m.m108593f(r0, r1)
            di3.d r1 = di3.C86312j.m106911c(r5)
            om.f r1 = (p214om.C11502f) r1
            wc3.z r1 = r1.mo11462yM()
            android.app.Activity r2 = r4.getContext()
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.mo93174g(r0, r2)
            goto L_0x0304
        L_0x0165:
            di3.d r0 = di3.C86312j.m106911c(r6)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r7 = r2.f176469c
            boolean r0 = r0.mo72614OE(r7)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = 5
            if (r0 == 0) goto L_0x0193
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r2.f176469c
            r0.putExtra(r1, r2)
            r0.addFlags(r7)
            java.lang.String r1 = "biz_chat_from_scene"
            r0.putExtra(r1, r8)
            android.app.Activity r1 = r4.getContext()
            java.lang.String r2 = ".ui.bizchat.BizChatConversationUI"
            ke3.C88144b.m109801s(r1, r2, r0, r11)
            goto L_0x0304
        L_0x0193:
            di3.d r0 = di3.C86312j.m106911c(r6)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r1 = r2.f176469c
            boolean r0 = r0.mo72618kL(r1)
            if (r0 == 0) goto L_0x01e9
            di3.d r0 = di3.C86312j.m106911c(r6)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r1 = r2.f176469c
            rn.u r0 = r0.mo72619v(r1)
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = r0.mo72807B()
            goto L_0x01b5
        L_0x01b4:
            r0 = r11
        L_0x01b5:
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = ""
        L_0x01b9:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r5 = "rawUrl"
            r1.putExtra(r5, r0)
            java.lang.String r0 = "useJs"
            r1.putExtra(r0, r9)
            java.lang.String r0 = r2.f176469c
            java.lang.String r2 = "srcUsername"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "bizofstartfrom"
            java.lang.String r2 = "enterpriseHomeSubBrand"
            r1.putExtra(r0, r2)
            r1.addFlags(r7)
            android.app.Activity r0 = r4.getContext()
            java.lang.String r2 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r2, r4, r1, r11)
            goto L_0x0304
        L_0x01e9:
            java.lang.String r0 = r2.f176469c
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85808L4(r0)
            java.lang.String r1 = "highlight_keyword_list"
            java.lang.String r6 = "msg_local_id"
            java.lang.String r7 = "from_global_search"
            java.lang.String r10 = "finish_direct"
            java.lang.String r12 = "Chat_User"
            if (r0 == 0) goto L_0x0272
            lv1.i r0 = r2.f176477k
            gy3.C87412m.m108591d(r0)
            java.lang.String[] r0 = r0.f292122c
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r0)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r13 = r2.f176474h
            r5.putExtra(r12, r13)
            r5.putExtra(r10, r9)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 != 0) goto L_0x0228
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x0228
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r10 != 0) goto L_0x0228
            boolean r10 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r10 == 0) goto L_0x0226
            goto L_0x0228
        L_0x0226:
            r10 = 0
            goto L_0x0229
        L_0x0228:
            r10 = 1
        L_0x0229:
            java.lang.Class<h81.h> r12 = h81.C32735h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            h81.h r12 = (h81.C32735h) r12
            if (r12 == 0) goto L_0x0239
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video
            boolean r10 = r12.mo58784wf(r13, r10)
        L_0x0239:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "isSupportSendVideo#get, "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "MicroMsg.AppBrandContactABTests"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            if (r10 != 0) goto L_0x0257
            java.lang.String r10 = "key_need_send_video"
            r12 = 0
            r5.putExtra(r10, r12)
        L_0x0257:
            r5.putExtra(r7, r9)
            long r9 = r2.f176475i
            r5.putExtra(r6, r9)
            r5.putExtra(r1, r0)
            java.lang.String r0 = "app_brand_chatting_from_scene_new"
            r5.putExtra(r0, r8)
            android.app.Activity r0 = r4.getContext()
            java.lang.String r1 = ".ui.chatting.AppBrandServiceChattingUI"
            ke3.C88144b.m109801s(r0, r1, r5, r11)
            goto L_0x0304
        L_0x0272:
            java.lang.String r0 = r2.f176469c
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85832c5(r0)
            java.lang.String r13 = "chat_from_scene"
            if (r0 == 0) goto L_0x02c1
            java.lang.Class<xy1.k> r0 = xy1.C53475k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xy1.k r0 = (xy1.C53475k) r0
            java.lang.String r1 = r2.f176469c
            xy1.j r0 = r0.mo59160G2(r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r2.f176469c
            android.content.Intent r1 = r1.putExtra(r12, r2)
            if (r0 == 0) goto L_0x029b
            java.lang.String r11 = r0.mo59158t1()
        L_0x029b:
            java.lang.String r0 = "Chat_Self"
            android.content.Intent r0 = r1.putExtra(r0, r11)
            android.content.Intent r0 = r0.putExtra(r10, r9)
            java.lang.String r1 = "Intent()\n               …Chat.KFinishDirect, true)"
            gy3.C87412m.m108593f(r0, r1)
            r0.putExtra(r13, r8)
            di3.d r1 = di3.C86312j.m106911c(r5)
            om.f r1 = (p214om.C11502f) r1
            wc3.z r1 = r1.mo11462yM()
            android.app.Activity r2 = r4.getContext()
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.mo93173f(r0, r2)
            goto L_0x0304
        L_0x02c1:
            lv1.i r0 = r2.f176477k
            gy3.C87412m.m108591d(r0)
            java.lang.String[] r0 = r0.f292122c
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r0)
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r14 = r2.f176469c
            android.content.Intent r11 = r11.putExtra(r12, r14)
            android.content.Intent r10 = r11.putExtra(r10, r9)
            android.content.Intent r7 = r10.putExtra(r7, r9)
            long r9 = r2.f176475i
            android.content.Intent r2 = r7.putExtra(r6, r9)
            android.content.Intent r0 = r2.putExtra(r1, r0)
            java.lang.String r1 = "Intent()\n               …ist, chattingKeywordList)"
            gy3.C87412m.m108593f(r0, r1)
            r0.putExtra(r13, r8)
            di3.d r1 = di3.C86312j.m106911c(r5)
            om.f r1 = (p214om.C11502f) r1
            wc3.z r1 = r1.mo11462yM()
            android.app.Activity r2 = r4.getContext()
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.mo93173f(r0, r2)
        L_0x0304:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64017t.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
