package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.ArrayList;
import java.util.Locale;
import lp0.C88619a;
import lp0.C88620b;
import lp0.C88621c;
import lp0.C88622d;
import lp0.C88623e;
import lp0.C88626h;
import mp0.C88795c;
import mp0.C88798e;
import mp0.C88799f;
import mp0.C88801g;
import mp0.C88802h;
import mp0.C88803i;
import mp0.C88804j;
import mp0.C88806n;
import mp0.C88807p;
import mp0.C88808s;
import mp0.C88809t;
import mp0.C88810u;
import mp0.C88815z;
import nj3.C76874e0;
import org.xwalk.core.XWalkEnvironment;
import p819pc.C89337c;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.e */
public class C83671e extends C88619a<C83928t1> {

    /* renamed from: b */
    public static final C88622d<C83928t1> f244304b;

    static {
        C88622d<C83928t1> dVar = new C88622d<>();
        f244304b = dVar;
        dVar.mo123055a(new C88799f());
        dVar.mo123055a(new C88810u());
        dVar.mo123055a(new C88801g());
        dVar.mo123055a(new C88804j());
        dVar.mo123055a(new C88808s());
        dVar.mo123055a(new C88802h());
        dVar.mo123055a(new C88809t());
        dVar.mo123055a(new C88798e());
        dVar.mo123055a(new C88795c());
        dVar.mo123055a(C88806n.f256211a);
        dVar.mo123055a(C88807p.f256212a);
        dVar.mo123055a(new C88803i());
        dVar.mo123055a(new C89337c());
        dVar.mo123055a(new C83654b0());
        dVar.mo123055a(new C88815z());
    }

    public C83671e() {
        super(26);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C88622d<C83928t1> dVar = f244304b;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) dVar.f255901a).size()) {
                break;
            } else if (((C88620b) ((ArrayList) dVar.f255901a).get(i)).mo115972c(context, t1Var, str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            e0Var.mo107144g(26, context.getString(C0966R.string.f7667n9), C0966R.raw.appbrand_menu_enable_debug);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        Context context2 = context;
        String str2 = str;
        C83928t1 t1Var = (C83928t1) d1Var;
        C88622d<C83928t1> dVar = f244304b;
        String string = MMApplicationContext.getContext().getString(C0966R.string.f7667n9);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
            string = MMApplicationContext.isMainProcess() ? String.format(Locale.ENGLISH, "%s (%s)", new Object[]{string, XWalkEnvironment.MODULE_MM}) : String.format(Locale.ENGLISH, "%s (%s)", new Object[]{string, MMApplicationContext.getProcessName().substring(MMApplicationContext.getPackageName().length())});
        }
        String str3 = string;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < ((ArrayList) dVar.f255901a).size(); i++) {
            C88620b bVar = (C88620b) ((ArrayList) dVar.f255901a).get(i);
            if (bVar.mo115972c(context2, t1Var, str2)) {
                arrayList.add(bVar.mo115971b(context2, t1Var, str2));
                arrayList2.add(bVar);
            }
        }
        boolean z = t1Var.mo109677x() || t1Var.mo116167V0();
        C79774c cVar = t1Var.f244577X;
        C88621c cVar2 = new C88621c(dVar, arrayList2, context, t1Var, str);
        C77407n nVar = new C77407n(context2, false, 0);
        if (cVar.shouldInLargeScreenCompatMode()) {
            nVar.f225790s1 = (int) (((float) cVar.getVDisplayMetrics().widthPixels) * cVar.getScale());
        }
        nVar.f225774j1 = z;
        nVar.f225779n1 = z;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6466fm, (ViewGroup) null);
        if (!TextUtils.isEmpty(str3)) {
            ((TextView) inflate.findViewById(16908310)).setText(str3);
        }
        C88623e eVar = new C88623e(nVar, cVar2);
        View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6465fl, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(C0966R.C0970id.eqp);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(context2, 3));
        recyclerView.setAdapter(new C88626h(arrayList, eVar));
        nVar.mo107567l(inflate2);
        nVar.mo107569n(inflate, true);
        nVar.mo107573q();
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 33, "", Util.nowSecond(), 1, 0);
    }
}
