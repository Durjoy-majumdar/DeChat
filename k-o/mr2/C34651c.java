package mr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hf3.C98449c;
import hi2.C32927f;
import hi2.C32929g;
import hi2.C98453h;
import iv2.C33419c;
import java.util.Iterator;
import sx3.C110818d0;
import sx3.C64197v;
import zt3.C119157j;

/* renamed from: mr2.c */
public final class C34651c implements Runnable {

    /* renamed from: d */
    public static final C34651c f93173d = new C34651c();

    public final void run() {
        long j;
        Iterator<T> it;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
        SnsMethodCalculate.markStartTimeMs("access$getLocalTest$p", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        long j2 = C34652d.f93174a;
        SnsMethodCalculate.markEndTimeMs("access$getLocalTest$p", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        if (j2 > 0) {
            SnsMethodCalculate.markStartTimeMs("access$getLocalTest$p", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
            j = C34652d.f93174a;
            SnsMethodCalculate.markEndTimeMs("access$getLocalTest$p", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        } else {
            j = ((long) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_post_media_clean_interval_day, 3)) * 86400000;
        }
        Log.m105924i("MicroMsg.SnsPostMediaCleanManager", "triggerClean success,interval:" + j);
        ((C98449c) C86312j.m106911c(C98449c.class)).md0(j);
        SnsMethodCalculate.markStartTimeMs("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        SnsMethodCalculate.markStartTimeMs("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        String a = C33419c.f90549a.mo59133a();
        C86009m1[] u = new C86009m1(a).mo119984u();
        int i = 0;
        int i2 = 9;
        if ((u != null ? u.length : 0) > 9) {
            Iterable<C86001b0> t = C86013q1.m106459t(a, false);
            if (t != null) {
                Iterator<T> it4 = C110818d0.m150943o0(C110818d0.m150953y0(t), new C34650b()).iterator();
                while (it4.hasNext()) {
                    T next = it4.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        C86001b0 b0Var = (C86001b0) next;
                        if (i > i2) {
                            it = it4;
                            if (System.currentTimeMillis() - b0Var.f250475e >= j) {
                                String str = a + b0Var.f250472b;
                                Log.m105924i("MicroMsg.SnsPostMediaCleanManager", "cleanSnsDraftDir delete file path:" + str);
                                C32927f fVar = C32927f.f89501a;
                                C87412m.m108594g(str, "path");
                                if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_media_clean_report_enale, true)) {
                                    fVar.mo58867a(str, 2);
                                }
                                C98453h.f288774a.mo137810h(str);
                            }
                        } else {
                            it = it4;
                        }
                        i = i3;
                        it4 = it;
                        i2 = 9;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
                SnsMethodCalculate.markEndTimeMs("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
                C32927f fVar2 = C32927f.f89501a;
                ((C119157j) C119157j.f356862d).mo183870a(C32929g.f89504d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
            }
        }
        SnsMethodCalculate.markEndTimeMs("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        SnsMethodCalculate.markEndTimeMs("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        C32927f fVar22 = C32927f.f89501a;
        ((C119157j) C119157j.f356862d).mo183870a(C32929g.f89504d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
    }
}
