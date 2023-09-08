package ti2;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ti2.c */
public class C78029c extends BaseAdapter implements Filterable {

    /* renamed from: d */
    public List<TransferRecordParcel> f228767d;

    /* renamed from: e */
    public List<TransferRecordParcel> f228768e = new ArrayList();

    /* renamed from: f */
    public List<Pair<Integer, Integer>> f228769f = new ArrayList();

    /* renamed from: g */
    public Context f228770g;

    /* renamed from: h */
    public Filter f228771h;

    /* renamed from: ti2.c$b */
    public class C78031b extends Filter {

        /* renamed from: a */
        public List<TransferRecordParcel> f228772a = new ArrayList();

        public C78031b(C78030a aVar) {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            ((ArrayList) this.f228772a).clear();
            ((ArrayList) C78029c.this.f228769f).clear();
            Log.m105919d("MicroMsg.PayeeAutoCompleteAdapter", "input: %s", charSequence);
            for (TransferRecordParcel next : C78029c.this.f228767d) {
                if (!Util.isNullOrNil(charSequence) && next.f115916i.contains(charSequence)) {
                    int indexOf = next.f115916i.indexOf((String) charSequence);
                    int length = charSequence.length() + indexOf;
                    Log.m105925i("MicroMsg.PayeeAutoCompleteAdapter", "match payee: %s, start: %s, end: %s", next.f115916i, Integer.valueOf(indexOf), Integer.valueOf(length));
                    ((ArrayList) C78029c.this.f228769f).add(new Pair(Integer.valueOf(indexOf), Integer.valueOf(length)));
                    ((ArrayList) this.f228772a).add(next);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = ((ArrayList) this.f228772a).size();
            filterResults.values = this.f228772a;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C78029c cVar = C78029c.this;
            List<TransferRecordParcel> list = (List) filterResults.values;
            cVar.f228768e = list;
            Log.m105925i("MicroMsg.PayeeAutoCompleteAdapter", "match count: %d", Integer.valueOf(list.size()));
            C78029c.this.notifyDataSetChanged();
        }
    }

    /* renamed from: ti2.c$c */
    public class C78032c {

        /* renamed from: a */
        public CdnImageView f228774a;

        /* renamed from: b */
        public TextView f228775b;

        /* renamed from: c */
        public TextView f228776c;

        public C78032c(C78029c cVar, C78030a aVar) {
        }
    }

    public C78029c(Context context, List<TransferRecordParcel> list) {
        this.f228770g = context;
        this.f228767d = list;
    }

    public int getCount() {
        return this.f228768e.size();
    }

    public Filter getFilter() {
        if (this.f228771h == null) {
            this.f228771h = new C78031b((C78030a) null);
        }
        return this.f228771h;
    }

    public Object getItem(int i) {
        return this.f228768e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f228770g).inflate(C0966R.C0971layout.f6555i7, viewGroup, false);
            C78032c cVar = new C78032c(this, (C78030a) null);
            cVar.f228774a = (CdnImageView) view.findViewById(C0966R.C0970id.akm);
            cVar.f228775b = (TextView) view.findViewById(C0966R.C0970id.ako);
            cVar.f228776c = (TextView) view.findViewById(C0966R.C0970id.akn);
            view.setTag(cVar);
        }
        C78032c cVar2 = (C78032c) view.getTag();
        TransferRecordParcel transferRecordParcel = (TransferRecordParcel) getItem(i);
        Pair pair = (Pair) ((ArrayList) this.f228769f).get(i);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f228770g.getResources().getColor(C0966R.color.a7f));
        SpannableString spannableString = new SpannableString(transferRecordParcel.f115916i);
        spannableString.setSpan(foregroundColorSpan, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), 18);
        cVar2.f228774a.setUrl(transferRecordParcel.f115913f);
        cVar2.f228775b.setText(spannableString);
        cVar2.f228776c.setText(this.f228770g.getString(C0966R.string.ai7, new Object[]{transferRecordParcel.f115914g, transferRecordParcel.f115912e}));
        return view;
    }
}
