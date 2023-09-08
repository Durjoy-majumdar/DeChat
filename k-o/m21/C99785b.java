package m21;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.sdk.platformtools.Log;
import n21.C100040a;
import n21.C100041b;
import n21.C100042c;
import n21.C100044d;
import n21.C100045e;
import n21.C100052g;
import n21.C100054h;
import n21.C100059i;
import n21.C100060j;
import n21.C100065k;
import p21.C100616a;
import u21.C101941c;

/* renamed from: m21.b */
public class C99785b extends RecyclerView.C16613e<C100040a> {

    /* renamed from: d */
    public C93083b f292451d;

    /* renamed from: e */
    public C100044d f292452e = new C100044d();

    public C99785b(C93083b bVar) {
        this.f292451d = bVar;
    }

    public int getItemCount() {
        return C101941c.m134173q().mo141443B() + 0;
    }

    public int getItemViewType(int i) {
        int i2 = i - 0;
        C100616a l = C101941c.m134173q().mo141456l(i2);
        if (l != null) {
            return l.mo140076b();
        }
        Log.m105921e("MicroMsg.EditorAdapter", "getItemViewType, item is null, position is %d", Integer.valueOf(i2));
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C100040a aVar = (C100040a) zVar;
        synchronized (this) {
            int i2 = i - 0;
            C100616a l = C101941c.m134173q().mo141456l(i2);
            if (l == null || l.mo140076b() != aVar.mo139367y()) {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(l == null);
                objArr[1] = Integer.valueOf(i2);
                Log.m105921e("MicroMsg.EditorAdapter", "onBindViewHolder, item is null %b, position is %d", objArr);
            } else {
                aVar.mo139368z(l, i2, l.mo140076b());
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f292452e.f293072a.get(i), viewGroup, false);
        C100044d dVar = this.f292452e;
        C93083b bVar = this.f292451d;
        dVar.getClass();
        switch (i) {
            case -1:
                return new C100052g(inflate, bVar);
            case 0:
                return new C100059i(inflate, bVar);
            case 1:
                return new C100054h(inflate, bVar);
            case 2:
                return new C100042c(inflate, bVar);
            case 3:
                return new C100045e(inflate, bVar);
            case 4:
                return new C100065k(inflate, bVar);
            case 5:
                return new C100041b(inflate, bVar);
            case 6:
                return new C100060j(inflate, bVar);
            default:
                return null;
        }
    }
}
