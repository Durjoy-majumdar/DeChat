package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.widget.C84943i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58719f2;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import ls3.C10649f;
import o40.C61926c;
import org.json.JSONObject;
import te3.C64238ap2;
import te3.C64279c90;
import te3.C64287ci1;

/* renamed from: com.tencent.mm.plugin.finder.view.x4 */
public final class C4207x4 implements C84943i {

    /* renamed from: a */
    public View f18504a;

    /* renamed from: b */
    public String f18505b = "";

    /* renamed from: com.tencent.mm.plugin.finder.view.x4$b */
    public static final class C4208b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4207x4 f18506d;

        /* renamed from: e */
        public final /* synthetic */ String f18507e;

        /* renamed from: com.tencent.mm.plugin.finder.view.x4$b$a */
        public static final class C4209a implements C1256g<IPCVoid> {
            /* renamed from: a */
            public void mo894a(Object obj) {
                IPCVoid iPCVoid = (IPCVoid) obj;
                Log.m105924i("Finder.FinderShareProductWxaCoverWidget", "click onCallback");
            }
        }

        public C4208b(C4207x4 x4Var, String str) {
            this.f18506d = x4Var;
            this.f18507e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$createWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("Finder.FinderShareProductWxaCoverWidget", "onClick data:" + this.f18506d.f18505b);
            C80907o.m98782e(MMApplicationContext.getMainProcessName(), new IPCString(this.f18507e), C4210a.class, new C4209a(), (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$createWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/x4$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.view.x4$a */
    public static final class C4210a implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            String str;
            C1256g gVar2 = gVar;
            IPCString iPCString = (IPCString) obj;
            Class cls = C60200t1.class;
            String str2 = "";
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                try {
                    Log.m105924i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:" + iPCString.f10315d);
                    JSONObject jSONObject = new JSONObject(iPCString.f10315d);
                    String string = jSONObject.getString("feedId");
                    String string2 = jSONObject.getString("nonceId");
                    long P = C61926c.m72671P(string);
                    Log.m105924i("Finder.FinderShareProductWxaCoverWidget", "feedId:" + C61926c.m72691p(P) + ", nonceId:" + string2);
                    String R1 = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(2, 3, 65);
                    Intent intent = new Intent();
                    intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
                    C58719f2 f2Var = C58719f2.f168110a;
                    C64287ci1 ci12 = C58719f2.f168112c;
                    if (!(ci12 == null || (str = ci12.f182512x) == null)) {
                        intent.putExtra("key_enter_live_param_ecsource", str);
                    }
                    C64238ap2 ap22 = new C64238ap2();
                    ap22.f182124d = P;
                    ap22.f182125e = 0;
                    ap22.f182126f = string2;
                    ap22.f182127g = str2;
                    ap22.f182128h = str2;
                    ap22.f182129i = str2;
                    ap22.f182130j = null;
                    C64279c90 c902 = new C64279c90();
                    c902.f182444d = R1;
                    c902.f182445e = str2;
                    c902.f182447g = -1;
                    c902.f182448h = -1;
                    c902.f182449i = 1;
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, intent, ap22, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
                    C64287ci1 ci13 = C58719f2.f168112c;
                    if (ci13 != null) {
                        String str3 = ci13.f182495d;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        f2Var.mo83636i(ci13, "enter_live", f2Var.mo83630b(ci13, str2, 1));
                    }
                } catch (Throwable unused) {
                }
                if (gVar2 != null) {
                    gVar2.mo894a(new IPCVoid());
                }
            }
        }
    }

    /* renamed from: a */
    public View mo3391a(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "data");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.apm, (ViewGroup) null);
        this.f18505b = str;
        try {
            Log.m105924i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:" + str);
            JSONObject jSONObject = new JSONObject(str);
            C87412m.m108593f(jSONObject.getString("feedId"), "dataJson.getString(\"feedId\")");
            C87412m.m108593f(jSONObject.getString("nonceId"), "dataJson.getString(\"nonceId\")");
        } catch (Throwable unused) {
        }
        inflate.setOnClickListener(new C4208b(this, str));
        this.f18504a = inflate;
        return inflate;
    }

    /* renamed from: b */
    public int mo3392b() {
        return C0966R.C0970id.e7c;
    }

    /* renamed from: c */
    public RelativeLayout.LayoutParams mo3393c() {
        Context context;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        View view = this.f18504a;
        if (view == null || (context = view.getContext()) == null) {
            context = MMApplicationContext.getContext();
        }
        layoutParams.topMargin = C76577a.m92151b(context, 12);
        return layoutParams;
    }
}
