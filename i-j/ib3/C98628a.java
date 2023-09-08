package ib3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bb3.C92221d;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import xa3.C102587c;

/* renamed from: ib3.a */
public abstract class C98628a extends RecyclerView.C16631z {

    /* renamed from: A */
    public C92221d f289191A;

    /* renamed from: z */
    public C96679b f289192z;

    public C98628a(View view, C96679b bVar, C92221d dVar) {
        super(view);
        this.f289192z = bVar;
        this.f289191A = dVar;
    }

    /* renamed from: y */
    public abstract int mo138058y();

    /* renamed from: z */
    public abstract void mo138059z(C102587c cVar, int i, int i2);
}
