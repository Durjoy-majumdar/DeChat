package p853i4;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: i4.h */
public class C60244h {

    /* renamed from: a */
    public Context f171768a;

    /* renamed from: b */
    public int f171769b;

    /* renamed from: c */
    public ViewGroup f171770c;

    /* renamed from: d */
    public View f171771d;

    /* renamed from: e */
    public Runnable f171772e;

    /* renamed from: f */
    public Runnable f171773f;

    public C60244h(ViewGroup viewGroup, int i, Context context) {
        this.f171768a = context;
        this.f171770c = viewGroup;
        this.f171769b = i;
    }

    /* renamed from: b */
    public static C60244h m70515b(ViewGroup viewGroup, int i, Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(C0966R.C0970id.ktu);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(C0966R.C0970id.ktu, sparseArray);
        }
        C60244h hVar = (C60244h) sparseArray.get(i);
        if (hVar != null) {
            return hVar;
        }
        C60244h hVar2 = new C60244h(viewGroup, i, context);
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: a */
    public void mo85230a() {
        if (this.f171769b > 0 || this.f171771d != null) {
            this.f171770c.removeAllViews();
            if (this.f171769b > 0) {
                LayoutInflater.from(this.f171768a).inflate(this.f171769b, this.f171770c);
            } else {
                this.f171770c.addView(this.f171771d);
            }
        }
        Runnable runnable = this.f171772e;
        if (runnable != null) {
            runnable.run();
        }
        this.f171770c.setTag(C0966R.C0970id.ktq, this);
    }

    public C60244h(ViewGroup viewGroup, View view) {
        this.f171769b = -1;
        this.f171770c = viewGroup;
        this.f171771d = view;
    }
}
