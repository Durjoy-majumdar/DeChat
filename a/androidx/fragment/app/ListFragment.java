package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class ListFragment extends HellAndroidXFragment {

    /* renamed from: d */
    public final Handler f192670d = new Handler();

    /* renamed from: e */
    public final Runnable f192671e = new C67089a();

    /* renamed from: f */
    public final AdapterView.OnItemClickListener f192672f = new C67090b();

    /* renamed from: g */
    public ListAdapter f192673g;

    /* renamed from: h */
    public ListView f192674h;

    /* renamed from: i */
    public View f192675i;

    /* renamed from: j */
    public View f192676j;

    /* renamed from: n */
    public View f192677n;

    /* renamed from: o */
    public boolean f192678o;

    /* renamed from: androidx.fragment.app.ListFragment$a */
    public class C67089a implements Runnable {
        public C67089a() {
        }

        public void run() {
            ListView listView = ListFragment.this.f192674h;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.ListFragment$b */
    public class C67090b implements AdapterView.OnItemClickListener {
        public C67090b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListView listView = (ListView) adapterView;
            ListFragment.this.getClass();
        }
    }

    /* renamed from: K */
    public final void mo91166K() {
        if (this.f192674h == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f192674h = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    if (textView == null) {
                        this.f192675i = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f192676j = view.findViewById(16711682);
                    this.f192677n = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f192674h = listView;
                        View view2 = this.f192675i;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f192678o = true;
                this.f192674h.setOnItemClickListener(this.f192672f);
                ListAdapter listAdapter = this.f192673g;
                boolean z = false;
                if (listAdapter != null) {
                    this.f192673g = listAdapter;
                    ListView listView2 = this.f192674h;
                    if (listView2 != null) {
                        listView2.setAdapter(listAdapter);
                        if (!this.f192678o) {
                            if (requireView().getWindowToken() != null) {
                                z = true;
                            }
                            mo91167L(true, z);
                        }
                    }
                } else if (this.f192676j != null) {
                    mo91167L(false, false);
                }
                this.f192670d.post(this.f192671e);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: L */
    public final void mo91167L(boolean z, boolean z2) {
        boolean z3 = z;
        mo91166K();
        View view = this.f192676j;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f192678o != z3) {
            this.f192678o = z3;
            if (z3) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f192677n.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f192677n.clearAnimation();
                }
                View view2 = this.f192676j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f192677n;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f192677n.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f192677n.clearAnimation();
            }
            View view6 = this.f192676j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f192677n;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.f192670d.removeCallbacks(this.f192671e);
        this.f192674h = null;
        this.f192678o = false;
        this.f192677n = null;
        this.f192676j = null;
        this.f192675i = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo91166K();
    }
}
