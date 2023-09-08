package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/PrefixEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", "text", "Lrx3/b0;", "setTextWithNoTextWatcher", "Landroid/text/SpannableString;", "setTextSpanWithNoTextWatcher", "", "index", "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.PrefixEditText */
public final class PrefixEditText extends MMEditText {

    /* renamed from: E */
    public String f220447E = "";

    public PrefixEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void setTextSpanWithNoTextWatcher(SpannableString spannableString) {
    }

    private final void setTextWithNoTextWatcher(String str) {
    }

    public void onSelectionChanged(int i, int i2) {
        if (!Util.isNullOrNil(this.f220447E)) {
            int length = this.f220447E.length();
            int i3 = i < length ? length : i;
            if (i2 >= length) {
                length = i2;
            }
            if (!(i == i3 && i2 == length)) {
                Log.m105924i("Finder.PrefixEditText", "onSelectionChanged : " + i + "--" + i2 + " pos:" + i3 + "--" + length);
                try {
                    super.setSelection(i3, length);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        super.onSelectionChanged(i, i2);
    }

    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public PrefixEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
