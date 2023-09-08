package com.tencent.p014mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import pi0.C110222b;
import pi0.C110229d;
import ui0.C111179a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MHardwareAccelerateDrawableView */
public class MHardwareAccelerateDrawableView extends View implements C81602a {

    /* renamed from: d */
    public final C110222b f311180d = new C110222b(this);

    /* renamed from: e */
    public final Set<View.OnAttachStateChangeListener> f311181e = new LinkedHashSet();

    public MHardwareAccelerateDrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: a */
    public void mo113881a(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311180d.mo113881a(jSONArray, aVar);
    }

    public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (!this.f311181e.contains(onAttachStateChangeListener)) {
            this.f311181e.add(onAttachStateChangeListener);
            super.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* renamed from: b */
    public void mo113882b(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311180d.mo113882b(jSONArray, aVar);
    }

    /* renamed from: c */
    public void mo113883c() {
        postInvalidate();
    }

    /* renamed from: d */
    public void mo113884d(Runnable runnable) {
        this.f311180d.mo113884d(runnable);
    }

    /* renamed from: e */
    public boolean mo113885e(Canvas canvas) {
        return this.f311180d.mo113885e(canvas);
    }

    public C110229d getDrawContext() {
        return this.f311180d.f329724g;
    }

    public String getSessionId() {
        return this.f311180d.f329727j;
    }

    public String getTraceId() {
        return this.f311180d.f329733s;
    }

    public void onDraw(Canvas canvas) {
        mo113885e(canvas);
    }

    public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f311181e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public void setDrawActionReportable(C111179a aVar) {
        this.f311180d.getClass();
    }

    public void setSessionId(String str) {
        this.f311180d.f329727j = str;
    }

    public void setStartTime(long j) {
        C110222b bVar = this.f311180d;
        bVar.getClass();
        bVar.f329731q = j;
    }

    public void setTraceId(String str) {
        this.f311180d.f329733s = str;
    }

    public MHardwareAccelerateDrawableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayerType(2, (Paint) null);
    }
}
