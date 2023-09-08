package h21;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import e21.C75479d;
import e21.C75492u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: h21.a */
public class C76098a extends BaseAdapter {

    /* renamed from: d */
    public Context f223008d;

    /* renamed from: e */
    public List<C75479d> f223009e = new ArrayList();

    /* renamed from: h21.a$a */
    public static class C76099a {

        /* renamed from: a */
        public TextView f223010a;

        /* renamed from: b */
        public WalletTextView f223011b;

        /* renamed from: c */
        public TextView f223012c;

        public C76099a(View view) {
            this.f223010a = (TextView) view.findViewById(C0966R.C0970id.bgk);
            this.f223011b = (WalletTextView) view.findViewById(C0966R.C0970id.f357729bh1);
            this.f223012c = (TextView) view.findViewById(C0966R.C0970id.bgl);
        }
    }

    public C76098a(Context context) {
        this.f223008d = context;
    }

    public int getCount() {
        return ((ArrayList) this.f223009e).size();
    }

    public Object getItem(int i) {
        return ((ArrayList) this.f223009e).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C85868k2.m106137b(this.f223008d).inflate(C0966R.C0971layout.f7013ux, viewGroup, false);
            view.setTag(new C76099a(view));
        }
        C75479d dVar = (C75479d) ((ArrayList) this.f223009e).get(i);
        C76099a aVar = (C76099a) view.getTag();
        aVar.f223010a.setText(new SimpleDateFormat(this.f223008d.getString(C0966R.string.bft)).format(new Date(dVar.f221802c * 1000)));
        aVar.f223011b.setText(C75492u.m90529b(dVar.f221804e));
        if (!Util.isNullOrNil(dVar.f221803d)) {
            aVar.f223012c.setText(dVar.f221803d);
            aVar.f223012c.setVisibility(0);
        } else {
            aVar.f223012c.setVisibility(8);
        }
        return view;
    }
}
