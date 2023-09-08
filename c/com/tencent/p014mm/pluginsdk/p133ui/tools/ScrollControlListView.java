package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001d\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/q0;", "", "getHasControlMoveDown", "result", "Lrx3/b0;", "setHasControlMoveDown", "", "getExtraScrollDistance", "extraScrollDistance", "setExtraScrollDistance", "", "f", "F", "getMFirstY", "()F", "setMFirstY", "(F)V", "mFirstY", "g", "I", "getLastFirstVisiblePos", "()I", "setLastFirstVisiblePos", "(I)V", "lastFirstVisiblePos", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView */
public class ScrollControlListView extends ChattingListView implements C72923q0 {

    /* renamed from: i */
    public static final /* synthetic */ int f212502i = 0;

    /* renamed from: e */
    public boolean f212503e;

    /* renamed from: f */
    public float f212504f;

    /* renamed from: g */
    public int f212505g;

    /* renamed from: h */
    public int f212506h;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView$a */
    public static final class C72913a {
        public C72913a(C8480h hVar) {
        }
    }

    static {
        new C72913a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollControlListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void addFooterView(View view, Object obj, boolean z) {
        super.addFooterView(view, obj, z);
    }

    public void addHeaderView(View view, Object obj, boolean z) {
        super.addHeaderView(view, obj, z);
    }

    /* renamed from: b */
    public int mo100789b(int i) {
        return 0;
    }

    public int getExtraScrollDistance() {
        return this.f212506h;
    }

    public boolean getHasControlMoveDown() {
        return this.f212503e;
    }

    public final int getLastFirstVisiblePos() {
        return this.f212505g;
    }

    public final float getMFirstY() {
        return this.f212504f;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f212505g > getFirstVisiblePosition()) {
            this.f212503e = true;
        }
        this.f212505g = getFirstVisiblePosition();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f212504f = motionEvent.getY();
        } else if (action == 2 && motionEvent.getY() - this.f212504f > 0.0f) {
            this.f212503e = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExtraScrollDistance(int i) {
        this.f212506h = i;
    }

    public void setHasControlMoveDown(boolean z) {
        this.f212503e = z;
    }

    public final void setLastFirstVisiblePos(int i) {
        this.f212505g = i;
    }

    public final void setMFirstY(float f) {
        this.f212504f = f;
    }
}
