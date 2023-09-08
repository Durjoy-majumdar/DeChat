package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTouchProgressView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.o3 */
public class C96098o3 {

    /* renamed from: a */
    public Context f280664a;

    /* renamed from: b */
    public SnsInfo f280665b;

    /* renamed from: c */
    public ADXml.C95028p f280666c;

    /* renamed from: d */
    public SnsAdTouchProgressView f280667d;

    /* renamed from: e */
    public C96066m2 f280668e;

    /* renamed from: f */
    public int f280669f;

    /* renamed from: g */
    public Handler f280670g;

    /* renamed from: h */
    public View f280671h;

    /* renamed from: i */
    public volatile boolean f280672i = false;

    /* renamed from: j */
    public Drawable f280673j;

    /* renamed from: k */
    public long f280674k;

    /* renamed from: l */
    public SnsAdTouchProgressView.C96297b f280675l = new C96099a();

    /* renamed from: m */
    public boolean f280676m = false;

    /* renamed from: n */
    public String f280677n = "";

    /* renamed from: o */
    public SnsAdTouchProgressView.C96297b f280678o;

    /* renamed from: com.tencent.mm.plugin.sns.ui.o3$a */
    public class C96099a implements SnsAdTouchProgressView.C96297b {

        /* renamed from: com.tencent.mm.plugin.sns.ui.o3$a$a */
        public class C96100a implements Runnable {
            public C96100a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2$1");
                Log.m105924i("SnsAdPressGestureCtrl", "onFinish, vabriate");
                C102236a0.m134708C0(new long[]{0, 60});
                if (C96098o3.m123128b(C96098o3.this) != null) {
                    C96098o3.m123128b(C96098o3.this).setBackground((Drawable) null);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2$1");
            }
        }

        public C96099a() {
        }

        public void onCancel() {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            if (C96098o3.m123128b(C96098o3.this) != null) {
                C96098o3.m123128b(C96098o3.this).setBackground((Drawable) null);
            }
            C96098o3 o3Var = C96098o3.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            Handler handler = o3Var.f280670g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            handler.removeCallbacksAndMessages((Object) null);
            Log.m105924i("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish=" + C96098o3.this.f280676m);
            C96098o3 o3Var2 = C96098o3.this;
            if (o3Var2.f280676m) {
                Log.m105920e("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish==true");
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            } else if (C96098o3.m123127a(o3Var2) == null) {
                Log.m105920e("SnsAdPressGestureCtrl", "onCancel, mGestureInfo == null");
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            } else {
                SnsAdTouchProgressView.C96297b bVar = C96098o3.this.f280678o;
                if (bVar != null) {
                    bVar.onCancel();
                }
                SnsInfo c = C96098o3.m123129c(C96098o3.this);
                long currentTimeMillis = System.currentTimeMillis();
                C96098o3 o3Var3 = C96098o3.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                int i = o3Var3.f280669f;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                C96098o3.m123130f(c, 1, (int) (currentTimeMillis - o3Var3.f280674k), i);
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            }
        }

        public void onClick(View view) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            Log.m105924i("SnsAdPressGestureCtrl", "onClick");
            SnsAdTouchProgressView.C96297b bVar = C96098o3.this.f280678o;
            if (bVar != null) {
                bVar.onClick(view);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        }

        public void onFinish() {
            int i;
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            Log.m105924i("SnsAdPressGestureCtrl", "onFinish, isCalledOnFinish=" + C96098o3.this.f280676m);
            C96098o3 o3Var = C96098o3.this;
            if (!o3Var.f280676m) {
                o3Var.f280676m = true;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                Handler handler = o3Var.f280670g;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                handler.postDelayed(new C96100a(), 100);
                SnsAdTouchProgressView.C96297b bVar = C96098o3.this.f280678o;
                if (bVar != null) {
                    bVar.onFinish();
                }
                C96098o3 o3Var2 = C96098o3.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                SnsAdTouchProgressView snsAdTouchProgressView = o3Var2.f280667d;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                if (snsAdTouchProgressView == null) {
                    i = 0;
                } else {
                    C96098o3 o3Var3 = C96098o3.this;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                    SnsAdTouchProgressView snsAdTouchProgressView2 = o3Var3.f280667d;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                    i = snsAdTouchProgressView2.getLongPressTime();
                }
                SnsInfo c = C96098o3.m123129c(C96098o3.this);
                C96098o3 o3Var4 = C96098o3.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                int i2 = o3Var4.f280669f;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                C96098o3.m123130f(c, 2, (int) ((((long) i) + System.currentTimeMillis()) - o3Var4.f280674k), i2);
            } else {
                Log.m105920e("SnsAdPressGestureCtrl", "onFinish, secondTimes");
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        }

        public void onStart() {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            C96098o3.this.f280674k = System.currentTimeMillis();
            C96098o3 o3Var = C96098o3.this;
            o3Var.f280676m = false;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            Handler handler = o3Var.f280670g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            handler.removeCallbacksAndMessages((Object) null);
            if (C96098o3.m123127a(C96098o3.this) == null) {
                Log.m105920e("SnsAdPressGestureCtrl", "onStart, mGestureInfo == null");
                SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
                return;
            }
            Log.m105924i("SnsAdPressGestureCtrl", "onStart, isCalledOnFinish=" + C96098o3.this.f280676m);
            SnsAdTouchProgressView.C96297b bVar = C96098o3.this.f280678o;
            if (bVar != null) {
                bVar.onStart();
            }
            C102236a0.m134708C0(new long[]{0, 60});
            if (C96098o3.m123128b(C96098o3.this) != null) {
                View b = C96098o3.m123128b(C96098o3.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = b;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View b2 = C96098o3.m123128b(C96098o3.this);
                C96098o3 o3Var2 = C96098o3.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                Drawable drawable = o3Var2.f280673j;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                b2.setBackground(drawable);
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        }
    }

    public C96098o3(Context context, SnsAdTouchProgressView snsAdTouchProgressView, C96066m2 m2Var, int i, View view) {
        this.f280664a = context;
        this.f280667d = snsAdTouchProgressView;
        this.f280668e = m2Var;
        this.f280669f = i;
        this.f280671h = view;
        this.f280670g = new Handler(Looper.getMainLooper());
        this.f280673j = new ColorDrawable(Color.parseColor("#1a000000"));
    }

    /* renamed from: a */
    public static /* synthetic */ ADXml.C95028p m123127a(C96098o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        ADXml.C95028p pVar = o3Var.f280666c;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return pVar;
    }

    /* renamed from: b */
    public static /* synthetic */ View m123128b(C96098o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        View view = o3Var.f280671h;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return view;
    }

    /* renamed from: c */
    public static /* synthetic */ SnsInfo m123129c(C96098o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        SnsInfo snsInfo = o3Var.f280665b;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return snsInfo;
    }

    /* renamed from: f */
    public static void m123130f(SnsInfo snsInfo, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", snsInfo.field_snsId + "");
            jSONObject.put("uxinfo", Util.nullAsNil(snsInfo.getAdInfo().uxInfo));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject2.put("pressTotalTime", i2);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_fullcard_longpress_action", jSONObject3);
            Log.m105924i("SnsAdPressGestureCtrl", "reportAction, content=" + jSONObject3 + ", channel=" + "timeline_fullcard_longpress_action");
        } catch (Exception e) {
            Log.m105924i("SnsAdPressGestureCtrl", "reportAction, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }

    /* renamed from: d */
    public void mo133657d() {
        SnsMethodCalculate.markStartTimeMs("disableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        SnsAdTouchProgressView snsAdTouchProgressView = this.f280667d;
        if (!(snsAdTouchProgressView == null || snsAdTouchProgressView.getVisibility() == 8)) {
            Log.m105924i("SnsAdPressGestureCtrl", "disableLongPressGestureView, w=" + this.f280667d.getWidth() + ", h=" + this.f280667d.getHeight());
            SnsAdTouchProgressView snsAdTouchProgressView2 = this.f280667d;
            snsAdTouchProgressView2.getClass();
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            Log.m105924i("SnsAdTouchProgressView", "clear");
            snsAdTouchProgressView2.f281522h.removeCallbacksAndMessages((Object) null);
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            this.f280667d.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("disableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }

    /* renamed from: e */
    public void mo133658e() {
        SnsMethodCalculate.markStartTimeMs("enableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        SnsAdTouchProgressView snsAdTouchProgressView = this.f280667d;
        if (!(snsAdTouchProgressView == null || snsAdTouchProgressView.getVisibility() == 0)) {
            Log.m105924i("SnsAdPressGestureCtrl", "enableLongPressGestureView, scene=" + this.f280669f);
            this.f280667d.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("enableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }
}
