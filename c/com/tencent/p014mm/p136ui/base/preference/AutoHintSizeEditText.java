package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import pj3.C77096a;

/* renamed from: com.tencent.mm.ui.base.preference.AutoHintSizeEditText */
public class AutoHintSizeEditText extends EditText {

    /* renamed from: i */
    public static final /* synthetic */ int f215013i = 0;

    /* renamed from: d */
    public float f215014d;

    /* renamed from: e */
    public Paint f215015e;

    /* renamed from: f */
    public String f215016f = "";

    /* renamed from: g */
    public int f215017g = Integer.MIN_VALUE;

    /* renamed from: h */
    public float f215018h;

    public AutoHintSizeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float textSize = getTextSize();
        this.f215014d = textSize;
        this.f215018h = textSize;
        this.f215015e = new Paint(getPaint());
        addTextChangedListener(new C77096a(this));
    }

    /* renamed from: a */
    public final void mo101913a(Editable editable, CharSequence charSequence, int i) {
        float f;
        if (editable != null && !Util.isNullOrNil(editable.toString())) {
            float textSize = getTextSize();
            float f2 = this.f215014d;
            if (textSize != f2) {
                Log.m105927v("MicroMsg.AutoHintSizeEdittext", "content not null, reset text size %f", Float.valueOf(f2));
                setTextSize(0, this.f215014d);
            }
        } else if (charSequence == null || Util.isNullOrNil(charSequence.toString())) {
            float textSize2 = getTextSize();
            float f3 = this.f215014d;
            if (textSize2 != f3) {
                Log.m105927v("MicroMsg.AutoHintSizeEdittext", "hint is null, reset text size %f", Float.valueOf(f3));
                setTextSize(0, this.f215014d);
            }
        } else {
            String charSequence2 = charSequence.toString();
            if (!this.f215016f.equals(charSequence2) || this.f215017g != i) {
                this.f215016f = charSequence2;
                this.f215017g = i;
                float f4 = (float) i;
                if (getPaint().measureText(charSequence2) > f4) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3964lm);
                    int b = C76577a.m92151b(getContext(), 1);
                    int i2 = (int) this.f215014d;
                    do {
                        i2 -= b;
                        if (i2 > dimensionPixelSize) {
                            f = (float) i2;
                            this.f215015e.setTextSize(f);
                        } else {
                            return;
                        }
                    } while (this.f215015e.measureText(charSequence2) >= f4);
                    Log.m105927v("MicroMsg.AutoHintSizeEdittext", "get new hint text size %d", Integer.valueOf(i2));
                    this.f215018h = f;
                    setTextSize(0, f);
                    return;
                }
                return;
            }
            float textSize3 = getTextSize();
            float f5 = this.f215018h;
            if (textSize3 != f5) {
                Log.m105927v("MicroMsg.AutoHintSizeEdittext", "use last hint text size %f", Float.valueOf(f5));
                setTextSize(0, this.f215018h);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.AutoHintSizeEdittext", "on layout, changed %B", Boolean.valueOf(z));
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo101913a(getText(), getHint(), ((i3 - i) - getPaddingLeft()) - getPaddingRight());
        }
    }

    public AutoHintSizeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float textSize = getTextSize();
        this.f215014d = textSize;
        this.f215018h = textSize;
        this.f215015e = new Paint(getPaint());
        addTextChangedListener(new C77096a(this));
    }
}
