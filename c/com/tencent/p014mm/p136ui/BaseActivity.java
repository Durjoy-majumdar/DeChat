package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.BaseActivity */
public abstract class BaseActivity extends AppCompatActivity {

    /* renamed from: y */
    public static final /* synthetic */ int f214170y = 0;
    private View actionbarView;

    /* renamed from: d */
    public ActionBar f214171d;

    /* renamed from: e */
    public TextView f214172e;

    /* renamed from: f */
    public TextView f214173f;

    /* renamed from: g */
    public View f214174g;

    /* renamed from: h */
    public View f214175h;

    /* renamed from: i */
    public ImageView f214176i;

    /* renamed from: j */
    public Context f214177j;

    /* renamed from: n */
    public int f214178n = 0;

    /* renamed from: o */
    public WeImageView f214179o;

    /* renamed from: p */
    public WeImageView f214180p;

    /* renamed from: q */
    public TextView f214181q;

    /* renamed from: r */
    public MenuItem f214182r;

    /* renamed from: s */
    public MenuItem f214183s;

    /* renamed from: t */
    public int f214184t;

    /* renamed from: u */
    public int f214185u;

    /* renamed from: v */
    public C73016e f214186v;

    /* renamed from: w */
    public boolean f214187w = false;

    /* renamed from: x */
    public LinkedList<C73015d> f214188x = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.BaseActivity$a */
    public class C73012a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem.OnMenuItemClickListener f214189d;

        public C73012a(BaseActivity baseActivity, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f214189d = onMenuItemClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f214189d.onMenuItemClick((MenuItem) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.BaseActivity$b */
    public class C73013b implements Runnable {
        public C73013b() {
        }

        public void run() {
            BaseActivity.this.supportInvalidateOptionsMenu();
        }
    }

    /* renamed from: com.tencent.mm.ui.BaseActivity$c */
    public enum C73014c {
        CUSTOM,
        BACK,
        CLOSE,
        NONE
    }

    /* renamed from: com.tencent.mm.ui.BaseActivity$d */
    public static final class C73015d {

        /* renamed from: a */
        public int f214196a = -1;

        /* renamed from: b */
        public int f214197b;

        /* renamed from: c */
        public boolean f214198c = true;

        /* renamed from: d */
        public boolean f214199d = true;

        /* renamed from: e */
        public String f214200e;

        /* renamed from: f */
        public View f214201f;

        /* renamed from: g */
        public View f214202g;

        /* renamed from: h */
        public View f214203h;

        /* renamed from: i */
        public C73016e f214204i = C73016e.CUSTOM;

        /* renamed from: j */
        public MenuItem.OnMenuItemClickListener f214205j;

        /* renamed from: k */
        public View.OnLongClickListener f214206k;
    }

    /* renamed from: com.tencent.mm.ui.BaseActivity$e */
    public enum C73016e {
        CUSTOM,
        TEXT,
        GREEN_TEXT,
        ADD,
        MORE,
        SEARCH,
        NONE
    }

    /* renamed from: L7 */
    private void m85890L7() {
        TextView textView = this.f214172e;
        if (textView != null) {
            if (this.f214187w) {
                textView.setTextColor(this.f214177j.getResources().getColor(C0966R.color.f3022ch));
            } else {
                textView.setTextColor(this.f214177j.getResources().getColor(C0966R.color.f3021cg));
            }
        }
    }

    /* renamed from: G7 */
    public void mo101258G7(int i, int i2, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener, C73016e eVar) {
        C73015d dVar = new C73015d();
        dVar.f214196a = i;
        dVar.f214197b = i2;
        dVar.f214200e = str;
        dVar.f214205j = onMenuItemClickListener;
        dVar.f214206k = onLongClickListener;
        dVar.f214204i = eVar;
        if (i2 == C0966R.C0969drawable.bsz && (str == null || str.length() <= 0)) {
            dVar.f214200e = getString(C0966R.string.f7369e7);
        }
        int i3 = dVar.f214196a;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f214188x.size()) {
                break;
            } else if (this.f214188x.get(i4).f214196a == i3) {
                C85975v4.m106304a("BaseActivity", "match menu, id ：" + i3 + ", remove it", new Object[0]);
                this.f214188x.remove(i4);
                break;
            } else {
                i4++;
            }
        }
        this.f214188x.add(dVar);
        new Handler().postDelayed(new C73013b(), 200);
    }

    /* renamed from: H7 */
    public void mo101259H7(int i) {
        if (this.f214171d != null) {
            this.f214178n = i;
            this.f214187w = C74933u4.m89770g(i);
            this.f214171d.mo91112w(new ColorDrawable(this.f214178n));
            getWindow().setStatusBarColor(this.f214178n);
            mo101261J7();
            if (this.f214187w) {
                this.f214176i.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            } else {
                this.f214176i.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            }
            mo101262K7();
            m85890L7();
            TextView textView = this.f214173f;
            if (textView != null) {
                if (this.f214187w) {
                    textView.setTextColor(this.f214177j.getResources().getColor(C0966R.color.f3018ce));
                } else {
                    textView.setTextColor(this.f214177j.getResources().getColor(C0966R.color.f3017cd));
                }
            }
            WeImageView weImageView = this.f214180p;
            if (weImageView != null) {
                if (this.f214187w) {
                    weImageView.setImageResource(C0966R.C0969drawable.bt4);
                } else {
                    weImageView.setImageResource(C0966R.C0969drawable.f357088bt0);
                }
            }
        }
    }

    /* renamed from: I7 */
    public void mo101260I7(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i, C73014c cVar) {
        ActionBar actionBar = this.f214171d;
        if (actionBar != null) {
            if (onMenuItemClickListener == null) {
                actionBar.mo91084B(false);
            } else {
                actionBar.mo91084B(false);
                View view = this.f214175h;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/BaseActivity", "setBackBtn", "(Landroid/view/MenuItem$OnMenuItemClickListener;ILcom/tencent/mm/ui/BaseActivity$LeftIconStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f214175h.setOnClickListener(new C73012a(this, onMenuItemClickListener));
                }
            }
            if (i != 0) {
                this.f214184t = i;
            }
            if (cVar == C73014c.NONE) {
                this.f214184t = 0;
            }
            if (cVar == C73014c.BACK) {
                this.f214184t = C0966R.C0969drawable.bsw;
            } else if (cVar == C73014c.CLOSE) {
                this.f214184t = C0966R.C0969drawable.bsy;
            }
            ImageView imageView = this.f214176i;
            if (!(imageView == null || this.f214184t == 0)) {
                imageView.setVisibility(0);
                this.f214176i.setImageResource(this.f214184t);
            }
            if (this.f214187w) {
                this.f214176i.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            } else {
                this.f214176i.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo101261J7() {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(this.f214187w ? systemUiVisibility & -8193 : systemUiVisibility | 8192);
        }
    }

    /* renamed from: K7 */
    public final void mo101262K7() {
        int i;
        C73016e eVar = this.f214186v;
        if (eVar == C73016e.TEXT) {
            TextView textView = this.f214181q;
            if (textView != null) {
                if (this.f214187w) {
                    textView.setTextColor(this.f214177j.getResources().getColorStateList(C0966R.color.alc));
                } else {
                    textView.setTextColor(this.f214177j.getResources().getColorStateList(C0966R.color.f3142gq));
                }
            }
        } else {
            if (eVar == C73016e.ADD) {
                this.f214185u = C0966R.C0969drawable.bsv;
            } else if (eVar == C73016e.MORE) {
                this.f214185u = C0966R.C0969drawable.bsz;
            } else if (eVar == C73016e.SEARCH) {
                this.f214185u = C0966R.C0969drawable.f357088bt0;
            }
            WeImageView weImageView = this.f214179o;
            if (weImageView != null && (i = this.f214185u) != 0) {
                weImageView.setImageResource(i);
                if (this.f214187w) {
                    this.f214179o.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                } else {
                    this.f214179o.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
    }

    public abstract int getLayoutId();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(getApplicationContext().getSharedPreferences("SETTING_COLOR", 0).getInt("APP_THEME_COLOR", -16777216));
        setContentView(getLayoutId());
        this.f214177j = this;
        ActionBar supportActionBar = getSupportActionBar();
        this.f214171d = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo91091I(new ColorDrawable(getResources().getColor(17170445)));
            this.f214171d.mo91088F(false);
            this.f214171d.mo91084B(false);
            this.f214171d.mo91087E(false);
            this.f214171d.mo91086D(true);
            this.f214171d.mo91114y(LayoutInflater.from(this).inflate(C0966R.C0971layout.f6310bb, (ViewGroup) null));
            if (this.f214178n == 0) {
                Context context = this.f214177j;
                float f = C74942w4.f220334a;
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C0966R.attr.f2655bh, typedValue, true);
                this.f214178n = typedValue.data;
            }
            this.f214187w = C74933u4.m89770g(this.f214178n);
            this.f214171d.mo91112w(new ColorDrawable(this.f214178n));
            this.f214172e = (TextView) findViewById(16908308);
            this.f214173f = (TextView) findViewById(16908309);
            this.f214174g = findViewById(C0966R.C0970id.f359398kp3);
            this.f214175h = findViewById(C0966R.C0970id.f5470g0);
            this.f214176i = (ImageView) findViewById(C0966R.C0970id.f5471g1);
            mo101260I7(new C74792m(this), 0, C73014c.BACK);
        }
        C74942w4.m89786c(this.f214177j, C0966R.dimen.f3679b9);
        C74942w4.m89786c(this.f214177j, C0966R.dimen.f3947l6);
        if (this.f214178n == 0) {
            Context context2 = this.f214177j;
            TypedValue typedValue2 = new TypedValue();
            context2.getTheme().resolveAttribute(C0966R.attr.f2655bh, typedValue2, true);
            this.f214178n = typedValue2.data;
        }
        Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(this.f214178n);
        mo101261J7();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        C85975v4.m106304a("BaseActivity", "on create option menu, menuCache size:%d", Integer.valueOf(this.f214188x.size()));
        if (this.f214171d == null || this.f214188x.size() == 0) {
            C85975v4.m106309f("BaseActivity", "error, mActionBar is null or cache size:%d", Integer.valueOf(this.f214188x.size()));
        } else {
            Iterator<C73015d> it = this.f214188x.iterator();
            while (it.hasNext()) {
                C73015d next = it.next();
                int i = next.f214196a;
                if (i != 16908332) {
                    if (next.f214204i == C73016e.SEARCH) {
                        this.f214182r = menu.add(0, i, 0, next.f214200e);
                        C74798n nVar = new C74798n(this, next);
                        if (next.f214203h == null) {
                            next.f214203h = View.inflate(this.f214177j, C0966R.C0971layout.f6299b1, (ViewGroup) null);
                        }
                        WeImageView weImageView = (WeImageView) next.f214203h.findViewById(C0966R.C0970id.f5421eo);
                        this.f214180p = weImageView;
                        weImageView.setVisibility(0);
                        WeImageView weImageView2 = this.f214180p;
                        if (weImageView2 != null) {
                            if (this.f214187w) {
                                weImageView2.setImageResource(C0966R.C0969drawable.bt4);
                            } else {
                                weImageView2.setImageResource(C0966R.C0969drawable.f357088bt0);
                            }
                        }
                        this.f214180p.setOnClickListener(nVar);
                        this.f214180p.setEnabled(next.f214198c);
                        this.f214182r.setActionView(next.f214203h);
                        this.f214182r.setEnabled(next.f214198c);
                        this.f214182r.setVisible(next.f214199d);
                    } else {
                        this.f214183s = menu.add(0, i, 0, next.f214200e);
                        C74802o oVar = new C74802o(this, next);
                        C74806p pVar = new C74806p(this, next);
                        C73016e eVar = next.f214204i;
                        this.f214186v = eVar;
                        C73016e eVar2 = C73016e.GREEN_TEXT;
                        if (eVar == eVar2 || eVar == C73016e.TEXT) {
                            if (next.f214201f == null) {
                                next.f214201f = View.inflate(this.f214177j, C0966R.C0971layout.f6299b1, (ViewGroup) null);
                            }
                            TextView textView = (TextView) next.f214201f.findViewById(C0966R.C0970id.f5424er);
                            this.f214181q = textView;
                            textView.setVisibility(0);
                            this.f214181q.setText(next.f214200e);
                            if (next.f214204i == eVar2) {
                                this.f214181q.setTextColor(this.f214177j.getResources().getColorStateList(C0966R.color.f3157h6));
                            } else {
                                mo101262K7();
                            }
                            this.f214181q.setOnClickListener(oVar);
                            this.f214181q.setOnLongClickListener(pVar);
                            this.f214181q.setEnabled(next.f214198c);
                            this.f214183s.setActionView(next.f214201f);
                        } else {
                            int i2 = next.f214197b;
                            if (i2 != 0) {
                                this.f214185u = i2;
                            }
                            if (eVar == C73016e.NONE) {
                                this.f214185u = 0;
                            }
                            if (next.f214202g == null) {
                                next.f214202g = View.inflate(this.f214177j, C0966R.C0971layout.f6299b1, (ViewGroup) null);
                            }
                            this.f214179o = (WeImageView) next.f214202g.findViewById(C0966R.C0970id.f5421eo);
                            mo101262K7();
                            if (this.f214185u != 0) {
                                this.f214179o.setVisibility(0);
                                this.f214179o.setOnClickListener(oVar);
                                this.f214179o.setOnLongClickListener(pVar);
                                this.f214179o.setEnabled(next.f214198c);
                                this.f214183s.setActionView(next.f214202g);
                            }
                        }
                        this.f214183s.setEnabled(next.f214198c);
                        this.f214183s.setVisible(next.f214199d);
                        MenuItem menuItem = this.f214183s;
                        if (menuItem != null) {
                            menuItem.setShowAsAction(2);
                        }
                    }
                }
            }
            MenuItem menuItem2 = this.f214182r;
            if (menuItem2 != null) {
                menuItem2.setShowAsAction(2);
            }
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        if (this.f214171d != null && (textView = this.f214172e) != null) {
            textView.setText(charSequence.toString());
            m85890L7();
        }
    }
}
