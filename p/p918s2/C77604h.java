package p918s2;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k20.C9556a;
import p428b.C67122a;

/* renamed from: s2.h */
public final class C77604h {

    /* renamed from: c */
    public static final Object f226238c = new Object();

    /* renamed from: d */
    public static String f226239d;

    /* renamed from: e */
    public static Set<String> f226240e = new HashSet();

    /* renamed from: f */
    public static final Object f226241f = new Object();

    /* renamed from: g */
    public static C77608c f226242g;

    /* renamed from: a */
    public final Context f226243a;

    /* renamed from: b */
    public final NotificationManager f226244b;

    /* renamed from: s2.h$a */
    public static class C77605a implements C77606d {

        /* renamed from: a */
        public final String f226245a;

        /* renamed from: b */
        public final int f226246b;

        /* renamed from: c */
        public final String f226247c;

        /* renamed from: d */
        public final Notification f226248d;

        public C77605a(String str, int i, String str2, Notification notification) {
            this.f226245a = str;
            this.f226246b = i;
            this.f226247c = str2;
            this.f226248d = notification;
        }

        /* renamed from: a */
        public void mo107782a(C67122a aVar) {
            aVar.p90(this.f226245a, this.f226246b, this.f226247c, this.f226248d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f226245a + ", id:" + this.f226246b + ", tag:" + this.f226247c + "]";
        }
    }

    /* renamed from: s2.h$d */
    public interface C77606d {
        /* renamed from: a */
        void mo107782a(C67122a aVar);
    }

    /* renamed from: s2.h$b */
    public static class C77607b {

        /* renamed from: a */
        public final ComponentName f226249a;

        /* renamed from: b */
        public final IBinder f226250b;

        public C77607b(ComponentName componentName, IBinder iBinder) {
            this.f226249a = componentName;
            this.f226250b = iBinder;
        }
    }

    /* renamed from: s2.h$c */
    public static class C77608c implements Handler.Callback, ServiceConnection {

        /* renamed from: d */
        public final Context f226251d;

        /* renamed from: e */
        public final Handler f226252e;

        /* renamed from: f */
        public final Map<ComponentName, C77609a> f226253f = new HashMap();

        /* renamed from: g */
        public Set<String> f226254g = new HashSet();

        /* renamed from: s2.h$c$a */
        public static class C77609a {

            /* renamed from: a */
            public final ComponentName f226255a;

            /* renamed from: b */
            public boolean f226256b = false;

            /* renamed from: c */
            public C67122a f226257c;

            /* renamed from: d */
            public ArrayDeque<C77606d> f226258d = new ArrayDeque<>();

            /* renamed from: e */
            public int f226259e = 0;

            public C77609a(ComponentName componentName) {
                this.f226255a = componentName;
            }
        }

        public C77608c(Context context) {
            this.f226251d = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f226252e = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final void mo107784a(C77609a aVar) {
            boolean z;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f226255a);
                aVar.f226258d.size();
            }
            if (!aVar.f226258d.isEmpty()) {
                if (aVar.f226256b) {
                    z = true;
                } else {
                    boolean bindService = this.f226251d.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f226255a), this, 33);
                    aVar.f226256b = bindService;
                    if (bindService) {
                        aVar.f226259e = 0;
                    } else {
                        Objects.toString(aVar.f226255a);
                        this.f226251d.unbindService(this);
                    }
                    z = aVar.f226256b;
                }
                if (!z || aVar.f226257c == null) {
                    mo107785b(aVar);
                    return;
                }
                while (true) {
                    C77606d peek = aVar.f226258d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            peek.toString();
                        }
                        peek.mo107782a(aVar.f226257c);
                        aVar.f226258d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(aVar.f226255a);
                        }
                    } catch (RemoteException unused2) {
                        Objects.toString(aVar.f226255a);
                    }
                }
                if (!aVar.f226258d.isEmpty()) {
                    mo107785b(aVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo107785b(C77609a aVar) {
            if (!this.f226252e.hasMessages(3, aVar.f226255a)) {
                int i = aVar.f226259e + 1;
                aVar.f226259e = i;
                if (i > 6) {
                    aVar.f226258d.size();
                    Objects.toString(aVar.f226255a);
                    aVar.f226258d.clear();
                    return;
                }
                Log.isLoggable("NotifManCompat", 3);
                this.f226252e.sendMessageDelayed(this.f226252e.obtainMessage(3, aVar.f226255a), (long) ((1 << (i - 1)) * 1000));
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            C67122a aVar = null;
            if (i == 0) {
                C77606d dVar = (C77606d) message.obj;
                Set<String> b = C77604h.m93589b(this.f226251d);
                if (!b.equals(this.f226254g)) {
                    this.f226254g = b;
                    List<ResolveInfo> queryIntentServices = this.f226251d.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (b.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                componentName.toString();
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!((HashMap) this.f226253f).containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(componentName2);
                            }
                            ((HashMap) this.f226253f).put(componentName2, new C77609a(componentName2));
                        }
                    }
                    Iterator it4 = ((HashMap) this.f226253f).entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(entry.getKey());
                            }
                            C77609a aVar2 = (C77609a) entry.getValue();
                            if (aVar2.f226256b) {
                                this.f226251d.unbindService(this);
                                aVar2.f226256b = false;
                            }
                            aVar2.f226257c = null;
                            it4.remove();
                        }
                    }
                }
                for (C77609a aVar3 : ((HashMap) this.f226253f).values()) {
                    aVar3.f226258d.add(dVar);
                    mo107784a(aVar3);
                }
                return true;
            } else if (i == 1) {
                C77607b bVar = (C77607b) message.obj;
                ComponentName componentName3 = bVar.f226249a;
                IBinder iBinder = bVar.f226250b;
                C77609a aVar4 = (C77609a) ((HashMap) this.f226253f).get(componentName3);
                if (aVar4 != null) {
                    int i2 = C67122a.C67123a.f192730d;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C67122a)) ? new C67122a.C67123a.C67124a(iBinder) : (C67122a) queryLocalInterface;
                    }
                    aVar4.f226257c = aVar;
                    aVar4.f226259e = 0;
                    mo107784a(aVar4);
                }
                return true;
            } else if (i == 2) {
                C77609a aVar5 = (C77609a) ((HashMap) this.f226253f).get((ComponentName) message.obj);
                if (aVar5 != null) {
                    if (aVar5.f226256b) {
                        this.f226251d.unbindService(this);
                        aVar5.f226256b = false;
                    }
                    aVar5.f226257c = null;
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                C77609a aVar6 = (C77609a) ((HashMap) this.f226253f).get((ComponentName) message.obj);
                if (aVar6 != null) {
                    mo107784a(aVar6);
                }
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f226252e.obtainMessage(1, new C77607b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f226252e.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public C77604h(Context context) {
        this.f226243a = context;
        this.f226244b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static Set<String> m93589b(Context context) {
        Set<String> set;
        ContentResolver contentResolver = context.getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("enabled_notification_listeners");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "androidx/core/app/NotificationManagerCompat", "getEnabledListenerPackages", "(Landroid/content/Context;)Ljava/util/Set;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        synchronized (f226238c) {
            if (str != null) {
                if (!str.equals(f226239d)) {
                    String[] split = str.split(XVFSFile.PATH_SEPARATOR, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f226240e = hashSet;
                    f226239d = str;
                }
            }
            set = f226240e;
        }
        return set;
    }

    /* renamed from: a */
    public boolean mo107781a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f226244b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f226243a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f226243a.getApplicationInfo();
        String packageName = this.f226243a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
