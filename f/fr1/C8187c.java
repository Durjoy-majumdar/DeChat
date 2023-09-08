package fr1;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pj3.C47511g;
import sx3.C110818d0;
import te3.C48833bb1;
import te3.C50019jp1;
import te3.C50119ke1;
import te3.C52261zg3;
import tf0.C13887q1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: fr1.c */
public final class C8187c implements C8195i, C8196j {

    /* renamed from: a */
    public final String f27091a;

    /* renamed from: b */
    public final C47511g f27092b;

    /* renamed from: c */
    public final Context f27093c;

    /* renamed from: d */
    public final String f27094d = "Finder.PosterCenterLiveShopPref";

    /* renamed from: e */
    public C50019jp1 f27095e = new C50019jp1();

    /* renamed from: f */
    public C48833bb1 f27096f = new C48833bb1();

    public C8187c(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27091a = str;
        this.f27092b = gVar;
        this.f27093c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        Log.m105924i(this.f27094d, "enter shop:" + this.f27095e.f136237d + ',' + this.f27095e.f136238e);
        String str = "setting:0" + C66785b.f191882e.mo90662O5() + ":0:" + Util.getUuidRandom();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).uv0(2, String.valueOf(this.f27095e.f136237d), Util.getUuidRandom().toString(), 1176, String.valueOf(SystemClock.elapsedRealtimeNanos()), "setting", "");
        C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
        Context context = this.f27093c;
        C50019jp1 jp12 = this.f27095e;
        String str2 = jp12.f136237d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = jp12.f136238e;
        bVar.mo13270U5(context, str2, str3 == null ? "" : str3, 1176, str);
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
        int i;
        Resources resources;
        List<C86299o> YF;
        C86299o oVar;
        Class cls = C13887q1.class;
        String str = this.f27094d;
        Log.m105924i(str, "update shop:" + this.f27095e.f136237d + ',' + this.f27095e.f136238e);
        Preference a = this.f27092b.mo72519a(this.f27091a);
        C37521f fVar = C37521f.f99374d;
        if (fVar.mo61174b0()) {
            resources = MMApplicationContext.getContext().getResources();
            i = C0966R.string.epl;
        } else {
            resources = MMApplicationContext.getContext().getResources();
            i = C0966R.string.epi;
        }
        a.mo69924H(resources.getString(i));
        if (!Util.isNullOrNil(this.f27095e.f136237d)) {
            this.f27092b.mo72529n(this.f27091a, false);
            if (fVar.mo61174b0() && (YF = ((C13887q1) C86312j.m106911c(cls)).mo13337YF(this.f27096f)) != null && (oVar = (C86299o) C110818d0.m150916N(YF)) != null) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                ((C13887q1) c).mo13322Pi((C45795b) null, oVar, false);
                return;
            }
            return;
        }
        this.f27092b.mo72529n(this.f27091a, true);
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27091a;
    }

    /* renamed from: d */
    public void mo9239d(C50119ke1 ke12) {
        C52261zg3 zg32;
        T t;
        C87412m.m108594g(ke12, "prepareResp");
        LinkedList<C52261zg3> linkedList = ke12.f136709z;
        C48833bb1 bb12 = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                FinderContact finderContact = ((C52261zg3) t).f145918e;
                if (C87412m.m108589b(finderContact != null ? finderContact.username : null, C66785b.f191882e.mo90662O5())) {
                    break;
                }
            }
            zg32 = (C52261zg3) t;
        } else {
            zg32 = null;
        }
        C50019jp1 jp12 = zg32 != null ? zg32.f145922i : null;
        if (jp12 == null) {
            jp12 = new C50019jp1();
        }
        this.f27095e = jp12;
        if (zg32 != null) {
            bb12 = zg32.f145934x;
        }
        if (bb12 == null) {
            bb12 = new C48833bb1();
        }
        this.f27096f = bb12;
    }

    public void onCreate() {
    }

    public void onResume() {
    }

    public void onStop() {
    }
}
