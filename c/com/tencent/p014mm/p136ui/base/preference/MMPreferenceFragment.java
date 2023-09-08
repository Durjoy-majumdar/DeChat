package com.tencent.p014mm.p136ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.MoreTabUI;
import com.tencent.p014mm.p136ui.base.preference.DialogPreference;
import com.tencent.p014mm.p136ui.base.preference.EditPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import java.lang.ref.WeakReference;
import pj3.C47511g;

/* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment */
public abstract class MMPreferenceFragment extends MMFragment {

    /* renamed from: i */
    public static WeakReference<View> f215100i;

    /* renamed from: d */
    public C73244a f215101d;

    /* renamed from: e */
    public ListView f215102e;

    /* renamed from: f */
    public SharedPreferences f215103f;

    /* renamed from: g */
    public boolean f215104g = false;

    /* renamed from: h */
    public boolean f215105h;

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment$a */
    public class C73238a implements Preference.C6763a {
        public C73238a() {
        }

        /* renamed from: a */
        public boolean mo7744a(Preference preference, Object obj) {
            boolean z;
            if (!MMPreferenceFragment.this.f215104g && preference.mo69930u() && preference.f121288u) {
                MMPreferenceFragment.this.f215104g = true;
                if (preference instanceof CheckBoxPreference) {
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
                    checkBoxPreference.mo6805K(checkBoxPreference.mo6804J());
                    if (checkBoxPreference.f121290w) {
                        MMPreferenceFragment.this.f215103f.edit().putBoolean(preference.f121285r, checkBoxPreference.mo6804J()).commit();
                    }
                    MMPreferenceFragment.this.getClass();
                    z = true;
                } else {
                    z = false;
                }
                if (preference.f121285r != null) {
                    MMPreferenceFragment mMPreferenceFragment = MMPreferenceFragment.this;
                    mMPreferenceFragment.mo25884M(mMPreferenceFragment.f215101d, preference);
                }
                if (z) {
                    MMPreferenceFragment.this.f215101d.notifyDataSetChanged();
                }
                MMPreferenceFragment.this.f215104g = false;
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment$b */
    public class C73239b implements AdapterView.OnItemClickListener {

        /* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment$b$a */
        public class C73240a implements DialogPreference.C73227b {

            /* renamed from: a */
            public final /* synthetic */ DialogPreference f215108a;

            /* renamed from: b */
            public final /* synthetic */ Preference f215109b;

            public C73240a(DialogPreference dialogPreference, Preference preference) {
                this.f215108a = dialogPreference;
                this.f215109b = preference;
            }

            /* renamed from: a */
            public void mo101923a(boolean z) {
                if (z) {
                    MMPreferenceFragment mMPreferenceFragment = MMPreferenceFragment.this;
                    WeakReference<View> weakReference = MMPreferenceFragment.f215100i;
                    mMPreferenceFragment.getClass();
                    if (this.f215108a.f121290w) {
                        MMPreferenceFragment.this.f215103f.edit().putString(this.f215109b.f121285r, this.f215108a.f215037J.f225199h).commit();
                    }
                    MMPreferenceFragment.this.f215101d.notifyDataSetChanged();
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment$b$b */
        public class C73241b implements EditPreference.C73230c {

            /* renamed from: a */
            public final /* synthetic */ EditPreference f215111a;

            /* renamed from: b */
            public final /* synthetic */ Preference f215112b;

            public C73241b(EditPreference editPreference, Preference preference) {
                this.f215111a = editPreference;
                this.f215112b = preference;
            }

            /* renamed from: a */
            public void mo101927a(boolean z) {
                if (z) {
                    MMPreferenceFragment mMPreferenceFragment = MMPreferenceFragment.this;
                    WeakReference<View> weakReference = MMPreferenceFragment.f215100i;
                    mMPreferenceFragment.getClass();
                    if (this.f215111a.f121290w) {
                        MMPreferenceFragment.this.f215103f.edit().putString(this.f215112b.f121285r, this.f215111a.f215045M).commit();
                    }
                    MMPreferenceFragment.this.f215101d.notifyDataSetChanged();
                }
            }
        }

        public C73239b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= MMPreferenceFragment.this.f215102e.getHeaderViewsCount()) {
                Preference preference = (Preference) MMPreferenceFragment.this.f215101d.getItem(i - MMPreferenceFragment.this.f215102e.getHeaderViewsCount());
                if (preference.mo69930u() && preference.f121288u && !(preference instanceof CheckBoxPreference)) {
                    if (preference instanceof DialogPreference) {
                        DialogPreference dialogPreference = (DialogPreference) preference;
                        dialogPreference.mo101921I();
                        dialogPreference.f215039L = new C73240a(dialogPreference, preference);
                    }
                    if (preference instanceof EditPreference) {
                        EditPreference editPreference = (EditPreference) preference;
                        editPreference.mo101924I();
                        editPreference.f215043K = new C73241b(editPreference, preference);
                    }
                    MMPreferenceFragment mMPreferenceFragment = MMPreferenceFragment.this;
                    mMPreferenceFragment.getClass();
                    if (mMPreferenceFragment instanceof MoreTabUI) {
                        view.setSelected(true);
                        MMPreferenceFragment.f215100i = new WeakReference<>(view);
                    }
                    if (preference.f121285r != null) {
                        MMPreferenceFragment mMPreferenceFragment2 = MMPreferenceFragment.this;
                        mMPreferenceFragment2.mo25884M(mMPreferenceFragment2.f215101d, preference);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment$c */
    public class C73242c implements AdapterView.OnItemLongClickListener {
        public C73242c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < MMPreferenceFragment.this.f215102e.getHeaderViewsCount()) {
                return false;
            }
            int headerViewsCount = i - MMPreferenceFragment.this.f215102e.getHeaderViewsCount();
            MMPreferenceFragment mMPreferenceFragment = MMPreferenceFragment.this;
            return mMPreferenceFragment.mo25886N(mMPreferenceFragment.f215101d, (Preference) MMPreferenceFragment.this.f215101d.getItem(headerViewsCount), mMPreferenceFragment.f215102e);
        }
    }

    /* renamed from: K */
    public static void m86269K() {
        WeakReference<View> weakReference = f215100i;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            view.setSelected(false);
            f215100i = null;
        }
    }

    /* renamed from: L */
    public abstract int mo25882L();

    /* renamed from: M */
    public abstract boolean mo25884M(C47511g gVar, Preference preference);

    /* renamed from: N */
    public boolean mo25886N(C47511g gVar, Preference preference, View view) {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.be9;
    }

    public View getLayoutView() {
        return LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.be9, (ViewGroup) null);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f215105h = false;
        this.f215103f = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f215102e = (ListView) findViewById(16908298);
        C73244a aVar = new C73244a(getContext(), this.f215102e, this.f215103f);
        this.f215101d = aVar;
        aVar.f215134u = new C73238a();
        aVar.notifyDataSetChanged();
        this.f215102e.setAdapter(this.f215101d);
        this.f215102e.setOnItemClickListener(new C73239b());
        this.f215102e.setOnItemLongClickListener(new C73242c());
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        C73244a aVar = this.f215101d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void onStop() {
        super.onStop();
        m86269K();
    }
}
