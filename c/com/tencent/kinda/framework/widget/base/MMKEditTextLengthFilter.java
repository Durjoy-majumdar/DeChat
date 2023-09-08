package com.tencent.kinda.framework.widget.base;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKEditTextLengthFilter;", "Landroid/text/InputFilter;", "maxEnglishChar", "", "(I)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "destStart", "destEnd", "getTextCount", "str", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
public final class MMKEditTextLengthFilter implements InputFilter {
    private final int maxEnglishChar;

    public MMKEditTextLengthFilter(int i) {
        this.maxEnglishChar = i;
    }

    private final int getTextCount(CharSequence charSequence) {
        if (charSequence != null) {
            return C45078p0.m49926e(charSequence.toString(), C45078p0.C45079a.MODE_CHINESE_AS_1);
        }
        return 0;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int textCount = (this.maxEnglishChar - getTextCount(spanned)) + getTextCount(String.valueOf(spanned != null ? spanned.subSequence(i3, i4) : null));
        if (textCount < 0) {
            return "";
        }
        if (getTextCount(charSequence) <= textCount) {
            return charSequence;
        }
        if (charSequence != null) {
            return charSequence.subSequence(i, textCount + i);
        }
        return null;
    }
}
