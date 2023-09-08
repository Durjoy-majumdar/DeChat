package com.tencent.p014mm.p136ui.chatting.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0002@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/component/TranslateControllerView;", "Landroid/widget/LinearLayout;", "", "lan", "Lrx3/b0;", "setLanguageText", "", "value", "g", "I", "setTargetLanTvOriginWidth", "(I)V", "targetLanTvOriginWidth", "Landroid/animation/ValueAnimator;", "h", "Lrx3/g;", "getAnim", "()Landroid/animation/ValueAnimator;", "anim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.component.TranslateControllerView */
public final class TranslateControllerView extends LinearLayout {

    /* renamed from: d */
    public final TextView f215706d;

    /* renamed from: e */
    public final String f215707e;

    /* renamed from: f */
    public int f215708f;

    /* renamed from: g */
    public int f215709g;

    /* renamed from: h */
    public final C13601g f215710h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TranslateControllerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final ValueAnimator getAnim() {
        return (ValueAnimator) ((C36570n) this.f215710h).getValue();
    }

    private final void setTargetLanTvOriginWidth(int i) {
        this.f215709g = i;
    }

    /* renamed from: a */
    public final void mo102317a(int i, int i2) {
        getAnim().cancel();
        getAnim().setIntValues(new int[]{i, i2});
        getAnim().start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r0.getPaint();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLanguageText(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "lan"
            gy3.C87412m.m108594g(r3, r0)
            android.widget.TextView r0 = r2.f215706d
            if (r0 != 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r0.setText(r3)
        L_0x000d:
            android.widget.TextView r0 = r2.f215706d
            if (r0 == 0) goto L_0x001d
            android.text.TextPaint r0 = r0.getPaint()
            if (r0 == 0) goto L_0x001d
            float r3 = r0.measureText(r3)
            int r3 = (int) r3
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            r2.setTargetLanTvOriginWidth(r3)
            int r3 = r2.f215708f
            int r0 = r2.f215709g
            r2.mo102317a(r3, r0)
            java.lang.String r3 = r2.f215707e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setLanguageText: setTarget"
            r0.append(r1)
            int r1 = r2.f215709g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TranslateControllerView.setLanguageText(java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslateControllerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        this.f215707e = "TranslateControllerView";
        this.f215710h = C36568h.m40985a(new C73508j5(this));
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6848q7, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.b4x);
        this.f215706d = (TextView) findViewById(C0966R.C0970id.b4z);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.b4w);
    }
}
