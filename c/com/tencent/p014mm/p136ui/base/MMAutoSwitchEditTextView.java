package com.tencent.p014mm.p136ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMAutoSwitchEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditTextView */
public class MMAutoSwitchEditTextView extends LinearLayout {

    /* renamed from: d */
    public int f348193d;

    /* renamed from: e */
    public int f348194e;

    /* renamed from: f */
    public int f348195f;

    /* renamed from: g */
    public String f348196g;

    /* renamed from: h */
    public Context f348197h;

    /* renamed from: i */
    public ArrayList<MMAutoSwitchEditText> f348198i = new ArrayList<>();

    /* renamed from: j */
    public C116058d f348199j = new C116058d((C116055a) null);

    /* renamed from: n */
    public C116056b f348200n;

    /* renamed from: o */
    public C116057c f348201o;

    /* renamed from: p */
    public int f348202p = 100;

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditTextView$b */
    public interface C116056b {
    }

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditTextView$c */
    public interface C116057c {
    }

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditTextView$d */
    public class C116058d implements MMAutoSwitchEditText.C116053c, MMAutoSwitchEditText.C116052b, MMAutoSwitchEditText.C116054d {
        public C116058d(C116055a aVar) {
        }
    }

    public MMAutoSwitchEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f348197h = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226855a);
        this.f348193d = obtainStyledAttributes.getInteger(0, 3);
        this.f348194e = obtainStyledAttributes.getInteger(3, 4);
        this.f348195f = obtainStyledAttributes.getInteger(2, 2);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f348196g = context.getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (context instanceof Activity) {
            int i = this.f348193d;
            this.f348202p = ((((Activity) context).getWindowManager().getDefaultDisplay().getWidth() - 80) - ((i - 1) * 20)) / i;
        }
        setPadding(C76577a.m92151b(context, 20), 0, C76577a.m92151b(context, 20), 0);
        for (int i2 = 0; i2 < this.f348193d; i2++) {
            MMAutoSwitchEditText mMAutoSwitchEditText = (MMAutoSwitchEditText) View.inflate(this.f348197h, C0966R.C0971layout.f6529hc, (ViewGroup) null);
            mMAutoSwitchEditText.setInputType(this.f348195f);
            String str = this.f348196g;
            if (str != null && str.length() > 0) {
                mMAutoSwitchEditText.setKeyListener(DigitsKeyListener.getInstance(this.f348196g));
            }
            mMAutoSwitchEditText.setIndex(i2);
            mMAutoSwitchEditText.setMaxInputCount(this.f348194e);
            mMAutoSwitchEditText.setOnExceedMaxLimitCount(this.f348199j);
            mMAutoSwitchEditText.setOnDelAllContent(this.f348199j);
            mMAutoSwitchEditText.setOnTextInputChanged(this.f348199j);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f348202p, -2);
            if (i2 > 0) {
                layoutParams.leftMargin = 20;
            } else {
                layoutParams.leftMargin = 0;
            }
            layoutParams.weight = 1.0f;
            mMAutoSwitchEditText.setLayoutParams(layoutParams);
            this.f348198i.add(mMAutoSwitchEditText);
            addView(mMAutoSwitchEditText);
        }
    }

    public String getText() {
        Iterator<MMAutoSwitchEditText> it = this.f348198i.iterator();
        String str = "";
        while (it.hasNext()) {
            MMAutoSwitchEditText next = it.next();
            if (!Util.isNullOrNil(next.getText().toString().trim())) {
                str = str + next.getText().toString().trim();
            }
        }
        return str;
    }

    public void setOnInputFinished(C116056b bVar) {
        this.f348200n = bVar;
    }

    public void setOnTextChanged(C116057c cVar) {
        this.f348201o = cVar;
    }
}
