package nh1;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import org.libpag.PAGView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.b */
public final class C61733b implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175445a;

    /* renamed from: b */
    public final View f175446b;

    /* renamed from: c */
    public final View f175447c;

    public C61733b(RelativeLayout relativeLayout, View view, View view2, FinderRandomAnimTextView finderRandomAnimTextView, FinderLiveGiftTextView finderLiveGiftTextView, TextView textView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, PAGView pAGView, RelativeLayout relativeLayout2, ImageView imageView, TextView textView3, LinearLayout linearLayout3) {
        this.f175445a = relativeLayout;
        this.f175446b = view;
        this.f175447c = view2;
    }

    /* renamed from: a */
    public static C61733b m72426a(View view) {
        View view2 = view;
        int i = C0966R.C0970id.o56;
        View a = C10462b.m10395a(view2, C0966R.C0970id.o56);
        if (a != null) {
            i = C0966R.C0970id.a8r;
            View a2 = C10462b.m10395a(view2, C0966R.C0970id.a8r);
            if (a2 != null) {
                i = C0966R.C0970id.nug;
                FinderRandomAnimTextView finderRandomAnimTextView = (FinderRandomAnimTextView) C10462b.m10395a(view2, C0966R.C0970id.nug);
                if (finderRandomAnimTextView != null) {
                    i = C0966R.C0970id.dm4;
                    FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) C10462b.m10395a(view2, C0966R.C0970id.dm4);
                    if (finderLiveGiftTextView != null) {
                        i = C0966R.C0970id.dm5;
                        TextView textView = (TextView) C10462b.m10395a(view2, C0966R.C0970id.dm5);
                        if (textView != null) {
                            i = C0966R.C0970id.dm6;
                            TextView textView2 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.dm6);
                            if (textView2 != null) {
                                i = C0966R.C0970id.dm7;
                                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.dm7);
                                if (linearLayout != null) {
                                    i = C0966R.C0970id.dm8;
                                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.dm8);
                                    if (linearLayout2 != null) {
                                        i = C0966R.C0970id.dm9;
                                        PAGView pAGView = (PAGView) C10462b.m10395a(view2, C0966R.C0970id.dm9);
                                        if (pAGView != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) view2;
                                            i = C0966R.C0970id.o6v;
                                            ImageView imageView = (ImageView) C10462b.m10395a(view2, C0966R.C0970id.o6v);
                                            if (imageView != null) {
                                                i = C0966R.C0970id.o6w;
                                                TextView textView3 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.o6w);
                                                if (textView3 != null) {
                                                    i = C0966R.C0970id.o6x;
                                                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.o6x);
                                                    if (linearLayout3 != null) {
                                                        return new C61733b(relativeLayout, a, a2, finderRandomAnimTextView, finderLiveGiftTextView, textView, textView2, linearLayout, linearLayout2, pAGView, relativeLayout, imageView, textView3, linearLayout3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
