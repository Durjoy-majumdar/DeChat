package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.AbsListView;
import com.tencent.p014mm.plugin.webcanvas.WebCanvasView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import o40.C61926c;
import q73.C22079o;
import q73.C89538a;
import q73.C89544b;
import q73.C89547f;
import q73.C89558k0;
import q73.C89562n;
import q73.C89567w;
import t83.C48590l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0014X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\"\u0010*\u001a\u00020\u001f8F@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvasView;", "Lcom/tencent/mm/plugin/webcanvas/WebCanvasView;", "Lq73/o;", "Lcom/tencent/mm/storage/o0;", "bizTimeLineInfo", "Lrx3/b0;", "setBizTimeLineInfo", "", "getVideoRelativePos", "g", "Lcom/tencent/mm/storage/o0;", "getInfo", "()Lcom/tencent/mm/storage/o0;", "setInfo", "(Lcom/tencent/mm/storage/o0;)V", "info", "", "value", "h", "I", "getVideoStatus", "()I", "setVideoStatus", "(I)V", "videoStatus", "Lq73/f;", "i", "Lq73/f;", "getJsEngine", "()Lq73/f;", "jsEngine", "", "j", "Z", "isDoingConfigurationChanged", "()Z", "setDoingConfigurationChanged", "(Z)V", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine;", "getLogicEngine", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine;", "logicEngine", "isVideoCard", "c", "setVideoCard", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardCanvasView */
public final class BizTLRecCardCanvasView extends WebCanvasView implements C22079o {

    /* renamed from: f */
    public final String f247950f;

    /* renamed from: g */
    public C19623o0 f247951g;

    /* renamed from: h */
    public int f247952h;

    /* renamed from: i */
    public final C89547f f247953i;

    /* renamed from: j */
    public boolean f247954j;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardCanvasView$a */
    public static final class C85097a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public int f247955d;

        /* renamed from: e */
        public final /* synthetic */ BizTLRecCardCanvasView f247956e;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardCanvasView$a$a */
        public static final class C85098a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardCanvasView f247957d;

            /* renamed from: e */
            public final /* synthetic */ C85097a f247958e;

            public C85098a(BizTLRecCardCanvasView bizTLRecCardCanvasView, C85097a aVar) {
                this.f247957d = bizTLRecCardCanvasView;
                this.f247958e = aVar;
            }

            public final void run() {
                this.f247957d.setDoingConfigurationChanged(false);
                String str = this.f247957d.f247950f;
                Log.m105924i(str, "CanvasView onConfigurationChanged:[" + this.f247957d.getMeasuredWidth() + ", " + this.f247957d.getMeasuredHeight() + ']');
                C89547f.m111945Y1(this.f247957d.getJsEngine(), this.f247957d.getCanvasId(), 0, 2, (Object) null);
                this.f247957d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f247958e);
            }
        }

        public C85097a(BizTLRecCardCanvasView bizTLRecCardCanvasView) {
            this.f247956e = bizTLRecCardCanvasView;
        }

        public void onGlobalLayout() {
            C89547f.m111945Y1(this.f247956e.getJsEngine(), this.f247956e.getCanvasId(), 0, 2, (Object) null);
            int i = this.f247955d + 1;
            this.f247955d = i;
            if (i >= 2) {
                BizTLRecCardCanvasView bizTLRecCardCanvasView = this.f247956e;
                bizTLRecCardCanvasView.post(new C85098a(bizTLRecCardCanvasView, this));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BizTLRecCardCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final BizTLRecCardJsEngine getLogicEngine() {
        return BizTLRecCardJsEngine.f247961Y.mo118094a();
    }

    /* renamed from: a */
    public void mo35176a() {
        BizTLRecCardJsEngine logicEngine = getLogicEngine();
        String canvasId = getCanvasId();
        logicEngine.getClass();
        C87412m.m108594g(canvasId, "canvasId");
        Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "onScreenShot " + canvasId);
        String str = canvasId;
        C89547f.m111944P1(logicEngine, "onScreenShot", str, (ValueCallback) null, 4, (Object) null);
        C89567w.m111980P1(logicEngine.mo118087S1(), "onScreenShot", str, (ValueCallback) null, 4, (Object) null);
    }

    /* renamed from: b */
    public final void mo118070b(long j, String str, String str2, String str3) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(str2, "type");
        C87412m.m108594g(str3, "data");
        C89547f jsEngine = getJsEngine();
        C87412m.m108592e(jsEngine, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine");
        ((BizTLRecCardJsEngine) jsEngine).f247970S.put(str, Long.valueOf(j));
        BizTLRecCardJsEngine bizTLRecCardJsEngine = (BizTLRecCardJsEngine) getJsEngine();
        if (bizTLRecCardJsEngine.f247974W == null) {
            bizTLRecCardJsEngine.f247974W = new GestureDetector(MMApplicationContext.getContext(), new C85104g1(bizTLRecCardJsEngine));
        }
        C19623o0 o0Var = this.f247951g;
        if (o0Var != null) {
            HashMap<String, String> hashMap = ((BizTLRecCardJsEngine) getJsEngine()).f247971T;
            String r2 = o0Var.mo25768r2();
            C87412m.m108593f(r2, "it.id");
            hashMap.put(str, r2);
        }
        BizTLRecCardJsEngine bizTLRecCardJsEngine2 = (BizTLRecCardJsEngine) getJsEngine();
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        bizTLRecCardJsEngine2.getClass();
        bizTLRecCardJsEngine2.f247972U = weakReference;
        this.f249175e = str;
        String str4 = this.f249174d;
        Log.m105924i(str4, "init:#" + str);
        C89547f jsEngine2 = getJsEngine();
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C89538a O1 = jsEngine2.mo123863O1(str2, str, str3, context);
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(getChildAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (!C87412m.m108589b(view, O1.mo123840g())) {
                removeView(view);
            }
        }
        ((C48590l) ((BizTLRecCardJsEngine) O1.mo123839f()).f247968Q).f129998c = getContext();
        C89558k0 k0Var = O1.f257664h;
        if (k0Var != null) {
            Context context2 = k0Var.mo123872b().getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context2;
            Log.m105924i("MicroMsg.WebCanvasContext", "reuseCanvasView:#" + O1.f257660d + XVFSFile.PATH_SEPARATOR_CHAR + k0Var.f257724c + '@' + k0Var.f257725d + " sameContext:" + C87412m.m108589b(mutableContextWrapper.getBaseContext(), getContext()));
            if (!C87412m.m108589b(mutableContextWrapper.getBaseContext(), getContext()) || !C87412m.m108589b(k0Var.mo123872b().getParent(), this)) {
                C61926c.m72668M(new C89544b(mutableContextWrapper, this, k0Var, O1));
            } else {
                O1.mo123851n(k0Var.mo123872b());
            }
        } else {
            C89558k0 k0Var2 = new C89558k0(O1, new MutableContextWrapper(getContext()));
            addView(k0Var2.mo123872b());
            O1.mo123851n(k0Var2.mo123872b());
            O1.f257664h = k0Var2;
            k0Var2.mo123871a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo118071c() {
        /*
            r4 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r0 = r4.getLogicEngine()
            java.lang.String r1 = r4.getCanvasId()
            r0.getClass()
            java.lang.String r2 = "canvasId"
            gy3.C87412m.m108594g(r1, r2)
            q73.w r0 = r0.mo118087S1()
            q73.a r0 = r0.mo123884Q1(r1)
            if (r0 == 0) goto L_0x001d
            float[] r0 = r0.f257668o
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x004c
            com.tencent.mm.storage.o0 r0 = r4.f247951g
            if (r0 == 0) goto L_0x0047
            java.lang.String r3 = r0.mo25764n2()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            org.json.JSONObject r0 = r0.f55534s1
            if (r0 != 0) goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0043
        L_0x0037:
            java.lang.String r3 = "video_info"
            java.lang.String r0 = r0.optString(r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r0 = r0 ^ r1
        L_0x0043:
            if (r0 != r1) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            java.lang.String r0 = r4.f247950f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isVideoCard = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r3 = r4.getCanvasId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardCanvasView.mo118071c():boolean");
    }

    public final C19623o0 getInfo() {
        return this.f247951g;
    }

    public C89547f getJsEngine() {
        return this.f247953i;
    }

    public final float[] getVideoRelativePos() {
        BizTLRecCardJsEngine logicEngine = getLogicEngine();
        String canvasId = getCanvasId();
        logicEngine.getClass();
        C87412m.m108594g(canvasId, "canvasId");
        C89538a Q1 = logicEngine.mo118087S1().mo123884Q1(canvasId);
        float[] fArr = Q1 != null ? Q1.f257668o : null;
        return fArr == null ? new float[]{0.0f, 0.0f} : fArr;
    }

    public final int getVideoStatus() {
        return this.f247952h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        C89562n nVar = context instanceof C89562n ? (C89562n) context : null;
        if (nVar != null) {
            nVar.mo22787Q6(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f247954j) {
            this.f247954j = true;
            C89547f.m111945Y1(getJsEngine(), getCanvasId(), 0, 2, (Object) null);
            String str = this.f247950f;
            Log.m105918d(str, "CanvasView onConfigurationChanged before:[" + getMeasuredWidth() + ", " + getMeasuredHeight() + ']');
            getViewTreeObserver().addOnGlobalLayoutListener(new C85097a(this));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        C89562n nVar = context instanceof C89562n ? (C89562n) context : null;
        if (nVar != null) {
            nVar.mo22790t7(this);
        }
        if (this.f247952h == 1) {
            getLogicEngine().mo118092a2(getCanvasId());
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        BizTLRecCardJsEngine logicEngine = getLogicEngine();
        String canvasId = getCanvasId();
        logicEngine.getClass();
        C87412m.m108594g(canvasId, "canvasId");
        C89547f.m111944P1(logicEngine, "scroll", canvasId, (ValueCallback) null, 4, (Object) null);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public final void setBizTimeLineInfo(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "bizTimeLineInfo");
        getLogicEngine().f247966N = o0Var;
        this.f247951g = o0Var;
    }

    public final void setDoingConfigurationChanged(boolean z) {
        this.f247954j = z;
    }

    public final void setInfo(C19623o0 o0Var) {
        this.f247951g = o0Var;
    }

    public final void setVideoCard(boolean z) {
    }

    public final void setVideoStatus(int i) {
        this.f247952h = i;
        String str = this.f247950f;
        Log.m105918d(str, "set videoStatus = " + i + ", " + getCanvasId());
        if (i == 1) {
            BizTLRecCardJsEngine logicEngine = getLogicEngine();
            String canvasId = getCanvasId();
            logicEngine.getClass();
            C87412m.m108594g(canvasId, "canvasId");
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "enterHotZone #" + canvasId);
            C89567w.m111980P1(logicEngine.mo118087S1(), "enterHotZone", canvasId, (ValueCallback) null, 4, (Object) null);
            C89538a Q1 = logicEngine.mo118087S1().mo123884Q1(canvasId);
            if (Q1 != null) {
                Q1.f257669p = true;
                return;
            }
            return;
        }
        getLogicEngine().mo118092a2(getCanvasId());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizTLRecCardCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f247950f = "MicroMsg.BizTLRecCardCanvasView:" + hashCode();
        this.f247953i = getLogicEngine();
    }
}
