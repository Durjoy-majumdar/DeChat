package ql3;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import vl3.C102226d;

/* renamed from: ql3.c */
public final class C77364c implements TransformationMethod {

    /* renamed from: d */
    public final TransformationMethod f225568d;

    /* renamed from: e */
    public final float f225569e;

    /* renamed from: f */
    public final Context f225570f;

    public C77364c(TransformationMethod transformationMethod, float f, Context context) {
        C87412m.m108594g(context, "mContext");
        this.f225568d = transformationMethod;
        this.f225569e = f;
        this.f225570f = context;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        C87412m.m108594g(view, "view");
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f225568d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        Log.m105918d("MicroMsg.EmojiTransformationMethod", "getSmileySpan: text=" + charSequence + " , sizePx=" + this.f225569e);
        return C102226d.m134696a(this.f225570f, charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f225568d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
