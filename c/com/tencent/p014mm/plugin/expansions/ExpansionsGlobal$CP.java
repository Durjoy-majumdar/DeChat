package com.tencent.p014mm.plugin.expansions;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p1174c5.C113245c;
import p1174c5.C113246d;
import p1174c5.C113248f;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP */
public class ExpansionsGlobal$CP extends ContentProvider {

    /* renamed from: com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP$a */
    public class C115396a implements C11323a<Integer, Void> {

        /* renamed from: a */
        public final /* synthetic */ Bundle f345901a;

        public C115396a(ExpansionsGlobal$CP expansionsGlobal$CP, Bundle bundle) {
            this.f345901a = bundle;
        }

        public Object apply(Object obj) {
            IBinder binder;
            Integer num = (Integer) obj;
            Bundle bundle = this.f345901a;
            if (bundle == null || (binder = bundle.getBinder("messenger")) == null) {
                return null;
            }
            C113248f.m155038a(new C115399c(this, binder, num));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP$b */
    public class C115397b implements C113246d<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ C11323a f345902a;

        public C115397b(ExpansionsGlobal$CP expansionsGlobal$CP, C11323a aVar) {
            this.f345902a = aVar;
        }

        /* renamed from: a */
        public Object mo165790a(C113248f fVar) {
            Exception exc;
            boolean z;
            synchronized (fVar.f338849a) {
                synchronized (fVar.f338849a) {
                    exc = fVar.f338852d;
                }
                z = exc != null;
            }
            if (!z) {
                return null;
            }
            Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "#isFaulted, request expansions fail");
            this.f345902a.apply(2);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP$c */
    public class C115398c implements Callable<Void> {

        /* renamed from: d */
        public final /* synthetic */ C11323a f345903d;

        public C115398c(ExpansionsGlobal$CP expansionsGlobal$CP, C11323a aVar) {
            this.f345903d = aVar;
        }

        public Object call() {
            boolean z;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            while (true) {
                synchronized (C85178q.f248171a) {
                    z = C85178q.f248173c != null;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "expansions not ready for global, just wait");
                    if (atomicInteger.getAndIncrement() < 3) {
                        Thread.sleep(1000);
                    } else {
                        throw new TimeoutException("wait for global timeout");
                    }
                } else if (C85178q.m105041e()) {
                    Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "expansions is ready");
                    this.f345903d.apply(1);
                    return null;
                } else {
                    C85178q.m105040d(new C115400d(this));
                    return null;
                }
            }
            while (true) {
            }
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if ("expansionsWait".equals(str)) {
            Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "cp receive remote expansions call, request");
            C115396a aVar = new C115396a(this, bundle);
            C113248f.m155038a(new C115398c(this, aVar)).mo165791b(new C115397b(this, aVar), C113248f.f338847g, (C113245c) null);
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
