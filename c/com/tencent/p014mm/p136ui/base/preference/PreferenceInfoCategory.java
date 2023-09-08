package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ax2.C0228c;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import ff2.C8018a;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceInfoCategory */
public class PreferenceInfoCategory extends Preference {

    /* renamed from: J */
    public View.OnClickListener f24277J;

    /* renamed from: K */
    public View.OnClickListener f24278K;

    /* renamed from: L */
    public C6764a f24279L;

    /* renamed from: com.tencent.mm.ui.base.preference.PreferenceInfoCategory$a */
    public interface C6764a {
    }

    public PreferenceInfoCategory(Context context) {
        super(context);
        this.f24277J = null;
        this.f24278K = null;
        this.f24279L = null;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView != null) {
            CharSequence charSequence = this.f121279i;
            if (charSequence == null || charSequence.length() <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(this.f121279i);
                textView.setOnClickListener(this.f24278K);
            }
            C6764a aVar = this.f24279L;
            if (aVar != null) {
                CharSequence charSequence2 = this.f121279i;
                C0228c cVar = (C0228c) aVar;
                String str = "";
                String string = cVar.f762a.getString(C0966R.string.cwc, new Object[]{str});
                if (!Util.isNullOrNil(charSequence2) && charSequence2.toString().contains(string)) {
                    if (string.length() < charSequence2.length()) {
                        str = string + Util.addSpace(charSequence2.subSequence(string.length(), charSequence2.length()));
                    } else {
                        str = charSequence2.toString();
                    }
                }
                ((C8018a) C39818r.f106831a.mo62444c(cVar.f762a.getContext()).mo75002a(C8018a.class)).setValue("title_key", str);
            }
            ((ImageView) view.findViewById(C0966R.C0970id.f5592j_)).setOnClickListener(this.f24277J);
        }
    }

    public PreferenceInfoCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceInfoCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24277J = null;
        this.f24278K = null;
        this.f24279L = null;
        this.f121271G = C0966R.C0971layout.bek;
    }
}
