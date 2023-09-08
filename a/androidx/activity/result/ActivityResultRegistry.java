package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import p431e.C116634a;
import p918s2.C118252b;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f337843a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f337844b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f337845c = new HashMap();

    /* renamed from: d */
    public final Map<String, C112848d> f337846d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f337847e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C112847c<?>> f337848f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f337849g = new HashMap();

    /* renamed from: h */
    public final Bundle f337850h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C112845a extends C67074b<I> {

        /* renamed from: a */
        public final /* synthetic */ String f337855a;

        /* renamed from: b */
        public final /* synthetic */ C116634a f337856b;

        public C112845a(String str, C116634a aVar) {
            this.f337855a = str;
            this.f337856b = aVar;
        }

        /* renamed from: a */
        public void mo91081a(I i, C118252b bVar) {
            Integer num = (Integer) ((HashMap) ActivityResultRegistry.this.f337845c).get(this.f337855a);
            if (num != null) {
                ActivityResultRegistry.this.f337847e.add(this.f337855a);
                try {
                    ActivityResultRegistry.this.mo164663b(num.intValue(), this.f337856b, i, bVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f337847e.remove(this.f337855a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f337856b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: b */
        public void mo91082b() {
            ActivityResultRegistry.this.mo164684g(this.f337855a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C112846b extends C67074b<I> {

        /* renamed from: a */
        public final /* synthetic */ String f337858a;

        /* renamed from: b */
        public final /* synthetic */ C116634a f337859b;

        public C112846b(String str, C116634a aVar) {
            this.f337858a = str;
            this.f337859b = aVar;
        }

        /* renamed from: a */
        public void mo91081a(I i, C118252b bVar) {
            Integer num = (Integer) ((HashMap) ActivityResultRegistry.this.f337845c).get(this.f337858a);
            if (num != null) {
                ActivityResultRegistry.this.f337847e.add(this.f337858a);
                ActivityResultRegistry.this.mo164663b(num.intValue(), this.f337859b, i, bVar);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f337859b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        /* renamed from: b */
        public void mo91082b() {
            ActivityResultRegistry.this.mo164684g(this.f337858a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C112847c<O> {

        /* renamed from: a */
        public final C67073a<O> f337861a;

        /* renamed from: b */
        public final C116634a<?, O> f337862b;

        public C112847c(C67073a<O> aVar, C116634a<?, O> aVar2) {
            this.f337861a = aVar;
            this.f337862b = aVar2;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C112848d {

        /* renamed from: a */
        public final C39623j f337863a;

        /* renamed from: b */
        public final ArrayList<C103764p> f337864b = new ArrayList<>();

        public C112848d(C39623j jVar) {
            this.f337863a = jVar;
        }
    }

    /* renamed from: a */
    public final boolean mo164679a(int i, int i2, Intent intent) {
        String str = (String) ((HashMap) this.f337844b).get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C112847c cVar = (C112847c) ((HashMap) this.f337848f).get(str);
        if (cVar == null || cVar.f337861a == null || !this.f337847e.contains(str)) {
            ((HashMap) this.f337849g).remove(str);
            this.f337850h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        cVar.f337861a.mo91080a(cVar.f337862b.mo105809c(i2, intent));
        this.f337847e.remove(str);
        return true;
    }

    /* renamed from: b */
    public abstract <I, O> void mo164663b(int i, C116634a<I, O> aVar, I i2, C118252b bVar);

    /* renamed from: c */
    public final void mo164680c(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f337847e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f337843a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f337850h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (((HashMap) this.f337845c).containsKey(str)) {
                        Integer num = (Integer) ((HashMap) this.f337845c).remove(str);
                        if (!this.f337850h.containsKey(str)) {
                            ((HashMap) this.f337844b).remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    ((HashMap) this.f337844b).put(Integer.valueOf(intValue), str2);
                    ((HashMap) this.f337845c).put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    /* renamed from: d */
    public final <I, O> C67074b<I> mo164681d(final String str, C0125s sVar, final C116634a<I, O> aVar, final C67073a<O> aVar2) {
        C39623j lifecycle = sVar.getLifecycle();
        if (!lifecycle.getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
            mo164683f(str);
            C112848d dVar = (C112848d) ((HashMap) this.f337846d).get(str);
            if (dVar == null) {
                dVar = new C112848d(lifecycle);
            }
            C1128441 r0 = new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    if (C39623j.C39625b.ON_START.equals(bVar)) {
                        ((HashMap) ActivityResultRegistry.this.f337848f).put(str, new C112847c(aVar2, aVar));
                        if (((HashMap) ActivityResultRegistry.this.f337849g).containsKey(str)) {
                            Object obj = ((HashMap) ActivityResultRegistry.this.f337849g).get(str);
                            ((HashMap) ActivityResultRegistry.this.f337849g).remove(str);
                            aVar2.mo91080a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f337850h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f337850h.remove(str);
                            aVar2.mo91080a(aVar.mo105809c(activityResult.f337841d, activityResult.f337842e));
                        }
                    } else if (C39623j.C39625b.ON_STOP.equals(bVar)) {
                        ((HashMap) ActivityResultRegistry.this.f337848f).remove(str);
                    } else if (C39623j.C39625b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.mo164684g(str);
                    }
                }
            };
            dVar.f337863a.addObserver(r0);
            dVar.f337864b.add(r0);
            ((HashMap) this.f337846d).put(str, dVar);
            return new C112845a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + sVar + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: e */
    public final <I, O> C67074b<I> mo164682e(String str, C116634a<I, O> aVar, C67073a<O> aVar2) {
        mo164683f(str);
        ((HashMap) this.f337848f).put(str, new C112847c(aVar2, aVar));
        if (((HashMap) this.f337849g).containsKey(str)) {
            Object obj = ((HashMap) this.f337849g).get(str);
            ((HashMap) this.f337849g).remove(str);
            aVar2.mo91080a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f337850h.getParcelable(str);
        if (activityResult != null) {
            this.f337850h.remove(str);
            aVar2.mo91080a(aVar.mo105809c(activityResult.f337841d, activityResult.f337842e));
        }
        return new C112846b(str, aVar);
    }

    /* renamed from: f */
    public final void mo164683f(String str) {
        if (((Integer) ((HashMap) this.f337845c).get(str)) == null) {
            int nextInt = this.f337843a.nextInt(2147418112);
            while (true) {
                int i = nextInt + 65536;
                if (((HashMap) this.f337844b).containsKey(Integer.valueOf(i))) {
                    nextInt = this.f337843a.nextInt(2147418112);
                } else {
                    ((HashMap) this.f337844b).put(Integer.valueOf(i), str);
                    ((HashMap) this.f337845c).put(str, Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo164684g(String str) {
        Integer num;
        if (!this.f337847e.contains(str) && (num = (Integer) ((HashMap) this.f337845c).remove(str)) != null) {
            ((HashMap) this.f337844b).remove(num);
        }
        ((HashMap) this.f337848f).remove(str);
        if (((HashMap) this.f337849g).containsKey(str)) {
            Objects.toString(((HashMap) this.f337849g).get(str));
            ((HashMap) this.f337849g).remove(str);
        }
        if (this.f337850h.containsKey(str)) {
            Objects.toString(this.f337850h.getParcelable(str));
            this.f337850h.remove(str);
        }
        C112848d dVar = (C112848d) ((HashMap) this.f337846d).get(str);
        if (dVar != null) {
            Iterator<C103764p> it = dVar.f337864b.iterator();
            while (it.hasNext()) {
                dVar.f337863a.removeObserver(it.next());
            }
            dVar.f337864b.clear();
            ((HashMap) this.f337846d).remove(str);
        }
    }
}
