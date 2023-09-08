package p1200n6;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import java.util.List;
import sx3.C110818d0;
import sx3.C64186f0;

/* renamed from: n6.c */
public final class C117611c extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C117612d f351835a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117611c(C117612d dVar, Handler handler) {
        super(handler);
        this.f351835a = dVar;
    }

    public void onChange(boolean z, Uri uri) {
        List list;
        super.onChange(z, uri);
        if (uri != null) {
            C117612d dVar = this.f351835a;
            dVar.getClass();
            try {
                list = Build.VERSION.SDK_INT >= 29 ? dVar.mo182331b(uri) : dVar.mo182330a(uri);
            } catch (Exception unused) {
                list = C64186f0.f181907d;
            }
            if (!list.isEmpty()) {
                dVar.f351837b.invoke(C110818d0.m150923U(list));
            }
        }
    }
}
