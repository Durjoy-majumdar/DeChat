package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.C82139c;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gt0.C87330d0;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jp3.C9486a;
import kj2.C117407d;
import ob0.C117747y;
import org.json.JSONObject;
import rp0.C90079g;
import rx3.C13598b0;
import te3.C90437rw3;
import wi0.C90988l;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData */
public final class JsApiOperateWXData extends C82197q {
    public static final int CTRL_INDEX = 79;
    public static final String NAME = "operateWXData";

    public JsApiOperateWXData() {
        new C82180l0();
    }

    /* renamed from: A */
    public static void m100835A(long j, long j2) {
        Log.m105919d("MicroMsg.AppBrand.JsApiOperateWXData", "idkeyStat [%d -> %d]", Long.valueOf(j), Long.valueOf(j2));
        C117407d.INSTANCE.idkeyStat(j, j2, 1, false);
    }

    /* renamed from: B */
    public static void m100836B(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] allKeys = OperateWXDataTask.f240831Q0.allKeys();
                if (allKeys != null) {
                    for (String str2 : allKeys) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (str2.startsWith(str)) {
                                OperateWXDataTask.f240831Q0.remove(str2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th);
            }
        }
    }

    /* renamed from: C */
    public static int m100837C(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            String[] allKeys = OperateWXDataTask.f240831Q0.allKeys();
            if (allKeys == null) {
                return 0;
            }
            int length = allKeys.length;
            int i2 = 0;
            i = 0;
            while (i2 < length) {
                try {
                    String str2 = allKeys[i2];
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.startsWith(str)) {
                            i += OperateWXDataTask.f240831Q0.getValueActualSize(str2);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    th = th;
                    Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th);
                    return i;
                }
            }
            return i;
        } catch (Throwable th4) {
            th = th4;
            i = 0;
            Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th);
            return i;
        }
    }

    /* renamed from: w */
    public void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar) {
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        int i = x6Var.f242919e;
        try {
            jSONObject.put("wxdataDequeueTimestamp", Util.nowMilliSecond());
            String string = jSONObject.getString("data");
            boolean optBoolean = jSONObject.optBoolean("isImportant");
            OperateWXDataTask operateWXDataTask = new OperateWXDataTask();
            operateWXDataTask.f240875y = gVar.getAppId();
            operateWXDataTask.f240861j = "operateWXData";
            C90988l d0 = gVar.getRuntime().mo113051d0();
            if (d0 != null) {
                operateWXDataTask.f240866q = d0.f261072r.f238585d;
            }
            operateWXDataTask.f240851U = this.f241066g;
            operateWXDataTask.f240857f = this;
            operateWXDataTask.f240858g = gVar;
            operateWXDataTask.f240862n = string;
            operateWXDataTask.f240850T = optBoolean;
            operateWXDataTask.f240860i = i;
            operateWXDataTask.f240859h = new C82165h0(operateWXDataTask, hVar);
            operateWXDataTask.f240837F = new HashMap();
            AppBrandStatObject d = C81682d.m100224d(operateWXDataTask.f240875y);
            if (d != null) {
                operateWXDataTask.f240848R = d.f245533f;
            }
            if (gVar instanceof C81925i2) {
                operateWXDataTask.f240849S = 1;
            } else if (gVar instanceof C83780d1) {
                operateWXDataTask.f240849S = 2;
            }
            int optInt = jSONObject.optInt("queueLength", -1);
            long optLong = jSONObject.optLong("wxdataQueueTimestamp", MAlarmHandler.NEXT_FIRE_INTERVAL);
            long optLong2 = jSONObject.optLong("wxdataDequeueTimestamp", MAlarmHandler.NEXT_FIRE_INTERVAL);
            operateWXDataTask.f240853W = optInt;
            operateWXDataTask.f240854X = optLong;
            operateWXDataTask.f240855Y = optLong2;
            operateWXDataTask.mo114395c();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "Exception %s", e.getMessage());
            gVar.mo109647a(i, mo115109j("fail"));
            hVar.mo56741d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask */
    public static class OperateWXDataTask extends MainProcessTask implements C9486a {
        public static final Parcelable.Creator<OperateWXDataTask> CREATOR = new C82119c();

        /* renamed from: Q0 */
        public static final MultiProcessMMKV f240831Q0 = MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.JsApiOperateWXData");

        /* renamed from: A */
        public int f240832A;

        /* renamed from: B */
        public String f240833B;

        /* renamed from: C */
        public String f240834C;

        /* renamed from: D */
        public String f240835D;

        /* renamed from: E */
        public int f240836E;

        /* renamed from: F */
        public Map<String, byte[]> f240837F;

        /* renamed from: G */
        public String f240838G;

        /* renamed from: H */
        public String f240839H;

        /* renamed from: I */
        public String f240840I;

        /* renamed from: J */
        public boolean f240841J;

        /* renamed from: K */
        public String f240842K;

        /* renamed from: L */
        public MMUserAvatarInfo f240843L;

        /* renamed from: M */
        public MMUserPrivacyProtectInfo f240844M = MMUserPrivacyProtectInfo.f240926f;

        /* renamed from: N */
        public String f240845N;

        /* renamed from: P */
        public int f240846P;

        /* renamed from: Q */
        public boolean f240847Q;

        /* renamed from: R */
        public int f240848R;

        /* renamed from: S */
        public int f240849S;

        /* renamed from: T */
        public boolean f240850T;

        /* renamed from: U */
        public boolean f240851U;

        /* renamed from: V */
        public boolean f240852V = false;

        /* renamed from: W */
        public transient int f240853W;

        /* renamed from: X */
        public transient long f240854X;

        /* renamed from: Y */
        public transient long f240855Y;

        /* renamed from: Z */
        public long f240856Z;

        /* renamed from: f */
        public transient C82197q f240857f;

        /* renamed from: g */
        public transient C81879g f240858g;

        /* renamed from: h */
        public transient C82164h f240859h;

        /* renamed from: i */
        public int f240860i;

        /* renamed from: j */
        public String f240861j;

        /* renamed from: n */
        public String f240862n;

        /* renamed from: o */
        public String f240863o;

        /* renamed from: p */
        public String f240864p;

        /* renamed from: p0 */
        public long f240865p0;

        /* renamed from: q */
        public int f240866q;

        /* renamed from: r */
        public int f240867r;

        /* renamed from: s */
        public int f240868s;

        /* renamed from: t */
        public boolean f240869t;

        /* renamed from: u */
        public int f240870u = 0;

        /* renamed from: v */
        public String f240871v = "";

        /* renamed from: w */
        public String f240872w = "";

        /* renamed from: x */
        public String f240873x = "";

        /* renamed from: x0 */
        public long f240874x0 = -1;

        /* renamed from: y */
        public String f240875y;

        /* renamed from: y0 */
        public long f240876y0 = -1;

        /* renamed from: z */
        public String f240877z;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a */
        public class C82112a implements C82122f {
            public C82112a() {
            }

            /* renamed from: a */
            public void mo114552a(String str, int i) {
                Log.m105920e("MicroMsg.AppBrand.JsApiOperateWXData", "onFailure !");
                OperateWXDataTask operateWXDataTask = OperateWXDataTask.this;
                operateWXDataTask.f240877z = "fail:" + str;
                OperateWXDataTask operateWXDataTask2 = OperateWXDataTask.this;
                operateWXDataTask2.f240832A = i;
                operateWXDataTask2.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b */
        public class C82113b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f240879d;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$a */
            public class C82114a implements C91566l.C91570c {
                public C82114a() {
                }

                /* renamed from: a */
                public void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z) {
                    Log.m105925i("MicroMsg.AppBrand.JsApiOperateWXData", "stev onRevMsg resultCode %d", Integer.valueOf(i));
                    if (i == 1 || i == 2) {
                        OperateWXDataTask operateWXDataTask = OperateWXDataTask.this;
                        operateWXDataTask.f240861j = "operateWXDataConfirm";
                        operateWXDataTask.f240835D = arrayList.size() > 0 ? arrayList.get(0) : "";
                        OperateWXDataTask operateWXDataTask2 = OperateWXDataTask.this;
                        operateWXDataTask2.f240867r = i;
                        operateWXDataTask2.f240868s = i2;
                        operateWXDataTask2.f240869t = z;
                        operateWXDataTask2.mo114395c();
                        if (i == 2) {
                            OperateWXDataTask operateWXDataTask3 = OperateWXDataTask.this;
                            operateWXDataTask3.f240857f.mo114601x(operateWXDataTask3.f240858g, operateWXDataTask3.f240860i, "fail auth deny");
                            ((C82165h0) OperateWXDataTask.this.f240859h).mo56741d();
                            return;
                        }
                        return;
                    }
                    Log.m105918d("MicroMsg.AppBrand.JsApiOperateWXData", "press back button!");
                    OperateWXDataTask operateWXDataTask4 = OperateWXDataTask.this;
                    operateWXDataTask4.f240857f.mo114601x(operateWXDataTask4.f240858g, operateWXDataTask4.f240860i, "fail auth cancel");
                    ((C82165h0) OperateWXDataTask.this.f240859h).mo56741d();
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$b */
            public class C82115b implements View.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ C91566l f240882d;

                public C82115b(C91566l lVar) {
                    this.f240882d = lVar;
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    C91566l lVar = this.f240882d;
                    OperateWXDataTask operateWXDataTask = OperateWXDataTask.this;
                    C81879g gVar = operateWXDataTask.f240858g;
                    lVar.mo121450n(gVar, operateWXDataTask.f240842K, (C40469j0) gVar.mo109668l(C40469j0.class)).mo121451o(OperateWXDataTask.this.f240858g);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$c */
            public class C82116c implements C82139c.C82141b {

                /* renamed from: a */
                public final /* synthetic */ C91566l f240884a;

                public C82116c(C91566l lVar) {
                    this.f240884a = lVar;
                }

                /* renamed from: a */
                public void mo63390a(boolean z, boolean z2, String str, String str2, C32227p<? super Activity, ? super String, C13598b0> pVar) {
                    if (z || z2) {
                        if (!z) {
                            this.f240884a.setFunctionButtonText(str);
                            this.f240884a.setFunctionButtonTextColor(OperateWXDataTask.this.f240858g.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                        } else {
                            this.f240884a.setFunctionButtonText("");
                        }
                        OperateWXDataTask operateWXDataTask = OperateWXDataTask.this;
                        C91566l lVar = this.f240884a;
                        MultiProcessMMKV multiProcessMMKV = OperateWXDataTask.f240831Q0;
                        operateWXDataTask.getClass();
                        lVar.setFunctionButtonOnClickListener((View.OnClickListener) null);
                        return;
                    }
                    this.f240884a.setFunctionButtonText(str2);
                    this.f240884a.setFunctionButtonTextColor(OperateWXDataTask.this.f240858g.getContext().getResources().getColor(C0966R.color.a1d));
                    OperateWXDataTask operateWXDataTask2 = OperateWXDataTask.this;
                    C91566l lVar2 = this.f240884a;
                    operateWXDataTask2.getClass();
                    lVar2.setFunctionButtonOnClickListener(new C82173j0(operateWXDataTask2, pVar));
                }

                /* renamed from: b */
                public void mo63391b(List<C87330d0.C87331a> list) {
                    this.f240884a.setSelectListItem(list);
                }

                /* renamed from: c */
                public void mo63392c(C82139c.C82141b.C40453a aVar) {
                    Log.m105924i("MicroMsg.AppBrand.JsApiOperateWXData", "[onCreateUserActionUpdate] action=" + aVar);
                    OperateWXDataTask.this.f240870u = aVar.f108728d;
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$d */
            public class C82117d implements C87330d0.C87332b {

                /* renamed from: a */
                public final /* synthetic */ C82139c f240886a;

                public C82117d(C82113b bVar, C82139c cVar) {
                    this.f240886a = cVar;
                }

                /* renamed from: a */
                public void mo114555a(C87330d0.C87331a aVar) {
                    C82139c cVar = this.f240886a;
                    cVar.getClass();
                    C87412m.m108594g(aVar, "item");
                    cVar.f240939f.set(aVar.f253109h);
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$e */
            public class C82118e implements C87330d0.C87333c {

                /* renamed from: a */
                public final /* synthetic */ C91566l f240887a;

                /* renamed from: b */
                public final /* synthetic */ C82139c f240888b;

                public C82118e(C82113b bVar, C91566l lVar, C82139c cVar) {
                    this.f240887a = lVar;
                    this.f240888b = cVar;
                }

                /* renamed from: a */
                public void mo114556a(View view, C87330d0.C87331a aVar, int i) {
                    MotionEvent lastPointerDownTouchEvent = this.f240887a.getLastPointerDownTouchEvent();
                    int i2 = 0;
                    int round = lastPointerDownTouchEvent == null ? 0 : Math.round(lastPointerDownTouchEvent.getRawX());
                    if (lastPointerDownTouchEvent != null) {
                        i2 = Math.round(lastPointerDownTouchEvent.getRawY());
                    }
                    this.f240888b.mo114583c(view, i, round, i2);
                }
            }

            public C82113b(LinkedList linkedList) {
                this.f240879d = linkedList;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0093  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x0188  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r17 = this;
                    r0 = r17
                    java.util.LinkedList r1 = r0.f240879d
                    java.lang.Object r1 = r1.getFirst()
                    te3.rw3 r1 = (te3.C90437rw3) r1
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$a
                    r2.<init>()
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r3 = r3.f240858g
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r3.getRuntime()
                    java.lang.String r4 = r1.f259822d
                    wi0.l r5 = r3.mo113051d0()
                    boolean r4 = wq0.C91084u.m114265b(r4, r5)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r5 = r5.f240858g
                    java.util.LinkedList r6 = r0.f240879d
                    yq0.l r2 = yq0.C91566l.C91567a.m114904a(r5, r2, r6)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240833B
                    r2.setAppBrandName(r5)
                    java.lang.String r5 = r1.f259823e
                    r2.setRequestDesc(r5)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240838G
                    r2.setApplyWording(r5)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240839H
                    r2.setNegativeButtonText(r5)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240840I
                    r2.setPositiveButtonText(r5)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240834C
                    r2.setIconUrl(r5)
                    boolean r5 = r3 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
                    r6 = 0
                    if (r5 == 0) goto L_0x0066
                    r5 = r3
                    com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r5
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r5.mo113210l1()
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r5.f234815R0
                    boolean r5 = r5.mo76931c()
                    goto L_0x0067
                L_0x0066:
                    r5 = 0
                L_0x0067:
                    r7 = 1
                    if (r5 != 0) goto L_0x0084
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    boolean r8 = r5.f240841J
                    if (r8 == 0) goto L_0x0084
                    java.lang.String r5 = r5.f240842K
                    boolean r5 = android.text.TextUtils.isEmpty(r5)
                    if (r5 != 0) goto L_0x0084
                    r2.mo121473t(r7)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$b r5 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$b
                    r5.<init>(r2)
                    r2.setExplainOnClickListener(r5)
                    goto L_0x0087
                L_0x0084:
                    r2.mo121473t(r6)
                L_0x0087:
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240845N
                    boolean r5 = android.text.TextUtils.isEmpty(r5)
                    java.lang.String r8 = "MicroMsg.AppBrand.JsApiOperateWXData"
                    if (r5 != 0) goto L_0x009b
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r3 = r3.f240845N
                    r2.setSimpleDetailDesc(r3)
                    goto L_0x00ce
                L_0x009b:
                    if (r4 == 0) goto L_0x00ce
                    java.lang.String r4 = r1.f259822d
                    java.lang.String r4 = wq0.C91084u.m114264a(r4, r3)
                    boolean r4 = android.text.TextUtils.isEmpty(r4)
                    if (r4 == 0) goto L_0x00c5
                    java.lang.String r1 = "error = fail:require permission desc"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.q r2 = r1.f240857f
                    com.tencent.mm.plugin.appbrand.g r3 = r1.f240858g
                    int r1 = r1.f240860i
                    java.lang.String r4 = "fail:require permission desc"
                    r2.mo114601x(r3, r1, r4)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.h r1 = r1.f240859h
                    com.tencent.mm.plugin.appbrand.jsapi.auth.h0 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82165h0) r1
                    r1.mo56741d()
                    return
                L_0x00c5:
                    java.lang.String r4 = r1.f259822d
                    java.lang.String r3 = wq0.C91084u.m114264a(r4, r3)
                    r2.setSimpleDetailDesc(r3)
                L_0x00ce:
                    java.lang.String r3 = r1.f259822d
                    java.lang.String r4 = "scope.userInfo"
                    boolean r3 = r4.equals(r3)
                    if (r3 != 0) goto L_0x00ec
                    java.lang.String r3 = r1.f259822d
                    java.lang.String r4 = "scope.userProfileChange"
                    boolean r3 = r4.equals(r3)
                    if (r3 == 0) goto L_0x00e5
                    goto L_0x00ec
                L_0x00e5:
                    java.lang.String r1 = r1.f259822d
                    r2.setScope(r1)
                    goto L_0x0174
                L_0x00ec:
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r3 = r3.f240858g
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r3.getRuntime()
                    boolean r3 = r3 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
                    if (r3 == 0) goto L_0x010a
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r4 = r3.f240858g
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r4.getRuntime()
                    com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r4
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
                    java.lang.String r4 = r4.f234837q
                    r3.f240871v = r4
                L_0x010a:
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo r4 = r3.f240843L
                    if (r4 == 0) goto L_0x0137
                    com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c r4 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c
                    com.tencent.mm.plugin.appbrand.g r3 = r3.f240858g
                    android.content.Context r3 = r3.getContext()
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo r5 = r5.f240843L
                    java.lang.String r1 = r1.f259822d
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$c r9 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$c
                    r9.<init>(r2)
                    r4.<init>(r3, r5, r1, r9)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$d r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$d
                    r1.<init>(r0, r4)
                    r2.setItemCheckedListener(r1)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$e r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$b$e
                    r1.<init>(r0, r2, r4)
                    r2.setOnListItemLongClickListener(r1)
                    goto L_0x0174
                L_0x0137:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    gt0.d0$a r4 = new gt0.d0$a
                    r10 = 0
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r11 = r5.f240872w
                    com.tencent.mm.plugin.appbrand.g r5 = r5.f240858g
                    android.content.Context r5 = r5.getContext()
                    android.content.res.Resources r5 = r5.getResources()
                    r9 = 2131821758(0x7f1104be, float:1.9276268E38)
                    java.lang.String r12 = r5.getString(r9)
                    java.lang.String r13 = r1.f259822d
                    r14 = 1
                    java.lang.Class<ln.i> r1 = p196ln.C76708i.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    ln.i r1 = (p196ln.C76708i) r1
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r5 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    java.lang.String r5 = r5.f240873x
                    r9 = 0
                    android.graphics.Bitmap r15 = r1.Wd0(r5, r9)
                    r16 = 0
                    r9 = r4
                    r9.<init>((int) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (boolean) r14, (android.graphics.Bitmap) r15, (int) r16)
                    r3.add(r4)
                    r2.setSelectListItem(r3)
                L_0x0174:
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo r1 = r1.f240844M
                    boolean r3 = r1.f240927d
                    if (r3 == 0) goto L_0x0186
                    java.lang.String r1 = r1.f240928e
                    boolean r1 = z04.C112551y.m153811k(r1)
                    r1 = r1 ^ r7
                    if (r1 == 0) goto L_0x0186
                    r6 = 1
                L_0x0186:
                    if (r6 == 0) goto L_0x01a0
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo r1 = r1.f240844M
                    java.lang.String r1 = r1.f240928e
                    r2.setUserAgreementCheckBoxWording(r1)
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r1 = r1.f240858g
                    java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.j0> r3 = com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0.class
                    ra.b r1 = r1.mo109668l(r3)
                    com.tencent.mm.plugin.appbrand.jsapi.j0 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0) r1
                    r2.setIExternalToolsHelper(r1)
                L_0x01a0:
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                    com.tencent.mm.plugin.appbrand.g r1 = r1.f240858g
                    r2.mo121451o(r1)
                    java.lang.String r1 = "dialog show"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82113b.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$c */
        public class C82119c implements Parcelable.Creator<OperateWXDataTask> {
            public Object createFromParcel(Parcel parcel) {
                return new OperateWXDataTask(parcel);
            }

            public Object[] newArray(int i) {
                return new OperateWXDataTask[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$d */
        public class C82120d implements C90079g.C90080a<C90079g> {

            /* renamed from: a */
            public final /* synthetic */ String f240889a;

            /* renamed from: b */
            public final /* synthetic */ C82122f f240890b;

            public C82120d(String str, C82122f fVar) {
                this.f240889a = str;
                this.f240890b = fVar;
            }

            /* renamed from: a */
            public void mo114559a(int i, int i2, String str, C117747y yVar) {
                OperateWXDataTask.this.mo114550q(i, i2, str, (C90079g) yVar, this.f240889a, this.f240890b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$e */
        public class C82121e implements C90079g.C90080a<C90079g> {

            /* renamed from: a */
            public final /* synthetic */ String f240892a;

            /* renamed from: b */
            public final /* synthetic */ C82122f f240893b;

            public C82121e(String str, C82122f fVar) {
                this.f240892a = str;
                this.f240893b = fVar;
            }

            /* renamed from: a */
            public void mo114559a(int i, int i2, String str, C117747y yVar) {
                OperateWXDataTask.this.mo114550q(i, i2, str, (C90079g) yVar, this.f240892a, this.f240893b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$f */
        public interface C82122f {
        }

        public OperateWXDataTask() {
        }

        public void dead() {
            mo114397h();
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240875y = parcel.readString();
            this.f240877z = parcel.readString();
            this.f240833B = parcel.readString();
            this.f240834C = parcel.readString();
            this.f240862n = parcel.readString();
            this.f240863o = parcel.readString();
            this.f240864p = parcel.readString();
            this.f240860i = parcel.readInt();
            this.f240861j = parcel.readString();
            this.f240835D = parcel.readString();
            this.f240836E = parcel.readInt();
            this.f240837F = parcel.readHashMap(HashMap.class.getClassLoader());
            this.f240866q = parcel.readInt();
            this.f240867r = parcel.readInt();
            this.f240848R = parcel.readInt();
            this.f240849S = parcel.readInt();
            this.f240872w = parcel.readString();
            this.f240873x = parcel.readString();
            this.f240840I = parcel.readString();
            this.f240839H = parcel.readString();
            this.f240838G = parcel.readString();
            this.f240843L = (MMUserAvatarInfo) parcel.readParcelable(MMUserAvatarInfo.class.getClassLoader());
            this.f240846P = parcel.readInt();
            boolean z = false;
            this.f240847Q = parcel.readInt() == 1;
            this.f240868s = parcel.readInt();
            this.f240870u = parcel.readInt();
            this.f240871v = parcel.readString();
            this.f240850T = parcel.readInt() == 1;
            this.f240841J = parcel.readInt() == 1;
            this.f240842K = parcel.readString();
            this.f240845N = parcel.readString();
            this.f240832A = parcel.readInt();
            this.f240856Z = parcel.readLong();
            this.f240865p0 = parcel.readLong();
            this.f240874x0 = parcel.readLong();
            this.f240876y0 = parcel.readLong();
            this.f240852V = parcel.readInt() == 1;
            this.f240851U = parcel.readInt() > 0;
            this.f240844M = (MMUserPrivacyProtectInfo) parcel.readParcelable(MMUserPrivacyProtectInfo.class.getClassLoader());
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f240869t = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            if (!this.f240858g.isRunning()) {
                ((C82165h0) this.f240859h).mo56741d();
            } else if (this.f240877z.equals("ok")) {
                HashMap hashMap = new HashMap();
                String str = this.f240863o;
                if (!TextUtils.isEmpty(this.f240864p)) {
                    try {
                        MultiProcessMMKV multiProcessMMKV = f240831Q0;
                        str = multiProcessMMKV.getString(this.f240864p, "");
                        multiProcessMMKV.remove(this.f240864p);
                        JsApiOperateWXData.m100835A(1063, 2);
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "runInClientProcess loginResult ok, get data from XProcessStore failed, appId[%s], callbackId[%d], e=%s", this.f240875y, Integer.valueOf(this.f240860i), th);
                        JsApiOperateWXData.m100835A(1063, 3);
                    }
                }
                hashMap.put("data", str);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("isConfirm", Boolean.valueOf(this.f240852V));
                hashMap2.put("queueLength", Integer.valueOf(this.f240853W));
                hashMap2.put("wxdataQueueTimestamp", Long.valueOf(this.f240854X));
                hashMap2.put("wxdataDequeueTimestamp", Long.valueOf(this.f240855Y));
                hashMap2.put("beginCGITimestamp", Long.valueOf(this.f240856Z));
                hashMap2.put("CGICallbackTimestamp", Long.valueOf(this.f240865p0));
                hashMap2.put("beginCGITimestampAfterConfirm", Long.valueOf(this.f240874x0));
                hashMap2.put("CGICallbackTimestampAfterConfirm", Long.valueOf(this.f240876y0));
                hashMap2.put("wxlibCallbackTimestamp", Long.valueOf(Util.nowMilliSecond()));
                hashMap.put("clientInfo", hashMap2);
                String m = this.f240857f.mo115112m("ok", hashMap);
                Log.m105919d("MicroMsg.AppBrand.JsApiOperateWXData", "callback data:%s", m);
                this.f240858g.mo109647a(this.f240860i, m);
                ((C82165h0) this.f240859h).mo56741d();
            } else if (this.f240877z.contains("fail")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("err_code", String.valueOf(this.f240832A));
                this.f240858g.mo109647a(this.f240860i, this.f240857f.mo115112m(this.f240877z, hashMap3));
                ((C82165h0) this.f240859h).mo56741d();
            } else if (this.f240877z.equals("needConfirm")) {
                LinkedList linkedList = new LinkedList();
                int i = 0;
                while (i < this.f240836E) {
                    Map<String, byte[]> map = this.f240837F;
                    byte[] bArr = map.get(i + "");
                    C90437rw3 rw32 = new C90437rw3();
                    try {
                        rw32.parseFrom(bArr);
                        linkedList.add(rw32);
                        i++;
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.AppBrand.JsApiOperateWXData", "IOException %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOperateWXData", e, "", new Object[0]);
                        this.f240857f.mo114601x(this.f240858g, this.f240860i, "fail");
                        ((C82165h0) this.f240859h).mo56741d();
                        return;
                    }
                }
                if (linkedList.size() > 0) {
                    this.f240858g.mo109673t(new C82113b(linkedList));
                    return;
                }
                this.f240857f.mo114601x(this.f240858g, this.f240860i, "fail");
                ((C82165h0) this.f240859h).mo56741d();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            if (this.f240852V) {
                this.f240874x0 = Util.nowMilliSecond();
            } else {
                this.f240856Z = Util.nowMilliSecond();
            }
            C82112a aVar = new C82112a();
            if (this.f240861j.equals("operateWXData")) {
                mo114551t(this.f240875y, this.f240862n, "", this.f240866q, this.f240867r, 0, aVar, this.f240850T, this.f240869t);
            } else if (this.f240861j.equals("operateWXDataConfirm")) {
                mo114551t(this.f240875y, this.f240862n, this.f240835D, this.f240866q, this.f240867r, this.f240868s, aVar, this.f240850T, this.f240869t);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0253, code lost:
            if (android.text.TextUtils.isEmpty(r9.f240878a.f240864p) != false) goto L_0x0292;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0296, code lost:
            r0 = r9.f240878a;
            r0.f240877z = "ok";
            r0.mo114394b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114550q(int r17, int r18, java.lang.String r19, rp0.C90079g r20, java.lang.String r21, com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82122f r22) {
            /*
                r16 = this;
                r1 = r16
                r0 = r20
                r2 = r21
                r3 = 3
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
                r6 = 0
                r4[r6] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
                r7 = 1
                r4[r7] = r5
                r5 = 2
                r4[r5] = r19
                java.lang.String r8 = "MicroMsg.AppBrand.JsApiOperateWXData"
                java.lang.String r9 = "onSceneEnd errType = %d, errCode = %d ,errMsg = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r4)
                boolean r4 = r1.f240852V
                if (r4 == 0) goto L_0x002c
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r1.f240876y0 = r9
                goto L_0x0032
            L_0x002c:
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r1.f240865p0 = r9
            L_0x0032:
                if (r17 != 0) goto L_0x02c3
                if (r18 == 0) goto L_0x0038
                goto L_0x02c3
            L_0x0038:
                if (r0 == 0) goto L_0x02c2
                int r4 = r1.f240867r
                if (r4 != r5) goto L_0x0045
                java.lang.String r0 = "press reject button"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
                return
            L_0x0045:
                ob0.c r0 = r0.f258742d
                r4 = 0
                if (r0 != 0) goto L_0x004c
                r0 = r4
                goto L_0x0052
            L_0x004c:
                ob0.c$d r0 = r0.f127056b
                pe3.a r0 = r0.f127083a
                te3.lk2 r0 = (te3.C90426lk2) r0
            L_0x0052:
                te3.hj2 r9 = r0.f259669d
                if (r9 != 0) goto L_0x0074
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "JsApiBaseResponse is null, enterData:"
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
                r0 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r0
                java.lang.String r2 = "cgi fail response null"
                r0.mo114552a(r2, r6)
                return
            L_0x0074:
                int r10 = r9.f134688d
                java.lang.String r9 = r9.f134689e
                te3.rw3 r11 = r0.f259671f
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                if (r11 == 0) goto L_0x0084
                r12.add(r11)
            L_0x0084:
                java.lang.String r11 = r0.f259672g
                java.lang.String r13 = r0.f259673h
                java.lang.Object[] r14 = new java.lang.Object[r7]
                java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
                r14[r6] = r15
                java.lang.String r15 = "stev NetSceneJSOperateWxData jsErrcode %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r15, r14)
                r14 = -12000(0xffffffffffffd120, float:NaN)
                java.lang.String r15 = ""
                if (r10 != r14) goto L_0x0198
                r1.f240852V = r7
                java.lang.String r2 = r0.f259678p
                r1.f240838G = r2
                java.lang.String r2 = r0.f259677o
                r1.f240840I = r2
                java.lang.String r2 = r0.f259676n
                r1.f240839H = r2
                te3.p4 r2 = r0.f259680r
                if (r2 == 0) goto L_0x00b6
                boolean r3 = r2.f259729d
                r1.f240841J = r3
                java.lang.String r2 = r2.f259730e
                r1.f240842K = r2
            L_0x00b6:
                te3.mo4 r2 = r0.f259679q
                if (r2 == 0) goto L_0x00c6
                com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo r3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo
                java.lang.String r4 = "avatar_info"
                gy3.C87412m.m108594g(r2, r4)
                r3.<init>(r2, r15, r15, r15)
                r1.f240843L = r3
            L_0x00c6:
                te3.gp4 r0 = r0.f259681s
                if (r0 == 0) goto L_0x00d1
                com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo r2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo
                r2.<init>(r0)
                r1.f240844M = r2
            L_0x00d1:
                r2 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r2
                r2.getClass()
                java.lang.String r0 = "onConfirm !"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                int r3 = r12.size()
                r0.f240836E = r3
                r0 = 0
            L_0x00e6:
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                int r4 = r3.f240836E
                if (r0 >= r4) goto L_0x012d
                java.lang.Object r3 = r12.get(r0)
                te3.rw3 r3 = (te3.C90437rw3) r3
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r4 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ IOException -> 0x010f }
                java.util.Map<java.lang.String, byte[]> r4 = r4.f240837F     // Catch:{ IOException -> 0x010f }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010f }
                r5.<init>()     // Catch:{ IOException -> 0x010f }
                r5.append(r0)     // Catch:{ IOException -> 0x010f }
                r5.append(r15)     // Catch:{ IOException -> 0x010f }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x010f }
                byte[] r3 = r3.toByteArray()     // Catch:{ IOException -> 0x010f }
                r4.put(r5, r3)     // Catch:{ IOException -> 0x010f }
                int r0 = r0 + 1
                goto L_0x00e6
            L_0x010f:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.String r4 = r0.getMessage()
                r3[r6] = r4
                java.lang.String r4 = "IOException %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r4, r3)
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r15, r3)
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r2 = "fail"
                r0.f240877z = r2
                r0.mo114394b()
                goto L_0x02c2
            L_0x012d:
                r3.f240833B = r11
                r3.f240834C = r13
                java.lang.String r0 = "needConfirm"
                r3.f240877z = r0
                int r0 = r12.size()
                if (r0 <= 0) goto L_0x0191
                java.lang.Object r0 = r12.get(r6)
                te3.rw3 r0 = (te3.C90437rw3) r0
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r4 = r0.f259827i
                if (r4 != 0) goto L_0x0148
                r4 = r15
            L_0x0148:
                r3.f240845N = r4
                java.lang.String r0 = r0.f259822d
                java.lang.String r3 = "scope.userInfo"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x018a
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r3 = eb0.C75592q0.m90783m()
                r0.f240872w = r3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "userNickName="
                r0.append(r3)
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r3 = r3.f240872w
                if (r3 != 0) goto L_0x016f
                goto L_0x0170
            L_0x016f:
                r15 = r3
            L_0x0170:
                r0.append(r15)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                java.lang.String r0 = eb0.C75592q0.m90789s()
                com.tencent.mm.plugin.appbrand.jsapi.auth.m$a r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C55469m.f158057a
                com.tencent.mm.plugin.appbrand.jsapi.auth.i0 r4 = new com.tencent.mm.plugin.appbrand.jsapi.auth.i0
                r4.<init>(r2)
                r3.mo76996a(r0, r4)
                goto L_0x02c2
            L_0x018a:
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                r0.mo114394b()
                goto L_0x02c2
            L_0x0191:
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                r0.mo114394b()
                goto L_0x02c2
            L_0x0198:
                if (r10 != 0) goto L_0x02b0
                pe3.b r0 = r0.f259670e
                if (r0 != 0) goto L_0x01bc
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "Data is null, enterData:"
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
                r0 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r0
                java.lang.String r2 = "internal error"
                r0.mo114552a(r2, r10)
                return
            L_0x01bc:
                java.lang.String r2 = r0.mo123705h()
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r6] = r2
                java.lang.String r9 = "resp data %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r0)
                r9 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r9 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r9
                r9.getClass()
                java.lang.String r0 = "onSuccess !"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
                r10 = 1063(0x427, double:5.25E-321)
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x0261 }
                r12 = 4
                java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x0261 }
                java.lang.String r13 = r0.f240875y     // Catch:{ all -> 0x0261 }
                r12[r6] = r13     // Catch:{ all -> 0x0261 }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0261 }
                r13.<init>()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r14 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x0261 }
                int r14 = r14.f240849S     // Catch:{ all -> 0x0261 }
                r13.append(r14)     // Catch:{ all -> 0x0261 }
                r13.append(r15)     // Catch:{ all -> 0x0261 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0261 }
                r12[r7] = r13     // Catch:{ all -> 0x0261 }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0261 }
                r13.<init>()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r14 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x0261 }
                int r14 = r14.f240860i     // Catch:{ all -> 0x0261 }
                r13.append(r14)     // Catch:{ all -> 0x0261 }
                r13.append(r15)     // Catch:{ all -> 0x0261 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0261 }
                r12[r5] = r13     // Catch:{ all -> 0x0261 }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0261 }
                r13.<init>()     // Catch:{ all -> 0x0261 }
                r19 = r8
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x025f }
                r13.append(r7)     // Catch:{ all -> 0x025f }
                r13.append(r15)     // Catch:{ all -> 0x025f }
                java.lang.String r7 = r13.toString()     // Catch:{ all -> 0x025f }
                r12[r3] = r7     // Catch:{ all -> 0x025f }
                java.lang.String r7 = "$"
                java.lang.String r7 = u24.C90599h.m113515h(r12, r7)     // Catch:{ all -> 0x025f }
                r0.f240864p = r7     // Catch:{ all -> 0x025f }
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = f240831Q0     // Catch:{ all -> 0x025f }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r7 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x025f }
                java.lang.String r7 = r7.f240864p     // Catch:{ all -> 0x025f }
                android.content.SharedPreferences$Editor r7 = r0.putString(r7, r2)     // Catch:{ all -> 0x025f }
                r7.commit()     // Catch:{ all -> 0x025f }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r7 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x025f }
                java.lang.String r7 = r7.f240864p     // Catch:{ all -> 0x025f }
                java.lang.String r0 = r0.getString(r7, r4)     // Catch:{ all -> 0x025f }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x025f }
                if (r0 != 0) goto L_0x0256
                r7 = 0
                com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.m100835A(r10, r7)     // Catch:{ all -> 0x025f }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r0 = r0.f240864p
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0296
                goto L_0x0292
            L_0x0256:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x025f }
                java.lang.String r7 = "write data failed"
                r0.<init>(r7)     // Catch:{ all -> 0x025f }
                throw r0     // Catch:{ all -> 0x025f }
            L_0x025f:
                r0 = move-exception
                goto L_0x0264
            L_0x0261:
                r0 = move-exception
                r19 = r8
            L_0x0264:
                java.lang.String r7 = "runInMainProcess::onSuccess, write to XProcessStore failed, appId[%s], callbackId[%d] e=%s"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a0 }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r8 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x02a0 }
                java.lang.String r12 = r8.f240875y     // Catch:{ all -> 0x02a0 }
                r3[r6] = r12     // Catch:{ all -> 0x02a0 }
                int r6 = r8.f240860i     // Catch:{ all -> 0x02a0 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02a0 }
                r8 = 1
                r3[r8] = r6     // Catch:{ all -> 0x02a0 }
                r3[r5] = r0     // Catch:{ all -> 0x02a0 }
                r5 = r19
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r3)     // Catch:{ all -> 0x02a0 }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this     // Catch:{ all -> 0x02a0 }
                r0.f240864p = r4     // Catch:{ all -> 0x02a0 }
                r3 = 1
                com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.m100835A(r10, r3)     // Catch:{ all -> 0x02a0 }
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r0 = r0.f240864p
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0296
            L_0x0292:
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                r0.f240863o = r2
            L_0x0296:
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r2 = "ok"
                r0.f240877z = r2
                r0.mo114394b()
                goto L_0x02c2
            L_0x02a0:
                r0 = move-exception
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                java.lang.String r3 = r3.f240864p
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x02af
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.this
                r3.f240863o = r2
            L_0x02af:
                throw r0
            L_0x02b0:
                r5 = r8
                r2 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r6] = r9
                java.lang.String r2 = "onSceneEnd NetSceneJSOperateWxData Failed %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                r0 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r0
                r0.mo114552a(r9, r10)
            L_0x02c2:
                return
            L_0x02c3:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
                r0[r6] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
                r3 = 1
                r0[r3] = r2
                java.lang.String r2 = "cgi fail(%d,%d)"
                java.lang.String r0 = java.lang.String.format(r2, r0)
                r2 = r22
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$a r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82112a) r2
                r2.mo114552a(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.mo114550q(int, int, java.lang.String, rp0.g, java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$f):void");
        }

        /* JADX WARNING: type inference failed for: r13v0, types: [rp0.g, ob0.y] */
        /* JADX WARNING: type inference failed for: r1v5, types: [rp0.f] */
        /* JADX WARNING: type inference failed for: r1v6, types: [rp0.g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114551t(java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, int r20, int r21, com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.C82122f r22, boolean r23, boolean r24) {
            /*
                r15 = this;
                r0 = r15
                r3 = r17
                r1 = r22
                java.lang.String r2 = "MicroMsg.AppBrand.JsApiOperateWXData"
                if (r23 != 0) goto L_0x0033
                java.lang.String r4 = "scene: OperateWxData"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
                rp0.g r13 = new rp0.g
                int r8 = r0.f240848R
                boolean r9 = r0.f240851U
                java.lang.String r10 = r0.f240871v
                int r11 = r0.f240870u
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$d r14 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$d
                r14.<init>(r3, r1)
                r1 = r13
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r21
                r7 = r20
                r12 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.f258744f = r14
                goto L_0x0058
            L_0x0033:
                java.lang.String r4 = "scene: OperateImportantWxData"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
                rp0.f r13 = new rp0.f
                int r8 = r0.f240848R
                java.lang.String r9 = r0.f240871v
                int r10 = r0.f240870u
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$e r12 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$e
                r12.<init>(r3, r1)
                r1 = r13
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r21
                r7 = r20
                r11 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L_0x0058:
                int r1 = r0.f240849S
                ob0.c r2 = r13.f258742d
                ob0.c$c r2 = r2.f127055a
                pe3.a r2 = r2.f127080a
                te3.kk2 r2 = (te3.C90423kk2) r2
                te3.w55 r3 = r2.f259648i
                if (r3 != 0) goto L_0x006d
                te3.w55 r3 = new te3.w55
                r3.<init>()
                r2.f259648i = r3
            L_0x006d:
                te3.w55 r2 = r2.f259648i
                r2.f143870f = r1
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.mo114551t(java.lang.String, java.lang.String, java.lang.String, int, int, int, com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask$f, boolean, boolean):void");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240875y);
            parcel.writeString(this.f240877z);
            parcel.writeString(this.f240833B);
            parcel.writeString(this.f240834C);
            parcel.writeString(this.f240862n);
            parcel.writeString(this.f240863o);
            parcel.writeString(this.f240864p);
            parcel.writeInt(this.f240860i);
            parcel.writeString(this.f240861j);
            parcel.writeString(this.f240835D);
            parcel.writeInt(this.f240836E);
            parcel.writeMap(this.f240837F);
            parcel.writeInt(this.f240866q);
            parcel.writeInt(this.f240867r);
            parcel.writeInt(this.f240848R);
            parcel.writeInt(this.f240849S);
            parcel.writeString(this.f240872w);
            parcel.writeString(this.f240873x);
            parcel.writeString(this.f240840I);
            parcel.writeString(this.f240839H);
            parcel.writeString(this.f240838G);
            parcel.writeParcelable(this.f240843L, i);
            parcel.writeInt(this.f240846P);
            parcel.writeInt(this.f240847Q ? 1 : 0);
            parcel.writeInt(this.f240868s);
            parcel.writeInt(this.f240870u);
            parcel.writeString(this.f240871v);
            parcel.writeInt(this.f240850T ? 1 : 0);
            parcel.writeInt(this.f240841J ? 1 : 0);
            parcel.writeString(this.f240842K);
            parcel.writeString(this.f240845N);
            parcel.writeInt(this.f240832A);
            parcel.writeLong(this.f240856Z);
            parcel.writeLong(this.f240865p0);
            parcel.writeLong(this.f240874x0);
            parcel.writeLong(this.f240876y0);
            parcel.writeInt(this.f240852V ? 1 : 0);
            parcel.writeInt(this.f240851U ? 1 : 0);
            parcel.writeParcelable(this.f240844M, i);
            parcel.writeInt(this.f240869t ? 1 : 0);
        }

        public OperateWXDataTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
