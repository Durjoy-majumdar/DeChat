package sy1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42080o0;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import java.util.ArrayList;
import p823sg.C90193h;

/* renamed from: sy1.a */
public class C48505a extends BaseAdapter {

    /* renamed from: d */
    public Context f129727d;

    /* renamed from: e */
    public GameTabData f129728e;

    /* renamed from: f */
    public String f129729f;

    public C48505a(Context context) {
        this.f129727d = context;
    }

    public int getCount() {
        GameTabData gameTabData = this.f129728e;
        if (gameTabData == null) {
            return 0;
        }
        return ((ArrayList) gameTabData.mo65923a()).size();
    }

    public Object getItem(int i) {
        return (GameTabData.TabItem) ((ArrayList) this.f129728e.mo65923a()).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f129727d).inflate(C0966R.C0971layout.axz, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ahw);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.aht);
        GameTabData.TabItem tabItem = (GameTabData.TabItem) ((ArrayList) this.f129728e.mo65923a()).get(i);
        if (tabItem != null) {
            textView.setText(tabItem.f113194e);
            if (Util.nullAsNil(this.f129729f).equalsIgnoreCase(tabItem.f113193d)) {
                if (!Util.isNullOrNil(tabItem.f113201o)) {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59346b = true;
                    bVar.f59350f = C42080o0.f113376f + C90193h.m112878f(tabItem.f113201o.getBytes());
                    C20828a.m22825b().mo32519h(tabItem.f113201o, imageView, bVar.mo32666a());
                }
            } else if (!Util.isNullOrNil(tabItem.f113200n)) {
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59346b = true;
                bVar2.f59350f = C42080o0.f113376f + C90193h.m112878f(tabItem.f113200n.getBytes());
                C20828a.m22825b().mo32519h(tabItem.f113200n, imageView, bVar2.mo32666a());
            }
        }
        inflate.setTag(tabItem);
        return inflate;
    }
}
