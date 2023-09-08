package q83;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import r83.C47948a;
import r83.C47951e;

/* renamed from: q83.l */
public class C101058l {

    /* renamed from: a */
    public MMWebView f295855a;

    /* renamed from: b */
    public MMHandler f295856b;

    /* renamed from: c */
    public List<C101059a> f295857c;

    /* renamed from: d */
    public int f295858d = -1;

    /* renamed from: e */
    public int f295859e = -1;

    /* renamed from: f */
    public float[] f295860f;

    /* renamed from: g */
    public View f295861g;

    /* renamed from: h */
    public C47948a f295862h;

    /* renamed from: i */
    public C47951e.C47953b f295863i;

    /* renamed from: q83.l$a */
    public static class C101059a {

        /* renamed from: a */
        public WeakReference<View> f295864a;

        /* renamed from: b */
        public int f295865b;

        /* renamed from: c */
        public int f295866c;

        /* renamed from: d */
        public int f295867d;

        public C101059a(View view, int i, int i2, int i3) {
            this.f295864a = new WeakReference<>(view);
            this.f295865b = i;
            this.f295866c = i2;
            this.f295867d = i3;
        }
    }

    public C101058l(MMWebView mMWebView, C47951e.C47953b bVar) {
        this.f295855a = mMWebView;
        this.f295856b = new MMHandler(Looper.getMainLooper());
        this.f295857c = new LinkedList();
        this.f295861g = new View(mMWebView.getContext());
        this.f295863i = bVar;
    }

    /* renamed from: a */
    public final boolean mo140513a(View view, int i, int i2, float[] fArr, int i3) {
        ViewGroup c;
        float f;
        int i4;
        ViewGroup.LayoutParams layoutParams;
        int i5;
        View view2 = view;
        int i6 = i;
        int i7 = i2;
        float[] fArr2 = fArr;
        int i8 = i3;
        if (view2 == null || fArr2 == null || fArr2.length < 5 || (c = mo140515c(i7)) == null || mo140516d(i6) != null) {
            return false;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        float f5 = fArr2[3];
        int i9 = (int) fArr2[4];
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams((int) f4, (int) f5);
        int i15 = 0;
        for (C101059a next : this.f295857c) {
            if (i7 == next.f295866c && i9 >= next.f295867d) {
                i15++;
            }
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if (i15 > c.getChildCount()) {
            i15 = c.getChildCount();
        }
        int i16 = i15;
        if (i8 == Integer.MAX_VALUE || i8 < 0) {
            i5 = i16;
            layoutParams = layoutParams2;
            i4 = i9;
            f = f3;
        } else {
            int i17 = i8 == 0 ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i17));
            i5 = i16;
            layoutParams = layoutParams2;
            i4 = i9;
            f = f3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c.addView(view2, i5, layoutParams);
        view2.setX(f2);
        view2.setY(f);
        ((LinkedList) this.f295857c).add(new C101059a(view2, i6, i7, i4));
        return true;
    }

    /* renamed from: b */
    public final List<C101059a> mo140514b(C101059a aVar) {
        LinkedList linkedList = new LinkedList();
        for (C101059a next : this.f295857c) {
            if (next.f295866c == aVar.f295865b) {
                linkedList.addAll(mo140514b(next));
            }
        }
        linkedList.add(aVar);
        return linkedList;
    }

    /* renamed from: c */
    public final ViewGroup mo140515c(int i) {
        if (i == 0) {
            ViewGroup topView = this.f295855a.getTopView();
            if (topView instanceof AbsoluteLayout) {
                return topView;
            }
            return null;
        }
        C101059a e = mo140517e(i);
        if (e == null) {
            return null;
        }
        View view = e.f295864a.get();
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: d */
    public View mo140516d(int i) {
        C101059a e = mo140517e(i);
        if (e == null) {
            return null;
        }
        return e.f295864a.get();
    }

    /* renamed from: e */
    public final C101059a mo140517e(int i) {
        for (C101059a next : this.f295857c) {
            if (next.f295865b == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo140518f(int i, float[] fArr, int i2) {
        int i3 = i;
        float[] fArr2 = fArr;
        int i4 = i2;
        if (this.f295859e == i3 || this.f295858d == i3) {
            return true;
        }
        C101059a e = mo140517e(i);
        if (e == null) {
            return false;
        }
        View view = e.f295864a.get();
        ViewGroup c = mo140515c(e.f295866c);
        if (c == null) {
            return false;
        }
        if (i4 >= 0 && i4 != Integer.MAX_VALUE) {
            int i5 = i4 == 0 ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i5));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "updateViewImpl", "(I[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "updateViewImpl", "(I[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (fArr2 == null || fArr2.length < 5) {
            return true;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        int i6 = (int) fArr2[4];
        ((LinkedList) this.f295857c).remove(e);
        if (e.f295867d != i6) {
            c.removeView(view);
            if (mo140513a(view, i, e.f295866c, fArr, i2)) {
                return true;
            }
            this.f295857c.removeAll(mo140514b(e));
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f3 != Float.MAX_VALUE) {
            layoutParams.width = (int) f3;
        }
        if (f4 != Float.MAX_VALUE) {
            layoutParams.height = (int) f4;
        }
        if (f != Float.MAX_VALUE) {
            view.setX(f);
        }
        if (f2 != Float.MAX_VALUE) {
            view.setY(f2);
        }
        view.requestLayout();
        ((LinkedList) this.f295857c).add(new C101059a(view, i3, e.f295866c, i6));
        int indexOfChild = c.indexOfChild(this.f295861g);
        if (c.indexOfChild(view) != -1 || indexOfChild == -1) {
            return true;
        }
        c.addView(view, indexOfChild);
        c.removeView(this.f295861g);
        return true;
    }
}
