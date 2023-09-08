package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import p003ay.C0235b;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.webview.model.j */
public class C6039j {

    /* renamed from: a */
    public static List<C10579k.C10580a> f22317a = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.webview.model.j$a */
    public class C6040a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C6043d f22318a;

        /* renamed from: b */
        public final /* synthetic */ String f22319b;

        /* renamed from: c */
        public final /* synthetic */ Context f22320c;

        /* renamed from: d */
        public final /* synthetic */ String f22321d;

        public C6040a(C6043d dVar, String str, Context context, String str2) {
            this.f22318a = dVar;
            this.f22319b = str;
            this.f22320c = context;
            this.f22321d = str2;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.WebviewShrotcutManager", "getContactCallBack, suc = %b", Boolean.valueOf(z));
            if (!z) {
                C6043d dVar = this.f22318a;
                if (dVar != null) {
                    dVar.mo7002a(this.f22319b, false);
                    return;
                }
                return;
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f22319b);
            if (z1Var == null || Util.isNullOrNil(z1Var.mo62909j3())) {
                C6043d dVar2 = this.f22318a;
                if (dVar2 != null) {
                    dVar2.mo7002a(this.f22319b, false);
                    return;
                }
                return;
            }
            C6039j.m5920b(this.f22320c, this.f22319b, this.f22321d, z1Var.mo62909j3(), this.f22318a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.j$b */
    public class C6041b implements C10579k.C10580a {

        /* renamed from: d */
        public final /* synthetic */ String f22322d;

        /* renamed from: e */
        public final /* synthetic */ Context f22323e;

        /* renamed from: f */
        public final /* synthetic */ C6043d f22324f;

        /* renamed from: g */
        public final /* synthetic */ String f22325g;

        /* renamed from: h */
        public final /* synthetic */ String f22326h;

        public C6041b(String str, Context context, C6043d dVar, String str2, String str3) {
            this.f22322d = str;
            this.f22323e = context;
            this.f22324f = dVar;
            this.f22325g = str2;
            this.f22326h = str3;
        }

        /* renamed from: X */
        public void mo1428X(String str) {
            if (this.f22322d.equals(str)) {
                Log.m105925i("MicroMsg.WebviewShrotcutManager", "notifyChanged avatar(%s).", str);
                ((LinkedList) C6039j.f22317a).remove(this);
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
                Bitmap f = C6039j.m5924f(this.f22323e, this.f22322d);
                if (f == null || f.isRecycled()) {
                    C6043d dVar = this.f22324f;
                    if (dVar != null) {
                        dVar.mo7002a(this.f22322d, false);
                        return;
                    }
                    return;
                }
                Intent c = C6039j.m5921c(this.f22323e, this.f22322d, this.f22325g, this.f22326h, f, true);
                if (c == null) {
                    Log.m105920e("MicroMsg.WebviewShrotcutManager", "intent is null");
                    C6043d dVar2 = this.f22324f;
                    if (dVar2 != null) {
                        dVar2.mo7002a(this.f22322d, false);
                        return;
                    }
                    return;
                }
                ((C0235b) C86312j.m106911c(C0235b.class)).rb0(this.f22323e, c);
                C6043d dVar3 = this.f22324f;
                if (dVar3 != null) {
                    dVar3.mo7002a(this.f22322d, true);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.j$c */
    public class C6042c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10579k.C10580a f22327d;

        /* renamed from: e */
        public final /* synthetic */ C6043d f22328e;

        /* renamed from: f */
        public final /* synthetic */ String f22329f;

        public C6042c(C10579k.C10580a aVar, C6043d dVar, String str) {
            this.f22327d = aVar;
            this.f22328e = dVar;
            this.f22329f = str;
        }

        public void run() {
            Log.m105924i("MicroMsg.WebviewShrotcutManager", "expired");
            if (((LinkedList) C6039j.f22317a).contains(this.f22327d)) {
                ((LinkedList) C6039j.f22317a).remove(this.f22327d);
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this.f22327d);
                C6043d dVar = this.f22328e;
                if (dVar != null) {
                    dVar.mo7002a(this.f22329f, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.j$d */
    public interface C6043d {
        /* renamed from: a */
        void mo7002a(String str, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.j$e */
    public static class C6044e implements MTimerHandler.CallBack {

        /* renamed from: d */
        public Runnable f22330d;

        public C6044e(Runnable runnable) {
            this.f22330d = runnable;
        }

        public boolean onTimerExpired() {
            Runnable runnable = this.f22330d;
            if (runnable == null) {
                return false;
            }
            runnable.run();
            return false;
        }
    }

    /* renamed from: a */
    public static void m5919a(Context context, String str, String str2, C6043d dVar) {
        if (context == null || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebviewShrotcutManager", "context or username is null");
            if (dVar != null) {
                dVar.mo7002a(str, false);
                return;
            }
            return;
        }
        Log.m105919d("MicroMsg.WebviewShrotcutManager", "addShortcut, username = %s", str);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.WebviewShrotcutManager", "acc not ready");
            if (dVar != null) {
                dVar.mo7002a(str, false);
                return;
            }
            return;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        String j3 = z1Var != null ? z1Var.mo62909j3() : "";
        if (Util.isNullOrNil(j3)) {
            Log.m105920e("MicroMsg.WebviewShrotcutManager", "displayname is nil, should pull from service");
            C31519v2.m39436a().mo55988e(str, "", new C6040a(dVar, str, context, str2));
            return;
        }
        m5920b(context, str, str2, j3, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5920b(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.tencent.p014mm.plugin.webview.model.C6039j.C6043d r17) {
        /*
            r6 = r14
            r7 = r17
            java.lang.Class<ln.g> r8 = p196ln.C76706g.class
            r9 = 1
            r10 = 0
            android.content.ContentResolver r0 = r13.getContentResolver()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = "content:///favorites?notify=true"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "title"
            java.lang.String r3 = "iconResource"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ Exception -> 0x0035 }
            java.lang.String r3 = "title=?"
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0035 }
            r4[r10] = r16     // Catch:{ Exception -> 0x0035 }
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0035 }
            if (r0 == 0) goto L_0x0035
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x0035 }
            if (r1 <= 0) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            r0.close()     // Catch:{ Exception -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            java.lang.String r11 = "MicroMsg.WebviewShrotcutManager"
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "shortcut has exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 == 0) goto L_0x0045
            r7.mo7002a(r14, r9)
        L_0x0045:
            return
        L_0x0046:
            com.tencent.mm.plugin.webview.model.j$b r12 = new com.tencent.mm.plugin.webview.model.j$b
            r0 = r12
            r1 = r14
            r2 = r13
            r3 = r17
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List<ln.k$a> r0 = f22317a
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r12)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ln.g r0 = (p196ln.C76706g) r0
            ln.k r0 = r0.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r0 = (com.tencent.p014mm.modelavatar.AvatarStorage) r0
            r0.mo93557b(r12)
            android.graphics.Bitmap r4 = m5924f(r13, r14)
            if (r4 == 0) goto L_0x00b5
            boolean r0 = r4.isRecycled()
            if (r0 == 0) goto L_0x0076
            goto L_0x00b5
        L_0x0076:
            java.util.List<ln.k$a> r0 = f22317a
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.remove(r12)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ln.g r0 = (p196ln.C76706g) r0
            ln.k r0 = r0.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r0 = (com.tencent.p014mm.modelavatar.AvatarStorage) r0
            r0.mo93567p(r12)
            r5 = 1
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            android.content.Intent r0 = m5921c(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            if (r7 == 0) goto L_0x00a2
            r7.mo7002a(r14, r10)
        L_0x00a2:
            return
        L_0x00a3:
            java.lang.Class<ay.b> r1 = p003ay.C0235b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ay.b r1 = (p003ay.C0235b) r1
            r2 = r13
            r1.rb0(r13, r0)
            if (r7 == 0) goto L_0x00b4
            r7.mo7002a(r14, r9)
        L_0x00b4:
            return
        L_0x00b5:
            java.lang.String r0 = "getAvatarBitmap fail, bmp is null, start timer."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.plugin.webview.model.j$e r1 = new com.tencent.mm.plugin.webview.model.j$e
            com.tencent.mm.plugin.webview.model.j$c r2 = new com.tencent.mm.plugin.webview.model.j$c
            r2.<init>(r12, r7, r14)
            r1.<init>(r2)
            r0.<init>(r1, r10)
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.startTimer(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C6039j.m5920b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.webview.model.j$d):void");
    }

    /* renamed from: c */
    public static Intent m5921c(Context context, String str, String str2, String str3, Bitmap bitmap, boolean z) {
        String str4;
        Log.m105925i("MicroMsg.WebviewShrotcutManager", "buildIntent, install = %b", Boolean.valueOf(z));
        if (bitmap != null || !z) {
            String e = m5923e(str);
            if (Util.isNullOrNil(e)) {
                return null;
            }
            Intent intent = new Intent(z ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
            intent.putExtra("android.intent.extra.shortcut.NAME", str3);
            intent.putExtra("duplicate", false);
            C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str);
            if (Lo != null) {
                str4 = C90193h.m112878f((str3 + Lo.mo93597f()).getBytes());
            } else {
                str4 = "";
            }
            Intent intent2 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
            intent2.putExtra("type", 2);
            intent2.putExtra("id", e);
            intent2.putExtra("ext_info", m5923e(str2));
            intent2.putExtra("ext_info_1", m5923e(str3));
            intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, m5922d(str2, "" + C86709a0.m107523b().mo121110g()));
            intent2.putExtra("digest", str4);
            intent2.setPackage(context.getPackageName());
            intent2.addFlags(67108864);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            return intent;
        }
        Log.m105920e("MicroMsg.WebviewShrotcutManager", "no bmp");
        return null;
    }

    /* renamed from: d */
    public static String m5922d(String str, String str2) {
        return C90193h.m112878f((C90193h.m112878f(str.getBytes()) + ((C0235b) C86312j.m106911c(C0235b.class)).mo259Ce(str2, str)).getBytes());
    }

    /* renamed from: e */
    public static String m5923e(String str) {
        Class cls = C0235b.class;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String Ce = ((C0235b) C86312j.m106911c(cls)).mo259Ce(str, "" + C86709a0.m107523b().mo121110g() + "_" + System.currentTimeMillis());
        if (Util.isNullOrNil(Ce)) {
            return null;
        }
        return "shortcut_" + ((C0235b) C86312j.m106911c(cls)).mo264fu(Ce.getBytes());
    }

    /* renamed from: f */
    public static Bitmap m5924f(Context context, String str) {
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        if (N50 == null || N50.isRecycled()) {
            return N50;
        }
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        return Bitmap.createScaledBitmap(N50, i, i, false);
    }
}
