package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import androidx.camera.core.FocusMeteringAction;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import oa1.C117731d;
import pj3.C47511g;
import pj3.C77099e;
import pj3.C77102i;

/* renamed from: com.tencent.mm.ui.base.preference.a */
public class C73244a extends BaseAdapter implements C47511g {

    /* renamed from: d */
    public final C77102i f215120d;

    /* renamed from: e */
    public final LinkedList<String> f215121e = new LinkedList<>();

    /* renamed from: f */
    public final HashMap<String, Preference> f215122f = new HashMap<>();

    /* renamed from: g */
    public final HashSet<String> f215123g = new HashSet<>();

    /* renamed from: h */
    public final LinkedList<String> f215124h = new LinkedList<>();

    /* renamed from: i */
    public final HashMap<String, Integer> f215125i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, String> f215126j = new HashMap<>();

    /* renamed from: n */
    public final SharedPreferences f215127n;

    /* renamed from: o */
    public final Context f215128o;

    /* renamed from: p */
    public C6765c f215129p;

    /* renamed from: q */
    public int[] f215130q = new int[0];

    /* renamed from: r */
    public boolean f215131r = false;

    /* renamed from: s */
    public boolean f215132s = false;

    /* renamed from: t */
    public ListView f215133t;

    /* renamed from: u */
    public Preference.C6763a f215134u;

    /* renamed from: v */
    public MMHandler f215135v = new C73246b(Looper.getMainLooper());

    /* renamed from: w */
    public long f215136w = 0;

    /* renamed from: x */
    public long f215137x = 0;

    /* renamed from: com.tencent.mm.ui.base.preference.a$c */
    public interface C6765c {
        /* renamed from: a */
        void mo7749a(View view, Preference preference);
    }

    /* renamed from: com.tencent.mm.ui.base.preference.a$a */
    public class C73245a implements Comparator<Preference> {
        public C73245a() {
        }

        public int compare(Object obj, Object obj2) {
            return C73244a.this.mo72521d(((Preference) obj).f121285r) - C73244a.this.mo72521d(((Preference) obj2).f121285r);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.a$b */
    public class C73246b extends MMHandler {
        public C73246b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C73244a.this.mo101973t();
            C73244a.this.f215136w = System.currentTimeMillis();
        }
    }

    public C73244a(Context context, ListView listView, SharedPreferences sharedPreferences) {
        this.f215120d = new C77102i(context);
        this.f215128o = context;
        this.f215133t = listView;
        this.f215127n = sharedPreferences;
    }

    /* renamed from: q */
    public static String m86278q(Preference preference) {
        String str = preference.f121285r;
        if (str != null && str.length() > 0) {
            return preference.f121285r;
        }
        return "_anonymous_pref@" + preference.hashCode();
    }

    /* renamed from: r */
    public static String m86279r(Preference preference) {
        return preference.getClass().getName() + "L" + preference.mo7748q() + ExifInterface.LONGITUDE_WEST + preference.f121272H;
    }

    /* renamed from: s */
    public static boolean m86280s(int i) {
        return i == C0966R.C0971layout.bcy || i == C0966R.C0971layout.bf4 || i == C0966R.C0971layout.bf7;
    }

    /* renamed from: u */
    public static void m86281u(Preference preference, SharedPreferences sharedPreferences) {
        if (preference instanceof CheckBoxPreference) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            if (checkBoxPreference.f121290w) {
                checkBoxPreference.mo6805K(sharedPreferences.getBoolean(preference.f121285r, ((CheckBoxPreference) preference).mo6804J()));
            }
        }
        if (preference instanceof DialogPreference) {
            DialogPreference dialogPreference = (DialogPreference) preference;
            if (dialogPreference.f121290w) {
                String string = sharedPreferences.getString(preference.f121285r, (String) null);
                C77099e eVar = dialogPreference.f215037J;
                eVar.f225199h = string;
                if (eVar.f225200i.get(string) == null) {
                    dialogPreference.f215037J.getClass();
                } else {
                    dialogPreference.f215037J.getClass();
                }
            }
        }
        if (preference instanceof EditPreference) {
            EditPreference editPreference = (EditPreference) preference;
            if (editPreference.f121290w) {
                String string2 = sharedPreferences.getString(preference.f121285r, (String) null);
                editPreference.f215045M = string2;
                editPreference.mo7741E(string2);
            }
        }
    }

    /* renamed from: a */
    public Preference mo72519a(String str) {
        return this.f215122f.get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo72520b(int i) {
        this.f215131r = true;
        C77102i iVar = this.f215120d;
        XmlResourceParser xml = iVar.f225206a.getResources().getXml(i);
        try {
            iVar.mo107423c(xml, this, true);
            xml.close();
            this.f215131r = false;
            ListView listView = this.f215133t;
            if (listView != null) {
                listView.setAdapter(this);
                notifyDataSetChanged();
                return;
            }
            notifyDataSetChanged();
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: d */
    public int mo72521d(String str) {
        return this.f215121e.indexOf(str);
    }

    /* renamed from: f */
    public boolean mo72522f(String str) {
        return !this.f215123g.contains(str);
    }

    /* renamed from: g */
    public int mo72523g(String str) {
        LinkedList<String> linkedList = this.f215124h;
        if (linkedList == null) {
            return -1;
        }
        return linkedList.indexOf(str);
    }

    public int getCount() {
        return this.f215124h.size();
    }

    public Object getItem(int i) {
        return this.f215122f.get(this.f215124h.get(i));
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        Integer num;
        if (i <= this.f215124h.size() - 1 && (num = this.f215125i.get(m86279r(this.f215122f.get(this.f215124h.get(i))))) != null) {
            return num.intValue();
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2;
        int i2 = i;
        if (i2 > this.f215124h.size()) {
            return view;
        }
        Preference preference = this.f215122f.get(this.f215124h.get(i2));
        if (preference instanceof CheckBoxPreference) {
            preference.mo69920B(this.f215134u);
        }
        if (!this.f215125i.containsKey(m86279r(preference))) {
            viewGroup2 = viewGroup;
            view2 = null;
        } else {
            view2 = view;
            viewGroup2 = viewGroup;
        }
        View t = preference.mo2020t(view2, viewGroup2);
        t.setTag(C0966R.C0970id.f359572m92, this.f215124h.get(i2));
        int i3 = this.f215130q[i2];
        View findViewById = t.findViewById(C0966R.C0970id.br8);
        View findViewById2 = t.findViewById(C0966R.C0970id.krm);
        if (findViewById == null) {
            Log.m105918d("MicroMsg.MMPreferenceAdapter", "find content view error");
        }
        if (findViewById != null) {
            View findViewById3 = findViewById.findViewById(C0966R.C0970id.f359398kp3);
            findViewById.getPaddingLeft();
            findViewById.getPaddingRight();
            findViewById.getPaddingTop();
            findViewById.getPaddingBottom();
            int paddingLeft = t.getPaddingLeft();
            int paddingRight = t.getPaddingRight();
            int paddingTop = t.getPaddingTop();
            int paddingBottom = t.getPaddingBottom();
            if ((i3 & 2) != 0) {
                int paddingLeft2 = findViewById.getPaddingLeft();
                findViewById.setBackground(C74942w4.m89785b(this.f215128o, C0966R.attr.f2868u6));
                findViewById.setPadding(paddingLeft2, 0, 0, 0);
                if (!(findViewById3 == null || findViewById3.getBackground() == null)) {
                    findViewById3.setBackground((Drawable) null);
                }
            } else if (findViewById3 != null) {
                int paddingTop2 = findViewById3.getPaddingTop();
                int paddingBottom2 = findViewById3.getPaddingBottom();
                findViewById3.setBackground(C74942w4.m89785b(this.f215128o, C0966R.attr.f2868u6));
                findViewById3.setPadding(0, paddingTop2, 0, paddingBottom2);
                if (findViewById.getBackground() != null) {
                    findViewById.setBackground((Drawable) null);
                }
            }
            t.setBackgroundResource(C0966R.C0969drawable.ar5);
            t.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        if (findViewById2 != null) {
            if ((i3 & 1) != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C6765c cVar = this.f215129p;
        if (cVar != null) {
            cVar.mo7749a(t, preference);
        }
        return t;
    }

    public int getViewTypeCount() {
        if (!this.f215132s) {
            this.f215132s = true;
        }
        return Math.max(1, this.f215125i.size());
    }

    /* renamed from: h */
    public void mo72524h(Preference preference, int i) {
        mo101972p(preference, i);
        if (!this.f215131r) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public void mo72525i(Preference preference, boolean z) {
        mo101972p(preference, -1);
        if (z && !this.f215131r) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public boolean mo72526j(Preference preference) {
        if (preference == null) {
            return false;
        }
        String q = m86278q(preference);
        this.f215121e.remove(q);
        this.f215122f.remove(q);
        this.f215123g.remove(preference.f121285r);
        notifyDataSetChanged();
        return true;
    }

    /* renamed from: k */
    public void mo72527k(Preference preference) {
        mo72524h(preference, -1);
    }

    /* renamed from: l */
    public List<Preference> mo72528l() {
        ArrayList arrayList = new ArrayList(this.f215122f.values());
        Collections.sort(arrayList, new C73245a());
        return arrayList;
    }

    /* renamed from: n */
    public CheckBoxPreference mo72529n(String str, boolean z) {
        if (z) {
            if (this.f215123g.contains(str)) {
                return null;
            }
            this.f215123g.add(str);
        } else if (!this.f215123g.remove(str)) {
            return null;
        }
        notifyDataSetChanged();
        return null;
    }

    public void notifyDataSetChanged() {
        if (C85875k4.m106208w()) {
            int e = C117731d.m166007c().mo182443e("clicfg_hwmagic_mmpreference_notify_switch", 1, true, true);
            Log.m105919d("MicroMsg.MMPreferenceAdapter", "isHWMagicMMPreferenceNotifySwt() swt:%s", Integer.valueOf(e));
            if (e == 1) {
                Log.m105919d("MicroMsg.MMPreferenceAdapter", "MMPreferenceAdapter notifyDataSetChanged %s %s %s", Integer.valueOf(hashCode()), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.f215137x));
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f215137x;
                if (j == 0 || currentTimeMillis - j <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION || currentTimeMillis - this.f215136w >= 1000) {
                    mo101973t();
                    this.f215136w = currentTimeMillis;
                    return;
                }
                boolean hasMessages = this.f215135v.hasMessages(1);
                Log.m105925i("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s", Long.valueOf(this.f215136w), Long.valueOf(currentTimeMillis), Boolean.valueOf(hasMessages));
                if (!hasMessages) {
                    this.f215135v.sendEmptyMessageDelayed(1, 1000);
                    return;
                }
                return;
            }
        }
        mo101973t();
    }

    /* renamed from: o */
    public boolean mo72531o(String str) {
        return mo72526j(mo72519a(str));
    }

    /* renamed from: p */
    public final void mo101972p(Preference preference, int i) {
        String q = m86278q(preference);
        this.f215122f.put(q, preference);
        LinkedList<String> linkedList = this.f215121e;
        if (i == -1) {
            i = linkedList.size();
        }
        linkedList.add(i, q);
        if (!this.f215125i.containsKey(m86279r(preference)) && this.f215131r) {
            this.f215125i.put(m86279r(preference), Integer.valueOf(this.f215125i.size()));
        }
        if (preference.f121291x != null) {
            HashMap<String, String> hashMap = this.f215126j;
            hashMap.put(preference.f121291x + "|" + preference.f121285r, preference.f121285r);
        }
    }

    public void removeAll() {
        this.f215124h.clear();
        this.f215122f.clear();
        this.f215121e.clear();
        this.f215123g.clear();
        notifyDataSetChanged();
    }

    /* renamed from: t */
    public final void mo101973t() {
        this.f215124h.clear();
        Iterator<String> it = this.f215121e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!this.f215123g.contains(next)) {
                if (this.f215122f.get(next) == null) {
                    Log.m105920e("MicroMsg.MMPreferenceAdapter", "not found pref by key " + next);
                } else {
                    this.f215124h.add(next);
                }
            }
        }
        if (!this.f215124h.isEmpty()) {
            this.f215122f.get(this.f215124h.get(0)).mo7748q();
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f215124h.size(); i++) {
            Preference preference = this.f215122f.get(this.f215124h.get(i));
            if ((preference instanceof PreferenceCategory) && Util.isNullOrNil(preference.f121285r) && i != 0) {
                Preference preference2 = this.f215122f.get(this.f215124h.get(i - 1));
                if (preference2 instanceof PreferenceCategory) {
                    if (Util.isNullOrNil(preference2.f121285r) && (preference2.mo69928s() == null || preference2.mo69928s().toString().trim().length() <= 0)) {
                        hashSet.add(m86278q(preference2));
                    } else if (Util.isNullOrNil(preference.f121285r) && (preference.mo69928s() == null || preference.mo69928s().toString().trim().length() <= 0)) {
                        hashSet.add(m86278q(preference));
                    }
                }
            }
        }
        this.f215124h.removeAll(hashSet);
        int[] iArr = new int[this.f215124h.size()];
        this.f215130q = iArr;
        if (iArr.length <= 0) {
            super.notifyDataSetChanged();
        } else if (iArr.length == 1) {
            int q = this.f215122f.get(this.f215124h.get(0)).mo7748q();
            Preference preference3 = this.f215122f.get(this.f215124h.get(0));
            if (!m86280s(q)) {
                this.f215130q[0] = 4;
            } else if (preference3 instanceof CheckBoxPreference) {
                int[] iArr2 = this.f215130q;
                int i2 = iArr2[0] | 8;
                iArr2[0] = i2;
                iArr2[0] = i2 | 1;
            } else {
                this.f215130q[0] = 3;
            }
            m86281u(this.f215122f.get(this.f215124h.get(0)), this.f215127n);
            super.notifyDataSetChanged();
        } else {
            for (int i3 = 0; i3 < this.f215124h.size(); i3++) {
                m86281u(this.f215122f.get(this.f215124h.get(i3)), this.f215127n);
                Preference preference4 = this.f215122f.get(this.f215124h.get(i3));
                int q2 = preference4.mo7748q();
                if (m86280s(q2)) {
                    if (preference4 instanceof CheckBoxPreference) {
                        int[] iArr3 = this.f215130q;
                        iArr3[i3] = iArr3[i3] | 8;
                    }
                    if (i3 == 0) {
                        int[] iArr4 = this.f215130q;
                        int i4 = iArr4[i3] | 1;
                        iArr4[i3] = i4;
                        iArr4[i3] = i4 | 16;
                    } else {
                        if (i3 == this.f215124h.size() - 1) {
                            int[] iArr5 = this.f215130q;
                            iArr5[i3] = iArr5[i3] | 2;
                        }
                        int q3 = this.f215122f.get(this.f215124h.get(i3 - 1)).mo7748q();
                        if ((q3 != C0966R.C0971layout.bcy && q3 != C0966R.C0971layout.f359770am0 && q3 != C0966R.C0971layout.f7088xw) || q3 == C0966R.C0971layout.bf4 || q3 == C0966R.C0971layout.bf7) {
                            int[] iArr6 = this.f215130q;
                            iArr6[i3] = iArr6[i3] | 1;
                        }
                    }
                } else if (q2 != C0966R.C0971layout.bef) {
                    int[] iArr7 = this.f215130q;
                    int i5 = iArr7[i3] | 4;
                    iArr7[i3] = i5;
                    if (i3 == 0) {
                        iArr7[i3] = i5 | 16;
                    } else {
                        int i6 = i3 - 1;
                        int q4 = this.f215122f.get(this.f215124h.get(i6)).mo7748q();
                        if (m86280s(q4) || q4 == C0966R.C0971layout.bef) {
                            int[] iArr8 = this.f215130q;
                            iArr8[i6] = iArr8[i6] | 2;
                        }
                    }
                } else if (i3 == 0) {
                    int[] iArr9 = this.f215130q;
                    int i7 = iArr9[i3] | 4;
                    iArr9[i3] = i7;
                    iArr9[i3] = i7 | 16;
                } else {
                    int i8 = i3 - 1;
                    int q5 = this.f215122f.get(this.f215124h.get(i8)).mo7748q();
                    if (q5 == C0966R.C0971layout.bcy || q5 == C0966R.C0971layout.bf4 || q5 == C0966R.C0971layout.bf7) {
                        int[] iArr10 = this.f215130q;
                        iArr10[i8] = iArr10[i8] | 2;
                    }
                }
            }
            super.notifyDataSetChanged();
        }
    }
}
