package of0;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.picker.base.view.WheelView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import jf0.C21234c;
import jf0.C21236d;
import jf0.C87961b;
import pf0.C21966a;
import qf0.C22085f;
import rf0.C22229c;
import rf0.C22230d;
import rf0.C22233g;
import rf0.C22234h;
import rf0.C22235i;
import rf0.C22236j;

/* renamed from: of0.b */
public class C21794b {

    /* renamed from: a */
    public C21966a f61767a;

    public C21794b(Context context, C22085f fVar) {
        C21966a aVar = new C21966a(2);
        this.f61767a = aVar;
        aVar.f62194k = context;
        aVar.f62185b = fVar;
    }

    /* renamed from: a */
    public void mo34202a(C22230d dVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C22230d dVar2 = dVar;
        C21966a aVar = this.f61767a;
        dVar2.f226020g = aVar;
        Context context = aVar.f62194k;
        dVar.mo107670c();
        dVar.mo107669b();
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bcx, dVar2.f226018e);
        TextView textView = (TextView) dVar2.f226018e.findViewById(C0966R.C0970id.kv9);
        RelativeLayout relativeLayout = (RelativeLayout) dVar2.f226018e.findViewById(C0966R.C0970id.ixl);
        Button button = (Button) dVar2.f226018e.findViewById(C0966R.C0970id.al8);
        Button button2 = (Button) dVar2.f226018e.findViewById(C0966R.C0970id.f357582al3);
        button.setTag("submit");
        button2.setTag("cancel");
        button.setOnClickListener(dVar2);
        button2.setOnClickListener(dVar2);
        dVar2.f226020g.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            str = context.getResources().getString(C0966R.string.hjr);
        } else {
            dVar2.f226020g.getClass();
            str = null;
        }
        button.setText(str);
        dVar2.f226020g.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = context.getResources().getString(C0966R.string.hjl);
        } else {
            dVar2.f226020g.getClass();
            str2 = null;
        }
        button2.setText(str2);
        dVar2.f226020g.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            str3 = "";
        } else {
            dVar2.f226020g.getClass();
            str3 = null;
        }
        textView.setText(str3);
        dVar2.f226020g.getClass();
        button.setTextColor(-15028967);
        dVar2.f226020g.getClass();
        button2.setTextColor(-1979711488);
        dVar2.f226020g.getClass();
        textView.setTextColor(-16777216);
        dVar2.f226020g.getClass();
        relativeLayout.setBackgroundColor(-657931);
        dVar2.f226020g.getClass();
        float f = (float) 24;
        button.setTextSize(f);
        dVar2.f226020g.getClass();
        button2.setTextSize(f);
        dVar2.f226020g.getClass();
        textView.setTextSize(f);
        C22236j jVar = dVar2.f62981p;
        C21966a aVar2 = dVar2.f226020g;
        boolean[] zArr = aVar2.f62190g;
        if (jVar.f62997a == null) {
            jVar.f62997a = null;
        }
        jVar.f63006j = zArr;
        jVar.f63004h = 17;
        if (aVar2.f62186c != null) {
            jVar.f63020x = new C22229c(dVar2);
        }
        Calendar calendar = aVar2.f62192i;
        if (calendar == null || aVar2.f62193j == null) {
            if (calendar == null) {
                Calendar calendar2 = aVar2.f62193j;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    C85975v4.m106305b(dVar2.f62983r, "initWheelTime: The endDate should not be later than 2100, set endDate to null", new Object[0]);
                    dVar2.f226020g.f62192i = null;
                }
            } else if (calendar.get(1) < 1900) {
                C85975v4.m106305b(dVar2.f62983r, "initWheelTime: The startDate can not as early as 1900, set startDate to null", new Object[0]);
                dVar2.f226020g.f62192i = null;
            }
        } else if (calendar.getTimeInMillis() > dVar2.f226020g.f62193j.getTimeInMillis()) {
            C85975v4.m106305b(dVar2.f62983r, "initWheelTime: startDate can't be later than endDate, set startDate to null", new Object[0]);
            dVar2.f226020g.f62192i = null;
        }
        C22236j jVar2 = dVar2.f62981p;
        C21966a aVar3 = dVar2.f226020g;
        Calendar calendar3 = aVar3.f62192i;
        Calendar calendar4 = aVar3.f62193j;
        jVar2.getClass();
        if (calendar3 == null && calendar4 != null) {
            int i9 = calendar4.get(1);
            int i15 = calendar4.get(2) + 1;
            int i16 = calendar4.get(5);
            int i17 = jVar2.f63007k;
            if (i9 > i17) {
                jVar2.f63008l = i9;
                jVar2.f63010n = i15;
                jVar2.f63012p = i16;
            } else if (i9 == i17) {
                int i18 = jVar2.f63009m;
                if (i15 > i18) {
                    jVar2.f63008l = i9;
                    jVar2.f63010n = i15;
                    jVar2.f63012p = i16;
                } else if (i15 == i18 && i16 > jVar2.f63011o) {
                    jVar2.f63008l = i9;
                    jVar2.f63010n = i15;
                    jVar2.f63012p = i16;
                }
            }
        } else if (calendar3 != null && calendar4 == null) {
            int i19 = calendar3.get(1);
            int i25 = calendar3.get(2) + 1;
            int i26 = calendar3.get(5);
            int i27 = jVar2.f63008l;
            if (i19 < i27) {
                jVar2.f63009m = i25;
                jVar2.f63011o = i26;
                jVar2.f63007k = i19;
            } else if (i19 == i27) {
                int i28 = jVar2.f63010n;
                if (i25 < i28) {
                    jVar2.f63009m = i25;
                    jVar2.f63011o = i26;
                    jVar2.f63007k = i19;
                } else if (i25 == i28 && i26 < jVar2.f63012p) {
                    jVar2.f63009m = i25;
                    jVar2.f63011o = i26;
                    jVar2.f63007k = i19;
                }
            }
        } else if (!(calendar3 == null || calendar4 == null)) {
            jVar2.f63007k = calendar3.get(1);
            jVar2.f63008l = calendar4.get(1);
            jVar2.f63009m = calendar3.get(2) + 1;
            jVar2.f63010n = calendar4.get(2) + 1;
            jVar2.f63011o = calendar3.get(5);
            jVar2.f63012p = calendar4.get(5);
            jVar2.f63013q = calendar3.get(11);
            jVar2.f63014r = calendar3.get(12);
            jVar2.f63015s = calendar4.get(11);
            jVar2.f63016t = calendar4.get(12);
        }
        if (!dVar2.f62984s) {
            C21966a aVar4 = dVar2.f226020g;
            Calendar calendar5 = aVar4.f62192i;
            if (calendar5 != null && aVar4.f62193j != null) {
                Calendar calendar6 = aVar4.f62191h;
                if (calendar6 == null || calendar6.getTimeInMillis() < dVar2.f226020g.f62192i.getTimeInMillis()) {
                    C21966a aVar5 = dVar2.f226020g;
                    aVar5.f62191h = aVar5.f62192i;
                } else if (dVar2.f226020g.f62191h.getTimeInMillis() > dVar2.f226020g.f62193j.getTimeInMillis()) {
                    C21966a aVar6 = dVar2.f226020g;
                    aVar6.f62191h = aVar6.f62193j;
                }
            } else if (calendar5 != null) {
                aVar4.f62191h = calendar5;
            } else {
                Calendar calendar7 = aVar4.f62193j;
                if (calendar7 != null) {
                    aVar4.f62191h = calendar7;
                }
            }
        }
        Calendar calendar8 = dVar2.f226020g.f62191h;
        if (calendar8 == null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            i5 = instance.get(1);
            i2 = instance.get(2);
            i3 = instance.get(5);
            i4 = instance.get(11);
            i = instance.get(12);
            i6 = instance.get(13);
        } else {
            i5 = calendar8.get(1);
            i2 = dVar2.f226020g.f62191h.get(2);
            i3 = dVar2.f226020g.f62191h.get(5);
            i4 = dVar2.f226020g.f62191h.get(11);
            i = dVar2.f226020g.f62191h.get(12);
            i6 = dVar2.f226020g.f62191h.get(13);
        }
        C22236j jVar3 = dVar2.f62981p;
        jVar3.f63017u = i5;
        jVar3.f62998b = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.lvj);
        jVar3.f62999c = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.gyu);
        jVar3.f63000d = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.bz9);
        C21236d dVar3 = new C21236d(jVar3.f63007k, jVar3.f63008l, jVar3.f62996B);
        jVar3.f63005i = dVar3;
        jVar3.f62998b.setAdapter(dVar3);
        jVar3.f62998b.setCurrentItem(i5 - jVar3.f63007k);
        jVar3.f62998b.setGravity(jVar3.f63004h);
        int i29 = jVar3.f63007k;
        int i35 = jVar3.f63008l;
        if (i29 == i35) {
            jVar3.f62999c.setAdapter(new C21234c(jVar3.f63009m, jVar3.f63010n, new C87961b(jVar3.f62996B)));
            jVar3.f62999c.setCurrentItem((i2 + 1) - jVar3.f63009m);
        } else if (i5 == i29) {
            jVar3.f62999c.setAdapter(new C21234c(jVar3.f63009m, 12, new C87961b(jVar3.f62996B)));
            jVar3.f62999c.setCurrentItem((i2 + 1) - jVar3.f63009m);
        } else if (i5 == i35) {
            jVar3.f62999c.setAdapter(new C21234c(1, jVar3.f63010n, new C87961b(jVar3.f62996B)));
            jVar3.f62999c.setCurrentItem(i2);
        } else if (!jVar3.f63019w || i5 - 1 != i29) {
            jVar3.f62999c.setAdapter(new C21234c(1, 12, new C87961b(jVar3.f62996B)));
            jVar3.f62999c.setCurrentItem(i2);
        } else {
            jVar3.f62999c.setAdapter(new C21234c(jVar3.f63009m, 12, new C87961b(jVar3.f62996B)));
            jVar3.f62999c.setCurrentItem((i2 + 1) - jVar3.f63009m);
        }
        jVar3.f62999c.setGravity(jVar3.f63004h);
        int i36 = jVar3.f63019w ? i5 - 1 : i5;
        int i37 = jVar3.f63007k;
        int i38 = jVar3.f63008l;
        if (i37 == i38 && jVar3.f63009m == jVar3.f63010n) {
            int i39 = i2 + 1;
            if (jVar3.f63022z.contains(String.valueOf(i39))) {
                if (jVar3.f63012p > 31) {
                    jVar3.f63012p = 31;
                }
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, jVar3.f63012p));
            } else if (jVar3.f62995A.contains(String.valueOf(i39))) {
                if (jVar3.f63012p > 30) {
                    jVar3.f63012p = 30;
                }
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, jVar3.f63012p));
            } else if ((i36 % 4 != 0 || i36 % 100 == 0) && i36 % 400 != 0) {
                if (jVar3.f63012p > 28) {
                    jVar3.f63012p = 28;
                }
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, jVar3.f63012p));
            } else {
                if (jVar3.f63012p > 29) {
                    jVar3.f63012p = 29;
                }
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, jVar3.f63012p));
            }
            jVar3.f63000d.setCurrentItem(i3 - jVar3.f63011o);
        } else if (i36 == i37 && (i8 = i2 + 1) == jVar3.f63009m) {
            if (jVar3.f63022z.contains(String.valueOf(i8))) {
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, 31));
            } else if (jVar3.f62995A.contains(String.valueOf(i8))) {
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, 30));
            } else if ((i36 % 4 != 0 || i36 % 100 == 0) && i36 % 400 != 0) {
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, 28));
            } else {
                jVar3.f63000d.setAdapter(new C21234c(jVar3.f63011o, 29));
            }
            jVar3.f63000d.setCurrentItem(i3 - jVar3.f63011o);
        } else if (i36 == i38 && (i7 = i2 + 1) == jVar3.f63010n) {
            if (jVar3.f63022z.contains(String.valueOf(i7))) {
                if (jVar3.f63012p > 31) {
                    jVar3.f63012p = 31;
                }
                jVar3.f63000d.setAdapter(new C21234c(1, jVar3.f63012p));
            } else if (jVar3.f62995A.contains(String.valueOf(i7))) {
                if (jVar3.f63012p > 30) {
                    jVar3.f63012p = 30;
                }
                jVar3.f63000d.setAdapter(new C21234c(1, jVar3.f63012p));
            } else if ((i36 % 4 != 0 || i36 % 100 == 0) && i36 % 400 != 0) {
                if (jVar3.f63012p > 28) {
                    jVar3.f63012p = 28;
                }
                jVar3.f63000d.setAdapter(new C21234c(1, jVar3.f63012p));
            } else {
                if (jVar3.f63012p > 29) {
                    jVar3.f63012p = 29;
                }
                jVar3.f63000d.setAdapter(new C21234c(1, jVar3.f63012p));
            }
            jVar3.f63000d.setCurrentItem(i3 - 1);
        } else {
            int i44 = i2 + 1;
            if (jVar3.f63022z.contains(String.valueOf(i44))) {
                jVar3.f63000d.setAdapter(new C21234c(1, 31));
            } else if (jVar3.f62995A.contains(String.valueOf(i44))) {
                jVar3.f63000d.setAdapter(new C21234c(1, 30));
            } else if ((i36 % 4 != 0 || i36 % 100 == 0) && i36 % 400 != 0) {
                jVar3.f63000d.setAdapter(new C21234c(1, 28));
            } else {
                jVar3.f63000d.setAdapter(new C21234c(1, 29));
            }
            jVar3.f63000d.setCurrentItem(i3 - 1);
        }
        jVar3.f63000d.setGravity(jVar3.f63004h);
        WheelView wheelView = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.exj);
        jVar3.f63001e = wheelView;
        wheelView.setAdapter(new C21234c(jVar3.f63013q, jVar3.f63015s));
        jVar3.f63001e.setCurrentItem(i4 - jVar3.f63013q);
        jVar3.f63001e.setGravity(jVar3.f63004h);
        WheelView wheelView2 = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.gtp);
        jVar3.f63002f = wheelView2;
        int i45 = jVar3.f63013q;
        if (i4 == i45 && i45 == jVar3.f63015s) {
            wheelView2.setAdapter(new C21234c(jVar3.f63014r, jVar3.f63016t));
            if (i < jVar3.f63014r) {
                jVar3.f63002f.setCurrentItem(0);
            } else {
                int i46 = jVar3.f63016t;
                if (i > i46) {
                    jVar3.f63002f.setCurrentItem(i46);
                } else {
                    jVar3.f63002f.setCurrentItem(i);
                }
            }
        } else if (i4 == i45) {
            wheelView2.setAdapter(new C21234c(jVar3.f63014r, 59));
            int i47 = jVar3.f63014r;
            if (i < i47) {
                jVar3.f63002f.setCurrentItem(0);
            } else {
                jVar3.f63002f.setCurrentItem(i - i47);
            }
        } else if (i4 == jVar3.f63015s) {
            wheelView2.setAdapter(new C21234c(0, jVar3.f63016t));
            int i48 = jVar3.f63016t;
            if (i >= i48) {
                jVar3.f63002f.setCurrentItem(i48);
            } else {
                jVar3.f63002f.setCurrentItem(i);
            }
        } else {
            wheelView2.setAdapter(new C21234c(0, 59));
            jVar3.f63002f.setCurrentItem(i);
        }
        jVar3.f63002f.setGravity(jVar3.f63004h);
        WheelView wheelView3 = (WheelView) jVar3.f62997a.findViewById(C0966R.C0970id.j79);
        jVar3.f63003g = wheelView3;
        wheelView3.setAdapter(new C21234c(0, 59));
        jVar3.f63003g.setCurrentItem(i6);
        jVar3.f63003g.setGravity(jVar3.f63004h);
        jVar3.f63001e.setOnItemSelectedListener(new C22235i(jVar3));
        jVar3.f62998b.setOnItemSelectedListener(new C22234h(jVar3));
        jVar3.f62999c.setOnItemSelectedListener(new C22233g(jVar3));
        jVar3.mo35395b(jVar3.f63000d);
        jVar3.mo35395b(jVar3.f63001e);
        jVar3.mo35395b(jVar3.f63002f);
        jVar3.mo35395b(jVar3.f63003g);
        if (jVar3.f63006j.length == 6) {
            Iterator it = ((ArrayList) jVar3.mo35398e()).iterator();
            while (it.hasNext()) {
                ((WheelView) it.next()).setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            }
            if (jVar3.f63019w && i5 == 2) {
                jVar3.f62999c.mo22032e(0);
                jVar3.f63000d.mo22032e(0);
                jVar3.f62999c.invalidate();
                jVar3.f63000d.invalidate();
            }
            if (dVar2.f62982q.getResources().getConfiguration().locale.getLanguage().endsWith("zh")) {
                C22236j jVar4 = dVar2.f62981p;
                dVar2.f226020g.getClass();
                dVar2.f226020g.getClass();
                dVar2.f226020g.getClass();
                dVar2.f226020g.getClass();
                dVar2.f226020g.getClass();
                dVar2.f226020g.getClass();
                jVar4.f62998b.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjs));
                jVar4.f62999c.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjp));
                jVar4.f63000d.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjm));
                jVar4.f63001e.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjn));
                jVar4.f63002f.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjo));
                jVar4.f63003g.setLabel(jVar4.f62997a.getContext().getString(C0966R.string.hjq));
            }
            C22236j jVar5 = dVar2.f62981p;
            dVar2.f226020g.getClass();
            dVar2.f226020g.getClass();
            dVar2.f226020g.getClass();
            dVar2.f226020g.getClass();
            dVar2.f226020g.getClass();
            dVar2.f226020g.getClass();
            jVar5.getClass();
            dVar2.f226020g.getClass();
            ViewGroup viewGroup = dVar2.f226019f;
            if (viewGroup != null) {
                viewGroup.findViewById(C0966R.C0970id.f358895hq0).setOnTouchListener(dVar2.f226025o);
            }
            dVar2.f62981p.mo35399f(dVar2.f226020g.f62195l);
            C22236j jVar6 = dVar2.f62981p;
            WheelView.C17837b bVar = dVar2.f226020g.f62197n;
            jVar6.getClass();
            C22236j jVar7 = dVar2.f62981p;
            boolean z = dVar2.f226020g.f62189f;
            jVar7.f62998b.setCyclic(z);
            jVar7.f62999c.setCyclic(z);
            jVar7.f63000d.setCyclic(z);
            jVar7.f63001e.setCyclic(z);
            jVar7.f63002f.setCyclic(z);
            jVar7.f63003g.setCyclic(z);
            C22236j jVar8 = dVar2.f62981p;
            dVar2.f226020g.getClass();
            jVar8.getClass();
            C22236j jVar9 = dVar2.f62981p;
            dVar2.f226020g.getClass();
            jVar9.f63000d.f49149o = false;
            jVar9.f62999c.f49149o = false;
            jVar9.f62998b.f49149o = false;
            jVar9.f63001e.f49149o = false;
            jVar9.f63002f.f49149o = false;
            jVar9.f63003g.f49149o = false;
            C22236j jVar10 = dVar2.f62981p;
            int i49 = dVar2.f226020g.f62198o;
            jVar10.getClass();
            return;
        }
        throw new IllegalArgumentException("type[] length is not 6");
    }
}
