package qw3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.weui.base.preference.CheckBoxPreference;
import com.tencent.weui.base.preference.PreferenceCategory;
import com.tencent.weui.base.preference.PreferenceSmallCategory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: qw3.b */
public class C89854b extends BaseAdapter implements C89853a {

    /* renamed from: d */
    public final C89855c f258277d;

    /* renamed from: e */
    public final LinkedList<String> f258278e = new LinkedList<>();

    /* renamed from: f */
    public final HashMap<String, Preference> f258279f = new HashMap<>();

    /* renamed from: g */
    public final HashSet<String> f258280g = new HashSet<>();

    /* renamed from: h */
    public final LinkedList<String> f258281h = new LinkedList<>();

    /* renamed from: i */
    public final HashMap<String, Integer> f258282i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, String> f258283j = new HashMap<>();

    /* renamed from: n */
    public final SharedPreferences f258284n;

    /* renamed from: o */
    public final Context f258285o;

    /* renamed from: p */
    public int[] f258286p = new int[0];

    /* renamed from: q */
    public boolean f258287q = false;

    /* renamed from: r */
    public boolean f258288r = false;

    /* renamed from: s */
    public Preference.OnPreferenceChangeListener f258289s;

    public C89854b(Context context, SharedPreferences sharedPreferences) {
        this.f258277d = new C89855c(context);
        this.f258285o = context;
        this.f258284n = sharedPreferences;
    }

    /* renamed from: d */
    public static String m112363d(Preference preference) {
        return preference.getClass().getName() + "L" + preference.getLayoutResource() + ExifInterface.LONGITUDE_WEST + preference.getWidgetLayoutResource();
    }

    /* renamed from: f */
    public static boolean m112364f(int i) {
        return i == C0966R.C0971layout.bcy || i == C0966R.C0971layout.bf4 || i == C0966R.C0971layout.bf7;
    }

    /* renamed from: g */
    public static void m112365g(Preference preference, SharedPreferences sharedPreferences) {
        if (preference instanceof CheckBoxPreference) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            if (checkBoxPreference.isPersistent()) {
                checkBoxPreference.f25005d = sharedPreferences.getBoolean(preference.getKey(), ((CheckBoxPreference) preference).mo8242b());
            }
        }
    }

    /* renamed from: a */
    public final void mo124136a(Preference preference, int i) {
        String str;
        if (preference.getKey() == null || preference.getKey().length() <= 0) {
            str = "_anonymous_pref@" + preference.hashCode();
        } else {
            str = preference.getKey();
        }
        this.f258279f.put(str, preference);
        LinkedList<String> linkedList = this.f258278e;
        if (i == -1) {
            i = linkedList.size();
        }
        linkedList.add(i, str);
        if (!this.f258282i.containsKey(m112363d(preference)) && !this.f258288r) {
            this.f258282i.put(m112363d(preference), Integer.valueOf(this.f258282i.size()));
        }
        if (preference.getDependency() != null) {
            this.f258283j.put(preference.getDependency() + "|" + preference.getKey(), preference.getKey());
        }
    }

    /* renamed from: b */
    public Preference mo124137b(String str) {
        return this.f258279f.get(str);
    }

    public int getCount() {
        return this.f258281h.size();
    }

    public Object getItem(int i) {
        return this.f258279f.get(this.f258281h.get(i));
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        Integer num;
        if (i <= this.f258281h.size() && (num = this.f258282i.get(m112363d(this.f258279f.get(this.f258281h.get(i))))) != null) {
            return num.intValue();
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = i;
        if (i2 > this.f258281h.size()) {
            return view;
        }
        Preference preference = this.f258279f.get(this.f258281h.get(i2));
        if (preference instanceof CheckBoxPreference) {
            preference.setOnPreferenceChangeListener(this.f258289s);
        }
        View view2 = preference.getView(!this.f258282i.containsKey(m112363d(preference)) ? null : view, viewGroup);
        int i3 = this.f258286p[i2];
        View findViewById = view2.findViewById(C0966R.C0970id.br8);
        int i4 = 0;
        if (findViewById == null) {
            C85975v4.m106304a("MicroMsg.WeUIPreferenceAdapter", "find content view error", new Object[0]);
            return view2;
        }
        View findViewById2 = view2.findViewById(16908312);
        if ((i3 & 4) == 0) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingRight = findViewById.getPaddingRight();
            int paddingTop = findViewById.getPaddingTop();
            int paddingBottom = findViewById.getPaddingBottom();
            int i5 = C0966R.C0969drawable.ar5;
            int paddingLeft2 = view2.getPaddingLeft();
            int paddingRight2 = view2.getPaddingRight();
            int paddingTop2 = view2.getPaddingTop();
            int paddingBottom2 = view2.getPaddingBottom();
            if ((i3 & 8) != 0) {
                i4 = (i2 == this.f258281h.size() + -1 || (i2 == this.f258281h.size() + -2 && (getItem(this.f258281h.size() + -1) instanceof PreferenceCategory)) || (i3 & 2) != 0) ? C0966R.C0969drawable.ags : C0966R.C0969drawable.bcr;
                i5 = C0966R.color.al6;
            } else if ((i3 & 16) != 0 || (i3 & 2) == 0) {
                i4 = C0966R.C0969drawable.bcr;
            }
            findViewById.setBackgroundResource(i4);
            findViewById.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(i4);
            }
            view2.setBackgroundResource(i5);
            view2.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
        }
        return view2;
    }

    public int getViewTypeCount() {
        if (!this.f258288r) {
            this.f258288r = true;
        }
        return Math.max(1, this.f258282i.size());
    }

    public void notifyDataSetChanged() {
        int i;
        this.f258281h.clear();
        Iterator<String> it = this.f258278e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!this.f258280g.contains(next)) {
                if (this.f258279f.get(next) == null) {
                    C85975v4.m106305b("MicroMsg.WeUIPreferenceAdapter", "not found pref by key " + next, new Object[0]);
                } else {
                    this.f258281h.add(next);
                }
            }
        }
        if (!this.f258281h.isEmpty() && m112364f(this.f258279f.get(this.f258281h.get(0)).getLayoutResource())) {
            mo124136a(new PreferenceSmallCategory(this.f258285o, (AttributeSet) null), 0);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f258281h.size(); i2++) {
            Preference preference = this.f258279f.get(this.f258281h.get(i2));
            if (i2 != 0) {
                Preference preference2 = this.f258279f.get(this.f258281h.get(i2 - 1));
            }
        }
        this.f258281h.removeAll(hashSet);
        int[] iArr = new int[this.f258281h.size()];
        this.f258286p = iArr;
        if (iArr.length > 0) {
            if (iArr.length == 1) {
                int layoutResource = this.f258279f.get(this.f258281h.get(0)).getLayoutResource();
                Preference preference3 = this.f258279f.get(this.f258281h.get(0));
                if (!m112364f(layoutResource)) {
                    this.f258286p[0] = 4;
                } else if (preference3 instanceof CheckBoxPreference) {
                    int[] iArr2 = this.f258286p;
                    iArr2[0] = iArr2[0] | 8;
                } else {
                    this.f258286p[0] = 3;
                }
                m112365g(this.f258279f.get(this.f258281h.get(0)), this.f258284n);
                super.notifyDataSetChanged();
                return;
            }
            for (i = 0; i < this.f258281h.size(); i++) {
                m112365g(this.f258279f.get(this.f258281h.get(i)), this.f258284n);
                Preference preference4 = this.f258279f.get(this.f258281h.get(i));
                int layoutResource2 = preference4.getLayoutResource();
                if (m112364f(layoutResource2)) {
                    if (preference4 instanceof CheckBoxPreference) {
                        int[] iArr3 = this.f258286p;
                        iArr3[i] = iArr3[i] | 8;
                    } else if (i == 0) {
                        int[] iArr4 = this.f258286p;
                        iArr4[i] = iArr4[i] | 1;
                    } else {
                        if (i == this.f258281h.size() - 1) {
                            int[] iArr5 = this.f258286p;
                            iArr5[i] = iArr5[i] | 2;
                        }
                        int layoutResource3 = this.f258279f.get(this.f258281h.get(i - 1)).getLayoutResource();
                        if (layoutResource3 != C0966R.C0971layout.bcy || layoutResource3 == C0966R.C0971layout.bf4 || layoutResource3 == C0966R.C0971layout.bf7) {
                            int[] iArr6 = this.f258286p;
                            iArr6[i] = iArr6[i] | 1;
                        }
                    }
                } else if (layoutResource2 != C0966R.C0971layout.bef) {
                    int[] iArr7 = this.f258286p;
                    iArr7[i] = iArr7[i] | 4;
                    if (i != 0) {
                        int i3 = i - 1;
                        int layoutResource4 = this.f258279f.get(this.f258281h.get(i3)).getLayoutResource();
                        if (m112364f(layoutResource4) || layoutResource4 == C0966R.C0971layout.bef) {
                            int[] iArr8 = this.f258286p;
                            iArr8[i3] = iArr8[i3] | 2;
                        }
                    }
                } else if (i == 0) {
                    int[] iArr9 = this.f258286p;
                    iArr9[i] = iArr9[i] | 4;
                } else {
                    int[] iArr10 = this.f258286p;
                    iArr10[i] = iArr10[i] | 16;
                    int i4 = i - 1;
                    int layoutResource5 = this.f258279f.get(this.f258281h.get(i4)).getLayoutResource();
                    if (layoutResource5 == C0966R.C0971layout.bcy || layoutResource5 == C0966R.C0971layout.bf4 || layoutResource5 == C0966R.C0971layout.bf7) {
                        int[] iArr11 = this.f258286p;
                        iArr11[i4] = iArr11[i4] | 2;
                    }
                }
            }
            super.notifyDataSetChanged();
        }
    }
}
