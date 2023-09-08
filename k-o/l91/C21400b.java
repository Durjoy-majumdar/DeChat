package l91;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import e91.C116711b;
import e91.C20554d;
import g91.C20813c;
import h81.C20928j;
import i91.C21062c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import op3.C117877b;
import op3.C117882j;
import te3.C118467t1;
import x91.C118865a;
import x91.C23072e;
import z91.C23462b;

/* renamed from: l91.b */
public final class C21400b {

    /* renamed from: a */
    public final C20554d f60545a;

    /* renamed from: b */
    public final List<C20928j.C20932d> f60546b;

    /* renamed from: c */
    public final boolean f60547c;

    /* renamed from: d */
    public final C21408i f60548d = new C21401a();

    /* renamed from: l91.b$a */
    public class C21401a implements C21408i {
        public C21401a() {
        }

        /* renamed from: a */
        public void mo33527a(Object obj) {
            C21400b.m24151a(C21400b.this, 2, System.currentTimeMillis());
        }

        /* renamed from: b */
        public void mo33528b(Object obj) {
            C21400b.m24151a(C21400b.this, 3, System.currentTimeMillis());
        }

        /* renamed from: c */
        public void mo33529c(Object obj) {
            C21400b.m24151a(C21400b.this, 4, System.currentTimeMillis());
        }

        /* renamed from: d */
        public void mo33530d(Object obj) {
            C21400b.m24151a(C21400b.this, 1, System.currentTimeMillis());
        }
    }

    public C21400b(C20554d dVar) {
        this.f60545a = dVar;
        this.f60546b = new CopyOnWriteArrayList();
        this.f60547c = C20449a.m22049a();
    }

    /* renamed from: a */
    public static void m24151a(C21400b bVar, int i, long j) {
        bVar.getClass();
        Log.m105925i("HABBYGE-MALI.ChatUIFragmentProxy", "sendMsg, mChatUIStatusListener: %d", Integer.valueOf(i));
        if (bVar.f60547c) {
            C20813c.m22810a().mo32508c(i, Long.valueOf(j));
        } else {
            bVar.mo33526c(i, j);
        }
    }

    /* renamed from: b */
    public final C117877b<FragmentActivity, Fragment> mo33525b() {
        C118467t1 g = C21062c.m23249d().mo32776g();
        if (g != null) {
            String h = C116711b.m164583h(g.f354392d.f354001d);
            Log.m105925i("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, topActivityName: %s", h);
            if ("ChattingUI".equals(h)) {
                Log.m105920e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, ChattingUI");
                return null;
            }
        }
        FragmentActivity g2 = C116711b.m164582g();
        if (g2 == null) {
            return null;
        }
        Fragment d = C117467h.m165689d(g2);
        if (d == null) {
            Log.m105920e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, curFragment NULL");
            return null;
        }
        String canonicalName = d.getClass().getCanonicalName();
        Fragment f = C117467h.m165691f(g2, "com.tencent.mm.ui.chatting.ChattingUIFragment");
        String canonicalName2 = f == null ? null : f.getClass().getCanonicalName();
        Log.m105925i("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, fragment: %s, %s", canonicalName, canonicalName2);
        boolean equals = "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(canonicalName);
        boolean equals2 = "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(canonicalName2);
        if (equals || equals2) {
            if (!equals) {
                d = f;
            }
            return C117882j.m166284c(g2, d);
        }
        Log.m105920e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, NOT ChattingUIFragment");
        return null;
    }

    /* renamed from: c */
    public void mo33526c(int i, long j) {
        C118467t1 b;
        int i2 = i;
        long j2 = j;
        if (i2 != 1) {
            if (i2 == 2) {
                Log.m105924i("HABBYGE-MALI.ChatUIFragmentProxy", "onChatUIFragmentResume");
                C117877b<FragmentActivity, Fragment> b2 = mo33525b();
                if (b2 != null) {
                    if (C20449a.f57478l) {
                        int i3 = C20449a.f57479m;
                        if (i3 >= 1) {
                            C20449a.f57478l = false;
                            C20449a.f57479m = 0;
                        } else {
                            C20449a.f57479m = i3 + 1;
                        }
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) b2.mo182596a(0);
                    Fragment fragment = (Fragment) b2.mo182596a(1);
                    if (fragment != null) {
                        ((C21406g) this.f60545a).mo33535f(fragmentActivity, fragment, fragment.getClass().getCanonicalName(), fragment.hashCode(), j, false);
                    }
                }
            } else if (i2 == 3) {
                Log.m105924i("HABBYGE-MALI.ChatUIFragmentProxy", "onChatUIFragmentPause");
                C117877b<FragmentActivity, Fragment> b3 = mo33525b();
                if (b3 != null) {
                    boolean z = C20449a.f57478l;
                    C20449a.f57477k = z;
                    if (!z) {
                        ((ArrayList) C20449a.f57476j).clear();
                    }
                    FragmentActivity fragmentActivity2 = (FragmentActivity) b3.mo182596a(0);
                    Fragment fragment2 = (Fragment) b3.mo182596a(1);
                    if (fragment2 != null) {
                        ((C21406g) this.f60545a).mo33534e(fragmentActivity2, fragment2.getClass().getCanonicalName(), fragment2.hashCode(), j, false);
                    }
                }
            } else if (i2 == 4 && this.f60545a != null) {
                Log.m105924i("HABBYGE-MALI.ChatUIFragmentProxy", "onChatUIFragmentExit");
                C20449a.f57477k = false;
                ((ArrayList) C20449a.f57476j).clear();
                C20449a.f57478l = false;
                C20449a.f57479m = 0;
                C117877b<FragmentActivity, Fragment> b4 = mo33525b();
                if (b4 != null) {
                    FragmentActivity fragmentActivity3 = (FragmentActivity) b4.mo182596a(0);
                    C21406g gVar = (C21406g) this.f60545a;
                    gVar.getClass();
                    C21062c d = C21062c.m23249d();
                    Fragment f = C117467h.m165691f(fragmentActivity3, "com.tencent.mm.ui.chatting.ChattingUIFragment");
                    d.mo32778i("com.tencent.mm.ui.LauncherUI", "com.tencent.mm.ui.chatting.ChattingUIFragment", f == null ? 0 : f.hashCode());
                    Log.m105924i("HABBYGE-MALI.FragmentMonitor", "FragmentMonitor onChattingUIFragmentFinish");
                    if (!(gVar.f60561b == null || (b = C21062c.m23249d().mo32772b("com.tencent.mm.ui.LauncherUI")) == null)) {
                        Log.m105925i("HABBYGE-MALI.HellhoundService", "fragment, onChattingUIFragmentSessionEnd: %s", b.f354396h);
                        Fragment f2 = C116711b.m164581f(C116711b.m164583h(b.f354396h));
                        if (f2 != null) {
                            String canonicalName = f2.getClass().getCanonicalName();
                            Log.m105925i("HABBYGE-MALI.HellhoundService", "chat fragment, onPause: %s", canonicalName);
                            C118865a.f355584a.mo183575c(canonicalName, j2, C23072e.MATCH_PAGE_FINISH);
                            C23462b.m28021f().mo36918b(f2, 2);
                        }
                        b.f354398j = j2;
                        C23462b.m28021f().mo36923h((Activity) null, b, 7, (C118467t1) null);
                    }
                    Iterator it = ((CopyOnWriteArrayList) gVar.f60562c).iterator();
                    while (it.hasNext()) {
                        C20928j.C20932d dVar = (C20928j.C20932d) it.next();
                        dVar.mo32652m(f != null ? f.hashCode() : 0);
                        dVar.mo32650i(f != null ? f.hashCode() : 0);
                    }
                    Fragment f3 = C117467h.m165691f(fragmentActivity3, "com.tencent.mm.ui.conversation.MainUI");
                    ((C21406g) this.f60545a).mo33535f(fragmentActivity3, f3, "com.tencent.mm.ui.conversation.MainUI", f3 == null ? 0 : f3.hashCode(), j, false);
                }
            }
        } else if (this.f60545a != null) {
            Log.m105924i("HABBYGE-MALI.ChatUIFragmentProxy", "onChatUIFragmentEnter");
            C20449a.f57477k = true;
            C117877b<FragmentActivity, Fragment> b5 = mo33525b();
            if (b5 != null) {
                FragmentActivity fragmentActivity4 = (FragmentActivity) b5.mo182596a(0);
                Fragment fragment3 = (Fragment) b5.mo182596a(1);
                Fragment f4 = C117467h.m165691f(fragmentActivity4, "com.tencent.mm.ui.conversation.MainUI");
                ((C21406g) this.f60545a).mo33534e(fragmentActivity4, "com.tencent.mm.ui.conversation.MainUI", f4 == null ? 0 : f4.hashCode(), j, false);
                Iterator it4 = ((CopyOnWriteArrayList) this.f60546b).iterator();
                while (it4.hasNext()) {
                    ((C20928j.C20932d) it4.next()).mo32654o(fragment3);
                }
                ((C21406g) this.f60545a).mo33535f(fragmentActivity4, fragment3, "com.tencent.mm.ui.chatting.ChattingUIFragment", fragment3.hashCode(), j, false);
            }
        }
    }
}
