package bh3;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Pair;
import ao3.C113067b;
import bh3.C113177k;
import bh3.C113194y;
import ch3.C113346a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sensitive.business.BusinessStackRecorder;
import com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32226l;
import fy3.C32227p;
import gh3.C116973j;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import hh3.C117092b;
import hh3.C117095c;
import hh3.C117097e;
import hh3.C117098f;
import i20.C21043a;
import ih3.C108462a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import nd3.C88929c;
import nd3.C88930e;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_NOT_PLAIN_PROCESSES})
/* renamed from: bh3.t */
public final class C113185t extends C86301e implements C113177k {

    /* renamed from: d */
    public static final Map<C113177k.C113179b, String[]> f338680d = C90364q0.m113148g(new C13604l(C113177k.C113179b.LOCAION, new String[]{"android.permission.ACCESS_FINE_LOCATION"}), new C13604l(C113177k.C113179b.CONTRACT, new String[]{"android.permission.READ_CONTACTS"}), new C13604l(C113177k.C113179b.STORAGE, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}), new C13604l(C113177k.C113179b.MICRO_PHONE, new String[]{"android.permission.RECORD_AUDIO"}), new C13604l(C113177k.C113179b.HEALTHY, new String[]{"android.permission.ACTIVITY_RECOGNITION"}), new C13604l(C113177k.C113179b.CAMERA, new String[]{"android.permission.CAMERA"}));

    /* renamed from: bh3.t$f */
    public static final class C79705f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C113177k.C79704f f233616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79705f(C113177k.C79704f fVar) {
            super(1);
            this.f233616d = fVar;
        }

        public Object invoke(Object obj) {
            this.f233616d.mo109818a(((Boolean) obj).booleanValue() ? C113177k.C79703c.GRANTED : C113177k.C79703c.BUSINESS_REFUSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh3.t$a */
    public static final class C113186a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C113177k.C113181e f338681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113186a(C113177k.C113181e eVar) {
            super(1);
            this.f338681d = eVar;
        }

        public Object invoke(Object obj) {
            this.f338681d.onOp(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh3.t$b */
    public static final class C113187b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C113177k.C113181e f338682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113187b(C113177k.C113181e eVar) {
            super(1);
            this.f338682d = eVar;
        }

        public Object invoke(Object obj) {
            this.f338682d.onOp(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh3.t$c */
    public static final class C113188c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C113177k.C113181e f338683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113188c(C113177k.C113181e eVar) {
            super(1);
            this.f338683d = eVar;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C113191u(this.f338683d, ((Boolean) obj).booleanValue()));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.sensitive.PluginSensitive$onCreate$1", mo125469f = "PluginSensitive.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bh3.t$d */
    public static final class C113189d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f338684d;

        /* renamed from: e */
        public final /* synthetic */ C113185t f338685e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113189d(C113185t tVar, C15601d<? super C113189d> dVar) {
            super(2, dVar);
            this.f338685e = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C113189d dVar2 = new C113189d(this.f338685e, dVar);
            dVar2.f338684d = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C113189d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f338684d;
            long uptimeMillis = SystemClock.uptimeMillis();
            C8478d0 d0Var = new C8478d0();
            Iterator<Map.Entry<String, C116973j>> it = C113193x.f338696a.entrySet().iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                Object value = next.getValue();
                String a = ((C116973j) value).mo58628a();
                if (!(!(a == null || a.length() == 0))) {
                    value = null;
                }
                C116973j jVar = (C116973j) value;
                if (jVar != null) {
                    C113194y yVar = new C113194y((String) next.getKey(), jVar.mo58628a(), jVar.mo180949c());
                    C13604l<Boolean, String> a2 = yVar.mo165723a();
                    if (!((Boolean) a2.f38555d).booleanValue()) {
                        C117092b bVar = C117092b.f350860a;
                        C61926c.m72659D(C117092b.f350861b, false, new C117095c((String) null, (String) next.getKey()), 2, (Object) null);
                    } else {
                        d0Var.f27483d++;
                        C113194y.C113195a aVar = yVar.f338702f;
                        if (aVar != null) {
                            obj2 = aVar.f338705b;
                        }
                        if (obj2 != null) {
                            jVar.mo58630d(obj2);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("service ");
                    sb.append((String) next.getKey());
                    sb.append(" hook ");
                    sb.append(((Boolean) a2.f38555d).booleanValue() ? "success" : StateEvent.ProcessResult.FAILED);
                    sb.append(" , processName:");
                    sb.append(MMApplicationContext.getProcessName());
                    sb.append(", errMsg:");
                    sb.append((String) a2.f38556e);
                    Log.m105924i("Kenneth-methodCall", sb.toString());
                    obj2 = C13598b0.f38549a;
                }
                if (obj2 == null) {
                    Log.m105924i("Kenneth-methodCall", "service " + ((String) next.getKey()) + " hook failed, processName:" + MMApplicationContext.getProcessName());
                }
            }
            C117092b bVar2 = C117092b.f350860a;
            C61926c.m72659D(C117092b.f350861b, false, new C117097e(SystemClock.uptimeMillis() - uptimeMillis, d0Var.f27483d), 2, (Object) null);
            try {
                C104141e.f308136a.mo145782c();
            } catch (Throwable th) {
                C117092b bVar3 = C117092b.f350860a;
                C61926c.m72659D(C117092b.f350861b, false, new C117095c("HookContentProvider:", "HookContentProvider"), 2, (Object) null);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("hook provider failed:");
                sb4.append(th.getMessage());
                sb4.append(",size = ");
                C113185t tVar = this.f338685e;
                Map<C113177k.C113179b, String[]> map = C113185t.f338680d;
                tVar.getClass();
                sb4.append(0);
                Log.m105924i("Kenneth-methodCall", sb4.toString());
            }
            if (C87412m.m108589b(MMApplicationContext.getProcessName(), "com.tencent.mm")) {
                Context context = MMApplicationContext.getContext();
                BusinessStackRecorder b = BusinessStackRecorder.f347906f.mo176840b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER");
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
                C13598b0 b0Var = C13598b0.f38549a;
                context.registerReceiver(b, intentFilter);
                C113184s sVar = C113184s.f338677a;
                if (!RequestFloatWindowPermissionDialog.f249560h.contains(sVar)) {
                    RequestFloatWindowPermissionDialog.f249560h.add(sVar);
                }
            }
            BusinessStackRecorder.C115996b bVar4 = BusinessStackRecorder.f347906f;
            bVar4.mo176840b().getClass();
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Application");
            ((Application) context2).registerActivityLifecycleCallbacks(bVar4.mo176840b());
            C113067b bVar5 = C113067b.f338452d;
            BusinessStackRecorder b2 = bVar4.mo176840b();
            C87412m.m108594g(b2, "callback");
            ArrayList<Application.ActivityLifecycleCallbacks> arrayList = C113067b.f338453e;
            synchronized (arrayList) {
                try {
                    arrayList.add(b2);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            HashMap<String, List<Pair<String, String>>> hashMap = C104140d.f308134c;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Pair.create("startActivityForResult", "(Landroid/content/Intent;I)V"));
            hashMap.put("android/app/Activity", arrayList2);
            C21043a.m23197h().mo32757k(hashMap, C104137a.f308131a);
            HashMap<String, List<Pair<String, String>>> hashMap2 = C104140d.f308133b;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Pair.create(WeChatBrands.Business.GROUP_OPEN, "()Landroid/hardware/Camera;"));
            arrayList3.add(Pair.create(WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;"));
            arrayList3.add(Pair.create("startPreview", "()V"));
            arrayList3.add(Pair.create("release", "()V"));
            hashMap2.put("android/hardware/Camera", arrayList3);
            C21043a.m23197h().mo32757k(hashMap2, new C104138b());
            HashMap<String, List<Pair<String, String>>> hashMap3 = C104140d.f308135d;
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(Pair.create("openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V"));
            arrayList4.add(Pair.create("openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V"));
            hashMap3.put("android/hardware/camera2/CameraManager", arrayList4);
            C21043a.m23197h().mo32757k(hashMap3, new C104139c());
            HashMap<String, List<Pair<String, String>>> hashMap4 = C104147p.f308141a;
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(Pair.create("startRecording", "()V"));
            hashMap4.put("android/media/AudioRecord", arrayList5);
            HashMap<String, List<Pair<String, String>>> hashMap5 = C104147p.f308142b;
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(Pair.create("startLocalAudio", "()V"));
            hashMap5.put("com/tencent/trtc/TRTCCloud", arrayList6);
            C21043a.m23197h().mo32757k(hashMap4, C104145n.f308139a);
            C21043a.m23197h().mo32757k(hashMap5, C104146o.f308140a);
            HashMap<String, List<Pair<String, String>>> hashMap6 = C28320f.f77929b;
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(Pair.create("exportToPublicDownloadDirImpl", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;"));
            arrayList7.add(Pair.create("exportImageImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
            arrayList7.add(Pair.create("exportVideoImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
            hashMap6.put("com/tencent/mm/platformtools/ExportFileUtil", arrayList7);
            C21043a.m23197h().mo32757k(hashMap6, C113175g.f338625a);
            HashMap<String, List<Pair<String, String>>> hashMap7 = C28320f.f77930c;
            ArrayList arrayList8 = new ArrayList();
            arrayList8.add(Pair.create("saveBitmapToImage", "(Landroid/graphics/Bitmap;II;Ljava/lang/String;Z)Ljava/lang/String;"));
            hashMap7.put("com/tencent/mm/sdk/platformtools/BitmapUtil", arrayList8);
            C21043a.m23197h().mo32757k(hashMap7, C113176h.f338626a);
            Log.m105924i("Kenneth-methodCall", "hook duration=" + (SystemClock.uptimeMillis() - uptimeMillis) + ",successCount = " + d0Var.f27483d + ",count = " + C113193x.f338696a.size() + ",processName:" + MMApplicationContext.getProcessName());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh3.t$e */
    public static final class C113190e implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ C113177k.C113178a f338686a;

        /* renamed from: b */
        public final /* synthetic */ C113177k.C79704f f338687b;

        /* renamed from: c */
        public final /* synthetic */ C113185t f338688c;

        /* renamed from: d */
        public final /* synthetic */ Activity f338689d;

        /* renamed from: e */
        public final /* synthetic */ String f338690e;

        /* renamed from: f */
        public final /* synthetic */ String f338691f;

        /* renamed from: g */
        public final /* synthetic */ int f338692g;

        public C113190e(C113177k.C113178a aVar, C113177k.C79704f fVar, C113185t tVar, Activity activity, String str, String str2, int i) {
            this.f338686a = aVar;
            this.f338687b = fVar;
            this.f338688c = tVar;
            this.f338689d = activity;
            this.f338690e = str;
            this.f338691f = str2;
            this.f338692g = i;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            BusinessStackRecorder.f347906f.mo176840b().mo176828a("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", this.f338686a.name());
            boolean z = true;
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (iArr[i2] == -1) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (!z) {
                this.f338687b.mo109818a(C113177k.C79703c.SYSTEM_REFUSE);
            } else {
                this.f338688c.mo165713kx(this.f338689d, this.f338690e, this.f338691f, this.f338692g, this.f338687b);
            }
        }
    }

    public String A90() {
        String c = BusinessStackRecorder.f347906f.mo176841c();
        if (c != null) {
            HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
            String str = C113346a.f339124d.get(c);
            return str == null ? "" : str;
        }
    }

    public void Aa0(C113177k.C113179b bVar) {
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        C87412m.m108594g(bVar, "permission");
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap2 = C113346a.f339121a;
        C113346a.C113347b bVar2 = C113346a.f339121a.get(bVar);
        if (bVar2 != null && (hashMap = bVar2.f339127c) != null) {
            for (Map.Entry<C113177k.C113178a, C113346a.C54729a> key : hashMap.entrySet()) {
                mo165721yX(bVar.f338672d, ((C113177k.C113178a) key.getKey()).f338661d, true);
            }
        }
    }

    /* renamed from: Ci */
    public void mo165697Ci(String str) {
        C87412m.m108594g(str, "business");
        BusinessStackRecorder.f347906f.mo176840b().mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", str, "");
    }

    public boolean Dn0(int i, C113177k.C113181e eVar) {
        C113346a.C113347b bVar;
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        C113346a.C54729a aVar;
        List<String> list;
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (C113184s.f338678b || PermissionSwitchCheckUtil.f347926a.mo176849f()) {
            return !C113184s.f338678b;
        }
        C113177k.C113178a aVar2 = C113184s.f338679c.get(Integer.valueOf(i));
        if (aVar2 == null) {
            return true;
        }
        C113177k.C113179b bVar2 = C113177k.C113179b.OVERLAY;
        if (((C113177k) C86312j.m106911c(C113177k.class)).w00(bVar2, aVar2)) {
            return true;
        }
        BusinessStackRecorder.C115996b bVar3 = BusinessStackRecorder.f347906f;
        BusinessStackRecorder.C115997c cVar = (BusinessStackRecorder.C115997c) C110818d0.m150925W(BusinessStackRecorder.f347909i);
        Boolean bool = null;
        String str = cVar != null ? cVar.f347917b : null;
        if (!(str == null || (bVar = C113346a.f339121a.get(bVar2)) == null || (hashMap = bVar.f339127c) == null || (aVar = hashMap.get(aVar2)) == null || (list = aVar.f153377d) == null)) {
            bool = Boolean.valueOf(list.contains(str));
        }
        if (bool == null || C87412m.m108589b(bool, Boolean.FALSE)) {
            C113184s.f338678b = true;
            C61926c.m72666K(1000, new C108462a(new C113183r(eVar), bVar2, aVar2));
        }
    }

    public boolean G00(C113177k.C113179b bVar, C113177k.C113178a aVar, C113177k.C113181e eVar) {
        C113177k.C113179b bVar2 = C113177k.C113179b.OVERLAY;
        if (((C113177k) C86312j.m106911c(C113177k.class)).w00(bVar2, aVar)) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        PermissionSwitchCheckUtil.f347926a.mo176853j(bVar2, aVar, new C113188c(eVar));
        return true;
    }

    /* renamed from: GT */
    public boolean mo165700GT(String str, String str2) {
        C87412m.m108594g(str, "permission");
        C87412m.m108594g(str2, "business");
        return C45628s0.m50756U() && C87412m.m108589b(str, FirebaseAnalytics.C113379b.LOCATION) && C113177k.f338627e0.contains(str2);
    }

    /* renamed from: Jp */
    public String mo165701Jp(String str, String str2) {
        C87412m.m108594g(str, "permission");
        C87412m.m108594g(str2, "business");
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
        String str3 = C113346a.f339123c.get(str);
        String str4 = C113346a.f339124d.get(str2);
        if (!mo165700GT(str, str2) || !C87412m.m108589b(str, FirebaseAnalytics.C113379b.LOCATION)) {
            if (!(str3 == null || str4 == null)) {
                return MMApplicationContext.getContext().getString(C0966R.string.ly_, new Object[]{str4, str3});
            }
        } else if (str4 != null) {
            return MMApplicationContext.getContext().getString(C0966R.string.mie, new Object[]{str4});
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[EDGE_INSN: B:26:0x0039->B:15:0x0039 ?: BREAK  , SYNTHETIC] */
    /* renamed from: Oz */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> mo165702Oz(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "permission"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "business"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            bh3.k$b[] r3 = bh3.C113177k.C113179b.values()     // Catch:{ IllegalArgumentException -> 0x0023 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0023 }
            r5 = 0
        L_0x0013:
            if (r5 >= r4) goto L_0x0023
            r6 = r3[r5]     // Catch:{ IllegalArgumentException -> 0x0023 }
            java.lang.String r7 = r6.f338672d     // Catch:{ IllegalArgumentException -> 0x0023 }
            boolean r7 = z04.C112551y.m153809i(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x0023 }
            if (r7 == 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0023:
            r6 = r1
        L_0x0024:
            bh3.k$a[] r9 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x0039 }
            int r3 = r9.length     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0029:
            if (r0 >= r3) goto L_0x0039
            r4 = r9[r0]     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.String r5 = r4.f338661d     // Catch:{ IllegalArgumentException -> 0x0039 }
            boolean r5 = z04.C112551y.m153809i(r5, r10, r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r5 == 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0039:
            r4 = r1
        L_0x003a:
            if (r6 == 0) goto L_0x0065
            if (r4 == 0) goto L_0x0065
            java.util.HashMap<bh3.k$b, ch3.a$b> r9 = ch3.C113346a.f339121a
            java.util.HashMap<bh3.k$b, ch3.a$b> r9 = ch3.C113346a.f339121a
            java.lang.Object r9 = r9.get(r6)
            ch3.a$b r9 = (ch3.C113346a.C113347b) r9
            if (r9 == 0) goto L_0x0065
            java.util.HashMap<bh3.k$a, ch3.a$a> r9 = r9.f339127c
            java.lang.Object r9 = r9.get(r4)
            ch3.a$a r9 = (ch3.C113346a.C54729a) r9
            if (r9 == 0) goto L_0x0065
            android.util.Pair r1 = new android.util.Pair
            int r10 = r9.f153374a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r9 = r9.f153375b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.<init>(r10, r9)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C113185t.mo165702Oz(java.lang.String, java.lang.String):android.util.Pair");
    }

    /* renamed from: Qv */
    public void mo165703Qv(String str, Long l) {
        C113177k.C113179b bVar;
        C113346a.C113347b bVar2;
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        long longValue = l.longValue();
        if (str != null && (bVar = C113346a.f339122b.get(str)) != null) {
            if (!(longValue != 162 || (bVar2 = C113346a.f339121a.get(bVar)) == null || (hashMap = bVar2.f339127c) == null)) {
                for (Map.Entry next : hashMap.entrySet()) {
                    C113177k kVar = (C113177k) C86312j.m106911c(C113177k.class);
                    kVar.mo165721yX(bVar.f338672d, ((C113177k.C113178a) next.getKey()).f338661d, !kVar.ad0(bVar, (C113177k.C113178a) next.getKey()));
                }
            }
            String c = BusinessStackRecorder.f347906f.mo176841c();
            C113177k.C113178a aVar = null;
            if (c != null) {
                try {
                    C113177k.C113178a[] values = C113177k.C113178a.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        C113177k.C113178a aVar2 = values[i];
                        if (C112551y.m153809i(aVar2.f338661d, c, true)) {
                            aVar = aVar2;
                            break;
                        }
                        i++;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            C117098f.f350877a.mo181044a(longValue, Long.valueOf((long) bVar.f338673e), Long.valueOf(aVar != null ? (long) aVar.f338662e : -1), Boolean.TRUE);
        }
    }

    /* renamed from: UG */
    public boolean mo165704UG(C113177k.C113179b bVar, C113177k.C113181e eVar) {
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String c = BusinessStackRecorder.f347906f.mo176841c();
        if (c == null) {
            return false;
        }
        C113177k.C113178a aVar = null;
        try {
            C113177k.C113178a[] values = C113177k.C113178a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C113177k.C113178a aVar2 = values[i];
                if (C112551y.m153809i(aVar2.f338661d, c, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException unused) {
        }
        if (aVar != null) {
            return PermissionSwitchCheckUtil.f347926a.mo176846c(bVar, aVar, new C113186a(eVar));
        }
        return false;
    }

    /* renamed from: Yr */
    public Integer mo165705Yr(String str) {
        Integer num;
        C87412m.m108594g(str, "permission");
        C113177k.C113179b bVar = null;
        try {
            C113177k.C113179b[] values = C113177k.C113179b.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C113177k.C113179b bVar2 = values[i];
                if (C112551y.m153809i(bVar2.f338672d, str, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException unused) {
        }
        int i2 = -1;
        if (bVar != null) {
            HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
            C113346a.C113347b bVar3 = C113346a.f339121a.get(bVar);
            if (!(bVar3 == null || (num = bVar3.f339125a) == null)) {
                i2 = num.intValue();
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: aQ */
    public boolean mo165706aQ(int i) {
        C113184s sVar = C113184s.f338677a;
        C113177k.C113178a aVar = C113184s.f338679c.get(Integer.valueOf(i));
        if (aVar != null) {
            return ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.OVERLAY, aVar);
        }
        return true;
    }

    public boolean ad0(C113177k.C113179b bVar, C113177k.C113178a aVar) {
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(aVar, "business");
        return C45628s0.m50756U() && bVar == C113177k.C113179b.LOCAION && C113177k.f338627e0.contains(aVar.f338661d);
    }

    public Integer bp0(String str) {
        Integer num;
        C87412m.m108594g(str, "permission");
        C113177k.C113179b bVar = null;
        try {
            C113177k.C113179b[] values = C113177k.C113179b.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C113177k.C113179b bVar2 = values[i];
                if (C112551y.m153809i(bVar2.f338672d, str, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException unused) {
        }
        int i2 = -1;
        if (bVar != null) {
            HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
            C113346a.C113347b bVar3 = C113346a.f339121a.get(bVar);
            if (!(bVar3 == null || (num = bVar3.f339126b) == null)) {
                i2 = num.intValue();
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: du */
    public void mo165709du(String str) {
        C87412m.m108594g(str, "business");
        BusinessStackRecorder.f347906f.mo176840b().mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", str, "");
    }

    /* renamed from: eh */
    public String mo165710eh(String str) {
        C87412m.m108594g(str, "permission");
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
        String str2 = C113346a.f339123c.get(str);
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    public boolean gl0(String str, String str2) {
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "permission");
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
        C113177k.C113179b bVar = C113346a.f339122b.get(str2);
        if (bVar == null) {
            return false;
        }
        long j = MultiProcessMMKV.getMMKV("freq_mmkv_key_ver_2").getLong(str + '_' + bVar.f338672d, -1);
        return j != -1 && (System.currentTimeMillis() / ((long) 1000)) - j < 172800;
    }

    /* renamed from: hg */
    public boolean mo165712hg(C113177k.C113179b bVar, C113177k.C113178a aVar, C113177k.C113181e eVar) {
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(aVar, "business");
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return PermissionSwitchCheckUtil.f347926a.mo176846c(bVar, aVar, new C113187b(eVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: kx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165713kx(android.app.Activity r18, java.lang.String r19, java.lang.String r20, int r21, bh3.C113177k.C79704f r22) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r5 = r19
            r10 = r20
            r7 = r21
            r2 = r22
            bh3.k$c r0 = bh3.C113177k.C79703c.GRANTED
            bh3.k$c r1 = bh3.C113177k.C79703c.ERROR
            java.lang.String r3 = "activity"
            gy3.C87412m.m108594g(r9, r3)
            java.lang.String r3 = "appid"
            gy3.C87412m.m108594g(r5, r3)
            java.lang.String r3 = "permission"
            gy3.C87412m.m108594g(r10, r3)
            java.lang.String r3 = "callback"
            gy3.C87412m.m108594g(r2, r3)
            java.util.HashMap<java.lang.String, bh3.k$b> r3 = ch3.C113346a.f339122b
            java.lang.Object r3 = r3.get(r10)
            r11 = r3
            bh3.k$b r11 = (bh3.C113177k.C113179b) r11
            r3 = 0
            bh3.k$a[] r4 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x0040 }
            int r6 = r4.length     // Catch:{ IllegalArgumentException -> 0x0040 }
            r13 = 0
        L_0x0034:
            if (r13 >= r6) goto L_0x0041
            r14 = r4[r13]     // Catch:{ IllegalArgumentException -> 0x0040 }
            int r15 = r14.f338662e     // Catch:{ IllegalArgumentException -> 0x0040 }
            if (r15 != r7) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            int r13 = r13 + 1
            goto L_0x0034
        L_0x0040:
        L_0x0041:
            r14 = r3
        L_0x0042:
            if (r11 != 0) goto L_0x004b
            java.lang.String r4 = "unknown permission"
            r1.f233615d = r4
            r2.mo109818a(r1)
        L_0x004b:
            if (r14 != 0) goto L_0x0054
            java.lang.String r4 = "unknown business"
            r1.f233615d = r4
            r2.mo109818a(r1)
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r4 = 95
            r1.append(r4)
            if (r11 == 0) goto L_0x0066
            java.lang.String r4 = r11.f338672d
            goto L_0x0067
        L_0x0066:
            r4 = r3
        L_0x0067:
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "freq_mmkv_key_ver_2"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)
            if (r4 == 0) goto L_0x0082
            long r15 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r6
            long r12 = r15 / r12
            r4.putLong(r1, r12)
        L_0x0082:
            if (r11 == 0) goto L_0x014a
            if (r14 == 0) goto L_0x014a
            bh3.k$c r1 = r8.ls0(r9, r10, r7)
            int r1 = r1.ordinal()
            r12 = 1
            if (r1 == 0) goto L_0x0105
            if (r1 == r12) goto L_0x0098
            r2.mo109818a(r0)
            goto L_0x014a
        L_0x0098:
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r1 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
            bh3.t$f r4 = new bh3.t$f
            r4.<init>(r2)
            r1.getClass()
            boolean r5 = r1.mo176849f()
            if (r5 == 0) goto L_0x00a9
            goto L_0x00fe
        L_0x00a9:
            boolean r5 = r1.mo176848e(r11, r14)
            if (r5 != 0) goto L_0x00b0
            goto L_0x00fe
        L_0x00b0:
            java.lang.Boolean r5 = r1.mo176847d(r11)
            if (r5 == 0) goto L_0x00c5
            boolean r6 = r5.booleanValue()
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r5 = r3
        L_0x00bf:
            if (r5 == 0) goto L_0x00c5
            r5.booleanValue()
            goto L_0x00fe
        L_0x00c5:
            java.lang.Class<bh3.k> r5 = bh3.C113177k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            bh3.k r5 = (bh3.C113177k) r5
            java.lang.String r6 = r11.f338672d
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r5.mo165717vM(r6)
            if (r5 == 0) goto L_0x00fe
            java.lang.String r6 = r14.f338661d
            java.lang.Boolean r7 = r14.f338663f
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r12
            boolean r5 = r5.getBoolean(r6, r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r5.booleanValue()
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x00ee
            r3 = r5
        L_0x00ee:
            if (r3 == 0) goto L_0x00fe
            r3.booleanValue()
            r1.mo176852i(r9, r11, r14, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            if (r3 != 0) goto L_0x00ff
            r1.mo176853j(r11, r14, r4)
            goto L_0x00ff
        L_0x00fe:
            r12 = 0
        L_0x00ff:
            if (r12 != 0) goto L_0x014a
            r2.mo109818a(r0)
            return
        L_0x0105:
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r0 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f
            com.tencent.mm.sensitive.business.BusinessStackRecorder r0 = r0.mo176840b()
            java.lang.String r1 = r14.name()
            java.lang.String r3 = "com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER"
            r0.mo176828a(r3, r1)
            r13 = 0
            bh3.t$e r15 = new bh3.t$e
            r0 = r15
            r1 = r14
            r2 = r22
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String[] r3 = new java.lang.String[r12]
            r0 = 0
            r3[r0] = r10
            java.lang.String r0 = r11.f338672d
            java.lang.String r1 = "pEnum.value"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r4 = r8.mo165710eh(r0)
            java.lang.String r0 = r11.f338672d
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = r14.f338661d
            java.lang.String r5 = r8.mo165715mi(r0, r1)
            r0 = r18
            r1 = r13
            r2 = r15
            nd3.C88929c.m111022f(r0, r1, r2, r3, r4, r5)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C113185t.mo165713kx(android.app.Activity, java.lang.String, java.lang.String, int, bh3.k$f):void");
    }

    public C113177k.C79703c ls0(Context context, String str, int i) {
        C113177k.C113178a aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "permission");
        boolean z = false;
        boolean z2 = true;
        if (!(C111105a.m151499a(context, str) == 0)) {
            return C113177k.C79703c.SYSTEM_REFUSE;
        }
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
        C113177k.C113179b bVar = C113346a.f339122b.get(str);
        C13598b0 b0Var = null;
        try {
            C113177k.C113178a[] values = C113177k.C113178a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                aVar = values[i2];
                if (aVar.f338662e == i) {
                    break;
                }
                i2++;
            }
        } catch (IllegalArgumentException unused) {
        }
        aVar = null;
        if (!(bVar == null || aVar == null)) {
            String str2 = bVar.f338672d;
            C87412m.m108593f(str2, "pEnum.value");
            MultiProcessMMKV vM = mo165717vM(str2);
            if (vM == null || !vM.getBoolean(aVar.f338661d, !aVar.f338663f.booleanValue())) {
                z2 = false;
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var != null) {
            z = z2;
        }
        return !z ? C113177k.C79703c.BUSINESS_REFUSE : C113177k.C79703c.GRANTED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* renamed from: mi */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo165715mi(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "permission"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            bh3.k$b[] r3 = bh3.C113177k.C113179b.values()     // Catch:{ IllegalArgumentException -> 0x001e }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x001e }
            r5 = 0
        L_0x000e:
            if (r5 >= r4) goto L_0x001e
            r6 = r3[r5]     // Catch:{ IllegalArgumentException -> 0x001e }
            java.lang.String r7 = r6.f338672d     // Catch:{ IllegalArgumentException -> 0x001e }
            boolean r7 = z04.C112551y.m153809i(r7, r10, r1)     // Catch:{ IllegalArgumentException -> 0x001e }
            if (r7 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x001e:
            r6 = r2
        L_0x001f:
            java.lang.String r10 = ""
            if (r11 != 0) goto L_0x002c
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r11 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f
            java.lang.String r11 = r11.mo176841c()
            if (r11 != 0) goto L_0x002c
            r11 = r10
        L_0x002c:
            bh3.k$a[] r3 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x0042 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0042 }
            r5 = 0
        L_0x0032:
            if (r5 >= r4) goto L_0x0042
            r7 = r3[r5]     // Catch:{ IllegalArgumentException -> 0x0042 }
            java.lang.String r8 = r7.f338661d     // Catch:{ IllegalArgumentException -> 0x0042 }
            boolean r8 = z04.C112551y.m153809i(r8, r11, r1)     // Catch:{ IllegalArgumentException -> 0x0042 }
            if (r8 == 0) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x0042:
            r7 = r2
        L_0x0043:
            if (r6 == 0) goto L_0x00ce
            if (r7 == 0) goto L_0x00ce
            java.util.HashMap<bh3.k$b, ch3.a$b> r11 = ch3.C113346a.f339121a
            java.util.HashMap<bh3.k$b, ch3.a$b> r11 = ch3.C113346a.f339121a
            java.lang.Object r11 = r11.get(r6)
            ch3.a$b r11 = (ch3.C113346a.C113347b) r11
            if (r11 == 0) goto L_0x00ce
            java.util.HashMap<bh3.k$a, ch3.a$a> r11 = r11.f339127c
            java.lang.Object r11 = r11.get(r7)
            ch3.a$a r11 = (ch3.C113346a.C54729a) r11
            if (r11 == 0) goto L_0x006f
            android.util.Pair r3 = new android.util.Pair
            int r4 = r11.f153374a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r11 = r11.f153375b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.<init>(r4, r11)
            goto L_0x0070
        L_0x006f:
            r3 = r2
        L_0x0070:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r3 == 0) goto L_0x007b
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L_0x007c
        L_0x007b:
            r4 = r2
        L_0x007c:
            r5 = -1
            if (r4 != 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            int r8 = r4.intValue()
            if (r8 == r5) goto L_0x0088
        L_0x0086:
            r8 = 1
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            if (r8 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r4 = r2
        L_0x008d:
            if (r4 == 0) goto L_0x0099
            int r4 = r4.intValue()
            java.lang.String r4 = r11.getString(r4)
            if (r4 != 0) goto L_0x009a
        L_0x0099:
            r4 = r10
        L_0x009a:
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x00a2
        L_0x00a1:
            r3 = r2
        L_0x00a2:
            if (r3 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            int r8 = r3.intValue()
            if (r8 == r5) goto L_0x00ad
        L_0x00ab:
            r5 = 1
            goto L_0x00ae
        L_0x00ad:
            r5 = 0
        L_0x00ae:
            if (r5 == 0) goto L_0x00b1
            r2 = r3
        L_0x00b1:
            if (r2 == 0) goto L_0x00bf
            int r2 = r2.intValue()
            java.lang.String r11 = r11.getString(r2)
            if (r11 != 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r10 = r11
        L_0x00bf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
        L_0x00ce:
            int r11 = r10.length()
            if (r11 != 0) goto L_0x00d5
            r0 = 1
        L_0x00d5:
            if (r0 != 0) goto L_0x00d9
            if (r7 != 0) goto L_0x00f7
        L_0x00d9:
            if (r6 == 0) goto L_0x00f7
            java.lang.String r10 = r6.f338672d
            java.lang.String r11 = "it.value"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.Integer r10 = r9.mo165705Yr(r10)
            int r10 = r10.intValue()
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r10 = r11.getString(r10)
            java.lang.String r11 = "context.getString(strId)"
            gy3.C87412m.m108593f(r10, r11)
        L_0x00f7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C113185t.mo165715mi(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: oQ */
    public void mo165716oQ(String str) {
        C87412m.m108594g(str, "business");
        BusinessStackRecorder.f347906f.mo176840b().mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", str, "");
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        PermissionSwitchCheckUtil.f347926a.mo176850g();
        PermissionSwitchCheckUtil.f347932g.alive();
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
        boolean z = (j & 4) == 4;
        Log.m105924i("MicroMsg.ConfigStorageLogic", "extUserStatus: " + j + ", isSensitiveRegion: " + z);
        if (z) {
            List<String> list = C113177k.f338627e0;
            C87412m.m108593f(list, "wechatBussinessDefaultCloseList");
            for (String str : list) {
                long j2 = MultiProcessMMKV.getMMKV("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").getLong(str, 0);
                MultiProcessMMKV vM = mo165717vM(FirebaseAnalytics.C113379b.LOCATION);
                if ((vM != null ? vM.getBoolean(str, false) : false) && System.currentTimeMillis() - j2 >= 172800000) {
                    mo165721yX(FirebaseAnalytics.C113379b.LOCATION, str, false);
                }
            }
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        PermissionSwitchCheckUtil.f347926a.getClass();
        PermissionSwitchCheckUtil.f347931f.putBoolean(PermissionSwitchCheckUtil.f347930e, true);
        PermissionSwitchCheckUtil.f347932g.dead();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C113189d(this, (C15601d<? super C113189d>) null), 3, (Object) null);
    }

    /* renamed from: vM */
    public MultiProcessMMKV mo165717vM(String str) {
        C113177k.C113179b bVar;
        C87412m.m108594g(str, "permission");
        try {
            C113177k.C113179b[] values = C113177k.C113179b.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                bVar = values[i];
                if (C112551y.m153809i(bVar.f338672d, str, true)) {
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException unused) {
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        return MultiProcessMMKV.getMMKV(C86718e.m107549h() + '_' + str);
    }

    public boolean vf0() {
        return PermissionSwitchCheckUtil.f347926a.mo176849f();
    }

    public boolean w00(C113177k.C113179b bVar, C113177k.C113178a aVar) {
        Boolean bool;
        C113177k.C113178a aVar2;
        C87412m.m108594g(bVar, "permission");
        boolean z = false;
        String str = null;
        if (aVar == null) {
            String c = BusinessStackRecorder.f347906f.mo176841c();
            if (c != null) {
                try {
                    C113177k.C113178a[] values = C113177k.C113178a.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        aVar2 = values[i];
                        if (C112551y.m153809i(aVar2.f338661d, c, true)) {
                            break;
                        }
                        i++;
                    }
                } catch (IllegalArgumentException unused) {
                }
                aVar2 = null;
                aVar = aVar2;
            } else {
                aVar = null;
            }
        }
        String str2 = bVar.f338672d;
        C87412m.m108593f(str2, "permission.value");
        MultiProcessMMKV vM = mo165717vM(str2);
        if (vM == null) {
            return true;
        }
        if (aVar != null) {
            str = aVar.f338661d;
        }
        if (!(aVar == null || (bool = aVar.f338663f) == null)) {
            z = bool.booleanValue();
        }
        return vM.getBoolean(str, !z);
    }

    public String y60() {
        boolean z;
        JSONArray jSONArray = new JSONArray();
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
        for (Map.Entry next : C113346a.f339121a.entrySet()) {
            C113177k.C113179b bVar = (C113177k.C113179b) next.getKey();
            if (bVar == C113177k.C113179b.OVERLAY) {
                z = C88929c.m111017a(MMApplicationContext.getContext());
            } else {
                String[] strArr = (String[]) ((LinkedHashMap) f338680d).get(bVar);
                z = strArr != null ? C88929c.m111021e(MMApplicationContext.getContext(), (String[]) Arrays.copyOf(strArr, strArr.length)) : false;
            }
            if (z) {
                for (Map.Entry<C113177k.C113178a, C113346a.C54729a> key : ((C113346a.C113347b) next.getValue()).f339127c.entrySet()) {
                    C113177k.C113178a aVar = (C113177k.C113178a) key.getKey();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f338673e);
                    jSONObject.put("biz", aVar.f338662e);
                    String str = bVar.f338672d;
                    C87412m.m108593f(str, "permission.value");
                    MultiProcessMMKV vM = mo165717vM(str);
                    int i = 1;
                    if (!(vM != null && vM.getBoolean(aVar.f338661d, true))) {
                        i = 2;
                    }
                    jSONObject.put("status", i);
                    jSONArray.put(jSONObject);
                }
            }
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "jsonArray.toString()");
        return C112551y.m153815o(jSONArray2, ',', ';', false, 4, (Object) null);
    }

    /* renamed from: yX */
    public void mo165721yX(String str, String str2, boolean z) {
        if (C87412m.m108589b(str, FirebaseAnalytics.C113379b.LOCATION) && z) {
            MultiProcessMMKV.getMMKV("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").putLong(str2, System.currentTimeMillis());
        }
        if (str == null) {
            str = "";
        }
        MultiProcessMMKV vM = mo165717vM(str);
        if (vM != null) {
            if (str2 == null) {
                str2 = "";
            }
            vM.putBoolean(str2, z);
        }
    }
}
