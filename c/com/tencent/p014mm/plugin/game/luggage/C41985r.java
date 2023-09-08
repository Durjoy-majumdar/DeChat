package com.tencent.p014mm.plugin.game.luggage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import p578js.C108769b;
import p824tc.C48619a;
import p828wa.C53133t;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.r */
public class C41985r {

    /* renamed from: a */
    public static HashMap<String, C53133t> f113086a = new HashMap<>();

    /* renamed from: b */
    public static LinkedList<String> f113087b = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.game.luggage.r$a */
    public class C41986a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C108769b.C46571a f113088d;

        public C41986a(C108769b.C46571a aVar) {
            this.f113088d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            C108769b.C46571a aVar = this.f113088d;
            if (aVar != null) {
                aVar.callback();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.r$b */
    public class C41987b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Class f113089d;

        /* renamed from: e */
        public final /* synthetic */ String f113090e;

        /* renamed from: f */
        public final /* synthetic */ C108769b.C46571a f113091f;

        public C41987b(Class cls, String str, C108769b.C46571a aVar) {
            this.f113089d = cls;
            this.f113090e = str;
            this.f113091f = aVar;
        }

        public void run() {
            C53133t tVar = new C53133t(MMApplicationContext.getContext(), this.f113089d);
            C41985r.f113086a.put(this.f113090e, tVar);
            C41985r.f113087b.remove(this.f113090e);
            if (!TextUtils.isEmpty(this.f113090e)) {
                Log.m105925i("MicroMsg.PreloadGameWebCoreHelp", "loadUrl: %s", this.f113090e);
                tVar.mo73821i(this.f113090e);
            }
            C108769b.C46571a aVar = this.f113091f;
            if (aVar != null) {
                aVar.callback();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.r$c */
    public class C41988c implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C41989d f113092d;

        public C41988c(C41989d dVar) {
            this.f113092d = dVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            boolean z = bundle.getBoolean("preload_success");
            boolean z2 = bundle.getBoolean("has_preload");
            C41989d dVar = this.f113092d;
            if (dVar != null) {
                dVar.mo65429a(z2, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.r$d */
    public interface C41989d {
        /* renamed from: a */
        void mo65429a(boolean z, boolean z2);
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.r$e */
    public static class C41990e implements C80883e<Bundle, Bundle> {
        private C41990e() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("action_id");
            String string = bundle.getString("preload_url");
            boolean z = true;
            if (i == 1) {
                Class cls = (Class) bundle.getSerializable("webcore_impl_class");
                if (!TextUtils.isEmpty(string) && cls != null) {
                    C41985r.m45637e(cls, string, new C41992s(this, gVar));
                }
            } else if (i != 2) {
                if (i == 3) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("preload_success", C41985r.m45636d(string));
                    if (C41985r.m45635c(string) == null) {
                        z = false;
                    }
                    bundle2.putBoolean("has_preload", z);
                    gVar.mo894a(bundle2);
                }
            } else if (Util.isNullOrNil(string)) {
                C41985r.m45634b();
            } else {
                C41985r.m45638f(string);
            }
        }
    }

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static void m45633a(String str, C41989d dVar) {
        if (!m45640h()) {
            Bundle bundle = new Bundle();
            bundle.putInt("action_id", 3);
            bundle.putString("preload_url", str);
            C41901e.m45448a(bundle, C41990e.class, new C41988c(dVar));
        } else if (dVar != null) {
            dVar.mo65429a(m45635c(str) != null, m45636d(str));
        }
    }

    /* renamed from: b */
    public static void m45634b() {
        if (m45640h()) {
            for (C53133t next : f113086a.values()) {
                next.mo73822j();
                C48619a aVar = next.f148245i;
                if (aVar != null) {
                    aVar.destroy();
                }
            }
            f113086a.clear();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action_id", 2);
        C41901e.m45448a(bundle, C41990e.class, (C1256g) null);
    }

    /* renamed from: c */
    public static C53133t m45635c(String str) {
        return f113086a.get(str);
    }

    /* renamed from: d */
    public static boolean m45636d(String str) {
        C53133t tVar = f113086a.get(str);
        if (!(tVar == null || tVar.mo73819g() == null)) {
            C41962j jVar = (C41962j) tVar.mo73819g();
            if (jVar.f113040H && !jVar.f113046N) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m45637e(Class<? extends C48619a> cls, String str, C108769b.C46571a aVar) {
        if (!m45640h()) {
            Bundle bundle = new Bundle();
            bundle.putInt("action_id", 1);
            bundle.putString("preload_url", str);
            bundle.putSerializable("webcore_impl_class", cls);
            C41901e.m45448a(bundle, C41990e.class, new C41986a(aVar));
        } else if (f113086a.containsKey(str)) {
            Log.m105925i("MicroMsg.PreloadGameWebCoreHelp", "preload page[%s] exists, return", str);
            aVar.callback();
        } else if (f113087b.contains(str)) {
            Log.m105924i("MicroMsg.PreloadGameWebCoreHelp", "preload ing, return");
            aVar.callback();
        } else {
            f113087b.add(str);
            C40319a0.m43495c(true, new C41987b(cls, str, aVar));
        }
    }

    /* renamed from: f */
    public static void m45638f(String str) {
        if (m45640h()) {
            C53133t remove = f113086a.remove(str);
            if (remove != null) {
                remove.mo73822j();
                C48619a aVar = remove.f148245i;
                if (aVar != null) {
                    aVar.destroy();
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action_id", 2);
        bundle.putString("preload_url", str);
        C41901e.m45448a(bundle, C41990e.class, (C1256g) null);
    }

    /* renamed from: g */
    public static C53133t m45639g(Context context, String str) {
        C53133t remove = f113086a.remove(str);
        if (remove != null) {
            remove.mo73823k(context);
            remove.mo73822j();
        }
        return remove;
    }

    /* renamed from: h */
    public static boolean m45640h() {
        return C44594n1.m49045a() || MMApplicationContext.isToolsProcess();
    }
}
