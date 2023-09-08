package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.ShowCommentImageView */
public class ShowCommentImageView extends ImageView {

    /* renamed from: e */
    public static Bitmap f116574e;

    /* renamed from: f */
    public static Bitmap f116575f;

    /* renamed from: g */
    public static Field f116576g;

    /* renamed from: h */
    public static Field f116577h;

    /* renamed from: i */
    public static boolean f116578i;

    /* renamed from: d */
    public boolean f116579d = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.ShowCommentImageView$a */
    public class C43068a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnClickListener f116580d;

        public C43068a(View.OnClickListener onClickListener) {
            this.f116580d = onClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ShowCommentImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$1");
            ShowCommentImageView showCommentImageView = ShowCommentImageView.this;
            Bitmap bitmap = ShowCommentImageView.f116574e;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            showCommentImageView.f116579d = true;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            this.f116580d.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ShowCommentImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ShowCommentImageView$b */
    public class C43069b implements Runnable {
        public C43069b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$2");
            ShowCommentImageView showCommentImageView = ShowCommentImageView.this;
            Bitmap bitmap = ShowCommentImageView.f116574e;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            showCommentImageView.f116579d = false;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$2");
        }
    }

    public ShowCommentImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo67254a();
    }

    /* renamed from: a */
    public final void mo67254a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (f116576g == null || f116577h == null) {
            try {
                f116576g = View.class.getDeclaredField("mDrawingCache");
                f116577h = View.class.getDeclaredField("mUnscaledDrawingCache");
                f116576g.setAccessible(true);
                f116577h.setAccessible(true);
                f116578i = true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ShowCommentImageView", "init error: %s", e.getMessage());
                f116578i = false;
            }
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            return;
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    /* renamed from: b */
    public final void mo67255b(boolean z, boolean z2) {
        Field field;
        SnsMethodCalculate.markStartTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (z) {
            try {
                field = f116576g;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e.getMessage());
            }
        } else {
            field = f116577h;
        }
        if (z2) {
            field.set(this, (Object) null);
            SnsMethodCalculate.markEndTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            return;
        }
        Bitmap bitmap = z ? f116575f : f116574e;
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Boolean.valueOf(bitmap == null);
        Log.m105919d("MicroMsg.ShowCommentImageView", "setDrawingCache, autoScale: %s, cache==null: %s", objArr);
        if (bitmap != null) {
            field.set(this, bitmap);
        }
        SnsMethodCalculate.markEndTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void buildDrawingCache(boolean r11) {
        /*
            r10 = this;
            java.lang.String r0 = "buildDrawingCache"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.ShowCommentImageView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = f116578i
            if (r2 == 0) goto L_0x00ba
            boolean r2 = r10.f116579d
            r3 = 1
            if (r2 != 0) goto L_0x00b3
            java.lang.String r2 = "checkIfCanReuseDrawingCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r4 = f116578i
            java.lang.String r5 = "MicroMsg.ShowCommentImageView"
            r6 = 0
            if (r4 != 0) goto L_0x0021
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x001f:
            r4 = 0
            goto L_0x0050
        L_0x0021:
            if (r11 == 0) goto L_0x0026
            java.lang.reflect.Field r4 = f116576g     // Catch:{ Exception -> 0x0037 }
            goto L_0x0028
        L_0x0026:
            java.lang.reflect.Field r4 = f116577h     // Catch:{ Exception -> 0x0037 }
        L_0x0028:
            java.lang.Object r4 = r4.get(r10)     // Catch:{ Exception -> 0x0037 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ Exception -> 0x0037 }
            if (r4 == 0) goto L_0x0032
            r4 = 1
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0050
        L_0x0037:
            r4 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r8, r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r7[r6] = r4
            java.lang.String r4 = "checkIfCanReuseDrawingCache error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x001f
        L_0x0050:
            if (r4 != 0) goto L_0x00af
            if (r11 == 0) goto L_0x0057
            android.graphics.Bitmap r2 = f116575f
            goto L_0x0059
        L_0x0057:
            android.graphics.Bitmap r2 = f116574e
        L_0x0059:
            if (r2 == 0) goto L_0x0065
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x0065
            r10.mo67255b(r11, r6)
            goto L_0x00bd
        L_0x0065:
            super.buildDrawingCache(r11)
            java.lang.String r2 = "getStaticDrawingCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            if (r11 == 0) goto L_0x0072
            java.lang.reflect.Field r4 = f116576g     // Catch:{ Exception -> 0x009d }
            goto L_0x0074
        L_0x0072:
            java.lang.reflect.Field r4 = f116577h     // Catch:{ Exception -> 0x009d }
        L_0x0074:
            java.lang.Object r4 = r4.get(r10)     // Catch:{ Exception -> 0x009d }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ Exception -> 0x009d }
            java.lang.String r7 = "getStaticDrawingCache, autoScale: %s, cache==null: %s"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x009d }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x009d }
            r8[r6] = r9     // Catch:{ Exception -> 0x009d }
            if (r4 != 0) goto L_0x0089
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x009d }
            r8[r3] = r9     // Catch:{ Exception -> 0x009d }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r8)     // Catch:{ Exception -> 0x009d }
            if (r4 == 0) goto L_0x00ab
            if (r11 == 0) goto L_0x009a
            f116575f = r4     // Catch:{ Exception -> 0x009d }
            goto L_0x00ab
        L_0x009a:
            f116574e = r4     // Catch:{ Exception -> 0x009d }
            goto L_0x00ab
        L_0x009d:
            r11 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r11 = r11.getMessage()
            r3[r6] = r11
            java.lang.String r11 = "getStaticDrawingCache error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r3)
        L_0x00ab:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x00bd
        L_0x00af:
            super.buildDrawingCache(r11)
            goto L_0x00bd
        L_0x00b3:
            r10.mo67255b(r11, r3)
            super.buildDrawingCache(r11)
            goto L_0x00bd
        L_0x00ba:
            super.buildDrawingCache(r11)
        L_0x00bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.ShowCommentImageView.buildDrawingCache(boolean):void");
    }

    public void destroyDrawingCache() {
        SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.destroyDrawingCache();
        SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        SnsMethodCalculate.markStartTimeMs("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        try {
            f116576g.set(this, (Object) null);
            f116577h.set(this, (Object) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            postDelayed(new C43069b(), 100);
        } else {
            this.f116579d = true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        return onTouchEvent;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.setOnClickListener(new C43068a(onClickListener));
        SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public ShowCommentImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo67254a();
    }
}
