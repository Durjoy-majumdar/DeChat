package p80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p80.b */
public final class C110193b {

    /* renamed from: a */
    public static final C110193b f329648a = new C110193b();

    /* renamed from: b */
    public static final HashMap<Integer, WeakReference<C110194c>> f329649b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Integer, WeakReference<C110192a>> f329650c = new HashMap<>();

    /* renamed from: b */
    public static final C110194c m149776b(boolean z, long j) {
        C110194c cVar = new C110194c(z, j);
        f329649b.put(Integer.valueOf(cVar.hashCode()), new WeakReference(cVar));
        return cVar;
    }

    /* renamed from: a */
    public final C110192a mo161592a(long j) {
        C110192a aVar = new C110192a(j);
        f329650c.put(Integer.valueOf(aVar.hashCode()), new WeakReference(aVar));
        return aVar;
    }

    /* renamed from: c */
    public final synchronized void mo161593c() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------printAllocatedGLObjectInfo, current allocated tex size:");
        HashMap<Integer, WeakReference<C110194c>> hashMap = f329649b;
        sb.append(hashMap.size());
        sb.append(", frameBuffer size:");
        sb.append(f329650c.size());
        sb.append(" calledStack:");
        sb.append(Util.getStack());
        Log.m105924i("MicroMsg.GLObjectFactory", sb.toString());
        Log.m105924i("MicroMsg.GLObjectFactory", "--------------------------------------------");
        for (Map.Entry entry : new HashMap(hashMap).entrySet()) {
            Integer num = (Integer) entry.getKey();
            C110194c cVar = (C110194c) ((WeakReference) entry.getValue()).get();
            if (cVar == null) {
                Log.m105924i("MicroMsg.GLObjectFactory", num + " tex recycled");
                f329649b.remove(num);
            } else if (!cVar.f329651d) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(num);
                sb4.append(" tex leak, texId:");
                sb4.append(cVar.f329652e);
                sb4.append(", external:");
                sb4.append(!cVar.f329653f);
                sb4.append(", allocatedTid:");
                sb4.append(cVar.f329656i);
                Log.m105924i("MicroMsg.GLObjectFactory", sb4.toString());
            } else {
                f329649b.remove(num);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(num);
                sb5.append(" tex released, texId:");
                sb5.append(cVar.f329652e);
                sb5.append(", external:");
                sb5.append(!cVar.f329653f);
                sb5.append(", allocatedTid:");
                sb5.append(cVar.f329656i);
                Log.m105924i("MicroMsg.GLObjectFactory", sb5.toString());
            }
        }
        for (Map.Entry entry2 : new HashMap(f329650c).entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            C110192a aVar = (C110192a) ((WeakReference) entry2.getValue()).get();
            if (aVar == null) {
                Log.m105924i("MicroMsg.GLObjectFactory", num2 + " fbo recycled");
                f329650c.remove(num2);
            } else if (!aVar.f329643d) {
                Log.m105924i("MicroMsg.GLObjectFactory", num2 + " fbo leak, fbo:" + aVar.f329644e + ", allocatedTid:" + aVar.f329646g);
            } else {
                f329650c.remove(num2);
                Log.m105924i("MicroMsg.GLObjectFactory", num2 + " fbo released, fbo:" + aVar.f329644e + ", allocatedTid:" + aVar.f329646g);
            }
        }
        Log.m105924i("MicroMsg.GLObjectFactory", "--------finish printAllocatedGLObjectInfo--------");
    }
}
