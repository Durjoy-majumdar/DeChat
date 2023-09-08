package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.tencent.p014mm.plugin.game.widget.C105368a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.widget.AutoResizeTextView */
public class AutoResizeTextView extends TextView implements C105368a.C105371c {

    /* renamed from: d */
    public C105368a f313205d;

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150038b(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo150037a(float f, float f2) {
    }

    /* renamed from: b */
    public final void mo150038b(Context context, AttributeSet attributeSet, int i) {
        C105368a aVar = new C105368a(this);
        if (attributeSet != null) {
            float f = aVar.f313212g;
            aVar.mo150053d(0, (float) ((int) aVar.f313210e));
            if (aVar.f313212g != f) {
                aVar.f313212g = f;
                aVar.mo150051a();
            }
        }
        aVar.mo150052c(true);
        if (aVar.f313215j == null) {
            aVar.f313215j = new ArrayList<>();
        }
        aVar.f313215j.add(this);
        this.f313205d = aVar;
    }

    public C105368a getAutofitHelper() {
        return this.f313205d;
    }

    public float getMaxTextSize() {
        return this.f313205d.f313211f;
    }

    public float getMinTextSize() {
        return this.f313205d.f313210e;
    }

    public float getPrecision() {
        return this.f313205d.f313212g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C105368a aVar = this.f313205d;
        if (aVar != null) {
            aVar.mo150051a();
        }
    }

    public void setLines(int i) {
        super.setLines(i);
        C105368a aVar = this.f313205d;
        if (aVar != null && aVar.f313209d != i) {
            aVar.f313209d = i;
            aVar.mo150051a();
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C105368a aVar = this.f313205d;
        if (aVar != null && aVar.f313209d != i) {
            aVar.f313209d = i;
            aVar.mo150051a();
        }
    }

    public void setMaxTextSize(float f) {
        C105368a aVar = this.f313205d;
        Context context = aVar.f313206a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(2, f, system.getDisplayMetrics());
        if (applyDimension != aVar.f313211f) {
            aVar.f313211f = applyDimension;
            aVar.mo150051a();
        }
    }

    public void setMinTextSize(int i) {
        this.f313205d.mo150053d(2, (float) i);
    }

    public void setPrecision(float f) {
        C105368a aVar = this.f313205d;
        if (aVar.f313212g != f) {
            aVar.f313212g = f;
            aVar.mo150051a();
        }
    }

    public void setSizeToFit(boolean z) {
        this.f313205d.mo150052c(z);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C105368a aVar = this.f313205d;
        if (aVar != null && !aVar.f313214i) {
            Context context = aVar.f313206a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            float applyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
            if (aVar.f313208c != applyDimension) {
                aVar.f313208c = applyDimension;
            }
        }
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo150038b(context, attributeSet, i);
    }
}
