package com.tencent.p014mm.plugin.emojicapture.p841ui.capture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rh3.C101383g;
import sh3.C101624e;
import sh3.C101630j;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame;", "Landroid/widget/FrameLayout;", "", "selected", "Lrx3/b0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame */
public final class StickerSelectFrame extends FrameLayout {

    /* renamed from: d */
    public final int f269312d;

    /* renamed from: e */
    public final int f269313e;

    /* renamed from: f */
    public final View f269314f;

    /* renamed from: g */
    public final View f269315g;

    /* renamed from: h */
    public String f269316h;

    /* renamed from: i */
    public final C93329a f269317i;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame$a */
    public static final class C93329a implements C65231j<C101630j> {

        /* renamed from: a */
        public final /* synthetic */ StickerSelectFrame f269318a;

        public C93329a(StickerSelectFrame stickerSelectFrame) {
            this.f269318a = stickerSelectFrame;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            if (C87412m.m108589b(jVar.f297495f.f284101e, this.f269318a.f269316h)) {
                StickerSelectFrame stickerSelectFrame = this.f269318a;
                stickerSelectFrame.getClass();
                if (nVar == C65234n.OK) {
                    stickerSelectFrame.f269314f.setBackgroundResource(stickerSelectFrame.f269313e);
                    View view = stickerSelectFrame.f269315g;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                stickerSelectFrame.f269314f.setBackgroundResource(stickerSelectFrame.f269312d);
                View view3 = stickerSelectFrame.f269315g;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerSelectFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269312d = C0966R.C0969drawable.emoji_sticker_select_frame_loading;
        this.f269313e = C0966R.C0969drawable.emoji_sticker_select_frame;
        this.f269317i = new C93329a(this);
        View.inflate(context, C0966R.C0971layout.a2d, this);
        View findViewById = findViewById(C0966R.C0970id.chq);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_sticker_select_frame)");
        this.f269314f = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.chr);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_sticker_select_loading)");
        this.f269315g = findViewById2;
    }

    /* renamed from: a */
    public final void mo128089a(String str) {
        this.f269316h = str;
        if (str == null || str.length() == 0) {
            this.f269314f.setBackgroundResource(this.f269313e);
            View view = this.f269315g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C101624e eVar = C101624e.f297484a;
        C87412m.m108594g(str, "lensId");
        if (C101383g.f296975l.mo140867a(eVar.mo141085b(str))) {
            this.f269314f.setBackgroundResource(this.f269313e);
            View view3 = this.f269315g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f269314f.setBackgroundResource(this.f269312d);
        View view5 = this.f269315g;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C101624e.f297484a.mo141089f(this.f269317i);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (!z) {
            C101624e.f297484a.mo141089f(this.f269317i);
            setVisibility(8);
            return;
        }
        C101624e.f297484a.mo141088e(this.f269317i);
        setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerSelectFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
