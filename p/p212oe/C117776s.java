package p212oe;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114486j0;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1177ce.C113287a;
import p1177ce.C113314g;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p269xe.C91179e;
import p269xe.e$b$a$$n;
import p285zh.c$$f;
import p329d3.C58104c;
import p970gg.C87186a;
import p981ie.C117187w;

/* renamed from: oe.s */
public class C117776s extends C114467i {

    /* renamed from: q */
    public List<C117187w.C117189b> f352271q;

    /* renamed from: r */
    public C80401d f352272r;

    /* renamed from: s */
    public final Runnable f352273s = new s$$g(this);

    public C117776s(C113314g gVar, String str) {
        super(gVar, str);
    }

    /* renamed from: A */
    public boolean mo182525A() {
        C113287a aVar = this.f343163l;
        if (aVar != null) {
            long j = this.f343160i.getLong("extra_report_during", Math.max(C117750b.f352133l, 10000));
            return j > 0 && aVar.f338976n > j;
        }
    }

    /* renamed from: a */
    public void mo173658a() {
        super.mo173658a();
        this.f352272r = null;
        synchronized (this.f352273s) {
            if (this.f352271q != null) {
                Log.m105924i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " clear DeepBg stat");
                ((ArrayList) this.f352271q).clear();
            }
        }
    }

    /* renamed from: b */
    public void mo173659b() {
        if (this.f343162k != null && "canary".equals(this.f343167p)) {
            mo173664h(new s$$h(this));
        }
    }

    /* renamed from: f */
    public void mo173662f() {
        C113287a aVar;
        super.mo173662f();
        mo173661e(C117754c0.class);
        mo173661e(C117778u.class);
        mo173661e(C117775r.class);
        mo173661e(C114486j0.class);
        if (!((HashMap) this.f343158g).isEmpty()) {
            for (Map.Entry entry : ((HashMap) this.f343158g).entrySet()) {
                Class cls = (Class) entry.getKey();
                for (C114490k0.C114491a.C114492a aVar2 : (List) entry.getValue()) {
                    if (((C114436a.C114440d) aVar2.f343205a).f343202a >= this.f343166o) {
                        List list = (List) ((HashMap) this.f343159h).get(((C114436a.C114440d) aVar2.f343207c).f343108e);
                        if (list == null) {
                            list = new ArrayList();
                            ((HashMap) this.f343159h).put(((C114436a.C114440d) aVar2.f343207c).f343108e, list);
                        }
                        list.add(new C58104c(cls, aVar2));
                    }
                }
            }
        }
        if (this.f352272r != null) {
            Log.m105924i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " remove DeepBg");
            AppDeepBackgroundOwner.INSTANCE.removeLifecycleCallback(this.f352272r);
        }
        C113314g gVar = this.f343162k;
        if (gVar != null) {
            gVar.f339059f.removeCallbacks(this.f352273s);
        }
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv() || BuildInfo.IS_FLAVOR_RED) {
            if ("canary".equals(this.f343167p) && (aVar = this.f343163l) != null && !aVar.mo165844h() && aVar.mo165841e() >= 5) {
                List<String> list2 = C91179e.C91181b.C91182a.f261437a;
                C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k = mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class);
                if (k != null && k.mo173690b()) {
                    mo173664h(new e$b$a$$n(k, this));
                }
            }
            if (this.f343163l != null) {
                Log.m105924i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " #finish: " + this.f343167p + ", minute = " + this.f343163l.mo165841e() + ", cpuPrc = " + mo173666j() + ", cpuDev = " + mo173669m() + ", cpuNor = " + mo173672p());
            }
        }
    }

    /* renamed from: t */
    public C114467i mo173676t() {
        super.mo173676t();
        mo173675s(b$$g.class);
        return this;
    }

    /* renamed from: v */
    public void mo173679v() {
        Log.m105924i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " #start: " + this.f343167p + ", module = " + mo182526y());
        super.mo173679v();
        synchronized (this.f352273s) {
            if (this.f352271q != null) {
                C80401d dVar = this.f352272r;
                if (dVar != null) {
                    AppDeepBackgroundOwner.INSTANCE.removeLifecycleCallback(dVar);
                }
                ((ArrayList) this.f352271q).clear();
                List<C117187w.C117189b> list = this.f352271q;
                AppDeepBackgroundOwner appDeepBackgroundOwner = AppDeepBackgroundOwner.INSTANCE;
                ((ArrayList) list).add(0, new C117187w.C117189b(String.valueOf(appDeepBackgroundOwner.isBackground() ? 2 : 1)));
                this.f352272r = new s$$k(this);
                Log.m105924i("MicroMsg.battery.MMCompositeMonitors", hashCode() + " watch DeepBg");
                appDeepBackgroundOwner.addLifecycleCallback(this.f352272r);
            }
            C113314g gVar = this.f343162k;
            if (gVar != null) {
                gVar.f339059f.postDelayed(this.f352273s, 300000);
            }
        }
    }

    /* renamed from: w */
    public C114490k0.C114491a<?> mo173680w(Class<? extends C114490k0.C114491a<?>> cls) {
        C113314g gVar;
        float f;
        if (cls == b$$g.class) {
            b$$g b__g = new b$$g();
            b__g.f352150d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(C117750b.f352142u));
            b__g.f352151e = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(C87186a.f252848b));
            try {
                Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 > 0) {
                        f = (((float) intExtra) * 100.0f) / ((float) intExtra2);
                        b__g.f352152f = C114490k0.C114491a.C114494b.C114497b.m161112b(Float.valueOf(f));
                        return b__g;
                    }
                }
            } catch (Exception unused) {
            }
            f = -1.0f;
            b__g.f352152f = C114490k0.C114491a.C114494b.C114497b.m161112b(Float.valueOf(f));
            return b__g;
        } else if (cls == c$$f.class) {
            return c$$f.m167932b();
        } else {
            C114490k0.C114491a<?> w = super.mo173680w(cls);
            if ((w instanceof C116947b.C116948a) && Build.VERSION.SDK_INT >= 24 && (gVar = this.f343162k) != null) {
                C117774q.m166123f(gVar.mo165879a());
            }
            return w;
        }
    }

    /* renamed from: x */
    public C114490k0.C114491a.C114503c mo173681x(Class<? extends C114490k0.C114491a<?>> cls) {
        Class cls2 = C114536x.class;
        if (cls == b$$h.class) {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar = new C114490k0.C114491a.C114503c("dev-light", this.f343162k.f339059f, new s$$a(this));
            ((HashMap) this.f343156e).put(cls, cVar);
            return cVar;
        } else if (cls == b$$k.class) {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar2 = new C114490k0.C114491a.C114503c("net-radio-sig", this.f343162k.f339059f, new s$$b(this));
            ((HashMap) this.f343156e).put(cls, cVar2);
            return cVar2;
        } else if (cls == b$$l.class) {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar3 = new C114490k0.C114491a.C114503c("net-wifi-sig", this.f343162k.f339059f, new s$$c(this));
            ((HashMap) this.f343156e).put(cls, cVar3);
            return cVar3;
        } else if (cls == b$$j.class) {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar4 = new C114490k0.C114491a.C114503c("oppo-thermal", this.f343162k.f339059f, new s$$d());
            ((HashMap) this.f343156e).put(cls, cVar4);
            return cVar4;
        } else if (cls == b$$i.class) {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar5 = new C114490k0.C114491a.C114503c("oppo-temp", this.f343162k.f339059f, new s$$e());
            ((HashMap) this.f343156e).put(cls, cVar5);
            return cVar5;
        } else if (cls != b$$e.class) {
            return super.mo173681x(cls);
        } else {
            if (((C114536x) mo173670n(cls2)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar6 = new C114490k0.C114491a.C114503c("batt-currAvg", this.f343162k.f339059f, new s$$f(this));
            ((HashMap) this.f343156e).put(cls, cVar6);
            return cVar6;
        }
    }

    /* renamed from: y */
    public String mo182526y() {
        return this.f343160i.getString("extra_module_name", "");
    }

    /* renamed from: z */
    public boolean mo182527z() {
        C114490k0.C114491a.C114492a<C116947b.C116948a> k;
        if (this.f343163l == null || (k = mo173667k(C116947b.C116948a.class)) == null) {
            return false;
        }
        RECORD record = k.f343205a;
        return ((C116947b.C116948a) record).f350465d != null ? C116951c.m165015p((double) ((((float) ((C116947b.C116948a) record).f350465d.f350511a) * 1.0f) / ((float) this.f343163l.f338976n)), 2) >= 0.800000011920929d : C116947b.C116948a.C116950b.m164999b((C116947b.C116948a) record, (C116947b.C116948a) k.f343206b);
    }
}
