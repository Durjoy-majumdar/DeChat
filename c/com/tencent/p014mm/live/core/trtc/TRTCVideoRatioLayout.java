package com.tencent.p014mm.live.core.trtc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.ratio.RatioLayout;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import sx3.C110818d0;
import u50.C65212a;
import u50.C65213b;
import u50.C65214c;
import u50.C65215d;
import v50.C65548b;
import v50.C65549c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ*\u0010\u0010\u001a\u00020\u00052\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000e¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "Lcom/tencent/mm/view/ratio/RatioLayout;", "Lu50/b;", "Lu50/a;", "callback", "Lrx3/b0;", "setPluginCallback", "Landroid/view/TextureView;", "getCameraView", "Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout$a;", "getCameraLayout", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "radiusMap", "setPreviewCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout */
public final class TRTCVideoRatioLayout extends RatioLayout implements C65213b {

    /* renamed from: h */
    public final C55206a f157123h;

    /* renamed from: i */
    public C65212a f157124i;

    /* renamed from: j */
    public final HashMap<String, C55207b> f157125j = new HashMap<>();

    /* renamed from: n */
    public final C65214c f157126n;

    /* renamed from: o */
    public final C65549c f157127o;

    /* renamed from: p */
    public boolean f157128p;

    /* renamed from: com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout$a */
    public static final class C55206a extends RoundCornerRelativeLayout {

        /* renamed from: f */
        public final TextureView f157129f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55206a(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            TextureView textureView = new TextureView(context);
            this.f157129f = textureView;
            addView(textureView, new ViewGroup.LayoutParams(-1, -1));
        }

        public final TextureView getCameraView() {
            return this.f157129f;
        }
    }

    /* renamed from: com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout$b */
    public static final class C55207b extends RoundCornerRelativeLayout {

        /* renamed from: f */
        public final TXCloudVideoView f157130f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55207b(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(context);
            this.f157130f = tXCloudVideoView;
            addView(tXCloudVideoView, new ViewGroup.LayoutParams(-1, -1));
        }

        public final TXCloudVideoView getVideoView() {
            return this.f157130f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TRTCVideoRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f157123h = new C55206a(context2);
        C65214c cVar = new C65214c(this);
        this.f157126n = cVar;
        C65549c cVar2 = new C65549c();
        this.f157127o = cVar2;
        setAdapter(cVar);
        setLayoutManager(cVar2);
        post(new C65215d(this));
    }

    /* renamed from: a */
    public void mo76401a() {
        LinkedList<C65548b> linkedList = this.f157127o.f188595c;
        Log.m105924i("TRTCVideoRatioLayout", "clearCacheVideoView size: " + this.f157125j.size() + " holderSize: " + linkedList.size());
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (((C65548b) next).f188594b instanceof C55207b) {
                arrayList.add(next);
            }
        }
        linkedList.removeAll(C110818d0.m150904D0(arrayList));
        for (Map.Entry next2 : this.f157125j.entrySet()) {
            if (((C55207b) next2.getValue()).getParent() != null) {
                ViewParent parent = ((C55207b) next2.getValue()).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView((View) next2.getValue());
                }
            }
        }
        this.f157125j.clear();
    }

    /* renamed from: b */
    public View mo76402b(String str) {
        C87412m.m108594g(str, "sdkUserId");
        C65212a aVar = this.f157124i;
        return (C87412m.m108589b(aVar != null ? aVar.mo87795P() : null, str) || C87412m.m108589b(str, "DEFAULT_ANCHOR_USER_ID")) ? this.f157123h : mo76403d(str, 0);
    }

    /* renamed from: d */
    public final C55207b mo76403d(String str, int i) {
        C87412m.m108594g(str, "userId");
        C55207b bVar = this.f157125j.get(str);
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C55207b bVar2 = new C55207b(context);
        this.f157125j.put(str, bVar2);
        return bVar2;
    }

    public final C55206a getCameraLayout() {
        return this.f157123h;
    }

    public final TextureView getCameraView() {
        return this.f157123h.getCameraView();
    }

    public final void setPluginCallback(C65212a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f157124i = aVar;
        C65549c cVar = this.f157127o;
        cVar.getClass();
        cVar.f188596d = aVar;
    }

    public final void setPreviewCornerRadius(LinkedHashMap<String, Float> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "radiusMap");
        C65549c cVar = this.f157127o;
        cVar.getClass();
        for (C65548b bVar : cVar.f188595c) {
            Float f = linkedHashMap.get(bVar.f188593a.f188591a);
            if (f == null) {
                f = Float.valueOf(0.0f);
            }
            C87412m.m108593f(f, "radiusMap[it.data.sdkUserId] ?: 0.0f");
            float floatValue = f.floatValue();
            View view = bVar.f188594b;
            RoundCornerRelativeLayout roundCornerRelativeLayout = view instanceof RoundCornerRelativeLayout ? (RoundCornerRelativeLayout) view : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setRadius(floatValue);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TRTCVideoRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f157123h = new C55206a(context2);
        C65214c cVar = new C65214c(this);
        this.f157126n = cVar;
        C65549c cVar2 = new C65549c();
        this.f157127o = cVar2;
        setAdapter(cVar);
        setLayoutManager(cVar2);
        post(new C65215d(this));
    }
}
