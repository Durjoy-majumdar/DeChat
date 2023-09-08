package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/preference/SubCheckBoxPreference;", "Lcom/tencent/mm/ui/base/preference/CheckBoxPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.preference.SubCheckBoxPreference */
public final class SubCheckBoxPreference extends CheckBoxPreference {
    public SubCheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public int mo6386I() {
        return C0966R.C0971layout.bf8;
    }

    public SubCheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
