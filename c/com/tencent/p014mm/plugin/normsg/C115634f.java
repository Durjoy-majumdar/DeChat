package com.tencent.p014mm.plugin.normsg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import at3.C113071d;
import at3.C113072e;
import at3.C113074f;
import com.tencent.p014mm.autogen.events.DecodeQRCodeInImageSyncEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.lib.riskscanner.RiskScannerReqBufferService;
import com.tencent.p014mm.normsg.C114823a;
import com.tencent.p014mm.normsg.C114829e;
import com.tencent.p014mm.normsgcontent.C114835a;
import com.tencent.p014mm.normsgcontent.C114836b;
import com.tencent.p014mm.normsgext.C114837a;
import com.tencent.p014mm.normsgext.C114838b;
import com.tencent.p014mm.normsgext.QValue;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.util.HotpotService;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19934c;
import ct3.C86135b;
import ct3.C86139c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import ft3.C116896h;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import jm2.C117361f;
import m20.C61433b;
import p156gj.C87203t;
import p200lx.C99712h0;
import p200lx.C99716u;
import pe3.C89349b;
import q20.C89449a;
import tc2.C118416d;
import tc2.C64217b;
import tc2.C64218c;
import te3.C48784az3;
import te3.C64271bz3;
import te3.C64302cz3;
import te3.C64843xy3;
import ts3.C118507b;
import ts3.C118510d;
import us3.C118609c;
import uv3.C118613c;
import uv3.C118617g;
import uv3.C118625m;
import vc2.C118669a;
import wc2.C118754a;
import xc2.C118871b;
import yc2.C118957a;
import yc2.C118980l;
import yc2.C91436f;
import zs3.C119124c;
import zs3.C119127d;
import zs3.C119132e;

@C86522b
/* renamed from: com.tencent.mm.plugin.normsg.f */
public class C115634f extends C86301e implements C118416d, C114823a, C114837a, C114835a {

    /* renamed from: f */
    public static final MMHandler f346870f = new MMHandler("NormsgWorker");

    /* renamed from: d */
    public final String[] f346871d = {null};

    /* renamed from: e */
    public final Map<String, String> f346872e = new ConcurrentHashMap();

    @C89449a
    /* renamed from: com.tencent.mm.plugin.normsg.f$g */
    public static class C4927g implements C80916r<IPCVoid, IPCString> {
        private C4927g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x0038;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                com.tencent.mm.ipcinvoker.type.IPCVoid r6 = (com.tencent.p014mm.ipcinvoker.type.IPCVoid) r6
                java.lang.String r6 = "MicroMsg.NormsgSourceImpl"
                java.lang.String r0 = ""
                r1 = 1
                java.lang.String r2 = "run wkrpt"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)     // Catch:{ all -> 0x0024 }
                java.lang.Class<fp.e> r2 = p523fp.C32147e.class
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0024 }
                fp.e r2 = (p523fp.C32147e) r2     // Catch:{ all -> 0x0024 }
                r3 = 145(0x91, float:2.03E-43)
                java.lang.String r2 = r2.mo58507AD(r3, r1)     // Catch:{ all -> 0x0024 }
                boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0022 }
                if (r6 == 0) goto L_0x0037
                goto L_0x0038
            L_0x0022:
                r0 = move-exception
                goto L_0x0028
            L_0x0024:
                r2 = move-exception
                r4 = r2
                r2 = r0
                r0 = r4
            L_0x0028:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                java.lang.String r0 = r0.toString()
                r1[r3] = r0
                java.lang.String r0 = "run wkrpt failed:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            L_0x0037:
                r0 = r2
            L_0x0038:
                com.tencent.mm.ipcinvoker.type.IPCString r6 = new com.tencent.mm.ipcinvoker.type.IPCString
                r6.<init>(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.normsg.C115634f.C4927g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.normsg.f$f */
    public static class C30322f implements C80883e<Bundle, Bundle> {
        private C30322f() {
        }

        public void invoke(Object obj, C1256g gVar) {
            try {
                C115634f.f346870f.post(new C30323h(this, (Bundle) obj));
            } catch (Throwable th) {
                Log.m105925i("MicroMsg.NormsgSourceImpl", "run wkat failed:%s", th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.f$e */
    public class C57151e extends ArrayList<String> {
        public C57151e(C115634f fVar, C64217b bVar) {
            add(TextUtils.isEmpty(bVar.f181997a) ? "" : bVar.f181997a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.f$a */
    public class C115635a implements C118507b {

        /* renamed from: a */
        public final /* synthetic */ ByteArrayOutputStream f346873a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f346874b;

        public C115635a(C115634f fVar, ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch) {
            this.f346873a = byteArrayOutputStream;
            this.f346874b = countDownLatch;
        }

        /* renamed from: a */
        public boolean mo175843a(int i, byte[] bArr) {
            boolean z = false;
            if (i == 0) {
                if (bArr != null && bArr.length > 0) {
                    this.f346873a.write(bArr, 0, bArr.length);
                }
                z = true;
            }
            this.f346874b.countDown();
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.f$b */
    public class C115636b extends BroadcastReceiver {
        public C115636b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.m105924i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g1.");
            } else if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                synchronized (C115634f.this.f346871d) {
                    Log.m105924i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, invalidating sth.");
                    C115634f fVar = C115634f.this;
                    fVar.f346871d[0] = null;
                    ((ConcurrentHashMap) fVar.f346872e).clear();
                }
                if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && MMApplicationContext.isMainProcess()) {
                    C117361f.INSTANCE.If0(intent);
                }
            } else {
                Log.m105924i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g2.");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.f$c */
    public class C115637c implements C118613c {
        public C115637c(C115634f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.f$d */
    public class C115638d implements C80905h<Bundle> {
        public C115638d(C115634f fVar) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
        }

        /* renamed from: b */
        public void mo56805b() {
        }

        /* renamed from: c */
        public void mo56806c(Exception exc) {
            Log.m105925i("MicroMsg.NormsgSourceImpl", "wkat rpc failed %s", exc.toString());
        }
    }

    /* renamed from: A7 */
    public boolean mo175783A7() {
        boolean k = C114829e.C114830a.m161743k();
        Log.m105925i("MicroMsg.NormsgSourceImpl", "[tomys-edt] charlie brown: %s", Boolean.valueOf(k));
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[Catch:{ all -> 0x007e }, RETURN] */
    /* renamed from: Ak */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175784Ak(tc2.C118417e r5) {
        /*
            r4 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0019
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0009
            goto L_0x0019
        L_0x0009:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x007e }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x007e }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_enable_turing_owner     // Catch:{ all -> 0x007e }
            r2 = 0
            boolean r0 = r0.mo58784wf(r1, r2)     // Catch:{ all -> 0x007e }
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            uv3.l$b r0 = new uv3.l$b     // Catch:{ all -> 0x007e }
            r0.<init>()     // Catch:{ all -> 0x007e }
            uv3.h r1 = new uv3.h     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            r0.f354969a = r1     // Catch:{ all -> 0x007e }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x007e }
            uv3.h r2 = r0.f354969a     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0076
            uv3.l r2 = new uv3.l     // Catch:{ all -> 0x007e }
            r3 = 0
            r2.<init>(r0, r3)     // Catch:{ all -> 0x007e }
            uv3.j r0 = uv3.C118625m.f354970a     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0051
            java.lang.Class<uv3.m> r0 = uv3.C118625m.class
            monitor-enter(r0)     // Catch:{ all -> 0x007e }
            uv3.j r3 = uv3.C118625m.f354970a     // Catch:{ all -> 0x004e }
            if (r3 != 0) goto L_0x004c
            uv3.j r3 = new uv3.j     // Catch:{ all -> 0x004e }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x004e }
            r3.mo165610d()     // Catch:{ all -> 0x004e }
            uv3.C118625m.f354970a = r3     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r5     // Catch:{ all -> 0x007e }
        L_0x0051:
            com.tencent.mm.plugin.normsg.f$c r0 = new com.tencent.mm.plugin.normsg.f$c     // Catch:{ all -> 0x007e }
            r0.<init>(r4)     // Catch:{ all -> 0x007e }
            uv3.f r1 = new uv3.f     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r2 = p156gj.C87203t.m108266b()     // Catch:{ all -> 0x007e }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)     // Catch:{ all -> 0x007e }
            r1.f354953a = r2     // Catch:{ all -> 0x007e }
            r2 = 4
            r1.f354954b = r2     // Catch:{ all -> 0x007e }
            uv3.a r2 = uv3.C118611a.DATA_USAGE_TYPE_IDENTIFY_TRAIN     // Catch:{ all -> 0x007e }
            r1.f354955c = r2     // Catch:{ all -> 0x007e }
            uv3.b r2 = uv3.C118612b.GESTURETYPE_SINGLE     // Catch:{ all -> 0x007e }
            r1.f354956d = r2     // Catch:{ all -> 0x007e }
            r1.f354960h = r5     // Catch:{ all -> 0x007e }
            uv3.C118625m.m167305a(r1, r0)     // Catch:{ all -> 0x007e }
            goto L_0x0086
        L_0x0076:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "You're trying to build a TuringSMIJob with no TuringShieldConfigs, this is not allowed."
            r5.<init>(r0)     // Catch:{ all -> 0x007e }
            throw r5     // Catch:{ all -> 0x007e }
        L_0x007e:
            java.lang.String r5 = "MicroMsg.NormsgSourceImpl"
            java.lang.String r0 = "start turing owner failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.normsg.C115634f.mo175784Ak(tc2.e):void");
    }

    public boolean An0(String str) {
        return C114829e.C114832c.m161763d(str);
    }

    /* renamed from: As */
    public void mo175786As(View view, Class<? extends IEvent> cls) {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        Map<View, Class<? extends IEvent>> map = C91436f.f262159a;
        if (view == null) {
            throw new IllegalArgumentException("target is null.");
        } else if (cls != null) {
            Object a = C118980l.m167743a(view, "getListenerInfo", (Class<?>[]) null, new Object[0]);
            if (a != null) {
                onTouchListener = (View.OnTouchListener) C118980l.m167747e(a, "mOnTouchListener");
                onClickListener = (View.OnClickListener) C118980l.m167747e(a, "mOnClickListener");
            } else {
                onClickListener = null;
                onTouchListener = null;
            }
            if (onTouchListener == null) {
                view.setOnTouchListener(new C91436f.C91438b((View.OnTouchListener) null));
            } else if (!(onTouchListener instanceof C91436f.C91438b)) {
                view.setOnTouchListener(new C91436f.C91438b(onTouchListener));
            }
            if (onClickListener == null) {
                view.setOnClickListener(new C91436f.C91437a((View.OnClickListener) null));
            } else if (!(onClickListener instanceof C91436f.C91437a)) {
                view.setOnClickListener(new C91436f.C91437a(onClickListener));
            }
            Map<View, Class<? extends IEvent>> map2 = C91436f.f262159a;
            synchronized (map2) {
                ((WeakHashMap) map2).put(view, cls);
            }
        } else {
            throw new IllegalArgumentException("reportEventClass is null.");
        }
    }

    public String Ax0() {
        String str;
        byte[] byteArray;
        synchronized (this.f346871d) {
            if (this.f346871d[0] == null) {
                Log.m105924i("MicroMsg.NormsgSourceImpl", "[+] Explained by src rf.");
                Context context = MMApplicationContext.getContext();
                Bundle bundle = null;
                try {
                    int i = RiskScannerReqBufferService.f343955f;
                    bundle = HotpotService.m106335a(context, RiskScannerReqBufferService.class, 1, (Bundle) null);
                } catch (HotpotService.C85991e e) {
                    Log.printErrStackTrace("MicroMsg.RiskScannerReqBufferService", e.f250449d, "Fail to prepare req buffer.", new Object[0]);
                } catch (HotpotService.C85990d e2) {
                    Log.printErrStackTrace("MicroMsg.RiskScannerReqBufferService", e2, "Fail to prepare req buffer.", new Object[0]);
                } catch (Throwable unused) {
                }
                if (bundle != null) {
                    if (bundle.getInt("errCode", -100) == 0 && (byteArray = bundle.getByteArray("reqBufferBase64")) != null) {
                        this.f346871d[0] = Base64.encodeToString(byteArray, 2);
                    }
                }
            }
            str = this.f346871d[0];
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public void B10(int i, int i2, int i3) {
        Context context = MMApplicationContext.getContext();
        if (i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("action invalid: " + i2);
        }
        C119124c.C119126b bVar = new C119124c.C119126b(context, i, i2, (C119124c.C119125a) null);
        long j = (long) (i3 * 1000);
        long j2 = C113071d.f338459d;
        if (j < j2) {
            bVar.f356771c = j2;
        } else {
            long j3 = C113071d.f338456a * 12;
            if (j > j3) {
                bVar.f356771c = j3;
            }
        }
        bVar.f356771c = j;
        C119124c cVar = new C119124c(bVar, (C119124c.C119125a) null);
        C119127d b = C119127d.f356773h.mo180860b();
        synchronized (b) {
            Context context2 = cVar.f356768d;
            if (context2 != null) {
                C113074f b2 = C113074f.f338470c.mo180860b();
                if (!b2.f338472b) {
                    b2.f338471a = context2;
                    b2.f338472b = true;
                }
                if (b.f356774a) {
                    b.mo183835b();
                }
                b.f356778e = cVar;
                b.f356774a = true;
                if (b.f356775b == null) {
                    b.f356775b = new C113072e(context2);
                }
                b.mo183834a();
                b.f356776c.postDelayed(b.f356779f, 0);
            }
        }
    }

    public final ArrayList<C64271bz3> Bx0(ArrayList<String> arrayList) {
        Class cls = C61433b.class;
        ArrayList<C64271bz3> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(new C64271bz3());
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            try {
                C64271bz3 bz32 = arrayList2.get(i2);
                bz32.f182340d = C86013q1.m106456q(arrayList.get(i2));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(arrayList.get(i2), options);
                bz32.f182341e = Math.max(options.outHeight, 0);
                bz32.f182342f = Math.max(options.outWidth, 0);
                bz32.f182345i = (int) (System.currentTimeMillis() / 1000);
                i2++;
            } catch (Throwable th) {
                Log.m105925i("MicroMsg.NormsgSourceImpl", "get image basic info 1 failed: %s", th.toString());
            }
        }
        try {
            List<C99712h0.C99715c> d = ((C19934c) ((C99716u) C86312j.m106911c(C99716u.class)).wa0()).mo27316d(MMApplicationContext.getContext().getApplicationContext(), arrayList);
            if (d != null) {
                ArrayList arrayList3 = (ArrayList) d;
                if (arrayList3.size() == arrayList.size()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        LinkedList<String> linkedList = new LinkedList<>();
                        if (((C99712h0.C99715c) arrayList3.get(i3)).f292251a != null) {
                            for (C19931a.C19932a aVar : ((C99712h0.C99715c) arrayList3.get(i3)).f292251a) {
                                linkedList.add(aVar.f56829f);
                            }
                        }
                        arrayList2.get(i3).f182343g = linkedList;
                    }
                }
            }
        } catch (Throwable th4) {
            Log.m105925i("MicroMsg.NormsgSourceImpl", "get image info 2 failed: %s", th4.toString());
        }
        try {
            ArrayList<String> G9 = ((C61433b) C86312j.m106911c(cls)).mo85963G9(arrayList);
            if (G9.size() == arrayList.size()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    arrayList2.get(i4).f182344h = G9.get(i4);
                }
            }
        } catch (Throwable th5) {
            Log.m105925i("MicroMsg.NormsgSourceImpl", "get image info 3 failed: %s", th5.toString());
        }
        try {
            ArrayList<String> ki02 = ((C61433b) C86312j.m106911c(cls)).ki0(arrayList);
            if (ki02.size() == arrayList.size()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    arrayList2.get(i5).f182346j = ki02.get(i5);
                }
            }
        } catch (Throwable th6) {
            Log.m105925i("MicroMsg.NormsgSourceImpl", "get image info 4 failed: %s", th6.toString());
        }
        return arrayList2;
    }

    public String Cx0() {
        try {
            IPCString iPCString = (IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C4927g.class);
            return !TextUtils.isEmpty(iPCString.toString()) ? iPCString.toString() : "";
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NormsgSourceImpl", "get wkrp error: %s", e.toString());
            return "";
        }
    }

    /* renamed from: DM */
    public byte[] mo175791DM(int i) {
        return C114829e.C114833d.m161772b(i, C86709a0.m107522a() ? 15 : 0);
    }

    public boolean Dx0(String str, byte[] bArr) {
        StringBuilder reverse = new StringBuilder("gsmron").reverse();
        reverse.append(new StringBuilder("atadtsurt_").reverse().toString());
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(reverse.toString());
        if (!mmkv.encode(str, bArr)) {
            return false;
        }
        return mmkv.commit();
    }

    public void Ex0(String str) {
        StringBuilder reverse = new StringBuilder("gsmron").reverse();
        reverse.append(new StringBuilder("atadtsurt_").reverse().toString());
        MultiProcessMMKV.getMMKV(reverse.toString()).remove(str).commit();
    }

    /* renamed from: F6 */
    public boolean mo175794F6(int i, byte[] bArr, int i2, int i3, PInt pInt, PInt pInt2, PByteArray pByteArray) {
        PInt pInt3 = pInt;
        PInt pInt4 = pInt2;
        PByteArray pByteArray2 = pByteArray;
        QValue qValue = new QValue();
        QValue qValue2 = new QValue();
        QValue qValue3 = new QValue();
        boolean a = C114838b.C81048a.m99020a(i, bArr, i2, i3, qValue, qValue2, qValue3);
        if (a) {
            pInt3.value = ((Integer) qValue.mo174513b(0)).intValue();
            pInt4.value = ((Integer) qValue2.mo174513b(0)).intValue();
            pByteArray2.value = (byte[]) qValue3.mo174512a();
        } else {
            pInt3.value = 0;
            pInt4.value = 0;
            pByteArray2.value = null;
        }
        return a;
    }

    /* renamed from: FF */
    public String mo175795FF() {
        return "";
    }

    public String Gt0() {
        return C114829e.C114833d.m161775e();
    }

    /* renamed from: Hx */
    public String mo175797Hx() {
        return C114829e.C114833d.m161774d();
    }

    public byte[] Qc0(C64217b bVar, C64218c cVar) {
        try {
            C64843xy3 xy32 = new C64843xy3();
            String str = "";
            if (bVar != null) {
                ArrayList<C64271bz3> Bx0 = Bx0(new C57151e(this, bVar));
                if (Bx0.size() == 1) {
                    C64271bz3 bz32 = Bx0.get(0);
                    bz32.f182347n = TextUtils.isEmpty(bVar.f181998b) ? str : bVar.f181998b;
                    xy32.f186419f = bz32;
                }
            }
            if (cVar != null) {
                C64302cz3 cz32 = new C64302cz3();
                cz32.f182616d = cVar.f182000b;
                long j = 0;
                C86001b0 n = C86013q1.m106453n(TextUtils.isEmpty(cVar.f181999a) ? str : cVar.f181999a);
                if (n != null) {
                    j = n.f250473c;
                }
                cz32.f182617e = (int) j;
                cz32.f182618f = C86013q1.m106456q(TextUtils.isEmpty(cVar.f181999a) ? str : cVar.f181999a);
                if (!TextUtils.isEmpty(cVar.f182001c)) {
                    str = cVar.f182001c;
                }
                cz32.f182619g = str;
                cz32.f182620h = cVar.f182002d;
                xy32.f186421h = cz32;
            }
            return xy32.toByteArray();
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.NormsgSourceImpl", "gscmf failed: %s", th.toString());
            return new byte[0];
        }
    }

    /* renamed from: SP */
    public void mo175799SP(String str, int i) {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sensor_max_sampling_count, 200);
        boolean z = false;
        if (Qe <= 0) {
            Qe = 0;
        }
        C118871b bVar = new C118871b(str, Qe);
        if (Qe > 0) {
            z = true;
        }
        if (z) {
            C118754a b = C118754a.f355286d.mo180860b();
            b.mo183481d(1, i, bVar, 0);
            b.mo183481d(3, 0, bVar.f355595c, (long) bVar.f355594b);
        }
    }

    public boolean Tl0() {
        return C114829e.C114833d.m161776f();
    }

    public void Ud0(String str, String str2, String str3) {
        C114829e.C114832c.m161767h(str, str2, str3);
    }

    /* renamed from: VZ */
    public void mo175802VZ(String str) {
        C114829e.C114832c.m161765f(str);
    }

    /* renamed from: Va */
    public byte[] mo175803Va(int i) {
        return C114829e.C114830a.m161736d(i);
    }

    /* renamed from: WN */
    public String[] mo175804WN(String str) {
        DecodeQRCodeInImageSyncEvent decodeQRCodeInImageSyncEvent = new DecodeQRCodeInImageSyncEvent();
        decodeQRCodeInImageSyncEvent.f264662d.f264664a = str;
        decodeQRCodeInImageSyncEvent.publish();
        DecodeQRCodeInImageSyncEvent.C92470b bVar = decodeQRCodeInImageSyncEvent.f264663e;
        String[] strArr = bVar.f264665a;
        if (strArr != null) {
            return strArr;
        }
        if (bVar.f264666b) {
            return new String[]{"<timeout>"};
        }
        return null;
    }

    public boolean Yl0(byte[] bArr, int i, int i2) {
        return C114829e.C114833d.m161777g(bArr, i, i2);
    }

    public boolean Yw0() {
        boolean l = C114829e.C114830a.m161744l();
        Log.m105925i("MicroMsg.NormsgSourceImpl", "[tomys-edt] alpha tom: %s", Boolean.valueOf(l));
        return l;
    }

    public String Z10(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            i++;
            sb.append((char) ((str.charAt(i) ^ 65447) ^ ((byte) (~(i ^ length)))));
        }
        return sb.toString();
    }

    /* renamed from: ZU */
    public boolean mo175808ZU(int i, byte[] bArr, int i2, int i3, PByteArray pByteArray) {
        QValue qValue = new QValue();
        QValue qValue2 = new QValue();
        QValue qValue3 = new QValue();
        boolean a = C114838b.C81048a.m99020a(i, bArr, i2, i3, qValue, qValue2, qValue3);
        if (a) {
            C48784az3 az32 = new C48784az3();
            az32.f130852d = ((Integer) qValue.mo174513b(0)).intValue();
            az32.f130853e = ((Integer) qValue2.mo174513b(0)).intValue();
            az32.f130854f = C89349b.m111674a((byte[]) qValue3.mo174512a());
            try {
                pByteArray.value = az32.toByteArray();
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.NormsgSourceImpl", "[-] pb deseralize failed");
            }
        }
        return a;
    }

    /* renamed from: ZX */
    public boolean mo175809ZX() {
        return C114829e.C114830a.m161745m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v4, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x05e9 A[Catch:{ Exception -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05ed A[Catch:{ Exception -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0329 A[Catch:{ all -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x042d A[Catch:{ all -> 0x0436 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x048d  */
    /* renamed from: Zb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo175810Zb(int r36) {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r0 = "app not installed, packageName = "
            boolean r2 = f40.C86709a0.m107522a()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x001d
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r4 = 79
            java.lang.Object r2 = r2.mo119684e(r4, r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.normsg.e r5 = new com.tencent.mm.plugin.normsg.e
            r5.<init>(r1)
            r6 = 5000(0x1388, double:2.4703E-320)
            r4.postToWorkerDelayed(r5, r6)
            boolean r4 = f40.C86709a0.m107522a()
            java.lang.String r5 = "0"
            if (r4 == 0) goto L_0x0045
            f40.o r4 = f40.C86709a0.m107535s()
            zh3.f r4 = r4.f251811i
            zh3.a r4 = r4.f262817d
            boolean r4 = r4.f262806d
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = "1"
            goto L_0x0046
        L_0x0043:
            r4 = r5
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            java.lang.String r8 = r7.getFormattedWiFiSsid()
            java.lang.String r7 = r7.getFormattedWiFiBssid()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r10 = "MicroMsg.NormsgSourceImpl"
            r12 = 0
            if (r9 != 0) goto L_0x0067
            java.lang.String r9 = "Failed checking mock location: application context not initialized."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r9)
            goto L_0x0076
        L_0x0067:
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.lang.String r13 = "mock_location"
            int r9 = android.provider.Settings.Secure.getInt(r9, r13, r12)
            if (r9 == 0) goto L_0x0076
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            boolean r13 = com.tencent.p014mm.normsg.C114829e.C114830a.m161746n()
            boolean r14 = android.os.Debug.isDebuggerConnected()
            boolean r15 = yc2.C79068j.f232191d
            if (r15 != 0) goto L_0x008e
            boolean r15 = yc2.C79068j.f232192e
            if (r15 != 0) goto L_0x008e
            boolean r15 = yc2.C79068j.f232193f
            if (r15 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r15 = 0
            goto L_0x008f
        L_0x008e:
            r15 = 1
        L_0x008f:
            boolean r11 = yc2.C118979i.f356402a
            boolean r12 = yc2.C38990k.f105043a
            r18 = r5
            byte[] r5 = com.tencent.p014mm.normsg.C114829e.C114830a.m161741i()
            if (r5 == 0) goto L_0x00a6
            r19 = r12
            int r12 = r5.length
            r20 = r11
            r11 = 0
            java.lang.String r5 = yc2.C118978g.m167741a(r5, r11, r12)
            goto L_0x00ac
        L_0x00a6:
            r20 = r11
            r19 = r12
            r11 = 0
            r5 = r3
        L_0x00ac:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r21 = 0
            r22 = r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c1 }
            android.content.pm.PackageInfo r4 = r12.getPackageInfo(r4, r11)     // Catch:{ NameNotFoundException -> 0x00c1 }
            goto L_0x00d9
        L_0x00c1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r4)
            r4 = r21
        L_0x00d9:
            if (r4 == 0) goto L_0x00df
            int r4 = r4.versionCode
            r11 = r4
            goto L_0x00e0
        L_0x00df:
            r11 = 0
        L_0x00e0:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f4 }
            r23 = r15
            r15 = 0
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r12, r15)     // Catch:{ NameNotFoundException -> 0x00f6 }
            goto L_0x010e
        L_0x00f4:
            r23 = r15
        L_0x00f6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r0 = r21
        L_0x010e:
            if (r0 == 0) goto L_0x01cc
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            java.lang.String r0 = r0.sourceDir
            r12 = 2
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x016c }
            r15.<init>(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = p1054vg.C90796c.m113866b(r15)     // Catch:{ Exception -> 0x016c }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x016c }
            if (r15 == 0) goto L_0x0164
            kj2.d r15 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x016c }
            r25 = 322(0x142, double:1.59E-321)
            r27 = 13
            r29 = 1
            r31 = 1
            r24 = r15
            r24.idkeyStat(r25, r27, r29, r31)     // Catch:{ Exception -> 0x016c }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x016c }
            r25 = 4013(0xfad, float:5.623E-42)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x016c }
            r17 = 0
            r4[r17] = r25     // Catch:{ Exception -> 0x016c }
            java.lang.String r12 = "%s|%s"
            r27 = r0
            r26 = r14
            r14 = 2
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0162 }
            r0[r17] = r14     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r36)     // Catch:{ Exception -> 0x0162 }
            r16 = 1
            r0[r16] = r14     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = java.lang.String.format(r12, r0)     // Catch:{ Exception -> 0x0162 }
            r4[r16] = r0     // Catch:{ Exception -> 0x0162 }
            r12 = 11098(0x2b5a, float:1.5552E-41)
            r15.mo160131h(r12, r4)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0168
        L_0x0162:
            r0 = move-exception
            goto L_0x016f
        L_0x0164:
            r27 = r0
            r26 = r14
        L_0x0168:
            r4 = r27
            r12 = 1
            goto L_0x01d0
        L_0x016c:
            r0 = move-exception
            r26 = r14
        L_0x016f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "summertoken getSecurityCode e: "
            r4.append(r12)
            java.lang.String r12 = r0.getMessage()
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r4)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r28 = 322(0x142, double:1.59E-321)
            r30 = 12
            r32 = 1
            r34 = 1
            r27 = r4
            r27.idkeyStat(r28, r30, r32, r34)
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r15 = 4012(0xfac, float:5.622E-42)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r17 = 0
            r14[r17] = r15
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r25 = java.lang.Integer.valueOf(r11)
            r15[r17] = r25
            java.lang.Integer r25 = java.lang.Integer.valueOf(r36)
            r12 = 1
            r15[r12] = r25
            java.lang.String r0 = r0.getMessage()
            r16 = 2
            r15[r16] = r0
            java.lang.String r0 = "%s|%s|%s"
            java.lang.String r0 = java.lang.String.format(r0, r15)
            r14[r12] = r0
            r15 = 11098(0x2b5a, float:1.5552E-41)
            r4.mo160131h(r15, r14)
            r4 = r18
            goto L_0x01d0
        L_0x01cc:
            r26 = r14
            r12 = 1
            r4 = r3
        L_0x01d0:
            java.util.Map r0 = p156gj.C87203t.m108268d()
            boolean r14 = f40.C86709a0.m107522a()
            if (r14 == 0) goto L_0x0210
            java.lang.String r14 = p156gj.C87203t.m108270f(r12)
            java.lang.String r15 = p156gj.C87203t.m108271g()
            r18 = r14
            java.lang.Object[] r14 = new java.lang.Object[r12]
            com.tencent.mm.sdk.platformtools.MMStack r12 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r17 = 0
            r14[r17] = r12
            java.lang.String r12 = "READ_PHONE_STATE.getLine1Number %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r14)
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.getLine1Number(r12)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            int r14 = r12.length()
            if (r14 <= 0) goto L_0x020d
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
        L_0x020d:
            r14 = r18
            goto L_0x0214
        L_0x0210:
            java.lang.String r14 = "1234567890ABCDEF"
            r12 = r3
            r15 = r12
        L_0x0214:
            r18 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r24 = r11
            java.lang.String r11 = "<softtype>"
            r4.append(r11)
            java.lang.String r11 = "<lctmoc>"
            r4.append(r11)
            r4.append(r9)
            java.lang.String r9 = "</lctmoc>"
            r4.append(r9)
            java.lang.String r9 = "<level>"
            r4.append(r9)
            r4.append(r13)
            java.lang.String r9 = "</level>"
            r4.append(r9)
            r4.append(r2)
            java.lang.String r2 = "<k1>"
            r4.append(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r2 = "model name"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x025c
            java.lang.String[] r9 = p156gj.C87203t.m108269e()
            int r11 = r9.length
            r13 = 1
            if (r11 <= r13) goto L_0x025c
            r11 = 0
            r2 = r9[r11]
        L_0x025c:
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k1>"
            r4.append(r2)
            java.lang.String r2 = "<k2>"
            r4.append(r2)
            gj.t$r r2 = p156gj.C87203t.f252884i
            java.lang.String r2 = r2.mo121645a()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k2>"
            r4.append(r2)
            java.lang.String r2 = "<k3>"
            r4.append(r2)
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k3>"
            r4.append(r2)
            java.lang.String r2 = "<k4>"
            r4.append(r2)
            java.lang.String r2 = r1.vx0(r14)
            r4.append(r2)
            java.lang.String r2 = "</k4>"
            r4.append(r2)
            java.lang.String r2 = "<k5>"
            r4.append(r2)
            java.lang.String r2 = r1.vx0(r15)
            r4.append(r2)
            java.lang.String r2 = "</k5>"
            r4.append(r2)
            java.lang.String r2 = "<k6>"
            r4.append(r2)
            java.lang.String r2 = r1.vx0(r3)
            r4.append(r2)
            java.lang.String r2 = "</k6>"
            r4.append(r2)
            java.lang.String r2 = "<k7>"
            r4.append(r2)
            java.lang.String r2 = p156gj.C87203t.m108266b()
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k7>"
            r4.append(r2)
            java.lang.String r2 = "<k8>"
            r4.append(r2)
            gj.t$r r2 = p156gj.C87203t.f252878c
            java.lang.String r2 = r2.mo121645a()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k8>"
            r4.append(r2)
            java.lang.String r2 = "<k9>"
            r4.append(r2)
            java.lang.String r2 = p156gj.C87203t.m108275k()
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k9>"
            r4.append(r2)
            java.lang.String r2 = "<k10>"
            r4.append(r2)
            java.lang.String r2 = "cpu[0-9]+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch:{ all -> 0x0342 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0342 }
            java.lang.String r11 = "/sys/devices/system/cpu"
            r9.<init>(r11)     // Catch:{ all -> 0x0342 }
            java.io.File[] r9 = r9.listFiles()     // Catch:{ all -> 0x0342 }
            int r11 = r9.length     // Catch:{ all -> 0x0342 }
            r13 = 0
            r15 = 0
        L_0x0327:
            if (r15 >= r11) goto L_0x0343
            r25 = r9[r15]     // Catch:{ all -> 0x0342 }
            r27 = r9
            java.lang.String r9 = r25.getName()     // Catch:{ all -> 0x0342 }
            java.util.regex.Matcher r9 = r2.matcher(r9)     // Catch:{ all -> 0x0342 }
            boolean r9 = r9.matches()     // Catch:{ all -> 0x0342 }
            if (r9 == 0) goto L_0x033d
            int r13 = r13 + 1
        L_0x033d:
            int r15 = r15 + 1
            r9 = r27
            goto L_0x0327
        L_0x0342:
            r13 = 1
        L_0x0343:
            r4.append(r13)
            java.lang.String r2 = "</k10>"
            r4.append(r2)
            java.lang.String r2 = "<k11>"
            r4.append(r2)
            java.lang.String r2 = "hardware"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.vx0(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.append(r2)
            java.lang.String r2 = "</k11>"
            r4.append(r2)
            java.lang.String r2 = "<k12>"
            r4.append(r2)
            java.lang.String r2 = "revision"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.vx0(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.append(r2)
            java.lang.String r2 = "</k12>"
            r4.append(r2)
            java.lang.String r2 = "<k13>"
            r4.append(r2)
            java.lang.String r2 = "serial"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.vx0(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.append(r2)
            java.lang.String r2 = "</k13>"
            r4.append(r2)
            java.lang.String r2 = "<k14>"
            r4.append(r2)
            gj.t$r r2 = p156gj.C87203t.f252879d
            java.lang.String r2 = r2.mo121645a()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r1.vx0(r2)
            r4.append(r2)
            java.lang.String r2 = "</k14>"
            r4.append(r2)
            java.lang.String r2 = "<k15>"
            r4.append(r2)
            f40.C86709a0.m107522a()
            java.lang.String r2 = r1.vx0(r3)
            r4.append(r2)
            java.lang.String r2 = "</k15>"
            r4.append(r2)
            java.lang.String r2 = "<k16>"
            r4.append(r2)
            java.lang.String r2 = "features"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x03eb
            java.lang.String r2 = "flags"
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x03eb:
            java.lang.String r0 = r1.vx0(r2)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k16>"
            r4.append(r0)
            java.lang.String r0 = "<k18>"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = "</k18>"
            r4.append(r0)
            java.lang.String r0 = "<k21>"
            r4.append(r0)
            java.lang.String r0 = r1.vx0(r8)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k21>"
            r4.append(r0)
            java.lang.String r0 = "<k22>"
            r4.append(r0)
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ all -> 0x0436 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x0441
            java.lang.String r0 = r0.getSimOperatorName()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ all -> 0x0436 }
            goto L_0x0442
        L_0x0436:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r2 = "MicroMsg.DeviceInfo"
            java.lang.String r6 = "getMobileSPType"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r5)
        L_0x0441:
            r0 = r3
        L_0x0442:
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k22>"
            r4.append(r0)
            java.lang.String r0 = "<k24>"
            r4.append(r0)
            java.lang.String r0 = r1.vx0(r7)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k24>"
            r4.append(r0)
            java.lang.String r0 = "<k26>"
            r4.append(r0)
            r2 = r26
            r4.append(r2)
            java.lang.String r0 = "</k26>"
            r4.append(r0)
            java.lang.String r0 = "<k30>"
            r4.append(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0491
            java.lang.String r21 = r0.getExtraInfo()
        L_0x0491:
            r0 = r21
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k30>"
            r4.append(r0)
            java.lang.String r0 = "<k33>"
            r4.append(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r0 = r1.vx0(r0)
            r4.append(r0)
            java.lang.String r0 = "</k33>"
            r4.append(r0)
            java.lang.String r0 = "<k34>"
            r4.append(r0)
            java.lang.String r0 = "ro.build.fingerprint"
            java.lang.String r0 = p156gj.C45918i0.m51188a(r0)
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k34>"
            r4.append(r0)
            java.lang.String r0 = "<k35>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.BOARD
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k35>"
            r4.append(r0)
            java.lang.String r0 = "<k36>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.BOOTLOADER
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k36>"
            r4.append(r0)
            java.lang.String r0 = "<k37>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k37>"
            r4.append(r0)
            java.lang.String r0 = "<k38>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k38>"
            r4.append(r0)
            java.lang.String r0 = "<k39>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k39>"
            r4.append(r0)
            java.lang.String r0 = "<k40>"
            r4.append(r0)
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k40>"
            r4.append(r0)
            java.lang.String r0 = "<k41>"
            r4.append(r0)
            r11 = r23
            r4.append(r11)
            java.lang.String r0 = "</k41>"
            r4.append(r0)
            java.lang.String r0 = "<k42>"
            r4.append(r0)
            java.lang.String r0 = "ro.product.manufacturer"
            java.lang.String r0 = p156gj.C45918i0.m51188a(r0)
            java.lang.String r0 = r1.vx0(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k42>"
            r4.append(r0)
            java.lang.String r0 = "<k43>"
            r4.append(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r5 = "89884a87498ef44f"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r5)
            r4.append(r0)
            java.lang.String r0 = "</k43>"
            r4.append(r0)
            java.lang.String r0 = "<k44>"
            r4.append(r0)
            r5 = 0
            r4.append(r5)
            java.lang.String r0 = "</k44>"
            r4.append(r0)
            java.lang.String r0 = "<k45>"
            r4.append(r0)
            r4.append(r12)
            java.lang.String r0 = "</k45>"
            r4.append(r0)
            java.lang.String r0 = "<k46>"
            r4.append(r0)
            r5 = r22
            r4.append(r5)
            java.lang.String r0 = "</k46>"
            r4.append(r0)
            java.lang.String r0 = "<k47>"
            r4.append(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0601 }
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0601 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x0601 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0601 }
            int r2 = r0.getType()     // Catch:{ Exception -> 0x0601 }
            r5 = 1
            if (r2 != r5) goto L_0x05ed
            java.lang.String r0 = "wifi"
            goto L_0x0612
        L_0x05ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0601 }
            r2.<init>()     // Catch:{ Exception -> 0x0601 }
            r2.append(r3)     // Catch:{ Exception -> 0x0601 }
            int r0 = r0.getSubtype()     // Catch:{ Exception -> 0x0601 }
            r2.append(r0)     // Catch:{ Exception -> 0x0601 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0601 }
            goto L_0x0612
        L_0x0601:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r5[r2] = r0
            java.lang.String r0 = "getNetTypeStr: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r5)
            r0 = r3
        L_0x0612:
            java.lang.String r0 = r1.vx0(r0)
            r4.append(r0)
            java.lang.String r0 = "</k47>"
            r4.append(r0)
            java.lang.String r0 = "<k48>"
            r4.append(r0)
            r4.append(r14)
            java.lang.String r0 = "</k48>"
            r4.append(r0)
            java.lang.String r0 = "<k49>"
            r4.append(r0)
            java.lang.String r0 = a70.C112760b.m154216X()
            r4.append(r0)
            java.lang.String r0 = "</k49>"
            r4.append(r0)
            java.lang.String r0 = "<k52>"
            r4.append(r0)
            r2 = r20
            r4.append(r2)
            java.lang.String r0 = "</k52>"
            r4.append(r0)
            java.lang.String r0 = "<k53>"
            r4.append(r0)
            r2 = r19
            r4.append(r2)
            java.lang.String r0 = "</k53>"
            r4.append(r0)
            java.lang.String r0 = "<k57>"
            r4.append(r0)
            r2 = r24
            r4.append(r2)
            java.lang.String r0 = "</k57>"
            r4.append(r0)
            java.lang.String r0 = "<k58>"
            r4.append(r0)
            r2 = r18
            java.lang.String r0 = r1.vx0(r2)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = "</k58>"
            r4.append(r0)
            java.lang.String r0 = "<k59>"
            r4.append(r0)
            r2 = r36
            r4.append(r2)
            java.lang.String r0 = "</k59>"
            r4.append(r0)
            java.lang.String r0 = "<k60>"
            r4.append(r0)
            com.tencent.mm.sdk.platformtools.ImmutableBundle r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.ext
            java.lang.String r2 = "FEATURE_ID"
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r0 = r1.vx0(r0)
            r4.append(r0)
            java.lang.String r0 = "</k60>"
            r4.append(r0)
            java.lang.String r0 = "<k61>"
            r4.append(r0)
            boolean r0 = p156gj.C87203t.f252876a
            r2 = 1
            r4.append(r2)
            java.lang.String r0 = "</k61>"
            r4.append(r0)
            java.lang.String r0 = "<k62>"
            r4.append(r0)
            pv2.j r0 = pv2.C110259i.m149874a()
            java.lang.String r0 = r0.f329808a
            if (r0 == 0) goto L_0x06c6
            r3 = r0
        L_0x06c6:
            r4.append(r3)
            java.lang.String r0 = "</k62>"
            r4.append(r0)
            java.lang.String r0 = "<k63>"
            r4.append(r0)
            java.lang.String r0 = p156gj.C87203t.m108273i()
            r4.append(r0)
            java.lang.String r0 = "</k63>"
            r4.append(r0)
            java.lang.String r0 = "<k64>"
            r4.append(r0)
            java.lang.String r0 = p156gj.C87203t.m108278n()
            r4.append(r0)
            java.lang.String r0 = "</k64>"
            r4.append(r0)
            java.lang.String r0 = "<k65>"
            r4.append(r0)
            java.lang.String r0 = p156gj.C87203t.m108276l()
            r4.append(r0)
            java.lang.String r0 = "</k65>"
            r4.append(r0)
            java.lang.String r0 = "</softtype>"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.normsg.C115634f.mo175810Zb(int):java.lang.String");
    }

    /* renamed from: Zy */
    public ArrayList<byte[]> mo175811Zy(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return null;
        }
        ArrayList<byte[]> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(new byte[0]);
        }
        ArrayList<C64271bz3> Bx0 = Bx0(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                arrayList2.set(i2, Bx0.get(i2).toByteArray());
            } catch (Exception unused) {
            }
        }
        return arrayList2;
    }

    public byte[] b90() {
        return C114829e.C114833d.m161771a();
    }

    public byte[] bw0(String str) {
        return C114829e.C114832c.m161761b(str);
    }

    public boolean d10() {
        return C114829e.C114830a.m161746n();
    }

    /* renamed from: dy */
    public void mo175815dy(int i) {
        C118957a.C118959b<String> bVar = C118957a.f356329i;
        C118957a aVar = C118957a.C118960c.f356338a;
        synchronized (aVar) {
            aVar.f356335f = i;
        }
    }

    public void ec0(String str) {
        C114829e.C114832c.m161769j(str);
    }

    /* renamed from: ev */
    public void mo175817ev(boolean z) {
        try {
            C118617g gVar = new C118617g();
            gVar.f354961a = z;
            C118625m.m167306b(gVar);
        } catch (Throwable unused) {
            Log.m105924i("MicroMsg.NormsgSourceImpl", "stop turing owner failed");
        }
    }

    public byte[] g90() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C116896h<C119127d> hVar = C119127d.f356773h;
        hVar.mo180860b().mo183835b();
        Context context = MMApplicationContext.getContext();
        String f = C87203t.m108270f(true);
        C115635a aVar = new C115635a(this, byteArrayOutputStream, countDownLatch);
        C118609c cVar = new C118609c(context);
        C119127d b = hVar.mo180860b();
        C118510d dVar = new C118510d(aVar, cVar);
        synchronized (b) {
            C113074f b2 = C113074f.f338470c.mo180860b();
            if (!b2.f338472b) {
                b2.f338471a = context;
                b2.f338472b = true;
            }
            b.f356776c.post(new C119132e(b, dVar, f));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: gF */
    public String mo175819gF(String str) {
        return C114829e.C114832c.m161760a(str);
    }

    public String getLkid() {
        return C114829e.C114833d.m161773c();
    }

    /* renamed from: hd */
    public byte[] mo175821hd() {
        try {
            return C114829e.C114830a.m161737e(0, C86709a0.m107522a() ? 0 : 15);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NormsgSourceImpl", "get brief security info error: %s", e.toString());
            return new byte[0];
        }
    }

    /* renamed from: il */
    public boolean mo175822il() {
        boolean o = C114829e.C114830a.m161747o();
        Log.m105925i("MicroMsg.NormsgSourceImpl", "[tomys-edt] bravo jerry: %s", Boolean.valueOf(o));
        return o;
    }

    /* renamed from: j6 */
    public void mo175823j6(long j) {
        if (j > 0) {
            C118669a b = C118669a.f355102c.mo180860b();
            b.getClass();
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = Long.valueOf(j);
            b.f355104b.sendMessageAtFrontOfQueue(obtain);
        }
    }

    /* renamed from: jt */
    public boolean mo175824jt() {
        try {
            return C114829e.C114830a.m161733a();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th, "unexpected error.", new Object[0]);
            return false;
        }
    }

    /* renamed from: k6 */
    public void mo175825k6(String str, String str2, String str3, int i) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            byte[] a = C114836b.C68152a.m80553a(str, str2, str3, i);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 >= 1000 && currentTimeMillis2 <= 2000) {
                C115669n.INSTANCE.idkeyStat(416, 6, 1, false);
            } else if (currentTimeMillis2 > 2000 && currentTimeMillis2 <= 4000) {
                C115669n.INSTANCE.idkeyStat(416, 7, 1, false);
            } else if (currentTimeMillis2 > 4000) {
                C115669n.INSTANCE.idkeyStat(416, 8, 1, false);
            }
            Bundle bundle = new Bundle();
            bundle.putByteArray("WKWAR", a);
            try {
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C30322f.class, new C115638d(this));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            Log.m105925i("MicroMsg.NormsgSourceImpl", "invoke wkat failed in remote process: %s", th.toString());
        }
    }

    /* renamed from: kl */
    public void mo175826kl(String str) {
        C114829e.C114832c.m161770k(str);
    }

    /* renamed from: n9 */
    public void mo175827n9(String str, MotionEvent motionEvent) {
        C114829e.C114832c.m161764e(str, motionEvent);
    }

    /* renamed from: oI */
    public boolean mo175828oI(Object obj) {
        return C114829e.C114834e.m161778a(obj);
    }

    public void onCreate(Context context) {
        C114829e.m161732b(this);
        C114838b.m161783a(this);
        C114836b.m161780a(this);
    }

    /* renamed from: ox */
    public boolean mo175829ox(Object obj, Class cls) {
        return C114829e.C114834e.m161779b(obj, cls);
    }

    /* renamed from: qv */
    public void mo175830qv(String str) {
        C114829e.C114832c.m161768i(str);
    }

    /* renamed from: r4 */
    public String mo175831r4() {
        try {
            C86139c b = C86135b.m106649b(MMApplicationContext.getContext());
            int i = b.f250668b;
            if (i == 0) {
                return Util.nullAsNil(b.f250667a);
            }
            Log.m105921e("MicroMsg.NormsgSourceImpl", "[-] Fail to get OAID, errorcode: %s", Integer.valueOf(i));
            return "";
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th, "Fail to get OAID.", new Object[0]);
            return "";
        }
    }

    /* renamed from: rM */
    public int mo175832rM() {
        return C114829e.C114830a.m161734b();
    }

    public String te0(boolean z) {
        return C114829e.C114830a.m161742j(",", z);
    }

    public byte[] vu0(String str) {
        return C114829e.C114832c.m161762c(str);
    }

    public final String vx0(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt == '\'') {
                sb.append("&apos;");
            } else if (charAt > '~' || charAt == '[' || charAt == ']') {
                sb.append("&#");
                sb.append(charAt);
                sb.append(';');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public void w40(String str, String str2) {
        C114829e.C114832c.m161766g(str, str2);
    }

    public String wx0(Context context, String str) {
        String str2 = (String) ((ConcurrentHashMap) this.f346872e).get(str);
        if (str2 == null) {
            int i = NormsgDataService.f248476f;
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            Bundle bundle2 = null;
            try {
                bundle2 = HotpotService.m106335a(context, NormsgDataService.class, 1, bundle);
            } catch (HotpotService.C85991e e) {
                Log.printErrStackTrace("MicroMsg.NormsgDS", e.f250449d, "Fail to call m1.", new Object[0]);
            } catch (HotpotService.C85990d e2) {
                Log.printErrStackTrace("MicroMsg.NormsgDS", e2, "Fail to call m1.", new Object[0]);
            }
            String str3 = "";
            if (bundle2 != null) {
                str3 = bundle2.getString("result", str3);
            }
            str2 = str3;
            if (!TextUtils.isEmpty(str2)) {
                ((ConcurrentHashMap) this.f346872e).put(str, str2);
            }
        }
        return Util.nullAsNil(str2);
    }

    public byte[] xx0(String str) {
        StringBuilder reverse = new StringBuilder("gsmron").reverse();
        reverse.append(new StringBuilder("atadtsurt_").reverse().toString());
        return MultiProcessMMKV.getMMKV(reverse.toString()).decodeBytes(str);
    }

    /* renamed from: yD */
    public void mo175839yD() {
        Log.m105924i("MicroMsg.NormsgSourceImpl", "[+] Explained by src i1.");
        if (MMApplicationContext.isMainProcess()) {
            Context context = MMApplicationContext.getContext();
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(new C115636b(), intentFilter);
            } else if (BuildInfo.DEBUG || CrashReportFactory.hasDebuger()) {
                throw new IllegalStateException("MMApplicationContext has not been initialized.");
            } else {
                Log.m105920e("MicroMsg.NormsgSourceImpl", "[-] MMApplicationContext has not been initialized.");
            }
        }
    }

    /* renamed from: yS */
    public void mo175840yS(long j) {
        if (j > 0) {
            C118669a b = C118669a.f355102c.mo180860b();
            b.getClass();
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = 6;
            obtain.arg2 = 1;
            obtain.obj = Long.valueOf(j);
            b.f355104b.sendMessageDelayed(obtain, (long) 10000);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long yx0() {
        /*
            r10 = this;
            yc2.a$b<java.lang.String> r0 = yc2.C118957a.f356329i
            yc2.a r0 = yc2.C118957a.C118960c.f356338a
            monitor-enter(r0)
            long r1 = r0.f356334e     // Catch:{ all -> 0x0026 }
            monitor-enter(r0)     // Catch:{ all -> 0x0026 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0023 }
            long r5 = r0.f356333d     // Catch:{ all -> 0x0023 }
            long r5 = r3 - r5
            r7 = 259200000(0xf731400, double:1.280618154E-315)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0020
            r5 = 0
            r0.f356334e = r5     // Catch:{ all -> 0x0023 }
            r0.f356333d = r3     // Catch:{ all -> 0x0023 }
            r0.mo183641g()     // Catch:{ all -> 0x0023 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return r1
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.normsg.C115634f.yx0():long");
    }

    public boolean zx0(Context context) {
        int i = NormsgDataService.f248476f;
        Bundle bundle = null;
        try {
            Log.m105924i("MicroMsg.NormsgDS", "hit getPhoneState");
            Bundle a = HotpotService.m106335a(context, NormsgDataService.class, 2, (Bundle) null);
            Log.m105924i("MicroMsg.NormsgDS", "hit getPhoneState end.");
            bundle = a;
        } catch (HotpotService.C85991e e) {
            Log.printErrStackTrace("MicroMsg.NormsgDS", e.f250449d, "Fail to call m2.", new Object[0]);
        } catch (HotpotService.C85990d e2) {
            Log.printErrStackTrace("MicroMsg.NormsgDS", e2, "Fail to call m2.", new Object[0]);
        }
        return bundle != null && bundle.getBoolean("result", false);
    }
}
