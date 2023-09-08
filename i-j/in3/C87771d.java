package in3;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.vendor.Meizu;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: in3.d */
public class C87771d {

    /* renamed from: g */
    public static final boolean f254121g = (!Meizu.hasSmartBar());

    /* renamed from: h */
    public static C46281c f254122h;

    /* renamed from: i */
    public static final C87771d f254123i = new C87772a((Activity) null);

    /* renamed from: j */
    public static final WeakHashMap<Activity, C87771d> f254124j = new WeakHashMap<>();

    /* renamed from: a */
    public final WeakReference<Activity> f254125a;

    /* renamed from: b */
    public final Set<WeakReference<C46280b>> f254126b = new HashSet();

    /* renamed from: c */
    public final boolean f254127c;

    /* renamed from: d */
    public boolean f254128d;

    /* renamed from: e */
    public int f254129e;

    /* renamed from: f */
    public WeakReference<View> f254130f;

    /* renamed from: in3.d$b */
    public interface C46280b {
        /* renamed from: U3 */
        void mo6344U3(int i);
    }

    /* renamed from: in3.d$c */
    public interface C46281c {
    }

    /* renamed from: in3.d$a */
    public class C87772a extends C87771d {
        public C87772a(Activity activity) {
            super(activity);
        }

        /* renamed from: d */
        public void mo122180d(C46280b bVar) {
        }

        /* renamed from: f */
        public void mo122182f(C46280b bVar) {
        }
    }

    public C87771d(Activity activity) {
        C46281c cVar;
        boolean z = false;
        this.f254128d = false;
        this.f254129e = 0;
        this.f254125a = new WeakReference<>(activity);
        if (!(activity == null || (cVar = f254122h) == null)) {
            ((MMFragmentActivity$$a) cVar).getClass();
            if (MMFragmentActivity.lambda$static$0(activity)) {
                z = true;
            }
        }
        this.f254127c = z;
    }

    /* renamed from: b */
    public static C87771d m109203b(Activity activity) {
        if (!f254121g || activity == null) {
            return f254123i;
        }
        WeakHashMap<Activity, C87771d> weakHashMap = f254124j;
        C87771d dVar = weakHashMap.get(activity);
        if (dVar != null) {
            return dVar;
        }
        C87771d dVar2 = new C87771d(activity);
        weakHashMap.put(activity, dVar2);
        return dVar2;
    }

    /* renamed from: c */
    public static C87771d m109204c(Activity activity) {
        return (!f254121g || activity == null) ? f254123i : f254124j.get(activity);
    }

    /* renamed from: a */
    public void mo122179a() {
        WeakReference<View> weakReference = this.f254130f;
        View view = weakReference == null ? null : weakReference.get();
        if (view != null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        }
    }

    /* renamed from: d */
    public void mo122180d(C46280b bVar) {
        if (!this.f254128d) {
            this.f254128d = true;
            Activity activity = this.f254125a.get();
            if (!(activity == null || activity.getWindow() == null)) {
                C87771d c = m109204c(activity);
                if (c != null) {
                    c.mo122179a();
                }
                try {
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    View view = null;
                    int i = 0;
                    while (true) {
                        if (i >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt = viewGroup.getChildAt(i);
                        if (!"android:status:background".equals(childAt.getTransitionName())) {
                            if (!"android:navigation:background".equals(childAt.getTransitionName())) {
                                view = childAt;
                                break;
                            }
                        }
                        i++;
                    }
                    if (view == null) {
                        view = viewGroup;
                    }
                    view.setOnApplyWindowInsetsListener(new C87770c(this, viewGroup));
                    view.requestApplyInsets();
                    this.f254130f = new WeakReference<>(view);
                } catch (Exception e) {
                    this.f254128d = false;
                    Log.m105921e("MicroMsg.StatusBarHeightWatcher", "setOnApplyWindowInsetsListener e=%s", e);
                }
            }
        }
        if (bVar != null) {
            ((HashSet) this.f254126b).add(new WeakReference(bVar));
            int i2 = this.f254129e;
            if (i2 > 0) {
                bVar.mo6344U3(i2);
            }
        }
    }

    /* renamed from: e */
    public void mo122181e() {
        WeakReference<View> weakReference = this.f254130f;
        if (weakReference != null && weakReference.get() != null) {
            this.f254130f.get().requestApplyInsets();
        }
    }

    /* renamed from: f */
    public void mo122182f(C46280b bVar) {
        if (bVar != null) {
            Iterator it = new LinkedList(this.f254126b).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (bVar == weakReference.get() || weakReference.get() == null) {
                    ((HashSet) this.f254126b).remove(weakReference);
                }
            }
        }
    }
}
