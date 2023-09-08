package p1222y4;

import androidx.work.impl.WorkDatabase;
import p1014o4.C117687g;
import p1014o4.C117693m;
import p1160w4.C118739a;
import p1169a5.C112757a;
import p1221x4.C118849p;

/* renamed from: y4.p */
public class C118934p implements C117687g {

    /* renamed from: a */
    public final C112757a f356235a;

    /* renamed from: b */
    public final C118739a f356236b;

    /* renamed from: c */
    public final C118849p f356237c;

    static {
        C117693m.m165967e("WMFgUpdater");
    }

    public C118934p(WorkDatabase workDatabase, C118739a aVar, C112757a aVar2) {
        this.f356236b = aVar;
        this.f356235a = aVar2;
        this.f356237c = workDatabase.mo165532n();
    }
}
