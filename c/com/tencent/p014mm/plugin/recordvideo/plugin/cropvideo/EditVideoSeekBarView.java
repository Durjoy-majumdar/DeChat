package com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.mmsight.segment.C105476b;
import com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import gy3.C87412m;
import kotlin.Metadata;
import mh2.C99906e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B!\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b+\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@BX\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditVideoSeekBarView;", "Landroid/widget/LinearLayout;", "", "h", "Lrx3/b0;", "setSeekBarHeight", "", "color", "setTextColor", "Lcom/tencent/mm/plugin/mmsight/segment/b;", "listener", "setThumbBarSeekListener", "Landroid/view/View$OnClickListener;", "onClickListener", "setFinishButtonClickListener", "setCancelButtonClickListener", "Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "d", "Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "getRecyclerThumbSeekBar", "()Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;", "setRecyclerThumbSeekBar", "(Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar;)V", "recyclerThumbSeekBar", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "getFinishButton", "()Landroid/widget/Button;", "setFinishButton", "(Landroid/widget/Button;)V", "finishButton", "", "<set-?>", "g", "Z", "getHasInit", "()Z", "hasInit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView */
public final class EditVideoSeekBarView extends LinearLayout {

    /* renamed from: d */
    public RecyclerThumbSeekBar f272945d;

    /* renamed from: e */
    public Button f272946e = ((Button) findViewById(C0966R.C0970id.cb9));

    /* renamed from: f */
    public Button f272947f = ((Button) findViewById(C0966R.C0970id.cbc));

    /* renamed from: g */
    public boolean f272948g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditVideoSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cbt, this, true);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        View findViewById = findViewById(C0966R.C0970id.l7n);
        C87412m.m108593f(findViewById, "findViewById(R.id.video_thumb_seek_bar)");
        this.f272945d = (RecyclerThumbSeekBar) findViewById;
    }

    /* renamed from: a */
    public final void mo129821a(String str, int i, int i2) {
        C87412m.m108594g(str, "path");
        if (!this.f272948g) {
            this.f272948g = true;
            this.f272945d.mo150237f(str);
            VideoTransPara videoTransPara = new VideoTransPara();
            videoTransPara.f267170h = i / 1000;
            videoTransPara.f267171i = i2;
            this.f272945d.setVideoTransPara(videoTransPara);
            this.f272945d.setOnPreparedListener(C99906e.f292753a);
        }
    }

    /* renamed from: b */
    public final void mo129822b() {
        this.f272948g = false;
        this.f272945d.mo150238g();
        ViewParent parent = this.f272945d.getParent();
        if (parent instanceof LinearLayout) {
            ViewGroup.LayoutParams layoutParams = this.f272945d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout linearLayout = (LinearLayout) parent;
            linearLayout.removeView(this.f272945d);
            RecyclerThumbSeekBar recyclerThumbSeekBar = new RecyclerThumbSeekBar(getContext());
            this.f272945d = recyclerThumbSeekBar;
            linearLayout.addView(recyclerThumbSeekBar, 0, (LinearLayout.LayoutParams) layoutParams);
        }
    }

    public final Button getFinishButton() {
        return this.f272947f;
    }

    public final boolean getHasInit() {
        return this.f272948g;
    }

    public final RecyclerThumbSeekBar getRecyclerThumbSeekBar() {
        return this.f272945d;
    }

    public final void setCancelButtonClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        Button button = this.f272946e;
        C87412m.m108591d(button);
        button.setOnClickListener(onClickListener);
    }

    public final void setFinishButton(Button button) {
        this.f272947f = button;
    }

    public final void setFinishButtonClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        Button button = this.f272947f;
        C87412m.m108591d(button);
        button.setOnClickListener(onClickListener);
    }

    public final void setRecyclerThumbSeekBar(RecyclerThumbSeekBar recyclerThumbSeekBar) {
        C87412m.m108594g(recyclerThumbSeekBar, "<set-?>");
        this.f272945d = recyclerThumbSeekBar;
    }

    public final void setSeekBarHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f272945d.getLayoutParams();
        layoutParams.height = i;
        this.f272945d.setLayoutParams(layoutParams);
    }

    public final void setTextColor(String str) {
        if (str != null) {
            Button button = this.f272947f;
            C87412m.m108591d(button);
            button.setTextColor(Color.parseColor(str));
        }
    }

    public final void setThumbBarSeekListener(C105476b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f272945d.setThumbBarSeekListener(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditVideoSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cbt, this, true);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        View findViewById = findViewById(C0966R.C0970id.l7n);
        C87412m.m108593f(findViewById, "findViewById(R.id.video_thumb_seek_bar)");
        this.f272945d = (RecyclerThumbSeekBar) findViewById;
    }
}
