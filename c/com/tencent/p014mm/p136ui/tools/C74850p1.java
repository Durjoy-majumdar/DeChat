package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.p1 */
public abstract class C74850p1 implements AdapterView.OnItemClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public MMListPopupWindow f220071d;

    /* renamed from: e */
    public Context f220072e;

    /* renamed from: f */
    public View f220073f;

    /* renamed from: g */
    public int f220074g;

    /* renamed from: h */
    public BaseAdapter f220075h;

    /* renamed from: i */
    public ViewTreeObserver f220076i;

    /* renamed from: j */
    public ViewGroup f220077j;

    /* renamed from: n */
    public boolean f220078n = false;

    /* renamed from: o */
    public int f220079o = C0966R.style.f8430i8;

    /* renamed from: p */
    public boolean f220080p = false;

    public C74850p1(Context context) {
        this.f220072e = context;
        Resources resources = context.getResources();
        this.f220074g = Math.min((resources.getDisplayMetrics().widthPixels * 4) / 5, resources.getDimensionPixelSize(C0966R.dimen.f3930jb));
        Context context2 = this.f220072e;
        if (context2 instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) ((Activity) context2).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f220073f = viewGroup.getChildAt(0);
            } else {
                this.f220073f = viewGroup;
            }
        }
        BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f220072e, 1.0f);
        resources.getDimensionPixelSize(C0966R.dimen.f3926j6);
        resources.getDimensionPixelSize(C0966R.dimen.f3682bb);
        BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f220072e, 36.0f);
        this.f220075h = mo103922b();
    }

    /* renamed from: a */
    public void mo104068a() {
        if (mo104069c()) {
            this.f220071d.mo101712a();
        }
    }

    /* renamed from: b */
    public abstract BaseAdapter mo103922b();

    /* renamed from: c */
    public boolean mo104069c() {
        MMListPopupWindow mMListPopupWindow = this.f220071d;
        return mMListPopupWindow != null && mMListPopupWindow.f214823g.isShowing();
    }

    /* renamed from: d */
    public boolean mo103923d() {
        int i;
        Rect rect = new Rect();
        Context context = this.f220072e;
        if (context instanceof AppCompatActivity) {
            i = ((AppCompatActivity) context).getSupportActionBar().mo91101l();
        } else {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels > displayMetrics.heightPixels ? BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f220072e, 40.0f) : BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f220072e, 49.0f);
        }
        int c = C74942w4.m89786c(this.f220072e, C0966R.dimen.f3766df);
        Context context2 = this.f220072e;
        if (context2 instanceof Activity) {
            ((Activity) context2).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = ((Activity) this.f220072e).getWindow().getDecorView().getHeight();
            int[] iArr = new int[2];
            ((Activity) this.f220072e).getWindow().getDecorView().getLocationOnScreen(iArr);
            i = (height - rect.height() < 0 || iArr[1] <= 200) ? i + rect.top : i + (height - rect.height());
        }
        DisplayMetrics displayMetrics2 = this.f220072e.getResources().getDisplayMetrics();
        this.f220080p = displayMetrics2.widthPixels > displayMetrics2.heightPixels;
        if (this.f220071d == null) {
            this.f220071d = new MMListPopupWindow(this.f220072e, (AttributeSet) null, 0);
        }
        this.f220071d.f214823g.setOnDismissListener(this);
        MMListPopupWindow mMListPopupWindow = this.f220071d;
        mMListPopupWindow.f214834r = this;
        mMListPopupWindow.mo101713b(this.f220075h);
        MMListPopupWindow mMListPopupWindow2 = this.f220071d;
        mMListPopupWindow2.f214837u = true;
        mMListPopupWindow2.f214823g.setFocusable(true);
        this.f220071d.f214823g.setBackgroundDrawable(this.f220072e.getResources().getDrawable(C0966R.C0969drawable.c9o));
        this.f220071d.f214823g.setAnimationStyle(this.f220079o);
        MMListPopupWindow mMListPopupWindow3 = this.f220071d;
        mMListPopupWindow3.f214828l = c;
        View view = this.f220073f;
        mMListPopupWindow3.f214833q = view;
        if (view != null) {
            boolean z = this.f220076i == null;
            this.f220076i = view.getViewTreeObserver();
            Log.m105927v("MicroMsg.SubMenuHelperBase", "tryshow addGlobalListener:%b", Boolean.valueOf(z));
            if (z) {
                this.f220076i.addOnGlobalLayoutListener(this);
            }
        }
        MMListPopupWindow mMListPopupWindow4 = this.f220071d;
        mMListPopupWindow4.f214829m = i;
        mMListPopupWindow4.f214830n = true;
        mMListPopupWindow4.f214838v = this.f220078n;
        BaseAdapter baseAdapter = this.f220075h;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = baseAdapter.getCount();
        View view2 = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = baseAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view2 = null;
                i3 = itemViewType;
            }
            if (this.f220077j == null) {
                this.f220077j = new FrameLayout(this.f220072e);
            }
            view2 = baseAdapter.getView(i4, view2, this.f220077j);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view2.getMeasuredWidth());
        }
        mMListPopupWindow4.mo101714c(Math.min(i2, this.f220074g));
        this.f220071d.f214823g.setInputMethodMode(2);
        this.f220071d.mo101715d();
        this.f220071d.f214825i.setOnKeyListener(this);
        this.f220071d.f214825i.setSelector(new ColorDrawable(this.f220072e.getResources().getColor(C0966R.color.ahf)));
        this.f220071d.f214825i.setDividerHeight(0);
        this.f220071d.f214825i.setVerticalScrollBarEnabled(true);
        this.f220071d.f214825i.setHorizontalScrollBarEnabled(false);
        return true;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f220076i;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f220076i = this.f220073f.getViewTreeObserver();
            }
            this.f220076i.removeGlobalOnLayoutListener(this);
            this.f220076i = null;
        }
    }

    public void onGlobalLayout() {
        boolean z = false;
        Log.m105927v("MicroMsg.SubMenuHelperBase", "onGlobalLayout showing:%b, anchorshown:%b", Boolean.valueOf(mo104069c()), Boolean.valueOf(this.f220073f.isShown()));
        if (mo104069c()) {
            View view = this.f220073f;
            if (view == null || !view.isShown()) {
                mo104068a();
            } else if (mo104069c()) {
                boolean z2 = this.f220080p;
                DisplayMetrics displayMetrics = this.f220072e.getResources().getDisplayMetrics();
                if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
                    z = true;
                }
                if (z2 != z) {
                    this.f220071d.mo101712a();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        Log.m105926v("MicroMsg.SubMenuHelperBase", "onKey");
        if (keyEvent.getAction() == 1 && i == 82) {
            mo104068a();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
