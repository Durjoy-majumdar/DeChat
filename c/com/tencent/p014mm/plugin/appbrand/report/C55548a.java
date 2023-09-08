package com.tencent.p014mm.plugin.appbrand.report;

import android.os.Message;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C64385g5;
import te3.C64411h5;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.report.a */
public final class C55548a {

    /* renamed from: a */
    public static final C55548a f158170a;

    /* renamed from: b */
    public static final LinkedList<C64411h5> f158171b = new LinkedList<>();

    /* renamed from: c */
    public static final int f158172c;

    /* renamed from: d */
    public static final MMHandler f158173d = new MMHandler("AppBrandCrossProcessSafeReporter$H", (MMHandler.Callback) C55549a.f158174d);

    /* renamed from: com.tencent.mm.plugin.appbrand.report.a$a */
    public static final class C55549a implements MMHandler.Callback {

        /* renamed from: d */
        public static final C55549a f158174d = new C55549a();

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what != C55548a.f158172c) {
                return true;
            }
            C55548a.m63179d(false);
            return true;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lte3/g5;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke", "(Lte3/g5;)Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.report.a$b */
    public static final class C55550b<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C55550b<InputType, ResultType> f158175a = new C55550b<>();

        public Object invoke(Object obj) {
            C55548a.m63178a(C55548a.f158170a, (C64385g5) obj, "ipcInvokeMMSync");
            return IPCVoid.f10316d;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lte3/g5;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lte3/g5;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.report.a$c */
    public static final class C55551c<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C55551c<InputType, ResultType> f158176d = new C55551c<>();

        public void invoke(Object obj, C1256g gVar) {
            C55548a.m63178a(C55548a.f158170a, (C64385g5) obj, "ipcInvokeMM");
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    static {
        C55548a aVar = new C55548a();
        f158170a = aVar;
        f158172c = aVar.hashCode();
    }

    /* renamed from: a */
    public static final void m63178a(C55548a aVar, C64385g5 g5Var, String str) {
        aVar.getClass();
        List<C64411h5> list = g5Var != null ? g5Var.f183275d : null;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.AppBrandCrossProcessSafeReporter", "reportMM scene:" + str + ", size:" + list.size());
        }
        for (C64411h5 h5Var : list) {
            try {
                if (Log.getLogLevel() <= 1) {
                    Log.m105918d("MicroMsg.AppBrandCrossProcessSafeReporter", "kvStat(mm-ipc): logID:" + h5Var.f183401d + ", type:" + h5Var.f183406i + ", val:" + h5Var.f183402e);
                }
                C115669n.INSTANCE.mo175915y(h5Var.f183401d, h5Var.f183406i, h5Var.f183402e, h5Var.f183403f, h5Var.f183404g, h5Var.f183405h);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandCrossProcessSafeReporter", "reportMM logid=" + h5Var.f183401d + ", e=" + e);
            }
        }
    }

    /* renamed from: d */
    public static final void m63179d(boolean z) {
        C8479f0 f0Var = new C8479f0();
        LinkedList<C64411h5> linkedList = f158171b;
        synchronized (linkedList) {
            T g5Var = new C64385g5();
            g5Var.f183275d.addAll(linkedList);
            f0Var.f27484d = g5Var;
            linkedList.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C64385g5 g5Var2 = (C64385g5) f0Var.f27484d;
        if (g5Var2 != null) {
            f158170a.mo77080e(g5Var2, z);
        }
    }

    /* renamed from: b */
    public final void mo77078b(int i, Object... objArr) {
        C87412m.m108594g(objArr, "vals");
        String s = C115669n.INSTANCE.mo175909s(Arrays.copyOf(objArr, objArr.length));
        C87412m.m108593f(s, "getStringFromMutilObj(*vals)");
        mo77079c(i, 0, false, false, false, s);
    }

    /* renamed from: c */
    public final void mo77079c(int i, int i2, boolean z, boolean z2, boolean z3, String str) {
        C87412m.m108594g(str, "vals");
        boolean z4 = true;
        if (MMApplicationContext.isMainProcess()) {
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.AppBrandCrossProcessSafeReporter", "kvStatFull(mm-direct): logID:" + i + ", type:" + i2 + ", val:" + str);
            }
            C115669n.INSTANCE.mo175915y(i, i2, str, z, z2, z3);
            return;
        }
        C8479f0 f0Var = new C8479f0();
        LinkedList<C64411h5> linkedList = f158171b;
        synchronized (linkedList) {
            C64411h5 h5Var = new C64411h5();
            h5Var.f183401d = i;
            h5Var.f183402e = str;
            h5Var.f183403f = z;
            h5Var.f183404g = z2;
            h5Var.f183405h = z3;
            h5Var.f183406i = i2;
            linkedList.add(h5Var);
            if (linkedList.size() >= 1000) {
                T g5Var = new C64385g5();
                g5Var.f183275d.addAll(linkedList);
                f0Var.f27484d = g5Var;
                linkedList.clear();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C64385g5 g5Var2 = (C64385g5) f0Var.f27484d;
        if (g5Var2 == null || !mo77080e(g5Var2, false)) {
            z4 = false;
        }
        if (z4) {
            MMHandler mMHandler = f158173d;
            int i3 = f158172c;
            mMHandler.removeMessages(i3);
            mMHandler.sendEmptyMessageDelayed(i3, 10000);
            return;
        }
        MMHandler mMHandler2 = f158173d;
        int i4 = f158172c;
        if (!mMHandler2.hasMessages(i4)) {
            mMHandler2.sendEmptyMessageDelayed(i4, 10000);
        }
    }

    /* renamed from: e */
    public final boolean mo77080e(C64385g5 g5Var, boolean z) {
        LinkedList<C64411h5> linkedList = g5Var.f183275d;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        if (z) {
            C15618a.m14628d(g5Var, C55550b.f158175a);
        } else {
            C15618a.m14627c(g5Var, C55551c.f158176d, (C1256g) null, 4, (Object) null);
        }
        return true;
    }
}
