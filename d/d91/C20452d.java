package d91;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import da1.C20455a;
import e91.C116711b;
import e91.C20552a;
import h81.C20928j;
import i91.C21061b;
import i91.C21062c;
import java.lang.ref.WeakReference;
import java.util.Map;
import l91.C21402d;
import t91.C22466j;
import t91.C64208c;
import te3.C118463s1;
import te3.C118467t1;
import te3.C64588nq1;
import x91.C118865a;
import x91.C23072e;
import z91.C23462b;

/* renamed from: d91.d */
public class C20452d implements C20928j.C20930b {
    /* renamed from: a */
    public void mo31995a(String str, String str2, int i, long j) {
        Log.m105925i("HABBYGE-MALI.HellhoundService", "setFragmentListener, onPause: %s, %s", str, str2);
        C23462b f = C23462b.m28021f();
        f.getClass();
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, notifyToBizExit: FALSE");
        } else if (!C115411b.m162228k()) {
            Log.m105924i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentExit, NOT 104-Biz Session !!");
        } else if ("Biz".equals(str)) {
            Log.m105925i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentExit: %s", str2);
            if (str2.contains("BizTimeLineUI")) {
                C113264b.m155055a(str2, i, j);
            } else if (str2.contains("BizConversationUI")) {
                C113264b.m155055a(str2, i, j);
            }
        }
        C118467t1 b = C21062c.m23249d().mo32772b(str);
        if (b != null) {
            String str3 = b.f354396h;
            if (str3 == null || str3.isEmpty()) {
                b.f354396h = str2;
            } else {
                String h = C116711b.m164583h(b.f354396h);
                String h2 = C116711b.m164583h(str2);
                if (h == null || !h.equals(h2)) {
                    b.f354396h = str2;
                }
            }
            b.f354398j = j;
            Log.m105925i("HABBYGE-MALI.HellhoundService", "fragment, out: %s", b.f354396h);
            C64588nq1 a = C21402d.m24158a();
            if (a == null) {
                a = new C64588nq1();
            }
            a.f184528d = str2;
            C21402d.m24159b(a);
            String h3 = C116711b.m164583h(b.f354396h);
            Fragment f2 = C116711b.m164588m(h3) ? C116711b.m164581f(h3) : C64208c.m75547a(h3) ? C22466j.m26184a() : null;
            if (f2 != null) {
                String canonicalName = f2.getClass().getCanonicalName();
                Log.m105925i("HABBYGE-MALI.HellhoundService", "fragment, onPause: %s", canonicalName);
                C118865a.f355584a.mo183575c(canonicalName, j, C23072e.MATCH_PAGE_FINISH);
                C23462b.m28021f().mo36918b(f2, 2);
            }
            f.mo36923h((Activity) null, b, 5, (C118467t1) null);
        }
    }

    /* renamed from: b */
    public void mo31996b(String str, String str2, int i, long j) {
        Log.m105925i("HABBYGE-MALI.HellhoundService", "setFragmentListener, onResume: %s, %s", str, str2);
        WeakReference<Object> weakReference = C20552a.m22323a().f57845c;
        Fragment fragment = null;
        Object obj = weakReference == null ? null : weakReference.get();
        Map<Integer, WeakReference<Activity>> map = C20455a.f57485a;
        if (obj != null) {
            C20455a.f57486b = new WeakReference<>(obj);
        }
        C23462b f = C23462b.m28021f();
        f.getClass();
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, notifyToBizEnter: FALSE");
        } else if (!C115411b.m162228k()) {
            Log.m105924i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentEnter, NOT 104-Biz Session !!");
        } else if ("Biz".equals(str)) {
            Log.m105925i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentEnter: %s -> %s", str2, "com.tencent.mm.ui.chatting.ChattingUIFragment");
            if (!str2.contains("BizTimeLineUI")) {
                str2.contains("BizConversationUI");
            }
            C113264b.m155055a("com.tencent.mm.ui.chatting.ChattingUIFragment", i, j);
        }
        C118467t1 g = C21062c.m23249d().mo32776g();
        if (g != null) {
            String str3 = g.f354395g;
            if (str3 == null || str3.isEmpty()) {
                g.f354395g = str2;
                g.f354399n = i;
            } else {
                String h = C116711b.m164583h(g.f354395g);
                String h2 = C116711b.m164583h(str2);
                if (h == null || !h.equals(h2)) {
                    g.f354395g = str2;
                    g.f354399n = i;
                }
            }
            g.f354398j = j;
            C118463s1 s1Var = C21061b.m23247a().f354474e;
            C118467t1 t1Var = s1Var == null ? null : s1Var.f354325f;
            Object[] objArr = new Object[2];
            objArr[0] = g.f354395g;
            objArr[1] = TextUtils.isEmpty(g.f354396h) ? t1Var == null ? "Null" : t1Var.f354392d.f354001d : g.f354396h;
            Log.m105925i("HABBYGE-MALI.HellhoundService", "fragment, in: %s, %s", objArr);
            C64588nq1 a = C21402d.m24158a();
            if (a == null) {
                a = new C64588nq1();
            }
            a.f184529e = str2;
            C21402d.m24159b(a);
            if (!TextUtils.isEmpty(g.f354396h)) {
                t1Var = g;
            }
            f.mo36923h((Activity) null, g, 4, t1Var);
            String h3 = C116711b.m164583h(g.f354395g);
            if (C116711b.m164588m(h3)) {
                fragment = C116711b.m164581f(h3);
            } else if (C64208c.m75547a(h3)) {
                fragment = C22466j.m26184a();
            }
            if (fragment != null) {
                String canonicalName = fragment.getClass().getCanonicalName();
                Log.m105925i("HABBYGE-MALI.HellhoundService", "fragment, onResume: %s", canonicalName);
                C118865a.f355584a.mo183575c(canonicalName, j, C23072e.MATCH_PAGE_RESUME);
                C23462b.m28021f().mo36918b(fragment, 0);
            }
        }
    }

    /* renamed from: c */
    public void mo31997c(int i, long j) {
        Fragment f = C116711b.m164581f("MoreTabUI");
        if (f != null) {
            Log.m105924i("HABBYGE-MALI.HellhoundService", "onStoryGalleryViewPause: MoreTabUI");
            C118865a.f355584a.mo183575c("com.tencent.mm.ui.MoreTabUI", j, C23072e.MATCH_PAGE_FINISH);
            C23462b.m28021f().mo36918b(f, 2);
        }
        C23462b.m28021f().mo36925j(9, i, j);
    }

    /* renamed from: d */
    public void mo31998d(int i, long j) {
        C23462b.m28021f().mo36925j(8, i, j);
        Fragment f = C116711b.m164581f("MoreTabUI");
        if (f != null) {
            Log.m105924i("HABBYGE-MALI.HellhoundService", "onStoryGalleryViewResume: MoreTabUI");
            C118865a.f355584a.mo183575c("com.tencent.mm.ui.MoreTabUI", j, C23072e.MATCH_PAGE_RESUME);
            C23462b.m28021f().mo36918b(f, 0);
        }
    }
}
