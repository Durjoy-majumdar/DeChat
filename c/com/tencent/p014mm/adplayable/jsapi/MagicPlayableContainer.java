package com.tencent.p014mm.adplayable.jsapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.C40530t3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/adplayable/jsapi/MagicPlayableContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.adplayable.jsapi.MagicPlayableContainer */
public class MagicPlayableContainer extends FrameLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicPlayableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MagicPlayableContainer(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicPlayableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String string;
        C87412m.m108594g(context, "context");
        String str = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40530t3.f108869a, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0 && (string = obtainStyledAttributes.getString(index)) != null) {
                    str = string;
                }
            }
            obtainStyledAttributes.recycle();
        }
        setBackgroundColor(0);
        Log.m105924i("MagicPlayableContainer", "MagicPlayableContainer init:" + str);
    }
}
