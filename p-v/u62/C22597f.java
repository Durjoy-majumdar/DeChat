package u62;

import a72.C16436a;
import android.text.TextUtils;
import android.view.Surface;
import b72.C16754b;
import c72.C16866b;
import c72.C92381a;
import di3.C86312j;
import gy3.C87412m;
import java.util.concurrent.ConcurrentSkipListSet;
import p501dz.C58465g;
import s62.C22299d;
import t62.C22438a;
import z62.C66734b;

/* renamed from: u62.f */
public class C22597f implements C22595e {

    /* renamed from: d */
    public static final ConcurrentSkipListSet<Integer> f64933d = new ConcurrentSkipListSet<>();

    /* renamed from: a */
    public C22438a f64934a;

    /* renamed from: b */
    public Surface f64935b;

    /* renamed from: c */
    public int f64936c = 2;

    /* renamed from: V2 */
    public C16754b mo22573V2() {
        return ((C58465g) C86312j.m106911c(C58465g.class)).mo82805V2();
    }

    /* renamed from: a */
    public boolean mo35697a() {
        return true;
    }

    /* renamed from: b */
    public String mo35698b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "MM-OPC";
        }
        return "MM-OPC-" + str;
    }

    /* renamed from: c */
    public C16436a mo35699c() {
        return null;
    }

    /* renamed from: d */
    public C22299d mo35700d() {
        return new C22299d();
    }

    /* renamed from: e */
    public C22438a mo35701e() {
        C22438a aVar = this.f64934a;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("videoFileStateCache");
        throw null;
    }

    /* renamed from: f */
    public C16866b mo22574f() {
        return new C92381a();
    }

    /* renamed from: g */
    public final void mo35706g(C66734b bVar, C22438a aVar) {
        C87412m.m108594g(bVar, "mediaSource");
        C87412m.m108594g(aVar, "videoFileStateCache");
        this.f64934a = aVar;
    }

    public int getPlayerState() {
        return this.f64936c;
    }

    public Surface getSurface() {
        return this.f64935b;
    }

    public void setPlayerState(int i) {
        this.f64936c = i;
    }

    public void setSurface(Surface surface) {
        this.f64935b = surface;
    }
}
