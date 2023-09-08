package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jg2.C76415b;
import kg2.C76574a;
import kg2.C76575b;
import wc3.C15131b;

/* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText */
public class MallEditText extends LinearLayout implements View.OnFocusChangeListener {

    /* renamed from: A */
    public int f203480A;

    /* renamed from: d */
    public C70426b f203481d;

    /* renamed from: e */
    public View.OnFocusChangeListener f203482e;

    /* renamed from: f */
    public TextView f203483f;

    /* renamed from: g */
    public AutoCompleteTextView f203484g;

    /* renamed from: h */
    public ImageView f203485h;

    /* renamed from: i */
    public boolean f203486i;

    /* renamed from: j */
    public C70418a f203487j;

    /* renamed from: n */
    public String f203488n;

    /* renamed from: o */
    public String f203489o;

    /* renamed from: p */
    public int f203490p;

    /* renamed from: q */
    public boolean f203491q;

    /* renamed from: r */
    public int f203492r;

    /* renamed from: s */
    public int f203493s;

    /* renamed from: t */
    public int f203494t;

    /* renamed from: u */
    public int f203495u;

    /* renamed from: v */
    public int f203496v;

    /* renamed from: w */
    public boolean f203497w;

    /* renamed from: x */
    public List<String[]> f203498x;

    /* renamed from: y */
    public C76574a f203499y;

    /* renamed from: z */
    public boolean f203500z;

    /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a */
    public class C70418a extends BaseAdapter implements Filterable {

        /* renamed from: d */
        public List<C76574a> f203501d = new ArrayList();

        /* renamed from: e */
        public boolean f203502e = false;

        /* renamed from: f */
        public List<C76574a> f203503f;

        /* renamed from: g */
        public C70422d f203504g;

        /* renamed from: h */
        public String f203505h;

        /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$a */
        public class C70419a implements View.OnClickListener {
            public C70419a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MallEditText.this.f203484g.dismissDropDown();
                C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$b */
        public class C70420b implements View.OnClickListener {
            public C70420b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76415b.wx0().zx0((List<C76574a>) null);
                MallEditText.this.setInput((C76574a) null);
                C70418a aVar = MallEditText.this.f203487j;
                aVar.f203503f = new LinkedList();
                ((ArrayList) aVar.f203501d).clear();
                aVar.f203502e = false;
                MallEditText.this.f203487j.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$c */
        public class C70421c implements View.OnClickListener {
            public C70421c() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MallEditText.this.f203484g.dismissDropDown();
                C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$d */
        public class C70422d extends Filter {

            /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$d$a */
            public class C70423a implements Runnable {
                public C70423a() {
                }

                public void run() {
                    MallEditText.this.f203484g.dismissDropDown();
                }
            }

            /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$d$b */
            public class C70424b implements Runnable {
                public C70424b() {
                }

                public void run() {
                    MallEditText.this.f203484g.dismissDropDown();
                }
            }

            /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$a$d$c */
            public class C70425c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C76574a f203513d;

                public C70425c(C76574a aVar) {
                    this.f203513d = aVar;
                }

                public void run() {
                    MallEditText mallEditText = MallEditText.this;
                    C76574a aVar = this.f203513d;
                    mallEditText.f203499y = aVar;
                    if (!Util.isNullOrNil(aVar.f224104b)) {
                        MallEditText mallEditText2 = MallEditText.this;
                        mallEditText2.f203483f.setText(mallEditText2.f203499y.f224104b);
                        MallEditText.this.f203483f.setVisibility(0);
                    } else {
                        MallEditText.this.f203483f.setText("");
                        MallEditText.this.f203483f.setVisibility(8);
                    }
                    MallEditText.this.f203484g.dismissDropDown();
                }
            }

            public C70422d(C70451a aVar) {
            }

            public synchronized Filter.FilterResults performFiltering(CharSequence charSequence) {
                int[] iArr;
                CharSequence charSequence2 = charSequence;
                synchronized (this) {
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    ArrayList arrayList = new ArrayList();
                    String a = charSequence2 != null ? C76575b.m92141a(charSequence.toString()) : "";
                    if (a.equals(C70418a.this.f203505h)) {
                        MallEditText.this.f203484g.post(new C70423a());
                        return filterResults;
                    }
                    C70418a aVar = C70418a.this;
                    aVar.f203505h = a;
                    boolean a2 = MallEditText.this.mo97003a();
                    boolean z = false;
                    if (a2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105918d("MicroMsg.MallEditText", "performFiltering " + charSequence2);
                        for (C76574a next : C70418a.this.f203503f) {
                            if (next.f224103a.equals(C70418a.this.f203505h)) {
                                next.f224107e = C76574a.f224101f;
                                arrayList.clear();
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            MallEditText mallEditText = MallEditText.this;
                            if (mallEditText.f203498x == null) {
                                try {
                                    mallEditText.f203498x = C15131b.m14241e(mallEditText.getContext());
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.MallEditText", e, "", new Object[0]);
                                }
                            }
                            List<String[]> list = MallEditText.this.f203498x;
                            if (list != null) {
                                Iterator<String[]> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String[] next2 = it.next();
                                    String a3 = C76575b.m92141a(next2[2]);
                                    String str = C70418a.this.f203505h;
                                    if (str.equals(a3)) {
                                        iArr = C76574a.f224101f;
                                    } else {
                                        if (a3 != null && str.length() == a3.length()) {
                                            int[] iArr2 = {-1, -1};
                                            int length = str.length() - 1;
                                            int i = 0;
                                            while (true) {
                                                if (length <= 0) {
                                                    break;
                                                }
                                                if (a3.charAt(length) != str.charAt(length)) {
                                                    i++;
                                                    if (i > 2) {
                                                        break;
                                                    }
                                                    iArr2[i - 1] = length;
                                                }
                                                length--;
                                            }
                                            if (i <= 2) {
                                                iArr = iArr2;
                                            }
                                        }
                                        iArr = C76574a.f224102g;
                                    }
                                    int[] iArr3 = C76574a.f224101f;
                                    if (iArr3.equals(iArr)) {
                                        C76574a aVar2 = new C76574a(a3, next2[1], 1);
                                        aVar2.f224107e = iArr3;
                                        arrayList.clear();
                                        arrayList.add(aVar2);
                                        break;
                                    } else if (!C76574a.f224102g.equals(iArr) && arrayList.size() < 5) {
                                        C76574a aVar3 = new C76574a(a3, next2[1], 1);
                                        aVar3.f224107e = iArr;
                                        arrayList.add(aVar3);
                                    }
                                }
                            }
                        }
                        Log.m105918d("MicroMsg.MallEditText", " search phone number cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms ");
                        z = true;
                    } else if (!Util.isNullOrNil(C70418a.this.f203505h)) {
                        Log.m105918d("MicroMsg.MallEditText", "performFiltering " + charSequence2);
                        for (C76574a next3 : C70418a.this.f203503f) {
                            if (next3.f224103a.startsWith(C70418a.this.f203505h)) {
                                arrayList.add(next3);
                            }
                        }
                    } else {
                        arrayList.addAll(C70418a.this.f203503f);
                    }
                    if (arrayList.size() == 0) {
                        MallEditText.this.f203484g.post(new C70424b());
                    } else {
                        if (arrayList.size() == 1 && MallEditText.this.mo97003a()) {
                            C76574a aVar4 = (C76574a) arrayList.get(0);
                            if (C76574a.f224101f.equals(aVar4.f224107e)) {
                                MallEditText.this.f203484g.post(new C70425c(aVar4));
                            }
                        }
                        C70418a aVar5 = C70418a.this;
                        List<C76574a> list2 = aVar5.f203501d;
                        aVar5.f203501d = arrayList;
                        aVar5.f203502e = z;
                        filterResults.count = arrayList.size();
                        filterResults.values = C70418a.this.f203501d;
                        Log.m105918d("MicroMsg.MallEditText", "results.count " + filterResults.count);
                        list2.clear();
                        return filterResults;
                    }
                    z = false;
                    C70418a aVar52 = C70418a.this;
                    List<C76574a> list22 = aVar52.f203501d;
                    aVar52.f203501d = arrayList;
                    aVar52.f203502e = z;
                    filterResults.count = arrayList.size();
                    filterResults.values = C70418a.this.f203501d;
                    Log.m105918d("MicroMsg.MallEditText", "results.count " + filterResults.count);
                    list22.clear();
                    return filterResults;
                }
            }

            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            }
        }

        public C70418a(C70451a aVar) {
        }

        /* renamed from: a */
        public synchronized C76574a getItem(int i) {
            if (this.f203502e) {
                if (i == 0) {
                    return null;
                }
                if (i > this.f203501d.size()) {
                    return null;
                }
                return this.f203501d.get(i - 1);
            } else if (i >= this.f203501d.size()) {
                return null;
            } else {
                return this.f203501d.get(i);
            }
        }

        public int getCount() {
            if (this.f203502e) {
                return this.f203501d.size() + 2;
            }
            if (this.f203501d.size() > 0) {
                return this.f203501d.size() + 1;
            }
            return 0;
        }

        public Filter getFilter() {
            Log.m105918d("MicroMsg.MallEditText", "getFilter");
            if (this.f203504g == null) {
                this.f203504g = new C70422d((C70451a) null);
            }
            return this.f203504g;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            if (!this.f203502e) {
                return i < this.f203501d.size() ? 0 : 1;
            }
            if (i == 0) {
                return 2;
            }
            return i <= this.f203501d.size() ? 0 : 3;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C70427c cVar;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null) {
                    view = View.inflate(MallEditText.this.getContext(), C0966R.C0971layout.bq5, (ViewGroup) null);
                    cVar = new C70427c(MallEditText.this, (C70451a) null);
                    cVar.f203515a = (TextView) view.findViewById(C0966R.C0970id.glx);
                    cVar.f203516b = (TextView) view.findViewById(C0966R.C0970id.glw);
                    view.setTag(cVar);
                } else {
                    cVar = (C70427c) view.getTag();
                }
                C76574a a = getItem(i);
                if (a == null || cVar == null || cVar.f203515a == null || cVar.f203516b == null) {
                    return view;
                }
                String b = C76575b.m92142b(a.f224103a);
                Log.m105918d("MicroMsg.MallEditText", "record.record " + b + ", record.name " + a.f224104b);
                if (!C76574a.f224101f.equals(a.f224107e)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
                    for (int i2 : a.f224107e) {
                        if (i2 >= 0) {
                            if (i2 >= 7) {
                                i2 += 2;
                            } else if (i2 >= 3) {
                                i2++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), i2, i2 + 1, 34);
                        }
                    }
                    cVar.f203515a.setText(spannableStringBuilder);
                } else {
                    cVar.f203515a.setText(b);
                }
                String str = a.f224104b;
                if (str == null || Util.isNullOrNil(str.trim())) {
                    cVar.f203516b.setText("");
                } else {
                    cVar.f203516b.setText(MallEditText.this.getResources().getString(C0966R.string.gp5, new Object[]{a.f224104b}));
                }
                view.setBackgroundResource(C0966R.C0969drawable.f4855pa);
                return view;
            } else if (itemViewType == 1) {
                View inflate = View.inflate(MallEditText.this.getContext(), C0966R.C0971layout.bq6, (ViewGroup) null);
                inflate.setOnClickListener(new C70420b());
                return inflate;
            } else if (itemViewType == 2) {
                View inflate2 = View.inflate(MallEditText.this.getContext(), C0966R.C0971layout.bq4, (ViewGroup) null);
                inflate2.setOnClickListener(new C70419a());
                return inflate2;
            } else if (itemViewType != 3) {
                return view;
            } else {
                View inflate3 = View.inflate(MallEditText.this.getContext(), C0966R.C0971layout.bq6, (ViewGroup) null);
                ((TextView) inflate3).setText(C0966R.string.gou);
                inflate3.setOnClickListener(new C70421c());
                return inflate3;
            }
        }

        public int getViewTypeCount() {
            return 4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$b */
    public interface C70426b {
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText$c */
    public class C70427c {

        /* renamed from: a */
        public TextView f203515a;

        /* renamed from: b */
        public TextView f203516b;

        public C70427c(MallEditText mallEditText, C70451a aVar) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MallEditText(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10)
            r0 = 0
            r8.f203487j = r0
            java.lang.String r1 = ""
            r8.f203488n = r1
            r8.f203489o = r1
            r2 = 1
            r8.f203490p = r2
            r8.f203491q = r2
            r3 = -1
            r8.f203492r = r3
            r8.f203493s = r2
            r4 = 19
            r8.f203494t = r4
            r8.f203495u = r3
            r5 = 0
            r8.f203497w = r5
            r8.f203499y = r0
            r8.f203500z = r2
            r8.f203480A = r5
            int[] r6 = tb3.C77881d.f226909c
            android.content.res.TypedArray r10 = r9.obtainStyledAttributes(r10, r6, r11, r5)
            r11 = 7
            int r11 = r10.getResourceId(r11, r5)
            if (r11 == 0) goto L_0x0038
            java.lang.String r11 = r9.getString(r11)
            r8.f203488n = r11
        L_0x0038:
            r11 = 8
            int r11 = r10.getResourceId(r11, r5)
            if (r11 == 0) goto L_0x0046
            java.lang.String r11 = r9.getString(r11)
            r8.f203489o = r11
        L_0x0046:
            r11 = 4
            int r11 = r10.getInteger(r11, r2)
            r8.f203490p = r11
            r11 = 3
            boolean r11 = r10.getBoolean(r11, r2)
            r8.f203500z = r11
            int r11 = r10.getInt(r5, r4)
            r8.f203494t = r11
            boolean r11 = r10.getBoolean(r2, r2)
            r8.f203491q = r11
            r11 = 2
            int r4 = r10.getInteger(r11, r3)
            r8.f203492r = r4
            r4 = 6
            int r6 = r10.getInteger(r4, r5)
            r8.f203495u = r6
            r6 = 5
            int r6 = r10.getInteger(r6, r6)
            r8.f203496v = r6
            r10.recycle()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r9)
            r6 = 2131497091(0x7f0c1083, float:1.8617765E38)
            android.view.View r10 = r10.inflate(r6, r8, r2)
            r6 = 2131316045(0x7f094d4d, float:1.825056E38)
            android.view.View r6 = r10.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r8.f203483f = r6
            r6 = 2131305970(0x7f0925f2, float:1.8230126E38)
            android.view.View r6 = r10.findViewById(r6)
            android.widget.AutoCompleteTextView r6 = (android.widget.AutoCompleteTextView) r6
            r8.f203484g = r6
            boolean r6 = kg3.C76577a.m92147C(r9)
            r7 = 2131165591(0x7f070197, float:1.7945403E38)
            if (r6 == 0) goto L_0x00bb
            android.widget.AutoCompleteTextView r6 = r8.f203484g
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getDimensionPixelSize(r7)
            float r9 = (float) r9
            android.content.Context r7 = r8.getContext()
            float r7 = kg3.C76577a.m92174y(r7)
            float r9 = r9 * r7
            r6.setTextSize(r5, r9)
            goto L_0x00c5
        L_0x00bb:
            android.widget.AutoCompleteTextView r6 = r8.f203484g
            int r9 = kg3.C76577a.m92157h(r9, r7)
            float r9 = (float) r9
            r6.setTextSize(r5, r9)
        L_0x00c5:
            r9 = 2131306432(0x7f0927c0, float:1.8231063E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f203485h = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "setFormat editType:"
            r9.append(r10)
            int r10 = r8.f203495u
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.MallEditText"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            int r6 = r8.f203496v
            r9.setImeOptions(r6)
            int r9 = r8.f203495u
            if (r9 == 0) goto L_0x010b
            if (r9 == r2) goto L_0x00f7
            goto L_0x011c
        L_0x00f7:
            r9 = 13
            r8.f203493s = r9
            r8.f203492r = r9
            r8.f203490p = r11
            r9 = 2131234585(0x7f080f19, float:1.808534E38)
            r8.setInfoTvImageResource(r9)
            android.widget.ImageView r9 = r8.f203485h
            r9.setVisibility(r5)
            goto L_0x011e
        L_0x010b:
            boolean r9 = r8.f203500z
            if (r9 != 0) goto L_0x011c
            android.widget.ImageView r9 = r8.f203485h
            r6 = 2131234063(0x7f080d0f, float:1.8084281E38)
            r9.setImageResource(r6)
            android.widget.ImageView r9 = r8.f203485h
            r9.setVisibility(r5)
        L_0x011c:
            r8.f203490p = r2
        L_0x011e:
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            com.tencent.mm.plugin.recharge.ui.a r6 = new com.tencent.mm.plugin.recharge.ui.a
            r6.<init>(r8)
            r9.addTextChangedListener(r6)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setOnFocusChangeListener(r8)
            java.lang.String r9 = r8.f203488n
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x013c
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            java.lang.String r6 = r8.f203488n
            r9.setHint(r6)
        L_0x013c:
            int r9 = r8.f203490p
            if (r9 != r11) goto L_0x014b
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            com.tencent.mm.plugin.recharge.ui.b r11 = new com.tencent.mm.plugin.recharge.ui.b
            r11.<init>(r8)
            r9.setKeyListener(r11)
            goto L_0x0157
        L_0x014b:
            android.widget.AutoCompleteTextView r11 = r8.f203484g
            r11.setInputType(r9)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            int r11 = r8.f203490p
            r9.setRawInputType(r11)
        L_0x0157:
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            int r11 = r8.f203494t
            r9.setGravity(r11)
            boolean r9 = r8.f203491q
            if (r9 != 0) goto L_0x0181
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setEnabled(r5)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            android.content.res.Resources r11 = r8.getResources()
            r6 = 2131101252(0x7f060644, float:1.7814908E38)
            int r11 = r11.getColor(r6)
            r9.setTextColor(r11)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setFocusable(r5)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setClickable(r5)
        L_0x0181:
            boolean r9 = r8.f203500z
            if (r9 != 0) goto L_0x0197
            r8.f203497w = r2
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setEnabled(r5)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setFocusable(r5)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            r9.setClickable(r5)
            goto L_0x0199
        L_0x0197:
            r8.f203497w = r5
        L_0x0199:
            int r9 = r8.f203492r
            if (r9 == r3) goto L_0x01ad
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            android.text.InputFilter[] r11 = new android.text.InputFilter[r2]
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            int r6 = r8.f203492r
            r3.<init>(r6)
            r11[r5] = r3
            r9.setFilters(r11)
        L_0x01ad:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "initData editType:"
            r9.append(r11)
            int r11 = r8.f203495u
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
            int r9 = r8.f203495u
            if (r9 == r2) goto L_0x01c9
            goto L_0x0251
        L_0x01c9:
            java.lang.String r9 = "setMobileEditTv"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
            jg2.b r9 = jg2.C76415b.wx0()
            java.util.List r9 = r9.xx0()
            com.tencent.mm.plugin.recharge.ui.MallEditText$a r11 = new com.tencent.mm.plugin.recharge.ui.MallEditText$a
            r11.<init>(r0)
            r8.f203487j = r11
            r11.f203503f = r9
            java.util.List<kg2.a> r2 = r11.f203501d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            r11.f203502e = r5
            if (r9 == 0) goto L_0x01fd
            int r11 = r9.size()
            if (r11 <= 0) goto L_0x01fd
            java.lang.Object r10 = r9.get(r5)
            kg2.a r10 = (kg2.C76574a) r10
            r8.f203499y = r10
            r8.setInput(r10)
            goto L_0x0212
        L_0x01fd:
            java.util.List<java.lang.String[]> r11 = r8.f203498x
            if (r11 != 0) goto L_0x0212
            android.content.Context r11 = r8.getContext()     // Catch:{ Exception -> 0x020c }
            java.util.List r11 = wc3.C15131b.m14241e(r11)     // Catch:{ Exception -> 0x020c }
            r8.f203498x = r11     // Catch:{ Exception -> 0x020c }
            goto L_0x0212
        L_0x020c:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r11, r1, r2)
        L_0x0212:
            if (r9 == 0) goto L_0x021a
            int r9 = r9.size()
            if (r9 != 0) goto L_0x0240
        L_0x021a:
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.Object r9 = r9.mo119684e(r4, r0)
            java.lang.String r9 = (java.lang.String) r9
            android.widget.AutoCompleteTextView r10 = r8.f203484g
            r10.setText(r9)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            android.text.Editable r10 = r9.getText()
            int r10 = r10.length()
            r9.setSelection(r10)
            r8.mo97004b()
        L_0x0240:
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            com.tencent.mm.plugin.recharge.ui.MallEditText$a r10 = r8.f203487j
            r9.setAdapter(r10)
            android.widget.AutoCompleteTextView r9 = r8.f203484g
            com.tencent.mm.plugin.recharge.ui.c r10 = new com.tencent.mm.plugin.recharge.ui.c
            r10.<init>(r8)
            r9.setOnItemClickListener(r10)
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recharge.p093ui.MallEditText.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setInputForce(C76574a aVar) {
        this.f203499y = aVar;
        if (aVar != null) {
            KeyListener keyListener = this.f203484g.getKeyListener();
            this.f203484g.setKeyListener((KeyListener) null);
            this.f203484g.setText(aVar.f224103a);
            AutoCompleteTextView autoCompleteTextView = this.f203484g;
            autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
            this.f203484g.setKeyListener(keyListener);
            mo97004b();
            Log.m105918d("MicroMsg.MallEditText", "editTv.setText " + aVar.f224103a + ", name " + aVar.f224104b + ", isInputValid " + this.f203497w);
            if (Util.isNullOrNil(aVar.f224104b) || !this.f203497w) {
                this.f203483f.setText("");
                this.f203483f.setVisibility(8);
                return;
            }
            this.f203483f.setText(aVar.f224104b);
            this.f203483f.setVisibility(0);
            return;
        }
        this.f203484g.setText("");
        mo97004b();
        Log.m105918d("MicroMsg.MallEditText", "editTv.setText null");
        this.f203483f.setText("");
        this.f203483f.setVisibility(8);
    }

    /* renamed from: a */
    public boolean mo97003a() {
        if (this.f203495u != 1) {
            return this.f203484g.getText().length() >= this.f203493s;
        }
        String obj = this.f203484g.getText().toString();
        return obj.length() >= this.f203493s && obj.length() <= this.f203492r && PhoneNumberUtils.isGlobalPhoneNumber(C76575b.m92141a(obj));
    }

    /* renamed from: b */
    public final void mo97004b() {
        boolean a = mo97003a();
        if (a != this.f203497w) {
            Log.m105918d("MicroMsg.MallEditText", "View:" + this.f203489o + ", editType:" + this.f203495u + " inputValid change to " + a);
            this.f203497w = a;
            C70426b bVar = this.f203481d;
            if (bVar != null) {
                RechargeUI rechargeUI = (RechargeUI) bVar;
                if (!a) {
                    ((HashMap) rechargeUI.f203566A).clear();
                    rechargeUI.f203573e.setText("");
                    rechargeUI.f203574f.setVisibility(4);
                }
                rechargeUI.mo97048H7();
            }
            if (!a) {
                if (this.f203483f.getVisibility() == 0) {
                    this.f203483f.setText("");
                    this.f203483f.setVisibility(8);
                }
                this.f203499y = null;
            }
        }
        C70426b bVar2 = this.f203481d;
        if (bVar2 != null) {
            ((RechargeUI) bVar2).mo97055O7();
        }
    }

    public void getFocus() {
        this.f203484g.findFocus();
    }

    public C76574a getInputRecord() {
        C76574a aVar = this.f203499y;
        if (aVar != null) {
            return aVar;
        }
        C76574a aVar2 = new C76574a(getText(), this.f203483f.getText().toString(), 0);
        this.f203499y = aVar2;
        return aVar2;
    }

    public String getText() {
        return this.f203495u != 1 ? Util.nullAs(this.f203484g.getText().toString(), "") : Util.nullAs(this.f203484g.getText().toString(), "");
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f203482e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        Log.m105918d("MicroMsg.MallEditText", "View:" + this.f203489o + ", editType:" + this.f203495u + " onFocusChange to " + z);
        C70426b bVar = this.f203481d;
        if (bVar != null) {
            RechargeUI rechargeUI = (RechargeUI) bVar;
            if (!this.f203497w) {
                ((HashMap) rechargeUI.f203566A).clear();
                rechargeUI.f203573e.setText("");
                rechargeUI.f203574f.setVisibility(4);
            }
            rechargeUI.mo97048H7();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f203500z;
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f203484g.setEllipsize(truncateAt);
    }

    public void setHintStr(String str) {
        this.f203484g.setHint(str);
    }

    public void setImeOptions(int i) {
        this.f203484g.setImeOptions(i);
    }

    public void setInfoTvImageResource(int i) {
        this.f203486i = i == C0966R.C0969drawable.abe;
        this.f203485h.setImageResource(i);
    }

    public void setInfoTvOnClickListener(View.OnClickListener onClickListener) {
        this.f203485h.setOnClickListener(onClickListener);
    }

    public void setInput(C76574a aVar) {
        this.f203499y = aVar;
        if (aVar != null) {
            this.f203484g.setText(aVar.f224103a);
            AutoCompleteTextView autoCompleteTextView = this.f203484g;
            autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
            mo97004b();
            Log.m105918d("MicroMsg.MallEditText", "editTv.setText " + aVar.f224103a + ", name " + aVar.f224104b + ", isInputValid " + this.f203497w);
            if (Util.isNullOrNil(aVar.f224104b) || !this.f203497w) {
                this.f203483f.setText("");
                this.f203483f.setVisibility(8);
                return;
            }
            this.f203483f.setText(aVar.f224104b);
            this.f203483f.setVisibility(0);
            return;
        }
        this.f203484g.setText("");
        mo97004b();
        Log.m105918d("MicroMsg.MallEditText", "editTv.setText null");
        this.f203483f.setText("");
        this.f203483f.setVisibility(8);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f203484g.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f203484g.setOnEditorActionListener(onEditorActionListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f203482e = onFocusChangeListener;
    }

    public void setOnInputValidChangeListener(C70426b bVar) {
        this.f203481d = bVar;
    }

    public MallEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
