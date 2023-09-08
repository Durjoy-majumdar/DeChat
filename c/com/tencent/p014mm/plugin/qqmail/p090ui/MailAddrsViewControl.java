package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C27900o;
import ag2.C67038p;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import dg2.C75406b;
import dg2.C75407c;
import dg2.C75408d;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import p910lj.C76701a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl */
public class MailAddrsViewControl extends RelativeLayout {

    /* renamed from: q */
    public static final Pattern f203194q = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: d */
    public boolean f203195d = false;

    /* renamed from: e */
    public LinkedList<C67038p> f203196e = new LinkedList<>();

    /* renamed from: f */
    public AutoCompleteTextView f203197f;

    /* renamed from: g */
    public C70352e f203198g;

    /* renamed from: h */
    public MMHandler f203199h = new MMHandler();

    /* renamed from: i */
    public C70355f f203200i;

    /* renamed from: j */
    public GestureDetector f203201j;

    /* renamed from: n */
    public View f203202n;

    /* renamed from: o */
    public C70351d f203203o = null;

    /* renamed from: p */
    public GestureDetector.SimpleOnGestureListener f203204p = new C70350c();

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$a */
    public class C70347a implements View.OnClickListener {
        public C70347a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MailAddrsViewControl.this.f203197f.requestFocus();
            ((InputMethodManager) MailAddrsViewControl.this.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$b */
    public class C70348b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Button f203206d;

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$b$a */
        public class C70349a implements View.OnTouchListener {
            public C70349a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                View view2 = MailAddrsViewControl.this.f203202n;
                if (!(view2 == null || view2 == view || !view2.isSelected())) {
                    MailAddrsViewControl.this.f203202n.setSelected(false);
                    MailAddrsViewControl.this.f203202n = null;
                }
                MailAddrsViewControl mailAddrsViewControl = MailAddrsViewControl.this;
                mailAddrsViewControl.f203202n = view;
                if (mailAddrsViewControl.f203197f != null && motionEvent.getAction() == 0) {
                    Button button = C70348b.this.f203206d;
                    button.setSelected(!button.isSelected());
                    MailAddrsViewControl.this.f203197f.setVisibility(0);
                    MailAddrsViewControl.this.f203197f.requestFocus();
                    ((InputMethodManager) MailAddrsViewControl.this.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
                }
                GestureDetector gestureDetector = MailAddrsViewControl.this.f203201j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(motionEvent);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
                C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return onTouchEvent;
            }
        }

        public C70348b(Button button) {
            this.f203206d = button;
        }

        public void run() {
            this.f203206d.invalidate();
            this.f203206d.setOnTouchListener(new C70349a());
            MailAddrsViewControl.this.mo96850a();
            MailAddrsViewControl.this.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$c */
    public class C70350c extends GestureDetector.SimpleOnGestureListener {
        public C70350c() {
        }

        /* renamed from: a */
        public final void mo96869a() {
            C67038p pVar = (C67038p) MailAddrsViewControl.this.f203202n.getTag();
            MailAddrsViewControl mailAddrsViewControl = MailAddrsViewControl.this;
            C70355f fVar = mailAddrsViewControl.f203200i;
            if (fVar != null) {
                View view = mailAddrsViewControl.f203202n;
                fVar.getClass();
            }
            Intent intent = new Intent(MailAddrsViewControl.this.getContext(), MailAddrProfileUI.class);
            intent.putExtra("name", pVar.f192575e);
            intent.putExtra("addr", pVar.f192576f);
            intent.putExtra("can_compose", !MailAddrsViewControl.this.f203195d);
            Context context = MailAddrsViewControl.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "startActivity", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "startActivity", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            mo96869a();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            MailAddrsViewControl mailAddrsViewControl = MailAddrsViewControl.this;
            C70355f fVar = mailAddrsViewControl.f203200i;
            if (!(fVar == null || (view = mailAddrsViewControl.f203202n) == null)) {
                C67038p pVar = (C67038p) view.getTag();
                fVar.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            if (!MailAddrsViewControl.this.f203195d) {
                mo96869a();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$8", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$d */
    public interface C70351d {
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$e */
    public static class C70352e extends BaseAdapter implements Filterable {

        /* renamed from: d */
        public List<C67038p> f203210d;

        /* renamed from: e */
        public final Object f203211e = new Object();

        /* renamed from: f */
        public Context f203212f;

        /* renamed from: g */
        public ArrayList<C67038p> f203213g;

        /* renamed from: h */
        public C70353a f203214h;

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$e$a */
        public class C70353a extends Filter {
            public C70353a(C70347a aVar) {
            }

            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                C70352e eVar = C70352e.this;
                if (eVar.f203213g == null) {
                    synchronized (eVar.f203211e) {
                        C70352e.this.f203213g = new ArrayList<>(C70352e.this.f203210d);
                    }
                }
                if (charSequence == null || charSequence.length() == 0) {
                    synchronized (C70352e.this.f203211e) {
                        ArrayList arrayList = new ArrayList(C70352e.this.f203213g);
                        filterResults.values = arrayList;
                        filterResults.count = arrayList.size();
                    }
                } else {
                    String lowerCase = charSequence.toString().toLowerCase();
                    ArrayList<C67038p> arrayList2 = C70352e.this.f203213g;
                    int size = arrayList2.size();
                    ArrayList arrayList3 = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        C67038p pVar = arrayList2.get(i);
                        if (pVar.f192575e.toLowerCase().contains(lowerCase) || pVar.f192576f.toLowerCase().contains(lowerCase)) {
                            arrayList3.add(pVar);
                        }
                    }
                    filterResults.values = arrayList3;
                    filterResults.count = arrayList3.size();
                }
                return filterResults;
            }

            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                C70352e eVar = C70352e.this;
                eVar.f203210d = (List) filterResults.values;
                if (filterResults.count > 0) {
                    eVar.notifyDataSetChanged();
                    return;
                }
                eVar.f203210d = new ArrayList(C70352e.this.f203213g);
                C70352e.this.notifyDataSetInvalidated();
            }
        }

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$e$b */
        public class C70354b {

            /* renamed from: a */
            public TextView f203216a;

            /* renamed from: b */
            public TextView f203217b;

            /* renamed from: c */
            public CheckBox f203218c;

            public C70354b(C70352e eVar, C70347a aVar) {
            }
        }

        public C70352e(Context context, List<C67038p> list) {
            this.f203212f = context;
            this.f203210d = list;
        }

        public int getCount() {
            return this.f203210d.size();
        }

        public Filter getFilter() {
            if (this.f203214h == null) {
                this.f203214h = new C70353a((C70347a) null);
            }
            return this.f203214h;
        }

        public Object getItem(int i) {
            return this.f203210d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            if (view == null) {
                view2 = View.inflate(this.f203212f, C0966R.C0971layout.f359933bp1, (ViewGroup) null);
                C70354b bVar = new C70354b(this, (C70347a) null);
                bVar.f203216a = (TextView) view2.findViewById(C0966R.C0970id.i9o);
                bVar.f203217b = (TextView) view2.findViewById(C0966R.C0970id.i9l);
                bVar.f203218c = (CheckBox) view2.findViewById(C0966R.C0970id.i9p);
                view2.setTag(bVar);
            } else {
                view2 = (ViewGroup) view;
            }
            C67038p pVar = this.f203210d.get(i);
            C70354b bVar2 = (C70354b) view2.getTag();
            bVar2.f203216a.setText(pVar.f192575e);
            bVar2.f203217b.setText(pVar.f192576f);
            bVar2.f203218c.setVisibility(8);
            view2.setBackgroundColor(this.f203212f.getResources().getColor(C0966R.color.al6));
            return view2;
        }

        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl$f */
    public static abstract class C70355f {
    }

    public MailAddrsViewControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f203201j = new GestureDetector(context, this.f203204p);
    }

    /* renamed from: a */
    public void mo96850a() {
        MailAddrsViewControl mailAddrsViewControl = this;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < childCount) {
            View childAt = mailAddrsViewControl.getChildAt(i);
            if (childAt.getVisibility() != 8 || (childAt instanceof AutoCompleteTextView)) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (width == 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
                    width = childAt.getMeasuredWidth();
                }
                AutoCompleteTextView autoCompleteTextView = mailAddrsViewControl.f203197f;
                if (autoCompleteTextView != null && i == childCount - 1 && !autoCompleteTextView.isFocused()) {
                    width = 0;
                }
                if (i2 + width > measuredWidth) {
                    i3 += height;
                    i2 = 0;
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.setMargins(i2, i3, layoutParams.rightMargin, layoutParams.bottomMargin);
                childAt.setLayoutParams(layoutParams);
                i2 += width;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = childAt;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i++;
            mailAddrsViewControl = this;
        }
    }

    /* renamed from: b */
    public void mo96851b(C67038p pVar) {
        boolean z;
        if (pVar != null) {
            Iterator<C67038p> it = this.f203196e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f192576f.equalsIgnoreCase(pVar.f192576f)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.boz, (ViewGroup) null);
                Button button = (Button) viewGroup.findViewById(C0966R.C0970id.i_b);
                viewGroup.removeView((View) button.getParent());
                button.setText(pVar.f192575e);
                if (this.f203195d) {
                    button.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                button.setTag("" + this.f203196e.size());
                View view = (View) button.getParent();
                button.setTag(pVar);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTag(pVar);
                addView(view, this.f203196e.size());
                this.f203196e.add(pVar);
                this.f203199h.postDelayed(new C70348b(button), 100);
            }
        }
    }

    /* renamed from: c */
    public void mo96852c(List<C67038p> list, boolean z) {
        if (list != null && list.size() != 0) {
            if (z) {
                removeAllViews();
                this.f203196e.clear();
                mo96850a();
                invalidate();
            }
            for (C67038p b : list) {
                mo96851b(b);
            }
        }
    }

    /* renamed from: d */
    public boolean mo96853d() {
        String trim = this.f203197f.getEditableText().toString().trim();
        return !Util.isNullOrNil(trim) && f203194q.matcher(trim).matches();
    }

    /* renamed from: e */
    public final void mo96854e(String str, boolean z) {
        String trim = str.trim();
        if (trim.length() != 0) {
            ArrayList arrayList = (ArrayList) ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().f233202b.mo91026e(trim);
            if (arrayList.size() > 0) {
                mo96851b((C67038p) arrayList.get(0));
                this.f203197f.setText("");
            } else if (f203194q.matcher(trim).matches()) {
                C67038p pVar = new C67038p();
                pVar.f192575e = trim;
                pVar.f192576f = trim;
                pVar.f192577g = 0;
                mo96851b(pVar);
                this.f203197f.setText("");
            } else if (z) {
                C70351d dVar = this.f203203o;
                if (dVar != null) {
                    ComposeUI composeUI = ComposeUI.this;
                    C76912y0.m92775n(composeUI, composeUI.getString(C0966R.string.hl4), 1500);
                } else {
                    C76701a.makeText(getContext(), (int) C0966R.string.hl4, 2000).show();
                }
                this.f203197f.setText(trim);
                this.f203197f.setSelection(trim.length());
            } else {
                C70351d dVar2 = this.f203203o;
                if (dVar2 != null) {
                    ComposeUI.C70329o oVar = (ComposeUI.C70329o) dVar2;
                    C76879j.m92750u(ComposeUI.this.getContext(), ComposeUI.this.getString(C0966R.string.hl4), "", new C70361a(oVar, this), new C70363b(oVar, this));
                }
            }
        }
    }

    /* renamed from: f */
    public void mo96855f(C67038p pVar) {
        for (int i = 0; i < this.f203196e.size(); i++) {
            if (pVar.f192576f.equalsIgnoreCase(this.f203196e.get(i).f192576f)) {
                removeViewAt(i);
                this.f203196e.remove(i);
                mo96850a();
                invalidate();
                return;
            }
        }
    }

    /* renamed from: g */
    public boolean mo96856g(boolean z) {
        Iterator<C67038p> it = this.f203196e.iterator();
        while (it.hasNext()) {
            if (!f203194q.matcher(it.next().f192576f).matches()) {
                return false;
            }
        }
        return !z || this.f203196e.size() > 0;
    }

    public String getAddrsString() {
        if (mo96853d()) {
            mo96854e(this.f203197f.getEditableText().toString(), false);
        }
        String str = "";
        for (int i = 0; i < this.f203196e.size(); i++) {
            C67038p pVar = this.f203196e.get(i);
            if (i != 0) {
                str = str + ",";
            }
            str = str + pVar.f192576f;
        }
        return str;
    }

    public String[] getMailAddrStringArray() {
        String[] strArr = new String[this.f203196e.size()];
        for (int i = 0; i < this.f203196e.size(); i++) {
            C67038p pVar = this.f203196e.get(i);
            strArr[i] = pVar.f192575e + " " + pVar.f192576f;
        }
        return strArr;
    }

    public LinkedList<C67038p> getMailAddrs() {
        return this.f203196e;
    }

    public int getSize() {
        return this.f203196e.size();
    }

    public void setAddrsAdapter(C70352e eVar) {
        AutoCompleteTextView autoCompleteTextView = this.f203197f;
        if (autoCompleteTextView != null && eVar != null) {
            this.f203198g = eVar;
            autoCompleteTextView.setAdapter(eVar);
        }
    }

    public void setEditable(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        this.f203195d = z;
        if (z && this.f203197f == null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof AutoCompleteTextView) {
                    this.f203197f = (AutoCompleteTextView) childAt;
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof AutoCompleteTextView) {
                            this.f203197f = (AutoCompleteTextView) childAt2;
                        }
                    }
                }
                if (this.f203197f != null) {
                    break;
                }
                i++;
            }
            AutoCompleteTextView autoCompleteTextView2 = this.f203197f;
            if (autoCompleteTextView2 != null) {
                autoCompleteTextView2.setDropDownBackgroundResource(C0966R.C0969drawable.f357319bk0);
                setOnClickListener(new C70347a());
                this.f203197f.setOnItemClickListener(new C70375e(this));
                this.f203197f.setOnEditorActionListener(new C75406b(this));
                this.f203197f.setOnKeyListener(new C75407c(this));
                this.f203197f.addTextChangedListener(new C75408d(this));
                this.f203197f.setOnFocusChangeListener(new C70376f(this));
            }
        } else if (!z && (autoCompleteTextView = this.f203197f) != null) {
            autoCompleteTextView.setVisibility(8);
        }
    }

    public void setInvalidMailAddrListener(C70351d dVar) {
        this.f203203o = dVar;
    }

    public void setMailAdds(List<C67038p> list) {
        if (list != null) {
            for (int i = 0; i < this.f203196e.size(); i++) {
                C67038p pVar = this.f203196e.get(i);
                int i2 = 0;
                while (i2 < list.size() && !pVar.f192576f.equalsIgnoreCase(list.get(i2).f192576f)) {
                    i2++;
                }
                if (i2 == list.size()) {
                    mo96855f(pVar);
                }
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                C67038p pVar2 = list.get(i3);
                int i4 = 0;
                while (i4 < this.f203196e.size() && !pVar2.f192576f.equalsIgnoreCase(this.f203196e.get(i4).f192576f)) {
                    i4++;
                }
                if (i4 == this.f203196e.size()) {
                    mo96851b(pVar2);
                }
            }
        }
    }

    public void setOnActionListener(C70355f fVar) {
        this.f203200i = fVar;
    }
}
