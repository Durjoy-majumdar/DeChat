package bh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

/* renamed from: bh3.e */
public final class C104141e {

    /* renamed from: a */
    public static final C104141e f308136a = new C104141e();

    /* renamed from: bh3.e$a */
    public static final class C104142a implements InvocationHandler {

        /* renamed from: a */
        public final Object f308137a;

        public C104142a(Object obj) {
            C87412m.m108594g(obj, "originObject");
            this.f308137a = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0058 A[Catch:{ Exception -> 0x00bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[Catch:{ Exception -> 0x00bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[Catch:{ Exception -> 0x00bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ Exception -> 0x00bb }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
            /*
                r8 = this;
                java.lang.String r9 = ""
                r0 = 0
                if (r10 == 0) goto L_0x000a
                java.lang.String r1 = r10.getName()
                goto L_0x000b
            L_0x000a:
                r1 = r0
            L_0x000b:
                if (r1 != 0) goto L_0x000e
                return r0
            L_0x000e:
                h91.a$a r2 = h91.C108175a.f323906a     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                java.lang.Object r3 = r8.f308137a     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                r4 = 0
                if (r11 != 0) goto L_0x0020
                if (r10 == 0) goto L_0x001e
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                java.lang.Object r9 = r10.invoke(r3, r11)     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                goto L_0x002b
            L_0x001e:
                r9 = r0
                goto L_0x002b
            L_0x0020:
                if (r10 == 0) goto L_0x001e
                int r5 = r11.length     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r5)     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
                java.lang.Object r9 = r10.invoke(r3, r11)     // Catch:{ InvocationTargetException -> 0x00ec, all -> 0x00c6 }
            L_0x002b:
                java.lang.String r10 = "getContentProvider"
                boolean r10 = gy3.C87412m.m108589b(r10, r1)     // Catch:{ Exception -> 0x00bb }
                if (r10 == 0) goto L_0x00c5
                if (r9 == 0) goto L_0x00c5
                java.lang.Class r10 = r9.getClass()     // Catch:{ Exception -> 0x00bb }
                bh3.e r11 = bh3.C104141e.f308136a     // Catch:{ Exception -> 0x00bb }
                java.lang.String r1 = "IContentProvider"
                java.lang.String r3 = "provider"
                java.lang.reflect.Field r10 = bh3.C104141e.m138971a(r11, r9, r10, r1, r3)     // Catch:{ Exception -> 0x00bb }
                r11 = 1
                if (r10 == 0) goto L_0x005a
                java.lang.Class r1 = r10.getType()     // Catch:{ Exception -> 0x00bb }
                if (r1 == 0) goto L_0x005a
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x00bb }
                java.lang.String r3 = "proxy"
                boolean r1 = z04.C112550d0.m153801u(r1, r3, r11)     // Catch:{ Exception -> 0x00bb }
                if (r1 != r11) goto L_0x005a
                r1 = 1
                goto L_0x005b
            L_0x005a:
                r1 = 0
            L_0x005b:
                if (r1 == 0) goto L_0x0066
                java.lang.String r10 = "Kenneth-methodCall"
                java.lang.String r11 = "[contentProvider], already proxy"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x00bb }
                goto L_0x00c5
            L_0x0066:
                if (r10 != 0) goto L_0x0069
                goto L_0x006c
            L_0x0069:
                r10.setAccessible(r11)     // Catch:{ Exception -> 0x00bb }
            L_0x006c:
                if (r10 == 0) goto L_0x0073
                java.lang.Object r11 = r10.get(r9)     // Catch:{ Exception -> 0x00bb }
                goto L_0x0074
            L_0x0073:
                r11 = r0
            L_0x0074:
                if (r11 == 0) goto L_0x007c
                bh3.e$b r1 = new bh3.e$b     // Catch:{ Exception -> 0x00bb }
                r1.<init>(r11)     // Catch:{ Exception -> 0x00bb }
                goto L_0x007d
            L_0x007c:
                r1 = r0
            L_0x007d:
                if (r11 == 0) goto L_0x0084
                java.lang.Class r3 = r11.getClass()     // Catch:{ Exception -> 0x00bb }
                goto L_0x0085
            L_0x0084:
                r3 = r0
            L_0x0085:
                java.util.ArrayList r2 = r2.mo158583a(r3)     // Catch:{ Exception -> 0x00bb }
                if (r2 != 0) goto L_0x008c
                goto L_0x00c5
            L_0x008c:
                int r3 = r2.size()     // Catch:{ Exception -> 0x00bb }
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00bb }
                r6 = 0
            L_0x0093:
                if (r6 >= r3) goto L_0x00a0
                java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x00bb }
                java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ Exception -> 0x00bb }
                r5[r6] = r7     // Catch:{ Exception -> 0x00bb }
                int r6 = r6 + 1
                goto L_0x0093
            L_0x00a0:
                if (r11 == 0) goto L_0x00ab
                java.lang.Class r11 = r11.getClass()     // Catch:{ Exception -> 0x00bb }
                java.lang.ClassLoader r11 = r11.getClassLoader()     // Catch:{ Exception -> 0x00bb }
                goto L_0x00ac
            L_0x00ab:
                r11 = r0
            L_0x00ac:
                if (r11 == 0) goto L_0x00b5
                if (r1 != 0) goto L_0x00b1
                goto L_0x00b5
            L_0x00b1:
                java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r11, r5, r1)     // Catch:{ Exception -> 0x00bb }
            L_0x00b5:
                if (r10 == 0) goto L_0x00c5
                r10.set(r9, r0)     // Catch:{ Exception -> 0x00bb }
                goto L_0x00c5
            L_0x00bb:
                r10 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.String r0 = "ContentProviderHooker"
                java.lang.String r1 = "HookInvocationHandler:startActivity"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r1, r11)
            L_0x00c5:
                return r9
            L_0x00c6:
                r11 = move-exception
                hh3.b r1 = hh3.C117092b.f350860a
                if (r10 == 0) goto L_0x00cf
                java.lang.String r0 = r10.getName()
            L_0x00cf:
                if (r0 != 0) goto L_0x00d2
                goto L_0x00d3
            L_0x00d2:
                r9 = r0
            L_0x00d3:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "[Throwable]: "
                r10.append(r0)
                java.lang.String r0 = r11.getMessage()
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                r1.mo181043b(r9, r10)
                throw r11
            L_0x00ec:
                r11 = move-exception
                hh3.b r1 = hh3.C117092b.f350860a
                if (r10 == 0) goto L_0x00f5
                java.lang.String r0 = r10.getName()
            L_0x00f5:
                if (r0 != 0) goto L_0x00f8
                goto L_0x00f9
            L_0x00f8:
                r9 = r0
            L_0x00f9:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "[InvocationTargetException]: "
                r10.append(r0)
                r10.append(r11)
                java.lang.String r0 = ",targetException:"
                r10.append(r0)
                java.lang.Throwable r0 = r11.getTargetException()
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                r1.mo181043b(r9, r10)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "catch InvocationTargetException: "
                r9.append(r10)
                java.lang.Throwable r10 = r11.getTargetException()
                java.lang.String r10 = r10.getMessage()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "SystemServiceBinderHooker"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                java.lang.Throwable r9 = r11.getTargetException()
                boolean r9 = r9 instanceof android.os.RemoteException
                java.lang.String r0 = "e.targetException"
                if (r9 == 0) goto L_0x0165
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "catch InvocationTargetException target is RemoteException: "
                r9.append(r1)
                java.lang.Throwable r1 = r11.getTargetException()
                java.lang.String r1 = r1.getMessage()
                r9.append(r1)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                java.lang.Throwable r9 = r11.getTargetException()
                gy3.C87412m.m108593f(r9, r0)
                throw r9
            L_0x0165:
                java.lang.Throwable r9 = r11.getTargetException()
                gy3.C87412m.m108593f(r9, r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: bh3.C104141e.C104142a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: bh3.e$b */
    public static final class C104143b implements InvocationHandler {

        /* renamed from: a */
        public final Object f308138a;

        public C104143b(Object obj) {
            C87412m.m108594g(obj, "originObject");
            this.f308138a = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00be A[SYNTHETIC, Splitter:B:56:0x00be] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13, java.lang.reflect.Method r14, java.lang.Object[] r15) {
            /*
                r12 = this;
                com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r13 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
                boolean r13 = r13.mo176849f()
                java.lang.String r0 = "invoke method catch err:"
                java.lang.String r1 = "ContentProviderHooker"
                r2 = 0
                r3 = 0
                if (r13 != 0) goto L_0x00ef
                if (r14 == 0) goto L_0x0015
                java.lang.String r13 = r14.getName()
                goto L_0x0016
            L_0x0015:
                r13 = r3
            L_0x0016:
                java.lang.String r4 = "query"
                boolean r13 = gy3.C87412m.m108589b(r13, r4)
                if (r13 == 0) goto L_0x00ef
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r4 = "[contentProvider], method:"
                r13.append(r4)
                if (r14 == 0) goto L_0x002f
                java.lang.String r4 = r14.getName()
                goto L_0x0030
            L_0x002f:
                r4 = r3
            L_0x0030:
                r13.append(r4)
                java.lang.String r4 = ", args:"
                r13.append(r4)
                r13.append(r15)
                java.lang.String r13 = r13.toString()
                java.lang.String r4 = "Kenneth-methodCall"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
                r13 = 1
                if (r15 == 0) goto L_0x0052
                int r4 = r15.length
                if (r4 != 0) goto L_0x004c
                r4 = 1
                goto L_0x004d
            L_0x004c:
                r4 = 0
            L_0x004d:
                r4 = r4 ^ r13
                if (r4 != r13) goto L_0x0052
                r4 = 1
                goto L_0x0053
            L_0x0052:
                r4 = 0
            L_0x0053:
                if (r4 == 0) goto L_0x0057
                r4 = r15
                goto L_0x0058
            L_0x0057:
                r4 = r3
            L_0x0058:
                if (r4 == 0) goto L_0x009f
                int r5 = r4.length
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x005e:
                if (r6 >= r5) goto L_0x009d
                r9 = r4[r6]
                boolean r10 = r9 instanceof android.net.Uri
                if (r10 == 0) goto L_0x0078
                android.net.Uri r11 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                boolean r11 = gy3.C87412m.m108589b(r9, r11)
                if (r11 != 0) goto L_0x0076
                android.net.Uri r11 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                boolean r11 = gy3.C87412m.m108589b(r9, r11)
                if (r11 == 0) goto L_0x0078
            L_0x0076:
                r7 = 1
                goto L_0x009a
            L_0x0078:
                if (r10 == 0) goto L_0x008b
                r10 = r9
                android.net.Uri r10 = (android.net.Uri) r10
                java.lang.String r10 = r10.getAuthority()
                java.lang.String r11 = "com.android.contacts"
                boolean r10 = gy3.C87412m.m108589b(r10, r11)
                if (r10 == 0) goto L_0x008b
                r8 = 1
                goto L_0x009a
            L_0x008b:
                boolean r10 = r9 instanceof java.lang.Object[]
                if (r10 == 0) goto L_0x009a
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                java.lang.String r10 = "date_added"
                boolean r9 = sx3.C110823p.m151009y(r9, r10)
                if (r9 == 0) goto L_0x009a
                goto L_0x00a2
            L_0x009a:
                int r6 = r6 + 1
                goto L_0x005e
            L_0x009d:
                r13 = 0
                goto L_0x00a2
            L_0x009f:
                r13 = 0
                r7 = 0
                r8 = 0
            L_0x00a2:
                if (r7 != 0) goto L_0x00a6
                if (r8 == 0) goto L_0x00ef
            L_0x00a6:
                if (r13 != 0) goto L_0x00ef
                if (r8 == 0) goto L_0x00ad
                java.lang.String r13 = "queryContact"
                goto L_0x00b4
            L_0x00ad:
                if (r7 == 0) goto L_0x00b2
                java.lang.String r13 = "queryMedia"
                goto L_0x00b4
            L_0x00b2:
                java.lang.String r13 = ""
            L_0x00b4:
                com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r4 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
                r5 = 2
                boolean r13 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(r4, r13, r3, r5, r3)
                if (r13 == 0) goto L_0x00be
                return r3
            L_0x00be:
                java.lang.Object r13 = r12.f308138a     // Catch:{ all -> 0x00d7 }
                if (r15 != 0) goto L_0x00cb
                if (r14 == 0) goto L_0x00ee
                java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d7 }
                java.lang.Object r3 = r14.invoke(r13, r15)     // Catch:{ all -> 0x00d7 }
                goto L_0x00ee
            L_0x00cb:
                if (r14 == 0) goto L_0x00ee
                int r2 = r15.length     // Catch:{ all -> 0x00d7 }
                java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)     // Catch:{ all -> 0x00d7 }
                java.lang.Object r3 = r14.invoke(r13, r15)     // Catch:{ all -> 0x00d7 }
                goto L_0x00ee
            L_0x00d7:
                r13 = move-exception
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r0)
                java.lang.String r13 = r13.getMessage()
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            L_0x00ee:
                return r3
            L_0x00ef:
                java.lang.Object r13 = r12.f308138a     // Catch:{ all -> 0x0108 }
                if (r15 != 0) goto L_0x00fc
                if (r14 == 0) goto L_0x011f
                java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ all -> 0x0108 }
                java.lang.Object r3 = r14.invoke(r13, r15)     // Catch:{ all -> 0x0108 }
                goto L_0x011f
            L_0x00fc:
                if (r14 == 0) goto L_0x011f
                int r2 = r15.length     // Catch:{ all -> 0x0108 }
                java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)     // Catch:{ all -> 0x0108 }
                java.lang.Object r3 = r14.invoke(r13, r15)     // Catch:{ all -> 0x0108 }
                goto L_0x011f
            L_0x0108:
                r13 = move-exception
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r0)
                java.lang.String r13 = r13.getMessage()
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            L_0x011f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: bh3.C104141e.C104143b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final Field m138971a(C104141e eVar, Object obj, Class cls, String str, String str2) {
        Field field;
        eVar.getClass();
        try {
            field = cls.getDeclaredField(str2);
            try {
                Log.m105924i("ContentProviderHooker", "[findField] = " + field);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            field = null;
            Log.m105924i("ContentProviderHooker", "NoSuchFieldException: " + th.getMessage());
            return field;
        }
        return field;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC, Splitter:B:17:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0036 A[SYNTHETIC, Splitter:B:26:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0042  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145781b() {
        /*
            r12 = this;
            java.lang.String r0 = "ContentProviderHooker"
            java.lang.String r1 = "hookBiggerEqualApi26LessApi29()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = 0
            h91.a$a r2 = h91.C108175a.f323906a     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "android.app.ActivityManager"
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r3 = r4
        L_0x0013:
            java.lang.String r5 = "IActivityManagerSingleton"
            r6 = 1
            if (r3 == 0) goto L_0x0021
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0020 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0020 }
            goto L_0x0022
        L_0x0020:
        L_0x0021:
            r3 = r4
        L_0x0022:
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            r3 = r4
            goto L_0x002a
        L_0x0026:
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0024 }
        L_0x002a:
            java.lang.String r5 = "android.util.Singleton"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            java.lang.String r7 = "mInstance"
            if (r5 == 0) goto L_0x003e
            java.lang.reflect.Field r5 = r5.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x003e }
            r5.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r5 = r4
        L_0x003f:
            if (r5 != 0) goto L_0x0042
            return
        L_0x0042:
            if (r3 != 0) goto L_0x0046
            r6 = r4
            goto L_0x004a
        L_0x0046:
            java.lang.Object r6 = r5.get(r3)     // Catch:{ Exception -> 0x0083 }
        L_0x004a:
            if (r6 != 0) goto L_0x004d
            return
        L_0x004d:
            bh3.e$a r7 = new bh3.e$a     // Catch:{ Exception -> 0x0083 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0083 }
            java.lang.Class r8 = r6.getClass()     // Catch:{ Exception -> 0x0083 }
            java.util.ArrayList r2 = r2.mo158583a(r8)     // Catch:{ Exception -> 0x0083 }
            if (r2 != 0) goto L_0x005d
            return
        L_0x005d:
            int r8 = r2.size()     // Catch:{ Exception -> 0x0083 }
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0083 }
            r10 = 0
        L_0x0064:
            if (r10 >= r8) goto L_0x0071
            java.lang.Object r11 = r2.get(r10)     // Catch:{ Exception -> 0x0083 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ Exception -> 0x0083 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0083 }
            int r10 = r10 + 1
            goto L_0x0064
        L_0x0071:
            java.lang.Class r2 = r6.getClass()     // Catch:{ Exception -> 0x0083 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x0083 }
            if (r2 == 0) goto L_0x007f
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r2, r9, r7)     // Catch:{ Exception -> 0x0083 }
        L_0x007f:
            r5.set(r3, r4)     // Catch:{ Exception -> 0x0083 }
            goto L_0x008b
        L_0x0083:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "hookBiggerEqualApi26LessApi29"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C104141e.mo145781b():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[SYNTHETIC, Splitter:B:16:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:16:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f A[Catch:{ Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ExcHandler: IllegalAccessException | IllegalArgumentException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:86:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013c A[SYNTHETIC, Splitter:B:90:0x013c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145782c() {
        /*
            r12 = this;
            java.lang.String r0 = "ContentProviderHooker"
            java.lang.String r1 = "FinderReportHooker start hook"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 0
            r4 = 26
            if (r1 >= r4) goto L_0x0180
            java.lang.String r1 = "hookLessApi26"
            java.lang.String r4 = "hookLessApi26()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            java.lang.String r4 = "android.app.ActivityManagerNative"
            r5 = 0
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r4 = r5
        L_0x0020:
            java.lang.String r6 = "gDefault"
            if (r4 == 0) goto L_0x0030
            java.lang.reflect.Field r7 = r4.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x002f, Exception -> 0x002c }
            r7.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x002f, Exception -> 0x002c }
            goto L_0x0031
        L_0x002c:
            r7 = r5
            goto L_0x0047
        L_0x002f:
        L_0x0030:
            r7 = r5
        L_0x0031:
            if (r4 == 0) goto L_0x003e
            java.lang.reflect.Field r6 = r4.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x003d, Exception -> 0x003b }
            r6.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x003d, Exception -> 0x003b }
            goto L_0x003f
        L_0x003b:
            goto L_0x0047
        L_0x003d:
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 != 0) goto L_0x0042
            goto L_0x008c
        L_0x0042:
            java.lang.Object r6 = r6.get(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x008b, Exception -> 0x003b }
            goto L_0x008d
        L_0x0047:
            if (r4 == 0) goto L_0x008c
            java.lang.String r6 = "getDefault"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0082 }
            java.lang.reflect.Method r6 = r4.getDeclaredMethod(r6, r8)     // Catch:{ Exception -> 0x0082 }
            if (r6 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r6.setAccessible(r2)     // Catch:{ Exception -> 0x0082 }
        L_0x0057:
            if (r6 != 0) goto L_0x005b
            r6 = r5
            goto L_0x0061
        L_0x005b:
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r6 = r6.invoke(r5, r8)     // Catch:{ Exception -> 0x0082 }
        L_0x0061:
            if (r6 == 0) goto L_0x008d
            java.lang.Class r8 = r6.getClass()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r8 = r8.getCanonicalName()     // Catch:{ Exception -> 0x0080 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0080 }
            r9.<init>()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r10 = "crash, gDefaultObject: "
            r9.append(r10)     // Catch:{ Exception -> 0x0080 }
            r9.append(r8)     // Catch:{ Exception -> 0x0080 }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x0080 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x0080 }
            goto L_0x008d
        L_0x0080:
            r8 = move-exception
            goto L_0x0085
        L_0x0082:
            r6 = move-exception
            r8 = r6
            r6 = r5
        L_0x0085:
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0179 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r8, r1, r9)     // Catch:{ Exception -> 0x0179 }
            goto L_0x008d
        L_0x008b:
        L_0x008c:
            r6 = r5
        L_0x008d:
            if (r6 != 0) goto L_0x0096
            java.lang.String r2 = "gDefaultObject == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ Exception -> 0x0179 }
            goto L_0x0191
        L_0x0096:
            if (r4 == 0) goto L_0x00fd
            h91.a$a r8 = h91.C108175a.f323906a     // Catch:{ Exception -> 0x0179 }
            boolean r4 = r4.isInstance(r6)     // Catch:{ Exception -> 0x0179 }
            if (r4 == 0) goto L_0x00fd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r2.<init>()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "hookLessApi26, "
            r2.append(r4)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r4 = r6.getClass()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ Exception -> 0x0179 }
            r2.append(r4)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0179 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r2 = r6.getClass()     // Catch:{ Exception -> 0x0179 }
            java.util.ArrayList r2 = r8.mo158583a(r2)     // Catch:{ Exception -> 0x0179 }
            if (r2 != 0) goto L_0x00c8
            goto L_0x0191
        L_0x00c8:
            int r4 = r2.size()     // Catch:{ Exception -> 0x0179 }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0179 }
            r9 = 0
        L_0x00cf:
            if (r9 >= r4) goto L_0x00dc
            java.lang.Object r10 = r2.get(r9)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ Exception -> 0x0179 }
            r8[r9] = r10     // Catch:{ Exception -> 0x0179 }
            int r9 = r9 + 1
            goto L_0x00cf
        L_0x00dc:
            bh3.e$a r2 = new bh3.e$a     // Catch:{ Exception -> 0x0179 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r4 = r6.getClass()     // Catch:{ Exception -> 0x0179 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x0179 }
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r4, r8, r2)     // Catch:{ Exception -> 0x0179 }
            goto L_0x00f1
        L_0x00f0:
            r2 = r5
        L_0x00f1:
            if (r7 == 0) goto L_0x00f6
            r7.set(r5, r2)     // Catch:{ Exception -> 0x0179 }
        L_0x00f6:
            java.lang.String r2 = "hookLessApi26() NOT Single Instance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0179 }
            goto L_0x0191
        L_0x00fd:
            java.lang.String r4 = "android.util.Singleton"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0104 }
            goto L_0x0106
        L_0x0104:
            r4 = r5
        L_0x0106:
            if (r4 == 0) goto L_0x010d
            boolean r7 = r4.isInstance(r6)     // Catch:{ Exception -> 0x0179 }
            goto L_0x010e
        L_0x010d:
            r7 = 0
        L_0x010e:
            if (r7 == 0) goto L_0x0191
            java.lang.String r7 = "mInstance"
            if (r4 == 0) goto L_0x011d
            java.lang.reflect.Field r8 = r4.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x011c }
            r8.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x011c }
            goto L_0x011e
        L_0x011c:
        L_0x011d:
            r8 = r5
        L_0x011e:
            if (r8 != 0) goto L_0x0122
            goto L_0x0191
        L_0x0122:
            if (r4 == 0) goto L_0x0138
            java.lang.reflect.Field r4 = r4.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x012e }
            r4.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x012e }
            goto L_0x0130
        L_0x012c:
            goto L_0x0138
        L_0x012e:
            r4 = r5
        L_0x0130:
            if (r4 != 0) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            java.lang.Object r2 = r4.get(r6)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x012c, IllegalAccessException | IllegalArgumentException -> 0x012c }
            goto L_0x0139
        L_0x0138:
            r2 = r5
        L_0x0139:
            if (r2 != 0) goto L_0x013c
            goto L_0x0191
        L_0x013c:
            h91.a$a r4 = h91.C108175a.f323906a     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r7 = r2.getClass()     // Catch:{ Exception -> 0x0179 }
            java.util.ArrayList r4 = r4.mo158583a(r7)     // Catch:{ Exception -> 0x0179 }
            if (r4 != 0) goto L_0x0149
            goto L_0x0191
        L_0x0149:
            int r7 = r4.size()     // Catch:{ Exception -> 0x0179 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0179 }
            r10 = 0
        L_0x0150:
            if (r10 >= r7) goto L_0x015d
            java.lang.Object r11 = r4.get(r10)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ Exception -> 0x0179 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0179 }
            int r10 = r10 + 1
            goto L_0x0150
        L_0x015d:
            bh3.e$a r4 = new bh3.e$a     // Catch:{ Exception -> 0x0179 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0179 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception -> 0x0179 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x0179 }
            if (r2 == 0) goto L_0x0170
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r2, r9, r4)     // Catch:{ Exception -> 0x0179 }
        L_0x0170:
            r8.set(r6, r5)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = "hookLessApi26() YES Single Instance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0179 }
            goto L_0x0191
        L_0x0179:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r1, r3)
            goto L_0x0191
        L_0x0180:
            if (r4 > r1) goto L_0x0187
            r0 = 29
            if (r1 >= r0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r2 = 0
        L_0x0188:
            if (r2 == 0) goto L_0x018e
            r12.mo145781b()
            goto L_0x0191
        L_0x018e:
            r12.mo145781b()
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C104141e.mo145782c():void");
    }
}
