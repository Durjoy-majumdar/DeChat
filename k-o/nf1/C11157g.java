package nf1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nf1.g */
public class C11157g extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f32937d;

    /* renamed from: e */
    public final int f32938e;

    public C11157g(int i, int i2) {
        this.f32937d = i;
        this.f32938e = i2;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i = this.f32937d;
        rect.left = i / 2;
        rect.right = i / 2;
        int i2 = this.f32938e;
        rect.top = i2 / 2;
        rect.bottom = i2 / 2;
    }
}
