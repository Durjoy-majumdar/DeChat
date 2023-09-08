package com.tencent.p014mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$e;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import my3.C61595o;
import p585kl.C99147e;
import p849e3.C107168a0;
import p849e3.C107207u;
import vd3.C78405p;
import zp3.C103055g;
import zp3.C103061i;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/view/EmojiPanelSlideIndicatorView;", "Landroid/widget/FrameLayout;", "Lzp3/g$b;", "Lzp3/g;", "value", "d", "Lzp3/g;", "getController", "()Lzp3/g;", "setController", "(Lzp3/g;)V", "controller", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.EmojiPanelSlideIndicatorView */
public final class EmojiPanelSlideIndicatorView extends FrameLayout implements C103055g.C103057b {

    /* renamed from: d */
    public C103055g f285627d;

    /* renamed from: e */
    public boolean f285628e;

    /* renamed from: com.tencent.mm.view.EmojiPanelSlideIndicatorView$a */
    public static final class C97321a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiPanelSlideIndicatorView f285629d;

        public C97321a(EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView) {
            this.f285629d = emojiPanelSlideIndicatorView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C103055g controller = this.f285629d.getController();
            if (controller != null) {
                Log.m105924i("MicroMsg.EmojiPanelDragIndicator", "onClicked");
                C78405p.C78406a aVar = controller.f304050e;
                if (aVar != null) {
                    ((ChatFooter$$e) aVar).mo100520d();
                }
                EmoticonBoardExpandStruct emoticonBoardExpandStruct = new EmoticonBoardExpandStruct();
                emoticonBoardExpandStruct.f265439d = System.currentTimeMillis();
                boolean z = false;
                if (controller.f304064s == 0) {
                    controller.mo142759d(controller.f304061p, 500);
                    emoticonBoardExpandStruct.f265440e = 1;
                } else {
                    controller.mo142759d(0, 500);
                    emoticonBoardExpandStruct.f265440e = 2;
                }
                C99147e eVar = controller.f304065t;
                emoticonBoardExpandStruct.f265441f = ((long) (eVar != null ? eVar.f290703a : 0)) + 1;
                emoticonBoardExpandStruct.mo86054n();
                C78405p.C78406a aVar2 = controller.f304050e;
                if (aVar2 != null) {
                    if (controller.f304064s == controller.f304061p) {
                        z = true;
                    }
                    ((ChatFooter$$e) aVar2).mo100519c(z);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiPanelSlideIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View view = new View(context);
        view.setBackgroundResource(C0966R.C0969drawable.emoji_panel_slidable_indicator);
        addView(view, new FrameLayout.LayoutParams(C79406f.m96347a(context, 44.0f), C79406f.m96347a(context, 4.0f), 17));
        setOnClickListener(new C97321a(this));
        setContentDescription(getResources().getString(C0966R.string.f8058cf));
    }

    /* renamed from: a */
    public void mo136406a() {
        this.f285628e = true;
        setContentDescription(getResources().getString(C0966R.string.f8057c4));
        notifySubtreeAccessibilityStateChanged(this, this, 4);
    }

    /* renamed from: b */
    public void mo136407b() {
        this.f285628e = false;
        setContentDescription(getResources().getString(C0966R.string.f8058cf));
        notifySubtreeAccessibilityStateChanged(this, this, 4);
    }

    public void computeScroll() {
        super.computeScroll();
        C103055g gVar = this.f285627d;
        if (gVar != null) {
            gVar.mo142756a();
        }
    }

    public final C103055g getController() {
        return this.f285627d;
    }

    public boolean isClickable() {
        return true;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(this.f285628e ? C0966R.string.f8057c4 : C0966R.string.f8058cf));
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.addAction(accessibilityAction);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C103055g gVar = this.f285627d;
        if (gVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (gVar.f304061p <= 0) {
            Log.m105928w("MicroMsg.EmojiPanelDragIndicator", "invalid maxExtendedHeight");
            return false;
        }
        if (gVar.f304051f == null) {
            gVar.f304051f = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = gVar.f304051f;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = -((int) (motionEvent.getRawY() - gVar.f304049d));
                    if (!gVar.f304060o && Math.abs(i) > gVar.f304054i) {
                        gVar.f304060o = true;
                        gVar.f304056k = false;
                        C78405p.C78406a aVar = gVar.f304050e;
                        if (aVar != null) {
                            ((ChatFooter$$e) aVar).mo100519c(gVar.f304064s == gVar.f304061p);
                        }
                    }
                    if (!gVar.f304060o) {
                        return true;
                    }
                    gVar.mo142758c(C61595o.m72297e(gVar.f304064s + i, 0, gVar.f304061p));
                    gVar.f304049d = motionEvent.getRawY();
                    C78405p.C78406a aVar2 = gVar.f304050e;
                    if (aVar2 == null) {
                        return true;
                    }
                    ((ChatFooter$$e) aVar2).mo100518b(gVar.f304064s);
                    return true;
                } else if (actionMasked != 3) {
                    return true;
                }
            }
            if (gVar.f304056k) {
                performClick();
            } else if (gVar.f304060o) {
                VelocityTracker velocityTracker2 = gVar.f304051f;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, (float) gVar.f304052g);
                }
                VelocityTracker velocityTracker3 = gVar.f304051f;
                float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity(gVar.f304053h) : 0.0f;
                EmoticonBoardExpandStruct emoticonBoardExpandStruct = new EmoticonBoardExpandStruct();
                float f = ((float) gVar.f304064s) - (yVelocity * 0.1f);
                int i2 = gVar.f304061p;
                if (f < ((float) i2) * 0.5f) {
                    emoticonBoardExpandStruct.f265440e = 4;
                    i2 = 0;
                } else {
                    emoticonBoardExpandStruct.f265440e = 3;
                }
                emoticonBoardExpandStruct.f265439d = System.currentTimeMillis();
                C99147e eVar = gVar.f304065t;
                emoticonBoardExpandStruct.f265441f = ((long) (eVar != null ? eVar.f290703a : 0)) + 1;
                emoticonBoardExpandStruct.mo86054n();
                gVar.mo142759d(i2, 300);
            }
            gVar.f304060o = false;
            VelocityTracker velocityTracker4 = gVar.f304051f;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            gVar.f304051f = null;
            gVar.f304056k = true;
            return true;
        }
        gVar.f304049d = motionEvent.getRawY();
        gVar.f304053h = motionEvent.getPointerId(motionEvent.getActionIndex());
        gVar.f304055j.forceFinished(true);
        View view = gVar.f304048c;
        if (view != null) {
            C103061i iVar = new C103061i(gVar);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, iVar);
        }
        gVar.f304056k = true;
        gVar.f304060o = false;
        return true;
    }

    public final void setController(C103055g gVar) {
        Set<C103055g.C103057b> set;
        Set<C103055g.C103057b> set2;
        C103055g gVar2 = this.f285627d;
        if (!(gVar2 == null || (set2 = gVar2.f304062q) == null)) {
            set2.remove(this);
        }
        this.f285627d = gVar;
        if (!(gVar == null || (set = gVar.f304062q) == null)) {
            set.add(this);
        }
        boolean z = false;
        if (gVar != null && !gVar.f304063r) {
            z = true;
        }
        if (z) {
            mo136406a();
        }
    }
}
