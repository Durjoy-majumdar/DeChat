package com.tencent.p014mm.ipcinvoker;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p20.C89305a;
import p20.C89308b;
import s20.C90122a;
import s20.C90123b;
import t20.C90365a;
import v20.C90741c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService */
public abstract class BaseIPCService extends Service {

    /* renamed from: d */
    public C89305a.C89306a f237701d = new C80877a(this);

    /* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService$a */
    public class C80877a extends C89305a.C89306a {

        /* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService$a$a */
        public class C80878a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80883e f237702d;

            /* renamed from: e */
            public final /* synthetic */ Parcelable f237703e;

            /* renamed from: f */
            public final /* synthetic */ C89308b f237704f;

            /* renamed from: g */
            public final /* synthetic */ String f237705g;

            public C80878a(C80877a aVar, C80883e eVar, Parcelable parcelable, C89308b bVar, String str) {
                this.f237702d = eVar;
                this.f237703e = parcelable;
                this.f237704f = bVar;
                this.f237705g = str;
            }

            public void run() {
                try {
                    this.f237702d.invoke(this.f237703e, new C80879b(this.f237704f));
                } catch (NullPointerException e) {
                    C90741c.m113808a("IPC.BaseIPCService", "invoke task, clazz=%s, npe=%s", this.f237705g, e);
                }
            }
        }

        public C80877a(BaseIPCService baseIPCService) {
        }

        /* renamed from: CP */
        public void mo112672CP(Bundle bundle, String str, C89308b bVar) {
            if (str == null || str.length() == 0) {
                C90741c.m113808a("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.", new Object[0]);
            } else if (bundle == null) {
                C90741c.m113808a("IPC.BaseIPCService", "invokeAsync failed, data is null.", new Object[0]);
            } else {
                bundle.setClassLoader(BaseIPCService.class.getClassLoader());
                Parcelable parcelable = bundle.getParcelable("__remote_task_data");
                String string = bundle.getString("__command_tag");
                C80883e eVar = (C80883e) C80938z.m98814b(str, C80883e.class);
                if (eVar == null) {
                    C90741c.m113808a("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", str);
                    return;
                }
                C90741c.m113809b("IPC.BaseIPCService", "invokeAsync in target process, before ThreadPool.post, clazz=%s", str);
                C80878a aVar = new C80878a(this, eVar, parcelable, bVar, str);
                C80922v vVar = C80922v.f237772b;
                C80882c cVar = C80906n.f237751c;
                if (string == null || string.isEmpty() || cVar == null) {
                    C80922v.m98792a(aVar);
                } else {
                    ((C119157j) C119157j.f356862d).mo183876g(aVar, string);
                }
            }
        }

        /* renamed from: jg */
        public Bundle mo112673jg(Bundle bundle, String str) {
            if (str == null || str.length() == 0) {
                C90741c.m113808a("IPC.BaseIPCService", "invokeSync failed, class is null or nil.", new Object[0]);
                return null;
            } else if (bundle == null) {
                C90741c.m113808a("IPC.BaseIPCService", "invokeSync failed, data is null.", new Object[0]);
                return null;
            } else {
                C80916r rVar = (C80916r) C80938z.m98814b(str, C80916r.class);
                if (rVar == null) {
                    C90741c.m113808a("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", str);
                    return null;
                }
                bundle.setClassLoader(BaseIPCService.class.getClassLoader());
                Parcelable parcelable = bundle.getParcelable("__remote_task_data");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("__remote_task_result_data", (Parcelable) rVar.invoke(parcelable));
                return bundle2;
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService$b */
    public static class C80879b implements C1256g<Parcelable>, C90122a {

        /* renamed from: d */
        public C89308b f237706d;

        /* renamed from: e */
        public final List<C90123b> f237707e = new LinkedList();

        /* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService$b$a */
        public class C80880a implements IBinder.DeathRecipient {

            /* renamed from: d */
            public final /* synthetic */ C89308b f237708d;

            public C80880a(C89308b bVar) {
                this.f237708d = bVar;
            }

            public void binderDied() {
                try {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "binderDied(%s)", Integer.valueOf(this.f237708d.hashCode()));
                } catch (Exception e) {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "DeathRecipient %s", e.getMessage());
                }
            }
        }

        /* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService$b$b */
        public static class C80881b implements Runnable {

            /* renamed from: e */
            public static final Bundle f237710e;

            /* renamed from: d */
            public C89308b f237711d;

            static {
                Bundle bundle = new Bundle();
                f237710e = bundle;
                bundle.putBoolean("__command_release_ref", true);
            }

            public C80881b(C89308b bVar) {
                this.f237711d = bVar;
            }

            public void run() {
                try {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "notify release ref of callback(%s).", Integer.valueOf(this.f237711d.hashCode()));
                    this.f237711d.onCallback(f237710e);
                    C89308b bVar = this.f237711d;
                    if (bVar == null) {
                        Set<Object> set = C90365a.f259368a;
                    } else {
                        Set<Object> set2 = C90365a.f259368a;
                        synchronized (set2) {
                            ((HashSet) set2).remove(bVar);
                        }
                    }
                    this.f237711d = null;
                } catch (RemoteException e) {
                    C90741c.m113808a("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s", Log.getStackTraceString(e));
                } catch (Exception e2) {
                    C90741c.m113808a("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s\n %s", e2.getMessage(), Log.getStackTraceString(e2));
                }
            }
        }

        public C80879b(C89308b bVar) {
            this.f237706d = bVar;
            if (bVar != null) {
                C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "keep ref of callback(%s)", Integer.valueOf(bVar.hashCode()));
                Set<Object> set = C90365a.f259368a;
                synchronized (set) {
                    ((HashSet) set).add(bVar);
                }
                try {
                    this.f237706d.asBinder().linkToDeath(new C80880a(bVar), 0);
                } catch (RemoteException e) {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "%s", e.getMessage());
                }
            }
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Parcelable parcelable = (Parcelable) obj;
            C89308b bVar = this.f237706d;
            if (bVar != null) {
                try {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "onCallback(%d) invoke", Integer.valueOf(bVar.hashCode()));
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "onCallback(%d), isBinderAlive:%b, pingBinder:%b", Integer.valueOf(this.f237706d.hashCode()), Boolean.valueOf(this.f237706d.asBinder().isBinderAlive()), Boolean.valueOf(this.f237706d.asBinder().pingBinder()));
                } catch (Exception e) {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "onCallback %s", e.getMessage());
                }
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("__remote_task_result_data", parcelable);
                    this.f237706d.onCallback(bundle);
                } catch (RemoteException e2) {
                    C90741c.m113808a("IPC.IPCInvokeCallbackProxy", "%s", Log.getStackTraceString(e2));
                    if (!this.f237707e.isEmpty()) {
                        synchronized (this.f237707e) {
                            for (C90123b a : new LinkedList(this.f237707e)) {
                                a.mo113810a(e2);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo112675d(C90123b bVar) {
            if (bVar != null) {
                synchronized (this.f237707e) {
                    if (!((LinkedList) this.f237707e).contains(bVar)) {
                        ((LinkedList) this.f237707e).add(bVar);
                    }
                }
            }
        }

        public void finalize() {
            try {
                if (this.f237706d != null) {
                    C80922v.m98792a(new C80881b(this.f237706d));
                    this.f237706d = null;
                } else {
                    C90741c.m113809b("IPC.IPCInvokeCallbackProxy", "finalize(%s)", Integer.valueOf(hashCode()));
                }
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
            super.finalize();
        }
    }

    public IBinder onBind(Intent intent) {
        C90741c.m113809b("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", intent, Boolean.FALSE);
        if (C80915q.f237765b == null) {
            synchronized (C80915q.class) {
                if (C80915q.f237765b == null) {
                    C80915q.f237765b = new C80915q();
                }
            }
        }
        C80915q qVar = C80915q.f237765b;
        String b = C80906n.m98775b();
        qVar.getClass();
        if (!(b == null || b.length() == 0)) {
            ((HashMap) qVar.f237766a).put(b, this);
        }
        return this.f237701d;
    }

    public boolean onUnbind(Intent intent) {
        C90741c.m113809b("IPC.BaseIPCService", "onUnbind(%s)", intent);
        return super.onUnbind(intent);
    }
}
