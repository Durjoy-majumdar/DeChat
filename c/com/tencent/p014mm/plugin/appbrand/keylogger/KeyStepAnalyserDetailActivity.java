package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo;
import com.tencent.p014mm.plugin.appbrand.keylogger.stepview.VerticalStepView;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p385u2.C111105a;
import uo0.C90709a;
import uo0.C90716l;
import vo0.C78459b;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity */
public class KeyStepAnalyserDetailActivity extends KeyStepBaseActivity {

    /* renamed from: x */
    public static SimpleDateFormat f243028x = new SimpleDateFormat("HH:mm:ss");

    /* renamed from: e */
    public View f243029e;

    /* renamed from: f */
    public View f243030f;

    /* renamed from: g */
    public LinearLayout f243031g;

    /* renamed from: h */
    public ScaleGestureDetector f243032h;

    /* renamed from: i */
    public float f243033i;

    /* renamed from: j */
    public float f243034j;

    /* renamed from: n */
    public float f243035n;

    /* renamed from: o */
    public float f243036o;

    /* renamed from: p */
    public float f243037p = 1.0f;

    /* renamed from: q */
    public float f243038q = 1.0f;

    /* renamed from: r */
    public Class f243039r;

    /* renamed from: s */
    public String f243040s;

    /* renamed from: t */
    public boolean f243041t;

    /* renamed from: u */
    public Map<String, C78459b> f243042u;

    /* renamed from: v */
    public Map<String, Boolean> f243043v;

    /* renamed from: w */
    public ScaleGestureDetector.OnScaleGestureListener f243044w = new C83211a();

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity$a */
    public class C83211a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C83211a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = KeyStepAnalyserDetailActivity.this;
            if (keyStepAnalyserDetailActivity.f243031g == null) {
                return true;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity2 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity.f243037p = scaleFactor * keyStepAnalyserDetailActivity2.f243038q;
            float f = keyStepAnalyserDetailActivity2.f243037p;
            if (f > 5.0f || f < 0.1f) {
                return true;
            }
            keyStepAnalyserDetailActivity2.f243031g.setTranslationX(keyStepAnalyserDetailActivity2.f243033i);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity3 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity3.f243031g.setTranslationY(keyStepAnalyserDetailActivity3.f243034j);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity4 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity4.f243031g.setPivotX(keyStepAnalyserDetailActivity4.f243035n);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity5 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity5.f243031g.setPivotY(keyStepAnalyserDetailActivity5.f243036o);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity6 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity6.f243031g.setScaleX(keyStepAnalyserDetailActivity6.f243037p);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity7 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity7.f243031g.setScaleY(keyStepAnalyserDetailActivity7.f243037p);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity8 = KeyStepAnalyserDetailActivity.this;
            keyStepAnalyserDetailActivity8.f243038q = keyStepAnalyserDetailActivity8.f243037p;
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f243032h == null || this.f243029e.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return this.f243032h.onTouchEvent(motionEvent);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6321bq;
    }

    public void onCreate(Bundle bundle) {
        long j;
        char c;
        long j2;
        SpannableString spannableString;
        int i;
        int i2;
        super.onCreate(bundle);
        this.f243029e = findViewById(C0966R.C0970id.c5r);
        this.f243030f = findViewById(C0966R.C0970id.kkz);
        this.f243039r = (Class) getIntent().getSerializableExtra("key_process_class");
        this.f243040s = getIntent().getStringExtra("key_process_category");
        this.f11789d.setText(getString(C0966R.string.fzm));
        View findViewById = findViewById(C0966R.C0970id.c5s);
        ((TextView) findViewById(C0966R.C0970id.ffc)).setText(getIntent().getStringExtra("key_info"));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3888hz);
        String str = getString(C0966R.string.fzs) + " ";
        String str2 = getString(C0966R.string.fzq) + " ";
        String str3 = getString(C0966R.string.fzr) + " ";
        SpannableString spannableString2 = new SpannableString(str + str2 + str3 + getString(C0966R.string.fzt));
        Object obj = C111105a.f332697a;
        Drawable b = C111105a.C111110c.m151511b(this, C0966R.C0969drawable.bqm);
        b.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new ImageSpan(b, 0), 0, 1, 17);
        int length = str.length() + 0;
        Drawable b2 = C111105a.C111110c.m151511b(this, C0966R.C0969drawable.bql);
        b2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new ImageSpan(b2, 0), length, length + 1, 17);
        int length2 = length + str2.length();
        Drawable b3 = C111105a.C111110c.m151511b(this, C0966R.C0969drawable.bqk);
        b3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new ImageSpan(b3, 0), length2, length2 + 1, 17);
        int length3 = length2 + str3.length();
        Drawable b4 = C111105a.C111110c.m151511b(this, C0966R.C0969drawable.bqn);
        b4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new ImageSpan(b4, 0), length3, length3 + 1, 17);
        ((TextView) findViewById(C0966R.C0970id.f1r)).setText(spannableString2);
        findViewById.setOnClickListener(new C83220g(this));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("steps");
        LinkedList linkedList = new LinkedList(parcelableArrayListExtra);
        Collections.sort(linkedList, new C83221h(this));
        this.f243043v = new HashMap();
        int i3 = 0;
        while (true) {
            j = 0;
            c = 3;
            if (i3 >= linkedList.size() || i3 > 3) {
                HashMap hashMap = new HashMap();
            } else {
                IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = (IKeyStepAnalyser$StepLogInfo) linkedList.get(i3);
                if (iKeyStepAnalyser$StepLogInfo.f243057j > 0 && !"END".equals(iKeyStepAnalyser$StepLogInfo.f243053f)) {
                    ((HashMap) this.f243043v).put(((IKeyStepAnalyser$StepLogInfo) linkedList.get(i3)).f243053f, Boolean.TRUE);
                }
                i3++;
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i4 = 0; i4 < parcelableArrayListExtra.size(); i4++) {
            IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo2 = (IKeyStepAnalyser$StepLogInfo) parcelableArrayListExtra.get(i4);
            hashMap2.put(iKeyStepAnalyser$StepLogInfo2.f243053f, iKeyStepAnalyser$StepLogInfo2);
        }
        List<C90716l> a = C83229q.m102136a(this.f243039r, this.f243040s);
        this.f243042u = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < a.size()) {
            C90709a aVar = a.get(i5).f260551a;
            IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo3 = (IKeyStepAnalyser$StepLogInfo) hashMap2.get(aVar.name());
            if (iKeyStepAnalyser$StepLogInfo3 == null) {
                i = aVar.mo124835b() ? -2 : -1;
                spannableString = new SpannableString(Util.isNullOrNil(aVar.mo124836c()) ? aVar.name() : aVar.mo124836c());
                j2 = j;
            } else {
                int i6 = !iKeyStepAnalyser$StepLogInfo3.f243055h.equals("ok") ? aVar.mo124837d() ? 1 : 2 : 0;
                Object[] objArr = new Object[4];
                objArr[0] = f243028x.format(Long.valueOf(iKeyStepAnalyser$StepLogInfo3.f243051d));
                objArr[1] = Util.isNullOrNil(aVar.mo124836c()) ? aVar.name() : aVar.mo124836c();
                objArr[2] = iKeyStepAnalyser$StepLogInfo3.f243055h;
                objArr[c] = iKeyStepAnalyser$StepLogInfo3.f243056i;
                String format = String.format("%s %s:%s %s", objArr);
                int length4 = format.length();
                long j3 = iKeyStepAnalyser$StepLogInfo3.f243057j;
                j2 = 0;
                if (j3 > 0) {
                    String format2 = String.format(" cost:%d ms", new Object[]{Long.valueOf(j3)});
                    i2 = format2.length();
                    format = format + format2;
                } else {
                    i2 = 0;
                }
                SpannableString spannableString3 = new SpannableString(format);
                if (((HashMap) this.f243043v).containsKey(iKeyStepAnalyser$StepLogInfo3.f243053f)) {
                    spannableString3.setSpan(new ForegroundColorSpan(-65536), length4, i2 + length4, 33);
                }
                spannableString = spannableString3;
                i = i6;
            }
            C78459b bVar = new C78459b(spannableString, i);
            arrayList.add(bVar);
            ((HashMap) this.f243042u).put(aVar.name(), bVar);
            i5++;
            j = j2;
            c = 3;
        }
        VerticalStepView verticalStepView = (VerticalStepView) findViewById(C0966R.C0970id.k1o);
        verticalStepView.f197111f = arrayList;
        verticalStepView.f197110e.setSteps(arrayList);
    }
}
