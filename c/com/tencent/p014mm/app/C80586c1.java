package com.tencent.p014mm.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.app.c1 */
public final class C80586c1 {

    /* renamed from: a */
    public static final Application.ActivityLifecycleCallbacks f235759a = new C80587a();

    /* renamed from: com.tencent.mm.app.c1$a */
    public class C80587a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$b(activity, bundle));
        }

        public void onActivityDestroyed(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityDestroyed(activity);
                }
            }
        }

        public void onActivityPaused(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPaused(activity);
                }
            }
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$g(activity, bundle));
        }

        public void onActivityPostDestroyed(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPostDestroyed(activity);
                }
            }
        }

        public void onActivityPostPaused(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPostPaused(activity);
                }
            }
        }

        public void onActivityPostResumed(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPostResumed(activity);
                }
            }
        }

        public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$d(activity, bundle));
        }

        public void onActivityPostStarted(Activity activity) {
            C38166b.m41755b(C114657b1.class, new c1$a$$e(activity));
        }

        public void onActivityPostStopped(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPostStopped(activity);
                }
            }
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$c(activity, bundle));
        }

        public void onActivityPreDestroyed(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPreDestroyed(activity);
                }
            }
        }

        public void onActivityPrePaused(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPrePaused(activity);
                }
            }
        }

        public void onActivityPreResumed(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPreResumed(activity);
                }
            }
        }

        public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$a(activity, bundle));
        }

        public void onActivityPreStarted(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPreStarted(activity);
                }
            }
        }

        public void onActivityPreStopped(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityPreStopped(activity);
                }
            }
        }

        public void onActivityResumed(Activity activity) {
            C38166b.m41755b(C114657b1.class, new c1$a$$f(activity));
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C38166b.m41755b(C114657b1.class, new c1$a$$h(activity, bundle));
        }

        public void onActivityStarted(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityStarted(activity);
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C114657b1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C114657b1) ((C15510f) iVar.get())).onActivityStopped(activity);
                }
            }
        }
    }
}
