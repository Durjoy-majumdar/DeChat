package xb3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lu3.C88654b;
import o00.C47315c;
import o40.C61926c;
import yb3.C79064a;

/* renamed from: xb3.k */
public class C78781k extends UIComponent {

    /* renamed from: d */
    public final HashMap<C78782a, ArrayList<C79064a>> f230514d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C79064a> f230515e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, WeakReference<C88654b>> f230516f = new HashMap<>();

    /* renamed from: xb3.k$a */
    public enum C78782a {
        Event_OnCreate,
        Event_OnStart,
        Event_OnResume,
        Event_Custom
    }

    /* renamed from: xb3.k$b */
    public static final class C78783b extends C87413o implements C32226l<C79064a, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C78782a f230522d;

        /* renamed from: e */
        public final /* synthetic */ C78781k f230523e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78783b(C78782a aVar, C78781k kVar) {
            super(1);
            this.f230522d = aVar;
            this.f230523e = kVar;
        }

        public Object invoke(Object obj) {
            C79064a aVar = (C79064a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            Log.m105918d("MicroMsg.WcPayReportUIC", "do checkViewAbnormal: " + this.f230522d + ", " + aVar.f232175f);
            C88654b tr = ((C47315c) C86312j.m106911c(C47315c.class)).mo72369tr(aVar);
            if (tr != null) {
                this.f230523e.f230516f.put(aVar.f232175f.toString(), new WeakReference(tr));
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78781k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static /* synthetic */ void m95187g3(C78781k kVar, C78782a aVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "";
            }
            kVar.mo108702f3(aVar, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerReport");
    }

    /* renamed from: c3 */
    public final void mo108699c3(String str, C79064a aVar) {
        WeakReference weakReference;
        C88654b bVar;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "options");
        C79064a aVar2 = this.f230515e.get(str);
        if (!(aVar2 == null || (weakReference = this.f230516f.get(aVar2.f232175f.toString())) == null || (bVar = (C88654b) weakReference.get()) == null)) {
            bVar.mo123097b(true);
        }
        this.f230515e.put(str, aVar);
    }

    /* renamed from: d3 */
    public final void mo108700d3(C78782a aVar, C79064a aVar2) {
        C87412m.m108594g(aVar, "reportEvent");
        C87412m.m108594g(aVar2, "options");
        ArrayList arrayList = this.f230514d.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f230514d.put(aVar, arrayList);
        }
        arrayList.add(aVar2);
    }

    /* renamed from: e3 */
    public final void mo108701e3(String str) {
        C88654b bVar;
        C87412m.m108594g(str, "key");
        Log.m105918d("MicroMsg.WcPayReportUIC", "remove task: " + str);
        WeakReference remove = this.f230516f.remove(str);
        if (remove != null && (bVar = (C88654b) remove.get()) != null) {
            bVar.mo123097b(true);
        }
    }

    /* renamed from: f3 */
    public final void mo108702f3(C78782a aVar, String str) {
        C79064a aVar2;
        C87412m.m108594g(aVar, "event");
        switch (aVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                ArrayList arrayList = this.f230514d.get(aVar);
                if (arrayList != null) {
                    C61926c.m72673R(arrayList, new C78783b(aVar, this));
                    return;
                }
                return;
            case 6:
                if (str != null && (aVar2 = this.f230515e.get(str)) != null) {
                    Log.m105918d("MicroMsg.WcPayReportUIC", "do checkViewAbnormal: " + str + ", " + aVar2.f232175f);
                    C88654b tr = ((C47315c) C86312j.m106911c(C47315c.class)).mo72369tr(aVar2);
                    if (tr != null) {
                        this.f230516f.put(aVar2.f232175f.toString(), new WeakReference(tr));
                    }
                    C79064a remove = this.f230515e.remove(str);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m95187g3(this, C78782a.Event_OnCreate, (String) null, 2, (Object) null);
    }

    public void onFinished() {
        super.onFinished();
        for (Map.Entry<String, WeakReference<C88654b>> value : this.f230516f.entrySet()) {
            C88654b bVar = (C88654b) ((WeakReference) value.getValue()).get();
            if (bVar != null) {
                bVar.mo123097b(true);
            }
        }
        this.f230516f.clear();
    }

    public void onPause() {
        super.onPause();
        for (Map.Entry next : this.f230516f.entrySet()) {
            Log.m105918d("MicroMsg.WcPayReportUIC", "cancel tasks: " + ((WeakReference) next.getValue()).get());
            C88654b bVar = (C88654b) ((WeakReference) next.getValue()).get();
            if (bVar != null) {
                bVar.mo123097b(true);
            }
        }
        this.f230516f.clear();
    }

    public void onResume() {
        super.onResume();
        m95187g3(this, C78782a.Event_OnResume, (String) null, 2, (Object) null);
    }

    public void onStart() {
        super.onStart();
        m95187g3(this, C78782a.Event_OnStart, (String) null, 2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78781k(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
