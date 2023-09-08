package com.tencent.p014mm.matrix;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.view.C80550a;
import com.tencent.matrix.trace.view.FloatFrameView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import p1029rf.C89938b;
import p1029rf.C89940c;
import p1029rf.C89953e;
import p1029rf.C89957f;
import p1041tf.C90450a;
import p1041tf.C90451b;
import p1060we.C90971c;
import p1177ce.C113314g;
import p761yd.C91440a;
import p761yd.C91441c;
import p933be.C113173i;
import p995kf.C88146a;

/* renamed from: com.tencent.mm.matrix.k */
public class C80992k {

    /* renamed from: a */
    public static MultiProcessMMKV f237876a = MultiProcessMMKV.getMMKV("MatrixDelegate");

    /* renamed from: com.tencent.mm.matrix.k$a */
    public class C1277a implements View.OnClickListener {
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/matrix/MatrixSettingUIHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("Matrix.UISettingHandler", "[onClick] FrameDecorator");
            Intent intent = new Intent();
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.matrix.MatrixSettingUI");
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/matrix/MatrixSettingUIHandler$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/matrix/MatrixSettingUIHandler$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/matrix/MatrixSettingUIHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public static boolean m98889a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(MMApplicationContext.getContext());
        }
        return true;
    }

    /* renamed from: b */
    public static void m98890b(Context context, Intent intent) {
        TextView textView;
        C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
        if (aVar != null) {
            int i = -1;
            if ("ENABLE_FPS".equals(intent.getAction())) {
                C89940c cVar = aVar.f254918n;
                boolean booleanExtra = intent.getBooleanExtra("ENABLE_FPS", cVar.f258529d);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra));
                if (booleanExtra) {
                    cVar.mo124297i();
                    cVar.mo124266k();
                } else {
                    cVar.mo124296g();
                    cVar.mo124265j();
                }
                if (MMApplicationContext.isMainProcess()) {
                    MultiProcessMMKV multiProcessMMKV = f237876a;
                    if (booleanExtra) {
                        i = 1;
                    }
                    multiProcessMMKV.putInt("clicfg_matrix_trace_fps_enable", i).apply();
                }
            } else if ("ENABLE_FPS_FLOAT".equals(intent.getAction())) {
                C80550a f = C80550a.m98158f(MMApplicationContext.getContext());
                String processName = MMApplicationContext.getProcessName();
                FloatFrameView floatFrameView = f.f235624d;
                if (!(floatFrameView == null || (textView = (TextView) floatFrameView.findViewById(C0966R.C0970id.f357954co3)) == null)) {
                    textView.setText(processName);
                }
                f.f235625e = new C1277a();
                boolean booleanExtra2 = intent.getBooleanExtra("ENABLE_FPS_FLOAT", false);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra2));
                if (!booleanExtra2 || m98889a()) {
                    f.f235627g = true;
                    if (!booleanExtra2) {
                        C80550a.f235617o.post(new C90451b(f));
                        f.f235627g = false;
                    } else if (!C91440a.INSTANCE.mo125375b()) {
                        Log.m105928w("Matrix.UISettingHandler", "not in the foreground now!");
                    } else if (f.f235627g) {
                        C80550a.f235617o.post(new C90450a(f));
                    }
                    if (MMApplicationContext.isMainProcess()) {
                        MultiProcessMMKV multiProcessMMKV2 = f237876a;
                        if (booleanExtra2) {
                            i = 1;
                        }
                        multiProcessMMKV2.putInt("ENABLE_FPS_FLOAT", i).apply();
                        return;
                    }
                    return;
                }
                Log.m105920e("Matrix.UISettingHandler", "permission denied for window type");
            } else if ("ENABLE_START_UP".equals(intent.getAction())) {
                C89957f fVar = aVar.f254917j;
                boolean booleanExtra3 = intent.getBooleanExtra("ENABLE_START_UP", fVar.f258529d);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra3));
                if (booleanExtra3) {
                    fVar.mo124297i();
                } else {
                    fVar.mo124296g();
                }
                if (MMApplicationContext.isMainProcess()) {
                    MultiProcessMMKV multiProcessMMKV3 = f237876a;
                    if (booleanExtra3) {
                        i = 1;
                    }
                    multiProcessMMKV3.putInt("clicfg_matrix_trace_startup_enable", i).apply();
                }
            } else if ("ENABLE_EVIL_METHOD".equals(intent.getAction())) {
                C89938b bVar = aVar.f254916i;
                boolean booleanExtra4 = intent.getBooleanExtra("ENABLE_EVIL_METHOD", bVar.f258529d);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra4));
                if (booleanExtra4) {
                    bVar.mo124297i();
                } else {
                    bVar.mo124296g();
                }
                if (MMApplicationContext.isMainProcess()) {
                    MultiProcessMMKV multiProcessMMKV4 = f237876a;
                    if (booleanExtra4) {
                        i = 1;
                    }
                    multiProcessMMKV4.putInt("clicfg_matrix_trace_evil_method_enable", i).apply();
                }
            } else if ("ENABLE_ANR".equals(intent.getAction())) {
                C89953e eVar = aVar.f254919o;
                boolean booleanExtra5 = intent.getBooleanExtra("ENABLE_ANR", eVar.f258529d);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra5));
                if (booleanExtra5) {
                    eVar.mo124297i();
                } else {
                    eVar.mo124296g();
                }
                if (MMApplicationContext.isMainProcess()) {
                    MultiProcessMMKV multiProcessMMKV5 = f237876a;
                    if (booleanExtra5) {
                        i = 1;
                    }
                    multiProcessMMKV5.putInt("clicfg_matrix_trace_anr_enable", i).apply();
                }
            } else if ("ENABLE_METHOD_BEAT".equals(intent.getAction())) {
                AppMethodBeat instance = AppMethodBeat.getInstance();
                boolean booleanExtra6 = intent.getBooleanExtra("ENABLE_METHOD_BEAT", instance.isAlive());
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra6));
                if (booleanExtra6) {
                    instance.onStart();
                } else {
                    instance.onStop();
                }
            } else if ("ENABLE_DEV_LOG".equals(intent.getAction())) {
                boolean booleanExtra7 = intent.getBooleanExtra("ENABLE_DEV_LOG", false);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra7));
                aVar.f254915h.f255604i = booleanExtra7;
            } else if ("MODIFY_EVIL_THRESHOLD".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("MODIFY_EVIL_THRESHOLD", 700);
                aVar.f254916i.f258440f = longExtra;
                if (MMApplicationContext.isMainProcess()) {
                    f237876a.putLong("clicfg_matrix_trace_evil_method_threshold", longExtra).apply();
                }
            } else if ("ENABLE_BATTERY".equals(intent.getAction())) {
                boolean booleanExtra8 = intent.getBooleanExtra("ENABLE_BATTERY", false);
                Log.m105925i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), Boolean.valueOf(booleanExtra8));
                C113173i iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
                if (booleanExtra8) {
                    iVar.mo112100d();
                } else {
                    int i2 = iVar.f261039g;
                    if (!(i2 == 8)) {
                        if (i2 == 2) {
                            iVar.f261039g = 4;
                            C90971c cVar2 = iVar.f261036d;
                            if (cVar2 != null) {
                                cVar2.mo110078d(iVar);
                                C113314g gVar = iVar.f338613h;
                                gVar.getClass();
                                synchronized (C113314g.class) {
                                    if (gVar.f339063j) {
                                        gVar.f339058e.removeCallbacksAndMessages((Object) null);
                                        Iterator it = ((ArrayList) gVar.f339057d.f339053x).iterator();
                                        while (it.hasNext()) {
                                            ((C114490k0) it.next()).mo111819f();
                                        }
                                        gVar.f339063j = false;
                                    }
                                }
                            } else {
                                throw new RuntimeException("plugin stop, plugin listener is null");
                            }
                        } else {
                            throw new RuntimeException("plugin stop, but plugin is never started");
                        }
                    } else {
                        throw new RuntimeException("plugin stop, but plugin has been already destroyed");
                    }
                }
                if (MMApplicationContext.isMainProcess()) {
                    MultiProcessMMKV multiProcessMMKV6 = f237876a;
                    if (booleanExtra8) {
                        i = 1;
                    }
                    multiProcessMMKV6.putInt("ENABLE_BATTERY", i).apply();
                }
            }
        }
    }
}
