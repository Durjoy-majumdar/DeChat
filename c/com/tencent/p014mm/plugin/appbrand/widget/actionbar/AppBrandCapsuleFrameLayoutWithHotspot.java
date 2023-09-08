package com.tencent.p014mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import bt0.C79814h;
import com.tencent.p014mm.C0966R;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ny3.C89104m;
import p225rc.C89918i;
import p385u2.C111105a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandCapsuleFrameLayoutWithHotspot;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleFrameLayoutWithHotspot */
public final class AppBrandCapsuleFrameLayoutWithHotspot extends FrameLayout {

    /* renamed from: g */
    public static final C84919a f247509g = new C84919a();

    /* renamed from: h */
    public static final C89918i<Boolean> f247510h = new C89918i<>(Boolean.FALSE);

    /* renamed from: d */
    public List<TouchDelegate> f247511d;

    /* renamed from: e */
    public List<Rect> f247512e;

    /* renamed from: f */
    public boolean f247513f = true;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleFrameLayoutWithHotspot$a */
    public static final class C84919a {

        /* renamed from: a */
        public static final /* synthetic */ C89104m<Object>[] f247514a = {C24560g0.m30726b(new C24570s(C84919a.class, "isDebugEnable", "isDebugEnable()Z", 0))};

        /* renamed from: a */
        public final boolean mo117726a() {
            return AppBrandCapsuleFrameLayoutWithHotspot.f247510h.mo124238b(this, f247514a[0]).booleanValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleFrameLayoutWithHotspot$b */
    public static final class C84920b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCapsuleFrameLayoutWithHotspot f247515d;

        public C84920b(AppBrandCapsuleFrameLayoutWithHotspot appBrandCapsuleFrameLayoutWithHotspot) {
            this.f247515d = appBrandCapsuleFrameLayoutWithHotspot;
        }

        public final void run() {
            AppBrandCapsuleFrameLayoutWithHotspot appBrandCapsuleFrameLayoutWithHotspot = this.f247515d;
            C84919a aVar = AppBrandCapsuleFrameLayoutWithHotspot.f247509g;
            appBrandCapsuleFrameLayoutWithHotspot.mo117722a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandCapsuleFrameLayoutWithHotspot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        if (f247509g.mo117726a()) {
            setWillNotDraw(false);
            post(new C79814h(this));
        }
    }

    /* renamed from: a */
    public final void mo117722a() {
        if (this.f247513f) {
            this.f247513f = false;
            View findViewById = findViewById(C0966R.C0970id.f5447fd);
            View findViewById2 = findViewById(C0966R.C0970id.f5446fc);
            View findViewById3 = findViewById(C0966R.C0970id.f5443f_);
            if (findViewById != null && findViewById2 != null && findViewById3 != null) {
                Rect rect = new Rect();
                getHitRect(rect);
                Rect rect2 = new Rect();
                findViewById3.getHitRect(rect2);
                Rect rect3 = new Rect();
                findViewById.getHitRect(rect3);
                Rect rect4 = new Rect();
                findViewById2.getHitRect(rect4);
                rect4.offset(rect2.left, rect2.top);
                rect3.offset(rect2.left, rect2.top);
                int i = rect.right;
                int i2 = rect2.right;
                int i3 = i - i2;
                int i4 = rect2.top;
                int i5 = i4 - rect.top;
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                int i8 = i6 - i7;
                if (i3 > 0) {
                    rect2.left -= i3;
                    rect2.right = i2 + i3;
                    rect3.left -= i3;
                    rect4.right += i3;
                }
                if (i8 > 0) {
                    rect2.bottom = i7 + i8;
                    rect3.bottom += i8;
                    rect4.bottom += i8;
                }
                if (i5 > 0) {
                    rect2.top = i4 - i5;
                    rect3.top -= i5;
                    rect4.top -= i5;
                }
                if (this.f247511d == null) {
                    this.f247511d = new ArrayList();
                    if (f247509g.mo117726a()) {
                        this.f247512e = new ArrayList();
                    }
                }
                if (f247509g.mo117726a()) {
                    List<Rect> list = this.f247512e;
                    C87412m.m108591d(list);
                    list.add(new Rect(rect3));
                    List<Rect> list2 = this.f247512e;
                    C87412m.m108591d(list2);
                    list2.add(new Rect(rect4));
                    invalidate();
                }
                List<TouchDelegate> list3 = this.f247511d;
                C87412m.m108591d(list3);
                list3.add(new TouchDelegate(rect3, findViewById));
                List<TouchDelegate> list4 = this.f247511d;
                C87412m.m108591d(list4);
                list4.add(new TouchDelegate(rect4, findViewById2));
            }
        }
    }

    public void onDraw(Canvas canvas) {
        List<Rect> list;
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        if (f247509g.mo117726a() && (list = this.f247512e) != null) {
            for (Rect clipRect : list) {
                canvas.save();
                canvas.clipRect(clipRect);
                canvas.drawColor(C111105a.m151500b(getContext(), C0966R.color.f357003al1));
                canvas.restore();
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f247513f = true;
            List<TouchDelegate> list = this.f247511d;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            if (f247509g.mo117726a()) {
                List<Rect> list2 = this.f247512e;
                if (list2 != null) {
                    ((ArrayList) list2).clear();
                    C13598b0 b0Var = C13598b0.f38549a;
                    invalidate();
                }
                post(new C84920b(this));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            return onTouchEvent;
        }
        mo117722a();
        List<TouchDelegate> list = this.f247511d;
        if (list == null) {
            return onTouchEvent;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            if (((TouchDelegate) it.next()).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandCapsuleFrameLayoutWithHotspot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        if (f247509g.mo117726a()) {
            setWillNotDraw(false);
            post(new C79814h(this));
        }
    }
}
