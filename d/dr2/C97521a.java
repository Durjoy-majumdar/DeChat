package dr2;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cr2.C97358b;
import zq2.C103063b;
import zq2.C103065c;

/* renamed from: dr2.a */
public abstract class C97521a extends C97358b {

    /* renamed from: f */
    public GLViewContainer f286210f;

    public C97521a(Context context, GLViewContainer gLViewContainer, C97358b.C97359a aVar) {
        super(context, aVar);
        this.f286210f = gLViewContainer;
        mo136629b();
    }

    /* renamed from: a */
    public void mo136626a(Rect rect) {
        SnsMethodCalculate.markStartTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        C103063b bVar = new C103063b(this.f285839d);
        int abs = Math.abs(rect.right - rect.left);
        int abs2 = Math.abs(rect.top - rect.bottom);
        C103063b.C103064a aVar = new C103063b.C103064a(abs, abs2);
        aVar.leftMargin = rect.left;
        aVar.topMargin = rect.top;
        bVar.mo142776m(aVar);
        bVar.mo142771h(this.f285836a.f285841a);
        bVar.mo142775l(0.0f);
        this.f286210f.mo130529d(bVar);
        mo136796f(bVar, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        SnsMethodCalculate.markEndTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    /* renamed from: c */
    public void mo136627c() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f285840e.clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        GLViewContainer gLViewContainer = this.f286210f;
        gLViewContainer.getClass();
        SnsMethodCalculate.markStartTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.queueEvent(new C103065c(gLViewContainer));
        SnsMethodCalculate.markEndTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    /* renamed from: f */
    public abstract void mo136796f(C103063b bVar, int i, int i2, int i3, int i4);
}
