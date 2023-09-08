package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q1 */
public class C57786q1 extends C74023i.C74026c {

    /* renamed from: b */
    public MMNeat7extView f165369b;

    /* renamed from: c */
    public ImageView f165370c;

    /* renamed from: d */
    public ImageView f165371d;

    public C57786q1(View view, Boolean bool) {
        super.create(view);
        this.f165369b = (MMNeat7extView) view.findViewById(C0966R.C0970id.dob);
        this.f165370c = (ImageView) view.findViewById(C0966R.C0970id.doa);
        this.f165371d = (ImageView) view.findViewById(C0966R.C0970id.do9);
        ImageView imageView = this.f165370c;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_finder_icon, C76577a.m92153d(this.f165370c.getContext(), C0966R.color.f2960ag)));
        bool.booleanValue();
    }
}
