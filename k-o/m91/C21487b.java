package m91;

import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import g91.C20813c;
import i20.C21043a;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l91.C117467h;
import l91.C21406g;
import n91.C117614e;
import te3.xr4;

/* renamed from: m91.b */
public final class C21487b {

    /* renamed from: e */
    public static C21487b f60812e;

    /* renamed from: a */
    public C21486a f60813a;

    /* renamed from: b */
    public int f60814b = -1;

    /* renamed from: c */
    public final Map<String, Map<String, List<Pair<String, String>>>> f60815c;

    /* renamed from: d */
    public final C21153d f60816d = new C21488a();

    /* renamed from: m91.b$a */
    public class C21488a implements C21153d {
        public C21488a() {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if ("onPostOpen".equals(str2)) {
                if (objArr.length >= 1) {
                    Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, onPostOpen: %b", objArr[0]);
                    C21487b.this.mo33652d(0, System.currentTimeMillis());
                    C21487b.m24298a(C21487b.this, obj, true);
                }
            } else if ("onPostClose".equals(str2)) {
                Log.m105924i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, onPostClose:");
                C21487b.this.mo33652d(1, System.currentTimeMillis());
                C21487b.m24298a(C21487b.this, obj, false);
            }
        }
    }

    public C21487b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onPostOpen", "(Z)V"));
        arrayList.add(Pair.create("onPostClose", "()V"));
        HashMap hashMap = new HashMap();
        hashMap.put("com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", arrayList);
        HashMap hashMap2 = new HashMap();
        this.f60815c = hashMap2;
        hashMap2.put("com/tencent/mm/ui/MoreTabUI$", hashMap);
    }

    /* renamed from: a */
    public static void m24298a(C21487b bVar, Object obj, boolean z) {
        bVar.getClass();
        xr4 xr4 = new xr4();
        xr4.f354547d = z ? "onStoryOpen" : "onStoryClose";
        xr4.f354555o = System.currentTimeMillis();
        xr4.f354548e = xr4.f354547d;
        Fragment e = C117467h.m165690e("com.tencent.mm.ui.LauncherUI");
        xr4.f354550g = e == null ? "MoreTabUI" : e.getClass().getSimpleName();
        xr4.f354554n = e == null ? -1 : e.hashCode();
        String str = xr4.f354550g;
        xr4.f354549f = str;
        if (obj != null) {
            str = obj.getClass().getName();
        }
        xr4.f354551h = str;
        xr4.f354552i = 10;
        xr4.f354561u = 0;
        Map<String, WeakReference<View>> map = C117614e.f351842a;
        C117614e.f351846e.mo33861a((View) null, xr4);
    }

    /* renamed from: c */
    public static C21487b m24299c() {
        if (f60812e == null) {
            synchronized (C21487b.class) {
                if (f60812e == null) {
                    f60812e = new C21487b();
                }
            }
        }
        return f60812e;
    }

    /* renamed from: b */
    public void mo33651b(FragmentActivity fragmentActivity) {
        Log.m105924i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, endHook");
        Fragment f = C117467h.m165691f(fragmentActivity, "com.tencent.mm.ui.MoreTabUI");
        if (f == null) {
            Log.m105920e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, curFragment == null");
            return;
        }
        String canonicalName = f.getClass().getCanonicalName();
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            Log.m105921e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook FALSE: %s", canonicalName);
            return;
        }
        Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook real: %s", canonicalName);
        C21043a.m23197h().mo32764r(this.f60815c, this.f60816d);
    }

    /* renamed from: d */
    public final void mo33652d(int i, long j) {
        this.f60814b = i;
        C21486a aVar = this.f60813a;
        if (aVar != null) {
            C21406g.C21407a aVar2 = (C21406g.C21407a) aVar;
            aVar2.getClass();
            Log.m105925i("HABBYGE-MALI.FragmentMonitor", "mHijackCallback, event: %d", Integer.valueOf(i));
            C21406g gVar = C21406g.this;
            if (gVar.f60563d) {
                C20813c.m22810a().mo32508c(i == 0 ? 300 : i == 1 ? 301 : -1, Long.valueOf(j));
            } else {
                gVar.mo33532b(i, j);
            }
        }
    }

    /* renamed from: e */
    public void mo33653e(FragmentActivity fragmentActivity, C21486a aVar) {
        if (!C20449a.m22052d()) {
            Log.m105928w("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, startHook, fetchHellhoundConfig: FALSE");
            return;
        }
        Log.m105924i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook");
        Fragment f = C117467h.m165691f(fragmentActivity, "com.tencent.mm.ui.MoreTabUI");
        if (f == null) {
            Log.m105920e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook: curFragment == null");
            return;
        }
        String canonicalName = f.getClass().getCanonicalName();
        Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook-2: %s", canonicalName);
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook Fail: %s", canonicalName);
            return;
        }
        this.f60813a = aVar;
        Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook real: %s", canonicalName);
        C21043a.m23197h().mo32760n(this.f60815c, this.f60816d);
    }
}
