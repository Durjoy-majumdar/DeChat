package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar */
public class ChatCustomTabActionBar extends FrameLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f114178g = 0;

    /* renamed from: d */
    public Context f114179d;

    /* renamed from: e */
    public View f114180e;

    /* renamed from: f */
    public TabLayout f114181f;

    public ChatCustomTabActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66278a();
    }

    /* renamed from: a */
    public final void mo66278a() {
        this.f114179d = getContext();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359816d52, this, false);
        View findViewById = inflate.findViewById(C0966R.C0970id.f5470g0);
        this.f114180e = findViewById;
        findViewById.setOnClickListener(new ChatCustomTabActionBar$$a(this));
        this.f114181f = (TabLayout) inflate.findViewById(C0966R.C0970id.nzj);
        addView(inflate, new FrameLayout.LayoutParams(-1, C75044y4.m89989a(MMApplicationContext.getContext())));
    }

    /* renamed from: b */
    public final void mo66279b(TabLayout.C55061f fVar, int i) {
        TextView textView = (TextView) fVar.f154605f.findViewById(C0966R.C0970id.nsf);
        textView.setText(fVar.f154602c.toString().trim());
        textView.setTypeface(Typeface.defaultFromStyle(i));
    }

    public TabLayout getmTabs() {
        return this.f114181f;
    }

    public void setBackBtn(View.OnClickListener onClickListener) {
        this.f114180e.setOnClickListener(onClickListener);
    }

    public ChatCustomTabActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66278a();
    }
}
