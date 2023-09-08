package p981ie;

import android.app.Notification;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p981ie.C87710u;

/* renamed from: ie.n */
public final class C117165n {

    /* renamed from: a */
    public static List<C117167b> f351014a = new ArrayList();

    /* renamed from: b */
    public static boolean f351015b;

    /* renamed from: c */
    public static C87710u f351016c = new C87710u("notification", "android.app.INotificationManager", new C117166a());

    /* renamed from: ie.n$a */
    public class C117166a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.app.Notification} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo122126b(java.lang.reflect.Method r8, java.lang.Object[] r9) {
            /*
                r7 = this;
                java.lang.String r0 = r8.getName()
                java.lang.String r1 = "createNotificationChannels"
                boolean r0 = r1.equals(r0)
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L_0x009d
                if (r9 == 0) goto L_0x0085
                int r8 = r9.length
                r0 = 0
            L_0x0012:
                if (r0 >= r8) goto L_0x0085
                r3 = r9[r0]
                if (r3 != 0) goto L_0x0019
                goto L_0x0082
            L_0x0019:
                java.lang.Class r4 = r3.getClass()
                java.lang.String r4 = r4.getName()
                java.lang.String r5 = "android.content.pm.ParceledListSlice"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0082
                java.lang.Class r4 = r3.getClass()     // Catch:{ Exception -> 0x0065 }
                java.lang.String r5 = "getList"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0065 }
                java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0065 }
                if (r4 == 0) goto L_0x0082
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0065 }
                java.lang.Object r3 = r4.invoke(r3, r5)     // Catch:{ Exception -> 0x0065 }
                boolean r4 = r3 instanceof java.lang.Iterable     // Catch:{ Exception -> 0x0065 }
                if (r4 == 0) goto L_0x0082
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Exception -> 0x0065 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0065 }
            L_0x0047:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0065 }
                if (r4 == 0) goto L_0x0082
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0065 }
                if (r4 == 0) goto L_0x0047
                java.lang.Class r5 = r4.getClass()     // Catch:{ Exception -> 0x0065 }
                java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0065 }
                java.lang.String r6 = "android.app.NotificationChannel"
                boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x0065 }
                if (r5 == 0) goto L_0x0047
                r1 = r4
                goto L_0x0082
            L_0x0065:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "try parse args fail: "
                r4.append(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = "Matrix.battery.NotificationHooker"
                p723vf.C118672d.m167356f(r5, r3, r4)
            L_0x0082:
                int r0 = r0 + 1
                goto L_0x0012
            L_0x0085:
                java.util.List<ie.n$b> r8 = p981ie.C117165n.f351014a
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x008d:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00df
                java.lang.Object r9 = r8.next()
                ie.n$b r9 = (p981ie.C117165n.C117167b) r9
                r9.mo180593a(r1)
                goto L_0x008d
            L_0x009d:
                java.lang.String r8 = r8.getName()
                java.lang.String r0 = "enqueueNotificationWithTag"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x00df
                int r8 = r9.length
                r0 = -1
                r3 = -1
            L_0x00ac:
                if (r2 >= r8) goto L_0x00c7
                r4 = r9[r2]
                boolean r5 = r4 instanceof java.lang.Integer
                if (r5 == 0) goto L_0x00bd
                if (r3 != r0) goto L_0x00c4
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r3 = r4.intValue()
                goto L_0x00c4
            L_0x00bd:
                boolean r5 = r4 instanceof android.app.Notification
                if (r5 == 0) goto L_0x00c4
                android.app.Notification r4 = (android.app.Notification) r4
                r1 = r4
            L_0x00c4:
                int r2 = r2 + 1
                goto L_0x00ac
            L_0x00c7:
                java.util.List<ie.n$b> r8 = p981ie.C117165n.f351014a
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x00cf:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00df
                java.lang.Object r9 = r8.next()
                ie.n$b r9 = (p981ie.C117165n.C117167b) r9
                r9.mo180594b(r3, r1)
                goto L_0x00cf
            L_0x00df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p981ie.C117165n.C117166a.mo122126b(java.lang.reflect.Method, java.lang.Object[]):void");
        }
    }

    /* renamed from: ie.n$b */
    public interface C117167b {
        /* renamed from: a */
        void mo180593a(Object obj);

        /* renamed from: b */
        void mo180594b(int i, Notification notification);
    }
}
