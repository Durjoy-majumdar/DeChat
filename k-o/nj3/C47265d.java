package nj3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: nj3.d */
public abstract class C47265d extends C103853a {

    /* renamed from: d */
    public Context f126887d;

    /* renamed from: e */
    public Queue<View> f126888e;

    /* renamed from: f */
    public int f126889f = 0;

    public C47265d(Context context) {
        this.f126887d = context;
        this.f126888e = new LinkedList();
    }

    /* renamed from: a */
    public abstract int mo72290a();

    /* renamed from: b */
    public abstract View mo72291b(View view, ViewGroup viewGroup, int i);

    /* renamed from: c */
    public abstract void mo72292c(View view, int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((LinkedList) this.f126888e).add(view);
        mo72292c(view, i);
        Log.m105919d("MicroMsg.CustomPagerAdapter", "recycle queue size %d", Integer.valueOf(((LinkedList) this.f126888e).size()));
    }

    public int getItemPosition(Object obj) {
        int i = this.f126889f;
        if (i <= 0) {
            return super.getItemPosition(obj);
        }
        this.f126889f = i - 1;
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        View b = mo72291b((View) ((LinkedList) this.f126888e).poll(), viewGroup, i);
        if (b.getLayoutParams() == null) {
            b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(b);
        Log.m105927v("MicroMsg.CustomPagerAdapter", "instantiateItem usetime: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return b;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public void notifyDataSetChanged() {
        this.f126889f = mo72290a();
        super.notifyDataSetChanged();
    }
}
