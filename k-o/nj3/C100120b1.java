package nj3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: nj3.b1 */
public abstract class C100120b1 extends C103853a {

    /* renamed from: d */
    public Queue<View> f293274d = new LinkedList();

    /* renamed from: e */
    public HashMap<Object, Integer> f293275e = new HashMap<>();

    /* renamed from: f */
    public SparseArray<Object> f293276f = new SparseArray<>();

    /* renamed from: a */
    public boolean mo135923a() {
        return true;
    }

    /* renamed from: b */
    public int mo135924b() {
        return -1;
    }

    /* renamed from: c */
    public abstract MultiTouchImageView mo129059c(int i, boolean z);

    /* renamed from: d */
    public abstract Object mo129060d(int i, View view, ViewGroup viewGroup);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Log.m105919d("MicroMsg.MMViewPagerAdapter", "destroyItem position %s", Integer.valueOf(i));
        Log.m105925i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", Integer.valueOf(obj.hashCode()));
        ((LinkedList) this.f293274d).add((View) obj);
        this.f293275e.remove(obj);
        this.f293276f.remove(i);
    }

    /* renamed from: e */
    public View mo139420e(int i) {
        Object obj = this.f293276f.get(i);
        if (obj != null) {
            return (View) obj;
        }
        return null;
    }

    /* renamed from: f */
    public abstract WxImageView mo129061f(int i, boolean z);

    /* renamed from: g */
    public boolean mo135925g() {
        return false;
    }

    public int getItemPosition(Object obj) {
        if (this.f293275e.containsKey(obj)) {
            return this.f293275e.get(obj).intValue();
        }
        return -2;
    }

    /* renamed from: h */
    public int mo135926h() {
        return -1;
    }

    /* renamed from: i */
    public void mo139421i() {
        ((LinkedList) this.f293274d).clear();
        this.f293275e.clear();
        this.f293276f.clear();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        Object d = mo129060d(i, ((LinkedList) this.f293274d).size() > 0 ? (View) ((LinkedList) this.f293274d).poll() : null, viewGroup);
        View view = (View) d;
        Log.m105925i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s, position: %s.", Integer.valueOf(d.hashCode()), view.getParent(), Integer.valueOf(i));
        this.f293275e.put(d, Integer.valueOf(i));
        this.f293276f.put(i, d);
        if (view.getParent() == null) {
            viewGroup.addView(view);
        }
        Log.m105925i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return d;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
