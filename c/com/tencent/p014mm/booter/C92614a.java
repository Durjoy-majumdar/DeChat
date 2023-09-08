package com.tencent.p014mm.booter;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import di3.C86312j;
import eb0.C75587k2;
import eb0.C97628l2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.booter.a */
public class C92614a implements C75587k2 {

    /* renamed from: d */
    public static C75587k2 f266565d;

    /* renamed from: e */
    public static volatile C92614a f266566e;

    /* renamed from: a */
    public PhoneStatusWatcher.PhoneCallListener f266567a = new C92615a();

    /* renamed from: b */
    public List<C97628l2> f266568b = new ArrayList();

    /* renamed from: c */
    public IListener f266569c;

    /* renamed from: com.tencent.mm.booter.a$a */
    public class C92615a implements PhoneStatusWatcher.PhoneCallListener {
        public C92615a() {
        }

        public void onPhoneCall(int i) {
            if (i == 0) {
                Log.m105926v("MicroMsg.BackgroundPlayer", "call end");
                C92614a.this.mo126635b();
            } else if (i == 1 || i == 2) {
                Log.m105926v("MicroMsg.BackgroundPlayer", "call start");
                C92614a.this.mo126634a();
            }
        }
    }

    public C92614a() {
        ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).addPhoneCallListener(this.f266567a);
        if (this.f266569c == null) {
            this.f266569c = new BackgroundPlayer$2(this, C40008f.f107254d);
        }
        this.f266569c.alive();
    }

    /* renamed from: c */
    public static C75587k2 m116678c() {
        if (f266565d == null) {
            f266565d = m116679d();
        }
        return f266565d;
    }

    /* renamed from: d */
    public static C92614a m116679d() {
        if (f266566e == null) {
            synchronized (C92614a.class) {
                if (f266566e == null) {
                    f266566e = new C92614a();
                }
            }
        }
        return f266566e;
    }

    /* renamed from: a */
    public void mo126634a() {
        List<C97628l2> list = this.f266568b;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C97628l2) it.next()).mo102001d();
            }
        }
    }

    /* renamed from: b */
    public void mo126635b() {
        List<C97628l2> list = this.f266568b;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C97628l2) it.next()).mo102000c();
            }
        }
    }
}
