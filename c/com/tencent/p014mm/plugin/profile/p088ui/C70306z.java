package com.tencent.p014mm.plugin.profile.p088ui;

import android.os.Looper;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import gl3.C75922b;
import gl3.C75937g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C99681n;

/* renamed from: com.tencent.mm.plugin.profile.ui.z */
public class C70306z extends C74526m1 implements C61173o {

    /* renamed from: n */
    public C72996z1 f203085n;

    /* renamed from: o */
    public MMHandler f203086o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public List<C99681n> f203087p;

    /* renamed from: com.tencent.mm.plugin.profile.ui.z$b */
    public static class C70308b implements Comparator<C99681n> {
        public C70308b(C70307a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = (((C99681n) obj2).f292152f > ((C99681n) obj).f292152f ? 1 : (((C99681n) obj2).f292152f == ((C99681n) obj).f292152f ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }
    }

    public C70306z(C74493g1 g1Var, int i, C72996z1 z1Var) {
        super(g1Var, (List<String>) new ArrayList(), true, false, i);
        this.f203085n = z1Var;
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        if (lVar.f32074c == 0) {
            this.f203087p = lVar.f32076e;
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        List<C99681n> list = this.f203087p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C75937g gVar = new C75937g(i, this.f203085n);
        gVar.mo106181j(C97625j3.m125812b().mo105907v().get(this.f203087p.get(i).f292151e));
        return gVar;
    }
}
