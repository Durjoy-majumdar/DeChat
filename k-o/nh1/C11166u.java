package nh1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderFixedTextView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.u */
public final class C11166u implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f32957a;

    /* renamed from: b */
    public final ImageView f32958b;

    /* renamed from: c */
    public final FinderFixedTextView f32959c;

    /* renamed from: d */
    public final FinderFixedTextView f32960d;

    /* renamed from: e */
    public final FinderFixedTextView f32961e;

    public C11166u(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, FinderFixedTextView finderFixedTextView, FinderFixedTextView finderFixedTextView2, FinderFixedTextView finderFixedTextView3) {
        this.f32957a = relativeLayout;
        this.f32958b = imageView;
        this.f32959c = finderFixedTextView;
        this.f32960d = finderFixedTextView2;
        this.f32961e = finderFixedTextView3;
    }

    /* renamed from: a */
    public static C11166u m11043a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = C0966R.C0970id.f359596mn3;
        ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.f359596mn3);
        if (imageView != null) {
            i = C0966R.C0970id.mn5;
            FinderFixedTextView finderFixedTextView = (FinderFixedTextView) C10462b.m10395a(view, C0966R.C0970id.mn5);
            if (finderFixedTextView != null) {
                i = C0966R.C0970id.mn6;
                FinderFixedTextView finderFixedTextView2 = (FinderFixedTextView) C10462b.m10395a(view, C0966R.C0970id.mn6);
                if (finderFixedTextView2 != null) {
                    i = C0966R.C0970id.mn7;
                    FinderFixedTextView finderFixedTextView3 = (FinderFixedTextView) C10462b.m10395a(view, C0966R.C0970id.mn7);
                    if (finderFixedTextView3 != null) {
                        return new C11166u(relativeLayout, relativeLayout, imageView, finderFixedTextView, finderFixedTextView2, finderFixedTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
