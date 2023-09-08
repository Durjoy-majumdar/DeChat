package p176jc;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import p172io.flutter.embedding.android.FlutterSurfaceView;
import p172io.flutter.embedding.android.FlutterTextureView;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.plugin.editing.WxKeyboardAction;

/* renamed from: jc.c */
public final class C117309c {

    /* renamed from: a */
    public static final C117309c f351190a = new C117309c();

    /* renamed from: b */
    public static final LinkedList<C117310g> f351191b = new LinkedList<>();

    /* renamed from: c */
    public static final AtomicBoolean f351192c = new AtomicBoolean(false);

    /* renamed from: d */
    public static boolean f351193d;

    /* renamed from: a */
    public final C117310g mo181976a(Context context, boolean z) {
        C87921e eVar = new C87921e(context);
        return z ? new C117310g((Context) eVar, new FlutterTextureView(eVar)) : new C117310g((Context) eVar, new FlutterSurfaceView(eVar));
    }

    /* renamed from: b */
    public final C117310g mo181977b(Context context, boolean z) {
        C117310g gVar;
        C87412m.m108594g(context, "context");
        Iterator<C117310g> it = f351191b.iterator();
        C87412m.m108593f(it, "flutterViewsCache.iterator()");
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            C117310g next = it.next();
            C87412m.m108593f(next, "iter.next()");
            gVar = next;
            if ((!z || gVar.getRenderMode() != RenderMode.texture) && (z || gVar.getRenderMode() != RenderMode.surface)) {
            }
        }
        it.remove();
        gVar.mo181979c(context);
        return gVar == null ? mo181976a(context, z) : gVar;
    }

    /* renamed from: c */
    public final void mo181978c(C117310g gVar) {
        C87412m.m108594g(gVar, "view");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        gVar.mo181979c(context);
        gVar.setWxKeyboardAction((WxKeyboardAction) null);
        if ((f351193d && gVar.getRenderMode() == RenderMode.texture) || (!f351193d && gVar.getRenderMode() == RenderMode.surface)) {
            f351191b.addLast(gVar);
        }
    }
}
