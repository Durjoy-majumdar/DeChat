package com.tencent.p014mm.plugin.voip.model;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tencent.mm.plugin.voip.model.x */
public class C57469x {

    /* renamed from: c */
    public static C57469x f164662c = new C57469x();

    /* renamed from: a */
    public C106377r f164663a;

    /* renamed from: b */
    public ReentrantLock f164664b = new ReentrantLock();

    /* renamed from: a */
    public static C106377r m66239a() {
        C57469x xVar = f164662c;
        if (xVar.f164663a == null) {
            xVar.f164664b.lock();
            try {
                C57469x xVar2 = f164662c;
                if (xVar2.f164663a == null) {
                    xVar2.f164663a = new C106377r();
                }
            } finally {
                f164662c.f164664b.unlock();
            }
        }
        return f164662c.f164663a;
    }
}
