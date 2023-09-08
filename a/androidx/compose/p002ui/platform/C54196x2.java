package androidx.compose.p002ui.platform;

import a14.C0000n0;
import a14.C53930o0;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import d14.C58032e1;
import d14.C58042h;
import d14.C58044h1;
import d14.C58050i1;
import d14.C58095x0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import p175j0.C24721r;
import p834a3.C103298d;
import wx3.C15601d;

/* renamed from: androidx.compose.ui.platform.x2 */
public final class C54196x2 {

    /* renamed from: a */
    public static final Map<Context, C58050i1<Float>> f152157a = new LinkedHashMap();

    /* renamed from: a */
    public static final C58050i1 m60893a(Context context) {
        C58050i1 i1Var;
        Map<Context, C58050i1<Float>> map = f152157a;
        synchronized (map) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                C54625h a = C54629k.m61479a(-1, (C54624g) null, (C32226l) null, 6, (Object) null);
                C58095x0 x0Var = new C58095x0(new C54191v2(contentResolver, uriFor, new C54193w2(a, C103298d.m136811a(Looper.getMainLooper())), a, context, (C15601d<? super C54191v2>) null));
                C0000n0 b = C53930o0.m60555b();
                int i = C58032e1.f165997a;
                obj = C58042h.m67203l(x0Var, b, new C58044h1(0, MAlarmHandler.NEXT_FIRE_INTERVAL), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            i1Var = (C58050i1) obj;
        }
        return i1Var;
    }

    /* renamed from: b */
    public static final C24721r m60894b(View view) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(C0966R.C0970id.f5839q1);
        if (tag instanceof C24721r) {
            return (C24721r) tag;
        }
        return null;
    }
}
