package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.tencent.p014mm.p136ui.base.MMRadioGroupView;

/* renamed from: com.tencent.mm.ui.base.MMRadioImageButton */
public class MMRadioImageButton extends ImageButton implements Checkable {

    /* renamed from: d */
    public boolean f55826d;

    /* renamed from: e */
    public boolean f55827e;

    /* renamed from: f */
    public boolean f55828f;

    /* renamed from: g */
    public C19685a f55829g;

    /* renamed from: h */
    public C19685a f55830h;

    /* renamed from: com.tencent.mm.ui.base.MMRadioImageButton$a */
    public interface C19685a {
    }

    public MMRadioImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public boolean isChecked() {
        return this.f55828f;
    }

    public boolean performClick() {
        toggle();
        return false;
    }

    public void setCheckable(boolean z) {
        this.f55827e = z;
    }

    public void setChecked(boolean z) {
        View findViewById;
        View findViewById2;
        if (this.f55828f != z) {
            this.f55828f = z;
            setSelected(z);
            refreshDrawableState();
            if (!this.f55826d) {
                this.f55826d = true;
                C19685a aVar = this.f55829g;
                if (aVar != null) {
                    MMRadioGroupView.C19681b bVar = (MMRadioGroupView.C19681b) aVar;
                    MMRadioGroupView mMRadioGroupView = MMRadioGroupView.this;
                    int i = mMRadioGroupView.f55820d;
                    if (!(i == -1 || (findViewById2 = mMRadioGroupView.findViewById(i)) == null || !(findViewById2 instanceof MMRadioImageButton))) {
                        ((MMRadioImageButton) findViewById2).setChecked(false);
                    }
                    int id = getId();
                    MMRadioGroupView.this.setCheckedButton(this);
                    MMRadioGroupView.this.setCheckedId(id);
                }
                C19685a aVar2 = this.f55830h;
                if (aVar2 != null) {
                    MMRadioGroupView.C19681b bVar2 = (MMRadioGroupView.C19681b) aVar2;
                    MMRadioGroupView mMRadioGroupView2 = MMRadioGroupView.this;
                    int i2 = mMRadioGroupView2.f55820d;
                    if (!(i2 == -1 || (findViewById = mMRadioGroupView2.findViewById(i2)) == null || !(findViewById instanceof MMRadioImageButton))) {
                        ((MMRadioImageButton) findViewById).setChecked(false);
                    }
                    int id4 = getId();
                    MMRadioGroupView.this.setCheckedButton(this);
                    MMRadioGroupView.this.setCheckedId(id4);
                }
                this.f55826d = false;
            }
        }
    }

    public void setOnMMRadioButtonCheckedChangeListener(C19685a aVar) {
        this.f55829g = aVar;
    }

    public void setOnOtherMMRadioButtonCheckedChangeListener(C19685a aVar) {
        this.f55830h = aVar;
    }

    public void toggle() {
        if (!this.f55827e) {
            C19685a aVar = this.f55829g;
            if (aVar != null) {
                MMRadioGroupView.this.setClickedId(getId());
            }
            C19685a aVar2 = this.f55830h;
            if (aVar2 != null) {
                MMRadioGroupView.this.setClickedId(getId());
            }
        } else if (!isChecked()) {
            setChecked(!this.f55828f);
        }
    }

    public MMRadioImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55827e = true;
    }
}
