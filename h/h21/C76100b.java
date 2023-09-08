package h21;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import e21.C75480d0;
import e21.C75492u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h21.b */
public class C76100b extends BaseAdapter {

    /* renamed from: d */
    public Context f223013d;

    /* renamed from: e */
    public List<C75480d0> f223014e = new ArrayList();

    /* renamed from: h21.b$a */
    public static class C76101a {

        /* renamed from: a */
        public TextView f223015a;

        /* renamed from: b */
        public WalletTextView f223016b;

        /* renamed from: c */
        public TextView f223017c;

        public C76101a(View view) {
            this.f223015a = (TextView) view.findViewById(C0966R.C0970id.bgt);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.bgs);
            this.f223016b = (WalletTextView) view.findViewById(C0966R.C0970id.bgy);
            this.f223017c = (TextView) view.findViewById(C0966R.C0970id.bgu);
        }
    }

    public C76100b(Context context) {
        this.f223013d = context;
    }

    public int getCount() {
        return ((ArrayList) this.f223014e).size();
    }

    public Object getItem(int i) {
        return (C75480d0) ((ArrayList) this.f223014e).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C85868k2.m106137b(this.f223013d).inflate(C0966R.C0971layout.f7015uz, viewGroup, false);
            view.setTag(new C76101a(view));
        }
        C76101a aVar = (C76101a) view.getTag();
        C75480d0 d0Var = (C75480d0) ((ArrayList) this.f223014e).get(i);
        aVar.f223015a.setText(C75492u.m90528a(this.f223013d, d0Var.f221806b, d0Var.f221805a));
        aVar.f223016b.setText(C75492u.m90529b(d0Var.f221808d));
        aVar.f223017c.setText(this.f223013d.getString(C0966R.string.bg5, new Object[]{Integer.valueOf(d0Var.f221807c)}));
        return view;
    }
}
