package wq0;

import android.util.SparseIntArray;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1630b5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1705j4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1708k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1713l4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1774p4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1839q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1908x4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1914z4;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiMakeVoIPCall;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice.C29531a;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82958e;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82962g;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.appbrand.menu.C83657c0;
import com.tencent.p014mm.plugin.appbrand.menu.C83692u;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wq0.b */
public final class C91059b {

    /* renamed from: a */
    public static final SparseIntArray f261232a;

    /* renamed from: b */
    public static final Set<String> f261233b;

    /* renamed from: wq0.b$a */
    public class C91060a extends SparseIntArray {
        public int get(int i) {
            return get(i, C0966R.string.f7732pn);
        }
    }

    static {
        C91060a aVar = new C91060a();
        f261232a = aVar;
        HashSet hashSet = new HashSet();
        f261233b = hashSet;
        aVar.put(1652140151, C0966R.string.f7728pj);
        aVar.put(-258060054, C0966R.string.f7728pj);
        aVar.put(-1885976994, C0966R.string.f7729pk);
        aVar.put(-512571070, C0966R.string.f7729pk);
        aVar.put(-1646016539, C0966R.string.f7730pl);
        aVar.put(1221269510, C0966R.string.f7730pl);
        aVar.put(-253179333, C0966R.string.f7730pl);
        aVar.put(2138454336, C0966R.string.f7730pl);
        aVar.put(-1299898975, C0966R.string.f7730pl);
        aVar.put(-1748133766, C0966R.string.f7727pi);
        hashSet.add(C82878f0.NAME);
        hashSet.add(C1821q0.NAME);
        hashSet.add(JsApiStartPlayVoice.NAME);
        hashSet.add(JsApiOperateMusicPlayer.NAME);
        hashSet.add(C82958e.NAME);
        hashSet.add(C83657c0.C83660c.NAME);
        hashSet.add(C82962g.NAME);
        hashSet.add(C82980n.NAME);
        hashSet.add(C83692u.C83693a.NAME);
        hashSet.add(C82801g.NAME);
        hashSet.add(JsApiMakeVoIPCall.NAME);
        hashSet.add(C1839q0.NAME);
        hashSet.add("chooseContact");
        hashSet.add(C1705j4.NAME);
        hashSet.add(C1774p4.NAME);
        hashSet.add(C1884v4.NAME);
        hashSet.add(C1908x4.NAME);
        hashSet.add(C1914z4.NAME);
        hashSet.add(C1630b5.NAME);
        hashSet.add(C28613b.NAME);
        hashSet.add(C29531a.NAME);
        hashSet.add(C1708k4.NAME);
        hashSet.add(C1713l4.NAME);
        hashSet.add(C1828u.NAME);
    }
}
