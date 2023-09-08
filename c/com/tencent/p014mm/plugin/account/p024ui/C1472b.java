package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.b */
public class C1472b extends BaseAdapter {

    /* renamed from: d */
    public String[] f10812d;

    /* renamed from: e */
    public LayoutInflater f10813e;

    /* renamed from: f */
    public Drawable f10814f = null;

    /* renamed from: g */
    public Context f10815g;

    /* renamed from: h */
    public View.OnTouchListener f10816h = new C1473a();

    /* renamed from: com.tencent.mm.plugin.account.ui.b$a */
    public class C1473a implements View.OnTouchListener {
        public C1473a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                ((TextView) view.findViewById(C0966R.C0970id.f5785ok)).setTextColor(C1472b.this.f10815g.getResources().getColor(C0966R.color.f3288ma));
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() == 1) {
                ((TextView) view.findViewById(C0966R.C0970id.f5785ok)).setTextColor(C1472b.this.f10815g.getResources().getColor(C0966R.color.al_));
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    public C1472b(Context context, String[] strArr) {
        this.f10812d = strArr;
        this.f10815g = context;
        this.f10813e = LayoutInflater.from(context);
        Drawable drawable = context.getResources().getDrawable(C0966R.C0969drawable.blw);
        this.f10814f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f10814f.getIntrinsicHeight());
    }

    public int getCount() {
        return this.f10812d.length;
    }

    public Object getItem(int i) {
        return this.f10812d[i];
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = this.f10813e.inflate(C0966R.C0971layout.f6371d0, (ViewGroup) null);
            textView = (TextView) view.findViewById(C0966R.C0970id.f5785ok);
        } else {
            textView = (TextView) view.findViewById(C0966R.C0970id.f5785ok);
        }
        view.setOnTouchListener(this.f10816h);
        boolean z = true;
        if (i == 0) {
            if (i == this.f10812d.length - 1) {
                textView.setPadding(25, 0, 25, 10);
                textView.setCompoundDrawablePadding(0);
                textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(this.f10812d[i]);
                return view;
            }
        }
        if (i == 0) {
            textView.setPadding(25, 0, 10, 10);
            textView.setCompoundDrawablePadding(10);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, this.f10814f, (Drawable) null);
        } else {
            if (i != this.f10812d.length - 1) {
                z = false;
            }
            if (z) {
                textView.setPadding(0, 0, 25, 10);
                textView.setCompoundDrawablePadding(0);
                textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView.setPadding(0, 0, 10, 10);
                textView.setCompoundDrawablePadding(10);
                textView.setCompoundDrawables((Drawable) null, (Drawable) null, this.f10814f, (Drawable) null);
            }
        }
        textView.setText(this.f10812d[i]);
        return view;
    }
}
