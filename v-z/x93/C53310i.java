package x93;

import a70.C112760b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import java.util.ArrayList;
import nj3.C76874e0;
import nj3.C76875f0;
import p823sg.C90193h;

/* renamed from: x93.i */
public class C53310i extends BaseAdapter {

    /* renamed from: f */
    public static final String f148906f = (C112760b.m154195C() + "Game/HvMenu/");

    /* renamed from: d */
    public C76874e0 f148907d;

    /* renamed from: e */
    public Context f148908e;

    public C53310i(Context context) {
        this.f148908e = context;
    }

    public int getCount() {
        C76874e0 e0Var = this.f148907d;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.size();
    }

    public Object getItem(int i) {
        return (C76875f0) ((ArrayList) this.f148907d.f224704d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f148908e).inflate(C0966R.C0971layout.ax5, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f15);
        C76875f0 f0Var = (C76875f0) ((ArrayList) this.f148907d.f224704d).get(i);
        if (f0Var == null) {
            inflate.setTag((Object) null);
        } else if (f0Var.f224715g == -1) {
            inflate.setTag((Object) null);
        } else {
            String charSequence = f0Var.getTitle().toString();
            if (Util.isNullOrNil(charSequence)) {
                inflate.setTag((Object) null);
            } else {
                String[] split = charSequence.split("__", 2);
                if (split.length == 1) {
                    textView.setText(split[0]);
                } else {
                    textView.setText(split[0]);
                    String str = split[1];
                    if (str.startsWith("http")) {
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59346b = true;
                        bVar.f59350f = f148906f + C90193h.m112878f(str.getBytes());
                        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
                    } else {
                        imageView.setImageResource(MMApplicationContext.getResources().getIdentifier(str, "drawable", MMApplicationContext.getPackageName()));
                    }
                }
                inflate.setTag(f0Var);
            }
        }
        return inflate;
    }
}
