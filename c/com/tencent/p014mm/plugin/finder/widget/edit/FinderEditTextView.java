package com.tencent.p014mm.plugin.finder.widget.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000f¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditTextView;", "Landroid/widget/FrameLayout;", "", "maxLines", "Lrx3/b0;", "setTextMaxLines", "gravity", "setTextGravity", "type", "setTextInputType", "", "visible", "setTextCursorVisible", "resId", "setTextCursorDrawable", "", "hint", "setTextHint", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView */
public final class FinderEditTextView extends FrameLayout {

    /* renamed from: d */
    public String f162679d = "Finder.FinderEditTextView";

    /* renamed from: e */
    public MMEditText f162680e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo80124a();
    }

    /* renamed from: a */
    public final void mo80124a() {
        this.f162680e = new MMEditText(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            addView(mMEditText, layoutParams);
            MMEditText mMEditText2 = this.f162680e;
            if (mMEditText2 != null) {
                mMEditText2.setBackground((Drawable) null);
            } else {
                C87412m.m108603p("editText");
                throw null;
            }
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    public final String getText() {
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            return mMEditText.getText().toString();
        }
        C87412m.m108603p("editText");
        throw null;
    }

    public final void setTextCursorDrawable(int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            MMEditText mMEditText = this.f162680e;
            if (mMEditText != null) {
                declaredField.set(mMEditText, Integer.valueOf(i));
            } else {
                C87412m.m108603p("editText");
                throw null;
            }
        } catch (Exception e) {
            Log.m105921e(this.f162679d, "set cursor drawable error %s", e.getMessage());
        }
    }

    public final void setTextCursorVisible(boolean z) {
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(z);
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    public final void setTextGravity(int i) {
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            mMEditText.setGravity(i);
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    public final void setTextHint(String str) {
        C87412m.m108594g(str, "hint");
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            mMEditText.setHint(str);
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    public final void setTextInputType(int i) {
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            mMEditText.setInputType(i);
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    public final void setTextMaxLines(int i) {
        MMEditText mMEditText = this.f162680e;
        if (mMEditText != null) {
            mMEditText.setMaxLines(i);
        } else {
            C87412m.m108603p("editText");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo80124a();
    }
}
