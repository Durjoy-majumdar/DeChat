package com.tencent.p014mm.p136ui.chatting;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.chatting.C73850t4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import go3.C76003c;
import p629ny.C76979h;
import rb0.C47996o;

/* renamed from: com.tencent.mm.ui.chatting.o0 */
public class C73767o0 implements C73850t4.C73851a {

    /* renamed from: a */
    public final /* synthetic */ TextView f216531a;

    /* renamed from: b */
    public final /* synthetic */ C47996o f216532b;

    /* renamed from: c */
    public final /* synthetic */ ChatFooterCustom f216533c;

    /* renamed from: com.tencent.mm.ui.chatting.o0$a */
    public class C73768a implements Runnable {
        public C73768a() {
        }

        public void run() {
            Drawable drawable = C73767o0.this.f216533c.getContext().getResources().getDrawable(C0966R.C0969drawable.az5);
            drawable.setBounds(0, 0, C74942w4.m89784a(C73767o0.this.f216533c.getContext(), 8), C74942w4.m89784a(C73767o0.this.f216533c.getContext(), 8));
            C76003c cVar = new C76003c(drawable, 1);
            SpannableString spannableString = new SpannableString("@");
            spannableString.setSpan(cVar, 0, 1, 33);
            Log.m105925i("ChatCustomFooter", "setReddotText：%s", C73767o0.this.f216532b.f128724d);
            TextView textView = C73767o0.this.f216531a;
            textView.setText(TextUtils.concat(new CharSequence[]{((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(C73767o0.this.f216533c.getContext(), C73767o0.this.f216532b.f128723c) + " ", spannableString}));
        }
    }

    public C73767o0(ChatFooterCustom chatFooterCustom, TextView textView, C47996o oVar) {
        this.f216533c = chatFooterCustom;
        this.f216531a = textView;
        this.f216532b = oVar;
    }

    /* renamed from: a */
    public void mo102818a(boolean z, String str) {
        Log.m105919d("ChatCustomFooter", "OnShowRedDot show：%s，key ：%s", Boolean.valueOf(z), str);
        if (this.f216531a == null) {
            Log.m105918d("ChatCustomFooter", "OnShowRedDot mTextView == null");
        } else if (z) {
            new MMHandler().postDelayed(new C73768a(), 500);
        } else {
            Log.m105925i("ChatCustomFooter", "dont setReddotText:%s", this.f216532b.f128724d);
            this.f216531a.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f216533c.getContext(), this.f216532b.f128723c));
        }
    }
}
