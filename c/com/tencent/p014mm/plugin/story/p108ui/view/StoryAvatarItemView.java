package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import p196ln.C76705f;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryAvatarItemView;", "Landroid/widget/RelativeLayout;", "", "username", "Lrx3/b0;", "setAvatar", "", "count", "setTipCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryAvatarItemView */
public final class StoryAvatarItemView extends RelativeLayout {

    /* renamed from: d */
    public final int f21275d = C76577a.m92151b(getContext(), 2);

    /* renamed from: e */
    public ImageView f21276e;

    /* renamed from: f */
    public TextView f21277f;

    /* renamed from: g */
    public TextView f21278g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryAvatarItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View.inflate(getContext(), C0966R.C0971layout.c66, this);
        View findViewById = findViewById(C0966R.C0970id.k38);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_avatar_item_iv)");
        this.f21276e = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k39);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_avatar_item_name_tv)");
        this.f21277f = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k3_);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_avatar_item_unread_tip)");
        this.f21278g = (TextView) findViewById3;
    }

    public final void setAvatar(String str) {
        C87412m.m108594g(str, "username");
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f21276e, str, 0.5f);
        this.f21276e.setBackground(getResources().getDrawable(C0966R.C0969drawable.auw));
        ImageView imageView = this.f21276e;
        int i = this.f21275d;
        imageView.setPadding(i, i, i, i);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = getContext();
        String f = z1Var != null ? z1Var.mo62898f() : null;
        if (f == null) {
            f = "";
        }
        this.f21277f.setText(hVar.yp0(context, f, this.f21277f.getTextSize()));
    }

    public final void setTipCount(int i) {
        if (i <= 0) {
            this.f21278g.setVisibility(8);
            return;
        }
        this.f21278g.setText(String.valueOf(i));
        this.f21278g.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryAvatarItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View.inflate(getContext(), C0966R.C0971layout.c66, this);
        View findViewById = findViewById(C0966R.C0970id.k38);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_avatar_item_iv)");
        this.f21276e = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k39);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_avatar_item_name_tv)");
        this.f21277f = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k3_);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_avatar_item_unread_tip)");
        this.f21278g = (TextView) findViewById3;
    }
}
