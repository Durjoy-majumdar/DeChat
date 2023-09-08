package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import ji3.C9457a;
import js0.C9512b;
import ke3.C88144b;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import nj3.C76879j;
import p237sp.C13754y;
import p248ug.C52558c;
import qo3.C47883u;
import qo3.C77426q;
import rb0.C47969h;
import rb0.C47971i;
import rb0.C47993m0;
import rb0.C48009v0;
import te3.C51801w9;

/* renamed from: com.tencent.mm.ui.a0 */
public class C44697a0 {

    /* renamed from: a */
    public static final String f121216a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmr) + "/wework_admin/commdownload?from=conv%s");

    /* renamed from: com.tencent.mm.ui.a0$a */
    public class C44698a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f121217d;

        /* renamed from: e */
        public final /* synthetic */ String f121218e;

        /* renamed from: f */
        public final /* synthetic */ int f121219f;

        public C44698a(Context context, String str, int i) {
            this.f121217d = context;
            this.f121218e = str;
            this.f121219f = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C44697a0.m49441c(this.f121217d, this.f121218e, this.f121219f);
        }
    }

    /* renamed from: com.tencent.mm.ui.a0$b */
    public class C44699b implements C47883u {
        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.ui.a0$c */
    public class C44700c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Context f121220a;

        /* renamed from: b */
        public final /* synthetic */ String f121221b;

        /* renamed from: c */
        public final /* synthetic */ int f121222c;

        public C44700c(Context context, String str, int i) {
            this.f121220a = context;
            this.f121221b = str;
            this.f121222c = i;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C44697a0.m49441c(this.f121220a, this.f121221b, this.f121222c);
        }
    }

    /* renamed from: a */
    public static int m49439a(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C47969h jo = C48009v0.Ex0().mo72749jo(str);
        if ((jo == null || (jo.field_userFlag & 2) == 0) ? false : true) {
            return (jo.field_wwExposeTimes < jo.field_wwMaxExposeTimes || C72688j0.m85020f(context, "com.tencent.wework")) ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m49440b(Context context, String str, int i) {
        Intent intent;
        m49444f(str, 1, i);
        m49443e(str, 2, i);
        C47969h Yt = C48009v0.Ex0().mo72746Yt(str);
        String str2 = null;
        if (4 == i || 3 == i) {
            C48009v0.Ex0().getClass();
            if (C47971i.f128677g == null) {
                C47971i.f128677g = new C51801w9();
            }
            String str3 = C47971i.f128677g.f143931h;
            if (str3 == null || str3.length() <= 0 || !str3.toLowerCase().startsWith("http")) {
                str2 = str3;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", str3);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                return;
            }
        }
        if (C72688j0.m85020f(context, "com.tencent.wework")) {
            m49444f(str, 2, i);
            PackageInfo a = C9512b.m9207a(context, "com.tencent.wework");
            if (Util.isNullOrNil(a.versionName) || a.versionName.compareTo("1.3.3") < 0) {
                intent = context.getPackageManager().getLaunchIntentForPackage("com.tencent.wework");
            } else {
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if ((i == 4 || 3 == i) && str2 != null && str2.length() > 0) {
                    intent.setData(Uri.parse(str2));
                } else {
                    intent.setData(Uri.parse((i == 2 || i == 4 || i == 6) ? "wxwork://createconversation" : "wxwork://conversationlist"));
                }
            }
            C9457a.m9137a(new C44707b0(context, intent));
        } else if (Yt.field_use_preset_banner_tips) {
            C76879j.m92739j(context, C0966R.string.cbh, 0, C0966R.string.cbg, C0966R.string.f7926wf, new C44698a(context, str, i), (DialogInterface.OnClickListener) null);
        } else if (Yt.field_show_confirm) {
            C77426q qVar = new C77426q(context);
            qVar.mo107598j(context.getString(C0966R.string.f7926wf));
            qVar.mo107601m(C0966R.string.cbg);
            C47971i Ex0 = C48009v0.Ex0();
            C48009v0.Ex0();
            String Lo = Ex0.mo72743Lo(1);
            if (Lo == null) {
                qVar.mo107595g(context.getString(C0966R.string.cbh));
            } else {
                qVar.mo107595g(Lo);
            }
            qVar.mo107591c(new C44699b(), new C44700c(context, str, i));
            qVar.mo107603o();
        } else {
            m49441c(context, str, i);
        }
    }

    /* renamed from: c */
    public static void m49441c(Context context, String str, int i) {
        m49444f(str, 3, i);
        m49443e(str, 3, i);
        String TE = C48009v0.Fx0().mo72758TE(str);
        String str2 = f121216a;
        Object[] objArr = new Object[1];
        objArr[0] = Util.isNullOrNil(TE) ? "off" : "on";
        FileDownloadTaskInfo p = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63968p(String.format(str2, objArr));
        if (p != null && p.f12196f == 3 && C86013q1.m106450k(p.f12197g)) {
            C86013q1.m106447h(p.f12197g);
        }
        C10770c cVar = new C10770c(context);
        cVar.f32244b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
        ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = rb0.C48009v0.Ex0();
        r3 = r2.mo72746Yt(r3);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49442d(android.content.Context r2, java.lang.String r3) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "com.tencent.wework"
            boolean r2 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r2, r0)
            if (r2 != 0) goto L_0x0025
            rb0.i r2 = rb0.C48009v0.Ex0()
            rb0.h r3 = r2.mo72746Yt(r3)
            int r0 = r3.field_wwExposeTimes
            int r1 = r3.field_wwMaxExposeTimes
            if (r0 < r1) goto L_0x001e
            goto L_0x0025
        L_0x001e:
            int r0 = r0 + 1
            r3.field_wwExposeTimes = r0
            r2.mo72747bD(r3)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C44697a0.m49442d(android.content.Context, java.lang.String):void");
    }

    /* renamed from: e */
    public static void m49443e(String str, int i, int i2) {
        C52558c SE = C48009v0.Fx0().mo72757SE(str);
        if (i2 == 3) {
            i2 = 2;
        }
        if (i2 == 4) {
            i2 = 3;
        }
        if (SE.mo73502t2()) {
            str = SE.mo73498p2();
        }
        C47969h jo = C48009v0.Ex0().mo72749jo(str);
        C86709a0.m107529k().f251779b.mo123460f(new C47993m0(jo, 1, i, i2, 0, new Object()));
        boolean z = jo.field_chatOpen;
        boolean z2 = jo.field_show_confirm;
        C115669n.INSTANCE.mo160131h(15162, Long.valueOf(jo.field_wwCorpId), Long.valueOf(jo.field_wwUserVid), Integer.valueOf(z ? 1 : 0), Integer.valueOf(jo.field_wwUnreadCnt), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(jo.field_userType), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: f */
    public static int m49444f(String str, int i, int i2) {
        String str2 = str;
        C52558c SE = C48009v0.Fx0().mo72757SE(str2);
        C47969h jo = C48009v0.Ex0().mo72749jo(SE.mo73502t2() ? SE.mo73498p2() : str2);
        int i3 = jo != null ? jo.field_qyUin : 0;
        int i4 = jo != null ? jo.field_userUin : 0;
        long j = 0;
        long j2 = jo != null ? jo.field_wwCorpId : 0;
        if (jo != null) {
            j = jo.field_wwUserVid;
        }
        C115669n.INSTANCE.mo160131h(13656, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j));
        Log.m105919d("MicroMsg.EnterpriseHelper", "enterprise wework action report: %s,%s,%s,%s,%s,%s", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j));
        return i2;
    }
}
