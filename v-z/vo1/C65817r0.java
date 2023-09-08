package vo1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57941h;
import cp1.C57955n;
import d60.C58124b;
import gy3.C87412m;
import java.lang.ref.SoftReference;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13604l;

/* renamed from: vo1.r0 */
public final class C65817r0 implements C65818s0 {

    /* renamed from: a */
    public final SoftReference<C57941h> f189276a;

    public C65817r0(SoftReference<C57941h> softReference) {
        C87412m.m108594g(softReference, "sReplayMiniView");
        this.f189276a = softReference;
    }

    /* renamed from: a */
    public boolean mo89823a(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar) {
        C57941h o = mo89854o();
        if (o == null) {
            return false;
        }
        C57955n.C57956a.m67055a(o, 3, jSONObject, false, 4, (Object) null);
        return false;
    }

    /* renamed from: b */
    public void mo89824b(boolean z) {
    }

    /* renamed from: c */
    public void mo89825c(JSONObject jSONObject) {
    }

    /* renamed from: d */
    public void mo89826d() {
    }

    /* renamed from: e */
    public void mo89827e(boolean z) {
    }

    /* renamed from: f */
    public void mo89828f() {
    }

    /* renamed from: g */
    public void mo89829g() {
    }

    /* renamed from: h */
    public void mo89830h() {
        C57941h o = mo89854o();
        if (o != null) {
            C57955n.C57956a.m67055a(o, 1, (JSONObject) null, false, 6, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r4 = (r4 = r4.mo82739m()).getMultiAreaLayout();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89831i(boolean r3, boolean r4) {
        /*
            r2 = this;
            cp1.h r4 = r2.mo89854o()
            r0 = 0
            if (r4 == 0) goto L_0x0018
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r4 = r4.mo82739m()
            if (r4 == 0) goto L_0x0018
            com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout r4 = r4.getMultiAreaLayout()
            if (r4 == 0) goto L_0x0018
            iq3.b r4 = r4.getAdapter()
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            boolean r1 = r4 instanceof uk1.C65409j
            if (r1 == 0) goto L_0x0020
            r0 = r4
            uk1.j r0 = (uk1.C65409j) r0
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.mo89490k(r3)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65817r0.mo89831i(boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo89832j(JSONArray jSONArray) {
    }

    /* renamed from: k */
    public void mo89833k() {
    }

    /* renamed from: l */
    public void mo89834l(boolean z, C13604l<Integer, Integer> lVar) {
        C57941h o = mo89854o();
        if (o != null) {
            C57955n.C57956a.m67055a(o, 2, (JSONObject) null, z, 2, (Object) null);
        }
    }

    /* renamed from: m */
    public void mo89835m(String str) {
    }

    /* renamed from: n */
    public void mo89836n() {
    }

    /* renamed from: o */
    public final C57941h mo89854o() {
        C57941h hVar = this.f189276a.get();
        if (hVar == null) {
            Log.m105924i("SeiProcessCallbackMiniProxy", "getMiniView fail!");
        }
        return hVar;
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
    }
}
