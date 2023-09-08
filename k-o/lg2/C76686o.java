package lg2;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jg2.C76415b;
import kg2.C76574a;
import kg2.C76575b;
import kg2.C76576f;
import wc3.C15131b;

/* renamed from: lg2.o */
public class C76686o extends BaseAdapter implements Filterable {

    /* renamed from: q */
    public static final /* synthetic */ int f224375q = 0;

    /* renamed from: d */
    public List<C76574a> f224376d = new ArrayList();

    /* renamed from: e */
    public boolean f224377e = false;

    /* renamed from: f */
    public List<C76574a> f224378f;

    /* renamed from: g */
    public C76691e f224379g;

    /* renamed from: h */
    public String f224380h;

    /* renamed from: i */
    public Context f224381i;

    /* renamed from: j */
    public AutoCompleteTextView f224382j;

    /* renamed from: n */
    public MallFormView f224383n;

    /* renamed from: o */
    public List<String[]> f224384o;

    /* renamed from: p */
    public C76690d f224385p = null;

    /* renamed from: lg2.o$a */
    public class C76687a implements View.OnClickListener {
        public C76687a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76686o.this.f224382j.dismissDropDown();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lg2.o$b */
    public class C76688b implements View.OnClickListener {
        public C76688b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76415b.wx0().zx0((List<C76574a>) null);
            EditText editText = C76686o.this.f224383n.f203635f;
            if (editText != null) {
                editText.setText("");
            }
            C76686o oVar = C76686o.this;
            LinkedList linkedList = new LinkedList();
            synchronized (oVar) {
                oVar.f224378f = linkedList;
                oVar.notifyDataSetChanged();
            }
            if (C76686o.this.f224385p != null) {
                C86709a0.m107524d().mo123460f(new C76576f("", 1));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lg2.o$c */
    public class C76689c implements View.OnClickListener {
        public C76689c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76686o.this.f224382j.dismissDropDown();
            C76686o.this.f224383n.mo97093a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lg2.o$d */
    public interface C76690d {
    }

    /* renamed from: lg2.o$e */
    public class C76691e extends Filter {

        /* renamed from: lg2.o$e$a */
        public class C76692a implements Runnable {
            public C76692a(C76691e eVar) {
            }

            public void run() {
            }
        }

        public C76691e(C76687a aVar) {
        }

        /* renamed from: a */
        public final int[] mo106970a(String str, String str2) {
            if (str.equals(str2)) {
                return C76574a.f224101f;
            }
            if (str2 != null && str.length() == str2.length()) {
                int i = 0;
                int[] iArr = {-1, -1};
                for (int length = str.length() - 1; length > 0; length--) {
                    if (str2.charAt(length) != str.charAt(length)) {
                        i++;
                        if (i > 2) {
                            break;
                        }
                        iArr[i - 1] = length;
                    }
                }
                if (i <= 2) {
                    return iArr;
                }
            }
            return C76574a.f224102g;
        }

        public synchronized Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            String a = charSequence != null ? C76575b.m92141a(charSequence.toString()) : "";
            if (!a.equals(C76686o.this.f224380h) || a.equals("")) {
                C76686o oVar = C76686o.this;
                oVar.f224380h = a;
                List<C76574a> list = oVar.f224378f;
                if (list != null && !list.isEmpty()) {
                    for (C76574a aVar : C76686o.this.f224378f) {
                        aVar.f224107e = C76574a.f224101f;
                    }
                }
                boolean z = true;
                if (!C76686o.this.f224383n.mo97095c()) {
                    z = false;
                    if (!Util.isNullOrNil(C76686o.this.f224380h)) {
                        int i = C76686o.f224375q;
                        Log.m105924i("MicroMsg.MobileHistoryAdapter", "performFiltering1 " + charSequence);
                        for (C76574a next : C76686o.this.f224378f) {
                            if (next.f224103a.startsWith(C76686o.this.f224380h)) {
                                arrayList.add(next);
                            }
                        }
                    } else {
                        arrayList.addAll(C76686o.this.f224378f);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = C76686o.f224375q;
                    Log.m105924i("MicroMsg.MobileHistoryAdapter", "performFiltering2 " + charSequence);
                    C76574a yx02 = C76415b.yx0();
                    if (yx02 != null && a.equals(yx02.f224103a)) {
                        return filterResults;
                    }
                    List<String[]> list2 = C76686o.this.f224384o;
                    if (list2 == null || list2.isEmpty()) {
                        C76686o oVar2 = C76686o.this;
                        oVar2.f224384o = C15131b.m14241e(oVar2.f224381i);
                    }
                    List<String[]> list3 = C76686o.this.f224384o;
                    if (list3 != null) {
                        for (String[] next2 : list3) {
                            String a2 = C76575b.m92141a(next2[2]);
                            int[] a3 = mo106970a(C76686o.this.f224380h, a2);
                            if (C76574a.f224101f.equals(a3)) {
                                return filterResults;
                            }
                            if (!C76574a.f224102g.equals(a3) && arrayList.size() < 4) {
                                C76574a aVar2 = new C76574a(a2, next2[1], 1);
                                aVar2.f224107e = a3;
                                arrayList.add(aVar2);
                            }
                        }
                    }
                    for (C76574a next3 : C76415b.wx0().xx0()) {
                        int[] a4 = mo106970a(C76686o.this.f224380h, C76575b.m92141a(next3.f224103a));
                        if (C76574a.f224101f.equals(a4)) {
                            return filterResults;
                        }
                        if (!C76574a.f224102g.equals(a4) && arrayList.size() < 4) {
                            next3.f224107e = a4;
                            arrayList.add(next3);
                        }
                    }
                    int i3 = C76686o.f224375q;
                    Log.m105918d("MicroMsg.MobileHistoryAdapter", " search phone number cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms ");
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
                C76686o.this.f224377e = z;
                return filterResults;
            }
            C76686o.this.f224382j.post(new C76692a(this));
            filterResults.count = C76686o.this.f224376d.size();
            filterResults.values = C76686o.this.f224376d;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj == null) {
                C76686o.this.f224376d = new ArrayList();
            } else {
                C76686o.this.f224376d = (List) obj;
            }
            if (filterResults.count == 0) {
                C76686o.this.f224383n.f203632L = true;
            } else {
                C76686o.this.f224383n.f203632L = false;
            }
            int i = C76686o.f224375q;
            Log.m105924i("MicroMsg.MobileHistoryAdapter", "results.count " + filterResults.count);
            if (filterResults.count > 0) {
                C76686o.this.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: lg2.o$f */
    public class C76693f {

        /* renamed from: a */
        public TextView f224390a;

        /* renamed from: b */
        public TextView f224391b;

        /* renamed from: c */
        public ImageView f224392c;

        public C76693f(C76686o oVar, C76687a aVar) {
        }
    }

    public C76686o(MallFormView mallFormView, List<String[]> list) {
        this.f224381i = mallFormView.getContext();
        this.f224383n = mallFormView;
        this.f224382j = (AutoCompleteTextView) mallFormView.getContentEditText();
        this.f224384o = list;
    }

    /* renamed from: a */
    public synchronized C76574a getItem(int i) {
        if (this.f224377e) {
            if (i == 0) {
                return null;
            }
            if (i > this.f224376d.size()) {
                return null;
            }
            return this.f224376d.get(i - 1);
        } else if (i >= this.f224376d.size()) {
            return null;
        } else {
            return this.f224376d.get(i);
        }
    }

    public int getCount() {
        if (this.f224377e) {
            return this.f224376d.size() + 2;
        }
        if (this.f224376d.size() > 0) {
            return this.f224376d.size() + 1;
        }
        return 0;
    }

    public Filter getFilter() {
        Log.m105918d("MicroMsg.MobileHistoryAdapter", "getFilter");
        if (this.f224379g == null) {
            this.f224379g = new C76691e((C76687a) null);
        }
        return this.f224379g;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (!this.f224377e) {
            return i < this.f224376d.size() ? 0 : 1;
        }
        if (i == 0) {
            return 2;
        }
        return i <= this.f224376d.size() ? 0 : 3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C76693f fVar;
        ImageView imageView;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            if (view == null) {
                view = View.inflate(this.f224381i, C0966R.C0971layout.bq5, (ViewGroup) null);
                fVar = new C76693f(this, (C76687a) null);
                fVar.f224390a = (TextView) view.findViewById(C0966R.C0970id.glx);
                fVar.f224391b = (TextView) view.findViewById(C0966R.C0970id.glw);
                fVar.f224392c = (ImageView) view.findViewById(C0966R.C0970id.krc);
                view.setTag(fVar);
            } else {
                fVar = (C76693f) view.getTag();
            }
            if (!(fVar == null || (imageView = fVar.f224392c) == null)) {
                if (i == 0) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
            C76574a a = getItem(i);
            if (a == null || fVar == null || fVar.f224390a == null || fVar.f224391b == null) {
                return view;
            }
            String b = C76575b.m92142b(a.f224103a);
            Log.m105918d("MicroMsg.MobileHistoryAdapter", "record.record " + b + ", record.name " + a.f224104b + "，record.location " + a.f224105c);
            if (!C76574a.f224101f.equals(a.f224107e)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
                for (int i2 : a.f224107e) {
                    if (i2 >= 0) {
                        if (i2 >= 7) {
                            i2 += 2;
                        } else if (i2 >= 3) {
                            i2++;
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f224381i.getResources().getColor(C0966R.color.a9u)), i2, i2 + 1, 34);
                    }
                }
                fVar.f224390a.setTextSize(24.0f);
                fVar.f224390a.setTextColor(this.f224381i.getResources().getColor(C0966R.color.a7f));
                fVar.f224391b.setTextColor(this.f224381i.getResources().getColor(C0966R.color.a7f));
                fVar.f224390a.setText(spannableStringBuilder);
            } else {
                fVar.f224390a.setTextSize(16.0f);
                fVar.f224390a.setTextColor(this.f224381i.getResources().getColor(C0966R.color.f3563xt));
                fVar.f224391b.setTextColor(this.f224381i.getResources().getColor(C0966R.color.f3563xt));
                fVar.f224390a.setText(b);
            }
            String str = a.f224104b;
            if (str != null && !Util.isNullOrNil(str.trim())) {
                if (!Util.isNullOrNil(a.f224105c)) {
                    fVar.f224391b.setText(a.f224104b + this.f224381i.getString(C0966R.string.l6s, new Object[]{a.f224105c}));
                } else {
                    fVar.f224391b.setText(a.f224104b);
                }
                if (a.f224104b.equals(this.f224381i.getString(C0966R.string.l6z))) {
                    fVar.f224391b.setTextColor(this.f224381i.getResources().getColor(C0966R.color.a9r));
                    return view;
                }
                fVar.f224391b.setTextColor(this.f224381i.getResources().getColor(C0966R.color.a7b));
                return view;
            } else if (!Util.isNullOrNil(a.f224105c)) {
                fVar.f224391b.setText(this.f224381i.getString(C0966R.string.f361607l71) + this.f224381i.getString(C0966R.string.l6s, new Object[]{a.f224105c}));
                return view;
            } else {
                fVar.f224391b.setText(this.f224381i.getString(C0966R.string.f361607l71));
                return view;
            }
        } else if (itemViewType == 1) {
            View inflate = View.inflate(this.f224381i, C0966R.C0971layout.bq6, (ViewGroup) null);
            inflate.setOnClickListener(new C76688b());
            return inflate;
        } else if (itemViewType == 2) {
            View inflate2 = View.inflate(this.f224381i, C0966R.C0971layout.bq4, (ViewGroup) null);
            inflate2.setOnClickListener(new C76687a());
            return inflate2;
        } else if (itemViewType != 3) {
            return view;
        } else {
            View inflate3 = View.inflate(this.f224381i, C0966R.C0971layout.bq6, (ViewGroup) null);
            ((TextView) inflate3.findViewById(C0966R.C0970id.ig_)).setText(C0966R.string.gou);
            inflate3.setOnClickListener(new C76689c());
            return inflate3;
        }
    }

    public int getViewTypeCount() {
        return 4;
    }
}
