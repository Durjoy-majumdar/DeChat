package vf2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import te3.C50241lc0;
import tf2.C101872b;
import vd3.C78407r;

/* renamed from: vf2.g */
public class C102186g extends BaseAdapter {

    /* renamed from: d */
    public LinkedList<C50241lc0> f300878d = new LinkedList<>();

    /* renamed from: e */
    public Context f300879e;

    /* renamed from: f */
    public Animation f300880f;

    /* renamed from: g */
    public Animation f300881g;

    /* renamed from: h */
    public Animation f300882h;

    /* renamed from: i */
    public HashMap<String, Boolean> f300883i = new HashMap<>();

    /* renamed from: vf2.g$a */
    public class C102187a {

        /* renamed from: a */
        public ImageView f300884a;

        /* renamed from: b */
        public TextView f300885b;

        public C102187a(C102186g gVar, View view) {
            this.f300884a = (ImageView) view.findViewById(C0966R.C0970id.crh);
            this.f300885b = (TextView) view.findViewById(C0966R.C0970id.crq);
        }
    }

    public C102186g(Context context) {
        this.f300879e = context;
        this.f300880f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2328p);
        this.f300882h = AnimationUtils.loadAnimation(this.f300879e, C0966R.C0968anim.f2328p);
        this.f300881g = AnimationUtils.loadAnimation(this.f300879e, C0966R.C0968anim.f2329q);
        this.f300880f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f300882h.setInterpolator(new AccelerateInterpolator());
        this.f300881g.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f300880f.setDuration(300);
        this.f300882h.setDuration(1000);
        this.f300881g.setDuration(1000);
    }

    /* renamed from: a */
    public void mo141727a(LinkedList<C50241lc0> linkedList) {
        this.f300878d = linkedList;
        if (linkedList != null && linkedList.size() > 0) {
            int size = this.f300878d.size();
            for (int i = 0; i < size; i++) {
                C50241lc0 lc02 = this.f300878d.get(i);
                String str = lc02 == null ? "" : Util.isNullOrNil(lc02.f137292d) ? lc02.f137293e : lc02.f137292d;
                if (!this.f300883i.containsKey(str)) {
                    this.f300883i.put(str, Boolean.FALSE);
                }
            }
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        LinkedList<C50241lc0> linkedList = this.f300878d;
        if (linkedList == null) {
            return 1;
        }
        return 1 + linkedList.size();
    }

    public Object getItem(int i) {
        LinkedList<C50241lc0> linkedList = this.f300878d;
        if (linkedList != null && i < linkedList.size()) {
            return this.f300878d.get(i);
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102187a aVar;
        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(this.f300879e).inflate(C0966R.C0971layout.a6_, (ViewGroup) null);
            aVar = new C102187a(this, view);
            view.setTag(aVar);
        } else {
            aVar = (C102187a) view.getTag();
        }
        C50241lc0 lc02 = (C50241lc0) getItem(i);
        if (lc02 != null) {
            if (Util.isNullOrNil(lc02.f137294f)) {
                aVar.f300885b.setText(lc02.f137292d);
            } else {
                aVar.f300885b.setText(lc02.f137294f);
            }
            if (!Util.isNullOrNil(lc02.f137292d)) {
                ImageView imageView = aVar.f300884a;
                String str = lc02.f137292d;
                C78407r.C78409b bVar = C101872b.C52341b.f146312a;
                Drawable drawable = imageView.getDrawable();
                C101872b bVar2 = (drawable == null || !(drawable instanceof C101872b)) ? new C101872b(str, (C101872b.C52340a) null) : (C101872b) drawable;
                bVar2.mo108360a(str);
                imageView.setImageDrawable(bVar2);
            } else {
                ImageView imageView2 = aVar.f300884a;
                String str2 = lc02.f137293e;
                C78407r.C78409b bVar3 = C101872b.C52341b.f146312a;
                Drawable drawable2 = imageView2.getDrawable();
                C101872b bVar4 = (drawable2 == null || !(drawable2 instanceof C101872b)) ? new C101872b(str2, (C101872b.C52340a) null) : (C101872b) drawable2;
                bVar4.mo108360a(str2);
                imageView2.setImageDrawable(bVar4);
            }
            String str3 = Util.isNullOrNil(lc02.f137292d) ? lc02.f137293e : lc02.f137292d;
            view.clearAnimation();
            if (this.f300883i.containsKey(str3) && !this.f300883i.get(str3).booleanValue()) {
                view.startAnimation(this.f300880f);
                this.f300883i.put(str3, Boolean.TRUE);
            }
        }
        if (i + 1 == getCount()) {
            aVar.f300885b.setText("");
            aVar.f300884a.setImageResource(C0966R.C0969drawable.bss);
            this.f300882h.setAnimationListener(new C102184e(this, view));
            this.f300881g.setAnimationListener(new C102185f(this, view));
            view.startAnimation(this.f300882h);
        }
        return view;
    }
}
