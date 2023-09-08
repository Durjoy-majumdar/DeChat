package b41;

import com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor;
import e41.C116692a;
import g41.C116920a;

/* renamed from: b41.a */
public class C113143a implements C113144b {

    /* renamed from: g */
    public static volatile C113143a f338553g;

    /* renamed from: d */
    public C113144b f338554d = new PageEventMonitor();

    /* renamed from: e */
    public C113144b f338555e = new C116920a();

    /* renamed from: f */
    public C113144b f338556f = new C116692a();

    /* renamed from: a */
    public static C113143a m154802a() {
        if (f338553g == null) {
            synchronized (C113143a.class) {
                if (f338553g == null) {
                    f338553g = new C113143a();
                }
            }
        }
        return f338553g;
    }
}
