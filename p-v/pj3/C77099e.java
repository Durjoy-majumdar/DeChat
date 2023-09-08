package pj3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import java.util.HashMap;
import junit.framework.Assert;

/* renamed from: pj3.e */
public class C77099e extends BaseAdapter {

    /* renamed from: d */
    public final Context f225195d;

    /* renamed from: e */
    public final int f225196e;

    /* renamed from: f */
    public CharSequence[] f225197f;

    /* renamed from: g */
    public CharSequence[] f225198g;

    /* renamed from: h */
    public String f225199h;

    /* renamed from: i */
    public final HashMap<CharSequence, C77098d> f225200i = new HashMap<>();

    /* renamed from: pj3.e$a */
    public static class C77100a {

        /* renamed from: a */
        public TextView f225201a;

        /* renamed from: b */
        public CheckBox f225202b;

        /* renamed from: c */
        public RadioButton f225203c;
    }

    public C77099e(Context context, int i) {
        this.f225195d = context;
        this.f225196e = i;
    }

    /* renamed from: a */
    public void mo107413a() {
        int i = 0;
        if (this.f225197f == null) {
            this.f225197f = new CharSequence[0];
        }
        if (this.f225198g == null) {
            this.f225198g = new CharSequence[0];
        }
        Assert.assertTrue("entries count different", this.f225197f.length == this.f225198g.length);
        this.f225200i.clear();
        while (true) {
            CharSequence[] charSequenceArr = this.f225198g;
            if (i < charSequenceArr.length) {
                CharSequence charSequence = charSequenceArr[i];
                this.f225200i.put(charSequence, new C77098d(charSequence, this.f225197f[i], 1048576 + i));
                i++;
            } else {
                return;
            }
        }
    }

    public int getCount() {
        return this.f225198g.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C85868k2.m106137b(this.f225195d).inflate(C0966R.C0971layout.be7, (ViewGroup) null);
            C77100a aVar = new C77100a();
            aVar.f225201a = (TextView) view.findViewById(C0966R.C0970id.khj);
            aVar.f225202b = (CheckBox) view.findViewById(C0966R.C0970id.b_4);
            aVar.f225203c = (RadioButton) view.findViewById(C0966R.C0970id.f359003ic1);
            view.setTag(aVar);
        }
        C77100a aVar2 = (C77100a) view.getTag();
        aVar2.f225201a.setText(this.f225197f[i]);
        int i2 = this.f225196e;
        if (i2 == 1) {
            aVar2.f225202b.setVisibility(8);
            aVar2.f225203c.setVisibility(0);
            aVar2.f225203c.setChecked(this.f225198g[i].equals(this.f225199h));
        } else if (i2 != 2) {
            aVar2.f225202b.setVisibility(8);
            aVar2.f225203c.setVisibility(8);
        } else {
            aVar2.f225202b.setVisibility(0);
            aVar2.f225203c.setVisibility(8);
            aVar2.f225202b.setChecked(this.f225198g[i].equals(this.f225199h));
        }
        return view;
    }
}
