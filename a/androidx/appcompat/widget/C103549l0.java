package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: androidx.appcompat.widget.l0 */
public class C103549l0 {

    /* renamed from: a */
    public final Context f305800a;

    /* renamed from: b */
    public final View f305801b;

    /* renamed from: c */
    public final TextView f305802c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f305803d;

    /* renamed from: e */
    public final Rect f305804e = new Rect();

    /* renamed from: f */
    public final int[] f305805f = new int[2];

    /* renamed from: g */
    public final int[] f305806g = new int[2];

    public C103549l0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f305803d = layoutParams;
        this.f305800a = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6296ay, (ViewGroup) null);
        this.f305801b = inflate;
        this.f305802c = (TextView) inflate.findViewById(C0966R.C0970id.gsw);
        layoutParams.setTitle(C103549l0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0966R.style.f8215k;
        layoutParams.flags = 24;
    }
}
