package com.tencent.p014mm.plugin.normsg;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import ce2.C28545b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ct3.C86135b;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import j40.C87829b;
import java.util.concurrent.ConcurrentLinkedQueue;
import jc3.C87948i;
import lu3.C88656g;
import tc2.C118416d;
import tc2.C118418g;
import yc2.C118957a;
import yc2.C118965e;
import yc2.C118982m;
import yc2.C118983n;
import yc2.C118984p;
import zt3.C119157j;

@C86522b(dependencies = {C87948i.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: com.tencent.mm.plugin.normsg.c */
public class C115632c extends C86301e {

    /* renamed from: com.tencent.mm.plugin.normsg.c$a */
    public class C85298a implements C88656g {
        public C85298a(C115632c cVar) {
        }

        public String getKey() {
            return "wc-msaid-init";
        }

        public void run() {
            C86135b.m106648a(MMApplicationContext.getContext());
            C118418g gVar = C118418g.INSTANCE;
            CrashReportFactory.setX86Env(gVar.mo175822il());
            CrashReportFactory.setDualByTools(gVar.mo175783A7());
            CrashReportFactory.setHookedByXposed(gVar.Yw0());
        }
    }

    static {
        C118418g gVar = C118418g.INSTANCE;
        gVar.Z10("\u001c:/-9+\n.\"0:41\r\"!");
        gVar.Z10("\u0005#64 2\u0004(,");
        gVar.Z10("\u0000&31%7\u00009-\f.,");
    }

    public void onAccountInitialized(Context context) {
        int i;
        String str;
        C118957a.C118959b<String> bVar = C118957a.f356329i;
        C118957a aVar = C118957a.C118960c.f356338a;
        C87829b a = C86709a0.m107531m().mo58407a();
        aVar.getClass();
        Class<C118957a.C118961d> cls = C118957a.C118961d.class;
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(C28545b.m38262a("´¼¸±µ«§®»º£¸¬µ¯±§­"));
        } catch (Throwable unused) {
        }
        String sb4 = sb.toString();
        sb.delete(0, sb.length());
        sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
        if (!(!sb.toString().equals(C118957a.m167719c(sb4, sb.toString())))) {
            Log.m105928w("MircoMsg.AEDHLP", "[tomys] aedh is not enabled.");
        } else {
            StringBuilder sb5 = new StringBuilder();
            try {
                sb5.append(C28545b.m38262a("·¹¿´¶¶º­¾½¦»¹¯¯¯©´·¡"));
                i = (cls.hashCode() >>> 31) | 1;
                str = sb5.toString();
                if (i != 0) {
                    try {
                        i = ((cls.hashCode() >>> 31) | 1) ^ 1;
                        sb5.delete(0, sb5.length());
                        sb5.append(i);
                        i = Util.getInt(C118957a.m167719c(str, sb5.toString()), i);
                    } catch (Throwable th) {
                        sb5.append(i);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                sb5.append(i);
                throw th4;
            }
            if (i <= 0) {
                i = 26;
            }
            if (Build.VERSION.SDK_INT > i) {
                Log.m105928w("MircoMsg.AEDHLP", "[tomys] unsupported system, aedh is not enabled.");
            } else {
                C118957a.C118959b<String> bVar2 = C118957a.f356329i;
                String str2 = a.f124988a;
                int indexOf = str2.indexOf(58);
                if (bVar2.contains(indexOf != -1 ? str2.substring(indexOf) : "")) {
                    try {
                        ClassLoader classLoader = C118965e.f356354g;
                        C118965e eVar = C118965e.C118975h.f356396a;
                        eVar.mo183651e(a.f124990c);
                        synchronized (eVar) {
                            if (!eVar.f356379f) {
                                throw new IllegalStateException("you must call initialize first.");
                            }
                        }
                        ((ConcurrentLinkedQueue) eVar.f356374a).add(aVar);
                        Log.m105924i("MircoMsg.AEDHLP", "[tomys] aed installed.");
                    } catch (C118965e.C118973f e) {
                        Log.printErrStackTrace("MircoMsg.AEDHLP", e, "[tomys] aed install failed.", new Object[0]);
                        aVar.mo183639e(e);
                    }
                } else {
                    Log.m105928w("MircoMsg.AEDHLP", "[tomys] not target process, skip installing aed.");
                }
            }
        }
        if (C118984p.f356413a == null) {
            C118984p.f356413a = new C118984p.C118986b((C118984p.C118985a) null);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C118418g.INSTANCE.Z10("\u001d\u0011\u001a\u000b\u0017\u0012\u001e[\u001c\u0016\u0004\u0015\u0007\u0012\u0000\bB\u001a\u001d\u000bF\n\t\u0011\r\b\bO50 \u0002\u000f\u000b\u001f\r\u001d"));
        MMApplicationContext.getContext().registerReceiver(C118984p.f356413a, intentFilter);
    }

    public void onAccountReleased(Context context) {
        if (C118984p.f356413a != null) {
            MMApplicationContext.getContext().unregisterReceiver(C118984p.f356413a);
        }
        C118984p.f356413a = null;
    }

    public void onCreate(Context context) {
        ((C118416d) C86312j.m106911c(C118416d.class)).mo175839yD();
        C118982m mVar = C118982m.INSTANCE;
        mVar.getClass();
        DisplayManager displayManager = (DisplayManager) MMApplicationContext.getContext().getSystemService("display");
        mVar.f356408e = displayManager;
        displayManager.registerDisplayListener(new C118983n(mVar), (Handler) null);
        ((C119157j) C119157j.f356862d).mo183875f(new C85298a(this));
    }
}
