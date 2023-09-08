package androidx.work;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p1014o4.C117687g;
import p1014o4.C117702r;
import p1014o4.C117708y;
import p1169a5.C112757a;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f338336a;

    /* renamed from: b */
    public C113041b f338337b;

    /* renamed from: c */
    public Executor f338338c;

    /* renamed from: d */
    public C112757a f338339d;

    /* renamed from: e */
    public C117708y f338340e;

    /* renamed from: f */
    public C117687g f338341f;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C113037a {

        /* renamed from: a */
        public List<String> f338342a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f338343b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, C113041b bVar, Collection<String> collection, C113037a aVar, int i, Executor executor, C112757a aVar2, C117708y yVar, C117702r rVar, C117687g gVar) {
        this.f338336a = uuid;
        this.f338337b = bVar;
        new HashSet(collection);
        this.f338338c = executor;
        this.f338339d = aVar2;
        this.f338340e = yVar;
        this.f338341f = gVar;
    }
}
