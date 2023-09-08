package d60;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p447aw.C103918d;

/* renamed from: d60.a */
public abstract class C58121a {

    /* renamed from: d */
    public final ViewGroup f166287d;

    /* renamed from: e */
    public final HashMap<Integer, Integer> f166288e = new HashMap<>();

    public C58121a(ViewGroup viewGroup, C58124b bVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "broadcast");
        this.f166287d = viewGroup;
        bVar.registerPlugin(this);
    }

    /* renamed from: c0 */
    public static boolean m67274c0(C58121a aVar, String str, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                i2 = aVar.hashCode();
            }
            aVar.getClass();
            C87412m.m108594g(str, "permission");
            Context context = aVar.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, str, i, "", "");
            if (!z1) {
                aVar.f166288e.put(Integer.valueOf(i), Integer.valueOf(i2));
            }
            return z1;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPermission");
    }

    /* renamed from: b0 */
    public void mo11966b0(int i, int i2, Bundle bundle) {
    }

    /* renamed from: d0 */
    public int mo82891d0() {
        Context context = this.f166287d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    /* renamed from: e0 */
    public final ViewGroup mo82892e0() {
        return this.f166287d;
    }

    /* renamed from: f0 */
    public int mo14483f0() {
        return this.f166287d.getVisibility();
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        this.f166287d.setVisibility(i);
    }

    /* renamed from: g0 */
    public boolean mo82893g0() {
        return this.f166287d.getContext().getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
    }

    /* renamed from: i0 */
    public void mo8357i0() {
    }

    /* renamed from: j0 */
    public String mo82894j0() {
        return getClass().getSimpleName();
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        return false;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
    }

    /* renamed from: n0 */
    public void mo12054n0(int i) {
    }

    /* renamed from: o0 */
    public void mo82895o0(int i, int i2, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
    }

    /* renamed from: p0 */
    public void mo8379p0(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Integer num = this.f166288e.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        mo82895o0(i, num.intValue(), strArr, iArr);
    }

    /* renamed from: q0 */
    public boolean mo82896q0() {
        return false;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* renamed from: t0 */
    public void mo82897t0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
    }

    /* renamed from: v0 */
    public void mo12287v0() {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
    }
}
