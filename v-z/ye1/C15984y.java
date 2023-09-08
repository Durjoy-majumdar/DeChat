package ye1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.y */
public final class C15984y implements C10461a {

    /* renamed from: a */
    public final FrameLayout f43020a;

    /* renamed from: b */
    public final FrameLayout f43021b;

    /* renamed from: c */
    public final RefreshLoadMoreLayout f43022c;

    public C15984y(FrameLayout frameLayout, LinearLayout linearLayout, WeImageView weImageView, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, CoordinatorLayout coordinatorLayout, WxRecyclerView wxRecyclerView, RefreshLoadMoreLayout refreshLoadMoreLayout, LinearLayout linearLayout2, TextView textView2, ProgressBar progressBar, TextView textView3, RelativeLayout relativeLayout, TextView textView4, TextView textView5) {
        this.f43020a = frameLayout2;
        this.f43021b = frameLayout3;
        this.f43022c = refreshLoadMoreLayout;
    }

    /* renamed from: a */
    public static C15984y m14892a(View view) {
        View view2 = view;
        int i = C0966R.C0970id.edq;
        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.edq);
        if (linearLayout != null) {
            i = C0966R.C0970id.edr;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.edr);
            if (weImageView != null) {
                i = C0966R.C0970id.eds;
                TextView textView = (TextView) C10462b.m10395a(view2, C0966R.C0970id.eds);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) view2;
                    i = C0966R.C0970id.i5g;
                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(view2, C0966R.C0970id.i5g);
                    if (frameLayout2 != null) {
                        i = C0966R.C0970id.i5i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(view2, C0966R.C0970id.i5i);
                        if (coordinatorLayout != null) {
                            i = C0966R.C0970id.i6k;
                            WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(view2, C0966R.C0970id.i6k);
                            if (wxRecyclerView != null) {
                                i = C0966R.C0970id.ivb;
                                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(view2, C0966R.C0970id.ivb);
                                if (refreshLoadMoreLayout != null) {
                                    i = C0966R.C0970id.f359384kn0;
                                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.f359384kn0);
                                    if (linearLayout2 != null) {
                                        i = C0966R.C0970id.f359385kn1;
                                        TextView textView2 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.f359385kn1);
                                        if (textView2 != null) {
                                            i = C0966R.C0970id.kne;
                                            ProgressBar progressBar = (ProgressBar) C10462b.m10395a(view2, C0966R.C0970id.kne);
                                            if (progressBar != null) {
                                                i = C0966R.C0970id.knh;
                                                TextView textView3 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.knh);
                                                if (textView3 != null) {
                                                    i = C0966R.C0970id.kni;
                                                    RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(view2, C0966R.C0970id.kni);
                                                    if (relativeLayout != null) {
                                                        i = C0966R.C0970id.knk;
                                                        TextView textView4 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.knk);
                                                        if (textView4 != null) {
                                                            i = C0966R.C0970id.knl;
                                                            TextView textView5 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.knl);
                                                            if (textView5 != null) {
                                                                return new C15984y(frameLayout, linearLayout, weImageView, textView, frameLayout, frameLayout2, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, linearLayout2, textView2, progressBar, textView3, relativeLayout, textView4, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
