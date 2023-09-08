package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import nj3.C76898q0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d5 */
public class C73951d5 implements C76898q0 {
    public C73951d5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
    }

    /* renamed from: a */
    public void mo103020a(View view) {
        TextView textView;
        if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.knx)) != null) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(ChattingItemDyeingTemplate.f216837S0.intValue(), textView.getPaddingTop(), ChattingItemDyeingTemplate.f216837S0.intValue(), textView.getPaddingBottom());
        }
    }
}
