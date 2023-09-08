package a02;

import a02.C112700b;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.List;

/* renamed from: a02.c */
public class C112704c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f337427d;

    /* renamed from: e */
    public final /* synthetic */ C112700b.C112703c f337428e;

    /* renamed from: f */
    public final /* synthetic */ MMHandler f337429f;

    /* renamed from: g */
    public final /* synthetic */ C112700b f337430g;

    /* renamed from: a02.c$a */
    public class C112705a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112708e f337431d;

        public C112705a(C112708e eVar) {
            this.f337431d = eVar;
        }

        public void run() {
            C112704c.this.f337428e.mo164438a(this.f337431d, (Intent) null);
        }
    }

    public C112704c(C112700b bVar, List list, C112700b.C112703c cVar, MMHandler mMHandler) {
        this.f337430g = bVar;
        this.f337427d = list;
        this.f337428e = cVar;
        this.f337429f = mMHandler;
    }

    public void run() {
        int i = 0;
        for (String a : this.f337427d) {
            try {
                C112700b.m154101a(this.f337430g, a);
            } catch (C112699a e) {
                i = e.f337417d.mo164443a();
            }
        }
        if (this.f337428e != null) {
            this.f337429f.post(new C112705a(new C112708e(i, "")));
        }
    }
}
