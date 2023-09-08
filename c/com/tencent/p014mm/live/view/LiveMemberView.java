package com.tencent.p014mm.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import gy3.C87412m;
import hc0.C20937c;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveMemberView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveMemberView */
public final class LiveMemberView extends RelativeLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveMemberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.f359857b71, this);
        View findViewById = findViewById(C0966R.C0970id.fv_);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_member_avatar_icon1)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.fva);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_member_avatar_icon2)");
        ImageView imageView2 = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.fvb);
        C87412m.m108593f(findViewById3, "findViewById(R.id.live_member_avatar_icon3)");
        ImageView imageView3 = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.fvc);
        C87412m.m108593f(findViewById4, "findViewById(R.id.live_member_avatar_icon_group1)");
        ViewGroup viewGroup = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.fvd);
        C87412m.m108593f(findViewById5, "findViewById(R.id.live_member_avatar_icon_group2)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.fve);
        C87412m.m108593f(findViewById6, "findViewById(R.id.live_member_avatar_icon_group3)");
        ViewGroup viewGroup3 = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.fvg);
        C87412m.m108593f(findViewById7, "findViewById(R.id.live_member_count_tv)");
        setPadding(C74942w4.m89784a(context, 4), C74942w4.m89784a(context, 4), C74942w4.m89784a(context, 4), C74942w4.m89784a(context, 4));
        setBackground(context.getResources().getDrawable(C0966R.C0969drawable.abw));
        String string = context.getResources().getString(C0966R.string.f360956g81);
        C87412m.m108593f(string, "context.resources.getStr…string.live_member_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{0}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        ((TextView) findViewById7).setText(format);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.default_avatar;
        bVar.mo32666a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveMemberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
