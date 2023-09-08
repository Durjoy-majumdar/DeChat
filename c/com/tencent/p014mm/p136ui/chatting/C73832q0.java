package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import go3.C76003c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kg3.C76577a;
import p629ny.C76979h;
import rb0.C47996o;

/* renamed from: com.tencent.mm.ui.chatting.q0 */
public class C73832q0 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* renamed from: d */
    public AdapterView.OnItemClickListener f216649d = null;

    /* renamed from: e */
    public Boolean f216650e = Boolean.FALSE;

    /* renamed from: f */
    public String f216651f = "";

    /* renamed from: g */
    public boolean f216652g = false;

    /* renamed from: h */
    public Map<String, C73850t4> f216653h = new ConcurrentHashMap();

    /* renamed from: i */
    public List<C73850t4> f216654i = new ArrayList();

    /* renamed from: j */
    public Context f216655j;

    /* renamed from: n */
    public LayoutInflater f216656n;

    /* renamed from: o */
    public ViewGroup f216657o;

    /* renamed from: p */
    public C73834b f216658p = null;

    /* renamed from: q */
    public MMListPopupWindow f216659q;

    /* renamed from: r */
    public int f216660r = C0966R.style.f8836zj;

    /* renamed from: s */
    public int f216661s;

    /* renamed from: t */
    public C47996o f216662t = null;

    /* renamed from: u */
    public int f216663u;

    /* renamed from: com.tencent.mm.ui.chatting.q0$a */
    public static class C73833a {

        /* renamed from: a */
        public static DisplayMetrics f216664a;
    }

    /* renamed from: com.tencent.mm.ui.chatting.q0$b */
    public class C73834b extends BaseAdapter {
        public C73834b(C73772p0 p0Var) {
        }

        public int getCount() {
            return C73832q0.this.f216663u;
        }

        public Object getItem(int i) {
            return C73832q0.this.f216662t.f128727g.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Class cls = C76979h.class;
            TextView textView = view == null ? (TextView) C73832q0.this.f216656n.inflate(C0966R.C0971layout.bng, viewGroup, false) : (TextView) view;
            C47996o oVar = C73832q0.this.f216662t.f128727g.get(i);
            textView.setTag(oVar);
            C73832q0 q0Var = C73832q0.this;
            if (q0Var.f216650e.booleanValue() && q0Var.f216651f.equals(oVar.f128724d) && q0Var.f216652g) {
                Log.m105925i("MicroMsg.ChatFooterCustomSubmenu", "showRedDotTextView：%s", oVar.f128724d);
                textView.setEllipsize((TextUtils.TruncateAt) null);
                Drawable drawable = C73832q0.this.f216655j.getResources().getDrawable(C0966R.C0969drawable.az5);
                drawable.setBounds(0, 0, C74942w4.m89784a(C73832q0.this.f216655j, 8), C74942w4.m89784a(C73832q0.this.f216655j, 8));
                C76003c cVar = new C76003c(drawable, 1);
                SpannableString spannableString = new SpannableString("@");
                spannableString.setSpan(cVar, 0, 1, 33);
                textView.setText(TextUtils.concat(new CharSequence[]{((C76979h) C86312j.m106911c(cls)).mo107057T1(C73832q0.this.f216655j, oVar.f128723c) + " ", spannableString}));
            } else {
                textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(C73832q0.this.f216655j, oVar.f128723c));
            }
            return textView;
        }
    }

    public C73832q0(Context context, ViewGroup viewGroup) {
        this.f216655j = context;
        this.f216657o = viewGroup;
        this.f216656n = (LayoutInflater) context.getSystemService("layout_inflater");
        mo102866a();
        this.f216658p = new C73834b((C73772p0) null);
    }

    /* renamed from: a */
    public boolean mo102866a() {
        MMListPopupWindow mMListPopupWindow = this.f216659q;
        if (!(mMListPopupWindow != null && mMListPopupWindow.f214823g.isShowing())) {
            return false;
        }
        this.f216659q.mo101712a();
        return true;
    }

    /* renamed from: b */
    public boolean mo102867b(C47996o oVar, int i, int i2, boolean z) {
        List<C47996o> list;
        int i3;
        MMListPopupWindow mMListPopupWindow = this.f216659q;
        if ((mMListPopupWindow != null && mMListPopupWindow.f214823g.isShowing()) || oVar == null || (list = oVar.f128727g) == null || list.size() <= 0) {
            return false;
        }
        this.f216662t = oVar;
        this.f216663u = oVar.f128727g.size();
        this.f216658p.notifyDataSetChanged();
        ((WindowManager) this.f216655j.getSystemService("window")).getDefaultDisplay().getHeight();
        Context context = this.f216655j;
        TextPaint paint = ((TextView) ((LayoutInflater) this.f216655j.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bng, (ViewGroup) null)).getPaint();
        List<C47996o> list2 = oVar.f128727g;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            if (C73833a.f216664a == null) {
                C73833a.f216664a = context.getResources().getDisplayMetrics();
            }
            displayMetrics = C73833a.f216664a;
        }
        Point a = C75054z4.m90003a(context);
        int i4 = displayMetrics.widthPixels;
        if (a.y != displayMetrics.heightPixels) {
            Log.m105921e("MicroMsg.ChatFooterCustomSubmenu", "get screen param error!! width:%s, systermWidth:%s, height:%s, systermHeight:%s", Integer.valueOf(i4), Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(a.y), Integer.valueOf(displayMetrics.heightPixels));
        }
        float f = 0.0f;
        for (C47996o oVar2 : list2) {
            float measureText = paint.measureText(oVar2.f128723c);
            if (f < measureText) {
                f = measureText;
            }
        }
        int b = ((int) f) + (C76577a.m92151b(context, 30) * 2);
        int b2 = C76577a.m92151b(context, 95);
        if (b < b2) {
            b = b2;
        }
        int i5 = b / 2;
        if (i - i5 < 0) {
            i3 = i4 - (b + 0);
        } else {
            i3 = i4 - (i + i5);
            if (i3 < 0) {
                i3 = 0;
            }
        }
        this.f216661s = (i2 - (C73832q0.this.f216663u * this.f216655j.getResources().getDimensionPixelSize(C0966R.dimen.f3955ld))) - this.f216655j.getResources().getDimensionPixelSize(C0966R.dimen.f3816f_);
        Log.m105918d("MicroMsg.ChatFooterCustomSubmenu", "showPointY=" + i2 + "verticalOffset=" + this.f216661s);
        MMListPopupWindow mMListPopupWindow2 = new MMListPopupWindow(this.f216655j, (AttributeSet) null, 0);
        this.f216659q = mMListPopupWindow2;
        mMListPopupWindow2.f214823g.setOnDismissListener(this);
        MMListPopupWindow mMListPopupWindow3 = this.f216659q;
        mMListPopupWindow3.f214834r = this.f216649d;
        mMListPopupWindow3.mo101713b(this.f216658p);
        MMListPopupWindow mMListPopupWindow4 = this.f216659q;
        mMListPopupWindow4.f214837u = true;
        mMListPopupWindow4.f214823g.setFocusable(true);
        this.f216659q.f214823g.setBackgroundDrawable(this.f216655j.getResources().getDrawable(C0966R.C0969drawable.ccr));
        this.f216659q.f214823g.setAnimationStyle(this.f216660r);
        MMListPopupWindow mMListPopupWindow5 = this.f216659q;
        mMListPopupWindow5.f214828l = i3;
        mMListPopupWindow5.f214829m = this.f216661s;
        mMListPopupWindow5.f214830n = true;
        mMListPopupWindow5.f214833q = this.f216657o;
        C73834b bVar = this.f216658p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i6 = C73832q0.this.f216663u;
        View view = null;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            int itemViewType = bVar.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (this.f216657o == null) {
                this.f216657o = new FrameLayout(this.f216655j);
            }
            view = bVar.getView(i9, view, this.f216657o);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i7 = Math.max(i7, view.getMeasuredWidth());
        }
        mMListPopupWindow5.mo101714c(i7);
        this.f216659q.f214823g.setInputMethodMode(2);
        this.f216659q.mo101715d();
        this.f216659q.f214825i.setOnKeyListener(this);
        this.f216659q.f214825i.setDivider(new ColorDrawable(this.f216655j.getResources().getColor(C0966R.color.abr)));
        this.f216659q.f214825i.setSelector(this.f216655j.getResources().getDrawable(C0966R.C0969drawable.am7));
        this.f216659q.f214825i.setDividerHeight(1);
        this.f216659q.f214825i.setVerticalScrollBarEnabled(false);
        this.f216659q.f214825i.setHorizontalScrollBarEnabled(false);
        this.f216659q.f214825i.setBackgroundColor(this.f216655j.getResources().getColor(C0966R.color.f2932f));
        return true;
    }

    public void onDismiss() {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
