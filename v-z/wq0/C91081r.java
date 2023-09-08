package wq0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82374e;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82082h;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82085i;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82090l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82099t;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import fm0.C8132c;
import java.util.Collection;
import java.util.HashSet;
import rm0.C90010b;
import rm0.C90016c;
import sl0.C90220f;
import xk0.C91268g;

/* renamed from: wq0.r */
public class C91081r implements C91078o {

    /* renamed from: f */
    public static final C91081r f261263f = new C91081r();

    /* renamed from: d */
    public Collection<Class<? extends C82374e>> f261264d = new HashSet();

    /* renamed from: e */
    public Collection<Class<? extends C82374e>> f261265e = new HashSet();

    public C91081r() {
        Class<C82088k> cls = C82088k.class;
        this.f261264d.add(C90010b.C90012b.class);
        this.f261264d.add(C90016c.C90018b.class);
        this.f261264d.add(C90220f.C90222b.class);
        this.f261265e.add(C91268g.class);
        this.f261265e.add(C8132c.class);
        this.f261265e.add(cls);
        this.f261265e.add(JsApiGetMusicPlayerState.class);
        this.f261265e.add(JsApiGetBackgroundAudioState.class);
        this.f261265e.add(C82082h.class);
        this.f261265e.add(C82085i.class);
        this.f261265e.add(cls);
        this.f261265e.add(C82099t.class);
        this.f261265e.add(C82090l.class);
    }

    /* renamed from: aM */
    public boolean mo125138aM(Class<? extends C82374e> cls) {
        if (cls == null) {
            return false;
        }
        return ((HashSet) this.f261265e).contains(cls) || ((HashSet) this.f261264d).contains(cls);
    }

    /* renamed from: aS */
    public boolean mo125139aS(C82374e eVar) {
        if (eVar == null) {
            return false;
        }
        return mo125138aM(eVar.getClass());
    }
}
