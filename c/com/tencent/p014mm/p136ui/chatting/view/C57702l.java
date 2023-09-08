package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.OptionPicker;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.TPOptionalID;
import java.util.ArrayList;
import java.util.Calendar;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.view.l */
public class C57702l {

    /* renamed from: a */
    public OptionPicker f165142a;

    /* renamed from: b */
    public OptionPicker f165143b;

    /* renamed from: c */
    public C104428a f165144c;

    /* renamed from: d */
    public View f165145d;

    /* renamed from: e */
    public Context f165146e;

    /* renamed from: f */
    public int f165147f;

    /* renamed from: g */
    public BottomSheetBehavior f165148g;

    /* renamed from: h */
    public C57703a f165149h;

    /* renamed from: i */
    public ArrayList<Long> f165150i = new ArrayList<>(42);

    /* renamed from: com.tencent.mm.ui.chatting.view.l$a */
    public interface C57703a {
        /* renamed from: a */
        void mo82035a(long j);

        void onCancel();
    }

    public C57702l(Context context) {
        int i;
        Context context2 = context;
        this.f165146e = context2;
        this.f165145d = View.inflate(context2, C0966R.C0971layout.brc, (ViewGroup) null);
        C104428a aVar = new C104428a(this.f165146e, 0);
        this.f165144c = aVar;
        aVar.setContentView(this.f165145d);
        this.f165144c.setOnDismissListener(new C57698h(this));
        this.f165142a = (OptionPicker) this.f165145d.findViewById(C0966R.C0970id.hnc);
        this.f165143b = (OptionPicker) this.f165145d.findViewById(C0966R.C0970id.hng);
        this.f165142a.setValue(0);
        this.f165142a.setMinWidth(C76577a.m92151b(this.f165146e, 60));
        this.f165143b.setMinWidth(C76577a.m92151b(this.f165146e, 60));
        OptionPicker optionPicker = this.f165142a;
        this.f165150i.clear();
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        int i2 = 0;
        while (true) {
            i = 5;
            if (i2 >= instance.getActualMaximum(5)) {
                break;
            }
            if (CrashReportFactory.hasDebuger() && i2 == 0) {
                arrayList.add(APMidasPayAPI.ENV_TEST);
                this.f165150i.add(Long.valueOf(instance.getTimeInMillis()));
            }
            if (i2 == 0) {
                instance.setTimeInMillis(System.currentTimeMillis() + (((long) i2) * 86400000));
                this.f165150i.add(Long.valueOf(instance.getTimeInMillis()));
            } else {
                instance.setTimeInMillis(System.currentTimeMillis() + (((long) i2) * 86400000));
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                this.f165150i.add(Long.valueOf(instance.getTimeInMillis()));
            }
            String d = C72715f.m85111d(this.f165146e.getString(C0966R.string.eyh), instance.getTimeInMillis() / 1000);
            if (i2 == 0) {
                arrayList.add(this.f165146e.getResources().getString(C0966R.string.ezr));
            } else if (i2 == 1) {
                arrayList.add(d + " " + this.f165146e.getResources().getString(C0966R.string.ezs));
            } else if (i2 == 2) {
                arrayList.add(d + " " + this.f165146e.getResources().getString(C0966R.string.ezi));
            } else {
                arrayList.add(d + " " + C72715f.m85113f(this.f165146e, instance.get(7)));
            }
            i2++;
        }
        int i3 = 1;
        int i4 = instance.get(1);
        int i5 = instance.get(2) + 1;
        int i6 = 0;
        while (i6 < 12) {
            int i7 = i5 + i6;
            if (i7 > 12) {
                instance.set(i3, i4 + 1);
                instance.set(2, i7 - 12);
            } else {
                instance.set(2, i7);
            }
            instance.set(i, i3);
            this.f165150i.add(Long.valueOf(instance.getTimeInMillis()));
            String d2 = C72715f.m85111d(this.f165146e.getString(C0966R.string.f360811ez2), instance.getTimeInMillis() / 1000);
            arrayList.add(d2 + "");
            i6++;
            i3 = 1;
            i = 5;
        }
        optionPicker.setOptionsArray(Util.listToStrings(arrayList));
        this.f165143b.setOptionsArray(mo82066a(0));
        this.f165142a.setOnValueChangedListener(new C57699i(this));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f165145d.getLayoutParams();
        layoutParams.height = C76577a.m92151b(this.f165146e, 288);
        this.f165145d.setLayoutParams(layoutParams);
        this.f165147f = C76577a.m92151b(this.f165146e, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f165145d.getParent());
        this.f165148g = y;
        if (y != null) {
            y.mo146383A(this.f165147f);
            this.f165148g.f309230p = false;
        }
        ((Button) this.f165145d.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C57700j(this));
        ((Button) this.f165145d.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C57701k(this));
    }

    /* renamed from: a */
    public final String[] mo82066a(int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int i2 = i - (CrashReportFactory.hasDebuger() ? 1 : 0);
        if (i2 != -1) {
            if (i2 != 0) {
                for (int i3 = 1; i3 <= 24; i3++) {
                    StringBuilder sb = new StringBuilder();
                    if (i3 < 10) {
                        obj = "0" + i3;
                    } else {
                        obj = Integer.valueOf(i3);
                    }
                    sb.append(obj);
                    sb.append(":00");
                    arrayList.add(sb.toString());
                }
            } else {
                int i4 = Calendar.getInstance().get(11);
                for (int i5 = 1; i5 <= 24 - i4; i5++) {
                    arrayList.add(this.f165146e.getResources().getString(C0966R.string.f7506i7, new Object[]{Integer.valueOf(i5)}));
                }
            }
        } else {
            arrayList.add("after 30 second");
        }
        return Util.listToStrings(arrayList);
    }
}
