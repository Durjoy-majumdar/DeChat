package z92;

import aa2.C112765c;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskPanelContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import p261wl.C38166b;
import p261wl.C38174i;
import p460bv.C28424b;
import p92.C117994a;
import p92.C117997g;
import te3.C110959d13;

/* renamed from: z92.b */
public class C119089b implements C117994a {

    /* renamed from: d */
    public final AppCompatActivity f356639d;

    /* renamed from: e */
    public final Bundle f356640e;

    /* renamed from: f */
    public final String f356641f = "MicroMsg.MultiTask.MultiTaskPanelItem";

    /* renamed from: g */
    public MultiTaskPanelContainer f356642g;

    /* renamed from: h */
    public View f356643h;

    /* renamed from: i */
    public C117997g f356644i;

    /* renamed from: j */
    public final HashSet<C117997g> f356645j = new HashSet<>();

    /* renamed from: n */
    public HashMap<String, C117997g> f356646n = new HashMap<>();

    public C119089b(AppCompatActivity appCompatActivity, Bundle bundle) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f356639d = appCompatActivity;
        this.f356640e = bundle;
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        C87412m.m108594g(multiTaskInfo, "info");
        C87412m.m108594g(d132, "animateData");
    }

    /* renamed from: d */
    public final C117997g mo183761d(int i, String str) {
        C87412m.m108594g(str, "id");
        for (C117997g gVar : this.f356645j) {
            if (gVar.mo62147k3(i) && this.f356646n.containsKey(str) && C87412m.m108589b(gVar, this.f356646n.get(str))) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C117997g mo183762e(int i, String str) {
        MultiTaskPanelContainer multiTaskPanelContainer;
        C87412m.m108594g(str, "id");
        for (C117997g gVar : this.f356645j) {
            if (gVar.mo62147k3(i) && this.f356646n.containsKey(str) && C87412m.m108589b(gVar, this.f356646n.get(str))) {
                return gVar;
            }
        }
        HashMap<Integer, Class<? extends C117997g>> hashMap = C105923s.f315122n;
        Class<? extends C117997g> cls = C105923s.f315122n.get(Integer.valueOf(i));
        if (cls == null) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C28424b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (iVar.hasKey(Integer.valueOf(i))) {
                    C28424b bVar2 = (C28424b) iVar.get();
                    cls = bVar2 != null ? bVar2.get(i) : null;
                }
            }
        }
        if (cls != null) {
            C117997g g = mo183764g(str, cls);
            if ((g != null ? g.mo36002z() : null) == C117994a.C117996b.MODE_SHOW_SNAPSHOT_SCENE && (multiTaskPanelContainer = this.f356642g) != null) {
                View inflate = this.f356639d.getLayoutInflater().inflate(g.getLayoutId(), (ViewGroup) null);
                multiTaskPanelContainer.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    g.setRootView(inflate);
                    View rootView = g.getRootView();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = rootView;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    rootView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                g.mo62143d3((Object) null);
                return g;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final C117997g mo183763f(MultiTaskInfo multiTaskInfo) {
        C117997g gVar;
        C117994a.C117996b bVar = C117994a.C117996b.MODE_SHOW_SINGLE_SCENE;
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        int i = multiTaskInfo.field_type;
        this.f356644i = null;
        for (C117997g gVar2 : this.f356645j) {
            if (gVar2.mo62147k3(i) && this.f356646n.containsKey(multiTaskInfo.field_id) && C87412m.m108589b(gVar2, this.f356646n.get(multiTaskInfo.field_id))) {
                if (gVar2.mo36002z() == bVar) {
                    View rootView = gVar2.getRootView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = rootView;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    rootView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f356644i = gVar2;
                mo183766i();
                return gVar2;
            }
        }
        HashMap<Integer, Class<? extends C117997g>> hashMap = C105923s.f315122n;
        Class<? extends C117997g> cls = C105923s.f315122n.get(Integer.valueOf(i));
        if (cls == null) {
            C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C28424b.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                C38174i iVar = (C38174i) bVar2.next();
                if (iVar.hasKey(Integer.valueOf(i))) {
                    C28424b bVar3 = (C28424b) iVar.get();
                    cls = bVar3 != null ? bVar3.get(i) : null;
                }
            }
        }
        if (cls == null) {
            return null;
        }
        C8479f0 f0Var = new C8479f0();
        T g = mo183764g(multiTaskInfo.field_id, cls);
        if (g != null) {
            ((MultiTaskUIC) C39818r.f106831a.mo62444c(this.f356639d).mo75002a(MultiTaskUIC.class)).getClass();
        } else {
            g = null;
        }
        f0Var.f27484d = g;
        if ((g != null ? g.mo36002z() : null) == bVar) {
            MultiTaskPanelContainer multiTaskPanelContainer = this.f356642g;
            if (multiTaskPanelContainer != null) {
                View inflate = this.f356639d.getLayoutInflater().inflate(((C117997g) f0Var.f27484d).getLayoutId(), (ViewGroup) null);
                multiTaskPanelContainer.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    ((C117997g) f0Var.f27484d).setRootView(inflate);
                }
                ((C117997g) f0Var.f27484d).onCreateBefore(this.f356640e);
                ((C117997g) f0Var.f27484d).mo62143d3(multiTaskInfo);
                ((C117997g) f0Var.f27484d).onCreate(this.f356640e);
                ((C117997g) f0Var.f27484d).onCreateAfter(this.f356640e);
                ((C117997g) f0Var.f27484d).onStart();
                AppCompatActivity appCompatActivity = this.f356639d;
                if ((appCompatActivity instanceof MMFragmentActivity) && !((MMFragmentActivity) appCompatActivity).isPaused()) {
                    ((C117997g) f0Var.f27484d).onResume();
                    ((C117997g) f0Var.f27484d).mo62146i3();
                }
            }
        } else {
            MultiTaskPanelContainer multiTaskPanelContainer2 = this.f356642g;
            if (!(multiTaskPanelContainer2 == null || (gVar = (C117997g) f0Var.f27484d) == null)) {
                gVar.setRootView(multiTaskPanelContainer2);
            }
        }
        T t = f0Var.f27484d;
        this.f356644i = (C117997g) t;
        return (C117997g) t;
    }

    /* renamed from: g */
    public final C117997g mo183764g(String str, Class<? extends C117997g> cls) {
        C117997g gVar;
        C87412m.m108594g(cls, "modelClass");
        if (C54492n.class.isAssignableFrom(cls)) {
            try {
                gVar = (C117997g) cls.getConstructor(new Class[]{AppCompatActivity.class}).newInstance(new Object[]{this.f356639d});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        } else {
            gVar = null;
        }
        if (gVar != null) {
            this.f356645j.add(gVar);
            if (str != null) {
                C117997g put = this.f356646n.put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: h */
    public void mo183765h() {
        String str = this.f356641f;
        Object[] objArr = new Object[1];
        C117997g gVar = this.f356644i;
        objArr[0] = gVar != null ? gVar.toString() : null;
        Log.m105925i(str, "onMultiTaskPagePause, uic: %s", objArr);
        C117997g gVar2 = this.f356644i;
        if (gVar2 != null) {
            gVar2.mo62145g3();
        }
    }

    /* renamed from: i */
    public void mo183766i() {
        String str = this.f356641f;
        Object[] objArr = new Object[1];
        C117997g gVar = this.f356644i;
        objArr[0] = gVar != null ? gVar.toString() : null;
        Log.m105925i(str, "onMultiTaskPageResume, uic: %s", objArr);
        C117997g gVar2 = this.f356644i;
        if (gVar2 != null) {
            gVar2.mo62146i3();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 == p92.C117994a.C117996b.MODE_SHOW_SNAPSHOT_SCENE) goto L_0x003a;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo183767j(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "id"
            gy3.C87412m.m108594g(r4, r0)
            java.util.HashMap<java.lang.String, p92.g> r0 = r3.f356646n
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0061
            java.util.HashMap<java.lang.String, p92.g> r0 = r3.f356646n
            java.lang.Object r0 = r0.get(r4)
            p92.g r0 = (p92.C117997g) r0
            java.util.HashSet<p92.g> r1 = r3.f356645j
            java.util.Collection r1 = gy3.C24564k0.m30737a(r1)
            r1.remove(r0)
            java.util.HashMap<java.lang.String, p92.g> r1 = r3.f356646n
            r1.remove(r4)
            r4 = 0
            if (r0 == 0) goto L_0x002b
            p92.a$b r1 = r0.mo36002z()
            goto L_0x002c
        L_0x002b:
            r1 = r4
        L_0x002c:
            p92.a$b r2 = p92.C117994a.C117996b.MODE_SHOW_SINGLE_SCENE
            if (r1 == r2) goto L_0x003a
            if (r0 == 0) goto L_0x0036
            p92.a$b r4 = r0.mo36002z()
        L_0x0036:
            p92.a$b r1 = p92.C117994a.C117996b.MODE_SHOW_SNAPSHOT_SCENE
            if (r4 != r1) goto L_0x005a
        L_0x003a:
            android.view.View r4 = r0.getRootView()
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x005a
            android.view.View r4 = r0.getRootView()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r4, r1)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r1 = r0.getRootView()
            r4.removeView(r1)
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.mo143207f3()
        L_0x005f:
            r4 = 1
            return r4
        L_0x0061:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z92.C119089b.mo183767j(java.lang.String):boolean");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        C117997g d = mo183761d(0, "MultiTaskForMinusScreen");
        if (d != null) {
            ((C112765c) d).onConfigurationChanged(configuration);
        }
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onCreateBefore(Bundle bundle) {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public void onPause() {
        Log.m105924i(this.f356641f, "onPause");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onResume() {
        Log.m105924i(this.f356641f, "onResume");
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        Log.m105924i(this.f356641f, "onStart");
    }

    public void onStop() {
        Log.m105924i(this.f356641f, "onStop");
    }
}
