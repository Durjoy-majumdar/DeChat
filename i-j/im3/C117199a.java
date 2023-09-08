package im3;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p1177ce.C113291d;
import p212oe.C117750b;
import p212oe.C89202a;
import p329d3.C58104c;
import p933be.C113173i;
import p961ee.C86507b;
import p981ie.C117178r;
import p981ie.C87704h;

/* renamed from: im3.a */
public class C117199a implements C80883e<IPCString, IPCVoid> {
    /* renamed from: a */
    public static void m165280a(int i, List<Integer> list) {
        if (i == Process.myPid()) {
            m165281b(list);
            m165282c("Dump Thread, pid = " + i + ", tid = " + list.toString(), 1);
            return;
        }
        Iterator it = ((ArrayList) C86507b.m107281l(MMApplicationContext.getContext())).iterator();
        while (it.hasNext()) {
            C58104c cVar = (C58104c) it.next();
            if (((Integer) cVar.f166179a).intValue() == i) {
                String str = (String) cVar.f166180b;
                StringBuilder sb = new StringBuilder();
                for (Object next : list) {
                    if (sb.length() != 0) {
                        next = "," + next;
                    }
                    sb.append(next);
                }
                String sb4 = sb.toString();
                Log.m105924i("MicroMsg.TopThreadDumpTask", "Dump remote process, name = " + str + ", pid = " + i + ", tids = " + sb4);
                C80907o.m98781d(str, new IPCString(sb4), C117199a.class, new a$$b());
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m165281b(List<Integer> list) {
        C114572i iVar;
        C113173i e = C117750b.m166047e();
        C87704h aVar = e != null ? e.f338613h.f339057d.f339026A : new C89202a();
        int myPid = Process.myPid();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Integer next : list) {
            arrayList.add(new C58104c(next, C117178r.m165260c(myPid, next.intValue())));
        }
        C113291d.C113292a.C113308d dVar = new C113291d.C113292a.C113308d();
        dVar.mo165870i();
        dVar.mo165862a("| TOP_THREAD_DUMP\n");
        dVar.mo165863b("Proc");
        dVar.mo165869h("pid", String.valueOf(myPid));
        dVar.mo165863b("Stacks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C58104c cVar = (C58104c) it.next();
            dVar.mo165864c(((C117178r.C117182d) cVar.f166180b).f351050a + "(" + cVar.f166179a + ")");
            String a = aVar.mo122129a(((Integer) cVar.f166179a).intValue());
            linkedHashMap.put("stack_" + ((C117178r.C117182d) cVar.f166180b).f351050a + "(" + cVar.f166179a + ")", a);
            int i = 0;
            for (String str : a.split("\n")) {
                dVar.f339024a.append(i == 0 ? "|   -> " : "|      ");
                dVar.f339024a.append(str);
                dVar.mo165862a("\n");
                i++;
            }
        }
        dVar.mo165867f();
        dVar.mo165865d();
        if (e != null && (iVar = (C114572i) e.f338613h.mo165880e(C114572i.class)) != null) {
            iVar.mo173741i("MATRIX_TOP_DUMP", myPid, linkedHashMap);
        }
    }

    /* renamed from: c */
    public static void m165282c(String str, int i) {
        new Handler(Looper.getMainLooper()).post(new a$$a(str, i));
    }

    public void invoke(Object obj, C1256g gVar) {
        ArrayList arrayList = new ArrayList();
        for (String trim : String.valueOf(((IPCString) obj).f10315d).split(",")) {
            String trim2 = trim.trim();
            if (TextUtils.isDigitsOnly(trim2)) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(trim2)));
                } catch (Throwable th) {
                    Log.m105928w("MicroMsg.TopThreadDumpTask", "parse tid failed: " + th.getMessage());
                }
            }
        }
        m165281b(arrayList);
        gVar.mo894a(IPCVoid.f10316d);
    }
}
