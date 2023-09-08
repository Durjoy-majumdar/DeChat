package p284zb;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81386x1;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PLong;
import java.util.concurrent.Callable;
import js0.C88016e;
import js0.C9514m;

/* renamed from: zb.b$$b */
public final /* synthetic */ class b$$b implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C91631b f262496d;

    /* renamed from: e */
    public final /* synthetic */ ICommLibReader f262497e;

    /* renamed from: f */
    public final /* synthetic */ String f262498f;

    /* renamed from: g */
    public final /* synthetic */ PLong f262499g;

    /* renamed from: h */
    public final /* synthetic */ C40480g f262500h;

    /* renamed from: i */
    public final /* synthetic */ C9514m f262501i;

    /* renamed from: j */
    public final /* synthetic */ PBool f262502j;

    public /* synthetic */ b$$b(C91631b bVar, ICommLibReader iCommLibReader, String str, PLong pLong, C40480g gVar, C9514m mVar, PBool pBool) {
        this.f262496d = bVar;
        this.f262497e = iCommLibReader;
        this.f262498f = str;
        this.f262499g = pLong;
        this.f262500h = gVar;
        this.f262501i = mVar;
        this.f262502j = pBool;
    }

    public final Object call() {
        C91631b bVar = this.f262496d;
        ICommLibReader iCommLibReader = this.f262497e;
        String str = this.f262498f;
        PLong pLong = this.f262499g;
        C40480g gVar = this.f262500h;
        C9514m mVar = this.f262501i;
        PBool pBool = this.f262502j;
        bVar.getClass();
        String d = C88016e.m109547d(iCommLibReader.openRead(str));
        if (!TextUtils.isEmpty(d)) {
            pLong.value = (long) d.length();
            SERVICE service = bVar.f262488d;
            C84768n1.m104431g(service, gVar, str, str, "v" + bVar.f262488d.mo114272k().mo113379c().pkgVersion(), bVar.mo122590f(), d, C84768n1.C84773e.LIB, new C91632c(bVar, mVar, pBool));
            return null;
        }
        throw new C81386x1(str);
    }
}
