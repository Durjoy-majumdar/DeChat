package com.tencent.p014mm.p136ui.chatting.gallery.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/FullScreenStatusMaskView;", "Landroid/widget/FrameLayout;", "", "message", "Lrx3/b0;", "setMessage", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView */
public final class FullScreenStatusMaskView extends FrameLayout {

    /* renamed from: d */
    public final View f216438d;

    /* renamed from: e */
    public final TextView f216439e;

    /* renamed from: f */
    public final View f216440f;

    /* renamed from: g */
    public final ProgressBar f216441g;

    /* renamed from: h */
    public final WeImageView f216442h;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView$a */
    public static final class C73712a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ FullScreenStatusMaskView f216443d;

        public C73712a(FullScreenStatusMaskView fullScreenStatusMaskView) {
            this.f216443d = fullScreenStatusMaskView;
        }

        public void onGlobalLayout() {
            if (this.f216443d.f216439e.getLineCount() > 1) {
                FullScreenStatusMaskView fullScreenStatusMaskView = this.f216443d;
                fullScreenStatusMaskView.f216439e.setTextSize(0, (float) C76577a.m92157h(fullScreenStatusMaskView.getContext(), C0966R.dimen.f3684bd));
            }
            this.f216443d.f216439e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullScreenStatusMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.clu, this);
        C87412m.m108593f(inflate, "getInflater(getContext()…reen_status_dialog, this)");
        this.f216438d = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.m1w);
        C87412m.m108593f(findViewById, "contentView.findViewById….full_screen_status_text)");
        TextView textView = (TextView) findViewById;
        this.f216439e = textView;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.l4y);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.video_close_btn)");
        this.f216440f = findViewById2;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C73712a(this));
        View findViewById3 = inflate.findViewById(C0966R.C0970id.m1v);
        C87412m.m108593f(findViewById3, "contentView.findViewById…l_screen_status_progress)");
        this.f216441g = (ProgressBar) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.m1u);
        C87412m.m108593f(findViewById4, "contentView.findViewById….full_screen_status_icon)");
        this.f216442h = (WeImageView) findViewById4;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setMessage(CharSequence charSequence) {
        this.f216439e.setText(charSequence);
    }
}
