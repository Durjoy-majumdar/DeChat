package fw3;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import gw3.C116997a;
import gw3.C117000d;
import gw3.C117001e;
import gw3.C117002f;
import gw3.C117005i;
import hw3.C117123e;
import java.util.ArrayList;
import java.util.List;
import kw3.C117428b;
import rv3.C118245h;
import vv3.C118702d;
import xv3.C118905a;
import yv3.C118997b;

/* renamed from: fw3.c */
public class C116906c extends C116904a {

    /* renamed from: e */
    public List<C117123e> f350326e = new ArrayList();

    /* renamed from: f */
    public C117123e f350327f;

    public C116906c(C118702d dVar, C118997b bVar) {
        super(dVar, bVar);
    }

    /* renamed from: b */
    public void mo180867b() {
        if (this.f350326e != null) {
            C118245h.m166799a("sensor_MultiDataHandle", "[method: doStop ] " + ((ArrayList) this.f350326e).size());
            ((ArrayList) this.f350326e).clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180868c(java.util.HashMap<java.lang.Integer, java.util.List<gw3.C117003g>> r17, java.util.List<gw3.C117005i> r18, java.util.List<gw3.C117004h> r19, kw3.C117428b r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r3 = r20
            java.lang.String r4 = ""
            java.lang.String r5 = "DeviceUtil"
            r6 = 0
            r7 = 1
            if (r17 == 0) goto L_0x001f
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x001f
            if (r2 == 0) goto L_0x001f
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            java.lang.String r8 = "sensor_MultiDataHandle"
            if (r0 == 0) goto L_0x003a
            yv3.b r0 = r1.f350325d
            ew3.c r0 = (ew3.C116793c) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f350117h
            boolean r0 = r0.get()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0034
            r1.mo180872f(r3)
        L_0x0034:
            java.lang.String r0 = "[method: add2SlicedList ] --data exception, delete this req"
            rv3.C118245h.m166799a(r8, r0)
            return
        L_0x003a:
            gw3.c r9 = new gw3.c
            r9.<init>()
            vv3.d r0 = r1.f350323b
            android.content.Context r0 = r0.f355205a
            r10 = -1
            int r0 = rv3.C90101c.m112730c(r0)     // Catch:{ all -> 0x004a }
            r11 = r0
            goto L_0x0058
        L_0x004a:
            r0 = move-exception
            r11 = r0
            boolean r0 = rv3.C118245h.f353423a
            if (r0 == 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r4, r0)
        L_0x0057:
            r11 = -1
        L_0x0058:
            if (r11 != 0) goto L_0x005c
        L_0x005a:
            r0 = 0
            goto L_0x007b
        L_0x005c:
            vv3.d r0 = r1.f350323b
            android.content.Context r0 = r0.f355205a
            java.lang.String r12 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r12)     // Catch:{ all -> 0x006e }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ all -> 0x006e }
            boolean r0 = r0.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x006e }
            r0 = r0 ^ r7
            goto L_0x007b
        L_0x006e:
            r0 = move-exception
            boolean r12 = rv3.C118245h.f353423a
            if (r12 == 0) goto L_0x005a
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r4, r12)
            goto L_0x005a
        L_0x007b:
            r4 = 2
            if (r11 != 0) goto L_0x0080
            r5 = 2
            goto L_0x0081
        L_0x0080:
            r5 = 1
        L_0x0081:
            r9.f350618f = r5
            if (r0 != 0) goto L_0x0086
            r4 = 1
        L_0x0086:
            r9.f350619g = r4
            r0 = 0
            if (r17 == 0) goto L_0x00bc
            boolean r4 = r17.isEmpty()
            if (r4 != 0) goto L_0x00bc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r5 = r17.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x009e:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x00bd
            java.lang.Object r11 = r5.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x009e
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x009e
            r4.addAll(r11)
            goto L_0x009e
        L_0x00bc:
            r4 = r0
        L_0x00bd:
            if (r4 == 0) goto L_0x00d7
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00d7
            java.lang.Object r5 = r4.get(r6)
            gw3.g r5 = (gw3.C117003g) r5
            long r11 = r5.f350639h
            r9.f350616d = r11
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r9.f350617e = r5
            goto L_0x00dd
        L_0x00d7:
            long r4 = android.os.SystemClock.uptimeMillis()
            r9.f350616d = r4
        L_0x00dd:
            if (r2 == 0) goto L_0x00ee
            boolean r4 = r18.isEmpty()
            if (r4 == 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            fw3.b r4 = new fw3.b
            r4.<init>(r1)
            java.util.Collections.sort(r2, r4)
        L_0x00ee:
            r4 = r19
            gw3.a r2 = r1.mo180866a(r9, r2, r4)
            hw3.e r4 = r1.f350327f
            if (r4 != 0) goto L_0x0119
            hw3.e r4 = new hw3.e
            r4.<init>(r2)
            r1.f350327f = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[method: add2SlicedList ] --create sliced when tmpSliced is null : "
            r2.append(r4)
            hw3.e r4 = r1.f350327f
            long r4 = r4.f350925b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            rv3.C118245h.m166799a(r8, r2)
            goto L_0x025b
        L_0x0119:
            r11 = 0
            long r4 = r4.f350925b
            long r13 = xv3.C118905a.m167656c(r2)
            hw3.e r9 = r1.f350327f
            gw3.a r9 = r9.f350924a
            boolean r15 = xv3.C118905a.m167657d(r9)
            if (r15 == 0) goto L_0x017c
            boolean r15 = xv3.C118905a.m167658e(r9)
            if (r15 == 0) goto L_0x017c
            boolean r15 = xv3.C118905a.m167657d(r2)
            if (r15 == 0) goto L_0x017c
            boolean r15 = xv3.C118905a.m167658e(r2)
            if (r15 != 0) goto L_0x013e
            goto L_0x017c
        L_0x013e:
            java.util.ArrayList<gw3.f> r9 = r9.f350596g
            java.lang.Object r9 = r9.get(r6)
            gw3.f r9 = (gw3.C117002f) r9
            java.util.ArrayList<gw3.c> r9 = r9.f350630e
            java.lang.Object r9 = r9.get(r6)
            gw3.c r9 = (gw3.C116999c) r9
            java.util.ArrayList<gw3.g> r9 = r9.f350617e
            java.util.ArrayList<gw3.f> r11 = r2.f350596g
            java.lang.Object r11 = r11.get(r6)
            gw3.f r11 = (gw3.C117002f) r11
            java.util.ArrayList<gw3.c> r11 = r11.f350630e
            java.lang.Object r11 = r11.get(r6)
            gw3.c r11 = (gw3.C116999c) r11
            java.util.ArrayList<gw3.g> r11 = r11.f350617e
            java.lang.Object r11 = r11.get(r6)
            gw3.g r11 = (gw3.C117003g) r11
            long r11 = r11.f350639h
            int r15 = r9.size()
            int r15 = r15 + r10
            java.lang.Object r9 = r9.get(r15)
            gw3.g r9 = (gw3.C117003g) r9
            long r9 = r9.f350639h
            long r11 = r11 - r9
            long r11 = java.lang.Math.abs(r11)
        L_0x017c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[method: isNotAllowedMerge ] slicedDuration : "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ", nowReqDuration : "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = ", interval : "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            rv3.C118245h.m166799a(r8, r9)
            r9 = 500(0x1f4, double:2.47E-321)
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 > 0) goto L_0x01b0
            long r4 = r4 + r13
            r9 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r4 = 0
            goto L_0x01b1
        L_0x01b0:
            r4 = 1
        L_0x01b1:
            if (r4 == 0) goto L_0x020a
            hw3.e r4 = r1.f350327f
            long r9 = r4.f350925b
            r11 = 600(0x258, double:2.964E-321)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x01bf
            r5 = 1
            goto L_0x01c0
        L_0x01bf:
            r5 = 0
        L_0x01c0:
            if (r5 == 0) goto L_0x01e3
            hw3.e r4 = new hw3.e
            r4.<init>(r2)
            r1.f350327f = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[method: add2SlicedList ] --cover the last sliced : "
            r2.append(r4)
            hw3.e r4 = r1.f350327f
            long r4 = r4.f350925b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            rv3.C118245h.m166799a(r8, r2)
            goto L_0x025b
        L_0x01e3:
            java.util.List<hw3.e> r5 = r1.f350326e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r4)
            hw3.e r4 = new hw3.e
            r4.<init>(r2)
            r1.f350327f = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[method: add2SlicedList ] --add and create a new sliced : "
            r2.append(r4)
            hw3.e r4 = r1.f350327f
            long r4 = r4.f350925b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            rv3.C118245h.m166799a(r8, r2)
            goto L_0x025b
        L_0x020a:
            hw3.e r4 = r1.f350327f
            gw3.a r5 = r4.f350924a
            java.util.ArrayList<gw3.f> r5 = r5.f350596g
            java.lang.Object r5 = r5.get(r6)
            gw3.f r5 = (gw3.C117002f) r5
            java.util.ArrayList<gw3.f> r9 = r2.f350596g
            java.lang.Object r9 = r9.get(r6)
            gw3.f r9 = (gw3.C117002f) r9
            xv3.C118905a.m167659f(r5, r9)
            if (r5 == 0) goto L_0x023a
            if (r9 != 0) goto L_0x0226
            goto L_0x023a
        L_0x0226:
            java.util.ArrayList<gw3.i> r10 = r5.f350632g
            if (r10 != 0) goto L_0x0231
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r5.f350632g = r10
        L_0x0231:
            java.util.ArrayList<gw3.i> r9 = r9.f350632g
            if (r9 == 0) goto L_0x023a
            java.util.ArrayList<gw3.i> r5 = r5.f350632g
            r5.addAll(r9)
        L_0x023a:
            long r9 = r4.f350925b
            long r11 = xv3.C118905a.m167656c(r2)
            long r9 = r9 + r11
            r4.f350925b = r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[method: add2SlicedList ] --merge sliced : "
            r2.append(r4)
            hw3.e r4 = r1.f350327f
            long r4 = r4.f350925b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            rv3.C118245h.m166799a(r8, r2)
        L_0x025b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[method: handleData ] sliced size : "
            r2.append(r4)
            java.util.List<hw3.e> r4 = r1.f350326e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            rv3.C118245h.m166799a(r8, r2)
            java.util.List<hw3.e> r2 = r1.f350326e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r4 = 3
            if (r2 >= r4) goto L_0x0283
            goto L_0x02a3
        L_0x0283:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[method: getMergeSlicedList ] callback all sliced from list & mSlicedList getPointerSize : "
            r0.append(r2)
            java.util.List<hw3.e> r2 = r1.f350326e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            rv3.C118245h.m166799a(r8, r0)
            gw3.a r0 = r16.mo180873g()
        L_0x02a3:
            if (r0 == 0) goto L_0x02b9
            java.lang.String r2 = "[method: handleData ] call back report data"
            rv3.C118245h.m166799a(r8, r2)
            r2 = 307200(0x4b000, float:4.30479E-40)
            boolean r2 = r1.mo180869d(r0, r2)
            if (r2 == 0) goto L_0x02b5
            r6 = 106(0x6a, float:1.49E-43)
        L_0x02b5:
            r1.mo180870e(r6, r0, r3)
            goto L_0x02ce
        L_0x02b9:
            yv3.b r0 = r1.f350325d
            ew3.c r0 = (ew3.C116793c) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f350117h
            boolean r0 = r0.get()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "[method: handleData ] call back when stop"
            rv3.C118245h.m166799a(r8, r0)
            r1.mo180872f(r3)
        L_0x02ce:
            yv3.b r0 = r1.f350325d
            ew3.c r0 = (ew3.C116793c) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f350117h
            boolean r0 = r0.get()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x02e7
            java.lang.String r0 = "[method: handleData ] clear all cache when pause"
            rv3.C118245h.m166799a(r8, r0)
            java.util.List<hw3.e> r0 = r1.f350326e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw3.C116906c.mo180868c(java.util.HashMap, java.util.List, java.util.List, kw3.b):void");
    }

    /* renamed from: f */
    public final void mo180872f(C117428b bVar) {
        if (bVar != null) {
            C116997a aVar = null;
            if (((ArrayList) this.f350326e).size() > 0) {
                C118245h.m166799a("sensor_MultiDataHandle", "[method: callBackWhenStop size] " + ((ArrayList) this.f350326e).size());
                aVar = mo180873g();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[method: callBackWhenStop ] ");
            int i = 0;
            sb.append(aVar != null);
            C118245h.m166799a("sensor_MultiDataHandle", sb.toString());
            if (aVar == null) {
                i = 107;
            }
            mo180870e(i, aVar, bVar);
        }
    }

    /* renamed from: g */
    public final C116997a mo180873g() {
        int i;
        int i2;
        C116997a aVar = ((C117123e) ((ArrayList) this.f350326e).get(0)).f350924a;
        StringBuilder sb = new StringBuilder();
        C117002f fVar = aVar.f350596g.get(0);
        C117001e eVar = new C117001e();
        Context context = this.f350323b.f355205a;
        char c = 65535;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Throwable unused) {
            i = -1;
        }
        eVar.f350623e = ((float) i) / context.getResources().getDisplayMetrics().density;
        Context context2 = this.f350323b.f355205a;
        try {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
            i2 = displayMetrics2.heightPixels;
        } catch (Throwable unused2) {
            i2 = -1;
        }
        eVar.f350624f = ((float) i2) / context2.getResources().getDisplayMetrics().density;
        try {
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            ((WindowManager) this.f350323b.f355205a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics3);
            c = displayMetrics3.heightPixels > displayMetrics3.widthPixels ? (char) 0 : 1;
        } catch (Throwable unused3) {
        }
        eVar.f350622d = c == 0 ? 3 : c == 1 ? 12 : 0;
        fVar.f350634i = eVar;
        sb.append(((double) fVar.f350632g.get(0).f350646g) / 1000.0d);
        for (int i3 = 1; i3 < ((ArrayList) this.f350326e).size(); i3++) {
            C117002f fVar2 = ((C117123e) ((ArrayList) this.f350326e).get(i3)).f350924a.f350596g.get(0);
            C118905a.m167659f(fVar, fVar2);
            if (fVar2 != null) {
                if (fVar.f350632g == null) {
                    fVar.f350632g = new ArrayList<>();
                }
                ArrayList<C117005i> arrayList = fVar2.f350632g;
                if (arrayList != null) {
                    fVar.f350632g.addAll(arrayList);
                }
            }
            sb.append("-");
            sb.append(((double) fVar2.f350632g.get(0).f350646g) / 1000.0d);
        }
        if (aVar.f350605s == null) {
            aVar.f350605s = new ArrayList<>();
        }
        C117000d dVar = new C117000d();
        dVar.f350620d = "splitingPoints";
        dVar.f350621e = sb.toString();
        aVar.f350605s.add(dVar);
        ((ArrayList) this.f350326e).clear();
        return aVar;
    }
}
