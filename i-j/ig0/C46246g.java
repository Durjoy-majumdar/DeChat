package ig0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hg0.C46070y;
import java.util.LinkedList;
import mg0.C76754b;
import p823sg.C77710q;
import te3.C50776p33;
import te3.C51283sq1;

/* renamed from: ig0.g */
public class C46246g extends BaseAdapter {

    /* renamed from: d */
    public final LayoutInflater f124656d;

    /* renamed from: e */
    public LinkedList<C50776p33> f124657e;

    /* renamed from: f */
    public LinkedList<C51283sq1> f124658f;

    /* renamed from: g */
    public boolean f124659g;

    /* renamed from: h */
    public boolean[] f124660h;

    /* renamed from: ig0.g$a */
    public static class C46247a {

        /* renamed from: a */
        public TextView f124661a;

        /* renamed from: b */
        public TextView f124662b;

        /* renamed from: c */
        public TextView f124663c;

        /* renamed from: d */
        public TextView f124664d;

        /* renamed from: e */
        public CheckBox f124665e;

        /* renamed from: f */
        public int f124666f;
    }

    public C46246g(LayoutInflater layoutInflater) {
        this.f124656d = layoutInflater;
    }

    /* renamed from: a */
    public String[] mo71658a() {
        int i = 0;
        for (boolean z : this.f124660h) {
            if (z) {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f124657e.size(); i3++) {
            if (this.f124660h[i3]) {
                strArr[i2] = this.f124657e.get(i3).f139552h;
                i2++;
            }
        }
        return strArr;
    }

    /* renamed from: b */
    public void mo71659b(LinkedList<C51283sq1> linkedList) {
        this.f124658f = linkedList;
    }

    /* renamed from: d */
    public void mo71660d(boolean z) {
        this.f124659g = z;
    }

    public int getCount() {
        if (this.f124659g) {
            LinkedList<C51283sq1> linkedList = this.f124658f;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }
        LinkedList<C50776p33> linkedList2 = this.f124657e;
        if (linkedList2 != null) {
            return linkedList2.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f124659g ? this.f124658f.get(i) : this.f124657e.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C46247a aVar;
        String[] split;
        C46247a aVar2;
        if (this.f124659g) {
            C51283sq1 sq12 = this.f124658f.get(i);
            if (view == null || ((C46247a) view.getTag()).f124666f != 2) {
                view = this.f124656d.inflate(C0966R.C0971layout.b1x, viewGroup, false);
                aVar2 = new C46247a();
                aVar2.f124666f = 2;
                aVar2.f124661a = (TextView) view.findViewById(C0966R.C0970id.i95);
                view.setTag(aVar2);
            } else {
                aVar2 = (C46247a) view.getTag();
            }
            aVar2.f124661a.setText(sq12.f141674e);
            return view;
        }
        C50776p33 p332 = this.f124657e.get(i);
        if (view == null || ((C46247a) view.getTag()).f124666f != 1) {
            view = this.f124656d.inflate(C0966R.C0971layout.b1w, viewGroup, false);
            aVar = new C46247a();
            aVar.f124666f = 1;
            aVar.f124662b = (TextView) view.findViewById(C0966R.C0970id.f9i);
            aVar.f124663c = (TextView) view.findViewById(C0966R.C0970id.f9g);
            aVar.f124665e = (CheckBox) view.findViewById(C0966R.C0970id.f9j);
            aVar.f124664d = (TextView) view.findViewById(C0966R.C0970id.f95);
            view.setTag(aVar);
        } else {
            aVar = (C46247a) view.getTag();
        }
        if (((C46070y) ((C76754b) C86312j.m106911c(C76754b.class)).mo105750tV()).Ft0(p332.f139552h)) {
            aVar.f124664d.setVisibility(0);
        } else {
            aVar.f124664d.setVisibility(8);
        }
        TextView textView = aVar.f124662b;
        String str = p332.f139551g;
        String str2 = "";
        if ((str == null || str.length() <= 0) && (((str = p332.f139549e) == null || str.length() <= 0) && (((str = new C77710q(p332.f139548d).toString()) == null || str.length() <= 0) && ((str = p332.f139550f) == null || str.length() <= 0)))) {
            str = str2;
        }
        textView.setText(str);
        TextView textView2 = aVar.f124663c;
        int i2 = p332.f139553i;
        if (i2 == 0) {
            str2 = p332.f139552h;
        } else if (i2 == 2) {
            str2 = p332.f139552h;
        } else if (i2 == 1) {
            String str3 = p332.f139552h;
            if (!Util.isNullOrNil(str3) && (split = str3.split("@")) != null && split.length >= 2 && !Util.isNullOrNil(split[0])) {
                str2 = "@" + split[0];
            }
        }
        textView2.setText(str2);
        aVar.f124665e.setChecked(this.f124660h[i]);
        return view;
    }
}
