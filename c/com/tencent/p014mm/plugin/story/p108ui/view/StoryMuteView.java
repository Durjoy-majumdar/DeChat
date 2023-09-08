package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.story.api.AbsStoryMuteView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMuteView;", "Lcom/tencent/mm/plugin/story/api/AbsStoryMuteView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMuteView */
public final class StoryMuteView extends AbsStoryMuteView {

    /* renamed from: d */
    public final int f206330d = 30;

    /* renamed from: e */
    public Drawable f206331e;

    /* renamed from: f */
    public TextView f206332f;

    /* renamed from: g */
    public ImageView f206333g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMuteView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo98125c();
    }

    /* renamed from: a */
    public void mo98082a() {
        ImageView imageView = this.f206333g;
        if (imageView != null) {
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public void mo98083b() {
        ImageView imageView = this.f206333g;
        if (imageView != null) {
            int i = this.f206330d;
            imageView.setPadding(0, i, i, 0);
        }
    }

    /* renamed from: c */
    public final void mo98125c() {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c7a, this);
        this.f206332f = (TextView) findViewById(C0966R.C0970id.k8i);
        this.f206333g = (ImageView) findViewById(C0966R.C0970id.k8h);
        Drawable drawable = getContext().getResources().getDrawable(C0966R.raw.icons_outlined_volume_off);
        C74933u4.m89769f(drawable, -1);
        this.f206331e = drawable;
        C87412m.m108591d(drawable);
        drawable.setBounds(0, 0, C76577a.m92151b(getContext(), 48), C76577a.m92151b(getContext(), 48));
        TextView textView = this.f206332f;
        if (textView != null) {
            textView.setCompoundDrawables((Drawable) null, this.f206331e, (Drawable) null, (Drawable) null);
        }
        TextView textView2 = this.f206332f;
        if (textView2 != null) {
            textView2.setText(getContext().getResources().getString(C0966R.string.f361419jr1));
        }
        ImageView imageView = this.f206333g;
        if (imageView != null) {
            int i = this.f206330d;
            imageView.setPadding(0, i, i, 0);
        }
    }

    public void onMeasure(int i, int i2) {
        int f = C76577a.m92155f(getContext(), C0966R.dimen.akg);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            f = Math.min(f, size);
        } else if (mode == 1073741824) {
            f = size;
        }
        int f2 = C76577a.m92155f(getContext(), C0966R.dimen.akg);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            f2 = Math.min(f2, size2);
        } else if (mode2 == 1073741824) {
            f2 = size2;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMuteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo98125c();
    }

    public StoryMuteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98125c();
    }
}
