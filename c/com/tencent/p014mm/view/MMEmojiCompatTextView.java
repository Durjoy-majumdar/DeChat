package com.tencent.p014mm.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import ql3.C101206a;
import ql3.C77363b;
import ql3.C77364c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/view/MMEmojiCompatTextView;", "Landroid/widget/TextView;", "Lql3/b;", "getEmojiTextViewProcessor", "", "getSizePx", "", "Landroid/text/InputFilter;", "filters", "Lrx3/b0;", "setFilters", "([Landroid/text/InputFilter;)V", "", "allCaps", "setAllCaps", "", "emojiTextProcessType", "setEmojiTextProcessType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.MMEmojiCompatTextView */
public final class MMEmojiCompatTextView extends TextView {

    /* renamed from: d */
    public C77363b f220857d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMEmojiCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final C77363b getEmojiTextViewProcessor() {
        if (this.f220857d == null) {
            float sizePx = getSizePx();
            Context context = getContext();
            C87412m.m108593f(context, "context");
            this.f220857d = new C77363b(this, sizePx, context);
        }
        C77363b bVar = this.f220857d;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.ui.emoji.replace.EmojiTextProcessor");
        return bVar;
    }

    private final float getSizePx() {
        return (getTextSize() * C76577a.m92165p(getContext())) / C76577a.m92156g(getContext());
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C77363b emojiTextViewProcessor = getEmojiTextViewProcessor();
        if (z) {
            TransformationMethod transformationMethod = emojiTextViewProcessor.f225564a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                TextView textView = emojiTextViewProcessor.f225564a;
                C77364c cVar = transformationMethod instanceof C77364c ? (C77364c) transformationMethod : null;
                if (cVar == null) {
                    cVar = new C77364c(transformationMethod, emojiTextViewProcessor.f225565b, emojiTextViewProcessor.f225566c);
                }
                textView.setTransformationMethod(cVar);
                return;
            }
            return;
        }
        emojiTextViewProcessor.getClass();
    }

    public final void setEmojiTextProcessType(int i) {
        InputFilter[] filters = getEmojiTextViewProcessor().f225564a.getFilters();
        C87412m.m108593f(filters, "filters");
        for (InputFilter inputFilter : filters) {
            if (inputFilter instanceof C101206a) {
                C101206a aVar = (C101206a) inputFilter;
                aVar.f296343e = i;
                aVar.f296344f = true;
                return;
            }
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        C87412m.m108594g(inputFilterArr, "filters");
        C77363b emojiTextViewProcessor = getEmojiTextViewProcessor();
        emojiTextViewProcessor.getClass();
        int length = inputFilterArr.length;
        int length2 = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = emojiTextViewProcessor.f225567d;
                inputFilterArr = inputFilterArr2;
                break;
            } else if (inputFilterArr[i] instanceof C101206a) {
                break;
            } else {
                i++;
            }
        }
        super.setFilters(inputFilterArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMEmojiCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
