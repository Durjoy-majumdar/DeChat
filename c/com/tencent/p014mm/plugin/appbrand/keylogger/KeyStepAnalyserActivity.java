package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tav.coremedia.TimeUtil;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import uo0.C90710b;
import uo0.C90711c;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity */
public class KeyStepAnalyserActivity extends KeyStepBaseActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f243013p = 0;

    /* renamed from: e */
    public C83215c f243014e;

    /* renamed from: f */
    public Pattern f243015f;

    /* renamed from: g */
    public String f243016g;

    /* renamed from: h */
    public Class f243017h;

    /* renamed from: i */
    public String f243018i;

    /* renamed from: j */
    public int f243019j;

    /* renamed from: n */
    public int f243020n;

    /* renamed from: o */
    public int f243021o;

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$a */
    public class C83207a implements View.OnClickListener {
        public C83207a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KeyStepAnalyserActivity keyStepAnalyserActivity = KeyStepAnalyserActivity.this;
            int i = KeyStepAnalyserActivity.f243013p;
            keyStepAnalyserActivity.getClass();
            new DatePickerDialog(keyStepAnalyserActivity, new C83218e(keyStepAnalyserActivity), keyStepAnalyserActivity.f243019j, keyStepAnalyserActivity.f243020n, keyStepAnalyserActivity.f243021o).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$b */
    public class C83208b implements C90710b {
        public C83208b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$c */
    public static class C83209c extends BaseAdapter {

        /* renamed from: f */
        public static SimpleDateFormat f243024f = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);

        /* renamed from: d */
        public final LayoutInflater f243025d;

        /* renamed from: e */
        public List<C90711c> f243026e;

        public C83209c(Context context) {
            this.f243025d = LayoutInflater.from(context);
        }

        public int getCount() {
            List<C90711c> list = this.f243026e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f243026e.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C83210d dVar;
            if (view == null) {
                view = this.f243025d.inflate(C0966R.C0971layout.f360044cc1, viewGroup, false);
                dVar = new C83210d();
                dVar.f243027a = (TextView) view.findViewById(C0966R.C0970id.f357828bz0);
                view.setTag(dVar);
            } else {
                dVar = (C83210d) view.getTag();
            }
            String str = null;
            if (!this.f243026e.get(i).f260540a.isEmpty()) {
                IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = this.f243026e.get(i).f260540a.get(0);
                if (iKeyStepAnalyser$StepLogInfo != null) {
                    str = f243024f.format(Long.valueOf(iKeyStepAnalyser$StepLogInfo.f243051d));
                }
            } else {
                dVar.f243027a.setText((CharSequence) null);
            }
            dVar.f243027a.setText(str);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$d */
    public static class C83210d {

        /* renamed from: a */
        public TextView f243027a;
    }

    /* renamed from: E7 */
    public final void mo115448E7(long j) {
        Log.m105925i("MicroMsg.KeyStepBaseActivity", "analyse time:%d", Long.valueOf(j));
        C83215c cVar = this.f243014e;
        String str = this.f243016g;
        Pattern pattern = this.f243015f;
        C83208b bVar = new C83208b();
        cVar.getClass();
        new MMHandler(String.format(Locale.ENGLISH, "KeyStepAnalyser:%s", new Object[]{str})).post(new C83212a(cVar, str, pattern, j, bVar));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6320bp;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f243017h = (Class) getIntent().getSerializableExtra("process");
        this.f243018i = getIntent().getStringExtra("category");
        this.f243016g = C83229q.m102137b(this.f243017h);
        this.f243015f = (Pattern) getIntent().getSerializableExtra("session_id_prefix");
        this.f11789d.setText(getString(C0966R.string.fzn));
        Calendar instance = Calendar.getInstance();
        this.f243019j = instance.get(1);
        this.f243020n = instance.get(2);
        this.f243021o = instance.get(5);
        findViewById(C0966R.C0970id.bz4).setOnClickListener(new C83207a());
        this.f243014e = new C83215c();
        mo115448E7(System.currentTimeMillis());
    }
}
