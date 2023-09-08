package l91;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import d91.C20452d;
import e91.C20552a;
import e91.C20554d;
import e91.C20555e;
import g91.C20813c;
import h81.C20928j;
import i91.C21062c;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m91.C21486a;
import m91.C21487b;
import te3.C118454oq1;
import te3.C118457pq1;
import te3.C118467t1;
import te3.fh4;

/* renamed from: l91.g */
public final class C21406g implements C20555e, C20554d {

    /* renamed from: a */
    public final C21405f f60560a = new C21405f(this);

    /* renamed from: b */
    public C20928j.C20930b f60561b;

    /* renamed from: c */
    public List<C20928j.C20932d> f60562c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final boolean f60563d = C20449a.m22049a();

    /* renamed from: e */
    public final C21486a f60564e = new C21407a();

    /* renamed from: l91.g$a */
    public class C21407a implements C21486a {
        public C21407a() {
        }
    }

    /* renamed from: c */
    public static boolean m24162c(FragmentActivity fragmentActivity, String str) {
        boolean z;
        try {
            Fragment f = C117467h.m165691f(fragmentActivity, str);
            Field declaredField = Class.forName("com.tencent.mm.ui.MoreTabUI").getDeclaredField("storyGallery");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(f);
            Field declaredField2 = Class.forName("com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView").getDeclaredField("mIsActive");
            declaredField2.setAccessible(true);
            z = ((Boolean) declaredField2.get(obj)).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        Log.m105919d("HABBYGE-MALI.FragmentMonitor", "isStoryGalleryActive: %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public final void mo33531a(FragmentActivity fragmentActivity, String str, int i, long j) {
        if (fragmentActivity == null && str == null) {
            C118467t1 g = C21062c.m23249d().mo32776g();
            if (g != null) {
                String str2 = g.f354392d.f354001d;
                C20928j.C20930b bVar = this.f60561b;
                if (bVar != null) {
                    ((C20452d) bVar).mo31995a("Biz", str2, i, j);
                }
            }
        } else if (fragmentActivity != null) {
            String canonicalName = fragmentActivity.getClass().getCanonicalName();
            Log.m105925i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", canonicalName, str);
            C21062c.m23249d().mo32778i(canonicalName, str, i);
            if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                C21487b c = C21487b.m24299c();
                c.mo33651b(fragmentActivity);
                int i2 = c.f60814b;
                if (i2 == 1 || i2 == -1) {
                    Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                } else if (i2 == 0) {
                    Log.m105924i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                    c.f60814b = -1;
                    C20928j.C20930b bVar2 = this.f60561b;
                    if (bVar2 != null) {
                        ((C20452d) bVar2).mo31997c(3, j);
                        return;
                    }
                    return;
                }
            }
            C20928j.C20930b bVar3 = this.f60561b;
            if (bVar3 != null) {
                ((C20452d) bVar3).mo31995a(canonicalName, str, i, j);
            }
        }
    }

    /* renamed from: b */
    public final void mo33532b(int i, long j) {
        C20928j.C20930b bVar;
        Log.m105925i("HABBYGE-MALI.FragmentMonitor", "_onStoryCallback: %d", Integer.valueOf(i));
        if (i == 0) {
            C20928j.C20930b bVar2 = this.f60561b;
            if (bVar2 != null) {
                ((C20452d) bVar2).mo31998d(0, j);
            }
        } else if (i == 1 && (bVar = this.f60561b) != null) {
            ((C20452d) bVar).mo31997c(1, j);
        }
    }

    /* renamed from: d */
    public final void mo33533d(FragmentActivity fragmentActivity, Fragment fragment, String str, int i, long j) {
        C20928j.C20930b bVar;
        Bundle arguments;
        if (!(fragment == null || (arguments = fragment.getArguments()) == null)) {
            String string = arguments.getString("Chat_User");
            if (!TextUtils.isEmpty(string)) {
                Log.m105919d("HABBYGE-MALI.FragmentBundleDao", "FragmentBundleDao, putBundle: %s", string);
                C117466c.m165685b("Chat_User", string);
            }
        }
        if (fragmentActivity == null && fragment == null && str == null) {
            C118467t1 g = C21062c.m23249d().mo32776g();
            if (g != null) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "onFragmentResume -> _onResumeForBiz --2");
                C20928j.C20930b bVar2 = this.f60561b;
                if (bVar2 != null) {
                    ((C20452d) bVar2).mo31996b("Biz", g.f354392d.f354001d, i, j);
                }
            }
        } else if (fragmentActivity != null) {
            String canonicalName = fragmentActivity.getClass().getCanonicalName();
            Log.m105925i("HABBYGE-MALI.FragmentMonitor", "_onFragmentResume: %s, %s", canonicalName, str);
            C21062c.m23249d().mo32779j(canonicalName, str, i);
            if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
                C21487b c = C21487b.m24299c();
                c.mo33653e(fragmentActivity, this.f60564e);
                int i2 = c.f60814b;
                if (i2 == 1 || i2 == -1) {
                    Log.m105924i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
                } else if (i2 == 0) {
                    boolean c2 = m24162c(fragmentActivity, str);
                    Log.m105925i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", Boolean.valueOf(c2));
                    if (c2 && (bVar = this.f60561b) != null) {
                        ((C20452d) bVar).mo31998d(2, j);
                        return;
                    }
                    return;
                }
            }
            C20928j.C20930b bVar3 = this.f60561b;
            if (bVar3 != null) {
                ((C20452d) bVar3).mo31996b(canonicalName, str, i, j);
            }
        }
    }

    /* renamed from: e */
    public void mo33534e(FragmentActivity fragmentActivity, String str, int i, long j, boolean z) {
        if (!z) {
            mo33531a(fragmentActivity, str, i, j);
        } else if (this.f60563d) {
            C118454oq1 oq12 = new C118454oq1();
            fh4 fh4 = new fh4();
            oq12.f354210d = fh4;
            if (fragmentActivity != null) {
                fh4.f354001d = fragmentActivity.getClass().getCanonicalName();
                oq12.f354210d.f354002e = fragmentActivity.hashCode();
                oq12.f354210d.f354003f = j;
            }
            oq12.f354211e = str;
            oq12.f354213g = i;
            oq12.f354212f = j;
            if (fragmentActivity != null && "com.tencent.mm.ui.MoreTabUI".equals(str)) {
                Log.m105925i("HABBYGE-MALI.FragmentMonitor", "stopStoryMonitor: %s", str);
                C21487b.m24299c().mo33651b(fragmentActivity);
            }
            C20813c.m22810a().mo32508c(6, oq12);
        } else {
            mo33531a(fragmentActivity, str, i, j);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60562c).iterator();
        while (it.hasNext()) {
            ((C20928j.C20932d) it.next()).mo32652m(i);
        }
    }

    /* renamed from: f */
    public void mo33535f(FragmentActivity fragmentActivity, Fragment fragment, String str, int i, long j, boolean z) {
        Bundle arguments;
        if (fragment != null) {
            C20552a.m22323a().mo32135d(fragment);
        }
        if (!z) {
            mo33533d(fragmentActivity, fragment, str, i, j);
        } else if (this.f60563d) {
            C118457pq1 pq12 = new C118457pq1();
            if (!(fragment == null || (arguments = fragment.getArguments()) == null)) {
                pq12.f354240e = arguments.getString("Chat_User");
            }
            pq12.f354242g = str;
            pq12.f354245j = i;
            pq12.f354241f = true;
            pq12.f354244i = j;
            fh4 fh4 = new fh4();
            pq12.f354239d = fh4;
            if (fragmentActivity != null) {
                fh4.f354001d = fragmentActivity.getClass().getCanonicalName();
                pq12.f354239d.f354002e = fragmentActivity.hashCode();
                pq12.f354239d.f354003f = j;
            }
            if (fragmentActivity != null) {
                pq12.f354243h = m24162c(fragmentActivity, str);
                if ("com.tencent.mm.ui.MoreTabUI".equals(str)) {
                    C21487b.m24299c().mo33653e(fragmentActivity, this.f60564e);
                }
            }
            C20813c.m22810a().mo32508c(5, pq12);
        } else {
            mo33533d(fragmentActivity, fragment, str, i, j);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60562c).iterator();
        while (it.hasNext()) {
            ((C20928j.C20932d) it.next()).mo32637C(fragmentActivity, fragment);
        }
    }
}
