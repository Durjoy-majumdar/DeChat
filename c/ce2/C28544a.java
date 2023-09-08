package ce2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.FileReaderHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ce2.a */
public enum C28544a {
    INSTANCE;
    

    /* renamed from: d */
    public final List<C28546c> f78395d;

    /* renamed from: e */
    public final Map<Class<? extends C28546c>, C28546c> f78396e;

    /* renamed from: a */
    public <T extends C28546c> T mo56045a(Class<T> cls) {
        return (C28546c) ((ConcurrentHashMap) this.f78396e).get(cls);
    }

    /* renamed from: b */
    public void mo56046b(Map<String, String> map) {
        Iterator it = ((CopyOnWriteArrayList) this.f78395d).iterator();
        while (it.hasNext()) {
            C28546c cVar = (C28546c) it.next();
            if (map.containsKey(cVar.mo56049b())) {
                cVar.mo56050c(map);
            }
        }
    }

    /* renamed from: c */
    public void mo56047c(String str) {
        Log.m105925i("MicroMsg.DiagnosticManager", "received cmd: %s", str);
        mo56046b(XmlParser.parseXml(str, FileReaderHelper.OPEN_FILE_FROM_CMD, (String) null));
    }

    /* renamed from: e */
    public void mo56048e(C28546c cVar) {
        if (!((ConcurrentHashMap) this.f78396e).containsKey(cVar.getClass())) {
            ((CopyOnWriteArrayList) this.f78395d).add(cVar);
            ((ConcurrentHashMap) this.f78396e).put(cVar.getClass(), cVar);
            cVar.mo56051d();
        }
    }
}
