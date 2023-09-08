package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar */
public class CustomTabActionBar extends FrameLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f114209g = 0;

    /* renamed from: d */
    public Context f114210d;

    /* renamed from: e */
    public View f114211e;

    /* renamed from: f */
    public TextView f114212f;

    public CustomTabActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66296a();
    }

    /* renamed from: a */
    public final void mo66296a() {
        this.f114210d = getContext();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.axy, this, false);
        this.f114211e = inflate.findViewById(C0966R.C0970id.f5470g0);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        this.f114212f = textView;
        C44706b.m49451b(textView, C0966R.dimen.f3635t);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f5459fp);
        this.f114211e.setOnClickListener(new CustomTabActionBar$$a(this));
        addView(inflate, new FrameLayout.LayoutParams(-1, C75044y4.m89989a(MMApplicationContext.getContext())));
    }

    public void setBackBtn(View.OnClickListener onClickListener) {
        this.f114211e.setOnClickListener(onClickListener);
    }

    public void setTitle(int i) {
        this.f114212f.setText(i);
    }

    public void setTitle(String str) {
        this.f114212f.setText(str);
    }

    public CustomTabActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66296a();
    }
}
