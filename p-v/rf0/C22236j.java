package rf0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import jf0.C21234c;
import jf0.C21236d;
import lf0.C21425b;
import qf0.C22081a;

/* renamed from: rf0.j */
public class C22236j {

    /* renamed from: C */
    public static DateFormat f62994C = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS, Locale.ENGLISH);

    /* renamed from: A */
    public final List<String> f62995A;

    /* renamed from: B */
    public Context f62996B;

    /* renamed from: a */
    public View f62997a;

    /* renamed from: b */
    public WheelView f62998b;

    /* renamed from: c */
    public WheelView f62999c;

    /* renamed from: d */
    public WheelView f63000d;

    /* renamed from: e */
    public WheelView f63001e;

    /* renamed from: f */
    public WheelView f63002f;

    /* renamed from: g */
    public WheelView f63003g;

    /* renamed from: h */
    public int f63004h;

    /* renamed from: i */
    public C21236d f63005i;

    /* renamed from: j */
    public boolean[] f63006j;

    /* renamed from: k */
    public int f63007k = WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;

    /* renamed from: l */
    public int f63008l = 2100;

    /* renamed from: m */
    public int f63009m = 1;

    /* renamed from: n */
    public int f63010n = 12;

    /* renamed from: o */
    public int f63011o = 1;

    /* renamed from: p */
    public int f63012p = 31;

    /* renamed from: q */
    public int f63013q = 0;

    /* renamed from: r */
    public int f63014r = 0;

    /* renamed from: s */
    public int f63015s = 23;

    /* renamed from: t */
    public int f63016t = 59;

    /* renamed from: u */
    public int f63017u;

    /* renamed from: v */
    public int f63018v;

    /* renamed from: w */
    public boolean f63019w = false;

    /* renamed from: x */
    public C22081a f63020x;

    /* renamed from: y */
    public String[] f63021y;

    /* renamed from: z */
    public final List<String> f63022z;

    /* renamed from: rf0.j$a */
    public class C22237a implements C21425b {
        public C22237a() {
        }

        public void onItemSelected(int i) {
            ((C22229c) C22236j.this.f63020x).mo35388a();
        }
    }

    public C22236j(Context context) {
        String[] strArr = {"1", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "7", "8", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "12"};
        this.f63021y = new String[]{WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "9", "11"};
        this.f63022z = Arrays.asList(strArr);
        this.f62995A = Arrays.asList(this.f63021y);
        this.f62996B = context;
    }

    /* renamed from: a */
    public static void m25765a(C22236j jVar, int i, int i2, int i3, int i4, List list, List list2) {
        int c = jVar.mo35396c(jVar.f63000d);
        int currentItem = jVar.f63000d.getCurrentItem();
        if (list.contains(String.valueOf(i2))) {
            if (i4 > 31) {
                i4 = 31;
            }
            jVar.f63000d.setAdapter(new C21234c(i3, i4));
        } else if (list2.contains(String.valueOf(i2))) {
            if (i4 > 30) {
                i4 = 30;
            }
            jVar.f63000d.setAdapter(new C21234c(i3, i4));
        } else if ((i % 4 != 0 || i % 100 == 0) && i % 400 != 0) {
            if (i4 > 28) {
                i4 = 28;
            }
            jVar.f63000d.setAdapter(new C21234c(i3, i4));
        } else {
            if (i4 > 29) {
                i4 = 29;
            }
            jVar.f63000d.setAdapter(new C21234c(i3, i4));
        }
        if (currentItem > jVar.f63000d.getAdapter().getItemsCount() - 1) {
            jVar.f63000d.setCurrentItem(jVar.f63000d.getAdapter().getItemsCount() - 1);
        }
        if (jVar.mo35396c(jVar.f63000d) != c) {
            int c2 = ((C21234c) jVar.f63000d.getAdapter()).mo33227c();
            int d = ((C21234c) jVar.f63000d.getAdapter()).mo33228d();
            if (c <= d) {
                jVar.f63000d.setCurrentItem(0);
            } else if (c >= c2) {
                WheelView wheelView = jVar.f63000d;
                wheelView.setCurrentItem(wheelView.getAdapter().getItemsCount() - 1);
            } else {
                jVar.f63000d.setCurrentItem(c - d);
            }
        }
    }

    /* renamed from: b */
    public final void mo35395b(WheelView wheelView) {
        if (this.f63020x != null) {
            wheelView.setOnItemSelectedListener(new C22237a());
        }
    }

    /* renamed from: c */
    public int mo35396c(WheelView wheelView) {
        Object item;
        if (!(wheelView.getAdapter() instanceof C21234c) || (item = wheelView.getAdapter().getItem(wheelView.getCurrentItem())) == null) {
            return 0;
        }
        return ((Integer) item).intValue();
    }

    /* renamed from: d */
    public String mo35397d() {
        return String.valueOf(mo35396c(this.f62998b) + "-" + mo35396c(this.f62999c) + "-" + mo35396c(this.f63000d) + " " + mo35396c(this.f63001e) + XVFSFile.PATH_SEPARATOR + mo35396c(this.f63002f) + XVFSFile.PATH_SEPARATOR + mo35396c(this.f63003g));
    }

    /* renamed from: e */
    public List<WheelView> mo35398e() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            int i2 = 8;
            if (i == 0) {
                WheelView wheelView = this.f62998b;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f62998b);
                }
            } else if (i == 1) {
                WheelView wheelView2 = this.f62999c;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView2.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f62999c);
                }
            } else if (i == 2) {
                WheelView wheelView3 = this.f63000d;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView3.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f63000d);
                }
            } else if (i == 3) {
                WheelView wheelView4 = this.f63001e;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView4.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f63001e);
                }
            } else if (i == 4) {
                WheelView wheelView5 = this.f63002f;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView5.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f63002f);
                }
            } else if (i == 5) {
                WheelView wheelView6 = this.f63003g;
                if (this.f63006j[i]) {
                    i2 = 0;
                }
                wheelView6.setVisibility(i2);
                if (this.f63006j[i]) {
                    arrayList.add(this.f63003g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo35399f(int i) {
        this.f63018v = i;
        this.f63000d.setDividerColor(i);
        this.f62999c.setDividerColor(this.f63018v);
        this.f62998b.setDividerColor(this.f63018v);
        this.f63001e.setDividerColor(this.f63018v);
        this.f63002f.setDividerColor(this.f63018v);
        this.f63003g.setDividerColor(this.f63018v);
    }
}
