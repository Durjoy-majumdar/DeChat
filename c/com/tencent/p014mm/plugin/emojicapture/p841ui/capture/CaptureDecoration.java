package com.tencent.p014mm.plugin.emojicapture.p841ui.capture;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView;
import com.tencent.p014mm.sticker.p1079ui.view.CaptureStickerHint;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import e71.C97607d;
import gy3.C87412m;
import kotlin.Metadata;
import my3.C34690i;
import my3.C61594j;
import rh3.C101383g;
import sx3.C36904l0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "Lrx3/b0;", "setImitateEmoji", "Lrh3/g;", "stickerInfo", "setStickerInfo", "", "getText", "", "getTextColor", "getAttachEmoji", "Landroid/graphics/Matrix;", "getAttachEmojiMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration */
public final class CaptureDecoration extends ConstraintLayout {

    /* renamed from: A */
    public EmojiInfo f269260A;

    /* renamed from: B */
    public C101383g f269261B;

    /* renamed from: v */
    public final EditorItemContainer f269262v;

    /* renamed from: w */
    public final FontAnimTextView f269263w;

    /* renamed from: x */
    public final CaptureStickerHint f269264x;

    /* renamed from: y */
    public final View f269265y;

    /* renamed from: z */
    public EmojiEditorItemView f269266z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureDecoration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.a15, this);
        View findViewById = findViewById(C0966R.C0970id.ce_);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_…re_editor_item_container)");
        EditorItemContainer editorItemContainer = (EditorItemContainer) findViewById;
        this.f269262v = editorItemContainer;
        View findViewById2 = findViewById(C0966R.C0970id.cew);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_capture_text_hint)");
        this.f269263w = (FontAnimTextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.cen);
        C87412m.m108593f(findViewById3, "findViewById(R.id.emoji_capture_sticker_hint)");
        this.f269264x = (CaptureStickerHint) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.cee);
        C87412m.m108593f(findViewById4, "findViewById(R.id.emoji_capture_editor_valid_area)");
        this.f269265y = findViewById4;
        editorItemContainer.setDeleteEnalbe(false);
    }

    public final EmojiInfo getAttachEmoji() {
        return this.f269260A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = r2.getTouchMatrix();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix getAttachEmojiMatrix() {
        /*
            r4 = this;
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r4.f269262v
            java.util.List r0 = r0.getAllItemViews()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            r3 = r1
            h71.c r3 = (h71.C98318c) r3
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView
            if (r3 == 0) goto L_0x000a
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            boolean r0 = r1 instanceof com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView
            if (r0 == 0) goto L_0x0025
            r2 = r1
            com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView r2 = (com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView) r2
        L_0x0025:
            if (r2 == 0) goto L_0x002d
            android.graphics.Matrix r0 = r2.getTouchMatrix()
            if (r0 != 0) goto L_0x0032
        L_0x002d:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureDecoration.getAttachEmojiMatrix():android.graphics.Matrix");
    }

    public final String getText() {
        CharSequence text = this.f269263w.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final int getTextColor() {
        int textColor = this.f269263w.getTextColor();
        if (textColor == 0) {
            return -1;
        }
        int[] iArr = C97607d.f286337a;
        int i = iArr[0];
        int red = Color.red(textColor) - Color.red(i);
        int green = Color.green(textColor) - Color.green(i);
        int blue = Color.blue(textColor) - Color.blue(i);
        double sqrt = Math.sqrt((double) ((red * red) + (green * green) + (blue * blue)));
        C36904l0 i2 = new C61594j(1, 6).iterator();
        while (((C34690i) i2).f93287f) {
            int i3 = iArr[i2.mo59695a()];
            int red2 = Color.red(textColor) - Color.red(i3);
            int green2 = Color.green(textColor) - Color.green(i3);
            int blue2 = Color.blue(textColor) - Color.blue(i3);
            double sqrt2 = Math.sqrt((double) ((red2 * red2) + (green2 * green2) + (blue2 * blue2)));
            if (Double.compare(sqrt, sqrt2) > 0) {
                i = i3;
                sqrt = sqrt2;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets == null) {
            WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            C87412m.m108593f(onApplyWindowInsets, "super.onApplyWindowInsets(insets)");
            return onApplyWindowInsets;
        }
        ViewGroup.LayoutParams layoutParams = this.f269265y.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.ajp) + windowInsets.getSystemWindowInsetTop();
            this.f269265y.setLayoutParams(marginLayoutParams);
        }
        WindowInsets onApplyWindowInsets2 = super.onApplyWindowInsets(windowInsets);
        C87412m.m108593f(onApplyWindowInsets2, "super.onApplyWindowInsets(insets)");
        return onApplyWindowInsets2;
    }

    public final void setImitateEmoji(EmojiInfo emojiInfo) {
        this.f269260A = emojiInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (gy3.C87412m.m108589b(r0.f296976a, r12 != null ? r12.f296976a : null) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStickerInfo(rh3.C101383g r12) {
        /*
            r11 = this;
            rh3.g r0 = r11.f269261B
            r1 = -1
            r2 = 0
            r3 = 16
            java.lang.String r4 = "#"
            r5 = 8
            r6 = 0
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.f296976a
            if (r12 == 0) goto L_0x0016
            java.lang.String r8 = r12.f296976a
            goto L_0x0017
        L_0x0016:
            r8 = r6
        L_0x0017:
            boolean r0 = gy3.C87412m.m108589b(r0, r8)
            if (r0 != 0) goto L_0x00a3
        L_0x001d:
            r11.f269261B = r12
            com.tencent.mm.sticker.ui.view.CaptureStickerHint r0 = r11.f269264x
            r0.setVisibility(r5)
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r11.f269262v
            r0.setVisibility(r5)
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r0 = r11.f269263w
            r0.setVisibility(r5)
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r0 = r11.f269263w
            java.lang.Runnable r8 = r0.f312570g
            r0.removeCallbacks(r8)
            if (r12 == 0) goto L_0x00a3
            java.lang.String r0 = r12.f296979d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x004e
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r0 = r11.f269263w
            int r8 = e71.C97607d.m125781a(r7)
            r0.mo149567c(r6, r7, r8)
            goto L_0x009e
        L_0x004e:
            java.lang.String r0 = r12.f296980e
            java.lang.String r8 = r12.f296981f
            boolean r9 = z04.C112551y.m153811k(r0)
            if (r9 != 0) goto L_0x0070
            boolean r9 = z04.C112551y.m153819s(r0, r4, r2)
            if (r9 == 0) goto L_0x0063
            int r0 = android.graphics.Color.parseColor(r0)
            goto L_0x0071
        L_0x0063:
            z04.C66713a.m78712a(r3)     // Catch:{ Exception -> 0x006d }
            int r0 = java.lang.Integer.parseInt(r0, r3)     // Catch:{ Exception -> 0x006d }
            r0 = r0 & r1
            r0 = r0 | r7
            goto L_0x0071
        L_0x006d:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = -1
        L_0x0071:
            boolean r9 = z04.C112551y.m153811k(r8)
            if (r9 != 0) goto L_0x008e
            boolean r9 = z04.C112551y.m153819s(r8, r4, r2)
            if (r9 == 0) goto L_0x0082
            int r8 = android.graphics.Color.parseColor(r8)
            goto L_0x0092
        L_0x0082:
            z04.C66713a.m78712a(r3)     // Catch:{ Exception -> 0x008c }
            int r8 = java.lang.Integer.parseInt(r8, r3)     // Catch:{ Exception -> 0x008c }
            r8 = r8 & r1
            r8 = r8 | r7
            goto L_0x0092
        L_0x008c:
            r8 = 0
            goto L_0x0092
        L_0x008e:
            int r8 = e71.C97607d.m125781a(r0)
        L_0x0092:
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r9 = r11.f269263w
            r9.setVisibility(r2)
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r9 = r11.f269263w
            java.lang.String r10 = r12.f296979d
            r9.mo149567c(r10, r0, r8)
        L_0x009e:
            com.tencent.mm.sticker.ui.view.CaptureStickerHint r0 = r11.f269264x
            r0.setStickerPack(r12)
        L_0x00a3:
            com.tencent.mm.storage.emotion.EmojiInfo r12 = r11.f269260A
            if (r12 == 0) goto L_0x00ba
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r11.f269262v
            r0.setVisibility(r2)
            com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView r0 = r11.f269266z
            if (r0 != 0) goto L_0x00ba
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r11.f269262v
            g71.d r8 = new g71.d
            r8.<init>(r11, r12)
            r0.mo128122c(r8)
        L_0x00ba:
            rh3.g r12 = r11.f269261B
            if (r12 != 0) goto L_0x013c
            com.tencent.mm.storage.emotion.EmojiInfo r12 = r11.f269260A
            if (r12 == 0) goto L_0x012e
            java.lang.Class<bq.d1> r12 = p008bq.C67305d1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            bq.d1 r12 = (p008bq.C67305d1) r12
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r11.f269260A
            boolean r12 = r12.mo91433yi(r0)
            if (r12 == 0) goto L_0x00eb
            java.lang.Class<z51.g> r12 = z51.C39315g.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            z51.g r12 = (z51.C39315g) r12
            zc3.b r12 = r12.getProvider()
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r11.f269260A
            if (r0 == 0) goto L_0x00e6
            java.lang.String r6 = r0.getMd5()
        L_0x00e6:
            java.lang.String r6 = r12.mo138012T(r6)
            goto L_0x00f1
        L_0x00eb:
            com.tencent.mm.storage.emotion.EmojiInfo r12 = r11.f269260A
            if (r12 == 0) goto L_0x00f1
            java.lang.String r6 = r12.field_attachedText
        L_0x00f1:
            com.tencent.mm.storage.emotion.EmojiInfo r12 = r11.f269260A
            gy3.C87412m.m108591d(r12)
            java.lang.String r12 = r12.field_attachTextColor
            if (r12 != 0) goto L_0x00fb
            goto L_0x0119
        L_0x00fb:
            boolean r0 = z04.C112551y.m153811k(r12)
            if (r0 != 0) goto L_0x0119
            boolean r0 = z04.C112551y.m153819s(r12, r4, r2)
            if (r0 == 0) goto L_0x010d
            int r12 = android.graphics.Color.parseColor(r12)
        L_0x010b:
            r1 = r12
            goto L_0x0119
        L_0x010d:
            z04.C66713a.m78712a(r3)     // Catch:{ Exception -> 0x0117 }
            int r12 = java.lang.Integer.parseInt(r12, r3)     // Catch:{ Exception -> 0x0117 }
            r12 = r12 & r1
            r12 = r12 | r7
            goto L_0x010b
        L_0x0117:
            r1 = 0
        L_0x0119:
            int r12 = e71.C97607d.m125781a(r1)
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r0 = r11.f269263w
            r0.mo149567c(r6, r1, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r12 != 0) goto L_0x013c
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r12 = r11.f269263w
            r12.setVisibility(r2)
            goto L_0x013c
        L_0x012e:
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView r12 = r11.f269263w
            int r0 = e71.C97607d.m125781a(r7)
            r12.mo149567c(r6, r7, r0)
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r12 = r11.f269262v
            r12.setVisibility(r5)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureDecoration.setStickerInfo(rh3.g):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureDecoration(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
