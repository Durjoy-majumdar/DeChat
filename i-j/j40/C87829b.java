package j40;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import com.tencent.tinker.entry.ApplicationLike;
import gp3.C87315b;
import java.util.Iterator;
import nr3.C89055a;

/* renamed from: j40.b */
public class C87829b extends C46396a {

    /* renamed from: f */
    public ApplicationLike f254267f;

    /* renamed from: g */
    public C80814d f254268g;

    /* renamed from: h */
    public C89055a<ApplicationLifeCycle> f254269h = new C89055a<>();

    public C87829b(String str, Application application, ApplicationLike applicationLike) {
        super(str, application);
        this.f254267f = applicationLike;
    }

    /* renamed from: d */
    public C80814d mo122282d() {
        return this.f254268g;
    }

    /* renamed from: e */
    public void mo122283e(Configuration configuration) {
        Iterator<C87315b> it = this.f254269h.getQueue().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                ((ApplicationLifeCycle) next.f253059e).onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: f */
    public void mo122284f() {
        Iterator<C87315b> it = this.f254269h.getQueue().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                ((ApplicationLifeCycle) next.f253059e).onCreate();
            }
        }
    }

    /* renamed from: g */
    public void mo122285g() {
        Iterator<C87315b> it = this.f254269h.getQueue().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                ((ApplicationLifeCycle) next.f253059e).onLowMemory();
            }
        }
    }

    /* renamed from: h */
    public void mo122286h() {
        Iterator<C87315b> it = this.f254269h.getQueue().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                ((ApplicationLifeCycle) next.f253059e).onTerminate();
            }
        }
    }

    /* renamed from: i */
    public void mo122287i(int i) {
        Iterator<C87315b> it = this.f254269h.getQueue().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                ((ApplicationLifeCycle) next.f253059e).onTrimMemory(i);
            }
        }
    }
}
