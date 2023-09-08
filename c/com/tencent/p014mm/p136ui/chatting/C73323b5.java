package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelmsg.GetMessageFromWX;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import di3.C86312j;
import eb0.C97625j3;
import java.util.HashSet;
import java.util.Set;
import p763ym.C79138l;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.ui.chatting.b5 */
public final class C73323b5 implements C73744l3 {

    /* renamed from: d */
    public static MStorageEvent<C73744l3, Bundle> f215434d = new C73324a();

    /* renamed from: a */
    public MMFragment f215435a;

    /* renamed from: b */
    public C67391b f215436b;

    /* renamed from: c */
    public final Set<String> f215437c = new HashSet();

    /* renamed from: com.tencent.mm.ui.chatting.b5$a */
    public class C73324a extends MStorageEvent<C73744l3, Bundle> {
        public void processEvent(Object obj, Object obj2) {
            ((C73744l3) obj).mo102141a((Bundle) obj2);
        }
    }

    public C73323b5(C67391b bVar) {
        this.f215435a = bVar.f193286j;
        this.f215436b = bVar;
    }

    /* renamed from: d */
    public static void m86464d(Context context, Set<String> set) {
        String str;
        if (set == null || set.size() <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (String append : set) {
                sb.append(append);
                sb.append(";");
            }
            str = sb.toString();
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(MMApplicationContext.getTmpPreferencePath(), 0).edit();
        edit.putString("transactions_array_key", str);
        edit.apply();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0132, code lost:
        if (r14 != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0191, code lost:
        if (wd3.C78575u.m94944m(r13.f215435a.getController(), r14.title, r14.thumbData, r14.description, mo102142b(r2), false, "", new com.tencent.p014mm.p136ui.chatting.C73328c5(r13, r14, r2)) != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0286, code lost:
        if (wd3.C78575u.m94947p(r13.f215435a.getController(), r14.description, mo102142b(r2), false, new com.tencent.p014mm.p136ui.chatting.C73328c5(r13, r14, r2)) != null) goto L_0x0288;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102141a(android.os.Bundle r14) {
        /*
            r13 = this;
            ck3.b r0 = r13.f215436b
            java.lang.String r1 = "MicroMsg.WXAppMessageReceiver"
            if (r0 == 0) goto L_0x0291
            boolean r0 = r0.f193283g
            if (r0 != 0) goto L_0x000c
            goto L_0x0291
        L_0x000c:
            java.lang.String r0 = "_mmessage_content"
            java.lang.String r0 = r14.getString(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = "appid"
            java.lang.String r0 = r0.getQueryParameter(r2)
            com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Resp r2 = new com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Resp
            r2.<init>(r14)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r2.message
            java.util.Set<java.lang.String> r3 = r13.f215437c
            java.util.HashSet r3 = (java.util.HashSet) r3
            int r3 = r3.size()
            r4 = 0
            if (r3 != 0) goto L_0x0068
            com.tencent.mm.ui.MMFragment r3 = r13.f215435a
            android.app.Activity r3 = r3.getContext()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getTmpPreferencePath()
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r6, r4)
            r6 = 0
            java.lang.String r7 = "transactions_array_key"
            java.lang.String r3 = r3.getString(r7, r6)
            if (r3 == 0) goto L_0x0063
            int r6 = r3.length()
            if (r6 <= 0) goto L_0x0063
            java.lang.String r6 = ";"
            java.lang.String[] r3 = r3.split(r6)
            int r6 = r3.length
            r7 = 0
        L_0x0059:
            if (r7 >= r6) goto L_0x0063
            r8 = r3[r7]
            r5.add(r8)
            int r7 = r7 + 1
            goto L_0x0059
        L_0x0063:
            java.util.Set<java.lang.String> r3 = r13.f215437c
            r3.addAll(r5)
        L_0x0068:
            java.util.Set<java.lang.String> r3 = r13.f215437c
            java.lang.String r5 = r2.transaction
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x008b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "invalid resp, check transaction failed, transaction="
            r14.append(r0)
            java.lang.String r0 = r2.transaction
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return
        L_0x008b:
            java.util.Set<java.lang.String> r3 = r13.f215437c
            java.lang.String r2 = r2.transaction
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.remove(r2)
            com.tencent.mm.ui.MMFragment r2 = r13.f215435a
            android.app.Activity r2 = r2.getContext()
            java.util.Set<java.lang.String> r3 = r13.f215437c
            m86464d(r2, r3)
            com.tencent.mm.pluginsdk.model.app.j r2 = new com.tencent.mm.pluginsdk.model.app.j
            r2.<init>()
            r2.field_appId = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "handleResp, appId = "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            com.tencent.mm.pluginsdk.model.app.p r3 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
            java.lang.String[] r5 = new java.lang.String[r4]
            boolean r3 = r3.get(r2, (java.lang.String[]) r5)
            if (r3 != 0) goto L_0x00dc
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "unregistered app, ignore request, appId = "
            r14.append(r2)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return
        L_0x00dc:
            int r0 = r14.getType()
            switch(r0) {
                case 1: goto L_0x0271;
                case 2: goto L_0x0213;
                case 3: goto L_0x01d4;
                case 4: goto L_0x0195;
                case 5: goto L_0x0175;
                case 6: goto L_0x00e3;
                case 7: goto L_0x0136;
                case 8: goto L_0x00fa;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "unknown type = "
            r14.append(r2)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            goto L_0x0289
        L_0x00fa:
            byte[] r0 = r14.thumbData
            if (r0 == 0) goto L_0x0117
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0117
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r0 = r0.getController()
            byte[] r3 = r14.thumbData
            java.lang.String r5 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r6 = new com.tencent.mm.ui.chatting.c5
            r6.<init>(r13, r14, r2)
            qo3.g r14 = wd3.C78575u.m94950s(r0, r3, r5, r4, r6)
            goto L_0x0132
        L_0x0117:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r5 = r0.getController()
            r6 = 2131755119(0x7f10006f, float:1.9141108E38)
            java.lang.String r7 = r14.title
            java.lang.String r8 = r14.description
            java.lang.String r9 = r13.mo102142b(r2)
            r10 = 0
            com.tencent.mm.ui.chatting.c5 r11 = new com.tencent.mm.ui.chatting.c5
            r11.<init>(r13, r14, r2)
            qo3.g r14 = wd3.C78575u.m94952u(r5, r6, r7, r8, r9, r10, r11)
        L_0x0132:
            if (r14 == 0) goto L_0x0289
            goto L_0x0288
        L_0x0136:
            byte[] r0 = r14.thumbData
            if (r0 == 0) goto L_0x0159
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0159
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            byte[] r4 = r14.thumbData
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            r9 = 0
            com.tencent.mm.ui.chatting.c5 r10 = new com.tencent.mm.ui.chatting.c5
            r10.<init>(r13, r14, r2)
            wd3.C78575u.m94954w(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0288
        L_0x0159:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            r4 = 2131755119(0x7f10006f, float:1.9141108E38)
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            com.tencent.mm.ui.chatting.c5 r9 = new com.tencent.mm.ui.chatting.c5
            r9.<init>(r13, r14, r2)
            wd3.C78575u.m94952u(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0288
        L_0x0175:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r5 = r0.getController()
            java.lang.String r6 = r14.title
            byte[] r7 = r14.thumbData
            java.lang.String r8 = r14.description
            java.lang.String r9 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r12 = new com.tencent.mm.ui.chatting.c5
            r12.<init>(r13, r14, r2)
            r10 = 0
            java.lang.String r11 = ""
            qo3.g r14 = wd3.C78575u.m94944m(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 == 0) goto L_0x0289
            goto L_0x0288
        L_0x0195:
            byte[] r0 = r14.thumbData
            if (r0 == 0) goto L_0x01b8
            int r0 = r0.length
            if (r0 <= 0) goto L_0x01b8
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            byte[] r4 = r14.thumbData
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            r9 = 1
            com.tencent.mm.ui.chatting.c5 r10 = new com.tencent.mm.ui.chatting.c5
            r10.<init>(r13, r14, r2)
            wd3.C78575u.m94954w(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0288
        L_0x01b8:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            r4 = 2131755116(0x7f10006c, float:1.9141102E38)
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            com.tencent.mm.ui.chatting.c5 r9 = new com.tencent.mm.ui.chatting.c5
            r9.<init>(r13, r14, r2)
            wd3.C78575u.m94952u(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0288
        L_0x01d4:
            byte[] r0 = r14.thumbData
            if (r0 == 0) goto L_0x01f7
            int r0 = r0.length
            if (r0 <= 0) goto L_0x01f7
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            byte[] r4 = r14.thumbData
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            r9 = 2
            com.tencent.mm.ui.chatting.c5 r10 = new com.tencent.mm.ui.chatting.c5
            r10.<init>(r13, r14, r2)
            wd3.C78575u.m94954w(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0288
        L_0x01f7:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r0.getController()
            r4 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r5 = r14.title
            java.lang.String r6 = r14.description
            java.lang.String r7 = r13.mo102142b(r2)
            r8 = 0
            com.tencent.mm.ui.chatting.c5 r9 = new com.tencent.mm.ui.chatting.c5
            r9.<init>(r13, r14, r2)
            wd3.C78575u.m94952u(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0288
        L_0x0213:
            byte[] r0 = r14.thumbData
            if (r0 == 0) goto L_0x0230
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0230
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r0 = r0.getController()
            byte[] r3 = r14.thumbData
            java.lang.String r5 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r6 = new com.tencent.mm.ui.chatting.c5
            r6.<init>(r13, r14, r2)
            qo3.g r14 = wd3.C78575u.m94950s(r0, r3, r5, r4, r6)
            goto L_0x0269
        L_0x0230:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r14.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXImageObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r0
            byte[] r3 = r0.imageData
            if (r3 == 0) goto L_0x0251
            int r3 = r3.length
            if (r3 <= 0) goto L_0x0251
            com.tencent.mm.ui.MMFragment r3 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r3 = r3.getController()
            byte[] r0 = r0.imageData
            java.lang.String r5 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r6 = new com.tencent.mm.ui.chatting.c5
            r6.<init>(r13, r14, r2)
            qo3.g r14 = wd3.C78575u.m94950s(r3, r0, r5, r4, r6)
            goto L_0x0269
        L_0x0251:
            com.tencent.mm.ui.MMFragment r3 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r5 = r3.getController()
            java.lang.String r6 = r0.imagePath
            java.lang.String r7 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r10 = new com.tencent.mm.ui.chatting.c5
            r10.<init>(r13, r14, r2)
            r8 = 0
            java.lang.String r9 = ""
            qo3.g r14 = wd3.C78575u.m94948q(r5, r6, r7, r8, r9, r10)
        L_0x0269:
            if (r14 != 0) goto L_0x0288
            java.lang.String r14 = "showDialogItem3 fail, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            goto L_0x0289
        L_0x0271:
            com.tencent.mm.ui.MMFragment r0 = r13.f215435a
            com.tencent.mm.ui.MMActivityController r0 = r0.getController()
            java.lang.String r3 = r14.description
            java.lang.String r5 = r13.mo102142b(r2)
            com.tencent.mm.ui.chatting.c5 r6 = new com.tencent.mm.ui.chatting.c5
            r6.<init>(r13, r14, r2)
            qo3.g r14 = wd3.C78575u.m94947p(r0, r3, r5, r4, r6)
            if (r14 == 0) goto L_0x0289
        L_0x0288:
            r4 = 1
        L_0x0289:
            if (r4 != 0) goto L_0x0290
            java.lang.String r14 = "deal fail, result is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
        L_0x0290:
            return
        L_0x0291:
            java.lang.String r14 = "handleResp Chatting is a fragment but not foregound"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73323b5.mo102141a(android.os.Bundle):void");
    }

    /* renamed from: b */
    public final String mo102142b(C44561j jVar) {
        return this.f215435a.getString(C0966R.string.bje, ((C79138l) C86312j.m106911c(C79138l.class)).mo74011hv(this.f215435a.getContext(), jVar));
    }

    /* renamed from: c */
    public boolean mo102143c(String str, String str2) {
        Log.m105918d("MicroMsg.WXAppMessageReceiver", "request, pkg = " + str + ", openId = " + str2);
        GetMessageFromWX.Req req = new GetMessageFromWX.Req();
        req.username = this.f215436b.mo91577r();
        req.transaction = C90193h.m112878f(("" + Util.nowMilliSecond()).getBytes());
        req.openId = str2;
        req.lang = LocaleUtil.loadApplicationLanguage(this.f215435a.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this.f215435a.getContext());
        req.country = (String) C97625j3.m125812b().mo105906u().mo119684e(274436, (Object) null);
        Bundle bundle = new Bundle();
        req.toBundle(bundle);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        boolean send = MMessageActV2.send(this.f215435a.getContext(), args);
        ((HashSet) this.f215437c).add(req.transaction);
        m86464d(this.f215435a.getContext(), this.f215437c);
        return send;
    }
}
