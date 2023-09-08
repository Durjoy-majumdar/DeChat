package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.resource.C80530h;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kj2.C117407d;
import p761yd.C38993b;
import p761yd.C91441c;
import p982if.C87719c;
import r40.C89868a;
import rx3.C13601g;
import rx3.C36568h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.g */
public final class C85331g {

    /* renamed from: a */
    public static final C85331g f248653a = new C85331g();

    /* renamed from: b */
    public static boolean f248654b;

    /* renamed from: c */
    public static final AtomicBoolean f248655c = new AtomicBoolean(false);

    /* renamed from: d */
    public static long f248656d;

    /* renamed from: e */
    public static long f248657e = 367001600;

    /* renamed from: f */
    public static final long f248658f = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g */
    public static final C13601g f248659g = C36568h.m40985a(C85333b.f248665d);

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.g$a */
    public enum C85332a {
        DUMP_SUCCESS(0),
        DUMP_FAILED(2),
        EXCEPTION(3);
        

        /* renamed from: d */
        public final int f248664d;

        /* access modifiers changed from: public */
        C85332a(int i) {
            this.f248664d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.g$b */
    public static final class C85333b extends C87413o implements C32224a<SimpleDateFormat> {

        /* renamed from: d */
        public static final C85333b f248665d = new C85333b();

        public C85333b() {
            super(0);
        }

        public Object invoke() {
            return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
        }
    }

    /* renamed from: a */
    public static final String m105347a(C85331g gVar, long j) {
        gVar.getClass();
        double d = (double) 1024;
        String format = String.format("%.02f", Arrays.copyOf(new Object[]{Double.valueOf((((double) j) / d) / d)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: b */
    public static final void m105348b(C85331g gVar, int i, long j, String str) {
        gVar.getClass();
        Context context = MMApplicationContext.getContext();
        if (!Util.isFilePathSafeToBeCopySrc(str)) {
            Log.m105920e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, filePath is refer to private file.");
            return;
        }
        long l = C86013q1.m106451l(str);
        if (l == 0) {
            Log.m105920e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, file size is zero.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
        bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = null;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXFileObject(str));
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        wXMediaMessage.title = path2;
        wXMediaMessage.description = Util.getSizeKB(l);
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        Intent intent = new Intent(context, Class.forName("com.tencent.mm.ui.transmit.SelectConversationUI"));
        int i2 = SendAppMessageWrapperUI.f250361A;
        Intent intent2 = new Intent(context, SendAppMessageWrapperUI.class);
        intent2.putExtras(bundle);
        intent2.putExtra("animation_pop_in", true);
        intent.putExtra("Select_Conv_NextStep", intent2);
        ((C119157j) C119157j.f356862d).mo183895z(new C85334h(context, i, j, intent));
    }

    /* renamed from: c */
    public static final void m105349c(C85331g gVar, String str, C85332a aVar, long j, String str2) {
        gVar.getClass();
        C117407d.INSTANCE.mo160131h(18573, str, str2, Integer.valueOf(aVar.f248664d), 32, Long.valueOf(j), BuildInfo.BUILD_TAG, BuildInfo.REV);
    }

    /* renamed from: d */
    public static final boolean m105350d(long j, long j2) {
        int size;
        if (!BuildInfo.DEBUG && !WeChatEnvironment.hasDebugger() && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.IS_FLAVOR_RED && !C38993b.m41993c(C32735h.C32737c.clicfg_memory_watchdog_trigger_dump_hprof_enable, false)) {
            Log.m105924i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: NOT enabled.");
            return false;
        } else if (!C91441c.m114729c()) {
            Log.m105920e("MicroMsg.MemoryLimitPublisher", "skip hprof dump and publish: Matrix NOT installed");
            return false;
        } else {
            if (((C80530h) C91441c.m114730d().mo125377a(C80530h.class)) != null && C87719c.f253996d) {
                Log.m105924i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: Matrix is analyzing resources.");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f248656d < f248658f) {
                Log.m105924i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump for frequency limit");
                return false;
            }
            if (j <= f248657e) {
                if (WeChatEnvironment.isMonkeyEnv() && BuildInfo.IS_FLAVOR_RED) {
                    if (j2 <= 1048576000) {
                        WeakHashMap<Activity, Integer> weakHashMap = C89868a.f258305d;
                        synchronized (weakHashMap) {
                            size = weakHashMap.size();
                        }
                        if (size > 30) {
                        }
                    }
                }
                return false;
            }
            if (f248655c.compareAndSet(false, true)) {
                f248656d = currentTimeMillis;
                f248657e += 52428800;
                ((C119157j) C119157j.f356862d).mo183875f(new C85335i(j));
                return true;
            }
            return false;
        }
    }
}
