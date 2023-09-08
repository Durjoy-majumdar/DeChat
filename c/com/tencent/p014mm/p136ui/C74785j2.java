package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.pluginsdk.model.app.C72682b;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sandbox.updater.Updater;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import ke3.C88144b;
import lc3.C10485b;
import p148ei.C7660a;
import qe3.C89625d;
import s72.C77623a;
import s72.C90148b;
import s72.C90149c;

/* renamed from: com.tencent.mm.ui.j2 */
public final class C74785j2 {

    /* renamed from: a */
    public static boolean f219907a;

    /* renamed from: com.tencent.mm.ui.j2$a */
    public static class C6981a {

        /* renamed from: com.tencent.mm.ui.j2$a$a */
        public class C6982a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C7660a f24709d;

            /* renamed from: e */
            public final /* synthetic */ Context f24710e;

            public C6982a(C7660a aVar, Context context) {
                this.f24709d = aVar;
                this.f24710e = context;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                StringBuilder sb = new StringBuilder(this.f24709d.f26000a);
                sb.append("&wechat_real_lang=" + LocaleUtil.getApplicationLanguage());
                intent.putExtra("rawUrl", sb.toString());
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", true);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C88144b.m109791i(this.f24710e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0166, code lost:
            if (r8 != false) goto L_0x018d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m7247a(android.content.Context r7, int r8, int r9, java.lang.String r10, int r11) {
            /*
                r0 = 0
                r1 = 4
                r2 = 0
                r3 = 2
                r4 = 1
                if (r8 == r4) goto L_0x0088
                if (r8 == r3) goto L_0x0071
                r11 = 3
                if (r8 == r11) goto L_0x0070
                if (r8 == r1) goto L_0x000f
                goto L_0x006f
            L_0x000f:
                r5 = -100
                if (r9 == r5) goto L_0x001a
                r5 = -2023(0xfffffffffffff819, float:NaN)
                if (r9 != r5) goto L_0x0018
                goto L_0x001a
            L_0x0018:
                r8 = 0
                goto L_0x0030
            L_0x001a:
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r5[r2] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r5[r4] = r8
                java.lang.String r8 = "MicroMsg.AccountExpiredUtil"
                java.lang.String r6 = "process,errType %d,errCode %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r5)
                r8 = 1
            L_0x0030:
                if (r8 == 0) goto L_0x0033
                return r4
            L_0x0033:
                ei.a r8 = p148ei.C7660a.m7782a(r10)
                if (r8 == 0) goto L_0x006f
                java.lang.Object[] r10 = new java.lang.Object[r1]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r2] = r9
                int r9 = r8.f26002c
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r4] = r9
                java.lang.String r9 = r8.f26000a
                r10[r3] = r9
                java.lang.String r9 = r8.f26001b
                r10[r11] = r9
                java.lang.String r9 = "MicroMsg.MMErrorProcessor"
                java.lang.String r11 = "summertips errCode[%d], showType[%d], url[%s], desc[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
                java.lang.String r9 = r8.f26000a
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0067
                com.tencent.mm.ui.j2$a$a r9 = new com.tencent.mm.ui.j2$a$a
                r9.<init>(r8, r7)
                goto L_0x0068
            L_0x0067:
                r9 = r0
            L_0x0068:
                boolean r7 = r8.mo8792b(r7, r9, r0)
                if (r7 == 0) goto L_0x006f
                return r4
            L_0x006f:
                return r2
            L_0x0070:
                return r4
            L_0x0071:
                ob0.b0 r8 = eb0.C97625j3.m125815e()
                boolean r8 = r8.f256815j
                if (r8 == 0) goto L_0x0087
                r8 = 2131821610(0x7f11042a, float:1.9275968E38)
                java.lang.String r8 = r7.getString(r8)
                android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r4)
                r7.show()
            L_0x0087:
                return r4
            L_0x0088:
                r8 = r11 & 2
                if (r8 == 0) goto L_0x009f
                ob0.b0 r8 = eb0.C97625j3.m125815e()
                boolean r8 = r8.mo123466l()
                if (r8 == 0) goto L_0x009f
                ob0.b0 r7 = eb0.C97625j3.m125815e()
                r7.mo123465k()
                goto L_0x018d
            L_0x009f:
                r8 = r11 & 1
                if (r8 == 0) goto L_0x00b1
                boolean r8 = com.tencent.p014mm.network.C114786m0.m161568a(r7)
                if (r8 == 0) goto L_0x00b1
                boolean r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6692y0.m7002a(r7)
                if (r8 == 0) goto L_0x00b1
                goto L_0x018d
            L_0x00b1:
                r8 = r11 & 4
                if (r8 == 0) goto L_0x0169
                boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWap((android.content.Context) r7)
                if (r8 == 0) goto L_0x0169
                boolean r8 = eb0.C97625j3.m125811a()
                if (r8 != 0) goto L_0x00c4
            L_0x00c1:
                r8 = 0
                goto L_0x0166
            L_0x00c4:
                eb0.c r8 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r8 = r8.mo105906u()
                r10 = 61
                java.lang.Object r8 = r8.mo119684e(r10, r0)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsFalse(r8)
                if (r8 == 0) goto L_0x00db
                goto L_0x00c1
            L_0x00db:
                java.lang.String r8 = "show_wap_adviser"
                boolean r8 = com.tencent.p014mm.sdk.platformtools.MMEntryLock.lock(r8)
                if (r8 != 0) goto L_0x00e5
                goto L_0x00c1
            L_0x00e5:
                r8 = 2131496875(0x7f0c0fab, float:1.8617327E38)
                android.view.View r8 = android.view.View.inflate(r7, r8, r0)
                r10 = 2131310076(0x7f0935fc, float:1.8238454E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r11 = 2131833511(0x7f1132a7, float:1.9300106E38)
                r10.setText(r11)
                r10 = 2131310075(0x7f0935fb, float:1.8238452E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.CheckBox r10 = (android.widget.CheckBox) r10
                r11 = 2131834140(0x7f11351c, float:1.9301382E38)
                java.lang.String r11 = r7.getString(r11)
                r10.setText(r11)
                com.tencent.mm.ui.t1 r11 = new com.tencent.mm.ui.t1
                r11.<init>()
                r10.setOnCheckedChangeListener(r11)
                r10.setVisibility(r2)
                qo3.a r10 = new qo3.a
                r10.<init>()
                r11 = 2131821704(0x7f110488, float:1.9276159E38)
                android.content.res.Resources r0 = al3.C0086a.m38a(r7)
                java.lang.String r11 = r0.getString(r11)
                r10.f225644a = r11
                r10.f225627J = r8
                r8 = 2131834142(0x7f11351e, float:1.9301386E38)
                android.content.res.Resources r11 = al3.C0086a.m38a(r7)
                java.lang.String r8 = r11.getString(r8)
                r10.f225663t = r8
                com.tencent.mm.ui.u1 r8 = new com.tencent.mm.ui.u1
                r8.<init>(r7)
                r10.f225620C = r8
                r10.f225668y = r2
                r8 = 2131834141(0x7f11351d, float:1.9301384E38)
                android.content.res.Resources r11 = al3.C0086a.m38a(r7)
                java.lang.String r8 = r11.getString(r8)
                r10.f225664u = r8
                com.tencent.mm.ui.v1 r8 = new com.tencent.mm.ui.v1
                r8.<init>()
                r10.f225623F = r8
                qo3.g r8 = new qo3.g
                r11 = 2131887328(0x7f1204e0, float:1.940926E38)
                r8.<init>(r7, r11)
                r8.mo107525e(r10)
                r8.show()
                r8 = 1
            L_0x0166:
                if (r8 == 0) goto L_0x0169
                goto L_0x018d
            L_0x0169:
                ob0.b0 r8 = eb0.C97625j3.m125815e()
                boolean r8 = r8.f256815j
                if (r8 == 0) goto L_0x018d
                r8 = 2131830324(0x7f112634, float:1.9293642E38)
                java.lang.Object[] r10 = new java.lang.Object[r3]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                r10[r2] = r11
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r4] = r9
                java.lang.String r8 = r7.getString(r8, r10)
                android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r4)
                r7.show()
            L_0x018d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C74785j2.C6981a.m7247a(android.content.Context, int, int, java.lang.String, int):boolean");
        }
    }

    /* renamed from: a */
    public static boolean m89538a(Activity activity) {
        C72682b c = C72682b.m85000c();
        if (c != null) {
            c.mo100142b();
            Log.m105924i("MicroMsg.MMErrorProcessor", "alpha download in silence.");
            return true;
        }
        C90148b bVar = C90149c.f258834a;
        if (bVar == null) {
            return false;
        }
        ((SubCoreSandBox) bVar).getClass();
        int i = Updater.f249748o;
        MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", Util.nowSecond()).commit();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(34);
        C115669n.INSTANCE.idkeyStat(405, 50, 1, true);
        Log.m105924i("MicroMsg.Updater", "updater silence");
        Updater updater = new Updater(activity);
        updater.mo119325h();
        updater.f249753h = true;
        updater.mo119327l(2, false);
        return true;
    }

    /* renamed from: b */
    public static boolean m89539b(Activity activity, int i, int i2, Intent intent) {
        C90148b bVar;
        Activity activity2 = activity;
        int i3 = i2;
        Log.m105929w("MicroMsg.MMErrorProcessor", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(C89625d.f257841g), Integer.valueOf(ChannelUtil.channelId), Integer.valueOf(ChannelUtil.updateMode));
        if (i != 4) {
            return false;
        }
        if (i3 == -17) {
            long j = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1);
            Log.m105925i("MicroMsg.MMErrorProcessor", "updateRequired last:%d  now:%d", Long.valueOf(j), Long.valueOf(Util.secondsToNow(j)));
            if (j != -1 && Util.secondsToNow(j) < 86400) {
                return true;
            }
            if ((ChannelUtil.updateMode & 2) != 0) {
                Log.m105918d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
                return true;
            }
            Log.m105918d("MicroMsg.MMErrorProcessor", "not channel pack.");
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SilentDownloadApkAtWiFi");
            boolean z = ((((Integer) C97625j3.m125812b().mo105906u().mo119684e(7, 0)).intValue() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) && (Util.isNullOrNil(c) || Util.safeParseInt(c) == 0);
            if ((ChannelUtil.updateMode & 1) != 0) {
                Log.m105918d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
                z = false;
            } else {
                Log.m105918d("MicroMsg.MMErrorProcessor", "not channel pack.");
            }
            if (Util.safeParseInt(c) != 0) {
                Log.m105918d("MicroMsg.MMErrorProcessor", "dynaCfg close silence wifi download.");
            }
            Log.m105919d("MicroMsg.MMErrorProcessor", "summerupdate updateRequired silenceDownload[%b]", Boolean.valueOf(z));
            if (!z) {
                C90148b bVar2 = C90149c.f258834a;
                if (bVar2 == null) {
                    return false;
                }
                C77623a b = ((SubCoreSandBox) bVar2).mo118743b(activity, C0966R.string.k7d, new C6753b2(intent, activity), true);
                C115669n.INSTANCE.idkeyStat(405, 38, 1, true);
                ((Updater) b).mo119327l(2, false);
                return true;
            }
            C115669n.INSTANCE.idkeyStat(405, 40, 1, true);
            return m89538a(activity);
        } else if (i3 != -16 || (bVar = C90149c.f258834a) == null) {
            return false;
        } else {
            C77623a b2 = ((SubCoreSandBox) bVar).mo118743b(activity, C0966R.string.k7c, new C74782i2(activity), false);
            C115669n.INSTANCE.idkeyStat(405, 36, 1, true);
            ((Updater) b2).mo119327l(1, false);
            return true;
        }
    }
}
