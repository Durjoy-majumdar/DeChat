package r91;

import aa1.C91980d;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e91.C116711b;
import e91.C20554d;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import l91.C21406g;
import o91.C21787e;
import p217oq.C11716d;
import s91.C22326f;
import s91.C22329g;
import s91.C22338j;
import s91.C22353o;
import t91.C22457b;
import t91.C22466j;
import u91.C22618a;
import u91.C22623c;

/* renamed from: r91.b */
public final class C22218b {

    /* renamed from: a */
    public WeakReference<Fragment> f62954a;

    /* renamed from: b */
    public C20554d f62955b;

    /* renamed from: c */
    public C22623c f62956c;

    /* renamed from: d */
    public C22623c f62957d;

    /* renamed from: e */
    public C22623c f62958e;

    /* renamed from: a */
    public final void mo35349a(FragmentActivity fragmentActivity, Fragment fragment, long j, int i) {
        C22353o oVar;
        C22353o oVar2;
        C22353o oVar3;
        String name = fragment.getClass().getName();
        Log.m105918d("HABBYGE-MALI.FinderHomeMonitor", "callbackOnFragmentPause: " + name);
        String h = C116711b.m164583h(name);
        C22623c cVar = this.f62956c;
        if (cVar != null) {
            if (cVar == null) {
                C87412m.m108603p("statyTimeStatic");
                throw null;
            } else if (C87412m.m108589b(cVar.f65065b, h)) {
                C22623c cVar2 = this.f62956c;
                if (cVar2 != null) {
                    cVar2.f65068e = System.currentTimeMillis();
                    C22623c cVar3 = this.f62956c;
                    if (cVar3 != null) {
                        cVar3.f65066c = cVar3.f65068e - cVar3.f65067d;
                        cVar3.f65069f = C116711b.m164580e();
                        C22623c cVar4 = this.f62956c;
                        if (cVar4 != null) {
                            cVar4.f65070g = "143";
                            C22618a.f65058a.mo35741b(cVar4);
                        } else {
                            C87412m.m108603p("statyTimeStatic");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("statyTimeStatic");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("statyTimeStatic");
                    throw null;
                }
            }
        }
        if (mo35352d(name)) {
            C22466j jVar = C22466j.f63621a;
            C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C21787e eVar = C22466j.f63629i;
            eVar.getClass();
            String name2 = fragment.getClass().getName();
            Log.m105918d("HABBYGE-MALI.FragmentFeedStatistics", "stop: fragment:" + name2 + ", event=" + i);
            int hashCode = name2.hashCode();
            if (hashCode != -1817116115) {
                if (hashCode != 839202232) {
                    if (hashCode == 1218751173 && name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment") && (oVar3 = eVar.f61744a) != null) {
                        ((C22326f) oVar3).mo35474d();
                    }
                } else if (name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment") && (oVar2 = eVar.f61745b) != null) {
                    ((C22329g) oVar2).mo35474d();
                }
            } else if (name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment") && (oVar = eVar.f61746c) != null) {
                ((C22338j) oVar).mo35474d();
            }
        } else if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment", name)) {
            C22466j.m26191l(fragmentActivity, fragment, j, i);
        }
        C20554d dVar = this.f62955b;
        if (dVar != null) {
            ((C21406g) dVar).mo33534e(fragmentActivity, name, fragment.hashCode(), j, true);
        }
    }

    /* renamed from: b */
    public final void mo35350b(FragmentActivity fragmentActivity, Fragment fragment, long j, int i) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.f62954a = new WeakReference<>(fragment);
        String name = fragment.getClass().getName();
        Log.m105918d("HABBYGE-MALI.FinderHomeMonitor", "callbackOnFragmentResume: " + name);
        C22623c cVar = new C22623c((String) null, (String) null, 0, 0, 0, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 4095, (C8480h) null);
        this.f62956c = cVar;
        cVar.f65064a = C91980d.vx0().mo84751Wb();
        C22623c cVar2 = this.f62956c;
        if (cVar2 != null) {
            cVar2.f65065b = C116711b.m164583h(name);
            C22623c cVar3 = this.f62956c;
            if (cVar3 != null) {
                cVar3.f65067d = System.currentTimeMillis();
                C22623c cVar4 = this.f62956c;
                if (cVar4 != null) {
                    cVar4.f65070g = "143";
                    boolean z = false;
                    cVar4.f65071h = 0;
                    C22623c cVar5 = this.f62957d;
                    if (cVar5 != null) {
                        z = true;
                    }
                    if (z) {
                        if (cVar5 != null) {
                            cVar5.f65073j = C11716d.f34294a;
                        } else {
                            C87412m.m108603p("statyTimeStaticHome");
                            throw null;
                        }
                    }
                    if (mo35352d(name)) {
                        C22466j jVar = C22466j.f63621a;
                        C87412m.m108594g(fragmentActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C21787e eVar = C22466j.f63629i;
                        eVar.getClass();
                        String name2 = fragment.getClass().getName();
                        Log.m105918d("HABBYGE-MALI.FragmentFeedStatistics", "start: fragment:" + name2 + ", event=" + i);
                        int hashCode = name2.hashCode();
                        if (hashCode != -1817116115) {
                            if (hashCode != 839202232) {
                                if (hashCode == 1218751173 && name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment")) {
                                    if (eVar.f61744a == null) {
                                        eVar.f61744a = new C22326f(fragmentActivity2);
                                    }
                                    C22353o oVar = eVar.f61744a;
                                    if (oVar != null) {
                                        ((C22326f) oVar).mo35473c();
                                    }
                                }
                            } else if (name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment")) {
                                if (eVar.f61745b == null) {
                                    eVar.f61745b = new C22329g(fragmentActivity2);
                                }
                                C22353o oVar2 = eVar.f61745b;
                                if (oVar2 != null) {
                                    ((C22329g) oVar2).mo35473c();
                                }
                            }
                        } else if (name2.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment")) {
                            if (eVar.f61746c == null) {
                                eVar.f61746c = new C22338j(fragmentActivity2);
                            }
                            C22353o oVar3 = eVar.f61746c;
                            if (oVar3 != null) {
                                ((C22338j) oVar3).mo35473c();
                            }
                        }
                    } else {
                        int i2 = i;
                        if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment", name)) {
                            C22466j.m26187h(fragmentActivity, fragment, j, i);
                        }
                    }
                    C20554d dVar = this.f62955b;
                    if (dVar != null) {
                        ((C21406g) dVar).mo33535f(fragmentActivity, fragment, name, fragment.hashCode(), j, true);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("statyTimeStatic");
                throw null;
            }
            C87412m.m108603p("statyTimeStatic");
            throw null;
        }
        C87412m.m108603p("statyTimeStatic");
        throw null;
    }

    /* renamed from: c */
    public final Fragment mo35351c(Activity activity) {
        Fragment a = C22466j.m26184a();
        if (a != null) {
            return a;
        }
        C22457b bVar = C22466j.f63626f;
        bVar.getClass();
        String name = activity != null ? activity.getClass().getName() : null;
        if (name != null && (C87412m.m108589b(name, "com.tencent.mm.plugin.finder.ui.FinderHomeUI") || C87412m.m108589b(name, "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI") || C87412m.m108589b(name, "com.tencent.mm.plugin.finder.ui.FinderConversationUI"))) {
            return bVar.mo35599b((Object) null, -1);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo35352d(String str) {
        return C87412m.m108589b("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment", str);
    }

    /* renamed from: e */
    public final void mo35353e(FragmentActivity fragmentActivity, long j, boolean z) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Fragment c = mo35351c(fragmentActivity);
        StringBuilder sb = new StringBuilder();
        sb.append("switch2Page: ");
        sb.append(z ? "onResumed" : "onPaused");
        sb.append(", ");
        sb.append(c != null ? c.getClass().getName() : null);
        Log.m105918d("HABBYGE-MALI.FinderHomeMonitor", sb.toString());
        if (c != null) {
            if (z) {
                mo35350b(fragmentActivity, c, j, 0);
            } else {
                mo35349a(fragmentActivity, c, j, 1);
            }
        }
    }
}
